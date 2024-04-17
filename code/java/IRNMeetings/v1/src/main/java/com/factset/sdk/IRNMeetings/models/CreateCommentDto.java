/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNMeetings.models;

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
import com.factset.sdk.IRNMeetings.JSON;


/**
 * CreateCommentDto
 */
@JsonPropertyOrder({
  CreateCommentDto.JSON_PROPERTY_AUTHOR_ID,
  CreateCommentDto.JSON_PROPERTY_PARENT_COMMENT_ID,
  CreateCommentDto.JSON_PROPERTY_BODY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CreateCommentDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AUTHOR_ID = "authorId";
  private java.util.UUID authorId;

  public static final String JSON_PROPERTY_PARENT_COMMENT_ID = "parentCommentId";
  private JsonNullable<java.util.UUID> parentCommentId = JsonNullable.<java.util.UUID>undefined();

  public static final String JSON_PROPERTY_BODY = "body";
  private JsonNullable<String> body = JsonNullable.<String>undefined();

  public CreateCommentDto() { 
  }

  public CreateCommentDto authorId(java.util.UUID authorId) {
    this.authorId = authorId;
    return this;
  }

   /**
   * Get authorId
   * @return authorId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getAuthorId() {
    return authorId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorId(java.util.UUID authorId) {
    this.authorId = authorId;
  }


  public CreateCommentDto parentCommentId(java.util.UUID parentCommentId) {
    this.parentCommentId = JsonNullable.<java.util.UUID>of(parentCommentId);
    return this;
  }

   /**
   * Get parentCommentId
   * @return parentCommentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getParentCommentId() {
        return parentCommentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_COMMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getParentCommentId_JsonNullable() {
    return parentCommentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_COMMENT_ID)
  public void setParentCommentId_JsonNullable(JsonNullable<java.util.UUID> parentCommentId) {
    this.parentCommentId = parentCommentId;
  }

  public void setParentCommentId(java.util.UUID parentCommentId) {
    this.parentCommentId = JsonNullable.<java.util.UUID>of(parentCommentId);
  }


  public CreateCommentDto body(String body) {
    this.body = JsonNullable.<String>of(body);
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getBody() {
        return body.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBody_JsonNullable() {
    return body;
  }
  
  @JsonProperty(JSON_PROPERTY_BODY)
  public void setBody_JsonNullable(JsonNullable<String> body) {
    this.body = body;
  }

  public void setBody(String body) {
    this.body = JsonNullable.<String>of(body);
  }


  /**
   * Return true if this CreateCommentDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCommentDto createCommentDto = (CreateCommentDto) o;
    return Objects.equals(this.authorId, createCommentDto.authorId) &&
        equalsNullable(this.parentCommentId, createCommentDto.parentCommentId) &&
        equalsNullable(this.body, createCommentDto.body);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, hashCodeNullable(parentCommentId), hashCodeNullable(body));
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
    sb.append("class CreateCommentDto {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    parentCommentId: ").append(toIndentedString(parentCommentId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

