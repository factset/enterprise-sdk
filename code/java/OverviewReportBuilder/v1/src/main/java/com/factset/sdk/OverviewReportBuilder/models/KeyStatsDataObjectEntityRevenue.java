/*
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
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
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsAttributeLabel;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsAttributeMeta;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsAttributeValueNumber;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityEmployeesAsOfDate;
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
 * The total amount of money that a company earns from its primary business activities, such as the sale of goods or services, before deducting any expenses or taxes
 */
@ApiModel(description = "The total amount of money that a company earns from its primary business activities, such as the sale of goods or services, before deducting any expenses or taxes")
@JsonPropertyOrder({
  KeyStatsDataObjectEntityRevenue.JSON_PROPERTY_AS_OF_DATE,
  KeyStatsDataObjectEntityRevenue.JSON_PROPERTY_LABEL,
  KeyStatsDataObjectEntityRevenue.JSON_PROPERTY_META,
  KeyStatsDataObjectEntityRevenue.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class KeyStatsDataObjectEntityRevenue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private KeyStatsDataObjectEntityEmployeesAsOfDate asOfDate;

  public static final String JSON_PROPERTY_LABEL = "label";
  private KeyStatsAttributeLabel label;

  public static final String JSON_PROPERTY_META = "meta";
  private KeyStatsAttributeMeta meta;

  public static final String JSON_PROPERTY_VALUE = "value";
  private KeyStatsAttributeValueNumber value;

  public KeyStatsDataObjectEntityRevenue() { 
  }

  @JsonCreator
  public KeyStatsDataObjectEntityRevenue(
    @JsonProperty(value=JSON_PROPERTY_LABEL, required=true) KeyStatsAttributeLabel label, 
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) KeyStatsAttributeValueNumber value
  ) {
    this();
    this.label = label;
    this.value = value;
  }

  public KeyStatsDataObjectEntityRevenue asOfDate(KeyStatsDataObjectEntityEmployeesAsOfDate asOfDate) {
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

  public KeyStatsDataObjectEntityEmployeesAsOfDate getAsOfDate() {
    return asOfDate;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsOfDate(KeyStatsDataObjectEntityEmployeesAsOfDate asOfDate) {
    this.asOfDate = asOfDate;
  }


  public KeyStatsDataObjectEntityRevenue label(KeyStatsAttributeLabel label) {
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

  public KeyStatsAttributeLabel getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(KeyStatsAttributeLabel label) {
    this.label = label;
  }


  public KeyStatsDataObjectEntityRevenue meta(KeyStatsAttributeMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsAttributeMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(KeyStatsAttributeMeta meta) {
    this.meta = meta;
  }


  public KeyStatsDataObjectEntityRevenue value(KeyStatsAttributeValueNumber value) {
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

  public KeyStatsAttributeValueNumber getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(KeyStatsAttributeValueNumber value) {
    this.value = value;
  }


  /**
   * Return true if this KeyStatsDataObjectEntity_revenue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyStatsDataObjectEntityRevenue keyStatsDataObjectEntityRevenue = (KeyStatsDataObjectEntityRevenue) o;
    return Objects.equals(this.asOfDate, keyStatsDataObjectEntityRevenue.asOfDate) &&
        Objects.equals(this.label, keyStatsDataObjectEntityRevenue.label) &&
        Objects.equals(this.meta, keyStatsDataObjectEntityRevenue.meta) &&
        Objects.equals(this.value, keyStatsDataObjectEntityRevenue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, label, meta, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyStatsDataObjectEntityRevenue {\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

