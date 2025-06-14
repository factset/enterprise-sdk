/*
 * News API
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetNews.models;

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
import com.factset.sdk.FactSetNews.JSON;


/**
 * StructuredFiltersChildrenObject
 */
@JsonPropertyOrder({
  StructuredFiltersChildrenObject.JSON_PROPERTY_NAME,
  StructuredFiltersChildrenObject.JSON_PROPERTY_VALUE,
  StructuredFiltersChildrenObject.JSON_PROPERTY_PARENT_CONFIG,
  StructuredFiltersChildrenObject.JSON_PROPERTY_FIELD,
  StructuredFiltersChildrenObject.JSON_PROPERTY_OPERATOR,
  StructuredFiltersChildrenObject.JSON_PROPERTY_SOURCE,
  StructuredFiltersChildrenObject.JSON_PROPERTY_SOURCE_DISPLAY_NAMES,
  StructuredFiltersChildrenObject.JSON_PROPERTY_CHILDREN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StructuredFiltersChildrenObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private java.util.List<String> value = null;

  public static final String JSON_PROPERTY_PARENT_CONFIG = "parentConfig";
  private Boolean parentConfig;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private java.util.List<String> source = null;

  public static final String JSON_PROPERTY_SOURCE_DISPLAY_NAMES = "sourceDisplayNames";
  private java.util.List<String> sourceDisplayNames = null;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private java.util.List<StructuredFiltersChildrenObject> children = null;

  public StructuredFiltersChildrenObject() { 
  }

  public StructuredFiltersChildrenObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the child.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "AEM", value = "The name of the child.")
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


  public StructuredFiltersChildrenObject value(java.util.List<String> value) {
    this.value = value;
    return this;
  }

  public StructuredFiltersChildrenObject addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new java.util.ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(java.util.List<String> value) {
    this.value = value;
  }


  public StructuredFiltersChildrenObject parentConfig(Boolean parentConfig) {
    this.parentConfig = parentConfig;
    return this;
  }

   /**
   * Indicates if there&#39;s a parent configuration or not.
   * @return parentConfig
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates if there's a parent configuration or not.")
  @JsonProperty(JSON_PROPERTY_PARENT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getParentConfig() {
    return parentConfig;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentConfig(Boolean parentConfig) {
    this.parentConfig = parentConfig;
  }


  public StructuredFiltersChildrenObject field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The field associated with the child.
   * @return field
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "categories", value = "The field associated with the child.")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(String field) {
    this.field = field;
  }


  public StructuredFiltersChildrenObject operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The operator associated with the child.
   * @return operator
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "IN", value = "The operator associated with the child.")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperator(String operator) {
    this.operator = operator;
  }


  public StructuredFiltersChildrenObject source(java.util.List<String> source) {
    this.source = source;
    return this;
  }

  public StructuredFiltersChildrenObject addSourceItem(String sourceItem) {
    if (this.source == null) {
      this.source = new java.util.ArrayList<>();
    }
    this.source.add(sourceItem);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(java.util.List<String> source) {
    this.source = source;
  }


  public StructuredFiltersChildrenObject sourceDisplayNames(java.util.List<String> sourceDisplayNames) {
    this.sourceDisplayNames = sourceDisplayNames;
    return this;
  }

  public StructuredFiltersChildrenObject addSourceDisplayNamesItem(String sourceDisplayNamesItem) {
    if (this.sourceDisplayNames == null) {
      this.sourceDisplayNames = new java.util.ArrayList<>();
    }
    this.sourceDisplayNames.add(sourceDisplayNamesItem);
    return this;
  }

   /**
   * Get sourceDisplayNames
   * @return sourceDisplayNames
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_DISPLAY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSourceDisplayNames() {
    return sourceDisplayNames;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_DISPLAY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceDisplayNames(java.util.List<String> sourceDisplayNames) {
    this.sourceDisplayNames = sourceDisplayNames;
  }


  public StructuredFiltersChildrenObject children(java.util.List<StructuredFiltersChildrenObject> children) {
    this.children = children;
    return this;
  }

  public StructuredFiltersChildrenObject addChildrenItem(StructuredFiltersChildrenObject childrenItem) {
    if (this.children == null) {
      this.children = new java.util.ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * An array of children objects.
   * @return children
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An array of children objects.")
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
   * Return true if this StructuredFiltersChildrenObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredFiltersChildrenObject structuredFiltersChildrenObject = (StructuredFiltersChildrenObject) o;
    return Objects.equals(this.name, structuredFiltersChildrenObject.name) &&
        Objects.equals(this.value, structuredFiltersChildrenObject.value) &&
        Objects.equals(this.parentConfig, structuredFiltersChildrenObject.parentConfig) &&
        Objects.equals(this.field, structuredFiltersChildrenObject.field) &&
        Objects.equals(this.operator, structuredFiltersChildrenObject.operator) &&
        Objects.equals(this.source, structuredFiltersChildrenObject.source) &&
        Objects.equals(this.sourceDisplayNames, structuredFiltersChildrenObject.sourceDisplayNames) &&
        Objects.equals(this.children, structuredFiltersChildrenObject.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, parentConfig, field, operator, source, sourceDisplayNames, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredFiltersChildrenObject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    parentConfig: ").append(toIndentedString(parentConfig)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceDisplayNames: ").append(toIndentedString(sourceDisplayNames)).append("\n");
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

