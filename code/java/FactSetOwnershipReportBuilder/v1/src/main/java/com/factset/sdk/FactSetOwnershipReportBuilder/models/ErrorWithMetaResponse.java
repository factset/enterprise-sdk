/*
 * FactSet Ownership API
 * description.md
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetOwnershipReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetOwnershipReportBuilder.models.ErrorObject;
import com.factset.sdk.FactSetOwnershipReportBuilder.models.Meta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetOwnershipReportBuilder.JSON;


/**
 * Standard Ownership response when an error occurs.
 */
@ApiModel(description = "Standard Ownership response when an error occurs.")
@JsonPropertyOrder({
  ErrorWithMetaResponse.JSON_PROPERTY_ERRORS,
  ErrorWithMetaResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ErrorWithMetaResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private java.util.List<ErrorObject> errors = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Meta meta;

  public ErrorWithMetaResponse() { 
  }

  public ErrorWithMetaResponse errors(java.util.List<ErrorObject> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorWithMetaResponse addErrorsItem(ErrorObject errorsItem) {
    if (this.errors == null) {
      this.errors = new java.util.ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occured which made this request unservicable
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Any errors that occured which made this request unservicable")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ErrorObject> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(java.util.List<ErrorObject> errors) {
    this.errors = errors;
  }


  public ErrorWithMetaResponse meta(Meta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Meta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this ErrorWithMetaResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorWithMetaResponse errorWithMetaResponse = (ErrorWithMetaResponse) o;
    return Objects.equals(this.errors, errorWithMetaResponse.errors) &&
        Objects.equals(this.meta, errorWithMetaResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorWithMetaResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

