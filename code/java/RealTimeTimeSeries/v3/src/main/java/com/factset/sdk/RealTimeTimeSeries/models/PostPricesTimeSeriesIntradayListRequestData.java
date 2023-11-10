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
import com.factset.sdk.RealTimeTimeSeries.models.PostPricesTimeSeriesIntradayListRequestDataRange;
import com.factset.sdk.RealTimeTimeSeries.models.PostVendorChartIQTimeSeriesEodListRequestDataIdentifier;
import com.factset.sdk.RealTimeTimeSeries.models.PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PostPricesTimeSeriesIntradayListRequestData.JSON_PROPERTY_IDENTIFIER,
  PostPricesTimeSeriesIntradayListRequestData.JSON_PROPERTY_TYPE,
  PostPricesTimeSeriesIntradayListRequestData.JSON_PROPERTY_QUALITY,
  PostPricesTimeSeriesIntradayListRequestData.JSON_PROPERTY_RANGE,
  PostPricesTimeSeriesIntradayListRequestData.JSON_PROPERTY_NEWEST_FIRST,
  PostPricesTimeSeriesIntradayListRequestData.JSON_PROPERTY_APPLY_TICK_CORRECTIONS,
  PostPricesTimeSeriesIntradayListRequestData.JSON_PROPERTY_INCLUDE_VOLUME_ONLY_TICKS,
  PostPricesTimeSeriesIntradayListRequestData.JSON_PROPERTY_ADJUSTMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostPricesTimeSeriesIntradayListRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private PostVendorChartIQTimeSeriesEodListRequestDataIdentifier identifier;

  /**
   * Type of the price as configured for the customer.
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
   * Quality of the price.
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

  public static final String JSON_PROPERTY_RANGE = "range";
  private PostPricesTimeSeriesIntradayListRequestDataRange range;

  public static final String JSON_PROPERTY_NEWEST_FIRST = "newestFirst";
  private Boolean newestFirst = false;

  /**
   * This attribute represents the choice whether to apply insert, update, and delete corrections for individual ticks sent by the exchange or devised by FactSet Digital Solutions GmbH.   If the exchange or FactSet Digital Solutions GmbH decides to correct data, a correction instruction tick is sent shortly (usually on the same trading day) after dissemination of the corresponding original tick (if any). The correction instruction is then applied, yielding a corrected view. For \&quot;insert\&quot; corrections, there is no original tick, and the corrected view contains the inserted tick. For \&quot;update\&quot; corrections, the corrected view contains the updated original tick. For \&quot;delete\&quot; corrections, the original tick is removed from the corrected view.
   */
  public enum ApplyTickCorrectionsEnum {
    NONE("none"),
    
    ALL("all");

    private String value;

    ApplyTickCorrectionsEnum(String value) {
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
    public static ApplyTickCorrectionsEnum fromValue(String value) {
      for (ApplyTickCorrectionsEnum b : ApplyTickCorrectionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_APPLY_TICK_CORRECTIONS = "applyTickCorrections";
  private ApplyTickCorrectionsEnum applyTickCorrections = ApplyTickCorrectionsEnum.NONE;

  public static final String JSON_PROPERTY_INCLUDE_VOLUME_ONLY_TICKS = "includeVolumeOnlyTicks";
  private Boolean includeVolumeOnlyTicks = false;

  public static final String JSON_PROPERTY_ADJUSTMENTS = "adjustments";
  private PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments adjustments;

  public PostPricesTimeSeriesIntradayListRequestData() { 
  }

  @JsonCreator
  public PostPricesTimeSeriesIntradayListRequestData(
    @JsonProperty(value=JSON_PROPERTY_IDENTIFIER, required=true) PostVendorChartIQTimeSeriesEodListRequestDataIdentifier identifier, 
    @JsonProperty(value=JSON_PROPERTY_RANGE, required=true) PostPricesTimeSeriesIntradayListRequestDataRange range
  ) {
    this();
    this.identifier = identifier;
    this.range = range;
  }

  public PostPricesTimeSeriesIntradayListRequestData identifier(PostVendorChartIQTimeSeriesEodListRequestDataIdentifier identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nonnull
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


  public PostPricesTimeSeriesIntradayListRequestData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the price as configured for the customer.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the price as configured for the customer.")
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


  public PostPricesTimeSeriesIntradayListRequestData quality(QualityEnum quality) {
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


  public PostPricesTimeSeriesIntradayListRequestData range(PostPricesTimeSeriesIntradayListRequestDataRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostPricesTimeSeriesIntradayListRequestDataRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRange(PostPricesTimeSeriesIntradayListRequestDataRange range) {
    this.range = range;
  }


  public PostPricesTimeSeriesIntradayListRequestData newestFirst(Boolean newestFirst) {
    this.newestFirst = newestFirst;
    return this;
  }

   /**
   * Deliver the chronological last part of the requested data first.
   * @return newestFirst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deliver the chronological last part of the requested data first.")
  @JsonProperty(JSON_PROPERTY_NEWEST_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNewestFirst() {
    return newestFirst;
  }


  @JsonProperty(JSON_PROPERTY_NEWEST_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewestFirst(Boolean newestFirst) {
    this.newestFirst = newestFirst;
  }


  public PostPricesTimeSeriesIntradayListRequestData applyTickCorrections(ApplyTickCorrectionsEnum applyTickCorrections) {
    this.applyTickCorrections = applyTickCorrections;
    return this;
  }

   /**
   * This attribute represents the choice whether to apply insert, update, and delete corrections for individual ticks sent by the exchange or devised by FactSet Digital Solutions GmbH.   If the exchange or FactSet Digital Solutions GmbH decides to correct data, a correction instruction tick is sent shortly (usually on the same trading day) after dissemination of the corresponding original tick (if any). The correction instruction is then applied, yielding a corrected view. For \&quot;insert\&quot; corrections, there is no original tick, and the corrected view contains the inserted tick. For \&quot;update\&quot; corrections, the corrected view contains the updated original tick. For \&quot;delete\&quot; corrections, the original tick is removed from the corrected view.
   * @return applyTickCorrections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This attribute represents the choice whether to apply insert, update, and delete corrections for individual ticks sent by the exchange or devised by FactSet Digital Solutions GmbH.   If the exchange or FactSet Digital Solutions GmbH decides to correct data, a correction instruction tick is sent shortly (usually on the same trading day) after dissemination of the corresponding original tick (if any). The correction instruction is then applied, yielding a corrected view. For \"insert\" corrections, there is no original tick, and the corrected view contains the inserted tick. For \"update\" corrections, the corrected view contains the updated original tick. For \"delete\" corrections, the original tick is removed from the corrected view.")
  @JsonProperty(JSON_PROPERTY_APPLY_TICK_CORRECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplyTickCorrectionsEnum getApplyTickCorrections() {
    return applyTickCorrections;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_TICK_CORRECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplyTickCorrections(ApplyTickCorrectionsEnum applyTickCorrections) {
    this.applyTickCorrections = applyTickCorrections;
  }


  public PostPricesTimeSeriesIntradayListRequestData includeVolumeOnlyTicks(Boolean includeVolumeOnlyTicks) {
    this.includeVolumeOnlyTicks = includeVolumeOnlyTicks;
    return this;
  }

   /**
   * Include ticks that contain a volume without a price.
   * @return includeVolumeOnlyTicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include ticks that contain a volume without a price.")
  @JsonProperty(JSON_PROPERTY_INCLUDE_VOLUME_ONLY_TICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeVolumeOnlyTicks() {
    return includeVolumeOnlyTicks;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_VOLUME_ONLY_TICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeVolumeOnlyTicks(Boolean includeVolumeOnlyTicks) {
    this.includeVolumeOnlyTicks = includeVolumeOnlyTicks;
  }


  public PostPricesTimeSeriesIntradayListRequestData adjustments(PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments adjustments) {
    this.adjustments = adjustments;
    return this;
  }

   /**
   * Get adjustments
   * @return adjustments
  **/
  @javax.annotation.Nullable
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
   * Return true if this PostPricesTimeSeriesIntradayListRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPricesTimeSeriesIntradayListRequestData postPricesTimeSeriesIntradayListRequestData = (PostPricesTimeSeriesIntradayListRequestData) o;
    return Objects.equals(this.identifier, postPricesTimeSeriesIntradayListRequestData.identifier) &&
        Objects.equals(this.type, postPricesTimeSeriesIntradayListRequestData.type) &&
        Objects.equals(this.quality, postPricesTimeSeriesIntradayListRequestData.quality) &&
        Objects.equals(this.range, postPricesTimeSeriesIntradayListRequestData.range) &&
        Objects.equals(this.newestFirst, postPricesTimeSeriesIntradayListRequestData.newestFirst) &&
        Objects.equals(this.applyTickCorrections, postPricesTimeSeriesIntradayListRequestData.applyTickCorrections) &&
        Objects.equals(this.includeVolumeOnlyTicks, postPricesTimeSeriesIntradayListRequestData.includeVolumeOnlyTicks) &&
        Objects.equals(this.adjustments, postPricesTimeSeriesIntradayListRequestData.adjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, type, quality, range, newestFirst, applyTickCorrections, includeVolumeOnlyTicks, adjustments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPricesTimeSeriesIntradayListRequestData {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    newestFirst: ").append(toIndentedString(newestFirst)).append("\n");
    sb.append("    applyTickCorrections: ").append(toIndentedString(applyTickCorrections)).append("\n");
    sb.append("    includeVolumeOnlyTicks: ").append(toIndentedString(includeVolumeOnlyTicks)).append("\n");
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
