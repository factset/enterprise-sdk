/*
 * Open:FactSet Marketplace API
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenFactSetMarketplace.models;

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
import com.factset.sdk.OpenFactSetMarketplace.JSON;


/**
 * Attribute group object
 */
@ApiModel(description = "Attribute group object")
@JsonPropertyOrder({
  AttributesGroupsItem.JSON_PROPERTY_KEY,
  AttributesGroupsItem.JSON_PROPERTY_VALUE,
  AttributesGroupsItem.JSON_PROPERTY_IS_PREVIEW_TAG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AttributesGroupsItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_IS_PREVIEW_TAG = "isPreviewTag";
  private Boolean isPreviewTag;

  public AttributesGroupsItem() { 
  }

  public AttributesGroupsItem key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Attribute group key, corresponding to a category of attributes. For example, &#39;Region&#39; or &#39;History&#39;.
   * @return key
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Region", value = "Attribute group key, corresponding to a category of attributes. For example, 'Region' or 'History'.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public AttributesGroupsItem value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Attribute group value, corresponding to a specific attribute within the category. For example, &#39;North America&#39; or &#39;10 + years&#39;.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "North America", value = "Attribute group value, corresponding to a specific attribute within the category. For example, 'North America' or '10 + years'.")
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


  public AttributesGroupsItem isPreviewTag(Boolean isPreviewTag) {
    this.isPreviewTag = isPreviewTag;
    return this;
  }

   /**
   * Boolean flag indicating whether the attribute&#39;s value is displayed on the product&#39;s card within the Open:FactSet Marketplace.
   * @return isPreviewTag
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Boolean flag indicating whether the attribute's value is displayed on the product's card within the Open:FactSet Marketplace.")
  @JsonProperty(JSON_PROPERTY_IS_PREVIEW_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPreviewTag() {
    return isPreviewTag;
  }


  @JsonProperty(JSON_PROPERTY_IS_PREVIEW_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPreviewTag(Boolean isPreviewTag) {
    this.isPreviewTag = isPreviewTag;
  }


  /**
   * Return true if this AttributesGroupsItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributesGroupsItem attributesGroupsItem = (AttributesGroupsItem) o;
    return Objects.equals(this.key, attributesGroupsItem.key) &&
        Objects.equals(this.value, attributesGroupsItem.value) &&
        Objects.equals(this.isPreviewTag, attributesGroupsItem.isPreviewTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, isPreviewTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributesGroupsItem {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isPreviewTag: ").append(toIndentedString(isPreviewTag)).append("\n");
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

