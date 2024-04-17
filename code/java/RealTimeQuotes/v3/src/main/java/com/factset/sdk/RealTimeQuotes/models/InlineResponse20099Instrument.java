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
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20036Fsym;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20038DataCategories;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20067Nsin;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20099InstrumentAssetClass;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20099InstrumentName;
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
 * Instrument data of the notation.
 */
@ApiModel(description = "Instrument data of the notation.")
@JsonPropertyOrder({
  InlineResponse20099Instrument.JSON_PROPERTY_ID,
  InlineResponse20099Instrument.JSON_PROPERTY_NAME,
  InlineResponse20099Instrument.JSON_PROPERTY_ISIN,
  InlineResponse20099Instrument.JSON_PROPERTY_NSIN,
  InlineResponse20099Instrument.JSON_PROPERTY_NORMALIZED_SYMBOL,
  InlineResponse20099Instrument.JSON_PROPERTY_FSYM,
  InlineResponse20099Instrument.JSON_PROPERTY_ASSET_CLASS,
  InlineResponse20099Instrument.JSON_PROPERTY_INSTRUMENT_CATEGORY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20099Instrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private InlineResponse20099InstrumentName name;

  public static final String JSON_PROPERTY_ISIN = "isin";
  private JsonNullable<String> isin = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse20067Nsin nsin;

  public static final String JSON_PROPERTY_NORMALIZED_SYMBOL = "normalizedSymbol";
  private JsonNullable<String> normalizedSymbol = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse20036Fsym fsym;

  public static final String JSON_PROPERTY_ASSET_CLASS = "assetClass";
  private InlineResponse20099InstrumentAssetClass assetClass;

  public static final String JSON_PROPERTY_INSTRUMENT_CATEGORY = "instrumentCategory";
  private java.util.List<InlineResponse20038DataCategories> instrumentCategory = null;

  public InlineResponse20099Instrument() { 
  }

  public InlineResponse20099Instrument id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of the instrument.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the instrument.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public InlineResponse20099Instrument name(InlineResponse20099InstrumentName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20099InstrumentName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(InlineResponse20099InstrumentName name) {
    this.name = name;
  }


  public InlineResponse20099Instrument isin(String isin) {
    this.isin = JsonNullable.<String>of(isin);
    return this;
  }

   /**
   * International Securities Identification Number of the instrument.
   * @return isin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "International Securities Identification Number of the instrument.")
  @JsonIgnore

  public String getIsin() {
        return isin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIsin_JsonNullable() {
    return isin;
  }
  
  @JsonProperty(JSON_PROPERTY_ISIN)
  public void setIsin_JsonNullable(JsonNullable<String> isin) {
    this.isin = isin;
  }

  public void setIsin(String isin) {
    this.isin = JsonNullable.<String>of(isin);
  }


  public InlineResponse20099Instrument nsin(InlineResponse20067Nsin nsin) {
    this.nsin = nsin;
    return this;
  }

   /**
   * Get nsin
   * @return nsin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20067Nsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse20067Nsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse20099Instrument normalizedSymbol(String normalizedSymbol) {
    this.normalizedSymbol = JsonNullable.<String>of(normalizedSymbol);
    return this;
  }

   /**
   * Symbol of an option or a future, as normalized by FactSet.
   * @return normalizedSymbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Symbol of an option or a future, as normalized by FactSet.")
  @JsonIgnore

  public String getNormalizedSymbol() {
        return normalizedSymbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NORMALIZED_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNormalizedSymbol_JsonNullable() {
    return normalizedSymbol;
  }
  
  @JsonProperty(JSON_PROPERTY_NORMALIZED_SYMBOL)
  public void setNormalizedSymbol_JsonNullable(JsonNullable<String> normalizedSymbol) {
    this.normalizedSymbol = normalizedSymbol;
  }

  public void setNormalizedSymbol(String normalizedSymbol) {
    this.normalizedSymbol = JsonNullable.<String>of(normalizedSymbol);
  }


  public InlineResponse20099Instrument fsym(InlineResponse20036Fsym fsym) {
    this.fsym = fsym;
    return this;
  }

   /**
   * Get fsym
   * @return fsym
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20036Fsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse20036Fsym fsym) {
    this.fsym = fsym;
  }


  public InlineResponse20099Instrument assetClass(InlineResponse20099InstrumentAssetClass assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Get assetClass
   * @return assetClass
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20099InstrumentAssetClass getAssetClass() {
    return assetClass;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetClass(InlineResponse20099InstrumentAssetClass assetClass) {
    this.assetClass = assetClass;
  }


  public InlineResponse20099Instrument instrumentCategory(java.util.List<InlineResponse20038DataCategories> instrumentCategory) {
    this.instrumentCategory = instrumentCategory;
    return this;
  }

  public InlineResponse20099Instrument addInstrumentCategoryItem(InlineResponse20038DataCategories instrumentCategoryItem) {
    if (this.instrumentCategory == null) {
      this.instrumentCategory = new java.util.ArrayList<>();
    }
    this.instrumentCategory.add(instrumentCategoryItem);
    return this;
  }

   /**
   * Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter &#x60;category.restrict.ids&#x60;. Empty, if &#x60;category.restrict.ids&#x60; has not been used.
   * @return instrumentCategory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter `category.restrict.ids`. Empty, if `category.restrict.ids` has not been used.")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20038DataCategories> getInstrumentCategory() {
    return instrumentCategory;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrumentCategory(java.util.List<InlineResponse20038DataCategories> instrumentCategory) {
    this.instrumentCategory = instrumentCategory;
  }


  /**
   * Return true if this inline_response_200_99_instrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20099Instrument inlineResponse20099Instrument = (InlineResponse20099Instrument) o;
    return equalsNullable(this.id, inlineResponse20099Instrument.id) &&
        Objects.equals(this.name, inlineResponse20099Instrument.name) &&
        equalsNullable(this.isin, inlineResponse20099Instrument.isin) &&
        Objects.equals(this.nsin, inlineResponse20099Instrument.nsin) &&
        equalsNullable(this.normalizedSymbol, inlineResponse20099Instrument.normalizedSymbol) &&
        Objects.equals(this.fsym, inlineResponse20099Instrument.fsym) &&
        Objects.equals(this.assetClass, inlineResponse20099Instrument.assetClass) &&
        Objects.equals(this.instrumentCategory, inlineResponse20099Instrument.instrumentCategory);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), name, hashCodeNullable(isin), nsin, hashCodeNullable(normalizedSymbol), fsym, assetClass, instrumentCategory);
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
    sb.append("class InlineResponse20099Instrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    normalizedSymbol: ").append(toIndentedString(normalizedSymbol)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    instrumentCategory: ").append(toIndentedString(instrumentCategory)).append("\n");
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

