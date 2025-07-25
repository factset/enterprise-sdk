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
 * FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier
 */
@JsonPropertyOrder({
  FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier.JSON_PROPERTY_NEGATIVE_PATTERN,
  FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier.JSON_PROPERTY_POSITIVE_PATTERN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NEGATIVE_PATTERN = "negativePattern";
  private JsonNullable<String> negativePattern = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POSITIVE_PATTERN = "positivePattern";
  private JsonNullable<String> positivePattern = JsonNullable.<String>undefined();

  public FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier() { 
  }

  public FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier negativePattern(String negativePattern) {
    this.negativePattern = JsonNullable.<String>of(negativePattern);
    return this;
  }

   /**
   * Get negativePattern
   * @return negativePattern
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNegativePattern() {
        return negativePattern.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEGATIVE_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNegativePattern_JsonNullable() {
    return negativePattern;
  }
  
  @JsonProperty(JSON_PROPERTY_NEGATIVE_PATTERN)
  public void setNegativePattern_JsonNullable(JsonNullable<String> negativePattern) {
    this.negativePattern = negativePattern;
  }

  public void setNegativePattern(String negativePattern) {
    this.negativePattern = JsonNullable.<String>of(negativePattern);
  }


  public FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier positivePattern(String positivePattern) {
    this.positivePattern = JsonNullable.<String>of(positivePattern);
    return this;
  }

   /**
   * Get positivePattern
   * @return positivePattern
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getPositivePattern() {
        return positivePattern.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSITIVE_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPositivePattern_JsonNullable() {
    return positivePattern;
  }
  
  @JsonProperty(JSON_PROPERTY_POSITIVE_PATTERN)
  public void setPositivePattern_JsonNullable(JsonNullable<String> positivePattern) {
    this.positivePattern = positivePattern;
  }

  public void setPositivePattern(String positivePattern) {
    this.positivePattern = JsonNullable.<String>of(positivePattern);
  }


  /**
   * Return true if this FactSet.Protobuf.Format.V1.NumberFormat.Types.NumericStandardSpecifier object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier factSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier = (FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier) o;
    return equalsNullable(this.negativePattern, factSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier.negativePattern) &&
        equalsNullable(this.positivePattern, factSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier.positivePattern);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(negativePattern), hashCodeNullable(positivePattern));
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
    sb.append("class FactSetProtobufFormatV1NumberFormatTypesNumericStandardSpecifier {\n");
    sb.append("    negativePattern: ").append(toIndentedString(negativePattern)).append("\n");
    sb.append("    positivePattern: ").append(toIndentedString(positivePattern)).append("\n");
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

