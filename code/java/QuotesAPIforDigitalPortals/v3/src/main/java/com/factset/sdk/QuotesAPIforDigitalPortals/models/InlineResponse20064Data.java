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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20064Ratings;
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * InlineResponse20064Data
 */
@JsonPropertyOrder({
  InlineResponse20064Data.JSON_PROPERTY_ID,
  InlineResponse20064Data.JSON_PROPERTY_RATINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20064Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RATINGS = "ratings";
  private java.util.List<InlineResponse20064Ratings> ratings = null;

  public InlineResponse20064Data() { 
  }

  public InlineResponse20064Data id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of an instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of an instrument.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public InlineResponse20064Data ratings(java.util.List<InlineResponse20064Ratings> ratings) {
    this.ratings = ratings;
    return this;
  }

  public InlineResponse20064Data addRatingsItem(InlineResponse20064Ratings ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new java.util.ArrayList<>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

   /**
   * Rating details. See endpoint &#x60;/rating/system/get&#x60; for details regarding a rating system, endpoint &#x60;/rating/grade/listBySystem&#x60; for all rating grades of a rating system, and endpoint &#x60;/rating/grade/get&#x60; for details regarding a rating grade.
   * @return ratings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rating details. See endpoint `/rating/system/get` for details regarding a rating system, endpoint `/rating/grade/listBySystem` for all rating grades of a rating system, and endpoint `/rating/grade/get` for details regarding a rating grade.")
  @JsonProperty(JSON_PROPERTY_RATINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20064Ratings> getRatings() {
    return ratings;
  }


  @JsonProperty(JSON_PROPERTY_RATINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatings(java.util.List<InlineResponse20064Ratings> ratings) {
    this.ratings = ratings;
  }


  /**
   * Return true if this inline_response_200_64_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20064Data inlineResponse20064Data = (InlineResponse20064Data) o;
    return equalsNullable(this.id, inlineResponse20064Data.id) &&
        Objects.equals(this.ratings, inlineResponse20064Data.ratings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), ratings);
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
    sb.append("class InlineResponse20064Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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

