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
 * RelationshipDto
 */
@JsonPropertyOrder({
  RelationshipDto.JSON_PROPERTY_ID,
  RelationshipDto.JSON_PROPERTY_RELATIONSHIP_CATEGORY_ID,
  RelationshipDto.JSON_PROPERTY_RELATIONSHIP_CODE,
  RelationshipDto.JSON_PROPERTY_BIDIRECTIONAL_NAME,
  RelationshipDto.JSON_PROPERTY_LEFT_TO_RIGHT_NAME,
  RelationshipDto.JSON_PROPERTY_RIGHT_TO_LEFT_NAME,
  RelationshipDto.JSON_PROPERTY_HIDE_DATES,
  RelationshipDto.JSON_PROPERTY_HIDE_COMMENT,
  RelationshipDto.JSON_PROPERTY_HIDE_COMPANY,
  RelationshipDto.JSON_PROPERTY_IS_CUSTOMISABLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RelationshipDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_RELATIONSHIP_CATEGORY_ID = "relationshipCategoryId";
  private java.util.UUID relationshipCategoryId;

  public static final String JSON_PROPERTY_RELATIONSHIP_CODE = "relationshipCode";
  private JsonNullable<String> relationshipCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BIDIRECTIONAL_NAME = "bidirectionalName";
  private JsonNullable<String> bidirectionalName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LEFT_TO_RIGHT_NAME = "leftToRightName";
  private JsonNullable<String> leftToRightName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RIGHT_TO_LEFT_NAME = "rightToLeftName";
  private JsonNullable<String> rightToLeftName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HIDE_DATES = "hideDates";
  private Boolean hideDates;

  public static final String JSON_PROPERTY_HIDE_COMMENT = "hideComment";
  private Boolean hideComment;

  public static final String JSON_PROPERTY_HIDE_COMPANY = "hideCompany";
  private Boolean hideCompany;

  public static final String JSON_PROPERTY_IS_CUSTOMISABLE = "isCustomisable";
  private Boolean isCustomisable;

  public RelationshipDto() { 
  }

  public RelationshipDto id(java.util.UUID id) {
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


  public RelationshipDto relationshipCategoryId(java.util.UUID relationshipCategoryId) {
    this.relationshipCategoryId = relationshipCategoryId;
    return this;
  }

   /**
   * Get relationshipCategoryId
   * @return relationshipCategoryId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATIONSHIP_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getRelationshipCategoryId() {
    return relationshipCategoryId;
  }


  @JsonProperty(JSON_PROPERTY_RELATIONSHIP_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelationshipCategoryId(java.util.UUID relationshipCategoryId) {
    this.relationshipCategoryId = relationshipCategoryId;
  }


  public RelationshipDto relationshipCode(String relationshipCode) {
    this.relationshipCode = JsonNullable.<String>of(relationshipCode);
    return this;
  }

   /**
   * Get relationshipCode
   * @return relationshipCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getRelationshipCode() {
        return relationshipCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATIONSHIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRelationshipCode_JsonNullable() {
    return relationshipCode;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATIONSHIP_CODE)
  public void setRelationshipCode_JsonNullable(JsonNullable<String> relationshipCode) {
    this.relationshipCode = relationshipCode;
  }

  public void setRelationshipCode(String relationshipCode) {
    this.relationshipCode = JsonNullable.<String>of(relationshipCode);
  }


  public RelationshipDto bidirectionalName(String bidirectionalName) {
    this.bidirectionalName = JsonNullable.<String>of(bidirectionalName);
    return this;
  }

   /**
   * Get bidirectionalName
   * @return bidirectionalName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getBidirectionalName() {
        return bidirectionalName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BIDIRECTIONAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBidirectionalName_JsonNullable() {
    return bidirectionalName;
  }
  
  @JsonProperty(JSON_PROPERTY_BIDIRECTIONAL_NAME)
  public void setBidirectionalName_JsonNullable(JsonNullable<String> bidirectionalName) {
    this.bidirectionalName = bidirectionalName;
  }

  public void setBidirectionalName(String bidirectionalName) {
    this.bidirectionalName = JsonNullable.<String>of(bidirectionalName);
  }


  public RelationshipDto leftToRightName(String leftToRightName) {
    this.leftToRightName = JsonNullable.<String>of(leftToRightName);
    return this;
  }

   /**
   * Get leftToRightName
   * @return leftToRightName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getLeftToRightName() {
        return leftToRightName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEFT_TO_RIGHT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLeftToRightName_JsonNullable() {
    return leftToRightName;
  }
  
  @JsonProperty(JSON_PROPERTY_LEFT_TO_RIGHT_NAME)
  public void setLeftToRightName_JsonNullable(JsonNullable<String> leftToRightName) {
    this.leftToRightName = leftToRightName;
  }

  public void setLeftToRightName(String leftToRightName) {
    this.leftToRightName = JsonNullable.<String>of(leftToRightName);
  }


  public RelationshipDto rightToLeftName(String rightToLeftName) {
    this.rightToLeftName = JsonNullable.<String>of(rightToLeftName);
    return this;
  }

   /**
   * Get rightToLeftName
   * @return rightToLeftName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getRightToLeftName() {
        return rightToLeftName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RIGHT_TO_LEFT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRightToLeftName_JsonNullable() {
    return rightToLeftName;
  }
  
  @JsonProperty(JSON_PROPERTY_RIGHT_TO_LEFT_NAME)
  public void setRightToLeftName_JsonNullable(JsonNullable<String> rightToLeftName) {
    this.rightToLeftName = rightToLeftName;
  }

  public void setRightToLeftName(String rightToLeftName) {
    this.rightToLeftName = JsonNullable.<String>of(rightToLeftName);
  }


  public RelationshipDto hideDates(Boolean hideDates) {
    this.hideDates = hideDates;
    return this;
  }

   /**
   * Get hideDates
   * @return hideDates
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIDE_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideDates() {
    return hideDates;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideDates(Boolean hideDates) {
    this.hideDates = hideDates;
  }


  public RelationshipDto hideComment(Boolean hideComment) {
    this.hideComment = hideComment;
    return this;
  }

   /**
   * Get hideComment
   * @return hideComment
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIDE_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideComment() {
    return hideComment;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideComment(Boolean hideComment) {
    this.hideComment = hideComment;
  }


  public RelationshipDto hideCompany(Boolean hideCompany) {
    this.hideCompany = hideCompany;
    return this;
  }

   /**
   * Get hideCompany
   * @return hideCompany
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIDE_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideCompany() {
    return hideCompany;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideCompany(Boolean hideCompany) {
    this.hideCompany = hideCompany;
  }


  public RelationshipDto isCustomisable(Boolean isCustomisable) {
    this.isCustomisable = isCustomisable;
    return this;
  }

   /**
   * Get isCustomisable
   * @return isCustomisable
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_CUSTOMISABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCustomisable() {
    return isCustomisable;
  }


  @JsonProperty(JSON_PROPERTY_IS_CUSTOMISABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCustomisable(Boolean isCustomisable) {
    this.isCustomisable = isCustomisable;
  }


  /**
   * Return true if this RelationshipDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipDto relationshipDto = (RelationshipDto) o;
    return Objects.equals(this.id, relationshipDto.id) &&
        Objects.equals(this.relationshipCategoryId, relationshipDto.relationshipCategoryId) &&
        equalsNullable(this.relationshipCode, relationshipDto.relationshipCode) &&
        equalsNullable(this.bidirectionalName, relationshipDto.bidirectionalName) &&
        equalsNullable(this.leftToRightName, relationshipDto.leftToRightName) &&
        equalsNullable(this.rightToLeftName, relationshipDto.rightToLeftName) &&
        Objects.equals(this.hideDates, relationshipDto.hideDates) &&
        Objects.equals(this.hideComment, relationshipDto.hideComment) &&
        Objects.equals(this.hideCompany, relationshipDto.hideCompany) &&
        Objects.equals(this.isCustomisable, relationshipDto.isCustomisable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relationshipCategoryId, hashCodeNullable(relationshipCode), hashCodeNullable(bidirectionalName), hashCodeNullable(leftToRightName), hashCodeNullable(rightToLeftName), hideDates, hideComment, hideCompany, isCustomisable);
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
    sb.append("class RelationshipDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationshipCategoryId: ").append(toIndentedString(relationshipCategoryId)).append("\n");
    sb.append("    relationshipCode: ").append(toIndentedString(relationshipCode)).append("\n");
    sb.append("    bidirectionalName: ").append(toIndentedString(bidirectionalName)).append("\n");
    sb.append("    leftToRightName: ").append(toIndentedString(leftToRightName)).append("\n");
    sb.append("    rightToLeftName: ").append(toIndentedString(rightToLeftName)).append("\n");
    sb.append("    hideDates: ").append(toIndentedString(hideDates)).append("\n");
    sb.append("    hideComment: ").append(toIndentedString(hideComment)).append("\n");
    sb.append("    hideCompany: ").append(toIndentedString(hideCompany)).append("\n");
    sb.append("    isCustomisable: ").append(toIndentedString(isCustomisable)).append("\n");
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

