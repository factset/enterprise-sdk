/*
 * EVENTS AND TRANSCRIPTS API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.EventsandTranscripts.models;

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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * TranscriptObjectOne
 */
@JsonPropertyOrder({
  TranscriptObjectOne.JSON_PROPERTY_VERSION_ID,
  TranscriptObjectOne.JSON_PROPERTY_PRIMARY_IDS,
  TranscriptObjectOne.JSON_PROPERTY_SEARCH_ID,
  TranscriptObjectOne.JSON_PROPERTY_ALL_IDS,
  TranscriptObjectOne.JSON_PROPERTY_REPORT_ID,
  TranscriptObjectOne.JSON_PROPERTY_EVENT_ID,
  TranscriptObjectOne.JSON_PROPERTY_EVENT_DATE,
  TranscriptObjectOne.JSON_PROPERTY_TRANSCRIPT_TYPE,
  TranscriptObjectOne.JSON_PROPERTY_HEADLINE,
  TranscriptObjectOne.JSON_PROPERTY_STORY_DATE_TIME,
  TranscriptObjectOne.JSON_PROPERTY_UPLOAD_DATE_TIME,
  TranscriptObjectOne.JSON_PROPERTY_EVENT_TYPE,
  TranscriptObjectOne.JSON_PROPERTY_CATEGORIES,
  TranscriptObjectOne.JSON_PROPERTY_TRANSCRIPTS_LINK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TranscriptObjectOne implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VERSION_ID = "versionId";
  private String versionId;

  public static final String JSON_PROPERTY_PRIMARY_IDS = "primaryIds";
  private java.util.List<String> primaryIds = null;

  public static final String JSON_PROPERTY_SEARCH_ID = "searchId";
  private String searchId;

  public static final String JSON_PROPERTY_ALL_IDS = "allIds";
  private java.util.List<String> allIds = null;

  public static final String JSON_PROPERTY_REPORT_ID = "reportId";
  private String reportId;

  public static final String JSON_PROPERTY_EVENT_ID = "eventId";
  private String eventId;

  public static final String JSON_PROPERTY_EVENT_DATE = "eventDate";
  private LocalDate eventDate;

  /**
   * Specifies the type of transcript.  
   */
  public enum TranscriptTypeEnum {
    RAW("Raw"),
    
    CORRECTED("Corrected");

    private String value;

    TranscriptTypeEnum(String value) {
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
    public static TranscriptTypeEnum fromValue(String value) {
      for (TranscriptTypeEnum b : TranscriptTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRANSCRIPT_TYPE = "transcriptType";
  private TranscriptTypeEnum transcriptType;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_STORY_DATE_TIME = "storyDateTime";
  private OffsetDateTime storyDateTime;

  public static final String JSON_PROPERTY_UPLOAD_DATE_TIME = "uploadDateTime";
  private OffsetDateTime uploadDateTime;

  /**
   * Specifies the type of event. Choose from the available options. 
   */
  public enum EventTypeEnum {
    EARNINGS("Earnings"),
    
    GUIDANCE("Guidance"),
    
    ANALYSTSSHAREHOLDERSMEETING("AnalystsShareholdersMeeting"),
    
    CONFERENCEPRESENTATION("ConferencePresentation"),
    
    SALESREVENUE("SalesRevenue"),
    
    SPECIALSITUATION("SpecialSituation");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private EventTypeEnum eventType;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<String> categories = null;

  public static final String JSON_PROPERTY_TRANSCRIPTS_LINK = "transcriptsLink";
  private String transcriptsLink;

  public TranscriptObjectOne() { 
  }

  public TranscriptObjectOne versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;.
   * @return versionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Used to distinguish the corrected reports. As such, one `reportId` can have many `versionIds`.")
  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersionId() {
    return versionId;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  public TranscriptObjectOne primaryIds(java.util.List<String> primaryIds) {
    this.primaryIds = primaryIds;
    return this;
  }

  public TranscriptObjectOne addPrimaryIdsItem(String primaryIdsItem) {
    if (this.primaryIds == null) {
      this.primaryIds = new java.util.ArrayList<>();
    }
    this.primaryIds.add(primaryIdsItem);
    return this;
  }

   /**
   * Refers to the main companies a particular document pertains to.
   * @return primaryIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Refers to the main companies a particular document pertains to.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getPrimaryIds() {
    return primaryIds;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryIds(java.util.List<String> primaryIds) {
    this.primaryIds = primaryIds;
  }


  public TranscriptObjectOne searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }

   /**
   * Returns IDs used in the ids parameter. The identifier type is based on what was used in the parameter
   * @return searchId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Returns IDs used in the ids parameter. The identifier type is based on what was used in the parameter")
  @JsonProperty(JSON_PROPERTY_SEARCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchId() {
    return searchId;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }


  public TranscriptObjectOne allIds(java.util.List<String> allIds) {
    this.allIds = allIds;
    return this;
  }

  public TranscriptObjectOne addAllIdsItem(String allIdsItem) {
    if (this.allIds == null) {
      this.allIds = new java.util.ArrayList<>();
    }
    this.allIds.add(allIdsItem);
    return this;
  }

   /**
   * Refers to all companies mentioned in the document. 
   * @return allIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Refers to all companies mentioned in the document. ")
  @JsonProperty(JSON_PROPERTY_ALL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getAllIds() {
    return allIds;
  }


  @JsonProperty(JSON_PROPERTY_ALL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllIds(java.util.List<String> allIds) {
    this.allIds = allIds;
  }


  public TranscriptObjectOne reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * This is a unique identifier for a specific transcript (audio or video) returned.
   * @return reportId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This is a unique identifier for a specific transcript (audio or video) returned.")
  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportId() {
    return reportId;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public TranscriptObjectOne eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * ID of the conference call.
   * @return eventId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ID of the conference call.")
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventId() {
    return eventId;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public TranscriptObjectOne eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * The date when the event took place. Formatted as &#39;YYYY-MM-DD&#39;.
   * @return eventDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The date when the event took place. Formatted as 'YYYY-MM-DD'.")
  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getEventDate() {
    return eventDate;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }


  public TranscriptObjectOne transcriptType(TranscriptTypeEnum transcriptType) {
    this.transcriptType = transcriptType;
    return this;
  }

   /**
   * Specifies the type of transcript.  
   * @return transcriptType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of transcript.  ")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TranscriptTypeEnum getTranscriptType() {
    return transcriptType;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptType(TranscriptTypeEnum transcriptType) {
    this.transcriptType = transcriptType;
  }


  public TranscriptObjectOne headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Headline of the story.
   * @return headline
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Headline of the story.")
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public TranscriptObjectOne storyDateTime(OffsetDateTime storyDateTime) {
    this.storyDateTime = storyDateTime;
    return this;
  }

   /**
   * Refers to either the date and time of the story, when it is available in workstation (in the specified timezone) or the date and time FactSet received it from the vendor.
   * @return storyDateTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Refers to either the date and time of the story, when it is available in workstation (in the specified timezone) or the date and time FactSet received it from the vendor.")
  @JsonProperty(JSON_PROPERTY_STORY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStoryDateTime() {
    return storyDateTime;
  }


  @JsonProperty(JSON_PROPERTY_STORY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoryDateTime(OffsetDateTime storyDateTime) {
    this.storyDateTime = storyDateTime;
  }


  public TranscriptObjectOne uploadDateTime(OffsetDateTime uploadDateTime) {
    this.uploadDateTime = uploadDateTime;
    return this;
  }

   /**
   * It is the time when transcript is created (in the specified timezone).
   * @return uploadDateTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "It is the time when transcript is created (in the specified timezone).")
  @JsonProperty(JSON_PROPERTY_UPLOAD_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUploadDateTime() {
    return uploadDateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadDateTime(OffsetDateTime uploadDateTime) {
    this.uploadDateTime = uploadDateTime;
  }


  public TranscriptObjectOne eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Specifies the type of event. Choose from the available options. 
   * @return eventType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of event. Choose from the available options. ")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventTypeEnum getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public TranscriptObjectOne categories(java.util.List<String> categories) {
    this.categories = categories;
    return this;
  }

  public TranscriptObjectOne addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Categories are country, industry, and subject codes. This is a comma-separated list.
   * @return categories
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Categories are country, industry, and subject codes. This is a comma-separated list.")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<String> categories) {
    this.categories = categories;
  }


  public TranscriptObjectOne transcriptsLink(String transcriptsLink) {
    this.transcriptsLink = transcriptsLink;
    return this;
  }

   /**
   * This is a link for downloading the document with an expiration duration of 24 hours.
   * @return transcriptsLink
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This is a link for downloading the document with an expiration duration of 24 hours.")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTS_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTranscriptsLink() {
    return transcriptsLink;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTS_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptsLink(String transcriptsLink) {
    this.transcriptsLink = transcriptsLink;
  }


  /**
   * Return true if this TranscriptObjectOne object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptObjectOne transcriptObjectOne = (TranscriptObjectOne) o;
    return Objects.equals(this.versionId, transcriptObjectOne.versionId) &&
        Objects.equals(this.primaryIds, transcriptObjectOne.primaryIds) &&
        Objects.equals(this.searchId, transcriptObjectOne.searchId) &&
        Objects.equals(this.allIds, transcriptObjectOne.allIds) &&
        Objects.equals(this.reportId, transcriptObjectOne.reportId) &&
        Objects.equals(this.eventId, transcriptObjectOne.eventId) &&
        Objects.equals(this.eventDate, transcriptObjectOne.eventDate) &&
        Objects.equals(this.transcriptType, transcriptObjectOne.transcriptType) &&
        Objects.equals(this.headline, transcriptObjectOne.headline) &&
        Objects.equals(this.storyDateTime, transcriptObjectOne.storyDateTime) &&
        Objects.equals(this.uploadDateTime, transcriptObjectOne.uploadDateTime) &&
        Objects.equals(this.eventType, transcriptObjectOne.eventType) &&
        Objects.equals(this.categories, transcriptObjectOne.categories) &&
        Objects.equals(this.transcriptsLink, transcriptObjectOne.transcriptsLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, primaryIds, searchId, allIds, reportId, eventId, eventDate, transcriptType, headline, storyDateTime, uploadDateTime, eventType, categories, transcriptsLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptObjectOne {\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    primaryIds: ").append(toIndentedString(primaryIds)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    allIds: ").append(toIndentedString(allIds)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    transcriptType: ").append(toIndentedString(transcriptType)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    storyDateTime: ").append(toIndentedString(storyDateTime)).append("\n");
    sb.append("    uploadDateTime: ").append(toIndentedString(uploadDateTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    transcriptsLink: ").append(toIndentedString(transcriptsLink)).append("\n");
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

