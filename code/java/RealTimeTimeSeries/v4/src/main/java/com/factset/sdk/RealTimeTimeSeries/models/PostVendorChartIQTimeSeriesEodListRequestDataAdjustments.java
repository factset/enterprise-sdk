/*
 * Real-Time Time Series API
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeTimeSeries.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeTimeSeries.JSON;


/**
 * Adjustments values returned.
 */
@ApiModel(description = "Adjustments values returned.")
@JsonPropertyOrder({
  PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.JSON_PROPERTY_PAYOUT,
  PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.JSON_PROPERTY_SPLIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostVendorChartIQTimeSeriesEodListRequestDataAdjustments implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYOUT = "payout";
  private Boolean payout = false;

  public static final String JSON_PROPERTY_SPLIT = "split";
  private Boolean split = true;

  public PostVendorChartIQTimeSeriesEodListRequestDataAdjustments() { 
  }

  public PostVendorChartIQTimeSeriesEodListRequestDataAdjustments payout(Boolean payout) {
    this.payout = payout;
    return this;
  }

   /**
   * Adjustments are applied for corporate action effects due to dividends, payouts, or other cash disbursements.
   * @return payout
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Adjustments are applied for corporate action effects due to dividends, payouts, or other cash disbursements.")
  @JsonProperty(JSON_PROPERTY_PAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPayout() {
    return payout;
  }


  @JsonProperty(JSON_PROPERTY_PAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayout(Boolean payout) {
    this.payout = payout;
  }


  public PostVendorChartIQTimeSeriesEodListRequestDataAdjustments split(Boolean split) {
    this.split = split;
    return this;
  }

   /**
   * Adjustments are applied for corporate action effects due to the notation having a split, a reverse split, or a similar factor-based corporate action.
   * @return split
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Adjustments are applied for corporate action effects due to the notation having a split, a reverse split, or a similar factor-based corporate action.")
  @JsonProperty(JSON_PROPERTY_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSplit() {
    return split;
  }


  @JsonProperty(JSON_PROPERTY_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplit(Boolean split) {
    this.split = split;
  }


  /**
   * Return true if this PostVendorChartIQTimeSeriesEodListRequest_data_adjustments object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostVendorChartIQTimeSeriesEodListRequestDataAdjustments postVendorChartIQTimeSeriesEodListRequestDataAdjustments = (PostVendorChartIQTimeSeriesEodListRequestDataAdjustments) o;
    return Objects.equals(this.payout, postVendorChartIQTimeSeriesEodListRequestDataAdjustments.payout) &&
        Objects.equals(this.split, postVendorChartIQTimeSeriesEodListRequestDataAdjustments.split);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payout, split);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostVendorChartIQTimeSeriesEodListRequestDataAdjustments {\n");
    sb.append("    payout: ").append(toIndentedString(payout)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
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

