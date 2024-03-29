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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2009DataPositions;
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
 * List of open positions.
 */
@ApiModel(description = "List of open positions.")
@JsonPropertyOrder({
  InlineResponse2009Data.JSON_PROPERTY_POSITIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2009Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_POSITIONS = "positions";
  private java.util.List<InlineResponse2009DataPositions> positions = null;

  public InlineResponse2009Data() { 
  }

  public InlineResponse2009Data positions(java.util.List<InlineResponse2009DataPositions> positions) {
    this.positions = positions;
    return this;
  }

  public InlineResponse2009Data addPositionsItem(InlineResponse2009DataPositions positionsItem) {
    if (this.positions == null) {
      this.positions = new java.util.ArrayList<>();
    }
    this.positions.add(positionsItem);
    return this;
  }

   /**
   * Positions of the portfolio.
   * @return positions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Positions of the portfolio.")
  @JsonProperty(JSON_PROPERTY_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2009DataPositions> getPositions() {
    return positions;
  }


  @JsonProperty(JSON_PROPERTY_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositions(java.util.List<InlineResponse2009DataPositions> positions) {
    this.positions = positions;
  }


  /**
   * Return true if this inline_response_200_9_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009Data inlineResponse2009Data = (InlineResponse2009Data) o;
    return Objects.equals(this.positions, inlineResponse2009Data.positions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009Data {\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
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

