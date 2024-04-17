/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeCalculation.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FixedIncomeCalculation.models.FIJobSettings;
import com.factset.sdk.FixedIncomeCalculation.models.FISecurity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FixedIncomeCalculation.JSON;


/**
 * FICalculationParameters
 */
@JsonPropertyOrder({
  FICalculationParameters.JSON_PROPERTY_SECURITIES,
  FICalculationParameters.JSON_PROPERTY_CALCULATIONS,
  FICalculationParameters.JSON_PROPERTY_JOB_SETTINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FICalculationParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SECURITIES = "securities";
  private java.util.List<FISecurity> securities = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_CALCULATIONS = "calculations";
  private java.util.List<String> calculations = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_JOB_SETTINGS = "jobSettings";
  private FIJobSettings jobSettings;

  public FICalculationParameters() { 
  }

  @JsonCreator
  public FICalculationParameters(
    @JsonProperty(value=JSON_PROPERTY_SECURITIES, required=true) java.util.List<FISecurity> securities, 
    @JsonProperty(value=JSON_PROPERTY_CALCULATIONS, required=true) java.util.List<String> calculations, 
    @JsonProperty(value=JSON_PROPERTY_JOB_SETTINGS, required=true) FIJobSettings jobSettings
  ) {
    this();
    this.securities = securities;
    this.calculations = calculations;
    this.jobSettings = jobSettings;
  }

  public FICalculationParameters securities(java.util.List<FISecurity> securities) {
    this.securities = securities;
    return this;
  }

  public FICalculationParameters addSecuritiesItem(FISecurity securitiesItem) {
    this.securities.add(securitiesItem);
    return this;
  }

   /**
   * List of securities
   * @return securities
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of securities")
  @JsonProperty(JSON_PROPERTY_SECURITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<FISecurity> getSecurities() {
    return securities;
  }


  @JsonProperty(JSON_PROPERTY_SECURITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecurities(java.util.List<FISecurity> securities) {
    this.securities = securities;
  }


  public FICalculationParameters calculations(java.util.List<String> calculations) {
    this.calculations = calculations;
    return this;
  }

  public FICalculationParameters addCalculationsItem(String calculationsItem) {
    this.calculations.add(calculationsItem);
    return this;
  }

   /**
   * List of calculations
   * @return calculations
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of calculations")
  @JsonProperty(JSON_PROPERTY_CALCULATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getCalculations() {
    return calculations;
  }


  @JsonProperty(JSON_PROPERTY_CALCULATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCalculations(java.util.List<String> calculations) {
    this.calculations = calculations;
  }


  public FICalculationParameters jobSettings(FIJobSettings jobSettings) {
    this.jobSettings = jobSettings;
    return this;
  }

   /**
   * Get jobSettings
   * @return jobSettings
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_JOB_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FIJobSettings getJobSettings() {
    return jobSettings;
  }


  @JsonProperty(JSON_PROPERTY_JOB_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJobSettings(FIJobSettings jobSettings) {
    this.jobSettings = jobSettings;
  }


  /**
   * Return true if this FICalculationParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FICalculationParameters fiCalculationParameters = (FICalculationParameters) o;
    return Objects.equals(this.securities, fiCalculationParameters.securities) &&
        Objects.equals(this.calculations, fiCalculationParameters.calculations) &&
        Objects.equals(this.jobSettings, fiCalculationParameters.jobSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securities, calculations, jobSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FICalculationParameters {\n");
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
    sb.append("    calculations: ").append(toIndentedString(calculations)).append("\n");
    sb.append("    jobSettings: ").append(toIndentedString(jobSettings)).append("\n");
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

