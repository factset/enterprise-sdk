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
 * Directive to download a file. The &#x60;error&#x60; field specifies if there was an error generating the specific downloadable file; if an error occurred, the &#x60;errorMessage&#x60; field will detail the error. 
 */
@ApiModel(description = "Directive to download a file. The `error` field specifies if there was an error generating the specific downloadable file; if an error occurred, the `errorMessage` field will detail the error. ")
@JsonPropertyOrder({
  Download.JSON_PROPERTY_ACTION,
  Download.JSON_PROPERTY_NAME,
  Download.JSON_PROPERTY_LABEL,
  Download.JSON_PROPERTY_CATEGORY,
  Download.JSON_PROPERTY_LOCATION,
  Download.JSON_PROPERTY_FILE_ID,
  Download.JSON_PROPERTY_CONTENT_TYPE,
  Download.JSON_PROPERTY_FILE_NAME,
  Download.JSON_PROPERTY_ERROR,
  Download.JSON_PROPERTY_ERROR_MESSAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Download implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Type of action
   */
  public enum ActionEnum {
    DOWNLOAD("Download");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionEnum action;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  /**
   * Endpoint where file can be found
   */
  public enum LocationEnum {
    _DOWNLOAD_FILE("/download/file");

    private String value;

    LocationEnum(String value) {
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
    public static LocationEnum fromValue(String value) {
      for (LocationEnum b : LocationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LOCATION = "location";
  private LocationEnum location;

  public static final String JSON_PROPERTY_FILE_ID = "fileId";
  private java.util.UUID fileId;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  private String contentType;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_ERROR = "error";
  private Boolean error;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private String errorMessage;

  public Download() { 
  }

  @JsonCreator
  public Download(
    @JsonProperty(value=JSON_PROPERTY_ERROR, required=true) Boolean error
  ) {
    this();
    this.error = error;
  }

  public Download action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Type of action
   * @return action
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Type of action")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionEnum getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public Download name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the download type
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the download type")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public Download label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label associated with the download
   * @return label
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Label associated with the download")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public Download category(String category) {
    this.category = JsonNullable.<String>of(category);
    return this;
  }

   /**
   * Category of associated file
   * @return category
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Category of associated file")
  @JsonIgnore

  public String getCategory() {
        return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCategory_JsonNullable() {
    return category;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<String> category) {
    this.category = category;
  }

  public void setCategory(String category) {
    this.category = JsonNullable.<String>of(category);
  }


  public Download location(LocationEnum location) {
    this.location = location;
    return this;
  }

   /**
   * Endpoint where file can be found
   * @return location
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Endpoint where file can be found")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocationEnum getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(LocationEnum location) {
    this.location = location;
  }


  public Download fileId(java.util.UUID fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * Id of associated file
   * @return fileId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Id of associated file")
  @JsonProperty(JSON_PROPERTY_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getFileId() {
    return fileId;
  }


  @JsonProperty(JSON_PROPERTY_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileId(java.util.UUID fileId) {
    this.fileId = fileId;
  }


  public Download contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * ContentType of associated file
   * @return contentType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ContentType of associated file")
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public Download fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of associated file
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of associated file")
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


  public Download error(Boolean error) {
    this.error = error;
    return this;
  }

   /**
   * Boolean representing if there was an error generating the downloadable file
   * @return error
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Boolean representing if there was an error generating the downloadable file")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(Boolean error) {
    this.error = error;
  }


  public Download errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message detailing the error in generating the downloadable file
   * @return errorMessage
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Error message detailing the error in generating the downloadable file")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * Return true if this Download object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Download download = (Download) o;
    return Objects.equals(this.action, download.action) &&
        equalsNullable(this.name, download.name) &&
        Objects.equals(this.label, download.label) &&
        equalsNullable(this.category, download.category) &&
        Objects.equals(this.location, download.location) &&
        Objects.equals(this.fileId, download.fileId) &&
        Objects.equals(this.contentType, download.contentType) &&
        Objects.equals(this.fileName, download.fileName) &&
        Objects.equals(this.error, download.error) &&
        Objects.equals(this.errorMessage, download.errorMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, hashCodeNullable(name), label, hashCodeNullable(category), location, fileId, contentType, fileName, error, errorMessage);
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
    sb.append("class Download {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

