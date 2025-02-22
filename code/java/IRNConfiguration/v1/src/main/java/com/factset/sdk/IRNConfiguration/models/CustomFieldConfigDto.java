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
import com.factset.sdk.IRNConfiguration.models.ExtendedTextConfigDto;
import com.factset.sdk.IRNConfiguration.models.FormulaConfigDto;
import com.factset.sdk.IRNConfiguration.models.IntegerConfigDto;
import com.factset.sdk.IRNConfiguration.models.NumericConfigDto;
import com.factset.sdk.IRNConfiguration.models.OptionsConfigDto;
import com.factset.sdk.IRNConfiguration.models.UserTeamConfigDto;
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
  CustomFieldConfigDto.JSON_PROPERTY_IS_CALCULATED,
  CustomFieldConfigDto.JSON_PROPERTY_HAS_PAIRED_FIELD,
  CustomFieldConfigDto.JSON_PROPERTY_FORMULA_CONFIG,
  CustomFieldConfigDto.JSON_PROPERTY_NUMERIC_CONFIG,
  CustomFieldConfigDto.JSON_PROPERTY_INTEGER_CONFIG,
  CustomFieldConfigDto.JSON_PROPERTY_EXTENDED_TEXT_CONFIG,
  CustomFieldConfigDto.JSON_PROPERTY_OPTIONS_CONFIG,
  CustomFieldConfigDto.JSON_PROPERTY_USER_TEAM_CONFIG
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

  public static final String JSON_PROPERTY_IS_CALCULATED = "isCalculated";
  private Boolean isCalculated;

  public static final String JSON_PROPERTY_HAS_PAIRED_FIELD = "hasPairedField";
  private Boolean hasPairedField;

  public static final String JSON_PROPERTY_FORMULA_CONFIG = "formulaConfig";
  private JsonNullable<FormulaConfigDto> formulaConfig = JsonNullable.<FormulaConfigDto>undefined();

  public static final String JSON_PROPERTY_NUMERIC_CONFIG = "numericConfig";
  private JsonNullable<NumericConfigDto> numericConfig = JsonNullable.<NumericConfigDto>undefined();

  public static final String JSON_PROPERTY_INTEGER_CONFIG = "integerConfig";
  private JsonNullable<IntegerConfigDto> integerConfig = JsonNullable.<IntegerConfigDto>undefined();

  public static final String JSON_PROPERTY_EXTENDED_TEXT_CONFIG = "extendedTextConfig";
  private JsonNullable<ExtendedTextConfigDto> extendedTextConfig = JsonNullable.<ExtendedTextConfigDto>undefined();

  public static final String JSON_PROPERTY_OPTIONS_CONFIG = "optionsConfig";
  private JsonNullable<OptionsConfigDto> optionsConfig = JsonNullable.<OptionsConfigDto>undefined();

  public static final String JSON_PROPERTY_USER_TEAM_CONFIG = "userTeamConfig";
  private JsonNullable<UserTeamConfigDto> userTeamConfig = JsonNullable.<UserTeamConfigDto>undefined();

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


  public CustomFieldConfigDto isCalculated(Boolean isCalculated) {
    this.isCalculated = isCalculated;
    return this;
  }

   /**
   * Get isCalculated
   * @return isCalculated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_CALCULATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCalculated() {
    return isCalculated;
  }


  @JsonProperty(JSON_PROPERTY_IS_CALCULATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCalculated(Boolean isCalculated) {
    this.isCalculated = isCalculated;
  }


  public CustomFieldConfigDto hasPairedField(Boolean hasPairedField) {
    this.hasPairedField = hasPairedField;
    return this;
  }

   /**
   * Get hasPairedField
   * @return hasPairedField
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_PAIRED_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPairedField() {
    return hasPairedField;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PAIRED_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPairedField(Boolean hasPairedField) {
    this.hasPairedField = hasPairedField;
  }


  public CustomFieldConfigDto formulaConfig(FormulaConfigDto formulaConfig) {
    this.formulaConfig = JsonNullable.<FormulaConfigDto>of(formulaConfig);
    return this;
  }

   /**
   * Get formulaConfig
   * @return formulaConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public FormulaConfigDto getFormulaConfig() {
        return formulaConfig.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORMULA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<FormulaConfigDto> getFormulaConfig_JsonNullable() {
    return formulaConfig;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMULA_CONFIG)
  public void setFormulaConfig_JsonNullable(JsonNullable<FormulaConfigDto> formulaConfig) {
    this.formulaConfig = formulaConfig;
  }

  public void setFormulaConfig(FormulaConfigDto formulaConfig) {
    this.formulaConfig = JsonNullable.<FormulaConfigDto>of(formulaConfig);
  }


  public CustomFieldConfigDto numericConfig(NumericConfigDto numericConfig) {
    this.numericConfig = JsonNullable.<NumericConfigDto>of(numericConfig);
    return this;
  }

   /**
   * Get numericConfig
   * @return numericConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public NumericConfigDto getNumericConfig() {
        return numericConfig.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMERIC_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NumericConfigDto> getNumericConfig_JsonNullable() {
    return numericConfig;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMERIC_CONFIG)
  public void setNumericConfig_JsonNullable(JsonNullable<NumericConfigDto> numericConfig) {
    this.numericConfig = numericConfig;
  }

  public void setNumericConfig(NumericConfigDto numericConfig) {
    this.numericConfig = JsonNullable.<NumericConfigDto>of(numericConfig);
  }


  public CustomFieldConfigDto integerConfig(IntegerConfigDto integerConfig) {
    this.integerConfig = JsonNullable.<IntegerConfigDto>of(integerConfig);
    return this;
  }

   /**
   * Get integerConfig
   * @return integerConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public IntegerConfigDto getIntegerConfig() {
        return integerConfig.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<IntegerConfigDto> getIntegerConfig_JsonNullable() {
    return integerConfig;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGER_CONFIG)
  public void setIntegerConfig_JsonNullable(JsonNullable<IntegerConfigDto> integerConfig) {
    this.integerConfig = integerConfig;
  }

  public void setIntegerConfig(IntegerConfigDto integerConfig) {
    this.integerConfig = JsonNullable.<IntegerConfigDto>of(integerConfig);
  }


  public CustomFieldConfigDto extendedTextConfig(ExtendedTextConfigDto extendedTextConfig) {
    this.extendedTextConfig = JsonNullable.<ExtendedTextConfigDto>of(extendedTextConfig);
    return this;
  }

   /**
   * Get extendedTextConfig
   * @return extendedTextConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public ExtendedTextConfigDto getExtendedTextConfig() {
        return extendedTextConfig.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTENDED_TEXT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ExtendedTextConfigDto> getExtendedTextConfig_JsonNullable() {
    return extendedTextConfig;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTENDED_TEXT_CONFIG)
  public void setExtendedTextConfig_JsonNullable(JsonNullable<ExtendedTextConfigDto> extendedTextConfig) {
    this.extendedTextConfig = extendedTextConfig;
  }

  public void setExtendedTextConfig(ExtendedTextConfigDto extendedTextConfig) {
    this.extendedTextConfig = JsonNullable.<ExtendedTextConfigDto>of(extendedTextConfig);
  }


  public CustomFieldConfigDto optionsConfig(OptionsConfigDto optionsConfig) {
    this.optionsConfig = JsonNullable.<OptionsConfigDto>of(optionsConfig);
    return this;
  }

   /**
   * Get optionsConfig
   * @return optionsConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OptionsConfigDto getOptionsConfig() {
        return optionsConfig.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPTIONS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OptionsConfigDto> getOptionsConfig_JsonNullable() {
    return optionsConfig;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONS_CONFIG)
  public void setOptionsConfig_JsonNullable(JsonNullable<OptionsConfigDto> optionsConfig) {
    this.optionsConfig = optionsConfig;
  }

  public void setOptionsConfig(OptionsConfigDto optionsConfig) {
    this.optionsConfig = JsonNullable.<OptionsConfigDto>of(optionsConfig);
  }


  public CustomFieldConfigDto userTeamConfig(UserTeamConfigDto userTeamConfig) {
    this.userTeamConfig = JsonNullable.<UserTeamConfigDto>of(userTeamConfig);
    return this;
  }

   /**
   * Get userTeamConfig
   * @return userTeamConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UserTeamConfigDto getUserTeamConfig() {
        return userTeamConfig.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_TEAM_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UserTeamConfigDto> getUserTeamConfig_JsonNullable() {
    return userTeamConfig;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_TEAM_CONFIG)
  public void setUserTeamConfig_JsonNullable(JsonNullable<UserTeamConfigDto> userTeamConfig) {
    this.userTeamConfig = userTeamConfig;
  }

  public void setUserTeamConfig(UserTeamConfigDto userTeamConfig) {
    this.userTeamConfig = JsonNullable.<UserTeamConfigDto>of(userTeamConfig);
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
        Objects.equals(this.isCalculated, customFieldConfigDto.isCalculated) &&
        Objects.equals(this.hasPairedField, customFieldConfigDto.hasPairedField) &&
        equalsNullable(this.formulaConfig, customFieldConfigDto.formulaConfig) &&
        equalsNullable(this.numericConfig, customFieldConfigDto.numericConfig) &&
        equalsNullable(this.integerConfig, customFieldConfigDto.integerConfig) &&
        equalsNullable(this.extendedTextConfig, customFieldConfigDto.extendedTextConfig) &&
        equalsNullable(this.optionsConfig, customFieldConfigDto.optionsConfig) &&
        equalsNullable(this.userTeamConfig, customFieldConfigDto.userTeamConfig);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(code), hashCodeNullable(name), hashCodeNullable(source), hashCodeNullable(type), usePreviousValue, isMandatory, isHidden, isFilePath, isCalculated, hasPairedField, hashCodeNullable(formulaConfig), hashCodeNullable(numericConfig), hashCodeNullable(integerConfig), hashCodeNullable(extendedTextConfig), hashCodeNullable(optionsConfig), hashCodeNullable(userTeamConfig));
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
    sb.append("    isCalculated: ").append(toIndentedString(isCalculated)).append("\n");
    sb.append("    hasPairedField: ").append(toIndentedString(hasPairedField)).append("\n");
    sb.append("    formulaConfig: ").append(toIndentedString(formulaConfig)).append("\n");
    sb.append("    numericConfig: ").append(toIndentedString(numericConfig)).append("\n");
    sb.append("    integerConfig: ").append(toIndentedString(integerConfig)).append("\n");
    sb.append("    extendedTextConfig: ").append(toIndentedString(extendedTextConfig)).append("\n");
    sb.append("    optionsConfig: ").append(toIndentedString(optionsConfig)).append("\n");
    sb.append("    userTeamConfig: ").append(toIndentedString(userTeamConfig)).append("\n");
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

