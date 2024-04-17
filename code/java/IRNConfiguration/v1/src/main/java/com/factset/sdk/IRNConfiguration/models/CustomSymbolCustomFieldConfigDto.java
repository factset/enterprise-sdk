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
import com.factset.sdk.IRNConfiguration.models.CustomSymbolCustomFieldFormulaConfigDto;
import com.factset.sdk.IRNConfiguration.models.CustomSymbolTypeSummaryDto;
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
 * CustomSymbolCustomFieldConfigDto
 */
@JsonPropertyOrder({
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_ID,
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_CODE,
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_NAME,
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_TYPE,
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_IS_HIDDEN,
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_IS_MANDATORY,
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_IS_SHOWN_IN_INFOBOX,
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_FORMULA_CONFIG,
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_OPTIONS_CONFIG,
  CustomSymbolCustomFieldConfigDto.JSON_PROPERTY_CUSTOM_SYMBOL_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomSymbolCustomFieldConfigDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_HIDDEN = "isHidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_IS_MANDATORY = "isMandatory";
  private Boolean isMandatory;

  public static final String JSON_PROPERTY_IS_SHOWN_IN_INFOBOX = "isShownInInfobox";
  private Boolean isShownInInfobox;

  public static final String JSON_PROPERTY_FORMULA_CONFIG = "formulaConfig";
  private CustomSymbolCustomFieldFormulaConfigDto formulaConfig;

  public static final String JSON_PROPERTY_OPTIONS_CONFIG = "optionsConfig";
  private JsonNullable<java.util.List<String>> optionsConfig = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_CUSTOM_SYMBOL_TYPES = "customSymbolTypes";
  private JsonNullable<java.util.List<CustomSymbolTypeSummaryDto>> customSymbolTypes = JsonNullable.<java.util.List<CustomSymbolTypeSummaryDto>>undefined();

  public CustomSymbolCustomFieldConfigDto() { 
  }

  public CustomSymbolCustomFieldConfigDto id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  public CustomSymbolCustomFieldConfigDto code(String code) {
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


  public CustomSymbolCustomFieldConfigDto name(String name) {
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


  public CustomSymbolCustomFieldConfigDto type(String type) {
    this.type = JsonNullable.<String>of(type);
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
  }


  public CustomSymbolCustomFieldConfigDto isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsHidden() {
    return isHidden;
  }


  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public CustomSymbolCustomFieldConfigDto isMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
    return this;
  }

   /**
   * Get isMandatory
   * @return isMandatory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMandatory() {
    return isMandatory;
  }


  @JsonProperty(JSON_PROPERTY_IS_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }


  public CustomSymbolCustomFieldConfigDto isShownInInfobox(Boolean isShownInInfobox) {
    this.isShownInInfobox = isShownInInfobox;
    return this;
  }

   /**
   * Get isShownInInfobox
   * @return isShownInInfobox
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_SHOWN_IN_INFOBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsShownInInfobox() {
    return isShownInInfobox;
  }


  @JsonProperty(JSON_PROPERTY_IS_SHOWN_IN_INFOBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsShownInInfobox(Boolean isShownInInfobox) {
    this.isShownInInfobox = isShownInInfobox;
  }


  public CustomSymbolCustomFieldConfigDto formulaConfig(CustomSymbolCustomFieldFormulaConfigDto formulaConfig) {
    this.formulaConfig = formulaConfig;
    return this;
  }

   /**
   * Get formulaConfig
   * @return formulaConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMULA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomSymbolCustomFieldFormulaConfigDto getFormulaConfig() {
    return formulaConfig;
  }


  @JsonProperty(JSON_PROPERTY_FORMULA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormulaConfig(CustomSymbolCustomFieldFormulaConfigDto formulaConfig) {
    this.formulaConfig = formulaConfig;
  }


  public CustomSymbolCustomFieldConfigDto optionsConfig(java.util.List<String> optionsConfig) {
    this.optionsConfig = JsonNullable.<java.util.List<String>>of(optionsConfig);
    return this;
  }

  public CustomSymbolCustomFieldConfigDto addOptionsConfigItem(String optionsConfigItem) {
    if (this.optionsConfig == null || !this.optionsConfig.isPresent()) {
      this.optionsConfig = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.optionsConfig.get().add(optionsConfigItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get optionsConfig
   * @return optionsConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getOptionsConfig() {
        return optionsConfig.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPTIONS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getOptionsConfig_JsonNullable() {
    return optionsConfig;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONS_CONFIG)
  public void setOptionsConfig_JsonNullable(JsonNullable<java.util.List<String>> optionsConfig) {
    this.optionsConfig = optionsConfig;
  }

  public void setOptionsConfig(java.util.List<String> optionsConfig) {
    this.optionsConfig = JsonNullable.<java.util.List<String>>of(optionsConfig);
  }


  public CustomSymbolCustomFieldConfigDto customSymbolTypes(java.util.List<CustomSymbolTypeSummaryDto> customSymbolTypes) {
    this.customSymbolTypes = JsonNullable.<java.util.List<CustomSymbolTypeSummaryDto>>of(customSymbolTypes);
    return this;
  }

  public CustomSymbolCustomFieldConfigDto addCustomSymbolTypesItem(CustomSymbolTypeSummaryDto customSymbolTypesItem) {
    if (this.customSymbolTypes == null || !this.customSymbolTypes.isPresent()) {
      this.customSymbolTypes = JsonNullable.<java.util.List<CustomSymbolTypeSummaryDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.customSymbolTypes.get().add(customSymbolTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customSymbolTypes
   * @return customSymbolTypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<CustomSymbolTypeSummaryDto> getCustomSymbolTypes() {
        return customSymbolTypes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_SYMBOL_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<CustomSymbolTypeSummaryDto>> getCustomSymbolTypes_JsonNullable() {
    return customSymbolTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_SYMBOL_TYPES)
  public void setCustomSymbolTypes_JsonNullable(JsonNullable<java.util.List<CustomSymbolTypeSummaryDto>> customSymbolTypes) {
    this.customSymbolTypes = customSymbolTypes;
  }

  public void setCustomSymbolTypes(java.util.List<CustomSymbolTypeSummaryDto> customSymbolTypes) {
    this.customSymbolTypes = JsonNullable.<java.util.List<CustomSymbolTypeSummaryDto>>of(customSymbolTypes);
  }


  /**
   * Return true if this CustomSymbolCustomFieldConfigDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSymbolCustomFieldConfigDto customSymbolCustomFieldConfigDto = (CustomSymbolCustomFieldConfigDto) o;
    return Objects.equals(this.id, customSymbolCustomFieldConfigDto.id) &&
        equalsNullable(this.code, customSymbolCustomFieldConfigDto.code) &&
        equalsNullable(this.name, customSymbolCustomFieldConfigDto.name) &&
        equalsNullable(this.type, customSymbolCustomFieldConfigDto.type) &&
        Objects.equals(this.isHidden, customSymbolCustomFieldConfigDto.isHidden) &&
        Objects.equals(this.isMandatory, customSymbolCustomFieldConfigDto.isMandatory) &&
        Objects.equals(this.isShownInInfobox, customSymbolCustomFieldConfigDto.isShownInInfobox) &&
        Objects.equals(this.formulaConfig, customSymbolCustomFieldConfigDto.formulaConfig) &&
        equalsNullable(this.optionsConfig, customSymbolCustomFieldConfigDto.optionsConfig) &&
        equalsNullable(this.customSymbolTypes, customSymbolCustomFieldConfigDto.customSymbolTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(code), hashCodeNullable(name), hashCodeNullable(type), isHidden, isMandatory, isShownInInfobox, formulaConfig, hashCodeNullable(optionsConfig), hashCodeNullable(customSymbolTypes));
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
    sb.append("class CustomSymbolCustomFieldConfigDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    isShownInInfobox: ").append(toIndentedString(isShownInInfobox)).append("\n");
    sb.append("    formulaConfig: ").append(toIndentedString(formulaConfig)).append("\n");
    sb.append("    optionsConfig: ").append(toIndentedString(optionsConfig)).append("\n");
    sb.append("    customSymbolTypes: ").append(toIndentedString(customSymbolTypes)).append("\n");
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

