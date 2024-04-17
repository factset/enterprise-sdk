/*
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OptimizationEngineAPIMultiperiod.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.VARDistributionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.JSON;


/**
 * VARDistributionDescription
 */
@JsonPropertyOrder({
  VARDistributionDescription.JSON_PROPERTY_RISK_MODEL,
  VARDistributionDescription.JSON_PROPERTY_FACTOR_GROUP,
  VARDistributionDescription.JSON_PROPERTY_FACTORS,
  VARDistributionDescription.JSON_PROPERTY_DISTRIBUTION_TYPE,
  VARDistributionDescription.JSON_PROPERTY_REPORT_DATE,
  VARDistributionDescription.JSON_PROPERTY_REPORT_CURRENCY,
  VARDistributionDescription.JSON_PROPERTY_HORIZON_IN_TRADING_DAYS,
  VARDistributionDescription.JSON_PROPERTY_RETURN_DATES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VARDistributionDescription implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RISK_MODEL = "riskModel";
  private String riskModel;

  public static final String JSON_PROPERTY_FACTOR_GROUP = "factorGroup";
  private String factorGroup;

  public static final String JSON_PROPERTY_FACTORS = "factors";
  private java.util.List<String> factors = null;

  public static final String JSON_PROPERTY_DISTRIBUTION_TYPE = "distributionType";
  private VARDistributionType distributionType;

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private Integer reportDate;

  public static final String JSON_PROPERTY_REPORT_CURRENCY = "reportCurrency";
  private String reportCurrency;

  public static final String JSON_PROPERTY_HORIZON_IN_TRADING_DAYS = "horizonInTradingDays";
  private Float horizonInTradingDays;

  public static final String JSON_PROPERTY_RETURN_DATES = "returnDates";
  private java.util.List<Integer> returnDates = null;

  public VARDistributionDescription() { 
  }

  public VARDistributionDescription riskModel(String riskModel) {
    this.riskModel = riskModel;
    return this;
  }

   /**
   * Get riskModel
   * @return riskModel
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskModel() {
    return riskModel;
  }


  @JsonProperty(JSON_PROPERTY_RISK_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskModel(String riskModel) {
    this.riskModel = riskModel;
  }


  public VARDistributionDescription factorGroup(String factorGroup) {
    this.factorGroup = factorGroup;
    return this;
  }

   /**
   * Get factorGroup
   * @return factorGroup
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FACTOR_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFactorGroup() {
    return factorGroup;
  }


  @JsonProperty(JSON_PROPERTY_FACTOR_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactorGroup(String factorGroup) {
    this.factorGroup = factorGroup;
  }


  public VARDistributionDescription factors(java.util.List<String> factors) {
    this.factors = factors;
    return this;
  }

  public VARDistributionDescription addFactorsItem(String factorsItem) {
    if (this.factors == null) {
      this.factors = new java.util.ArrayList<>();
    }
    this.factors.add(factorsItem);
    return this;
  }

   /**
   * Get factors
   * @return factors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getFactors() {
    return factors;
  }


  @JsonProperty(JSON_PROPERTY_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactors(java.util.List<String> factors) {
    this.factors = factors;
  }


  public VARDistributionDescription distributionType(VARDistributionType distributionType) {
    this.distributionType = distributionType;
    return this;
  }

   /**
   * Get distributionType
   * @return distributionType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VARDistributionType getDistributionType() {
    return distributionType;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributionType(VARDistributionType distributionType) {
    this.distributionType = distributionType;
  }


  public VARDistributionDescription reportDate(Integer reportDate) {
    this.reportDate = reportDate;
    return this;
  }

   /**
   * Get reportDate
   * @return reportDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReportDate() {
    return reportDate;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportDate(Integer reportDate) {
    this.reportDate = reportDate;
  }


  public VARDistributionDescription reportCurrency(String reportCurrency) {
    this.reportCurrency = reportCurrency;
    return this;
  }

   /**
   * Get reportCurrency
   * @return reportCurrency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportCurrency() {
    return reportCurrency;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportCurrency(String reportCurrency) {
    this.reportCurrency = reportCurrency;
  }


  public VARDistributionDescription horizonInTradingDays(Float horizonInTradingDays) {
    this.horizonInTradingDays = horizonInTradingDays;
    return this;
  }

   /**
   * Get horizonInTradingDays
   * @return horizonInTradingDays
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HORIZON_IN_TRADING_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getHorizonInTradingDays() {
    return horizonInTradingDays;
  }


  @JsonProperty(JSON_PROPERTY_HORIZON_IN_TRADING_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHorizonInTradingDays(Float horizonInTradingDays) {
    this.horizonInTradingDays = horizonInTradingDays;
  }


  public VARDistributionDescription returnDates(java.util.List<Integer> returnDates) {
    this.returnDates = returnDates;
    return this;
  }

  public VARDistributionDescription addReturnDatesItem(Integer returnDatesItem) {
    if (this.returnDates == null) {
      this.returnDates = new java.util.ArrayList<>();
    }
    this.returnDates.add(returnDatesItem);
    return this;
  }

   /**
   * Only possibly defined for historical distributions
   * @return returnDates
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Only possibly defined for historical distributions")
  @JsonProperty(JSON_PROPERTY_RETURN_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Integer> getReturnDates() {
    return returnDates;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnDates(java.util.List<Integer> returnDates) {
    this.returnDates = returnDates;
  }


  /**
   * Return true if this VAR.DistributionDescription object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VARDistributionDescription vaRDistributionDescription = (VARDistributionDescription) o;
    return Objects.equals(this.riskModel, vaRDistributionDescription.riskModel) &&
        Objects.equals(this.factorGroup, vaRDistributionDescription.factorGroup) &&
        Objects.equals(this.factors, vaRDistributionDescription.factors) &&
        Objects.equals(this.distributionType, vaRDistributionDescription.distributionType) &&
        Objects.equals(this.reportDate, vaRDistributionDescription.reportDate) &&
        Objects.equals(this.reportCurrency, vaRDistributionDescription.reportCurrency) &&
        Objects.equals(this.horizonInTradingDays, vaRDistributionDescription.horizonInTradingDays) &&
        Objects.equals(this.returnDates, vaRDistributionDescription.returnDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskModel, factorGroup, factors, distributionType, reportDate, reportCurrency, horizonInTradingDays, returnDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VARDistributionDescription {\n");
    sb.append("    riskModel: ").append(toIndentedString(riskModel)).append("\n");
    sb.append("    factorGroup: ").append(toIndentedString(factorGroup)).append("\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
    sb.append("    distributionType: ").append(toIndentedString(distributionType)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    reportCurrency: ").append(toIndentedString(reportCurrency)).append("\n");
    sb.append("    horizonInTradingDays: ").append(toIndentedString(horizonInTradingDays)).append("\n");
    sb.append("    returnDates: ").append(toIndentedString(returnDates)).append("\n");
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

