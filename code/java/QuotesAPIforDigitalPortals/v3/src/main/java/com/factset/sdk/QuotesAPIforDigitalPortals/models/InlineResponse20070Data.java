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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20070DataInstrument;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20070DataRegional;
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
 * Instrument data with a list of regional-level data and assigned listing-level data.
 */
@ApiModel(description = "Instrument data with a list of regional-level data and assigned listing-level data.")
@JsonPropertyOrder({
  InlineResponse20070Data.JSON_PROPERTY_INSTRUMENT,
  InlineResponse20070Data.JSON_PROPERTY_PERMANENT_IDENTIFIER,
  InlineResponse20070Data.JSON_PROPERTY_REGIONAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20070Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InlineResponse20070DataInstrument instrument;

  public static final String JSON_PROPERTY_PERMANENT_IDENTIFIER = "permanentIdentifier";
  private String permanentIdentifier;

  public static final String JSON_PROPERTY_REGIONAL = "regional";
  private java.util.List<InlineResponse20070DataRegional> regional = null;

  public InlineResponse20070Data() { 
  }

  public InlineResponse20070Data instrument(InlineResponse20070DataInstrument instrument) {
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20070DataInstrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(InlineResponse20070DataInstrument instrument) {
    this.instrument = instrument;
  }


  public InlineResponse20070Data permanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
    return this;
  }

   /**
   * FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).
   * @return permanentIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).")
  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermanentIdentifier() {
    return permanentIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
  }


  public InlineResponse20070Data regional(java.util.List<InlineResponse20070DataRegional> regional) {
    this.regional = regional;
    return this;
  }

  public InlineResponse20070Data addRegionalItem(InlineResponse20070DataRegional regionalItem) {
    if (this.regional == null) {
      this.regional = new java.util.ArrayList<>();
    }
    this.regional.add(regionalItem);
    return this;
  }

   /**
   * Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array.
   * @return regional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute `isPrimary = true`, then this element is the first one in the array.")
  @JsonProperty(JSON_PROPERTY_REGIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20070DataRegional> getRegional() {
    return regional;
  }


  @JsonProperty(JSON_PROPERTY_REGIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegional(java.util.List<InlineResponse20070DataRegional> regional) {
    this.regional = regional;
  }


  /**
   * Return true if this inline_response_200_70_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20070Data inlineResponse20070Data = (InlineResponse20070Data) o;
    return Objects.equals(this.instrument, inlineResponse20070Data.instrument) &&
        Objects.equals(this.permanentIdentifier, inlineResponse20070Data.permanentIdentifier) &&
        Objects.equals(this.regional, inlineResponse20070Data.regional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrument, permanentIdentifier, regional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20070Data {\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    permanentIdentifier: ").append(toIndentedString(permanentIdentifier)).append("\n");
    sb.append("    regional: ").append(toIndentedString(regional)).append("\n");
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

