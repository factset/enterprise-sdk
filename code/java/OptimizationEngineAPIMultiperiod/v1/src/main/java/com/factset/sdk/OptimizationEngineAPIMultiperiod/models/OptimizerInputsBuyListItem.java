/*
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OptimizationEngineAPIMultiperiod.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsAssetPrice;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.JSON;


/**
 * OptimizerInputsBuyListItem
 */
@JsonPropertyOrder({
  OptimizerInputsBuyListItem.JSON_PROPERTY_UNIV_INDEX,
  OptimizerInputsBuyListItem.JSON_PROPERTY_PRICE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsBuyListItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNIV_INDEX = "univ_index";
  private Integer univIndex;

  public static final String JSON_PROPERTY_PRICE = "price";
  private OptimizerInputsAssetPrice price;

  public OptimizerInputsBuyListItem() { 
  }

  public OptimizerInputsBuyListItem univIndex(Integer univIndex) {
    this.univIndex = univIndex;
    return this;
  }

   /**
   * Get univIndex
   * @return univIndex
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIV_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnivIndex() {
    return univIndex;
  }


  @JsonProperty(JSON_PROPERTY_UNIV_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnivIndex(Integer univIndex) {
    this.univIndex = univIndex;
  }


  public OptimizerInputsBuyListItem price(OptimizerInputsAssetPrice price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsAssetPrice getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(OptimizerInputsAssetPrice price) {
    this.price = price;
  }


  /**
   * Return true if this optimizer.inputs.BuyListItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsBuyListItem optimizerInputsBuyListItem = (OptimizerInputsBuyListItem) o;
    return Objects.equals(this.univIndex, optimizerInputsBuyListItem.univIndex) &&
        Objects.equals(this.price, optimizerInputsBuyListItem.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(univIndex, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsBuyListItem {\n");
    sb.append("    univIndex: ").append(toIndentedString(univIndex)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

