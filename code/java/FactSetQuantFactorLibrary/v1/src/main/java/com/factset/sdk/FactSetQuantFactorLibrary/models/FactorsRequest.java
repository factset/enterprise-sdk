/*
 * FactSet Quant Factor Library API
 * The FactSet FactSet Quant Factor Library (QFL) API helps to detect investment themes across global equity markets, incorporate ideas into your portfolio construction process, and transform raw data into actionable intelligence. Over 2000+ items spanning Factor Groups in-   * Classification and Reference Data - Asset Data, Country, Industry, and Size   * Market - Liquidity, Market Sensitivity, Momentum, Technical, Volatility   * Core Fundamentals - Efficiency, Growth, Management, Profitability, Quality, Solvency, Value   * Macro and Cross Asset - Commodity, FX Sensitivity, Debt, Economic   * Alternative - Analyst Sentiment, Corporate Governance, Crowding, Insider Activity. 
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetQuantFactorLibrary.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetQuantFactorLibrary.models.Frequency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetQuantFactorLibrary.JSON;


/**
 * Request object for requesting factors.
 */
@ApiModel(description = "Request object for requesting factors.")
@JsonPropertyOrder({
  FactorsRequest.JSON_PROPERTY_IDS,
  FactorsRequest.JSON_PROPERTY_FACTORS,
  FactorsRequest.JSON_PROPERTY_FACTOR_GROUPS,
  FactorsRequest.JSON_PROPERTY_START_DATE,
  FactorsRequest.JSON_PROPERTY_END_DATE,
  FactorsRequest.JSON_PROPERTY_FREQUENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FactorsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_FACTORS = "factors";
  private java.util.List<String> factors = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_FACTOR_GROUPS = "factorGroups";
  private java.util.List<String> factorGroups = null;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.D;

  public FactorsRequest() { 
  }

  @JsonCreator
  public FactorsRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_FACTORS, required=true) java.util.List<String> factors, 
    @JsonProperty(value=JSON_PROPERTY_START_DATE, required=true) String startDate, 
    @JsonProperty(value=JSON_PROPERTY_END_DATE, required=true) String endDate
  ) {
    this();
    this.ids = ids;
    this.factors = factors;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public FactorsRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FactorsRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"FDS-US\"]", required = true, value = "The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * ")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public FactorsRequest factors(java.util.List<String> factors) {
    this.factors = factors;
    return this;
  }

  public FactorsRequest addFactorsItem(String factorsItem) {
    this.factors.add(factorsItem);
    return this;
  }

   /**
   * List of Factors. 
   * @return factors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"rsi21D\",\"ulcer252D\"]", required = true, value = "List of Factors. ")
  @JsonProperty(JSON_PROPERTY_FACTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getFactors() {
    return factors;
  }


  @JsonProperty(JSON_PROPERTY_FACTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFactors(java.util.List<String> factors) {
    this.factors = factors;
  }


  public FactorsRequest factorGroups(java.util.List<String> factorGroups) {
    this.factorGroups = factorGroups;
    return this;
  }

  public FactorsRequest addFactorGroupsItem(String factorGroupsItem) {
    if (this.factorGroups == null) {
      this.factorGroups = new java.util.ArrayList<>();
    }
    this.factorGroups.add(factorGroupsItem);
    return this;
  }

   /**
   * List of Factor Groupings to return all factors within the group. 
   * @return factorGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Momentum\",\"Technical\"]", value = "List of Factor Groupings to return all factors within the group. ")
  @JsonProperty(JSON_PROPERTY_FACTOR_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getFactorGroups() {
    return factorGroups;
  }


  @JsonProperty(JSON_PROPERTY_FACTOR_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactorGroups(java.util.List<String> factorGroups) {
    this.factorGroups = factorGroups;
  }


  public FactorsRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-01-01", required = true, value = "The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public FactorsRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. **NOTE:** The input endDate must come AFTER the input startDate. 
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-31", required = true, value = "The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. **NOTE:** The input endDate must come AFTER the input startDate. ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public FactorsRequest frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Frequency getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }


  /**
   * Return true if this factorsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactorsRequest factorsRequest = (FactorsRequest) o;
    return Objects.equals(this.ids, factorsRequest.ids) &&
        Objects.equals(this.factors, factorsRequest.factors) &&
        Objects.equals(this.factorGroups, factorsRequest.factorGroups) &&
        Objects.equals(this.startDate, factorsRequest.startDate) &&
        Objects.equals(this.endDate, factorsRequest.endDate) &&
        Objects.equals(this.frequency, factorsRequest.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, factors, factorGroups, startDate, endDate, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactorsRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
    sb.append("    factorGroups: ").append(toIndentedString(factorGroups)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

