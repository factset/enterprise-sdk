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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataCashFlowCapitalExpenditures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataCashFlowNetFinancingCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataCashFlowNetInvestingCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataCashFlowNetOperating;
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
 * Cash flow data.
 */
@ApiModel(description = "Cash flow data.")
@JsonPropertyOrder({
  InlineResponse2001DataCashFlow.JSON_PROPERTY_NET_OPERATING,
  InlineResponse2001DataCashFlow.JSON_PROPERTY_CAPITAL_EXPENDITURES,
  InlineResponse2001DataCashFlow.JSON_PROPERTY_NET_INVESTING_CASH_FLOW,
  InlineResponse2001DataCashFlow.JSON_PROPERTY_NET_FINANCING_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2001DataCashFlow implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NET_OPERATING = "netOperating";
  private InlineResponse2001DataCashFlowNetOperating netOperating;

  public static final String JSON_PROPERTY_CAPITAL_EXPENDITURES = "capitalExpenditures";
  private InlineResponse2001DataCashFlowCapitalExpenditures capitalExpenditures;

  public static final String JSON_PROPERTY_NET_INVESTING_CASH_FLOW = "netInvestingCashFlow";
  private InlineResponse2001DataCashFlowNetInvestingCashFlow netInvestingCashFlow;

  public static final String JSON_PROPERTY_NET_FINANCING_CASH_FLOW = "netFinancingCashFlow";
  private InlineResponse2001DataCashFlowNetFinancingCashFlow netFinancingCashFlow;

  public InlineResponse2001DataCashFlow() { 
  }

  public InlineResponse2001DataCashFlow netOperating(InlineResponse2001DataCashFlowNetOperating netOperating) {
    this.netOperating = netOperating;
    return this;
  }

   /**
   * Get netOperating
   * @return netOperating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_OPERATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataCashFlowNetOperating getNetOperating() {
    return netOperating;
  }


  @JsonProperty(JSON_PROPERTY_NET_OPERATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetOperating(InlineResponse2001DataCashFlowNetOperating netOperating) {
    this.netOperating = netOperating;
  }


  public InlineResponse2001DataCashFlow capitalExpenditures(InlineResponse2001DataCashFlowCapitalExpenditures capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
    return this;
  }

   /**
   * Get capitalExpenditures
   * @return capitalExpenditures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAPITAL_EXPENDITURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataCashFlowCapitalExpenditures getCapitalExpenditures() {
    return capitalExpenditures;
  }


  @JsonProperty(JSON_PROPERTY_CAPITAL_EXPENDITURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalExpenditures(InlineResponse2001DataCashFlowCapitalExpenditures capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
  }


  public InlineResponse2001DataCashFlow netInvestingCashFlow(InlineResponse2001DataCashFlowNetInvestingCashFlow netInvestingCashFlow) {
    this.netInvestingCashFlow = netInvestingCashFlow;
    return this;
  }

   /**
   * Get netInvestingCashFlow
   * @return netInvestingCashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_INVESTING_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataCashFlowNetInvestingCashFlow getNetInvestingCashFlow() {
    return netInvestingCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_NET_INVESTING_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetInvestingCashFlow(InlineResponse2001DataCashFlowNetInvestingCashFlow netInvestingCashFlow) {
    this.netInvestingCashFlow = netInvestingCashFlow;
  }


  public InlineResponse2001DataCashFlow netFinancingCashFlow(InlineResponse2001DataCashFlowNetFinancingCashFlow netFinancingCashFlow) {
    this.netFinancingCashFlow = netFinancingCashFlow;
    return this;
  }

   /**
   * Get netFinancingCashFlow
   * @return netFinancingCashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_FINANCING_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataCashFlowNetFinancingCashFlow getNetFinancingCashFlow() {
    return netFinancingCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_NET_FINANCING_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetFinancingCashFlow(InlineResponse2001DataCashFlowNetFinancingCashFlow netFinancingCashFlow) {
    this.netFinancingCashFlow = netFinancingCashFlow;
  }


  /**
   * Return true if this inline_response_200_1_data_cashFlow object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001DataCashFlow inlineResponse2001DataCashFlow = (InlineResponse2001DataCashFlow) o;
    return Objects.equals(this.netOperating, inlineResponse2001DataCashFlow.netOperating) &&
        Objects.equals(this.capitalExpenditures, inlineResponse2001DataCashFlow.capitalExpenditures) &&
        Objects.equals(this.netInvestingCashFlow, inlineResponse2001DataCashFlow.netInvestingCashFlow) &&
        Objects.equals(this.netFinancingCashFlow, inlineResponse2001DataCashFlow.netFinancingCashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netOperating, capitalExpenditures, netInvestingCashFlow, netFinancingCashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001DataCashFlow {\n");
    sb.append("    netOperating: ").append(toIndentedString(netOperating)).append("\n");
    sb.append("    capitalExpenditures: ").append(toIndentedString(capitalExpenditures)).append("\n");
    sb.append("    netInvestingCashFlow: ").append(toIndentedString(netInvestingCashFlow)).append("\n");
    sb.append("    netFinancingCashFlow: ").append(toIndentedString(netFinancingCashFlow)).append("\n");
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
