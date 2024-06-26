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
import com.factset.sdk.ETFProfileandPrices.models.OffsetBasedPaginationOutputObject;
import com.factset.sdk.ETFProfileandPrices.models.StatusObject;
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
 * The meta member contains the meta information of the response.
 */
@ApiModel(description = "The meta member contains the meta information of the response.")
@JsonPropertyOrder({
  InlineResponse2001Meta.JSON_PROPERTY_STATUS,
  InlineResponse2001Meta.JSON_PROPERTY_PAGINATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2001Meta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusObject status;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private OffsetBasedPaginationOutputObject pagination;

  public InlineResponse2001Meta() { 
  }

  public InlineResponse2001Meta status(StatusObject status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusObject getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusObject status) {
    this.status = status;
  }


  public InlineResponse2001Meta pagination(OffsetBasedPaginationOutputObject pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetBasedPaginationOutputObject getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(OffsetBasedPaginationOutputObject pagination) {
    this.pagination = pagination;
  }


  /**
   * Return true if this inline_response_200_1_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Meta inlineResponse2001Meta = (InlineResponse2001Meta) o;
    return Objects.equals(this.status, inlineResponse2001Meta.status) &&
        Objects.equals(this.pagination, inlineResponse2001Meta.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Meta {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

