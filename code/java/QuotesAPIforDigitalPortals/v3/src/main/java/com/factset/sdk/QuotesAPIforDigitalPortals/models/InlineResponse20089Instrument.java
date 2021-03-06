/*
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
 *
 * The version of the OpenAPI document: 2
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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20036Fsym;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20038DataCategories;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20088InstrumentNsin;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20089InstrumentAssetClass;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20089InstrumentName;
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
 * Instrument data of the notation.
 */
@ApiModel(description = "Instrument data of the notation.")
@JsonPropertyOrder({
  InlineResponse20089Instrument.JSON_PROPERTY_ID,
  InlineResponse20089Instrument.JSON_PROPERTY_NAME,
  InlineResponse20089Instrument.JSON_PROPERTY_ISIN,
  InlineResponse20089Instrument.JSON_PROPERTY_NSIN,
  InlineResponse20089Instrument.JSON_PROPERTY_FSYM,
  InlineResponse20089Instrument.JSON_PROPERTY_ASSET_CLASS,
  InlineResponse20089Instrument.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20089Instrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private InlineResponse20089InstrumentName name;

  public static final String JSON_PROPERTY_ISIN = "isin";
  private String isin;

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse20088InstrumentNsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse20036Fsym fsym;

  public static final String JSON_PROPERTY_ASSET_CLASS = "assetClass";
  private InlineResponse20089InstrumentAssetClass assetClass;

  public static final String JSON_PROPERTY_TYPE = "type";
  private java.util.List<InlineResponse20038DataCategories> type = null;

  public InlineResponse20089Instrument() { 
  }

  public InlineResponse20089Instrument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the instrument.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse20089Instrument name(InlineResponse20089InstrumentName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20089InstrumentName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(InlineResponse20089InstrumentName name) {
    this.name = name;
  }


  public InlineResponse20089Instrument isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * International Securities Identification Number of the instrument.
   * @return isin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "International Securities Identification Number of the instrument.")
  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsin() {
    return isin;
  }


  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsin(String isin) {
    this.isin = isin;
  }


  public InlineResponse20089Instrument nsin(InlineResponse20088InstrumentNsin nsin) {
    this.nsin = nsin;
    return this;
  }

   /**
   * Get nsin
   * @return nsin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20088InstrumentNsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse20088InstrumentNsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse20089Instrument fsym(InlineResponse20036Fsym fsym) {
    this.fsym = fsym;
    return this;
  }

   /**
   * Get fsym
   * @return fsym
  **/
  @javax.annotation.Nullable
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


  public InlineResponse20089Instrument assetClass(InlineResponse20089InstrumentAssetClass assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Get assetClass
   * @return assetClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20089InstrumentAssetClass getAssetClass() {
    return assetClass;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetClass(InlineResponse20089InstrumentAssetClass assetClass) {
    this.assetClass = assetClass;
  }


  public InlineResponse20089Instrument type(java.util.List<InlineResponse20038DataCategories> type) {
    this.type = type;
    return this;
  }

  public InlineResponse20089Instrument addTypeItem(InlineResponse20038DataCategories typeItem) {
    if (this.type == null) {
      this.type = new java.util.ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity. See endpoint &#x60;/category/listBySystem&#x60; for category systems 18 for possible values.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity. See endpoint `/category/listBySystem` for category systems 18 for possible values.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20038DataCategories> getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(java.util.List<InlineResponse20038DataCategories> type) {
    this.type = type;
  }


  /**
   * Return true if this inline_response_200_89_instrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20089Instrument inlineResponse20089Instrument = (InlineResponse20089Instrument) o;
    return Objects.equals(this.id, inlineResponse20089Instrument.id) &&
        Objects.equals(this.name, inlineResponse20089Instrument.name) &&
        Objects.equals(this.isin, inlineResponse20089Instrument.isin) &&
        Objects.equals(this.nsin, inlineResponse20089Instrument.nsin) &&
        Objects.equals(this.fsym, inlineResponse20089Instrument.fsym) &&
        Objects.equals(this.assetClass, inlineResponse20089Instrument.assetClass) &&
        Objects.equals(this.type, inlineResponse20089Instrument.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isin, nsin, fsym, assetClass, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20089Instrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
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

