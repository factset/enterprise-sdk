/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNConfiguration.models;

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
import com.factset.sdk.IRNConfiguration.JSON;


/**
 * HeadlineFormatConfigDto
 */
@JsonPropertyOrder({
  HeadlineFormatConfigDto.JSON_PROPERTY_NAME,
  HeadlineFormatConfigDto.JSON_PROPERTY_CUSTOM_STRING,
  HeadlineFormatConfigDto.JSON_PROPERTY_CUSTOM_FIELD_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class HeadlineFormatConfigDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOM_STRING = "customString";
  private JsonNullable<String> customString = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FIELD_NAME = "customFieldName";
  private JsonNullable<String> customFieldName = JsonNullable.<String>undefined();

  public HeadlineFormatConfigDto() { 
  }

  public HeadlineFormatConfigDto name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public HeadlineFormatConfigDto customString(String customString) {
    this.customString = JsonNullable.<String>of(customString);
    return this;
  }

   /**
   * Get customString
   * @return customString
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCustomString() {
        return customString.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomString_JsonNullable() {
    return customString;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_STRING)
  public void setCustomString_JsonNullable(JsonNullable<String> customString) {
    this.customString = customString;
  }

  public void setCustomString(String customString) {
    this.customString = JsonNullable.<String>of(customString);
  }


  public HeadlineFormatConfigDto customFieldName(String customFieldName) {
    this.customFieldName = JsonNullable.<String>of(customFieldName);
    return this;
  }

   /**
   * Get customFieldName
   * @return customFieldName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCustomFieldName() {
        return customFieldName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomFieldName_JsonNullable() {
    return customFieldName;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_NAME)
  public void setCustomFieldName_JsonNullable(JsonNullable<String> customFieldName) {
    this.customFieldName = customFieldName;
  }

  public void setCustomFieldName(String customFieldName) {
    this.customFieldName = JsonNullable.<String>of(customFieldName);
  }


  /**
   * Return true if this HeadlineFormatConfigDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeadlineFormatConfigDto headlineFormatConfigDto = (HeadlineFormatConfigDto) o;
    return equalsNullable(this.name, headlineFormatConfigDto.name) &&
        equalsNullable(this.customString, headlineFormatConfigDto.customString) &&
        equalsNullable(this.customFieldName, headlineFormatConfigDto.customFieldName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(customString), hashCodeNullable(customFieldName));
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
    sb.append("class HeadlineFormatConfigDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customString: ").append(toIndentedString(customString)).append("\n");
    sb.append("    customFieldName: ").append(toIndentedString(customFieldName)).append("\n");
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

