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
 * NoteSettingsDto
 */
@JsonPropertyOrder({
  NoteSettingsDto.JSON_PROPERTY_IS_HIDDEN,
  NoteSettingsDto.JSON_PROPERTY_IS_MANDATORY,
  NoteSettingsDto.JSON_PROPERTY_USE_PREVIOUS,
  NoteSettingsDto.JSON_PROPERTY_ALLOW_PERSONAL,
  NoteSettingsDto.JSON_PROPERTY_DEFAULT_STATUS,
  NoteSettingsDto.JSON_PROPERTY_ALTERNATIVE_CUSTOM_FIELD_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class NoteSettingsDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_HIDDEN = "isHidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_IS_MANDATORY = "isMandatory";
  private Boolean isMandatory;

  public static final String JSON_PROPERTY_USE_PREVIOUS = "usePrevious";
  private Boolean usePrevious;

  public static final String JSON_PROPERTY_ALLOW_PERSONAL = "allowPersonal";
  private Boolean allowPersonal;

  public static final String JSON_PROPERTY_DEFAULT_STATUS = "defaultStatus";
  private JsonNullable<String> defaultStatus = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ALTERNATIVE_CUSTOM_FIELD_ID = "alternativeCustomFieldId";
  private JsonNullable<java.util.UUID> alternativeCustomFieldId = JsonNullable.<java.util.UUID>undefined();

  public NoteSettingsDto() { 
  }

  public NoteSettingsDto isHidden(Boolean isHidden) {
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


  public NoteSettingsDto isMandatory(Boolean isMandatory) {
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


  public NoteSettingsDto usePrevious(Boolean usePrevious) {
    this.usePrevious = usePrevious;
    return this;
  }

   /**
   * Get usePrevious
   * @return usePrevious
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsePrevious() {
    return usePrevious;
  }


  @JsonProperty(JSON_PROPERTY_USE_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsePrevious(Boolean usePrevious) {
    this.usePrevious = usePrevious;
  }


  public NoteSettingsDto allowPersonal(Boolean allowPersonal) {
    this.allowPersonal = allowPersonal;
    return this;
  }

   /**
   * Get allowPersonal
   * @return allowPersonal
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOW_PERSONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowPersonal() {
    return allowPersonal;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_PERSONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowPersonal(Boolean allowPersonal) {
    this.allowPersonal = allowPersonal;
  }


  public NoteSettingsDto defaultStatus(String defaultStatus) {
    this.defaultStatus = JsonNullable.<String>of(defaultStatus);
    return this;
  }

   /**
   * Get defaultStatus
   * @return defaultStatus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getDefaultStatus() {
        return defaultStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDefaultStatus_JsonNullable() {
    return defaultStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_STATUS)
  public void setDefaultStatus_JsonNullable(JsonNullable<String> defaultStatus) {
    this.defaultStatus = defaultStatus;
  }

  public void setDefaultStatus(String defaultStatus) {
    this.defaultStatus = JsonNullable.<String>of(defaultStatus);
  }


  public NoteSettingsDto alternativeCustomFieldId(java.util.UUID alternativeCustomFieldId) {
    this.alternativeCustomFieldId = JsonNullable.<java.util.UUID>of(alternativeCustomFieldId);
    return this;
  }

   /**
   * Get alternativeCustomFieldId
   * @return alternativeCustomFieldId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getAlternativeCustomFieldId() {
        return alternativeCustomFieldId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_CUSTOM_FIELD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getAlternativeCustomFieldId_JsonNullable() {
    return alternativeCustomFieldId;
  }
  
  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_CUSTOM_FIELD_ID)
  public void setAlternativeCustomFieldId_JsonNullable(JsonNullable<java.util.UUID> alternativeCustomFieldId) {
    this.alternativeCustomFieldId = alternativeCustomFieldId;
  }

  public void setAlternativeCustomFieldId(java.util.UUID alternativeCustomFieldId) {
    this.alternativeCustomFieldId = JsonNullable.<java.util.UUID>of(alternativeCustomFieldId);
  }


  /**
   * Return true if this NoteSettingsDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteSettingsDto noteSettingsDto = (NoteSettingsDto) o;
    return Objects.equals(this.isHidden, noteSettingsDto.isHidden) &&
        Objects.equals(this.isMandatory, noteSettingsDto.isMandatory) &&
        Objects.equals(this.usePrevious, noteSettingsDto.usePrevious) &&
        Objects.equals(this.allowPersonal, noteSettingsDto.allowPersonal) &&
        equalsNullable(this.defaultStatus, noteSettingsDto.defaultStatus) &&
        equalsNullable(this.alternativeCustomFieldId, noteSettingsDto.alternativeCustomFieldId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, isMandatory, usePrevious, allowPersonal, hashCodeNullable(defaultStatus), hashCodeNullable(alternativeCustomFieldId));
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
    sb.append("class NoteSettingsDto {\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    usePrevious: ").append(toIndentedString(usePrevious)).append("\n");
    sb.append("    allowPersonal: ").append(toIndentedString(allowPersonal)).append("\n");
    sb.append("    defaultStatus: ").append(toIndentedString(defaultStatus)).append("\n");
    sb.append("    alternativeCustomFieldId: ").append(toIndentedString(alternativeCustomFieldId)).append("\n");
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

