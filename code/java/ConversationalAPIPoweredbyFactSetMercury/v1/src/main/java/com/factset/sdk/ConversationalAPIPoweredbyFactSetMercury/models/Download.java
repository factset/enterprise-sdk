/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client's chatbot experience.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  **Conversational API Consumer Workflow**  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   **FAQ and Limitations**  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FatSet Support. 
 *
 * The version of the OpenAPI document: 1.0.2
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
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.FileGenerationErrorObject;
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
 * Action containing a file ID to download a file associated with the response. Files will be available for download from the &#x60;/download/file&#x60; endpoint for 24 hours after generation.  If there was an error while generating the downloadable file, it will be detailed in the &#x60;error&#x60; field for the specific download action. Please reach out to your FactSet Support Team representative if you are seeing this error persistently.  
 */
@ApiModel(description = "Action containing a file ID to download a file associated with the response. Files will be available for download from the `/download/file` endpoint for 24 hours after generation.  If there was an error while generating the downloadable file, it will be detailed in the `error` field for the specific download action. Please reach out to your FactSet Support Team representative if you are seeing this error persistently.  ")
@JsonPropertyOrder({
  Download.JSON_PROPERTY_ACTION,
  Download.JSON_PROPERTY_NAME,
  Download.JSON_PROPERTY_LABEL,
  Download.JSON_PROPERTY_CATEGORY,
  Download.JSON_PROPERTY_LOCATION,
  Download.JSON_PROPERTY_FILE_ID,
  Download.JSON_PROPERTY_CONTENT_TYPE,
  Download.JSON_PROPERTY_FILE_NAME,
  Download.JSON_PROPERTY_ERROR
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
  private String name;

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

  /**
   * ContentType of associated file
   */
  public enum ContentTypeEnum {
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    private String value;

    ContentTypeEnum(String value) {
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
    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  private ContentTypeEnum contentType;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_ERROR = "error";
  private FileGenerationErrorObject error;

  public Download() { 
  }

  @JsonCreator
  public Download(
    @JsonProperty(value=JSON_PROPERTY_ACTION, required=true) ActionEnum action, 
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) String name, 
    @JsonProperty(value=JSON_PROPERTY_LABEL, required=true) String label, 
    @JsonProperty(value=JSON_PROPERTY_ERROR, required=true) FileGenerationErrorObject error
  ) {
    this();
    this.action = action;
    this.name = name;
    this.label = label;
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of action")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActionEnum getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public Download name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the download type
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(required = true, value = "Name of the download type")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public Download label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label associated with the download
   * @return label
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Label associated with the download")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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


  public Download contentType(ContentTypeEnum contentType) {
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

  public ContentTypeEnum getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(ContentTypeEnum contentType) {
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


  public Download error(FileGenerationErrorObject error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileGenerationErrorObject getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(FileGenerationErrorObject error) {
    this.error = error;
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
        Objects.equals(this.name, download.name) &&
        Objects.equals(this.label, download.label) &&
        equalsNullable(this.category, download.category) &&
        Objects.equals(this.location, download.location) &&
        Objects.equals(this.fileId, download.fileId) &&
        Objects.equals(this.contentType, download.contentType) &&
        Objects.equals(this.fileName, download.fileName) &&
        Objects.equals(this.error, download.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, name, label, hashCodeNullable(category), location, fileId, contentType, fileName, error);
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

