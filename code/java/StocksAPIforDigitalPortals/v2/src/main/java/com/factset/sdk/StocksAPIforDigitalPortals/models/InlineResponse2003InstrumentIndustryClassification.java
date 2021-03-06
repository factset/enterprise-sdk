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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2003InstrumentIndustryClassificationRbics;
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
 * Industry classification.
 */
@ApiModel(description = "Industry classification.")
@JsonPropertyOrder({
  InlineResponse2003InstrumentIndustryClassification.JSON_PROPERTY_RBICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003InstrumentIndustryClassification implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RBICS = "rbics";
  private java.util.List<InlineResponse2003InstrumentIndustryClassificationRbics> rbics = null;

  public InlineResponse2003InstrumentIndustryClassification() { 
  }

  public InlineResponse2003InstrumentIndustryClassification rbics(java.util.List<InlineResponse2003InstrumentIndustryClassificationRbics> rbics) {
    this.rbics = rbics;
    return this;
  }

  public InlineResponse2003InstrumentIndustryClassification addRbicsItem(InlineResponse2003InstrumentIndustryClassificationRbics rbicsItem) {
    if (this.rbics == null) {
      this.rbics = new java.util.ArrayList<>();
    }
    this.rbics.add(rbicsItem);
    return this;
  }

   /**
   * Classification based on FactSet Revere Business Industry Classification System (RBICS). The categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity. See endpoint &#x60;/category/listBySystem&#x60; for category system 48 for possible values.
   * @return rbics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Classification based on FactSet Revere Business Industry Classification System (RBICS). The categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity. See endpoint `/category/listBySystem` for category system 48 for possible values.")
  @JsonProperty(JSON_PROPERTY_RBICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2003InstrumentIndustryClassificationRbics> getRbics() {
    return rbics;
  }


  @JsonProperty(JSON_PROPERTY_RBICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRbics(java.util.List<InlineResponse2003InstrumentIndustryClassificationRbics> rbics) {
    this.rbics = rbics;
  }


  /**
   * Return true if this inline_response_200_3_instrument_industryClassification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003InstrumentIndustryClassification inlineResponse2003InstrumentIndustryClassification = (InlineResponse2003InstrumentIndustryClassification) o;
    return Objects.equals(this.rbics, inlineResponse2003InstrumentIndustryClassification.rbics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rbics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003InstrumentIndustryClassification {\n");
    sb.append("    rbics: ").append(toIndentedString(rbics)).append("\n");
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

