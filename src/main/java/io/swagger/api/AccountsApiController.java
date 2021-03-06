package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.client.enrollment.ApiException;
import io.swagger.model.EnrollmentAccountsResponse;
import io.swagger.model.EnrollmentRequest;
import io.swagger.model.EnrollmentResponse;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-18T14:06:57.619Z")

@Controller
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EnrollmentResponse> enrollmentAcounts(@ApiParam(value = "" ,required=true )  @Valid @RequestBody EnrollmentRequest body,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                log.info("Request POST enrollmentAcount: " + body.getClientId()+" "+ body.getDebtorAccount().toString());
            	//return new ResponseEntity<EnrollmentResponse>(objectMapper.readValue("{  \"enrollmentId\" : \"507123177121861279943901\",  \"operationDate\" : \"1995-09-07T10:40:52Z\",  \"description\" : \"Accounts enrollment created\"}", EnrollmentResponse.class), HttpStatus.CREATED);
                EnrollmentResponse response = AccountsFacade.save(body);
                log.info(response.toString());
                return new ResponseEntity<EnrollmentResponse>(response, HttpStatus.CREATED);
            } catch (ApiException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EnrollmentResponse>(HttpStatus.valueOf(e.getCode()));
            }
        }

        return new ResponseEntity<EnrollmentResponse>(HttpStatus.CREATED);
    }

    public ResponseEntity<EnrollmentAccountsResponse> getEnrollmentAccounts(@Pattern(regexp="^\\d{24}$") @Size(min=24,max=24) @ApiParam(value = "",required=true) @PathVariable("enrollmentId") String enrollmentId,@Pattern(regexp="^\\d{8,20}$") @Size(min=8,max=20) @ApiParam(value = "debtor account number identification",required=true) @PathVariable("debtorAccountId") String debtorAccountId,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	log.info("Request GET enrollmentAcount: " + enrollmentId);
            	// return new ResponseEntity<EnrollmentAccountsResponse>(objectMapper.readValue("{  \"enrollmentId\" : \"507123177121861279943901\",  \"operationDate\" : \"1995-09-07T10:40:52Z\",  \"debtorAccount\" : {    \"identification\" : \"00000001002000000000\",    \"creditorAccounts\" : [ {      \"validThru\" : \"1995-09-07T10:40:52Z\",      \"identification\" : \"00000001002000000000\",      \"name\" : \"Santander\",      \"secundaryIdentification\" : \"00100\",      \"destinationDNI\" : \"14000000\"    }, {      \"validThru\" : \"1995-09-07T10:40:52Z\",      \"identification\" : \"00000001002000000000\",      \"name\" : \"Santander\",      \"secundaryIdentification\" : \"00100\",      \"destinationDNI\" : \"14000000\"    } ],    \"name\" : \"Santander\",    \"secundaryIdentification\" : \"00100\",    \"destinationDNI\" : \"14000000\"  },  \"description\" : \"Accounts enrollment created\"}", EnrollmentAccountsResponse.class), HttpStatus.OK);
            	EnrollmentAccountsResponse response = AccountsFacade.findById(enrollmentId);
            	log.info(response.toString());
            	return new ResponseEntity<EnrollmentAccountsResponse>(response, HttpStatus.OK);
            } catch (ApiException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EnrollmentAccountsResponse>(HttpStatus.valueOf(e.getCode()));
            }
        }

        return new ResponseEntity<EnrollmentAccountsResponse>(HttpStatus.OK);
    }

}
