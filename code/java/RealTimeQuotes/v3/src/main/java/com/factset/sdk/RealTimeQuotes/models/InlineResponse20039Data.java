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
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20039DataLevels;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20039DataType;
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
 * Details of the category system.
 */
@ApiModel(description = "Details of the category system.")
@JsonPropertyOrder({
  InlineResponse20039Data.JSON_PROPERTY_ID,
  InlineResponse20039Data.JSON_PROPERTY_NAME,
  InlineResponse20039Data.JSON_PROPERTY_TYPE,
  InlineResponse20039Data.JSON_PROPERTY_NUMBER_OF_LEVELS,
  InlineResponse20039Data.JSON_PROPERTY_FIRST_LEVEL_WITH_LEAF_CATEGORIES,
  InlineResponse20039Data.JSON_PROPERTY_LEVELS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20039Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<BigDecimal> id = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private InlineResponse20039DataType type;

  public static final String JSON_PROPERTY_NUMBER_OF_LEVELS = "numberOfLevels";
  private JsonNullable<BigDecimal> numberOfLevels = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_FIRST_LEVEL_WITH_LEAF_CATEGORIES = "firstLevelWithLeafCategories";
  private JsonNullable<BigDecimal> firstLevelWithLeafCategories = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_LEVELS = "levels";
  private java.util.List<InlineResponse20039DataLevels> levels = null;

  public InlineResponse20039Data() { 
  }

  public InlineResponse20039Data id(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
    return this;
  }

   /**
   * Identifier of the category system.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the category system.")
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


  public InlineResponse20039Data name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the category system.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the category system.")
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


  public InlineResponse20039Data type(InlineResponse20039DataType type) {
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

  public InlineResponse20039DataType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InlineResponse20039DataType type) {
    this.type = type;
  }


  public InlineResponse20039Data numberOfLevels(BigDecimal numberOfLevels) {
    this.numberOfLevels = JsonNullable.<BigDecimal>of(numberOfLevels);
    return this;
  }

   /**
   * Number of levels of the category system.
   * @return numberOfLevels
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of levels of the category system.")
  @JsonIgnore

  public BigDecimal getNumberOfLevels() {
        return numberOfLevels.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_OF_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getNumberOfLevels_JsonNullable() {
    return numberOfLevels;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_LEVELS)
  public void setNumberOfLevels_JsonNullable(JsonNullable<BigDecimal> numberOfLevels) {
    this.numberOfLevels = numberOfLevels;
  }

  public void setNumberOfLevels(BigDecimal numberOfLevels) {
    this.numberOfLevels = JsonNullable.<BigDecimal>of(numberOfLevels);
  }


  public InlineResponse20039Data firstLevelWithLeafCategories(BigDecimal firstLevelWithLeafCategories) {
    this.firstLevelWithLeafCategories = JsonNullable.<BigDecimal>of(firstLevelWithLeafCategories);
    return this;
  }

   /**
   * Number of the least detailed level of the category system that has leaf categories.
   * @return firstLevelWithLeafCategories
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of the least detailed level of the category system that has leaf categories.")
  @JsonIgnore

  public BigDecimal getFirstLevelWithLeafCategories() {
        return firstLevelWithLeafCategories.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_LEVEL_WITH_LEAF_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getFirstLevelWithLeafCategories_JsonNullable() {
    return firstLevelWithLeafCategories;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_LEVEL_WITH_LEAF_CATEGORIES)
  public void setFirstLevelWithLeafCategories_JsonNullable(JsonNullable<BigDecimal> firstLevelWithLeafCategories) {
    this.firstLevelWithLeafCategories = firstLevelWithLeafCategories;
  }

  public void setFirstLevelWithLeafCategories(BigDecimal firstLevelWithLeafCategories) {
    this.firstLevelWithLeafCategories = JsonNullable.<BigDecimal>of(firstLevelWithLeafCategories);
  }


  public InlineResponse20039Data levels(java.util.List<InlineResponse20039DataLevels> levels) {
    this.levels = levels;
    return this;
  }

  public InlineResponse20039Data addLevelsItem(InlineResponse20039DataLevels levelsItem) {
    if (this.levels == null) {
      this.levels = new java.util.ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * List of category levels ordered by the number of the level in ascending order.
   * @return levels
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of category levels ordered by the number of the level in ascending order.")
  @JsonProperty(JSON_PROPERTY_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20039DataLevels> getLevels() {
    return levels;
  }


  @JsonProperty(JSON_PROPERTY_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevels(java.util.List<InlineResponse20039DataLevels> levels) {
    this.levels = levels;
  }


  /**
   * Return true if this inline_response_200_39_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20039Data inlineResponse20039Data = (InlineResponse20039Data) o;
    return equalsNullable(this.id, inlineResponse20039Data.id) &&
        equalsNullable(this.name, inlineResponse20039Data.name) &&
        Objects.equals(this.type, inlineResponse20039Data.type) &&
        equalsNullable(this.numberOfLevels, inlineResponse20039Data.numberOfLevels) &&
        equalsNullable(this.firstLevelWithLeafCategories, inlineResponse20039Data.firstLevelWithLeafCategories) &&
        Objects.equals(this.levels, inlineResponse20039Data.levels);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(name), type, hashCodeNullable(numberOfLevels), hashCodeNullable(firstLevelWithLeafCategories), levels);
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
    sb.append("class InlineResponse20039Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    numberOfLevels: ").append(toIndentedString(numberOfLevels)).append("\n");
    sb.append("    firstLevelWithLeafCategories: ").append(toIndentedString(firstLevelWithLeafCategories)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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

