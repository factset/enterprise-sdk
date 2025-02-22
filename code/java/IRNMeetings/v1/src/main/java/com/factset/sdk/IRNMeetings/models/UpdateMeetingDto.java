/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
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
import com.factset.sdk.IRNMeetings.models.CreateBodyDto;
import com.factset.sdk.IRNMeetings.models.CreateCustomFieldValueDto;
import com.factset.sdk.IRNMeetings.models.ReferenceAttendeeDto;
import com.factset.sdk.IRNMeetings.models.RelatedRecordsDto;
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
 * UpdateMeetingDto
 */
@JsonPropertyOrder({
  UpdateMeetingDto.JSON_PROPERTY_TITLE,
  UpdateMeetingDto.JSON_PROPERTY_IDENTIFIER,
  UpdateMeetingDto.JSON_PROPERTY_START,
  UpdateMeetingDto.JSON_PROPERTY_END,
  UpdateMeetingDto.JSON_PROPERTY_LOCATIONS,
  UpdateMeetingDto.JSON_PROPERTY_ORGANIZER,
  UpdateMeetingDto.JSON_PROPERTY_ORGANIZER_ID,
  UpdateMeetingDto.JSON_PROPERTY_ATTENDEES,
  UpdateMeetingDto.JSON_PROPERTY_ALERT_ATTENDEES,
  UpdateMeetingDto.JSON_PROPERTY_ALERT_AUTHOR,
  UpdateMeetingDto.JSON_PROPERTY_RELATED_RECORDS,
  UpdateMeetingDto.JSON_PROPERTY_RELATED_CONTACTS,
  UpdateMeetingDto.JSON_PROPERTY_RELATED_SYMBOLS,
  UpdateMeetingDto.JSON_PROPERTY_BODY,
  UpdateMeetingDto.JSON_PROPERTY_CUSTOM_FIELD_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UpdateMeetingDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_END = "end";
  private String end;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private JsonNullable<java.util.List<String>> locations = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_ORGANIZER = "organizer";
  private JsonNullable<String> organizer = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORGANIZER_ID = "organizerId";
  private java.util.UUID organizerId;

  public static final String JSON_PROPERTY_ATTENDEES = "attendees";
  private JsonNullable<java.util.List<ReferenceAttendeeDto>> attendees = JsonNullable.<java.util.List<ReferenceAttendeeDto>>undefined();

  public static final String JSON_PROPERTY_ALERT_ATTENDEES = "alertAttendees";
  private Boolean alertAttendees = false;

  public static final String JSON_PROPERTY_ALERT_AUTHOR = "alertAuthor";
  private Boolean alertAuthor = false;

  public static final String JSON_PROPERTY_RELATED_RECORDS = "relatedRecords";
  private JsonNullable<RelatedRecordsDto> relatedRecords = JsonNullable.<RelatedRecordsDto>undefined();

  public static final String JSON_PROPERTY_RELATED_CONTACTS = "relatedContacts";
  private JsonNullable<java.util.List<java.util.UUID>> relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>undefined();

  public static final String JSON_PROPERTY_RELATED_SYMBOLS = "relatedSymbols";
  private JsonNullable<java.util.List<String>> relatedSymbols = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_BODY = "body";
  private JsonNullable<CreateBodyDto> body = JsonNullable.<CreateBodyDto>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FIELD_VALUES = "customFieldValues";
  private JsonNullable<java.util.List<CreateCustomFieldValueDto>> customFieldValues = JsonNullable.<java.util.List<CreateCustomFieldValueDto>>undefined();

  public UpdateMeetingDto() { 
  }

  @JsonCreator
  public UpdateMeetingDto(
    @JsonProperty(value=JSON_PROPERTY_TITLE, required=true) String title, 
    @JsonProperty(value=JSON_PROPERTY_IDENTIFIER, required=true) String identifier, 
    @JsonProperty(value=JSON_PROPERTY_START, required=true) String start, 
    @JsonProperty(value=JSON_PROPERTY_END, required=true) String end
  ) {
    this();
    this.title = title;
    this.identifier = identifier;
    this.start = start;
    this.end = end;
  }

  public UpdateMeetingDto title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  public UpdateMeetingDto identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIdentifier() {
    return identifier;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public UpdateMeetingDto start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(String start) {
    this.start = start;
  }


  public UpdateMeetingDto end(String end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(String end) {
    this.end = end;
  }


  public UpdateMeetingDto locations(java.util.List<String> locations) {
    this.locations = JsonNullable.<java.util.List<String>>of(locations);
    return this;
  }

  public UpdateMeetingDto addLocationsItem(String locationsItem) {
    if (this.locations == null || !this.locations.isPresent()) {
      this.locations = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.locations.get().add(locationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getLocations() {
        return locations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getLocations_JsonNullable() {
    return locations;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  public void setLocations_JsonNullable(JsonNullable<java.util.List<String>> locations) {
    this.locations = locations;
  }

  public void setLocations(java.util.List<String> locations) {
    this.locations = JsonNullable.<java.util.List<String>>of(locations);
  }


  public UpdateMeetingDto organizer(String organizer) {
    this.organizer = JsonNullable.<String>of(organizer);
    return this;
  }

   /**
   * Get organizer
   * @return organizer
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getOrganizer() {
        return organizer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORGANIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrganizer_JsonNullable() {
    return organizer;
  }
  
  @JsonProperty(JSON_PROPERTY_ORGANIZER)
  public void setOrganizer_JsonNullable(JsonNullable<String> organizer) {
    this.organizer = organizer;
  }

  public void setOrganizer(String organizer) {
    this.organizer = JsonNullable.<String>of(organizer);
  }


  public UpdateMeetingDto organizerId(java.util.UUID organizerId) {
    this.organizerId = organizerId;
    return this;
  }

   /**
   * Get organizerId
   * @return organizerId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getOrganizerId() {
    return organizerId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizerId(java.util.UUID organizerId) {
    this.organizerId = organizerId;
  }


  public UpdateMeetingDto attendees(java.util.List<ReferenceAttendeeDto> attendees) {
    this.attendees = JsonNullable.<java.util.List<ReferenceAttendeeDto>>of(attendees);
    return this;
  }

  public UpdateMeetingDto addAttendeesItem(ReferenceAttendeeDto attendeesItem) {
    if (this.attendees == null || !this.attendees.isPresent()) {
      this.attendees = JsonNullable.<java.util.List<ReferenceAttendeeDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.attendees.get().add(attendeesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attendees
   * @return attendees
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<ReferenceAttendeeDto> getAttendees() {
        return attendees.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTENDEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<ReferenceAttendeeDto>> getAttendees_JsonNullable() {
    return attendees;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTENDEES)
  public void setAttendees_JsonNullable(JsonNullable<java.util.List<ReferenceAttendeeDto>> attendees) {
    this.attendees = attendees;
  }

  public void setAttendees(java.util.List<ReferenceAttendeeDto> attendees) {
    this.attendees = JsonNullable.<java.util.List<ReferenceAttendeeDto>>of(attendees);
  }


  public UpdateMeetingDto alertAttendees(Boolean alertAttendees) {
    this.alertAttendees = alertAttendees;
    return this;
  }

   /**
   * Get alertAttendees
   * @return alertAttendees
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALERT_ATTENDEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAlertAttendees() {
    return alertAttendees;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_ATTENDEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertAttendees(Boolean alertAttendees) {
    this.alertAttendees = alertAttendees;
  }


  public UpdateMeetingDto alertAuthor(Boolean alertAuthor) {
    this.alertAuthor = alertAuthor;
    return this;
  }

   /**
   * Get alertAuthor
   * @return alertAuthor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALERT_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAlertAuthor() {
    return alertAuthor;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertAuthor(Boolean alertAuthor) {
    this.alertAuthor = alertAuthor;
  }


  public UpdateMeetingDto relatedRecords(RelatedRecordsDto relatedRecords) {
    this.relatedRecords = JsonNullable.<RelatedRecordsDto>of(relatedRecords);
    return this;
  }

   /**
   * Get relatedRecords
   * @return relatedRecords
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public RelatedRecordsDto getRelatedRecords() {
        return relatedRecords.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RelatedRecordsDto> getRelatedRecords_JsonNullable() {
    return relatedRecords;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATED_RECORDS)
  public void setRelatedRecords_JsonNullable(JsonNullable<RelatedRecordsDto> relatedRecords) {
    this.relatedRecords = relatedRecords;
  }

  public void setRelatedRecords(RelatedRecordsDto relatedRecords) {
    this.relatedRecords = JsonNullable.<RelatedRecordsDto>of(relatedRecords);
  }


  public UpdateMeetingDto relatedContacts(java.util.List<java.util.UUID> relatedContacts) {
    this.relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>of(relatedContacts);
    return this;
  }

  public UpdateMeetingDto addRelatedContactsItem(java.util.UUID relatedContactsItem) {
    if (this.relatedContacts == null || !this.relatedContacts.isPresent()) {
      this.relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>of(new java.util.ArrayList<>());
    }
    try {
      this.relatedContacts.get().add(relatedContactsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get relatedContacts
   * @return relatedContacts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<java.util.UUID> getRelatedContacts() {
        return relatedContacts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<java.util.UUID>> getRelatedContacts_JsonNullable() {
    return relatedContacts;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATED_CONTACTS)
  public void setRelatedContacts_JsonNullable(JsonNullable<java.util.List<java.util.UUID>> relatedContacts) {
    this.relatedContacts = relatedContacts;
  }

  public void setRelatedContacts(java.util.List<java.util.UUID> relatedContacts) {
    this.relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>of(relatedContacts);
  }


  public UpdateMeetingDto relatedSymbols(java.util.List<String> relatedSymbols) {
    this.relatedSymbols = JsonNullable.<java.util.List<String>>of(relatedSymbols);
    return this;
  }

  public UpdateMeetingDto addRelatedSymbolsItem(String relatedSymbolsItem) {
    if (this.relatedSymbols == null || !this.relatedSymbols.isPresent()) {
      this.relatedSymbols = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.relatedSymbols.get().add(relatedSymbolsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get relatedSymbols
   * @return relatedSymbols
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getRelatedSymbols() {
        return relatedSymbols.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getRelatedSymbols_JsonNullable() {
    return relatedSymbols;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATED_SYMBOLS)
  public void setRelatedSymbols_JsonNullable(JsonNullable<java.util.List<String>> relatedSymbols) {
    this.relatedSymbols = relatedSymbols;
  }

  public void setRelatedSymbols(java.util.List<String> relatedSymbols) {
    this.relatedSymbols = JsonNullable.<java.util.List<String>>of(relatedSymbols);
  }


  public UpdateMeetingDto body(CreateBodyDto body) {
    this.body = JsonNullable.<CreateBodyDto>of(body);
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public CreateBodyDto getBody() {
        return body.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CreateBodyDto> getBody_JsonNullable() {
    return body;
  }
  
  @JsonProperty(JSON_PROPERTY_BODY)
  public void setBody_JsonNullable(JsonNullable<CreateBodyDto> body) {
    this.body = body;
  }

  public void setBody(CreateBodyDto body) {
    this.body = JsonNullable.<CreateBodyDto>of(body);
  }


  public UpdateMeetingDto customFieldValues(java.util.List<CreateCustomFieldValueDto> customFieldValues) {
    this.customFieldValues = JsonNullable.<java.util.List<CreateCustomFieldValueDto>>of(customFieldValues);
    return this;
  }

  public UpdateMeetingDto addCustomFieldValuesItem(CreateCustomFieldValueDto customFieldValuesItem) {
    if (this.customFieldValues == null || !this.customFieldValues.isPresent()) {
      this.customFieldValues = JsonNullable.<java.util.List<CreateCustomFieldValueDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.customFieldValues.get().add(customFieldValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customFieldValues
   * @return customFieldValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<CreateCustomFieldValueDto> getCustomFieldValues() {
        return customFieldValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<CreateCustomFieldValueDto>> getCustomFieldValues_JsonNullable() {
    return customFieldValues;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_VALUES)
  public void setCustomFieldValues_JsonNullable(JsonNullable<java.util.List<CreateCustomFieldValueDto>> customFieldValues) {
    this.customFieldValues = customFieldValues;
  }

  public void setCustomFieldValues(java.util.List<CreateCustomFieldValueDto> customFieldValues) {
    this.customFieldValues = JsonNullable.<java.util.List<CreateCustomFieldValueDto>>of(customFieldValues);
  }


  /**
   * Return true if this UpdateMeetingDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMeetingDto updateMeetingDto = (UpdateMeetingDto) o;
    return Objects.equals(this.title, updateMeetingDto.title) &&
        Objects.equals(this.identifier, updateMeetingDto.identifier) &&
        Objects.equals(this.start, updateMeetingDto.start) &&
        Objects.equals(this.end, updateMeetingDto.end) &&
        equalsNullable(this.locations, updateMeetingDto.locations) &&
        equalsNullable(this.organizer, updateMeetingDto.organizer) &&
        Objects.equals(this.organizerId, updateMeetingDto.organizerId) &&
        equalsNullable(this.attendees, updateMeetingDto.attendees) &&
        Objects.equals(this.alertAttendees, updateMeetingDto.alertAttendees) &&
        Objects.equals(this.alertAuthor, updateMeetingDto.alertAuthor) &&
        equalsNullable(this.relatedRecords, updateMeetingDto.relatedRecords) &&
        equalsNullable(this.relatedContacts, updateMeetingDto.relatedContacts) &&
        equalsNullable(this.relatedSymbols, updateMeetingDto.relatedSymbols) &&
        equalsNullable(this.body, updateMeetingDto.body) &&
        equalsNullable(this.customFieldValues, updateMeetingDto.customFieldValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, identifier, start, end, hashCodeNullable(locations), hashCodeNullable(organizer), organizerId, hashCodeNullable(attendees), alertAttendees, alertAuthor, hashCodeNullable(relatedRecords), hashCodeNullable(relatedContacts), hashCodeNullable(relatedSymbols), hashCodeNullable(body), hashCodeNullable(customFieldValues));
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
    sb.append("class UpdateMeetingDto {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    organizer: ").append(toIndentedString(organizer)).append("\n");
    sb.append("    organizerId: ").append(toIndentedString(organizerId)).append("\n");
    sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
    sb.append("    alertAttendees: ").append(toIndentedString(alertAttendees)).append("\n");
    sb.append("    alertAuthor: ").append(toIndentedString(alertAuthor)).append("\n");
    sb.append("    relatedRecords: ").append(toIndentedString(relatedRecords)).append("\n");
    sb.append("    relatedContacts: ").append(toIndentedString(relatedContacts)).append("\n");
    sb.append("    relatedSymbols: ").append(toIndentedString(relatedSymbols)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    customFieldValues: ").append(toIndentedString(customFieldValues)).append("\n");
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

