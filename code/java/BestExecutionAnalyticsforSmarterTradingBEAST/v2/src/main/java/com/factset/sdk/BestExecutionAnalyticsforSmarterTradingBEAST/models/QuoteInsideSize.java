/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
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
 * Quote Inside-Size object
 */
@ApiModel(description = "Quote Inside-Size object")
@JsonPropertyOrder({
  QuoteInsideSize.JSON_PROPERTY_TIME_ZONE_NAME,
  QuoteInsideSize.JSON_PROPERTY_TWAS_BPS,
  QuoteInsideSize.JSON_PROPERTY_TIME_MS,
  QuoteInsideSize.JSON_PROPERTY_TWAS_INSIDE_SIZE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class QuoteInsideSize implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME_ZONE_NAME = "timeZoneName";
  private String timeZoneName;

  public static final String JSON_PROPERTY_TWAS_BPS = "twasBps";
  private Double twasBps;

  public static final String JSON_PROPERTY_TIME_MS = "timeMs";
  private String timeMs;

  public static final String JSON_PROPERTY_TWAS_INSIDE_SIZE = "twasInsideSize";
  private Double twasInsideSize;

  public QuoteInsideSize() { 
  }

  public QuoteInsideSize timeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
    return this;
  }

   /**
   * Timezone name
   * @return timeZoneName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Timezone name")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZoneName() {
    return timeZoneName;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
  }


  public QuoteInsideSize twasBps(Double twasBps) {
    this.twasBps = twasBps;
    return this;
  }

   /**
   * TWasBps
   * @return twasBps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TWasBps")
  @JsonProperty(JSON_PROPERTY_TWAS_BPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTwasBps() {
    return twasBps;
  }


  @JsonProperty(JSON_PROPERTY_TWAS_BPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTwasBps(Double twasBps) {
    this.twasBps = twasBps;
  }


  public QuoteInsideSize timeMs(String timeMs) {
    this.timeMs = timeMs;
    return this;
  }

   /**
   * TimeMs
   * @return timeMs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TimeMs")
  @JsonProperty(JSON_PROPERTY_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeMs() {
    return timeMs;
  }


  @JsonProperty(JSON_PROPERTY_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeMs(String timeMs) {
    this.timeMs = timeMs;
  }


  public QuoteInsideSize twasInsideSize(Double twasInsideSize) {
    this.twasInsideSize = twasInsideSize;
    return this;
  }

   /**
   * TWasInsideSize
   * @return twasInsideSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TWasInsideSize")
  @JsonProperty(JSON_PROPERTY_TWAS_INSIDE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTwasInsideSize() {
    return twasInsideSize;
  }


  @JsonProperty(JSON_PROPERTY_TWAS_INSIDE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTwasInsideSize(Double twasInsideSize) {
    this.twasInsideSize = twasInsideSize;
  }


  /**
   * Return true if this QuoteInsideSize object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteInsideSize quoteInsideSize = (QuoteInsideSize) o;
    return Objects.equals(this.timeZoneName, quoteInsideSize.timeZoneName) &&
        Objects.equals(this.twasBps, quoteInsideSize.twasBps) &&
        Objects.equals(this.timeMs, quoteInsideSize.timeMs) &&
        Objects.equals(this.twasInsideSize, quoteInsideSize.twasInsideSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZoneName, twasBps, timeMs, twasInsideSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteInsideSize {\n");
    sb.append("    timeZoneName: ").append(toIndentedString(timeZoneName)).append("\n");
    sb.append("    twasBps: ").append(toIndentedString(twasBps)).append("\n");
    sb.append("    timeMs: ").append(toIndentedString(timeMs)).append("\n");
    sb.append("    twasInsideSize: ").append(toIndentedString(twasInsideSize)).append("\n");
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

