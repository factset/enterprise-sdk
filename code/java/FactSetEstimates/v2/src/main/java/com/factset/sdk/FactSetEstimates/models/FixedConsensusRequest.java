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
import com.factset.sdk.FactSetEstimates.models.Periodicity;
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
 * Request object for requesting fixed consensus estimates.
 */
@ApiModel(description = "Request object for requesting fixed consensus estimates.")
@JsonPropertyOrder({
  FixedConsensusRequest.JSON_PROPERTY_IDS,
  FixedConsensusRequest.JSON_PROPERTY_METRICS,
  FixedConsensusRequest.JSON_PROPERTY_START_DATE,
  FixedConsensusRequest.JSON_PROPERTY_END_DATE,
  FixedConsensusRequest.JSON_PROPERTY_FREQUENCY,
  FixedConsensusRequest.JSON_PROPERTY_FISCAL_PERIOD_START,
  FixedConsensusRequest.JSON_PROPERTY_FISCAL_PERIOD_END,
  FixedConsensusRequest.JSON_PROPERTY_PERIODICITY,
  FixedConsensusRequest.JSON_PROPERTY_CURRENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FixedConsensusRequest implements Serializable {
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

  public static final String JSON_PROPERTY_FISCAL_PERIOD_START = "fiscalPeriodStart";
  private String fiscalPeriodStart;

  public static final String JSON_PROPERTY_FISCAL_PERIOD_END = "fiscalPeriodEnd";
  private String fiscalPeriodEnd;

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private Periodicity periodicity = Periodicity.ANN;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public FixedConsensusRequest() { 
  }

  @JsonCreator
  public FixedConsensusRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_METRICS, required=true) java.util.List<String> metrics
  ) {
    this();
    this.ids = ids;
    this.metrics = metrics;
  }

  public FixedConsensusRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FixedConsensusRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
   * @return ids
  **/
  @jakarta.annotation.Nonnull
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


  public FixedConsensusRequest metrics(java.util.List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public FixedConsensusRequest addMetricsItem(String metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
   * @return metrics
  **/
  @jakarta.annotation.Nonnull
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


  public FixedConsensusRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
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


  public FixedConsensusRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
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


  public FixedConsensusRequest frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @jakarta.annotation.Nullable
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


  public FixedConsensusRequest fiscalPeriodStart(String fiscalPeriodStart) {
    this.fiscalPeriodStart = fiscalPeriodStart;
    return this;
  }

   /**
   * Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) 
   * @return fiscalPeriodStart
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2019", value = "Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) ")
  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiscalPeriodStart() {
    return fiscalPeriodStart;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalPeriodStart(String fiscalPeriodStart) {
    this.fiscalPeriodStart = fiscalPeriodStart;
  }


  public FixedConsensusRequest fiscalPeriodEnd(String fiscalPeriodEnd) {
    this.fiscalPeriodEnd = fiscalPeriodEnd;
    return this;
  }

   /**
   * Fiscal period end expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Month-end** - MM/YYYY (e.g., 11/2019)   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) 
   * @return fiscalPeriodEnd
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020", value = "Fiscal period end expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Month-end** - MM/YYYY (e.g., 11/2019)   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) ")
  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiscalPeriodEnd() {
    return fiscalPeriodEnd;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalPeriodEnd(String fiscalPeriodEnd) {
    this.fiscalPeriodEnd = fiscalPeriodEnd;
  }


  public FixedConsensusRequest periodicity(Periodicity periodicity) {
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

  public Periodicity getPeriodicity() {
    return periodicity;
  }


  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodicity(Periodicity periodicity) {
    this.periodicity = periodicity;
  }


  public FixedConsensusRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @jakarta.annotation.Nullable
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


  /**
   * Return true if this fixedConsensusRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedConsensusRequest fixedConsensusRequest = (FixedConsensusRequest) o;
    return Objects.equals(this.ids, fixedConsensusRequest.ids) &&
        Objects.equals(this.metrics, fixedConsensusRequest.metrics) &&
        Objects.equals(this.startDate, fixedConsensusRequest.startDate) &&
        Objects.equals(this.endDate, fixedConsensusRequest.endDate) &&
        Objects.equals(this.frequency, fixedConsensusRequest.frequency) &&
        Objects.equals(this.fiscalPeriodStart, fixedConsensusRequest.fiscalPeriodStart) &&
        Objects.equals(this.fiscalPeriodEnd, fixedConsensusRequest.fiscalPeriodEnd) &&
        Objects.equals(this.periodicity, fixedConsensusRequest.periodicity) &&
        Objects.equals(this.currency, fixedConsensusRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, metrics, startDate, endDate, frequency, fiscalPeriodStart, fiscalPeriodEnd, periodicity, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedConsensusRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    fiscalPeriodStart: ").append(toIndentedString(fiscalPeriodStart)).append("\n");
    sb.append("    fiscalPeriodEnd: ").append(toIndentedString(fiscalPeriodEnd)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

