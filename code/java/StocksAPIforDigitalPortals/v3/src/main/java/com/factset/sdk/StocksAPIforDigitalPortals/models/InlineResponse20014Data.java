/*
 * Stocks API For Digital Portals
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20013Fsym;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Benchmark;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Compliance;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014CurrentKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Esg;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Estimates;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Instrument;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Market;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Nsin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Performance;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Recommendation;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014ReportedKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014RsiWilder;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014SimpleMovingAverage;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014TradingValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014ValueUnit;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014Volatility;
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
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * InlineResponse20014Data
 */
@JsonPropertyOrder({
  InlineResponse20014Data.JSON_PROPERTY_ID,
  InlineResponse20014Data.JSON_PROPERTY_VALUE_UNIT,
  InlineResponse20014Data.JSON_PROPERTY_MARKET,
  InlineResponse20014Data.JSON_PROPERTY_SYMBOL,
  InlineResponse20014Data.JSON_PROPERTY_NSIN,
  InlineResponse20014Data.JSON_PROPERTY_FSYM,
  InlineResponse20014Data.JSON_PROPERTY_INSTRUMENT,
  InlineResponse20014Data.JSON_PROPERTY_ESG,
  InlineResponse20014Data.JSON_PROPERTY_COMPLIANCE,
  InlineResponse20014Data.JSON_PROPERTY_CURRENT_KEY_FIGURES,
  InlineResponse20014Data.JSON_PROPERTY_REPORTED_KEY_FIGURES,
  InlineResponse20014Data.JSON_PROPERTY_BENCHMARK,
  InlineResponse20014Data.JSON_PROPERTY_PERFORMANCE,
  InlineResponse20014Data.JSON_PROPERTY_VOLATILITY,
  InlineResponse20014Data.JSON_PROPERTY_TRADING_VALUE,
  InlineResponse20014Data.JSON_PROPERTY_SIMPLE_MOVING_AVERAGE,
  InlineResponse20014Data.JSON_PROPERTY_RSI_WILDER,
  InlineResponse20014Data.JSON_PROPERTY_RECOMMENDATION,
  InlineResponse20014Data.JSON_PROPERTY_ESTIMATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20014Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse20014ValueUnit valueUnit;

  public static final String JSON_PROPERTY_MARKET = "market";
  private InlineResponse20014Market market;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private JsonNullable<String> symbol = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse20014Nsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse20013Fsym fsym;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InlineResponse20014Instrument instrument;

  public static final String JSON_PROPERTY_ESG = "esg";
  private InlineResponse20014Esg esg;

  public static final String JSON_PROPERTY_COMPLIANCE = "compliance";
  private InlineResponse20014Compliance compliance;

  public static final String JSON_PROPERTY_CURRENT_KEY_FIGURES = "currentKeyFigures";
  private InlineResponse20014CurrentKeyFigures currentKeyFigures;

  public static final String JSON_PROPERTY_REPORTED_KEY_FIGURES = "reportedKeyFigures";
  private InlineResponse20014ReportedKeyFigures reportedKeyFigures;

  public static final String JSON_PROPERTY_BENCHMARK = "benchmark";
  private InlineResponse20014Benchmark benchmark;

  public static final String JSON_PROPERTY_PERFORMANCE = "performance";
  private InlineResponse20014Performance performance;

  public static final String JSON_PROPERTY_VOLATILITY = "volatility";
  private InlineResponse20014Volatility volatility;

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private InlineResponse20014TradingValue tradingValue;

  public static final String JSON_PROPERTY_SIMPLE_MOVING_AVERAGE = "simpleMovingAverage";
  private InlineResponse20014SimpleMovingAverage simpleMovingAverage;

  public static final String JSON_PROPERTY_RSI_WILDER = "rsiWilder";
  private InlineResponse20014RsiWilder rsiWilder;

  public static final String JSON_PROPERTY_RECOMMENDATION = "recommendation";
  private InlineResponse20014Recommendation recommendation;

  public static final String JSON_PROPERTY_ESTIMATES = "estimates";
  private InlineResponse20014Estimates estimates;

  public InlineResponse20014Data() { 
  }

  public InlineResponse20014Data id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of the notation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the notation.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public InlineResponse20014Data valueUnit(InlineResponse20014ValueUnit valueUnit) {
    this.valueUnit = valueUnit;
    return this;
  }

   /**
   * Get valueUnit
   * @return valueUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014ValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse20014ValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public InlineResponse20014Data market(InlineResponse20014Market market) {
    this.market = market;
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Market getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(InlineResponse20014Market market) {
    this.market = market;
  }


  public InlineResponse20014Data symbol(String symbol) {
    this.symbol = JsonNullable.<String>of(symbol);
    return this;
  }

   /**
   * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.")
  @JsonIgnore

  public String getSymbol() {
        return symbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSymbol_JsonNullable() {
    return symbol;
  }
  
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  public void setSymbol_JsonNullable(JsonNullable<String> symbol) {
    this.symbol = symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = JsonNullable.<String>of(symbol);
  }


  public InlineResponse20014Data nsin(InlineResponse20014Nsin nsin) {
    this.nsin = nsin;
    return this;
  }

   /**
   * Get nsin
   * @return nsin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Nsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse20014Nsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse20014Data fsym(InlineResponse20013Fsym fsym) {
    this.fsym = fsym;
    return this;
  }

   /**
   * Get fsym
   * @return fsym
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20013Fsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse20013Fsym fsym) {
    this.fsym = fsym;
  }


  public InlineResponse20014Data instrument(InlineResponse20014Instrument instrument) {
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Instrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(InlineResponse20014Instrument instrument) {
    this.instrument = instrument;
  }


  public InlineResponse20014Data esg(InlineResponse20014Esg esg) {
    this.esg = esg;
    return this;
  }

   /**
   * Get esg
   * @return esg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Esg getEsg() {
    return esg;
  }


  @JsonProperty(JSON_PROPERTY_ESG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEsg(InlineResponse20014Esg esg) {
    this.esg = esg;
  }


  public InlineResponse20014Data compliance(InlineResponse20014Compliance compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Get compliance
   * @return compliance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Compliance getCompliance() {
    return compliance;
  }


  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompliance(InlineResponse20014Compliance compliance) {
    this.compliance = compliance;
  }


  public InlineResponse20014Data currentKeyFigures(InlineResponse20014CurrentKeyFigures currentKeyFigures) {
    this.currentKeyFigures = currentKeyFigures;
    return this;
  }

   /**
   * Get currentKeyFigures
   * @return currentKeyFigures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014CurrentKeyFigures getCurrentKeyFigures() {
    return currentKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentKeyFigures(InlineResponse20014CurrentKeyFigures currentKeyFigures) {
    this.currentKeyFigures = currentKeyFigures;
  }


  public InlineResponse20014Data reportedKeyFigures(InlineResponse20014ReportedKeyFigures reportedKeyFigures) {
    this.reportedKeyFigures = reportedKeyFigures;
    return this;
  }

   /**
   * Get reportedKeyFigures
   * @return reportedKeyFigures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORTED_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014ReportedKeyFigures getReportedKeyFigures() {
    return reportedKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_REPORTED_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportedKeyFigures(InlineResponse20014ReportedKeyFigures reportedKeyFigures) {
    this.reportedKeyFigures = reportedKeyFigures;
  }


  public InlineResponse20014Data benchmark(InlineResponse20014Benchmark benchmark) {
    this.benchmark = benchmark;
    return this;
  }

   /**
   * Get benchmark
   * @return benchmark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BENCHMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Benchmark getBenchmark() {
    return benchmark;
  }


  @JsonProperty(JSON_PROPERTY_BENCHMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBenchmark(InlineResponse20014Benchmark benchmark) {
    this.benchmark = benchmark;
  }


  public InlineResponse20014Data performance(InlineResponse20014Performance performance) {
    this.performance = performance;
    return this;
  }

   /**
   * Get performance
   * @return performance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Performance getPerformance() {
    return performance;
  }


  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformance(InlineResponse20014Performance performance) {
    this.performance = performance;
  }


  public InlineResponse20014Data volatility(InlineResponse20014Volatility volatility) {
    this.volatility = volatility;
    return this;
  }

   /**
   * Get volatility
   * @return volatility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Volatility getVolatility() {
    return volatility;
  }


  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolatility(InlineResponse20014Volatility volatility) {
    this.volatility = volatility;
  }


  public InlineResponse20014Data tradingValue(InlineResponse20014TradingValue tradingValue) {
    this.tradingValue = tradingValue;
    return this;
  }

   /**
   * Get tradingValue
   * @return tradingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014TradingValue getTradingValue() {
    return tradingValue;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingValue(InlineResponse20014TradingValue tradingValue) {
    this.tradingValue = tradingValue;
  }


  public InlineResponse20014Data simpleMovingAverage(InlineResponse20014SimpleMovingAverage simpleMovingAverage) {
    this.simpleMovingAverage = simpleMovingAverage;
    return this;
  }

   /**
   * Get simpleMovingAverage
   * @return simpleMovingAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIMPLE_MOVING_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014SimpleMovingAverage getSimpleMovingAverage() {
    return simpleMovingAverage;
  }


  @JsonProperty(JSON_PROPERTY_SIMPLE_MOVING_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimpleMovingAverage(InlineResponse20014SimpleMovingAverage simpleMovingAverage) {
    this.simpleMovingAverage = simpleMovingAverage;
  }


  public InlineResponse20014Data rsiWilder(InlineResponse20014RsiWilder rsiWilder) {
    this.rsiWilder = rsiWilder;
    return this;
  }

   /**
   * Get rsiWilder
   * @return rsiWilder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RSI_WILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014RsiWilder getRsiWilder() {
    return rsiWilder;
  }


  @JsonProperty(JSON_PROPERTY_RSI_WILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRsiWilder(InlineResponse20014RsiWilder rsiWilder) {
    this.rsiWilder = rsiWilder;
  }


  public InlineResponse20014Data recommendation(InlineResponse20014Recommendation recommendation) {
    this.recommendation = recommendation;
    return this;
  }

   /**
   * Get recommendation
   * @return recommendation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Recommendation getRecommendation() {
    return recommendation;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendation(InlineResponse20014Recommendation recommendation) {
    this.recommendation = recommendation;
  }


  public InlineResponse20014Data estimates(InlineResponse20014Estimates estimates) {
    this.estimates = estimates;
    return this;
  }

   /**
   * Get estimates
   * @return estimates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014Estimates getEstimates() {
    return estimates;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimates(InlineResponse20014Estimates estimates) {
    this.estimates = estimates;
  }


  /**
   * Return true if this inline_response_200_14_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014Data inlineResponse20014Data = (InlineResponse20014Data) o;
    return equalsNullable(this.id, inlineResponse20014Data.id) &&
        Objects.equals(this.valueUnit, inlineResponse20014Data.valueUnit) &&
        Objects.equals(this.market, inlineResponse20014Data.market) &&
        equalsNullable(this.symbol, inlineResponse20014Data.symbol) &&
        Objects.equals(this.nsin, inlineResponse20014Data.nsin) &&
        Objects.equals(this.fsym, inlineResponse20014Data.fsym) &&
        Objects.equals(this.instrument, inlineResponse20014Data.instrument) &&
        Objects.equals(this.esg, inlineResponse20014Data.esg) &&
        Objects.equals(this.compliance, inlineResponse20014Data.compliance) &&
        Objects.equals(this.currentKeyFigures, inlineResponse20014Data.currentKeyFigures) &&
        Objects.equals(this.reportedKeyFigures, inlineResponse20014Data.reportedKeyFigures) &&
        Objects.equals(this.benchmark, inlineResponse20014Data.benchmark) &&
        Objects.equals(this.performance, inlineResponse20014Data.performance) &&
        Objects.equals(this.volatility, inlineResponse20014Data.volatility) &&
        Objects.equals(this.tradingValue, inlineResponse20014Data.tradingValue) &&
        Objects.equals(this.simpleMovingAverage, inlineResponse20014Data.simpleMovingAverage) &&
        Objects.equals(this.rsiWilder, inlineResponse20014Data.rsiWilder) &&
        Objects.equals(this.recommendation, inlineResponse20014Data.recommendation) &&
        Objects.equals(this.estimates, inlineResponse20014Data.estimates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), valueUnit, market, hashCodeNullable(symbol), nsin, fsym, instrument, esg, compliance, currentKeyFigures, reportedKeyFigures, benchmark, performance, volatility, tradingValue, simpleMovingAverage, rsiWilder, recommendation, estimates);
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
    sb.append("class InlineResponse20014Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    esg: ").append(toIndentedString(esg)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    currentKeyFigures: ").append(toIndentedString(currentKeyFigures)).append("\n");
    sb.append("    reportedKeyFigures: ").append(toIndentedString(reportedKeyFigures)).append("\n");
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    volatility: ").append(toIndentedString(volatility)).append("\n");
    sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
    sb.append("    simpleMovingAverage: ").append(toIndentedString(simpleMovingAverage)).append("\n");
    sb.append("    rsiWilder: ").append(toIndentedString(rsiWilder)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    estimates: ").append(toIndentedString(estimates)).append("\n");
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

