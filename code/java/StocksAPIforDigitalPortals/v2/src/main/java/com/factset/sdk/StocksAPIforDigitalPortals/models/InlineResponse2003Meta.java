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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.OffsetBasedPaginationOutputObject;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PartialOutputObject;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StatusObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * The meta member contains the meta information of the response.
 */
@ApiModel(description = "The meta member contains the meta information of the response.")
@JsonPropertyOrder({
  InlineResponse2003Meta.JSON_PROPERTY_STATUS,
  InlineResponse2003Meta.JSON_PROPERTY_PAGINATION,
  InlineResponse2003Meta.JSON_PROPERTY_PARTIAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003Meta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusObject status;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private OffsetBasedPaginationOutputObject pagination;

  public static final String JSON_PROPERTY_PARTIAL = "partial";
  private PartialOutputObject partial;

  public InlineResponse2003Meta() { 
  }

  public InlineResponse2003Meta status(StatusObject status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
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


  public InlineResponse2003Meta pagination(OffsetBasedPaginationOutputObject pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
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


  public InlineResponse2003Meta partial(PartialOutputObject partial) {
    this.partial = partial;
    return this;
  }

   /**
   * Get partial
   * @return partial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PartialOutputObject getPartial() {
    return partial;
  }


  @JsonProperty(JSON_PROPERTY_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartial(PartialOutputObject partial) {
    this.partial = partial;
  }


  /**
   * Return true if this inline_response_200_3_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Meta inlineResponse2003Meta = (InlineResponse2003Meta) o;
    return Objects.equals(this.status, inlineResponse2003Meta.status) &&
        Objects.equals(this.pagination, inlineResponse2003Meta.pagination) &&
        Objects.equals(this.partial, inlineResponse2003Meta.partial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, pagination, partial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Meta {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    partial: ").append(toIndentedString(partial)).append("\n");
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

