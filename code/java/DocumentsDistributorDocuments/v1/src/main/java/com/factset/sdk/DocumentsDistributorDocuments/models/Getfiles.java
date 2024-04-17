/*
 * Documents Distributor - Documents API
 * Documents APIs that provide filings such as Global Filings and XML files such as StreetAccount    Global Filings API provides the capability to search and download filings documents from various exchanges around the world. This API will provide access to the full history and the ability to search by date and dataset(source). It does not provide real-time updates to the filings documents. Filings providers currently include EDGAR       Note: The real-time updates to the filing documents will be available within week to ten days and per request able to query up to 8 days of data               StreetAccount XML API provides access to historical StreetAccount (SA) news. SA provides a summary for various corporate and market news written by journalist with background in financial markets.    The API delivers SA stories in XML format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files.      This API only supports adhoc requests to retrieve historical files and does not support real-time files and if require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or users Azure Storage)   Both historical and real-time Street Account news is also delivered via SFTP, to users QNT account, or users Azure Storage.  Files delivered contain both metadata and content body in each file. This eliminates the need to make multiple requests through multiple services to get all the information.  News API provides access to historical news. This provides a summary for various corporate and market news written by journalist with background in financial markets.  The API delivers  stories in different format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files    
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.DocumentsDistributorDocuments.models;

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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.DocumentsDistributorDocuments.JSON;


/**
 * Getfiles
 */
@JsonPropertyOrder({
  Getfiles.JSON_PROPERTY_PRODUCT,
  Getfiles.JSON_PROPERTY_START_DATE,
  Getfiles.JSON_PROPERTY_END_DATE,
  Getfiles.JSON_PROPERTY_JOB_I_D,
  Getfiles.JSON_PROPERTY_STATUS,
  Getfiles.JSON_PROPERTY_URL,
  Getfiles.JSON_PROPERTY_PART
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Getfiles implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private LocalDate startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private LocalDate endDate;

  public static final String JSON_PROPERTY_JOB_I_D = "jobID";
  private String jobID;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_PART = "part";
  private Integer part;

  public Getfiles() { 
  }

  public Getfiles product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Defines the name of the product
   * @return product
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Defines the name of the product")
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProduct() {
    return product;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduct(String product) {
    this.product = product;
  }


  public Getfiles startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The startDate from which the data is required in YYYY-MM-DDTHH:MM:SSZ format
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The startDate from which the data is required in YYYY-MM-DDTHH:MM:SSZ format")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public Getfiles endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The endDate until which the data is fetched in YYYY-MM-DDTHH:MM:SSZ format
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The endDate until which the data is fetched in YYYY-MM-DDTHH:MM:SSZ format")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public Getfiles jobID(String jobID) {
    this.jobID = jobID;
    return this;
  }

   /**
   * Unique id to get the xml files for the requested date
   * @return jobID
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique id to get the xml files for the requested date")
  @JsonProperty(JSON_PROPERTY_JOB_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobID() {
    return jobID;
  }


  @JsonProperty(JSON_PROPERTY_JOB_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobID(String jobID) {
    this.jobID = jobID;
  }


  public Getfiles status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Defines the status of the request
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Defines the status of the request")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public Getfiles url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Link to download the zip file which contains xml files
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Link to download the zip file which contains xml files")
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


  public Getfiles part(Integer part) {
    this.part = part;
    return this;
  }

   /**
   * Returns the part number of the jobID
   * @return part
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Returns the part number of the jobID")
  @JsonProperty(JSON_PROPERTY_PART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPart() {
    return part;
  }


  @JsonProperty(JSON_PROPERTY_PART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPart(Integer part) {
    this.part = part;
  }


  /**
   * Return true if this getfiles object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Getfiles getfiles = (Getfiles) o;
    return Objects.equals(this.product, getfiles.product) &&
        Objects.equals(this.startDate, getfiles.startDate) &&
        Objects.equals(this.endDate, getfiles.endDate) &&
        Objects.equals(this.jobID, getfiles.jobID) &&
        Objects.equals(this.status, getfiles.status) &&
        Objects.equals(this.url, getfiles.url) &&
        Objects.equals(this.part, getfiles.part);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, startDate, endDate, jobID, status, url, part);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Getfiles {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
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

