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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeNews.JSON;


/**
 * PostNewsArticleSearchByTextRequestDataTextCriteria
 */
@JsonPropertyOrder({
  PostNewsArticleSearchByTextRequestDataTextCriteria.JSON_PROPERTY_SELECTION_TYPE,
  PostNewsArticleSearchByTextRequestDataTextCriteria.JSON_PROPERTY_PHRASES,
  PostNewsArticleSearchByTextRequestDataTextCriteria.JSON_PROPERTY_MINIMUM_MATCH_SCORE,
  PostNewsArticleSearchByTextRequestDataTextCriteria.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNewsArticleSearchByTextRequestDataTextCriteria implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Specify how the criteria should be applied to the search. | Value | Description | | --- | --- | | include | Articles covering the given criteria are included in the result. | | exclude | Articles covering the given criteria are excluded from the result. |  
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

  public static final String JSON_PROPERTY_PHRASES = "phrases";
  private java.util.List<String> phrases = null;

  public static final String JSON_PROPERTY_MINIMUM_MATCH_SCORE = "minimumMatchScore";
  private BigDecimal minimumMatchScore = new BigDecimal("0.7");

  /**
   * Restrict fulltext search to specific scope. | Value | Description | | --- | --- | | headline | Headline of the news article. | | body | Text body of the news article. | | all | Search in both headline and body. |  
   */
  public enum ScopeEnum {
    HEADLINE("headline"),
    
    BODY("body"),
    
    ALL("all");

    private String value;

    ScopeEnum(String value) {
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
    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private ScopeEnum scope = ScopeEnum.ALL;

  public PostNewsArticleSearchByTextRequestDataTextCriteria() { 
  }

  public PostNewsArticleSearchByTextRequestDataTextCriteria selectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
    return this;
  }

   /**
   * Specify how the criteria should be applied to the search. | Value | Description | | --- | --- | | include | Articles covering the given criteria are included in the result. | | exclude | Articles covering the given criteria are excluded from the result. |  
   * @return selectionType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "include", value = "Specify how the criteria should be applied to the search. | Value | Description | | --- | --- | | include | Articles covering the given criteria are included in the result. | | exclude | Articles covering the given criteria are excluded from the result. |  ")
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


  public PostNewsArticleSearchByTextRequestDataTextCriteria phrases(java.util.List<String> phrases) {
    this.phrases = phrases;
    return this;
  }

  public PostNewsArticleSearchByTextRequestDataTextCriteria addPhrasesItem(String phrasesItem) {
    if (this.phrases == null) {
      this.phrases = new java.util.ArrayList<>();
    }
    this.phrases.add(phrasesItem);
    return this;
  }

   /**
   * Phrases to be used in the criteria.
   * @return phrases
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"Lorem Ipsum\"]", value = "Phrases to be used in the criteria.")
  @JsonProperty(JSON_PROPERTY_PHRASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getPhrases() {
    return phrases;
  }


  @JsonProperty(JSON_PROPERTY_PHRASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhrases(java.util.List<String> phrases) {
    this.phrases = phrases;
  }


  public PostNewsArticleSearchByTextRequestDataTextCriteria minimumMatchScore(BigDecimal minimumMatchScore) {
    this.minimumMatchScore = minimumMatchScore;
    return this;
  }

   /**
   * Minimum match score for words in the news article.
   * @return minimumMatchScore
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.7", value = "Minimum match score for words in the news article.")
  @JsonProperty(JSON_PROPERTY_MINIMUM_MATCH_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMinimumMatchScore() {
    return minimumMatchScore;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_MATCH_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumMatchScore(BigDecimal minimumMatchScore) {
    this.minimumMatchScore = minimumMatchScore;
  }


  public PostNewsArticleSearchByTextRequestDataTextCriteria scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Restrict fulltext search to specific scope. | Value | Description | | --- | --- | | headline | Headline of the news article. | | body | Text body of the news article. | | all | Search in both headline and body. |  
   * @return scope
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "all", value = "Restrict fulltext search to specific scope. | Value | Description | | --- | --- | | headline | Headline of the news article. | | body | Text body of the news article. | | all | Search in both headline and body. |  ")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScopeEnum getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  /**
   * Return true if this PostNewsArticleSearchByTextRequest_data_text_criteria object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsArticleSearchByTextRequestDataTextCriteria postNewsArticleSearchByTextRequestDataTextCriteria = (PostNewsArticleSearchByTextRequestDataTextCriteria) o;
    return Objects.equals(this.selectionType, postNewsArticleSearchByTextRequestDataTextCriteria.selectionType) &&
        Objects.equals(this.phrases, postNewsArticleSearchByTextRequestDataTextCriteria.phrases) &&
        Objects.equals(this.minimumMatchScore, postNewsArticleSearchByTextRequestDataTextCriteria.minimumMatchScore) &&
        Objects.equals(this.scope, postNewsArticleSearchByTextRequestDataTextCriteria.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectionType, phrases, minimumMatchScore, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNewsArticleSearchByTextRequestDataTextCriteria {\n");
    sb.append("    selectionType: ").append(toIndentedString(selectionType)).append("\n");
    sb.append("    phrases: ").append(toIndentedString(phrases)).append("\n");
    sb.append("    minimumMatchScore: ").append(toIndentedString(minimumMatchScore)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

