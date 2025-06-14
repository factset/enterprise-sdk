/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
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
import com.factset.sdk.ProcuretoPayAPISCIM.models.FileManagerAuditItemAdditionalPropertyEntity;
import com.factset.sdk.ProcuretoPayAPISCIM.models.FileManagerAuditItemAdditionalPropertyPermissionOverride;
import com.factset.sdk.ProcuretoPayAPISCIM.models.FileManagerAuditItemAdditionalPropertyPermissions;
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
 * Attributes of the file.
 */
@ApiModel(description = "Attributes of the file.")
@JsonPropertyOrder({
  FileManagerAuditItemAdditionalProperty.JSON_PROPERTY_ENTITY,
  FileManagerAuditItemAdditionalProperty.JSON_PROPERTY_PERMISSIONS,
  FileManagerAuditItemAdditionalProperty.JSON_PROPERTY_PERMISSION_OVERRIDE,
  FileManagerAuditItemAdditionalProperty.JSON_PROPERTY_INHERITANCE_DISTANCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FileManagerAuditItemAdditionalProperty implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private FileManagerAuditItemAdditionalPropertyEntity entity;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private FileManagerAuditItemAdditionalPropertyPermissions permissions;

  public static final String JSON_PROPERTY_PERMISSION_OVERRIDE = "permission-override";
  private FileManagerAuditItemAdditionalPropertyPermissionOverride permissionOverride;

  public static final String JSON_PROPERTY_INHERITANCE_DISTANCE = "inheritance-distance";
  private Integer inheritanceDistance;

  public FileManagerAuditItemAdditionalProperty() { 
  }

  @JsonCreator
  public FileManagerAuditItemAdditionalProperty(
    @JsonProperty(value=JSON_PROPERTY_ENTITY, required=true) FileManagerAuditItemAdditionalPropertyEntity entity, 
    @JsonProperty(value=JSON_PROPERTY_PERMISSIONS, required=true) FileManagerAuditItemAdditionalPropertyPermissions permissions
  ) {
    this();
    this.entity = entity;
    this.permissions = permissions;
  }

  public FileManagerAuditItemAdditionalProperty entity(FileManagerAuditItemAdditionalPropertyEntity entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileManagerAuditItemAdditionalPropertyEntity getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntity(FileManagerAuditItemAdditionalPropertyEntity entity) {
    this.entity = entity;
  }


  public FileManagerAuditItemAdditionalProperty permissions(FileManagerAuditItemAdditionalPropertyPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileManagerAuditItemAdditionalPropertyPermissions getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermissions(FileManagerAuditItemAdditionalPropertyPermissions permissions) {
    this.permissions = permissions;
  }


  public FileManagerAuditItemAdditionalProperty permissionOverride(FileManagerAuditItemAdditionalPropertyPermissionOverride permissionOverride) {
    this.permissionOverride = permissionOverride;
    return this;
  }

   /**
   * Get permissionOverride
   * @return permissionOverride
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSION_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileManagerAuditItemAdditionalPropertyPermissionOverride getPermissionOverride() {
    return permissionOverride;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissionOverride(FileManagerAuditItemAdditionalPropertyPermissionOverride permissionOverride) {
    this.permissionOverride = permissionOverride;
  }


  public FileManagerAuditItemAdditionalProperty inheritanceDistance(Integer inheritanceDistance) {
    this.inheritanceDistance = inheritanceDistance;
    return this;
  }

   /**
   * Get inheritanceDistance
   * @return inheritanceDistance
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INHERITANCE_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInheritanceDistance() {
    return inheritanceDistance;
  }


  @JsonProperty(JSON_PROPERTY_INHERITANCE_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInheritanceDistance(Integer inheritanceDistance) {
    this.inheritanceDistance = inheritanceDistance;
  }


  /**
   * Return true if this FileManagerAuditItemAdditionalProperty object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileManagerAuditItemAdditionalProperty fileManagerAuditItemAdditionalProperty = (FileManagerAuditItemAdditionalProperty) o;
    return Objects.equals(this.entity, fileManagerAuditItemAdditionalProperty.entity) &&
        Objects.equals(this.permissions, fileManagerAuditItemAdditionalProperty.permissions) &&
        Objects.equals(this.permissionOverride, fileManagerAuditItemAdditionalProperty.permissionOverride) &&
        Objects.equals(this.inheritanceDistance, fileManagerAuditItemAdditionalProperty.inheritanceDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, permissions, permissionOverride, inheritanceDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileManagerAuditItemAdditionalProperty {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    permissionOverride: ").append(toIndentedString(permissionOverride)).append("\n");
    sb.append("    inheritanceDistance: ").append(toIndentedString(inheritanceDistance)).append("\n");
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

