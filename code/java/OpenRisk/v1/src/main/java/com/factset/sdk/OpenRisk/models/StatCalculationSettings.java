/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
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
import com.factset.sdk.OpenRisk.JSON;


/**
 * Settings to modify an individual statistic&#39;s calculation. See also [OA:17698](https://my.apps.factset.com/oa/pages/17698#risk) and [OA:16097](https://my.apps.factset.com/oa/pages/16097#cov2) for cov*2.
 */
@ApiModel(description = "Settings to modify an individual statistic's calculation. See also [OA:17698](https://my.apps.factset.com/oa/pages/17698#risk) and [OA:16097](https://my.apps.factset.com/oa/pages/16097#cov2) for cov*2.")
@JsonPropertyOrder({
  StatCalculationSettings.JSON_PROPERTY_USE_ABSOLUTE_WEIGHTS_FOR_LOT_EXPANSION,
  StatCalculationSettings.JSON_PROPERTY_COVARIANCE_TIMES_TWO,
  StatCalculationSettings.JSON_PROPERTY_COVARIANCE_TIMES_TWO_TERM,
  StatCalculationSettings.JSON_PROPERTY_CORRELATED_SPECIFIC_RISK,
  StatCalculationSettings.JSON_PROPERTY_SPARSE,
  StatCalculationSettings.JSON_PROPERTY_HORIZON,
  StatCalculationSettings.JSON_PROPERTY_DAYS_PER_YEAR,
  StatCalculationSettings.JSON_PROPERTY_CONFIDENCE_LEVEL,
  StatCalculationSettings.JSON_PROPERTY_LAMDA,
  StatCalculationSettings.JSON_PROPERTY_SPECIFIC_TO_FACTOR_RATIO,
  StatCalculationSettings.JSON_PROPERTY_RAP_SYS,
  StatCalculationSettings.JSON_PROPERTY_RAP_UNSYS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StatCalculationSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_USE_ABSOLUTE_WEIGHTS_FOR_LOT_EXPANSION = "useAbsoluteWeightsForLotExpansion";
  private Boolean useAbsoluteWeightsForLotExpansion = true;

  public static final String JSON_PROPERTY_COVARIANCE_TIMES_TWO = "covarianceTimesTwo";
  private Boolean covarianceTimesTwo = false;

  public static final String JSON_PROPERTY_COVARIANCE_TIMES_TWO_TERM = "covarianceTimesTwoTerm";
  private Boolean covarianceTimesTwoTerm = false;

  public static final String JSON_PROPERTY_CORRELATED_SPECIFIC_RISK = "correlatedSpecificRisk";
  private Boolean correlatedSpecificRisk = false;

  public static final String JSON_PROPERTY_SPARSE = "sparse";
  private Boolean sparse = false;

  public static final String JSON_PROPERTY_HORIZON = "horizon";
  private BigDecimal horizon;

  public static final String JSON_PROPERTY_DAYS_PER_YEAR = "daysPerYear";
  private BigDecimal daysPerYear;

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidenceLevel";
  private BigDecimal confidenceLevel;

  public static final String JSON_PROPERTY_LAMDA = "lamda";
  private BigDecimal lamda;

  public static final String JSON_PROPERTY_SPECIFIC_TO_FACTOR_RATIO = "specificToFactorRatio";
  private BigDecimal specificToFactorRatio;

  public static final String JSON_PROPERTY_RAP_SYS = "rapSys";
  private BigDecimal rapSys;

  public static final String JSON_PROPERTY_RAP_UNSYS = "rapUnsys";
  private BigDecimal rapUnsys;

  public StatCalculationSettings() { 
  }

  public StatCalculationSettings useAbsoluteWeightsForLotExpansion(Boolean useAbsoluteWeightsForLotExpansion) {
    this.useAbsoluteWeightsForLotExpansion = useAbsoluteWeightsForLotExpansion;
    return this;
  }

   /**
   * Get useAbsoluteWeightsForLotExpansion
   * @return useAbsoluteWeightsForLotExpansion
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_ABSOLUTE_WEIGHTS_FOR_LOT_EXPANSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseAbsoluteWeightsForLotExpansion() {
    return useAbsoluteWeightsForLotExpansion;
  }


  @JsonProperty(JSON_PROPERTY_USE_ABSOLUTE_WEIGHTS_FOR_LOT_EXPANSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseAbsoluteWeightsForLotExpansion(Boolean useAbsoluteWeightsForLotExpansion) {
    this.useAbsoluteWeightsForLotExpansion = useAbsoluteWeightsForLotExpansion;
  }


  public StatCalculationSettings covarianceTimesTwo(Boolean covarianceTimesTwo) {
    this.covarianceTimesTwo = covarianceTimesTwo;
    return this;
  }

   /**
   * Get covarianceTimesTwo
   * @return covarianceTimesTwo
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVARIANCE_TIMES_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCovarianceTimesTwo() {
    return covarianceTimesTwo;
  }


  @JsonProperty(JSON_PROPERTY_COVARIANCE_TIMES_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCovarianceTimesTwo(Boolean covarianceTimesTwo) {
    this.covarianceTimesTwo = covarianceTimesTwo;
  }


  public StatCalculationSettings covarianceTimesTwoTerm(Boolean covarianceTimesTwoTerm) {
    this.covarianceTimesTwoTerm = covarianceTimesTwoTerm;
    return this;
  }

   /**
   * Get covarianceTimesTwoTerm
   * @return covarianceTimesTwoTerm
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVARIANCE_TIMES_TWO_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCovarianceTimesTwoTerm() {
    return covarianceTimesTwoTerm;
  }


  @JsonProperty(JSON_PROPERTY_COVARIANCE_TIMES_TWO_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCovarianceTimesTwoTerm(Boolean covarianceTimesTwoTerm) {
    this.covarianceTimesTwoTerm = covarianceTimesTwoTerm;
  }


  public StatCalculationSettings correlatedSpecificRisk(Boolean correlatedSpecificRisk) {
    this.correlatedSpecificRisk = correlatedSpecificRisk;
    return this;
  }

   /**
   * When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR.
   * @return correlatedSpecificRisk
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR.")
  @JsonProperty(JSON_PROPERTY_CORRELATED_SPECIFIC_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCorrelatedSpecificRisk() {
    return correlatedSpecificRisk;
  }


  @JsonProperty(JSON_PROPERTY_CORRELATED_SPECIFIC_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorrelatedSpecificRisk(Boolean correlatedSpecificRisk) {
    this.correlatedSpecificRisk = correlatedSpecificRisk;
  }


  public StatCalculationSettings sparse(Boolean sparse) {
    this.sparse = sparse;
    return this;
  }

   /**
   * When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level.
   * @return sparse
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level.")
  @JsonProperty(JSON_PROPERTY_SPARSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSparse() {
    return sparse;
  }


  @JsonProperty(JSON_PROPERTY_SPARSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSparse(Boolean sparse) {
    this.sparse = sparse;
  }


  public StatCalculationSettings horizon(BigDecimal horizon) {
    this.horizon = horizon;
    return this;
  }

   /**
   * Get horizon
   * @return horizon
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HORIZON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHorizon() {
    return horizon;
  }


  @JsonProperty(JSON_PROPERTY_HORIZON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHorizon(BigDecimal horizon) {
    this.horizon = horizon;
  }


  public StatCalculationSettings daysPerYear(BigDecimal daysPerYear) {
    this.daysPerYear = daysPerYear;
    return this;
  }

   /**
   * Get daysPerYear
   * @return daysPerYear
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAYS_PER_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDaysPerYear() {
    return daysPerYear;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_PER_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDaysPerYear(BigDecimal daysPerYear) {
    this.daysPerYear = daysPerYear;
  }


  public StatCalculationSettings confidenceLevel(BigDecimal confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

   /**
   * Get confidenceLevel
   * @return confidenceLevel
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getConfidenceLevel() {
    return confidenceLevel;
  }


  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfidenceLevel(BigDecimal confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }


  public StatCalculationSettings lamda(BigDecimal lamda) {
    this.lamda = lamda;
    return this;
  }

   /**
   * Get lamda
   * @return lamda
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAMDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLamda() {
    return lamda;
  }


  @JsonProperty(JSON_PROPERTY_LAMDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLamda(BigDecimal lamda) {
    this.lamda = lamda;
  }


  public StatCalculationSettings specificToFactorRatio(BigDecimal specificToFactorRatio) {
    this.specificToFactorRatio = specificToFactorRatio;
    return this;
  }

   /**
   * Get specificToFactorRatio
   * @return specificToFactorRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPECIFIC_TO_FACTOR_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpecificToFactorRatio() {
    return specificToFactorRatio;
  }


  @JsonProperty(JSON_PROPERTY_SPECIFIC_TO_FACTOR_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecificToFactorRatio(BigDecimal specificToFactorRatio) {
    this.specificToFactorRatio = specificToFactorRatio;
  }


  public StatCalculationSettings rapSys(BigDecimal rapSys) {
    this.rapSys = rapSys;
    return this;
  }

   /**
   * Get rapSys
   * @return rapSys
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RAP_SYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRapSys() {
    return rapSys;
  }


  @JsonProperty(JSON_PROPERTY_RAP_SYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRapSys(BigDecimal rapSys) {
    this.rapSys = rapSys;
  }


  public StatCalculationSettings rapUnsys(BigDecimal rapUnsys) {
    this.rapUnsys = rapUnsys;
    return this;
  }

   /**
   * Get rapUnsys
   * @return rapUnsys
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RAP_UNSYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRapUnsys() {
    return rapUnsys;
  }


  @JsonProperty(JSON_PROPERTY_RAP_UNSYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRapUnsys(BigDecimal rapUnsys) {
    this.rapUnsys = rapUnsys;
  }


  /**
   * Return true if this StatCalculationSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatCalculationSettings statCalculationSettings = (StatCalculationSettings) o;
    return Objects.equals(this.useAbsoluteWeightsForLotExpansion, statCalculationSettings.useAbsoluteWeightsForLotExpansion) &&
        Objects.equals(this.covarianceTimesTwo, statCalculationSettings.covarianceTimesTwo) &&
        Objects.equals(this.covarianceTimesTwoTerm, statCalculationSettings.covarianceTimesTwoTerm) &&
        Objects.equals(this.correlatedSpecificRisk, statCalculationSettings.correlatedSpecificRisk) &&
        Objects.equals(this.sparse, statCalculationSettings.sparse) &&
        Objects.equals(this.horizon, statCalculationSettings.horizon) &&
        Objects.equals(this.daysPerYear, statCalculationSettings.daysPerYear) &&
        Objects.equals(this.confidenceLevel, statCalculationSettings.confidenceLevel) &&
        Objects.equals(this.lamda, statCalculationSettings.lamda) &&
        Objects.equals(this.specificToFactorRatio, statCalculationSettings.specificToFactorRatio) &&
        Objects.equals(this.rapSys, statCalculationSettings.rapSys) &&
        Objects.equals(this.rapUnsys, statCalculationSettings.rapUnsys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useAbsoluteWeightsForLotExpansion, covarianceTimesTwo, covarianceTimesTwoTerm, correlatedSpecificRisk, sparse, horizon, daysPerYear, confidenceLevel, lamda, specificToFactorRatio, rapSys, rapUnsys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatCalculationSettings {\n");
    sb.append("    useAbsoluteWeightsForLotExpansion: ").append(toIndentedString(useAbsoluteWeightsForLotExpansion)).append("\n");
    sb.append("    covarianceTimesTwo: ").append(toIndentedString(covarianceTimesTwo)).append("\n");
    sb.append("    covarianceTimesTwoTerm: ").append(toIndentedString(covarianceTimesTwoTerm)).append("\n");
    sb.append("    correlatedSpecificRisk: ").append(toIndentedString(correlatedSpecificRisk)).append("\n");
    sb.append("    sparse: ").append(toIndentedString(sparse)).append("\n");
    sb.append("    horizon: ").append(toIndentedString(horizon)).append("\n");
    sb.append("    daysPerYear: ").append(toIndentedString(daysPerYear)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    lamda: ").append(toIndentedString(lamda)).append("\n");
    sb.append("    specificToFactorRatio: ").append(toIndentedString(specificToFactorRatio)).append("\n");
    sb.append("    rapSys: ").append(toIndentedString(rapSys)).append("\n");
    sb.append("    rapUnsys: ").append(toIndentedString(rapUnsys)).append("\n");
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

