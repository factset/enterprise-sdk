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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataSharesOutstandingAverage;
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
 * Shares outstanding, which is the number of shares not in possession by the company itself (treasury shares) thus generally available for trading.
 */
@ApiModel(description = "Shares outstanding, which is the number of shares not in possession by the company itself (treasury shares) thus generally available for trading.")
@JsonPropertyOrder({
  InlineResponse2001DataSharesOutstanding.JSON_PROPERTY_REPORTED,
  InlineResponse2001DataSharesOutstanding.JSON_PROPERTY_AVERAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2001DataSharesOutstanding implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REPORTED = "reported";
  private JsonNullable<BigDecimal> reported = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_AVERAGE = "average";
  private InlineResponse2001DataSharesOutstandingAverage average;

  public InlineResponse2001DataSharesOutstanding() { 
  }

  public InlineResponse2001DataSharesOutstanding reported(BigDecimal reported) {
    this.reported = JsonNullable.<BigDecimal>of(reported);
    return this;
  }

   /**
   * Number of shares outstanding as reported by the company. This represents the basic (actual) shares outstanding.
   * @return reported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of shares outstanding as reported by the company. This represents the basic (actual) shares outstanding.")
  @JsonIgnore

  public BigDecimal getReported() {
        return reported.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getReported_JsonNullable() {
    return reported;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORTED)
  public void setReported_JsonNullable(JsonNullable<BigDecimal> reported) {
    this.reported = reported;
  }

  public void setReported(BigDecimal reported) {
    this.reported = JsonNullable.<BigDecimal>of(reported);
  }


  public InlineResponse2001DataSharesOutstanding average(InlineResponse2001DataSharesOutstandingAverage average) {
    this.average = average;
    return this;
  }

   /**
   * Get average
   * @return average
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataSharesOutstandingAverage getAverage() {
    return average;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverage(InlineResponse2001DataSharesOutstandingAverage average) {
    this.average = average;
  }


  /**
   * Return true if this inline_response_200_1_data_sharesOutstanding object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001DataSharesOutstanding inlineResponse2001DataSharesOutstanding = (InlineResponse2001DataSharesOutstanding) o;
    return equalsNullable(this.reported, inlineResponse2001DataSharesOutstanding.reported) &&
        Objects.equals(this.average, inlineResponse2001DataSharesOutstanding.average);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(reported), average);
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
    sb.append("class InlineResponse2001DataSharesOutstanding {\n");
    sb.append("    reported: ").append(toIndentedString(reported)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
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

