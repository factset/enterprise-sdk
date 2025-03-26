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
import com.factset.sdk.ProcuretoPayAPISCIM.models.SchemaAttribute;
import com.factset.sdk.ProcuretoPayAPISCIM.models.SchemaMeta;
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
  Schema.JSON_PROPERTY_ATTRIBUTES,
  Schema.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Schema implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private java.util.List<SchemaAttribute> attributes = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private SchemaMeta meta;

  public Schema() { 
  }

  @JsonCreator
  public Schema(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description, 
    @JsonProperty(JSON_PROPERTY_ATTRIBUTES) java.util.List<SchemaAttribute> attributes
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
  @jakarta.annotation.Nonnull
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
  @jakarta.annotation.Nonnull
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[{\"name\":\"username\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A FactSet \\\"username\\\" is FactSet's logical structure for grouping serial numbers into like-groups based on roleName, geographical location or line of business.\",\"required\":true,\"caseExact\":false,\"mutability\":\"immutable\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"serialNumber\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A serial number represents an individual's unique FactSet account identifier and base-workstation access. Serial numbers are allocated to an individual when a valid RoleName is present.\",\"required\":false,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"global\"},{\"name\":\"location\",\"type\":\"complex\",\"multiValued\":false,\"description\":\"The physical location associated with this user.\",\"required\":false,\"subAttributes\":[{\"name\":\"value\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Identifier of the Location.\",\"required\":true,\"caseExact\":false,\"mutability\":\"readWrite\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"$ref\",\"type\":\"reference\",\"referenceTypes\":[\"Location\"],\"multiValued\":false,\"description\":\"The URI corresponding to a SCIM resource that is this Location.\",\"required\":false,\"caseExact\":false,\"mutability\":\"immutable\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"display\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A human-readable name, primarily used for display purposes.\",\"required\":false,\"caseExact\":false,\"mutability\":\"immutable\",\"returned\":\"default\",\"uniqueness\":\"none\"}],\"mutability\":\"readWrite\",\"returned\":\"default\"},{\"name\":\"userTaxonomyData\",\"type\":\"complex\",\"multiValued\":false,\"description\":\"FactSet's classification of the user. Use taxonomy is composed of a user class as well as a user position.\",\"required\":false,\"subAttributes\":[{\"name\":\"userClass\",\"type\":\"complex\",\"multiValued\":false,\"description\":\"FactSet's classification of the user's class. The set of available user classes is based on the firm description associated with the user's location.\",\"required\":true,\"subAttributes\":[{\"name\":\"value\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Identifier of the User Class.\",\"required\":true,\"caseExact\":false,\"mutability\":\"readWrite\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"$ref\",\"type\":\"reference\",\"referenceTypes\":[\"UserClass\"],\"multiValued\":false,\"description\":\"The URI corresponding to a SCIM resource that is this User Class.\",\"required\":false,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"display\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A human-readable name, primarily used for display purposes.\",\"required\":false,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"}],\"mutability\":\"readWrite\",\"returned\":\"default\"},{\"name\":\"userPosition\",\"type\":\"complex\",\"multiValued\":false,\"description\":\"FactSet's classification of the user's position. The set of available user positions is based on the user's class.\",\"required\":true,\"subAttributes\":[{\"name\":\"value\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Identifier of the User Position.\",\"required\":true,\"caseExact\":false,\"mutability\":\"readWrite\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"$ref\",\"type\":\"reference\",\"referenceTypes\":[\"UserPosition\"],\"multiValued\":false,\"description\":\"The URI corresponding to a SCIM resource that is this User Position.\",\"required\":false,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"display\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A human-readable name, primarily used for display purposes.\",\"required\":false,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"}],\"mutability\":\"readWrite\",\"returned\":\"default\"}],\"mutability\":\"readWrite\",\"returned\":\"default\"},{\"name\":\"roleName\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Predetermined role of specific individual. Issues individual a base FactSet workstation and serial number. If passed as NULL a base-FactSet workstation will be allocated to the individual granting the individual a FactSet SerialNumber\",\"required\":false,\"caseExact\":false,\"mutability\":\"readWrite\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"products\",\"type\":\"complex\",\"multiValued\":true,\"description\":\"An array of FactSet products to allocate/remove from an individual. Individual must have a FactSet serial number associated with them.\",\"required\":false,\"subAttributes\":[{\"name\":\"value\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Identifier of the product.\",\"required\":true,\"caseExact\":false,\"mutability\":\"immutable\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"$ref\",\"type\":\"reference\",\"referenceTypes\":[\"Product\"],\"multiValued\":false,\"description\":\"The URI corresponding to this product.\",\"required\":false,\"caseExact\":false,\"mutability\":\"immutable\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"display\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A human-readable name, primarily used for display purposes.\",\"required\":false,\"caseExact\":false,\"mutability\":\"immutable\",\"returned\":\"default\",\"uniqueness\":\"none\"}],\"mutability\":\"readWrite\",\"returned\":\"default\"},{\"name\":\"pendingProductOrders\",\"type\":\"complex\",\"multiValued\":true,\"description\":\"An array of pending FactSet product orders.\",\"required\":false,\"subAttributes\":[{\"name\":\"product\",\"type\":\"complex\",\"multiValued\":false,\"description\":\"The FactSet product referenced by the order.\",\"required\":true,\"subAttributes\":[{\"name\":\"value\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Identifier of the product.\",\"required\":true,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"$ref\",\"type\":\"reference\",\"referenceTypes\":[\"Product\"],\"multiValued\":false,\"description\":\"The URI corresponding to this product.\",\"required\":true,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"display\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A human-readable name, primarily used for display purposes.\",\"required\":true,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"}],\"mutability\":\"readOnly\",\"returned\":\"default\"},{\"name\":\"type\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Type of product order, e.g. ''Add'' or ''Remove''\",\"required\":true,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"status\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Status of the pending product order.\",\"required\":true,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"transactionCode\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A GUID that is the transaction code of the product order.\",\"required\":true,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"requested\",\"type\":\"dateTime\",\"multiValued\":false,\"description\":\"Date and time when product was ordered.\",\"required\":true,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"}],\"mutability\":\"readOnly\",\"returned\":\"default\"},{\"name\":\"federations\",\"type\":\"complex\",\"multiValued\":true,\"description\":\"References to the federations in which the user has at least one assertion value.\",\"required\":false,\"subAttributes\":[{\"name\":\"value\",\"type\":\"string\",\"multiValued\":false,\"description\":\"Identifier of the Federation.\",\"required\":true,\"caseExact\":false,\"mutability\":\"immutable\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"$ref\",\"type\":\"reference\",\"referenceTypes\":[\"Federation\"],\"multiValued\":false,\"description\":\"The URI corresponding to a SCIM resource that is this Federation.\",\"required\":false,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"display\",\"type\":\"string\",\"multiValued\":false,\"description\":\"A human-readable name, primarily used for display purposes.\",\"required\":false,\"caseExact\":false,\"mutability\":\"readOnly\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"assertionValues\",\"type\":\"complex\",\"multiValued\":true,\"description\":\"The assertion values the user has in this federation.\",\"required\":true,\"subAttributes\":[{\"name\":\"value\",\"type\":\"string\",\"multiValued\":false,\"description\":\"The assertion value string itself.\",\"required\":true,\"caseExact\":false,\"mutability\":\"immutable\",\"returned\":\"default\",\"uniqueness\":\"none\"}],\"mutability\":\"readWrite\",\"returned\":\"default\"}],\"mutability\":\"readWrite\",\"returned\":\"default\",\"uniqueness\":\"none\"},{\"name\":\"invoiceId\",\"type\":\"string\",\"multiValued\":false,\"description\":\"The identifier of the invoice that should be associated with a new user for billing purposes. Note once an invoice ID has been assigned to a user, it cannot be modified via this API. If invoice ID re-assignment is necessary, please contact your FactSet representative.\",\"required\":false,\"caseExact\":true,\"mutability\":\"immutable\",\"returned\":\"never\",\"uniqueness\":\"none\"}]", required = true, value = "A complex attribute that includes the attributes of a schema.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<SchemaAttribute> getAttributes() {
    return attributes;
  }




  public Schema meta(SchemaMeta meta) {
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

  public SchemaMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(SchemaMeta meta) {
    this.meta = meta;
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
        Objects.equals(this.attributes, schema.attributes) &&
        Objects.equals(this.meta, schema.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, attributes, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

