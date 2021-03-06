/*
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200BalanceSheet;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200Currency;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200FiscalYear;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200IncomeStatement;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200PerShare;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200Ratios;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * InlineResponse200Data
 */
@JsonPropertyOrder({
  InlineResponse200Data.JSON_PROPERTY_FISCAL_YEAR,
  InlineResponse200Data.JSON_PROPERTY_REPORT_DATE,
  InlineResponse200Data.JSON_PROPERTY_CURRENCY,
  InlineResponse200Data.JSON_PROPERTY_INCOME_STATEMENT,
  InlineResponse200Data.JSON_PROPERTY_BALANCE_SHEET,
  InlineResponse200Data.JSON_PROPERTY_RATIOS,
  InlineResponse200Data.JSON_PROPERTY_PER_SHARE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private InlineResponse200FiscalYear fiscalYear;

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private LocalDate reportDate;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse200Currency currency;

  public static final String JSON_PROPERTY_INCOME_STATEMENT = "incomeStatement";
  private InlineResponse200IncomeStatement incomeStatement;

  public static final String JSON_PROPERTY_BALANCE_SHEET = "balanceSheet";
  private InlineResponse200BalanceSheet balanceSheet;

  public static final String JSON_PROPERTY_RATIOS = "ratios";
  private InlineResponse200Ratios ratios;

  public static final String JSON_PROPERTY_PER_SHARE = "perShare";
  private InlineResponse200PerShare perShare;

  public InlineResponse200Data() { 
  }

  public InlineResponse200Data fiscalYear(InlineResponse200FiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * Get fiscalYear
   * @return fiscalYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200FiscalYear getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalYear(InlineResponse200FiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public InlineResponse200Data reportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
    return this;
  }

   /**
   * Publication date of the financial report.
   * @return reportDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Publication date of the financial report.")
  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getReportDate() {
    return reportDate;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }


  public InlineResponse200Data currency(InlineResponse200Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse200Currency currency) {
    this.currency = currency;
  }


  public InlineResponse200Data incomeStatement(InlineResponse200IncomeStatement incomeStatement) {
    this.incomeStatement = incomeStatement;
    return this;
  }

   /**
   * Get incomeStatement
   * @return incomeStatement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCOME_STATEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200IncomeStatement getIncomeStatement() {
    return incomeStatement;
  }


  @JsonProperty(JSON_PROPERTY_INCOME_STATEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomeStatement(InlineResponse200IncomeStatement incomeStatement) {
    this.incomeStatement = incomeStatement;
  }


  public InlineResponse200Data balanceSheet(InlineResponse200BalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
    return this;
  }

   /**
   * Get balanceSheet
   * @return balanceSheet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_SHEET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200BalanceSheet getBalanceSheet() {
    return balanceSheet;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_SHEET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceSheet(InlineResponse200BalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
  }


  public InlineResponse200Data ratios(InlineResponse200Ratios ratios) {
    this.ratios = ratios;
    return this;
  }

   /**
   * Get ratios
   * @return ratios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200Ratios getRatios() {
    return ratios;
  }


  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatios(InlineResponse200Ratios ratios) {
    this.ratios = ratios;
  }


  public InlineResponse200Data perShare(InlineResponse200PerShare perShare) {
    this.perShare = perShare;
    return this;
  }

   /**
   * Get perShare
   * @return perShare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PER_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200PerShare getPerShare() {
    return perShare;
  }


  @JsonProperty(JSON_PROPERTY_PER_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerShare(InlineResponse200PerShare perShare) {
    this.perShare = perShare;
  }


  /**
   * Return true if this inline_response_200_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.fiscalYear, inlineResponse200Data.fiscalYear) &&
        Objects.equals(this.reportDate, inlineResponse200Data.reportDate) &&
        Objects.equals(this.currency, inlineResponse200Data.currency) &&
        Objects.equals(this.incomeStatement, inlineResponse200Data.incomeStatement) &&
        Objects.equals(this.balanceSheet, inlineResponse200Data.balanceSheet) &&
        Objects.equals(this.ratios, inlineResponse200Data.ratios) &&
        Objects.equals(this.perShare, inlineResponse200Data.perShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, reportDate, currency, incomeStatement, balanceSheet, ratios, perShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    incomeStatement: ").append(toIndentedString(incomeStatement)).append("\n");
    sb.append("    balanceSheet: ").append(toIndentedString(balanceSheet)).append("\n");
    sb.append("    ratios: ").append(toIndentedString(ratios)).append("\n");
    sb.append("    perShare: ").append(toIndentedString(perShare)).append("\n");
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

