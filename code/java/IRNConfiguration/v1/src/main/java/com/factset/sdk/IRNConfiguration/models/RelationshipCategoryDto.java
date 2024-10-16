/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNConfiguration.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNConfiguration.models.RelationshipDto;
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
import com.factset.sdk.IRNConfiguration.JSON;


/**
 * RelationshipCategoryDto
 */
@JsonPropertyOrder({
  RelationshipCategoryDto.JSON_PROPERTY_ID,
  RelationshipCategoryDto.JSON_PROPERTY_NAME,
  RelationshipCategoryDto.JSON_PROPERTY_IS_STANDARD,
  RelationshipCategoryDto.JSON_PROPERTY_IS_CONTACT_TO_CONTACT,
  RelationshipCategoryDto.JSON_PROPERTY_IS_CONTACT_TO_SYMBOL,
  RelationshipCategoryDto.JSON_PROPERTY_RELATIONSHIPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RelationshipCategoryDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private Boolean isStandard;

  public static final String JSON_PROPERTY_IS_CONTACT_TO_CONTACT = "isContactToContact";
  private Boolean isContactToContact;

  public static final String JSON_PROPERTY_IS_CONTACT_TO_SYMBOL = "isContactToSymbol";
  private Boolean isContactToSymbol;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private JsonNullable<java.util.List<RelationshipDto>> relationships = JsonNullable.<java.util.List<RelationshipDto>>undefined();

  public RelationshipCategoryDto() { 
  }

  public RelationshipCategoryDto id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  public RelationshipCategoryDto name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RelationshipCategoryDto isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

   /**
   * Get isStandard
   * @return isStandard
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsStandard() {
    return isStandard;
  }


  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }


  public RelationshipCategoryDto isContactToContact(Boolean isContactToContact) {
    this.isContactToContact = isContactToContact;
    return this;
  }

   /**
   * Get isContactToContact
   * @return isContactToContact
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_CONTACT_TO_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsContactToContact() {
    return isContactToContact;
  }


  @JsonProperty(JSON_PROPERTY_IS_CONTACT_TO_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsContactToContact(Boolean isContactToContact) {
    this.isContactToContact = isContactToContact;
  }


  public RelationshipCategoryDto isContactToSymbol(Boolean isContactToSymbol) {
    this.isContactToSymbol = isContactToSymbol;
    return this;
  }

   /**
   * Get isContactToSymbol
   * @return isContactToSymbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_CONTACT_TO_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsContactToSymbol() {
    return isContactToSymbol;
  }


  @JsonProperty(JSON_PROPERTY_IS_CONTACT_TO_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsContactToSymbol(Boolean isContactToSymbol) {
    this.isContactToSymbol = isContactToSymbol;
  }


  public RelationshipCategoryDto relationships(java.util.List<RelationshipDto> relationships) {
    this.relationships = JsonNullable.<java.util.List<RelationshipDto>>of(relationships);
    return this;
  }

  public RelationshipCategoryDto addRelationshipsItem(RelationshipDto relationshipsItem) {
    if (this.relationships == null || !this.relationships.isPresent()) {
      this.relationships = JsonNullable.<java.util.List<RelationshipDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.relationships.get().add(relationshipsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<RelationshipDto> getRelationships() {
        return relationships.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<RelationshipDto>> getRelationships_JsonNullable() {
    return relationships;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  public void setRelationships_JsonNullable(JsonNullable<java.util.List<RelationshipDto>> relationships) {
    this.relationships = relationships;
  }

  public void setRelationships(java.util.List<RelationshipDto> relationships) {
    this.relationships = JsonNullable.<java.util.List<RelationshipDto>>of(relationships);
  }


  /**
   * Return true if this RelationshipCategoryDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipCategoryDto relationshipCategoryDto = (RelationshipCategoryDto) o;
    return Objects.equals(this.id, relationshipCategoryDto.id) &&
        equalsNullable(this.name, relationshipCategoryDto.name) &&
        Objects.equals(this.isStandard, relationshipCategoryDto.isStandard) &&
        Objects.equals(this.isContactToContact, relationshipCategoryDto.isContactToContact) &&
        Objects.equals(this.isContactToSymbol, relationshipCategoryDto.isContactToSymbol) &&
        equalsNullable(this.relationships, relationshipCategoryDto.relationships);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), isStandard, isContactToContact, isContactToSymbol, hashCodeNullable(relationships));
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
    sb.append("class RelationshipCategoryDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    isContactToContact: ").append(toIndentedString(isContactToContact)).append("\n");
    sb.append("    isContactToSymbol: ").append(toIndentedString(isContactToSymbol)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

