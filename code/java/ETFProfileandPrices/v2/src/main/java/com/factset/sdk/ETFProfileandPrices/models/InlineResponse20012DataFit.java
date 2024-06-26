/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ETFProfileandPrices.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Fit.
 */
@ApiModel(description = "Fit.")
@JsonPropertyOrder({
  InlineResponse20012DataFit.JSON_PROPERTY_VALUE,
  InlineResponse20012DataFit.JSON_PROPERTY_AVERAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20012DataFit implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_AVERAGE = "average";
  private BigDecimal average;

  public InlineResponse20012DataFit() { 
  }

  public InlineResponse20012DataFit value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * A measure of the exposure a fund provides relative to its FactSet designated &#39;Segment Benchmark&#39;. Scored in the range 0 (low) to 100 (high), with higher scores indicating better alignment with the performance and holdings of the Segment Benchmark. Available for the regions: US.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A measure of the exposure a fund provides relative to its FactSet designated 'Segment Benchmark'. Scored in the range 0 (low) to 100 (high), with higher scores indicating better alignment with the performance and holdings of the Segment Benchmark. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public InlineResponse20012DataFit average(BigDecimal average) {
    this.average = average;
    return this;
  }

   /**
   * The average Fit score for all funds in the segment. Available for the regions: US.
   * @return average
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The average Fit score for all funds in the segment. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAverage() {
    return average;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverage(BigDecimal average) {
    this.average = average;
  }


  /**
   * Return true if this inline_response_200_12_data_fit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012DataFit inlineResponse20012DataFit = (InlineResponse20012DataFit) o;
    return Objects.equals(this.value, inlineResponse20012DataFit.value) &&
        Objects.equals(this.average, inlineResponse20012DataFit.average);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, average);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012DataFit {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
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

