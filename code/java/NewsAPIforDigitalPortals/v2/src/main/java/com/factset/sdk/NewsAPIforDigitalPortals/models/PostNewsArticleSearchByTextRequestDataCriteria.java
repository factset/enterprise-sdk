/*
 * News API For Digital Portals
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/quotes-api-digital-portals), [time series](https://developer.factset.com/api-catalog/time-series-api-digital-portals), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * Midnight Trader * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.NewsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsArticleListRequestDataFilterRange;
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsArticleSearchByTextRequestDataCategories;
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsArticleSearchByTextRequestDataDistributor;
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsArticleSearchByTextRequestDataIndices;
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsArticleSearchByTextRequestDataInstruments;
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsArticleSearchByTextRequestDataLanguage;
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsArticleSearchByTextRequestDataPublisher;
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsArticleSearchByTextRequestDataRegions;
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsArticleSearchByTextRequestDataTypes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.NewsAPIforDigitalPortals.JSON;


/**
 * PostNewsArticleSearchByTextRequestDataCriteria
 */
@JsonPropertyOrder({
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_SELECTION_TYPE,
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_RANGE,
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_INDICES,
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_INSTRUMENTS,
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_TYPES,
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_CATEGORIES,
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_REGIONS,
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_DISTRIBUTOR,
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_PUBLISHER,
  PostNewsArticleSearchByTextRequestDataCriteria.JSON_PROPERTY_LANGUAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostNewsArticleSearchByTextRequestDataCriteria implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Specify how the criteria should be applied to the search.
   */
  public enum SelectionTypeEnum {
    INCLUDE("include"),
    
    EXCLUDE("exclude");

    private String value;

    SelectionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SelectionTypeEnum fromValue(String value) {
      for (SelectionTypeEnum b : SelectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SELECTION_TYPE = "selectionType";
  private SelectionTypeEnum selectionType = SelectionTypeEnum.INCLUDE;

  public static final String JSON_PROPERTY_RANGE = "range";
  private PostNewsArticleListRequestDataFilterRange range;

  public static final String JSON_PROPERTY_INDICES = "indices";
  private PostNewsArticleSearchByTextRequestDataIndices indices;

  public static final String JSON_PROPERTY_INSTRUMENTS = "instruments";
  private PostNewsArticleSearchByTextRequestDataInstruments instruments;

  public static final String JSON_PROPERTY_TYPES = "types";
  private PostNewsArticleSearchByTextRequestDataTypes types;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private PostNewsArticleSearchByTextRequestDataCategories categories;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private PostNewsArticleSearchByTextRequestDataRegions regions;

  public static final String JSON_PROPERTY_DISTRIBUTOR = "distributor";
  private PostNewsArticleSearchByTextRequestDataDistributor distributor;

  public static final String JSON_PROPERTY_PUBLISHER = "publisher";
  private PostNewsArticleSearchByTextRequestDataPublisher publisher;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private PostNewsArticleSearchByTextRequestDataLanguage language;

  public PostNewsArticleSearchByTextRequestDataCriteria() { 
  }

  public PostNewsArticleSearchByTextRequestDataCriteria selectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
    return this;
  }

   /**
   * Specify how the criteria should be applied to the search.
   * @return selectionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify how the criteria should be applied to the search.")
  @JsonProperty(JSON_PROPERTY_SELECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelectionTypeEnum getSelectionType() {
    return selectionType;
  }


  @JsonProperty(JSON_PROPERTY_SELECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
  }


  public PostNewsArticleSearchByTextRequestDataCriteria range(PostNewsArticleListRequestDataFilterRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleListRequestDataFilterRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(PostNewsArticleListRequestDataFilterRange range) {
    this.range = range;
  }


  public PostNewsArticleSearchByTextRequestDataCriteria indices(PostNewsArticleSearchByTextRequestDataIndices indices) {
    this.indices = indices;
    return this;
  }

   /**
   * Get indices
   * @return indices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleSearchByTextRequestDataIndices getIndices() {
    return indices;
  }


  @JsonProperty(JSON_PROPERTY_INDICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndices(PostNewsArticleSearchByTextRequestDataIndices indices) {
    this.indices = indices;
  }


  public PostNewsArticleSearchByTextRequestDataCriteria instruments(PostNewsArticleSearchByTextRequestDataInstruments instruments) {
    this.instruments = instruments;
    return this;
  }

   /**
   * Get instruments
   * @return instruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleSearchByTextRequestDataInstruments getInstruments() {
    return instruments;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstruments(PostNewsArticleSearchByTextRequestDataInstruments instruments) {
    this.instruments = instruments;
  }


  public PostNewsArticleSearchByTextRequestDataCriteria types(PostNewsArticleSearchByTextRequestDataTypes types) {
    this.types = types;
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleSearchByTextRequestDataTypes getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(PostNewsArticleSearchByTextRequestDataTypes types) {
    this.types = types;
  }


  public PostNewsArticleSearchByTextRequestDataCriteria categories(PostNewsArticleSearchByTextRequestDataCategories categories) {
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleSearchByTextRequestDataCategories getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(PostNewsArticleSearchByTextRequestDataCategories categories) {
    this.categories = categories;
  }


  public PostNewsArticleSearchByTextRequestDataCriteria regions(PostNewsArticleSearchByTextRequestDataRegions regions) {
    this.regions = regions;
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsArticleSearchByTextRequestDataRegions getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(PostNewsArticleSearchByTextRequestDataRegions regions) {
    this.regions = regions;
  }


  public PostNewsArticleSearchByTextRequestDataCriteria distributor(PostNewsArticleSearchByTextRequestDataDistributor distributor) {
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

  public PostNewsArticleSearchByTextRequestDataDistributor getDistributor() {
    return distributor;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributor(PostNewsArticleSearchByTextRequestDataDistributor distributor) {
    this.distributor = distributor;
  }


  public PostNewsArticleSearchByTextRequestDataCriteria publisher(PostNewsArticleSearchByTextRequestDataPublisher publisher) {
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

  public PostNewsArticleSearchByTextRequestDataPublisher getPublisher() {
    return publisher;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublisher(PostNewsArticleSearchByTextRequestDataPublisher publisher) {
    this.publisher = publisher;
  }


  public PostNewsArticleSearchByTextRequestDataCriteria language(PostNewsArticleSearchByTextRequestDataLanguage language) {
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

  public PostNewsArticleSearchByTextRequestDataLanguage getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(PostNewsArticleSearchByTextRequestDataLanguage language) {
    this.language = language;
  }


  /**
   * Return true if this PostNewsArticleSearchByTextRequest_data_criteria object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsArticleSearchByTextRequestDataCriteria postNewsArticleSearchByTextRequestDataCriteria = (PostNewsArticleSearchByTextRequestDataCriteria) o;
    return Objects.equals(this.selectionType, postNewsArticleSearchByTextRequestDataCriteria.selectionType) &&
        Objects.equals(this.range, postNewsArticleSearchByTextRequestDataCriteria.range) &&
        Objects.equals(this.indices, postNewsArticleSearchByTextRequestDataCriteria.indices) &&
        Objects.equals(this.instruments, postNewsArticleSearchByTextRequestDataCriteria.instruments) &&
        Objects.equals(this.types, postNewsArticleSearchByTextRequestDataCriteria.types) &&
        Objects.equals(this.categories, postNewsArticleSearchByTextRequestDataCriteria.categories) &&
        Objects.equals(this.regions, postNewsArticleSearchByTextRequestDataCriteria.regions) &&
        Objects.equals(this.distributor, postNewsArticleSearchByTextRequestDataCriteria.distributor) &&
        Objects.equals(this.publisher, postNewsArticleSearchByTextRequestDataCriteria.publisher) &&
        Objects.equals(this.language, postNewsArticleSearchByTextRequestDataCriteria.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectionType, range, indices, instruments, types, categories, regions, distributor, publisher, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNewsArticleSearchByTextRequestDataCriteria {\n");
    sb.append("    selectionType: ").append(toIndentedString(selectionType)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

