/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Cabot.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Cabot.models.ConstructionModelAnalytics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Cabot.JSON;


/**
 * ConstructionResponseOptions
 */
@JsonPropertyOrder({
  ConstructionResponseOptions.JSON_PROPERTY_CONSTRUCTION_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ConstructionResponseOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CONSTRUCTION_VALUES = "constructionValues";
  private ConstructionModelAnalytics constructionValues;

  public ConstructionResponseOptions() { 
  }

  public ConstructionResponseOptions constructionValues(ConstructionModelAnalytics constructionValues) {
    this.constructionValues = constructionValues;
    return this;
  }

   /**
   * Get constructionValues
   * @return constructionValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRUCTION_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConstructionModelAnalytics getConstructionValues() {
    return constructionValues;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRUCTION_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstructionValues(ConstructionModelAnalytics constructionValues) {
    this.constructionValues = constructionValues;
  }


  /**
   * Return true if this ConstructionResponseOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstructionResponseOptions constructionResponseOptions = (ConstructionResponseOptions) o;
    return Objects.equals(this.constructionValues, constructionResponseOptions.constructionValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constructionValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionResponseOptions {\n");
    sb.append("    constructionValues: ").append(toIndentedString(constructionValues)).append("\n");
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

