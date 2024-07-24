/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.15.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.PAEngine.JSON;


/**
 * UnlinkedPATemplateColumnDetails
 */
@JsonPropertyOrder({
  UnlinkedPATemplateColumnDetails.JSON_PROPERTY_NAME,
  UnlinkedPATemplateColumnDetails.JSON_PROPERTY_ID,
  UnlinkedPATemplateColumnDetails.JSON_PROPERTY_STATISTICS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UnlinkedPATemplateColumnDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATISTICS = "statistics";
  private JsonNullable<java.util.List<String>> statistics = JsonNullable.<java.util.List<String>>undefined();

  public UnlinkedPATemplateColumnDetails() { 
  }

  public UnlinkedPATemplateColumnDetails name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Unlinked template column name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unlinked template column name")
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


  public UnlinkedPATemplateColumnDetails id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * FactSet-defined or User-defined Column identifier.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FactSet-defined or User-defined Column identifier.")
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


  public UnlinkedPATemplateColumnDetails statistics(java.util.List<String> statistics) {
    this.statistics = JsonNullable.<java.util.List<String>>of(statistics);
    return this;
  }

  public UnlinkedPATemplateColumnDetails addStatisticsItem(String statisticsItem) {
    if (this.statistics == null || !this.statistics.isPresent()) {
      this.statistics = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.statistics.get().add(statisticsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Column Statistic identifier
   * @return statistics
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Column Statistic identifier")
  @JsonIgnore

  public java.util.List<String> getStatistics() {
        return statistics.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getStatistics_JsonNullable() {
    return statistics;
  }
  
  @JsonProperty(JSON_PROPERTY_STATISTICS)
  public void setStatistics_JsonNullable(JsonNullable<java.util.List<String>> statistics) {
    this.statistics = statistics;
  }

  public void setStatistics(java.util.List<String> statistics) {
    this.statistics = JsonNullable.<java.util.List<String>>of(statistics);
  }


  /**
   * Return true if this UnlinkedPATemplateColumnDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnlinkedPATemplateColumnDetails unlinkedPATemplateColumnDetails = (UnlinkedPATemplateColumnDetails) o;
    return equalsNullable(this.name, unlinkedPATemplateColumnDetails.name) &&
        equalsNullable(this.id, unlinkedPATemplateColumnDetails.id) &&
        equalsNullable(this.statistics, unlinkedPATemplateColumnDetails.statistics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(id), hashCodeNullable(statistics));
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
    sb.append("class UnlinkedPATemplateColumnDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

