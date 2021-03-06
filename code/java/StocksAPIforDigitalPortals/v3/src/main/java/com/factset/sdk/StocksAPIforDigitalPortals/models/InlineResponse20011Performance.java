/*
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20011PerformanceEndOfDay;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Relative performance for different time ranges.
 */
@ApiModel(description = "Relative performance for different time ranges.")
@JsonPropertyOrder({
  InlineResponse20011Performance.JSON_PROPERTY_INTRADAY,
  InlineResponse20011Performance.JSON_PROPERTY_END_OF_DAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20011Performance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INTRADAY = "intraday";
  private BigDecimal intraday;

  public static final String JSON_PROPERTY_END_OF_DAY = "endOfDay";
  private InlineResponse20011PerformanceEndOfDay endOfDay;

  public InlineResponse20011Performance() { 
  }

  public InlineResponse20011Performance intraday(BigDecimal intraday) {
    this.intraday = intraday;
    return this;
  }

   /**
   * Intraday relative performance. That is the difference of a notation&#39;s most recent price from the current trading day against the most recent EOD closing price.
   * @return intraday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Intraday relative performance. That is the difference of a notation's most recent price from the current trading day against the most recent EOD closing price.")
  @JsonProperty(JSON_PROPERTY_INTRADAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIntraday() {
    return intraday;
  }


  @JsonProperty(JSON_PROPERTY_INTRADAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntraday(BigDecimal intraday) {
    this.intraday = intraday;
  }


  public InlineResponse20011Performance endOfDay(InlineResponse20011PerformanceEndOfDay endOfDay) {
    this.endOfDay = endOfDay;
    return this;
  }

   /**
   * Get endOfDay
   * @return endOfDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20011PerformanceEndOfDay getEndOfDay() {
    return endOfDay;
  }


  @JsonProperty(JSON_PROPERTY_END_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndOfDay(InlineResponse20011PerformanceEndOfDay endOfDay) {
    this.endOfDay = endOfDay;
  }


  /**
   * Return true if this inline_response_200_11_performance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011Performance inlineResponse20011Performance = (InlineResponse20011Performance) o;
    return Objects.equals(this.intraday, inlineResponse20011Performance.intraday) &&
        Objects.equals(this.endOfDay, inlineResponse20011Performance.endOfDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intraday, endOfDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011Performance {\n");
    sb.append("    intraday: ").append(toIndentedString(intraday)).append("\n");
    sb.append("    endOfDay: ").append(toIndentedString(endOfDay)).append("\n");
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

