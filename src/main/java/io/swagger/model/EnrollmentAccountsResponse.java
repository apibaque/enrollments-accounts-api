package io.swagger.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The payment initiation object can be used for three types of payments, which should be specified in the &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; property: * &#x60;&#x60;&#x60;ORDERID&#x60;&#x60;&#x60;: The Go Socket identification number specified by the receiving end, often described in the invoice.  Payment initiator: Part of the context object, but kept here too for reference. 
 */
@ApiModel(description = "The payment initiation object can be used for three types of payments, which should be specified in the ```type``` property: * ```ORDERID```: The Go Socket identification number specified by the receiving end, often described in the invoice.  Payment initiator: Part of the context object, but kept here too for reference. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-18T14:06:57.619Z")

public class EnrollmentAccountsResponse   {
  @JsonProperty("enrollmentId")
  private String enrollmentId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("operationDate")
  private OffsetDateTime operationDate = null;

  @JsonProperty("debtorAccount")
  private DebtorAccount debtorAccount = null;

  public EnrollmentAccountsResponse enrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
    return this;
  }

  /**
   * Get enrollmentId
   * @return enrollmentId
  **/
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", required = true, value = "")
  @NotNull

@Pattern(regexp="^\\d{24}$") @Size(min=24,max=24) 
  public String getEnrollmentId() {
    return enrollmentId;
  }

  public void setEnrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
  }

  public EnrollmentAccountsResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Accounts enrollment created", required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EnrollmentAccountsResponse operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

  /**
   * Get operationDate
   * @return operationDate
  **/
  @ApiModelProperty(example = "1995-09-07T10:40:52Z", required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }

  public EnrollmentAccountsResponse debtorAccount(DebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(DebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentAccountsResponse enrollmentAccountsResponse = (EnrollmentAccountsResponse) o;
    return Objects.equals(this.enrollmentId, enrollmentAccountsResponse.enrollmentId) &&
        Objects.equals(this.description, enrollmentAccountsResponse.description) &&
        Objects.equals(this.operationDate, enrollmentAccountsResponse.operationDate) &&
        Objects.equals(this.debtorAccount, enrollmentAccountsResponse.debtorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollmentId, description, operationDate, debtorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentAccountsResponse {\n");
    
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

