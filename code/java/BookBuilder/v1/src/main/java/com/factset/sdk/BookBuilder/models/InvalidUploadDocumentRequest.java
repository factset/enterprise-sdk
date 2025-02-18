/*
 * BookBuilder
 * The BookBuilder API is a powerful tool that combines detailed reports for companies of interest. Save time by using a single source of knowledge instead of relying on multiple APIs to create a presentation ready PDF, also known as a Public Information Book(PIB). </br></br> Consistently create books with the same content/reports for different companies by defining templates with the set of reports saved for re-use. Or, use templates that are created by FactSet for quick use. </br></br> With our powerful API endpoints, you can get the information on companies of interest quickly where and when you need it. </br></br> 
 *
 * The version of the OpenAPI document: 1.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BookBuilder.models;

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
import com.factset.sdk.BookBuilder.JSON;


/**
 * Invalid ticker or Unknown error
 */
@ApiModel(description = "Invalid ticker or Unknown error")
@JsonPropertyOrder({
  InvalidUploadDocumentRequest.JSON_PROPERTY_MESSAGE,
  InvalidUploadDocumentRequest.JSON_PROPERTY_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InvalidUploadDocumentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_CODE = "code";
  private Integer code;

  public InvalidUploadDocumentRequest() { 
  }

  public InvalidUploadDocumentRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Invalid Request Message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "File Error No files selected.", value = "Invalid Request Message")
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


  public InvalidUploadDocumentRequest code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Invalid request code
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "400", value = "Invalid request code")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(Integer code) {
    this.code = code;
  }


  /**
   * Return true if this Invalid_Upload_Document_Request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidUploadDocumentRequest invalidUploadDocumentRequest = (InvalidUploadDocumentRequest) o;
    return Objects.equals(this.message, invalidUploadDocumentRequest.message) &&
        Objects.equals(this.code, invalidUploadDocumentRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidUploadDocumentRequest {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

