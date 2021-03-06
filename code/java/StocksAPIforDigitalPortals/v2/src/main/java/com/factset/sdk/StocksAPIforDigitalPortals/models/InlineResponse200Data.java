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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200Currency;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200Dates;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200Gross;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200Occurrence;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200Type;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * InlineResponse200Data
 */
@JsonPropertyOrder({
  InlineResponse200Data.JSON_PROPERTY_ID,
  InlineResponse200Data.JSON_PROPERTY_TYPE,
  InlineResponse200Data.JSON_PROPERTY_OCCURRENCE,
  InlineResponse200Data.JSON_PROPERTY_DATES,
  InlineResponse200Data.JSON_PROPERTY_CURRENCY,
  InlineResponse200Data.JSON_PROPERTY_GROSS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private InlineResponse200Type type;

  public static final String JSON_PROPERTY_OCCURRENCE = "occurrence";
  private InlineResponse200Occurrence occurrence;

  public static final String JSON_PROPERTY_DATES = "dates";
  private InlineResponse200Dates dates;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse200Currency currency;

  public static final String JSON_PROPERTY_GROSS = "gross";
  private InlineResponse200Gross gross;

  public InlineResponse200Data() { 
  }

  public InlineResponse200Data id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a dividend.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a dividend.")
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


  public InlineResponse200Data type(InlineResponse200Type type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200Type getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InlineResponse200Type type) {
    this.type = type;
  }


  public InlineResponse200Data occurrence(InlineResponse200Occurrence occurrence) {
    this.occurrence = occurrence;
    return this;
  }

   /**
   * Get occurrence
   * @return occurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCCURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200Occurrence getOccurrence() {
    return occurrence;
  }


  @JsonProperty(JSON_PROPERTY_OCCURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOccurrence(InlineResponse200Occurrence occurrence) {
    this.occurrence = occurrence;
  }


  public InlineResponse200Data dates(InlineResponse200Dates dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200Dates getDates() {
    return dates;
  }


  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDates(InlineResponse200Dates dates) {
    this.dates = dates;
  }


  public InlineResponse200Data currency(InlineResponse200Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse200Currency currency) {
    this.currency = currency;
  }


  public InlineResponse200Data gross(InlineResponse200Gross gross) {
    this.gross = gross;
    return this;
  }

   /**
   * Get gross
   * @return gross
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200Gross getGross() {
    return gross;
  }


  @JsonProperty(JSON_PROPERTY_GROSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGross(InlineResponse200Gross gross) {
    this.gross = gross;
  }


  /**
   * Return true if this inline_response_200_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.id, inlineResponse200Data.id) &&
        Objects.equals(this.type, inlineResponse200Data.type) &&
        Objects.equals(this.occurrence, inlineResponse200Data.occurrence) &&
        Objects.equals(this.dates, inlineResponse200Data.dates) &&
        Objects.equals(this.currency, inlineResponse200Data.currency) &&
        Objects.equals(this.gross, inlineResponse200Data.gross);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, occurrence, dates, currency, gross);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    occurrence: ").append(toIndentedString(occurrence)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
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

