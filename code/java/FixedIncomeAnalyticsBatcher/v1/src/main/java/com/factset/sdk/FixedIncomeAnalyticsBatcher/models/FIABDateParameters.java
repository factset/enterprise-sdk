/*
 * FIAB API
 * Allow clients to fetch FIAB Analytics through APIs.
 *
 * The version of the OpenAPI document: 1.3.7
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeAnalyticsBatcher.models;

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
import com.factset.sdk.FixedIncomeAnalyticsBatcher.JSON;


/**
 * The date parameters for FIAB calculations.
 */
@ApiModel(description = "The date parameters for FIAB calculations.")
@JsonPropertyOrder({
  FIABDateParameters.JSON_PROPERTY_STARTDATE,
  FIABDateParameters.JSON_PROPERTY_ENDDATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FIABDateParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STARTDATE = "startdate";
  private String startdate;

  public static final String JSON_PROPERTY_ENDDATE = "enddate";
  private String enddate;

  public FIABDateParameters() { 
  }

  @JsonCreator
  public FIABDateParameters(
    @JsonProperty(value=JSON_PROPERTY_STARTDATE, required=true) String startdate, 
    @JsonProperty(value=JSON_PROPERTY_ENDDATE, required=true) String enddate
  ) {
    this();
    this.startdate = startdate;
    this.enddate = enddate;
  }

  public FIABDateParameters startdate(String startdate) {
    this.startdate = startdate;
    return this;
  }

   /**
   * Calculation&#39;s start date.
   * @return startdate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Calculation's start date.")
  @JsonProperty(JSON_PROPERTY_STARTDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartdate() {
    return startdate;
  }


  @JsonProperty(JSON_PROPERTY_STARTDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartdate(String startdate) {
    this.startdate = startdate;
  }


  public FIABDateParameters enddate(String enddate) {
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


  /**
   * Return true if this FIABDateParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIABDateParameters fiABDateParameters = (FIABDateParameters) o;
    return Objects.equals(this.startdate, fiABDateParameters.startdate) &&
        Objects.equals(this.enddate, fiABDateParameters.enddate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startdate, enddate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FIABDateParameters {\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    enddate: ").append(toIndentedString(enddate)).append("\n");
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

