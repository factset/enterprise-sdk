/*
 * Events and Transcripts API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * Search criteria for transcripts based on date range and timeZone.
 */
@ApiModel(description = "Search criteria for transcripts based on date range and timeZone.")
@JsonPropertyOrder({
  TranscriptsByDateRequest.JSON_PROPERTY_START_DATE,
  TranscriptsByDateRequest.JSON_PROPERTY_END_DATE,
  TranscriptsByDateRequest.JSON_PROPERTY_START_DATE_RELATIVE,
  TranscriptsByDateRequest.JSON_PROPERTY_END_DATE_RELATIVE,
  TranscriptsByDateRequest.JSON_PROPERTY_TIME_ZONE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TranscriptsByDateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private LocalDate startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private LocalDate endDate;

  public static final String JSON_PROPERTY_START_DATE_RELATIVE = "startDateRelative";
  private Integer startDateRelative;

  public static final String JSON_PROPERTY_END_DATE_RELATIVE = "endDateRelative";
  private Integer endDateRelative;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone = "America/New_York";

  public TranscriptsByDateRequest() { 
  }

  public TranscriptsByDateRequest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start Date (YYYY-MM-DD). Data available from April 21st, 1999 onwards. *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.* 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri Dec 22 00:00:00 UTC 2023", value = "Start Date (YYYY-MM-DD). Data available from April 21st, 1999 onwards. *Either `startDate` or `startDateRelative` should be used.* ")
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


  public TranscriptsByDateRequest endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End Date (YYYY-MM-DD). *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.* 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Sat Dec 23 00:00:00 UTC 2023", value = "End Date (YYYY-MM-DD). *Either `endDate` or `endDateRelative` should be used.* ")
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


  public TranscriptsByDateRequest startDateRelative(Integer startDateRelative) {
    this.startDateRelative = startDateRelative;
    return this;
  }

   /**
   * Start date relative to today (0&#x3D;today, -1&#x3D;yesterday). *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.* 
   * maximum: 0
   * @return startDateRelative
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "-3", value = "Start date relative to today (0=today, -1=yesterday). *Either `startDate` or `startDateRelative` should be used.* ")
  @JsonProperty(JSON_PROPERTY_START_DATE_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartDateRelative() {
    return startDateRelative;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDateRelative(Integer startDateRelative) {
    this.startDateRelative = startDateRelative;
  }


  public TranscriptsByDateRequest endDateRelative(Integer endDateRelative) {
    this.endDateRelative = endDateRelative;
    return this;
  }

   /**
   * End date relative to today (0&#x3D;today, -1&#x3D;yesterday). *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.* 
   * maximum: 0
   * @return endDateRelative
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "End date relative to today (0=today, -1=yesterday). *Either `endDate` or `endDateRelative` should be used.* ")
  @JsonProperty(JSON_PROPERTY_END_DATE_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndDateRelative() {
    return endDateRelative;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDateRelative(Integer endDateRelative) {
    this.endDateRelative = endDateRelative;
  }


  public TranscriptsByDateRequest timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones.
   * @return timeZone
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Europe/London", value = "Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the `/meta/time-zones` endpoint to get the list of available time zones.")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * Return true if this TranscriptsByDateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptsByDateRequest transcriptsByDateRequest = (TranscriptsByDateRequest) o;
    return Objects.equals(this.startDate, transcriptsByDateRequest.startDate) &&
        Objects.equals(this.endDate, transcriptsByDateRequest.endDate) &&
        Objects.equals(this.startDateRelative, transcriptsByDateRequest.startDateRelative) &&
        Objects.equals(this.endDateRelative, transcriptsByDateRequest.endDateRelative) &&
        Objects.equals(this.timeZone, transcriptsByDateRequest.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, startDateRelative, endDateRelative, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptsByDateRequest {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDateRelative: ").append(toIndentedString(startDateRelative)).append("\n");
    sb.append("    endDateRelative: ").append(toIndentedString(endDateRelative)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

