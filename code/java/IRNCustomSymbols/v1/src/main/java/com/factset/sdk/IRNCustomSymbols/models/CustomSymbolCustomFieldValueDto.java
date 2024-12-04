/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNCustomSymbols.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNCustomSymbols.models.CustomSymbolContact;
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
import com.factset.sdk.IRNCustomSymbols.JSON;


/**
 * CustomSymbolCustomFieldValueDto
 */
@JsonPropertyOrder({
  CustomSymbolCustomFieldValueDto.JSON_PROPERTY_CODE,
  CustomSymbolCustomFieldValueDto.JSON_PROPERTY_VALUE,
  CustomSymbolCustomFieldValueDto.JSON_PROPERTY_OPTION_VALUES,
  CustomSymbolCustomFieldValueDto.JSON_PROPERTY_CONTACTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomSymbolCustomFieldValueDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<String> value = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPTION_VALUES = "optionValues";
  private JsonNullable<java.util.List<String>> optionValues = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  private JsonNullable<java.util.List<CustomSymbolContact>> contacts = JsonNullable.<java.util.List<CustomSymbolContact>>undefined();

  public CustomSymbolCustomFieldValueDto() { 
  }

  public CustomSymbolCustomFieldValueDto code(String code) {
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


  public CustomSymbolCustomFieldValueDto value(String value) {
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


  public CustomSymbolCustomFieldValueDto optionValues(java.util.List<String> optionValues) {
    this.optionValues = JsonNullable.<java.util.List<String>>of(optionValues);
    return this;
  }

  public CustomSymbolCustomFieldValueDto addOptionValuesItem(String optionValuesItem) {
    if (this.optionValues == null || !this.optionValues.isPresent()) {
      this.optionValues = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.optionValues.get().add(optionValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get optionValues
   * @return optionValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getOptionValues() {
        return optionValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPTION_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getOptionValues_JsonNullable() {
    return optionValues;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTION_VALUES)
  public void setOptionValues_JsonNullable(JsonNullable<java.util.List<String>> optionValues) {
    this.optionValues = optionValues;
  }

  public void setOptionValues(java.util.List<String> optionValues) {
    this.optionValues = JsonNullable.<java.util.List<String>>of(optionValues);
  }


  public CustomSymbolCustomFieldValueDto contacts(java.util.List<CustomSymbolContact> contacts) {
    this.contacts = JsonNullable.<java.util.List<CustomSymbolContact>>of(contacts);
    return this;
  }

  public CustomSymbolCustomFieldValueDto addContactsItem(CustomSymbolContact contactsItem) {
    if (this.contacts == null || !this.contacts.isPresent()) {
      this.contacts = JsonNullable.<java.util.List<CustomSymbolContact>>of(new java.util.ArrayList<>());
    }
    try {
      this.contacts.get().add(contactsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<CustomSymbolContact> getContacts() {
        return contacts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<CustomSymbolContact>> getContacts_JsonNullable() {
    return contacts;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTACTS)
  public void setContacts_JsonNullable(JsonNullable<java.util.List<CustomSymbolContact>> contacts) {
    this.contacts = contacts;
  }

  public void setContacts(java.util.List<CustomSymbolContact> contacts) {
    this.contacts = JsonNullable.<java.util.List<CustomSymbolContact>>of(contacts);
  }


  /**
   * Return true if this CustomSymbolCustomFieldValueDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSymbolCustomFieldValueDto customSymbolCustomFieldValueDto = (CustomSymbolCustomFieldValueDto) o;
    return equalsNullable(this.code, customSymbolCustomFieldValueDto.code) &&
        equalsNullable(this.value, customSymbolCustomFieldValueDto.value) &&
        equalsNullable(this.optionValues, customSymbolCustomFieldValueDto.optionValues) &&
        equalsNullable(this.contacts, customSymbolCustomFieldValueDto.contacts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(code), hashCodeNullable(value), hashCodeNullable(optionValues), hashCodeNullable(contacts));
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
    sb.append("class CustomSymbolCustomFieldValueDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    optionValues: ").append(toIndentedString(optionValues)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

