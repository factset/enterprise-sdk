/*
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.4.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetFundamentals.models.Batch;
import com.factset.sdk.FactSetFundamentals.models.FiscalPeriod;
import com.factset.sdk.FactSetFundamentals.models.SegmentType;
import com.factset.sdk.FactSetFundamentals.models.SegmentsPeriodicity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetFundamentals.JSON;


/**
 * Segments request body elements
 */
@ApiModel(description = "Segments request body elements")
@JsonPropertyOrder({
  SegmentRequestBody.JSON_PROPERTY_IDS,
  SegmentRequestBody.JSON_PROPERTY_PERIODICITY,
  SegmentRequestBody.JSON_PROPERTY_FISCAL_PERIOD,
  SegmentRequestBody.JSON_PROPERTY_METRICS,
  SegmentRequestBody.JSON_PROPERTY_SEGMENT_TYPE,
  SegmentRequestBody.JSON_PROPERTY_BATCH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SegmentRequestBody implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private SegmentsPeriodicity periodicity = SegmentsPeriodicity.ANN;

  public static final String JSON_PROPERTY_FISCAL_PERIOD = "fiscalPeriod";
  private FiscalPeriod fiscalPeriod;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private String metrics;

  public static final String JSON_PROPERTY_SEGMENT_TYPE = "segmentType";
  private SegmentType segmentType = SegmentType.BUS;

  public static final String JSON_PROPERTY_BATCH = "batch";
  private Batch batch = Batch.N;

  public SegmentRequestBody() { 
  }

  @JsonCreator
  public SegmentRequestBody(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_METRICS, required=true) String metrics
  ) {
    this();
    this.ids = ids;
    this.metrics = metrics;
  }

  public SegmentRequestBody ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public SegmentRequestBody addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  250 per non-batch request (1 metric per ID, for 1 day) and 5000 per batch request (1 metric per ID, for 1 day).&lt;/p&gt; 
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"FDS-US\"]", required = true, value = "The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  <p>ids limit =  250 per non-batch request (1 metric per ID, for 1 day) and 5000 per batch request (1 metric per ID, for 1 day).</p> ")
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


  public SegmentRequestBody periodicity(SegmentsPeriodicity periodicity) {
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

  public SegmentsPeriodicity getPeriodicity() {
    return periodicity;
  }


  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodicity(SegmentsPeriodicity periodicity) {
    this.periodicity = periodicity;
  }


  public SegmentRequestBody fiscalPeriod(FiscalPeriod fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
    return this;
  }

   /**
   * Get fiscalPeriod
   * @return fiscalPeriod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FiscalPeriod getFiscalPeriod() {
    return fiscalPeriod;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalPeriod(FiscalPeriod fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }


  public SegmentRequestBody metrics(String metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Metrics are the data items available for business and geographic segments, where   * **SALES**  &#x3D; Sales/Revenue - Total revenues from the business line/geographic region,   * **OPINC** &#x3D; Operating Income/Loss - Operating income generated from the business line/geographic region,   * **ASSETS** &#x3D; Total Assets - Total assets from the business line/geographic region,   * **DEP** &#x3D; Depreciation Exp - Depreciation expense resulting from the business line/geographic segment,   * **CAPEX** &#x3D; Capital Expenditures - Capital expenditures resulting from the business line/geographic region 
   * @return metrics
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SALES", required = true, value = "Metrics are the data items available for business and geographic segments, where   * **SALES**  = Sales/Revenue - Total revenues from the business line/geographic region,   * **OPINC** = Operating Income/Loss - Operating income generated from the business line/geographic region,   * **ASSETS** = Total Assets - Total assets from the business line/geographic region,   * **DEP** = Depreciation Exp - Depreciation expense resulting from the business line/geographic segment,   * **CAPEX** = Capital Expenditures - Capital expenditures resulting from the business line/geographic region ")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetrics(String metrics) {
    this.metrics = metrics;
  }


  public SegmentRequestBody segmentType(SegmentType segmentType) {
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


  public SegmentRequestBody batch(Batch batch) {
    this.batch = batch;
    return this;
  }

   /**
   * Get batch
   * @return batch
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Batch getBatch() {
    return batch;
  }


  @JsonProperty(JSON_PROPERTY_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatch(Batch batch) {
    this.batch = batch;
  }


  /**
   * Return true if this SegmentRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentRequestBody segmentRequestBody = (SegmentRequestBody) o;
    return Objects.equals(this.ids, segmentRequestBody.ids) &&
        Objects.equals(this.periodicity, segmentRequestBody.periodicity) &&
        Objects.equals(this.fiscalPeriod, segmentRequestBody.fiscalPeriod) &&
        Objects.equals(this.metrics, segmentRequestBody.metrics) &&
        Objects.equals(this.segmentType, segmentRequestBody.segmentType) &&
        Objects.equals(this.batch, segmentRequestBody.batch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, periodicity, fiscalPeriod, metrics, segmentType, batch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentRequestBody {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
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

