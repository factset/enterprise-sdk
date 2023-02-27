/*
 * Documents Distributor - CallStreet Events
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.8.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.DocumentsDistributorCallStreetEvents.models;

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
import com.factset.sdk.DocumentsDistributorCallStreetEvents.JSON;


/**
 * NRTSpeakeridsData
 */
@JsonPropertyOrder({
  NRTSpeakeridsData.JSON_PROPERTY_AUDIO_SOURCE_ID,
  NRTSpeakeridsData.JSON_PROPERTY_SPEAKER_START_OFFSET,
  NRTSpeakeridsData.JSON_PROPERTY_SPEAKER_ID,
  NRTSpeakeridsData.JSON_PROPERTY_COSINE_SCORE,
  NRTSpeakeridsData.JSON_PROPERTY_AFFILIATION_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NRTSpeakeridsData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AUDIO_SOURCE_ID = "audioSourceId";
  private JsonNullable<Integer> audioSourceId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SPEAKER_START_OFFSET = "speakerStartOffset";
  private JsonNullable<BigDecimal> speakerStartOffset = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_SPEAKER_ID = "speakerId";
  private JsonNullable<String> speakerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COSINE_SCORE = "cosineScore";
  private JsonNullable<BigDecimal> cosineScore = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_AFFILIATION_ID = "affiliationId";
  private JsonNullable<String> affiliationId = JsonNullable.<String>undefined();

  public NRTSpeakeridsData() { 
  }

  public NRTSpeakeridsData audioSourceId(Integer audioSourceId) {
    this.audioSourceId = JsonNullable.<Integer>of(audioSourceId);
    return this;
  }

   /**
   * The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs.
   * @return audioSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs.")
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


  public NRTSpeakeridsData speakerStartOffset(BigDecimal speakerStartOffset) {
    this.speakerStartOffset = JsonNullable.<BigDecimal>of(speakerStartOffset);
    return this;
  }

   /**
   * The number of seconds into the call when a speaker starts / is speaking.
   * @return speakerStartOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of seconds into the call when a speaker starts / is speaking.")
  @JsonIgnore

  public BigDecimal getSpeakerStartOffset() {
        return speakerStartOffset.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SPEAKER_START_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getSpeakerStartOffset_JsonNullable() {
    return speakerStartOffset;
  }
  
  @JsonProperty(JSON_PROPERTY_SPEAKER_START_OFFSET)
  public void setSpeakerStartOffset_JsonNullable(JsonNullable<BigDecimal> speakerStartOffset) {
    this.speakerStartOffset = speakerStartOffset;
  }

  public void setSpeakerStartOffset(BigDecimal speakerStartOffset) {
    this.speakerStartOffset = JsonNullable.<BigDecimal>of(speakerStartOffset);
  }


  public NRTSpeakeridsData speakerId(String speakerId) {
    this.speakerId = JsonNullable.<String>of(speakerId);
    return this;
  }

   /**
   * A unique identifier for a speaker.
   * @return speakerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for a speaker.")
  @JsonIgnore

  public String getSpeakerId() {
        return speakerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SPEAKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSpeakerId_JsonNullable() {
    return speakerId;
  }
  
  @JsonProperty(JSON_PROPERTY_SPEAKER_ID)
  public void setSpeakerId_JsonNullable(JsonNullable<String> speakerId) {
    this.speakerId = speakerId;
  }

  public void setSpeakerId(String speakerId) {
    this.speakerId = JsonNullable.<String>of(speakerId);
  }


  public NRTSpeakeridsData cosineScore(BigDecimal cosineScore) {
    this.cosineScore = JsonNullable.<BigDecimal>of(cosineScore);
    return this;
  }

   /**
   * The cosine similarity score (Confidence score)  for a particular speaker.  A score &gt;&#x3D; 0.49 while a speaker is speaking can be considered as a high confidence in the predicted speaker.  Only the SpeakerIDs with the highest cosineScore are rendered in the result set.
   * @return cosineScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cosine similarity score (Confidence score)  for a particular speaker.  A score >= 0.49 while a speaker is speaking can be considered as a high confidence in the predicted speaker.  Only the SpeakerIDs with the highest cosineScore are rendered in the result set.")
  @JsonIgnore

  public BigDecimal getCosineScore() {
        return cosineScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COSINE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getCosineScore_JsonNullable() {
    return cosineScore;
  }
  
  @JsonProperty(JSON_PROPERTY_COSINE_SCORE)
  public void setCosineScore_JsonNullable(JsonNullable<BigDecimal> cosineScore) {
    this.cosineScore = cosineScore;
  }

  public void setCosineScore(BigDecimal cosineScore) {
    this.cosineScore = JsonNullable.<BigDecimal>of(cosineScore);
  }


  public NRTSpeakeridsData affiliationId(String affiliationId) {
    this.affiliationId = JsonNullable.<String>of(affiliationId);
    return this;
  }

   /**
   * Affiliation ID denotes the company a speaker is associated with.
   * @return affiliationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Affiliation ID denotes the company a speaker is associated with.")
  @JsonIgnore

  public String getAffiliationId() {
        return affiliationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AFFILIATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAffiliationId_JsonNullable() {
    return affiliationId;
  }
  
  @JsonProperty(JSON_PROPERTY_AFFILIATION_ID)
  public void setAffiliationId_JsonNullable(JsonNullable<String> affiliationId) {
    this.affiliationId = affiliationId;
  }

  public void setAffiliationId(String affiliationId) {
    this.affiliationId = JsonNullable.<String>of(affiliationId);
  }


  /**
   * Return true if this NRT_Speakerids_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRTSpeakeridsData nrTSpeakeridsData = (NRTSpeakeridsData) o;
    return equalsNullable(this.audioSourceId, nrTSpeakeridsData.audioSourceId) &&
        equalsNullable(this.speakerStartOffset, nrTSpeakeridsData.speakerStartOffset) &&
        equalsNullable(this.speakerId, nrTSpeakeridsData.speakerId) &&
        equalsNullable(this.cosineScore, nrTSpeakeridsData.cosineScore) &&
        equalsNullable(this.affiliationId, nrTSpeakeridsData.affiliationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(audioSourceId), hashCodeNullable(speakerStartOffset), hashCodeNullable(speakerId), hashCodeNullable(cosineScore), hashCodeNullable(affiliationId));
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
    sb.append("class NRTSpeakeridsData {\n");
    sb.append("    audioSourceId: ").append(toIndentedString(audioSourceId)).append("\n");
    sb.append("    speakerStartOffset: ").append(toIndentedString(speakerStartOffset)).append("\n");
    sb.append("    speakerId: ").append(toIndentedString(speakerId)).append("\n");
    sb.append("    cosineScore: ").append(toIndentedString(cosineScore)).append("\n");
    sb.append("    affiliationId: ").append(toIndentedString(affiliationId)).append("\n");
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

