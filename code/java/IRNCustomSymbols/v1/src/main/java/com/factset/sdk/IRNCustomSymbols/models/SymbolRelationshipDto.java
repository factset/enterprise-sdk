/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNCustomSymbols.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNCustomSymbols.models.SymbolIdNameDto;
import com.factset.sdk.IRNCustomSymbols.models.SymbolsRelationshipIdNameDto;
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
import com.factset.sdk.IRNCustomSymbols.JSON;


/**
 * SymbolRelationshipDto
 */
@JsonPropertyOrder({
  SymbolRelationshipDto.JSON_PROPERTY_ID,
  SymbolRelationshipDto.JSON_PROPERTY_SYMBOLS_RELATIONSHIP,
  SymbolRelationshipDto.JSON_PROPERTY_PARENT_SYMBOL,
  SymbolRelationshipDto.JSON_PROPERTY_CHILD_SYMBOL,
  SymbolRelationshipDto.JSON_PROPERTY_START_DATE,
  SymbolRelationshipDto.JSON_PROPERTY_END_DATE,
  SymbolRelationshipDto.JSON_PROPERTY_COMMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SymbolRelationshipDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_SYMBOLS_RELATIONSHIP = "symbolsRelationship";
  private JsonNullable<SymbolsRelationshipIdNameDto> symbolsRelationship = JsonNullable.<SymbolsRelationshipIdNameDto>undefined();

  public static final String JSON_PROPERTY_PARENT_SYMBOL = "parentSymbol";
  private JsonNullable<SymbolIdNameDto> parentSymbol = JsonNullable.<SymbolIdNameDto>undefined();

  public static final String JSON_PROPERTY_CHILD_SYMBOL = "childSymbol";
  private JsonNullable<SymbolIdNameDto> childSymbol = JsonNullable.<SymbolIdNameDto>undefined();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public SymbolRelationshipDto() { 
  }

  public SymbolRelationshipDto id(java.util.UUID id) {
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


  public SymbolRelationshipDto symbolsRelationship(SymbolsRelationshipIdNameDto symbolsRelationship) {
    this.symbolsRelationship = JsonNullable.<SymbolsRelationshipIdNameDto>of(symbolsRelationship);
    return this;
  }

   /**
   * Get symbolsRelationship
   * @return symbolsRelationship
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SymbolsRelationshipIdNameDto getSymbolsRelationship() {
        return symbolsRelationship.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYMBOLS_RELATIONSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SymbolsRelationshipIdNameDto> getSymbolsRelationship_JsonNullable() {
    return symbolsRelationship;
  }
  
  @JsonProperty(JSON_PROPERTY_SYMBOLS_RELATIONSHIP)
  public void setSymbolsRelationship_JsonNullable(JsonNullable<SymbolsRelationshipIdNameDto> symbolsRelationship) {
    this.symbolsRelationship = symbolsRelationship;
  }

  public void setSymbolsRelationship(SymbolsRelationshipIdNameDto symbolsRelationship) {
    this.symbolsRelationship = JsonNullable.<SymbolsRelationshipIdNameDto>of(symbolsRelationship);
  }


  public SymbolRelationshipDto parentSymbol(SymbolIdNameDto parentSymbol) {
    this.parentSymbol = JsonNullable.<SymbolIdNameDto>of(parentSymbol);
    return this;
  }

   /**
   * Get parentSymbol
   * @return parentSymbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SymbolIdNameDto getParentSymbol() {
        return parentSymbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SymbolIdNameDto> getParentSymbol_JsonNullable() {
    return parentSymbol;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_SYMBOL)
  public void setParentSymbol_JsonNullable(JsonNullable<SymbolIdNameDto> parentSymbol) {
    this.parentSymbol = parentSymbol;
  }

  public void setParentSymbol(SymbolIdNameDto parentSymbol) {
    this.parentSymbol = JsonNullable.<SymbolIdNameDto>of(parentSymbol);
  }


  public SymbolRelationshipDto childSymbol(SymbolIdNameDto childSymbol) {
    this.childSymbol = JsonNullable.<SymbolIdNameDto>of(childSymbol);
    return this;
  }

   /**
   * Get childSymbol
   * @return childSymbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SymbolIdNameDto getChildSymbol() {
        return childSymbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHILD_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SymbolIdNameDto> getChildSymbol_JsonNullable() {
    return childSymbol;
  }
  
  @JsonProperty(JSON_PROPERTY_CHILD_SYMBOL)
  public void setChildSymbol_JsonNullable(JsonNullable<SymbolIdNameDto> childSymbol) {
    this.childSymbol = childSymbol;
  }

  public void setChildSymbol(SymbolIdNameDto childSymbol) {
    this.childSymbol = JsonNullable.<SymbolIdNameDto>of(childSymbol);
  }


  public SymbolRelationshipDto startDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getStartDate() {
        return startDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStartDate_JsonNullable() {
    return startDate;
  }
  
  @JsonProperty(JSON_PROPERTY_START_DATE)
  public void setStartDate_JsonNullable(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
  }


  public SymbolRelationshipDto endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getEndDate() {
        return endDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getEndDate_JsonNullable() {
    return endDate;
  }
  
  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
  }


  public SymbolRelationshipDto comment(String comment) {
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
   * Return true if this SymbolRelationshipDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolRelationshipDto symbolRelationshipDto = (SymbolRelationshipDto) o;
    return Objects.equals(this.id, symbolRelationshipDto.id) &&
        equalsNullable(this.symbolsRelationship, symbolRelationshipDto.symbolsRelationship) &&
        equalsNullable(this.parentSymbol, symbolRelationshipDto.parentSymbol) &&
        equalsNullable(this.childSymbol, symbolRelationshipDto.childSymbol) &&
        equalsNullable(this.startDate, symbolRelationshipDto.startDate) &&
        equalsNullable(this.endDate, symbolRelationshipDto.endDate) &&
        equalsNullable(this.comment, symbolRelationshipDto.comment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(symbolsRelationship), hashCodeNullable(parentSymbol), hashCodeNullable(childSymbol), hashCodeNullable(startDate), hashCodeNullable(endDate), hashCodeNullable(comment));
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
    sb.append("class SymbolRelationshipDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbolsRelationship: ").append(toIndentedString(symbolsRelationship)).append("\n");
    sb.append("    parentSymbol: ").append(toIndentedString(parentSymbol)).append("\n");
    sb.append("    childSymbol: ").append(toIndentedString(childSymbol)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

