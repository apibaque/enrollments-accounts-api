package io.swagger.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The payment initiation object can be used for three types of payments, which should be specified in the &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; property: * &#x60;&#x60;&#x60;enrollmentId&#x60;&#x60;&#x60;: The enrollment identification number specified by the receiving end, often described in the invoice. 
 */
@ApiModel(description = "The payment initiation object can be used for three types of payments, which should be specified in the ```type``` property: * ```enrollmentId```: The enrollment identification number specified by the receiving end, often described in the invoice. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-18T14:06:57.619Z")

public class EnrollmentRequest   {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("debtorAccount")
  private DebtorAccount debtorAccount = null;

  public EnrollmentRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get enrollmentId
   * @return enrollmentId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^\\w{24}$") @Size(min=24,max=24) 
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public EnrollmentRequest debtorAccount(DebtorAccount debtorAccount) {
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
    EnrollmentRequest enrollmentRequest = (EnrollmentRequest) o;
    return Objects.equals(this.clientId, enrollmentRequest.clientId) &&
        Objects.equals(this.debtorAccount, enrollmentRequest.debtorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, debtorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentRequest {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

