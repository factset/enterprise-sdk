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
import com.factset.sdk.IDLookup.models.LookupLimit;
import com.factset.sdk.IDLookup.models.LookupObject;
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
 * Lookup Request comprised of a single lookup object
 */
@ApiModel(description = "Lookup Request comprised of a single lookup object")
@JsonPropertyOrder({
  LookupRequest.JSON_PROPERTY_QUERY,
  LookupRequest.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LookupRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_QUERY = "query";
  private LookupObject query;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private LookupLimit settings;

  public LookupRequest() { 
  }

  public LookupRequest query(LookupObject query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LookupObject getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuery(LookupObject query) {
    this.query = query;
  }


  public LookupRequest settings(LookupLimit settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LookupLimit getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(LookupLimit settings) {
    this.settings = settings;
  }


  /**
   * Return true if this lookup_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupRequest lookupRequest = (LookupRequest) o;
    return Objects.equals(this.query, lookupRequest.query) &&
        Objects.equals(this.settings, lookupRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

