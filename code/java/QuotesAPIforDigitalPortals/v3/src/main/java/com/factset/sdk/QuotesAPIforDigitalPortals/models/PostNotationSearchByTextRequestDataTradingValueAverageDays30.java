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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostNotationSearchByTextRequestDataTradingValueAverageDays30Maximum;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostNotationSearchByTextRequestDataTradingValueAverageDays30Minimum;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Value range for the time range 30 trading days.
 */
@ApiModel(description = "Value range for the time range 30 trading days.")
@JsonPropertyOrder({
  PostNotationSearchByTextRequestDataTradingValueAverageDays30.JSON_PROPERTY_MINIMUM,
  PostNotationSearchByTextRequestDataTradingValueAverageDays30.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostNotationSearchByTextRequestDataTradingValueAverageDays30 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private PostNotationSearchByTextRequestDataTradingValueAverageDays30Minimum minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private PostNotationSearchByTextRequestDataTradingValueAverageDays30Maximum maximum;

  public PostNotationSearchByTextRequestDataTradingValueAverageDays30() { 
  }

  public PostNotationSearchByTextRequestDataTradingValueAverageDays30 minimum(PostNotationSearchByTextRequestDataTradingValueAverageDays30Minimum minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataTradingValueAverageDays30Minimum getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(PostNotationSearchByTextRequestDataTradingValueAverageDays30Minimum minimum) {
    this.minimum = minimum;
  }


  public PostNotationSearchByTextRequestDataTradingValueAverageDays30 maximum(PostNotationSearchByTextRequestDataTradingValueAverageDays30Maximum maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataTradingValueAverageDays30Maximum getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(PostNotationSearchByTextRequestDataTradingValueAverageDays30Maximum maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this PostNotationSearchByTextRequest_data_tradingValue_average_days30 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNotationSearchByTextRequestDataTradingValueAverageDays30 postNotationSearchByTextRequestDataTradingValueAverageDays30 = (PostNotationSearchByTextRequestDataTradingValueAverageDays30) o;
    return Objects.equals(this.minimum, postNotationSearchByTextRequestDataTradingValueAverageDays30.minimum) &&
        Objects.equals(this.maximum, postNotationSearchByTextRequestDataTradingValueAverageDays30.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNotationSearchByTextRequestDataTradingValueAverageDays30 {\n");
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

