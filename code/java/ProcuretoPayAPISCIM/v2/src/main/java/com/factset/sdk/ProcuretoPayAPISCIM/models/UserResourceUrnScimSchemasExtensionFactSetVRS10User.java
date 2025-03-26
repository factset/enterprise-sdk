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
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserResourceVRSDomainData;
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
 * UserResourceUrnScimSchemasExtensionFactSetVRS10User
 */
@JsonPropertyOrder({
  UserResourceUrnScimSchemasExtensionFactSetVRS10User.JSON_PROPERTY_DOMAIN_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UserResourceUrnScimSchemasExtensionFactSetVRS10User implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DOMAIN_DATA = "domainData";
  private java.util.List<UserResourceVRSDomainData> domainData = null;

  public UserResourceUrnScimSchemasExtensionFactSetVRS10User() { 
  }

  public UserResourceUrnScimSchemasExtensionFactSetVRS10User domainData(java.util.List<UserResourceVRSDomainData> domainData) {
    this.domainData = domainData;
    return this;
  }

  public UserResourceUrnScimSchemasExtensionFactSetVRS10User addDomainDataItem(UserResourceVRSDomainData domainDataItem) {
    if (this.domainData == null) {
      this.domainData = new java.util.ArrayList<>();
    }
    this.domainData.add(domainDataItem);
    return this;
  }

   /**
   * A set of attributes pertaining to individual Vermilion domains.
   * @return domainData
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A set of attributes pertaining to individual Vermilion domains.")
  @JsonProperty(JSON_PROPERTY_DOMAIN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<UserResourceVRSDomainData> getDomainData() {
    return domainData;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainData(java.util.List<UserResourceVRSDomainData> domainData) {
    this.domainData = domainData;
  }


  /**
   * Return true if this UserResource_urn_scim_schemas_extension_FactSet_VRS_1_0_User object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResourceUrnScimSchemasExtensionFactSetVRS10User userResourceUrnScimSchemasExtensionFactSetVRS10User = (UserResourceUrnScimSchemasExtensionFactSetVRS10User) o;
    return Objects.equals(this.domainData, userResourceUrnScimSchemasExtensionFactSetVRS10User.domainData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResourceUrnScimSchemasExtensionFactSetVRS10User {\n");
    sb.append("    domainData: ").append(toIndentedString(domainData)).append("\n");
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

