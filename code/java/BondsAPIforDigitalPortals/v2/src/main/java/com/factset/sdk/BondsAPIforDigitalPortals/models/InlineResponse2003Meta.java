/*
 * Bonds API For Digital Portals
 * Search for fixed income instruments, using a criteria-based screener. The API provides also fundamental data and key figures, basic interest rate information and derived coupon lists.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * important dates in and features of the life cycle of the fixed income instruments * filter by issuer, its country of registration and the issued volume * coupon data: occurrence and frequency of coupon payments, current interest rate range * yield and yield to maturity range, spread * Macaulay duration * sensitivity ranges: base point value, modified duration, elasticity, convexity * cash flow for all transactions over a certain time range: sum or average * country-specific attributes: for Germany: is eligible for trustees        The key figures are calculated using delayed prices with an additional delay of 10 minutes after an update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.OffsetBasedPaginationOutputObject;
import com.factset.sdk.BondsAPIforDigitalPortals.models.PartialOutputObject;
import com.factset.sdk.BondsAPIforDigitalPortals.models.StatusObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


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

