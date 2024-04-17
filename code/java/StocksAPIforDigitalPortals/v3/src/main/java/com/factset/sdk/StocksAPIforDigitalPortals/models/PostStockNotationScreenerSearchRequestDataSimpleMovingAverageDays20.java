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
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Value range for the time range 20 trading days.
 */
@ApiModel(description = "Value range for the time range 20 trading days.")
@JsonPropertyOrder({
  PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20.JSON_PROPERTY_MINIMUM,
  PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20.JSON_PROPERTY_MAXIMUM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum maximum;

  public PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20() { 
  }

  public PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20 minimum(PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum minimum) {
    this.minimum = minimum;
  }


  public PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20 maximum(PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this PostStockNotationScreenerSearchRequest_data_simpleMovingAverage_days20 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20 postStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20 = (PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20) o;
    return Objects.equals(this.minimum, postStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20.minimum) &&
        Objects.equals(this.maximum, postStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20 {\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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

