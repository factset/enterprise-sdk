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
 * InlineResponse2008DataRegions
 */
@JsonPropertyOrder({
  InlineResponse2008DataRegions.JSON_PROPERTY_REGION,
  InlineResponse2008DataRegions.JSON_PROPERTY_WEIGHT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2008DataRegions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public InlineResponse2008DataRegions() { 
  }

  public InlineResponse2008DataRegions region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Name of the region.
   * @return region
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the region.")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public InlineResponse2008DataRegions weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Consolidate weight of the position within the ETP by region(s)..
   * @return weight
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Consolidate weight of the position within the ETP by region(s)..")
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
   * Return true if this inline_response_200_8_data_regions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008DataRegions inlineResponse2008DataRegions = (InlineResponse2008DataRegions) o;
    return Objects.equals(this.region, inlineResponse2008DataRegions.region) &&
        Objects.equals(this.weight, inlineResponse2008DataRegions.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008DataRegions {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

