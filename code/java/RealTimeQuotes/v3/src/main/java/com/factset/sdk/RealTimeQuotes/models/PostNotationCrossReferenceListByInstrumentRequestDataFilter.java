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
import com.factset.sdk.RealTimeQuotes.models.PostNotationCrossReferenceListByInstrumentRequestDataFilterMarkets;
import com.factset.sdk.RealTimeQuotes.models.PostNotationCrossReferenceListByInstrumentRequestDataFilterValueUnits;
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
 * Criteria that filter the items in the response list; only items that match all of the criteria are returned.
 */
@ApiModel(description = "Criteria that filter the items in the response list; only items that match all of the criteria are returned.")
@JsonPropertyOrder({
  PostNotationCrossReferenceListByInstrumentRequestDataFilter.JSON_PROPERTY_MARKETS,
  PostNotationCrossReferenceListByInstrumentRequestDataFilter.JSON_PROPERTY_VALUE_UNITS,
  PostNotationCrossReferenceListByInstrumentRequestDataFilter.JSON_PROPERTY_ONLY_ACTIVE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNotationCrossReferenceListByInstrumentRequestDataFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MARKETS = "markets";
  private PostNotationCrossReferenceListByInstrumentRequestDataFilterMarkets markets;

  public static final String JSON_PROPERTY_VALUE_UNITS = "valueUnits";
  private PostNotationCrossReferenceListByInstrumentRequestDataFilterValueUnits valueUnits;

  public static final String JSON_PROPERTY_ONLY_ACTIVE = "onlyActive";
  private Boolean onlyActive = false;

  public PostNotationCrossReferenceListByInstrumentRequestDataFilter() { 
  }

  public PostNotationCrossReferenceListByInstrumentRequestDataFilter markets(PostNotationCrossReferenceListByInstrumentRequestDataFilterMarkets markets) {
    this.markets = markets;
    return this;
  }

   /**
   * Get markets
   * @return markets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationCrossReferenceListByInstrumentRequestDataFilterMarkets getMarkets() {
    return markets;
  }


  @JsonProperty(JSON_PROPERTY_MARKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkets(PostNotationCrossReferenceListByInstrumentRequestDataFilterMarkets markets) {
    this.markets = markets;
  }


  public PostNotationCrossReferenceListByInstrumentRequestDataFilter valueUnits(PostNotationCrossReferenceListByInstrumentRequestDataFilterValueUnits valueUnits) {
    this.valueUnits = valueUnits;
    return this;
  }

   /**
   * Get valueUnits
   * @return valueUnits
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationCrossReferenceListByInstrumentRequestDataFilterValueUnits getValueUnits() {
    return valueUnits;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnits(PostNotationCrossReferenceListByInstrumentRequestDataFilterValueUnits valueUnits) {
    this.valueUnits = valueUnits;
  }


  public PostNotationCrossReferenceListByInstrumentRequestDataFilter onlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
    return this;
  }

   /**
   * If true, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.
   * @return onlyActive
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If true, only active notations will be returned. The term \"active\" reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.")
  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyActive() {
    return onlyActive;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
  }


  /**
   * Return true if this PostNotationCrossReferenceListByInstrumentRequest_data_filter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNotationCrossReferenceListByInstrumentRequestDataFilter postNotationCrossReferenceListByInstrumentRequestDataFilter = (PostNotationCrossReferenceListByInstrumentRequestDataFilter) o;
    return Objects.equals(this.markets, postNotationCrossReferenceListByInstrumentRequestDataFilter.markets) &&
        Objects.equals(this.valueUnits, postNotationCrossReferenceListByInstrumentRequestDataFilter.valueUnits) &&
        Objects.equals(this.onlyActive, postNotationCrossReferenceListByInstrumentRequestDataFilter.onlyActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markets, valueUnits, onlyActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNotationCrossReferenceListByInstrumentRequestDataFilter {\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    valueUnits: ").append(toIndentedString(valueUnits)).append("\n");
    sb.append("    onlyActive: ").append(toIndentedString(onlyActive)).append("\n");
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

