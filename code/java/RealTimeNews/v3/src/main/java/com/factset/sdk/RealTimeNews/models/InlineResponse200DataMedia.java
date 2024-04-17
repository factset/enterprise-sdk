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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeNews.JSON;


/**
 * InlineResponse200DataMedia
 */
@JsonPropertyOrder({
  InlineResponse200DataMedia.JSON_PROPERTY_URL,
  InlineResponse200DataMedia.JSON_PROPERTY_MIME_TYPE,
  InlineResponse200DataMedia.JSON_PROPERTY_CAPTION,
  InlineResponse200DataMedia.JSON_PROPERTY_ALTERNATIVE_TEXT,
  InlineResponse200DataMedia.JSON_PROPERTY_WIDTH,
  InlineResponse200DataMedia.JSON_PROPERTY_HEIGHT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse200DataMedia implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private JsonNullable<String> mimeType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAPTION = "caption";
  private JsonNullable<String> caption = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ALTERNATIVE_TEXT = "alternativeText";
  private JsonNullable<String> alternativeText = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WIDTH = "width";
  private JsonNullable<BigDecimal> width = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private JsonNullable<BigDecimal> height = JsonNullable.<BigDecimal>undefined();

  public InlineResponse200DataMedia() { 
  }

  public InlineResponse200DataMedia url(String url) {
    this.url = JsonNullable.<String>of(url);
    return this;
  }

   /**
   * URL of the media element. The URL is publicly available and hosted by either the publisher, the distributor, or FactSet.
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "URL of the media element. The URL is publicly available and hosted by either the publisher, the distributor, or FactSet.")
  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(String url) {
    this.url = JsonNullable.<String>of(url);
  }


  public InlineResponse200DataMedia mimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
    return this;
  }

   /**
   * MIME type of the data of the media element.
   * @return mimeType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MIME type of the data of the media element.")
  @JsonIgnore

  public String getMimeType() {
        return mimeType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMimeType_JsonNullable() {
    return mimeType;
  }
  
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  public void setMimeType_JsonNullable(JsonNullable<String> mimeType) {
    this.mimeType = mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
  }


  public InlineResponse200DataMedia caption(String caption) {
    this.caption = JsonNullable.<String>of(caption);
    return this;
  }

   /**
   * Caption text that can be displayed with the media element. Empty if no caption is available for this media element.
   * @return caption
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Caption text that can be displayed with the media element. Empty if no caption is available for this media element.")
  @JsonIgnore

  public String getCaption() {
        return caption.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCaption_JsonNullable() {
    return caption;
  }
  
  @JsonProperty(JSON_PROPERTY_CAPTION)
  public void setCaption_JsonNullable(JsonNullable<String> caption) {
    this.caption = caption;
  }

  public void setCaption(String caption) {
    this.caption = JsonNullable.<String>of(caption);
  }


  public InlineResponse200DataMedia alternativeText(String alternativeText) {
    this.alternativeText = JsonNullable.<String>of(alternativeText);
    return this;
  }

   /**
   * A short description of the media element that can be shown instead of the media element itself.
   * @return alternativeText
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A short description of the media element that can be shown instead of the media element itself.")
  @JsonIgnore

  public String getAlternativeText() {
        return alternativeText.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAlternativeText_JsonNullable() {
    return alternativeText;
  }
  
  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_TEXT)
  public void setAlternativeText_JsonNullable(JsonNullable<String> alternativeText) {
    this.alternativeText = alternativeText;
  }

  public void setAlternativeText(String alternativeText) {
    this.alternativeText = JsonNullable.<String>of(alternativeText);
  }


  public InlineResponse200DataMedia width(BigDecimal width) {
    this.width = JsonNullable.<BigDecimal>of(width);
    return this;
  }

   /**
   * Width of the media element in pixels if applicable.
   * @return width
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Width of the media element in pixels if applicable.")
  @JsonIgnore

  public BigDecimal getWidth() {
        return width.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getWidth_JsonNullable() {
    return width;
  }
  
  @JsonProperty(JSON_PROPERTY_WIDTH)
  public void setWidth_JsonNullable(JsonNullable<BigDecimal> width) {
    this.width = width;
  }

  public void setWidth(BigDecimal width) {
    this.width = JsonNullable.<BigDecimal>of(width);
  }


  public InlineResponse200DataMedia height(BigDecimal height) {
    this.height = JsonNullable.<BigDecimal>of(height);
    return this;
  }

   /**
   * Height of the media element in pixels if applicable.
   * @return height
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Height of the media element in pixels if applicable.")
  @JsonIgnore

  public BigDecimal getHeight() {
        return height.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getHeight_JsonNullable() {
    return height;
  }
  
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  public void setHeight_JsonNullable(JsonNullable<BigDecimal> height) {
    this.height = height;
  }

  public void setHeight(BigDecimal height) {
    this.height = JsonNullable.<BigDecimal>of(height);
  }


  /**
   * Return true if this inline_response_200_data_media object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataMedia inlineResponse200DataMedia = (InlineResponse200DataMedia) o;
    return equalsNullable(this.url, inlineResponse200DataMedia.url) &&
        equalsNullable(this.mimeType, inlineResponse200DataMedia.mimeType) &&
        equalsNullable(this.caption, inlineResponse200DataMedia.caption) &&
        equalsNullable(this.alternativeText, inlineResponse200DataMedia.alternativeText) &&
        equalsNullable(this.width, inlineResponse200DataMedia.width) &&
        equalsNullable(this.height, inlineResponse200DataMedia.height);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(url), hashCodeNullable(mimeType), hashCodeNullable(caption), hashCodeNullable(alternativeText), hashCodeNullable(width), hashCodeNullable(height));
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
    sb.append("class InlineResponse200DataMedia {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    alternativeText: ").append(toIndentedString(alternativeText)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

