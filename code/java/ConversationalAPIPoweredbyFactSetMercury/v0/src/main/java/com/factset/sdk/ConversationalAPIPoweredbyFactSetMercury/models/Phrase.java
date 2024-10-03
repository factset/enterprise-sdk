/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client’s chatbot experience.  Request data from FactSet using natural language queries. Start the response generation using the `/query` endpoint, poll the status using `/status`. Once the result is ready, retrieve it using `/result`.  If your response contains a file ID, such as for an Excel chart or a FactSet ActiveGraph, retrieve it using the file ID at the `/download/file` endpoint.  We also encourage you to provide feedback on your responses using the `/feedback` endpoint!  **Please note:** \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable.  **Try the Conversational API and view Available Content**  In the [Using the Conversational API Online Assistant](https://my.apps.factset.com/oa/pages/23209) you can find instructions on how to start using the Conversational API, and the full list of content available.  Some of the prompts supported are:  - What is Tesla's enterprise value? - Create a chart showing CME price relative to the S&P 500 - What were the highlights from Palantir's recent earnings call?  **Adaptive Card Format**  The Conversational API uses the Microsoft Adaptive Card format for response data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON serialized presentation of a Microsoft Adaptive Card. See [Microsoft docs](https://learn.microsoft.com/en-us/adaptive-cards/) for Adaptive Card documentation, and the [Adaptive Card schema explorer](https://adaptivecards.io/explorer/) for schema details. **Please note**: \"The adaptive card may contain actions, which represent functionality within the card itself. In order to execute these actions, a handler must be implemented in your Adaptive Card rendering process. See [handling actions](https://learn.microsoft.com/en-us/adaptive-cards/sdk/rendering-cards/javascript/actions) for an example implementation.  **STACH Format**  The Conversational API may use Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data. <details>   <summary><u>**STACH Example**</u></summary>   ```json   {     \"version\": \"3.1\",     \"table\": {       \"primaryKeys\": [         \"Insider Holders\",         \"MV (M,$)\",         \"% O/S\"       ],       \"totalNumRows\": 5     },     \"views\": [       {         \"name\": \"view\",         \"displayName\": \"who are the suppliers of nike\",         \"table\": {           \"columns\": [             \"Insider Holders\",             \"MV (M,$)\",             \"% O/S\"           ],           \"headers\": {             \"Insider Holders\": \"Insider Holders\",             \"MV (M,$)\": \"MV (M,$)\",             \"% O/S\": \"% O/S\"           }         }       }     ],     \"columns\": [       {         \"name\": \"Insider Holders\",         \"contextualType\": \"string\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 100           }         }       },       {         \"name\": \"MV (M,$)\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 67           }         }       },       {         \"name\": \"% O/S\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 34           }         }       }     ],     \"rows\": [       {         \"Insider Holders\": \"Knight Philip Hampson\",         \"MV (M,$)\": 3156.8,         \"% O/S\": 1.531       },       {         \"Insider Holders\": \"Knight Travis A\",         \"MV (M,$)\": 601.6,         \"% O/S\": 0.496       },       {         \"Insider Holders\": \"Wellcome Trust Ltd. (Direct Investments)\",         \"MV (M,$)\": 225.5,         \"% O/S\": 0.105       },       {         \"Insider Holders\": \"Parker Mark G\",         \"MV (M,$)\": 100.1,         \"% O/S\": 0.056       },       {         \"Insider Holders\": \"Donahoe John J Ii\",         \"MV (M,$)\": 19.8,         \"% O/S\": 0.018       }     ]   }   ``` </details>  **Citations**  Responses from the Conversational API may contain `citations` which provide references to the source of the data directly within the textual response. Phrases within the response text are mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources. **Please note**: Links to the source data are provided as links to FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). The link will direct you to the entire document; you may need to search for the specific phrase within the document. We are currently working on providing direct links to the specific section or excerpt of the document. <details>   <summary><u>**Citation Example**</u></summary>   ```json   {     \"type\": \"string\",     \"value\": \"FactSet has expressed optimism about the potential of generative AI (GenAI) to enhance their product offerings and drive efficiency[1].\"     \"citations\": {       \"[1]\": [         \"phraseId\": \"aba1d533-08b3-4d3e-8961-5d37bb2caff6\",         \"content\": \"At the same time, expectations are high around the effect generative AI will have on our industry.\",         \"speakerInfo\": {           \"companyId\": \"0016YD-E\",           \"companyName\": \"FactSet Research Systems, Inc.\",           \"speakerId\": \"0DPHLH-E\",           \"speakerName\": \"Philip Snow\",           \"speakerTitle\": \"Chief Executive Officer & Director\"         },         \"sourceURL\": \"https://my.apps.factset.com/viewer-fusion/?_doc_id=2948302-t&_doc_date=20231219&_doc_product=FCST&_doc_docfn=/home/docs/fcst/8/302/2948302-t.pdf&e=false\"       ]     }   }   ``` </details> 
 *
 * The version of the OpenAPI document: 0.6.0
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.JSON;


/**
 * A single source for the current data item. Contains data excerpt and Document Viewer URL.
 */
@ApiModel(description = "A single source for the current data item. Contains data excerpt and Document Viewer URL.")
@JsonPropertyOrder({
  Phrase.JSON_PROPERTY_PHRASE_ID,
  Phrase.JSON_PROPERTY_CONTENT,
  Phrase.JSON_PROPERTY_SOURCE_U_R_L,
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

  public static final String JSON_PROPERTY_SPEAKER_INFO = "speakerInfo";
  private JsonNullable<SpeakerInfo> speakerInfo = JsonNullable.<SpeakerInfo>undefined();

  public Phrase() { 
  }

  @JsonCreator
  public Phrase(
    @JsonProperty(value=JSON_PROPERTY_PHRASE_ID, required=true) java.util.UUID phraseId, 
    @JsonProperty(value=JSON_PROPERTY_CONTENT, required=true) String content, 
    @JsonProperty(value=JSON_PROPERTY_SOURCE_U_R_L, required=true) String sourceURL
  ) {
    this();
    this.phraseId = phraseId;
    this.content = content;
    this.sourceURL = sourceURL;
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
   * The URL of the source document in FactSet&#39;s Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). Please note that this URL is for the entire document; you will need to search for the specific phrase within the document. Future release plans include linking directly to the highlighted excerpt within the document.
   * @return sourceURL
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URL of the source document in FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). Please note that this URL is for the entire document; you will need to search for the specific phrase within the document. Future release plans include linking directly to the highlighted excerpt within the document.")
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
        equalsNullable(this.speakerInfo, phrase.speakerInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(phraseId, content, sourceURL, hashCodeNullable(speakerInfo));
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

