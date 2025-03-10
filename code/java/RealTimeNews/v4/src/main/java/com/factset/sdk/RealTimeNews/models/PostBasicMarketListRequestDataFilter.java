/*
 * Real-Time News API
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeNews.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeNews.models.PostBasicMarketListRequestDataFilterMarkets;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeNews.JSON;


/**
 * Criteria that filter the items in the response list; only items that match all of the criteria are returned.
 */
@ApiModel(description = "Criteria that filter the items in the response list; only items that match all of the criteria are returned.")
@JsonPropertyOrder({
  PostBasicMarketListRequestDataFilter.JSON_PROPERTY_MARKETS,
  PostBasicMarketListRequestDataFilter.JSON_PROPERTY_ONLY_ACTIVE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostBasicMarketListRequestDataFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MARKETS = "markets";
  private PostBasicMarketListRequestDataFilterMarkets markets;

  public static final String JSON_PROPERTY_ONLY_ACTIVE = "onlyActive";
  private Boolean onlyActive = true;

  public PostBasicMarketListRequestDataFilter() { 
  }

  public PostBasicMarketListRequestDataFilter markets(PostBasicMarketListRequestDataFilterMarkets markets) {
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

  public PostBasicMarketListRequestDataFilterMarkets getMarkets() {
    return markets;
  }


  @JsonProperty(JSON_PROPERTY_MARKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkets(PostBasicMarketListRequestDataFilterMarkets markets) {
    this.markets = markets;
  }


  public PostBasicMarketListRequestDataFilter onlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
    return this;
  }

   /**
   * Indicates whether the market exists.
   * @return onlyActive
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the market exists.")
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
   * Return true if this PostBasicMarketListRequest_data_filter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostBasicMarketListRequestDataFilter postBasicMarketListRequestDataFilter = (PostBasicMarketListRequestDataFilter) o;
    return Objects.equals(this.markets, postBasicMarketListRequestDataFilter.markets) &&
        Objects.equals(this.onlyActive, postBasicMarketListRequestDataFilter.onlyActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markets, onlyActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBasicMarketListRequestDataFilter {\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
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

