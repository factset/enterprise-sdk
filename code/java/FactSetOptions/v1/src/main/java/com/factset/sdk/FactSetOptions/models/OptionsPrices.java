/*
 * FactSet Options API
 * The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetOptions.models;

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
import com.factset.sdk.FactSetOptions.JSON;


/**
 * The Options prices response object
 */
@ApiModel(description = "The Options prices response object")
@JsonPropertyOrder({
  OptionsPrices.JSON_PROPERTY_ASK_TIME,
  OptionsPrices.JSON_PROPERTY_BID_TIME,
  OptionsPrices.JSON_PROPERTY_DATE,
  OptionsPrices.JSON_PROPERTY_FSYM_ID,
  OptionsPrices.JSON_PROPERTY_PRICE52_WEEK_HIGH,
  OptionsPrices.JSON_PROPERTY_PRICE52_WEEK_LOW,
  OptionsPrices.JSON_PROPERTY_PRICE_ASK,
  OptionsPrices.JSON_PROPERTY_PRICE_BID,
  OptionsPrices.JSON_PROPERTY_PRICE_MID_BID_ASK,
  OptionsPrices.JSON_PROPERTY_PRICE_OPEN,
  OptionsPrices.JSON_PROPERTY_PRICE_HIGH,
  OptionsPrices.JSON_PROPERTY_PRICE_LOW,
  OptionsPrices.JSON_PROPERTY_PRICE_SETTLEMENT,
  OptionsPrices.JSON_PROPERTY_PRICE_STRIKE,
  OptionsPrices.JSON_PROPERTY_PRICE_UNDERLYING,
  OptionsPrices.JSON_PROPERTY_PRICE,
  OptionsPrices.JSON_PROPERTY_QUOTE_TYPE,
  OptionsPrices.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptionsPrices implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ASK_TIME = "askTime";
  private JsonNullable<Double> askTime = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_BID_TIME = "bidTime";
  private JsonNullable<Double> bidTime = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE52_WEEK_HIGH = "price52WeekHigh";
  private JsonNullable<Double> price52WeekHigh = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE52_WEEK_LOW = "price52WeekLow";
  private JsonNullable<Double> price52WeekLow = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_ASK = "priceAsk";
  private JsonNullable<Double> priceAsk = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_BID = "priceBid";
  private JsonNullable<Double> priceBid = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_MID_BID_ASK = "priceMidBidAsk";
  private JsonNullable<Double> priceMidBidAsk = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_OPEN = "priceOpen";
  private JsonNullable<Double> priceOpen = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_HIGH = "priceHigh";
  private JsonNullable<Double> priceHigh = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_LOW = "priceLow";
  private JsonNullable<Double> priceLow = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_SETTLEMENT = "priceSettlement";
  private JsonNullable<BigDecimal> priceSettlement = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_PRICE_STRIKE = "priceStrike";
  private JsonNullable<Double> priceStrike = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_UNDERLYING = "priceUnderlying";
  private JsonNullable<Double> priceUnderlying = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE = "price";
  private JsonNullable<Double> price = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_QUOTE_TYPE = "quoteType";
  private JsonNullable<String> quoteType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public OptionsPrices() { 
  }

  public OptionsPrices askTime(Double askTime) {
    this.askTime = JsonNullable.<Double>of(askTime);
    return this;
  }

   /**
   * Returns the Bid time
   * @return askTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "155959", value = "Returns the Bid time")
  @JsonIgnore

  public Double getAskTime() {
        return askTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getAskTime_JsonNullable() {
    return askTime;
  }
  
  @JsonProperty(JSON_PROPERTY_ASK_TIME)
  public void setAskTime_JsonNullable(JsonNullable<Double> askTime) {
    this.askTime = askTime;
  }

  public void setAskTime(Double askTime) {
    this.askTime = JsonNullable.<Double>of(askTime);
  }


  public OptionsPrices bidTime(Double bidTime) {
    this.bidTime = JsonNullable.<Double>of(bidTime);
    return this;
  }

   /**
   * Returns the Last Trade time
   * @return bidTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "155959", value = "Returns the Last Trade time")
  @JsonIgnore

  public Double getBidTime() {
        return bidTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BID_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getBidTime_JsonNullable() {
    return bidTime;
  }
  
  @JsonProperty(JSON_PROPERTY_BID_TIME)
  public void setBidTime_JsonNullable(JsonNullable<Double> bidTime) {
    this.bidTime = bidTime;
  }

  public void setBidTime(Double bidTime) {
    this.bidTime = JsonNullable.<Double>of(bidTime);
  }


  public OptionsPrices date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * The date of data in YYYY-MM-DD format
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Wed May 05 00:00:00 UTC 2021", value = "The date of data in YYYY-MM-DD format")
  @JsonIgnore

  public LocalDate getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<LocalDate> date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
  }


  public OptionsPrices fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TSLA.US#C00LP", value = "FactSet's Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)")
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


  public OptionsPrices price52WeekHigh(Double price52WeekHigh) {
    this.price52WeekHigh = JsonNullable.<Double>of(price52WeekHigh);
    return this;
  }

   /**
   * 52-Week High Price
   * @return price52WeekHigh
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "663.6", value = "52-Week High Price")
  @JsonIgnore

  public Double getPrice52WeekHigh() {
        return price52WeekHigh.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE52_WEEK_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPrice52WeekHigh_JsonNullable() {
    return price52WeekHigh;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE52_WEEK_HIGH)
  public void setPrice52WeekHigh_JsonNullable(JsonNullable<Double> price52WeekHigh) {
    this.price52WeekHigh = price52WeekHigh;
  }

  public void setPrice52WeekHigh(Double price52WeekHigh) {
    this.price52WeekHigh = JsonNullable.<Double>of(price52WeekHigh);
  }


  public OptionsPrices price52WeekLow(Double price52WeekLow) {
    this.price52WeekLow = JsonNullable.<Double>of(price52WeekLow);
    return this;
  }

   /**
   * 52-Week Low Price
   * @return price52WeekLow
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "189.3", value = "52-Week Low Price")
  @JsonIgnore

  public Double getPrice52WeekLow() {
        return price52WeekLow.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE52_WEEK_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPrice52WeekLow_JsonNullable() {
    return price52WeekLow;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE52_WEEK_LOW)
  public void setPrice52WeekLow_JsonNullable(JsonNullable<Double> price52WeekLow) {
    this.price52WeekLow = price52WeekLow;
  }

  public void setPrice52WeekLow(Double price52WeekLow) {
    this.price52WeekLow = JsonNullable.<Double>of(price52WeekLow);
  }


  public OptionsPrices priceAsk(Double priceAsk) {
    this.priceAsk = JsonNullable.<Double>of(priceAsk);
    return this;
  }

   /**
   * Ask price of the option
   * @return priceAsk
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "492", value = "Ask price of the option")
  @JsonIgnore

  public Double getPriceAsk() {
        return priceAsk.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_ASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPriceAsk_JsonNullable() {
    return priceAsk;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_ASK)
  public void setPriceAsk_JsonNullable(JsonNullable<Double> priceAsk) {
    this.priceAsk = priceAsk;
  }

  public void setPriceAsk(Double priceAsk) {
    this.priceAsk = JsonNullable.<Double>of(priceAsk);
  }


  public OptionsPrices priceBid(Double priceBid) {
    this.priceBid = JsonNullable.<Double>of(priceBid);
    return this;
  }

   /**
   * Bid price of the option
   * @return priceBid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "472.25", value = "Bid price of the option")
  @JsonIgnore

  public Double getPriceBid() {
        return priceBid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPriceBid_JsonNullable() {
    return priceBid;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_BID)
  public void setPriceBid_JsonNullable(JsonNullable<Double> priceBid) {
    this.priceBid = priceBid;
  }

  public void setPriceBid(Double priceBid) {
    this.priceBid = JsonNullable.<Double>of(priceBid);
  }


  public OptionsPrices priceMidBidAsk(Double priceMidBidAsk) {
    this.priceMidBidAsk = JsonNullable.<Double>of(priceMidBidAsk);
    return this;
  }

   /**
   * Mid/Bid/Ask price of the option
   * @return priceMidBidAsk
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "482.125", value = "Mid/Bid/Ask price of the option")
  @JsonIgnore

  public Double getPriceMidBidAsk() {
        return priceMidBidAsk.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_MID_BID_ASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPriceMidBidAsk_JsonNullable() {
    return priceMidBidAsk;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_MID_BID_ASK)
  public void setPriceMidBidAsk_JsonNullable(JsonNullable<Double> priceMidBidAsk) {
    this.priceMidBidAsk = priceMidBidAsk;
  }

  public void setPriceMidBidAsk(Double priceMidBidAsk) {
    this.priceMidBidAsk = JsonNullable.<Double>of(priceMidBidAsk);
  }


  public OptionsPrices priceOpen(Double priceOpen) {
    this.priceOpen = JsonNullable.<Double>of(priceOpen);
    return this;
  }

   /**
   * Open price of the option
   * @return priceOpen
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Open price of the option")
  @JsonIgnore

  public Double getPriceOpen() {
        return priceOpen.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPriceOpen_JsonNullable() {
    return priceOpen;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_OPEN)
  public void setPriceOpen_JsonNullable(JsonNullable<Double> priceOpen) {
    this.priceOpen = priceOpen;
  }

  public void setPriceOpen(Double priceOpen) {
    this.priceOpen = JsonNullable.<Double>of(priceOpen);
  }


  public OptionsPrices priceHigh(Double priceHigh) {
    this.priceHigh = JsonNullable.<Double>of(priceHigh);
    return this;
  }

   /**
   * High price of the option
   * @return priceHigh
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "High price of the option")
  @JsonIgnore

  public Double getPriceHigh() {
        return priceHigh.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPriceHigh_JsonNullable() {
    return priceHigh;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_HIGH)
  public void setPriceHigh_JsonNullable(JsonNullable<Double> priceHigh) {
    this.priceHigh = priceHigh;
  }

  public void setPriceHigh(Double priceHigh) {
    this.priceHigh = JsonNullable.<Double>of(priceHigh);
  }


  public OptionsPrices priceLow(Double priceLow) {
    this.priceLow = JsonNullable.<Double>of(priceLow);
    return this;
  }

   /**
   * Low price of the option
   * @return priceLow
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Low price of the option")
  @JsonIgnore

  public Double getPriceLow() {
        return priceLow.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPriceLow_JsonNullable() {
    return priceLow;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_LOW)
  public void setPriceLow_JsonNullable(JsonNullable<Double> priceLow) {
    this.priceLow = priceLow;
  }

  public void setPriceLow(Double priceLow) {
    this.priceLow = JsonNullable.<Double>of(priceLow);
  }


  public OptionsPrices priceSettlement(BigDecimal priceSettlement) {
    this.priceSettlement = JsonNullable.<BigDecimal>of(priceSettlement);
    return this;
  }

   /**
   * Settlement price of the option
   * @return priceSettlement
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Settlement price of the option")
  @JsonIgnore

  public BigDecimal getPriceSettlement() {
        return priceSettlement.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_SETTLEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getPriceSettlement_JsonNullable() {
    return priceSettlement;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_SETTLEMENT)
  public void setPriceSettlement_JsonNullable(JsonNullable<BigDecimal> priceSettlement) {
    this.priceSettlement = priceSettlement;
  }

  public void setPriceSettlement(BigDecimal priceSettlement) {
    this.priceSettlement = JsonNullable.<BigDecimal>of(priceSettlement);
  }


  public OptionsPrices priceStrike(Double priceStrike) {
    this.priceStrike = JsonNullable.<Double>of(priceStrike);
    return this;
  }

   /**
   * The stated price per share for which underlying stock may be purchased (for a call) or sold (for a put) by the option holder upon exercise of the option contract.
   * @return priceStrike
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "190", value = "The stated price per share for which underlying stock may be purchased (for a call) or sold (for a put) by the option holder upon exercise of the option contract.")
  @JsonIgnore

  public Double getPriceStrike() {
        return priceStrike.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_STRIKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPriceStrike_JsonNullable() {
    return priceStrike;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_STRIKE)
  public void setPriceStrike_JsonNullable(JsonNullable<Double> priceStrike) {
    this.priceStrike = priceStrike;
  }

  public void setPriceStrike(Double priceStrike) {
    this.priceStrike = JsonNullable.<Double>of(priceStrike);
  }


  public OptionsPrices priceUnderlying(Double priceUnderlying) {
    this.priceUnderlying = JsonNullable.<Double>of(priceUnderlying);
    return this;
  }

   /**
   * The price of the security that must be delivered when a derivative contract, such as a put or call option, is exercised.
   * @return priceUnderlying
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "670.94", value = "The price of the security that must be delivered when a derivative contract, such as a put or call option, is exercised.")
  @JsonIgnore

  public Double getPriceUnderlying() {
        return priceUnderlying.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_UNDERLYING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPriceUnderlying_JsonNullable() {
    return priceUnderlying;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_UNDERLYING)
  public void setPriceUnderlying_JsonNullable(JsonNullable<Double> priceUnderlying) {
    this.priceUnderlying = priceUnderlying;
  }

  public void setPriceUnderlying(Double priceUnderlying) {
    this.priceUnderlying = JsonNullable.<Double>of(priceUnderlying);
  }


  public OptionsPrices price(Double price) {
    this.price = JsonNullable.<Double>of(price);
    return this;
  }

   /**
   * The price of the option based on the &#x60;quoteType&#x60; calculation. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;. 
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "428.375", value = "The price of the option based on the `quoteType` calculation. For US Options - Returns \"Ask Price\" if calc status==20, otherwise returns \"Mid Bid/Ask Price\". For International Options - Returns \"Settlement Price\". ")
  @JsonIgnore

  public Double getPrice() {
        return price.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPrice_JsonNullable() {
    return price;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE)
  public void setPrice_JsonNullable(JsonNullable<Double> price) {
    this.price = price;
  }

  public void setPrice(Double price) {
    this.price = JsonNullable.<Double>of(price);
  }


  public OptionsPrices quoteType(String quoteType) {
    this.quoteType = JsonNullable.<String>of(quoteType);
    return this;
  }

   /**
   * The calculated quote type, based on the calculated status. This represents the type for &#x60;price&#x60; field. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;. 
   * @return quoteType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Mid Bid/Ask Price", value = "The calculated quote type, based on the calculated status. This represents the type for `price` field. For US Options - Returns \"Ask Price\" if calc status==20, otherwise returns \"Mid Bid/Ask Price\". For International Options - Returns \"Settlement Price\". ")
  @JsonIgnore

  public String getQuoteType() {
        return quoteType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUOTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getQuoteType_JsonNullable() {
    return quoteType;
  }
  
  @JsonProperty(JSON_PROPERTY_QUOTE_TYPE)
  public void setQuoteType_JsonNullable(JsonNullable<String> quoteType) {
    this.quoteType = quoteType;
  }

  public void setQuoteType(String quoteType) {
    this.quoteType = JsonNullable.<String>of(quoteType);
  }


  public OptionsPrices requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The requested identifier submitted in the query.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TSLA.US#C00LP", value = "The requested identifier submitted in the query.")
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


  /**
   * Return true if this optionsPrices object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionsPrices optionsPrices = (OptionsPrices) o;
    return equalsNullable(this.askTime, optionsPrices.askTime) &&
        equalsNullable(this.bidTime, optionsPrices.bidTime) &&
        equalsNullable(this.date, optionsPrices.date) &&
        equalsNullable(this.fsymId, optionsPrices.fsymId) &&
        equalsNullable(this.price52WeekHigh, optionsPrices.price52WeekHigh) &&
        equalsNullable(this.price52WeekLow, optionsPrices.price52WeekLow) &&
        equalsNullable(this.priceAsk, optionsPrices.priceAsk) &&
        equalsNullable(this.priceBid, optionsPrices.priceBid) &&
        equalsNullable(this.priceMidBidAsk, optionsPrices.priceMidBidAsk) &&
        equalsNullable(this.priceOpen, optionsPrices.priceOpen) &&
        equalsNullable(this.priceHigh, optionsPrices.priceHigh) &&
        equalsNullable(this.priceLow, optionsPrices.priceLow) &&
        equalsNullable(this.priceSettlement, optionsPrices.priceSettlement) &&
        equalsNullable(this.priceStrike, optionsPrices.priceStrike) &&
        equalsNullable(this.priceUnderlying, optionsPrices.priceUnderlying) &&
        equalsNullable(this.price, optionsPrices.price) &&
        equalsNullable(this.quoteType, optionsPrices.quoteType) &&
        Objects.equals(this.requestId, optionsPrices.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(askTime), hashCodeNullable(bidTime), hashCodeNullable(date), hashCodeNullable(fsymId), hashCodeNullable(price52WeekHigh), hashCodeNullable(price52WeekLow), hashCodeNullable(priceAsk), hashCodeNullable(priceBid), hashCodeNullable(priceMidBidAsk), hashCodeNullable(priceOpen), hashCodeNullable(priceHigh), hashCodeNullable(priceLow), hashCodeNullable(priceSettlement), hashCodeNullable(priceStrike), hashCodeNullable(priceUnderlying), hashCodeNullable(price), hashCodeNullable(quoteType), requestId);
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
    sb.append("class OptionsPrices {\n");
    sb.append("    askTime: ").append(toIndentedString(askTime)).append("\n");
    sb.append("    bidTime: ").append(toIndentedString(bidTime)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    price52WeekHigh: ").append(toIndentedString(price52WeekHigh)).append("\n");
    sb.append("    price52WeekLow: ").append(toIndentedString(price52WeekLow)).append("\n");
    sb.append("    priceAsk: ").append(toIndentedString(priceAsk)).append("\n");
    sb.append("    priceBid: ").append(toIndentedString(priceBid)).append("\n");
    sb.append("    priceMidBidAsk: ").append(toIndentedString(priceMidBidAsk)).append("\n");
    sb.append("    priceOpen: ").append(toIndentedString(priceOpen)).append("\n");
    sb.append("    priceHigh: ").append(toIndentedString(priceHigh)).append("\n");
    sb.append("    priceLow: ").append(toIndentedString(priceLow)).append("\n");
    sb.append("    priceSettlement: ").append(toIndentedString(priceSettlement)).append("\n");
    sb.append("    priceStrike: ").append(toIndentedString(priceStrike)).append("\n");
    sb.append("    priceUnderlying: ").append(toIndentedString(priceUnderlying)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quoteType: ").append(toIndentedString(quoteType)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

