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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20015DataTradingValueAverageDays30;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20015DataTradingValueAverageDays5;
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
 * Value range of the arithmetic mean of the trading value for different time ranges.
 */
@ApiModel(description = "Value range of the arithmetic mean of the trading value for different time ranges.")
@JsonPropertyOrder({
  InlineResponse20015DataTradingValueAverage.JSON_PROPERTY_DAYS5,
  InlineResponse20015DataTradingValueAverage.JSON_PROPERTY_DAYS30
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20015DataTradingValueAverage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DAYS5 = "days5";
  private JsonNullable<InlineResponse20015DataTradingValueAverageDays5> days5 = JsonNullable.<InlineResponse20015DataTradingValueAverageDays5>undefined();

  public static final String JSON_PROPERTY_DAYS30 = "days30";
  private JsonNullable<InlineResponse20015DataTradingValueAverageDays30> days30 = JsonNullable.<InlineResponse20015DataTradingValueAverageDays30>undefined();

  public InlineResponse20015DataTradingValueAverage() { 
  }

  public InlineResponse20015DataTradingValueAverage days5(InlineResponse20015DataTradingValueAverageDays5 days5) {
    this.days5 = JsonNullable.<InlineResponse20015DataTradingValueAverageDays5>of(days5);
    return this;
  }

   /**
   * Get days5
   * @return days5
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse20015DataTradingValueAverageDays5 getDays5() {
        return days5.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse20015DataTradingValueAverageDays5> getDays5_JsonNullable() {
    return days5;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS5)
  public void setDays5_JsonNullable(JsonNullable<InlineResponse20015DataTradingValueAverageDays5> days5) {
    this.days5 = days5;
  }

  public void setDays5(InlineResponse20015DataTradingValueAverageDays5 days5) {
    this.days5 = JsonNullable.<InlineResponse20015DataTradingValueAverageDays5>of(days5);
  }


  public InlineResponse20015DataTradingValueAverage days30(InlineResponse20015DataTradingValueAverageDays30 days30) {
    this.days30 = JsonNullable.<InlineResponse20015DataTradingValueAverageDays30>of(days30);
    return this;
  }

   /**
   * Get days30
   * @return days30
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse20015DataTradingValueAverageDays30 getDays30() {
        return days30.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS30)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse20015DataTradingValueAverageDays30> getDays30_JsonNullable() {
    return days30;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS30)
  public void setDays30_JsonNullable(JsonNullable<InlineResponse20015DataTradingValueAverageDays30> days30) {
    this.days30 = days30;
  }

  public void setDays30(InlineResponse20015DataTradingValueAverageDays30 days30) {
    this.days30 = JsonNullable.<InlineResponse20015DataTradingValueAverageDays30>of(days30);
  }


  /**
   * Return true if this inline_response_200_15_data_tradingValue_average object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015DataTradingValueAverage inlineResponse20015DataTradingValueAverage = (InlineResponse20015DataTradingValueAverage) o;
    return equalsNullable(this.days5, inlineResponse20015DataTradingValueAverage.days5) &&
        equalsNullable(this.days30, inlineResponse20015DataTradingValueAverage.days30);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(days5), hashCodeNullable(days30));
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
    sb.append("class InlineResponse20015DataTradingValueAverage {\n");
    sb.append("    days5: ").append(toIndentedString(days5)).append("\n");
    sb.append("    days30: ").append(toIndentedString(days30)).append("\n");
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

