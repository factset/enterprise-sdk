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
import com.factset.sdk.IRNMeetings.models.RecordChangeDto;
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
 * MeetingEventDto
 */
@JsonPropertyOrder({
  MeetingEventDto.JSON_PROPERTY_CREATED_AT,
  MeetingEventDto.JSON_PROPERTY_TYPE,
  MeetingEventDto.JSON_PROPERTY_USER,
  MeetingEventDto.JSON_PROPERTY_CHANGE_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MeetingEventDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private JsonNullable<String> createdAt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER = "user";
  private JsonNullable<String> user = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CHANGE_LIST = "changeList";
  private JsonNullable<java.util.List<RecordChangeDto>> changeList = JsonNullable.<java.util.List<RecordChangeDto>>undefined();

  public MeetingEventDto() { 
  }

  public MeetingEventDto createdAt(String createdAt) {
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


  public MeetingEventDto type(String type) {
    this.type = JsonNullable.<String>of(type);
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
  }


  public MeetingEventDto user(String user) {
    this.user = JsonNullable.<String>of(user);
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getUser() {
        return user.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUser_JsonNullable() {
    return user;
  }
  
  @JsonProperty(JSON_PROPERTY_USER)
  public void setUser_JsonNullable(JsonNullable<String> user) {
    this.user = user;
  }

  public void setUser(String user) {
    this.user = JsonNullable.<String>of(user);
  }


  public MeetingEventDto changeList(java.util.List<RecordChangeDto> changeList) {
    this.changeList = JsonNullable.<java.util.List<RecordChangeDto>>of(changeList);
    return this;
  }

  public MeetingEventDto addChangeListItem(RecordChangeDto changeListItem) {
    if (this.changeList == null || !this.changeList.isPresent()) {
      this.changeList = JsonNullable.<java.util.List<RecordChangeDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.changeList.get().add(changeListItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get changeList
   * @return changeList
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<RecordChangeDto> getChangeList() {
        return changeList.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHANGE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<RecordChangeDto>> getChangeList_JsonNullable() {
    return changeList;
  }
  
  @JsonProperty(JSON_PROPERTY_CHANGE_LIST)
  public void setChangeList_JsonNullable(JsonNullable<java.util.List<RecordChangeDto>> changeList) {
    this.changeList = changeList;
  }

  public void setChangeList(java.util.List<RecordChangeDto> changeList) {
    this.changeList = JsonNullable.<java.util.List<RecordChangeDto>>of(changeList);
  }


  /**
   * Return true if this MeetingEventDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingEventDto meetingEventDto = (MeetingEventDto) o;
    return equalsNullable(this.createdAt, meetingEventDto.createdAt) &&
        equalsNullable(this.type, meetingEventDto.type) &&
        equalsNullable(this.user, meetingEventDto.user) &&
        equalsNullable(this.changeList, meetingEventDto.changeList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(createdAt), hashCodeNullable(type), hashCodeNullable(user), hashCodeNullable(changeList));
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
    sb.append("class MeetingEventDto {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    changeList: ").append(toIndentedString(changeList)).append("\n");
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

