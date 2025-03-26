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
import com.factset.sdk.ProcuretoPayAPISCIM.models.GroupResourceMember;
import com.factset.sdk.ProcuretoPayAPISCIM.models.GroupResourceMeta;
import com.factset.sdk.ProcuretoPayAPISCIM.models.GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group;
import com.factset.sdk.ProcuretoPayAPISCIM.models.GroupResourceUrnScimSchemasExtensionFactSetVRS10Group;
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
 * GroupResource
 */
@JsonPropertyOrder({
  GroupResource.JSON_PROPERTY_SCHEMAS,
  GroupResource.JSON_PROPERTY_ID,
  GroupResource.JSON_PROPERTY_EXTERNAL_ID,
  GroupResource.JSON_PROPERTY_DISPLAY_NAME,
  GroupResource.JSON_PROPERTY_DESCRIPTION,
  GroupResource.JSON_PROPERTY_MEMBERS,
  GroupResource.JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_FACT_SET_COLON_ENTERPRISE_HOSTING_COLON10_COLON_GROUP,
  GroupResource.JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_FACT_SET_COLON_V_R_S_COLON10_COLON_GROUP,
  GroupResource.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GroupResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private java.util.List<String> schemas = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MEMBERS = "members";
  private java.util.List<GroupResourceMember> members = null;

  public static final String JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_FACT_SET_COLON_ENTERPRISE_HOSTING_COLON10_COLON_GROUP = "urn:scim:schemas:extension:FactSet:EnterpriseHosting:1.0:Group";
  private GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup;

  public static final String JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_FACT_SET_COLON_V_R_S_COLON10_COLON_GROUP = "urn:scim:schemas:extension:FactSet:VRS:1.0:Group";
  private GroupResourceUrnScimSchemasExtensionFactSetVRS10Group urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup;

  public static final String JSON_PROPERTY_META = "meta";
  private GroupResourceMeta meta;

  public GroupResource() { 
  }

  @JsonCreator
  public GroupResource(
    @JsonProperty(JSON_PROPERTY_ID) String id
  ) {
    this();
    this.id = id;
  }

  public GroupResource schemas(java.util.List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public GroupResource addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new java.util.ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"urn:ietf:params:scim:schemas:core:2.0:Group\",\"urn:scim:schemas:extension:FactSet:EnterpriseHosting:1.0:Group\",\"urn:scim:schemas:extension:FactSet:VRS:1.0:Group\"]", value = "")
  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSchemas() {
    return schemas;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemas(java.util.List<String> schemas) {
    this.schemas = schemas;
  }


   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "eh:btud:Pod 04 - CitrixApps - Cymba OMS", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public GroupResource externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters.
   * @return externalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "B8FE8BBD-0E04-40B2-9BB3-E5EE17C4C9C9", value = "An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public GroupResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * A human-readable name for the Group.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Domain btud - Pod 04 - CitrixApps - Cymba OMS", value = "A human-readable name for the Group.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GroupResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for the Group.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Group representing access to the Cymba OMS application.", value = "A description for the Group.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public GroupResource members(java.util.List<GroupResourceMember> members) {
    this.members = members;
    return this;
  }

  public GroupResource addMembersItem(GroupResourceMember membersItem) {
    if (this.members == null) {
      this.members = new java.util.ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * A list of members of the Group.
   * @return members
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A list of members of the Group.")
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<GroupResourceMember> getMembers() {
    return members;
  }


  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMembers(java.util.List<GroupResourceMember> members) {
    this.members = members;
  }


  public GroupResource urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup(GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup) {
    this.urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup = urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup;
    return this;
  }

   /**
   * Get urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup
   * @return urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_FACT_SET_COLON_ENTERPRISE_HOSTING_COLON10_COLON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group getUrnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup() {
    return urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup;
  }


  @JsonProperty(JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_FACT_SET_COLON_ENTERPRISE_HOSTING_COLON10_COLON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup(GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup) {
    this.urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup = urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup;
  }


  public GroupResource urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup(GroupResourceUrnScimSchemasExtensionFactSetVRS10Group urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup) {
    this.urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup = urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup;
    return this;
  }

   /**
   * Get urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup
   * @return urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_FACT_SET_COLON_V_R_S_COLON10_COLON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupResourceUrnScimSchemasExtensionFactSetVRS10Group getUrnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup() {
    return urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup;
  }


  @JsonProperty(JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_FACT_SET_COLON_V_R_S_COLON10_COLON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup(GroupResourceUrnScimSchemasExtensionFactSetVRS10Group urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup) {
    this.urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup = urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup;
  }


  public GroupResource meta(GroupResourceMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupResourceMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(GroupResourceMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this GroupResource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupResource groupResource = (GroupResource) o;
    return Objects.equals(this.schemas, groupResource.schemas) &&
        Objects.equals(this.id, groupResource.id) &&
        Objects.equals(this.externalId, groupResource.externalId) &&
        Objects.equals(this.displayName, groupResource.displayName) &&
        Objects.equals(this.description, groupResource.description) &&
        Objects.equals(this.members, groupResource.members) &&
        Objects.equals(this.urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup, groupResource.urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup) &&
        Objects.equals(this.urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup, groupResource.urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup) &&
        Objects.equals(this.meta, groupResource.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, externalId, displayName, description, members, urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup, urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupResource {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup: ").append(toIndentedString(urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup)).append("\n");
    sb.append("    urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup: ").append(toIndentedString(urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

