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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Impediments to creation.
 */
@ApiModel(description = "Impediments to creation.")
@JsonPropertyOrder({
  InlineResponse20013DataImpedimentsToCreation.JSON_PROPERTY_VALUE,
  InlineResponse20013DataImpedimentsToCreation.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20013DataImpedimentsToCreation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public InlineResponse20013DataImpedimentsToCreation() { 
  }

  public InlineResponse20013DataImpedimentsToCreation value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Indicates whether a fund is fully or partially closed to creations, or is likely to become fully or partially closed to creations. Values are None, Potential, Partial, Full. Available for the regions: US.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether a fund is fully or partially closed to creations, or is likely to become fully or partially closed to creations. Values are None, Potential, Partial, Full. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public InlineResponse20013DataImpedimentsToCreation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * States the reason why there is an impediment to creations. Available for the regions: US.
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "States the reason why there is an impediment to creations. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  /**
   * Return true if this inline_response_200_13_data_impedimentsToCreation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013DataImpedimentsToCreation inlineResponse20013DataImpedimentsToCreation = (InlineResponse20013DataImpedimentsToCreation) o;
    return Objects.equals(this.value, inlineResponse20013DataImpedimentsToCreation.value) &&
        Objects.equals(this.reason, inlineResponse20013DataImpedimentsToCreation.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013DataImpedimentsToCreation {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

