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
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20085Country;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20085Group;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20085Timezone;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20085Type;
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
 * InlineResponse20085Data
 */
@JsonPropertyOrder({
  InlineResponse20085Data.JSON_PROPERTY_ID,
  InlineResponse20085Data.JSON_PROPERTY_NAME,
  InlineResponse20085Data.JSON_PROPERTY_SHORT_NAME,
  InlineResponse20085Data.JSON_PROPERTY_COUNTRY,
  InlineResponse20085Data.JSON_PROPERTY_TYPE,
  InlineResponse20085Data.JSON_PROPERTY_GROUP,
  InlineResponse20085Data.JSON_PROPERTY_TIMEZONE,
  InlineResponse20085Data.JSON_PROPERTY_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20085Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<BigDecimal> id = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private JsonNullable<String> shortName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private InlineResponse20085Country country;

  public static final String JSON_PROPERTY_TYPE = "type";
  private InlineResponse20085Type type;

  public static final String JSON_PROPERTY_GROUP = "group";
  private InlineResponse20085Group group;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private InlineResponse20085Timezone timezone;

  public static final String JSON_PROPERTY_COUNT = "count";
  private JsonNullable<BigDecimal> count = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20085Data() { 
  }

  public InlineResponse20085Data id(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
    return this;
  }

   /**
   * Identifier of a market.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a market.")
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


  public InlineResponse20085Data name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the market.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the market.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public InlineResponse20085Data shortName(String shortName) {
    this.shortName = JsonNullable.<String>of(shortName);
    return this;
  }

   /**
   * Short name of the market.
   * @return shortName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Short name of the market.")
  @JsonIgnore

  public String getShortName() {
        return shortName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getShortName_JsonNullable() {
    return shortName;
  }
  
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  public void setShortName_JsonNullable(JsonNullable<String> shortName) {
    this.shortName = shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = JsonNullable.<String>of(shortName);
  }


  public InlineResponse20085Data country(InlineResponse20085Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20085Country getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(InlineResponse20085Country country) {
    this.country = country;
  }


  public InlineResponse20085Data type(InlineResponse20085Type type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20085Type getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InlineResponse20085Type type) {
    this.type = type;
  }


  public InlineResponse20085Data group(InlineResponse20085Group group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20085Group getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(InlineResponse20085Group group) {
    this.group = group;
  }


  public InlineResponse20085Data timezone(InlineResponse20085Timezone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20085Timezone getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(InlineResponse20085Timezone timezone) {
    this.timezone = timezone;
  }


  public InlineResponse20085Data count(BigDecimal count) {
    this.count = JsonNullable.<BigDecimal>of(count);
    return this;
  }

   /**
   * Number of entitled notations.
   * @return count
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of entitled notations.")
  @JsonIgnore

  public BigDecimal getCount() {
        return count.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getCount_JsonNullable() {
    return count;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNT)
  public void setCount_JsonNullable(JsonNullable<BigDecimal> count) {
    this.count = count;
  }

  public void setCount(BigDecimal count) {
    this.count = JsonNullable.<BigDecimal>of(count);
  }


  /**
   * Return true if this inline_response_200_85_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20085Data inlineResponse20085Data = (InlineResponse20085Data) o;
    return equalsNullable(this.id, inlineResponse20085Data.id) &&
        equalsNullable(this.name, inlineResponse20085Data.name) &&
        equalsNullable(this.shortName, inlineResponse20085Data.shortName) &&
        Objects.equals(this.country, inlineResponse20085Data.country) &&
        Objects.equals(this.type, inlineResponse20085Data.type) &&
        Objects.equals(this.group, inlineResponse20085Data.group) &&
        Objects.equals(this.timezone, inlineResponse20085Data.timezone) &&
        equalsNullable(this.count, inlineResponse20085Data.count);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(name), hashCodeNullable(shortName), country, type, group, timezone, hashCodeNullable(count));
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
    sb.append("class InlineResponse20085Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

