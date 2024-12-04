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
import com.factset.sdk.RealTimeNews.models.PostBasicValueUnitCurrencyListRequestMeta;
import com.factset.sdk.RealTimeNews.models.PostBasicValueUnitCurrencyMainListRequestData;
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
 * Request Body
 */
@ApiModel(description = "Request Body")
@JsonPropertyOrder({
  PostBasicValueUnitCurrencyMainListRequest.JSON_PROPERTY_DATA,
  PostBasicValueUnitCurrencyMainListRequest.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostBasicValueUnitCurrencyMainListRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private PostBasicValueUnitCurrencyMainListRequestData data;

  public static final String JSON_PROPERTY_META = "meta";
  private PostBasicValueUnitCurrencyListRequestMeta meta;

  public PostBasicValueUnitCurrencyMainListRequest() { 
  }

  @JsonCreator
  public PostBasicValueUnitCurrencyMainListRequest(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) PostBasicValueUnitCurrencyMainListRequestData data
  ) {
    this();
    this.data = data;
  }

  public PostBasicValueUnitCurrencyMainListRequest data(PostBasicValueUnitCurrencyMainListRequestData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostBasicValueUnitCurrencyMainListRequestData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(PostBasicValueUnitCurrencyMainListRequestData data) {
    this.data = data;
  }


  public PostBasicValueUnitCurrencyMainListRequest meta(PostBasicValueUnitCurrencyListRequestMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostBasicValueUnitCurrencyListRequestMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(PostBasicValueUnitCurrencyListRequestMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this PostBasicValueUnitCurrencyMainListRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostBasicValueUnitCurrencyMainListRequest postBasicValueUnitCurrencyMainListRequest = (PostBasicValueUnitCurrencyMainListRequest) o;
    return Objects.equals(this.data, postBasicValueUnitCurrencyMainListRequest.data) &&
        Objects.equals(this.meta, postBasicValueUnitCurrencyMainListRequest.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBasicValueUnitCurrencyMainListRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

