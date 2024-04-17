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
 * Market of the notation.
 */
@ApiModel(description = "Market of the notation.")
@JsonPropertyOrder({
  InlineResponse20088DataMarket.JSON_PROPERTY_ID,
  InlineResponse20088DataMarket.JSON_PROPERTY_IS_OPEN,
  InlineResponse20088DataMarket.JSON_PROPERTY_PHASE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20088DataMarket implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<BigDecimal> id = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_IS_OPEN = "isOpen";
  private JsonNullable<Boolean> isOpen = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PHASE = "phase";
  private JsonNullable<String> phase = JsonNullable.<String>undefined();

  public InlineResponse20088DataMarket() { 
  }

  public InlineResponse20088DataMarket id(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
    return this;
  }

   /**
   * Identifier of the market. See endpoint &#x60;/basic/market/list&#x60; for possible values. 
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the market. See endpoint `/basic/market/list` for possible values. ")
  @JsonIgnore

  public BigDecimal getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<BigDecimal> id) {
    this.id = id;
  }

  public void setId(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
  }


  public InlineResponse20088DataMarket isOpen(Boolean isOpen) {
    this.isOpen = JsonNullable.<Boolean>of(isOpen);
    return this;
  }

   /**
   * Indicates whether the market of the notation is currently open, that is, the current time is between the open and adjusted close of the notation&#39;s market, see endpoint &#x60;/prices/tradingSchedule/event/list&#x60; for the trading schedule of the notation&#39;s market. The adjusted close is later than the official closing time specified by the market and includes the time after closing when trades might still be reported. Breaks such as a lunch break are not considered.
   * @return isOpen
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the market of the notation is currently open, that is, the current time is between the open and adjusted close of the notation's market, see endpoint `/prices/tradingSchedule/event/list` for the trading schedule of the notation's market. The adjusted close is later than the official closing time specified by the market and includes the time after closing when trades might still be reported. Breaks such as a lunch break are not considered.")
  @JsonIgnore

  public Boolean getIsOpen() {
        return isOpen.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsOpen_JsonNullable() {
    return isOpen;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_OPEN)
  public void setIsOpen_JsonNullable(JsonNullable<Boolean> isOpen) {
    this.isOpen = isOpen;
  }

  public void setIsOpen(Boolean isOpen) {
    this.isOpen = JsonNullable.<Boolean>of(isOpen);
  }


  public InlineResponse20088DataMarket phase(String phase) {
    this.phase = JsonNullable.<String>of(phase);
    return this;
  }

   /**
   * Market-specific code of the current market phase.
   * @return phase
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Market-specific code of the current market phase.")
  @JsonIgnore

  public String getPhase() {
        return phase.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhase_JsonNullable() {
    return phase;
  }
  
  @JsonProperty(JSON_PROPERTY_PHASE)
  public void setPhase_JsonNullable(JsonNullable<String> phase) {
    this.phase = phase;
  }

  public void setPhase(String phase) {
    this.phase = JsonNullable.<String>of(phase);
  }


  /**
   * Return true if this inline_response_200_88_data_market object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20088DataMarket inlineResponse20088DataMarket = (InlineResponse20088DataMarket) o;
    return equalsNullable(this.id, inlineResponse20088DataMarket.id) &&
        equalsNullable(this.isOpen, inlineResponse20088DataMarket.isOpen) &&
        equalsNullable(this.phase, inlineResponse20088DataMarket.phase);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(isOpen), hashCodeNullable(phase));
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
    sb.append("class InlineResponse20088DataMarket {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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

