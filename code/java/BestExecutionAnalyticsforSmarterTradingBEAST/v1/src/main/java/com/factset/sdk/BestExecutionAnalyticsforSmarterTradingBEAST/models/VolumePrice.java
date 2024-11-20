/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.VolumePriceBin;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.VolumePriceMetrics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.JSON;


/**
 * Volume Price data
 */
@ApiModel(description = "Volume Price data")
@JsonPropertyOrder({
  VolumePrice.JSON_PROPERTY_METRICS,
  VolumePrice.JSON_PROPERTY_BINS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VolumePrice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private VolumePriceMetrics metrics;

  public static final String JSON_PROPERTY_BINS = "bins";
  private java.util.List<VolumePriceBin> bins = null;

  public VolumePrice() { 
  }

  public VolumePrice metrics(VolumePriceMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VolumePriceMetrics getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetrics(VolumePriceMetrics metrics) {
    this.metrics = metrics;
  }


  public VolumePrice bins(java.util.List<VolumePriceBin> bins) {
    this.bins = bins;
    return this;
  }

  public VolumePrice addBinsItem(VolumePriceBin binsItem) {
    if (this.bins == null) {
      this.bins = new java.util.ArrayList<>();
    }
    this.bins.add(binsItem);
    return this;
  }

   /**
   * Bin data
   * @return bins
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Bin data")
  @JsonProperty(JSON_PROPERTY_BINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<VolumePriceBin> getBins() {
    return bins;
  }


  @JsonProperty(JSON_PROPERTY_BINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBins(java.util.List<VolumePriceBin> bins) {
    this.bins = bins;
  }


  /**
   * Return true if this VolumePrice object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumePrice volumePrice = (VolumePrice) o;
    return Objects.equals(this.metrics, volumePrice.metrics) &&
        Objects.equals(this.bins, volumePrice.bins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, bins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumePrice {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    bins: ").append(toIndentedString(bins)).append("\n");
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

