/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Performance of the most recent price calculated against the latest price which has occurred before the start of the most recent trading day.
 */
@ApiModel(description = "Performance of the most recent price calculated against the latest price which has occurred before the start of the most recent trading day.")
@JsonPropertyOrder({
  InlineResponse20089DataLatestPerformanceIntraday.JSON_PROPERTY_ABSOLUTE,
  InlineResponse20089DataLatestPerformanceIntraday.JSON_PROPERTY_RELATIVE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20089DataLatestPerformanceIntraday implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private JsonNullable<BigDecimal> absolute = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private JsonNullable<BigDecimal> relative = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20089DataLatestPerformanceIntraday() { 
  }

  public InlineResponse20089DataLatestPerformanceIntraday absolute(BigDecimal absolute) {
    this.absolute = JsonNullable.<BigDecimal>of(absolute);
    return this;
  }

   /**
   * Absolute value. See attribute &#x60;valueUnit&#x60; for its unit.
   * @return absolute
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Absolute value. See attribute `valueUnit` for its unit.")
  @JsonIgnore

  public BigDecimal getAbsolute() {
        return absolute.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getAbsolute_JsonNullable() {
    return absolute;
  }
  
  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  public void setAbsolute_JsonNullable(JsonNullable<BigDecimal> absolute) {
    this.absolute = absolute;
  }

  public void setAbsolute(BigDecimal absolute) {
    this.absolute = JsonNullable.<BigDecimal>of(absolute);
  }


  public InlineResponse20089DataLatestPerformanceIntraday relative(BigDecimal relative) {
    this.relative = JsonNullable.<BigDecimal>of(relative);
    return this;
  }

   /**
   * Relative value.
   * @return relative
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Relative value.")
  @JsonIgnore

  public BigDecimal getRelative() {
        return relative.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getRelative_JsonNullable() {
    return relative;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATIVE)
  public void setRelative_JsonNullable(JsonNullable<BigDecimal> relative) {
    this.relative = relative;
  }

  public void setRelative(BigDecimal relative) {
    this.relative = JsonNullable.<BigDecimal>of(relative);
  }


  /**
   * Return true if this inline_response_200_89_data_latest_performance_intraday object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20089DataLatestPerformanceIntraday inlineResponse20089DataLatestPerformanceIntraday = (InlineResponse20089DataLatestPerformanceIntraday) o;
    return equalsNullable(this.absolute, inlineResponse20089DataLatestPerformanceIntraday.absolute) &&
        equalsNullable(this.relative, inlineResponse20089DataLatestPerformanceIntraday.relative);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(absolute), hashCodeNullable(relative));
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
    sb.append("class InlineResponse20089DataLatestPerformanceIntraday {\n");
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
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

