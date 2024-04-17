/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

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
import com.factset.sdk.OpenRisk.JSON;


/**
 * Hide risk model factors in the response results; does not affect calculated data values
 */
@ApiModel(description = "Hide risk model factors in the response results; does not affect calculated data values")
@JsonPropertyOrder({
  FactorsVisible.JSON_PROPERTY_LIST,
  FactorsVisible.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FactorsVisible implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LIST = "list";
  private java.util.List<String> _list = new java.util.ArrayList<>();

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    WHITELIST("Whitelist"),
    
    BLACKLIST("Blacklist");

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

  public FactorsVisible() { 
  }

  @JsonCreator
  public FactorsVisible(
    @JsonProperty(value=JSON_PROPERTY_LIST, required=true) java.util.List<String> _list, 
    @JsonProperty(value=JSON_PROPERTY_TYPE, required=true) TypeEnum type
  ) {
    this();
    this._list = _list;
    this.type = type;
  }

  public FactorsVisible _list(java.util.List<String> _list) {
    this._list = _list;
    return this;
  }

  public FactorsVisible addListItem(String _listItem) {
    this._list.add(_listItem);
    return this;
  }

   /**
   * List of risk model factor IDs
   * @return _list
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of risk model factor IDs")
  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getList() {
    return _list;
  }


  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setList(java.util.List<String> _list) {
    this._list = _list;
  }


  public FactorsVisible type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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
   * Return true if this FactorsVisible object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactorsVisible factorsVisible = (FactorsVisible) o;
    return Objects.equals(this._list, factorsVisible._list) &&
        Objects.equals(this.type, factorsVisible.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactorsVisible {\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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

