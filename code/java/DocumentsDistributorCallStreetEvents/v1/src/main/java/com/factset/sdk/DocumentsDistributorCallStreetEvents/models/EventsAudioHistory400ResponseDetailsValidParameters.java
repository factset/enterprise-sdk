/*
 * Documents Distributor - CallStreet Events
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.7.0
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
 * EventsAudioHistory400ResponseDetailsValidParameters
 */
@JsonPropertyOrder({
  EventsAudioHistory400ResponseDetailsValidParameters.JSON_PROPERTY_PAGINATION_LIMIT,
  EventsAudioHistory400ResponseDetailsValidParameters.JSON_PROPERTY_PAGINATION_OFFSET,
  EventsAudioHistory400ResponseDetailsValidParameters.JSON_PROPERTY_YEAR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventsAudioHistory400ResponseDetailsValidParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAGINATION_LIMIT = "_paginationLimit";
  private java.util.List<String> paginationLimit = null;

  public static final String JSON_PROPERTY_PAGINATION_OFFSET = "_paginationOffset";
  private java.util.List<String> paginationOffset = null;

  public static final String JSON_PROPERTY_YEAR = "year";
  private java.util.List<String> year = null;

  public EventsAudioHistory400ResponseDetailsValidParameters() { 
  }

  public EventsAudioHistory400ResponseDetailsValidParameters paginationLimit(java.util.List<String> paginationLimit) {
    this.paginationLimit = paginationLimit;
    return this;
  }

  public EventsAudioHistory400ResponseDetailsValidParameters addPaginationLimitItem(String paginationLimitItem) {
    if (this.paginationLimit == null) {
      this.paginationLimit = new java.util.ArrayList<>();
    }
    this.paginationLimit.add(paginationLimitItem);
    return this;
  }

   /**
   * Get paginationLimit
   * @return paginationLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getPaginationLimit() {
    return paginationLimit;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaginationLimit(java.util.List<String> paginationLimit) {
    this.paginationLimit = paginationLimit;
  }


  public EventsAudioHistory400ResponseDetailsValidParameters paginationOffset(java.util.List<String> paginationOffset) {
    this.paginationOffset = paginationOffset;
    return this;
  }

  public EventsAudioHistory400ResponseDetailsValidParameters addPaginationOffsetItem(String paginationOffsetItem) {
    if (this.paginationOffset == null) {
      this.paginationOffset = new java.util.ArrayList<>();
    }
    this.paginationOffset.add(paginationOffsetItem);
    return this;
  }

   /**
   * Get paginationOffset
   * @return paginationOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getPaginationOffset() {
    return paginationOffset;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaginationOffset(java.util.List<String> paginationOffset) {
    this.paginationOffset = paginationOffset;
  }


  public EventsAudioHistory400ResponseDetailsValidParameters year(java.util.List<String> year) {
    this.year = year;
    return this;
  }

  public EventsAudioHistory400ResponseDetailsValidParameters addYearItem(String yearItem) {
    if (this.year == null) {
      this.year = new java.util.ArrayList<>();
    }
    this.year.add(yearItem);
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(java.util.List<String> year) {
    this.year = year;
  }


  /**
   * Return true if this Events_Audio_History_400_Response_details_validParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsAudioHistory400ResponseDetailsValidParameters eventsAudioHistory400ResponseDetailsValidParameters = (EventsAudioHistory400ResponseDetailsValidParameters) o;
    return Objects.equals(this.paginationLimit, eventsAudioHistory400ResponseDetailsValidParameters.paginationLimit) &&
        Objects.equals(this.paginationOffset, eventsAudioHistory400ResponseDetailsValidParameters.paginationOffset) &&
        Objects.equals(this.year, eventsAudioHistory400ResponseDetailsValidParameters.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationLimit, paginationOffset, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsAudioHistory400ResponseDetailsValidParameters {\n");
    sb.append("    paginationLimit: ").append(toIndentedString(paginationLimit)).append("\n");
    sb.append("    paginationOffset: ").append(toIndentedString(paginationOffset)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
