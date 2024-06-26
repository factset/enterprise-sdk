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
 * ResponseDetails
 */
@JsonPropertyOrder({
  ResponseDetails.JSON_PROPERTY_INDEX,
  ResponseDetails.JSON_PROPERTY_SYMBOL,
  ResponseDetails.JSON_PROPERTY_NAME,
  ResponseDetails.JSON_PROPERTY_ENTITY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ResponseDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENTITY_ID = "entity_id";
  private String entityId;

  public ResponseDetails() { 
  }

  public ResponseDetails index(String index) {
    this.index = index;
    return this;
  }

   /**
   * Type of Asset Class
   * @return index
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "equities", value = "Type of Asset Class")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(String index) {
    this.index = index;
  }


  public ResponseDetails symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol is the only value that should be passed back to any FactSet services to retrieve data 
   * @return symbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FDS-US", value = "Symbol is the only value that should be passed back to any FactSet services to retrieve data ")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public ResponseDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the related entity
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Factset Research Systems Inc", value = "Name of the related entity")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ResponseDetails entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Displays Entity ID&#39;s for public companies and only if the asset class is equities 
   * @return entityId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "00BDWZ-E", value = "Displays Entity ID's for public companies and only if the asset class is equities ")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  /**
   * Return true if this response_details object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDetails responseDetails = (ResponseDetails) o;
    return Objects.equals(this.index, responseDetails.index) &&
        Objects.equals(this.symbol, responseDetails.symbol) &&
        Objects.equals(this.name, responseDetails.name) &&
        Objects.equals(this.entityId, responseDetails.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, symbol, name, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDetails {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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

