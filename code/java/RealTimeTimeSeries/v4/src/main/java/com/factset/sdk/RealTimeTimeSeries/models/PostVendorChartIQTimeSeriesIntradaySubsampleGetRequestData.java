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
import com.factset.sdk.RealTimeTimeSeries.models.PostVendorChartIQTimeSeriesEodListRequestDataIdentifier;
import com.factset.sdk.RealTimeTimeSeries.models.PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeTimeSeries.JSON;


/**
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.JSON_PROPERTY_IDENTIFIER,
  PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.JSON_PROPERTY_TYPE,
  PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.JSON_PROPERTY_QUALITY,
  PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.JSON_PROPERTY_FROM,
  PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.JSON_PROPERTY_GRANULARITY,
  PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.JSON_PROPERTY_ADJUSTMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private PostVendorChartIQTimeSeriesEodListRequestDataIdentifier identifier;

  /**
   * Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |  
   */
  public enum TypeEnum {
    TRADE("trade"),
    
    BID("bid"),
    
    ASK("ask"),
    
    YIELD("yield");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type = TypeEnum.TRADE;

  /**
   * Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  
   */
  public enum QualityEnum {
    RLT("RLT"),
    
    DLY("DLY"),
    
    BST("BST");

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
  private QualityEnum quality = QualityEnum.DLY;

  public static final String JSON_PROPERTY_FROM = "from";
  private OffsetDateTime from;

  /**
   * Subsample granularities suitable for intraday data. | Value | Description | | --- | --- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |  
   */
  public enum GranularityEnum {
    _1S("1s"),
    
    _5S("5s"),
    
    _10S("10s"),
    
    _30S("30s"),
    
    _1M("1m"),
    
    _5M("5m"),
    
    _10M("10m"),
    
    _15M("15m"),
    
    _30M("30m"),
    
    _1H("1h");

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
  private GranularityEnum granularity = GranularityEnum._1H;

  public static final String JSON_PROPERTY_ADJUSTMENTS = "adjustments";
  private PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments adjustments;

  public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData() { 
  }

  @JsonCreator
  public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData(
    @JsonProperty(value=JSON_PROPERTY_IDENTIFIER, required=true) PostVendorChartIQTimeSeriesEodListRequestDataIdentifier identifier, 
    @JsonProperty(value=JSON_PROPERTY_FROM, required=true) OffsetDateTime from
  ) {
    this();
    this.identifier = identifier;
    this.from = from;
  }

  public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData identifier(PostVendorChartIQTimeSeriesEodListRequestDataIdentifier identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostVendorChartIQTimeSeriesEodListRequestDataIdentifier getIdentifier() {
    return identifier;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentifier(PostVendorChartIQTimeSeriesEodListRequestDataIdentifier identifier) {
    this.identifier = identifier;
  }


  public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |  
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "trade", value = "Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |  ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  
   * @return quality
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "DLY", value = "Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  ")
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


  public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

   /**
   * Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed.
   * @return from
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2024-12-24T18:00Z", required = true, value = "Date and time of the start point of the subsample (inclusive). `from` must be aligned to `granularity`. That is, the numerical value is an integral multiple of the time span value represented by `granularity`. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }


  public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * Subsample granularities suitable for intraday data. | Value | Description | | --- | --- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |  
   * @return granularity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1h", value = "Subsample granularities suitable for intraday data. | Value | Description | | --- | --- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |  ")
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


  public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData adjustments(PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments adjustments) {
    this.adjustments = adjustments;
    return this;
  }

   /**
   * Get adjustments
   * @return adjustments
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADJUSTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments getAdjustments() {
    return adjustments;
  }


  @JsonProperty(JSON_PROPERTY_ADJUSTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdjustments(PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments adjustments) {
    this.adjustments = adjustments;
  }


  /**
   * Return true if this PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData postVendorChartIQTimeSeriesIntradaySubsampleGetRequestData = (PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData) o;
    return Objects.equals(this.identifier, postVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.identifier) &&
        Objects.equals(this.type, postVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.type) &&
        Objects.equals(this.quality, postVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.quality) &&
        Objects.equals(this.from, postVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.from) &&
        Objects.equals(this.granularity, postVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.granularity) &&
        Objects.equals(this.adjustments, postVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.adjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, type, quality, from, granularity, adjustments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
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

