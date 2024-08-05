/*
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Signals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Signals.models.ContractFieldsSummary;
import com.factset.sdk.Signals.models.ContractProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Signals.JSON;


/**
 * ContractFields
 */
@JsonPropertyOrder({
  ContractFields.JSON_PROPERTY_SUMMARY,
  ContractFields.JSON_PROPERTY_EVENT_DATE,
  ContractFields.JSON_PROPERTY_ADDITIONAL_PROPERTIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ContractFields implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private ContractFieldsSummary summary;

  public static final String JSON_PROPERTY_EVENT_DATE = "eventDate";
  private ContractFieldsSummary eventDate;

  public static final String JSON_PROPERTY_ADDITIONAL_PROPERTIES = "additionalProperties";
  private ContractProperty additionalProperties;

  public ContractFields() { 
  }

  @JsonCreator
  public ContractFields(
    @JsonProperty(value=JSON_PROPERTY_SUMMARY, required=true) ContractFieldsSummary summary, 
    @JsonProperty(value=JSON_PROPERTY_EVENT_DATE, required=true) ContractFieldsSummary eventDate
  ) {
    this();
    this.summary = summary;
    this.eventDate = eventDate;
  }

  public ContractFields summary(ContractFieldsSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ContractFieldsSummary getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSummary(ContractFieldsSummary summary) {
    this.summary = summary;
  }


  public ContractFields eventDate(ContractFieldsSummary eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Get eventDate
   * @return eventDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ContractFieldsSummary getEventDate() {
    return eventDate;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventDate(ContractFieldsSummary eventDate) {
    this.eventDate = eventDate;
  }


  public ContractFields additionalProperties(ContractProperty additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContractProperty getAdditionalProperties() {
    return additionalProperties;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalProperties(ContractProperty additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   * Return true if this contractFields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractFields contractFields = (ContractFields) o;
    return Objects.equals(this.summary, contractFields.summary) &&
        Objects.equals(this.eventDate, contractFields.eventDate) &&
        Objects.equals(this.additionalProperties, contractFields.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, eventDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractFields {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

