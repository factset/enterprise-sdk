/*
 * S&P Global Fixed Income Evaluated Prices & Analytics API
 * Gain access to evaluated pricing and analytics data for Corporate Bonds, Municipal Bonds and Asset Backed Securities provided by S&P Global (formerly IHS Markit) .  Data returned through multiple endpoints like prices, spread, yield, yield curve, sensitivity, coupon information, securities metadata and details specific to the Asset Backed Securities. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.JSON;


/**
 * BondPrices
 */
@JsonPropertyOrder({
  BondPrices.JSON_PROPERTY_REQUEST_ID,
  BondPrices.JSON_PROPERTY_FSYM_ID,
  BondPrices.JSON_PROPERTY_CURRENCY,
  BondPrices.JSON_PROPERTY_DATE,
  BondPrices.JSON_PROPERTY_CLEAN_BID_PRICE,
  BondPrices.JSON_PROPERTY_CLEAN_MID_PRICE,
  BondPrices.JSON_PROPERTY_CLEAN_ASK_PRICE,
  BondPrices.JSON_PROPERTY_DIRTY_BID_PRICE,
  BondPrices.JSON_PROPERTY_DIRTY_MID_PRICE,
  BondPrices.JSON_PROPERTY_DIRTY_ASK_PRICE,
  BondPrices.JSON_PROPERTY_PV,
  BondPrices.JSON_PROPERTY_BID_PRICE_DATE,
  BondPrices.JSON_PROPERTY_MID_PRICE_DATE,
  BondPrices.JSON_PROPERTY_ASK_PRICE_DATE,
  BondPrices.JSON_PROPERTY_BID_PRICE_TYPE,
  BondPrices.JSON_PROPERTY_MID_PRICE_TYPE,
  BondPrices.JSON_PROPERTY_ASK_PRICE_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BondPrices implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_CLEAN_BID_PRICE = "cleanBidPrice";
  private JsonNullable<Double> cleanBidPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CLEAN_MID_PRICE = "cleanMidPrice";
  private JsonNullable<Double> cleanMidPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CLEAN_ASK_PRICE = "cleanAskPrice";
  private JsonNullable<Double> cleanAskPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DIRTY_BID_PRICE = "dirtyBidPrice";
  private JsonNullable<Double> dirtyBidPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DIRTY_MID_PRICE = "dirtyMidPrice";
  private JsonNullable<Double> dirtyMidPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DIRTY_ASK_PRICE = "dirtyAskPrice";
  private JsonNullable<Double> dirtyAskPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PV = "pv";
  private JsonNullable<Double> pv = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_BID_PRICE_DATE = "bidPriceDate";
  private JsonNullable<LocalDate> bidPriceDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_MID_PRICE_DATE = "midPriceDate";
  private JsonNullable<LocalDate> midPriceDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_ASK_PRICE_DATE = "askPriceDate";
  private JsonNullable<LocalDate> askPriceDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_BID_PRICE_TYPE = "bidPriceType";
  private JsonNullable<String> bidPriceType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MID_PRICE_TYPE = "midPriceType";
  private String midPriceType;

  public static final String JSON_PROPERTY_ASK_PRICE_TYPE = "askPriceType";
  private JsonNullable<String> askPriceType = JsonNullable.<String>undefined();

  public BondPrices() { 
  }

  public BondPrices requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US45905URL07", value = "Identifier that was used for the request.")
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


  public BondPrices fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CJQZQ0-S", value = "FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
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


  public BondPrices currency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
    return this;
  }

   /**
   * Returns the coupon currency .Available only  available for &#x60;corporate and asset-backed security bonds&#x60;.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Returns the coupon currency .Available only  available for `corporate and asset-backed security bonds`.")
  @JsonIgnore

  public String getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<String> currency) {
    this.currency = currency;
  }

  public void setCurrency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
  }


  public BondPrices date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * The date on which the price is calculated.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Jan 26 00:00:00 UTC 2023", value = "The date on which the price is calculated.")
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


  public BondPrices cleanBidPrice(Double cleanBidPrice) {
    this.cleanBidPrice = JsonNullable.<Double>of(cleanBidPrice);
    return this;
  }

   /**
   * The bid price of the instrument.
   * @return cleanBidPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95.74477", value = "The bid price of the instrument.")
  @JsonIgnore

  public Double getCleanBidPrice() {
        return cleanBidPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLEAN_BID_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCleanBidPrice_JsonNullable() {
    return cleanBidPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_CLEAN_BID_PRICE)
  public void setCleanBidPrice_JsonNullable(JsonNullable<Double> cleanBidPrice) {
    this.cleanBidPrice = cleanBidPrice;
  }

  public void setCleanBidPrice(Double cleanBidPrice) {
    this.cleanBidPrice = JsonNullable.<Double>of(cleanBidPrice);
  }


  public BondPrices cleanMidPrice(Double cleanMidPrice) {
    this.cleanMidPrice = JsonNullable.<Double>of(cleanMidPrice);
    return this;
  }

   /**
   * The bid price of the instrument.
   * @return cleanMidPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95.77036", value = "The bid price of the instrument.")
  @JsonIgnore

  public Double getCleanMidPrice() {
        return cleanMidPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLEAN_MID_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCleanMidPrice_JsonNullable() {
    return cleanMidPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_CLEAN_MID_PRICE)
  public void setCleanMidPrice_JsonNullable(JsonNullable<Double> cleanMidPrice) {
    this.cleanMidPrice = cleanMidPrice;
  }

  public void setCleanMidPrice(Double cleanMidPrice) {
    this.cleanMidPrice = JsonNullable.<Double>of(cleanMidPrice);
  }


  public BondPrices cleanAskPrice(Double cleanAskPrice) {
    this.cleanAskPrice = JsonNullable.<Double>of(cleanAskPrice);
    return this;
  }

   /**
   * The bid price of the instrument.
   * @return cleanAskPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95.79596", value = "The bid price of the instrument.")
  @JsonIgnore

  public Double getCleanAskPrice() {
        return cleanAskPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLEAN_ASK_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCleanAskPrice_JsonNullable() {
    return cleanAskPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_CLEAN_ASK_PRICE)
  public void setCleanAskPrice_JsonNullable(JsonNullable<Double> cleanAskPrice) {
    this.cleanAskPrice = cleanAskPrice;
  }

  public void setCleanAskPrice(Double cleanAskPrice) {
    this.cleanAskPrice = JsonNullable.<Double>of(cleanAskPrice);
  }


  public BondPrices dirtyBidPrice(Double dirtyBidPrice) {
    this.dirtyBidPrice = JsonNullable.<Double>of(dirtyBidPrice);
    return this;
  }

   /**
   * The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for &#x60;corporate bonds&#x60;.
   * @return dirtyBidPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96.61248", value = "The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for `corporate bonds`.")
  @JsonIgnore

  public Double getDirtyBidPrice() {
        return dirtyBidPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIRTY_BID_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getDirtyBidPrice_JsonNullable() {
    return dirtyBidPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_DIRTY_BID_PRICE)
  public void setDirtyBidPrice_JsonNullable(JsonNullable<Double> dirtyBidPrice) {
    this.dirtyBidPrice = dirtyBidPrice;
  }

  public void setDirtyBidPrice(Double dirtyBidPrice) {
    this.dirtyBidPrice = JsonNullable.<Double>of(dirtyBidPrice);
  }


  public BondPrices dirtyMidPrice(Double dirtyMidPrice) {
    this.dirtyMidPrice = JsonNullable.<Double>of(dirtyMidPrice);
    return this;
  }

   /**
   * The price of the bond plus the interest that is accrued between coupon payments, based on the mid price. Available only  for &#x60;corporate bonds&#x60;.
   * @return dirtyMidPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96.63807", value = "The price of the bond plus the interest that is accrued between coupon payments, based on the mid price. Available only  for `corporate bonds`.")
  @JsonIgnore

  public Double getDirtyMidPrice() {
        return dirtyMidPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIRTY_MID_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getDirtyMidPrice_JsonNullable() {
    return dirtyMidPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_DIRTY_MID_PRICE)
  public void setDirtyMidPrice_JsonNullable(JsonNullable<Double> dirtyMidPrice) {
    this.dirtyMidPrice = dirtyMidPrice;
  }

  public void setDirtyMidPrice(Double dirtyMidPrice) {
    this.dirtyMidPrice = JsonNullable.<Double>of(dirtyMidPrice);
  }


  public BondPrices dirtyAskPrice(Double dirtyAskPrice) {
    this.dirtyAskPrice = JsonNullable.<Double>of(dirtyAskPrice);
    return this;
  }

   /**
   * The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for &#x60;corporate bonds&#x60;.
   * @return dirtyAskPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96.66367", value = "The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for `corporate bonds`.")
  @JsonIgnore

  public Double getDirtyAskPrice() {
        return dirtyAskPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIRTY_ASK_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getDirtyAskPrice_JsonNullable() {
    return dirtyAskPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_DIRTY_ASK_PRICE)
  public void setDirtyAskPrice_JsonNullable(JsonNullable<Double> dirtyAskPrice) {
    this.dirtyAskPrice = dirtyAskPrice;
  }

  public void setDirtyAskPrice(Double dirtyAskPrice) {
    this.dirtyAskPrice = JsonNullable.<Double>of(dirtyAskPrice);
  }


  public BondPrices pv(Double pv) {
    this.pv = JsonNullable.<Double>of(pv);
    return this;
  }

   /**
   * The present variation per one basis point change in yield, based on the mid price .Available only  for &#x60;corporate bonds&#x60;.
   * @return pv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.96728", value = "The present variation per one basis point change in yield, based on the mid price .Available only  for `corporate bonds`.")
  @JsonIgnore

  public Double getPv() {
        return pv.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPv_JsonNullable() {
    return pv;
  }
  
  @JsonProperty(JSON_PROPERTY_PV)
  public void setPv_JsonNullable(JsonNullable<Double> pv) {
    this.pv = pv;
  }

  public void setPv(Double pv) {
    this.pv = JsonNullable.<Double>of(pv);
  }


  public BondPrices bidPriceDate(LocalDate bidPriceDate) {
    this.bidPriceDate = JsonNullable.<LocalDate>of(bidPriceDate);
    return this;
  }

   /**
   * The date the bid price is valued to. Available only  for &#x60;municipal bonds&#x60;.
   * @return bidPriceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the bid price is valued to. Available only  for `municipal bonds`.")
  @JsonIgnore

  public LocalDate getBidPriceDate() {
        return bidPriceDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BID_PRICE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getBidPriceDate_JsonNullable() {
    return bidPriceDate;
  }
  
  @JsonProperty(JSON_PROPERTY_BID_PRICE_DATE)
  public void setBidPriceDate_JsonNullable(JsonNullable<LocalDate> bidPriceDate) {
    this.bidPriceDate = bidPriceDate;
  }

  public void setBidPriceDate(LocalDate bidPriceDate) {
    this.bidPriceDate = JsonNullable.<LocalDate>of(bidPriceDate);
  }


  public BondPrices midPriceDate(LocalDate midPriceDate) {
    this.midPriceDate = JsonNullable.<LocalDate>of(midPriceDate);
    return this;
  }

   /**
   * The date the mid price is valued to. Available only  for &#x60;municipal bonds&#x60;.
   * @return midPriceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the mid price is valued to. Available only  for `municipal bonds`.")
  @JsonIgnore

  public LocalDate getMidPriceDate() {
        return midPriceDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MID_PRICE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getMidPriceDate_JsonNullable() {
    return midPriceDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MID_PRICE_DATE)
  public void setMidPriceDate_JsonNullable(JsonNullable<LocalDate> midPriceDate) {
    this.midPriceDate = midPriceDate;
  }

  public void setMidPriceDate(LocalDate midPriceDate) {
    this.midPriceDate = JsonNullable.<LocalDate>of(midPriceDate);
  }


  public BondPrices askPriceDate(LocalDate askPriceDate) {
    this.askPriceDate = JsonNullable.<LocalDate>of(askPriceDate);
    return this;
  }

   /**
   * The date the ask price is valued to. Available only  for &#x60;municipal bonds&#x60;.
   * @return askPriceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the ask price is valued to. Available only  for `municipal bonds`.")
  @JsonIgnore

  public LocalDate getAskPriceDate() {
        return askPriceDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASK_PRICE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getAskPriceDate_JsonNullable() {
    return askPriceDate;
  }
  
  @JsonProperty(JSON_PROPERTY_ASK_PRICE_DATE)
  public void setAskPriceDate_JsonNullable(JsonNullable<LocalDate> askPriceDate) {
    this.askPriceDate = askPriceDate;
  }

  public void setAskPriceDate(LocalDate askPriceDate) {
    this.askPriceDate = JsonNullable.<LocalDate>of(askPriceDate);
  }


  public BondPrices bidPriceType(String bidPriceType) {
    this.bidPriceType = JsonNullable.<String>of(bidPriceType);
    return this;
  }

   /**
   * Bid price type for the given identifier. Available only  for &#x60;municipal bonds&#x60;.
   * @return bidPriceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bid price type for the given identifier. Available only  for `municipal bonds`.")
  @JsonIgnore

  public String getBidPriceType() {
        return bidPriceType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BID_PRICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBidPriceType_JsonNullable() {
    return bidPriceType;
  }
  
  @JsonProperty(JSON_PROPERTY_BID_PRICE_TYPE)
  public void setBidPriceType_JsonNullable(JsonNullable<String> bidPriceType) {
    this.bidPriceType = bidPriceType;
  }

  public void setBidPriceType(String bidPriceType) {
    this.bidPriceType = JsonNullable.<String>of(bidPriceType);
  }


  public BondPrices midPriceType(String midPriceType) {
    this.midPriceType = midPriceType;
    return this;
  }

   /**
   * Mid price type for the given identifier .Available only  for &#x60;municipal bonds&#x60;.
   * @return midPriceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mid price type for the given identifier .Available only  for `municipal bonds`.")
  @JsonProperty(JSON_PROPERTY_MID_PRICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMidPriceType() {
    return midPriceType;
  }


  @JsonProperty(JSON_PROPERTY_MID_PRICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMidPriceType(String midPriceType) {
    this.midPriceType = midPriceType;
  }


  public BondPrices askPriceType(String askPriceType) {
    this.askPriceType = JsonNullable.<String>of(askPriceType);
    return this;
  }

   /**
   * Ask price type for the given identifier .Available only  for &#x60;municipal bonds&#x60;.
   * @return askPriceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ask price type for the given identifier .Available only  for `municipal bonds`.")
  @JsonIgnore

  public String getAskPriceType() {
        return askPriceType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASK_PRICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAskPriceType_JsonNullable() {
    return askPriceType;
  }
  
  @JsonProperty(JSON_PROPERTY_ASK_PRICE_TYPE)
  public void setAskPriceType_JsonNullable(JsonNullable<String> askPriceType) {
    this.askPriceType = askPriceType;
  }

  public void setAskPriceType(String askPriceType) {
    this.askPriceType = JsonNullable.<String>of(askPriceType);
  }


  /**
   * Return true if this bondPrices object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BondPrices bondPrices = (BondPrices) o;
    return Objects.equals(this.requestId, bondPrices.requestId) &&
        equalsNullable(this.fsymId, bondPrices.fsymId) &&
        equalsNullable(this.currency, bondPrices.currency) &&
        equalsNullable(this.date, bondPrices.date) &&
        equalsNullable(this.cleanBidPrice, bondPrices.cleanBidPrice) &&
        equalsNullable(this.cleanMidPrice, bondPrices.cleanMidPrice) &&
        equalsNullable(this.cleanAskPrice, bondPrices.cleanAskPrice) &&
        equalsNullable(this.dirtyBidPrice, bondPrices.dirtyBidPrice) &&
        equalsNullable(this.dirtyMidPrice, bondPrices.dirtyMidPrice) &&
        equalsNullable(this.dirtyAskPrice, bondPrices.dirtyAskPrice) &&
        equalsNullable(this.pv, bondPrices.pv) &&
        equalsNullable(this.bidPriceDate, bondPrices.bidPriceDate) &&
        equalsNullable(this.midPriceDate, bondPrices.midPriceDate) &&
        equalsNullable(this.askPriceDate, bondPrices.askPriceDate) &&
        equalsNullable(this.bidPriceType, bondPrices.bidPriceType) &&
        Objects.equals(this.midPriceType, bondPrices.midPriceType) &&
        equalsNullable(this.askPriceType, bondPrices.askPriceType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, hashCodeNullable(fsymId), hashCodeNullable(currency), hashCodeNullable(date), hashCodeNullable(cleanBidPrice), hashCodeNullable(cleanMidPrice), hashCodeNullable(cleanAskPrice), hashCodeNullable(dirtyBidPrice), hashCodeNullable(dirtyMidPrice), hashCodeNullable(dirtyAskPrice), hashCodeNullable(pv), hashCodeNullable(bidPriceDate), hashCodeNullable(midPriceDate), hashCodeNullable(askPriceDate), hashCodeNullable(bidPriceType), midPriceType, hashCodeNullable(askPriceType));
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
    sb.append("class BondPrices {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    cleanBidPrice: ").append(toIndentedString(cleanBidPrice)).append("\n");
    sb.append("    cleanMidPrice: ").append(toIndentedString(cleanMidPrice)).append("\n");
    sb.append("    cleanAskPrice: ").append(toIndentedString(cleanAskPrice)).append("\n");
    sb.append("    dirtyBidPrice: ").append(toIndentedString(dirtyBidPrice)).append("\n");
    sb.append("    dirtyMidPrice: ").append(toIndentedString(dirtyMidPrice)).append("\n");
    sb.append("    dirtyAskPrice: ").append(toIndentedString(dirtyAskPrice)).append("\n");
    sb.append("    pv: ").append(toIndentedString(pv)).append("\n");
    sb.append("    bidPriceDate: ").append(toIndentedString(bidPriceDate)).append("\n");
    sb.append("    midPriceDate: ").append(toIndentedString(midPriceDate)).append("\n");
    sb.append("    askPriceDate: ").append(toIndentedString(askPriceDate)).append("\n");
    sb.append("    bidPriceType: ").append(toIndentedString(bidPriceType)).append("\n");
    sb.append("    midPriceType: ").append(toIndentedString(midPriceType)).append("\n");
    sb.append("    askPriceType: ").append(toIndentedString(askPriceType)).append("\n");
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
