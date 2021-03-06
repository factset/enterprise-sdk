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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataComplianceFrance;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Compliance properties. A given compliance property may appear in combination with other compliance properties. The attribute &#x60;count&#x60; represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes).
 */
@ApiModel(description = "Compliance properties. A given compliance property may appear in combination with other compliance properties. The attribute `count` represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint `/instrument/complianceProperty/list` for the full list of compliance properties associated with instruments (across all asset classes).")
@JsonPropertyOrder({
  InlineResponse2005DataCompliance.JSON_PROPERTY_FRANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataCompliance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FRANCE = "france";
  private java.util.List<InlineResponse2005DataComplianceFrance> france = null;

  public InlineResponse2005DataCompliance() { 
  }

  public InlineResponse2005DataCompliance france(java.util.List<InlineResponse2005DataComplianceFrance> france) {
    this.france = france;
    return this;
  }

  public InlineResponse2005DataCompliance addFranceItem(InlineResponse2005DataComplianceFrance franceItem) {
    if (this.france == null) {
      this.france = new java.util.ArrayList<>();
    }
    this.france.add(franceItem);
    return this;
  }

   /**
   * Compliance properties in accordance with the French law.
   * @return france
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Compliance properties in accordance with the French law.")
  @JsonProperty(JSON_PROPERTY_FRANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataComplianceFrance> getFrance() {
    return france;
  }


  @JsonProperty(JSON_PROPERTY_FRANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrance(java.util.List<InlineResponse2005DataComplianceFrance> france) {
    this.france = france;
  }


  /**
   * Return true if this inline_response_200_5_data_compliance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataCompliance inlineResponse2005DataCompliance = (InlineResponse2005DataCompliance) o;
    return Objects.equals(this.france, inlineResponse2005DataCompliance.france);
  }

  @Override
  public int hashCode() {
    return Objects.hash(france);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataCompliance {\n");
    sb.append("    france: ").append(toIndentedString(france)).append("\n");
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

