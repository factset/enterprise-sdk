/*
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetEstimates.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetEstimates.models.Frequency;
import com.factset.sdk.FactSetEstimates.models.PeriodicitySurprise;
import com.factset.sdk.FactSetEstimates.models.Statistic;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * Request object for requesting surprise estimates.
 */
@ApiModel(description = "Request object for requesting surprise estimates.")
@JsonPropertyOrder({
  SurpriseRequest.JSON_PROPERTY_IDS,
  SurpriseRequest.JSON_PROPERTY_METRICS,
  SurpriseRequest.JSON_PROPERTY_START_DATE,
  SurpriseRequest.JSON_PROPERTY_END_DATE,
  SurpriseRequest.JSON_PROPERTY_FREQUENCY,
  SurpriseRequest.JSON_PROPERTY_PERIODICITY,
  SurpriseRequest.JSON_PROPERTY_CURRENCY,
  SurpriseRequest.JSON_PROPERTY_STATISTIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SurpriseRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private java.util.List<String> metrics = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.D;

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private PeriodicitySurprise periodicity = PeriodicitySurprise.ANN;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_STATISTIC = "statistic";
  private Statistic statistic = Statistic.MEAN;

  public SurpriseRequest() { 
  }

  @JsonCreator
  public SurpriseRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_METRICS, required=true) java.util.List<String> metrics
  ) {
    this();
    this.ids = ids;
    this.metrics = metrics;
  }

  public SurpriseRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public SurpriseRequest addIdsItem(String idsItem) {
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


  public SurpriseRequest metrics(java.util.List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public SurpriseRequest addMetricsItem(String metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
   * @return metrics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"SALES\"]", required = true, value = "Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetrics(java.util.List<String> metrics) {
    this.metrics = metrics;
  }


  public SurpriseRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01", value = "The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public SurpriseRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-31", value = "The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public SurpriseRequest frequency(Frequency frequency) {
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


  public SurpriseRequest periodicity(PeriodicitySurprise periodicity) {
    this.periodicity = periodicity;
    return this;
  }

   /**
   * Get periodicity
   * @return periodicity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PeriodicitySurprise getPeriodicity() {
    return periodicity;
  }


  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodicity(PeriodicitySurprise periodicity) {
    this.periodicity = periodicity;
  }


  public SurpriseRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency code for adjusting the data. Use input as 'ESTIMATE' for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public SurpriseRequest statistic(Statistic statistic) {
    this.statistic = statistic;
    return this;
  }

   /**
   * Get statistic
   * @return statistic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATISTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Statistic getStatistic() {
    return statistic;
  }


  @JsonProperty(JSON_PROPERTY_STATISTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistic(Statistic statistic) {
    this.statistic = statistic;
  }


  /**
   * Return true if this surpriseRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurpriseRequest surpriseRequest = (SurpriseRequest) o;
    return Objects.equals(this.ids, surpriseRequest.ids) &&
        Objects.equals(this.metrics, surpriseRequest.metrics) &&
        Objects.equals(this.startDate, surpriseRequest.startDate) &&
        Objects.equals(this.endDate, surpriseRequest.endDate) &&
        Objects.equals(this.frequency, surpriseRequest.frequency) &&
        Objects.equals(this.periodicity, surpriseRequest.periodicity) &&
        Objects.equals(this.currency, surpriseRequest.currency) &&
        Objects.equals(this.statistic, surpriseRequest.statistic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, metrics, startDate, endDate, frequency, periodicity, currency, statistic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurpriseRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
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

