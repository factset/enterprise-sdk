/*
 * News API For Digital Portals
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
 *
 * The version of the OpenAPI document: 3.0.0
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
import com.factset.sdk.RealTimeNews.models.InlineResponse2001Data;
import com.factset.sdk.RealTimeNews.models.InlineResponse2004DataIdentifiers;
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
 * News articles for instruments.
 */
@ApiModel(description = "News articles for instruments.")
@JsonPropertyOrder({
  InlineResponse2004Data.JSON_PROPERTY_IDENTIFIERS,
  InlineResponse2004Data.JSON_PROPERTY_ARTICLES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2004Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDENTIFIERS = "identifiers";
  private java.util.List<InlineResponse2004DataIdentifiers> identifiers = null;

  public static final String JSON_PROPERTY_ARTICLES = "articles";
  private java.util.List<InlineResponse2001Data> articles = null;

  public InlineResponse2004Data() { 
  }

  public InlineResponse2004Data identifiers(java.util.List<InlineResponse2004DataIdentifiers> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public InlineResponse2004Data addIdentifiersItem(InlineResponse2004DataIdentifiers identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new java.util.ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * List of identifiers.
   * @return identifiers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of identifiers.")
  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2004DataIdentifiers> getIdentifiers() {
    return identifiers;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentifiers(java.util.List<InlineResponse2004DataIdentifiers> identifiers) {
    this.identifiers = identifiers;
  }


  public InlineResponse2004Data articles(java.util.List<InlineResponse2001Data> articles) {
    this.articles = articles;
    return this;
  }

  public InlineResponse2004Data addArticlesItem(InlineResponse2001Data articlesItem) {
    if (this.articles == null) {
      this.articles = new java.util.ArrayList<>();
    }
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * News articles that match the filter criteria ordered by descending article time.
   * @return articles
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "News articles that match the filter criteria ordered by descending article time.")
  @JsonProperty(JSON_PROPERTY_ARTICLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2001Data> getArticles() {
    return articles;
  }


  @JsonProperty(JSON_PROPERTY_ARTICLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArticles(java.util.List<InlineResponse2001Data> articles) {
    this.articles = articles;
  }


  /**
   * Return true if this inline_response_200_4_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Data inlineResponse2004Data = (InlineResponse2004Data) o;
    return Objects.equals(this.identifiers, inlineResponse2004Data.identifiers) &&
        Objects.equals(this.articles, inlineResponse2004Data.articles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiers, articles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Data {\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
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

