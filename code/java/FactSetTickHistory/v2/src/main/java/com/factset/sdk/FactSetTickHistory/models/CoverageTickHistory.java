/*
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTickHistory.models;

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
import com.factset.sdk.FactSetTickHistory.JSON;


/**
 * Returns Coverage Response of the requested ticker with unique isocode within a date range
 */
@ApiModel(description = "Returns Coverage Response of the requested ticker with unique isocode within a date range")
@JsonPropertyOrder({
  CoverageTickHistory.JSON_PROPERTY_TICKER,
  CoverageTickHistory.JSON_PROPERTY_FACTSET_EXCHANGE_CODE,
  CoverageTickHistory.JSON_PROPERTY_START_DATE,
  CoverageTickHistory.JSON_PROPERTY_LATEST_TRADE_DATE,
  CoverageTickHistory.JSON_PROPERTY_COMPANY_NAME,
  CoverageTickHistory.JSON_PROPERTY_ISIN,
  CoverageTickHistory.JSON_PROPERTY_CURRENCY,
  CoverageTickHistory.JSON_PROPERTY_LAST_EXCHANGE_CODE,
  CoverageTickHistory.JSON_PROPERTY_LAST_EXCHANGE_NAME,
  CoverageTickHistory.JSON_PROPERTY_PRIMARY_TICKER_EXCHANGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CoverageTickHistory implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private String ticker;

  public static final String JSON_PROPERTY_FACTSET_EXCHANGE_CODE = "factsetExchangeCode";
  private String factsetExchangeCode;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private LocalDate startDate;

  public static final String JSON_PROPERTY_LATEST_TRADE_DATE = "latestTradeDate";
  private LocalDate latestTradeDate;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_ISIN = "isin";
  private String isin;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_LAST_EXCHANGE_CODE = "lastExchangeCode";
  private String lastExchangeCode;

  public static final String JSON_PROPERTY_LAST_EXCHANGE_NAME = "lastExchangeName";
  private String lastExchangeName;

  public static final String JSON_PROPERTY_PRIMARY_TICKER_EXCHANGE = "primaryTickerExchange";
  private String primaryTickerExchange;

  public CoverageTickHistory() { 
  }

  public CoverageTickHistory ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * a unique ticker given to a company
   * @return ticker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "a unique ticker given to a company")
  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTicker() {
    return ticker;
  }


  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  public CoverageTickHistory factsetExchangeCode(String factsetExchangeCode) {
    this.factsetExchangeCode = factsetExchangeCode;
    return this;
  }

   /**
   * FactSet specific exchange code.
   * @return factsetExchangeCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FactSet specific exchange code.")
  @JsonProperty(JSON_PROPERTY_FACTSET_EXCHANGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFactsetExchangeCode() {
    return factsetExchangeCode;
  }


  @JsonProperty(JSON_PROPERTY_FACTSET_EXCHANGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactsetExchangeCode(String factsetExchangeCode) {
    this.factsetExchangeCode = factsetExchangeCode;
  }


  public CoverageTickHistory startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date for (or from which) the coverage is required. 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The date for (or from which) the coverage is required. ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CoverageTickHistory latestTradeDate(LocalDate latestTradeDate) {
    this.latestTradeDate = latestTradeDate;
    return this;
  }

   /**
   * This specifies the latest traded date from tick history.
   * @return latestTradeDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This specifies the latest traded date from tick history.")
  @JsonProperty(JSON_PROPERTY_LATEST_TRADE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getLatestTradeDate() {
    return latestTradeDate;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_TRADE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestTradeDate(LocalDate latestTradeDate) {
    this.latestTradeDate = latestTradeDate;
  }


  public CoverageTickHistory companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the firm
   * @return companyName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the firm")
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public CoverageTickHistory isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * returns the ISIN of the requested company 
   * @return isin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "returns the ISIN of the requested company ")
  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsin() {
    return isin;
  }


  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsin(String isin) {
    this.isin = isin;
  }


  public CoverageTickHistory currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Represents 3 digit ISO code for the currency
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents 3 digit ISO code for the currency")
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


  public CoverageTickHistory lastExchangeCode(String lastExchangeCode) {
    this.lastExchangeCode = lastExchangeCode;
    return this;
  }

   /**
   * the last traded exhange code from tick history
   * @return lastExchangeCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "the last traded exhange code from tick history")
  @JsonProperty(JSON_PROPERTY_LAST_EXCHANGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastExchangeCode() {
    return lastExchangeCode;
  }


  @JsonProperty(JSON_PROPERTY_LAST_EXCHANGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastExchangeCode(String lastExchangeCode) {
    this.lastExchangeCode = lastExchangeCode;
  }


  public CoverageTickHistory lastExchangeName(String lastExchangeName) {
    this.lastExchangeName = lastExchangeName;
    return this;
  }

   /**
   * the last traded exchange name from tick history
   * @return lastExchangeName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "the last traded exchange name from tick history")
  @JsonProperty(JSON_PROPERTY_LAST_EXCHANGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastExchangeName() {
    return lastExchangeName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_EXCHANGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastExchangeName(String lastExchangeName) {
    this.lastExchangeName = lastExchangeName;
  }


  public CoverageTickHistory primaryTickerExchange(String primaryTickerExchange) {
    this.primaryTickerExchange = primaryTickerExchange;
    return this;
  }

   /**
   * the primary ticker iso
   * @return primaryTickerExchange
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "the primary ticker iso")
  @JsonProperty(JSON_PROPERTY_PRIMARY_TICKER_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryTickerExchange() {
    return primaryTickerExchange;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_TICKER_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryTickerExchange(String primaryTickerExchange) {
    this.primaryTickerExchange = primaryTickerExchange;
  }


  /**
   * Return true if this coverageTickHistory object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageTickHistory coverageTickHistory = (CoverageTickHistory) o;
    return Objects.equals(this.ticker, coverageTickHistory.ticker) &&
        Objects.equals(this.factsetExchangeCode, coverageTickHistory.factsetExchangeCode) &&
        Objects.equals(this.startDate, coverageTickHistory.startDate) &&
        Objects.equals(this.latestTradeDate, coverageTickHistory.latestTradeDate) &&
        Objects.equals(this.companyName, coverageTickHistory.companyName) &&
        Objects.equals(this.isin, coverageTickHistory.isin) &&
        Objects.equals(this.currency, coverageTickHistory.currency) &&
        Objects.equals(this.lastExchangeCode, coverageTickHistory.lastExchangeCode) &&
        Objects.equals(this.lastExchangeName, coverageTickHistory.lastExchangeName) &&
        Objects.equals(this.primaryTickerExchange, coverageTickHistory.primaryTickerExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, factsetExchangeCode, startDate, latestTradeDate, companyName, isin, currency, lastExchangeCode, lastExchangeName, primaryTickerExchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageTickHistory {\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    factsetExchangeCode: ").append(toIndentedString(factsetExchangeCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    latestTradeDate: ").append(toIndentedString(latestTradeDate)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    lastExchangeCode: ").append(toIndentedString(lastExchangeCode)).append("\n");
    sb.append("    lastExchangeName: ").append(toIndentedString(lastExchangeName)).append("\n");
    sb.append("    primaryTickerExchange: ").append(toIndentedString(primaryTickerExchange)).append("\n");
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

