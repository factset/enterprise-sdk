/*
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OverviewReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsAttributeMetaPeriodicity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OverviewReportBuilder.JSON;


/**
 * represents a person on the Profile response
 */
@ApiModel(description = "represents a person on the Profile response")
@JsonPropertyOrder({
  ProfileDataItemPerson.JSON_PROPERTY_ID,
  ProfileDataItemPerson.JSON_PROPERTY_NAME,
  ProfileDataItemPerson.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ProfileDataItemPerson implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private KeyStatsAttributeMetaPeriodicity id;

  public static final String JSON_PROPERTY_NAME = "name";
  private KeyStatsAttributeMetaPeriodicity name;

  public static final String JSON_PROPERTY_TITLE = "title";
  private KeyStatsAttributeMetaPeriodicity title;

  public ProfileDataItemPerson() { 
  }

  @JsonCreator
  public ProfileDataItemPerson(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) KeyStatsAttributeMetaPeriodicity id, 
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) KeyStatsAttributeMetaPeriodicity name, 
    @JsonProperty(value=JSON_PROPERTY_TITLE, required=true) KeyStatsAttributeMetaPeriodicity title
  ) {
    this();
    this.id = id;
    this.name = name;
    this.title = title;
  }

  public ProfileDataItemPerson id(KeyStatsAttributeMetaPeriodicity id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeyStatsAttributeMetaPeriodicity getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(KeyStatsAttributeMetaPeriodicity id) {
    this.id = id;
  }


  public ProfileDataItemPerson name(KeyStatsAttributeMetaPeriodicity name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeyStatsAttributeMetaPeriodicity getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(KeyStatsAttributeMetaPeriodicity name) {
    this.name = name;
  }


  public ProfileDataItemPerson title(KeyStatsAttributeMetaPeriodicity title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeyStatsAttributeMetaPeriodicity getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(KeyStatsAttributeMetaPeriodicity title) {
    this.title = title;
  }


  /**
   * Return true if this ProfileDataItemPerson object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileDataItemPerson profileDataItemPerson = (ProfileDataItemPerson) o;
    return Objects.equals(this.id, profileDataItemPerson.id) &&
        Objects.equals(this.name, profileDataItemPerson.name) &&
        Objects.equals(this.title, profileDataItemPerson.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDataItemPerson {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

