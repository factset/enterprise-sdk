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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * ListFileObject
 */
@JsonPropertyOrder({
  ListFileObject.JSON_PROPERTY_YEAR,
  ListFileObject.JSON_PROPERTY_TRIMMED,
  ListFileObject.JSON_PROPERTY_FILE_NAME,
  ListFileObject.JSON_PROPERTY_FILE_SIZE,
  ListFileObject.JSON_PROPERTY_FILE_COUNT,
  ListFileObject.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ListFileObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_YEAR = "year";
  private Integer year;

  public static final String JSON_PROPERTY_TRIMMED = "trimmed";
  private Boolean trimmed;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private Long fileSize;

  public static final String JSON_PROPERTY_FILE_COUNT = "fileCount";
  private Integer fileCount;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ListFileObject() { 
  }

  public ListFileObject year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * The year corresponding to the file containing historical audio recordings that can be downloaded via presigned URL.
   * @return year
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The year corresponding to the file containing historical audio recordings that can be downloaded via presigned URL.")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(Integer year) {
    this.year = year;
  }


  public ListFileObject trimmed(Boolean trimmed) {
    this.trimmed = trimmed;
    return this;
  }

   /**
   * True  it signifies that the pre-signed URL for downloading includes trimmed historical audio recordings along with their metadata for a specific year.  False  it signifies that the pre-signed URL for downloading contains the untrimmed historical audio recordings along with their relevant metadata for a specific year.
   * @return trimmed
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "True  it signifies that the pre-signed URL for downloading includes trimmed historical audio recordings along with their metadata for a specific year.  False  it signifies that the pre-signed URL for downloading contains the untrimmed historical audio recordings along with their relevant metadata for a specific year.")
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


  public ListFileObject fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the file.
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The name of the file.")
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


  public ListFileObject fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The size of the file, in bytes.
   * @return fileSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The size of the file, in bytes.")
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  public ListFileObject fileCount(Integer fileCount) {
    this.fileCount = fileCount;
    return this;
  }

   /**
   * The count of the files.
   * @return fileCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The count of the files.")
  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileCount() {
    return fileCount;
  }


  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileCount(Integer fileCount) {
    this.fileCount = fileCount;
  }


  public ListFileObject url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A pre-signed URL for downloading historical audio recordings and related metadata of a specific year. The URL provided in the response will expire after 3 hours.
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A pre-signed URL for downloading historical audio recordings and related metadata of a specific year. The URL provided in the response will expire after 3 hours.")
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


  /**
   * Return true if this ListFileObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFileObject listFileObject = (ListFileObject) o;
    return Objects.equals(this.year, listFileObject.year) &&
        Objects.equals(this.trimmed, listFileObject.trimmed) &&
        Objects.equals(this.fileName, listFileObject.fileName) &&
        Objects.equals(this.fileSize, listFileObject.fileSize) &&
        Objects.equals(this.fileCount, listFileObject.fileCount) &&
        Objects.equals(this.url, listFileObject.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, trimmed, fileName, fileSize, fileCount, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFileObject {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    trimmed: ").append(toIndentedString(trimmed)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

