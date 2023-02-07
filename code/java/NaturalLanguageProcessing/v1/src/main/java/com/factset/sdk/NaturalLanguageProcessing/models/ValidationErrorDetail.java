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
import com.factset.sdk.NaturalLanguageProcessing.models.ValidationErrorDetailLocation;
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
 * ValidationErrorDetail
 */
@JsonPropertyOrder({
  ValidationErrorDetail.JSON_PROPERTY_LESS_THAN_LOCATION_GREATER_THAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValidationErrorDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LESS_THAN_LOCATION_GREATER_THAN = "&lt;location&gt;";
  private ValidationErrorDetailLocation lessThanLocationGreaterThan;

  public ValidationErrorDetail() { 
  }

  public ValidationErrorDetail lessThanLocationGreaterThan(ValidationErrorDetailLocation lessThanLocationGreaterThan) {
    this.lessThanLocationGreaterThan = lessThanLocationGreaterThan;
    return this;
  }

   /**
   * Get lessThanLocationGreaterThan
   * @return lessThanLocationGreaterThan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LESS_THAN_LOCATION_GREATER_THAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValidationErrorDetailLocation getLessThanLocationGreaterThan() {
    return lessThanLocationGreaterThan;
  }


  @JsonProperty(JSON_PROPERTY_LESS_THAN_LOCATION_GREATER_THAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLessThanLocationGreaterThan(ValidationErrorDetailLocation lessThanLocationGreaterThan) {
    this.lessThanLocationGreaterThan = lessThanLocationGreaterThan;
  }


  /**
   * Return true if this ValidationError_detail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorDetail validationErrorDetail = (ValidationErrorDetail) o;
    return Objects.equals(this.lessThanLocationGreaterThan, validationErrorDetail.lessThanLocationGreaterThan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lessThanLocationGreaterThan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorDetail {\n");
    sb.append("    lessThanLocationGreaterThan: ").append(toIndentedString(lessThanLocationGreaterThan)).append("\n");
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

