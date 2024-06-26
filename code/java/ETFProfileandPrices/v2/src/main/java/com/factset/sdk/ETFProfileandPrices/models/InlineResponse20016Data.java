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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * InlineResponse20016Data
 */
@JsonPropertyOrder({
  InlineResponse20016Data.JSON_PROPERTY_BROAD_CATEGORY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20016Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BROAD_CATEGORY = "broadCategory";
  private String broadCategory;

  public InlineResponse20016Data() { 
  }

  public InlineResponse20016Data broadCategory(String broadCategory) {
    this.broadCategory = broadCategory;
    return this;
  }

   /**
   * ETP class broad category.
   * @return broadCategory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ETP class broad category.")
  @JsonProperty(JSON_PROPERTY_BROAD_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBroadCategory() {
    return broadCategory;
  }


  @JsonProperty(JSON_PROPERTY_BROAD_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBroadCategory(String broadCategory) {
    this.broadCategory = broadCategory;
  }


  /**
   * Return true if this inline_response_200_16_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20016Data inlineResponse20016Data = (InlineResponse20016Data) o;
    return Objects.equals(this.broadCategory, inlineResponse20016Data.broadCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(broadCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016Data {\n");
    sb.append("    broadCategory: ").append(toIndentedString(broadCategory)).append("\n");
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

