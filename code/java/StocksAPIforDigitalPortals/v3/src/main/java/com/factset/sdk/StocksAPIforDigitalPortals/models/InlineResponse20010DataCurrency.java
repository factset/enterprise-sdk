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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Main currency of the dividend. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values.
 */
@ApiModel(description = "Main currency of the dividend. See endpoint `/basic/valueUnit/currency/main/list` for possible values.")
@JsonPropertyOrder({
  InlineResponse20010DataCurrency.JSON_PROPERTY_ID,
  InlineResponse20010DataCurrency.JSON_PROPERTY_ISO_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20010DataCurrency implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<BigDecimal> id = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_ISO_CODE = "isoCode";
  private JsonNullable<String> isoCode = JsonNullable.<String>undefined();

  public InlineResponse20010DataCurrency() { 
  }

  public InlineResponse20010DataCurrency id(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
    return this;
  }

   /**
   * Identifier of the currency.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the currency.")
  @JsonIgnore

  public BigDecimal getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<BigDecimal> id) {
    this.id = id;
  }

  public void setId(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
  }


  public InlineResponse20010DataCurrency isoCode(String isoCode) {
    this.isoCode = JsonNullable.<String>of(isoCode);
    return this;
  }

   /**
   * ISO 4217 code of the currency.
   * @return isoCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 4217 code of the currency.")
  @JsonIgnore

  public String getIsoCode() {
        return isoCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIsoCode_JsonNullable() {
    return isoCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  public void setIsoCode_JsonNullable(JsonNullable<String> isoCode) {
    this.isoCode = isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = JsonNullable.<String>of(isoCode);
  }


  /**
   * Return true if this inline_response_200_10_data_currency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010DataCurrency inlineResponse20010DataCurrency = (InlineResponse20010DataCurrency) o;
    return equalsNullable(this.id, inlineResponse20010DataCurrency.id) &&
        equalsNullable(this.isoCode, inlineResponse20010DataCurrency.isoCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(isoCode));
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
    sb.append("class InlineResponse20010DataCurrency {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
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

