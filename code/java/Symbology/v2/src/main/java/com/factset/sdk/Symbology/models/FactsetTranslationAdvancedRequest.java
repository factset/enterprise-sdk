/*
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.2
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
import com.factset.sdk.Symbology.models.GetSymbolType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Symbology.JSON;


/**
 * Request object for FactSet endpoint.
 */
@ApiModel(description = "Request object for FactSet endpoint.")
@JsonPropertyOrder({
  FactsetTranslationAdvancedRequest.JSON_PROPERTY_IDS,
  FactsetTranslationAdvancedRequest.JSON_PROPERTY_SYMBOL_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FactsetTranslationAdvancedRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_SYMBOL_TYPE = "symbolType";
  private GetSymbolType symbolType = GetSymbolType.EMPTY;

  public FactsetTranslationAdvancedRequest() { 
  }

  @JsonCreator
  public FactsetTranslationAdvancedRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids
  ) {
    this();
    this.ids = ids;
  }

  public FactsetTranslationAdvancedRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FactsetTranslationAdvancedRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Requested market securities or entities. Accepted identifiers include all identifiers in the list above. This request value is sent back in the response as ‘requestId’.
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"GOOGL-US\"]", required = true, value = "Requested market securities or entities. Accepted identifiers include all identifiers in the list above. This request value is sent back in the response as ‘requestId’.")
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


  public FactsetTranslationAdvancedRequest symbolType(GetSymbolType symbolType) {
    this.symbolType = symbolType;
    return this;
  }

   /**
   * Get symbolType
   * @return symbolType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYMBOL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetSymbolType getSymbolType() {
    return symbolType;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbolType(GetSymbolType symbolType) {
    this.symbolType = symbolType;
  }


  /**
   * Return true if this factsetTranslationAdvancedRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactsetTranslationAdvancedRequest factsetTranslationAdvancedRequest = (FactsetTranslationAdvancedRequest) o;
    return Objects.equals(this.ids, factsetTranslationAdvancedRequest.ids) &&
        Objects.equals(this.symbolType, factsetTranslationAdvancedRequest.symbolType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, symbolType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactsetTranslationAdvancedRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    symbolType: ").append(toIndentedString(symbolType)).append("\n");
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

