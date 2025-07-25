/*
 * GIPS API
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.GIPS.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.GIPS.models.GoogleProtobufWellKnownTypesListValue;
import com.factset.sdk.GIPS.models.GoogleProtobufWellKnownTypesNullValue;
import com.factset.sdk.GIPS.models.GoogleProtobufWellKnownTypesStruct;
import com.factset.sdk.GIPS.models.GoogleProtobufWellKnownTypesValueKindOneofCase;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.GIPS.JSON;


/**
 * GoogleProtobufWellKnownTypesValue
 */
@JsonPropertyOrder({
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_NULL_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_HAS_NULL_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_NUMBER_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_HAS_NUMBER_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_STRING_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_HAS_STRING_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_BOOL_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_HAS_BOOL_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_STRUCT_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_LIST_VALUE,
  GoogleProtobufWellKnownTypesValue.JSON_PROPERTY_KIND_CASE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GoogleProtobufWellKnownTypesValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NULL_VALUE = "nullValue";
  private GoogleProtobufWellKnownTypesNullValue nullValue;

  public static final String JSON_PROPERTY_HAS_NULL_VALUE = "hasNullValue";
  private Boolean hasNullValue;

  public static final String JSON_PROPERTY_NUMBER_VALUE = "numberValue";
  private Double numberValue;

  public static final String JSON_PROPERTY_HAS_NUMBER_VALUE = "hasNumberValue";
  private Boolean hasNumberValue;

  public static final String JSON_PROPERTY_STRING_VALUE = "stringValue";
  private JsonNullable<String> stringValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_STRING_VALUE = "hasStringValue";
  private Boolean hasStringValue;

  public static final String JSON_PROPERTY_BOOL_VALUE = "boolValue";
  private Boolean boolValue;

  public static final String JSON_PROPERTY_HAS_BOOL_VALUE = "hasBoolValue";
  private Boolean hasBoolValue;

  public static final String JSON_PROPERTY_STRUCT_VALUE = "structValue";
  private GoogleProtobufWellKnownTypesStruct structValue;

  public static final String JSON_PROPERTY_LIST_VALUE = "listValue";
  private GoogleProtobufWellKnownTypesListValue listValue;

  public static final String JSON_PROPERTY_KIND_CASE = "kindCase";
  private GoogleProtobufWellKnownTypesValueKindOneofCase kindCase;

  public GoogleProtobufWellKnownTypesValue() { 
  }

  @JsonCreator
  public GoogleProtobufWellKnownTypesValue(
    @JsonProperty(JSON_PROPERTY_HAS_NULL_VALUE) Boolean hasNullValue, 
    @JsonProperty(JSON_PROPERTY_HAS_NUMBER_VALUE) Boolean hasNumberValue, 
    @JsonProperty(JSON_PROPERTY_HAS_STRING_VALUE) Boolean hasStringValue, 
    @JsonProperty(JSON_PROPERTY_HAS_BOOL_VALUE) Boolean hasBoolValue
  ) {
    this();
    this.hasNullValue = hasNullValue;
    this.hasNumberValue = hasNumberValue;
    this.hasStringValue = hasStringValue;
    this.hasBoolValue = hasBoolValue;
  }

  public GoogleProtobufWellKnownTypesValue nullValue(GoogleProtobufWellKnownTypesNullValue nullValue) {
    this.nullValue = nullValue;
    return this;
  }

   /**
   * Get nullValue
   * @return nullValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NULL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GoogleProtobufWellKnownTypesNullValue getNullValue() {
    return nullValue;
  }


  @JsonProperty(JSON_PROPERTY_NULL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNullValue(GoogleProtobufWellKnownTypesNullValue nullValue) {
    this.nullValue = nullValue;
  }


   /**
   * Get hasNullValue
   * @return hasNullValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_NULL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasNullValue() {
    return hasNullValue;
  }




  public GoogleProtobufWellKnownTypesValue numberValue(Double numberValue) {
    this.numberValue = numberValue;
    return this;
  }

   /**
   * Get numberValue
   * @return numberValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getNumberValue() {
    return numberValue;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
  }


   /**
   * Get hasNumberValue
   * @return hasNumberValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_NUMBER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasNumberValue() {
    return hasNumberValue;
  }




  public GoogleProtobufWellKnownTypesValue stringValue(String stringValue) {
    this.stringValue = JsonNullable.<String>of(stringValue);
    return this;
  }

   /**
   * Get stringValue
   * @return stringValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getStringValue() {
        return stringValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STRING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStringValue_JsonNullable() {
    return stringValue;
  }
  
  @JsonProperty(JSON_PROPERTY_STRING_VALUE)
  public void setStringValue_JsonNullable(JsonNullable<String> stringValue) {
    this.stringValue = stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = JsonNullable.<String>of(stringValue);
  }


   /**
   * Get hasStringValue
   * @return hasStringValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_STRING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasStringValue() {
    return hasStringValue;
  }




  public GoogleProtobufWellKnownTypesValue boolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

   /**
   * Get boolValue
   * @return boolValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOOL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBoolValue() {
    return boolValue;
  }


  @JsonProperty(JSON_PROPERTY_BOOL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
  }


   /**
   * Get hasBoolValue
   * @return hasBoolValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_BOOL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasBoolValue() {
    return hasBoolValue;
  }




  public GoogleProtobufWellKnownTypesValue structValue(GoogleProtobufWellKnownTypesStruct structValue) {
    this.structValue = structValue;
    return this;
  }

   /**
   * Get structValue
   * @return structValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRUCT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GoogleProtobufWellKnownTypesStruct getStructValue() {
    return structValue;
  }


  @JsonProperty(JSON_PROPERTY_STRUCT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStructValue(GoogleProtobufWellKnownTypesStruct structValue) {
    this.structValue = structValue;
  }


  public GoogleProtobufWellKnownTypesValue listValue(GoogleProtobufWellKnownTypesListValue listValue) {
    this.listValue = listValue;
    return this;
  }

   /**
   * Get listValue
   * @return listValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GoogleProtobufWellKnownTypesListValue getListValue() {
    return listValue;
  }


  @JsonProperty(JSON_PROPERTY_LIST_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListValue(GoogleProtobufWellKnownTypesListValue listValue) {
    this.listValue = listValue;
  }


  public GoogleProtobufWellKnownTypesValue kindCase(GoogleProtobufWellKnownTypesValueKindOneofCase kindCase) {
    this.kindCase = kindCase;
    return this;
  }

   /**
   * Get kindCase
   * @return kindCase
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIND_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GoogleProtobufWellKnownTypesValueKindOneofCase getKindCase() {
    return kindCase;
  }


  @JsonProperty(JSON_PROPERTY_KIND_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKindCase(GoogleProtobufWellKnownTypesValueKindOneofCase kindCase) {
    this.kindCase = kindCase;
  }


  /**
   * Return true if this Google.Protobuf.WellKnownTypes.Value object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProtobufWellKnownTypesValue googleProtobufWellKnownTypesValue = (GoogleProtobufWellKnownTypesValue) o;
    return Objects.equals(this.nullValue, googleProtobufWellKnownTypesValue.nullValue) &&
        Objects.equals(this.hasNullValue, googleProtobufWellKnownTypesValue.hasNullValue) &&
        Objects.equals(this.numberValue, googleProtobufWellKnownTypesValue.numberValue) &&
        Objects.equals(this.hasNumberValue, googleProtobufWellKnownTypesValue.hasNumberValue) &&
        equalsNullable(this.stringValue, googleProtobufWellKnownTypesValue.stringValue) &&
        Objects.equals(this.hasStringValue, googleProtobufWellKnownTypesValue.hasStringValue) &&
        Objects.equals(this.boolValue, googleProtobufWellKnownTypesValue.boolValue) &&
        Objects.equals(this.hasBoolValue, googleProtobufWellKnownTypesValue.hasBoolValue) &&
        Objects.equals(this.structValue, googleProtobufWellKnownTypesValue.structValue) &&
        Objects.equals(this.listValue, googleProtobufWellKnownTypesValue.listValue) &&
        Objects.equals(this.kindCase, googleProtobufWellKnownTypesValue.kindCase);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nullValue, hasNullValue, numberValue, hasNumberValue, hashCodeNullable(stringValue), hasStringValue, boolValue, hasBoolValue, structValue, listValue, kindCase);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProtobufWellKnownTypesValue {\n");
    sb.append("    nullValue: ").append(toIndentedString(nullValue)).append("\n");
    sb.append("    hasNullValue: ").append(toIndentedString(hasNullValue)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    hasNumberValue: ").append(toIndentedString(hasNumberValue)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    hasStringValue: ").append(toIndentedString(hasStringValue)).append("\n");
    sb.append("    boolValue: ").append(toIndentedString(boolValue)).append("\n");
    sb.append("    hasBoolValue: ").append(toIndentedString(hasBoolValue)).append("\n");
    sb.append("    structValue: ").append(toIndentedString(structValue)).append("\n");
    sb.append("    listValue: ").append(toIndentedString(listValue)).append("\n");
    sb.append("    kindCase: ").append(toIndentedString(kindCase)).append("\n");
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

