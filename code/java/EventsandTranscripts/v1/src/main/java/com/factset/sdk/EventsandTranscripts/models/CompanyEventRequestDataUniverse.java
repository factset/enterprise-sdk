/*
 * EVENTS AND TRANSCRIPTS API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.EventsandTranscripts.models;

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
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * CompanyEventRequestDataUniverse
 */
@JsonPropertyOrder({
  CompanyEventRequestDataUniverse.JSON_PROPERTY_SYMBOLS,
  CompanyEventRequestDataUniverse.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyEventRequestDataUniverse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SYMBOLS = "symbols";
  private java.util.List<String> symbols = new java.util.ArrayList<>();

  /**
   * NOTE:  - SEDOLs and ISINs are supported with the type tickers.  - Etf: Requires additionl access to get the data.   - AllCompanies: While using this, we should not pass any symbols in the symbols field. 
   */
  public enum TypeEnum {
    TICKERS("Tickers"),
    
    INDEX("Index"),
    
    ETF("Etf"),
    
    ALLCOMPANIES("AllCompanies");

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

  public CompanyEventRequestDataUniverse() { 
  }

  @JsonCreator
  public CompanyEventRequestDataUniverse(
    @JsonProperty(value=JSON_PROPERTY_SYMBOLS, required=true) java.util.List<String> symbols, 
    @JsonProperty(value=JSON_PROPERTY_TYPE, required=true) TypeEnum type
  ) {
    this();
    this.symbols = symbols;
    this.type = type;
  }

  public CompanyEventRequestDataUniverse symbols(java.util.List<String> symbols) {
    this.symbols = symbols;
    return this;
  }

  public CompanyEventRequestDataUniverse addSymbolsItem(String symbolsItem) {
    this.symbols.add(symbolsItem);
    return this;
  }

   /**
   * Companies to return in the response.   - Only Tickers type can support multiple entries. 
   * @return symbols
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"AAPL-US\",\"MSFT-US\",\"FDS-US\"]", required = true, value = "Companies to return in the response.   - Only Tickers type can support multiple entries. ")
  @JsonProperty(JSON_PROPERTY_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getSymbols() {
    return symbols;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbols(java.util.List<String> symbols) {
    this.symbols = symbols;
  }


  public CompanyEventRequestDataUniverse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * NOTE:  - SEDOLs and ISINs are supported with the type tickers.  - Etf: Requires additionl access to get the data.   - AllCompanies: While using this, we should not pass any symbols in the symbols field. 
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Tickers", required = true, value = "NOTE:  - SEDOLs and ISINs are supported with the type tickers.  - Etf: Requires additionl access to get the data.   - AllCompanies: While using this, we should not pass any symbols in the symbols field. ")
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
   * Return true if this CompanyEventRequest_data_universe object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyEventRequestDataUniverse companyEventRequestDataUniverse = (CompanyEventRequestDataUniverse) o;
    return Objects.equals(this.symbols, companyEventRequestDataUniverse.symbols) &&
        Objects.equals(this.type, companyEventRequestDataUniverse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbols, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyEventRequestDataUniverse {\n");
    sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
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

