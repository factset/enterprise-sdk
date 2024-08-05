/*
 * Publisher API
 * Allow clients to fetch Publisher Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Publisher.models;

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
import com.factset.sdk.Publisher.JSON;


/**
 * The date parameters for PA calculation.
 */
@ApiModel(description = "The date parameters for PA calculation.")
@JsonPropertyOrder({
  PADateParameters.JSON_PROPERTY_STARTDATE,
  PADateParameters.JSON_PROPERTY_ENDDATE,
  PADateParameters.JSON_PROPERTY_FREQUENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PADateParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STARTDATE = "startdate";
  private String startdate;

  public static final String JSON_PROPERTY_ENDDATE = "enddate";
  private String enddate;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private String frequency;

  public PADateParameters() { 
  }

  @JsonCreator
  public PADateParameters(
    @JsonProperty(value=JSON_PROPERTY_ENDDATE, required=true) String enddate, 
    @JsonProperty(value=JSON_PROPERTY_FREQUENCY, required=true) String frequency
  ) {
    this();
    this.enddate = enddate;
    this.frequency = frequency;
  }

  public PADateParameters startdate(String startdate) {
    this.startdate = startdate;
    return this;
  }

   /**
   * Calculation&#39;s start date.
   * @return startdate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Calculation's start date.")
  @JsonProperty(JSON_PROPERTY_STARTDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartdate() {
    return startdate;
  }


  @JsonProperty(JSON_PROPERTY_STARTDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartdate(String startdate) {
    this.startdate = startdate;
  }


  public PADateParameters enddate(String enddate) {
    this.enddate = enddate;
    return this;
  }

   /**
   * Calculation&#39;s end date.
   * @return enddate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Calculation's end date.")
  @JsonProperty(JSON_PROPERTY_ENDDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnddate() {
    return enddate;
  }


  @JsonProperty(JSON_PROPERTY_ENDDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnddate(String enddate) {
    this.enddate = enddate;
  }


  public PADateParameters frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Calculation&#39;s frequency.
   * @return frequency
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Calculation's frequency.")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }


  /**
   * Return true if this PADateParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PADateParameters paDateParameters = (PADateParameters) o;
    return Objects.equals(this.startdate, paDateParameters.startdate) &&
        Objects.equals(this.enddate, paDateParameters.enddate) &&
        Objects.equals(this.frequency, paDateParameters.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startdate, enddate, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PADateParameters {\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    enddate: ").append(toIndentedString(enddate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

