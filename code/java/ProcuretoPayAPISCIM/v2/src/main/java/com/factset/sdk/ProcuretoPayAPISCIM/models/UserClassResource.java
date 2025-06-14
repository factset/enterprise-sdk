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
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserClassResourceMeta;
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserPositionResourceReference;
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
 * UserClassResource
 */
@JsonPropertyOrder({
  UserClassResource.JSON_PROPERTY_SCHEMAS,
  UserClassResource.JSON_PROPERTY_ID,
  UserClassResource.JSON_PROPERTY_NAME,
  UserClassResource.JSON_PROPERTY_USER_POSITIONS,
  UserClassResource.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UserClassResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private java.util.List<String> schemas = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_USER_POSITIONS = "userPositions";
  private java.util.List<UserPositionResourceReference> userPositions = null;

  public static final String JSON_PROPERTY_META = "meta";
  private UserClassResourceMeta meta;

  public UserClassResource() { 
  }

  @JsonCreator
  public UserClassResource(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
    this();
    this.id = id;
    this.name = name;
  }

  public UserClassResource schemas(java.util.List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public UserClassResource addSchemasItem(String schemasItem) {
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
  @ApiModelProperty(example = "[\"urn:scim:schemas:extension:FactSet:Core:1.0:UserClass\"]", value = "")
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
  @ApiModelProperty(example = "4", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Name of the user class.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Trading", required = true, value = "Name of the user class.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }




  public UserClassResource userPositions(java.util.List<UserPositionResourceReference> userPositions) {
    this.userPositions = userPositions;
    return this;
  }

  public UserClassResource addUserPositionsItem(UserPositionResourceReference userPositionsItem) {
    if (this.userPositions == null) {
      this.userPositions = new java.util.ArrayList<>();
    }
    this.userPositions.add(userPositionsItem);
    return this;
  }

   /**
   * The user positions available to this user class.
   * @return userPositions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[{\"value\":\"0\",\"$ref\":\"https://api.factset.com/scim/v2/UserPositions/0\",\"display\":\"Pending Assignment\"},{\"value\":\"3\",\"$ref\":\"https://api.factset.com/scim/v2/UserPositions/3\",\"display\":\"Other\"},{\"value\":\"30\",\"$ref\":\"https://api.factset.com/scim/v2/UserPositions/30\",\"display\":\"Head Trader\"},{\"value\":\"31\",\"$ref\":\"https://api.factset.com/scim/v2/UserPositions/31\",\"display\":\"Trader\"},{\"value\":\"68\",\"$ref\":\"https://api.factset.com/scim/v2/UserPositions/68\",\"display\":\"Assistant\"}]", value = "The user positions available to this user class.")
  @JsonProperty(JSON_PROPERTY_USER_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<UserPositionResourceReference> getUserPositions() {
    return userPositions;
  }


  @JsonProperty(JSON_PROPERTY_USER_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserPositions(java.util.List<UserPositionResourceReference> userPositions) {
    this.userPositions = userPositions;
  }


  public UserClassResource meta(UserClassResourceMeta meta) {
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

  public UserClassResourceMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(UserClassResourceMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this UserClassResource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserClassResource userClassResource = (UserClassResource) o;
    return Objects.equals(this.schemas, userClassResource.schemas) &&
        Objects.equals(this.id, userClassResource.id) &&
        Objects.equals(this.name, userClassResource.name) &&
        Objects.equals(this.userPositions, userClassResource.userPositions) &&
        Objects.equals(this.meta, userClassResource.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, name, userPositions, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserClassResource {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userPositions: ").append(toIndentedString(userPositions)).append("\n");
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

