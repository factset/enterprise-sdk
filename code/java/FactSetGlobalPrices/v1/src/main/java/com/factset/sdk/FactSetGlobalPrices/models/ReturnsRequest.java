/*
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetGlobalPrices.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetGlobalPrices.models.Batch;
import com.factset.sdk.FactSetGlobalPrices.models.DividendAdjust;
import com.factset.sdk.FactSetGlobalPrices.models.Frequency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetGlobalPrices.JSON;


/**
 * Returns Request Body
 */
@ApiModel(description = "Returns Request Body")
@JsonPropertyOrder({
  ReturnsRequest.JSON_PROPERTY_IDS,
  ReturnsRequest.JSON_PROPERTY_START_DATE,
  ReturnsRequest.JSON_PROPERTY_END_DATE,
  ReturnsRequest.JSON_PROPERTY_CURRENCY,
  ReturnsRequest.JSON_PROPERTY_FREQUENCY,
  ReturnsRequest.JSON_PROPERTY_DIVIDEND_ADJUST,
  ReturnsRequest.JSON_PROPERTY_BATCH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReturnsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.D;

  public static final String JSON_PROPERTY_DIVIDEND_ADJUST = "dividendAdjust";
  private DividendAdjust dividendAdjust = DividendAdjust.EXDATE_C;

  public static final String JSON_PROPERTY_BATCH = "batch";
  private Batch batch = Batch.N;

  public ReturnsRequest() { 
  }

  @JsonCreator
  public ReturnsRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_START_DATE, required=true) String startDate
  ) {
    this();
    this.ids = ids;
    this.startDate = startDate;
  }

  public ReturnsRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public ReturnsRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Requests are limited to 50 IDs. 
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"AAPL-US\"]", required = true, value = "The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Requests are limited to 50 IDs. ")
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


  public ReturnsRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
   * @return startDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2020-06-30", required = true, value = "The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. ")
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


  public ReturnsRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-06-30", value = "The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. ")
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


  public ReturnsRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).")
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


  public ReturnsRequest frequency(Frequency frequency) {
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


  public ReturnsRequest dividendAdjust(DividendAdjust dividendAdjust) {
    this.dividendAdjust = dividendAdjust;
    return this;
  }

   /**
   * Get dividendAdjust
   * @return dividendAdjust
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVIDEND_ADJUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DividendAdjust getDividendAdjust() {
    return dividendAdjust;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND_ADJUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendAdjust(DividendAdjust dividendAdjust) {
    this.dividendAdjust = dividendAdjust;
  }


  public ReturnsRequest batch(Batch batch) {
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
   * Return true if this returnsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnsRequest returnsRequest = (ReturnsRequest) o;
    return Objects.equals(this.ids, returnsRequest.ids) &&
        Objects.equals(this.startDate, returnsRequest.startDate) &&
        Objects.equals(this.endDate, returnsRequest.endDate) &&
        Objects.equals(this.currency, returnsRequest.currency) &&
        Objects.equals(this.frequency, returnsRequest.frequency) &&
        Objects.equals(this.dividendAdjust, returnsRequest.dividendAdjust) &&
        Objects.equals(this.batch, returnsRequest.batch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, startDate, endDate, currency, frequency, dividendAdjust, batch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    dividendAdjust: ").append(toIndentedString(dividendAdjust)).append("\n");
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

