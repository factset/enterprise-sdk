/*
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentals.models;

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
import com.factset.sdk.FactSetFundamentals.JSON;


/**
 * The Endpoint path {package}/version/{endpoint}
 */
@ApiModel(description = "The Endpoint path {package}/version/{endpoint}")
@JsonPropertyOrder({
  ErrorObjectLinks.JSON_PROPERTY_ABOUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ErrorObjectLinks implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABOUT = "about";
  private String about;

  public ErrorObjectLinks() { 
  }

  public ErrorObjectLinks about(String about) {
    this.about = about;
    return this;
  }

   /**
   * details.
   * @return about
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/factset-fundamentals/v1/{endpoint}", value = "details.")
  @JsonProperty(JSON_PROPERTY_ABOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAbout() {
    return about;
  }


  @JsonProperty(JSON_PROPERTY_ABOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbout(String about) {
    this.about = about;
  }


  /**
   * Return true if this errorObject_links object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorObjectLinks errorObjectLinks = (ErrorObjectLinks) o;
    return Objects.equals(this.about, errorObjectLinks.about);
  }

  @Override
  public int hashCode() {
    return Objects.hash(about);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorObjectLinks {\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
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
