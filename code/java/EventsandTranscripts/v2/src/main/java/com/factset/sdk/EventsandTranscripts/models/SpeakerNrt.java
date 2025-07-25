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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * SpeakerNrt
 */
@JsonPropertyOrder({
  SpeakerNrt.JSON_PROPERTY_ID,
  SpeakerNrt.JSON_PROPERTY_P
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SpeakerNrt implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_P = "p";
  private java.util.List<String> p = null;

  public SpeakerNrt() { 
  }

  public SpeakerNrt id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public SpeakerNrt p(java.util.List<String> p) {
    this.p = p;
    return this;
  }

  public SpeakerNrt addPItem(String pItem) {
    if (this.p == null) {
      this.p = new java.util.ArrayList<>();
    }
    this.p.add(pItem);
    return this;
  }

   /**
   * Used to define individual paragraphs within the document. Each &lt;p&gt; tag contains a coherent segment of text, which represents spoken dialogue or narrative in the transcript. This tag ensures the structured presentation of text, maintaining readability and separation of ideas or questions/answers in the context of a conference call or presentation.
   * @return p
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Used to define individual paragraphs within the document. Each <p> tag contains a coherent segment of text, which represents spoken dialogue or narrative in the transcript. This tag ensures the structured presentation of text, maintaining readability and separation of ideas or questions/answers in the context of a conference call or presentation.")
  @JsonProperty(JSON_PROPERTY_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getP() {
    return p;
  }


  @JsonProperty(JSON_PROPERTY_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setP(java.util.List<String> p) {
    this.p = p;
  }


  /**
   * Return true if this SpeakerNrt object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeakerNrt speakerNrt = (SpeakerNrt) o;
    return Objects.equals(this.id, speakerNrt.id) &&
        Objects.equals(this.p, speakerNrt.p);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, p);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeakerNrt {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
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

