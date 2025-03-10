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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IRNConfiguration.JSON;


/**
 * DateSettingsDto
 */
@JsonPropertyOrder({
  DateSettingsDto.JSON_PROPERTY_ALLOW_EDIT,
  DateSettingsDto.JSON_PROPERTY_IS_LOCKED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DateSettingsDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ALLOW_EDIT = "allowEdit";
  private Boolean allowEdit;

  public static final String JSON_PROPERTY_IS_LOCKED = "isLocked";
  private Boolean isLocked;

  public DateSettingsDto() { 
  }

  public DateSettingsDto allowEdit(Boolean allowEdit) {
    this.allowEdit = allowEdit;
    return this;
  }

   /**
   * Get allowEdit
   * @return allowEdit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOW_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowEdit() {
    return allowEdit;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowEdit(Boolean allowEdit) {
    this.allowEdit = allowEdit;
  }


  public DateSettingsDto isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLocked() {
    return isLocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  /**
   * Return true if this DateSettingsDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateSettingsDto dateSettingsDto = (DateSettingsDto) o;
    return Objects.equals(this.allowEdit, dateSettingsDto.allowEdit) &&
        Objects.equals(this.isLocked, dateSettingsDto.isLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEdit, isLocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateSettingsDto {\n");
    sb.append("    allowEdit: ").append(toIndentedString(allowEdit)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
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

