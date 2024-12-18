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
import com.factset.sdk.IRNContacts.models.ContactEventUpdateDto;
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
 * ContactEventDto
 */
@JsonPropertyOrder({
  ContactEventDto.JSON_PROPERTY_EVENT_TYPE,
  ContactEventDto.JSON_PROPERTY_DATE,
  ContactEventDto.JSON_PROPERTY_FULL_NAME,
  ContactEventDto.JSON_PROPERTY_DETAILS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ContactEventDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private JsonNullable<String> eventType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private JsonNullable<String> fullName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DETAILS = "details";
  private JsonNullable<java.util.List<ContactEventUpdateDto>> details = JsonNullable.<java.util.List<ContactEventUpdateDto>>undefined();

  public ContactEventDto() { 
  }

  public ContactEventDto eventType(String eventType) {
    this.eventType = JsonNullable.<String>of(eventType);
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getEventType() {
        return eventType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEventType_JsonNullable() {
    return eventType;
  }
  
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  public void setEventType_JsonNullable(JsonNullable<String> eventType) {
    this.eventType = eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = JsonNullable.<String>of(eventType);
  }


  public ContactEventDto date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public ContactEventDto fullName(String fullName) {
    this.fullName = JsonNullable.<String>of(fullName);
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFullName() {
        return fullName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFullName_JsonNullable() {
    return fullName;
  }
  
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  public void setFullName_JsonNullable(JsonNullable<String> fullName) {
    this.fullName = fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = JsonNullable.<String>of(fullName);
  }


  public ContactEventDto details(java.util.List<ContactEventUpdateDto> details) {
    this.details = JsonNullable.<java.util.List<ContactEventUpdateDto>>of(details);
    return this;
  }

  public ContactEventDto addDetailsItem(ContactEventUpdateDto detailsItem) {
    if (this.details == null || !this.details.isPresent()) {
      this.details = JsonNullable.<java.util.List<ContactEventUpdateDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.details.get().add(detailsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<ContactEventUpdateDto> getDetails() {
        return details.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<ContactEventUpdateDto>> getDetails_JsonNullable() {
    return details;
  }
  
  @JsonProperty(JSON_PROPERTY_DETAILS)
  public void setDetails_JsonNullable(JsonNullable<java.util.List<ContactEventUpdateDto>> details) {
    this.details = details;
  }

  public void setDetails(java.util.List<ContactEventUpdateDto> details) {
    this.details = JsonNullable.<java.util.List<ContactEventUpdateDto>>of(details);
  }


  /**
   * Return true if this ContactEventDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactEventDto contactEventDto = (ContactEventDto) o;
    return equalsNullable(this.eventType, contactEventDto.eventType) &&
        Objects.equals(this.date, contactEventDto.date) &&
        equalsNullable(this.fullName, contactEventDto.fullName) &&
        equalsNullable(this.details, contactEventDto.details);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(eventType), date, hashCodeNullable(fullName), hashCodeNullable(details));
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
    sb.append("class ContactEventDto {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

