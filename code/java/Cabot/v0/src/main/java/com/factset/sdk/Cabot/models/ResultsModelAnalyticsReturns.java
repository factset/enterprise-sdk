/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
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
 * ResultsModelAnalyticsReturns
 */
@JsonPropertyOrder({
  ResultsModelAnalyticsReturns.JSON_PROPERTY_PORTFOLIO,
  ResultsModelAnalyticsReturns.JSON_PROPERTY_REFERENCE,
  ResultsModelAnalyticsReturns.JSON_PROPERTY_RELATIVE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ResultsModelAnalyticsReturns implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PORTFOLIO = "portfolio";
  private BigDecimal portfolio;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private BigDecimal reference;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private BigDecimal relative;

  public ResultsModelAnalyticsReturns() { 
  }

  public ResultsModelAnalyticsReturns portfolio(BigDecimal portfolio) {
    this.portfolio = portfolio;
    return this;
  }

   /**
   * Portfolio Return.
   * @return portfolio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Portfolio Return.")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPortfolio() {
    return portfolio;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortfolio(BigDecimal portfolio) {
    this.portfolio = portfolio;
  }


  public ResultsModelAnalyticsReturns reference(BigDecimal reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Benchmark Return.
   * @return reference
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Benchmark Return.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(BigDecimal reference) {
    this.reference = reference;
  }


  public ResultsModelAnalyticsReturns relative(BigDecimal relative) {
    this.relative = relative;
    return this;
  }

   /**
   * Describes portfolio returns in comparison to its benchmark. A positive value indicates excess returns while a negative value indicates underperformance.
   * @return relative
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Describes portfolio returns in comparison to its benchmark. A positive value indicates excess returns while a negative value indicates underperformance.")
  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRelative() {
    return relative;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(BigDecimal relative) {
    this.relative = relative;
  }


  /**
   * Return true if this ResultsModelAnalytics_returns object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsModelAnalyticsReturns resultsModelAnalyticsReturns = (ResultsModelAnalyticsReturns) o;
    return Objects.equals(this.portfolio, resultsModelAnalyticsReturns.portfolio) &&
        Objects.equals(this.reference, resultsModelAnalyticsReturns.reference) &&
        Objects.equals(this.relative, resultsModelAnalyticsReturns.relative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolio, reference, relative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsModelAnalyticsReturns {\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
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

