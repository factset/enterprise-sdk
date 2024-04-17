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
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2007DataSubsamples;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse200DataRange;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeTimeSeries.JSON;


/**
 * Subsampled time series data for the notation.
 */
@ApiModel(description = "Subsampled time series data for the notation.")
@JsonPropertyOrder({
  InlineResponse2007Data.JSON_PROPERTY_ID_NOTATION,
  InlineResponse2007Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse2007Data.JSON_PROPERTY_RANGE,
  InlineResponse2007Data.JSON_PROPERTY_QUALITY,
  InlineResponse2007Data.JSON_PROPERTY_SUBSAMPLES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2007Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_NOTATION = "idNotation";
  private JsonNullable<String> idNotation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RANGE = "range";
  private JsonNullable<InlineResponse200DataRange> range = JsonNullable.<InlineResponse200DataRange>undefined();

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
    DLY("DLY"),
    
    EOD("EOD");

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
      return null;
    }
  }

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private JsonNullable<QualityEnum> quality = JsonNullable.<QualityEnum>undefined();

  public static final String JSON_PROPERTY_SUBSAMPLES = "subsamples";
  private java.util.List<InlineResponse2007DataSubsamples> subsamples = null;

  public InlineResponse2007Data() { 
  }

  public InlineResponse2007Data idNotation(String idNotation) {
    this.idNotation = JsonNullable.<String>of(idNotation);
    return this;
  }

   /**
   * MDG identifier of the listing.
   * @return idNotation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MDG identifier of the listing.")
  @JsonIgnore

  public String getIdNotation() {
        return idNotation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdNotation_JsonNullable() {
    return idNotation;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_NOTATION)
  public void setIdNotation_JsonNullable(JsonNullable<String> idNotation) {
    this.idNotation = idNotation;
  }

  public void setIdNotation(String idNotation) {
    this.idNotation = JsonNullable.<String>of(idNotation);
  }


  public InlineResponse2007Data sourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
    return this;
  }

   /**
   * Identifier used in the request.
   * @return sourceIdentifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier used in the request.")
  @JsonIgnore

  public String getSourceIdentifier() {
        return sourceIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSourceIdentifier_JsonNullable() {
    return sourceIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  public void setSourceIdentifier_JsonNullable(JsonNullable<String> sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
  }


  public InlineResponse2007Data range(InlineResponse200DataRange range) {
    this.range = JsonNullable.<InlineResponse200DataRange>of(range);
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse200DataRange getRange() {
        return range.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse200DataRange> getRange_JsonNullable() {
    return range;
  }
  
  @JsonProperty(JSON_PROPERTY_RANGE)
  public void setRange_JsonNullable(JsonNullable<InlineResponse200DataRange> range) {
    this.range = range;
  }

  public void setRange(InlineResponse200DataRange range) {
    this.range = JsonNullable.<InlineResponse200DataRange>of(range);
  }


  public InlineResponse2007Data quality(QualityEnum quality) {
    this.quality = JsonNullable.<QualityEnum>of(quality);
    return this;
  }

   /**
   * Quality of the price.
   * @return quality
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Quality of the price.")
  @JsonIgnore

  public QualityEnum getQuality() {
        return quality.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<QualityEnum> getQuality_JsonNullable() {
    return quality;
  }
  
  @JsonProperty(JSON_PROPERTY_QUALITY)
  public void setQuality_JsonNullable(JsonNullable<QualityEnum> quality) {
    this.quality = quality;
  }

  public void setQuality(QualityEnum quality) {
    this.quality = JsonNullable.<QualityEnum>of(quality);
  }


  public InlineResponse2007Data subsamples(java.util.List<InlineResponse2007DataSubsamples> subsamples) {
    this.subsamples = subsamples;
    return this;
  }

  public InlineResponse2007Data addSubsamplesItem(InlineResponse2007DataSubsamples subsamplesItem) {
    if (this.subsamples == null) {
      this.subsamples = new java.util.ArrayList<>();
    }
    this.subsamples.add(subsamplesItem);
    return this;
  }

   /**
   * List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258).
   * @return subsamples
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of summary records. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).")
  @JsonProperty(JSON_PROPERTY_SUBSAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2007DataSubsamples> getSubsamples() {
    return subsamples;
  }


  @JsonProperty(JSON_PROPERTY_SUBSAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubsamples(java.util.List<InlineResponse2007DataSubsamples> subsamples) {
    this.subsamples = subsamples;
  }


  /**
   * Return true if this inline_response_200_7_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007Data inlineResponse2007Data = (InlineResponse2007Data) o;
    return equalsNullable(this.idNotation, inlineResponse2007Data.idNotation) &&
        equalsNullable(this.sourceIdentifier, inlineResponse2007Data.sourceIdentifier) &&
        equalsNullable(this.range, inlineResponse2007Data.range) &&
        equalsNullable(this.quality, inlineResponse2007Data.quality) &&
        Objects.equals(this.subsamples, inlineResponse2007Data.subsamples);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idNotation), hashCodeNullable(sourceIdentifier), hashCodeNullable(range), hashCodeNullable(quality), subsamples);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007Data {\n");
    sb.append("    idNotation: ").append(toIndentedString(idNotation)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    subsamples: ").append(toIndentedString(subsamples)).append("\n");
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

