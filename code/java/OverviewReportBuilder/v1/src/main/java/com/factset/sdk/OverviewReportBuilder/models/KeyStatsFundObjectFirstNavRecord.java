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
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectFirstDateValue;
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
 * Returns the first NAV record available in FactSet’s database. This may not equal the first trading record of the fund.
 */
@ApiModel(description = "Returns the first NAV record available in FactSet’s database. This may not equal the first trading record of the fund.")
@JsonPropertyOrder({
  KeyStatsFundObjectFirstNavRecord.JSON_PROPERTY_VALUE,
  KeyStatsFundObjectFirstNavRecord.JSON_PROPERTY_LABEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class KeyStatsFundObjectFirstNavRecord implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private KeyStatsEntityObjectFirstDateValue value;

  public static final String JSON_PROPERTY_LABEL = "label";
  private KeyStatsEntityObjectRange52WeekValue label;

  public KeyStatsFundObjectFirstNavRecord() { 
  }

  @JsonCreator
  public KeyStatsFundObjectFirstNavRecord(
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) KeyStatsEntityObjectFirstDateValue value, 
    @JsonProperty(value=JSON_PROPERTY_LABEL, required=true) KeyStatsEntityObjectRange52WeekValue label
  ) {
    this();
    this.value = value;
    this.label = label;
  }

  public KeyStatsFundObjectFirstNavRecord value(KeyStatsEntityObjectFirstDateValue value) {
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

  public KeyStatsEntityObjectFirstDateValue getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(KeyStatsEntityObjectFirstDateValue value) {
    this.value = value;
  }


  public KeyStatsFundObjectFirstNavRecord label(KeyStatsEntityObjectRange52WeekValue label) {
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


  /**
   * Return true if this KeyStatsFundObject_firstNavRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyStatsFundObjectFirstNavRecord keyStatsFundObjectFirstNavRecord = (KeyStatsFundObjectFirstNavRecord) o;
    return Objects.equals(this.value, keyStatsFundObjectFirstNavRecord.value) &&
        Objects.equals(this.label, keyStatsFundObjectFirstNavRecord.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyStatsFundObjectFirstNavRecord {\n");
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

