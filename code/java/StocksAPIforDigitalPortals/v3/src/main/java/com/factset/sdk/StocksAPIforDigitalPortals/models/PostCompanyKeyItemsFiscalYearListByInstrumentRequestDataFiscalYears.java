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
 * Response will include data items from the fiscal year specified as start (inclusive) up to the fiscal year specified as end (inclusive). If either is omitted the response will include data items from the earliest or up to the most recent fiscal year available respectively. Alternatively, if both are specified start must be less than end. Either must be at most ten years in the past. Note that earliest data availability varies for each stock.
 */
@ApiModel(description = "Response will include data items from the fiscal year specified as start (inclusive) up to the fiscal year specified as end (inclusive). If either is omitted the response will include data items from the earliest or up to the most recent fiscal year available respectively. Alternatively, if both are specified start must be less than end. Either must be at most ten years in the past. Note that earliest data availability varies for each stock.")
@JsonPropertyOrder({
  PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears.JSON_PROPERTY_START,
  PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears.JSON_PROPERTY_END
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private BigDecimal start;

  public static final String JSON_PROPERTY_END = "end";
  private BigDecimal end;

  public PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears() { 
  }

  public PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears start(BigDecimal start) {
    this.start = start;
    return this;
  }

   /**
   * Only include data items for a fiscal year greater than or equal to the one specified. Must be greater than or equal to ten years in the past.
   * @return start
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Only include data items for a fiscal year greater than or equal to the one specified. Must be greater than or equal to ten years in the past.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(BigDecimal start) {
    this.start = start;
  }


  public PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears end(BigDecimal end) {
    this.end = end;
    return this;
  }

   /**
   * Only include data items for a fiscal year earlier than or equal to the one specified. Must be less than or equal to the current year.
   * @return end
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Only include data items for a fiscal year earlier than or equal to the one specified. Must be less than or equal to the current year.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(BigDecimal end) {
    this.end = end;
  }


  /**
   * Return true if this PostCompanyKeyItemsFiscalYearListByInstrumentRequest_data_fiscalYears object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears postCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears = (PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears) o;
    return Objects.equals(this.start, postCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears.start) &&
        Objects.equals(this.end, postCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

