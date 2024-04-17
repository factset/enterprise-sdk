/*
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 3.0.0
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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeTimeSeries.JSON;


/**
 * Subsample granularity and number of samples suitable for end-of-day data.
 */
@ApiModel(description = "Subsample granularity and number of samples suitable for end-of-day data.")
@JsonPropertyOrder({
  PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.JSON_PROPERTY_END,
  PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.JSON_PROPERTY_NUMBER,
  PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.JSON_PROPERTY_GRANULARITY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_END = "end";
  private LocalDate end;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private BigDecimal number;

  /**
   * Subsample granularities suitable for end-of-day data.
   */
  public enum GranularityEnum {
    _1D("1d"),
    
    _1W("1w"),
    
    _1M("1m"),
    
    _3M("3m"),
    
    _6M("6m"),
    
    _1Y("1y");

    private String value;

    GranularityEnum(String value) {
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
    public static GranularityEnum fromValue(String value) {
      for (GranularityEnum b : GranularityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GRANULARITY = "granularity";
  private GranularityEnum granularity = GranularityEnum._1W;

  public PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples() { 
  }

  @JsonCreator
  public PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples(
    @JsonProperty(value=JSON_PROPERTY_END, required=true) LocalDate end, 
    @JsonProperty(value=JSON_PROPERTY_NUMBER, required=true) BigDecimal number
  ) {
    this();
    this.end = end;
    this.number = number;
  }

  public PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples end(LocalDate end) {
    this.end = end;
    return this;
  }

   /**
   * Date of the end point of the subsamples (exclusive). &#x60;end&#x60; is limited to the day after the current day.
   * @return end
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date of the end point of the subsamples (exclusive). `end` is limited to the day after the current day.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(LocalDate end) {
    this.end = end;
  }


  public PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples number(BigDecimal number) {
    this.number = number;
    return this;
  }

   /**
   * Number of subsamples returned. The product of &#x60;number&#x60; and &#x60;granularity&#x60; must not extend further into the past than 1900-01-01.
   * minimum: 1
   * maximum: 10000
   * @return number
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of subsamples returned. The product of `number` and `granularity` must not extend further into the past than 1900-01-01.")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumber(BigDecimal number) {
    this.number = number;
  }


  public PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * Subsample granularities suitable for end-of-day data.
   * @return granularity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Subsample granularities suitable for end-of-day data.")
  @JsonProperty(JSON_PROPERTY_GRANULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GranularityEnum getGranularity() {
    return granularity;
  }


  @JsonProperty(JSON_PROPERTY_GRANULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * Return true if this PostVendorChartIQTimeSeriesEodSubsampleListRequest_data_intervalSelection_samples object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples postVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples = (PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples) o;
    return Objects.equals(this.end, postVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.end) &&
        Objects.equals(this.number, postVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.number) &&
        Objects.equals(this.granularity, postVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.granularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, number, granularity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
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

