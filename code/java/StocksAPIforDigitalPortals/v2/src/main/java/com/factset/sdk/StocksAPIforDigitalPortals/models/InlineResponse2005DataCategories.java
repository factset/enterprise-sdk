/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataParent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * InlineResponse2005DataCategories
 */
@JsonPropertyOrder({
  InlineResponse2005DataCategories.JSON_PROPERTY_ID,
  InlineResponse2005DataCategories.JSON_PROPERTY_NAME,
  InlineResponse2005DataCategories.JSON_PROPERTY_PARENT,
  InlineResponse2005DataCategories.JSON_PROPERTY_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataCategories implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private InlineResponse2005DataParent parent;

  public static final String JSON_PROPERTY_COUNT = "count";
  private BigDecimal count;

  public InlineResponse2005DataCategories() { 
  }

  public InlineResponse2005DataCategories id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a category.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a category.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public InlineResponse2005DataCategories name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the category.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the category.")
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


  public InlineResponse2005DataCategories parent(InlineResponse2005DataParent parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataParent getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(InlineResponse2005DataParent parent) {
    this.parent = parent;
  }


  public InlineResponse2005DataCategories count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Number of notations.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of notations.")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(BigDecimal count) {
    this.count = count;
  }


  /**
   * Return true if this inline_response_200_5_data_categories object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataCategories inlineResponse2005DataCategories = (InlineResponse2005DataCategories) o;
    return Objects.equals(this.id, inlineResponse2005DataCategories.id) &&
        Objects.equals(this.name, inlineResponse2005DataCategories.name) &&
        Objects.equals(this.parent, inlineResponse2005DataCategories.parent) &&
        Objects.equals(this.count, inlineResponse2005DataCategories.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parent, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataCategories {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

