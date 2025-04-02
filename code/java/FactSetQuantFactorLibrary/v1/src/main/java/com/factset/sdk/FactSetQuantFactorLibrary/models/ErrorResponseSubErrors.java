/*
 * FactSet Quant Factor Library API
 * The FactSet FactSet Quant Factor Library (QFL) API helps to detect investment themes across global equity markets, incorporate ideas into your portfolio construction process, and transform raw data into actionable intelligence. Over 2000+ items spanning Factor Groups in-   * Classification and Reference Data - Asset Data, Country, Industry, and Size   * Market - Liquidity, Market Sensitivity, Momentum, Technical, Volatility   * Core Fundamentals - Efficiency, Growth, Management, Profitability, Quality, Solvency, Value   * Macro and Cross Asset - Commodity, FX Sensitivity, Debt, Economic   * Alternative - Analyst Sentiment, Corporate Governance, Crowding, Insider Activity. 
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetQuantFactorLibrary.models;

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
import com.factset.sdk.FactSetQuantFactorLibrary.JSON;


/**
 * subErrors related to the error message. Null if not applicable.
 */
@ApiModel(description = "subErrors related to the error message. Null if not applicable.")
@JsonPropertyOrder({
  ErrorResponseSubErrors.JSON_PROPERTY_OBJECT,
  ErrorResponseSubErrors.JSON_PROPERTY_FIELD,
  ErrorResponseSubErrors.JSON_PROPERTY_MESSAGE,
  ErrorResponseSubErrors.JSON_PROPERTY_REJECTED_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ErrorResponseSubErrors implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_REJECTED_VALUE = "rejectedValue";
  private java.util.List<String> rejectedValue = null;

  public ErrorResponseSubErrors() { 
  }

  public ErrorResponseSubErrors _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * the operation ID
   * @return _object
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "the operation ID")
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(String _object) {
    this._object = _object;
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


  public ErrorResponseSubErrors rejectedValue(java.util.List<String> rejectedValue) {
    this.rejectedValue = rejectedValue;
    return this;
  }

  public ErrorResponseSubErrors addRejectedValueItem(String rejectedValueItem) {
    if (this.rejectedValue == null) {
      this.rejectedValue = new java.util.ArrayList<>();
    }
    this.rejectedValue.add(rejectedValueItem);
    return this;
  }

   /**
   * Rejected Values in an Array
   * @return rejectedValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Rejected Values in an Array")
  @JsonProperty(JSON_PROPERTY_REJECTED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getRejectedValue() {
    return rejectedValue;
  }


  @JsonProperty(JSON_PROPERTY_REJECTED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejectedValue(java.util.List<String> rejectedValue) {
    this.rejectedValue = rejectedValue;
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
    return Objects.equals(this._object, errorResponseSubErrors._object) &&
        Objects.equals(this.field, errorResponseSubErrors.field) &&
        Objects.equals(this.message, errorResponseSubErrors.message) &&
        Objects.equals(this.rejectedValue, errorResponseSubErrors.rejectedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, field, message, rejectedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseSubErrors {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rejectedValue: ").append(toIndentedString(rejectedValue)).append("\n");
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

