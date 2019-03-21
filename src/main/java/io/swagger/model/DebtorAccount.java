package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DebtorAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-15T18:16:36.622Z")

public class DebtorAccount   {
  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("secundaryIdentification")
  private String secondaryIdentification = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("destinationDNI")
  private String destinationDNI = null;

  @JsonProperty("creditorAccounts")
  @Valid
  private List<CreditorAccount> creditorAccounts = null;

  public DebtorAccount identification(String identification) {
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

  public DebtorAccount secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * Get secondaryIdentification
   * @return secondaryIdentification
  **/
  @ApiModelProperty(example = "00100", required = true, value = "")
  @NotNull

@Pattern(regexp="^\\d{5}$") @Size(min=5,max=5) 
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }

  public DebtorAccount name(String name) {
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

  public DebtorAccount destinationDNI(String destinationDNI) {
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

  public DebtorAccount creditorAccounts(List<CreditorAccount> creditorAccounts) {
    this.creditorAccounts = creditorAccounts;
    return this;
  }

  public DebtorAccount addCreditorAccountsItem(CreditorAccount creditorAccountsItem) {
    if (this.creditorAccounts == null) {
      this.creditorAccounts = new ArrayList<CreditorAccount>();
    }
    this.creditorAccounts.add(creditorAccountsItem);
    return this;
  }

  /**
   * Credits accounts
   * @return creditorAccounts
  **/
  @ApiModelProperty(value = "Credits accounts")

  @Valid

  public List<CreditorAccount> getCreditorAccounts() {
    return creditorAccounts;
  }

  public void setCreditorAccounts(List<CreditorAccount> creditorAccounts) {
    this.creditorAccounts = creditorAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtorAccount debtorAccount = (DebtorAccount) o;
    return Objects.equals(this.identification, debtorAccount.identification) &&
        Objects.equals(this.secondaryIdentification, debtorAccount.secondaryIdentification) &&
        Objects.equals(this.name, debtorAccount.name) &&
        Objects.equals(this.destinationDNI, debtorAccount.destinationDNI) &&
        Objects.equals(this.creditorAccounts, debtorAccount.creditorAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, secondaryIdentification, name, destinationDNI, creditorAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtorAccount {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationDNI: ").append(toIndentedString(destinationDNI)).append("\n");
    sb.append("    creditorAccounts: ").append(toIndentedString(creditorAccounts)).append("\n");
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

