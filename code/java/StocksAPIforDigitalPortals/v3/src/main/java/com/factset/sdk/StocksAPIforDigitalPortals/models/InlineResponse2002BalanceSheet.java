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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002BalanceSheetNetDebt;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002BalanceSheetReturnOnAssets;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002BalanceSheetReturnOnEquity;
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
 * Balance sheet estimates.
 */
@ApiModel(description = "Balance sheet estimates.")
@JsonPropertyOrder({
  InlineResponse2002BalanceSheet.JSON_PROPERTY_NET_DEBT,
  InlineResponse2002BalanceSheet.JSON_PROPERTY_RETURN_ON_ASSETS,
  InlineResponse2002BalanceSheet.JSON_PROPERTY_RETURN_ON_EQUITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2002BalanceSheet implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NET_DEBT = "netDebt";
  private InlineResponse2002BalanceSheetNetDebt netDebt;

  public static final String JSON_PROPERTY_RETURN_ON_ASSETS = "returnOnAssets";
  private InlineResponse2002BalanceSheetReturnOnAssets returnOnAssets;

  public static final String JSON_PROPERTY_RETURN_ON_EQUITY = "returnOnEquity";
  private InlineResponse2002BalanceSheetReturnOnEquity returnOnEquity;

  public InlineResponse2002BalanceSheet() { 
  }

  public InlineResponse2002BalanceSheet netDebt(InlineResponse2002BalanceSheetNetDebt netDebt) {
    this.netDebt = netDebt;
    return this;
  }

   /**
   * Get netDebt
   * @return netDebt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_DEBT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002BalanceSheetNetDebt getNetDebt() {
    return netDebt;
  }


  @JsonProperty(JSON_PROPERTY_NET_DEBT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetDebt(InlineResponse2002BalanceSheetNetDebt netDebt) {
    this.netDebt = netDebt;
  }


  public InlineResponse2002BalanceSheet returnOnAssets(InlineResponse2002BalanceSheetReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
    return this;
  }

   /**
   * Get returnOnAssets
   * @return returnOnAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002BalanceSheetReturnOnAssets getReturnOnAssets() {
    return returnOnAssets;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnAssets(InlineResponse2002BalanceSheetReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }


  public InlineResponse2002BalanceSheet returnOnEquity(InlineResponse2002BalanceSheetReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
    return this;
  }

   /**
   * Get returnOnEquity
   * @return returnOnEquity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002BalanceSheetReturnOnEquity getReturnOnEquity() {
    return returnOnEquity;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnEquity(InlineResponse2002BalanceSheetReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }


  /**
   * Return true if this inline_response_200_2_balanceSheet object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002BalanceSheet inlineResponse2002BalanceSheet = (InlineResponse2002BalanceSheet) o;
    return Objects.equals(this.netDebt, inlineResponse2002BalanceSheet.netDebt) &&
        Objects.equals(this.returnOnAssets, inlineResponse2002BalanceSheet.returnOnAssets) &&
        Objects.equals(this.returnOnEquity, inlineResponse2002BalanceSheet.returnOnEquity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netDebt, returnOnAssets, returnOnEquity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002BalanceSheet {\n");
    sb.append("    netDebt: ").append(toIndentedString(netDebt)).append("\n");
    sb.append("    returnOnAssets: ").append(toIndentedString(returnOnAssets)).append("\n");
    sb.append("    returnOnEquity: ").append(toIndentedString(returnOnEquity)).append("\n");
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

