/*
 * Foreign Exchange Rates API
 * Foreign Exchange Rates API in which retrieves Spots and Forwards for a given currency pair and date range. <p>*Spots and Forwards rates are sourced from W/M Reuters.The WM Company calculates daily standardized spot rates for global foreign exchange transactions, using rates provided by Reuters. These rates are recognized globally as the standard by banks, fund managers, and index compilers; increasingly these rates are also being used for benchmark currency trading. In 1994, WM Company began calculating closing spot rates. Closing spot rates provide a standard set of currency rates so that portfolio valuations can be compared to each other and their performances measured against benchmarks, without having discrepancies caused by exchange rates. Closing spot rates are recorded at 16:00 GMT.*</p> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ForeignExchangeRate.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ForeignExchangeRate.models.Spot;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ForeignExchangeRate.JSON;


/**
 * SpotsResponse
 */
@JsonPropertyOrder({
  SpotsResponse.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SpotsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<Spot> data = null;

  public SpotsResponse() { 
  }

  public SpotsResponse data(java.util.List<Spot> data) {
    this.data = data;
    return this;
  }

  public SpotsResponse addDataItem(Spot dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Array of Spot Objects
   * @return data
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Array of Spot Objects")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Spot> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(java.util.List<Spot> data) {
    this.data = data;
  }


  /**
   * Return true if this spotsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpotsResponse spotsResponse = (SpotsResponse) o;
    return Objects.equals(this.data, spotsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpotsResponse {\n");
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

