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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData.JSON_PROPERTY_SYMBOLOGY_IDENTIFIER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SYMBOLOGY_IDENTIFIER = "symbologyIdentifier";
  private String symbologyIdentifier;

  public NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData() { 
  }

  @JsonCreator
  public NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData(
    @JsonProperty(value=JSON_PROPERTY_SYMBOLOGY_IDENTIFIER, required=true) String symbologyIdentifier
  ) {
    this();
    this.symbologyIdentifier = symbologyIdentifier;
  }

  public NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData symbologyIdentifier(String symbologyIdentifier) {
    this.symbologyIdentifier = symbologyIdentifier;
    return this;
  }

   /**
   * FactSet Symbology Identifier. See the endpoint description for valid FactSet Symbology Identifier types.
   * @return symbologyIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "FactSet Symbology Identifier. See the endpoint description for valid FactSet Symbology Identifier types.")
  @JsonProperty(JSON_PROPERTY_SYMBOLOGY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbologyIdentifier() {
    return symbologyIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOLOGY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbologyIdentifier(String symbologyIdentifier) {
    this.symbologyIdentifier = symbologyIdentifier;
  }


  /**
   * Return true if this _notation_crossReference_factSetIdentifier_listByFactSetIdentifier_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData notationCrossReferenceFactSetIdentifierListByFactSetIdentifierData = (NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData) o;
    return Objects.equals(this.symbologyIdentifier, notationCrossReferenceFactSetIdentifierListByFactSetIdentifierData.symbologyIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbologyIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData {\n");
    sb.append("    symbologyIdentifier: ").append(toIndentedString(symbologyIdentifier)).append("\n");
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

