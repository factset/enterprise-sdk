/*
 * Open:FactSet Marketplace API
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenFactSetMarketplace.models;

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
import com.factset.sdk.OpenFactSetMarketplace.JSON;


/**
 * Pagination metadata
 */
@ApiModel(description = "Pagination metadata")
@JsonPropertyOrder({
  MetaPagination.JSON_PROPERTY_TOTAL,
  MetaPagination.JSON_PROPERTY_IS_ESTIMATED_TOTAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MetaPagination implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_IS_ESTIMATED_TOTAL = "isEstimatedTotal";
  private Boolean isEstimatedTotal;

  public MetaPagination() { 
  }

  public MetaPagination total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items returned
   * @return total
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "300", value = "Total number of items returned")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public MetaPagination isEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
    return this;
  }

   /**
   * Boolean flag indicating whether the total number of items is an estimate
   * @return isEstimatedTotal
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Boolean flag indicating whether the total number of items is an estimate")
  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEstimatedTotal() {
    return isEstimatedTotal;
  }


  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
  }


  /**
   * Return true if this Meta_pagination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaPagination metaPagination = (MetaPagination) o;
    return Objects.equals(this.total, metaPagination.total) &&
        Objects.equals(this.isEstimatedTotal, metaPagination.isEstimatedTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, isEstimatedTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaPagination {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isEstimatedTotal: ").append(toIndentedString(isEstimatedTotal)).append("\n");
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

