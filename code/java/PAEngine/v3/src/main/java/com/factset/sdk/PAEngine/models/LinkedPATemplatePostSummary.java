/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
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
 * LinkedPATemplatePostSummary
 */
@JsonPropertyOrder({
  LinkedPATemplatePostSummary.JSON_PROPERTY_ID,
  LinkedPATemplatePostSummary.JSON_PROPERTY_DESCRIPTION,
  LinkedPATemplatePostSummary.JSON_PROPERTY_NAME,
  LinkedPATemplatePostSummary.JSON_PROPERTY_PARENT_COMPONENT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkedPATemplatePostSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARENT_COMPONENT_ID = "parentComponentId";
  private JsonNullable<String> parentComponentId = JsonNullable.<String>undefined();

  public LinkedPATemplatePostSummary() { 
  }

  public LinkedPATemplatePostSummary id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Template id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template id.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public LinkedPATemplatePostSummary description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Template description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template description.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public LinkedPATemplatePostSummary name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Template name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template name.")
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


  public LinkedPATemplatePostSummary parentComponentId(String parentComponentId) {
    this.parentComponentId = JsonNullable.<String>of(parentComponentId);
    return this;
  }

   /**
   * Template parent tile.
   * @return parentComponentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template parent tile.")
  @JsonIgnore

  public String getParentComponentId() {
        return parentComponentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_COMPONENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getParentComponentId_JsonNullable() {
    return parentComponentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_COMPONENT_ID)
  public void setParentComponentId_JsonNullable(JsonNullable<String> parentComponentId) {
    this.parentComponentId = parentComponentId;
  }

  public void setParentComponentId(String parentComponentId) {
    this.parentComponentId = JsonNullable.<String>of(parentComponentId);
  }


  /**
   * Return true if this LinkedPATemplatePostSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedPATemplatePostSummary linkedPATemplatePostSummary = (LinkedPATemplatePostSummary) o;
    return equalsNullable(this.id, linkedPATemplatePostSummary.id) &&
        equalsNullable(this.description, linkedPATemplatePostSummary.description) &&
        equalsNullable(this.name, linkedPATemplatePostSummary.name) &&
        equalsNullable(this.parentComponentId, linkedPATemplatePostSummary.parentComponentId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(description), hashCodeNullable(name), hashCodeNullable(parentComponentId));
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
    sb.append("class LinkedPATemplatePostSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentComponentId: ").append(toIndentedString(parentComponentId)).append("\n");
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

