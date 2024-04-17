/*
 * FactSet GeoRev API
 * FactSet Revere Geographic Revenue (\"GeoRev\") Exposure data provides a highly structured and normalized display of companies’ revenues by geography. Using a four level taxonomy structure, understand the companies' Super-Region-->Region-->Area-->Country revenue breakdowns. Quickly understand a company’s revenue exposure in countries impacted by geopolitical, macroeconomic, and market risk. Understand the geographic footprint of a company based on sources of revenue versus country of domicile, and analyze global revenue exposures at the company, index, or portfolio level.<p> Geographic revenue has historically been difficult to analyze due to companies’ non-standard and incomplete reporting. Investors relying solely on this as-reported data are limited in their ability to compare, aggregate or screen exposures across a universe or portfolio of companies. To achieve normalization, FactSet GeoRev captures data through a proprietary four-level geographic classification structure. An estimation algorithm based on GDP weighting and accounting logic is then applied to solve for any non-explicit disclosures. The result is a consistent, accurate, and flexible dataset that can take a company’s revenues and break them down into any geographic country or region categories.</p><p>As markets become more integrated and companies expand operations beyond their domestic markets, GeoRev provides a new and valuable country factor to help investors discover alpha, model risk exposure, optimize portfolio weighting, and improve fund administration and reporting.</p><p>Data Frequency -  Annual; Update Frequency - Daily. 49,000+ Publically Listed Companies. All Russell 3000 and MSCI ACWI Index Consituents. U.S. Data is available from 2003, with Non-US data from 2007. For more details, visit [OA 17555](https://my.apps.factset.com/oa/pages/17555)</p> 
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetGeoRev.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetGeoRev.models.ErrorResponseSubErrors;
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
import com.factset.sdk.FactSetGeoRev.JSON;


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
  @ApiModelProperty(example = "/factset-georev/v1/superRegion", value = "The Endpoint path {package}/version/{endpoint}")
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

