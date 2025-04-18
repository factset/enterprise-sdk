/*
 * EVENTS AND TRANSCRIPTS API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.2.0
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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * NrtCallsObject
 */
@JsonPropertyOrder({
  NrtCallsObject.JSON_PROPERTY_REPORT_ID,
  NrtCallsObject.JSON_PROPERTY_SOURCE_CODE,
  NrtCallsObject.JSON_PROPERTY_AUDIO_SOURCE_ID,
  NrtCallsObject.JSON_PROPERTY_TICKER,
  NrtCallsObject.JSON_PROPERTY_ENTITY_ID,
  NrtCallsObject.JSON_PROPERTY_EVENT_TYPE,
  NrtCallsObject.JSON_PROPERTY_EVENT_TITLE,
  NrtCallsObject.JSON_PROPERTY_CALL_STATUS,
  NrtCallsObject.JSON_PROPERTY_RECORDING_START_TIME,
  NrtCallsObject.JSON_PROPERTY_EVENT_DATETIME_UTC
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class NrtCallsObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REPORT_ID = "reportId";
  private JsonNullable<Integer> reportId = JsonNullable.<Integer>undefined();

  /**
   * Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast.
   */
  public enum SourceCodeEnum {
    PHONEREPLAY("PhoneReplay"),
    
    WEBCAST("Webcast");

    private String value;

    SourceCodeEnum(String value) {
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
    public static SourceCodeEnum fromValue(String value) {
      for (SourceCodeEnum b : SourceCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SOURCE_CODE = "sourceCode";
  private JsonNullable<SourceCodeEnum> sourceCode = JsonNullable.<SourceCodeEnum>undefined();

  public static final String JSON_PROPERTY_AUDIO_SOURCE_ID = "audioSourceId";
  private JsonNullable<Integer> audioSourceId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private JsonNullable<String> ticker = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private JsonNullable<String> entityId = JsonNullable.<String>undefined();

  /**
   * Refers to the various event types covered by FactSet CallStreet.
   */
  public enum EventTypeEnum {
    ANALYSTSINVESTORSSHAREHOLDERSMEETING("AnalystsInvestorsShareholdersMeeting"),
    
    EARNINGSCALL("EarningsCall"),
    
    EARNINGSRELEASE("EarningsRelease"),
    
    GUIDANCE("Guidance"),
    
    SALESREVENUECALL("SalesRevenueCall"),
    
    SALESREVENUERELEASE("SalesRevenueRelease"),
    
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
      return null;
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private JsonNullable<EventTypeEnum> eventType = JsonNullable.<EventTypeEnum>undefined();

  public static final String JSON_PROPERTY_EVENT_TITLE = "eventTitle";
  private JsonNullable<String> eventTitle = JsonNullable.<String>undefined();

  /**
   * Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source.
   */
  public enum CallStatusEnum {
    INPROGRESS("InProgress"),
    
    ENDED("Ended"),
    
    ENDEDWITHOUTNOTIFICATION("EndedWithoutNotification"),
    
    ISSUEATSOURCE("IssueAtSource");

    private String value;

    CallStatusEnum(String value) {
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
    public static CallStatusEnum fromValue(String value) {
      for (CallStatusEnum b : CallStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CALL_STATUS = "callStatus";
  private JsonNullable<CallStatusEnum> callStatus = JsonNullable.<CallStatusEnum>undefined();

  public static final String JSON_PROPERTY_RECORDING_START_TIME = "recordingStartTime";
  private JsonNullable<OffsetDateTime> recordingStartTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_EVENT_DATETIME_UTC = "eventDatetimeUtc";
  private JsonNullable<OffsetDateTime> eventDatetimeUtc = JsonNullable.<OffsetDateTime>undefined();

  public NrtCallsObject() { 
  }

  public NrtCallsObject reportId(Integer reportId) {
    this.reportId = JsonNullable.<Integer>of(reportId);
    return this;
  }

   /**
   * The unique ID for an event.
   * @return reportId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The unique ID for an event.")
  @JsonIgnore

  public Integer getReportId() {
        return reportId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getReportId_JsonNullable() {
    return reportId;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  public void setReportId_JsonNullable(JsonNullable<Integer> reportId) {
    this.reportId = reportId;
  }

  public void setReportId(Integer reportId) {
    this.reportId = JsonNullable.<Integer>of(reportId);
  }


  public NrtCallsObject sourceCode(SourceCodeEnum sourceCode) {
    this.sourceCode = JsonNullable.<SourceCodeEnum>of(sourceCode);
    return this;
  }

   /**
   * Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast.
   * @return sourceCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast.")
  @JsonIgnore

  public SourceCodeEnum getSourceCode() {
        return sourceCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SourceCodeEnum> getSourceCode_JsonNullable() {
    return sourceCode;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_CODE)
  public void setSourceCode_JsonNullable(JsonNullable<SourceCodeEnum> sourceCode) {
    this.sourceCode = sourceCode;
  }

  public void setSourceCode(SourceCodeEnum sourceCode) {
    this.sourceCode = JsonNullable.<SourceCodeEnum>of(sourceCode);
  }


  public NrtCallsObject audioSourceId(Integer audioSourceId) {
    this.audioSourceId = JsonNullable.<Integer>of(audioSourceId);
    return this;
  }

   /**
   * Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs.
   * @return audioSourceId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs.")
  @JsonIgnore

  public Integer getAudioSourceId() {
        return audioSourceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUDIO_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getAudioSourceId_JsonNullable() {
    return audioSourceId;
  }
  
  @JsonProperty(JSON_PROPERTY_AUDIO_SOURCE_ID)
  public void setAudioSourceId_JsonNullable(JsonNullable<Integer> audioSourceId) {
    this.audioSourceId = audioSourceId;
  }

  public void setAudioSourceId(Integer audioSourceId) {
    this.audioSourceId = JsonNullable.<Integer>of(audioSourceId);
  }


  public NrtCallsObject ticker(String ticker) {
    this.ticker = JsonNullable.<String>of(ticker);
    return this;
  }

   /**
   * Ticker-region identifier for the company hosting the event.
   * @return ticker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ticker-region identifier for the company hosting the event.")
  @JsonIgnore

  public String getTicker() {
        return ticker.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTicker_JsonNullable() {
    return ticker;
  }
  
  @JsonProperty(JSON_PROPERTY_TICKER)
  public void setTicker_JsonNullable(JsonNullable<String> ticker) {
    this.ticker = ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = JsonNullable.<String>of(ticker);
  }


  public NrtCallsObject entityId(String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
    return this;
  }

   /**
   * Factset entity level identifier for the company hosting the event.
   * @return entityId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Factset entity level identifier for the company hosting the event.")
  @JsonIgnore

  public String getEntityId() {
        return entityId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityId_JsonNullable() {
    return entityId;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  public void setEntityId_JsonNullable(JsonNullable<String> entityId) {
    this.entityId = entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
  }


  public NrtCallsObject eventType(EventTypeEnum eventType) {
    this.eventType = JsonNullable.<EventTypeEnum>of(eventType);
    return this;
  }

   /**
   * Refers to the various event types covered by FactSet CallStreet.
   * @return eventType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Refers to the various event types covered by FactSet CallStreet.")
  @JsonIgnore

  public EventTypeEnum getEventType() {
        return eventType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<EventTypeEnum> getEventType_JsonNullable() {
    return eventType;
  }
  
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  public void setEventType_JsonNullable(JsonNullable<EventTypeEnum> eventType) {
    this.eventType = eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = JsonNullable.<EventTypeEnum>of(eventType);
  }


  public NrtCallsObject eventTitle(String eventTitle) {
    this.eventTitle = JsonNullable.<String>of(eventTitle);
    return this;
  }

   /**
   * Title of the Event.
   * @return eventTitle
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Title of the Event.")
  @JsonIgnore

  public String getEventTitle() {
        return eventTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEventTitle_JsonNullable() {
    return eventTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_EVENT_TITLE)
  public void setEventTitle_JsonNullable(JsonNullable<String> eventTitle) {
    this.eventTitle = eventTitle;
  }

  public void setEventTitle(String eventTitle) {
    this.eventTitle = JsonNullable.<String>of(eventTitle);
  }


  public NrtCallsObject callStatus(CallStatusEnum callStatus) {
    this.callStatus = JsonNullable.<CallStatusEnum>of(callStatus);
    return this;
  }

   /**
   * Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source.
   * @return callStatus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source.")
  @JsonIgnore

  public CallStatusEnum getCallStatus() {
        return callStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CallStatusEnum> getCallStatus_JsonNullable() {
    return callStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_CALL_STATUS)
  public void setCallStatus_JsonNullable(JsonNullable<CallStatusEnum> callStatus) {
    this.callStatus = callStatus;
  }

  public void setCallStatus(CallStatusEnum callStatus) {
    this.callStatus = JsonNullable.<CallStatusEnum>of(callStatus);
  }


  public NrtCallsObject recordingStartTime(OffsetDateTime recordingStartTime) {
    this.recordingStartTime = JsonNullable.<OffsetDateTime>of(recordingStartTime);
    return this;
  }

   /**
   * Get recordingStartTime
   * @return recordingStartTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getRecordingStartTime() {
        return recordingStartTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECORDING_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getRecordingStartTime_JsonNullable() {
    return recordingStartTime;
  }
  
  @JsonProperty(JSON_PROPERTY_RECORDING_START_TIME)
  public void setRecordingStartTime_JsonNullable(JsonNullable<OffsetDateTime> recordingStartTime) {
    this.recordingStartTime = recordingStartTime;
  }

  public void setRecordingStartTime(OffsetDateTime recordingStartTime) {
    this.recordingStartTime = JsonNullable.<OffsetDateTime>of(recordingStartTime);
  }


  public NrtCallsObject eventDatetimeUtc(OffsetDateTime eventDatetimeUtc) {
    this.eventDatetimeUtc = JsonNullable.<OffsetDateTime>of(eventDatetimeUtc);
    return this;
  }

   /**
   * The official UTC timestamp of the start of the event.
   * @return eventDatetimeUtc
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The official UTC timestamp of the start of the event.")
  @JsonIgnore

  public OffsetDateTime getEventDatetimeUtc() {
        return eventDatetimeUtc.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENT_DATETIME_UTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getEventDatetimeUtc_JsonNullable() {
    return eventDatetimeUtc;
  }
  
  @JsonProperty(JSON_PROPERTY_EVENT_DATETIME_UTC)
  public void setEventDatetimeUtc_JsonNullable(JsonNullable<OffsetDateTime> eventDatetimeUtc) {
    this.eventDatetimeUtc = eventDatetimeUtc;
  }

  public void setEventDatetimeUtc(OffsetDateTime eventDatetimeUtc) {
    this.eventDatetimeUtc = JsonNullable.<OffsetDateTime>of(eventDatetimeUtc);
  }


  /**
   * Return true if this NrtCallsObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NrtCallsObject nrtCallsObject = (NrtCallsObject) o;
    return equalsNullable(this.reportId, nrtCallsObject.reportId) &&
        equalsNullable(this.sourceCode, nrtCallsObject.sourceCode) &&
        equalsNullable(this.audioSourceId, nrtCallsObject.audioSourceId) &&
        equalsNullable(this.ticker, nrtCallsObject.ticker) &&
        equalsNullable(this.entityId, nrtCallsObject.entityId) &&
        equalsNullable(this.eventType, nrtCallsObject.eventType) &&
        equalsNullable(this.eventTitle, nrtCallsObject.eventTitle) &&
        equalsNullable(this.callStatus, nrtCallsObject.callStatus) &&
        equalsNullable(this.recordingStartTime, nrtCallsObject.recordingStartTime) &&
        equalsNullable(this.eventDatetimeUtc, nrtCallsObject.eventDatetimeUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(reportId), hashCodeNullable(sourceCode), hashCodeNullable(audioSourceId), hashCodeNullable(ticker), hashCodeNullable(entityId), hashCodeNullable(eventType), hashCodeNullable(eventTitle), hashCodeNullable(callStatus), hashCodeNullable(recordingStartTime), hashCodeNullable(eventDatetimeUtc));
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
    sb.append("class NrtCallsObject {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
    sb.append("    audioSourceId: ").append(toIndentedString(audioSourceId)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTitle: ").append(toIndentedString(eventTitle)).append("\n");
    sb.append("    callStatus: ").append(toIndentedString(callStatus)).append("\n");
    sb.append("    recordingStartTime: ").append(toIndentedString(recordingStartTime)).append("\n");
    sb.append("    eventDatetimeUtc: ").append(toIndentedString(eventDatetimeUtc)).append("\n");
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

