/*
 * Natural Language Processing API
 * APIs that leverage Natural Language Processing to help extract meaningful data from unstructured text
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.NaturalLanguageProcessing.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.NaturalLanguageProcessing.models.ErrorSource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.NaturalLanguageProcessing.JSON;


/**
 * Schema that defines HTTP error(s).
 */
@ApiModel(description = "Schema that defines HTTP error(s).")
@JsonPropertyOrder({
  HTTPError.JSON_PROPERTY_CODE,
  HTTPError.JSON_PROPERTY_DETAIL,
  HTTPError.JSON_PROPERTY_ID,
  HTTPError.JSON_PROPERTY_SOURCE,
  HTTPError.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class HTTPError implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private ErrorSource source;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public HTTPError() { 
  }

  @JsonCreator
  public HTTPError(
    @JsonProperty(value=JSON_PROPERTY_CODE, required=true) String code, 
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) java.util.UUID id, 
    @JsonProperty(value=JSON_PROPERTY_TITLE, required=true) String title
  ) {
    this();
    this.code = code;
    this.id = id;
    this.title = title;
  }

  public HTTPError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * HTTP Status Code
   * @return code
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "HTTP Status Code")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public HTTPError detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Error detail (if any)
   * @return detail
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Error detail (if any)")
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetail() {
    return detail;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(String detail) {
    this.detail = detail;
  }


  public HTTPError id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier detailing the error(s)
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier detailing the error(s)")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  public HTTPError source(ErrorSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorSource getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(ErrorSource source) {
    this.source = source;
  }


  public HTTPError title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Error title
   * @return title
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Error title")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this HTTPError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPError htTPError = (HTTPError) o;
    return Objects.equals(this.code, htTPError.code) &&
        Objects.equals(this.detail, htTPError.detail) &&
        Objects.equals(this.id, htTPError.id) &&
        Objects.equals(this.source, htTPError.source) &&
        Objects.equals(this.title, htTPError.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detail, id, source, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

