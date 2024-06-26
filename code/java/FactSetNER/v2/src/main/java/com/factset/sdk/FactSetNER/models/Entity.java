/*
 * FactSet NER
 * Extract named entities and their FactSet entity IDs from given document text.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetNER.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetNER.models.AssociatedOrganization;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetNER.JSON;


/**
 * Entity
 */
@JsonPropertyOrder({
  Entity.JSON_PROPERTY_TYPE,
  Entity.JSON_PROPERTY_TEXT,
  Entity.JSON_PROPERTY_START_CHAR,
  Entity.JSON_PROPERTY_END_CHAR,
  Entity.JSON_PROPERTY_LOOKUP_TEXT,
  Entity.JSON_PROPERTY_ENTITY_ID,
  Entity.JSON_PROPERTY_LOOKUP_URL,
  Entity.JSON_PROPERTY_ASSOCIATED_ORGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Entity implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Type of the extracted named entity (NE).
   */
  public enum TypeEnum {
    GPE("NE_GPE"),
    
    ORG("NE_ORG"),
    
    PERSON("NE_PERSON"),
    
    NUMBER("NE_NUMBER"),
    
    MONEY("NE_MONEY"),
    
    DATETIME("NE_DATETIME"),
    
    DRUG("NE_DRUG"),
    
    HEALTH_INDICATION("NE_HEALTH_INDICATION");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_START_CHAR = "startChar";
  private Integer startChar;

  public static final String JSON_PROPERTY_END_CHAR = "endChar";
  private Integer endChar;

  public static final String JSON_PROPERTY_LOOKUP_TEXT = "lookupText";
  private String lookupText;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_LOOKUP_URL = "lookupUrl";
  private String lookupUrl;

  public static final String JSON_PROPERTY_ASSOCIATED_ORGS = "associatedOrgs";
  private java.util.List<AssociatedOrganization> associatedOrgs = null;

  public Entity() { 
  }

  public Entity type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the extracted named entity (NE).
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "NE_GPE", value = "Type of the extracted named entity (NE).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Entity text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text for the named entity, as found in the source text.
   * @return text
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Text for the named entity, as found in the source text.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public Entity startChar(Integer startChar) {
    this.startChar = startChar;
    return this;
  }

   /**
   * Starting character position of the entity text.
   * minimum: 0
   * @return startChar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Starting character position of the entity text.")
  @JsonProperty(JSON_PROPERTY_START_CHAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartChar() {
    return startChar;
  }


  @JsonProperty(JSON_PROPERTY_START_CHAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartChar(Integer startChar) {
    this.startChar = startChar;
  }


  public Entity endChar(Integer endChar) {
    this.endChar = endChar;
    return this;
  }

   /**
   * Ending character position of the entity text.
   * minimum: 0
   * @return endChar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ending character position of the entity text.")
  @JsonProperty(JSON_PROPERTY_END_CHAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndChar() {
    return endChar;
  }


  @JsonProperty(JSON_PROPERTY_END_CHAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndChar(Integer endChar) {
    this.endChar = endChar;
  }


  public Entity lookupText(String lookupText) {
    this.lookupText = lookupText;
    return this;
  }

   /**
   * Name of the FactSet entity linked to the text.
   * @return lookupText
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the FactSet entity linked to the text.")
  @JsonProperty(JSON_PROPERTY_LOOKUP_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLookupText() {
    return lookupText;
  }


  @JsonProperty(JSON_PROPERTY_LOOKUP_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLookupText(String lookupText) {
    this.lookupText = lookupText;
  }


  public Entity entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * FactSet Entity ID for the extracted entity.
   * @return entityId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FactSet Entity ID for the extracted entity.")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public Entity lookupUrl(String lookupUrl) {
    this.lookupUrl = lookupUrl;
    return this;
  }

   /**
   * URL to the extracted entity in FactSet.
   * @return lookupUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "URL to the extracted entity in FactSet.")
  @JsonProperty(JSON_PROPERTY_LOOKUP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLookupUrl() {
    return lookupUrl;
  }


  @JsonProperty(JSON_PROPERTY_LOOKUP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLookupUrl(String lookupUrl) {
    this.lookupUrl = lookupUrl;
  }


  public Entity associatedOrgs(java.util.List<AssociatedOrganization> associatedOrgs) {
    this.associatedOrgs = associatedOrgs;
    return this;
  }

  public Entity addAssociatedOrgsItem(AssociatedOrganization associatedOrgsItem) {
    if (this.associatedOrgs == null) {
      this.associatedOrgs = new java.util.ArrayList<>();
    }
    this.associatedOrgs.add(associatedOrgsItem);
    return this;
  }

   /**
   * Organizations associated with this entity.
   * @return associatedOrgs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Organizations associated with this entity.")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_ORGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<AssociatedOrganization> getAssociatedOrgs() {
    return associatedOrgs;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATED_ORGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedOrgs(java.util.List<AssociatedOrganization> associatedOrgs) {
    this.associatedOrgs = associatedOrgs;
  }


  /**
   * Return true if this Entity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entity entity = (Entity) o;
    return Objects.equals(this.type, entity.type) &&
        Objects.equals(this.text, entity.text) &&
        Objects.equals(this.startChar, entity.startChar) &&
        Objects.equals(this.endChar, entity.endChar) &&
        Objects.equals(this.lookupText, entity.lookupText) &&
        Objects.equals(this.entityId, entity.entityId) &&
        Objects.equals(this.lookupUrl, entity.lookupUrl) &&
        Objects.equals(this.associatedOrgs, entity.associatedOrgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, startChar, endChar, lookupText, entityId, lookupUrl, associatedOrgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    startChar: ").append(toIndentedString(startChar)).append("\n");
    sb.append("    endChar: ").append(toIndentedString(endChar)).append("\n");
    sb.append("    lookupText: ").append(toIndentedString(lookupText)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    lookupUrl: ").append(toIndentedString(lookupUrl)).append("\n");
    sb.append("    associatedOrgs: ").append(toIndentedString(associatedOrgs)).append("\n");
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

