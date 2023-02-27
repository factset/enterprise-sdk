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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20013Accumulated;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20013Currency;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20013Fsym;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20013Instrument;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20013Market;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20013Trade;
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
 * InlineResponse20013Data
 */
@JsonPropertyOrder({
  InlineResponse20013Data.JSON_PROPERTY_ID,
  InlineResponse20013Data.JSON_PROPERTY_SYMBOL,
  InlineResponse20013Data.JSON_PROPERTY_MARKET,
  InlineResponse20013Data.JSON_PROPERTY_CURRENCY,
  InlineResponse20013Data.JSON_PROPERTY_IS_ALTERNATIVE,
  InlineResponse20013Data.JSON_PROPERTY_TRADE,
  InlineResponse20013Data.JSON_PROPERTY_QUALITY,
  InlineResponse20013Data.JSON_PROPERTY_ACCUMULATED,
  InlineResponse20013Data.JSON_PROPERTY_FSYM,
  InlineResponse20013Data.JSON_PROPERTY_INSTRUMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20013Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private JsonNullable<String> symbol = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MARKET = "market";
  private InlineResponse20013Market market;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse20013Currency currency;

  public static final String JSON_PROPERTY_IS_ALTERNATIVE = "isAlternative";
  private JsonNullable<Boolean> isAlternative = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TRADE = "trade";
  private InlineResponse20013Trade trade;

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private JsonNullable<String> quality = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCUMULATED = "accumulated";
  private InlineResponse20013Accumulated accumulated;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse20013Fsym fsym;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InlineResponse20013Instrument instrument;

  public InlineResponse20013Data() { 
  }

  public InlineResponse20013Data id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of a notation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a notation.")
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


  public InlineResponse20013Data symbol(String symbol) {
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


  public InlineResponse20013Data market(InlineResponse20013Market market) {
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

  public InlineResponse20013Market getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(InlineResponse20013Market market) {
    this.market = market;
  }


  public InlineResponse20013Data currency(InlineResponse20013Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20013Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse20013Currency currency) {
    this.currency = currency;
  }


  public InlineResponse20013Data isAlternative(Boolean isAlternative) {
    this.isAlternative = JsonNullable.<Boolean>of(isAlternative);
    return this;
  }

   /**
   * Indicates whether the notation is an alternative one, i.e. not the original notation of the index constituent.
   * @return isAlternative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the notation is an alternative one, i.e. not the original notation of the index constituent.")
  @JsonIgnore

  public Boolean getIsAlternative() {
        return isAlternative.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_ALTERNATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsAlternative_JsonNullable() {
    return isAlternative;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_ALTERNATIVE)
  public void setIsAlternative_JsonNullable(JsonNullable<Boolean> isAlternative) {
    this.isAlternative = isAlternative;
  }

  public void setIsAlternative(Boolean isAlternative) {
    this.isAlternative = JsonNullable.<Boolean>of(isAlternative);
  }


  public InlineResponse20013Data trade(InlineResponse20013Trade trade) {
    this.trade = trade;
    return this;
  }

   /**
   * Get trade
   * @return trade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20013Trade getTrade() {
    return trade;
  }


  @JsonProperty(JSON_PROPERTY_TRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrade(InlineResponse20013Trade trade) {
    this.trade = trade;
  }


  public InlineResponse20013Data quality(String quality) {
    this.quality = JsonNullable.<String>of(quality);
    return this;
  }

   /**
   * Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quality of the trade-related attributes, see attributes `trade` and `accumulated`.")
  @JsonIgnore

  public String getQuality() {
        return quality.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getQuality_JsonNullable() {
    return quality;
  }
  
  @JsonProperty(JSON_PROPERTY_QUALITY)
  public void setQuality_JsonNullable(JsonNullable<String> quality) {
    this.quality = quality;
  }

  public void setQuality(String quality) {
    this.quality = JsonNullable.<String>of(quality);
  }


  public InlineResponse20013Data accumulated(InlineResponse20013Accumulated accumulated) {
    this.accumulated = accumulated;
    return this;
  }

   /**
   * Get accumulated
   * @return accumulated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCUMULATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20013Accumulated getAccumulated() {
    return accumulated;
  }


  @JsonProperty(JSON_PROPERTY_ACCUMULATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumulated(InlineResponse20013Accumulated accumulated) {
    this.accumulated = accumulated;
  }


  public InlineResponse20013Data fsym(InlineResponse20013Fsym fsym) {
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


  public InlineResponse20013Data instrument(InlineResponse20013Instrument instrument) {
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

  public InlineResponse20013Instrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(InlineResponse20013Instrument instrument) {
    this.instrument = instrument;
  }


  /**
   * Return true if this inline_response_200_13_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013Data inlineResponse20013Data = (InlineResponse20013Data) o;
    return equalsNullable(this.id, inlineResponse20013Data.id) &&
        equalsNullable(this.symbol, inlineResponse20013Data.symbol) &&
        Objects.equals(this.market, inlineResponse20013Data.market) &&
        Objects.equals(this.currency, inlineResponse20013Data.currency) &&
        equalsNullable(this.isAlternative, inlineResponse20013Data.isAlternative) &&
        Objects.equals(this.trade, inlineResponse20013Data.trade) &&
        equalsNullable(this.quality, inlineResponse20013Data.quality) &&
        Objects.equals(this.accumulated, inlineResponse20013Data.accumulated) &&
        Objects.equals(this.fsym, inlineResponse20013Data.fsym) &&
        Objects.equals(this.instrument, inlineResponse20013Data.instrument);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(symbol), market, currency, hashCodeNullable(isAlternative), trade, hashCodeNullable(quality), accumulated, fsym, instrument);
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
    sb.append("class InlineResponse20013Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isAlternative: ").append(toIndentedString(isAlternative)).append("\n");
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    accumulated: ").append(toIndentedString(accumulated)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
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
