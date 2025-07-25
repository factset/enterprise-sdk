/*
 * Global Filings API
 *  The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  The meta endpoints, such as sources, formTypes, timeZones, and categories, provide comprehensive lists of available sources, form types, time zones, and categories, respectively.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.GlobalFilings.models;

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
import com.factset.sdk.GlobalFilings.JSON;


/**
 * Array of data objects
 */
@ApiModel(description = "Array of data objects")
@JsonPropertyOrder({
  Document.JSON_PROPERTY_HEADLINE,
  Document.JSON_PROPERTY_SOURCE,
  Document.JSON_PROPERTY_PRIMARY_IDS,
  Document.JSON_PROPERTY_ALL_IDS,
  Document.JSON_PROPERTY_FILINGS_DATE_TIME,
  Document.JSON_PROPERTY_CATEGORIES,
  Document.JSON_PROPERTY_FILINGS_LINK,
  Document.JSON_PROPERTY_DOCUMENT_ID,
  Document.JSON_PROPERTY_FILING_SIZE,
  Document.JSON_PROPERTY_FORM_TYPES,
  Document.JSON_PROPERTY_ACCESSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Document implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_PRIMARY_IDS = "primaryIds";
  private java.util.List<String> primaryIds = null;

  public static final String JSON_PROPERTY_ALL_IDS = "allIds";
  private java.util.List<String> allIds = null;

  public static final String JSON_PROPERTY_FILINGS_DATE_TIME = "filingsDateTime";
  private String filingsDateTime;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<String> categories = null;

  public static final String JSON_PROPERTY_FILINGS_LINK = "filingsLink";
  private String filingsLink;

  public static final String JSON_PROPERTY_DOCUMENT_ID = "documentId";
  private String documentId;

  public static final String JSON_PROPERTY_FILING_SIZE = "filingSize";
  private String filingSize;

  public static final String JSON_PROPERTY_FORM_TYPES = "formTypes";
  private java.util.List<String> formTypes = null;

  public static final String JSON_PROPERTY_ACCESSION = "accession";
  private String accession;

  public Document() { 
  }

  public Document headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Headline of the story, actual time and date of the event.
   * @return headline
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Headline of the story, actual time and date of the event.")
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public Document source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Provides the source of the document, and the source value is one among those provided by the &#x60;/meta/sources&#x60; endpoint.
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Provides the source of the document, and the source value is one among those provided by the `/meta/sources` endpoint.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }


  public Document primaryIds(java.util.List<String> primaryIds) {
    this.primaryIds = primaryIds;
    return this;
  }

  public Document addPrimaryIdsItem(String primaryIdsItem) {
    if (this.primaryIds == null) {
      this.primaryIds = new java.util.ArrayList<>();
    }
    this.primaryIds.add(primaryIdsItem);
    return this;
  }

   /**
   * Refers to the main company a particular document refers to.
   * @return primaryIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Refers to the main company a particular document refers to.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getPrimaryIds() {
    return primaryIds;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryIds(java.util.List<String> primaryIds) {
    this.primaryIds = primaryIds;
  }


  public Document allIds(java.util.List<String> allIds) {
    this.allIds = allIds;
    return this;
  }

  public Document addAllIdsItem(String allIdsItem) {
    if (this.allIds == null) {
      this.allIds = new java.util.ArrayList<>();
    }
    this.allIds.add(allIdsItem);
    return this;
  }

   /**
   * Refers to all companies mentioned in the document. This could also include the primary company id as well.   **Note:** For the \&quot;allIds\&quot; and \&quot;primaryIds\&quot; fields:   - These identifiers can be either SEDOLs or CUSIPs, depending on the search criteria and the type of identifiers specified in your request.   - The API will return the corresponding identifiers based on the search parameters provided.
   * @return allIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Refers to all companies mentioned in the document. This could also include the primary company id as well.   **Note:** For the \"allIds\" and \"primaryIds\" fields:   - These identifiers can be either SEDOLs or CUSIPs, depending on the search criteria and the type of identifiers specified in your request.   - The API will return the corresponding identifiers based on the search parameters provided.")
  @JsonProperty(JSON_PROPERTY_ALL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getAllIds() {
    return allIds;
  }


  @JsonProperty(JSON_PROPERTY_ALL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllIds(java.util.List<String> allIds) {
    this.allIds = allIds;
  }


  public Document filingsDateTime(String filingsDateTime) {
    this.filingsDateTime = filingsDateTime;
    return this;
  }

   /**
   * Publish date and time of the latest version (in ISO 8601 format, UTC).
   * @return filingsDateTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Publish date and time of the latest version (in ISO 8601 format, UTC).")
  @JsonProperty(JSON_PROPERTY_FILINGS_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilingsDateTime() {
    return filingsDateTime;
  }


  @JsonProperty(JSON_PROPERTY_FILINGS_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilingsDateTime(String filingsDateTime) {
    this.filingsDateTime = filingsDateTime;
  }


  public Document categories(java.util.List<String> categories) {
    this.categories = categories;
    return this;
  }

  public Document addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Categories are Country, Industry, and Subject codes. This is a comma-separated list retrieved from &#x60;/meta/categories&#x60;
   * @return categories
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Categories are Country, Industry, and Subject codes. This is a comma-separated list retrieved from `/meta/categories`")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<String> categories) {
    this.categories = categories;
  }


  public Document filingsLink(String filingsLink) {
    this.filingsLink = filingsLink;
    return this;
  }

   /**
   * A secure HTTPS link for downloading the associated document.
   * @return filingsLink
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A secure HTTPS link for downloading the associated document.")
  @JsonProperty(JSON_PROPERTY_FILINGS_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilingsLink() {
    return filingsLink;
  }


  @JsonProperty(JSON_PROPERTY_FILINGS_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilingsLink(String filingsLink) {
    this.filingsLink = filingsLink;
  }


  public Document documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Unique identifier for a document.
   * @return documentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for a document.")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentId() {
    return documentId;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public Document filingSize(String filingSize) {
    this.filingSize = filingSize;
    return this;
  }

   /**
   * Filings specific metadata providing info around the size of the document.
   * @return filingSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Filings specific metadata providing info around the size of the document.")
  @JsonProperty(JSON_PROPERTY_FILING_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilingSize() {
    return filingSize;
  }


  @JsonProperty(JSON_PROPERTY_FILING_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilingSize(String filingSize) {
    this.filingSize = filingSize;
  }


  public Document formTypes(java.util.List<String> formTypes) {
    this.formTypes = formTypes;
    return this;
  }

  public Document addFormTypesItem(String formTypesItem) {
    if (this.formTypes == null) {
      this.formTypes = new java.util.ArrayList<>();
    }
    this.formTypes.add(formTypesItem);
    return this;
  }

   /**
   * Filings specific metadata providing info around the form type (e.g. 8K, 10K, etc.)
   * @return formTypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Filings specific metadata providing info around the form type (e.g. 8K, 10K, etc.)")
  @JsonProperty(JSON_PROPERTY_FORM_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getFormTypes() {
    return formTypes;
  }


  @JsonProperty(JSON_PROPERTY_FORM_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormTypes(java.util.List<String> formTypes) {
    this.formTypes = formTypes;
  }


  public Document accession(String accession) {
    this.accession = accession;
    return this;
  }

   /**
   * A unique identifier given to each EDGAR filings document.
   * @return accession
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier given to each EDGAR filings document.")
  @JsonProperty(JSON_PROPERTY_ACCESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccession() {
    return accession;
  }


  @JsonProperty(JSON_PROPERTY_ACCESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccession(String accession) {
    this.accession = accession;
  }


  /**
   * Return true if this Document object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.headline, document.headline) &&
        Objects.equals(this.source, document.source) &&
        Objects.equals(this.primaryIds, document.primaryIds) &&
        Objects.equals(this.allIds, document.allIds) &&
        Objects.equals(this.filingsDateTime, document.filingsDateTime) &&
        Objects.equals(this.categories, document.categories) &&
        Objects.equals(this.filingsLink, document.filingsLink) &&
        Objects.equals(this.documentId, document.documentId) &&
        Objects.equals(this.filingSize, document.filingSize) &&
        Objects.equals(this.formTypes, document.formTypes) &&
        Objects.equals(this.accession, document.accession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, source, primaryIds, allIds, filingsDateTime, categories, filingsLink, documentId, filingSize, formTypes, accession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    primaryIds: ").append(toIndentedString(primaryIds)).append("\n");
    sb.append("    allIds: ").append(toIndentedString(allIds)).append("\n");
    sb.append("    filingsDateTime: ").append(toIndentedString(filingsDateTime)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    filingsLink: ").append(toIndentedString(filingsLink)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    filingSize: ").append(toIndentedString(filingSize)).append("\n");
    sb.append("    formTypes: ").append(toIndentedString(formTypes)).append("\n");
    sb.append("    accession: ").append(toIndentedString(accession)).append("\n");
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

