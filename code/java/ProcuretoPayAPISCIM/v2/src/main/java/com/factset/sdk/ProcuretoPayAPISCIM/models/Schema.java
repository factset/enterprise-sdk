/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
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
import com.factset.sdk.ProcuretoPayAPISCIM.models.SchemaAttributes;
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
 * Schema
 */
@JsonPropertyOrder({
  Schema.JSON_PROPERTY_ID,
  Schema.JSON_PROPERTY_NAME,
  Schema.JSON_PROPERTY_DESCRIPTION,
  Schema.JSON_PROPERTY_ATTRIBUTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Schema implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private java.util.List<SchemaAttributes> attributes = new java.util.ArrayList<>();

  public Schema() { 
  }

  @JsonCreator
  public Schema(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description, 
    @JsonProperty(JSON_PROPERTY_ATTRIBUTES) java.util.List<SchemaAttributes> attributes
  ) {
    this();
    this.id = id;
    this.name = name;
    this.description = description;
    this.attributes = attributes;
  }

   /**
   * The unique URI of the schema. When applicable, service providers MUST specify the URI.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "urn:scim:schemas:extension:FactSet:Core:1.0:User", required = true, value = "The unique URI of the schema. When applicable, service providers MUST specify the URI.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }




   /**
   * The schema&#39;s human-readable name.  When applicable, service providers MUST specify the name, e.g., &#39;User&#39;.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FactSet Core User", required = true, value = "The schema's human-readable name.  When applicable, service providers MUST specify the name, e.g., 'User'.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }




   /**
   * The schema&#39;s human-readable name.  When applicable, service providers MUST specify the name, e.g., &#39;User&#39;.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FactSet core user details", value = "The schema's human-readable name.  When applicable, service providers MUST specify the name, e.g., 'User'.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }




   /**
   * A complex attribute that includes the attributes of a schema.
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{\"name\":\"username\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A FactSet \\\"username\\\" is FactSet's logical structure for grouping serial numbers into like-groups based on roleName, geographical location or line of business.\",\"required\":true,\"caseExact\":false,\"mutability\":\"immutable\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"serialNumber\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A serial number represents an individual's unique FactSet account identifier and base-workstation access. Serial numbers are allocated to an individual when a valid RoleName is present.\",\"required\":false,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"global\"},{\"name\":\"factSetNetId\",\"type\":\"string\",\"multiValued\":false,\"description\":\"FactSet.net ID.\",\"required\":false,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"global\"},{\"name\":\"locationId\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Your reference to a distinct physical location in your organization (such as an office)\",\"required\":true,\"caseExact\":false,\"mutability\":\"readWrite\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"roleName\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Predetermined role of specific individual. Issues individual a base FactSet workstation and serial number. If passed as NULL a base-FactSet workstation will be allocated to the individual granting the individual a FactSet SerialNumber\",\"required\":false,\"caseExact\":false,\"mutability\":\"readWrite\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"productIds\",\"type\":\"integer\",\"multiValued\":true,\"description\":\"An array of FactSet products to allocate/remove from an individual. Individual must have a FactSet serial number associated with them.\",\"required\":false,\"mutability\":\"readWrite\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"assertionValue\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Field containing the value, passed as nameID, used to assert the identity of an individual via SAML2.0 which maps service-provider-side to a FactSet serial number. Only applicable to individuals with a FactSet serial number with a Federation setup between your domain and FactSet's\",\"required\":false,\"caseExact\":false,\"mutability\":\"readWrite\",\"returned\":\"default\",\"uniqueness\":\"server\"}]", required = true, value = "A complex attribute that includes the attributes of a schema.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<SchemaAttributes> getAttributes() {
    return attributes;
  }




  /**
   * Return true if this Schema object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schema schema = (Schema) o;
    return Objects.equals(this.id, schema.id) &&
        Objects.equals(this.name, schema.name) &&
        Objects.equals(this.description, schema.description) &&
        Objects.equals(this.attributes, schema.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

