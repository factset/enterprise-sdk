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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.PortfolioEvaluationListDataRange;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PortfolioEvaluationListData.JSON_PROPERTY_ID,
  PortfolioEvaluationListData.JSON_PROPERTY_RANGE,
  PortfolioEvaluationListData.JSON_PROPERTY_RESOLUTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioEvaluationListData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RANGE = "range";
  private PortfolioEvaluationListDataRange range;

  /**
   * Gets or Sets resolution
   */
  public enum ResolutionEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly");

    private String value;

    ResolutionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResolutionEnum fromValue(String value) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private ResolutionEnum resolution = ResolutionEnum.DAILY;

  public PortfolioEvaluationListData() { 
  }

  @JsonCreator
  public PortfolioEvaluationListData(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) String id, 
    @JsonProperty(value=JSON_PROPERTY_RANGE, required=true) PortfolioEvaluationListDataRange range
  ) {
    this();
    this.id = id;
    this.range = range;
  }

  public PortfolioEvaluationListData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the portfolio.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier of the portfolio.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PortfolioEvaluationListData range(PortfolioEvaluationListDataRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PortfolioEvaluationListDataRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRange(PortfolioEvaluationListDataRange range) {
    this.range = range;
  }


  public PortfolioEvaluationListData resolution(ResolutionEnum resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolutionEnum getResolution() {
    return resolution;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }


  /**
   * Return true if this _portfolio_evaluation_list_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioEvaluationListData portfolioEvaluationListData = (PortfolioEvaluationListData) o;
    return Objects.equals(this.id, portfolioEvaluationListData.id) &&
        Objects.equals(this.range, portfolioEvaluationListData.range) &&
        Objects.equals(this.resolution, portfolioEvaluationListData.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, range, resolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioEvaluationListData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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

