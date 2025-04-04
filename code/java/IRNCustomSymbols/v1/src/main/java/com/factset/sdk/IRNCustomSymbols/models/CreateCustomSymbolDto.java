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
import com.factset.sdk.IRNCustomSymbols.models.CreateCustomSymbolCustomFieldValueDto;
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
 * CreateCustomSymbolDto
 */
@JsonPropertyOrder({
  CreateCustomSymbolDto.JSON_PROPERTY_CODE,
  CreateCustomSymbolDto.JSON_PROPERTY_NAME,
  CreateCustomSymbolDto.JSON_PROPERTY_DESCRIPTION,
  CreateCustomSymbolDto.JSON_PROPERTY_TYPE_ID,
  CreateCustomSymbolDto.JSON_PROPERTY_SUB_TYPE_ID,
  CreateCustomSymbolDto.JSON_PROPERTY_GOOGLE_MAPS_PLACE_ID,
  CreateCustomSymbolDto.JSON_PROPERTY_FORMATTED_ADDRESS,
  CreateCustomSymbolDto.JSON_PROPERTY_CITY,
  CreateCustomSymbolDto.JSON_PROPERTY_STATE_PROVINCE,
  CreateCustomSymbolDto.JSON_PROPERTY_POSTAL_CODE,
  CreateCustomSymbolDto.JSON_PROPERTY_COUNTRY,
  CreateCustomSymbolDto.JSON_PROPERTY_CUSTOM_FIELD_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CreateCustomSymbolDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE_ID = "typeId";
  private java.util.UUID typeId;

  public static final String JSON_PROPERTY_SUB_TYPE_ID = "subTypeId";
  private java.util.UUID subTypeId;

  public static final String JSON_PROPERTY_GOOGLE_MAPS_PLACE_ID = "googleMapsPlaceId";
  private JsonNullable<String> googleMapsPlaceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FORMATTED_ADDRESS = "formattedAddress";
  private JsonNullable<String> formattedAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CITY = "city";
  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE_PROVINCE = "stateProvince";
  private JsonNullable<String> stateProvince = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private JsonNullable<String> postalCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private JsonNullable<String> country = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FIELD_VALUES = "customFieldValues";
  private JsonNullable<java.util.List<CreateCustomSymbolCustomFieldValueDto>> customFieldValues = JsonNullable.<java.util.List<CreateCustomSymbolCustomFieldValueDto>>undefined();

  public CreateCustomSymbolDto() { 
  }

  public CreateCustomSymbolDto code(String code) {
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


  public CreateCustomSymbolDto name(String name) {
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


  public CreateCustomSymbolDto description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public CreateCustomSymbolDto typeId(java.util.UUID typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getTypeId() {
    return typeId;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeId(java.util.UUID typeId) {
    this.typeId = typeId;
  }


  public CreateCustomSymbolDto subTypeId(java.util.UUID subTypeId) {
    this.subTypeId = subTypeId;
    return this;
  }

   /**
   * Get subTypeId
   * @return subTypeId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getSubTypeId() {
    return subTypeId;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubTypeId(java.util.UUID subTypeId) {
    this.subTypeId = subTypeId;
  }


  public CreateCustomSymbolDto googleMapsPlaceId(String googleMapsPlaceId) {
    this.googleMapsPlaceId = JsonNullable.<String>of(googleMapsPlaceId);
    return this;
  }

   /**
   * Get googleMapsPlaceId
   * @return googleMapsPlaceId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getGoogleMapsPlaceId() {
        return googleMapsPlaceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GOOGLE_MAPS_PLACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGoogleMapsPlaceId_JsonNullable() {
    return googleMapsPlaceId;
  }
  
  @JsonProperty(JSON_PROPERTY_GOOGLE_MAPS_PLACE_ID)
  public void setGoogleMapsPlaceId_JsonNullable(JsonNullable<String> googleMapsPlaceId) {
    this.googleMapsPlaceId = googleMapsPlaceId;
  }

  public void setGoogleMapsPlaceId(String googleMapsPlaceId) {
    this.googleMapsPlaceId = JsonNullable.<String>of(googleMapsPlaceId);
  }


  public CreateCustomSymbolDto formattedAddress(String formattedAddress) {
    this.formattedAddress = JsonNullable.<String>of(formattedAddress);
    return this;
  }

   /**
   * Get formattedAddress
   * @return formattedAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFormattedAddress() {
        return formattedAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORMATTED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFormattedAddress_JsonNullable() {
    return formattedAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMATTED_ADDRESS)
  public void setFormattedAddress_JsonNullable(JsonNullable<String> formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = JsonNullable.<String>of(formattedAddress);
  }


  public CreateCustomSymbolDto city(String city) {
    this.city = JsonNullable.<String>of(city);
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCity() {
        return city.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCity_JsonNullable() {
    return city;
  }
  
  @JsonProperty(JSON_PROPERTY_CITY)
  public void setCity_JsonNullable(JsonNullable<String> city) {
    this.city = city;
  }

  public void setCity(String city) {
    this.city = JsonNullable.<String>of(city);
  }


  public CreateCustomSymbolDto stateProvince(String stateProvince) {
    this.stateProvince = JsonNullable.<String>of(stateProvince);
    return this;
  }

   /**
   * Get stateProvince
   * @return stateProvince
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getStateProvince() {
        return stateProvince.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStateProvince_JsonNullable() {
    return stateProvince;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE_PROVINCE)
  public void setStateProvince_JsonNullable(JsonNullable<String> stateProvince) {
    this.stateProvince = stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = JsonNullable.<String>of(stateProvince);
  }


  public CreateCustomSymbolDto postalCode(String postalCode) {
    this.postalCode = JsonNullable.<String>of(postalCode);
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getPostalCode() {
        return postalCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPostalCode_JsonNullable() {
    return postalCode;
  }
  
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  public void setPostalCode_JsonNullable(JsonNullable<String> postalCode) {
    this.postalCode = postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = JsonNullable.<String>of(postalCode);
  }


  public CreateCustomSymbolDto country(String country) {
    this.country = JsonNullable.<String>of(country);
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCountry() {
        return country.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCountry_JsonNullable() {
    return country;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  public void setCountry_JsonNullable(JsonNullable<String> country) {
    this.country = country;
  }

  public void setCountry(String country) {
    this.country = JsonNullable.<String>of(country);
  }


  public CreateCustomSymbolDto customFieldValues(java.util.List<CreateCustomSymbolCustomFieldValueDto> customFieldValues) {
    this.customFieldValues = JsonNullable.<java.util.List<CreateCustomSymbolCustomFieldValueDto>>of(customFieldValues);
    return this;
  }

  public CreateCustomSymbolDto addCustomFieldValuesItem(CreateCustomSymbolCustomFieldValueDto customFieldValuesItem) {
    if (this.customFieldValues == null || !this.customFieldValues.isPresent()) {
      this.customFieldValues = JsonNullable.<java.util.List<CreateCustomSymbolCustomFieldValueDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.customFieldValues.get().add(customFieldValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customFieldValues
   * @return customFieldValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<CreateCustomSymbolCustomFieldValueDto> getCustomFieldValues() {
        return customFieldValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<CreateCustomSymbolCustomFieldValueDto>> getCustomFieldValues_JsonNullable() {
    return customFieldValues;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_VALUES)
  public void setCustomFieldValues_JsonNullable(JsonNullable<java.util.List<CreateCustomSymbolCustomFieldValueDto>> customFieldValues) {
    this.customFieldValues = customFieldValues;
  }

  public void setCustomFieldValues(java.util.List<CreateCustomSymbolCustomFieldValueDto> customFieldValues) {
    this.customFieldValues = JsonNullable.<java.util.List<CreateCustomSymbolCustomFieldValueDto>>of(customFieldValues);
  }


  /**
   * Return true if this CreateCustomSymbolDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomSymbolDto createCustomSymbolDto = (CreateCustomSymbolDto) o;
    return equalsNullable(this.code, createCustomSymbolDto.code) &&
        equalsNullable(this.name, createCustomSymbolDto.name) &&
        equalsNullable(this.description, createCustomSymbolDto.description) &&
        Objects.equals(this.typeId, createCustomSymbolDto.typeId) &&
        Objects.equals(this.subTypeId, createCustomSymbolDto.subTypeId) &&
        equalsNullable(this.googleMapsPlaceId, createCustomSymbolDto.googleMapsPlaceId) &&
        equalsNullable(this.formattedAddress, createCustomSymbolDto.formattedAddress) &&
        equalsNullable(this.city, createCustomSymbolDto.city) &&
        equalsNullable(this.stateProvince, createCustomSymbolDto.stateProvince) &&
        equalsNullable(this.postalCode, createCustomSymbolDto.postalCode) &&
        equalsNullable(this.country, createCustomSymbolDto.country) &&
        equalsNullable(this.customFieldValues, createCustomSymbolDto.customFieldValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(code), hashCodeNullable(name), hashCodeNullable(description), typeId, subTypeId, hashCodeNullable(googleMapsPlaceId), hashCodeNullable(formattedAddress), hashCodeNullable(city), hashCodeNullable(stateProvince), hashCodeNullable(postalCode), hashCodeNullable(country), hashCodeNullable(customFieldValues));
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
    sb.append("class CreateCustomSymbolDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    subTypeId: ").append(toIndentedString(subTypeId)).append("\n");
    sb.append("    googleMapsPlaceId: ").append(toIndentedString(googleMapsPlaceId)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    customFieldValues: ").append(toIndentedString(customFieldValues)).append("\n");
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

