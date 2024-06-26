/*
 * Foreign Exchange Rates API
 * Foreign Exchange Rates API in which retrieves Spots and Forwards for a given currency pair and date range. <p>*Spots and Forwards rates are sourced from W/M Reuters.The WM Company calculates daily standardized spot rates for global foreign exchange transactions, using rates provided by Reuters. These rates are recognized globally as the standard by banks, fund managers, and index compilers; increasingly these rates are also being used for benchmark currency trading. In 1994, WM Company began calculating closing spot rates. Closing spot rates provide a standard set of currency rates so that portfolio valuations can be compared to each other and their performances measured against benchmarks, without having discrepancies caused by exchange rates. Closing spot rates are recorded at 16:00 GMT.*</p> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ForeignExchangeRate.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ForeignExchangeRate.models.ErrorResponseSubErrors;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ForeignExchangeRate.JSON;


/**
 * ErrorResponse
 */
@JsonPropertyOrder({
  ErrorResponse.JSON_PROPERTY_STATUS,
  ErrorResponse.JSON_PROPERTY_TIMESTAMP,
  ErrorResponse.JSON_PROPERTY_PATH,
  ErrorResponse.JSON_PROPERTY_MESSAGE,
  ErrorResponse.JSON_PROPERTY_SUB_ERRORS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_SUB_ERRORS = "subErrors";
  private ErrorResponseSubErrors subErrors;

  public ErrorResponse() { 
  }

  public ErrorResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Bad Request", value = "status")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public ErrorResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * timestamp in YYYY-MM-DD HH:MM:SS.SSS
   * @return timestamp
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "timestamp in YYYY-MM-DD HH:MM:SS.SSS")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public ErrorResponse path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Endpoint path {package}/version/{endpoint}
   * @return path
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/foreign-exchange/v1/spots", value = "The Endpoint path {package}/version/{endpoint}")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public ErrorResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The plain text error message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Validation Error", value = "The plain text error message")
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


  public ErrorResponse subErrors(ErrorResponseSubErrors subErrors) {
    this.subErrors = subErrors;
    return this;
  }

   /**
   * Get subErrors
   * @return subErrors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorResponseSubErrors getSubErrors() {
    return subErrors;
  }


  @JsonProperty(JSON_PROPERTY_SUB_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubErrors(ErrorResponseSubErrors subErrors) {
    this.subErrors = subErrors;
  }


  /**
   * Return true if this errorResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.status, errorResponse.status) &&
        Objects.equals(this.timestamp, errorResponse.timestamp) &&
        Objects.equals(this.path, errorResponse.path) &&
        Objects.equals(this.message, errorResponse.message) &&
        Objects.equals(this.subErrors, errorResponse.subErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, timestamp, path, message, subErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    subErrors: ").append(toIndentedString(subErrors)).append("\n");
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

