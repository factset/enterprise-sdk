/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20046NotationFsym;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20050DataNotationInstrument;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20050DataNotationOperatingMIC;
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Notation of the component. If there is no notation for the component, the object is null.
 */
@ApiModel(description = "Notation of the component. If there is no notation for the component, the object is null.")
@JsonPropertyOrder({
  InlineResponse20050DataNotation.JSON_PROPERTY_ID,
  InlineResponse20050DataNotation.JSON_PROPERTY_FSYM,
  InlineResponse20050DataNotation.JSON_PROPERTY_INSTRUMENT,
  InlineResponse20050DataNotation.JSON_PROPERTY_OPERATING_M_I_C
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20050DataNotation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse20046NotationFsym fsym;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InlineResponse20050DataNotationInstrument instrument;

  public static final String JSON_PROPERTY_OPERATING_M_I_C = "operatingMIC";
  private InlineResponse20050DataNotationOperatingMIC operatingMIC;

  public InlineResponse20050DataNotation() { 
  }

  public InlineResponse20050DataNotation id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of the notation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the notation.")
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


  public InlineResponse20050DataNotation fsym(InlineResponse20046NotationFsym fsym) {
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

  public InlineResponse20046NotationFsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse20046NotationFsym fsym) {
    this.fsym = fsym;
  }


  public InlineResponse20050DataNotation instrument(InlineResponse20050DataNotationInstrument instrument) {
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

  public InlineResponse20050DataNotationInstrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(InlineResponse20050DataNotationInstrument instrument) {
    this.instrument = instrument;
  }


  public InlineResponse20050DataNotation operatingMIC(InlineResponse20050DataNotationOperatingMIC operatingMIC) {
    this.operatingMIC = operatingMIC;
    return this;
  }

   /**
   * Get operatingMIC
   * @return operatingMIC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATING_M_I_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20050DataNotationOperatingMIC getOperatingMIC() {
    return operatingMIC;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_M_I_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingMIC(InlineResponse20050DataNotationOperatingMIC operatingMIC) {
    this.operatingMIC = operatingMIC;
  }


  /**
   * Return true if this inline_response_200_50_data_notation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20050DataNotation inlineResponse20050DataNotation = (InlineResponse20050DataNotation) o;
    return equalsNullable(this.id, inlineResponse20050DataNotation.id) &&
        Objects.equals(this.fsym, inlineResponse20050DataNotation.fsym) &&
        Objects.equals(this.instrument, inlineResponse20050DataNotation.instrument) &&
        Objects.equals(this.operatingMIC, inlineResponse20050DataNotation.operatingMIC);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), fsym, instrument, operatingMIC);
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
    sb.append("class InlineResponse20050DataNotation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    operatingMIC: ").append(toIndentedString(operatingMIC)).append("\n");
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

