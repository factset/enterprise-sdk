/*
 * FactSet Estimates Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetEstimatesReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetEstimatesReportBuilder.models.ScaleScale;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimatesReportBuilder.JSON;


/**
 * Scale
 */
@JsonPropertyOrder({
  Scale.JSON_PROPERTY_SCALE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Scale implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private ScaleScale scale;

  public Scale() { 
  }

  public Scale scale(ScaleScale scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScaleScale getScale() {
    return scale;
  }


  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScale(ScaleScale scale) {
    this.scale = scale;
  }


  /**
   * Return true if this scale object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scale scale = (Scale) o;
    return Objects.equals(this.scale, scale.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scale {\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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

