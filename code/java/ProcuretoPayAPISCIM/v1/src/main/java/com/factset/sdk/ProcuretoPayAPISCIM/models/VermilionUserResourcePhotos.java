/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ProcuretoPayAPISCIM.models;

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
import com.factset.sdk.ProcuretoPayAPISCIM.JSON;


/**
 * VermilionUserResourcePhotos
 */
@JsonPropertyOrder({
  VermilionUserResourcePhotos.JSON_PROPERTY_VALUE,
  VermilionUserResourcePhotos.JSON_PROPERTY_DISPLAY,
  VermilionUserResourcePhotos.JSON_PROPERTY_TYPE,
  VermilionUserResourcePhotos.JSON_PROPERTY_PRIMARY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VermilionUserResourcePhotos implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary;

  public VermilionUserResourcePhotos() { 
  }

  public VermilionUserResourcePhotos value(String value) {
    this.value = value;
    return this;
  }

   /**
   * URLs of photos of the User.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://example.com/profiles/john.doe", value = "URLs of photos of the User.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public VermilionUserResourcePhotos display(String display) {
    this.display = display;
    return this;
  }

   /**
   * A human-readable name, primarily used for display purposes. READ-ONLY.
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable name, primarily used for display purposes. READ-ONLY.")
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplay() {
    return display;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplay(String display) {
    this.display = display;
  }


  public VermilionUserResourcePhotos type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A label indicating the attribute&#39;s function, i.e., &#39;photo&#39; or &#39;thumbnail&#39;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "photo", value = "A label indicating the attribute's function, i.e., 'photo' or 'thumbnail'.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public VermilionUserResourcePhotos primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  /**
   * Return true if this VermilionUserResource_photos object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VermilionUserResourcePhotos vermilionUserResourcePhotos = (VermilionUserResourcePhotos) o;
    return Objects.equals(this.value, vermilionUserResourcePhotos.value) &&
        Objects.equals(this.display, vermilionUserResourcePhotos.display) &&
        Objects.equals(this.type, vermilionUserResourcePhotos.type) &&
        Objects.equals(this.primary, vermilionUserResourcePhotos.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, display, type, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VermilionUserResourcePhotos {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

