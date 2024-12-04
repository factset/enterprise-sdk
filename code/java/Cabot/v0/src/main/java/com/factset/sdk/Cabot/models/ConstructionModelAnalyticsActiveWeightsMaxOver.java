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
 * The greatest observed difference between the portfolio weight and benchmark weight.
 */
@ApiModel(description = "The greatest observed difference between the portfolio weight and benchmark weight.")
@JsonPropertyOrder({
  ConstructionModelAnalyticsActiveWeightsMaxOver.JSON_PROPERTY_LARGE,
  ConstructionModelAnalyticsActiveWeightsMaxOver.JSON_PROPERTY_MEDIUM,
  ConstructionModelAnalyticsActiveWeightsMaxOver.JSON_PROPERTY_SMALL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ConstructionModelAnalyticsActiveWeightsMaxOver implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LARGE = "large";
  private BigDecimal large;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private BigDecimal medium;

  public static final String JSON_PROPERTY_SMALL = "small";
  private BigDecimal small;

  public ConstructionModelAnalyticsActiveWeightsMaxOver() { 
  }

  public ConstructionModelAnalyticsActiveWeightsMaxOver large(BigDecimal large) {
    this.large = large;
    return this;
  }

   /**
   * Get large
   * @return large
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLarge() {
    return large;
  }


  @JsonProperty(JSON_PROPERTY_LARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLarge(BigDecimal large) {
    this.large = large;
  }


  public ConstructionModelAnalyticsActiveWeightsMaxOver medium(BigDecimal medium) {
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMedium() {
    return medium;
  }


  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedium(BigDecimal medium) {
    this.medium = medium;
  }


  public ConstructionModelAnalyticsActiveWeightsMaxOver small(BigDecimal small) {
    this.small = small;
    return this;
  }

   /**
   * Get small
   * @return small
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SMALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSmall() {
    return small;
  }


  @JsonProperty(JSON_PROPERTY_SMALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmall(BigDecimal small) {
    this.small = small;
  }


  /**
   * Return true if this ConstructionModelAnalytics_activeWeights_maxOver object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstructionModelAnalyticsActiveWeightsMaxOver constructionModelAnalyticsActiveWeightsMaxOver = (ConstructionModelAnalyticsActiveWeightsMaxOver) o;
    return Objects.equals(this.large, constructionModelAnalyticsActiveWeightsMaxOver.large) &&
        Objects.equals(this.medium, constructionModelAnalyticsActiveWeightsMaxOver.medium) &&
        Objects.equals(this.small, constructionModelAnalyticsActiveWeightsMaxOver.small);
  }

  @Override
  public int hashCode() {
    return Objects.hash(large, medium, small);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionModelAnalyticsActiveWeightsMaxOver {\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
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

