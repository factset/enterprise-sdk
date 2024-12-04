/*
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Symbology.models;

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
import com.factset.sdk.Symbology.JSON;


/**
 * Request object for Ticker endpoint.
 */
@ApiModel(description = "Request object for Ticker endpoint.")
@JsonPropertyOrder({
  TickerTranslationRequest.JSON_PROPERTY_IDS,
  TickerTranslationRequest.JSON_PROPERTY_TICKER_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TickerTranslationRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_TICKER_TYPE = "tickerType";
  private String tickerType;

  public TickerTranslationRequest() { 
  }

  @JsonCreator
  public TickerTranslationRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_TICKER_TYPE, required=true) String tickerType
  ) {
    this();
    this.ids = ids;
    this.tickerType = tickerType;
  }

  public TickerTranslationRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public TickerTranslationRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;.
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"GOOGL-US\"]", required = true, value = "Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public TickerTranslationRequest tickerType(String tickerType) {
    this.tickerType = tickerType;
    return this;
  }

   /**
   * Controls the Ticker Type returned.   * **REGION** &#x3D; Ticker-Regional   * **EXCHANGE** &#x3D; Ticker-Exchange 
   * @return tickerType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "REGION", required = true, value = "Controls the Ticker Type returned.   * **REGION** = Ticker-Regional   * **EXCHANGE** = Ticker-Exchange ")
  @JsonProperty(JSON_PROPERTY_TICKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTickerType() {
    return tickerType;
  }


  @JsonProperty(JSON_PROPERTY_TICKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTickerType(String tickerType) {
    this.tickerType = tickerType;
  }


  /**
   * Return true if this tickerTranslationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TickerTranslationRequest tickerTranslationRequest = (TickerTranslationRequest) o;
    return Objects.equals(this.ids, tickerTranslationRequest.ids) &&
        Objects.equals(this.tickerType, tickerTranslationRequest.tickerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, tickerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TickerTranslationRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    tickerType: ").append(toIndentedString(tickerType)).append("\n");
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

