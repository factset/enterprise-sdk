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
import com.factset.sdk.EventsandTranscripts.models.NRT;
import com.factset.sdk.EventsandTranscripts.models.RawOrCorrected;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * TranscriptsCollection
 */
@JsonPropertyOrder({
  TranscriptsCollection.JSON_PROPERTY_TRANSCRIPT,
  TranscriptsCollection.JSON_PROPERTY_NRT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TranscriptsCollection implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TRANSCRIPT = "transcript";
  private java.util.List<RawOrCorrected> transcript = null;

  public static final String JSON_PROPERTY_NRT = "nrt";
  private java.util.List<NRT> nrt = null;

  public TranscriptsCollection() { 
  }

  public TranscriptsCollection transcript(java.util.List<RawOrCorrected> transcript) {
    this.transcript = transcript;
    return this;
  }

  public TranscriptsCollection addTranscriptItem(RawOrCorrected transcriptItem) {
    if (this.transcript == null) {
      this.transcript = new java.util.ArrayList<>();
    }
    this.transcript.add(transcriptItem);
    return this;
  }

   /**
   * Get transcript
   * @return transcript
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<RawOrCorrected> getTranscript() {
    return transcript;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscript(java.util.List<RawOrCorrected> transcript) {
    this.transcript = transcript;
  }


  public TranscriptsCollection nrt(java.util.List<NRT> nrt) {
    this.nrt = nrt;
    return this;
  }

  public TranscriptsCollection addNrtItem(NRT nrtItem) {
    if (this.nrt == null) {
      this.nrt = new java.util.ArrayList<>();
    }
    this.nrt.add(nrtItem);
    return this;
  }

   /**
   * Get nrt
   * @return nrt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NRT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<NRT> getNrt() {
    return nrt;
  }


  @JsonProperty(JSON_PROPERTY_NRT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNrt(java.util.List<NRT> nrt) {
    this.nrt = nrt;
  }


  /**
   * Return true if this TranscriptsCollection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptsCollection transcriptsCollection = (TranscriptsCollection) o;
    return Objects.equals(this.transcript, transcriptsCollection.transcript) &&
        Objects.equals(this.nrt, transcriptsCollection.nrt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcript, nrt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptsCollection {\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    nrt: ").append(toIndentedString(nrt)).append("\n");
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

