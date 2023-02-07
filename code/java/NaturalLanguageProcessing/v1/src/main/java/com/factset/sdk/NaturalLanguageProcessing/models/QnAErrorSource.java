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
 * Schema that defines the source of the error.
 */
@ApiModel(description = "Schema that defines the source of the error.")
@JsonPropertyOrder({
  QnAErrorSource.JSON_PROPERTY_PARAMETER,
  QnAErrorSource.JSON_PROPERTY_POINTER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QnAErrorSource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public static final String JSON_PROPERTY_POINTER = "pointer";
  private String pointer;

  public QnAErrorSource() { 
  }

  @JsonCreator
  public QnAErrorSource(
    @JsonProperty(value=JSON_PROPERTY_PARAMETER, required=true) String parameter, 
    @JsonProperty(value=JSON_PROPERTY_POINTER, required=true) String pointer
  ) {
    this();
    this.parameter = parameter;
    this.pointer = pointer;
  }

  public QnAErrorSource parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * A string indicating which path or URI query parameter caused the error.
   * @return parameter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A string indicating which path or URI query parameter caused the error.")
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParameter() {
    return parameter;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public QnAErrorSource pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

   /**
   * More details pointing to the error.
   * @return pointer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "More details pointing to the error.")
  @JsonProperty(JSON_PROPERTY_POINTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPointer() {
    return pointer;
  }


  @JsonProperty(JSON_PROPERTY_POINTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPointer(String pointer) {
    this.pointer = pointer;
  }


  /**
   * Return true if this QnAErrorSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QnAErrorSource qnAErrorSource = (QnAErrorSource) o;
    return Objects.equals(this.parameter, qnAErrorSource.parameter) &&
        Objects.equals(this.pointer, qnAErrorSource.pointer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter, pointer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QnAErrorSource {\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
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

