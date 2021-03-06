/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.TimeSeriesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2004DataRange;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2008DataPrices;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.JSON;


/**
 * Time series data for the notation.
 */
@ApiModel(description = "Time series data for the notation.")
@JsonPropertyOrder({
  InlineResponse2008Data.JSON_PROPERTY_RANGE,
  InlineResponse2008Data.JSON_PROPERTY_QUALITY,
  InlineResponse2008Data.JSON_PROPERTY_PRICES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2008Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RANGE = "range";
  private InlineResponse2004DataRange range;

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
    RLT("RLT"),
    
    DLY("DLY");

    private String value;

    QualityEnum(String value) {
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
    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private QualityEnum quality;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private java.util.List<InlineResponse2008DataPrices> prices = null;

  public InlineResponse2008Data() { 
  }

  public InlineResponse2008Data range(InlineResponse2004DataRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004DataRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(InlineResponse2004DataRange range) {
    this.range = range;
  }


  public InlineResponse2008Data quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Quality of the price.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quality of the price.")
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QualityEnum getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }


  public InlineResponse2008Data prices(java.util.List<InlineResponse2008DataPrices> prices) {
    this.prices = prices;
    return this;
  }

  public InlineResponse2008Data addPricesItem(InlineResponse2008DataPrices pricesItem) {
    if (this.prices == null) {
      this.prices = new java.util.ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Time series of prices.
   * @return prices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time series of prices.")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2008DataPrices> getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(java.util.List<InlineResponse2008DataPrices> prices) {
    this.prices = prices;
  }


  /**
   * Return true if this inline_response_200_8_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Data inlineResponse2008Data = (InlineResponse2008Data) o;
    return Objects.equals(this.range, inlineResponse2008Data.range) &&
        Objects.equals(this.quality, inlineResponse2008Data.quality) &&
        Objects.equals(this.prices, inlineResponse2008Data.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, quality, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Data {\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

