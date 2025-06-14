/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Cabot.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Cabot.models.ConstructionModelAnalyticsActiveWeights;
import com.factset.sdk.Cabot.models.ConstructionModelAnalyticsPositionCount;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Cabot.JSON;


/**
 * ConstructionModelAnalytics
 */
@JsonPropertyOrder({
  ConstructionModelAnalytics.JSON_PROPERTY_ACTIVE_SHARE,
  ConstructionModelAnalytics.JSON_PROPERTY_ACTIVE_WEIGHTS,
  ConstructionModelAnalytics.JSON_PROPERTY_POSITION_COUNT,
  ConstructionModelAnalytics.JSON_PROPERTY_TURNOVER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ConstructionModelAnalytics implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACTIVE_SHARE = "activeShare";
  private BigDecimal activeShare;

  public static final String JSON_PROPERTY_ACTIVE_WEIGHTS = "activeWeights";
  private ConstructionModelAnalyticsActiveWeights activeWeights;

  public static final String JSON_PROPERTY_POSITION_COUNT = "positionCount";
  private ConstructionModelAnalyticsPositionCount positionCount;

  public static final String JSON_PROPERTY_TURNOVER = "turnover";
  private BigDecimal turnover;

  public ConstructionModelAnalytics() { 
  }

  public ConstructionModelAnalytics activeShare(BigDecimal activeShare) {
    this.activeShare = activeShare;
    return this;
  }

   /**
   * Active Share is a measure of the percentage of stock holdings in a portfolio that differs from the benchmark index. At the extremes, a portfolio with no holdings in common with the benchmark would have 100% active share, while a portfolio that is identical to the benchmark would have 0% active share.
   * @return activeShare
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Active Share is a measure of the percentage of stock holdings in a portfolio that differs from the benchmark index. At the extremes, a portfolio with no holdings in common with the benchmark would have 100% active share, while a portfolio that is identical to the benchmark would have 0% active share.")
  @JsonProperty(JSON_PROPERTY_ACTIVE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getActiveShare() {
    return activeShare;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveShare(BigDecimal activeShare) {
    this.activeShare = activeShare;
  }


  public ConstructionModelAnalytics activeWeights(ConstructionModelAnalyticsActiveWeights activeWeights) {
    this.activeWeights = activeWeights;
    return this;
  }

   /**
   * Get activeWeights
   * @return activeWeights
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE_WEIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConstructionModelAnalyticsActiveWeights getActiveWeights() {
    return activeWeights;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_WEIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveWeights(ConstructionModelAnalyticsActiveWeights activeWeights) {
    this.activeWeights = activeWeights;
  }


  public ConstructionModelAnalytics positionCount(ConstructionModelAnalyticsPositionCount positionCount) {
    this.positionCount = positionCount;
    return this;
  }

   /**
   * Get positionCount
   * @return positionCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSITION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConstructionModelAnalyticsPositionCount getPositionCount() {
    return positionCount;
  }


  @JsonProperty(JSON_PROPERTY_POSITION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositionCount(ConstructionModelAnalyticsPositionCount positionCount) {
    this.positionCount = positionCount;
  }


  public ConstructionModelAnalytics turnover(BigDecimal turnover) {
    this.turnover = turnover;
    return this;
  }

   /**
   * This is a measure of the degree to which the bets in the portfolio change over time. It is computed by summing the weight of all sells over the analysis timeframe and dividing this quantity by the same timeframe to produce an annualized value.
   * @return turnover
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This is a measure of the degree to which the bets in the portfolio change over time. It is computed by summing the weight of all sells over the analysis timeframe and dividing this quantity by the same timeframe to produce an annualized value.")
  @JsonProperty(JSON_PROPERTY_TURNOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTurnover() {
    return turnover;
  }


  @JsonProperty(JSON_PROPERTY_TURNOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTurnover(BigDecimal turnover) {
    this.turnover = turnover;
  }


  /**
   * Return true if this ConstructionModelAnalytics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstructionModelAnalytics constructionModelAnalytics = (ConstructionModelAnalytics) o;
    return Objects.equals(this.activeShare, constructionModelAnalytics.activeShare) &&
        Objects.equals(this.activeWeights, constructionModelAnalytics.activeWeights) &&
        Objects.equals(this.positionCount, constructionModelAnalytics.positionCount) &&
        Objects.equals(this.turnover, constructionModelAnalytics.turnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeShare, activeWeights, positionCount, turnover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionModelAnalytics {\n");
    sb.append("    activeShare: ").append(toIndentedString(activeShare)).append("\n");
    sb.append("    activeWeights: ").append(toIndentedString(activeWeights)).append("\n");
    sb.append("    positionCount: ").append(toIndentedString(positionCount)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
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

