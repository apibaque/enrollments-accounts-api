package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The payment initiation object can be used for three types of payments, which should be specified in the &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; property: * &#x60;&#x60;&#x60;ORDERID&#x60;&#x60;&#x60;: The Go Socket identification number specified by the receiving end, often described in the invoice.  Payment initiator: Part of the context object, but kept here too for reference. 
 */
@ApiModel(description = "The payment initiation object can be used for three types of payments, which should be specified in the ```type``` property: * ```ORDERID```: The Go Socket identification number specified by the receiving end, often described in the invoice.  Payment initiator: Part of the context object, but kept here too for reference. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-18T14:06:57.619Z")

public class EnrollmentResponse   {
  @JsonProperty("enrollmentId")
  private String enrollmentId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("operationDate")
  private OffsetDateTime operationDate = null;

  public EnrollmentResponse enrollmentId(String enrollmentId) {
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

  public EnrollmentResponse description(String description) {
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

  public EnrollmentResponse operationDate(OffsetDateTime operationDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentResponse enrollmentResponse = (EnrollmentResponse) o;
    return Objects.equals(this.enrollmentId, enrollmentResponse.enrollmentId) &&
        Objects.equals(this.description, enrollmentResponse.description) &&
        Objects.equals(this.operationDate, enrollmentResponse.operationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollmentId, description, operationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentResponse {\n");
    
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

