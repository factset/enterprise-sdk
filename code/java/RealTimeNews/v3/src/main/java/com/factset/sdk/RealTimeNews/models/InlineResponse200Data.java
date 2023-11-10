/*
 * News API For Digital Portals
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/quotes-api-digital-portals), [time series](https://developer.factset.com/api-catalog/time-series-api-digital-portals), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
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
import com.factset.sdk.RealTimeNews.models.InlineResponse200DataCategories;
import com.factset.sdk.RealTimeNews.models.InlineResponse200DataDistributor;
import com.factset.sdk.RealTimeNews.models.InlineResponse200DataInstruments;
import com.factset.sdk.RealTimeNews.models.InlineResponse200DataLanguage;
import com.factset.sdk.RealTimeNews.models.InlineResponse200DataMedia;
import com.factset.sdk.RealTimeNews.models.InlineResponse200DataPublisher;
import com.factset.sdk.RealTimeNews.models.InlineResponse200DataTypes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeNews.JSON;


/**
 * Content of the news article.
 */
@ApiModel(description = "Content of the news article.")
@JsonPropertyOrder({
  InlineResponse200Data.JSON_PROPERTY_TIME,
  InlineResponse200Data.JSON_PROPERTY_HEADLINE,
  InlineResponse200Data.JSON_PROPERTY_SUMMARY,
  InlineResponse200Data.JSON_PROPERTY_BODY,
  InlineResponse200Data.JSON_PROPERTY_TYPES,
  InlineResponse200Data.JSON_PROPERTY_LANGUAGE,
  InlineResponse200Data.JSON_PROPERTY_DISTRIBUTOR,
  InlineResponse200Data.JSON_PROPERTY_PUBLISHER,
  InlineResponse200Data.JSON_PROPERTY_CATEGORIES,
  InlineResponse200Data.JSON_PROPERTY_INSTRUMENTS,
  InlineResponse200Data.JSON_PROPERTY_MEDIA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME = "time";
  private JsonNullable<String> time = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private JsonNullable<String> headline = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private JsonNullable<String> summary = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BODY = "body";
  private JsonNullable<String> body = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPES = "types";
  private java.util.List<InlineResponse200DataTypes> types = null;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private InlineResponse200DataLanguage language;

  public static final String JSON_PROPERTY_DISTRIBUTOR = "distributor";
  private InlineResponse200DataDistributor distributor;

  public static final String JSON_PROPERTY_PUBLISHER = "publisher";
  private InlineResponse200DataPublisher publisher;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<InlineResponse200DataCategories> categories = null;

  public static final String JSON_PROPERTY_INSTRUMENTS = "instruments";
  private java.util.List<InlineResponse200DataInstruments> instruments = null;

  public static final String JSON_PROPERTY_MEDIA = "media";
  private java.util.List<InlineResponse200DataMedia> media = null;

  public InlineResponse200Data() { 
  }

  public InlineResponse200Data time(String time) {
    this.time = JsonNullable.<String>of(time);
    return this;
  }

   /**
   * Date and time of the news article.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of the news article.")
  @JsonIgnore

  public String getTime() {
        return time.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTime_JsonNullable() {
    return time;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME)
  public void setTime_JsonNullable(JsonNullable<String> time) {
    this.time = time;
  }

  public void setTime(String time) {
    this.time = JsonNullable.<String>of(time);
  }


  public InlineResponse200Data headline(String headline) {
    this.headline = JsonNullable.<String>of(headline);
    return this;
  }

   /**
   * Headline of the news article represented as text with HTML entity encoding but without HTML tags.
   * @return headline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Headline of the news article represented as text with HTML entity encoding but without HTML tags.")
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


  public InlineResponse200Data summary(String summary) {
    this.summary = JsonNullable.<String>of(summary);
    return this;
  }

   /**
   * Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor.
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Textual summary of the body of the news article or `null` if no summary was provided by the news article distributor.")
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


  public InlineResponse200Data body(String body) {
    this.body = JsonNullable.<String>of(body);
    return this;
  }

   /**
   * Text body of the news article.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text body of the news article.")
  @JsonIgnore

  public String getBody() {
        return body.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBody_JsonNullable() {
    return body;
  }
  
  @JsonProperty(JSON_PROPERTY_BODY)
  public void setBody_JsonNullable(JsonNullable<String> body) {
    this.body = body;
  }

  public void setBody(String body) {
    this.body = JsonNullable.<String>of(body);
  }


  public InlineResponse200Data types(java.util.List<InlineResponse200DataTypes> types) {
    this.types = types;
    return this;
  }

  public InlineResponse200Data addTypesItem(InlineResponse200DataTypes typesItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Types of news article. See endpoint `/news/article/type/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse200DataTypes> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(java.util.List<InlineResponse200DataTypes> types) {
    this.types = types;
  }


  public InlineResponse200Data language(InlineResponse200DataLanguage language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataLanguage getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(InlineResponse200DataLanguage language) {
    this.language = language;
  }


  public InlineResponse200Data distributor(InlineResponse200DataDistributor distributor) {
    this.distributor = distributor;
    return this;
  }

   /**
   * Get distributor
   * @return distributor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataDistributor getDistributor() {
    return distributor;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributor(InlineResponse200DataDistributor distributor) {
    this.distributor = distributor;
  }


  public InlineResponse200Data publisher(InlineResponse200DataPublisher publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUBLISHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataPublisher getPublisher() {
    return publisher;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublisher(InlineResponse200DataPublisher publisher) {
    this.publisher = publisher;
  }


  public InlineResponse200Data categories(java.util.List<InlineResponse200DataCategories> categories) {
    this.categories = categories;
    return this;
  }

  public InlineResponse200Data addCategoriesItem(InlineResponse200DataCategories categoriesItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Categories related to the news article. See endpoint `/category/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse200DataCategories> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<InlineResponse200DataCategories> categories) {
    this.categories = categories;
  }


  public InlineResponse200Data instruments(java.util.List<InlineResponse200DataInstruments> instruments) {
    this.instruments = instruments;
    return this;
  }

  public InlineResponse200Data addInstrumentsItem(InlineResponse200DataInstruments instrumentsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off.")
  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse200DataInstruments> getInstruments() {
    return instruments;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstruments(java.util.List<InlineResponse200DataInstruments> instruments) {
    this.instruments = instruments;
  }


  public InlineResponse200Data media(java.util.List<InlineResponse200DataMedia> media) {
    this.media = media;
    return this;
  }

  public InlineResponse200Data addMediaItem(InlineResponse200DataMedia mediaItem) {
    if (this.media == null) {
      this.media = new java.util.ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * List of media elements of the news article.
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of media elements of the news article.")
  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse200DataMedia> getMedia() {
    return media;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedia(java.util.List<InlineResponse200DataMedia> media) {
    this.media = media;
  }


  /**
   * Return true if this inline_response_200_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return equalsNullable(this.time, inlineResponse200Data.time) &&
        equalsNullable(this.headline, inlineResponse200Data.headline) &&
        equalsNullable(this.summary, inlineResponse200Data.summary) &&
        equalsNullable(this.body, inlineResponse200Data.body) &&
        Objects.equals(this.types, inlineResponse200Data.types) &&
        Objects.equals(this.language, inlineResponse200Data.language) &&
        Objects.equals(this.distributor, inlineResponse200Data.distributor) &&
        Objects.equals(this.publisher, inlineResponse200Data.publisher) &&
        Objects.equals(this.categories, inlineResponse200Data.categories) &&
        Objects.equals(this.instruments, inlineResponse200Data.instruments) &&
        Objects.equals(this.media, inlineResponse200Data.media);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(time), hashCodeNullable(headline), hashCodeNullable(summary), hashCodeNullable(body), types, language, distributor, publisher, categories, instruments, media);
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
    sb.append("class InlineResponse200Data {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
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
