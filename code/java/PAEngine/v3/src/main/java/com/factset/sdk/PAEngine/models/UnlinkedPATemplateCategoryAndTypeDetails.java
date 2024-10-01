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
import com.factset.sdk.PAEngine.models.UnlinkedPATemplateColumnDetails;
import com.factset.sdk.PAEngine.models.UnlinkedPATemplateGroupDetails;
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
 * UnlinkedPATemplateCategoryAndTypeDetails
 */
@JsonPropertyOrder({
  UnlinkedPATemplateCategoryAndTypeDetails.JSON_PROPERTY_ID,
  UnlinkedPATemplateCategoryAndTypeDetails.JSON_PROPERTY_COLUMNS,
  UnlinkedPATemplateCategoryAndTypeDetails.JSON_PROPERTY_GROUPS,
  UnlinkedPATemplateCategoryAndTypeDetails.JSON_PROPERTY_SNAPSHOT,
  UnlinkedPATemplateCategoryAndTypeDetails.JSON_PROPERTY_CATEGORY,
  UnlinkedPATemplateCategoryAndTypeDetails.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UnlinkedPATemplateCategoryAndTypeDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private JsonNullable<java.util.List<UnlinkedPATemplateColumnDetails>> columns = JsonNullable.<java.util.List<UnlinkedPATemplateColumnDetails>>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private JsonNullable<java.util.List<UnlinkedPATemplateGroupDetails>> groups = JsonNullable.<java.util.List<UnlinkedPATemplateGroupDetails>>undefined();

  public static final String JSON_PROPERTY_SNAPSHOT = "snapshot";
  private Boolean snapshot;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public UnlinkedPATemplateCategoryAndTypeDetails() { 
  }

  public UnlinkedPATemplateCategoryAndTypeDetails id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Type Id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Type Id")
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


  public UnlinkedPATemplateCategoryAndTypeDetails columns(java.util.List<UnlinkedPATemplateColumnDetails> columns) {
    this.columns = JsonNullable.<java.util.List<UnlinkedPATemplateColumnDetails>>of(columns);
    return this;
  }

  public UnlinkedPATemplateCategoryAndTypeDetails addColumnsItem(UnlinkedPATemplateColumnDetails columnsItem) {
    if (this.columns == null || !this.columns.isPresent()) {
      this.columns = JsonNullable.<java.util.List<UnlinkedPATemplateColumnDetails>>of(new java.util.ArrayList<>());
    }
    try {
      this.columns.get().add(columnsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of default columns
   * @return columns
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of default columns")
  @JsonIgnore

  public java.util.List<UnlinkedPATemplateColumnDetails> getColumns() {
        return columns.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<UnlinkedPATemplateColumnDetails>> getColumns_JsonNullable() {
    return columns;
  }
  
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  public void setColumns_JsonNullable(JsonNullable<java.util.List<UnlinkedPATemplateColumnDetails>> columns) {
    this.columns = columns;
  }

  public void setColumns(java.util.List<UnlinkedPATemplateColumnDetails> columns) {
    this.columns = JsonNullable.<java.util.List<UnlinkedPATemplateColumnDetails>>of(columns);
  }


  public UnlinkedPATemplateCategoryAndTypeDetails groups(java.util.List<UnlinkedPATemplateGroupDetails> groups) {
    this.groups = JsonNullable.<java.util.List<UnlinkedPATemplateGroupDetails>>of(groups);
    return this;
  }

  public UnlinkedPATemplateCategoryAndTypeDetails addGroupsItem(UnlinkedPATemplateGroupDetails groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<java.util.List<UnlinkedPATemplateGroupDetails>>of(new java.util.ArrayList<>());
    }
    try {
      this.groups.get().add(groupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of default groupings
   * @return groups
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of default groupings")
  @JsonIgnore

  public java.util.List<UnlinkedPATemplateGroupDetails> getGroups() {
        return groups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<UnlinkedPATemplateGroupDetails>> getGroups_JsonNullable() {
    return groups;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<java.util.List<UnlinkedPATemplateGroupDetails>> groups) {
    this.groups = groups;
  }

  public void setGroups(java.util.List<UnlinkedPATemplateGroupDetails> groups) {
    this.groups = JsonNullable.<java.util.List<UnlinkedPATemplateGroupDetails>>of(groups);
  }


  public UnlinkedPATemplateCategoryAndTypeDetails snapshot(Boolean snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Snapshot
   * @return snapshot
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Snapshot")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSnapshot() {
    return snapshot;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshot(Boolean snapshot) {
    this.snapshot = snapshot;
  }


  public UnlinkedPATemplateCategoryAndTypeDetails category(String category) {
    this.category = JsonNullable.<String>of(category);
    return this;
  }

   /**
   * Unlinked template category
   * @return category
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unlinked template category")
  @JsonIgnore

  public String getCategory() {
        return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCategory_JsonNullable() {
    return category;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<String> category) {
    this.category = category;
  }

  public void setCategory(String category) {
    this.category = JsonNullable.<String>of(category);
  }


  public UnlinkedPATemplateCategoryAndTypeDetails name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Unlinked template type
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unlinked template type")
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


  /**
   * Return true if this UnlinkedPATemplateCategoryAndTypeDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnlinkedPATemplateCategoryAndTypeDetails unlinkedPATemplateCategoryAndTypeDetails = (UnlinkedPATemplateCategoryAndTypeDetails) o;
    return equalsNullable(this.id, unlinkedPATemplateCategoryAndTypeDetails.id) &&
        equalsNullable(this.columns, unlinkedPATemplateCategoryAndTypeDetails.columns) &&
        equalsNullable(this.groups, unlinkedPATemplateCategoryAndTypeDetails.groups) &&
        Objects.equals(this.snapshot, unlinkedPATemplateCategoryAndTypeDetails.snapshot) &&
        equalsNullable(this.category, unlinkedPATemplateCategoryAndTypeDetails.category) &&
        equalsNullable(this.name, unlinkedPATemplateCategoryAndTypeDetails.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(columns), hashCodeNullable(groups), snapshot, hashCodeNullable(category), hashCodeNullable(name));
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
    sb.append("class UnlinkedPATemplateCategoryAndTypeDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

