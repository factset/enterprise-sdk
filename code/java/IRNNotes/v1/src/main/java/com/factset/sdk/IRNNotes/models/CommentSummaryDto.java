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


package com.factset.sdk.IRNNotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNNotes.models.SubcommentSummaryDto;
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
import com.factset.sdk.IRNNotes.JSON;


/**
 * CommentSummaryDto
 */
@JsonPropertyOrder({
  CommentSummaryDto.JSON_PROPERTY_ID,
  CommentSummaryDto.JSON_PROPERTY_USER_ID,
  CommentSummaryDto.JSON_PROPERTY_CREATED_AT,
  CommentSummaryDto.JSON_PROPERTY_SUBCOMMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CommentSummaryDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private java.util.UUID userId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private JsonNullable<String> createdAt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBCOMMENTS = "subcomments";
  private JsonNullable<java.util.List<SubcommentSummaryDto>> subcomments = JsonNullable.<java.util.List<SubcommentSummaryDto>>undefined();

  public CommentSummaryDto() { 
  }

  public CommentSummaryDto id(java.util.UUID id) {
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


  public CommentSummaryDto userId(java.util.UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(java.util.UUID userId) {
    this.userId = userId;
  }


  public CommentSummaryDto createdAt(String createdAt) {
    this.createdAt = JsonNullable.<String>of(createdAt);
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCreatedAt() {
        return createdAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreatedAt_JsonNullable() {
    return createdAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  public void setCreatedAt_JsonNullable(JsonNullable<String> createdAt) {
    this.createdAt = createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = JsonNullable.<String>of(createdAt);
  }


  public CommentSummaryDto subcomments(java.util.List<SubcommentSummaryDto> subcomments) {
    this.subcomments = JsonNullable.<java.util.List<SubcommentSummaryDto>>of(subcomments);
    return this;
  }

  public CommentSummaryDto addSubcommentsItem(SubcommentSummaryDto subcommentsItem) {
    if (this.subcomments == null || !this.subcomments.isPresent()) {
      this.subcomments = JsonNullable.<java.util.List<SubcommentSummaryDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.subcomments.get().add(subcommentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get subcomments
   * @return subcomments
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<SubcommentSummaryDto> getSubcomments() {
        return subcomments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBCOMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<SubcommentSummaryDto>> getSubcomments_JsonNullable() {
    return subcomments;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBCOMMENTS)
  public void setSubcomments_JsonNullable(JsonNullable<java.util.List<SubcommentSummaryDto>> subcomments) {
    this.subcomments = subcomments;
  }

  public void setSubcomments(java.util.List<SubcommentSummaryDto> subcomments) {
    this.subcomments = JsonNullable.<java.util.List<SubcommentSummaryDto>>of(subcomments);
  }


  /**
   * Return true if this CommentSummaryDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentSummaryDto commentSummaryDto = (CommentSummaryDto) o;
    return Objects.equals(this.id, commentSummaryDto.id) &&
        Objects.equals(this.userId, commentSummaryDto.userId) &&
        equalsNullable(this.createdAt, commentSummaryDto.createdAt) &&
        equalsNullable(this.subcomments, commentSummaryDto.subcomments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, hashCodeNullable(createdAt), hashCodeNullable(subcomments));
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
    sb.append("class CommentSummaryDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    subcomments: ").append(toIndentedString(subcomments)).append("\n");
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

