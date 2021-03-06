/*
 * FactSet Prices API
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p> 
 *
 * The version of the OpenAPI document: 1.2.1
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPrices.JSON;


/**
 * ReturnsSnapshot
 */
@JsonPropertyOrder({
  ReturnsSnapshot.JSON_PROPERTY_FSYM_ID,
  ReturnsSnapshot.JSON_PROPERTY_DATE,
  ReturnsSnapshot.JSON_PROPERTY_CURRENCY,
  ReturnsSnapshot.JSON_PROPERTY_REQUEST_ID,
  ReturnsSnapshot.JSON_PROPERTY_ONE_DAY,
  ReturnsSnapshot.JSON_PROPERTY_ONE_MONTH,
  ReturnsSnapshot.JSON_PROPERTY_THREE_MONTH,
  ReturnsSnapshot.JSON_PROPERTY_SIX_MONTH,
  ReturnsSnapshot.JSON_PROPERTY_NINE_MONTH,
  ReturnsSnapshot.JSON_PROPERTY_ONE_YEAR,
  ReturnsSnapshot.JSON_PROPERTY_QUARTER_TO_DATE,
  ReturnsSnapshot.JSON_PROPERTY_WEEK_TO_DATE,
  ReturnsSnapshot.JSON_PROPERTY_MONTH_TO_DATE,
  ReturnsSnapshot.JSON_PROPERTY_YEAR_TO_DATE,
  ReturnsSnapshot.JSON_PROPERTY_TWO_YEAR_ANNUALIZED,
  ReturnsSnapshot.JSON_PROPERTY_THREE_YEAR_ANNUALIZED,
  ReturnsSnapshot.JSON_PROPERTY_FIVE_YEAR_ANNUALIZED,
  ReturnsSnapshot.JSON_PROPERTY_TEN_YEAR_ANNUALIZED,
  ReturnsSnapshot.JSON_PROPERTY_TWENTY_YEAR_ANNUALIZED,
  ReturnsSnapshot.JSON_PROPERTY_THIRTY_YEAR_ANNUALIZED,
  ReturnsSnapshot.JSON_PROPERTY_IPO_TO_DATE_ANNUALIZED,
  ReturnsSnapshot.JSON_PROPERTY_DIVIDEND_ADJUST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReturnsSnapshot implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_ONE_DAY = "oneDay";
  private Double oneDay;

  public static final String JSON_PROPERTY_ONE_MONTH = "oneMonth";
  private Double oneMonth;

  public static final String JSON_PROPERTY_THREE_MONTH = "threeMonth";
  private Double threeMonth;

  public static final String JSON_PROPERTY_SIX_MONTH = "sixMonth";
  private Double sixMonth;

  public static final String JSON_PROPERTY_NINE_MONTH = "nineMonth";
  private Double nineMonth;

  public static final String JSON_PROPERTY_ONE_YEAR = "oneYear";
  private Double oneYear;

  public static final String JSON_PROPERTY_QUARTER_TO_DATE = "quarterToDate";
  private Double quarterToDate;

  public static final String JSON_PROPERTY_WEEK_TO_DATE = "weekToDate";
  private Double weekToDate;

  public static final String JSON_PROPERTY_MONTH_TO_DATE = "monthToDate";
  private Double monthToDate;

  public static final String JSON_PROPERTY_YEAR_TO_DATE = "yearToDate";
  private Double yearToDate;

  public static final String JSON_PROPERTY_TWO_YEAR_ANNUALIZED = "twoYearAnnualized";
  private Double twoYearAnnualized;

  public static final String JSON_PROPERTY_THREE_YEAR_ANNUALIZED = "threeYearAnnualized";
  private Double threeYearAnnualized;

  public static final String JSON_PROPERTY_FIVE_YEAR_ANNUALIZED = "fiveYearAnnualized";
  private Double fiveYearAnnualized;

  public static final String JSON_PROPERTY_TEN_YEAR_ANNUALIZED = "tenYearAnnualized";
  private Double tenYearAnnualized;

  public static final String JSON_PROPERTY_TWENTY_YEAR_ANNUALIZED = "twentyYearAnnualized";
  private Double twentyYearAnnualized;

  public static final String JSON_PROPERTY_THIRTY_YEAR_ANNUALIZED = "thirtyYearAnnualized";
  private Double thirtyYearAnnualized;

  public static final String JSON_PROPERTY_IPO_TO_DATE_ANNUALIZED = "ipoToDateAnnualized";
  private Double ipoToDateAnnualized;

  public static final String JSON_PROPERTY_DIVIDEND_ADJUST = "dividendAdjust";
  private String dividendAdjust;

  public ReturnsSnapshot() { 
  }

  public ReturnsSnapshot fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SJY281-R", value = "Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public ReturnsSnapshot date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Specific reference date for the period expressed in YYYY-MM-DD format.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Sep 09 00:00:00 UTC 2020", value = "Specific reference date for the period expressed in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public ReturnsSnapshot currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
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


  public ReturnsSnapshot requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
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


  public ReturnsSnapshot oneDay(Double oneDay) {
    this.oneDay = oneDay;
    return this;
  }

   /**
   * Returns the price performance of the security for the previous one day from the given date.
   * @return oneDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.86627007", value = "Returns the price performance of the security for the previous one day from the given date.")
  @JsonProperty(JSON_PROPERTY_ONE_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOneDay() {
    return oneDay;
  }


  @JsonProperty(JSON_PROPERTY_ONE_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneDay(Double oneDay) {
    this.oneDay = oneDay;
  }


  public ReturnsSnapshot oneMonth(Double oneMonth) {
    this.oneMonth = oneMonth;
    return this;
  }

   /**
   * Returns the price performance of the security for the past one month.
   * @return oneMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-2.1606863", value = "Returns the price performance of the security for the past one month.")
  @JsonProperty(JSON_PROPERTY_ONE_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOneMonth() {
    return oneMonth;
  }


  @JsonProperty(JSON_PROPERTY_ONE_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneMonth(Double oneMonth) {
    this.oneMonth = oneMonth;
  }


  public ReturnsSnapshot threeMonth(Double threeMonth) {
    this.threeMonth = threeMonth;
    return this;
  }

   /**
   * Returns the price performance of the security for the past three months.
   * @return threeMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-7.2874727", value = "Returns the price performance of the security for the past three months.")
  @JsonProperty(JSON_PROPERTY_THREE_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getThreeMonth() {
    return threeMonth;
  }


  @JsonProperty(JSON_PROPERTY_THREE_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeMonth(Double threeMonth) {
    this.threeMonth = threeMonth;
  }


  public ReturnsSnapshot sixMonth(Double sixMonth) {
    this.sixMonth = sixMonth;
    return this;
  }

   /**
   * Returns the price performance of the security for the past six months.
   * @return sixMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.7772775", value = "Returns the price performance of the security for the past six months.")
  @JsonProperty(JSON_PROPERTY_SIX_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSixMonth() {
    return sixMonth;
  }


  @JsonProperty(JSON_PROPERTY_SIX_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSixMonth(Double sixMonth) {
    this.sixMonth = sixMonth;
  }


  public ReturnsSnapshot nineMonth(Double nineMonth) {
    this.nineMonth = nineMonth;
    return this;
  }

   /**
   * Returns the price performance of the security for the past nine months.
   * @return nineMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-8.706689", value = "Returns the price performance of the security for the past nine months.")
  @JsonProperty(JSON_PROPERTY_NINE_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getNineMonth() {
    return nineMonth;
  }


  @JsonProperty(JSON_PROPERTY_NINE_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNineMonth(Double nineMonth) {
    this.nineMonth = nineMonth;
  }


  public ReturnsSnapshot oneYear(Double oneYear) {
    this.oneYear = oneYear;
    return this;
  }

   /**
   * Returns the price performance of the security for the past one year.
   * @return oneYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-14.263678", value = "Returns the price performance of the security for the past one year.")
  @JsonProperty(JSON_PROPERTY_ONE_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOneYear() {
    return oneYear;
  }


  @JsonProperty(JSON_PROPERTY_ONE_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneYear(Double oneYear) {
    this.oneYear = oneYear;
  }


  public ReturnsSnapshot quarterToDate(Double quarterToDate) {
    this.quarterToDate = quarterToDate;
    return this;
  }

   /**
   * Returns the price performance of the security from the previous calendar quarter end to the given date.
   * @return quarterToDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.2337565", value = "Returns the price performance of the security from the previous calendar quarter end to the given date.")
  @JsonProperty(JSON_PROPERTY_QUARTER_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getQuarterToDate() {
    return quarterToDate;
  }


  @JsonProperty(JSON_PROPERTY_QUARTER_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuarterToDate(Double quarterToDate) {
    this.quarterToDate = quarterToDate;
  }


  public ReturnsSnapshot weekToDate(Double weekToDate) {
    this.weekToDate = weekToDate;
    return this;
  }

   /**
   * Returns the price performance of the security from the previous week (usually Friday) to the given date.
   * @return weekToDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-0.03270507", value = "Returns the price performance of the security from the previous week (usually Friday) to the given date.")
  @JsonProperty(JSON_PROPERTY_WEEK_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWeekToDate() {
    return weekToDate;
  }


  @JsonProperty(JSON_PROPERTY_WEEK_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeekToDate(Double weekToDate) {
    this.weekToDate = weekToDate;
  }


  public ReturnsSnapshot monthToDate(Double monthToDate) {
    this.monthToDate = monthToDate;
    return this;
  }

   /**
   * Returns the price performance of the security from the previous month-end to the given date.
   * @return monthToDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-0.851506", value = "Returns the price performance of the security from the previous month-end to the given date.")
  @JsonProperty(JSON_PROPERTY_MONTH_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMonthToDate() {
    return monthToDate;
  }


  @JsonProperty(JSON_PROPERTY_MONTH_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthToDate(Double monthToDate) {
    this.monthToDate = monthToDate;
  }


  public ReturnsSnapshot yearToDate(Double yearToDate) {
    this.yearToDate = yearToDate;
    return this;
  }

   /**
   * Returns the price performance of the security from the previous calendar year-end to the given date.
   * @return yearToDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-8.788413", value = "Returns the price performance of the security from the previous calendar year-end to the given date.")
  @JsonProperty(JSON_PROPERTY_YEAR_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getYearToDate() {
    return yearToDate;
  }


  @JsonProperty(JSON_PROPERTY_YEAR_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearToDate(Double yearToDate) {
    this.yearToDate = yearToDate;
  }


  public ReturnsSnapshot twoYearAnnualized(Double twoYearAnnualized) {
    this.twoYearAnnualized = twoYearAnnualized;
    return this;
  }

   /**
   * Returns the annualized compound total return for two years.
   * @return twoYearAnnualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-3.7836754", value = "Returns the annualized compound total return for two years.")
  @JsonProperty(JSON_PROPERTY_TWO_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTwoYearAnnualized() {
    return twoYearAnnualized;
  }


  @JsonProperty(JSON_PROPERTY_TWO_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTwoYearAnnualized(Double twoYearAnnualized) {
    this.twoYearAnnualized = twoYearAnnualized;
  }


  public ReturnsSnapshot threeYearAnnualized(Double threeYearAnnualized) {
    this.threeYearAnnualized = threeYearAnnualized;
    return this;
  }

   /**
   * Returns the annualized compound total return for three years.
   * @return threeYearAnnualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-0.49112806", value = "Returns the annualized compound total return for three years.")
  @JsonProperty(JSON_PROPERTY_THREE_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getThreeYearAnnualized() {
    return threeYearAnnualized;
  }


  @JsonProperty(JSON_PROPERTY_THREE_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeYearAnnualized(Double threeYearAnnualized) {
    this.threeYearAnnualized = threeYearAnnualized;
  }


  public ReturnsSnapshot fiveYearAnnualized(Double fiveYearAnnualized) {
    this.fiveYearAnnualized = fiveYearAnnualized;
    return this;
  }

   /**
   * Returns the annualized compound total return for five years.
   * @return fiveYearAnnualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.8408688", value = "Returns the annualized compound total return for five years.")
  @JsonProperty(JSON_PROPERTY_FIVE_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFiveYearAnnualized() {
    return fiveYearAnnualized;
  }


  @JsonProperty(JSON_PROPERTY_FIVE_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiveYearAnnualized(Double fiveYearAnnualized) {
    this.fiveYearAnnualized = fiveYearAnnualized;
  }


  public ReturnsSnapshot tenYearAnnualized(Double tenYearAnnualized) {
    this.tenYearAnnualized = tenYearAnnualized;
    return this;
  }

   /**
   * Returns the annualized compound total return for ten years.
   * @return tenYearAnnualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.8786583", value = "Returns the annualized compound total return for ten years.")
  @JsonProperty(JSON_PROPERTY_TEN_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTenYearAnnualized() {
    return tenYearAnnualized;
  }


  @JsonProperty(JSON_PROPERTY_TEN_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenYearAnnualized(Double tenYearAnnualized) {
    this.tenYearAnnualized = tenYearAnnualized;
  }


  public ReturnsSnapshot twentyYearAnnualized(Double twentyYearAnnualized) {
    this.twentyYearAnnualized = twentyYearAnnualized;
    return this;
  }

   /**
   * Returns the annualized compound total return for twenty years.
   * @return twentyYearAnnualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.8996516", value = "Returns the annualized compound total return for twenty years.")
  @JsonProperty(JSON_PROPERTY_TWENTY_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTwentyYearAnnualized() {
    return twentyYearAnnualized;
  }


  @JsonProperty(JSON_PROPERTY_TWENTY_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTwentyYearAnnualized(Double twentyYearAnnualized) {
    this.twentyYearAnnualized = twentyYearAnnualized;
  }


  public ReturnsSnapshot thirtyYearAnnualized(Double thirtyYearAnnualized) {
    this.thirtyYearAnnualized = thirtyYearAnnualized;
    return this;
  }

   /**
   * Returns the annualized compound total return for thirty years.
   * @return thirtyYearAnnualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7.5250373", value = "Returns the annualized compound total return for thirty years.")
  @JsonProperty(JSON_PROPERTY_THIRTY_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getThirtyYearAnnualized() {
    return thirtyYearAnnualized;
  }


  @JsonProperty(JSON_PROPERTY_THIRTY_YEAR_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThirtyYearAnnualized(Double thirtyYearAnnualized) {
    this.thirtyYearAnnualized = thirtyYearAnnualized;
  }


  public ReturnsSnapshot ipoToDateAnnualized(Double ipoToDateAnnualized) {
    this.ipoToDateAnnualized = ipoToDateAnnualized;
    return this;
  }

   /**
   * Returns the annualized compound total return from the ipo date. The calculation uses the closing price as of the IPO date, and not the IPO price itself.
   * @return ipoToDateAnnualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6.5763993", value = "Returns the annualized compound total return from the ipo date. The calculation uses the closing price as of the IPO date, and not the IPO price itself.")
  @JsonProperty(JSON_PROPERTY_IPO_TO_DATE_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getIpoToDateAnnualized() {
    return ipoToDateAnnualized;
  }


  @JsonProperty(JSON_PROPERTY_IPO_TO_DATE_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpoToDateAnnualized(Double ipoToDateAnnualized) {
    this.ipoToDateAnnualized = ipoToDateAnnualized;
  }


  public ReturnsSnapshot dividendAdjust(String dividendAdjust) {
    this.dividendAdjust = dividendAdjust;
    return this;
  }

   /**
   * Controls the dividend reinvestment for the returns calculation. Dividends will be reinvested on the date the dividends go ex (when the dividends belong to the seller rather than the buyer). Visit [OA 8748](https://my.apps.factset.com/oa/pages/8748) for calculation methodology.   * **PRICE** &#x3D; Price Change - Dividends Excluded.   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested. Dividends accumulated throughout the specified period are added to the price at the end of the period.   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate. Dividends accumulated throughout the specified period are used to buy more shares of stock in the company. 
   * @return dividendAdjust
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PRICE", value = "Controls the dividend reinvestment for the returns calculation. Dividends will be reinvested on the date the dividends go ex (when the dividends belong to the seller rather than the buyer). Visit [OA 8748](https://my.apps.factset.com/oa/pages/8748) for calculation methodology.   * **PRICE** = Price Change - Dividends Excluded.   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested. Dividends accumulated throughout the specified period are added to the price at the end of the period.   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate. Dividends accumulated throughout the specified period are used to buy more shares of stock in the company. ")
  @JsonProperty(JSON_PROPERTY_DIVIDEND_ADJUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDividendAdjust() {
    return dividendAdjust;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND_ADJUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendAdjust(String dividendAdjust) {
    this.dividendAdjust = dividendAdjust;
  }


  /**
   * Return true if this returnsSnapshot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnsSnapshot returnsSnapshot = (ReturnsSnapshot) o;
    return Objects.equals(this.fsymId, returnsSnapshot.fsymId) &&
        Objects.equals(this.date, returnsSnapshot.date) &&
        Objects.equals(this.currency, returnsSnapshot.currency) &&
        Objects.equals(this.requestId, returnsSnapshot.requestId) &&
        Objects.equals(this.oneDay, returnsSnapshot.oneDay) &&
        Objects.equals(this.oneMonth, returnsSnapshot.oneMonth) &&
        Objects.equals(this.threeMonth, returnsSnapshot.threeMonth) &&
        Objects.equals(this.sixMonth, returnsSnapshot.sixMonth) &&
        Objects.equals(this.nineMonth, returnsSnapshot.nineMonth) &&
        Objects.equals(this.oneYear, returnsSnapshot.oneYear) &&
        Objects.equals(this.quarterToDate, returnsSnapshot.quarterToDate) &&
        Objects.equals(this.weekToDate, returnsSnapshot.weekToDate) &&
        Objects.equals(this.monthToDate, returnsSnapshot.monthToDate) &&
        Objects.equals(this.yearToDate, returnsSnapshot.yearToDate) &&
        Objects.equals(this.twoYearAnnualized, returnsSnapshot.twoYearAnnualized) &&
        Objects.equals(this.threeYearAnnualized, returnsSnapshot.threeYearAnnualized) &&
        Objects.equals(this.fiveYearAnnualized, returnsSnapshot.fiveYearAnnualized) &&
        Objects.equals(this.tenYearAnnualized, returnsSnapshot.tenYearAnnualized) &&
        Objects.equals(this.twentyYearAnnualized, returnsSnapshot.twentyYearAnnualized) &&
        Objects.equals(this.thirtyYearAnnualized, returnsSnapshot.thirtyYearAnnualized) &&
        Objects.equals(this.ipoToDateAnnualized, returnsSnapshot.ipoToDateAnnualized) &&
        Objects.equals(this.dividendAdjust, returnsSnapshot.dividendAdjust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, date, currency, requestId, oneDay, oneMonth, threeMonth, sixMonth, nineMonth, oneYear, quarterToDate, weekToDate, monthToDate, yearToDate, twoYearAnnualized, threeYearAnnualized, fiveYearAnnualized, tenYearAnnualized, twentyYearAnnualized, thirtyYearAnnualized, ipoToDateAnnualized, dividendAdjust);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsSnapshot {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    oneDay: ").append(toIndentedString(oneDay)).append("\n");
    sb.append("    oneMonth: ").append(toIndentedString(oneMonth)).append("\n");
    sb.append("    threeMonth: ").append(toIndentedString(threeMonth)).append("\n");
    sb.append("    sixMonth: ").append(toIndentedString(sixMonth)).append("\n");
    sb.append("    nineMonth: ").append(toIndentedString(nineMonth)).append("\n");
    sb.append("    oneYear: ").append(toIndentedString(oneYear)).append("\n");
    sb.append("    quarterToDate: ").append(toIndentedString(quarterToDate)).append("\n");
    sb.append("    weekToDate: ").append(toIndentedString(weekToDate)).append("\n");
    sb.append("    monthToDate: ").append(toIndentedString(monthToDate)).append("\n");
    sb.append("    yearToDate: ").append(toIndentedString(yearToDate)).append("\n");
    sb.append("    twoYearAnnualized: ").append(toIndentedString(twoYearAnnualized)).append("\n");
    sb.append("    threeYearAnnualized: ").append(toIndentedString(threeYearAnnualized)).append("\n");
    sb.append("    fiveYearAnnualized: ").append(toIndentedString(fiveYearAnnualized)).append("\n");
    sb.append("    tenYearAnnualized: ").append(toIndentedString(tenYearAnnualized)).append("\n");
    sb.append("    twentyYearAnnualized: ").append(toIndentedString(twentyYearAnnualized)).append("\n");
    sb.append("    thirtyYearAnnualized: ").append(toIndentedString(thirtyYearAnnualized)).append("\n");
    sb.append("    ipoToDateAnnualized: ").append(toIndentedString(ipoToDateAnnualized)).append("\n");
    sb.append("    dividendAdjust: ").append(toIndentedString(dividendAdjust)).append("\n");
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

