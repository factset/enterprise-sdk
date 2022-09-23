/*
 * FactSet Overview Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
import com.factset.sdk.OverviewReportBuilder.models.DataPointMeta;
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
import com.factset.sdk.OverviewReportBuilder.JSON;


/**
 * ProfileDataStagePevcLatestPostMoneyValuation
 */
@JsonPropertyOrder({
  ProfileDataStagePevcLatestPostMoneyValuation.JSON_PROPERTY_VALUE,
  ProfileDataStagePevcLatestPostMoneyValuation.JSON_PROPERTY_AS_OF_DATE,
  ProfileDataStagePevcLatestPostMoneyValuation.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProfileDataStagePevcLatestPostMoneyValuation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private BigDecimal asOfDate;

  public static final String JSON_PROPERTY_META = "meta";
  private DataPointMeta meta;

  public ProfileDataStagePevcLatestPostMoneyValuation() { 
  }

  @JsonCreator
  public ProfileDataStagePevcLatestPostMoneyValuation(
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) BigDecimal value, 
    @JsonProperty(value=JSON_PROPERTY_AS_OF_DATE, required=true) BigDecimal asOfDate
  ) {
    this();
    this.value = value;
    this.asOfDate = asOfDate;
  }

  public ProfileDataStagePevcLatestPostMoneyValuation value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public ProfileDataStagePevcLatestPostMoneyValuation asOfDate(BigDecimal asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * Get asOfDate
   * @return asOfDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAsOfDate() {
    return asOfDate;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAsOfDate(BigDecimal asOfDate) {
    this.asOfDate = asOfDate;
  }


  public ProfileDataStagePevcLatestPostMoneyValuation meta(DataPointMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataPointMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(DataPointMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this ProfileData_stage_pevcLatestPostMoneyValuation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileDataStagePevcLatestPostMoneyValuation profileDataStagePevcLatestPostMoneyValuation = (ProfileDataStagePevcLatestPostMoneyValuation) o;
    return Objects.equals(this.value, profileDataStagePevcLatestPostMoneyValuation.value) &&
        Objects.equals(this.asOfDate, profileDataStagePevcLatestPostMoneyValuation.asOfDate) &&
        Objects.equals(this.meta, profileDataStagePevcLatestPostMoneyValuation.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, asOfDate, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDataStagePevcLatestPostMoneyValuation {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
