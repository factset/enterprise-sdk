/*
 * Real-Time Options API
 * The Options API provides detailed information for option contracts (“options”) and option classes. This API presents a consolidated data model that gives access to options data of global options markets such as OPRA, Australia Exchange, Bovespa, CME Group, EUREX, Euronext, Hong Kong, ICE Futures Europe / US, Montreal Exchange, and others.  An option class is a product group of options from the same exchange and with the same underlying. The API includes endpoints to retrieve fundamental data for an option contract such as exercise right, exercise style, strike, maturity, open interest, underlying, etc. as well as risk measures of an option contract such as delta, omega, implied volatility, etc.  Option chains are provided by the /by-class/list endpoint. The list of option contracts for an option class can be filtered by exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The option screener allows you to search for option classes by using text search, root symbol, or ISIN plus additional criteria such as market, underlying, currency, and category. Similar to other screener endpoints in e.g. the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals), the /value-ranges/get endpoint provides the possible values and value ranges plus the number of option contracts for an option class related to the option contracts per criteria such as exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The Options API for Digital Portals seamlessly integrates with the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) that provides real-time, delayed, and end-of-day pricing data and basic security identifier cross-reference. For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api). 
 *
 * The version of the OpenAPI document: 4.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeOptions.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeOptions.models.InlineResponse200DataUnderlyingNotationInstrumentFsym;
import com.factset.sdk.RealTimeOptions.models.InlineResponse200DataUnderlyingNotationInstrumentNsin;
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
import com.factset.sdk.RealTimeOptions.JSON;


/**
 * Instrument of the underlying.
 */
@ApiModel(description = "Instrument of the underlying.")
@JsonPropertyOrder({
  InlineResponse200DataUnderlyingNotationInstrument.JSON_PROPERTY_ID,
  InlineResponse200DataUnderlyingNotationInstrument.JSON_PROPERTY_ISIN,
  InlineResponse200DataUnderlyingNotationInstrument.JSON_PROPERTY_NSIN,
  InlineResponse200DataUnderlyingNotationInstrument.JSON_PROPERTY_FSYM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse200DataUnderlyingNotationInstrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISIN = "isin";
  private JsonNullable<String> isin = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse200DataUnderlyingNotationInstrumentNsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse200DataUnderlyingNotationInstrumentFsym fsym;

  public InlineResponse200DataUnderlyingNotationInstrument() { 
  }

  public InlineResponse200DataUnderlyingNotationInstrument id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of the instrument.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "209485", value = "Identifier of the instrument.")
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


  public InlineResponse200DataUnderlyingNotationInstrument isin(String isin) {
    this.isin = JsonNullable.<String>of(isin);
    return this;
  }

   /**
   * The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
   * @return isin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US3030751057", value = "The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.")
  @JsonIgnore

  public String getIsin() {
        return isin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIsin_JsonNullable() {
    return isin;
  }
  
  @JsonProperty(JSON_PROPERTY_ISIN)
  public void setIsin_JsonNullable(JsonNullable<String> isin) {
    this.isin = isin;
  }

  public void setIsin(String isin) {
    this.isin = JsonNullable.<String>of(isin);
  }


  public InlineResponse200DataUnderlyingNotationInstrument nsin(InlineResponse200DataUnderlyingNotationInstrumentNsin nsin) {
    this.nsin = nsin;
    return this;
  }

   /**
   * Get nsin
   * @return nsin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataUnderlyingNotationInstrumentNsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse200DataUnderlyingNotationInstrumentNsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse200DataUnderlyingNotationInstrument fsym(InlineResponse200DataUnderlyingNotationInstrumentFsym fsym) {
    this.fsym = fsym;
    return this;
  }

   /**
   * Get fsym
   * @return fsym
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataUnderlyingNotationInstrumentFsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse200DataUnderlyingNotationInstrumentFsym fsym) {
    this.fsym = fsym;
  }


  /**
   * Return true if this inline_response_200_data_underlying_notation_instrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataUnderlyingNotationInstrument inlineResponse200DataUnderlyingNotationInstrument = (InlineResponse200DataUnderlyingNotationInstrument) o;
    return equalsNullable(this.id, inlineResponse200DataUnderlyingNotationInstrument.id) &&
        equalsNullable(this.isin, inlineResponse200DataUnderlyingNotationInstrument.isin) &&
        Objects.equals(this.nsin, inlineResponse200DataUnderlyingNotationInstrument.nsin) &&
        Objects.equals(this.fsym, inlineResponse200DataUnderlyingNotationInstrument.fsym);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(isin), nsin, fsym);
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
    sb.append("class InlineResponse200DataUnderlyingNotationInstrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
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

