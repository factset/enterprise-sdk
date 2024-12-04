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
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexDataArticlesCategoriesItems;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexDataArticlesInstrumentsItems;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexDataArticlesItemsChain;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexDataArticlesItemsDistributor;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexDataArticlesItemsLanguage;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexDataArticlesItemsPublisher;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexDataArticlesTypesItems;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeNews.JSON;


/**
 * A list of objects. For semantical context see the description of the parent array.
 */
@ApiModel(description = "A list of objects. For semantical context see the description of the parent array.")
@JsonPropertyOrder({
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_CODE,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_TIME,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_HEADLINE,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_SUMMARY,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_TYPES,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_LANGUAGE,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_DISTRIBUTOR,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_PUBLISHER,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_CATEGORIES,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_CHAIN,
  PostNewsArticleListByIndexDataArticlesItems.JSON_PROPERTY_INSTRUMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNewsArticleListByIndexDataArticlesItems implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIME = "time";
  private JsonNullable<OffsetDateTime> time = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private JsonNullable<String> headline = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private JsonNullable<String> summary = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPES = "types";
  private java.util.List<PostNewsArticleListByIndexDataArticlesTypesItems> types = null;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private PostNewsArticleListByIndexDataArticlesItemsLanguage language;

  public static final String JSON_PROPERTY_DISTRIBUTOR = "distributor";
  private PostNewsArticleListByIndexDataArticlesItemsDistributor distributor;

  public static final String JSON_PROPERTY_PUBLISHER = "publisher";
  private PostNewsArticleListByIndexDataArticlesItemsPublisher publisher;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<PostNewsArticleListByIndexDataArticlesCategoriesItems> categories = null;

  public static final String JSON_PROPERTY_CHAIN = "chain";
  private PostNewsArticleListByIndexDataArticlesItemsChain chain;

  public static final String JSON_PROPERTY_INSTRUMENTS = "instruments";
  private java.util.List<PostNewsArticleListByIndexDataArticlesInstrumentsItems> instruments = null;

  public PostNewsArticleListByIndexDataArticlesItems() { 
  }

  public PostNewsArticleListByIndexDataArticlesItems code(String code) {
    this.code = JsonNullable.<String>of(code);
    return this;
  }

   /**
   * Identifier of the news article.
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "Identifier of the news article.")
  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(String code) {
    this.code = JsonNullable.<String>of(code);
  }


  public PostNewsArticleListByIndexDataArticlesItems time(OffsetDateTime time) {
    this.time = JsonNullable.<OffsetDateTime>of(time);
    return this;
  }

   /**
   * Date and time of the news article.
   * @return time
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2024-01-01T00:00Z", value = "Date and time of the news article.")
  @JsonIgnore

  public OffsetDateTime getTime() {
        return time.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getTime_JsonNullable() {
    return time;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME)
  public void setTime_JsonNullable(JsonNullable<OffsetDateTime> time) {
    this.time = time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = JsonNullable.<OffsetDateTime>of(time);
  }


  public PostNewsArticleListByIndexDataArticlesItems headline(String headline) {
    this.headline = JsonNullable.<String>of(headline);
    return this;
  }

   /**
   * Headline of the news article represented as text with HTML entity encoding but without HTML tags.
   * @return headline
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "Headline of the news article represented as text with HTML entity encoding but without HTML tags.")
  @JsonIgnore

  public String getHeadline() {
        return headline.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHeadline_JsonNullable() {
    return headline;
  }
  
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  public void setHeadline_JsonNullable(JsonNullable<String> headline) {
    this.headline = headline;
  }

  public void setHeadline(String headline) {
    this.headline = JsonNullable.<String>of(headline);
  }


  public PostNewsArticleListByIndexDataArticlesItems summary(String summary) {
    this.summary = JsonNullable.<String>of(summary);
    return this;
  }

   /**
   * Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor.
   * @return summary
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "Textual summary of the body of the news article or `null` if no summary was provided by the news article distributor.")
  @JsonIgnore

  public String getSummary() {
        return summary.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSummary_JsonNullable() {
    return summary;
  }
  
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  public void setSummary_JsonNullable(JsonNullable<String> summary) {
    this.summary = summary;
  }

  public void setSummary(String summary) {
    this.summary = JsonNullable.<String>of(summary);
  }


  public PostNewsArticleListByIndexDataArticlesItems types(java.util.List<PostNewsArticleListByIndexDataArticlesTypesItems> types) {
    this.types = types;
    return this;
  }

  public PostNewsArticleListByIndexDataArticlesItems addTypesItem(PostNewsArticleListByIndexDataArticlesTypesItems typesItem) {
    if (this.types == null) {
      this.types = new java.util.ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values.
   * @return types
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Types of news article. See endpoint `/news/article/type/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PostNewsArticleListByIndexDataArticlesTypesItems> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(java.util.List<PostNewsArticleListByIndexDataArticlesTypesItems> types) {
    this.types = types;
  }


  public PostNewsArticleListByIndexDataArticlesItems language(PostNewsArticleListByIndexDataArticlesItemsLanguage language) {
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

  public PostNewsArticleListByIndexDataArticlesItemsLanguage getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(PostNewsArticleListByIndexDataArticlesItemsLanguage language) {
    this.language = language;
  }


  public PostNewsArticleListByIndexDataArticlesItems distributor(PostNewsArticleListByIndexDataArticlesItemsDistributor distributor) {
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

  public PostNewsArticleListByIndexDataArticlesItemsDistributor getDistributor() {
    return distributor;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributor(PostNewsArticleListByIndexDataArticlesItemsDistributor distributor) {
    this.distributor = distributor;
  }


  public PostNewsArticleListByIndexDataArticlesItems publisher(PostNewsArticleListByIndexDataArticlesItemsPublisher publisher) {
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

  public PostNewsArticleListByIndexDataArticlesItemsPublisher getPublisher() {
    return publisher;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublisher(PostNewsArticleListByIndexDataArticlesItemsPublisher publisher) {
    this.publisher = publisher;
  }


  public PostNewsArticleListByIndexDataArticlesItems categories(java.util.List<PostNewsArticleListByIndexDataArticlesCategoriesItems> categories) {
    this.categories = categories;
    return this;
  }

  public PostNewsArticleListByIndexDataArticlesItems addCategoriesItem(PostNewsArticleListByIndexDataArticlesCategoriesItems categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values.
   * @return categories
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Categories related to the news article. See endpoint `/category/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PostNewsArticleListByIndexDataArticlesCategoriesItems> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<PostNewsArticleListByIndexDataArticlesCategoriesItems> categories) {
    this.categories = categories;
  }


  public PostNewsArticleListByIndexDataArticlesItems chain(PostNewsArticleListByIndexDataArticlesItemsChain chain) {
    this.chain = chain;
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListByIndexDataArticlesItemsChain getChain() {
    return chain;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChain(PostNewsArticleListByIndexDataArticlesItemsChain chain) {
    this.chain = chain;
  }


  public PostNewsArticleListByIndexDataArticlesItems instruments(java.util.List<PostNewsArticleListByIndexDataArticlesInstrumentsItems> instruments) {
    this.instruments = instruments;
    return this;
  }

  public PostNewsArticleListByIndexDataArticlesItems addInstrumentsItem(PostNewsArticleListByIndexDataArticlesInstrumentsItems instrumentsItem) {
    if (this.instruments == null) {
      this.instruments = new java.util.ArrayList<>();
    }
    this.instruments.add(instrumentsItem);
    return this;
  }

   /**
   * Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off.
   * @return instruments
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off.")
  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PostNewsArticleListByIndexDataArticlesInstrumentsItems> getInstruments() {
    return instruments;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstruments(java.util.List<PostNewsArticleListByIndexDataArticlesInstrumentsItems> instruments) {
    this.instruments = instruments;
  }


  /**
   * Return true if this PostNewsArticleListByIndexDataArticlesItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsArticleListByIndexDataArticlesItems postNewsArticleListByIndexDataArticlesItems = (PostNewsArticleListByIndexDataArticlesItems) o;
    return equalsNullable(this.code, postNewsArticleListByIndexDataArticlesItems.code) &&
        equalsNullable(this.time, postNewsArticleListByIndexDataArticlesItems.time) &&
        equalsNullable(this.headline, postNewsArticleListByIndexDataArticlesItems.headline) &&
        equalsNullable(this.summary, postNewsArticleListByIndexDataArticlesItems.summary) &&
        Objects.equals(this.types, postNewsArticleListByIndexDataArticlesItems.types) &&
        Objects.equals(this.language, postNewsArticleListByIndexDataArticlesItems.language) &&
        Objects.equals(this.distributor, postNewsArticleListByIndexDataArticlesItems.distributor) &&
        Objects.equals(this.publisher, postNewsArticleListByIndexDataArticlesItems.publisher) &&
        Objects.equals(this.categories, postNewsArticleListByIndexDataArticlesItems.categories) &&
        Objects.equals(this.chain, postNewsArticleListByIndexDataArticlesItems.chain) &&
        Objects.equals(this.instruments, postNewsArticleListByIndexDataArticlesItems.instruments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(code), hashCodeNullable(time), hashCodeNullable(headline), hashCodeNullable(summary), types, language, distributor, publisher, categories, chain, instruments);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNewsArticleListByIndexDataArticlesItems {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
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

