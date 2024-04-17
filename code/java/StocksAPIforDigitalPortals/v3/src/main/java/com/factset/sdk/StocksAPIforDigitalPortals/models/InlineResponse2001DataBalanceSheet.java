/*
 * Stocks API For Digital Portals
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetCashAndDueFromBanks;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetCashAndShortTermInvestments;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetNetDebt;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetTotalAssets;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetTotalCash;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetTotalDebt;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetTotalDeposits;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetTotalLiabilities;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetTotalLoans;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataBalanceSheetTotalShareholdersEquity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Balance sheet data.
 */
@ApiModel(description = "Balance sheet data.")
@JsonPropertyOrder({
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_CASH_AND_SHORT_TERM_INVESTMENTS,
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_TOTAL_ASSETS,
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_TOTAL_DEBT,
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_NET_DEBT,
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_TOTAL_LIABILITIES,
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_TOTAL_SHAREHOLDERS_EQUITY,
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_TOTAL_LOANS,
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_CASH_AND_DUE_FROM_BANKS,
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_TOTAL_DEPOSITS,
  InlineResponse2001DataBalanceSheet.JSON_PROPERTY_TOTAL_CASH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2001DataBalanceSheet implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CASH_AND_SHORT_TERM_INVESTMENTS = "cashAndShortTermInvestments";
  private InlineResponse2001DataBalanceSheetCashAndShortTermInvestments cashAndShortTermInvestments;

  public static final String JSON_PROPERTY_TOTAL_ASSETS = "totalAssets";
  private InlineResponse2001DataBalanceSheetTotalAssets totalAssets;

  public static final String JSON_PROPERTY_TOTAL_DEBT = "totalDebt";
  private InlineResponse2001DataBalanceSheetTotalDebt totalDebt;

  public static final String JSON_PROPERTY_NET_DEBT = "netDebt";
  private InlineResponse2001DataBalanceSheetNetDebt netDebt;

  public static final String JSON_PROPERTY_TOTAL_LIABILITIES = "totalLiabilities";
  private InlineResponse2001DataBalanceSheetTotalLiabilities totalLiabilities;

  public static final String JSON_PROPERTY_TOTAL_SHAREHOLDERS_EQUITY = "totalShareholdersEquity";
  private InlineResponse2001DataBalanceSheetTotalShareholdersEquity totalShareholdersEquity;

  public static final String JSON_PROPERTY_TOTAL_LOANS = "totalLoans";
  private InlineResponse2001DataBalanceSheetTotalLoans totalLoans;

  public static final String JSON_PROPERTY_CASH_AND_DUE_FROM_BANKS = "cashAndDueFromBanks";
  private InlineResponse2001DataBalanceSheetCashAndDueFromBanks cashAndDueFromBanks;

  public static final String JSON_PROPERTY_TOTAL_DEPOSITS = "totalDeposits";
  private InlineResponse2001DataBalanceSheetTotalDeposits totalDeposits;

  public static final String JSON_PROPERTY_TOTAL_CASH = "totalCash";
  private InlineResponse2001DataBalanceSheetTotalCash totalCash;

  public InlineResponse2001DataBalanceSheet() { 
  }

  public InlineResponse2001DataBalanceSheet cashAndShortTermInvestments(InlineResponse2001DataBalanceSheetCashAndShortTermInvestments cashAndShortTermInvestments) {
    this.cashAndShortTermInvestments = cashAndShortTermInvestments;
    return this;
  }

   /**
   * Get cashAndShortTermInvestments
   * @return cashAndShortTermInvestments
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CASH_AND_SHORT_TERM_INVESTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetCashAndShortTermInvestments getCashAndShortTermInvestments() {
    return cashAndShortTermInvestments;
  }


  @JsonProperty(JSON_PROPERTY_CASH_AND_SHORT_TERM_INVESTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashAndShortTermInvestments(InlineResponse2001DataBalanceSheetCashAndShortTermInvestments cashAndShortTermInvestments) {
    this.cashAndShortTermInvestments = cashAndShortTermInvestments;
  }


  public InlineResponse2001DataBalanceSheet totalAssets(InlineResponse2001DataBalanceSheetTotalAssets totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

   /**
   * Get totalAssets
   * @return totalAssets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetTotalAssets getTotalAssets() {
    return totalAssets;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAssets(InlineResponse2001DataBalanceSheetTotalAssets totalAssets) {
    this.totalAssets = totalAssets;
  }


  public InlineResponse2001DataBalanceSheet totalDebt(InlineResponse2001DataBalanceSheetTotalDebt totalDebt) {
    this.totalDebt = totalDebt;
    return this;
  }

   /**
   * Get totalDebt
   * @return totalDebt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_DEBT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetTotalDebt getTotalDebt() {
    return totalDebt;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_DEBT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalDebt(InlineResponse2001DataBalanceSheetTotalDebt totalDebt) {
    this.totalDebt = totalDebt;
  }


  public InlineResponse2001DataBalanceSheet netDebt(InlineResponse2001DataBalanceSheetNetDebt netDebt) {
    this.netDebt = netDebt;
    return this;
  }

   /**
   * Get netDebt
   * @return netDebt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_DEBT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetNetDebt getNetDebt() {
    return netDebt;
  }


  @JsonProperty(JSON_PROPERTY_NET_DEBT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetDebt(InlineResponse2001DataBalanceSheetNetDebt netDebt) {
    this.netDebt = netDebt;
  }


  public InlineResponse2001DataBalanceSheet totalLiabilities(InlineResponse2001DataBalanceSheetTotalLiabilities totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
    return this;
  }

   /**
   * Get totalLiabilities
   * @return totalLiabilities
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_LIABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetTotalLiabilities getTotalLiabilities() {
    return totalLiabilities;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_LIABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalLiabilities(InlineResponse2001DataBalanceSheetTotalLiabilities totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
  }


  public InlineResponse2001DataBalanceSheet totalShareholdersEquity(InlineResponse2001DataBalanceSheetTotalShareholdersEquity totalShareholdersEquity) {
    this.totalShareholdersEquity = totalShareholdersEquity;
    return this;
  }

   /**
   * Get totalShareholdersEquity
   * @return totalShareholdersEquity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_SHAREHOLDERS_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetTotalShareholdersEquity getTotalShareholdersEquity() {
    return totalShareholdersEquity;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SHAREHOLDERS_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalShareholdersEquity(InlineResponse2001DataBalanceSheetTotalShareholdersEquity totalShareholdersEquity) {
    this.totalShareholdersEquity = totalShareholdersEquity;
  }


  public InlineResponse2001DataBalanceSheet totalLoans(InlineResponse2001DataBalanceSheetTotalLoans totalLoans) {
    this.totalLoans = totalLoans;
    return this;
  }

   /**
   * Get totalLoans
   * @return totalLoans
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_LOANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetTotalLoans getTotalLoans() {
    return totalLoans;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_LOANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalLoans(InlineResponse2001DataBalanceSheetTotalLoans totalLoans) {
    this.totalLoans = totalLoans;
  }


  public InlineResponse2001DataBalanceSheet cashAndDueFromBanks(InlineResponse2001DataBalanceSheetCashAndDueFromBanks cashAndDueFromBanks) {
    this.cashAndDueFromBanks = cashAndDueFromBanks;
    return this;
  }

   /**
   * Get cashAndDueFromBanks
   * @return cashAndDueFromBanks
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CASH_AND_DUE_FROM_BANKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetCashAndDueFromBanks getCashAndDueFromBanks() {
    return cashAndDueFromBanks;
  }


  @JsonProperty(JSON_PROPERTY_CASH_AND_DUE_FROM_BANKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashAndDueFromBanks(InlineResponse2001DataBalanceSheetCashAndDueFromBanks cashAndDueFromBanks) {
    this.cashAndDueFromBanks = cashAndDueFromBanks;
  }


  public InlineResponse2001DataBalanceSheet totalDeposits(InlineResponse2001DataBalanceSheetTotalDeposits totalDeposits) {
    this.totalDeposits = totalDeposits;
    return this;
  }

   /**
   * Get totalDeposits
   * @return totalDeposits
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_DEPOSITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetTotalDeposits getTotalDeposits() {
    return totalDeposits;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_DEPOSITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalDeposits(InlineResponse2001DataBalanceSheetTotalDeposits totalDeposits) {
    this.totalDeposits = totalDeposits;
  }


  public InlineResponse2001DataBalanceSheet totalCash(InlineResponse2001DataBalanceSheetTotalCash totalCash) {
    this.totalCash = totalCash;
    return this;
  }

   /**
   * Get totalCash
   * @return totalCash
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_CASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataBalanceSheetTotalCash getTotalCash() {
    return totalCash;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCash(InlineResponse2001DataBalanceSheetTotalCash totalCash) {
    this.totalCash = totalCash;
  }


  /**
   * Return true if this inline_response_200_1_data_balanceSheet object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001DataBalanceSheet inlineResponse2001DataBalanceSheet = (InlineResponse2001DataBalanceSheet) o;
    return Objects.equals(this.cashAndShortTermInvestments, inlineResponse2001DataBalanceSheet.cashAndShortTermInvestments) &&
        Objects.equals(this.totalAssets, inlineResponse2001DataBalanceSheet.totalAssets) &&
        Objects.equals(this.totalDebt, inlineResponse2001DataBalanceSheet.totalDebt) &&
        Objects.equals(this.netDebt, inlineResponse2001DataBalanceSheet.netDebt) &&
        Objects.equals(this.totalLiabilities, inlineResponse2001DataBalanceSheet.totalLiabilities) &&
        Objects.equals(this.totalShareholdersEquity, inlineResponse2001DataBalanceSheet.totalShareholdersEquity) &&
        Objects.equals(this.totalLoans, inlineResponse2001DataBalanceSheet.totalLoans) &&
        Objects.equals(this.cashAndDueFromBanks, inlineResponse2001DataBalanceSheet.cashAndDueFromBanks) &&
        Objects.equals(this.totalDeposits, inlineResponse2001DataBalanceSheet.totalDeposits) &&
        Objects.equals(this.totalCash, inlineResponse2001DataBalanceSheet.totalCash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashAndShortTermInvestments, totalAssets, totalDebt, netDebt, totalLiabilities, totalShareholdersEquity, totalLoans, cashAndDueFromBanks, totalDeposits, totalCash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001DataBalanceSheet {\n");
    sb.append("    cashAndShortTermInvestments: ").append(toIndentedString(cashAndShortTermInvestments)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    totalDebt: ").append(toIndentedString(totalDebt)).append("\n");
    sb.append("    netDebt: ").append(toIndentedString(netDebt)).append("\n");
    sb.append("    totalLiabilities: ").append(toIndentedString(totalLiabilities)).append("\n");
    sb.append("    totalShareholdersEquity: ").append(toIndentedString(totalShareholdersEquity)).append("\n");
    sb.append("    totalLoans: ").append(toIndentedString(totalLoans)).append("\n");
    sb.append("    cashAndDueFromBanks: ").append(toIndentedString(cashAndDueFromBanks)).append("\n");
    sb.append("    totalDeposits: ").append(toIndentedString(totalDeposits)).append("\n");
    sb.append("    totalCash: ").append(toIndentedString(totalCash)).append("\n");
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

