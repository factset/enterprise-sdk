/*
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StreetAccountNews.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StreetAccountNews.models.FlattenedFiltersCategoriesObject;
import com.factset.sdk.StreetAccountNews.models.FlattenedFiltersRegionsObject;
import com.factset.sdk.StreetAccountNews.models.FlattenedFiltersSectorsObject;
import com.factset.sdk.StreetAccountNews.models.FlattenedFiltersTopicsObject;
import com.factset.sdk.StreetAccountNews.models.FlattenedFiltersWatchlistsObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StreetAccountNews.JSON;


/**
 * Flattened Filters Object.
 */
@ApiModel(description = "Flattened Filters Object.")
@JsonPropertyOrder({
  FlattenedFilters.JSON_PROPERTY_CATEGORIES,
  FlattenedFilters.JSON_PROPERTY_TOPICS,
  FlattenedFilters.JSON_PROPERTY_REGIONS,
  FlattenedFilters.JSON_PROPERTY_SECTORS,
  FlattenedFilters.JSON_PROPERTY_WATCHLISTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FlattenedFilters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<FlattenedFiltersCategoriesObject> categories = null;

  public static final String JSON_PROPERTY_TOPICS = "topics";
  private java.util.List<FlattenedFiltersTopicsObject> topics = null;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private java.util.List<FlattenedFiltersRegionsObject> regions = null;

  public static final String JSON_PROPERTY_SECTORS = "sectors";
  private java.util.List<FlattenedFiltersSectorsObject> sectors = null;

  public static final String JSON_PROPERTY_WATCHLISTS = "watchlists";
  private java.util.List<FlattenedFiltersWatchlistsObject> watchlists = null;

  public FlattenedFilters() { 
  }

  public FlattenedFilters categories(java.util.List<FlattenedFiltersCategoriesObject> categories) {
    this.categories = categories;
    return this;
  }

  public FlattenedFilters addCategoriesItem(FlattenedFiltersCategoriesObject categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
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

  public java.util.List<FlattenedFiltersCategoriesObject> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<FlattenedFiltersCategoriesObject> categories) {
    this.categories = categories;
  }


  public FlattenedFilters topics(java.util.List<FlattenedFiltersTopicsObject> topics) {
    this.topics = topics;
    return this;
  }

  public FlattenedFilters addTopicsItem(FlattenedFiltersTopicsObject topicsItem) {
    if (this.topics == null) {
      this.topics = new java.util.ArrayList<>();
    }
    this.topics.add(topicsItem);
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOPICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<FlattenedFiltersTopicsObject> getTopics() {
    return topics;
  }


  @JsonProperty(JSON_PROPERTY_TOPICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopics(java.util.List<FlattenedFiltersTopicsObject> topics) {
    this.topics = topics;
  }


  public FlattenedFilters regions(java.util.List<FlattenedFiltersRegionsObject> regions) {
    this.regions = regions;
    return this;
  }

  public FlattenedFilters addRegionsItem(FlattenedFiltersRegionsObject regionsItem) {
    if (this.regions == null) {
      this.regions = new java.util.ArrayList<>();
    }
    this.regions.add(regionsItem);
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

  public java.util.List<FlattenedFiltersRegionsObject> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(java.util.List<FlattenedFiltersRegionsObject> regions) {
    this.regions = regions;
  }


  public FlattenedFilters sectors(java.util.List<FlattenedFiltersSectorsObject> sectors) {
    this.sectors = sectors;
    return this;
  }

  public FlattenedFilters addSectorsItem(FlattenedFiltersSectorsObject sectorsItem) {
    if (this.sectors == null) {
      this.sectors = new java.util.ArrayList<>();
    }
    this.sectors.add(sectorsItem);
    return this;
  }

   /**
   * Get sectors
   * @return sectors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<FlattenedFiltersSectorsObject> getSectors() {
    return sectors;
  }


  @JsonProperty(JSON_PROPERTY_SECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSectors(java.util.List<FlattenedFiltersSectorsObject> sectors) {
    this.sectors = sectors;
  }


  public FlattenedFilters watchlists(java.util.List<FlattenedFiltersWatchlistsObject> watchlists) {
    this.watchlists = watchlists;
    return this;
  }

  public FlattenedFilters addWatchlistsItem(FlattenedFiltersWatchlistsObject watchlistsItem) {
    if (this.watchlists == null) {
      this.watchlists = new java.util.ArrayList<>();
    }
    this.watchlists.add(watchlistsItem);
    return this;
  }

   /**
   * Get watchlists
   * @return watchlists
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WATCHLISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<FlattenedFiltersWatchlistsObject> getWatchlists() {
    return watchlists;
  }


  @JsonProperty(JSON_PROPERTY_WATCHLISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatchlists(java.util.List<FlattenedFiltersWatchlistsObject> watchlists) {
    this.watchlists = watchlists;
  }


  /**
   * Return true if this FlattenedFilters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlattenedFilters flattenedFilters = (FlattenedFilters) o;
    return Objects.equals(this.categories, flattenedFilters.categories) &&
        Objects.equals(this.topics, flattenedFilters.topics) &&
        Objects.equals(this.regions, flattenedFilters.regions) &&
        Objects.equals(this.sectors, flattenedFilters.sectors) &&
        Objects.equals(this.watchlists, flattenedFilters.watchlists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, topics, regions, sectors, watchlists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlattenedFilters {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    sectors: ").append(toIndentedString(sectors)).append("\n");
    sb.append("    watchlists: ").append(toIndentedString(watchlists)).append("\n");
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

