/*
 * Price Alerting API For Digital Portals
 * The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.  Alerting uses the concepts of triggers and alerts.  A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument. The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument.  When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.  An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).  The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.  See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price information.  Note: As part of the general trial access, endpoints to write data are excluded. For a description of the full alerting API, please work with a FactSet consultant and see https://endpointreference.factset.com. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimePriceAlerting.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimePriceAlerting.models.CursorBasedPaginationOutputObject;
import com.factset.sdk.RealTimePriceAlerting.models.StatusObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimePriceAlerting.JSON;


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
  private CursorBasedPaginationOutputObject pagination;

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


  public InlineResponse2001Meta pagination(CursorBasedPaginationOutputObject pagination) {
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

  public CursorBasedPaginationOutputObject getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(CursorBasedPaginationOutputObject pagination) {
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

