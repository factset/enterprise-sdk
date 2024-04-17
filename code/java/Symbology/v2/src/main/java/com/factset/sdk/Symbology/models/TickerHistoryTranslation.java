/*
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Symbology.models;

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
import com.factset.sdk.Symbology.JSON;


/**
 * Ticker History Translation data object.
 */
@ApiModel(description = "Ticker History Translation data object.")
@JsonPropertyOrder({
  TickerHistoryTranslation.JSON_PROPERTY_FSYM_ID,
  TickerHistoryTranslation.JSON_PROPERTY_NAME,
  TickerHistoryTranslation.JSON_PROPERTY_TICKER,
  TickerHistoryTranslation.JSON_PROPERTY_TICKER_EFFECTIVE_START_DATE,
  TickerHistoryTranslation.JSON_PROPERTY_AS_OF_DATE,
  TickerHistoryTranslation.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TickerHistoryTranslation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private String ticker;

  public static final String JSON_PROPERTY_TICKER_EFFECTIVE_START_DATE = "tickerEffectiveStartDate";
  private LocalDate tickerEffectiveStartDate;

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private LocalDate asOfDate;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public TickerHistoryTranslation() { 
  }

  public TickerHistoryTranslation fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "HTM0LK-R", value = "FactSet Default Permanent Identifier. Regional and Composite (-USA) request `ids` will use a Regional ID '-R', Listing specific ids '-NYS' will use Listing ids '-L', Entities will use '-E', and FI will use security '-S' ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)")
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


  public TickerHistoryTranslation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Proper Name of company or issuer.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Alphabet Inc. Class A", value = "Proper Name of company or issuer.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TickerHistoryTranslation ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Region or Exchange Ticker
   * @return ticker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "GOOGL-US", value = "Region or Exchange Ticker")
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


  public TickerHistoryTranslation tickerEffectiveStartDate(LocalDate tickerEffectiveStartDate) {
    this.tickerEffectiveStartDate = tickerEffectiveStartDate;
    return this;
  }

   /**
   * Ticker effective start date in YYYY-MM-DD format.
   * @return tickerEffectiveStartDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Thu Apr 03 00:00:00 UTC 2014", value = "Ticker effective start date in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_TICKER_EFFECTIVE_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getTickerEffectiveStartDate() {
    return tickerEffectiveStartDate;
  }


  @JsonProperty(JSON_PROPERTY_TICKER_EFFECTIVE_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickerEffectiveStartDate(LocalDate tickerEffectiveStartDate) {
    this.tickerEffectiveStartDate = tickerEffectiveStartDate;
  }


  public TickerHistoryTranslation asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * As of Date in YYYY-MM-DD format.
   * @return asOfDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri Dec 31 00:00:00 UTC 2010", value = "As of Date in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getAsOfDate() {
    return asOfDate;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }


  public TickerHistoryTranslation requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier specified in the request
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "GOOGL", value = "Identifier specified in the request")
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
   * Return true if this tickerHistoryTranslation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TickerHistoryTranslation tickerHistoryTranslation = (TickerHistoryTranslation) o;
    return Objects.equals(this.fsymId, tickerHistoryTranslation.fsymId) &&
        Objects.equals(this.name, tickerHistoryTranslation.name) &&
        Objects.equals(this.ticker, tickerHistoryTranslation.ticker) &&
        Objects.equals(this.tickerEffectiveStartDate, tickerHistoryTranslation.tickerEffectiveStartDate) &&
        Objects.equals(this.asOfDate, tickerHistoryTranslation.asOfDate) &&
        Objects.equals(this.requestId, tickerHistoryTranslation.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, name, ticker, tickerEffectiveStartDate, asOfDate, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TickerHistoryTranslation {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    tickerEffectiveStartDate: ").append(toIndentedString(tickerEffectiveStartDate)).append("\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
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

