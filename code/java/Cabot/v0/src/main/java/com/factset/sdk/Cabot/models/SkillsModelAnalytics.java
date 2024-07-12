/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.1.0
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
 * SkillsModelAnalytics
 */
@JsonPropertyOrder({
  SkillsModelAnalytics.JSON_PROPERTY_BUY,
  SkillsModelAnalytics.JSON_PROPERTY_SELL,
  SkillsModelAnalytics.JSON_PROPERTY_SIZING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SkillsModelAnalytics implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BUY = "buy";
  private BigDecimal buy;

  public static final String JSON_PROPERTY_SELL = "sell";
  private BigDecimal sell;

  public static final String JSON_PROPERTY_SIZING = "sizing";
  private BigDecimal sizing;

  public SkillsModelAnalytics() { 
  }

  public SkillsModelAnalytics buy(BigDecimal buy) {
    this.buy = buy;
    return this;
  }

   /**
   * This measures effectiveness in name selection.
   * @return buy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This measures effectiveness in name selection.")
  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBuy() {
    return buy;
  }


  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuy(BigDecimal buy) {
    this.buy = buy;
  }


  public SkillsModelAnalytics sell(BigDecimal sell) {
    this.sell = sell;
    return this;
  }

   /**
   * This quantifies the effectiveness of the sell discipline (final sells). It considers the impact from selling younger positions (i.e., too quickly, too slowly, done well) and from selling older positions (i.e., too quickly, too slowly, done well).
   * @return sell
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This quantifies the effectiveness of the sell discipline (final sells). It considers the impact from selling younger positions (i.e., too quickly, too slowly, done well) and from selling older positions (i.e., too quickly, too slowly, done well).")
  @JsonProperty(JSON_PROPERTY_SELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSell() {
    return sell;
  }


  @JsonProperty(JSON_PROPERTY_SELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSell(BigDecimal sell) {
    this.sell = sell;
  }


  public SkillsModelAnalytics sizing(BigDecimal sizing) {
    this.sizing = sizing;
    return this;
  }

   /**
   * This quantifies the benefit of active sizing decisions including initial position build up and subsequent trims and adds.
   * @return sizing
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This quantifies the benefit of active sizing decisions including initial position build up and subsequent trims and adds.")
  @JsonProperty(JSON_PROPERTY_SIZING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSizing() {
    return sizing;
  }


  @JsonProperty(JSON_PROPERTY_SIZING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSizing(BigDecimal sizing) {
    this.sizing = sizing;
  }


  /**
   * Return true if this SkillsModelAnalytics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillsModelAnalytics skillsModelAnalytics = (SkillsModelAnalytics) o;
    return Objects.equals(this.buy, skillsModelAnalytics.buy) &&
        Objects.equals(this.sell, skillsModelAnalytics.sell) &&
        Objects.equals(this.sizing, skillsModelAnalytics.sizing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buy, sell, sizing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillsModelAnalytics {\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
    sb.append("    sizing: ").append(toIndentedString(sizing)).append("\n");
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

