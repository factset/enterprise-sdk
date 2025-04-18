/*
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetGlobalPrices.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetGlobalPrices.models.Distribution;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetGlobalPrices.JSON;


/**
 * StockDistributionsResponse
 */
@JsonPropertyOrder({
  StockDistributionsResponse.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StockDistributionsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<Distribution> data = null;

  public StockDistributionsResponse() { 
  }

  public StockDistributionsResponse data(java.util.List<Distribution> data) {
    this.data = data;
    return this;
  }

  public StockDistributionsResponse addDataItem(Distribution dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Array of Distribution Objects
   * @return data
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Array of Distribution Objects")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Distribution> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(java.util.List<Distribution> data) {
    this.data = data;
  }


  /**
   * Return true if this StockDistributionsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockDistributionsResponse stockDistributionsResponse = (StockDistributionsResponse) o;
    return Objects.equals(this.data, stockDistributionsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockDistributionsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

