/*
 * FactSet Estimates
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.6.0
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
import com.factset.sdk.FactSetEstimates.models.SegmentType;
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
 * Request object for requesting segments estimates.
 */
@ApiModel(description = "Request object for requesting segments estimates.")
@JsonPropertyOrder({
  SegmentsRequest.JSON_PROPERTY_IDS,
  SegmentsRequest.JSON_PROPERTY_START_DATE,
  SegmentsRequest.JSON_PROPERTY_END_DATE,
  SegmentsRequest.JSON_PROPERTY_RELATIVE_FISCAL_START,
  SegmentsRequest.JSON_PROPERTY_RELATIVE_FISCAL_END,
  SegmentsRequest.JSON_PROPERTY_PERIODICITY,
  SegmentsRequest.JSON_PROPERTY_FREQUENCY,
  SegmentsRequest.JSON_PROPERTY_SEGMENT_TYPE,
  SegmentsRequest.JSON_PROPERTY_METRICS,
  SegmentsRequest.JSON_PROPERTY_CURRENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SegmentsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_RELATIVE_FISCAL_START = "relativeFiscalStart";
  private Integer relativeFiscalStart;

  public static final String JSON_PROPERTY_RELATIVE_FISCAL_END = "relativeFiscalEnd";
  private Integer relativeFiscalEnd;

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private Periodicity periodicity = Periodicity.ANN;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.D;

  public static final String JSON_PROPERTY_SEGMENT_TYPE = "segmentType";
  private SegmentType segmentType = SegmentType.BUS;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private java.util.List<String> metrics = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public SegmentsRequest() { 
  }

  @JsonCreator
  public SegmentsRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_METRICS, required=true) java.util.List<String> metrics
  ) {
    this();
    this.ids = ids;
    this.metrics = metrics;
  }

  public SegmentsRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public SegmentsRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"FDS-US\"]", required = true, value = "The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * ")
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


  public SegmentsRequest startDate(String startDate) {
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


  public SegmentsRequest endDate(String endDate) {
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


  public SegmentsRequest relativeFiscalStart(Integer relativeFiscalStart) {
    this.relativeFiscalStart = relativeFiscalStart;
    return this;
  }

   /**
   * Relative fiscal period, expressed as an integer, used to filter results.
   * @return relativeFiscalStart
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Relative fiscal period, expressed as an integer, used to filter results.")
  @JsonProperty(JSON_PROPERTY_RELATIVE_FISCAL_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelativeFiscalStart() {
    return relativeFiscalStart;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE_FISCAL_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativeFiscalStart(Integer relativeFiscalStart) {
    this.relativeFiscalStart = relativeFiscalStart;
  }


  public SegmentsRequest relativeFiscalEnd(Integer relativeFiscalEnd) {
    this.relativeFiscalEnd = relativeFiscalEnd;
    return this;
  }

   /**
   * Relative fiscal period, expressed as an integer, used to filter results.
   * @return relativeFiscalEnd
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Relative fiscal period, expressed as an integer, used to filter results.")
  @JsonProperty(JSON_PROPERTY_RELATIVE_FISCAL_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelativeFiscalEnd() {
    return relativeFiscalEnd;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE_FISCAL_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativeFiscalEnd(Integer relativeFiscalEnd) {
    this.relativeFiscalEnd = relativeFiscalEnd;
  }


  public SegmentsRequest periodicity(Periodicity periodicity) {
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


  public SegmentsRequest frequency(Frequency frequency) {
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


  public SegmentsRequest segmentType(SegmentType segmentType) {
    this.segmentType = segmentType;
    return this;
  }

   /**
   * Get segmentType
   * @return segmentType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SegmentType getSegmentType() {
    return segmentType;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentType(SegmentType segmentType) {
    this.segmentType = segmentType;
  }


  public SegmentsRequest metrics(java.util.List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public SegmentsRequest addMetricsItem(String metricsItem) {
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


  public SegmentsRequest currency(String currency) {
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
   * Return true if this segmentsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentsRequest segmentsRequest = (SegmentsRequest) o;
    return Objects.equals(this.ids, segmentsRequest.ids) &&
        Objects.equals(this.startDate, segmentsRequest.startDate) &&
        Objects.equals(this.endDate, segmentsRequest.endDate) &&
        Objects.equals(this.relativeFiscalStart, segmentsRequest.relativeFiscalStart) &&
        Objects.equals(this.relativeFiscalEnd, segmentsRequest.relativeFiscalEnd) &&
        Objects.equals(this.periodicity, segmentsRequest.periodicity) &&
        Objects.equals(this.frequency, segmentsRequest.frequency) &&
        Objects.equals(this.segmentType, segmentsRequest.segmentType) &&
        Objects.equals(this.metrics, segmentsRequest.metrics) &&
        Objects.equals(this.currency, segmentsRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, startDate, endDate, relativeFiscalStart, relativeFiscalEnd, periodicity, frequency, segmentType, metrics, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentsRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    relativeFiscalStart: ").append(toIndentedString(relativeFiscalStart)).append("\n");
    sb.append("    relativeFiscalEnd: ").append(toIndentedString(relativeFiscalEnd)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

