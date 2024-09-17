/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
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
 * ResultsModelAnalyticsRisk
 */
@JsonPropertyOrder({
  ResultsModelAnalyticsRisk.JSON_PROPERTY_ALPHA,
  ResultsModelAnalyticsRisk.JSON_PROPERTY_BETA,
  ResultsModelAnalyticsRisk.JSON_PROPERTY_R_SQUARED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ResultsModelAnalyticsRisk implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ALPHA = "alpha";
  private BigDecimal alpha;

  public static final String JSON_PROPERTY_BETA = "beta";
  private BigDecimal beta;

  public static final String JSON_PROPERTY_R_SQUARED = "rSquared";
  private BigDecimal rSquared;

  public ResultsModelAnalyticsRisk() { 
  }

  public ResultsModelAnalyticsRisk alpha(BigDecimal alpha) {
    this.alpha = alpha;
    return this;
  }

   /**
   * Alpha describes portfolio results adjusted for style and market factors. It provides insight into portfolio management independent from whether its style was in favor or out of favor (i.e., benefiting from a tailwind or fighting a headwind).
   * @return alpha
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Alpha describes portfolio results adjusted for style and market factors. It provides insight into portfolio management independent from whether its style was in favor or out of favor (i.e., benefiting from a tailwind or fighting a headwind).")
  @JsonProperty(JSON_PROPERTY_ALPHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAlpha() {
    return alpha;
  }


  @JsonProperty(JSON_PROPERTY_ALPHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlpha(BigDecimal alpha) {
    this.alpha = alpha;
  }


  public ResultsModelAnalyticsRisk beta(BigDecimal beta) {
    this.beta = beta;
    return this;
  }

   /**
   * Beta is also referred to as systematic risk, in that it expresses portfolio volatility in relationship to market or benchmark volatility. A beta of greater than 1.0 indicates that the portfolio is being managed in such a way that it exhibits more systemic risk than its benchmark and vice versa.
   * @return beta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Beta is also referred to as systematic risk, in that it expresses portfolio volatility in relationship to market or benchmark volatility. A beta of greater than 1.0 indicates that the portfolio is being managed in such a way that it exhibits more systemic risk than its benchmark and vice versa.")
  @JsonProperty(JSON_PROPERTY_BETA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBeta() {
    return beta;
  }


  @JsonProperty(JSON_PROPERTY_BETA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeta(BigDecimal beta) {
    this.beta = beta;
  }


  public ResultsModelAnalyticsRisk rSquared(BigDecimal rSquared) {
    this.rSquared = rSquared;
    return this;
  }

   /**
   * In investing, R squared is generally interpreted as the percentage of a portfolio&#39;s movements that can be explained by movements in the benchmark. An R squared of 1.0 implies that the portfolio&#39;s return is completely explained by movements in the benchmark.
   * @return rSquared
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "In investing, R squared is generally interpreted as the percentage of a portfolio's movements that can be explained by movements in the benchmark. An R squared of 1.0 implies that the portfolio's return is completely explained by movements in the benchmark.")
  @JsonProperty(JSON_PROPERTY_R_SQUARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getrSquared() {
    return rSquared;
  }


  @JsonProperty(JSON_PROPERTY_R_SQUARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setrSquared(BigDecimal rSquared) {
    this.rSquared = rSquared;
  }


  /**
   * Return true if this ResultsModelAnalytics_risk object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsModelAnalyticsRisk resultsModelAnalyticsRisk = (ResultsModelAnalyticsRisk) o;
    return Objects.equals(this.alpha, resultsModelAnalyticsRisk.alpha) &&
        Objects.equals(this.beta, resultsModelAnalyticsRisk.beta) &&
        Objects.equals(this.rSquared, resultsModelAnalyticsRisk.rSquared);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alpha, beta, rSquared);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsModelAnalyticsRisk {\n");
    sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
    sb.append("    rSquared: ").append(toIndentedString(rSquared)).append("\n");
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

