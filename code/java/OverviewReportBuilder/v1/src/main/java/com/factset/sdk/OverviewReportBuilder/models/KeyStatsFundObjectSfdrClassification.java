/*
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OverviewReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectRange52WeekValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OverviewReportBuilder.JSON;


/**
 * Article 6 - Fund is not ESG but makes disclosures on the integration of sustainable risks. Article 8 - Preferences for products having ESG Characteristics. Article 9 - Preferences for products having Sustainable Objectives. Article 0 - The type or structure of the fund is out of ESG requirements. NA - No information available.
 */
@ApiModel(description = "Article 6 - Fund is not ESG but makes disclosures on the integration of sustainable risks. Article 8 - Preferences for products having ESG Characteristics. Article 9 - Preferences for products having Sustainable Objectives. Article 0 - The type or structure of the fund is out of ESG requirements. NA - No information available.")
@JsonPropertyOrder({
  KeyStatsFundObjectSfdrClassification.JSON_PROPERTY_VALUE,
  KeyStatsFundObjectSfdrClassification.JSON_PROPERTY_LABEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyStatsFundObjectSfdrClassification implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private KeyStatsEntityObjectRange52WeekValue value;

  public static final String JSON_PROPERTY_LABEL = "label";
  private KeyStatsEntityObjectRange52WeekValue label;

  public KeyStatsFundObjectSfdrClassification() { 
  }

  @JsonCreator
  public KeyStatsFundObjectSfdrClassification(
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) KeyStatsEntityObjectRange52WeekValue value, 
    @JsonProperty(value=JSON_PROPERTY_LABEL, required=true) KeyStatsEntityObjectRange52WeekValue label
  ) {
    this();
    this.value = value;
    this.label = label;
  }

  public KeyStatsFundObjectSfdrClassification value(KeyStatsEntityObjectRange52WeekValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeyStatsEntityObjectRange52WeekValue getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(KeyStatsEntityObjectRange52WeekValue value) {
    this.value = value;
  }


  public KeyStatsFundObjectSfdrClassification label(KeyStatsEntityObjectRange52WeekValue label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeyStatsEntityObjectRange52WeekValue getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(KeyStatsEntityObjectRange52WeekValue label) {
    this.label = label;
  }


  /**
   * Return true if this KeyStatsFundObject_sfdrClassification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyStatsFundObjectSfdrClassification keyStatsFundObjectSfdrClassification = (KeyStatsFundObjectSfdrClassification) o;
    return Objects.equals(this.value, keyStatsFundObjectSfdrClassification.value) &&
        Objects.equals(this.label, keyStatsFundObjectSfdrClassification.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyStatsFundObjectSfdrClassification {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
