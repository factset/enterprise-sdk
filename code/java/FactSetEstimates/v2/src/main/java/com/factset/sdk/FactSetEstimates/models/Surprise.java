/*
 * FactSet Estimates
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.7.0
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * Surprise
 */
@JsonPropertyOrder({
  Surprise.JSON_PROPERTY_FSYM_ID,
  Surprise.JSON_PROPERTY_DATE,
  Surprise.JSON_PROPERTY_CURRENCY,
  Surprise.JSON_PROPERTY_ESTIMATE_CURRENCY,
  Surprise.JSON_PROPERTY_METRIC,
  Surprise.JSON_PROPERTY_STATISTIC,
  Surprise.JSON_PROPERTY_PERIODICITY,
  Surprise.JSON_PROPERTY_FISCAL_END_DATE,
  Surprise.JSON_PROPERTY_FISCAL_YEAR,
  Surprise.JSON_PROPERTY_FISCAL_PERIOD,
  Surprise.JSON_PROPERTY_SURPRISE_DATE,
  Surprise.JSON_PROPERTY_SURPRISE_AMOUNT,
  Surprise.JSON_PROPERTY_SURPRISE_PERCENT,
  Surprise.JSON_PROPERTY_SURPRISE_BEFORE,
  Surprise.JSON_PROPERTY_SURPRISE_AFTER,
  Surprise.JSON_PROPERTY_EVENT_DESCRIPTION,
  Surprise.JSON_PROPERTY_EVENT_FLAG,
  Surprise.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Surprise implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ESTIMATE_CURRENCY = "estimateCurrency";
  private JsonNullable<String> estimateCurrency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METRIC = "metric";
  private JsonNullable<String> metric = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATISTIC = "statistic";
  private JsonNullable<String> statistic = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private JsonNullable<String> periodicity = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FISCAL_END_DATE = "fiscalEndDate";
  private JsonNullable<LocalDate> fiscalEndDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private JsonNullable<Integer> fiscalYear = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FISCAL_PERIOD = "fiscalPeriod";
  private JsonNullable<Integer> fiscalPeriod = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SURPRISE_DATE = "surpriseDate";
  private JsonNullable<LocalDate> surpriseDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_SURPRISE_AMOUNT = "surpriseAmount";
  private JsonNullable<Double> surpriseAmount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SURPRISE_PERCENT = "surprisePercent";
  private JsonNullable<Double> surprisePercent = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SURPRISE_BEFORE = "surpriseBefore";
  private JsonNullable<Double> surpriseBefore = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SURPRISE_AFTER = "surpriseAfter";
  private JsonNullable<Double> surpriseAfter = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_EVENT_DESCRIPTION = "eventDescription";
  private JsonNullable<String> eventDescription = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EVENT_FLAG = "eventFlag";
  private JsonNullable<Integer> eventFlag = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public Surprise() { 
  }

  public Surprise fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * Get fsymId
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SJY281-R", value = "")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public Surprise date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * Date for data expressed in YYYY-MM-DD format.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Sun Dec 31 00:00:00 UTC 2017", value = "Date for data expressed in YYYY-MM-DD format.")
  @JsonIgnore

  public LocalDate getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<LocalDate> date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
  }


  public Surprise currency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
    return this;
  }

   /**
   * Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency code for adjusting the data. Use 'ESTIMATE' as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
  @JsonIgnore

  public String getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<String> currency) {
    this.currency = currency;
  }

  public void setCurrency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
  }


  public Surprise estimateCurrency(String estimateCurrency) {
    this.estimateCurrency = JsonNullable.<String>of(estimateCurrency);
    return this;
  }

   /**
   * Estimate currency of the requested Security
   * @return estimateCurrency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Estimate currency of the requested Security")
  @JsonIgnore

  public String getEstimateCurrency() {
        return estimateCurrency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATE_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEstimateCurrency_JsonNullable() {
    return estimateCurrency;
  }
  
  @JsonProperty(JSON_PROPERTY_ESTIMATE_CURRENCY)
  public void setEstimateCurrency_JsonNullable(JsonNullable<String> estimateCurrency) {
    this.estimateCurrency = estimateCurrency;
  }

  public void setEstimateCurrency(String estimateCurrency) {
    this.estimateCurrency = JsonNullable.<String>of(estimateCurrency);
  }


  public Surprise metric(String metric) {
    this.metric = JsonNullable.<String>of(metric);
    return this;
  }

   /**
   * Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SALES", value = "Company's Financial statement 'metric' that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).")
  @JsonIgnore

  public String getMetric() {
        return metric.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMetric_JsonNullable() {
    return metric;
  }
  
  @JsonProperty(JSON_PROPERTY_METRIC)
  public void setMetric_JsonNullable(JsonNullable<String> metric) {
    this.metric = metric;
  }

  public void setMetric(String metric) {
    this.metric = JsonNullable.<String>of(metric);
  }


  public Surprise statistic(String statistic) {
    this.statistic = JsonNullable.<String>of(statistic);
    return this;
  }

   /**
   * Method of calculation for the consensus &#39;statistic&#39;. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).
   * @return statistic
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "MEAN", value = "Method of calculation for the consensus 'statistic'. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).")
  @JsonIgnore

  public String getStatistic() {
        return statistic.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATISTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStatistic_JsonNullable() {
    return statistic;
  }
  
  @JsonProperty(JSON_PROPERTY_STATISTIC)
  public void setStatistic_JsonNullable(JsonNullable<String> statistic) {
    this.statistic = statistic;
  }

  public void setStatistic(String statistic) {
    this.statistic = JsonNullable.<String>of(statistic);
  }


  public Surprise periodicity(String periodicity) {
    this.periodicity = JsonNullable.<String>of(periodicity);
    return this;
  }

   /**
   * Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. Next-twelve-months (NTMA) and Last-twelve-months (LTMA) also supported.
   * @return periodicity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ANN", value = "Company's 'periodicity' for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. Next-twelve-months (NTMA) and Last-twelve-months (LTMA) also supported.")
  @JsonIgnore

  public String getPeriodicity() {
        return periodicity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPeriodicity_JsonNullable() {
    return periodicity;
  }
  
  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  public void setPeriodicity_JsonNullable(JsonNullable<String> periodicity) {
    this.periodicity = periodicity;
  }

  public void setPeriodicity(String periodicity) {
    this.periodicity = JsonNullable.<String>of(periodicity);
  }


  public Surprise fiscalEndDate(LocalDate fiscalEndDate) {
    this.fiscalEndDate = JsonNullable.<LocalDate>of(fiscalEndDate);
    return this;
  }

   /**
   * Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format
   * @return fiscalEndDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Sun Dec 31 00:00:00 UTC 2017", value = "Company's 'fiscal end date' for the estimate record expressed in YYYY-MM-DD format")
  @JsonIgnore

  public LocalDate getFiscalEndDate() {
        return fiscalEndDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FISCAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getFiscalEndDate_JsonNullable() {
    return fiscalEndDate;
  }
  
  @JsonProperty(JSON_PROPERTY_FISCAL_END_DATE)
  public void setFiscalEndDate_JsonNullable(JsonNullable<LocalDate> fiscalEndDate) {
    this.fiscalEndDate = fiscalEndDate;
  }

  public void setFiscalEndDate(LocalDate fiscalEndDate) {
    this.fiscalEndDate = JsonNullable.<LocalDate>of(fiscalEndDate);
  }


  public Surprise fiscalYear(Integer fiscalYear) {
    this.fiscalYear = JsonNullable.<Integer>of(fiscalYear);
    return this;
  }

   /**
   * Company&#39;s &#39;fiscal year&#39; for the estimate record
   * @return fiscalYear
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018", value = "Company's 'fiscal year' for the estimate record")
  @JsonIgnore

  public Integer getFiscalYear() {
        return fiscalYear.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFiscalYear_JsonNullable() {
    return fiscalYear;
  }
  
  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  public void setFiscalYear_JsonNullable(JsonNullable<Integer> fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = JsonNullable.<Integer>of(fiscalYear);
  }


  public Surprise fiscalPeriod(Integer fiscalPeriod) {
    this.fiscalPeriod = JsonNullable.<Integer>of(fiscalPeriod);
    return this;
  }

   /**
   * Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period.
   * @return fiscalPeriod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Company's 'fiscal period' for the estimate record.  'Periodicity' defines context for period.")
  @JsonIgnore

  public Integer getFiscalPeriod() {
        return fiscalPeriod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFiscalPeriod_JsonNullable() {
    return fiscalPeriod;
  }
  
  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  public void setFiscalPeriod_JsonNullable(JsonNullable<Integer> fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }

  public void setFiscalPeriod(Integer fiscalPeriod) {
    this.fiscalPeriod = JsonNullable.<Integer>of(fiscalPeriod);
  }


  public Surprise surpriseDate(LocalDate surpriseDate) {
    this.surpriseDate = JsonNullable.<LocalDate>of(surpriseDate);
    return this;
  }

   /**
   * Date of the reported event expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).
   * @return surpriseDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri Feb 24 00:00:00 UTC 2017", value = "Date of the reported event expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).")
  @JsonIgnore

  public LocalDate getSurpriseDate() {
        return surpriseDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SURPRISE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getSurpriseDate_JsonNullable() {
    return surpriseDate;
  }
  
  @JsonProperty(JSON_PROPERTY_SURPRISE_DATE)
  public void setSurpriseDate_JsonNullable(JsonNullable<LocalDate> surpriseDate) {
    this.surpriseDate = surpriseDate;
  }

  public void setSurpriseDate(LocalDate surpriseDate) {
    this.surpriseDate = JsonNullable.<LocalDate>of(surpriseDate);
  }


  public Surprise surpriseAmount(Double surpriseAmount) {
    this.surpriseAmount = JsonNullable.<Double>of(surpriseAmount);
    return this;
  }

   /**
   * Amount of difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
   * @return surpriseAmount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.07951", value = "Amount of difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).")
  @JsonIgnore

  public Double getSurpriseAmount() {
        return surpriseAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SURPRISE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getSurpriseAmount_JsonNullable() {
    return surpriseAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_SURPRISE_AMOUNT)
  public void setSurpriseAmount_JsonNullable(JsonNullable<Double> surpriseAmount) {
    this.surpriseAmount = surpriseAmount;
  }

  public void setSurpriseAmount(Double surpriseAmount) {
    this.surpriseAmount = JsonNullable.<Double>of(surpriseAmount);
  }


  public Surprise surprisePercent(Double surprisePercent) {
    this.surprisePercent = JsonNullable.<Double>of(surprisePercent);
    return this;
  }

   /**
   * Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
   * @return surprisePercent
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6.16", value = "Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).")
  @JsonIgnore

  public Double getSurprisePercent() {
        return surprisePercent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SURPRISE_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getSurprisePercent_JsonNullable() {
    return surprisePercent;
  }
  
  @JsonProperty(JSON_PROPERTY_SURPRISE_PERCENT)
  public void setSurprisePercent_JsonNullable(JsonNullable<Double> surprisePercent) {
    this.surprisePercent = surprisePercent;
  }

  public void setSurprisePercent(Double surprisePercent) {
    this.surprisePercent = JsonNullable.<Double>of(surprisePercent);
  }


  public Surprise surpriseBefore(Double surpriseBefore) {
    this.surpriseBefore = JsonNullable.<Double>of(surpriseBefore);
    return this;
  }

   /**
   * Last consensus before event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
   * @return surpriseBefore
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.2905", value = "Last consensus before event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).")
  @JsonIgnore

  public Double getSurpriseBefore() {
        return surpriseBefore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SURPRISE_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getSurpriseBefore_JsonNullable() {
    return surpriseBefore;
  }
  
  @JsonProperty(JSON_PROPERTY_SURPRISE_BEFORE)
  public void setSurpriseBefore_JsonNullable(JsonNullable<Double> surpriseBefore) {
    this.surpriseBefore = surpriseBefore;
  }

  public void setSurpriseBefore(Double surpriseBefore) {
    this.surpriseBefore = JsonNullable.<Double>of(surpriseBefore);
  }


  public Surprise surpriseAfter(Double surpriseAfter) {
    this.surpriseAfter = JsonNullable.<Double>of(surpriseAfter);
    return this;
  }

   /**
   * Actual value after event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
   * @return surpriseAfter
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.3653", value = "Actual value after event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).")
  @JsonIgnore

  public Double getSurpriseAfter() {
        return surpriseAfter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SURPRISE_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getSurpriseAfter_JsonNullable() {
    return surpriseAfter;
  }
  
  @JsonProperty(JSON_PROPERTY_SURPRISE_AFTER)
  public void setSurpriseAfter_JsonNullable(JsonNullable<Double> surpriseAfter) {
    this.surpriseAfter = surpriseAfter;
  }

  public void setSurpriseAfter(Double surpriseAfter) {
    this.surpriseAfter = JsonNullable.<Double>of(surpriseAfter);
  }


  public Surprise eventDescription(String eventDescription) {
    this.eventDescription = JsonNullable.<String>of(eventDescription);
    return this;
  }

   /**
   * Description of event. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).
   * @return eventDescription
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Results for 2016", value = "Description of event. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).")
  @JsonIgnore

  public String getEventDescription() {
        return eventDescription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEventDescription_JsonNullable() {
    return eventDescription;
  }
  
  @JsonProperty(JSON_PROPERTY_EVENT_DESCRIPTION)
  public void setEventDescription_JsonNullable(JsonNullable<String> eventDescription) {
    this.eventDescription = eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = JsonNullable.<String>of(eventDescription);
  }


  public Surprise eventFlag(Integer eventFlag) {
    this.eventFlag = JsonNullable.<Integer>of(eventFlag);
    return this;
  }

   /**
   * Flag for event. Code of Event Flag, where 0 &#x3D; results and 1 &#x3D; profit warning. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).
   * @return eventFlag
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Flag for event. Code of Event Flag, where 0 = results and 1 = profit warning. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).")
  @JsonIgnore

  public Integer getEventFlag() {
        return eventFlag.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENT_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getEventFlag_JsonNullable() {
    return eventFlag;
  }
  
  @JsonProperty(JSON_PROPERTY_EVENT_FLAG)
  public void setEventFlag_JsonNullable(JsonNullable<Integer> eventFlag) {
    this.eventFlag = eventFlag;
  }

  public void setEventFlag(Integer eventFlag) {
    this.eventFlag = JsonNullable.<Integer>of(eventFlag);
  }


  public Surprise requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "IBM-US", value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  /**
   * Return true if this surprise object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Surprise surprise = (Surprise) o;
    return equalsNullable(this.fsymId, surprise.fsymId) &&
        equalsNullable(this.date, surprise.date) &&
        equalsNullable(this.currency, surprise.currency) &&
        equalsNullable(this.estimateCurrency, surprise.estimateCurrency) &&
        equalsNullable(this.metric, surprise.metric) &&
        equalsNullable(this.statistic, surprise.statistic) &&
        equalsNullable(this.periodicity, surprise.periodicity) &&
        equalsNullable(this.fiscalEndDate, surprise.fiscalEndDate) &&
        equalsNullable(this.fiscalYear, surprise.fiscalYear) &&
        equalsNullable(this.fiscalPeriod, surprise.fiscalPeriod) &&
        equalsNullable(this.surpriseDate, surprise.surpriseDate) &&
        equalsNullable(this.surpriseAmount, surprise.surpriseAmount) &&
        equalsNullable(this.surprisePercent, surprise.surprisePercent) &&
        equalsNullable(this.surpriseBefore, surprise.surpriseBefore) &&
        equalsNullable(this.surpriseAfter, surprise.surpriseAfter) &&
        equalsNullable(this.eventDescription, surprise.eventDescription) &&
        equalsNullable(this.eventFlag, surprise.eventFlag) &&
        Objects.equals(this.requestId, surprise.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(date), hashCodeNullable(currency), hashCodeNullable(estimateCurrency), hashCodeNullable(metric), hashCodeNullable(statistic), hashCodeNullable(periodicity), hashCodeNullable(fiscalEndDate), hashCodeNullable(fiscalYear), hashCodeNullable(fiscalPeriod), hashCodeNullable(surpriseDate), hashCodeNullable(surpriseAmount), hashCodeNullable(surprisePercent), hashCodeNullable(surpriseBefore), hashCodeNullable(surpriseAfter), hashCodeNullable(eventDescription), hashCodeNullable(eventFlag), requestId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Surprise {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    estimateCurrency: ").append(toIndentedString(estimateCurrency)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    fiscalEndDate: ").append(toIndentedString(fiscalEndDate)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    surpriseDate: ").append(toIndentedString(surpriseDate)).append("\n");
    sb.append("    surpriseAmount: ").append(toIndentedString(surpriseAmount)).append("\n");
    sb.append("    surprisePercent: ").append(toIndentedString(surprisePercent)).append("\n");
    sb.append("    surpriseBefore: ").append(toIndentedString(surpriseBefore)).append("\n");
    sb.append("    surpriseAfter: ").append(toIndentedString(surpriseAfter)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    eventFlag: ").append(toIndentedString(eventFlag)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

