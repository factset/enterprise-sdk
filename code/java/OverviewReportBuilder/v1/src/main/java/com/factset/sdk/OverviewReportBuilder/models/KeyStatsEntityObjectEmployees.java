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
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectAverageDailyVolValue;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectRange52WeekValue;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectRevenueAsOfDate;
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
 * The total count of individuals who are employed by a company
 */
@ApiModel(description = "The total count of individuals who are employed by a company")
@JsonPropertyOrder({
  KeyStatsEntityObjectEmployees.JSON_PROPERTY_VALUE,
  KeyStatsEntityObjectEmployees.JSON_PROPERTY_LABEL,
  KeyStatsEntityObjectEmployees.JSON_PROPERTY_AS_OF_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class KeyStatsEntityObjectEmployees implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private KeyStatsEntityObjectAverageDailyVolValue value;

  public static final String JSON_PROPERTY_LABEL = "label";
  private KeyStatsEntityObjectRange52WeekValue label;

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private KeyStatsEntityObjectRevenueAsOfDate asOfDate;

  public KeyStatsEntityObjectEmployees() { 
  }

  @JsonCreator
  public KeyStatsEntityObjectEmployees(
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) KeyStatsEntityObjectAverageDailyVolValue value, 
    @JsonProperty(value=JSON_PROPERTY_LABEL, required=true) KeyStatsEntityObjectRange52WeekValue label
  ) {
    this();
    this.value = value;
    this.label = label;
  }

  public KeyStatsEntityObjectEmployees value(KeyStatsEntityObjectAverageDailyVolValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeyStatsEntityObjectAverageDailyVolValue getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(KeyStatsEntityObjectAverageDailyVolValue value) {
    this.value = value;
  }


  public KeyStatsEntityObjectEmployees label(KeyStatsEntityObjectRange52WeekValue label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @jakarta.annotation.Nonnull
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


  public KeyStatsEntityObjectEmployees asOfDate(KeyStatsEntityObjectRevenueAsOfDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * Get asOfDate
   * @return asOfDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsEntityObjectRevenueAsOfDate getAsOfDate() {
    return asOfDate;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsOfDate(KeyStatsEntityObjectRevenueAsOfDate asOfDate) {
    this.asOfDate = asOfDate;
  }


  /**
   * Return true if this KeyStatsEntityObject_employees object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyStatsEntityObjectEmployees keyStatsEntityObjectEmployees = (KeyStatsEntityObjectEmployees) o;
    return Objects.equals(this.value, keyStatsEntityObjectEmployees.value) &&
        Objects.equals(this.label, keyStatsEntityObjectEmployees.label) &&
        Objects.equals(this.asOfDate, keyStatsEntityObjectEmployees.asOfDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, label, asOfDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyStatsEntityObjectEmployees {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
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

