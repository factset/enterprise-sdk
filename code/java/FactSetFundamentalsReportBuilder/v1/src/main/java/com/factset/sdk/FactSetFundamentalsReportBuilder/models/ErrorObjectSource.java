/*
 * FactSet Entity Report Builder
 * License info
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentalsReportBuilder.models;

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
import com.factset.sdk.FactSetFundamentalsReportBuilder.JSON;


/**
 * An object containing references to the source of the error, optionally including additional members
 */
@ApiModel(description = "An object containing references to the source of the error, optionally including additional members")
@JsonPropertyOrder({
  ErrorObjectSource.JSON_PROPERTY_PARAMETER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ErrorObjectSource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public ErrorObjectSource() { 
  }

  public ErrorObjectSource parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * A string indicating which path or URI query parameter caused the error
   * @return parameter
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A string indicating which path or URI query parameter caused the error")
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameter() {
    return parameter;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  /**
   * Return true if this ErrorObject_source object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorObjectSource errorObjectSource = (ErrorObjectSource) o;
    return Objects.equals(this.parameter, errorObjectSource.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorObjectSource {\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

