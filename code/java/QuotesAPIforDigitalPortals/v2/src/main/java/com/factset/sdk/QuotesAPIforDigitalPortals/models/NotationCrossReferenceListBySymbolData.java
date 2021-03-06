/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationCrossReferenceListByInstrumentDataFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  NotationCrossReferenceListBySymbolData.JSON_PROPERTY_SYMBOL,
  NotationCrossReferenceListBySymbolData.JSON_PROPERTY_FILTER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotationCrossReferenceListBySymbolData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private NotationCrossReferenceListByInstrumentDataFilter filter;

  public NotationCrossReferenceListBySymbolData() { 
  }

  @JsonCreator
  public NotationCrossReferenceListBySymbolData(
    @JsonProperty(value=JSON_PROPERTY_SYMBOL, required=true) String symbol
  ) {
    this();
    this.symbol = symbol;
  }

  public NotationCrossReferenceListBySymbolData symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Market-specific code to identify a notation.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Market-specific code to identify a notation.")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public NotationCrossReferenceListBySymbolData filter(NotationCrossReferenceListByInstrumentDataFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotationCrossReferenceListByInstrumentDataFilter getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(NotationCrossReferenceListByInstrumentDataFilter filter) {
    this.filter = filter;
  }


  /**
   * Return true if this _notation_crossReference_listBySymbol_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotationCrossReferenceListBySymbolData notationCrossReferenceListBySymbolData = (NotationCrossReferenceListBySymbolData) o;
    return Objects.equals(this.symbol, notationCrossReferenceListBySymbolData.symbol) &&
        Objects.equals(this.filter, notationCrossReferenceListBySymbolData.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotationCrossReferenceListBySymbolData {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

