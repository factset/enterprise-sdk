/*
 * StreetAccount API
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StreetAccountNews.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StreetAccountNews.models.StructuredFiltersChildrenObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StreetAccountNews.JSON;


/**
 * StructuredFiltersSectorsObject
 */
@JsonPropertyOrder({
  StructuredFiltersSectorsObject.JSON_PROPERTY_NAME,
  StructuredFiltersSectorsObject.JSON_PROPERTY_EXPANDED,
  StructuredFiltersSectorsObject.JSON_PROPERTY_CHILDREN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StructuredFiltersSectorsObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EXPANDED = "expanded";
  private Boolean expanded;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private java.util.List<StructuredFiltersChildrenObject> children = null;

  public StructuredFiltersSectorsObject() { 
  }

  public StructuredFiltersSectorsObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public StructuredFiltersSectorsObject expanded(Boolean expanded) {
    this.expanded = expanded;
    return this;
  }

   /**
   * Get expanded
   * @return expanded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPANDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExpanded() {
    return expanded;
  }


  @JsonProperty(JSON_PROPERTY_EXPANDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpanded(Boolean expanded) {
    this.expanded = expanded;
  }


  public StructuredFiltersSectorsObject children(java.util.List<StructuredFiltersChildrenObject> children) {
    this.children = children;
    return this;
  }

  public StructuredFiltersSectorsObject addChildrenItem(StructuredFiltersChildrenObject childrenItem) {
    if (this.children == null) {
      this.children = new java.util.ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<StructuredFiltersChildrenObject> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(java.util.List<StructuredFiltersChildrenObject> children) {
    this.children = children;
  }


  /**
   * Return true if this structuredFiltersSectorsObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredFiltersSectorsObject structuredFiltersSectorsObject = (StructuredFiltersSectorsObject) o;
    return Objects.equals(this.name, structuredFiltersSectorsObject.name) &&
        Objects.equals(this.expanded, structuredFiltersSectorsObject.expanded) &&
        Objects.equals(this.children, structuredFiltersSectorsObject.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expanded, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredFiltersSectorsObject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expanded: ").append(toIndentedString(expanded)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
