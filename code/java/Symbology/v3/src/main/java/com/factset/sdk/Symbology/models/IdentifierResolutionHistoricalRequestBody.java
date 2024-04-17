/*
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and LEIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs.</p> 
 *
 * The version of the OpenAPI document: 3.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Symbology.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Symbology.models.GetHistoricalInputSymbolType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Symbology.JSON;


/**
 * Request object for Historical Identifier Resolution endpoint.
 */
@ApiModel(description = "Request object for Historical Identifier Resolution endpoint.")
@JsonPropertyOrder({
  IdentifierResolutionHistoricalRequestBody.JSON_PROPERTY_IDS,
  IdentifierResolutionHistoricalRequestBody.JSON_PROPERTY_INPUT_SYMBOL_TYPE,
  IdentifierResolutionHistoricalRequestBody.JSON_PROPERTY_OUTPUT_SYMBOL_TYPES,
  IdentifierResolutionHistoricalRequestBody.JSON_PROPERTY_AS_OF_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IdentifierResolutionHistoricalRequestBody implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_INPUT_SYMBOL_TYPE = "inputSymbolType";
  private GetHistoricalInputSymbolType inputSymbolType;

  /**
   * Gets or Sets outputSymbolTypes
   */
  public enum OutputSymbolTypesEnum {
    SEDOL("SEDOL"),
    
    CUSIP("CUSIP"),
    
    ISIN("ISIN"),
    
    TICKERREGION("tickerRegion");

    private String value;

    OutputSymbolTypesEnum(String value) {
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
    public static OutputSymbolTypesEnum fromValue(String value) {
      for (OutputSymbolTypesEnum b : OutputSymbolTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OUTPUT_SYMBOL_TYPES = "outputSymbolTypes";
  private java.util.List<OutputSymbolTypesEnum> outputSymbolTypes = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private LocalDate asOfDate;

  public IdentifierResolutionHistoricalRequestBody() { 
  }

  @JsonCreator
  public IdentifierResolutionHistoricalRequestBody(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_INPUT_SYMBOL_TYPE, required=true) GetHistoricalInputSymbolType inputSymbolType, 
    @JsonProperty(value=JSON_PROPERTY_OUTPUT_SYMBOL_TYPES, required=true) java.util.List<OutputSymbolTypesEnum> outputSymbolTypes
  ) {
    this();
    this.ids = ids;
    this.inputSymbolType = inputSymbolType;
    this.outputSymbolTypes = outputSymbolTypes;
  }

  public IdentifierResolutionHistoricalRequestBody ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public IdentifierResolutionHistoricalRequestBody addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;.
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"GOOGL-US\"]", required = true, value = "Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public IdentifierResolutionHistoricalRequestBody inputSymbolType(GetHistoricalInputSymbolType inputSymbolType) {
    this.inputSymbolType = inputSymbolType;
    return this;
  }

   /**
   * Get inputSymbolType
   * @return inputSymbolType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INPUT_SYMBOL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetHistoricalInputSymbolType getInputSymbolType() {
    return inputSymbolType;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_SYMBOL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInputSymbolType(GetHistoricalInputSymbolType inputSymbolType) {
    this.inputSymbolType = inputSymbolType;
  }


  public IdentifierResolutionHistoricalRequestBody outputSymbolTypes(java.util.List<OutputSymbolTypesEnum> outputSymbolTypes) {
    this.outputSymbolTypes = outputSymbolTypes;
    return this;
  }

  public IdentifierResolutionHistoricalRequestBody addOutputSymbolTypesItem(OutputSymbolTypesEnum outputSymbolTypesItem) {
    this.outputSymbolTypes.add(outputSymbolTypesItem);
    return this;
  }

   /**
   * Requested identifiers to be returned. Multiple identifier types can be requested with each request.
   * @return outputSymbolTypes
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"CUSIP\",\"SEDOL\"]", required = true, value = "Requested identifiers to be returned. Multiple identifier types can be requested with each request.")
  @JsonProperty(JSON_PROPERTY_OUTPUT_SYMBOL_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<OutputSymbolTypesEnum> getOutputSymbolTypes() {
    return outputSymbolTypes;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_SYMBOL_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutputSymbolTypes(java.util.List<OutputSymbolTypesEnum> outputSymbolTypes) {
    this.outputSymbolTypes = outputSymbolTypes;
  }


  public IdentifierResolutionHistoricalRequestBody asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier. 
   * @return asOfDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri Jan 01 00:00:00 UTC 2010", value = "As of date for historical symbol request in YYYY-MM-DD format. If no `asOfDate` is requested, the response will include the full history of the identifier. ")
  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getAsOfDate() {
    return asOfDate;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }


  /**
   * Return true if this identifierResolutionHistoricalRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifierResolutionHistoricalRequestBody identifierResolutionHistoricalRequestBody = (IdentifierResolutionHistoricalRequestBody) o;
    return Objects.equals(this.ids, identifierResolutionHistoricalRequestBody.ids) &&
        Objects.equals(this.inputSymbolType, identifierResolutionHistoricalRequestBody.inputSymbolType) &&
        Objects.equals(this.outputSymbolTypes, identifierResolutionHistoricalRequestBody.outputSymbolTypes) &&
        Objects.equals(this.asOfDate, identifierResolutionHistoricalRequestBody.asOfDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, inputSymbolType, outputSymbolTypes, asOfDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierResolutionHistoricalRequestBody {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    inputSymbolType: ").append(toIndentedString(inputSymbolType)).append("\n");
    sb.append("    outputSymbolTypes: ").append(toIndentedString(outputSymbolTypes)).append("\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
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

