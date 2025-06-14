/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
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
import com.factset.sdk.Cabot.models.ResultsModelAnalytics;
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
 * ResultsResponseOptions
 */
@JsonPropertyOrder({
  ResultsResponseOptions.JSON_PROPERTY_RESULT_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ResultsResponseOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RESULT_VALUES = "resultValues";
  private ResultsModelAnalytics resultValues;

  public ResultsResponseOptions() { 
  }

  public ResultsResponseOptions resultValues(ResultsModelAnalytics resultValues) {
    this.resultValues = resultValues;
    return this;
  }

   /**
   * Get resultValues
   * @return resultValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResultsModelAnalytics getResultValues() {
    return resultValues;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultValues(ResultsModelAnalytics resultValues) {
    this.resultValues = resultValues;
  }


  /**
   * Return true if this ResultsResponseOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsResponseOptions resultsResponseOptions = (ResultsResponseOptions) o;
    return Objects.equals(this.resultValues, resultsResponseOptions.resultValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsResponseOptions {\n");
    sb.append("    resultValues: ").append(toIndentedString(resultValues)).append("\n");
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

