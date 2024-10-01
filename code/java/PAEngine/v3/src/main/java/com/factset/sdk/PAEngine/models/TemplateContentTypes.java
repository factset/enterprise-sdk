/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

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
import com.factset.sdk.PAEngine.JSON;


/**
 * TemplateContentTypes
 */
@JsonPropertyOrder({
  TemplateContentTypes.JSON_PROPERTY_MANDATORY,
  TemplateContentTypes.JSON_PROPERTY_OPTIONAL,
  TemplateContentTypes.JSON_PROPERTY_LOCKED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TemplateContentTypes implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MANDATORY = "mandatory";
  private JsonNullable<java.util.List<String>> mandatory = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_OPTIONAL = "optional";
  private JsonNullable<java.util.List<String>> optional = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private JsonNullable<java.util.List<String>> locked = JsonNullable.<java.util.List<String>>undefined();

  public TemplateContentTypes() { 
  }

  public TemplateContentTypes mandatory(java.util.List<String> mandatory) {
    this.mandatory = JsonNullable.<java.util.List<String>>of(mandatory);
    return this;
  }

  public TemplateContentTypes addMandatoryItem(String mandatoryItem) {
    if (this.mandatory == null || !this.mandatory.isPresent()) {
      this.mandatory = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.mandatory.get().add(mandatoryItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Template mandatory fields
   * @return mandatory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Template mandatory fields")
  @JsonIgnore

  public java.util.List<String> getMandatory() {
        return mandatory.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getMandatory_JsonNullable() {
    return mandatory;
  }
  
  @JsonProperty(JSON_PROPERTY_MANDATORY)
  public void setMandatory_JsonNullable(JsonNullable<java.util.List<String>> mandatory) {
    this.mandatory = mandatory;
  }

  public void setMandatory(java.util.List<String> mandatory) {
    this.mandatory = JsonNullable.<java.util.List<String>>of(mandatory);
  }


  public TemplateContentTypes optional(java.util.List<String> optional) {
    this.optional = JsonNullable.<java.util.List<String>>of(optional);
    return this;
  }

  public TemplateContentTypes addOptionalItem(String optionalItem) {
    if (this.optional == null || !this.optional.isPresent()) {
      this.optional = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.optional.get().add(optionalItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Template optional fields
   * @return optional
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Template optional fields")
  @JsonIgnore

  public java.util.List<String> getOptional() {
        return optional.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getOptional_JsonNullable() {
    return optional;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONAL)
  public void setOptional_JsonNullable(JsonNullable<java.util.List<String>> optional) {
    this.optional = optional;
  }

  public void setOptional(java.util.List<String> optional) {
    this.optional = JsonNullable.<java.util.List<String>>of(optional);
  }


  public TemplateContentTypes locked(java.util.List<String> locked) {
    this.locked = JsonNullable.<java.util.List<String>>of(locked);
    return this;
  }

  public TemplateContentTypes addLockedItem(String lockedItem) {
    if (this.locked == null || !this.locked.isPresent()) {
      this.locked = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.locked.get().add(lockedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Template locked fields
   * @return locked
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Template locked fields")
  @JsonIgnore

  public java.util.List<String> getLocked() {
        return locked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getLocked_JsonNullable() {
    return locked;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCKED)
  public void setLocked_JsonNullable(JsonNullable<java.util.List<String>> locked) {
    this.locked = locked;
  }

  public void setLocked(java.util.List<String> locked) {
    this.locked = JsonNullable.<java.util.List<String>>of(locked);
  }


  /**
   * Return true if this TemplateContentTypes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateContentTypes templateContentTypes = (TemplateContentTypes) o;
    return equalsNullable(this.mandatory, templateContentTypes.mandatory) &&
        equalsNullable(this.optional, templateContentTypes.optional) &&
        equalsNullable(this.locked, templateContentTypes.locked);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(mandatory), hashCodeNullable(optional), hashCodeNullable(locked));
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
    sb.append("class TemplateContentTypes {\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

