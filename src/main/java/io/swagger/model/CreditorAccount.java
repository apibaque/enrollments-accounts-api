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
 * CreditorAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-18T14:06:57.619Z")

public class CreditorAccount   {
  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("secundaryIdentification")
  private String secundaryIdentification = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("destinationDNI")
  private String destinationDNI = null;

  @JsonProperty("validThru")
  private OffsetDateTime validThru = null;

  public CreditorAccount identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(example = "00000001002000000000", required = true, value = "")
  @NotNull

@Pattern(regexp="^\\d{8,20}$") @Size(min=8,max=20) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public CreditorAccount secundaryIdentification(String secundaryIdentification) {
    this.secundaryIdentification = secundaryIdentification;
    return this;
  }

  /**
   * Get secundaryIdentification
   * @return secundaryIdentification
  **/
  @ApiModelProperty(example = "00100", required = true, value = "")
  @NotNull

@Pattern(regexp="^\\d{5}$") @Size(min=5,max=5) 
  public String getSecundaryIdentification() {
    return secundaryIdentification;
  }

  public void setSecundaryIdentification(String secundaryIdentification) {
    this.secundaryIdentification = secundaryIdentification;
  }

  public CreditorAccount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Santander", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreditorAccount destinationDNI(String destinationDNI) {
    this.destinationDNI = destinationDNI;
    return this;
  }

  /**
   * Get destinationDNI
   * @return destinationDNI
  **/
  @ApiModelProperty(example = "14000000", required = true, value = "")
  @NotNull

@Pattern(regexp="^\\d{7,8}$") @Size(min=7,max=8) 
  public String getDestinationDNI() {
    return destinationDNI;
  }

  public void setDestinationDNI(String destinationDNI) {
    this.destinationDNI = destinationDNI;
  }

  public CreditorAccount validThru(OffsetDateTime validThru) {
    this.validThru = validThru;
    return this;
  }

  /**
   * Get validThru
   * @return validThru
  **/
  @ApiModelProperty(example = "1995-09-07T10:40:52Z", value = "")

  @Valid

  public OffsetDateTime getValidThru() {
    return validThru;
  }

  public void setValidThru(OffsetDateTime validThru) {
    this.validThru = validThru;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditorAccount creditorAccount = (CreditorAccount) o;
    return Objects.equals(this.identification, creditorAccount.identification) &&
        Objects.equals(this.secundaryIdentification, creditorAccount.secundaryIdentification) &&
        Objects.equals(this.name, creditorAccount.name) &&
        Objects.equals(this.destinationDNI, creditorAccount.destinationDNI) &&
        Objects.equals(this.validThru, creditorAccount.validThru);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, secundaryIdentification, name, destinationDNI, validThru);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditorAccount {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    secundaryIdentification: ").append(toIndentedString(secundaryIdentification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationDNI: ").append(toIndentedString(destinationDNI)).append("\n");
    sb.append("    validThru: ").append(toIndentedString(validThru)).append("\n");
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

