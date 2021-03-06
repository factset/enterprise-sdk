/*
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20064DataInstrument;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20064DataMarket;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20064DataValueUnit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Set of basic data for the notation.
 */
@ApiModel(description = "Set of basic data for the notation.")
@JsonPropertyOrder({
  InlineResponse20064Data.JSON_PROPERTY_SYMBOL,
  InlineResponse20064Data.JSON_PROPERTY_FACT_SET_MARKET_SYMBOL,
  InlineResponse20064Data.JSON_PROPERTY_VALUE_UNIT,
  InlineResponse20064Data.JSON_PROPERTY_MARKET,
  InlineResponse20064Data.JSON_PROPERTY_INSTRUMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20064Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_FACT_SET_MARKET_SYMBOL = "factSetMarketSymbol";
  private String factSetMarketSymbol;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse20064DataValueUnit valueUnit;

  public static final String JSON_PROPERTY_MARKET = "market";
  private InlineResponse20064DataMarket market;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InlineResponse20064DataInstrument instrument;

  public InlineResponse20064Data() { 
  }

  public InlineResponse20064Data symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market.")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public InlineResponse20064Data factSetMarketSymbol(String factSetMarketSymbol) {
    this.factSetMarketSymbol = factSetMarketSymbol;
    return this;
  }

   /**
   * The FactSet market symbol of the notation (i.e. TICKER_EXCHANGE).
   * @return factSetMarketSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The FactSet market symbol of the notation (i.e. TICKER_EXCHANGE).")
  @JsonProperty(JSON_PROPERTY_FACT_SET_MARKET_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFactSetMarketSymbol() {
    return factSetMarketSymbol;
  }


  @JsonProperty(JSON_PROPERTY_FACT_SET_MARKET_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactSetMarketSymbol(String factSetMarketSymbol) {
    this.factSetMarketSymbol = factSetMarketSymbol;
  }


  public InlineResponse20064Data valueUnit(InlineResponse20064DataValueUnit valueUnit) {
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

  public InlineResponse20064DataValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse20064DataValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public InlineResponse20064Data market(InlineResponse20064DataMarket market) {
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

  public InlineResponse20064DataMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(InlineResponse20064DataMarket market) {
    this.market = market;
  }


  public InlineResponse20064Data instrument(InlineResponse20064DataInstrument instrument) {
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

  public InlineResponse20064DataInstrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(InlineResponse20064DataInstrument instrument) {
    this.instrument = instrument;
  }


  /**
   * Return true if this inline_response_200_64_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20064Data inlineResponse20064Data = (InlineResponse20064Data) o;
    return Objects.equals(this.symbol, inlineResponse20064Data.symbol) &&
        Objects.equals(this.factSetMarketSymbol, inlineResponse20064Data.factSetMarketSymbol) &&
        Objects.equals(this.valueUnit, inlineResponse20064Data.valueUnit) &&
        Objects.equals(this.market, inlineResponse20064Data.market) &&
        Objects.equals(this.instrument, inlineResponse20064Data.instrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, factSetMarketSymbol, valueUnit, market, instrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20064Data {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    factSetMarketSymbol: ").append(toIndentedString(factSetMarketSymbol)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
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

