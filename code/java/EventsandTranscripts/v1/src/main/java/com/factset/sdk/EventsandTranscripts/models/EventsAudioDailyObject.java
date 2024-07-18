/*
 * EVENTS AND TRANSCRIPTS API
 * <p>The Calendar Events API provides access to FactSet’s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * EventsAudioDailyObject
 */
@JsonPropertyOrder({
  EventsAudioDailyObject.JSON_PROPERTY_REPORT_ID,
  EventsAudioDailyObject.JSON_PROPERTY_FILE_NAME,
  EventsAudioDailyObject.JSON_PROPERTY_URL,
  EventsAudioDailyObject.JSON_PROPERTY_FILE_SIZE,
  EventsAudioDailyObject.JSON_PROPERTY_AUDIO_SOURCE_ID,
  EventsAudioDailyObject.JSON_PROPERTY_TICKER,
  EventsAudioDailyObject.JSON_PROPERTY_ENTITY_ID,
  EventsAudioDailyObject.JSON_PROPERTY_SOURCE_CODE,
  EventsAudioDailyObject.JSON_PROPERTY_TRIMMED,
  EventsAudioDailyObject.JSON_PROPERTY_DURATION_SECS,
  EventsAudioDailyObject.JSON_PROPERTY_START_OFFSET_SECONDS,
  EventsAudioDailyObject.JSON_PROPERTY_END_OFFSET_SECONDS,
  EventsAudioDailyObject.JSON_PROPERTY_START_TIME,
  EventsAudioDailyObject.JSON_PROPERTY_END_TIME,
  EventsAudioDailyObject.JSON_PROPERTY_UPLOAD_TIME,
  EventsAudioDailyObject.JSON_PROPERTY_SAMPLE_RATE,
  EventsAudioDailyObject.JSON_PROPERTY_BITRATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventsAudioDailyObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REPORT_ID = "reportId";
  private Integer reportId;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private BigDecimal fileSize;

  public static final String JSON_PROPERTY_AUDIO_SOURCE_ID = "audioSourceId";
  private JsonNullable<Integer> audioSourceId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private JsonNullable<String> ticker = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  /**
   * This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay
   */
  public enum SourceCodeEnum {
    WEBCAST("Webcast"),
    
    VENDOR("Vendor"),
    
    WEBCASTREPLAY("WebcastReplay"),
    
    FLASH("Flash"),
    
    REPLAY("Replay"),
    
    PHONE("Phone");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SOURCE_CODE = "sourceCode";
  private SourceCodeEnum sourceCode;

  public static final String JSON_PROPERTY_TRIMMED = "trimmed";
  private Boolean trimmed;

  public static final String JSON_PROPERTY_DURATION_SECS = "durationSecs";
  private JsonNullable<BigDecimal> durationSecs = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_START_OFFSET_SECONDS = "startOffsetSeconds";
  private JsonNullable<BigDecimal> startOffsetSeconds = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_END_OFFSET_SECONDS = "endOffsetSeconds";
  private JsonNullable<BigDecimal> endOffsetSeconds = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private JsonNullable<String> startTime = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private JsonNullable<String> endTime = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UPLOAD_TIME = "uploadTime";
  private JsonNullable<String> uploadTime = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAMPLE_RATE = "sampleRate";
  private JsonNullable<BigDecimal> sampleRate = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_BITRATE = "bitrate";
  private JsonNullable<BigDecimal> bitrate = JsonNullable.<BigDecimal>undefined();

  public EventsAudioDailyObject() { 
  }

  public EventsAudioDailyObject reportId(Integer reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables.
   * @return reportId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables.")
  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReportId() {
    return reportId;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportId(Integer reportId) {
    this.reportId = reportId;
  }


  public EventsAudioDailyObject fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The filename of the audio file.
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The filename of the audio file.")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public EventsAudioDailyObject url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A pre-signed URL that allows downloading the audio file, expiring after 24 hours.
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A pre-signed URL that allows downloading the audio file, expiring after 24 hours.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public EventsAudioDailyObject fileSize(BigDecimal fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Size of the Audio file, in bytes.
   * @return fileSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Size of the Audio file, in bytes.")
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(BigDecimal fileSize) {
    this.fileSize = fileSize;
  }


  public EventsAudioDailyObject audioSourceId(Integer audioSourceId) {
    this.audioSourceId = JsonNullable.<Integer>of(audioSourceId);
    return this;
  }

   /**
   * Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null.
   * @return audioSourceId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null.")
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


  public EventsAudioDailyObject ticker(String ticker) {
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


  public EventsAudioDailyObject entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * FactSet entity level identifier for the company hosting the event.
   * @return entityId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FactSet entity level identifier for the company hosting the event.")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public EventsAudioDailyObject sourceCode(SourceCodeEnum sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

   /**
   * This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay
   * @return sourceCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Webcast", value = "This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay")
  @JsonProperty(JSON_PROPERTY_SOURCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceCodeEnum getSourceCode() {
    return sourceCode;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceCode(SourceCodeEnum sourceCode) {
    this.sourceCode = sourceCode;
  }


  public EventsAudioDailyObject trimmed(Boolean trimmed) {
    this.trimmed = trimmed;
    return this;
  }

   /**
   *  The trimmed attribute indicates whether the audio is the trimmed version. If &#x60;sourceCode&#x60; is set to vendor, this attribute will always be true.    
   * @return trimmed
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = " The trimmed attribute indicates whether the audio is the trimmed version. If `sourceCode` is set to vendor, this attribute will always be true.    ")
  @JsonProperty(JSON_PROPERTY_TRIMMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrimmed() {
    return trimmed;
  }


  @JsonProperty(JSON_PROPERTY_TRIMMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrimmed(Boolean trimmed) {
    this.trimmed = trimmed;
  }


  public EventsAudioDailyObject durationSecs(BigDecimal durationSecs) {
    this.durationSecs = JsonNullable.<BigDecimal>of(durationSecs);
    return this;
  }

   /**
   * Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds.
   * @return durationSecs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds.")
  @JsonIgnore

  public BigDecimal getDurationSecs() {
        return durationSecs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DURATION_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getDurationSecs_JsonNullable() {
    return durationSecs;
  }
  
  @JsonProperty(JSON_PROPERTY_DURATION_SECS)
  public void setDurationSecs_JsonNullable(JsonNullable<BigDecimal> durationSecs) {
    this.durationSecs = durationSecs;
  }

  public void setDurationSecs(BigDecimal durationSecs) {
    this.durationSecs = JsonNullable.<BigDecimal>of(durationSecs);
  }


  public EventsAudioDailyObject startOffsetSeconds(BigDecimal startOffsetSeconds) {
    this.startOffsetSeconds = JsonNullable.<BigDecimal>of(startOffsetSeconds);
    return this;
  }

   /**
   * The delta in seconds between start of audio file to when FactSet marks the beginning of the call.
   * @return startOffsetSeconds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The delta in seconds between start of audio file to when FactSet marks the beginning of the call.")
  @JsonIgnore

  public BigDecimal getStartOffsetSeconds() {
        return startOffsetSeconds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_OFFSET_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getStartOffsetSeconds_JsonNullable() {
    return startOffsetSeconds;
  }
  
  @JsonProperty(JSON_PROPERTY_START_OFFSET_SECONDS)
  public void setStartOffsetSeconds_JsonNullable(JsonNullable<BigDecimal> startOffsetSeconds) {
    this.startOffsetSeconds = startOffsetSeconds;
  }

  public void setStartOffsetSeconds(BigDecimal startOffsetSeconds) {
    this.startOffsetSeconds = JsonNullable.<BigDecimal>of(startOffsetSeconds);
  }


  public EventsAudioDailyObject endOffsetSeconds(BigDecimal endOffsetSeconds) {
    this.endOffsetSeconds = JsonNullable.<BigDecimal>of(endOffsetSeconds);
    return this;
  }

   /**
   * The delta in seconds between startTime to when FactSet marks the end of the call.
   * @return endOffsetSeconds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The delta in seconds between startTime to when FactSet marks the end of the call.")
  @JsonIgnore

  public BigDecimal getEndOffsetSeconds() {
        return endOffsetSeconds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_OFFSET_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getEndOffsetSeconds_JsonNullable() {
    return endOffsetSeconds;
  }
  
  @JsonProperty(JSON_PROPERTY_END_OFFSET_SECONDS)
  public void setEndOffsetSeconds_JsonNullable(JsonNullable<BigDecimal> endOffsetSeconds) {
    this.endOffsetSeconds = endOffsetSeconds;
  }

  public void setEndOffsetSeconds(BigDecimal endOffsetSeconds) {
    this.endOffsetSeconds = JsonNullable.<BigDecimal>of(endOffsetSeconds);
  }


  public EventsAudioDailyObject startTime(String startTime) {
    this.startTime = JsonNullable.<String>of(startTime);
    return this;
  }

   /**
   * The official timestamp when FactSet begins the recording.
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The official timestamp when FactSet begins the recording.")
  @JsonIgnore

  public String getStartTime() {
        return startTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStartTime_JsonNullable() {
    return startTime;
  }
  
  @JsonProperty(JSON_PROPERTY_START_TIME)
  public void setStartTime_JsonNullable(JsonNullable<String> startTime) {
    this.startTime = startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = JsonNullable.<String>of(startTime);
  }


  public EventsAudioDailyObject endTime(String endTime) {
    this.endTime = JsonNullable.<String>of(endTime);
    return this;
  }

   /**
   * The official timestamp when FactSet ends the recording.
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The official timestamp when FactSet ends the recording.")
  @JsonIgnore

  public String getEndTime() {
        return endTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEndTime_JsonNullable() {
    return endTime;
  }
  
  @JsonProperty(JSON_PROPERTY_END_TIME)
  public void setEndTime_JsonNullable(JsonNullable<String> endTime) {
    this.endTime = endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = JsonNullable.<String>of(endTime);
  }


  public EventsAudioDailyObject uploadTime(String uploadTime) {
    this.uploadTime = JsonNullable.<String>of(uploadTime);
    return this;
  }

   /**
   * The official timestamp when FactSet publishes the audio file externally.
   * @return uploadTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The official timestamp when FactSet publishes the audio file externally.")
  @JsonIgnore

  public String getUploadTime() {
        return uploadTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPLOAD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUploadTime_JsonNullable() {
    return uploadTime;
  }
  
  @JsonProperty(JSON_PROPERTY_UPLOAD_TIME)
  public void setUploadTime_JsonNullable(JsonNullable<String> uploadTime) {
    this.uploadTime = uploadTime;
  }

  public void setUploadTime(String uploadTime) {
    this.uploadTime = JsonNullable.<String>of(uploadTime);
  }


  public EventsAudioDailyObject sampleRate(BigDecimal sampleRate) {
    this.sampleRate = JsonNullable.<BigDecimal>of(sampleRate);
    return this;
  }

   /**
   * The number of samples of audio carried per second in Kbps.
   * @return sampleRate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of samples of audio carried per second in Kbps.")
  @JsonIgnore

  public BigDecimal getSampleRate() {
        return sampleRate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getSampleRate_JsonNullable() {
    return sampleRate;
  }
  
  @JsonProperty(JSON_PROPERTY_SAMPLE_RATE)
  public void setSampleRate_JsonNullable(JsonNullable<BigDecimal> sampleRate) {
    this.sampleRate = sampleRate;
  }

  public void setSampleRate(BigDecimal sampleRate) {
    this.sampleRate = JsonNullable.<BigDecimal>of(sampleRate);
  }


  public EventsAudioDailyObject bitrate(BigDecimal bitrate) {
    this.bitrate = JsonNullable.<BigDecimal>of(bitrate);
    return this;
  }

   /**
   * The total number of bits of information stored per second of sound in Kbps.
   * @return bitrate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The total number of bits of information stored per second of sound in Kbps.")
  @JsonIgnore

  public BigDecimal getBitrate() {
        return bitrate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BITRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getBitrate_JsonNullable() {
    return bitrate;
  }
  
  @JsonProperty(JSON_PROPERTY_BITRATE)
  public void setBitrate_JsonNullable(JsonNullable<BigDecimal> bitrate) {
    this.bitrate = bitrate;
  }

  public void setBitrate(BigDecimal bitrate) {
    this.bitrate = JsonNullable.<BigDecimal>of(bitrate);
  }


  /**
   * Return true if this EventsAudioDailyObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsAudioDailyObject eventsAudioDailyObject = (EventsAudioDailyObject) o;
    return Objects.equals(this.reportId, eventsAudioDailyObject.reportId) &&
        Objects.equals(this.fileName, eventsAudioDailyObject.fileName) &&
        Objects.equals(this.url, eventsAudioDailyObject.url) &&
        Objects.equals(this.fileSize, eventsAudioDailyObject.fileSize) &&
        equalsNullable(this.audioSourceId, eventsAudioDailyObject.audioSourceId) &&
        equalsNullable(this.ticker, eventsAudioDailyObject.ticker) &&
        Objects.equals(this.entityId, eventsAudioDailyObject.entityId) &&
        Objects.equals(this.sourceCode, eventsAudioDailyObject.sourceCode) &&
        Objects.equals(this.trimmed, eventsAudioDailyObject.trimmed) &&
        equalsNullable(this.durationSecs, eventsAudioDailyObject.durationSecs) &&
        equalsNullable(this.startOffsetSeconds, eventsAudioDailyObject.startOffsetSeconds) &&
        equalsNullable(this.endOffsetSeconds, eventsAudioDailyObject.endOffsetSeconds) &&
        equalsNullable(this.startTime, eventsAudioDailyObject.startTime) &&
        equalsNullable(this.endTime, eventsAudioDailyObject.endTime) &&
        equalsNullable(this.uploadTime, eventsAudioDailyObject.uploadTime) &&
        equalsNullable(this.sampleRate, eventsAudioDailyObject.sampleRate) &&
        equalsNullable(this.bitrate, eventsAudioDailyObject.bitrate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, fileName, url, fileSize, hashCodeNullable(audioSourceId), hashCodeNullable(ticker), entityId, sourceCode, trimmed, hashCodeNullable(durationSecs), hashCodeNullable(startOffsetSeconds), hashCodeNullable(endOffsetSeconds), hashCodeNullable(startTime), hashCodeNullable(endTime), hashCodeNullable(uploadTime), hashCodeNullable(sampleRate), hashCodeNullable(bitrate));
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
    sb.append("class EventsAudioDailyObject {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    audioSourceId: ").append(toIndentedString(audioSourceId)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
    sb.append("    trimmed: ").append(toIndentedString(trimmed)).append("\n");
    sb.append("    durationSecs: ").append(toIndentedString(durationSecs)).append("\n");
    sb.append("    startOffsetSeconds: ").append(toIndentedString(startOffsetSeconds)).append("\n");
    sb.append("    endOffsetSeconds: ").append(toIndentedString(endOffsetSeconds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    uploadTime: ").append(toIndentedString(uploadTime)).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
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

