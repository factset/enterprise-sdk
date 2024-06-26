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


package com.factset.sdk.ETFProfileandPrices.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * InlineResponse2001DataAssets
 */
@JsonPropertyOrder({
  InlineResponse2001DataAssets.JSON_PROPERTY_ASSET_CLASS,
  InlineResponse2001DataAssets.JSON_PROPERTY_WEIGHT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2001DataAssets implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ASSET_CLASS = "assetClass";
  private String assetClass;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public InlineResponse2001DataAssets() { 
  }

  public InlineResponse2001DataAssets assetClass(String assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Name of the asset class.
   * @return assetClass
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the asset class.")
  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetClass() {
    return assetClass;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetClass(String assetClass) {
    this.assetClass = assetClass;
  }


  public InlineResponse2001DataAssets weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Consolidate weight of the position within the ETP by asset class(es).
   * @return weight
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Consolidate weight of the position within the ETP by asset class(es).")
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  /**
   * Return true if this inline_response_200_1_data_assets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001DataAssets inlineResponse2001DataAssets = (InlineResponse2001DataAssets) o;
    return Objects.equals(this.assetClass, inlineResponse2001DataAssets.assetClass) &&
        Objects.equals(this.weight, inlineResponse2001DataAssets.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetClass, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001DataAssets {\n");
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

