/*
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Company Filters, Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.  **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Request Files, Check Status, and Get Files.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
 *
 * The version of the OpenAPI document: 0.1.0
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
import com.factset.sdk.StreetAccountNews.models.SaHeadlinesRequestDataSearchDate;
import com.factset.sdk.StreetAccountNews.models.SaHeadlinesRequestTickersObject;
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
 * SaHeadlinesRequestData
 */
@JsonPropertyOrder({
  SaHeadlinesRequestData.JSON_PROPERTY_TICKERS,
  SaHeadlinesRequestData.JSON_PROPERTY_CATEGORIES,
  SaHeadlinesRequestData.JSON_PROPERTY_REGIONS,
  SaHeadlinesRequestData.JSON_PROPERTY_TOPICS,
  SaHeadlinesRequestData.JSON_PROPERTY_SECTORS,
  SaHeadlinesRequestData.JSON_PROPERTY_IS_PRIMARY,
  SaHeadlinesRequestData.JSON_PROPERTY_SEARCH_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SaHeadlinesRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TICKERS = "tickers";
  private java.util.List<SaHeadlinesRequestTickersObject> tickers = null;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<String> categories = null;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private java.util.List<String> regions = null;

  public static final String JSON_PROPERTY_TOPICS = "topics";
  private java.util.List<String> topics = null;

  public static final String JSON_PROPERTY_SECTORS = "sectors";
  private java.util.List<String> sectors = null;

  public static final String JSON_PROPERTY_IS_PRIMARY = "isPrimary";
  private Boolean isPrimary;

  public static final String JSON_PROPERTY_SEARCH_DATE = "searchDate";
  private SaHeadlinesRequestDataSearchDate searchDate;

  public SaHeadlinesRequestData() { 
  }

  public SaHeadlinesRequestData tickers(java.util.List<SaHeadlinesRequestTickersObject> tickers) {
    this.tickers = tickers;
    return this;
  }

  public SaHeadlinesRequestData addTickersItem(SaHeadlinesRequestTickersObject tickersItem) {
    if (this.tickers == null) {
      this.tickers = new java.util.ArrayList<>();
    }
    this.tickers.add(tickersItem);
    return this;
  }

   /**
   * Get tickers
   * @return tickers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TICKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<SaHeadlinesRequestTickersObject> getTickers() {
    return tickers;
  }


  @JsonProperty(JSON_PROPERTY_TICKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickers(java.util.List<SaHeadlinesRequestTickersObject> tickers) {
    this.tickers = tickers;
  }


  public SaHeadlinesRequestData categories(java.util.List<String> categories) {
    this.categories = categories;
    return this;
  }

  public SaHeadlinesRequestData addCategoriesItem(String categoriesItem) {
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


  public SaHeadlinesRequestData regions(java.util.List<String> regions) {
    this.regions = regions;
    return this;
  }

  public SaHeadlinesRequestData addRegionsItem(String regionsItem) {
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


  public SaHeadlinesRequestData topics(java.util.List<String> topics) {
    this.topics = topics;
    return this;
  }

  public SaHeadlinesRequestData addTopicsItem(String topicsItem) {
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


  public SaHeadlinesRequestData sectors(java.util.List<String> sectors) {
    this.sectors = sectors;
    return this;
  }

  public SaHeadlinesRequestData addSectorsItem(String sectorsItem) {
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


  public SaHeadlinesRequestData isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
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


  public SaHeadlinesRequestData searchDate(SaHeadlinesRequestDataSearchDate searchDate) {
    this.searchDate = searchDate;
    return this;
  }

   /**
   * Get searchDate
   * @return searchDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEARCH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SaHeadlinesRequestDataSearchDate getSearchDate() {
    return searchDate;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchDate(SaHeadlinesRequestDataSearchDate searchDate) {
    this.searchDate = searchDate;
  }


  /**
   * Return true if this saHeadlinesRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaHeadlinesRequestData saHeadlinesRequestData = (SaHeadlinesRequestData) o;
    return Objects.equals(this.tickers, saHeadlinesRequestData.tickers) &&
        Objects.equals(this.categories, saHeadlinesRequestData.categories) &&
        Objects.equals(this.regions, saHeadlinesRequestData.regions) &&
        Objects.equals(this.topics, saHeadlinesRequestData.topics) &&
        Objects.equals(this.sectors, saHeadlinesRequestData.sectors) &&
        Objects.equals(this.isPrimary, saHeadlinesRequestData.isPrimary) &&
        Objects.equals(this.searchDate, saHeadlinesRequestData.searchDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tickers, categories, regions, topics, sectors, isPrimary, searchDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaHeadlinesRequestData {\n");
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    sectors: ").append(toIndentedString(sectors)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    searchDate: ").append(toIndentedString(searchDate)).append("\n");
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

