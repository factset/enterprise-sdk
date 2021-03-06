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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataTargetPrice;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002Recommendation;
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
 * InlineResponse2002Data
 */
@JsonPropertyOrder({
  InlineResponse2002Data.JSON_PROPERTY_SNAPSHOT,
  InlineResponse2002Data.JSON_PROPERTY_TARGET_PRICE,
  InlineResponse2002Data.JSON_PROPERTY_RECOMMENDATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2002Data implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Identification of the historic snapshot for aggregated recommendations.
   */
  public enum SnapshotEnum {
    LATEST("latest"),
    
    _1W("1w"),
    
    _1M("1m"),
    
    _3M("3m"),
    
    _6M("6m"),
    
    _1Y("1y");

    private String value;

    SnapshotEnum(String value) {
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
    public static SnapshotEnum fromValue(String value) {
      for (SnapshotEnum b : SnapshotEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SNAPSHOT = "snapshot";
  private SnapshotEnum snapshot;

  public static final String JSON_PROPERTY_TARGET_PRICE = "targetPrice";
  private InlineResponse2001DataTargetPrice targetPrice;

  public static final String JSON_PROPERTY_RECOMMENDATION = "recommendation";
  private InlineResponse2002Recommendation recommendation;

  public InlineResponse2002Data() { 
  }

  public InlineResponse2002Data snapshot(SnapshotEnum snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Identification of the historic snapshot for aggregated recommendations.
   * @return snapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identification of the historic snapshot for aggregated recommendations.")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SnapshotEnum getSnapshot() {
    return snapshot;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshot(SnapshotEnum snapshot) {
    this.snapshot = snapshot;
  }


  public InlineResponse2002Data targetPrice(InlineResponse2001DataTargetPrice targetPrice) {
    this.targetPrice = targetPrice;
    return this;
  }

   /**
   * Get targetPrice
   * @return targetPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataTargetPrice getTargetPrice() {
    return targetPrice;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPrice(InlineResponse2001DataTargetPrice targetPrice) {
    this.targetPrice = targetPrice;
  }


  public InlineResponse2002Data recommendation(InlineResponse2002Recommendation recommendation) {
    this.recommendation = recommendation;
    return this;
  }

   /**
   * Get recommendation
   * @return recommendation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002Recommendation getRecommendation() {
    return recommendation;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendation(InlineResponse2002Recommendation recommendation) {
    this.recommendation = recommendation;
  }


  /**
   * Return true if this inline_response_200_2_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Data inlineResponse2002Data = (InlineResponse2002Data) o;
    return Objects.equals(this.snapshot, inlineResponse2002Data.snapshot) &&
        Objects.equals(this.targetPrice, inlineResponse2002Data.targetPrice) &&
        Objects.equals(this.recommendation, inlineResponse2002Data.recommendation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshot, targetPrice, recommendation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Data {\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    targetPrice: ").append(toIndentedString(targetPrice)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
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

