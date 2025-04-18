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
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByChainRequestDataFilterRange;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexRequestDataFilterCategories;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexRequestDataFilterDistributor;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexRequestDataFilterLanguage;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexRequestDataFilterPublisher;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexRequestDataFilterRegions;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexRequestDataFilterTypes;
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
  PostNewsArticleListByIndexRequestDataFilter.JSON_PROPERTY_RANGE,
  PostNewsArticleListByIndexRequestDataFilter.JSON_PROPERTY_CATEGORIES,
  PostNewsArticleListByIndexRequestDataFilter.JSON_PROPERTY_REGIONS,
  PostNewsArticleListByIndexRequestDataFilter.JSON_PROPERTY_DISTRIBUTOR,
  PostNewsArticleListByIndexRequestDataFilter.JSON_PROPERTY_PUBLISHER,
  PostNewsArticleListByIndexRequestDataFilter.JSON_PROPERTY_LANGUAGE,
  PostNewsArticleListByIndexRequestDataFilter.JSON_PROPERTY_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNewsArticleListByIndexRequestDataFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RANGE = "range";
  private PostNewsArticleListByChainRequestDataFilterRange range;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private PostNewsArticleListByIndexRequestDataFilterCategories categories;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private PostNewsArticleListByIndexRequestDataFilterRegions regions;

  public static final String JSON_PROPERTY_DISTRIBUTOR = "distributor";
  private PostNewsArticleListByIndexRequestDataFilterDistributor distributor;

  public static final String JSON_PROPERTY_PUBLISHER = "publisher";
  private PostNewsArticleListByIndexRequestDataFilterPublisher publisher;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private PostNewsArticleListByIndexRequestDataFilterLanguage language;

  public static final String JSON_PROPERTY_TYPES = "types";
  private PostNewsArticleListByIndexRequestDataFilterTypes types;

  public PostNewsArticleListByIndexRequestDataFilter() { 
  }

  public PostNewsArticleListByIndexRequestDataFilter range(PostNewsArticleListByChainRequestDataFilterRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListByChainRequestDataFilterRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(PostNewsArticleListByChainRequestDataFilterRange range) {
    this.range = range;
  }


  public PostNewsArticleListByIndexRequestDataFilter categories(PostNewsArticleListByIndexRequestDataFilterCategories categories) {
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListByIndexRequestDataFilterCategories getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(PostNewsArticleListByIndexRequestDataFilterCategories categories) {
    this.categories = categories;
  }


  public PostNewsArticleListByIndexRequestDataFilter regions(PostNewsArticleListByIndexRequestDataFilterRegions regions) {
    this.regions = regions;
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListByIndexRequestDataFilterRegions getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(PostNewsArticleListByIndexRequestDataFilterRegions regions) {
    this.regions = regions;
  }


  public PostNewsArticleListByIndexRequestDataFilter distributor(PostNewsArticleListByIndexRequestDataFilterDistributor distributor) {
    this.distributor = distributor;
    return this;
  }

   /**
   * Get distributor
   * @return distributor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListByIndexRequestDataFilterDistributor getDistributor() {
    return distributor;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributor(PostNewsArticleListByIndexRequestDataFilterDistributor distributor) {
    this.distributor = distributor;
  }


  public PostNewsArticleListByIndexRequestDataFilter publisher(PostNewsArticleListByIndexRequestDataFilterPublisher publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUBLISHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListByIndexRequestDataFilterPublisher getPublisher() {
    return publisher;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublisher(PostNewsArticleListByIndexRequestDataFilterPublisher publisher) {
    this.publisher = publisher;
  }


  public PostNewsArticleListByIndexRequestDataFilter language(PostNewsArticleListByIndexRequestDataFilterLanguage language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListByIndexRequestDataFilterLanguage getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(PostNewsArticleListByIndexRequestDataFilterLanguage language) {
    this.language = language;
  }


  public PostNewsArticleListByIndexRequestDataFilter types(PostNewsArticleListByIndexRequestDataFilterTypes types) {
    this.types = types;
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListByIndexRequestDataFilterTypes getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(PostNewsArticleListByIndexRequestDataFilterTypes types) {
    this.types = types;
  }


  /**
   * Return true if this PostNewsArticleListByIndexRequest_data_filter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsArticleListByIndexRequestDataFilter postNewsArticleListByIndexRequestDataFilter = (PostNewsArticleListByIndexRequestDataFilter) o;
    return Objects.equals(this.range, postNewsArticleListByIndexRequestDataFilter.range) &&
        Objects.equals(this.categories, postNewsArticleListByIndexRequestDataFilter.categories) &&
        Objects.equals(this.regions, postNewsArticleListByIndexRequestDataFilter.regions) &&
        Objects.equals(this.distributor, postNewsArticleListByIndexRequestDataFilter.distributor) &&
        Objects.equals(this.publisher, postNewsArticleListByIndexRequestDataFilter.publisher) &&
        Objects.equals(this.language, postNewsArticleListByIndexRequestDataFilter.language) &&
        Objects.equals(this.types, postNewsArticleListByIndexRequestDataFilter.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, categories, regions, distributor, publisher, language, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNewsArticleListByIndexRequestDataFilter {\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

