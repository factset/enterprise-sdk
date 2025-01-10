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
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsAttributeValueString;
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
 * The total amount of premiums collected by an insurance company from policyholders before taking into account any expenses or claims payments
 */
@ApiModel(description = "The total amount of premiums collected by an insurance company from policyholders before taking into account any expenses or claims payments")
@JsonPropertyOrder({
  KeyStatsDataObjectEntityGrossPremiums.JSON_PROPERTY_LABEL,
  KeyStatsDataObjectEntityGrossPremiums.JSON_PROPERTY_META,
  KeyStatsDataObjectEntityGrossPremiums.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class KeyStatsDataObjectEntityGrossPremiums implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LABEL = "label";
  private KeyStatsAttributeLabel label;

  public static final String JSON_PROPERTY_META = "meta";
  private KeyStatsAttributeMeta meta;

  public static final String JSON_PROPERTY_VALUE = "value";
  private KeyStatsAttributeValueString value;

  public KeyStatsDataObjectEntityGrossPremiums() { 
  }

  @JsonCreator
  public KeyStatsDataObjectEntityGrossPremiums(
    @JsonProperty(value=JSON_PROPERTY_LABEL, required=true) KeyStatsAttributeLabel label, 
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) KeyStatsAttributeValueString value
  ) {
    this();
    this.label = label;
    this.value = value;
  }

  public KeyStatsDataObjectEntityGrossPremiums label(KeyStatsAttributeLabel label) {
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


  public KeyStatsDataObjectEntityGrossPremiums meta(KeyStatsAttributeMeta meta) {
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


  public KeyStatsDataObjectEntityGrossPremiums value(KeyStatsAttributeValueString value) {
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

  public KeyStatsAttributeValueString getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(KeyStatsAttributeValueString value) {
    this.value = value;
  }


  /**
   * Return true if this KeyStatsDataObjectEntity_grossPremiums object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyStatsDataObjectEntityGrossPremiums keyStatsDataObjectEntityGrossPremiums = (KeyStatsDataObjectEntityGrossPremiums) o;
    return Objects.equals(this.label, keyStatsDataObjectEntityGrossPremiums.label) &&
        Objects.equals(this.meta, keyStatsDataObjectEntityGrossPremiums.meta) &&
        Objects.equals(this.value, keyStatsDataObjectEntityGrossPremiums.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, meta, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyStatsDataObjectEntityGrossPremiums {\n");
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

