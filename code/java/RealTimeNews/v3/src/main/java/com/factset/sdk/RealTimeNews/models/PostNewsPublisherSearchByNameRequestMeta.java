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
 * The meta member contains the meta information of the request.
 */
@ApiModel(description = "The meta member contains the meta information of the request.")
@JsonPropertyOrder({
  PostNewsPublisherSearchByNameRequestMeta.JSON_PROPERTY_ATTRIBUTES,
  PostNewsPublisherSearchByNameRequestMeta.JSON_PROPERTY_SORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostNewsPublisherSearchByNameRequestMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private java.util.Set<String> attributes = null;

  /**
   * Gets or Sets sort
   */
  public enum SortEnum {
    ID("id"),
    
    _ID("-id"),
    
    NAME("name"),
    
    _NAME("-name");

    private String value;

    SortEnum(String value) {
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
    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SORT = "sort";
  private java.util.Set<SortEnum> sort = null;

  public PostNewsPublisherSearchByNameRequestMeta() { 
  }

  public PostNewsPublisherSearchByNameRequestMeta attributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public PostNewsPublisherSearchByNameRequestMeta addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new java.util.LinkedHashSet<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Limit the attributes returned in the response to the specified set.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit the attributes returned in the response to the specified set.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<String> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
  }


  public PostNewsPublisherSearchByNameRequestMeta sort(java.util.Set<SortEnum> sort) {
    this.sort = sort;
    return this;
  }

  public PostNewsPublisherSearchByNameRequestMeta addSortItem(SortEnum sortItem) {
    if (this.sort == null) {
      this.sort = new java.util.LinkedHashSet<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<SortEnum> getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(java.util.Set<SortEnum> sort) {
    this.sort = sort;
  }


  /**
   * Return true if this PostNewsPublisherSearchByNameRequest_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsPublisherSearchByNameRequestMeta postNewsPublisherSearchByNameRequestMeta = (PostNewsPublisherSearchByNameRequestMeta) o;
    return Objects.equals(this.attributes, postNewsPublisherSearchByNameRequestMeta.attributes) &&
        Objects.equals(this.sort, postNewsPublisherSearchByNameRequestMeta.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNewsPublisherSearchByNameRequestMeta {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

