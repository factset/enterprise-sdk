/*
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.
 *
 * The version of the OpenAPI document: 2
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
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.JSON;


/**
 * Subsample data for the notation.
 */
@ApiModel(description = "Subsample data for the notation.")
@JsonPropertyOrder({
  InlineResponse2003Data.JSON_PROPERTY_QUALITY,
  InlineResponse2003Data.JSON_PROPERTY_SUBSAMPLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003Data implements Serializable {
  private static final long serialVersionUID = 1L;

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

  public static final String JSON_PROPERTY_SUBSAMPLE = "subsample";
  private java.util.List<BigDecimal> subsample = null;

  public InlineResponse2003Data() { 
  }

  public InlineResponse2003Data quality(QualityEnum quality) {
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


  public InlineResponse2003Data subsample(java.util.List<BigDecimal> subsample) {
    this.subsample = subsample;
    return this;
  }

  public InlineResponse2003Data addSubsampleItem(BigDecimal subsampleItem) {
    if (this.subsample == null) {
      this.subsample = new java.util.ArrayList<>();
    }
    this.subsample.add(subsampleItem);
    return this;
  }

   /**
   * Single summary record. The record consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60;, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty.
   * @return subsample
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Single summary record. The record consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute `valueUnit` in endpoint `/prices/get`, except for price type yield, where the `valueUnit` is always `percent` (id=258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty.")
  @JsonProperty(JSON_PROPERTY_SUBSAMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<BigDecimal> getSubsample() {
    return subsample;
  }


  @JsonProperty(JSON_PROPERTY_SUBSAMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubsample(java.util.List<BigDecimal> subsample) {
    this.subsample = subsample;
  }


  /**
   * Return true if this inline_response_200_3_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Data inlineResponse2003Data = (InlineResponse2003Data) o;
    return Objects.equals(this.quality, inlineResponse2003Data.quality) &&
        Objects.equals(this.subsample, inlineResponse2003Data.subsample);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quality, subsample);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Data {\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    subsample: ").append(toIndentedString(subsample)).append("\n");
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

