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
import com.factset.sdk.NewsAPIforDigitalPortals.models.PostNewsPublisherSearchByNameRequestDataFilter;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PostNewsPublisherSearchByNameRequestData.JSON_PROPERTY_SEARCH_VALUE,
  PostNewsPublisherSearchByNameRequestData.JSON_PROPERTY_MATCH_TYPE,
  PostNewsPublisherSearchByNameRequestData.JSON_PROPERTY_FILTER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostNewsPublisherSearchByNameRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SEARCH_VALUE = "searchValue";
  private String searchValue;

  /**
   * The match type that is applied to the search.
   */
  public enum MatchTypeEnum {
    BEGINS("begins"),
    
    ENDS("ends"),
    
    CONTAINS("contains");

    private String value;

    MatchTypeEnum(String value) {
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
    public static MatchTypeEnum fromValue(String value) {
      for (MatchTypeEnum b : MatchTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private MatchTypeEnum matchType;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private PostNewsPublisherSearchByNameRequestDataFilter filter;

  public PostNewsPublisherSearchByNameRequestData() { 
  }

  @JsonCreator
  public PostNewsPublisherSearchByNameRequestData(
    @JsonProperty(value=JSON_PROPERTY_SEARCH_VALUE, required=true) String searchValue, 
    @JsonProperty(value=JSON_PROPERTY_MATCH_TYPE, required=true) MatchTypeEnum matchType
  ) {
    this();
    this.searchValue = searchValue;
    this.matchType = matchType;
  }

  public PostNewsPublisherSearchByNameRequestData searchValue(String searchValue) {
    this.searchValue = searchValue;
    return this;
  }

   /**
   * Restricts the search to publishers, which match the search value. The comparison for a match is case sensitive.
   * @return searchValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Restricts the search to publishers, which match the search value. The comparison for a match is case sensitive.")
  @JsonProperty(JSON_PROPERTY_SEARCH_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSearchValue() {
    return searchValue;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSearchValue(String searchValue) {
    this.searchValue = searchValue;
  }


  public PostNewsPublisherSearchByNameRequestData matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * The match type that is applied to the search.
   * @return matchType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The match type that is applied to the search.")
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MatchTypeEnum getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }


  public PostNewsPublisherSearchByNameRequestData filter(PostNewsPublisherSearchByNameRequestDataFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNewsPublisherSearchByNameRequestDataFilter getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(PostNewsPublisherSearchByNameRequestDataFilter filter) {
    this.filter = filter;
  }


  /**
   * Return true if this PostNewsPublisherSearchByNameRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsPublisherSearchByNameRequestData postNewsPublisherSearchByNameRequestData = (PostNewsPublisherSearchByNameRequestData) o;
    return Objects.equals(this.searchValue, postNewsPublisherSearchByNameRequestData.searchValue) &&
        Objects.equals(this.matchType, postNewsPublisherSearchByNameRequestData.matchType) &&
        Objects.equals(this.filter, postNewsPublisherSearchByNameRequestData.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchValue, matchType, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNewsPublisherSearchByNameRequestData {\n");
    sb.append("    searchValue: ").append(toIndentedString(searchValue)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

