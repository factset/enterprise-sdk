/*
 * Quant API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuantEngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuantEngine.models.QuantUniverse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuantEngine.JSON;


/**
 * QuantIdentifierUniverse
 */
@JsonPropertyOrder({
  QuantIdentifierUniverse.JSON_PROPERTY_UNIVERSE_TYPE,
  QuantIdentifierUniverse.JSON_PROPERTY_IDENTIFIERS,
  QuantIdentifierUniverse.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class QuantIdentifierUniverse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets universeType
   */
  public enum UniverseTypeEnum {
    EQUITY("Equity"),
    
    DEBT("Debt");

    private String value;

    UniverseTypeEnum(String value) {
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
    public static UniverseTypeEnum fromValue(String value) {
      for (UniverseTypeEnum b : UniverseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_UNIVERSE_TYPE = "universeType";
  private UniverseTypeEnum universeType;

  public static final String JSON_PROPERTY_IDENTIFIERS = "identifiers";
  private java.util.List<String> identifiers = new java.util.ArrayList<>();

  /**
   * Gets or Sets source
   */
  public enum SourceEnum {
    SCREENINGEXPRESSIONUNIVERSE("ScreeningExpressionUniverse"),
    
    UNIVERSALSCREENUNIVERSE("UniversalScreenUniverse"),
    
    IDENTIFIERUNIVERSE("IdentifierUniverse");

    private String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceEnum source;

  public QuantIdentifierUniverse() { 
  }

  @JsonCreator
  public QuantIdentifierUniverse(
    @JsonProperty(value=JSON_PROPERTY_UNIVERSE_TYPE, required=true) UniverseTypeEnum universeType, 
    @JsonProperty(value=JSON_PROPERTY_IDENTIFIERS, required=true) java.util.List<String> identifiers, 
    @JsonProperty(value=JSON_PROPERTY_SOURCE, required=true) SourceEnum source
  ) {
    this();
    this.universeType = universeType;
    this.identifiers = identifiers;
    this.source = source;
  }

  public QuantIdentifierUniverse universeType(UniverseTypeEnum universeType) {
    this.universeType = universeType;
    return this;
  }

   /**
   * Get universeType
   * @return universeType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Equity", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UNIVERSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UniverseTypeEnum getUniverseType() {
    return universeType;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniverseType(UniverseTypeEnum universeType) {
    this.universeType = universeType;
  }


  public QuantIdentifierUniverse identifiers(java.util.List<String> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public QuantIdentifierUniverse addIdentifiersItem(String identifiersItem) {
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIdentifiers() {
    return identifiers;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentifiers(java.util.List<String> identifiers) {
    this.identifiers = identifiers;
  }


  public QuantIdentifierUniverse source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ScreeningExpressionUniverse", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SourceEnum getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(SourceEnum source) {
    this.source = source;
  }


  /**
   * Return true if this QuantIdentifierUniverse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantIdentifierUniverse quantIdentifierUniverse = (QuantIdentifierUniverse) o;
    return Objects.equals(this.universeType, quantIdentifierUniverse.universeType) &&
        Objects.equals(this.identifiers, quantIdentifierUniverse.identifiers) &&
        Objects.equals(this.source, quantIdentifierUniverse.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(universeType, identifiers, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantIdentifierUniverse {\n");
    sb.append("    universeType: ").append(toIndentedString(universeType)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

