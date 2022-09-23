/*
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.UniversalScreening.models;

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
import com.factset.sdk.UniversalScreening.JSON;


/**
 * ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo
 */
@JsonPropertyOrder({
  ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo.JSON_PROPERTY_PARAMETER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo() { 
  }

  public ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   * Return true if this For_errors_and_warnings_found_in_screens__contains_the_paramID_the_error_warning_belongs_to object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo forErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo = (ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo) o;
    return Objects.equals(this.parameter, forErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo {\n");
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
