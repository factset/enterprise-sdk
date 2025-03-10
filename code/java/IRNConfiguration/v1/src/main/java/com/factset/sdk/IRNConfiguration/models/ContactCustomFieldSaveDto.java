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
import com.factset.sdk.IRNConfiguration.models.ContactCustomFieldFormulaDto;
import com.factset.sdk.IRNConfiguration.models.ContactCustomFieldOptionSaveDto;
import com.factset.sdk.IRNConfiguration.models.ContactCustomFieldType;
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
 * ContactCustomFieldSaveDto
 */
@JsonPropertyOrder({
  ContactCustomFieldSaveDto.JSON_PROPERTY_CODE,
  ContactCustomFieldSaveDto.JSON_PROPERTY_NAME,
  ContactCustomFieldSaveDto.JSON_PROPERTY_TYPE,
  ContactCustomFieldSaveDto.JSON_PROPERTY_IS_HIDDEN,
  ContactCustomFieldSaveDto.JSON_PROPERTY_IS_MANDATORY,
  ContactCustomFieldSaveDto.JSON_PROPERTY_FIELD_FORMULA,
  ContactCustomFieldSaveDto.JSON_PROPERTY_CONTACT_CUSTOM_FIELD_OPTIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ContactCustomFieldSaveDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ContactCustomFieldType type;

  public static final String JSON_PROPERTY_IS_HIDDEN = "isHidden";
  private Boolean isHidden = false;

  public static final String JSON_PROPERTY_IS_MANDATORY = "isMandatory";
  private Boolean isMandatory = false;

  public static final String JSON_PROPERTY_FIELD_FORMULA = "fieldFormula";
  private JsonNullable<ContactCustomFieldFormulaDto> fieldFormula = JsonNullable.<ContactCustomFieldFormulaDto>undefined();

  public static final String JSON_PROPERTY_CONTACT_CUSTOM_FIELD_OPTIONS = "contactCustomFieldOptions";
  private JsonNullable<java.util.List<ContactCustomFieldOptionSaveDto>> contactCustomFieldOptions = JsonNullable.<java.util.List<ContactCustomFieldOptionSaveDto>>undefined();

  public ContactCustomFieldSaveDto() { 
  }

  @JsonCreator
  public ContactCustomFieldSaveDto(
    @JsonProperty(value=JSON_PROPERTY_CODE, required=true) String code, 
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) String name, 
    @JsonProperty(value=JSON_PROPERTY_TYPE, required=true) ContactCustomFieldType type, 
    @JsonProperty(value=JSON_PROPERTY_IS_HIDDEN, required=true) Boolean isHidden, 
    @JsonProperty(value=JSON_PROPERTY_IS_MANDATORY, required=true) Boolean isMandatory
  ) {
    this();
    this.code = code;
    this.name = name;
    this.type = type;
    this.isHidden = isHidden;
    this.isMandatory = isMandatory;
  }

  public ContactCustomFieldSaveDto code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public ContactCustomFieldSaveDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ContactCustomFieldSaveDto type(ContactCustomFieldType type) {
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

  public ContactCustomFieldType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(ContactCustomFieldType type) {
    this.type = type;
  }


  public ContactCustomFieldSaveDto isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsHidden() {
    return isHidden;
  }


  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public ContactCustomFieldSaveDto isMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
    return this;
  }

   /**
   * Get isMandatory
   * @return isMandatory
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsMandatory() {
    return isMandatory;
  }


  @JsonProperty(JSON_PROPERTY_IS_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }


  public ContactCustomFieldSaveDto fieldFormula(ContactCustomFieldFormulaDto fieldFormula) {
    this.fieldFormula = JsonNullable.<ContactCustomFieldFormulaDto>of(fieldFormula);
    return this;
  }

   /**
   * Get fieldFormula
   * @return fieldFormula
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public ContactCustomFieldFormulaDto getFieldFormula() {
        return fieldFormula.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIELD_FORMULA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ContactCustomFieldFormulaDto> getFieldFormula_JsonNullable() {
    return fieldFormula;
  }
  
  @JsonProperty(JSON_PROPERTY_FIELD_FORMULA)
  public void setFieldFormula_JsonNullable(JsonNullable<ContactCustomFieldFormulaDto> fieldFormula) {
    this.fieldFormula = fieldFormula;
  }

  public void setFieldFormula(ContactCustomFieldFormulaDto fieldFormula) {
    this.fieldFormula = JsonNullable.<ContactCustomFieldFormulaDto>of(fieldFormula);
  }


  public ContactCustomFieldSaveDto contactCustomFieldOptions(java.util.List<ContactCustomFieldOptionSaveDto> contactCustomFieldOptions) {
    this.contactCustomFieldOptions = JsonNullable.<java.util.List<ContactCustomFieldOptionSaveDto>>of(contactCustomFieldOptions);
    return this;
  }

  public ContactCustomFieldSaveDto addContactCustomFieldOptionsItem(ContactCustomFieldOptionSaveDto contactCustomFieldOptionsItem) {
    if (this.contactCustomFieldOptions == null || !this.contactCustomFieldOptions.isPresent()) {
      this.contactCustomFieldOptions = JsonNullable.<java.util.List<ContactCustomFieldOptionSaveDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.contactCustomFieldOptions.get().add(contactCustomFieldOptionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get contactCustomFieldOptions
   * @return contactCustomFieldOptions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<ContactCustomFieldOptionSaveDto> getContactCustomFieldOptions() {
        return contactCustomFieldOptions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTACT_CUSTOM_FIELD_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<ContactCustomFieldOptionSaveDto>> getContactCustomFieldOptions_JsonNullable() {
    return contactCustomFieldOptions;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTACT_CUSTOM_FIELD_OPTIONS)
  public void setContactCustomFieldOptions_JsonNullable(JsonNullable<java.util.List<ContactCustomFieldOptionSaveDto>> contactCustomFieldOptions) {
    this.contactCustomFieldOptions = contactCustomFieldOptions;
  }

  public void setContactCustomFieldOptions(java.util.List<ContactCustomFieldOptionSaveDto> contactCustomFieldOptions) {
    this.contactCustomFieldOptions = JsonNullable.<java.util.List<ContactCustomFieldOptionSaveDto>>of(contactCustomFieldOptions);
  }


  /**
   * Return true if this ContactCustomFieldSaveDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactCustomFieldSaveDto contactCustomFieldSaveDto = (ContactCustomFieldSaveDto) o;
    return Objects.equals(this.code, contactCustomFieldSaveDto.code) &&
        Objects.equals(this.name, contactCustomFieldSaveDto.name) &&
        Objects.equals(this.type, contactCustomFieldSaveDto.type) &&
        Objects.equals(this.isHidden, contactCustomFieldSaveDto.isHidden) &&
        Objects.equals(this.isMandatory, contactCustomFieldSaveDto.isMandatory) &&
        equalsNullable(this.fieldFormula, contactCustomFieldSaveDto.fieldFormula) &&
        equalsNullable(this.contactCustomFieldOptions, contactCustomFieldSaveDto.contactCustomFieldOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, type, isHidden, isMandatory, hashCodeNullable(fieldFormula), hashCodeNullable(contactCustomFieldOptions));
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
    sb.append("class ContactCustomFieldSaveDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    fieldFormula: ").append(toIndentedString(fieldFormula)).append("\n");
    sb.append("    contactCustomFieldOptions: ").append(toIndentedString(contactCustomFieldOptions)).append("\n");
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

