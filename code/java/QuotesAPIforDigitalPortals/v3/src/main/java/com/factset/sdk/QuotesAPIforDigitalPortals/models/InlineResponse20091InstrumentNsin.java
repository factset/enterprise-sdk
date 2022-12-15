/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * NSIN data of the instrument.
 */
@ApiModel(description = "NSIN data of the instrument.")
@JsonPropertyOrder({
  InlineResponse20091InstrumentNsin.JSON_PROPERTY_WKN,
  InlineResponse20091InstrumentNsin.JSON_PROPERTY_VALOR,
  InlineResponse20091InstrumentNsin.JSON_PROPERTY_CUSIP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20091InstrumentNsin implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_WKN = "wkn";
  private JsonNullable<String> wkn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALOR = "valor";
  private JsonNullable<String> valor = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSIP = "cusip";
  private JsonNullable<String> cusip = JsonNullable.<String>undefined();

  public InlineResponse20091InstrumentNsin() { 
  }

  public InlineResponse20091InstrumentNsin wkn(String wkn) {
    this.wkn = JsonNullable.<String>of(wkn);
    return this;
  }

   /**
   * The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.
   * @return wkn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.")
  @JsonIgnore

  public String getWkn() {
        return wkn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WKN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWkn_JsonNullable() {
    return wkn;
  }
  
  @JsonProperty(JSON_PROPERTY_WKN)
  public void setWkn_JsonNullable(JsonNullable<String> wkn) {
    this.wkn = wkn;
  }

  public void setWkn(String wkn) {
    this.wkn = JsonNullable.<String>of(wkn);
  }


  public InlineResponse20091InstrumentNsin valor(String valor) {
    this.valor = JsonNullable.<String>of(valor);
    return this;
  }

   /**
   * The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.
   * @return valor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.")
  @JsonIgnore

  public String getValor() {
        return valor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getValor_JsonNullable() {
    return valor;
  }
  
  @JsonProperty(JSON_PROPERTY_VALOR)
  public void setValor_JsonNullable(JsonNullable<String> valor) {
    this.valor = valor;
  }

  public void setValor(String valor) {
    this.valor = JsonNullable.<String>of(valor);
  }


  public InlineResponse20091InstrumentNsin cusip(String cusip) {
    this.cusip = JsonNullable.<String>of(cusip);
    return this;
  }

   /**
   * The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.
   * @return cusip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.")
  @JsonIgnore

  public String getCusip() {
        return cusip.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCusip_JsonNullable() {
    return cusip;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSIP)
  public void setCusip_JsonNullable(JsonNullable<String> cusip) {
    this.cusip = cusip;
  }

  public void setCusip(String cusip) {
    this.cusip = JsonNullable.<String>of(cusip);
  }


  /**
   * Return true if this inline_response_200_91_instrument_nsin object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20091InstrumentNsin inlineResponse20091InstrumentNsin = (InlineResponse20091InstrumentNsin) o;
    return equalsNullable(this.wkn, inlineResponse20091InstrumentNsin.wkn) &&
        equalsNullable(this.valor, inlineResponse20091InstrumentNsin.valor) &&
        equalsNullable(this.cusip, inlineResponse20091InstrumentNsin.cusip);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(wkn), hashCodeNullable(valor), hashCodeNullable(cusip));
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
    sb.append("class InlineResponse20091InstrumentNsin {\n");
    sb.append("    wkn: ").append(toIndentedString(wkn)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
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

