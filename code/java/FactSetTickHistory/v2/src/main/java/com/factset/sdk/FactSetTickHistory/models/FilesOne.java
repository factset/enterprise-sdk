/*
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTickHistory.models;

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
import com.factset.sdk.FactSetTickHistory.JSON;


/**
 * Array of data objects
 */
@ApiModel(description = "Array of data objects")
@JsonPropertyOrder({
  FilesOne.JSON_PROPERTY_FILE_NAME,
  FilesOne.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FilesOne implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public FilesOne() { 
  }

  public FilesOne fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the file(s) generated for the query requested
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the file(s) generated for the query requested")
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


  public FilesOne url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Download link for the TickHistory minute bars file with requested parameters.    &lt;p&gt;The downloaded file contains isoCode, ticker, date, time, tradeOpen, tradeHigh, tradeLow, tradeClose, tradeVolume, tradeNumber, and tradeVWAP&lt;/P&gt;    &lt;p&gt;This download link will expire after 12 hours.&lt;/p&gt; 
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Download link for the TickHistory minute bars file with requested parameters.    <p>The downloaded file contains isoCode, ticker, date, time, tradeOpen, tradeHigh, tradeLow, tradeClose, tradeVolume, tradeNumber, and tradeVWAP</P>    <p>This download link will expire after 12 hours.</p> ")
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
   * Return true if this filesOne object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesOne filesOne = (FilesOne) o;
    return Objects.equals(this.fileName, filesOne.fileName) &&
        Objects.equals(this.url, filesOne.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesOne {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

