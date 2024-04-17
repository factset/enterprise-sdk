/*
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.6.0
 * Contact: signals.api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Signals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Signals.models.EventDetailDataItemAllOf;
import com.factset.sdk.Signals.models.EventHeadlineDataItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Signals.JSON;


/**
 * EventDetailDataItem
 */
@JsonPropertyOrder({
  EventDetailDataItem.JSON_PROPERTY_REQUEST_ID,
  EventDetailDataItem.JSON_PROPERTY_COMPANY_NAME,
  EventDetailDataItem.JSON_PROPERTY_SIGNAL_ID,
  EventDetailDataItem.JSON_PROPERTY_SIGNAL_NAME,
  EventDetailDataItem.JSON_PROPERTY_THEME,
  EventDetailDataItem.JSON_PROPERTY_SOURCE,
  EventDetailDataItem.JSON_PROPERTY_EVENT_ID,
  EventDetailDataItem.JSON_PROPERTY_EVENT_DATE,
  EventDetailDataItem.JSON_PROPERTY_SUMMARY,
  EventDetailDataItem.JSON_PROPERTY_USER_RELEVANCE_SCORE,
  EventDetailDataItem.JSON_PROPERTY_CREATED,
  EventDetailDataItem.JSON_PROPERTY_UPDATED,
  EventDetailDataItem.JSON_PROPERTY_DETAILS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventDetailDataItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_SIGNAL_ID = "signalId";
  private String signalId;

  public static final String JSON_PROPERTY_SIGNAL_NAME = "signalName";
  private String signalName;

  public static final String JSON_PROPERTY_THEME = "theme";
  private String theme;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_EVENT_ID = "eventId";
  private java.util.UUID eventId;

  public static final String JSON_PROPERTY_EVENT_DATE = "eventDate";
  private LocalDate eventDate;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_USER_RELEVANCE_SCORE = "userRelevanceScore";
  private Float userRelevanceScore;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private OffsetDateTime updated;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private java.util.Map<String, Object> details = new java.util.HashMap<>();

  public EventDetailDataItem() { 
  }

  @JsonCreator
  public EventDetailDataItem(
    @JsonProperty(value=JSON_PROPERTY_REQUEST_ID, required=true) String requestId, 
    @JsonProperty(value=JSON_PROPERTY_SIGNAL_ID, required=true) String signalId, 
    @JsonProperty(value=JSON_PROPERTY_SIGNAL_NAME, required=true) String signalName, 
    @JsonProperty(value=JSON_PROPERTY_THEME, required=true) String theme, 
    @JsonProperty(value=JSON_PROPERTY_SOURCE, required=true) String source, 
    @JsonProperty(value=JSON_PROPERTY_EVENT_ID, required=true) java.util.UUID eventId, 
    @JsonProperty(value=JSON_PROPERTY_EVENT_DATE, required=true) LocalDate eventDate, 
    @JsonProperty(value=JSON_PROPERTY_SUMMARY, required=true) String summary, 
    @JsonProperty(value=JSON_PROPERTY_USER_RELEVANCE_SCORE, required=true) Float userRelevanceScore, 
    @JsonProperty(value=JSON_PROPERTY_CREATED, required=true) OffsetDateTime created, 
    @JsonProperty(value=JSON_PROPERTY_UPDATED, required=true) OffsetDateTime updated, 
    @JsonProperty(value=JSON_PROPERTY_DETAILS, required=true) java.util.Map<String, Object> details
  ) {
    this();
    this.requestId = requestId;
    this.signalId = signalId;
    this.signalName = signalName;
    this.theme = theme;
    this.source = source;
    this.eventId = eventId;
    this.eventDate = eventDate;
    this.summary = summary;
    this.userRelevanceScore = userRelevanceScore;
    this.created = created;
    this.updated = updated;
    this.details = details;
  }

  public EventDetailDataItem requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The id that was requested. This can be a ticker, cusip or factset entity id.
   * @return requestId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id that was requested. This can be a ticker, cusip or factset entity id.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public EventDetailDataItem companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the company reported in signal. Omitted if null.
   * @return companyName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the company reported in signal. Omitted if null.")
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public EventDetailDataItem signalId(String signalId) {
    this.signalId = signalId;
    return this;
  }

   /**
   * Signal Id for this event. e.g. dilutionTrigger
   * @return signalId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signal Id for this event. e.g. dilutionTrigger")
  @JsonProperty(JSON_PROPERTY_SIGNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignalId() {
    return signalId;
  }


  @JsonProperty(JSON_PROPERTY_SIGNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSignalId(String signalId) {
    this.signalId = signalId;
  }


  public EventDetailDataItem signalName(String signalName) {
    this.signalName = signalName;
    return this;
  }

   /**
   * Signal Name for this event. e.g. dilutionTrigger
   * @return signalName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signal Name for this event. e.g. dilutionTrigger")
  @JsonProperty(JSON_PROPERTY_SIGNAL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignalName() {
    return signalName;
  }


  @JsonProperty(JSON_PROPERTY_SIGNAL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSignalName(String signalName) {
    this.signalName = signalName;
  }


  public EventDetailDataItem theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Theme name of the signal for this event. e.g. Debt Capital Structure
   * @return theme
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Theme name of the signal for this event. e.g. Debt Capital Structure")
  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTheme() {
    return theme;
  }


  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTheme(String theme) {
    this.theme = theme;
  }


  public EventDetailDataItem source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Primary data provider for the signal this event belongs to. e.g. FactSet, Bitvore
   * @return source
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Primary data provider for the signal this event belongs to. e.g. FactSet, Bitvore")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(String source) {
    this.source = source;
  }


  public EventDetailDataItem eventId(java.util.UUID eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * A unique id for this event.
   * @return eventId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique id for this event.")
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.UUID getEventId() {
    return eventId;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventId(java.util.UUID eventId) {
    this.eventId = eventId;
  }


  public EventDetailDataItem eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * The UTC date/time of the event in ISO 8601 format.
   * @return eventDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The UTC date/time of the event in ISO 8601 format.")
  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getEventDate() {
    return eventDate;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }


  public EventDetailDataItem summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * One sentence summary of the event.
   * @return summary
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "One sentence summary of the event.")
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSummary(String summary) {
    this.summary = summary;
  }


  public EventDetailDataItem userRelevanceScore(Float userRelevanceScore) {
    this.userRelevanceScore = userRelevanceScore;
    return this;
  }

   /**
   * Relevancy score of this event for the requesting user on a scale of 0 to 1. Higher value indicates more relevancy.
   * @return userRelevanceScore
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Relevancy score of this event for the requesting user on a scale of 0 to 1. Higher value indicates more relevancy.")
  @JsonProperty(JSON_PROPERTY_USER_RELEVANCE_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getUserRelevanceScore() {
    return userRelevanceScore;
  }


  @JsonProperty(JSON_PROPERTY_USER_RELEVANCE_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserRelevanceScore(Float userRelevanceScore) {
    this.userRelevanceScore = userRelevanceScore;
  }


  public EventDetailDataItem created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Date/Time in UTC the event was first recorded in our data store.
   * @return created
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2021-04-26T06:39:40.094Z", required = true, value = "Date/Time in UTC the event was first recorded in our data store.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public EventDetailDataItem updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Date/Time in UTC the event was last updated.
   * @return updated
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2021-04-26T06:39:40.094Z", required = true, value = "Date/Time in UTC the event was last updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getUpdated() {
    return updated;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public EventDetailDataItem details(java.util.Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public EventDetailDataItem putDetailsItem(String key, Object detailsItem) {
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Signal specific event properties.
   * @return details
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signal specific event properties.")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public java.util.Map<String, Object> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setDetails(java.util.Map<String, Object> details) {
    this.details = details;
  }


  /**
   * Return true if this eventDetailDataItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDetailDataItem eventDetailDataItem = (EventDetailDataItem) o;
    return Objects.equals(this.requestId, eventDetailDataItem.requestId) &&
        Objects.equals(this.companyName, eventDetailDataItem.companyName) &&
        Objects.equals(this.signalId, eventDetailDataItem.signalId) &&
        Objects.equals(this.signalName, eventDetailDataItem.signalName) &&
        Objects.equals(this.theme, eventDetailDataItem.theme) &&
        Objects.equals(this.source, eventDetailDataItem.source) &&
        Objects.equals(this.eventId, eventDetailDataItem.eventId) &&
        Objects.equals(this.eventDate, eventDetailDataItem.eventDate) &&
        Objects.equals(this.summary, eventDetailDataItem.summary) &&
        Objects.equals(this.userRelevanceScore, eventDetailDataItem.userRelevanceScore) &&
        Objects.equals(this.created, eventDetailDataItem.created) &&
        Objects.equals(this.updated, eventDetailDataItem.updated) &&
        Objects.equals(this.details, eventDetailDataItem.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, companyName, signalId, signalName, theme, source, eventId, eventDate, summary, userRelevanceScore, created, updated, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDetailDataItem {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    signalId: ").append(toIndentedString(signalId)).append("\n");
    sb.append("    signalName: ").append(toIndentedString(signalName)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    userRelevanceScore: ").append(toIndentedString(userRelevanceScore)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

