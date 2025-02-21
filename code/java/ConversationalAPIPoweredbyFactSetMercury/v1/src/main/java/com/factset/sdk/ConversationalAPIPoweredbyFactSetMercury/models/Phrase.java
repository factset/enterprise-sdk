/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.SpeakerInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.JSON;


/**
 * A single source for the current data item. Contains data excerpt, various citation information, and Document Viewer URL. If the citation is from a transcript, the information of the person who spoke the phrase is included as &#x60;speakerInfo&#x60;.
 */
@ApiModel(description = "A single source for the current data item. Contains data excerpt, various citation information, and Document Viewer URL. If the citation is from a transcript, the information of the person who spoke the phrase is included as `speakerInfo`.")
@JsonPropertyOrder({
  Phrase.JSON_PROPERTY_PHRASE_ID,
  Phrase.JSON_PROPERTY_CONTENT,
  Phrase.JSON_PROPERTY_SOURCE_U_R_L,
  Phrase.JSON_PROPERTY_SOURCE_TITLE,
  Phrase.JSON_PROPERTY_SOURCE_DATE,
  Phrase.JSON_PROPERTY_SPEAKER_INFO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Phrase implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PHRASE_ID = "phraseId";
  private java.util.UUID phraseId;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_SOURCE_U_R_L = "sourceURL";
  private String sourceURL;

  public static final String JSON_PROPERTY_SOURCE_TITLE = "sourceTitle";
  private String sourceTitle;

  public static final String JSON_PROPERTY_SOURCE_DATE = "sourceDate";
  private LocalDate sourceDate;

  public static final String JSON_PROPERTY_SPEAKER_INFO = "speakerInfo";
  private JsonNullable<SpeakerInfo> speakerInfo = JsonNullable.<SpeakerInfo>undefined();

  public Phrase() { 
  }

  @JsonCreator
  public Phrase(
    @JsonProperty(value=JSON_PROPERTY_PHRASE_ID, required=true) java.util.UUID phraseId, 
    @JsonProperty(value=JSON_PROPERTY_CONTENT, required=true) String content, 
    @JsonProperty(value=JSON_PROPERTY_SOURCE_U_R_L, required=true) String sourceURL, 
    @JsonProperty(value=JSON_PROPERTY_SOURCE_TITLE, required=true) String sourceTitle, 
    @JsonProperty(value=JSON_PROPERTY_SOURCE_DATE, required=true) LocalDate sourceDate
  ) {
    this();
    this.phraseId = phraseId;
    this.content = content;
    this.sourceURL = sourceURL;
    this.sourceTitle = sourceTitle;
    this.sourceDate = sourceDate;
  }

  public Phrase phraseId(java.util.UUID phraseId) {
    this.phraseId = phraseId;
    return this;
  }

   /**
   * The unique identifier for the citation phrase in the source document.
   * @return phraseId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier for the citation phrase in the source document.")
  @JsonProperty(JSON_PROPERTY_PHRASE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.UUID getPhraseId() {
    return phraseId;
  }


  @JsonProperty(JSON_PROPERTY_PHRASE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhraseId(java.util.UUID phraseId) {
    this.phraseId = phraseId;
  }


  public Phrase content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Highlighted content of the citation source from which the response was generated. Commonly a document excerpt identified as the source of the data
   * @return content
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Highlighted content of the citation source from which the response was generated. Commonly a document excerpt identified as the source of the data")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(String content) {
    this.content = content;
  }


  public Phrase sourceURL(String sourceURL) {
    this.sourceURL = sourceURL;
    return this;
  }

   /**
   * The URL of the source document in FactSet&#39;s Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). If available, the URL will directly link to the excerpted content highlighted within the document.
   * @return sourceURL
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URL of the source document in FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). If available, the URL will directly link to the excerpted content highlighted within the document.")
  @JsonProperty(JSON_PROPERTY_SOURCE_U_R_L)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceURL() {
    return sourceURL;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_U_R_L)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceURL(String sourceURL) {
    this.sourceURL = sourceURL;
  }


  public Phrase sourceTitle(String sourceTitle) {
    this.sourceTitle = sourceTitle;
    return this;
  }

   /**
   * The title of the citation&#39;s source document.
   * @return sourceTitle
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The title of the citation's source document.")
  @JsonProperty(JSON_PROPERTY_SOURCE_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceTitle() {
    return sourceTitle;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceTitle(String sourceTitle) {
    this.sourceTitle = sourceTitle;
  }


  public Phrase sourceDate(LocalDate sourceDate) {
    this.sourceDate = sourceDate;
    return this;
  }

   /**
   * The date the citation&#39;s source document was published, represented per ISO 8601 guideline (YYYY-MM-DD).
   * @return sourceDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date the citation's source document was published, represented per ISO 8601 guideline (YYYY-MM-DD).")
  @JsonProperty(JSON_PROPERTY_SOURCE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getSourceDate() {
    return sourceDate;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceDate(LocalDate sourceDate) {
    this.sourceDate = sourceDate;
  }


  public Phrase speakerInfo(SpeakerInfo speakerInfo) {
    this.speakerInfo = JsonNullable.<SpeakerInfo>of(speakerInfo);
    return this;
  }

   /**
   * Get speakerInfo
   * @return speakerInfo
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SpeakerInfo getSpeakerInfo() {
        return speakerInfo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SPEAKER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SpeakerInfo> getSpeakerInfo_JsonNullable() {
    return speakerInfo;
  }
  
  @JsonProperty(JSON_PROPERTY_SPEAKER_INFO)
  public void setSpeakerInfo_JsonNullable(JsonNullable<SpeakerInfo> speakerInfo) {
    this.speakerInfo = speakerInfo;
  }

  public void setSpeakerInfo(SpeakerInfo speakerInfo) {
    this.speakerInfo = JsonNullable.<SpeakerInfo>of(speakerInfo);
  }


  /**
   * Return true if this Phrase object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phrase phrase = (Phrase) o;
    return Objects.equals(this.phraseId, phrase.phraseId) &&
        Objects.equals(this.content, phrase.content) &&
        Objects.equals(this.sourceURL, phrase.sourceURL) &&
        Objects.equals(this.sourceTitle, phrase.sourceTitle) &&
        Objects.equals(this.sourceDate, phrase.sourceDate) &&
        equalsNullable(this.speakerInfo, phrase.speakerInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(phraseId, content, sourceURL, sourceTitle, sourceDate, hashCodeNullable(speakerInfo));
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
    sb.append("class Phrase {\n");
    sb.append("    phraseId: ").append(toIndentedString(phraseId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    sourceURL: ").append(toIndentedString(sourceURL)).append("\n");
    sb.append("    sourceTitle: ").append(toIndentedString(sourceTitle)).append("\n");
    sb.append("    sourceDate: ").append(toIndentedString(sourceDate)).append("\n");
    sb.append("    speakerInfo: ").append(toIndentedString(speakerInfo)).append("\n");
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

