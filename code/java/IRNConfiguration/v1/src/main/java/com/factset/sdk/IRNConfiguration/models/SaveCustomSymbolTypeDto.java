/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
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
import com.factset.sdk.IRNConfiguration.models.EntityType;
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
 * SaveCustomSymbolTypeDto
 */
@JsonPropertyOrder({
  SaveCustomSymbolTypeDto.JSON_PROPERTY_NAME,
  SaveCustomSymbolTypeDto.JSON_PROPERTY_HIDE_ADDRESS_FIELD,
  SaveCustomSymbolTypeDto.JSON_PROPERTY_HIDE_SYMBOL_SUBTYPE,
  SaveCustomSymbolTypeDto.JSON_PROPERTY_IS_DEFAULT,
  SaveCustomSymbolTypeDto.JSON_PROPERTY_DUE_DILIGENCE_SYMBOL_ENTITY_TYPE,
  SaveCustomSymbolTypeDto.JSON_PROPERTY_SUB_TYPES,
  SaveCustomSymbolTypeDto.JSON_PROPERTY_CUSTOM_FIELD_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SaveCustomSymbolTypeDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_HIDE_ADDRESS_FIELD = "hideAddressField";
  private Boolean hideAddressField;

  public static final String JSON_PROPERTY_HIDE_SYMBOL_SUBTYPE = "hideSymbolSubtype";
  private Boolean hideSymbolSubtype;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault = false;

  public static final String JSON_PROPERTY_DUE_DILIGENCE_SYMBOL_ENTITY_TYPE = "dueDiligenceSymbolEntityType";
  private EntityType dueDiligenceSymbolEntityType;

  public static final String JSON_PROPERTY_SUB_TYPES = "subTypes";
  private JsonNullable<java.util.List<String>> subTypes = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FIELD_IDS = "customFieldIds";
  private JsonNullable<java.util.List<java.util.UUID>> customFieldIds = JsonNullable.<java.util.List<java.util.UUID>>undefined();

  public SaveCustomSymbolTypeDto() { 
  }

  @JsonCreator
  public SaveCustomSymbolTypeDto(
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) String name
  ) {
    this();
    this.name = name;
  }

  public SaveCustomSymbolTypeDto name(String name) {
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


  public SaveCustomSymbolTypeDto hideAddressField(Boolean hideAddressField) {
    this.hideAddressField = hideAddressField;
    return this;
  }

   /**
   * Get hideAddressField
   * @return hideAddressField
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIDE_ADDRESS_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideAddressField() {
    return hideAddressField;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_ADDRESS_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideAddressField(Boolean hideAddressField) {
    this.hideAddressField = hideAddressField;
  }


  public SaveCustomSymbolTypeDto hideSymbolSubtype(Boolean hideSymbolSubtype) {
    this.hideSymbolSubtype = hideSymbolSubtype;
    return this;
  }

   /**
   * Get hideSymbolSubtype
   * @return hideSymbolSubtype
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIDE_SYMBOL_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideSymbolSubtype() {
    return hideSymbolSubtype;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_SYMBOL_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideSymbolSubtype(Boolean hideSymbolSubtype) {
    this.hideSymbolSubtype = hideSymbolSubtype;
  }


  public SaveCustomSymbolTypeDto isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public SaveCustomSymbolTypeDto dueDiligenceSymbolEntityType(EntityType dueDiligenceSymbolEntityType) {
    this.dueDiligenceSymbolEntityType = dueDiligenceSymbolEntityType;
    return this;
  }

   /**
   * Get dueDiligenceSymbolEntityType
   * @return dueDiligenceSymbolEntityType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DUE_DILIGENCE_SYMBOL_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityType getDueDiligenceSymbolEntityType() {
    return dueDiligenceSymbolEntityType;
  }


  @JsonProperty(JSON_PROPERTY_DUE_DILIGENCE_SYMBOL_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueDiligenceSymbolEntityType(EntityType dueDiligenceSymbolEntityType) {
    this.dueDiligenceSymbolEntityType = dueDiligenceSymbolEntityType;
  }


  public SaveCustomSymbolTypeDto subTypes(java.util.List<String> subTypes) {
    this.subTypes = JsonNullable.<java.util.List<String>>of(subTypes);
    return this;
  }

  public SaveCustomSymbolTypeDto addSubTypesItem(String subTypesItem) {
    if (this.subTypes == null || !this.subTypes.isPresent()) {
      this.subTypes = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.subTypes.get().add(subTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get subTypes
   * @return subTypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getSubTypes() {
        return subTypes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUB_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getSubTypes_JsonNullable() {
    return subTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_SUB_TYPES)
  public void setSubTypes_JsonNullable(JsonNullable<java.util.List<String>> subTypes) {
    this.subTypes = subTypes;
  }

  public void setSubTypes(java.util.List<String> subTypes) {
    this.subTypes = JsonNullable.<java.util.List<String>>of(subTypes);
  }


  public SaveCustomSymbolTypeDto customFieldIds(java.util.List<java.util.UUID> customFieldIds) {
    this.customFieldIds = JsonNullable.<java.util.List<java.util.UUID>>of(customFieldIds);
    return this;
  }

  public SaveCustomSymbolTypeDto addCustomFieldIdsItem(java.util.UUID customFieldIdsItem) {
    if (this.customFieldIds == null || !this.customFieldIds.isPresent()) {
      this.customFieldIds = JsonNullable.<java.util.List<java.util.UUID>>of(new java.util.ArrayList<>());
    }
    try {
      this.customFieldIds.get().add(customFieldIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customFieldIds
   * @return customFieldIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<java.util.UUID> getCustomFieldIds() {
        return customFieldIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<java.util.UUID>> getCustomFieldIds_JsonNullable() {
    return customFieldIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_IDS)
  public void setCustomFieldIds_JsonNullable(JsonNullable<java.util.List<java.util.UUID>> customFieldIds) {
    this.customFieldIds = customFieldIds;
  }

  public void setCustomFieldIds(java.util.List<java.util.UUID> customFieldIds) {
    this.customFieldIds = JsonNullable.<java.util.List<java.util.UUID>>of(customFieldIds);
  }


  /**
   * Return true if this SaveCustomSymbolTypeDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveCustomSymbolTypeDto saveCustomSymbolTypeDto = (SaveCustomSymbolTypeDto) o;
    return Objects.equals(this.name, saveCustomSymbolTypeDto.name) &&
        Objects.equals(this.hideAddressField, saveCustomSymbolTypeDto.hideAddressField) &&
        Objects.equals(this.hideSymbolSubtype, saveCustomSymbolTypeDto.hideSymbolSubtype) &&
        Objects.equals(this.isDefault, saveCustomSymbolTypeDto.isDefault) &&
        Objects.equals(this.dueDiligenceSymbolEntityType, saveCustomSymbolTypeDto.dueDiligenceSymbolEntityType) &&
        equalsNullable(this.subTypes, saveCustomSymbolTypeDto.subTypes) &&
        equalsNullable(this.customFieldIds, saveCustomSymbolTypeDto.customFieldIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hideAddressField, hideSymbolSubtype, isDefault, dueDiligenceSymbolEntityType, hashCodeNullable(subTypes), hashCodeNullable(customFieldIds));
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
    sb.append("class SaveCustomSymbolTypeDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hideAddressField: ").append(toIndentedString(hideAddressField)).append("\n");
    sb.append("    hideSymbolSubtype: ").append(toIndentedString(hideSymbolSubtype)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    dueDiligenceSymbolEntityType: ").append(toIndentedString(dueDiligenceSymbolEntityType)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
    sb.append("    customFieldIds: ").append(toIndentedString(customFieldIds)).append("\n");
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

