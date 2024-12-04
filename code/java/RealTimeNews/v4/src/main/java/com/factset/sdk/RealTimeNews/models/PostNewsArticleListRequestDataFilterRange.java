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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeNews.JSON;


/**
 * Time range for matching the news article&#39;s date. At most one of the attributes &#x60;start&#x60; or &#x60;end&#x60; may be &#x60;null&#x60;.
 */
@ApiModel(description = "Time range for matching the news article's date. At most one of the attributes `start` or `end` may be `null`.")
@JsonPropertyOrder({
  PostNewsArticleListRequestDataFilterRange.JSON_PROPERTY_START,
  PostNewsArticleListRequestDataFilterRange.JSON_PROPERTY_END
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNewsArticleListRequestDataFilterRange implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public PostNewsArticleListRequestDataFilterRange() { 
  }

  @JsonCreator
  public PostNewsArticleListRequestDataFilterRange(
    @JsonProperty(value=JSON_PROPERTY_START, required=true) OffsetDateTime start, 
    @JsonProperty(value=JSON_PROPERTY_END, required=true) OffsetDateTime end
  ) {
    this();
    this.start = start;
    this.end = end;
  }

  public PostNewsArticleListRequestDataFilterRange start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The starting point of the time range (inclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the past.
   * @return start
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2024-01-01T00:00Z", required = true, value = "The starting point of the time range (inclusive), or `null` to indicate that the time range extends indefinitely into the past.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public PostNewsArticleListRequestDataFilterRange end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future.
   * @return end
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2024-12-24T18:00Z", required = true, value = "The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  /**
   * Return true if this PostNewsArticleListRequest_data_filter_range object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsArticleListRequestDataFilterRange postNewsArticleListRequestDataFilterRange = (PostNewsArticleListRequestDataFilterRange) o;
    return Objects.equals(this.start, postNewsArticleListRequestDataFilterRange.start) &&
        Objects.equals(this.end, postNewsArticleListRequestDataFilterRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNewsArticleListRequestDataFilterRange {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

