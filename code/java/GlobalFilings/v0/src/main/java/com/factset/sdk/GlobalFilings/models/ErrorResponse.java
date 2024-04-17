/*
 * Global Filings API
 * The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet’s document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  Helper endpoint will provide dynamic information on the parameters of a document request. .
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.GlobalFilings.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.GlobalFilings.models.ErrorExample;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.GlobalFilings.JSON;


/**
 * Error Response Object
 */
@ApiModel(description = "Error Response Object")
@JsonPropertyOrder({
  ErrorResponse.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private java.util.List<ErrorExample> errors = null;

  public ErrorResponse() { 
  }

  public ErrorResponse errors(java.util.List<ErrorExample> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorResponse addErrorsItem(ErrorExample errorsItem) {
    if (this.errors == null) {
      this.errors = new java.util.ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Errors Array Object
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Errors Array Object")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ErrorExample> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(java.util.List<ErrorExample> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this ErrorResponse object is equal to o.
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
    return Objects.equals(this.errors, errorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

