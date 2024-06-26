/*
 * Foreign Exchange Rates API
 * Foreign Exchange Rates API in which retrieves Spots and Forwards for a given currency pair and date range. <p>*Spots and Forwards rates are sourced from W/M Reuters.The WM Company calculates daily standardized spot rates for global foreign exchange transactions, using rates provided by Reuters. These rates are recognized globally as the standard by banks, fund managers, and index compilers; increasingly these rates are also being used for benchmark currency trading. In 1994, WM Company began calculating closing spot rates. Closing spot rates provide a standard set of currency rates so that portfolio valuations can be compared to each other and their performances measured against benchmarks, without having discrepancies caused by exchange rates. Closing spot rates are recorded at 16:00 GMT.*</p> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ForeignExchangeRate.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ForeignExchangeRate.JSON;


/**
 * Forward
 */
@JsonPropertyOrder({
  Forward.JSON_PROPERTY_REQUEST_ID,
  Forward.JSON_PROPERTY_CURRENCY_NAME,
  Forward.JSON_PROPERTY_FORWARD_BID,
  Forward.JSON_PROPERTY_FORWARD_MID,
  Forward.JSON_PROPERTY_FORWARD_ASK,
  Forward.JSON_PROPERTY_DATE,
  Forward.JSON_PROPERTY_FORWARD_PERIOD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Forward implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_CURRENCY_NAME = "currencyName";
  private String currencyName;

  public static final String JSON_PROPERTY_FORWARD_BID = "forwardBid";
  private BigDecimal forwardBid;

  public static final String JSON_PROPERTY_FORWARD_MID = "forwardMid";
  private BigDecimal forwardMid;

  public static final String JSON_PROPERTY_FORWARD_ASK = "forwardAsk";
  private BigDecimal forwardAsk;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_FORWARD_PERIOD = "forwardPeriod";
  private String forwardPeriod;

  public Forward() { 
  }

  public Forward requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The FX Forward Rate currency pair requested in the &#39;ids&#39; parameter. This represents the base and quote currency.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USDGBP", value = "The FX Forward Rate currency pair requested in the 'ids' parameter. This represents the base and quote currency.")
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


  public Forward currencyName(String currencyName) {
    this.currencyName = currencyName;
    return this;
  }

   /**
   * The full text currency pair name expressed in Proper Case.
   * @return currencyName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "British Pounds per U.S. Dollar", value = "The full text currency pair name expressed in Proper Case.")
  @JsonProperty(JSON_PROPERTY_CURRENCY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyName() {
    return currencyName;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }


  public Forward forwardBid(BigDecimal forwardBid) {
    this.forwardBid = forwardBid;
    return this;
  }

   /**
   * The currency pair&#39;s Forward Rate Bid.
   * @return forwardBid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.794937836", value = "The currency pair's Forward Rate Bid.")
  @JsonProperty(JSON_PROPERTY_FORWARD_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getForwardBid() {
    return forwardBid;
  }


  @JsonProperty(JSON_PROPERTY_FORWARD_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardBid(BigDecimal forwardBid) {
    this.forwardBid = forwardBid;
  }


  public Forward forwardMid(BigDecimal forwardMid) {
    this.forwardMid = forwardMid;
    return this;
  }

   /**
   * The currency pair&#39;s Forward Rate Mid.
   * @return forwardMid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.795070563", value = "The currency pair's Forward Rate Mid.")
  @JsonProperty(JSON_PROPERTY_FORWARD_MID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getForwardMid() {
    return forwardMid;
  }


  @JsonProperty(JSON_PROPERTY_FORWARD_MID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardMid(BigDecimal forwardMid) {
    this.forwardMid = forwardMid;
  }


  public Forward forwardAsk(BigDecimal forwardAsk) {
    this.forwardAsk = forwardAsk;
    return this;
  }

   /**
   * The currency pair&#39;s Forward Rate Ask.
   * @return forwardAsk
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.795203333", value = "The currency pair's Forward Rate Ask.")
  @JsonProperty(JSON_PROPERTY_FORWARD_ASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getForwardAsk() {
    return forwardAsk;
  }


  @JsonProperty(JSON_PROPERTY_FORWARD_ASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardAsk(BigDecimal forwardAsk) {
    this.forwardAsk = forwardAsk;
  }


  public Forward date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Ending date for the period expressed in YYYY-MM-DD format.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Tue Jul 07 00:00:00 UTC 2020", value = "Ending date for the period expressed in YYYY-MM-DD format.")
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


  public Forward forwardPeriod(String forwardPeriod) {
    this.forwardPeriod = forwardPeriod;
    return this;
  }

   /**
   * The Forward Time Period requested for the Currency Pair.
   * @return forwardPeriod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1M", value = "The Forward Time Period requested for the Currency Pair.")
  @JsonProperty(JSON_PROPERTY_FORWARD_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getForwardPeriod() {
    return forwardPeriod;
  }


  @JsonProperty(JSON_PROPERTY_FORWARD_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardPeriod(String forwardPeriod) {
    this.forwardPeriod = forwardPeriod;
  }


  /**
   * Return true if this forward object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Forward forward = (Forward) o;
    return Objects.equals(this.requestId, forward.requestId) &&
        Objects.equals(this.currencyName, forward.currencyName) &&
        Objects.equals(this.forwardBid, forward.forwardBid) &&
        Objects.equals(this.forwardMid, forward.forwardMid) &&
        Objects.equals(this.forwardAsk, forward.forwardAsk) &&
        Objects.equals(this.date, forward.date) &&
        Objects.equals(this.forwardPeriod, forward.forwardPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, currencyName, forwardBid, forwardMid, forwardAsk, date, forwardPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Forward {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    forwardBid: ").append(toIndentedString(forwardBid)).append("\n");
    sb.append("    forwardMid: ").append(toIndentedString(forwardMid)).append("\n");
    sb.append("    forwardAsk: ").append(toIndentedString(forwardAsk)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    forwardPeriod: ").append(toIndentedString(forwardPeriod)).append("\n");
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

