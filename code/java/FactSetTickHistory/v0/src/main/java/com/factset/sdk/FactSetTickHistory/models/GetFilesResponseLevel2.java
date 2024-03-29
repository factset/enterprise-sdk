/*
 * Tick History Level 2 (Beta)
 * Tick History **Level 2** provides dynamic access to the historical tick data up to 10 levels of depth for a specific security for specific dates or date range. The API generates output files with data based on client-specified input parameters. The input parameters include universe specification and date ranges for which the data will be generated. When the API request with specified input parameters has been completed, the output files will be made available back to the users through a secure URL to the location where the files are stored. Therefore, this API has two APIs (i) Request files API (ii) Get Files API.
 *
 * The version of the OpenAPI document: 0.0.0
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
import com.factset.sdk.FactSetTickHistory.models.Files;
import com.factset.sdk.FactSetTickHistory.models.Meta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetTickHistory.JSON;


/**
 * Returns Tick History Files
 */
@ApiModel(description = "Returns Tick History Files")
@JsonPropertyOrder({
  GetFilesResponseLevel2.JSON_PROPERTY_STATUS,
  GetFilesResponseLevel2.JSON_PROPERTY_REQUEST_TIMESTAMP,
  GetFilesResponseLevel2.JSON_PROPERTY_UPDATE_TIMESTAMP,
  GetFilesResponseLevel2.JSON_PROPERTY_DATA,
  GetFilesResponseLevel2.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetFilesResponseLevel2 implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The status of the request
   */
  public enum StatusEnum {
    STARTING("Starting"),
    
    RUNNING("Running"),
    
    COMPLETED("Completed"),
    
    ERROR("Error"),
    
    FAILED("Failed"),
    
    STOPPED("Stopped");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_REQUEST_TIMESTAMP = "requestTimestamp";
  private OffsetDateTime requestTimestamp;

  public static final String JSON_PROPERTY_UPDATE_TIMESTAMP = "updateTimestamp";
  private OffsetDateTime updateTimestamp;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<Files> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Meta meta;

  public GetFilesResponseLevel2() { 
  }

  public GetFilesResponseLevel2 status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the request
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the request")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public GetFilesResponseLevel2 requestTimestamp(OffsetDateTime requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
  }

   /**
   * Timestamp of when request was made
   * @return requestTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when request was made")
  @JsonProperty(JSON_PROPERTY_REQUEST_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRequestTimestamp() {
    return requestTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestTimestamp(OffsetDateTime requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
  }


  public GetFilesResponseLevel2 updateTimestamp(OffsetDateTime updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
    return this;
  }

   /**
   * Timestamp when the file was last updated
   * @return updateTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the file was last updated")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdateTimestamp() {
    return updateTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTimestamp(OffsetDateTime updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }


  public GetFilesResponseLevel2 data(java.util.List<Files> data) {
    this.data = data;
    return this;
  }

  public GetFilesResponseLevel2 addDataItem(Files dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Data Object
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data Object")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Files> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(java.util.List<Files> data) {
    this.data = data;
  }


  public GetFilesResponseLevel2 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Meta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this Get-FilesResponseLevel2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFilesResponseLevel2 getFilesResponseLevel2 = (GetFilesResponseLevel2) o;
    return Objects.equals(this.status, getFilesResponseLevel2.status) &&
        Objects.equals(this.requestTimestamp, getFilesResponseLevel2.requestTimestamp) &&
        Objects.equals(this.updateTimestamp, getFilesResponseLevel2.updateTimestamp) &&
        Objects.equals(this.data, getFilesResponseLevel2.data) &&
        Objects.equals(this.meta, getFilesResponseLevel2.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, requestTimestamp, updateTimestamp, data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFilesResponseLevel2 {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requestTimestamp: ").append(toIndentedString(requestTimestamp)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

