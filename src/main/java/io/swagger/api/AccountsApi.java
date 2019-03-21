/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.EnrollmentAccountsResponse;
import io.swagger.model.EnrollmentRequest;
import io.swagger.model.EnrollmentResponse;
import io.swagger.model.Error;
import io.swagger.model.Model401ErrorResponse;
import io.swagger.model.Model403ErrorResponse;
import io.swagger.model.Model404ErrorResponse;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-18T14:06:57.619Z")

@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    @ApiOperation(value = "Information for customer enrollment", nickname = "enrollmentAcounts", notes = "Initiate registration client account for system registration Accepts a ```enrollmentRequest``` POST, and returns HTTP 201 with the ```enrolllmentId``` of the successfully created ```enrollment acounts```.", response = EnrollmentResponse.class, tags={ "Enrollment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = EnrollmentResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Model401ErrorResponse.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Model403ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = Model404ErrorResponse.class) })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<EnrollmentResponse> enrollmentAcounts(@ApiParam(value = "" ,required=true )  @Valid @RequestBody EnrollmentRequest body,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey);


    @ApiOperation(value = "Get payment for an order", nickname = "getEnrollmentAccounts", notes = "A `due payment` is a scheduled operation on an `account`. It can be updated or deleted until its' due date. Once the payment date is reached, the due payments becomes a payment. When the payment is processed, it becomes a `transaction` on that account.", response = EnrollmentAccountsResponse.class, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = EnrollmentAccountsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Model401ErrorResponse.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Model403ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = Model404ErrorResponse.class) })
    @RequestMapping(value = "/accounts/{enrollmentId}/{debtorAccountId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<EnrollmentAccountsResponse> getEnrollmentAccounts(@Pattern(regexp="^\\d{24}$") @Size(min=24,max=24) @ApiParam(value = "",required=true) @PathVariable("enrollmentId") String enrollmentId,@Pattern(regexp="^\\d{8,20}$") @Size(min=8,max=20) @ApiParam(value = "debtor account number identification",required=true) @PathVariable("debtorAccountId") String debtorAccountId,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey);

}
