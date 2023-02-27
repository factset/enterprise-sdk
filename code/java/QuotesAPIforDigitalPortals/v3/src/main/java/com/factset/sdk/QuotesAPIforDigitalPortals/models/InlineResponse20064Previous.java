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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Previous rating.
 */
@ApiModel(description = "Previous rating.")
@JsonPropertyOrder({
  InlineResponse20064Previous.JSON_PROPERTY_ID,
  InlineResponse20064Previous.JSON_PROPERTY_GRADE,
  InlineResponse20064Previous.JSON_PROPERTY_RANK,
  InlineResponse20064Previous.JSON_PROPERTY_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20064Previous implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<BigDecimal> id = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_GRADE = "grade";
  private JsonNullable<String> grade = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RANK = "rank";
  private JsonNullable<BigDecimal> rank = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public InlineResponse20064Previous() { 
  }

  public InlineResponse20064Previous id(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
    return this;
  }

   /**
   * Identifier of the rating grade.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the rating grade.")
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


  public InlineResponse20064Previous grade(String grade) {
    this.grade = JsonNullable.<String>of(grade);
    return this;
  }

   /**
   * Rating grade.
   * @return grade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rating grade.")
  @JsonIgnore

  public String getGrade() {
        return grade.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGrade_JsonNullable() {
    return grade;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADE)
  public void setGrade_JsonNullable(JsonNullable<String> grade) {
    this.grade = grade;
  }

  public void setGrade(String grade) {
    this.grade = JsonNullable.<String>of(grade);
  }


  public InlineResponse20064Previous rank(BigDecimal rank) {
    this.rank = JsonNullable.<BigDecimal>of(rank);
    return this;
  }

   /**
   * Rank of the rating grade according to the sort order of the rating system.
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rank of the rating grade according to the sort order of the rating system.")
  @JsonIgnore

  public BigDecimal getRank() {
        return rank.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getRank_JsonNullable() {
    return rank;
  }
  
  @JsonProperty(JSON_PROPERTY_RANK)
  public void setRank_JsonNullable(JsonNullable<BigDecimal> rank) {
    this.rank = rank;
  }

  public void setRank(BigDecimal rank) {
    this.rank = JsonNullable.<BigDecimal>of(rank);
  }


  public InlineResponse20064Previous date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * Date on which the instrument was rated.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date on which the instrument was rated.")
  @JsonIgnore

  public LocalDate getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<LocalDate> date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
  }


  /**
   * Return true if this inline_response_200_64_previous object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20064Previous inlineResponse20064Previous = (InlineResponse20064Previous) o;
    return equalsNullable(this.id, inlineResponse20064Previous.id) &&
        equalsNullable(this.grade, inlineResponse20064Previous.grade) &&
        equalsNullable(this.rank, inlineResponse20064Previous.rank) &&
        equalsNullable(this.date, inlineResponse20064Previous.date);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(grade), hashCodeNullable(rank), hashCodeNullable(date));
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
    sb.append("class InlineResponse20064Previous {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
