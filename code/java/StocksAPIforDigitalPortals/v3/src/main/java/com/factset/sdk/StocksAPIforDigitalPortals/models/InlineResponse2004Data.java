/*
 * Stocks API For Digital Portals
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004DataAggregatedRecommendations;
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
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * List of trade recommendations and target prices for a stock, in unspecified order.
 */
@ApiModel(description = "List of trade recommendations and target prices for a stock, in unspecified order.")
@JsonPropertyOrder({
  InlineResponse2004Data.JSON_PROPERTY_ID_INSTRUMENT,
  InlineResponse2004Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse2004Data.JSON_PROPERTY_AGGREGATED_RECOMMENDATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_INSTRUMENT = "idInstrument";
  private JsonNullable<String> idInstrument = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AGGREGATED_RECOMMENDATIONS = "aggregatedRecommendations";
  private java.util.List<InlineResponse2004DataAggregatedRecommendations> aggregatedRecommendations = null;

  public InlineResponse2004Data() { 
  }

  public InlineResponse2004Data idInstrument(String idInstrument) {
    this.idInstrument = JsonNullable.<String>of(idInstrument);
    return this;
  }

   /**
   * MDG identifier of the instrument.
   * @return idInstrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MDG identifier of the instrument.")
  @JsonIgnore

  public String getIdInstrument() {
        return idInstrument.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdInstrument_JsonNullable() {
    return idInstrument;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_INSTRUMENT)
  public void setIdInstrument_JsonNullable(JsonNullable<String> idInstrument) {
    this.idInstrument = idInstrument;
  }

  public void setIdInstrument(String idInstrument) {
    this.idInstrument = JsonNullable.<String>of(idInstrument);
  }


  public InlineResponse2004Data sourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
    return this;
  }

   /**
   * Identifier used in the request.
   * @return sourceIdentifier
  **/
  @javax.annotation.Nullable
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


  public InlineResponse2004Data aggregatedRecommendations(java.util.List<InlineResponse2004DataAggregatedRecommendations> aggregatedRecommendations) {
    this.aggregatedRecommendations = aggregatedRecommendations;
    return this;
  }

  public InlineResponse2004Data addAggregatedRecommendationsItem(InlineResponse2004DataAggregatedRecommendations aggregatedRecommendationsItem) {
    if (this.aggregatedRecommendations == null) {
      this.aggregatedRecommendations = new java.util.ArrayList<>();
    }
    this.aggregatedRecommendations.add(aggregatedRecommendationsItem);
    return this;
  }

   /**
   * List of trade recommendations.
   * @return aggregatedRecommendations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of trade recommendations.")
  @JsonProperty(JSON_PROPERTY_AGGREGATED_RECOMMENDATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2004DataAggregatedRecommendations> getAggregatedRecommendations() {
    return aggregatedRecommendations;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATED_RECOMMENDATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregatedRecommendations(java.util.List<InlineResponse2004DataAggregatedRecommendations> aggregatedRecommendations) {
    this.aggregatedRecommendations = aggregatedRecommendations;
  }


  /**
   * Return true if this inline_response_200_4_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Data inlineResponse2004Data = (InlineResponse2004Data) o;
    return equalsNullable(this.idInstrument, inlineResponse2004Data.idInstrument) &&
        equalsNullable(this.sourceIdentifier, inlineResponse2004Data.sourceIdentifier) &&
        Objects.equals(this.aggregatedRecommendations, inlineResponse2004Data.aggregatedRecommendations);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idInstrument), hashCodeNullable(sourceIdentifier), aggregatedRecommendations);
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
    sb.append("class InlineResponse2004Data {\n");
    sb.append("    idInstrument: ").append(toIndentedString(idInstrument)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    aggregatedRecommendations: ").append(toIndentedString(aggregatedRecommendations)).append("\n");
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

