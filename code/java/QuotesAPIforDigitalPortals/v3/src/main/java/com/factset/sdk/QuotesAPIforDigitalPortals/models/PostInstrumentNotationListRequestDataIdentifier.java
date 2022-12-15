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
 * Set of instrument-related identifiers and their type.
 */
@ApiModel(description = "Set of instrument-related identifiers and their type.")
@JsonPropertyOrder({
  PostInstrumentNotationListRequestDataIdentifier.JSON_PROPERTY_VALUES,
  PostInstrumentNotationListRequestDataIdentifier.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostInstrumentNotationListRequestDataIdentifier implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUES = "values";
  private java.util.Set<String> values = new java.util.LinkedHashSet<>();

  /**
   * Type of the identifier.
   */
  public enum TypeEnum {
    IDINSTRUMENT("idInstrument"),
    
    TICKEREXCHANGE("tickerExchange");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public PostInstrumentNotationListRequestDataIdentifier() { 
  }

  @JsonCreator
  public PostInstrumentNotationListRequestDataIdentifier(
    @JsonProperty(value=JSON_PROPERTY_VALUES, required=true) java.util.Set<String> values, 
    @JsonProperty(value=JSON_PROPERTY_TYPE, required=true) TypeEnum type
  ) {
    this();
    this.values = values;
    this.type = type;
  }

  public PostInstrumentNotationListRequestDataIdentifier values(java.util.Set<String> values) {
    this.values = values;
    return this;
  }

  public PostInstrumentNotationListRequestDataIdentifier addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Set of identifiers that resolve to an instrument.
   * @return values
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Set of identifiers that resolve to an instrument.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.Set<String> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(java.util.Set<String> values) {
    this.values = values;
  }


  public PostInstrumentNotationListRequestDataIdentifier type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the identifier.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of the identifier.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this PostInstrumentNotationListRequest_data_identifier object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInstrumentNotationListRequestDataIdentifier postInstrumentNotationListRequestDataIdentifier = (PostInstrumentNotationListRequestDataIdentifier) o;
    return Objects.equals(this.values, postInstrumentNotationListRequestDataIdentifier.values) &&
        Objects.equals(this.type, postInstrumentNotationListRequestDataIdentifier.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInstrumentNotationListRequestDataIdentifier {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

