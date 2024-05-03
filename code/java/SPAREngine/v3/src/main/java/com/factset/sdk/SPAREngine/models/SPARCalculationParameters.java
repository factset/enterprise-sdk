/*
 * Style Performance and Risk Analysis (SPAR) Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.4
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SPAREngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SPAREngine.models.SPARDateParameters;
import com.factset.sdk.SPAREngine.models.SPARIdentifier;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SPAREngine.JSON;


/**
 * SPARCalculationParameters
 */
@JsonPropertyOrder({
  SPARCalculationParameters.JSON_PROPERTY_COMPONENTID,
  SPARCalculationParameters.JSON_PROPERTY_ACCOUNTS,
  SPARCalculationParameters.JSON_PROPERTY_BENCHMARK,
  SPARCalculationParameters.JSON_PROPERTY_DATES,
  SPARCalculationParameters.JSON_PROPERTY_CURRENCYISOCODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SPARCalculationParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMPONENTID = "componentid";
  private String componentid;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private JsonNullable<java.util.List<SPARIdentifier>> accounts = JsonNullable.<java.util.List<SPARIdentifier>>undefined();

  public static final String JSON_PROPERTY_BENCHMARK = "benchmark";
  private SPARIdentifier benchmark;

  public static final String JSON_PROPERTY_DATES = "dates";
  private SPARDateParameters dates;

  public static final String JSON_PROPERTY_CURRENCYISOCODE = "currencyisocode";
  private JsonNullable<String> currencyisocode = JsonNullable.<String>undefined();

  public SPARCalculationParameters() { 
  }

  @JsonCreator
  public SPARCalculationParameters(
    @JsonProperty(value=JSON_PROPERTY_COMPONENTID, required=true) String componentid
  ) {
    this();
    this.componentid = componentid;
  }

  public SPARCalculationParameters componentid(String componentid) {
    this.componentid = componentid;
    return this;
  }

   /**
   * The SPAR Engine component identifier to analyze.
   * @return componentid
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The SPAR Engine component identifier to analyze.")
  @JsonProperty(JSON_PROPERTY_COMPONENTID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getComponentid() {
    return componentid;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENTID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComponentid(String componentid) {
    this.componentid = componentid;
  }


  public SPARCalculationParameters accounts(java.util.List<SPARIdentifier> accounts) {
    this.accounts = JsonNullable.<java.util.List<SPARIdentifier>>of(accounts);
    return this;
  }

  public SPARCalculationParameters addAccountsItem(SPARIdentifier accountsItem) {
    if (this.accounts == null || !this.accounts.isPresent()) {
      this.accounts = JsonNullable.<java.util.List<SPARIdentifier>>of(new java.util.ArrayList<>());
    }
    try {
      this.accounts.get().add(accountsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of accounts for SPAR calculation.
   * @return accounts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of accounts for SPAR calculation.")
  @JsonIgnore

  public java.util.List<SPARIdentifier> getAccounts() {
        return accounts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<SPARIdentifier>> getAccounts_JsonNullable() {
    return accounts;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  public void setAccounts_JsonNullable(JsonNullable<java.util.List<SPARIdentifier>> accounts) {
    this.accounts = accounts;
  }

  public void setAccounts(java.util.List<SPARIdentifier> accounts) {
    this.accounts = JsonNullable.<java.util.List<SPARIdentifier>>of(accounts);
  }


  public SPARCalculationParameters benchmark(SPARIdentifier benchmark) {
    this.benchmark = benchmark;
    return this;
  }

   /**
   * Get benchmark
   * @return benchmark
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BENCHMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SPARIdentifier getBenchmark() {
    return benchmark;
  }


  @JsonProperty(JSON_PROPERTY_BENCHMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBenchmark(SPARIdentifier benchmark) {
    this.benchmark = benchmark;
  }


  public SPARCalculationParameters dates(SPARDateParameters dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SPARDateParameters getDates() {
    return dates;
  }


  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDates(SPARDateParameters dates) {
    this.dates = dates;
  }


  public SPARCalculationParameters currencyisocode(String currencyisocode) {
    this.currencyisocode = JsonNullable.<String>of(currencyisocode);
    return this;
  }

   /**
   * Currency ISO code for calculation.
   * @return currencyisocode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Currency ISO code for calculation.")
  @JsonIgnore

  public String getCurrencyisocode() {
        return currencyisocode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCYISOCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrencyisocode_JsonNullable() {
    return currencyisocode;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCYISOCODE)
  public void setCurrencyisocode_JsonNullable(JsonNullable<String> currencyisocode) {
    this.currencyisocode = currencyisocode;
  }

  public void setCurrencyisocode(String currencyisocode) {
    this.currencyisocode = JsonNullable.<String>of(currencyisocode);
  }


  /**
   * Return true if this SPARCalculationParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SPARCalculationParameters spARCalculationParameters = (SPARCalculationParameters) o;
    return Objects.equals(this.componentid, spARCalculationParameters.componentid) &&
        equalsNullable(this.accounts, spARCalculationParameters.accounts) &&
        Objects.equals(this.benchmark, spARCalculationParameters.benchmark) &&
        Objects.equals(this.dates, spARCalculationParameters.dates) &&
        equalsNullable(this.currencyisocode, spARCalculationParameters.currencyisocode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentid, hashCodeNullable(accounts), benchmark, dates, hashCodeNullable(currencyisocode));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SPARCalculationParameters {\n");
    sb.append("    componentid: ").append(toIndentedString(componentid)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    currencyisocode: ").append(toIndentedString(currencyisocode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

