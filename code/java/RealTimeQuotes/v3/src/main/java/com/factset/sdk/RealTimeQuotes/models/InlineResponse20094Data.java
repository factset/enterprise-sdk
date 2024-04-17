/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20094DataAsks;
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
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Orderbook.
 */
@ApiModel(description = "Orderbook.")
@JsonPropertyOrder({
  InlineResponse20094Data.JSON_PROPERTY_ID_NOTATION,
  InlineResponse20094Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse20094Data.JSON_PROPERTY_QUALITY,
  InlineResponse20094Data.JSON_PROPERTY_ASKS,
  InlineResponse20094Data.JSON_PROPERTY_BIDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20094Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_NOTATION = "idNotation";
  private JsonNullable<String> idNotation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
    RLT("RLT"),
    
    DLY("DLY");

    private String value;

    QualityEnum(String value) {
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
    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private JsonNullable<QualityEnum> quality = JsonNullable.<QualityEnum>undefined();

  public static final String JSON_PROPERTY_ASKS = "asks";
  private java.util.List<InlineResponse20094DataAsks> asks = null;

  public static final String JSON_PROPERTY_BIDS = "bids";
  private java.util.List<InlineResponse20094DataAsks> bids = null;

  public InlineResponse20094Data() { 
  }

  public InlineResponse20094Data idNotation(String idNotation) {
    this.idNotation = JsonNullable.<String>of(idNotation);
    return this;
  }

   /**
   * MDG identifier of the listing.
   * @return idNotation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MDG identifier of the listing.")
  @JsonIgnore

  public String getIdNotation() {
        return idNotation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdNotation_JsonNullable() {
    return idNotation;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_NOTATION)
  public void setIdNotation_JsonNullable(JsonNullable<String> idNotation) {
    this.idNotation = idNotation;
  }

  public void setIdNotation(String idNotation) {
    this.idNotation = JsonNullable.<String>of(idNotation);
  }


  public InlineResponse20094Data sourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
    return this;
  }

   /**
   * Identifier used in the request.
   * @return sourceIdentifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier used in the request.")
  @JsonIgnore

  public String getSourceIdentifier() {
        return sourceIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSourceIdentifier_JsonNullable() {
    return sourceIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  public void setSourceIdentifier_JsonNullable(JsonNullable<String> sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
  }


  public InlineResponse20094Data quality(QualityEnum quality) {
    this.quality = JsonNullable.<QualityEnum>of(quality);
    return this;
  }

   /**
   * Quality of the price.
   * @return quality
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Quality of the price.")
  @JsonIgnore

  public QualityEnum getQuality() {
        return quality.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<QualityEnum> getQuality_JsonNullable() {
    return quality;
  }
  
  @JsonProperty(JSON_PROPERTY_QUALITY)
  public void setQuality_JsonNullable(JsonNullable<QualityEnum> quality) {
    this.quality = quality;
  }

  public void setQuality(QualityEnum quality) {
    this.quality = JsonNullable.<QualityEnum>of(quality);
  }


  public InlineResponse20094Data asks(java.util.List<InlineResponse20094DataAsks> asks) {
    this.asks = asks;
    return this;
  }

  public InlineResponse20094Data addAsksItem(InlineResponse20094DataAsks asksItem) {
    if (this.asks == null) {
      this.asks = new java.util.ArrayList<>();
    }
    this.asks.add(asksItem);
    return this;
  }

   /**
   * Ask entries of the full orderbook.
   * @return asks
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ask entries of the full orderbook.")
  @JsonProperty(JSON_PROPERTY_ASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20094DataAsks> getAsks() {
    return asks;
  }


  @JsonProperty(JSON_PROPERTY_ASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsks(java.util.List<InlineResponse20094DataAsks> asks) {
    this.asks = asks;
  }


  public InlineResponse20094Data bids(java.util.List<InlineResponse20094DataAsks> bids) {
    this.bids = bids;
    return this;
  }

  public InlineResponse20094Data addBidsItem(InlineResponse20094DataAsks bidsItem) {
    if (this.bids == null) {
      this.bids = new java.util.ArrayList<>();
    }
    this.bids.add(bidsItem);
    return this;
  }

   /**
   * Bid entries of the full orderbook.
   * @return bids
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Bid entries of the full orderbook.")
  @JsonProperty(JSON_PROPERTY_BIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20094DataAsks> getBids() {
    return bids;
  }


  @JsonProperty(JSON_PROPERTY_BIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBids(java.util.List<InlineResponse20094DataAsks> bids) {
    this.bids = bids;
  }


  /**
   * Return true if this inline_response_200_94_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20094Data inlineResponse20094Data = (InlineResponse20094Data) o;
    return equalsNullable(this.idNotation, inlineResponse20094Data.idNotation) &&
        equalsNullable(this.sourceIdentifier, inlineResponse20094Data.sourceIdentifier) &&
        equalsNullable(this.quality, inlineResponse20094Data.quality) &&
        Objects.equals(this.asks, inlineResponse20094Data.asks) &&
        Objects.equals(this.bids, inlineResponse20094Data.bids);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idNotation), hashCodeNullable(sourceIdentifier), hashCodeNullable(quality), asks, bids);
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
    sb.append("class InlineResponse20094Data {\n");
    sb.append("    idNotation: ").append(toIndentedString(idNotation)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    asks: ").append(toIndentedString(asks)).append("\n");
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
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

