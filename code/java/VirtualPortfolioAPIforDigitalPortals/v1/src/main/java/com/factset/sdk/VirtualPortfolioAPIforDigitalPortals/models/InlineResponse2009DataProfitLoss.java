/*
 * Virtual Portfolio API For Digital Portals
 * The virtual portfolio enables the analysis of the current allocation, broken down by asset classes, currencies,  regions, sectors, style, capitalization, style, maturity, risk, and more.  Relative performance and monthly returns can be measured against benchmarks, using portfolio position transaction (buy/sell) data. Both the realized profit/loss (resulting from closed transactions) and the potential profit/loss (resulting from positions that have not been sold yet) can be queried.  Portfolio endpoints allow creation and managing a transaction-based portfolio. A transaction-based portfolio contains a gapless history of all transactions to be able to accurately reproduce the investment record of the portfolio.  An instrument added to a portfolio is called a position. Each position consists of multiple buy and sell events called transactions. Portfolios are limited to 100 positions and 1000 transactions; adding more will result in an error.  A transaction-based portfolio can consist of the following transactions:  * A buy transaction opens or adds to a position in the portfolio, decreasing the cash value by the purchase price at the same time. If there is not enough cash in the portfolio to cover the transaction, the cash value becomes negative. * A sell transaction decreases or closes a position in the portfolio, increasing the cash value by the sale price at the same time. A sell transaction can only be created if the number of shares of a given position exceeds the number being sold. * A cash transaction increases or decreases the cash position of the portfolio. A portfolio can have only one cash position. The cash position is tracked automatically as each buy or sell transaction implicitly affects it. The cash position can be negative as a buy transaction does not check whether enough cash is available. The cash position does not generate interest; its performance is always 0%.  The chosen prices and key figures in the endpoints are using the same quality, which is configurable per application. Possible values are delayed (DLY), best (BST), end-of-day (EOD) or realtime (RLT). The default value for the price quality is BST.  The portfolio endpoints use different methods to calculate key figures. All key figures except the risk in /portfolio/detail/list, /portfolio/get, and /portfolio/position/list are calculated on-the-fly with current prices. The risk key figures are calculated on-the-fly with current prices, but the result is cached for 24 hours. The key figures in /portfolio/evaluation/list are calculated on end-of-day basis.  The Virtual Portfolio API for Digital Portals is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments in a watchlist. This also supports basic security identifier cross-reference. To complement the Watchlist API and Virtual Portfolio API with direct access to price histories, please refer to the Time Series API for Digital Portals.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2009DataProfitLossIntraday;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2009DataProfitLossPotential;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.JSON;


/**
 * Profit and loss of the position. Positive values indicate profit; negative values indicate loss. All calculations are performed in the currency of the portfolio.
 */
@ApiModel(description = "Profit and loss of the position. Positive values indicate profit; negative values indicate loss. All calculations are performed in the currency of the portfolio.")
@JsonPropertyOrder({
  InlineResponse2009DataProfitLoss.JSON_PROPERTY_INTRADAY,
  InlineResponse2009DataProfitLoss.JSON_PROPERTY_POTENTIAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2009DataProfitLoss implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INTRADAY = "intraday";
  private InlineResponse2009DataProfitLossIntraday intraday;

  public static final String JSON_PROPERTY_POTENTIAL = "potential";
  private InlineResponse2009DataProfitLossPotential potential;

  public InlineResponse2009DataProfitLoss() { 
  }

  public InlineResponse2009DataProfitLoss intraday(InlineResponse2009DataProfitLossIntraday intraday) {
    this.intraday = intraday;
    return this;
  }

   /**
   * Get intraday
   * @return intraday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTRADAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2009DataProfitLossIntraday getIntraday() {
    return intraday;
  }


  @JsonProperty(JSON_PROPERTY_INTRADAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntraday(InlineResponse2009DataProfitLossIntraday intraday) {
    this.intraday = intraday;
  }


  public InlineResponse2009DataProfitLoss potential(InlineResponse2009DataProfitLossPotential potential) {
    this.potential = potential;
    return this;
  }

   /**
   * Get potential
   * @return potential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POTENTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2009DataProfitLossPotential getPotential() {
    return potential;
  }


  @JsonProperty(JSON_PROPERTY_POTENTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPotential(InlineResponse2009DataProfitLossPotential potential) {
    this.potential = potential;
  }


  /**
   * Return true if this inline_response_200_9_data_profitLoss object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009DataProfitLoss inlineResponse2009DataProfitLoss = (InlineResponse2009DataProfitLoss) o;
    return Objects.equals(this.intraday, inlineResponse2009DataProfitLoss.intraday) &&
        Objects.equals(this.potential, inlineResponse2009DataProfitLoss.potential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intraday, potential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009DataProfitLoss {\n");
    sb.append("    intraday: ").append(toIndentedString(intraday)).append("\n");
    sb.append("    potential: ").append(toIndentedString(potential)).append("\n");
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
