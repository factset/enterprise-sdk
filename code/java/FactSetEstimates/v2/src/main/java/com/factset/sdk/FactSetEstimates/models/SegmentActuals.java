/*
 * FactSet Estimates
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.6.1
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
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * SegmentActuals
 */
@JsonPropertyOrder({
  SegmentActuals.JSON_PROPERTY_REQUEST_ID,
  SegmentActuals.JSON_PROPERTY_FSYM_ID,
  SegmentActuals.JSON_PROPERTY_METRIC,
  SegmentActuals.JSON_PROPERTY_PERIODICITY,
  SegmentActuals.JSON_PROPERTY_FISCAL_YEAR,
  SegmentActuals.JSON_PROPERTY_FISCAL_PERIOD,
  SegmentActuals.JSON_PROPERTY_FISCAL_END_DATE,
  SegmentActuals.JSON_PROPERTY_SEGMENT_TYPE,
  SegmentActuals.JSON_PROPERTY_SEGMENT_LABEL,
  SegmentActuals.JSON_PROPERTY_SEGMENT_LEVEL,
  SegmentActuals.JSON_PROPERTY_SEGMENT_ACTUAL_VALUE,
  SegmentActuals.JSON_PROPERTY_SEGMENT_ACTUAL_TYPE,
  SegmentActuals.JSON_PROPERTY_REPORT_DATE,
  SegmentActuals.JSON_PROPERTY_CURRENCY,
  SegmentActuals.JSON_PROPERTY_ESTIMATE_CURRENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SegmentActuals implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METRIC = "metric";
  private JsonNullable<String> metric = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private JsonNullable<String> periodicity = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private JsonNullable<Integer> fiscalYear = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FISCAL_PERIOD = "fiscalPeriod";
  private JsonNullable<Integer> fiscalPeriod = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FISCAL_END_DATE = "fiscalEndDate";
  private JsonNullable<LocalDate> fiscalEndDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_SEGMENT_TYPE = "segmentType";
  private JsonNullable<String> segmentType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEGMENT_LABEL = "segmentLabel";
  private JsonNullable<String> segmentLabel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEGMENT_LEVEL = "segmentLevel";
  private JsonNullable<String> segmentLevel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEGMENT_ACTUAL_VALUE = "segmentActualValue";
  private JsonNullable<BigDecimal> segmentActualValue = JsonNullable.<BigDecimal>undefined();

  /**
   * The type of actual returned. The following is returned:   * **Company Actual**. This is collected directly from a company’s press release for the corresponding past period.    * **European Actual**. This is also collected directly from a company&#39;s press release before January 2017 for European countries. However, **Company Actual ** is used from 2017 onwards to fetch actual irrespective of country or listing.   * **Broker Actual**. A broker actual is a median consensus that can be updated up to 100 days post the fiscal period’s report date. Broker actuals are a post-event only consensus if a report date is collected from an earnings release, unless no brokers have contributed to the post-event consensus yet, in which case the broker actual will be a pre-event consensus.  The broker actual is a pre and post event consensus if the report date is a calculation  For more details on the actual types, visit [Online Assistant Page #13379](https://my.apps.factset.com/oa/pages/13379).    
   */
  public enum SegmentActualTypeEnum {
    COMPANY("company"),
    
    EUROPEAN("european"),
    
    BROKER("broker");

    private String value;

    SegmentActualTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SegmentActualTypeEnum fromValue(String value) {
      for (SegmentActualTypeEnum b : SegmentActualTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SEGMENT_ACTUAL_TYPE = "segmentActualType";
  private JsonNullable<SegmentActualTypeEnum> segmentActualType = JsonNullable.<SegmentActualTypeEnum>undefined();

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private JsonNullable<LocalDate> reportDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ESTIMATE_CURRENCY = "estimateCurrency";
  private JsonNullable<String> estimateCurrency = JsonNullable.<String>undefined();

  public SegmentActuals() { 
  }

  public SegmentActuals requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "AAPL-USA", value = "Identifier that was used for the request.")
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


  public SegmentActuals fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SJY281-R", value = "FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
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


  public SegmentActuals metric(String metric) {
    this.metric = JsonNullable.<String>of(metric);
    return this;
  }

   /**
   * Company&#39;s Financial statement &#39;metric&#39; that is estimated. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SALES", value = "Company's Financial statement 'metric' that is estimated. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).")
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


  public SegmentActuals periodicity(String periodicity) {
    this.periodicity = JsonNullable.<String>of(periodicity);
    return this;
  }

   /**
   * The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List &#x3D; ANN, QTR, SEMI, LTMA, or NMTA.
   * @return periodicity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ANN", value = "The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List = ANN, QTR, SEMI, LTMA, or NMTA.")
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


  public SegmentActuals fiscalYear(Integer fiscalYear) {
    this.fiscalYear = JsonNullable.<Integer>of(fiscalYear);
    return this;
  }

   /**
   * Company&#39;s &#39;fiscal year&#39; for the estimate record
   * @return fiscalYear
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2023", value = "Company's 'fiscal year' for the estimate record")
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


  public SegmentActuals fiscalPeriod(Integer fiscalPeriod) {
    this.fiscalPeriod = JsonNullable.<Integer>of(fiscalPeriod);
    return this;
  }

   /**
   * Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period.
   * @return fiscalPeriod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Company's 'fiscal period' for the estimate record.  'Periodicity' defines context for period.")
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


  public SegmentActuals fiscalEndDate(LocalDate fiscalEndDate) {
    this.fiscalEndDate = JsonNullable.<LocalDate>of(fiscalEndDate);
    return this;
  }

   /**
   * Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
   * @return fiscalEndDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri Jun 30 00:00:00 UTC 2023", value = "Company's 'fiscal year' for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)")
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


  public SegmentActuals segmentType(String segmentType) {
    this.segmentType = JsonNullable.<String>of(segmentType);
    return this;
  }

   /**
   * Type of segment requested.   * **BUS** &#x3D; Business / Product Segment   * **GEO** &#x3D; Geographic Segment 
   * @return segmentType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Productivity and Business Processes", value = "Type of segment requested.   * **BUS** = Business / Product Segment   * **GEO** = Geographic Segment ")
  @JsonIgnore

  public String getSegmentType() {
        return segmentType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSegmentType_JsonNullable() {
    return segmentType;
  }
  
  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPE)
  public void setSegmentType_JsonNullable(JsonNullable<String> segmentType) {
    this.segmentType = segmentType;
  }

  public void setSegmentType(String segmentType) {
    this.segmentType = JsonNullable.<String>of(segmentType);
  }


  public SegmentActuals segmentLabel(String segmentLabel) {
    this.segmentLabel = JsonNullable.<String>of(segmentLabel);
    return this;
  }

   /**
   * Displays the specific label of the segment.
   * @return segmentLabel
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Productivity and Business Processes", value = "Displays the specific label of the segment.")
  @JsonIgnore

  public String getSegmentLabel() {
        return segmentLabel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEGMENT_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSegmentLabel_JsonNullable() {
    return segmentLabel;
  }
  
  @JsonProperty(JSON_PROPERTY_SEGMENT_LABEL)
  public void setSegmentLabel_JsonNullable(JsonNullable<String> segmentLabel) {
    this.segmentLabel = segmentLabel;
  }

  public void setSegmentLabel(String segmentLabel) {
    this.segmentLabel = JsonNullable.<String>of(segmentLabel);
  }


  public SegmentActuals segmentLevel(String segmentLevel) {
    this.segmentLevel = JsonNullable.<String>of(segmentLevel);
    return this;
  }

   /**
   * Returns the level of the segment item as either P &#x3D; Parent or S &#x3D; Subordinate
   * @return segmentLevel
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "S", value = "Returns the level of the segment item as either P = Parent or S = Subordinate")
  @JsonIgnore

  public String getSegmentLevel() {
        return segmentLevel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEGMENT_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSegmentLevel_JsonNullable() {
    return segmentLevel;
  }
  
  @JsonProperty(JSON_PROPERTY_SEGMENT_LEVEL)
  public void setSegmentLevel_JsonNullable(JsonNullable<String> segmentLevel) {
    this.segmentLevel = segmentLevel;
  }

  public void setSegmentLevel(String segmentLevel) {
    this.segmentLevel = JsonNullable.<String>of(segmentLevel);
  }


  public SegmentActuals segmentActualValue(BigDecimal segmentActualValue) {
    this.segmentActualValue = JsonNullable.<BigDecimal>of(segmentActualValue);
    return this;
  }

   /**
   * Actual value of the specified segment for the requested metric.
   * @return segmentActualValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "69274", value = "Actual value of the specified segment for the requested metric.")
  @JsonIgnore

  public BigDecimal getSegmentActualValue() {
        return segmentActualValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEGMENT_ACTUAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getSegmentActualValue_JsonNullable() {
    return segmentActualValue;
  }
  
  @JsonProperty(JSON_PROPERTY_SEGMENT_ACTUAL_VALUE)
  public void setSegmentActualValue_JsonNullable(JsonNullable<BigDecimal> segmentActualValue) {
    this.segmentActualValue = segmentActualValue;
  }

  public void setSegmentActualValue(BigDecimal segmentActualValue) {
    this.segmentActualValue = JsonNullable.<BigDecimal>of(segmentActualValue);
  }


  public SegmentActuals segmentActualType(SegmentActualTypeEnum segmentActualType) {
    this.segmentActualType = JsonNullable.<SegmentActualTypeEnum>of(segmentActualType);
    return this;
  }

   /**
   * The type of actual returned. The following is returned:   * **Company Actual**. This is collected directly from a company’s press release for the corresponding past period.    * **European Actual**. This is also collected directly from a company&#39;s press release before January 2017 for European countries. However, **Company Actual ** is used from 2017 onwards to fetch actual irrespective of country or listing.   * **Broker Actual**. A broker actual is a median consensus that can be updated up to 100 days post the fiscal period’s report date. Broker actuals are a post-event only consensus if a report date is collected from an earnings release, unless no brokers have contributed to the post-event consensus yet, in which case the broker actual will be a pre-event consensus.  The broker actual is a pre and post event consensus if the report date is a calculation  For more details on the actual types, visit [Online Assistant Page #13379](https://my.apps.factset.com/oa/pages/13379).    
   * @return segmentActualType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "company", value = "The type of actual returned. The following is returned:   * **Company Actual**. This is collected directly from a company’s press release for the corresponding past period.    * **European Actual**. This is also collected directly from a company's press release before January 2017 for European countries. However, **Company Actual ** is used from 2017 onwards to fetch actual irrespective of country or listing.   * **Broker Actual**. A broker actual is a median consensus that can be updated up to 100 days post the fiscal period’s report date. Broker actuals are a post-event only consensus if a report date is collected from an earnings release, unless no brokers have contributed to the post-event consensus yet, in which case the broker actual will be a pre-event consensus.  The broker actual is a pre and post event consensus if the report date is a calculation  For more details on the actual types, visit [Online Assistant Page #13379](https://my.apps.factset.com/oa/pages/13379).    ")
  @JsonIgnore

  public SegmentActualTypeEnum getSegmentActualType() {
        return segmentActualType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEGMENT_ACTUAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SegmentActualTypeEnum> getSegmentActualType_JsonNullable() {
    return segmentActualType;
  }
  
  @JsonProperty(JSON_PROPERTY_SEGMENT_ACTUAL_TYPE)
  public void setSegmentActualType_JsonNullable(JsonNullable<SegmentActualTypeEnum> segmentActualType) {
    this.segmentActualType = segmentActualType;
  }

  public void setSegmentActualType(SegmentActualTypeEnum segmentActualType) {
    this.segmentActualType = JsonNullable.<SegmentActualTypeEnum>of(segmentActualType);
  }


  public SegmentActuals reportDate(LocalDate reportDate) {
    this.reportDate = JsonNullable.<LocalDate>of(reportDate);
    return this;
  }

   /**
   * Date at which Actual has been reported and/or fiscal period has rolled.
   * @return reportDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Wed Jul 26 00:00:00 UTC 2023", value = "Date at which Actual has been reported and/or fiscal period has rolled.")
  @JsonIgnore

  public LocalDate getReportDate() {
        return reportDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getReportDate_JsonNullable() {
    return reportDate;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  public void setReportDate_JsonNullable(JsonNullable<LocalDate> reportDate) {
    this.reportDate = reportDate;
  }

  public void setReportDate(LocalDate reportDate) {
    this.reportDate = JsonNullable.<LocalDate>of(reportDate);
  }


  public SegmentActuals currency(String currency) {
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


  public SegmentActuals estimateCurrency(String estimateCurrency) {
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


  /**
   * Return true if this segmentActuals object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentActuals segmentActuals = (SegmentActuals) o;
    return Objects.equals(this.requestId, segmentActuals.requestId) &&
        equalsNullable(this.fsymId, segmentActuals.fsymId) &&
        equalsNullable(this.metric, segmentActuals.metric) &&
        equalsNullable(this.periodicity, segmentActuals.periodicity) &&
        equalsNullable(this.fiscalYear, segmentActuals.fiscalYear) &&
        equalsNullable(this.fiscalPeriod, segmentActuals.fiscalPeriod) &&
        equalsNullable(this.fiscalEndDate, segmentActuals.fiscalEndDate) &&
        equalsNullable(this.segmentType, segmentActuals.segmentType) &&
        equalsNullable(this.segmentLabel, segmentActuals.segmentLabel) &&
        equalsNullable(this.segmentLevel, segmentActuals.segmentLevel) &&
        equalsNullable(this.segmentActualValue, segmentActuals.segmentActualValue) &&
        equalsNullable(this.segmentActualType, segmentActuals.segmentActualType) &&
        equalsNullable(this.reportDate, segmentActuals.reportDate) &&
        equalsNullable(this.currency, segmentActuals.currency) &&
        equalsNullable(this.estimateCurrency, segmentActuals.estimateCurrency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, hashCodeNullable(fsymId), hashCodeNullable(metric), hashCodeNullable(periodicity), hashCodeNullable(fiscalYear), hashCodeNullable(fiscalPeriod), hashCodeNullable(fiscalEndDate), hashCodeNullable(segmentType), hashCodeNullable(segmentLabel), hashCodeNullable(segmentLevel), hashCodeNullable(segmentActualValue), hashCodeNullable(segmentActualType), hashCodeNullable(reportDate), hashCodeNullable(currency), hashCodeNullable(estimateCurrency));
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
    sb.append("class SegmentActuals {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    fiscalEndDate: ").append(toIndentedString(fiscalEndDate)).append("\n");
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
    sb.append("    segmentLabel: ").append(toIndentedString(segmentLabel)).append("\n");
    sb.append("    segmentLevel: ").append(toIndentedString(segmentLevel)).append("\n");
    sb.append("    segmentActualValue: ").append(toIndentedString(segmentActualValue)).append("\n");
    sb.append("    segmentActualType: ").append(toIndentedString(segmentActualType)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    estimateCurrency: ").append(toIndentedString(estimateCurrency)).append("\n");
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

