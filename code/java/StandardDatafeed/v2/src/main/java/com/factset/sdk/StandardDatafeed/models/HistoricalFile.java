/*
 * Standard DataFeed (SDF) Download API
 * [The Standard DataFeed (SDF) Download API](https://www.factset.com/marketplace/catalog/product/factset-standard-datafeed-download-api)  provides an alternative method for users to request and retrieve SDF packages (schemas & bundles).  This service is not a direct replacement and does not have 100% feature parity with the Loader Application.  This API provides an alternative for users who are unable to utilize the Loader application due to the following reasons:  * Inability to install 3rd party executables due to Corporate Security policies.  * Inability to utilize the Loader application due to limitations or restrictions with the environment used to consume Standard Datafeed.  * Clients who are utilizing existing delivery methods like FTP, who may want to use a more secure & modern solution.  This API allows users to retrieve  * Both SDF and the QFL (Quant Factor Library (Factor Family & Factor Groups)) packages they have subscriptions for, with data available since January 1, 1995.  Additional parameters are available to filter requests to get the exact files users are looking for.  QFL data is delivered through Content API & Bulk Data API (SDF API).  * Content API: Provides direct access to FactSet-hosted QFL data. Suitable for interactive, ad hoc QFL requests. Constraints on large extracts. Costs are based on consumption, i.e. more calls can result in more costs.  * Bulk Data API: Provides access to download locations of zip files for client download. Suitable for production processes within a client environment. Cost is based on the use case and fixed unless scope changes (same as other SDFs).  Please find all the content-related comprehensive documentation [here](https://my.apps.factset.com/oa/pages/15222). 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StandardDatafeed.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StandardDatafeed.models.HistoricalFileObject;
import com.factset.sdk.StandardDatafeed.models.Meta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StandardDatafeed.JSON;


/**
 * Historical Files Object
 */
@ApiModel(description = "Historical Files Object")
@JsonPropertyOrder({
  HistoricalFile.JSON_PROPERTY_DATA,
  HistoricalFile.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class HistoricalFile implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<HistoricalFileObject> data = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private Meta meta;

  public HistoricalFile() { 
  }

  @JsonCreator
  public HistoricalFile(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) java.util.List<HistoricalFileObject> data
  ) {
    this();
    this.data = data;
  }

  public HistoricalFile data(java.util.List<HistoricalFileObject> data) {
    this.data = data;
    return this;
  }

  public HistoricalFile addDataItem(HistoricalFileObject dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Historical Files Data Array.
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Historical Files Data Array.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<HistoricalFileObject> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(java.util.List<HistoricalFileObject> data) {
    this.data = data;
  }


  public HistoricalFile meta(Meta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this HistoricalFile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalFile historicalFile = (HistoricalFile) o;
    return Objects.equals(this.data, historicalFile.data) &&
        Objects.equals(this.meta, historicalFile.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalFile {\n");
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

