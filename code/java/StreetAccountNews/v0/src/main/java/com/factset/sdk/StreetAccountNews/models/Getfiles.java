/*
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Company Filters, Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.  **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Request Files, Check Status, and Get Files.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StreetAccountNews.models;

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
import com.factset.sdk.StreetAccountNews.JSON;


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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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

