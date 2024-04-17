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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20010DataCurrency;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20010DataDates;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20010DataGross;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20010DataOccurrence;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20010DataType;
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
 * InlineResponse20010DataDividends
 */
@JsonPropertyOrder({
  InlineResponse20010DataDividends.JSON_PROPERTY_ID,
  InlineResponse20010DataDividends.JSON_PROPERTY_TYPE,
  InlineResponse20010DataDividends.JSON_PROPERTY_OCCURRENCE,
  InlineResponse20010DataDividends.JSON_PROPERTY_DATES,
  InlineResponse20010DataDividends.JSON_PROPERTY_CURRENCY,
  InlineResponse20010DataDividends.JSON_PROPERTY_GROSS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20010DataDividends implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private InlineResponse20010DataType type;

  public static final String JSON_PROPERTY_OCCURRENCE = "occurrence";
  private InlineResponse20010DataOccurrence occurrence;

  public static final String JSON_PROPERTY_DATES = "dates";
  private InlineResponse20010DataDates dates;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse20010DataCurrency currency;

  public static final String JSON_PROPERTY_GROSS = "gross";
  private InlineResponse20010DataGross gross;

  public InlineResponse20010DataDividends() { 
  }

  public InlineResponse20010DataDividends id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of a dividend.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a dividend.")
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


  public InlineResponse20010DataDividends type(InlineResponse20010DataType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20010DataType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InlineResponse20010DataType type) {
    this.type = type;
  }


  public InlineResponse20010DataDividends occurrence(InlineResponse20010DataOccurrence occurrence) {
    this.occurrence = occurrence;
    return this;
  }

   /**
   * Get occurrence
   * @return occurrence
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCCURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20010DataOccurrence getOccurrence() {
    return occurrence;
  }


  @JsonProperty(JSON_PROPERTY_OCCURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOccurrence(InlineResponse20010DataOccurrence occurrence) {
    this.occurrence = occurrence;
  }


  public InlineResponse20010DataDividends dates(InlineResponse20010DataDates dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20010DataDates getDates() {
    return dates;
  }


  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDates(InlineResponse20010DataDates dates) {
    this.dates = dates;
  }


  public InlineResponse20010DataDividends currency(InlineResponse20010DataCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20010DataCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse20010DataCurrency currency) {
    this.currency = currency;
  }


  public InlineResponse20010DataDividends gross(InlineResponse20010DataGross gross) {
    this.gross = gross;
    return this;
  }

   /**
   * Get gross
   * @return gross
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20010DataGross getGross() {
    return gross;
  }


  @JsonProperty(JSON_PROPERTY_GROSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGross(InlineResponse20010DataGross gross) {
    this.gross = gross;
  }


  /**
   * Return true if this inline_response_200_10_data_dividends object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010DataDividends inlineResponse20010DataDividends = (InlineResponse20010DataDividends) o;
    return equalsNullable(this.id, inlineResponse20010DataDividends.id) &&
        Objects.equals(this.type, inlineResponse20010DataDividends.type) &&
        Objects.equals(this.occurrence, inlineResponse20010DataDividends.occurrence) &&
        Objects.equals(this.dates, inlineResponse20010DataDividends.dates) &&
        Objects.equals(this.currency, inlineResponse20010DataDividends.currency) &&
        Objects.equals(this.gross, inlineResponse20010DataDividends.gross);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), type, occurrence, dates, currency, gross);
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
    sb.append("class InlineResponse20010DataDividends {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    occurrence: ").append(toIndentedString(occurrence)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
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

