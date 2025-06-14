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
 * ResultsModelAnalyticsRatios
 */
@JsonPropertyOrder({
  ResultsModelAnalyticsRatios.JSON_PROPERTY_INFORMATION_RATIO,
  ResultsModelAnalyticsRatios.JSON_PROPERTY_SHARPE_RATIO,
  ResultsModelAnalyticsRatios.JSON_PROPERTY_TREYNOR_RATIO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ResultsModelAnalyticsRatios implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INFORMATION_RATIO = "informationRatio";
  private BigDecimal informationRatio;

  public static final String JSON_PROPERTY_SHARPE_RATIO = "sharpeRatio";
  private BigDecimal sharpeRatio;

  public static final String JSON_PROPERTY_TREYNOR_RATIO = "treynorRatio";
  private BigDecimal treynorRatio;

  public ResultsModelAnalyticsRatios() { 
  }

  public ResultsModelAnalyticsRatios informationRatio(BigDecimal informationRatio) {
    this.informationRatio = informationRatio;
    return this;
  }

   /**
   * This ratio expresses the level of active return (i.e., portfolio return in excess of the benchmark) per unit of risk within the active return (i.e., standard deviation of the active returns: see tracking error). The information ratio is a common proxy for inferring manager skill in that it provides insight into the consistency of active return.
   * @return informationRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This ratio expresses the level of active return (i.e., portfolio return in excess of the benchmark) per unit of risk within the active return (i.e., standard deviation of the active returns: see tracking error). The information ratio is a common proxy for inferring manager skill in that it provides insight into the consistency of active return.")
  @JsonProperty(JSON_PROPERTY_INFORMATION_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getInformationRatio() {
    return informationRatio;
  }


  @JsonProperty(JSON_PROPERTY_INFORMATION_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformationRatio(BigDecimal informationRatio) {
    this.informationRatio = informationRatio;
  }


  public ResultsModelAnalyticsRatios sharpeRatio(BigDecimal sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
    return this;
  }

   /**
   * The Sharpe ratio is a measure of excess return, per unit of total risk. It provides insight into the price being paid (portfolio return in excess of the risk free rate) per unit of risk being taken (standard deviation of portfolio returns).
   * @return sharpeRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The Sharpe ratio is a measure of excess return, per unit of total risk. It provides insight into the price being paid (portfolio return in excess of the risk free rate) per unit of risk being taken (standard deviation of portfolio returns).")
  @JsonProperty(JSON_PROPERTY_SHARPE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSharpeRatio() {
    return sharpeRatio;
  }


  @JsonProperty(JSON_PROPERTY_SHARPE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharpeRatio(BigDecimal sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
  }


  public ResultsModelAnalyticsRatios treynorRatio(BigDecimal treynorRatio) {
    this.treynorRatio = treynorRatio;
    return this;
  }

   /**
   * This metric measures excess return per unit of systematic risk. It provides insight into the price being paid (portfolio return in excess of the risk free rate) per unit of systematic risk being taken (portfolio beta).
   * @return treynorRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This metric measures excess return per unit of systematic risk. It provides insight into the price being paid (portfolio return in excess of the risk free rate) per unit of systematic risk being taken (portfolio beta).")
  @JsonProperty(JSON_PROPERTY_TREYNOR_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTreynorRatio() {
    return treynorRatio;
  }


  @JsonProperty(JSON_PROPERTY_TREYNOR_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTreynorRatio(BigDecimal treynorRatio) {
    this.treynorRatio = treynorRatio;
  }


  /**
   * Return true if this ResultsModelAnalytics_ratios object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsModelAnalyticsRatios resultsModelAnalyticsRatios = (ResultsModelAnalyticsRatios) o;
    return Objects.equals(this.informationRatio, resultsModelAnalyticsRatios.informationRatio) &&
        Objects.equals(this.sharpeRatio, resultsModelAnalyticsRatios.sharpeRatio) &&
        Objects.equals(this.treynorRatio, resultsModelAnalyticsRatios.treynorRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(informationRatio, sharpeRatio, treynorRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsModelAnalyticsRatios {\n");
    sb.append("    informationRatio: ").append(toIndentedString(informationRatio)).append("\n");
    sb.append("    sharpeRatio: ").append(toIndentedString(sharpeRatio)).append("\n");
    sb.append("    treynorRatio: ").append(toIndentedString(treynorRatio)).append("\n");
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

