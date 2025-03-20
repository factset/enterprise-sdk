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
 * QuantUniverse
 */
@JsonPropertyOrder({
  QuantUniverse.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class QuantUniverse implements Serializable {
  private static final long serialVersionUID = 1L;

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

  public QuantUniverse() { 
  }

  @JsonCreator
  public QuantUniverse(
    @JsonProperty(value=JSON_PROPERTY_SOURCE, required=true) SourceEnum source
  ) {
    this();
    this.source = source;
  }

  public QuantUniverse source(SourceEnum source) {
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
   * Return true if this QuantUniverse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantUniverse quantUniverse = (QuantUniverse) o;
    return Objects.equals(this.source, quantUniverse.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantUniverse {\n");
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

