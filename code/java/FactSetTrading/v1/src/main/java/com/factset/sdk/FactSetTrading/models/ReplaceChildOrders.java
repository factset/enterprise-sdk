/*
 * Trading API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTrading.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetTrading.models.ReplaceChildOrder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetTrading.JSON;


/**
 * ReplaceChildOrders
 */
@JsonPropertyOrder({
  ReplaceChildOrders.JSON_PROPERTY_CHILD_ORDERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReplaceChildOrders implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CHILD_ORDERS = "childOrders";
  private java.util.List<ReplaceChildOrder> childOrders = new java.util.ArrayList<>();

  public ReplaceChildOrders() { 
  }

  @JsonCreator
  public ReplaceChildOrders(
    @JsonProperty(value=JSON_PROPERTY_CHILD_ORDERS, required=true) java.util.List<ReplaceChildOrder> childOrders
  ) {
    this();
    this.childOrders = childOrders;
  }

  public ReplaceChildOrders childOrders(java.util.List<ReplaceChildOrder> childOrders) {
    this.childOrders = childOrders;
    return this;
  }

  public ReplaceChildOrders addChildOrdersItem(ReplaceChildOrder childOrdersItem) {
    this.childOrders.add(childOrdersItem);
    return this;
  }

   /**
   * Get childOrders
   * @return childOrders
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CHILD_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<ReplaceChildOrder> getChildOrders() {
    return childOrders;
  }


  @JsonProperty(JSON_PROPERTY_CHILD_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChildOrders(java.util.List<ReplaceChildOrder> childOrders) {
    this.childOrders = childOrders;
  }


  /**
   * Return true if this ReplaceChildOrders object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceChildOrders replaceChildOrders = (ReplaceChildOrders) o;
    return Objects.equals(this.childOrders, replaceChildOrders.childOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childOrders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceChildOrders {\n");
    sb.append("    childOrders: ").append(toIndentedString(childOrders)).append("\n");
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

