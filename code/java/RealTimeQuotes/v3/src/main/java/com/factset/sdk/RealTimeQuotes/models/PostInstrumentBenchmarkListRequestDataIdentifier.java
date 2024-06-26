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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Identifier and type.
 */
@ApiModel(description = "Identifier and type.")
@JsonPropertyOrder({
  PostInstrumentBenchmarkListRequestDataIdentifier.JSON_PROPERTY_VALUE,
  PostInstrumentBenchmarkListRequestDataIdentifier.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostInstrumentBenchmarkListRequestDataIdentifier implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  /**
   * Type of the identifier.
   */
  public enum TypeEnum {
    IDINSTRUMENT("idInstrument"),
    
    IDNOTATION("idNotation"),
    
    FDSPERMANENTIDENTIFIERSECURITY("fdsPermanentIdentifierSecurity"),
    
    FDSPERMANENTIDENTIFIERLISTING("fdsPermanentIdentifierListing"),
    
    FDSPERMANENTIDENTIFIERREGIONAL("fdsPermanentIdentifierRegional"),
    
    TICKEREXCHANGE("tickerExchange"),
    
    TICKERREGION("tickerRegion"),
    
    SEDOL("sedol"),
    
    ISIN("isin"),
    
    WKN("wkn"),
    
    VALOR("valor"),
    
    CUSIP("cusip");

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

  public PostInstrumentBenchmarkListRequestDataIdentifier() { 
  }

  @JsonCreator
  public PostInstrumentBenchmarkListRequestDataIdentifier(
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) String value, 
    @JsonProperty(value=JSON_PROPERTY_TYPE, required=true) TypeEnum type
  ) {
    this();
    this.value = value;
    this.type = type;
  }

  public PostInstrumentBenchmarkListRequestDataIdentifier value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Identifier to resolve.
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier to resolve.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  public PostInstrumentBenchmarkListRequestDataIdentifier type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the identifier.
   * @return type
  **/
  @jakarta.annotation.Nonnull
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
   * Return true if this PostInstrumentBenchmarkListRequest_data_identifier object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInstrumentBenchmarkListRequestDataIdentifier postInstrumentBenchmarkListRequestDataIdentifier = (PostInstrumentBenchmarkListRequestDataIdentifier) o;
    return Objects.equals(this.value, postInstrumentBenchmarkListRequestDataIdentifier.value) &&
        Objects.equals(this.type, postInstrumentBenchmarkListRequestDataIdentifier.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInstrumentBenchmarkListRequestDataIdentifier {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

