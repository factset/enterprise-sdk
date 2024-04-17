/*
 * FactSet Prices API
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p> 
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
import com.factset.sdk.FactSetPrices.JSON;


/**
 * Price
 */
@JsonPropertyOrder({
  Price.JSON_PROPERTY_FSYM_ID,
  Price.JSON_PROPERTY_DATE,
  Price.JSON_PROPERTY_ADJ_DATE,
  Price.JSON_PROPERTY_CURRENCY,
  Price.JSON_PROPERTY_PRICE,
  Price.JSON_PROPERTY_PRICE_OPEN,
  Price.JSON_PROPERTY_PRICE_HIGH,
  Price.JSON_PROPERTY_PRICE_LOW,
  Price.JSON_PROPERTY_VOLUME,
  Price.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Price implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_ADJ_DATE = "adjDate";
  private JsonNullable<LocalDate> adjDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE = "price";
  private JsonNullable<Double> price = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_OPEN = "priceOpen";
  private JsonNullable<Double> priceOpen = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_HIGH = "priceHigh";
  private JsonNullable<Double> priceHigh = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRICE_LOW = "priceLow";
  private JsonNullable<Double> priceLow = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private JsonNullable<Double> volume = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public Price() { 
  }

  public Price fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SJY281-R", value = "Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
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


  public Price date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * Ending date for the period expressed in YYYY-MM-DD format.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Thu Aug 01 00:00:00 UTC 2013", value = "Ending date for the period expressed in YYYY-MM-DD format.")
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


  public Price adjDate(LocalDate adjDate) {
    this.adjDate = JsonNullable.<LocalDate>of(adjDate);
    return this;
  }

   /**
   * Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split.
   * @return adjDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Mon Feb 07 00:00:00 UTC 2005", value = "Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split.")
  @JsonIgnore

  public LocalDate getAdjDate() {
        return adjDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADJ_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getAdjDate_JsonNullable() {
    return adjDate;
  }
  
  @JsonProperty(JSON_PROPERTY_ADJ_DATE)
  public void setAdjDate_JsonNullable(JsonNullable<LocalDate> adjDate) {
    this.adjDate = adjDate;
  }

  public void setAdjDate(LocalDate adjDate) {
    this.adjDate = JsonNullable.<LocalDate>of(adjDate);
  }


  public Price currency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
    return this;
  }

   /**
   * Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
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


  public Price price(Double price) {
    this.price = JsonNullable.<Double>of(price);
    return this;
  }

   /**
   * Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "125", value = "Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.")
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


  public Price priceOpen(Double priceOpen) {
    this.priceOpen = JsonNullable.<Double>of(priceOpen);
    return this;
  }

   /**
   * Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.
   * @return priceOpen
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "123.75", value = "Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.")
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


  public Price priceHigh(Double priceHigh) {
    this.priceHigh = JsonNullable.<Double>of(priceHigh);
    return this;
  }

   /**
   * High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.
   * @return priceHigh
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "126", value = "High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.")
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


  public Price priceLow(Double priceLow) {
    this.priceLow = JsonNullable.<Double>of(priceLow);
    return this;
  }

   /**
   * Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.
   * @return priceLow
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "121.25", value = "Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.")
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


  public Price volume(Double volume) {
    this.volume = JsonNullable.<Double>of(volume);
    return this;
  }

   /**
   * Returns the cumulative volume over dates requested. Data is returned in thousands.
   * @return volume
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "120341", value = "Returns the cumulative volume over dates requested. Data is returned in thousands.")
  @JsonIgnore

  public Double getVolume() {
        return volume.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getVolume_JsonNullable() {
    return volume;
  }
  
  @JsonProperty(JSON_PROPERTY_VOLUME)
  public void setVolume_JsonNullable(JsonNullable<Double> volume) {
    this.volume = volume;
  }

  public void setVolume(Double volume) {
    this.volume = JsonNullable.<Double>of(volume);
  }


  public Price requestId(String requestId) {
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


  /**
   * Return true if this price object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return equalsNullable(this.fsymId, price.fsymId) &&
        equalsNullable(this.date, price.date) &&
        equalsNullable(this.adjDate, price.adjDate) &&
        equalsNullable(this.currency, price.currency) &&
        equalsNullable(this.price, price.price) &&
        equalsNullable(this.priceOpen, price.priceOpen) &&
        equalsNullable(this.priceHigh, price.priceHigh) &&
        equalsNullable(this.priceLow, price.priceLow) &&
        equalsNullable(this.volume, price.volume) &&
        Objects.equals(this.requestId, price.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(date), hashCodeNullable(adjDate), hashCodeNullable(currency), hashCodeNullable(price), hashCodeNullable(priceOpen), hashCodeNullable(priceHigh), hashCodeNullable(priceLow), hashCodeNullable(volume), requestId);
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
    sb.append("class Price {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    adjDate: ").append(toIndentedString(adjDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceOpen: ").append(toIndentedString(priceOpen)).append("\n");
    sb.append("    priceHigh: ").append(toIndentedString(priceHigh)).append("\n");
    sb.append("    priceLow: ").append(toIndentedString(priceLow)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

