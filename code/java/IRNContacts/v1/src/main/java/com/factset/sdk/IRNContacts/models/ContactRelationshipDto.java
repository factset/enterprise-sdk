/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNContacts.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNContacts.models.ContactIdNameDto;
import com.factset.sdk.IRNContacts.models.RelationshipCategoryIdNameDto;
import com.factset.sdk.IRNContacts.models.RelationshipIdNameDto;
import com.factset.sdk.IRNContacts.models.RelationshipSymbolSummaryDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IRNContacts.JSON;


/**
 * ContactRelationshipDto
 */
@JsonPropertyOrder({
  ContactRelationshipDto.JSON_PROPERTY_ID,
  ContactRelationshipDto.JSON_PROPERTY_RELATIONSHIP_CATEGORY,
  ContactRelationshipDto.JSON_PROPERTY_RELATIONSHIP,
  ContactRelationshipDto.JSON_PROPERTY_CONTACT,
  ContactRelationshipDto.JSON_PROPERTY_SYMBOL,
  ContactRelationshipDto.JSON_PROPERTY_IS_CURRENT,
  ContactRelationshipDto.JSON_PROPERTY_START,
  ContactRelationshipDto.JSON_PROPERTY_END,
  ContactRelationshipDto.JSON_PROPERTY_TITLE,
  ContactRelationshipDto.JSON_PROPERTY_COMMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ContactRelationshipDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_RELATIONSHIP_CATEGORY = "relationshipCategory";
  private JsonNullable<RelationshipCategoryIdNameDto> relationshipCategory = JsonNullable.<RelationshipCategoryIdNameDto>undefined();

  public static final String JSON_PROPERTY_RELATIONSHIP = "relationship";
  private JsonNullable<RelationshipIdNameDto> relationship = JsonNullable.<RelationshipIdNameDto>undefined();

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private JsonNullable<ContactIdNameDto> contact = JsonNullable.<ContactIdNameDto>undefined();

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private JsonNullable<RelationshipSymbolSummaryDto> symbol = JsonNullable.<RelationshipSymbolSummaryDto>undefined();

  public static final String JSON_PROPERTY_IS_CURRENT = "isCurrent";
  private Boolean isCurrent;

  public static final String JSON_PROPERTY_START = "start";
  private JsonNullable<OffsetDateTime> start = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_END = "end";
  private JsonNullable<OffsetDateTime> end = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public ContactRelationshipDto() { 
  }

  public ContactRelationshipDto id(java.util.UUID id) {
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


  public ContactRelationshipDto relationshipCategory(RelationshipCategoryIdNameDto relationshipCategory) {
    this.relationshipCategory = JsonNullable.<RelationshipCategoryIdNameDto>of(relationshipCategory);
    return this;
  }

   /**
   * Get relationshipCategory
   * @return relationshipCategory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public RelationshipCategoryIdNameDto getRelationshipCategory() {
        return relationshipCategory.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATIONSHIP_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RelationshipCategoryIdNameDto> getRelationshipCategory_JsonNullable() {
    return relationshipCategory;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATIONSHIP_CATEGORY)
  public void setRelationshipCategory_JsonNullable(JsonNullable<RelationshipCategoryIdNameDto> relationshipCategory) {
    this.relationshipCategory = relationshipCategory;
  }

  public void setRelationshipCategory(RelationshipCategoryIdNameDto relationshipCategory) {
    this.relationshipCategory = JsonNullable.<RelationshipCategoryIdNameDto>of(relationshipCategory);
  }


  public ContactRelationshipDto relationship(RelationshipIdNameDto relationship) {
    this.relationship = JsonNullable.<RelationshipIdNameDto>of(relationship);
    return this;
  }

   /**
   * Get relationship
   * @return relationship
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public RelationshipIdNameDto getRelationship() {
        return relationship.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATIONSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RelationshipIdNameDto> getRelationship_JsonNullable() {
    return relationship;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATIONSHIP)
  public void setRelationship_JsonNullable(JsonNullable<RelationshipIdNameDto> relationship) {
    this.relationship = relationship;
  }

  public void setRelationship(RelationshipIdNameDto relationship) {
    this.relationship = JsonNullable.<RelationshipIdNameDto>of(relationship);
  }


  public ContactRelationshipDto contact(ContactIdNameDto contact) {
    this.contact = JsonNullable.<ContactIdNameDto>of(contact);
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public ContactIdNameDto getContact() {
        return contact.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ContactIdNameDto> getContact_JsonNullable() {
    return contact;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTACT)
  public void setContact_JsonNullable(JsonNullable<ContactIdNameDto> contact) {
    this.contact = contact;
  }

  public void setContact(ContactIdNameDto contact) {
    this.contact = JsonNullable.<ContactIdNameDto>of(contact);
  }


  public ContactRelationshipDto symbol(RelationshipSymbolSummaryDto symbol) {
    this.symbol = JsonNullable.<RelationshipSymbolSummaryDto>of(symbol);
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public RelationshipSymbolSummaryDto getSymbol() {
        return symbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RelationshipSymbolSummaryDto> getSymbol_JsonNullable() {
    return symbol;
  }
  
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  public void setSymbol_JsonNullable(JsonNullable<RelationshipSymbolSummaryDto> symbol) {
    this.symbol = symbol;
  }

  public void setSymbol(RelationshipSymbolSummaryDto symbol) {
    this.symbol = JsonNullable.<RelationshipSymbolSummaryDto>of(symbol);
  }


  public ContactRelationshipDto isCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
    return this;
  }

   /**
   * Get isCurrent
   * @return isCurrent
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCurrent() {
    return isCurrent;
  }


  @JsonProperty(JSON_PROPERTY_IS_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
  }


  public ContactRelationshipDto start(OffsetDateTime start) {
    this.start = JsonNullable.<OffsetDateTime>of(start);
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getStart() {
        return start.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStart_JsonNullable() {
    return start;
  }
  
  @JsonProperty(JSON_PROPERTY_START)
  public void setStart_JsonNullable(JsonNullable<OffsetDateTime> start) {
    this.start = start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = JsonNullable.<OffsetDateTime>of(start);
  }


  public ContactRelationshipDto end(OffsetDateTime end) {
    this.end = JsonNullable.<OffsetDateTime>of(end);
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getEnd() {
        return end.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getEnd_JsonNullable() {
    return end;
  }
  
  @JsonProperty(JSON_PROPERTY_END)
  public void setEnd_JsonNullable(JsonNullable<OffsetDateTime> end) {
    this.end = end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = JsonNullable.<OffsetDateTime>of(end);
  }


  public ContactRelationshipDto title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }


  public ContactRelationshipDto comment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComment_JsonNullable() {
    return comment;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMENT)
  public void setComment_JsonNullable(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public void setComment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
  }


  /**
   * Return true if this ContactRelationshipDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactRelationshipDto contactRelationshipDto = (ContactRelationshipDto) o;
    return Objects.equals(this.id, contactRelationshipDto.id) &&
        equalsNullable(this.relationshipCategory, contactRelationshipDto.relationshipCategory) &&
        equalsNullable(this.relationship, contactRelationshipDto.relationship) &&
        equalsNullable(this.contact, contactRelationshipDto.contact) &&
        equalsNullable(this.symbol, contactRelationshipDto.symbol) &&
        Objects.equals(this.isCurrent, contactRelationshipDto.isCurrent) &&
        equalsNullable(this.start, contactRelationshipDto.start) &&
        equalsNullable(this.end, contactRelationshipDto.end) &&
        equalsNullable(this.title, contactRelationshipDto.title) &&
        equalsNullable(this.comment, contactRelationshipDto.comment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(relationshipCategory), hashCodeNullable(relationship), hashCodeNullable(contact), hashCodeNullable(symbol), isCurrent, hashCodeNullable(start), hashCodeNullable(end), hashCodeNullable(title), hashCodeNullable(comment));
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
    sb.append("class ContactRelationshipDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationshipCategory: ").append(toIndentedString(relationshipCategory)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    isCurrent: ").append(toIndentedString(isCurrent)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

