/*
 * Documents Distributor - CallStreet Events
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.8.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.DocumentsDistributorCallStreetEvents.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.NRTSnippetsMetaPartial;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.NRTSpeakeridsMetaPagination;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.JSON;


/**
 * NRTSpeakeridsMeta
 */
@JsonPropertyOrder({
  NRTSpeakeridsMeta.JSON_PROPERTY_SORT,
  NRTSpeakeridsMeta.JSON_PROPERTY_PAGINATION,
  NRTSpeakeridsMeta.JSON_PROPERTY_PARTIAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NRTSpeakeridsMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SORT = "sort";
  private java.util.List<String> sort = null;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private NRTSpeakeridsMetaPagination pagination;

  public static final String JSON_PROPERTY_PARTIAL = "partial";
  private NRTSnippetsMetaPartial partial;

  public NRTSpeakeridsMeta() { 
  }

  public NRTSpeakeridsMeta sort(java.util.List<String> sort) {
    this.sort = sort;
    return this;
  }

  public NRTSpeakeridsMeta addSortItem(String sortItem) {
    if (this.sort == null) {
      this.sort = new java.util.ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * The value in _sort parameter if used in the request.
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value in _sort parameter if used in the request.")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(java.util.List<String> sort) {
    this.sort = sort;
  }


  public NRTSpeakeridsMeta pagination(NRTSpeakeridsMetaPagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NRTSpeakeridsMetaPagination getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(NRTSpeakeridsMetaPagination pagination) {
    this.pagination = pagination;
  }


  public NRTSpeakeridsMeta partial(NRTSnippetsMetaPartial partial) {
    this.partial = partial;
    return this;
  }

   /**
   * Get partial
   * @return partial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NRTSnippetsMetaPartial getPartial() {
    return partial;
  }


  @JsonProperty(JSON_PROPERTY_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartial(NRTSnippetsMetaPartial partial) {
    this.partial = partial;
  }


  /**
   * Return true if this NRT_Speakerids_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRTSpeakeridsMeta nrTSpeakeridsMeta = (NRTSpeakeridsMeta) o;
    return Objects.equals(this.sort, nrTSpeakeridsMeta.sort) &&
        Objects.equals(this.pagination, nrTSpeakeridsMeta.pagination) &&
        Objects.equals(this.partial, nrTSpeakeridsMeta.partial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, pagination, partial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRTSpeakeridsMeta {\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    partial: ").append(toIndentedString(partial)).append("\n");
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

