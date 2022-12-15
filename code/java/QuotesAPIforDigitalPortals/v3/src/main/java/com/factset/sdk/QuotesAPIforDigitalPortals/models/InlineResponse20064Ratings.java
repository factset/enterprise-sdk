/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20064Current;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20064Previous;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20064System;
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * InlineResponse20064Ratings
 */
@JsonPropertyOrder({
  InlineResponse20064Ratings.JSON_PROPERTY_SYSTEM,
  InlineResponse20064Ratings.JSON_PROPERTY_CURRENT,
  InlineResponse20064Ratings.JSON_PROPERTY_PREVIOUS,
  InlineResponse20064Ratings.JSON_PROPERTY_CHANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20064Ratings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SYSTEM = "system";
  private InlineResponse20064System system;

  public static final String JSON_PROPERTY_CURRENT = "current";
  private InlineResponse20064Current current;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private InlineResponse20064Previous previous;

  public static final String JSON_PROPERTY_CHANGE = "change";
  private JsonNullable<BigDecimal> change = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20064Ratings() { 
  }

  public InlineResponse20064Ratings system(InlineResponse20064System system) {
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20064System getSystem() {
    return system;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystem(InlineResponse20064System system) {
    this.system = system;
  }


  public InlineResponse20064Ratings current(InlineResponse20064Current current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20064Current getCurrent() {
    return current;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrent(InlineResponse20064Current current) {
    this.current = current;
  }


  public InlineResponse20064Ratings previous(InlineResponse20064Previous previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20064Previous getPrevious() {
    return previous;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrevious(InlineResponse20064Previous previous) {
    this.previous = previous;
  }


  public InlineResponse20064Ratings change(BigDecimal change) {
    this.change = JsonNullable.<BigDecimal>of(change);
    return this;
  }

   /**
   * Rating grade change which is the difference between the rank of the current rating and the rank of the previous rating. Example: If a rating system has AAA, AA, A, B, C, D as possible ratings (from best to worst), then a change from AA to B is represented as -2 and a change from C to AAA is represented as +4.
   * @return change
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rating grade change which is the difference between the rank of the current rating and the rank of the previous rating. Example: If a rating system has AAA, AA, A, B, C, D as possible ratings (from best to worst), then a change from AA to B is represented as -2 and a change from C to AAA is represented as +4.")
  @JsonIgnore

  public BigDecimal getChange() {
        return change.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getChange_JsonNullable() {
    return change;
  }
  
  @JsonProperty(JSON_PROPERTY_CHANGE)
  public void setChange_JsonNullable(JsonNullable<BigDecimal> change) {
    this.change = change;
  }

  public void setChange(BigDecimal change) {
    this.change = JsonNullable.<BigDecimal>of(change);
  }


  /**
   * Return true if this inline_response_200_64_ratings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20064Ratings inlineResponse20064Ratings = (InlineResponse20064Ratings) o;
    return Objects.equals(this.system, inlineResponse20064Ratings.system) &&
        Objects.equals(this.current, inlineResponse20064Ratings.current) &&
        Objects.equals(this.previous, inlineResponse20064Ratings.previous) &&
        equalsNullable(this.change, inlineResponse20064Ratings.change);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(system, current, previous, hashCodeNullable(change));
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
    sb.append("class InlineResponse20064Ratings {\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
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

