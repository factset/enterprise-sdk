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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Since a fiscal year and a calendar year do not necessarily match  with regard to their start and end dates, the year is derived as the calendar year  occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Either must be at most ten years in the past.
 */
@ApiModel(description = "Since a fiscal year and a calendar year do not necessarily match  with regard to their start and end dates, the year is derived as the calendar year  occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Either must be at most ten years in the past.")
@JsonPropertyOrder({
  PostStockNotationScreenerSearchRequestDataFiscalYear.JSON_PROPERTY_YEAR_END,
  PostStockNotationScreenerSearchRequestDataFiscalYear.JSON_PROPERTY_YEAR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostStockNotationScreenerSearchRequestDataFiscalYear implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_YEAR_END = "yearEnd";
  private BigDecimal yearEnd;

  public static final String JSON_PROPERTY_YEAR = "year";
  private BigDecimal year;

  public PostStockNotationScreenerSearchRequestDataFiscalYear() { 
  }

  public PostStockNotationScreenerSearchRequestDataFiscalYear yearEnd(BigDecimal yearEnd) {
    this.yearEnd = yearEnd;
    return this;
  }

   /**
   * Calendar year of the ending date of the fiscal year.
   * @return yearEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Calendar year of the ending date of the fiscal year.")
  @JsonProperty(JSON_PROPERTY_YEAR_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYearEnd() {
    return yearEnd;
  }


  @JsonProperty(JSON_PROPERTY_YEAR_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearEnd(BigDecimal yearEnd) {
    this.yearEnd = yearEnd;
  }


  public PostStockNotationScreenerSearchRequestDataFiscalYear year(BigDecimal year) {
    this.year = year;
    return this;
  }

   /**
   * Derived fiscal year.
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Derived fiscal year.")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(BigDecimal year) {
    this.year = year;
  }


  /**
   * Return true if this PostStockNotationScreenerSearchRequest_data_fiscalYear object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStockNotationScreenerSearchRequestDataFiscalYear postStockNotationScreenerSearchRequestDataFiscalYear = (PostStockNotationScreenerSearchRequestDataFiscalYear) o;
    return Objects.equals(this.yearEnd, postStockNotationScreenerSearchRequestDataFiscalYear.yearEnd) &&
        Objects.equals(this.year, postStockNotationScreenerSearchRequestDataFiscalYear.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yearEnd, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStockNotationScreenerSearchRequestDataFiscalYear {\n");
    sb.append("    yearEnd: ").append(toIndentedString(yearEnd)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
