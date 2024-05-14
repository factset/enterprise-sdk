/*
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.factset.sdk.StreetAccountNews.models.CreateOrEditViewTickers;
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
 * Elements of views object.
 */
@ApiModel(description = "Elements of views object.")
@JsonPropertyOrder({
  ViewsObject.JSON_PROPERTY_NAME,
  ViewsObject.JSON_PROPERTY_TICKERS,
  ViewsObject.JSON_PROPERTY_IS_PRIMARY,
  ViewsObject.JSON_PROPERTY_CATEGORIES,
  ViewsObject.JSON_PROPERTY_TOPICS,
  ViewsObject.JSON_PROPERTY_REGIONS,
  ViewsObject.JSON_PROPERTY_SECTORS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ViewsObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TICKERS = "tickers";
  private java.util.List<CreateOrEditViewTickers> tickers = null;

  public static final String JSON_PROPERTY_IS_PRIMARY = "isPrimary";
  private Boolean isPrimary;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<String> categories = null;

  public static final String JSON_PROPERTY_TOPICS = "topics";
  private java.util.List<String> topics = null;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private java.util.List<String> regions = null;

  public static final String JSON_PROPERTY_SECTORS = "sectors";
  private java.util.List<String> sectors = null;

  public ViewsObject() { 
  }

  public ViewsObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the view.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Sample View", value = "The name of the view.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ViewsObject tickers(java.util.List<CreateOrEditViewTickers> tickers) {
    this.tickers = tickers;
    return this;
  }

  public ViewsObject addTickersItem(CreateOrEditViewTickers tickersItem) {
    if (this.tickers == null) {
      this.tickers = new java.util.ArrayList<>();
    }
    this.tickers.add(tickersItem);
    return this;
  }

   /**
   * An array of ticker symbols associated with the view.
   * @return tickers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An array of ticker symbols associated with the view.")
  @JsonProperty(JSON_PROPERTY_TICKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<CreateOrEditViewTickers> getTickers() {
    return tickers;
  }


  @JsonProperty(JSON_PROPERTY_TICKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickers(java.util.List<CreateOrEditViewTickers> tickers) {
    this.tickers = tickers;
  }


  public ViewsObject isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * If true, then only stories with the provided ticker as a primary symbol will be returned. Otherwise, all stories with the ticker as a primary symbol or related symbol will be returned.            
   * @return isPrimary
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If true, then only stories with the provided ticker as a primary symbol will be returned. Otherwise, all stories with the ticker as a primary symbol or related symbol will be returned.            ")
  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  public ViewsObject categories(java.util.List<String> categories) {
    this.categories = categories;
    return this;
  }

  public ViewsObject addCategoriesItem(String categoriesItem) {
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

  public java.util.List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<String> categories) {
    this.categories = categories;
  }


  public ViewsObject topics(java.util.List<String> topics) {
    this.topics = topics;
    return this;
  }

  public ViewsObject addTopicsItem(String topicsItem) {
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

  public java.util.List<String> getTopics() {
    return topics;
  }


  @JsonProperty(JSON_PROPERTY_TOPICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopics(java.util.List<String> topics) {
    this.topics = topics;
  }


  public ViewsObject regions(java.util.List<String> regions) {
    this.regions = regions;
    return this;
  }

  public ViewsObject addRegionsItem(String regionsItem) {
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

  public java.util.List<String> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(java.util.List<String> regions) {
    this.regions = regions;
  }


  public ViewsObject sectors(java.util.List<String> sectors) {
    this.sectors = sectors;
    return this;
  }

  public ViewsObject addSectorsItem(String sectorsItem) {
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

  public java.util.List<String> getSectors() {
    return sectors;
  }


  @JsonProperty(JSON_PROPERTY_SECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSectors(java.util.List<String> sectors) {
    this.sectors = sectors;
  }


  /**
   * Return true if this viewsObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewsObject viewsObject = (ViewsObject) o;
    return Objects.equals(this.name, viewsObject.name) &&
        Objects.equals(this.tickers, viewsObject.tickers) &&
        Objects.equals(this.isPrimary, viewsObject.isPrimary) &&
        Objects.equals(this.categories, viewsObject.categories) &&
        Objects.equals(this.topics, viewsObject.topics) &&
        Objects.equals(this.regions, viewsObject.regions) &&
        Objects.equals(this.sectors, viewsObject.sectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tickers, isPrimary, categories, topics, regions, sectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewsObject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    sectors: ").append(toIndentedString(sectors)).append("\n");
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

