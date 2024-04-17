/*
 * Exchange DataFeed Snapshot
 * FactSet’s Exchange DataFeed Snapshot API provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 300 global exchanges and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. <p>Cutting-edge technology ensures reliability and provides scalability that allow applications to request multiple items at a time. To simplify client-side development an entire response can be placed in a matrix or table for effortless integration into internal and external applications. Using specified output formats (CSV, XML, JSON) receive all standard fields by default or customize the list based on specific needs.</p></p>Below are the current hosts:</p><p>Production: api.factset.com<p>Sandbox: api-sandbox.factset.com</p>
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.models;

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
import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.JSON;


/**
 * subErrors related to the error message. Null if not applicable.
 */
@ApiModel(description = "subErrors related to the error message. Null if not applicable.")
@JsonPropertyOrder({
  ErrorResponseSubErrors.JSON_PROPERTY_FIELD,
  ErrorResponseSubErrors.JSON_PROPERTY_MESSAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ErrorResponseSubErrors implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public ErrorResponseSubErrors() { 
  }

  public ErrorResponseSubErrors field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Parameter Field Name
   * @return field
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Parameter Field Name")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(String field) {
    this.field = field;
  }


  public ErrorResponseSubErrors message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Error message")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Return true if this errorResponse_subErrors object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseSubErrors errorResponseSubErrors = (ErrorResponseSubErrors) o;
    return Objects.equals(this.field, errorResponseSubErrors.field) &&
        Objects.equals(this.message, errorResponseSubErrors.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseSubErrors {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

