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
 * The Outlier Data Result object
 */
@ApiModel(description = "The Outlier Data Result object")
@JsonPropertyOrder({
  OutlierDataResult.JSON_PROPERTY_BIN,
  OutlierDataResult.JSON_PROPERTY_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OutlierDataResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BIN = "bin";
  private Integer bin;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public OutlierDataResult() { 
  }

  public OutlierDataResult bin(Integer bin) {
    this.bin = bin;
    return this;
  }

   /**
   * Result Bin
   * @return bin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Result Bin")
  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBin() {
    return bin;
  }


  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBin(Integer bin) {
    this.bin = bin;
  }


  public OutlierDataResult count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Result Count
   * @return count
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Result Count")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }


  /**
   * Return true if this OutlierDataResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlierDataResult outlierDataResult = (OutlierDataResult) o;
    return Objects.equals(this.bin, outlierDataResult.bin) &&
        Objects.equals(this.count, outlierDataResult.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bin, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlierDataResult {\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

