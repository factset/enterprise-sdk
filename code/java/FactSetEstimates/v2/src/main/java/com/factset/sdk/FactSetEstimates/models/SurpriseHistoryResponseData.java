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
import com.factset.sdk.FactSetEstimates.models.SurpriseHistory;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * SurpriseHistoryResponseData
 */
@JsonPropertyOrder({
  SurpriseHistoryResponseData.JSON_PROPERTY_REQUEST_ID,
  SurpriseHistoryResponseData.JSON_PROPERTY_FSYM_ID,
  SurpriseHistoryResponseData.JSON_PROPERTY_PERIODICITY,
  SurpriseHistoryResponseData.JSON_PROPERTY_ESTIMATE_TYPE,
  SurpriseHistoryResponseData.JSON_PROPERTY_SURPRISE_HISTORY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SurpriseHistoryResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private String periodicity;

  public static final String JSON_PROPERTY_ESTIMATE_TYPE = "estimateType";
  private String estimateType;

  public static final String JSON_PROPERTY_SURPRISE_HISTORY = "surpriseHistory";
  private java.util.List<SurpriseHistory> surpriseHistory = null;

  public SurpriseHistoryResponseData() { 
  }

  public SurpriseHistoryResponseData requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "IBM-US", value = "Identifier that was used for the request.")
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


  public SurpriseHistoryResponseData fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet regional security identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SJY281-R", value = "FactSet regional security identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
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


  public SurpriseHistoryResponseData periodicity(String periodicity) {
    this.periodicity = periodicity;
    return this;
  }

   /**
   * Periodicity or frequency of the fiscal periods.
   * @return periodicity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ANN", value = "Periodicity or frequency of the fiscal periods.")
  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriodicity() {
    return periodicity;
  }


  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodicity(String periodicity) {
    this.periodicity = periodicity;
  }


  public SurpriseHistoryResponseData estimateType(String estimateType) {
    this.estimateType = estimateType;
    return this;
  }

   /**
   * The requested estimate type
   * @return estimateType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "EPS", value = "The requested estimate type")
  @JsonProperty(JSON_PROPERTY_ESTIMATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEstimateType() {
    return estimateType;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimateType(String estimateType) {
    this.estimateType = estimateType;
  }


  public SurpriseHistoryResponseData surpriseHistory(java.util.List<SurpriseHistory> surpriseHistory) {
    this.surpriseHistory = surpriseHistory;
    return this;
  }

  public SurpriseHistoryResponseData addSurpriseHistoryItem(SurpriseHistory surpriseHistoryItem) {
    if (this.surpriseHistory == null) {
      this.surpriseHistory = new java.util.ArrayList<>();
    }
    this.surpriseHistory.add(surpriseHistoryItem);
    return this;
  }

   /**
   * Get surpriseHistory
   * @return surpriseHistory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SURPRISE_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<SurpriseHistory> getSurpriseHistory() {
    return surpriseHistory;
  }


  @JsonProperty(JSON_PROPERTY_SURPRISE_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurpriseHistory(java.util.List<SurpriseHistory> surpriseHistory) {
    this.surpriseHistory = surpriseHistory;
  }


  /**
   * Return true if this SurpriseHistoryResponse_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurpriseHistoryResponseData surpriseHistoryResponseData = (SurpriseHistoryResponseData) o;
    return Objects.equals(this.requestId, surpriseHistoryResponseData.requestId) &&
        equalsNullable(this.fsymId, surpriseHistoryResponseData.fsymId) &&
        Objects.equals(this.periodicity, surpriseHistoryResponseData.periodicity) &&
        Objects.equals(this.estimateType, surpriseHistoryResponseData.estimateType) &&
        Objects.equals(this.surpriseHistory, surpriseHistoryResponseData.surpriseHistory);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, hashCodeNullable(fsymId), periodicity, estimateType, surpriseHistory);
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
    sb.append("class SurpriseHistoryResponseData {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    estimateType: ").append(toIndentedString(estimateType)).append("\n");
    sb.append("    surpriseHistory: ").append(toIndentedString(surpriseHistory)).append("\n");
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

