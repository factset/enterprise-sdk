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
import com.factset.sdk.Cabot.models.BuyContextModelAnalyticsContextAttribute;
import com.factset.sdk.Cabot.models.BuyContextModelAnalyticsItem;
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
 * BuyContextModelAnalyticsContext
 */
@JsonPropertyOrder({
  BuyContextModelAnalyticsContext.JSON_PROPERTY_ATTRIBUTE,
  BuyContextModelAnalyticsContext.JSON_PROPERTY_COUNT,
  BuyContextModelAnalyticsContext.JSON_PROPERTY_SECTORS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BuyContextModelAnalyticsContext implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private BuyContextModelAnalyticsContextAttribute attribute;

  public static final String JSON_PROPERTY_COUNT = "count";
  private BigDecimal count;

  public static final String JSON_PROPERTY_SECTORS = "sectors";
  private java.util.List<BuyContextModelAnalyticsItem> sectors = null;

  public BuyContextModelAnalyticsContext() { 
  }

  public BuyContextModelAnalyticsContext attribute(BuyContextModelAnalyticsContextAttribute attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuyContextModelAnalyticsContextAttribute getAttribute() {
    return attribute;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttribute(BuyContextModelAnalyticsContextAttribute attribute) {
    this.attribute = attribute;
  }


  public BuyContextModelAnalyticsContext count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(BigDecimal count) {
    this.count = count;
  }


  public BuyContextModelAnalyticsContext sectors(java.util.List<BuyContextModelAnalyticsItem> sectors) {
    this.sectors = sectors;
    return this;
  }

  public BuyContextModelAnalyticsContext addSectorsItem(BuyContextModelAnalyticsItem sectorsItem) {
    if (this.sectors == null) {
      this.sectors = new java.util.ArrayList<>();
    }
    this.sectors.add(sectorsItem);
    return this;
  }

   /**
   * Get sectors
   * @return sectors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<BuyContextModelAnalyticsItem> getSectors() {
    return sectors;
  }


  @JsonProperty(JSON_PROPERTY_SECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSectors(java.util.List<BuyContextModelAnalyticsItem> sectors) {
    this.sectors = sectors;
  }


  /**
   * Return true if this BuyContextModelAnalytics_context object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyContextModelAnalyticsContext buyContextModelAnalyticsContext = (BuyContextModelAnalyticsContext) o;
    return Objects.equals(this.attribute, buyContextModelAnalyticsContext.attribute) &&
        Objects.equals(this.count, buyContextModelAnalyticsContext.count) &&
        Objects.equals(this.sectors, buyContextModelAnalyticsContext.sectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, count, sectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyContextModelAnalyticsContext {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    sectors: ").append(toIndentedString(sectors)).append("\n");
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

