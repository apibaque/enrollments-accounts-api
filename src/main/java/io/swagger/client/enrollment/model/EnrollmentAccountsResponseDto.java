/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.enrollment.model;

import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * EnrollmentAccountsResponseDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-20T15:46:11.567Z")
public class EnrollmentAccountsResponseDto {
  @SerializedName("debtorAccount")
  private DebtorAccountsDto debtorAccount = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enrollmentId")
  private String enrollmentId = null;

  @SerializedName("operationDate")
  private OffsetDateTime operationDate = null;

  public EnrollmentAccountsResponseDto debtorAccount(DebtorAccountsDto debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

   /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")
  public DebtorAccountsDto getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(DebtorAccountsDto debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public EnrollmentAccountsResponseDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EnrollmentAccountsResponseDto enrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
    return this;
  }

   /**
   * Get enrollmentId
   * @return enrollmentId
  **/
  @ApiModelProperty(value = "")
  public String getEnrollmentId() {
    return enrollmentId;
  }

  public void setEnrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
  }

  public EnrollmentAccountsResponseDto operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Get operationDate
   * @return operationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentAccountsResponseDto enrollmentAccountsResponseDto = (EnrollmentAccountsResponseDto) o;
    return Objects.equals(this.debtorAccount, enrollmentAccountsResponseDto.debtorAccount) &&
        Objects.equals(this.description, enrollmentAccountsResponseDto.description) &&
        Objects.equals(this.enrollmentId, enrollmentAccountsResponseDto.enrollmentId) &&
        Objects.equals(this.operationDate, enrollmentAccountsResponseDto.operationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debtorAccount, description, enrollmentId, operationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentAccountsResponseDto {\n");
    
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
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

