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
 * Set of identifiers and their type.
 */
@ApiModel(description = "Set of identifiers and their type.")
@JsonPropertyOrder({
  PostNewsArticleListByIndexRequestDataIdentifier.JSON_PROPERTY_VALUES,
  PostNewsArticleListByIndexRequestDataIdentifier.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNewsArticleListByIndexRequestDataIdentifier implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUES = "values";
  private java.util.Set<String> values = new java.util.LinkedHashSet<>();

  /**
   * Type of the identifier.
   */
  public enum TypeEnum {
    IDNOTATION("idNotation"),
    
    TICKEREXCHANGE("tickerExchange"),
    
    TICKERREGION("tickerRegion"),
    
    FDSPERMANENTIDENTIFIERLISTING("fdsPermanentIdentifierListing"),
    
    FDSPERMANENTIDENTIFIERREGIONAL("fdsPermanentIdentifierRegional");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public PostNewsArticleListByIndexRequestDataIdentifier() { 
  }

  @JsonCreator
  public PostNewsArticleListByIndexRequestDataIdentifier(
    @JsonProperty(value=JSON_PROPERTY_VALUES, required=true) java.util.Set<String> values, 
    @JsonProperty(value=JSON_PROPERTY_TYPE, required=true) TypeEnum type
  ) {
    this();
    this.values = values;
    this.type = type;
  }

  public PostNewsArticleListByIndexRequestDataIdentifier values(java.util.Set<String> values) {
    this.values = values;
    return this;
  }

  public PostNewsArticleListByIndexRequestDataIdentifier addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Set of identifiers to resolve.
   * @return values
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Set of identifiers to resolve.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.Set<String> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(java.util.Set<String> values) {
    this.values = values;
  }


  public PostNewsArticleListByIndexRequestDataIdentifier type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the identifier.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of the identifier.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this PostNewsArticleListByIndexRequest_data_identifier object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsArticleListByIndexRequestDataIdentifier postNewsArticleListByIndexRequestDataIdentifier = (PostNewsArticleListByIndexRequestDataIdentifier) o;
    return Objects.equals(this.values, postNewsArticleListByIndexRequestDataIdentifier.values) &&
        Objects.equals(this.type, postNewsArticleListByIndexRequestDataIdentifier.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNewsArticleListByIndexRequestDataIdentifier {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

