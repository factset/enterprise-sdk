/*
 * EVENTS AND TRANSCRIPTS API
 * <p>The Calendar Events API provides access to FactSet’s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.1.0
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
import com.factset.sdk.EventsandTranscripts.models.CompanyEventRequestDataDateTime;
import com.factset.sdk.EventsandTranscripts.models.CompanyEventRequestDataUniverse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * CompanyEventRequestData
 */
@JsonPropertyOrder({
  CompanyEventRequestData.JSON_PROPERTY_DATE_TIME,
  CompanyEventRequestData.JSON_PROPERTY_UNIVERSE,
  CompanyEventRequestData.JSON_PROPERTY_EVENT_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyEventRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE_TIME = "dateTime";
  private CompanyEventRequestDataDateTime dateTime;

  public static final String JSON_PROPERTY_UNIVERSE = "universe";
  private CompanyEventRequestDataUniverse universe;

  /**
   * Gets or Sets eventTypes
   */
  public enum EventTypesEnum {
    EARNINGS("Earnings"),
    
    SALESREVENUECALL("SalesRevenueCall"),
    
    GUIDANCECALL("GuidanceCall"),
    
    ANALYSTSINVESTORSMEETING("AnalystsInvestorsMeeting"),
    
    SHAREHOLDERSMEETING("ShareholdersMeeting"),
    
    SPECIALSITUATION("SpecialSituation"),
    
    CONFERENCE("Conference"),
    
    CONFIRMEDEARNINGSRELEASE("ConfirmedEarningsRelease"),
    
    PROJECTEDEARNINGSRELEASE("ProjectedEarningsRelease"),
    
    SALESREVENUERELEASE("SalesRevenueRelease"),
    
    SPLIT("Split"),
    
    DIVIDEND("Dividend");

    private String value;

    EventTypesEnum(String value) {
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
    public static EventTypesEnum fromValue(String value) {
      for (EventTypesEnum b : EventTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPES = "eventTypes";
  private java.util.List<EventTypesEnum> eventTypes = null;

  public CompanyEventRequestData() { 
  }

  @JsonCreator
  public CompanyEventRequestData(
    @JsonProperty(value=JSON_PROPERTY_DATE_TIME, required=true) CompanyEventRequestDataDateTime dateTime, 
    @JsonProperty(value=JSON_PROPERTY_UNIVERSE, required=true) CompanyEventRequestDataUniverse universe
  ) {
    this();
    this.dateTime = dateTime;
    this.universe = universe;
  }

  public CompanyEventRequestData dateTime(CompanyEventRequestDataDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CompanyEventRequestDataDateTime getDateTime() {
    return dateTime;
  }


  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateTime(CompanyEventRequestDataDateTime dateTime) {
    this.dateTime = dateTime;
  }


  public CompanyEventRequestData universe(CompanyEventRequestDataUniverse universe) {
    this.universe = universe;
    return this;
  }

   /**
   * Get universe
   * @return universe
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UNIVERSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CompanyEventRequestDataUniverse getUniverse() {
    return universe;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniverse(CompanyEventRequestDataUniverse universe) {
    this.universe = universe;
  }


  public CompanyEventRequestData eventTypes(java.util.List<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public CompanyEventRequestData addEventTypesItem(EventTypesEnum eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new java.util.ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * The type of events returned in the response
   * @return eventTypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The type of events returned in the response")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<EventTypesEnum> getEventTypes() {
    return eventTypes;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventTypes(java.util.List<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
  }


  /**
   * Return true if this CompanyEventRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyEventRequestData companyEventRequestData = (CompanyEventRequestData) o;
    return Objects.equals(this.dateTime, companyEventRequestData.dateTime) &&
        Objects.equals(this.universe, companyEventRequestData.universe) &&
        Objects.equals(this.eventTypes, companyEventRequestData.eventTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, universe, eventTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyEventRequestData {\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    universe: ").append(toIndentedString(universe)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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

