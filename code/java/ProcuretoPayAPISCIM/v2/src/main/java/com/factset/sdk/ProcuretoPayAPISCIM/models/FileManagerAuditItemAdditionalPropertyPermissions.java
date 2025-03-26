/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.3.0
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
 * Object describing the permissions the associated entity has regarding the associated file.
 */
@ApiModel(description = "Object describing the permissions the associated entity has regarding the associated file.")
@JsonPropertyOrder({
  FileManagerAuditItemAdditionalPropertyPermissions.JSON_PROPERTY_READ,
  FileManagerAuditItemAdditionalPropertyPermissions.JSON_PROPERTY_WRITE,
  FileManagerAuditItemAdditionalPropertyPermissions.JSON_PROPERTY_MAINTAIN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FileManagerAuditItemAdditionalPropertyPermissions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_READ = "read";
  private Boolean read;

  public static final String JSON_PROPERTY_WRITE = "write";
  private Boolean write;

  public static final String JSON_PROPERTY_MAINTAIN = "maintain";
  private Boolean maintain;

  public FileManagerAuditItemAdditionalPropertyPermissions() { 
  }

  @JsonCreator
  public FileManagerAuditItemAdditionalPropertyPermissions(
    @JsonProperty(value=JSON_PROPERTY_READ, required=true) Boolean read, 
    @JsonProperty(value=JSON_PROPERTY_WRITE, required=true) Boolean write, 
    @JsonProperty(value=JSON_PROPERTY_MAINTAIN, required=true) Boolean maintain
  ) {
    this();
    this.read = read;
    this.write = write;
    this.maintain = maintain;
  }

  public FileManagerAuditItemAdditionalPropertyPermissions read(Boolean read) {
    this.read = read;
    return this;
  }

   /**
   * Whether the associated entity has permission to read the associated file.
   * @return read
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the associated entity has permission to read the associated file.")
  @JsonProperty(JSON_PROPERTY_READ)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRead() {
    return read;
  }


  @JsonProperty(JSON_PROPERTY_READ)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRead(Boolean read) {
    this.read = read;
  }


  public FileManagerAuditItemAdditionalPropertyPermissions write(Boolean write) {
    this.write = write;
    return this;
  }

   /**
   * Whether the associated entity has permission to write the associated file.
   * @return write
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the associated entity has permission to write the associated file.")
  @JsonProperty(JSON_PROPERTY_WRITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getWrite() {
    return write;
  }


  @JsonProperty(JSON_PROPERTY_WRITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWrite(Boolean write) {
    this.write = write;
  }


  public FileManagerAuditItemAdditionalPropertyPermissions maintain(Boolean maintain) {
    this.maintain = maintain;
    return this;
  }

   /**
   * Whether the associated entity has permission to maintain the associated file.
   * @return maintain
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the associated entity has permission to maintain the associated file.")
  @JsonProperty(JSON_PROPERTY_MAINTAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMaintain() {
    return maintain;
  }


  @JsonProperty(JSON_PROPERTY_MAINTAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaintain(Boolean maintain) {
    this.maintain = maintain;
  }


  /**
   * Return true if this FileManagerAuditItemAdditionalProperty_permissions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileManagerAuditItemAdditionalPropertyPermissions fileManagerAuditItemAdditionalPropertyPermissions = (FileManagerAuditItemAdditionalPropertyPermissions) o;
    return Objects.equals(this.read, fileManagerAuditItemAdditionalPropertyPermissions.read) &&
        Objects.equals(this.write, fileManagerAuditItemAdditionalPropertyPermissions.write) &&
        Objects.equals(this.maintain, fileManagerAuditItemAdditionalPropertyPermissions.maintain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read, write, maintain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileManagerAuditItemAdditionalPropertyPermissions {\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
    sb.append("    maintain: ").append(toIndentedString(maintain)).append("\n");
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

