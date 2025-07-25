/*
 * Events and Transcripts API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * Search criteria for audio files based on date range.
 */
@ApiModel(description = "Search criteria for audio files based on date range.")
@JsonPropertyOrder({
  AudioByDateRequest.JSON_PROPERTY_START_DATE,
  AudioByDateRequest.JSON_PROPERTY_END_DATE,
  AudioByDateRequest.JSON_PROPERTY_START_DATE_RELATIVE,
  AudioByDateRequest.JSON_PROPERTY_END_DATE_RELATIVE,
  AudioByDateRequest.JSON_PROPERTY_AUDIO_SOURCE,
  AudioByDateRequest.JSON_PROPERTY_IDS,
  AudioByDateRequest.JSON_PROPERTY_TRIMMED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AudioByDateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private LocalDate startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private LocalDate endDate;

  public static final String JSON_PROPERTY_START_DATE_RELATIVE = "startDateRelative";
  private Integer startDateRelative;

  public static final String JSON_PROPERTY_END_DATE_RELATIVE = "endDateRelative";
  private Integer endDateRelative;

  /**
   * Source of the Audio file: * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay          
   */
  public enum AudioSourceEnum {
    PHONE("Phone"),
    
    WEBCAST("Webcast"),
    
    VENDOR("Vendor"),
    
    WEBCASTREPLAY("WebcastReplay"),
    
    FLASH("Flash"),
    
    REPLAY("Replay");

    private String value;

    AudioSourceEnum(String value) {
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
    public static AudioSourceEnum fromValue(String value) {
      for (AudioSourceEnum b : AudioSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUDIO_SOURCE = "audioSource";
  private AudioSourceEnum audioSource;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = null;

  public static final String JSON_PROPERTY_TRIMMED = "trimmed";
  private Boolean trimmed = false;

  public AudioByDateRequest() { 
  }

  public AudioByDateRequest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The earliest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - Data available from 10th May 2011 onwards. 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Sat Jan 01 00:00:00 UTC 2022", value = "The earliest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either `startDate` or `startDateRelative` should be used, but not both.* - Data available from 10th May 2011 onwards. ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public AudioByDateRequest endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Wed Jun 01 00:00:00 UTC 2022", value = "The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either `endDate` or `endDateRelative` should be used, but not both.* ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public AudioByDateRequest startDateRelative(Integer startDateRelative) {
    this.startDateRelative = startDateRelative;
    return this;
  }

   /**
   * The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* 
   * maximum: 0
   * @return startDateRelative
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "-3", value = "The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer ('0' for today, '-1' for yesterday, etc.). - *Either `startDate` or `startDateRelative` should be used, but not both.* ")
  @JsonProperty(JSON_PROPERTY_START_DATE_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartDateRelative() {
    return startDateRelative;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDateRelative(Integer startDateRelative) {
    this.startDateRelative = startDateRelative;
  }


  public AudioByDateRequest endDateRelative(Integer endDateRelative) {
    this.endDateRelative = endDateRelative;
    return this;
  }

   /**
   * The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* 
   * maximum: 0
   * @return endDateRelative
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "-1", value = "The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer ('0' for today, '-1' for yesterday, etc.). - *Either `endDate` or `endDateRelative` should be used, but not both.* ")
  @JsonProperty(JSON_PROPERTY_END_DATE_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndDateRelative() {
    return endDateRelative;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDateRelative(Integer endDateRelative) {
    this.endDateRelative = endDateRelative;
  }


  public AudioByDateRequest audioSource(AudioSourceEnum audioSource) {
    this.audioSource = audioSource;
    return this;
  }

   /**
   * Source of the Audio file: * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay          
   * @return audioSource
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Source of the Audio file: * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay          ")
  @JsonProperty(JSON_PROPERTY_AUDIO_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudioSourceEnum getAudioSource() {
    return audioSource;
  }


  @JsonProperty(JSON_PROPERTY_AUDIO_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudioSource(AudioSourceEnum audioSource) {
    this.audioSource = audioSource;
  }


  public AudioByDateRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public AudioByDateRequest addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new java.util.ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Filter results based on ticker-region or Entity ID.
   * @return ids
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"FDS-US\",\"AAPL-US\"]", value = "Filter results based on ticker-region or Entity ID.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public AudioByDateRequest trimmed(Boolean trimmed) {
    this.trimmed = trimmed;
    return this;
  }

   /**
   * Search for trimmed audio files (non-speaking portions removed).
   * @return trimmed
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Search for trimmed audio files (non-speaking portions removed).")
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


  /**
   * Return true if this AudioByDateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioByDateRequest audioByDateRequest = (AudioByDateRequest) o;
    return Objects.equals(this.startDate, audioByDateRequest.startDate) &&
        Objects.equals(this.endDate, audioByDateRequest.endDate) &&
        Objects.equals(this.startDateRelative, audioByDateRequest.startDateRelative) &&
        Objects.equals(this.endDateRelative, audioByDateRequest.endDateRelative) &&
        Objects.equals(this.audioSource, audioByDateRequest.audioSource) &&
        Objects.equals(this.ids, audioByDateRequest.ids) &&
        Objects.equals(this.trimmed, audioByDateRequest.trimmed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, startDateRelative, endDateRelative, audioSource, ids, trimmed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioByDateRequest {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDateRelative: ").append(toIndentedString(startDateRelative)).append("\n");
    sb.append("    endDateRelative: ").append(toIndentedString(endDateRelative)).append("\n");
    sb.append("    audioSource: ").append(toIndentedString(audioSource)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    trimmed: ").append(toIndentedString(trimmed)).append("\n");
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

