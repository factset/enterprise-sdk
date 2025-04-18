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
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsAttributeMetaCurrencyCode;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsAttributeMetaPeriodicity;
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
 * KeyStatsAttributeMeta
 */
@JsonPropertyOrder({
  KeyStatsAttributeMeta.JSON_PROPERTY_CURRENCY_CODE,
  KeyStatsAttributeMeta.JSON_PROPERTY_CURRENCY_SYMBOL,
  KeyStatsAttributeMeta.JSON_PROPERTY_METRIC_TYPE,
  KeyStatsAttributeMeta.JSON_PROPERTY_PERIODICITY,
  KeyStatsAttributeMeta.JSON_PROPERTY_TICKER,
  KeyStatsAttributeMeta.JSON_PROPERTY_UNITS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class KeyStatsAttributeMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private KeyStatsAttributeMetaCurrencyCode currencyCode;

  public static final String JSON_PROPERTY_CURRENCY_SYMBOL = "currencySymbol";
  private KeyStatsAttributeMetaCurrencyCode currencySymbol;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metricType";
  private KeyStatsAttributeMetaCurrencyCode metricType;

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private KeyStatsAttributeMetaPeriodicity periodicity;

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private KeyStatsAttributeMetaCurrencyCode ticker;

  public static final String JSON_PROPERTY_UNITS = "units";
  private KeyStatsAttributeMetaCurrencyCode units;

  public KeyStatsAttributeMeta() { 
  }

  public KeyStatsAttributeMeta currencyCode(KeyStatsAttributeMetaCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsAttributeMetaCurrencyCode getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(KeyStatsAttributeMetaCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }


  public KeyStatsAttributeMeta currencySymbol(KeyStatsAttributeMetaCurrencyCode currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Get currencySymbol
   * @return currencySymbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsAttributeMetaCurrencyCode getCurrencySymbol() {
    return currencySymbol;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencySymbol(KeyStatsAttributeMetaCurrencyCode currencySymbol) {
    this.currencySymbol = currencySymbol;
  }


  public KeyStatsAttributeMeta metricType(KeyStatsAttributeMetaCurrencyCode metricType) {
    this.metricType = metricType;
    return this;
  }

   /**
   * Get metricType
   * @return metricType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsAttributeMetaCurrencyCode getMetricType() {
    return metricType;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricType(KeyStatsAttributeMetaCurrencyCode metricType) {
    this.metricType = metricType;
  }


  public KeyStatsAttributeMeta periodicity(KeyStatsAttributeMetaPeriodicity periodicity) {
    this.periodicity = periodicity;
    return this;
  }

   /**
   * Get periodicity
   * @return periodicity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsAttributeMetaPeriodicity getPeriodicity() {
    return periodicity;
  }


  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodicity(KeyStatsAttributeMetaPeriodicity periodicity) {
    this.periodicity = periodicity;
  }


  public KeyStatsAttributeMeta ticker(KeyStatsAttributeMetaCurrencyCode ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Get ticker
   * @return ticker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsAttributeMetaCurrencyCode getTicker() {
    return ticker;
  }


  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTicker(KeyStatsAttributeMetaCurrencyCode ticker) {
    this.ticker = ticker;
  }


  public KeyStatsAttributeMeta units(KeyStatsAttributeMetaCurrencyCode units) {
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsAttributeMetaCurrencyCode getUnits() {
    return units;
  }


  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnits(KeyStatsAttributeMetaCurrencyCode units) {
    this.units = units;
  }


  /**
   * Return true if this KeyStatsAttributeMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyStatsAttributeMeta keyStatsAttributeMeta = (KeyStatsAttributeMeta) o;
    return Objects.equals(this.currencyCode, keyStatsAttributeMeta.currencyCode) &&
        Objects.equals(this.currencySymbol, keyStatsAttributeMeta.currencySymbol) &&
        Objects.equals(this.metricType, keyStatsAttributeMeta.metricType) &&
        Objects.equals(this.periodicity, keyStatsAttributeMeta.periodicity) &&
        Objects.equals(this.ticker, keyStatsAttributeMeta.ticker) &&
        Objects.equals(this.units, keyStatsAttributeMeta.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencySymbol, metricType, periodicity, ticker, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyStatsAttributeMeta {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

