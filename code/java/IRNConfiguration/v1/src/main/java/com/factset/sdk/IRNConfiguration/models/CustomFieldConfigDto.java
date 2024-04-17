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
import com.factset.sdk.IRNConfiguration.models.ExtendedTextConfigDto;
import com.factset.sdk.IRNConfiguration.models.FormulaConfigDto;
import com.factset.sdk.IRNConfiguration.models.IntegerConfigDto;
import com.factset.sdk.IRNConfiguration.models.NumericConfigDto;
import com.factset.sdk.IRNConfiguration.models.OptionsConfigDto;
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
 * CustomFieldConfigDto
 */
@JsonPropertyOrder({
  CustomFieldConfigDto.JSON_PROPERTY_ID,
  CustomFieldConfigDto.JSON_PROPERTY_CODE,
  CustomFieldConfigDto.JSON_PROPERTY_NAME,
  CustomFieldConfigDto.JSON_PROPERTY_SOURCE,
  CustomFieldConfigDto.JSON_PROPERTY_TYPE,
  CustomFieldConfigDto.JSON_PROPERTY_USE_PREVIOUS_VALUE,
  CustomFieldConfigDto.JSON_PROPERTY_IS_MANDATORY,
  CustomFieldConfigDto.JSON_PROPERTY_IS_HIDDEN,
  CustomFieldConfigDto.JSON_PROPERTY_IS_FILE_PATH,
  CustomFieldConfigDto.JSON_PROPERTY_FORMULA_CONFIG,
  CustomFieldConfigDto.JSON_PROPERTY_NUMERIC_CONFIG,
  CustomFieldConfigDto.JSON_PROPERTY_INTEGER_CONFIG,
  CustomFieldConfigDto.JSON_PROPERTY_EXTENDED_TEXT_CONFIG,
  CustomFieldConfigDto.JSON_PROPERTY_OPTIONS_CONFIG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomFieldConfigDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private JsonNullable<String> source = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USE_PREVIOUS_VALUE = "usePreviousValue";
  private Boolean usePreviousValue;

  public static final String JSON_PROPERTY_IS_MANDATORY = "isMandatory";
  private Boolean isMandatory;

  public static final String JSON_PROPERTY_IS_HIDDEN = "isHidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_IS_FILE_PATH = "isFilePath";
  private Boolean isFilePath;

  public static final String JSON_PROPERTY_FORMULA_CONFIG = "formulaConfig";
  private FormulaConfigDto formulaConfig;

  public static final String JSON_PROPERTY_NUMERIC_CONFIG = "numericConfig";
  private NumericConfigDto numericConfig;

  public static final String JSON_PROPERTY_INTEGER_CONFIG = "integerConfig";
  private IntegerConfigDto integerConfig;

  public static final String JSON_PROPERTY_EXTENDED_TEXT_CONFIG = "extendedTextConfig";
  private ExtendedTextConfigDto extendedTextConfig;

  public static final String JSON_PROPERTY_OPTIONS_CONFIG = "optionsConfig";
  private OptionsConfigDto optionsConfig;

  public CustomFieldConfigDto() { 
  }

  public CustomFieldConfigDto id(java.util.UUID id) {
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


  public CustomFieldConfigDto code(String code) {
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


  public CustomFieldConfigDto name(String name) {
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


  public CustomFieldConfigDto source(String source) {
    this.source = JsonNullable.<String>of(source);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getSource() {
        return source.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSource_JsonNullable() {
    return source;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE)
  public void setSource_JsonNullable(JsonNullable<String> source) {
    this.source = source;
  }

  public void setSource(String source) {
    this.source = JsonNullable.<String>of(source);
  }


  public CustomFieldConfigDto type(String type) {
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


  public CustomFieldConfigDto usePreviousValue(Boolean usePreviousValue) {
    this.usePreviousValue = usePreviousValue;
    return this;
  }

   /**
   * Get usePreviousValue
   * @return usePreviousValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_PREVIOUS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsePreviousValue() {
    return usePreviousValue;
  }


  @JsonProperty(JSON_PROPERTY_USE_PREVIOUS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsePreviousValue(Boolean usePreviousValue) {
    this.usePreviousValue = usePreviousValue;
  }


  public CustomFieldConfigDto isMandatory(Boolean isMandatory) {
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


  public CustomFieldConfigDto isHidden(Boolean isHidden) {
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


  public CustomFieldConfigDto isFilePath(Boolean isFilePath) {
    this.isFilePath = isFilePath;
    return this;
  }

   /**
   * Get isFilePath
   * @return isFilePath
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFilePath() {
    return isFilePath;
  }


  @JsonProperty(JSON_PROPERTY_IS_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFilePath(Boolean isFilePath) {
    this.isFilePath = isFilePath;
  }


  public CustomFieldConfigDto formulaConfig(FormulaConfigDto formulaConfig) {
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

  public FormulaConfigDto getFormulaConfig() {
    return formulaConfig;
  }


  @JsonProperty(JSON_PROPERTY_FORMULA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormulaConfig(FormulaConfigDto formulaConfig) {
    this.formulaConfig = formulaConfig;
  }


  public CustomFieldConfigDto numericConfig(NumericConfigDto numericConfig) {
    this.numericConfig = numericConfig;
    return this;
  }

   /**
   * Get numericConfig
   * @return numericConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMERIC_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NumericConfigDto getNumericConfig() {
    return numericConfig;
  }


  @JsonProperty(JSON_PROPERTY_NUMERIC_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumericConfig(NumericConfigDto numericConfig) {
    this.numericConfig = numericConfig;
  }


  public CustomFieldConfigDto integerConfig(IntegerConfigDto integerConfig) {
    this.integerConfig = integerConfig;
    return this;
  }

   /**
   * Get integerConfig
   * @return integerConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEGER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IntegerConfigDto getIntegerConfig() {
    return integerConfig;
  }


  @JsonProperty(JSON_PROPERTY_INTEGER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegerConfig(IntegerConfigDto integerConfig) {
    this.integerConfig = integerConfig;
  }


  public CustomFieldConfigDto extendedTextConfig(ExtendedTextConfigDto extendedTextConfig) {
    this.extendedTextConfig = extendedTextConfig;
    return this;
  }

   /**
   * Get extendedTextConfig
   * @return extendedTextConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTENDED_TEXT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExtendedTextConfigDto getExtendedTextConfig() {
    return extendedTextConfig;
  }


  @JsonProperty(JSON_PROPERTY_EXTENDED_TEXT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedTextConfig(ExtendedTextConfigDto extendedTextConfig) {
    this.extendedTextConfig = extendedTextConfig;
  }


  public CustomFieldConfigDto optionsConfig(OptionsConfigDto optionsConfig) {
    this.optionsConfig = optionsConfig;
    return this;
  }

   /**
   * Get optionsConfig
   * @return optionsConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptionsConfigDto getOptionsConfig() {
    return optionsConfig;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionsConfig(OptionsConfigDto optionsConfig) {
    this.optionsConfig = optionsConfig;
  }


  /**
   * Return true if this CustomFieldConfigDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldConfigDto customFieldConfigDto = (CustomFieldConfigDto) o;
    return Objects.equals(this.id, customFieldConfigDto.id) &&
        equalsNullable(this.code, customFieldConfigDto.code) &&
        equalsNullable(this.name, customFieldConfigDto.name) &&
        equalsNullable(this.source, customFieldConfigDto.source) &&
        equalsNullable(this.type, customFieldConfigDto.type) &&
        Objects.equals(this.usePreviousValue, customFieldConfigDto.usePreviousValue) &&
        Objects.equals(this.isMandatory, customFieldConfigDto.isMandatory) &&
        Objects.equals(this.isHidden, customFieldConfigDto.isHidden) &&
        Objects.equals(this.isFilePath, customFieldConfigDto.isFilePath) &&
        Objects.equals(this.formulaConfig, customFieldConfigDto.formulaConfig) &&
        Objects.equals(this.numericConfig, customFieldConfigDto.numericConfig) &&
        Objects.equals(this.integerConfig, customFieldConfigDto.integerConfig) &&
        Objects.equals(this.extendedTextConfig, customFieldConfigDto.extendedTextConfig) &&
        Objects.equals(this.optionsConfig, customFieldConfigDto.optionsConfig);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(code), hashCodeNullable(name), hashCodeNullable(source), hashCodeNullable(type), usePreviousValue, isMandatory, isHidden, isFilePath, formulaConfig, numericConfig, integerConfig, extendedTextConfig, optionsConfig);
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
    sb.append("class CustomFieldConfigDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usePreviousValue: ").append(toIndentedString(usePreviousValue)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isFilePath: ").append(toIndentedString(isFilePath)).append("\n");
    sb.append("    formulaConfig: ").append(toIndentedString(formulaConfig)).append("\n");
    sb.append("    numericConfig: ").append(toIndentedString(numericConfig)).append("\n");
    sb.append("    integerConfig: ").append(toIndentedString(integerConfig)).append("\n");
    sb.append("    extendedTextConfig: ").append(toIndentedString(extendedTextConfig)).append("\n");
    sb.append("    optionsConfig: ").append(toIndentedString(optionsConfig)).append("\n");
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

