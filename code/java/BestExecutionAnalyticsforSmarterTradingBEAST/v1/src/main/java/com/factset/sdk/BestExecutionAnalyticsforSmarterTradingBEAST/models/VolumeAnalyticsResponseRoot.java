/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.VolumeAnalyticsResponse;
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
 * The response root object
 */
@ApiModel(description = "The response root object")
@JsonPropertyOrder({
  VolumeAnalyticsResponseRoot.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VolumeAnalyticsResponseRoot implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private VolumeAnalyticsResponse data;

  public VolumeAnalyticsResponseRoot() { 
  }

  @JsonCreator
  public VolumeAnalyticsResponseRoot(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) VolumeAnalyticsResponse data
  ) {
    this();
    this.data = data;
  }

  public VolumeAnalyticsResponseRoot data(VolumeAnalyticsResponse data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VolumeAnalyticsResponse getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(VolumeAnalyticsResponse data) {
    this.data = data;
  }


  /**
   * Return true if this VolumeAnalyticsResponseRoot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeAnalyticsResponseRoot volumeAnalyticsResponseRoot = (VolumeAnalyticsResponseRoot) o;
    return Objects.equals(this.data, volumeAnalyticsResponseRoot.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeAnalyticsResponseRoot {\n");
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

