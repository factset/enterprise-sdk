/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSearchAnswers.JSON;


/**
 * AdaptiveCardWithThumbnail
 */
@JsonPropertyOrder({
  AdaptiveCardWithThumbnail.JSON_PROPERTY_ADAPTIVE_CARD,
  AdaptiveCardWithThumbnail.JSON_PROPERTY_THUMBNAIL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AdaptiveCardWithThumbnail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ADAPTIVE_CARD = "adaptiveCard";
  private Object adaptiveCard;

  public static final String JSON_PROPERTY_THUMBNAIL = "thumbnail";
  private JsonNullable<Object> thumbnail = JsonNullable.<Object>undefined();

  public AdaptiveCardWithThumbnail() { 
  }

  public AdaptiveCardWithThumbnail adaptiveCard(Object adaptiveCard) {
    this.adaptiveCard = adaptiveCard;
    return this;
  }

   /**
   * JSON that matches [Adaptive Card](https://adaptivecards.io/explorer/) format.
   * @return adaptiveCard
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "JSON that matches [Adaptive Card](https://adaptivecards.io/explorer/) format.")
  @JsonProperty(JSON_PROPERTY_ADAPTIVE_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAdaptiveCard() {
    return adaptiveCard;
  }


  @JsonProperty(JSON_PROPERTY_ADAPTIVE_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdaptiveCard(Object adaptiveCard) {
    this.adaptiveCard = adaptiveCard;
  }


  public AdaptiveCardWithThumbnail thumbnail(Object thumbnail) {
    this.thumbnail = JsonNullable.<Object>of(thumbnail);
    return this;
  }

   /**
   * JSON that matches [Thumbnail Card](https://docs.microsoft.com/en-us/microsoftteams/platform/task-modules-and-cards/cards/cards-reference#thumbnail-card) format.
   * @return thumbnail
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "JSON that matches [Thumbnail Card](https://docs.microsoft.com/en-us/microsoftteams/platform/task-modules-and-cards/cards/cards-reference#thumbnail-card) format.")
  @JsonIgnore

  public Object getThumbnail() {
        return thumbnail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getThumbnail_JsonNullable() {
    return thumbnail;
  }
  
  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  public void setThumbnail_JsonNullable(JsonNullable<Object> thumbnail) {
    this.thumbnail = thumbnail;
  }

  public void setThumbnail(Object thumbnail) {
    this.thumbnail = JsonNullable.<Object>of(thumbnail);
  }


  /**
   * Return true if this AdaptiveCardWithThumbnail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptiveCardWithThumbnail adaptiveCardWithThumbnail = (AdaptiveCardWithThumbnail) o;
    return Objects.equals(this.adaptiveCard, adaptiveCardWithThumbnail.adaptiveCard) &&
        equalsNullable(this.thumbnail, adaptiveCardWithThumbnail.thumbnail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptiveCard, hashCodeNullable(thumbnail));
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
    sb.append("class AdaptiveCardWithThumbnail {\n");
    sb.append("    adaptiveCard: ").append(toIndentedString(adaptiveCard)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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

