/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

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
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * List of indices of which a stock is a constituent. The list restricts the request to return only those stocks that are a constituent of one of the specified indices.
 */
@ApiModel(description = "List of indices of which a stock is a constituent. The list restricts the request to return only those stocks that are a constituent of one of the specified indices.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataIndexMembership.JSON_PROPERTY_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataIndexMembership implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = null;

  public StockNotationScreenerSearchDataIndexMembership() { 
  }

  public StockNotationScreenerSearchDataIndexMembership ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public StockNotationScreenerSearchDataIndexMembership addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new java.util.ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * List of index instrument identifiers.
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of index instrument identifiers.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_indexMembership object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataIndexMembership stockNotationScreenerSearchDataIndexMembership = (StockNotationScreenerSearchDataIndexMembership) o;
    return Objects.equals(this.ids, stockNotationScreenerSearchDataIndexMembership.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataIndexMembership {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

