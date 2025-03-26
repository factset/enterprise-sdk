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
import com.factset.sdk.ProcuretoPayAPISCIM.models.ProductResourceMeta;
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
 * ProductResource
 */
@JsonPropertyOrder({
  ProductResource.JSON_PROPERTY_SCHEMAS,
  ProductResource.JSON_PROPERTY_ID,
  ProductResource.JSON_PROPERTY_NAME,
  ProductResource.JSON_PROPERTY_DESCRIPTION,
  ProductResource.JSON_PROPERTY_GROUP_DESCRIPTION,
  ProductResource.JSON_PROPERTY_WORKSTATION,
  ProductResource.JSON_PROPERTY_ORDERABLE,
  ProductResource.JSON_PROPERTY_REQUIRES_APPROVAL,
  ProductResource.JSON_PROPERTY_TRIAL_AVAILABLE,
  ProductResource.JSON_PROPERTY_WHITELIST,
  ProductResource.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ProductResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private java.util.List<String> schemas = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GROUP_DESCRIPTION = "groupDescription";
  private String groupDescription;

  public static final String JSON_PROPERTY_WORKSTATION = "workstation";
  private Boolean workstation;

  public static final String JSON_PROPERTY_ORDERABLE = "orderable";
  private Boolean orderable;

  /**
   * A description of the type of approval required before an order for this product can be fulfilled. This value is null for those products that do not require any approval.
   */
  public enum RequiresApprovalEnum {
    FACTSET("FactSet"),
    
    VENDOR("Vendor");

    private String value;

    RequiresApprovalEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RequiresApprovalEnum fromValue(String value) {
      for (RequiresApprovalEnum b : RequiresApprovalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REQUIRES_APPROVAL = "requiresApproval";
  private RequiresApprovalEnum requiresApproval;

  public static final String JSON_PROPERTY_TRIAL_AVAILABLE = "trialAvailable";
  private Boolean trialAvailable;

  public static final String JSON_PROPERTY_WHITELIST = "whitelist";
  private Boolean whitelist;

  public static final String JSON_PROPERTY_META = "meta";
  private ProductResourceMeta meta;

  public ProductResource() { 
  }

  @JsonCreator
  public ProductResource(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description, 
    @JsonProperty(JSON_PROPERTY_GROUP_DESCRIPTION) String groupDescription, 
    @JsonProperty(JSON_PROPERTY_WORKSTATION) Boolean workstation, 
    @JsonProperty(JSON_PROPERTY_ORDERABLE) Boolean orderable, 
    @JsonProperty(JSON_PROPERTY_REQUIRES_APPROVAL) RequiresApprovalEnum requiresApproval, 
    @JsonProperty(JSON_PROPERTY_TRIAL_AVAILABLE) Boolean trialAvailable, 
    @JsonProperty(JSON_PROPERTY_WHITELIST) Boolean whitelist
  ) {
    this();
    this.id = id;
    this.name = name;
    this.description = description;
    this.groupDescription = groupDescription;
    this.workstation = workstation;
    this.orderable = orderable;
    this.requiresApproval = requiresApproval;
    this.trialAvailable = trialAvailable;
    this.whitelist = whitelist;
  }

  public ProductResource schemas(java.util.List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public ProductResource addSchemasItem(String schemasItem) {
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
  @ApiModelProperty(example = "[\"urn:scim:schemas:extension:FactSet:Core:1.0:Product\"]", value = "")
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
  @ApiModelProperty(example = "6781", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Name of product.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FactSet Identity", value = "Name of product.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




   /**
   * Details of product.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "This workstation product will provide the user with a serial number and a \"blanket\" login. Examples of when this can be used is for web only users, notify clients, or to give users minimal access.", value = "Details of product.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }




   /**
   * Description of the group the product belongs in, e.g. Exchange, Product, Database, Workstation, etc.
   * @return groupDescription
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Workstations", value = "Description of the group the product belongs in, e.g. Exchange, Product, Database, Workstation, etc.")
  @JsonProperty(JSON_PROPERTY_GROUP_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupDescription() {
    return groupDescription;
  }




   /**
   * A boolean representing whether the product is base-level access to FactSet, issuing the individual&#39;s serial number. Only one Product \&quot;id\&quot; per individual will have this value set to true.
   * @return workstation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A boolean representing whether the product is base-level access to FactSet, issuing the individual's serial number. Only one Product \"id\" per individual will have this value set to true.")
  @JsonProperty(JSON_PROPERTY_WORKSTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWorkstation() {
    return workstation;
  }




   /**
   * Whether the product can be ordered by the current client.
   * @return orderable
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the product can be ordered by the current client.")
  @JsonProperty(JSON_PROPERTY_ORDERABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getOrderable() {
    return orderable;
  }




   /**
   * A description of the type of approval required before an order for this product can be fulfilled. This value is null for those products that do not require any approval.
   * @return requiresApproval
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FactSet", value = "A description of the type of approval required before an order for this product can be fulfilled. This value is null for those products that do not require any approval.")
  @JsonProperty(JSON_PROPERTY_REQUIRES_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RequiresApprovalEnum getRequiresApproval() {
    return requiresApproval;
  }




   /**
   * Whether a temporary trial use of this product is available for users.
   * @return trialAvailable
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether a temporary trial use of this product is available for users.")
  @JsonProperty(JSON_PROPERTY_TRIAL_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getTrialAvailable() {
    return trialAvailable;
  }




   /**
   * Whether the product appears in the requester&#39;s product whitelist. Presence in the product whitelist means the requester is authorized to order this product for other users.
   * @return whitelist
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the product appears in the requester's product whitelist. Presence in the product whitelist means the requester is authorized to order this product for other users.")
  @JsonProperty(JSON_PROPERTY_WHITELIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getWhitelist() {
    return whitelist;
  }




  public ProductResource meta(ProductResourceMeta meta) {
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

  public ProductResourceMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(ProductResourceMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this ProductResource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductResource productResource = (ProductResource) o;
    return Objects.equals(this.schemas, productResource.schemas) &&
        Objects.equals(this.id, productResource.id) &&
        Objects.equals(this.name, productResource.name) &&
        Objects.equals(this.description, productResource.description) &&
        Objects.equals(this.groupDescription, productResource.groupDescription) &&
        Objects.equals(this.workstation, productResource.workstation) &&
        Objects.equals(this.orderable, productResource.orderable) &&
        Objects.equals(this.requiresApproval, productResource.requiresApproval) &&
        Objects.equals(this.trialAvailable, productResource.trialAvailable) &&
        Objects.equals(this.whitelist, productResource.whitelist) &&
        Objects.equals(this.meta, productResource.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, name, description, groupDescription, workstation, orderable, requiresApproval, trialAvailable, whitelist, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductResource {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupDescription: ").append(toIndentedString(groupDescription)).append("\n");
    sb.append("    workstation: ").append(toIndentedString(workstation)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    requiresApproval: ").append(toIndentedString(requiresApproval)).append("\n");
    sb.append("    trialAvailable: ").append(toIndentedString(trialAvailable)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

