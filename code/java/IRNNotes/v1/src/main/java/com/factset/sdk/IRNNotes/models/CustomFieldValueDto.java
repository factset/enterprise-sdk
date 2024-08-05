/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNNotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNNotes.models.UserTeamLookupDto;
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
import com.factset.sdk.IRNNotes.JSON;


/**
 * CustomFieldValueDto
 */
@JsonPropertyOrder({
  CustomFieldValueDto.JSON_PROPERTY_CODE,
  CustomFieldValueDto.JSON_PROPERTY_VALUE,
  CustomFieldValueDto.JSON_PROPERTY_OPTIONS,
  CustomFieldValueDto.JSON_PROPERTY_CONTACT_VALUES,
  CustomFieldValueDto.JSON_PROPERTY_USER_TEAM_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomFieldValueDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<String> value = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private JsonNullable<java.util.List<String>> options = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_CONTACT_VALUES = "contactValues";
  private JsonNullable<java.util.List<java.util.UUID>> contactValues = JsonNullable.<java.util.List<java.util.UUID>>undefined();

  public static final String JSON_PROPERTY_USER_TEAM_VALUES = "userTeamValues";
  private JsonNullable<UserTeamLookupDto> userTeamValues = JsonNullable.<UserTeamLookupDto>undefined();

  public CustomFieldValueDto() { 
  }

  public CustomFieldValueDto code(String code) {
    this.code = JsonNullable.<String>of(code);
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(String code) {
    this.code = JsonNullable.<String>of(code);
  }


  public CustomFieldValueDto value(String value) {
    this.value = JsonNullable.<String>of(value);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getValue() {
        return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getValue_JsonNullable() {
    return value;
  }
  
  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<String> value) {
    this.value = value;
  }

  public void setValue(String value) {
    this.value = JsonNullable.<String>of(value);
  }


  public CustomFieldValueDto options(java.util.List<String> options) {
    this.options = JsonNullable.<java.util.List<String>>of(options);
    return this;
  }

  public CustomFieldValueDto addOptionsItem(String optionsItem) {
    if (this.options == null || !this.options.isPresent()) {
      this.options = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.options.get().add(optionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getOptions() {
        return options.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getOptions_JsonNullable() {
    return options;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  public void setOptions_JsonNullable(JsonNullable<java.util.List<String>> options) {
    this.options = options;
  }

  public void setOptions(java.util.List<String> options) {
    this.options = JsonNullable.<java.util.List<String>>of(options);
  }


  public CustomFieldValueDto contactValues(java.util.List<java.util.UUID> contactValues) {
    this.contactValues = JsonNullable.<java.util.List<java.util.UUID>>of(contactValues);
    return this;
  }

  public CustomFieldValueDto addContactValuesItem(java.util.UUID contactValuesItem) {
    if (this.contactValues == null || !this.contactValues.isPresent()) {
      this.contactValues = JsonNullable.<java.util.List<java.util.UUID>>of(new java.util.ArrayList<>());
    }
    try {
      this.contactValues.get().add(contactValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get contactValues
   * @return contactValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<java.util.UUID> getContactValues() {
        return contactValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTACT_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<java.util.UUID>> getContactValues_JsonNullable() {
    return contactValues;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTACT_VALUES)
  public void setContactValues_JsonNullable(JsonNullable<java.util.List<java.util.UUID>> contactValues) {
    this.contactValues = contactValues;
  }

  public void setContactValues(java.util.List<java.util.UUID> contactValues) {
    this.contactValues = JsonNullable.<java.util.List<java.util.UUID>>of(contactValues);
  }


  public CustomFieldValueDto userTeamValues(UserTeamLookupDto userTeamValues) {
    this.userTeamValues = JsonNullable.<UserTeamLookupDto>of(userTeamValues);
    return this;
  }

   /**
   * Get userTeamValues
   * @return userTeamValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UserTeamLookupDto getUserTeamValues() {
        return userTeamValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_TEAM_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UserTeamLookupDto> getUserTeamValues_JsonNullable() {
    return userTeamValues;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_TEAM_VALUES)
  public void setUserTeamValues_JsonNullable(JsonNullable<UserTeamLookupDto> userTeamValues) {
    this.userTeamValues = userTeamValues;
  }

  public void setUserTeamValues(UserTeamLookupDto userTeamValues) {
    this.userTeamValues = JsonNullable.<UserTeamLookupDto>of(userTeamValues);
  }


  /**
   * Return true if this CustomFieldValueDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldValueDto customFieldValueDto = (CustomFieldValueDto) o;
    return equalsNullable(this.code, customFieldValueDto.code) &&
        equalsNullable(this.value, customFieldValueDto.value) &&
        equalsNullable(this.options, customFieldValueDto.options) &&
        equalsNullable(this.contactValues, customFieldValueDto.contactValues) &&
        equalsNullable(this.userTeamValues, customFieldValueDto.userTeamValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(code), hashCodeNullable(value), hashCodeNullable(options), hashCodeNullable(contactValues), hashCodeNullable(userTeamValues));
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
    sb.append("class CustomFieldValueDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    contactValues: ").append(toIndentedString(contactValues)).append("\n");
    sb.append("    userTeamValues: ").append(toIndentedString(userTeamValues)).append("\n");
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

