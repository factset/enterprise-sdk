/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

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
import com.factset.sdk.FactSetSearchAnswers.JSON;


/**
 * ValueLabelDateTextBlockTemplateAllOf
 */
@JsonPropertyOrder({
  ValueLabelDateTextBlockTemplateAllOf.JSON_PROPERTY_VALUE,
  ValueLabelDateTextBlockTemplateAllOf.JSON_PROPERTY_LABEL,
  ValueLabelDateTextBlockTemplateAllOf.JSON_PROPERTY_DATE,
  ValueLabelDateTextBlockTemplateAllOf.JSON_PROPERTY_BLURB
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValueLabelDateTextBlockTemplateAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_BLURB = "blurb";
  private String blurb;

  public ValueLabelDateTextBlockTemplateAllOf() { 
  }

  public ValueLabelDateTextBlockTemplateAllOf value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ValueLabelDateTextBlockTemplateAllOf label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public ValueLabelDateTextBlockTemplateAllOf date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public ValueLabelDateTextBlockTemplateAllOf blurb(String blurb) {
    this.blurb = blurb;
    return this;
  }

   /**
   * Get blurb
   * @return blurb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BLURB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBlurb() {
    return blurb;
  }


  @JsonProperty(JSON_PROPERTY_BLURB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlurb(String blurb) {
    this.blurb = blurb;
  }


  /**
   * Return true if this ValueLabelDateTextBlockTemplate_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueLabelDateTextBlockTemplateAllOf valueLabelDateTextBlockTemplateAllOf = (ValueLabelDateTextBlockTemplateAllOf) o;
    return Objects.equals(this.value, valueLabelDateTextBlockTemplateAllOf.value) &&
        Objects.equals(this.label, valueLabelDateTextBlockTemplateAllOf.label) &&
        Objects.equals(this.date, valueLabelDateTextBlockTemplateAllOf.date) &&
        Objects.equals(this.blurb, valueLabelDateTextBlockTemplateAllOf.blurb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, label, date, blurb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueLabelDateTextBlockTemplateAllOf {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    blurb: ").append(toIndentedString(blurb)).append("\n");
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

