/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.21.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OpenRisk.models.AdditionalCalculationInputsMarketExcess;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * Additional user-defined calculation input values. For example, some may be required for some Risk-Based Performance Attribution (RBPA) stats, such as &#39;ResidualFactorReturnsCSR&#39; and &#39;DeannualizedActiveFactorRisk&#39;.
 */
@ApiModel(description = "Additional user-defined calculation input values. For example, some may be required for some Risk-Based Performance Attribution (RBPA) stats, such as 'ResidualFactorReturnsCSR' and 'DeannualizedActiveFactorRisk'.")
@JsonPropertyOrder({
  AdditionalCalculationInputs.JSON_PROPERTY_MARKET_EXCESS,
  AdditionalCalculationInputs.JSON_PROPERTY_CALCULATION_PERIODS_PER_YEAR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdditionalCalculationInputs implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MARKET_EXCESS = "marketExcess";
  private AdditionalCalculationInputsMarketExcess marketExcess;

  public static final String JSON_PROPERTY_CALCULATION_PERIODS_PER_YEAR = "calculationPeriodsPerYear";
  private Integer calculationPeriodsPerYear;

  public AdditionalCalculationInputs() { 
  }

  public AdditionalCalculationInputs marketExcess(AdditionalCalculationInputsMarketExcess marketExcess) {
    this.marketExcess = marketExcess;
    return this;
  }

   /**
   * Get marketExcess
   * @return marketExcess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKET_EXCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdditionalCalculationInputsMarketExcess getMarketExcess() {
    return marketExcess;
  }


  @JsonProperty(JSON_PROPERTY_MARKET_EXCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketExcess(AdditionalCalculationInputsMarketExcess marketExcess) {
    this.marketExcess = marketExcess;
  }


  public AdditionalCalculationInputs calculationPeriodsPerYear(Integer calculationPeriodsPerYear) {
    this.calculationPeriodsPerYear = calculationPeriodsPerYear;
    return this;
  }

   /**
   * Deannualization factor for certain RBPA risk statistics which should match that of desired calculation frequency. Examples: If the risk model is monthly or monthly factor returns are being used, this should be 12. If the risk model is daily, select desired integer such as 365 or 252.
   * minimum: 1
   * maximum: 365
   * @return calculationPeriodsPerYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deannualization factor for certain RBPA risk statistics which should match that of desired calculation frequency. Examples: If the risk model is monthly or monthly factor returns are being used, this should be 12. If the risk model is daily, select desired integer such as 365 or 252.")
  @JsonProperty(JSON_PROPERTY_CALCULATION_PERIODS_PER_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCalculationPeriodsPerYear() {
    return calculationPeriodsPerYear;
  }


  @JsonProperty(JSON_PROPERTY_CALCULATION_PERIODS_PER_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalculationPeriodsPerYear(Integer calculationPeriodsPerYear) {
    this.calculationPeriodsPerYear = calculationPeriodsPerYear;
  }


  /**
   * Return true if this AdditionalCalculationInputs object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalCalculationInputs additionalCalculationInputs = (AdditionalCalculationInputs) o;
    return Objects.equals(this.marketExcess, additionalCalculationInputs.marketExcess) &&
        Objects.equals(this.calculationPeriodsPerYear, additionalCalculationInputs.calculationPeriodsPerYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketExcess, calculationPeriodsPerYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalCalculationInputs {\n");
    sb.append("    marketExcess: ").append(toIndentedString(marketExcess)).append("\n");
    sb.append("    calculationPeriodsPerYear: ").append(toIndentedString(calculationPeriodsPerYear)).append("\n");
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
