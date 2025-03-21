/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.JSON;


/**
 * The Outlier object
 */
@ApiModel(description = "The Outlier object")
@JsonPropertyOrder({
  Outlier.JSON_PROPERTY_SECURITY_ID,
  Outlier.JSON_PROPERTY_ORDER_ID,
  Outlier.JSON_PROPERTY_COMPOSITE_ID,
  Outlier.JSON_PROPERTY_MESSAGE_TYPE,
  Outlier.JSON_PROPERTY_METRIC,
  Outlier.JSON_PROPERTY_SIDE,
  Outlier.JSON_PROPERTY_VOLUME,
  Outlier.JSON_PROPERTY_PRICE,
  Outlier.JSON_PROPERTY_VALUE,
  Outlier.JSON_PROPERTY_REF_VALUE,
  Outlier.JSON_PROPERTY_DATE_ID,
  Outlier.JSON_PROPERTY_BROKER,
  Outlier.JSON_PROPERTY_TRADER,
  Outlier.JSON_PROPERTY_CURRENCY,
  Outlier.JSON_PROPERTY_COUNTRY,
  Outlier.JSON_PROPERTY_ISIN,
  Outlier.JSON_PROPERTY_WINSORIZED,
  Outlier.JSON_PROPERTY_OUTLIER,
  Outlier.JSON_PROPERTY_DURATION,
  Outlier.JSON_PROPERTY_TIME_ZONE,
  Outlier.JSON_PROPERTY_TIME_ZONE_NAME,
  Outlier.JSON_PROPERTY_SYMBOL,
  Outlier.JSON_PROPERTY_REGION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Outlier implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SECURITY_ID = "securityId";
  private String securityId;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private String orderId;

  public static final String JSON_PROPERTY_COMPOSITE_ID = "compositeId";
  private String compositeId;

  /**
   * Order type
   */
  public enum MessageTypeEnum {
    UNDEFINED("undefined"),
    
    PARENT("parent"),
    
    CHILD("child");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MessageTypeEnum fromValue(String value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MESSAGE_TYPE = "messageType";
  private MessageTypeEnum messageType;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private Double metric;

  public static final String JSON_PROPERTY_SIDE = "side";
  private String side;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private Double volume;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_REF_VALUE = "refValue";
  private Double refValue;

  public static final String JSON_PROPERTY_DATE_ID = "dateId";
  private String dateId;

  public static final String JSON_PROPERTY_BROKER = "broker";
  private String broker;

  public static final String JSON_PROPERTY_TRADER = "trader";
  private String trader;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_ISIN = "isin";
  private String isin;

  public static final String JSON_PROPERTY_WINSORIZED = "winsorized";
  private Double winsorized;

  public static final String JSON_PROPERTY_OUTLIER = "outlier";
  private Boolean outlier;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public static final String JSON_PROPERTY_TIME_ZONE_NAME = "timeZoneName";
  private String timeZoneName;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public Outlier() { 
  }

  public Outlier securityId(String securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * Security Id
   * @return securityId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Security Id")
  @JsonProperty(JSON_PROPERTY_SECURITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecurityId() {
    return securityId;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }


  public Outlier orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order Id
   * @return orderId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Order Id")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Outlier compositeId(String compositeId) {
    this.compositeId = compositeId;
    return this;
  }

   /**
   * Composite Id
   * @return compositeId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Composite Id")
  @JsonProperty(JSON_PROPERTY_COMPOSITE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompositeId() {
    return compositeId;
  }


  @JsonProperty(JSON_PROPERTY_COMPOSITE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompositeId(String compositeId) {
    this.compositeId = compositeId;
  }


  public Outlier messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Order type
   * @return messageType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Order type")
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageTypeEnum getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  public Outlier metric(Double metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Metric
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Metric")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetric(Double metric) {
    this.metric = metric;
  }


  public Outlier side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Side
   * @return side
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Side")
  @JsonProperty(JSON_PROPERTY_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSide() {
    return side;
  }


  @JsonProperty(JSON_PROPERTY_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSide(String side) {
    this.side = side;
  }


  public Outlier volume(Double volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Volume
   * @return volume
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Volume")
  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getVolume() {
    return volume;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolume(Double volume) {
    this.volume = volume;
  }


  public Outlier price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Price
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Price")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Double price) {
    this.price = price;
  }


  public Outlier value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Value")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Double value) {
    this.value = value;
  }


  public Outlier refValue(Double refValue) {
    this.refValue = refValue;
    return this;
  }

   /**
   * Ref Value
   * @return refValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ref Value")
  @JsonProperty(JSON_PROPERTY_REF_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRefValue() {
    return refValue;
  }


  @JsonProperty(JSON_PROPERTY_REF_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefValue(Double refValue) {
    this.refValue = refValue;
  }


  public Outlier dateId(String dateId) {
    this.dateId = dateId;
    return this;
  }

   /**
   * Date
   * @return dateId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Date")
  @JsonProperty(JSON_PROPERTY_DATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateId() {
    return dateId;
  }


  @JsonProperty(JSON_PROPERTY_DATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateId(String dateId) {
    this.dateId = dateId;
  }


  public Outlier broker(String broker) {
    this.broker = broker;
    return this;
  }

   /**
   * Broker
   * @return broker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Broker")
  @JsonProperty(JSON_PROPERTY_BROKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBroker() {
    return broker;
  }


  @JsonProperty(JSON_PROPERTY_BROKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBroker(String broker) {
    this.broker = broker;
  }


  public Outlier trader(String trader) {
    this.trader = trader;
    return this;
  }

   /**
   * Trader
   * @return trader
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Trader")
  @JsonProperty(JSON_PROPERTY_TRADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrader() {
    return trader;
  }


  @JsonProperty(JSON_PROPERTY_TRADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrader(String trader) {
    this.trader = trader;
  }


  public Outlier currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Currency")
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


  public Outlier country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The two character ISO country code
   * @return country
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The two character ISO country code")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public Outlier isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * Isin
   * @return isin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Isin")
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


  public Outlier winsorized(Double winsorized) {
    this.winsorized = winsorized;
    return this;
  }

   /**
   * Winsorized
   * @return winsorized
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Winsorized")
  @JsonProperty(JSON_PROPERTY_WINSORIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWinsorized() {
    return winsorized;
  }


  @JsonProperty(JSON_PROPERTY_WINSORIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWinsorized(Double winsorized) {
    this.winsorized = winsorized;
  }


  public Outlier outlier(Boolean outlier) {
    this.outlier = outlier;
    return this;
  }

   /**
   * Outlier flag
   * @return outlier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Outlier flag")
  @JsonProperty(JSON_PROPERTY_OUTLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOutlier() {
    return outlier;
  }


  @JsonProperty(JSON_PROPERTY_OUTLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutlier(Boolean outlier) {
    this.outlier = outlier;
  }


  public Outlier duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Duration")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public Outlier timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The timezone identifier as defined in the list of tz database timezones  https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
   * @return timeZone
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The timezone identifier as defined in the list of tz database timezones  https://en.wikipedia.org/wiki/List_of_tz_database_time_zones")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public Outlier timeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
    return this;
  }

   /**
   * The timezone abbreviation as defined in the list of tz database timezones  https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
   * @return timeZoneName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The timezone abbreviation as defined in the list of tz database timezones  https://en.wikipedia.org/wiki/List_of_tz_database_time_zones")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZoneName() {
    return timeZoneName;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
  }


  public Outlier symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol
   * @return symbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Symbol")
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


  public Outlier region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The two character ISO country code of the trading region. EMEA is used for the European trading region
   * @return region
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The two character ISO country code of the trading region. EMEA is used for the European trading region")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * Return true if this Outlier object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outlier outlier = (Outlier) o;
    return Objects.equals(this.securityId, outlier.securityId) &&
        Objects.equals(this.orderId, outlier.orderId) &&
        Objects.equals(this.compositeId, outlier.compositeId) &&
        Objects.equals(this.messageType, outlier.messageType) &&
        Objects.equals(this.metric, outlier.metric) &&
        Objects.equals(this.side, outlier.side) &&
        Objects.equals(this.volume, outlier.volume) &&
        Objects.equals(this.price, outlier.price) &&
        Objects.equals(this.value, outlier.value) &&
        Objects.equals(this.refValue, outlier.refValue) &&
        Objects.equals(this.dateId, outlier.dateId) &&
        Objects.equals(this.broker, outlier.broker) &&
        Objects.equals(this.trader, outlier.trader) &&
        Objects.equals(this.currency, outlier.currency) &&
        Objects.equals(this.country, outlier.country) &&
        Objects.equals(this.isin, outlier.isin) &&
        Objects.equals(this.winsorized, outlier.winsorized) &&
        Objects.equals(this.outlier, outlier.outlier) &&
        Objects.equals(this.duration, outlier.duration) &&
        Objects.equals(this.timeZone, outlier.timeZone) &&
        Objects.equals(this.timeZoneName, outlier.timeZoneName) &&
        Objects.equals(this.symbol, outlier.symbol) &&
        Objects.equals(this.region, outlier.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, orderId, compositeId, messageType, metric, side, volume, price, value, refValue, dateId, broker, trader, currency, country, isin, winsorized, outlier, duration, timeZone, timeZoneName, symbol, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outlier {\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    compositeId: ").append(toIndentedString(compositeId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    refValue: ").append(toIndentedString(refValue)).append("\n");
    sb.append("    dateId: ").append(toIndentedString(dateId)).append("\n");
    sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
    sb.append("    trader: ").append(toIndentedString(trader)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    winsorized: ").append(toIndentedString(winsorized)).append("\n");
    sb.append("    outlier: ").append(toIndentedString(outlier)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timeZoneName: ").append(toIndentedString(timeZoneName)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

