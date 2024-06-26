/*
 * ID Lookup API
 * The Factset Identifier Lookup API provides the ability to search for various identifier types based on keyword. The API returns tickers, entity names and other identifiers that Factset supports. In addition, the API offers filters that allows users to refine the results. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IDLookup.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IDLookup.models.FilterParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IDLookup.JSON;


/**
 * LookupObject
 */
@JsonPropertyOrder({
  LookupObject.JSON_PROPERTY_PATTERN,
  LookupObject.JSON_PROPERTY_ENTITIES,
  LookupObject.JSON_PROPERTY_FILTERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LookupObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_ENTITIES = "entities";
  private java.util.List<String> entities = null;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private FilterParams filters;

  public LookupObject() { 
  }

  public LookupObject pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * The string or keyword being searched on. Concurrent searches for multiple patterns is NOT supported 
   * @return pattern
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The string or keyword being searched on. Concurrent searches for multiple patterns is NOT supported ")
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPattern() {
    return pattern;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public LookupObject entities(java.util.List<String> entities) {
    this.entities = entities;
    return this;
  }

  public LookupObject addEntitiesItem(String entitiesItem) {
    if (this.entities == null) {
      this.entities = new java.util.ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Asset class that is being searched against
   * @return entities
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"bonds\"]", value = "Asset class that is being searched against")
  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getEntities() {
    return entities;
  }


  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntities(java.util.List<String> entities) {
    this.entities = entities;
  }


  public LookupObject filters(FilterParams filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilterParams getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(FilterParams filters) {
    this.filters = filters;
  }


  /**
   * Return true if this lookup_object object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupObject lookupObject = (LookupObject) o;
    return Objects.equals(this.pattern, lookupObject.pattern) &&
        Objects.equals(this.entities, lookupObject.entities) &&
        Objects.equals(this.filters, lookupObject.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pattern, entities, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupObject {\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

