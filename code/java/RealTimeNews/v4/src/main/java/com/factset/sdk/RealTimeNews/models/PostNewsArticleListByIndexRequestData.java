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
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexRequestDataFilter;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexRequestDataIdentifier;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PostNewsArticleListByIndexRequestData.JSON_PROPERTY_IDENTIFIER,
  PostNewsArticleListByIndexRequestData.JSON_PROPERTY_FILTER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNewsArticleListByIndexRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private PostNewsArticleListByIndexRequestDataIdentifier identifier;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private PostNewsArticleListByIndexRequestDataFilter filter;

  public PostNewsArticleListByIndexRequestData() { 
  }

  @JsonCreator
  public PostNewsArticleListByIndexRequestData(
    @JsonProperty(value=JSON_PROPERTY_IDENTIFIER, required=true) PostNewsArticleListByIndexRequestDataIdentifier identifier
  ) {
    this();
    this.identifier = identifier;
  }

  public PostNewsArticleListByIndexRequestData identifier(PostNewsArticleListByIndexRequestDataIdentifier identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostNewsArticleListByIndexRequestDataIdentifier getIdentifier() {
    return identifier;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentifier(PostNewsArticleListByIndexRequestDataIdentifier identifier) {
    this.identifier = identifier;
  }


  public PostNewsArticleListByIndexRequestData filter(PostNewsArticleListByIndexRequestDataFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListByIndexRequestDataFilter getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(PostNewsArticleListByIndexRequestDataFilter filter) {
    this.filter = filter;
  }


  /**
   * Return true if this PostNewsArticleListByIndexRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsArticleListByIndexRequestData postNewsArticleListByIndexRequestData = (PostNewsArticleListByIndexRequestData) o;
    return Objects.equals(this.identifier, postNewsArticleListByIndexRequestData.identifier) &&
        Objects.equals(this.filter, postNewsArticleListByIndexRequestData.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNewsArticleListByIndexRequestData {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

