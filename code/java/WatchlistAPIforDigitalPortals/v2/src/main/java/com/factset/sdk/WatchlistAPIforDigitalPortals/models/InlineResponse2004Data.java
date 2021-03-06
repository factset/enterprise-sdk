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


package com.factset.sdk.WatchlistAPIforDigitalPortals.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.WatchlistAPIforDigitalPortals.JSON;


/**
 * InlineResponse2004Data
 */
@JsonPropertyOrder({
  InlineResponse2004Data.JSON_PROPERTY_ID,
  InlineResponse2004Data.JSON_PROPERTY_NOTATION,
  InlineResponse2004Data.JSON_PROPERTY_ADDITIONAL_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NOTATION = "notation";
  private String notation;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private String additionalData;

  public InlineResponse2004Data() { 
  }

  public InlineResponse2004Data id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Position id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Position id.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public InlineResponse2004Data notation(String notation) {
    this.notation = notation;
    return this;
  }

   /**
   * Identifier of the notation.
   * @return notation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the notation.")
  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotation() {
    return notation;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotation(String notation) {
    this.notation = notation;
  }


  public InlineResponse2004Data additionalData(String additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Additional data to the watched position.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data to the watched position.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }


  /**
   * Return true if this inline_response_200_4_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Data inlineResponse2004Data = (InlineResponse2004Data) o;
    return Objects.equals(this.id, inlineResponse2004Data.id) &&
        Objects.equals(this.notation, inlineResponse2004Data.notation) &&
        Objects.equals(this.additionalData, inlineResponse2004Data.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, notation, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notation: ").append(toIndentedString(notation)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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

