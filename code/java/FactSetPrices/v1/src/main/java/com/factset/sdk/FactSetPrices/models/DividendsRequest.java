/*
 * FactSet Prices API
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p><p><b>Rate limit is set to 25 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPrices.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetPrices.models.Adjust;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPrices.JSON;


/**
 * Dividends Request Body
 */
@ApiModel(description = "Dividends Request Body")
@JsonPropertyOrder({
  DividendsRequest.JSON_PROPERTY_IDS,
  DividendsRequest.JSON_PROPERTY_START_DATE,
  DividendsRequest.JSON_PROPERTY_END_DATE,
  DividendsRequest.JSON_PROPERTY_CURRENCY,
  DividendsRequest.JSON_PROPERTY_ADJUST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DividendsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_ADJUST = "adjust";
  private Adjust adjust = Adjust.SPLIT;

  public DividendsRequest() { 
  }

  @JsonCreator
  public DividendsRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids
  ) {
    this();
    this.ids = ids;
  }

  public DividendsRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public DividendsRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. 
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"FDS-US\"]", required = true, value = "The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. ")
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


  public DividendsRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01", value = "The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. ")
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


  public DividendsRequest endDate(String endDate) {
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


  public DividendsRequest currency(String currency) {
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


  public DividendsRequest adjust(Adjust adjust) {
    this.adjust = adjust;
    return this;
  }

   /**
   * Get adjust
   * @return adjust
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADJUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Adjust getAdjust() {
    return adjust;
  }


  @JsonProperty(JSON_PROPERTY_ADJUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdjust(Adjust adjust) {
    this.adjust = adjust;
  }


  /**
   * Return true if this dividendsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DividendsRequest dividendsRequest = (DividendsRequest) o;
    return Objects.equals(this.ids, dividendsRequest.ids) &&
        Objects.equals(this.startDate, dividendsRequest.startDate) &&
        Objects.equals(this.endDate, dividendsRequest.endDate) &&
        Objects.equals(this.currency, dividendsRequest.currency) &&
        Objects.equals(this.adjust, dividendsRequest.adjust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, startDate, endDate, currency, adjust);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DividendsRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    adjust: ").append(toIndentedString(adjust)).append("\n");
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

