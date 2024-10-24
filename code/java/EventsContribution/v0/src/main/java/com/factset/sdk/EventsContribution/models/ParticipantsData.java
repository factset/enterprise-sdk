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
 * Participants of the event
 */
@ApiModel(description = "Participants of the event")
@JsonPropertyOrder({
  ParticipantsData.JSON_PROPERTY_FIRST_NAME,
  ParticipantsData.JSON_PROPERTY_LAST_NAME,
  ParticipantsData.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ParticipantsData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ParticipantsData() { 
  }

  @JsonCreator
  public ParticipantsData(
    @JsonProperty(value=JSON_PROPERTY_FIRST_NAME, required=true) String firstName, 
    @JsonProperty(value=JSON_PROPERTY_LAST_NAME, required=true) String lastName
  ) {
    this();
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public ParticipantsData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the participant
   * @return firstName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Jane", required = true, value = "The first name of the participant")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ParticipantsData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the participant
   * @return lastName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Doe", required = true, value = "The last name of the participant")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ParticipantsData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the participant
   * @return title
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "CEO", value = "The title of the participant")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this ParticipantsData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantsData participantsData = (ParticipantsData) o;
    return Objects.equals(this.firstName, participantsData.firstName) &&
        Objects.equals(this.lastName, participantsData.lastName) &&
        Objects.equals(this.title, participantsData.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantsData {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

