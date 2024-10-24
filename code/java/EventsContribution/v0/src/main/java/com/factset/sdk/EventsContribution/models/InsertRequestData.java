/*
 * Events Contribution API
 * The Events Contribution API provides the ability to add specific types of corporate events to FactSet’s own events calendar, for display within FactSet’s applications, as well as for off-platform re-distribution via FactSet’s Events Calendar API.
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.EventsContribution.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.EventsContribution.models.EventData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsContribution.JSON;


/**
 * InsertRequestData
 */
@JsonPropertyOrder({
  InsertRequestData.JSON_PROPERTY_EVENT_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InsertRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EVENT_DATA = "eventData";
  private EventData eventData;

  public InsertRequestData() { 
  }

  @JsonCreator
  public InsertRequestData(
    @JsonProperty(value=JSON_PROPERTY_EVENT_DATA, required=true) EventData eventData
  ) {
    this();
    this.eventData = eventData;
  }

  public InsertRequestData eventData(EventData eventData) {
    this.eventData = eventData;
    return this;
  }

   /**
   * Get eventData
   * @return eventData
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventData getEventData() {
    return eventData;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventData(EventData eventData) {
    this.eventData = eventData;
  }


  /**
   * Return true if this InsertRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertRequestData insertRequestData = (InsertRequestData) o;
    return Objects.equals(this.eventData, insertRequestData.eventData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertRequestData {\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
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

