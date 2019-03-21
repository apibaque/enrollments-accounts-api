package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.client.enrollment.ApiException;
import io.swagger.client.enrollment.api.EnrollmentAccountsControllerApi;
import io.swagger.client.enrollment.model.CreditorAccountsDto;
import io.swagger.client.enrollment.model.DebtorAccountsDto;
import io.swagger.client.enrollment.model.EnrollmentAccountsDto;
import io.swagger.client.enrollment.model.EnrollmentAccountsResponseDto;
import io.swagger.model.CreditorAccount;
import io.swagger.model.DebtorAccount;
import io.swagger.model.EnrollmentAccountsResponse;
import io.swagger.model.EnrollmentRequest;
import io.swagger.model.EnrollmentResponse;

public final class AccountsFacade {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountsFacade.class);
	
	private static EnrollmentAccountsControllerApi enrrollmentAccountsApi = new EnrollmentAccountsControllerApi();
	
	private static final ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	private AccountsFacade() {
		// constructor stub
	}
	
	static EnrollmentResponse save(EnrollmentRequest enrollmentRequest) throws ApiException {
		DebtorAccountsDto debtorAccount = new DebtorAccountsDto();
		List<CreditorAccountsDto> creditorAccounts = new ArrayList<>();
		CreditorAccountsDto creditorAccountsDto = null;
		for (CreditorAccount creditorAccount : enrollmentRequest.getDebtorAccount().getCreditorAccounts()) {
			creditorAccountsDto = new CreditorAccountsDto();
			creditorAccountsDto.setDestinationDNI(creditorAccount.getDestinationDNI());
			creditorAccountsDto.setIdentification(creditorAccount.getIdentification());
			creditorAccountsDto.setName(creditorAccount.getSecondaryIdentification());
			creditorAccountsDto.setSecondaryIdentification(creditorAccount.getSecondaryIdentification());
			creditorAccountsDto.setValidThru(creditorAccount.getValidThru());
			
			creditorAccounts.add(creditorAccountsDto);
		}
		
		debtorAccount.setCreditorAccounts(creditorAccounts);
		debtorAccount.setDestinationDNI(enrollmentRequest.getDebtorAccount().getDestinationDNI());
		debtorAccount.setIdentification(enrollmentRequest.getDebtorAccount().getIdentification());
		debtorAccount.setName(enrollmentRequest.getDebtorAccount().getName());
		debtorAccount.setSecondaryIdentification(enrollmentRequest.getDebtorAccount().getSecondaryIdentification());
		
		EnrollmentAccountsDto body = new EnrollmentAccountsDto();
		body.setClientId(enrollmentRequest.getClientId());
		body.setDebtorAccount(debtorAccount );
		body.setEnrollmentId(enrollmentRequest.getClientId());
				
		EnrollmentAccountsResponseDto clientDtoResponse = enrrollmentAccountsApi.addEnrollmentAccountsUsingPOST(body);
		
		EnrollmentResponse response = new EnrollmentResponse();
		response.setDescription(clientDtoResponse.getDescription());
		response.setEnrollmentId(clientDtoResponse.getEnrollmentId());
		response.setOperationDate(clientDtoResponse.getOperationDate());
		
		return response;
		
	}
	

	static EnrollmentAccountsResponse findById(String enrollmentId) throws ApiException {
		EnrollmentAccountsResponseDto clienResponse = enrrollmentAccountsApi.getEnrollmentAccountsUsingGET(enrollmentId);

		List<CreditorAccount> creditorAccounts = createCreditorAccounts(clienResponse);
		DebtorAccount debtorAccount = createDebtorAccount(clienResponse, creditorAccounts);
		EnrollmentAccountsResponse response = createEnrollmentAccountResponse(clienResponse, debtorAccount);
		
		return response;
	}

	/**
	 * @param clienResponse
	 * @param debtorAccount
	 * @return
	 */
	private static EnrollmentAccountsResponse createEnrollmentAccountResponse(
			EnrollmentAccountsResponseDto clienResponse, DebtorAccount debtorAccount) {
		EnrollmentAccountsResponse response = new EnrollmentAccountsResponse();
		response.setDebtorAccount(debtorAccount );
		response.setDescription(clienResponse.getDescription());
		response.setEnrollmentId(clienResponse.getEnrollmentId());
		response.setOperationDate(clienResponse.getOperationDate());
		return response;
	}

	/**
	 * @param clienResponse
	 * @param creditorAccounts
	 * @return
	 */
	private static DebtorAccount createDebtorAccount(EnrollmentAccountsResponseDto clienResponse,
			List<CreditorAccount> creditorAccounts) {
		DebtorAccount debtorAccount = new DebtorAccount();
		debtorAccount.setCreditorAccounts(creditorAccounts);
		debtorAccount.setDestinationDNI(clienResponse.getDebtorAccount().getDestinationDNI());
		debtorAccount.setIdentification(clienResponse.getDebtorAccount().getIdentification());
		debtorAccount.setName(clienResponse.getDebtorAccount().getName());
		debtorAccount.setSecondaryIdentification(clienResponse.getDebtorAccount().getSecondaryIdentification());
		return debtorAccount;
	}

	/**
	 * @param clienResponse
	 * @return
	 */
	private static List<CreditorAccount> createCreditorAccounts(EnrollmentAccountsResponseDto clienResponse) {
		CreditorAccount creditorAccount = null;
		List<CreditorAccount> creditorAccounts = new ArrayList<CreditorAccount>();
		for (CreditorAccountsDto creditorAccountDto : clienResponse.getDebtorAccount().getCreditorAccounts()) {
			creditorAccount = new CreditorAccount();
			creditorAccount.setDestinationDNI(creditorAccountDto.getDestinationDNI());
			creditorAccount.setIdentification(creditorAccountDto.getIdentification());
			creditorAccount.setName(creditorAccountDto.getName());
			creditorAccount.setSecondaryIdentification(creditorAccountDto.getSecondaryIdentification());
			creditorAccount.setValidThru(creditorAccountDto.getValidThru());
			
			creditorAccounts.add(creditorAccount);
		}
		return creditorAccounts;
	}
}
