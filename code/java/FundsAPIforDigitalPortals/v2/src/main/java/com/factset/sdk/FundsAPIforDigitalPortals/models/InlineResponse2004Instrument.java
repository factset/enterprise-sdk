/*
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FundsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2004InstrumentFsym;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2004InstrumentNsin;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * Instrument data of the notation.
 */
@ApiModel(description = "Instrument data of the notation.")
@JsonPropertyOrder({
  InlineResponse2004Instrument.JSON_PROPERTY_ID,
  InlineResponse2004Instrument.JSON_PROPERTY_NAME,
  InlineResponse2004Instrument.JSON_PROPERTY_SHORT_NAME,
  InlineResponse2004Instrument.JSON_PROPERTY_ISIN,
  InlineResponse2004Instrument.JSON_PROPERTY_NSIN,
  InlineResponse2004Instrument.JSON_PROPERTY_FSYM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004Instrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private String shortName;

  public static final String JSON_PROPERTY_ISIN = "isin";
  private String isin;

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse2004InstrumentNsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse2004InstrumentFsym fsym;

  public InlineResponse2004Instrument() { 
  }

  public InlineResponse2004Instrument id(String id) {
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


  public InlineResponse2004Instrument name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the instrument.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the instrument.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2004Instrument shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Short name of the instrument.
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short name of the instrument.")
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortName() {
    return shortName;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public InlineResponse2004Instrument isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
   * @return isin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.")
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


  public InlineResponse2004Instrument nsin(InlineResponse2004InstrumentNsin nsin) {
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

  public InlineResponse2004InstrumentNsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse2004InstrumentNsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse2004Instrument fsym(InlineResponse2004InstrumentFsym fsym) {
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

  public InlineResponse2004InstrumentFsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse2004InstrumentFsym fsym) {
    this.fsym = fsym;
  }


  /**
   * Return true if this inline_response_200_4_instrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Instrument inlineResponse2004Instrument = (InlineResponse2004Instrument) o;
    return Objects.equals(this.id, inlineResponse2004Instrument.id) &&
        Objects.equals(this.name, inlineResponse2004Instrument.name) &&
        Objects.equals(this.shortName, inlineResponse2004Instrument.shortName) &&
        Objects.equals(this.isin, inlineResponse2004Instrument.isin) &&
        Objects.equals(this.nsin, inlineResponse2004Instrument.nsin) &&
        Objects.equals(this.fsym, inlineResponse2004Instrument.fsym);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortName, isin, nsin, fsym);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Instrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
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

