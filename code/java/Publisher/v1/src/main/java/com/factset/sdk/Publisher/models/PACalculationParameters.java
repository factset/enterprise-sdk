/*
 * Publisher API
 * Allow clients to fetch Publisher Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Publisher.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Publisher.models.PACalculationColumn;
import com.factset.sdk.Publisher.models.PACalculationGroup;
import com.factset.sdk.Publisher.models.PADateParameters;
import com.factset.sdk.Publisher.models.PAIdentifier;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Publisher.JSON;


/**
 * PACalculationParameters
 */
@JsonPropertyOrder({
  PACalculationParameters.JSON_PROPERTY_COMPONENTID,
  PACalculationParameters.JSON_PROPERTY_ACCOUNTS,
  PACalculationParameters.JSON_PROPERTY_BENCHMARKS,
  PACalculationParameters.JSON_PROPERTY_DATES,
  PACalculationParameters.JSON_PROPERTY_GROUPS,
  PACalculationParameters.JSON_PROPERTY_CURRENCYISOCODE,
  PACalculationParameters.JSON_PROPERTY_COLUMNS,
  PACalculationParameters.JSON_PROPERTY_COMPONENTDETAIL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PACalculationParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMPONENTID = "componentid";
  private String componentid;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private java.util.List<PAIdentifier> accounts = null;

  public static final String JSON_PROPERTY_BENCHMARKS = "benchmarks";
  private java.util.List<PAIdentifier> benchmarks = null;

  public static final String JSON_PROPERTY_DATES = "dates";
  private PADateParameters dates;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private java.util.List<PACalculationGroup> groups = null;

  public static final String JSON_PROPERTY_CURRENCYISOCODE = "currencyisocode";
  private String currencyisocode;

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private java.util.List<PACalculationColumn> columns = null;

  public static final String JSON_PROPERTY_COMPONENTDETAIL = "componentdetail";
  private String componentdetail;

  public PACalculationParameters() { 
  }

  @JsonCreator
  public PACalculationParameters(
    @JsonProperty(value=JSON_PROPERTY_COMPONENTID, required=true) String componentid
  ) {
    this();
    this.componentid = componentid;
  }

  public PACalculationParameters componentid(String componentid) {
    this.componentid = componentid;
    return this;
  }

   /**
   * The PA Engine component identifier to analyze.
   * @return componentid
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The PA Engine component identifier to analyze.")
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


  public PACalculationParameters accounts(java.util.List<PAIdentifier> accounts) {
    this.accounts = accounts;
    return this;
  }

  public PACalculationParameters addAccountsItem(PAIdentifier accountsItem) {
    if (this.accounts == null) {
      this.accounts = new java.util.ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * List of accounts.
   * @return accounts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of accounts.")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PAIdentifier> getAccounts() {
    return accounts;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccounts(java.util.List<PAIdentifier> accounts) {
    this.accounts = accounts;
  }


  public PACalculationParameters benchmarks(java.util.List<PAIdentifier> benchmarks) {
    this.benchmarks = benchmarks;
    return this;
  }

  public PACalculationParameters addBenchmarksItem(PAIdentifier benchmarksItem) {
    if (this.benchmarks == null) {
      this.benchmarks = new java.util.ArrayList<>();
    }
    this.benchmarks.add(benchmarksItem);
    return this;
  }

   /**
   * List of benchmarks.
   * @return benchmarks
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of benchmarks.")
  @JsonProperty(JSON_PROPERTY_BENCHMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PAIdentifier> getBenchmarks() {
    return benchmarks;
  }


  @JsonProperty(JSON_PROPERTY_BENCHMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBenchmarks(java.util.List<PAIdentifier> benchmarks) {
    this.benchmarks = benchmarks;
  }


  public PACalculationParameters dates(PADateParameters dates) {
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

  public PADateParameters getDates() {
    return dates;
  }


  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDates(PADateParameters dates) {
    this.dates = dates;
  }


  public PACalculationParameters groups(java.util.List<PACalculationGroup> groups) {
    this.groups = groups;
    return this;
  }

  public PACalculationParameters addGroupsItem(PACalculationGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document.
   * @return groups
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document.")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PACalculationGroup> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(java.util.List<PACalculationGroup> groups) {
    this.groups = groups;
  }


  public PACalculationParameters currencyisocode(String currencyisocode) {
    this.currencyisocode = currencyisocode;
    return this;
  }

   /**
   * Currency ISO code for calculation.
   * @return currencyisocode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Currency ISO code for calculation.")
  @JsonProperty(JSON_PROPERTY_CURRENCYISOCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyisocode() {
    return currencyisocode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCYISOCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyisocode(String currencyisocode) {
    this.currencyisocode = currencyisocode;
  }


  public PACalculationParameters columns(java.util.List<PACalculationColumn> columns) {
    this.columns = columns;
    return this;
  }

  public PACalculationParameters addColumnsItem(PACalculationColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new java.util.ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * List of columns for the PA calculation. This will take precedence over the columns saved in the PA document.
   * @return columns
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of columns for the PA calculation. This will take precedence over the columns saved in the PA document.")
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PACalculationColumn> getColumns() {
    return columns;
  }


  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumns(java.util.List<PACalculationColumn> columns) {
    this.columns = columns;
  }


  public PACalculationParameters componentdetail(String componentdetail) {
    this.componentdetail = componentdetail;
    return this;
  }

   /**
   * Component detail type for the PA component. It can be GROUPS or TOTALS.
   * @return componentdetail
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Component detail type for the PA component. It can be GROUPS or TOTALS.")
  @JsonProperty(JSON_PROPERTY_COMPONENTDETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComponentdetail() {
    return componentdetail;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENTDETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentdetail(String componentdetail) {
    this.componentdetail = componentdetail;
  }


  /**
   * Return true if this PACalculationParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PACalculationParameters paCalculationParameters = (PACalculationParameters) o;
    return Objects.equals(this.componentid, paCalculationParameters.componentid) &&
        Objects.equals(this.accounts, paCalculationParameters.accounts) &&
        Objects.equals(this.benchmarks, paCalculationParameters.benchmarks) &&
        Objects.equals(this.dates, paCalculationParameters.dates) &&
        Objects.equals(this.groups, paCalculationParameters.groups) &&
        Objects.equals(this.currencyisocode, paCalculationParameters.currencyisocode) &&
        Objects.equals(this.columns, paCalculationParameters.columns) &&
        Objects.equals(this.componentdetail, paCalculationParameters.componentdetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentid, accounts, benchmarks, dates, groups, currencyisocode, columns, componentdetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PACalculationParameters {\n");
    sb.append("    componentid: ").append(toIndentedString(componentid)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    benchmarks: ").append(toIndentedString(benchmarks)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    currencyisocode: ").append(toIndentedString(currencyisocode)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    componentdetail: ").append(toIndentedString(componentdetail)).append("\n");
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

