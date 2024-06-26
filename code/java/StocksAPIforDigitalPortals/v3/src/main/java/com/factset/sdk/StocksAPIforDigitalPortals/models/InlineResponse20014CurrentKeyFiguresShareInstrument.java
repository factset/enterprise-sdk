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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014CurrentKeyFiguresShareInstrumentCurrencyDependent;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014CurrentKeyFiguresShareInstrumentRatios;
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
 * Share instrument key figures.
 */
@ApiModel(description = "Share instrument key figures.")
@JsonPropertyOrder({
  InlineResponse20014CurrentKeyFiguresShareInstrument.JSON_PROPERTY_SHARES_OUTSTANDING,
  InlineResponse20014CurrentKeyFiguresShareInstrument.JSON_PROPERTY_FREE_FLOAT,
  InlineResponse20014CurrentKeyFiguresShareInstrument.JSON_PROPERTY_RATIOS,
  InlineResponse20014CurrentKeyFiguresShareInstrument.JSON_PROPERTY_CURRENCY_DEPENDENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20014CurrentKeyFiguresShareInstrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SHARES_OUTSTANDING = "sharesOutstanding";
  private JsonNullable<String> sharesOutstanding = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FREE_FLOAT = "freeFloat";
  private JsonNullable<String> freeFloat = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RATIOS = "ratios";
  private InlineResponse20014CurrentKeyFiguresShareInstrumentRatios ratios;

  public static final String JSON_PROPERTY_CURRENCY_DEPENDENT = "currencyDependent";
  private InlineResponse20014CurrentKeyFiguresShareInstrumentCurrencyDependent currencyDependent;

  public InlineResponse20014CurrentKeyFiguresShareInstrument() { 
  }

  public InlineResponse20014CurrentKeyFiguresShareInstrument sharesOutstanding(String sharesOutstanding) {
    this.sharesOutstanding = JsonNullable.<String>of(sharesOutstanding);
    return this;
  }

   /**
   * Number of outstanding shares.
   * @return sharesOutstanding
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of outstanding shares.")
  @JsonIgnore

  public String getSharesOutstanding() {
        return sharesOutstanding.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARES_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSharesOutstanding_JsonNullable() {
    return sharesOutstanding;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARES_OUTSTANDING)
  public void setSharesOutstanding_JsonNullable(JsonNullable<String> sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }

  public void setSharesOutstanding(String sharesOutstanding) {
    this.sharesOutstanding = JsonNullable.<String>of(sharesOutstanding);
  }


  public InlineResponse20014CurrentKeyFiguresShareInstrument freeFloat(String freeFloat) {
    this.freeFloat = JsonNullable.<String>of(freeFloat);
    return this;
  }

   /**
   * Number of free float shares.
   * @return freeFloat
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of free float shares.")
  @JsonIgnore

  public String getFreeFloat() {
        return freeFloat.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FREE_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFreeFloat_JsonNullable() {
    return freeFloat;
  }
  
  @JsonProperty(JSON_PROPERTY_FREE_FLOAT)
  public void setFreeFloat_JsonNullable(JsonNullable<String> freeFloat) {
    this.freeFloat = freeFloat;
  }

  public void setFreeFloat(String freeFloat) {
    this.freeFloat = JsonNullable.<String>of(freeFloat);
  }


  public InlineResponse20014CurrentKeyFiguresShareInstrument ratios(InlineResponse20014CurrentKeyFiguresShareInstrumentRatios ratios) {
    this.ratios = ratios;
    return this;
  }

   /**
   * Get ratios
   * @return ratios
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014CurrentKeyFiguresShareInstrumentRatios getRatios() {
    return ratios;
  }


  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatios(InlineResponse20014CurrentKeyFiguresShareInstrumentRatios ratios) {
    this.ratios = ratios;
  }


  public InlineResponse20014CurrentKeyFiguresShareInstrument currencyDependent(InlineResponse20014CurrentKeyFiguresShareInstrumentCurrencyDependent currencyDependent) {
    this.currencyDependent = currencyDependent;
    return this;
  }

   /**
   * Get currencyDependent
   * @return currencyDependent
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014CurrentKeyFiguresShareInstrumentCurrencyDependent getCurrencyDependent() {
    return currencyDependent;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyDependent(InlineResponse20014CurrentKeyFiguresShareInstrumentCurrencyDependent currencyDependent) {
    this.currencyDependent = currencyDependent;
  }


  /**
   * Return true if this inline_response_200_14_currentKeyFigures_shareInstrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014CurrentKeyFiguresShareInstrument inlineResponse20014CurrentKeyFiguresShareInstrument = (InlineResponse20014CurrentKeyFiguresShareInstrument) o;
    return equalsNullable(this.sharesOutstanding, inlineResponse20014CurrentKeyFiguresShareInstrument.sharesOutstanding) &&
        equalsNullable(this.freeFloat, inlineResponse20014CurrentKeyFiguresShareInstrument.freeFloat) &&
        Objects.equals(this.ratios, inlineResponse20014CurrentKeyFiguresShareInstrument.ratios) &&
        Objects.equals(this.currencyDependent, inlineResponse20014CurrentKeyFiguresShareInstrument.currencyDependent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(sharesOutstanding), hashCodeNullable(freeFloat), ratios, currencyDependent);
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
    sb.append("class InlineResponse20014CurrentKeyFiguresShareInstrument {\n");
    sb.append("    sharesOutstanding: ").append(toIndentedString(sharesOutstanding)).append("\n");
    sb.append("    freeFloat: ").append(toIndentedString(freeFloat)).append("\n");
    sb.append("    ratios: ").append(toIndentedString(ratios)).append("\n");
    sb.append("    currencyDependent: ").append(toIndentedString(currencyDependent)).append("\n");
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

