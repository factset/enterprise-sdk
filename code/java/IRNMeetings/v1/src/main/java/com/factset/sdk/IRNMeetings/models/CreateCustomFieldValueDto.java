/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNMeetings.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNMeetings.models.UserTeamLookupDto;
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
import com.factset.sdk.IRNMeetings.JSON;


/**
 * Set a value or values for a custom field identified by the field &#39;Code&#39;. Only one of the fields (IntegerValue / TextValue / FilePathValue etc) will be used,  depending on the data type of the custom field corresponding to the &#39;Code&#39; provided
 */
@ApiModel(description = "Set a value or values for a custom field identified by the field 'Code'. Only one of the fields (IntegerValue / TextValue / FilePathValue etc) will be used,  depending on the data type of the custom field corresponding to the 'Code' provided")
@JsonPropertyOrder({
  CreateCustomFieldValueDto.JSON_PROPERTY_CODE,
  CreateCustomFieldValueDto.JSON_PROPERTY_INTEGER_VALUE,
  CreateCustomFieldValueDto.JSON_PROPERTY_TEXT_VALUE,
  CreateCustomFieldValueDto.JSON_PROPERTY_FILE_PATH_VALUE,
  CreateCustomFieldValueDto.JSON_PROPERTY_NUMERIC_VALUE,
  CreateCustomFieldValueDto.JSON_PROPERTY_DATE_VALUE,
  CreateCustomFieldValueDto.JSON_PROPERTY_EXTENDED_TEXT_VALUE,
  CreateCustomFieldValueDto.JSON_PROPERTY_CONTACT_LOOKUP_VALUES,
  CreateCustomFieldValueDto.JSON_PROPERTY_OPTION_VALUE,
  CreateCustomFieldValueDto.JSON_PROPERTY_OPTION_VALUES,
  CreateCustomFieldValueDto.JSON_PROPERTY_USER_TEAM_LOOKUP_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CreateCustomFieldValueDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_INTEGER_VALUE = "integerValue";
  private JsonNullable<Integer> integerValue = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TEXT_VALUE = "textValue";
  private JsonNullable<String> textValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FILE_PATH_VALUE = "filePathValue";
  private JsonNullable<String> filePathValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NUMERIC_VALUE = "numericValue";
  private JsonNullable<Double> numericValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DATE_VALUE = "dateValue";
  private JsonNullable<String> dateValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTENDED_TEXT_VALUE = "extendedTextValue";
  private JsonNullable<String> extendedTextValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTACT_LOOKUP_VALUES = "contactLookupValues";
  private JsonNullable<java.util.List<java.util.UUID>> contactLookupValues = JsonNullable.<java.util.List<java.util.UUID>>undefined();

  public static final String JSON_PROPERTY_OPTION_VALUE = "optionValue";
  private JsonNullable<String> optionValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPTION_VALUES = "optionValues";
  private JsonNullable<java.util.List<String>> optionValues = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_USER_TEAM_LOOKUP_VALUES = "userTeamLookupValues";
  private JsonNullable<UserTeamLookupDto> userTeamLookupValues = JsonNullable.<UserTeamLookupDto>undefined();

  public CreateCustomFieldValueDto() { 
  }

  @JsonCreator
  public CreateCustomFieldValueDto(
    @JsonProperty(value=JSON_PROPERTY_CODE, required=true) String code
  ) {
    this();
    this.code = code;
  }

  public CreateCustomFieldValueDto code(String code) {
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


  public CreateCustomFieldValueDto integerValue(Integer integerValue) {
    this.integerValue = JsonNullable.<Integer>of(integerValue);
    return this;
  }

   /**
   * Get integerValue
   * @return integerValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getIntegerValue() {
        return integerValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getIntegerValue_JsonNullable() {
    return integerValue;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGER_VALUE)
  public void setIntegerValue_JsonNullable(JsonNullable<Integer> integerValue) {
    this.integerValue = integerValue;
  }

  public void setIntegerValue(Integer integerValue) {
    this.integerValue = JsonNullable.<Integer>of(integerValue);
  }


  public CreateCustomFieldValueDto textValue(String textValue) {
    this.textValue = JsonNullable.<String>of(textValue);
    return this;
  }

   /**
   * Get textValue
   * @return textValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getTextValue() {
        return textValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTextValue_JsonNullable() {
    return textValue;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT_VALUE)
  public void setTextValue_JsonNullable(JsonNullable<String> textValue) {
    this.textValue = textValue;
  }

  public void setTextValue(String textValue) {
    this.textValue = JsonNullable.<String>of(textValue);
  }


  public CreateCustomFieldValueDto filePathValue(String filePathValue) {
    this.filePathValue = JsonNullable.<String>of(filePathValue);
    return this;
  }

   /**
   * Get filePathValue
   * @return filePathValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFilePathValue() {
        return filePathValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_PATH_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFilePathValue_JsonNullable() {
    return filePathValue;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_PATH_VALUE)
  public void setFilePathValue_JsonNullable(JsonNullable<String> filePathValue) {
    this.filePathValue = filePathValue;
  }

  public void setFilePathValue(String filePathValue) {
    this.filePathValue = JsonNullable.<String>of(filePathValue);
  }


  public CreateCustomFieldValueDto numericValue(Double numericValue) {
    this.numericValue = JsonNullable.<Double>of(numericValue);
    return this;
  }

   /**
   * Get numericValue
   * @return numericValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Double getNumericValue() {
        return numericValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMERIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getNumericValue_JsonNullable() {
    return numericValue;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMERIC_VALUE)
  public void setNumericValue_JsonNullable(JsonNullable<Double> numericValue) {
    this.numericValue = numericValue;
  }

  public void setNumericValue(Double numericValue) {
    this.numericValue = JsonNullable.<Double>of(numericValue);
  }


  public CreateCustomFieldValueDto dateValue(String dateValue) {
    this.dateValue = JsonNullable.<String>of(dateValue);
    return this;
  }

   /**
   * Get dateValue
   * @return dateValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getDateValue() {
        return dateValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDateValue_JsonNullable() {
    return dateValue;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE_VALUE)
  public void setDateValue_JsonNullable(JsonNullable<String> dateValue) {
    this.dateValue = dateValue;
  }

  public void setDateValue(String dateValue) {
    this.dateValue = JsonNullable.<String>of(dateValue);
  }


  public CreateCustomFieldValueDto extendedTextValue(String extendedTextValue) {
    this.extendedTextValue = JsonNullable.<String>of(extendedTextValue);
    return this;
  }

   /**
   * Get extendedTextValue
   * @return extendedTextValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getExtendedTextValue() {
        return extendedTextValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTENDED_TEXT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExtendedTextValue_JsonNullable() {
    return extendedTextValue;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTENDED_TEXT_VALUE)
  public void setExtendedTextValue_JsonNullable(JsonNullable<String> extendedTextValue) {
    this.extendedTextValue = extendedTextValue;
  }

  public void setExtendedTextValue(String extendedTextValue) {
    this.extendedTextValue = JsonNullable.<String>of(extendedTextValue);
  }


  public CreateCustomFieldValueDto contactLookupValues(java.util.List<java.util.UUID> contactLookupValues) {
    this.contactLookupValues = JsonNullable.<java.util.List<java.util.UUID>>of(contactLookupValues);
    return this;
  }

  public CreateCustomFieldValueDto addContactLookupValuesItem(java.util.UUID contactLookupValuesItem) {
    if (this.contactLookupValues == null || !this.contactLookupValues.isPresent()) {
      this.contactLookupValues = JsonNullable.<java.util.List<java.util.UUID>>of(new java.util.ArrayList<>());
    }
    try {
      this.contactLookupValues.get().add(contactLookupValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get contactLookupValues
   * @return contactLookupValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<java.util.UUID> getContactLookupValues() {
        return contactLookupValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTACT_LOOKUP_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<java.util.UUID>> getContactLookupValues_JsonNullable() {
    return contactLookupValues;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTACT_LOOKUP_VALUES)
  public void setContactLookupValues_JsonNullable(JsonNullable<java.util.List<java.util.UUID>> contactLookupValues) {
    this.contactLookupValues = contactLookupValues;
  }

  public void setContactLookupValues(java.util.List<java.util.UUID> contactLookupValues) {
    this.contactLookupValues = JsonNullable.<java.util.List<java.util.UUID>>of(contactLookupValues);
  }


  public CreateCustomFieldValueDto optionValue(String optionValue) {
    this.optionValue = JsonNullable.<String>of(optionValue);
    return this;
  }

   /**
   * Get optionValue
   * @return optionValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getOptionValue() {
        return optionValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPTION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOptionValue_JsonNullable() {
    return optionValue;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTION_VALUE)
  public void setOptionValue_JsonNullable(JsonNullable<String> optionValue) {
    this.optionValue = optionValue;
  }

  public void setOptionValue(String optionValue) {
    this.optionValue = JsonNullable.<String>of(optionValue);
  }


  public CreateCustomFieldValueDto optionValues(java.util.List<String> optionValues) {
    this.optionValues = JsonNullable.<java.util.List<String>>of(optionValues);
    return this;
  }

  public CreateCustomFieldValueDto addOptionValuesItem(String optionValuesItem) {
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


  public CreateCustomFieldValueDto userTeamLookupValues(UserTeamLookupDto userTeamLookupValues) {
    this.userTeamLookupValues = JsonNullable.<UserTeamLookupDto>of(userTeamLookupValues);
    return this;
  }

   /**
   * Get userTeamLookupValues
   * @return userTeamLookupValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UserTeamLookupDto getUserTeamLookupValues() {
        return userTeamLookupValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_TEAM_LOOKUP_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UserTeamLookupDto> getUserTeamLookupValues_JsonNullable() {
    return userTeamLookupValues;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_TEAM_LOOKUP_VALUES)
  public void setUserTeamLookupValues_JsonNullable(JsonNullable<UserTeamLookupDto> userTeamLookupValues) {
    this.userTeamLookupValues = userTeamLookupValues;
  }

  public void setUserTeamLookupValues(UserTeamLookupDto userTeamLookupValues) {
    this.userTeamLookupValues = JsonNullable.<UserTeamLookupDto>of(userTeamLookupValues);
  }


  /**
   * Return true if this CreateCustomFieldValueDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomFieldValueDto createCustomFieldValueDto = (CreateCustomFieldValueDto) o;
    return Objects.equals(this.code, createCustomFieldValueDto.code) &&
        equalsNullable(this.integerValue, createCustomFieldValueDto.integerValue) &&
        equalsNullable(this.textValue, createCustomFieldValueDto.textValue) &&
        equalsNullable(this.filePathValue, createCustomFieldValueDto.filePathValue) &&
        equalsNullable(this.numericValue, createCustomFieldValueDto.numericValue) &&
        equalsNullable(this.dateValue, createCustomFieldValueDto.dateValue) &&
        equalsNullable(this.extendedTextValue, createCustomFieldValueDto.extendedTextValue) &&
        equalsNullable(this.contactLookupValues, createCustomFieldValueDto.contactLookupValues) &&
        equalsNullable(this.optionValue, createCustomFieldValueDto.optionValue) &&
        equalsNullable(this.optionValues, createCustomFieldValueDto.optionValues) &&
        equalsNullable(this.userTeamLookupValues, createCustomFieldValueDto.userTeamLookupValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, hashCodeNullable(integerValue), hashCodeNullable(textValue), hashCodeNullable(filePathValue), hashCodeNullable(numericValue), hashCodeNullable(dateValue), hashCodeNullable(extendedTextValue), hashCodeNullable(contactLookupValues), hashCodeNullable(optionValue), hashCodeNullable(optionValues), hashCodeNullable(userTeamLookupValues));
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
    sb.append("class CreateCustomFieldValueDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    integerValue: ").append(toIndentedString(integerValue)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    filePathValue: ").append(toIndentedString(filePathValue)).append("\n");
    sb.append("    numericValue: ").append(toIndentedString(numericValue)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
    sb.append("    extendedTextValue: ").append(toIndentedString(extendedTextValue)).append("\n");
    sb.append("    contactLookupValues: ").append(toIndentedString(contactLookupValues)).append("\n");
    sb.append("    optionValue: ").append(toIndentedString(optionValue)).append("\n");
    sb.append("    optionValues: ").append(toIndentedString(optionValues)).append("\n");
    sb.append("    userTeamLookupValues: ").append(toIndentedString(userTeamLookupValues)).append("\n");
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

