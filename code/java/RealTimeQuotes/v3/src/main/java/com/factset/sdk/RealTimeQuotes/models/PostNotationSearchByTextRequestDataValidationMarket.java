/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.PostNotationSearchByTextRequestDataValidationMarketPriority;
import com.factset.sdk.RealTimeQuotes.models.PostNotationSearchByTextRequestDataValidationMarketSelection;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Market-related parameters. See endpoint &#x60;/basic/market/list&#x60; for valid values.
 */
@ApiModel(description = "Market-related parameters. See endpoint `/basic/market/list` for valid values.")
@JsonPropertyOrder({
  PostNotationSearchByTextRequestDataValidationMarket.JSON_PROPERTY_SELECTION,
  PostNotationSearchByTextRequestDataValidationMarket.JSON_PROPERTY_PRIORITY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNotationSearchByTextRequestDataValidationMarket implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELECTION = "selection";
  private PostNotationSearchByTextRequestDataValidationMarketSelection selection;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private PostNotationSearchByTextRequestDataValidationMarketPriority priority;

  public PostNotationSearchByTextRequestDataValidationMarket() { 
  }

  public PostNotationSearchByTextRequestDataValidationMarket selection(PostNotationSearchByTextRequestDataValidationMarketSelection selection) {
    this.selection = selection;
    return this;
  }

   /**
   * Get selection
   * @return selection
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataValidationMarketSelection getSelection() {
    return selection;
  }


  @JsonProperty(JSON_PROPERTY_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelection(PostNotationSearchByTextRequestDataValidationMarketSelection selection) {
    this.selection = selection;
  }


  public PostNotationSearchByTextRequestDataValidationMarket priority(PostNotationSearchByTextRequestDataValidationMarketPriority priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataValidationMarketPriority getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(PostNotationSearchByTextRequestDataValidationMarketPriority priority) {
    this.priority = priority;
  }


  /**
   * Return true if this PostNotationSearchByTextRequest_data_validation_market object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNotationSearchByTextRequestDataValidationMarket postNotationSearchByTextRequestDataValidationMarket = (PostNotationSearchByTextRequestDataValidationMarket) o;
    return Objects.equals(this.selection, postNotationSearchByTextRequestDataValidationMarket.selection) &&
        Objects.equals(this.priority, postNotationSearchByTextRequestDataValidationMarket.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selection, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNotationSearchByTextRequestDataValidationMarket {\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

