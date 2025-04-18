/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.IndexETF;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.JSON;


/**
 * The IndexETF Response object
 */
@ApiModel(description = "The IndexETF Response object")
@JsonPropertyOrder({
  IndexETFResponse.JSON_PROPERTY_INDEX_E_T_F
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IndexETFResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INDEX_E_T_F = "indexETF";
  private java.util.List<IndexETF> indexETF = null;

  public IndexETFResponse() { 
  }

  public IndexETFResponse indexETF(java.util.List<IndexETF> indexETF) {
    this.indexETF = indexETF;
    return this;
  }

  public IndexETFResponse addIndexETFItem(IndexETF indexETFItem) {
    if (this.indexETF == null) {
      this.indexETF = new java.util.ArrayList<>();
    }
    this.indexETF.add(indexETFItem);
    return this;
  }

   /**
   * List of IndexETF data
   * @return indexETF
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of IndexETF data")
  @JsonProperty(JSON_PROPERTY_INDEX_E_T_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<IndexETF> getIndexETF() {
    return indexETF;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_E_T_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexETF(java.util.List<IndexETF> indexETF) {
    this.indexETF = indexETF;
  }


  /**
   * Return true if this IndexETFResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexETFResponse indexETFResponse = (IndexETFResponse) o;
    return Objects.equals(this.indexETF, indexETFResponse.indexETF);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexETF);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexETFResponse {\n");
    sb.append("    indexETF: ").append(toIndentedString(indexETF)).append("\n");
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

