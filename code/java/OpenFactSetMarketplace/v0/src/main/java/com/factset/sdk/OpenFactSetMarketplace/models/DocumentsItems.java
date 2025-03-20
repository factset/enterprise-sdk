/*
 * Open:FactSet Marketplace API
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenFactSetMarketplace.models;

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
import com.factset.sdk.OpenFactSetMarketplace.JSON;


/**
 * Product documentation object
 */
@ApiModel(description = "Product documentation object")
@JsonPropertyOrder({
  DocumentsItems.JSON_PROPERTY_NAME,
  DocumentsItems.JSON_PROPERTY_SECTION,
  DocumentsItems.JSON_PROPERTY_IS_PUBLIC,
  DocumentsItems.JSON_PROPERTY_IS_FILE,
  DocumentsItems.JSON_PROPERTY_URL,
  DocumentsItems.JSON_PROPERTY_FILE_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DocumentsItems implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SECTION = "section";
  private String section;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  private Boolean isPublic;

  public static final String JSON_PROPERTY_IS_FILE = "isFile";
  private Boolean isFile;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public DocumentsItems() { 
  }

  public DocumentsItems name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Document name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FactSet Product Documentation", value = "Document name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public DocumentsItems section(String section) {
    this.section = section;
    return this;
  }

   /**
   * String detailing which section of the product page this document should be displayed in, i.e. &#39;Documentation&#39; or &#39;Sample Data&#39;.
   * @return section
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Documentation", value = "String detailing which section of the product page this document should be displayed in, i.e. 'Documentation' or 'Sample Data'.")
  @JsonProperty(JSON_PROPERTY_SECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSection() {
    return section;
  }


  @JsonProperty(JSON_PROPERTY_SECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSection(String section) {
    this.section = section;
  }


  public DocumentsItems isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Boolean flag indicating whether the document is publicly accessible without authentication.
   * @return isPublic
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Boolean flag indicating whether the document is publicly accessible without authentication.")
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public DocumentsItems isFile(Boolean isFile) {
    this.isFile = isFile;
    return this;
  }

   /**
   * Boolean flag indicating whether the document is a file for download or a URL.
   * @return isFile
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Boolean flag indicating whether the document is a file for download or a URL.")
  @JsonProperty(JSON_PROPERTY_IS_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFile() {
    return isFile;
  }


  @JsonProperty(JSON_PROPERTY_IS_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFile(Boolean isFile) {
    this.isFile = isFile;
  }


  public DocumentsItems url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Document URL
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.com/factset-product-documentation.pdf", value = "Document URL")
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


  public DocumentsItems fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Document file name, for file downloads.
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "factset-product-documentation.pdf", value = "Document file name, for file downloads.")
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


  /**
   * Return true if this DocumentsItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentsItems documentsItems = (DocumentsItems) o;
    return Objects.equals(this.name, documentsItems.name) &&
        Objects.equals(this.section, documentsItems.section) &&
        Objects.equals(this.isPublic, documentsItems.isPublic) &&
        Objects.equals(this.isFile, documentsItems.isFile) &&
        Objects.equals(this.url, documentsItems.url) &&
        Objects.equals(this.fileName, documentsItems.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, section, isPublic, isFile, url, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsItems {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isFile: ").append(toIndentedString(isFile)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

