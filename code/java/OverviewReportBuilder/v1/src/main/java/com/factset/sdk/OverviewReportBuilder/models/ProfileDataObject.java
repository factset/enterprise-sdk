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
import com.factset.sdk.OverviewReportBuilder.models.PeerListDataObjectMeta;
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataObjectBusiness;
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataObjectContact;
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataObjectSize;
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataObjectStage;
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
 * ProfileDataObject
 */
@JsonPropertyOrder({
  ProfileDataObject.JSON_PROPERTY_BUSINESS,
  ProfileDataObject.JSON_PROPERTY_CONTACT,
  ProfileDataObject.JSON_PROPERTY_META,
  ProfileDataObject.JSON_PROPERTY_SIZE,
  ProfileDataObject.JSON_PROPERTY_STAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ProfileDataObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BUSINESS = "business";
  private ProfileDataObjectBusiness business;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private ProfileDataObjectContact contact;

  public static final String JSON_PROPERTY_META = "meta";
  private PeerListDataObjectMeta meta;

  public static final String JSON_PROPERTY_SIZE = "size";
  private ProfileDataObjectSize size;

  public static final String JSON_PROPERTY_STAGE = "stage";
  private ProfileDataObjectStage stage;

  public ProfileDataObject() { 
  }

  @JsonCreator
  public ProfileDataObject(
    @JsonProperty(value=JSON_PROPERTY_BUSINESS, required=true) ProfileDataObjectBusiness business, 
    @JsonProperty(value=JSON_PROPERTY_CONTACT, required=true) ProfileDataObjectContact contact, 
    @JsonProperty(value=JSON_PROPERTY_SIZE, required=true) ProfileDataObjectSize size, 
    @JsonProperty(value=JSON_PROPERTY_STAGE, required=true) ProfileDataObjectStage stage
  ) {
    this();
    this.business = business;
    this.contact = contact;
    this.size = size;
    this.stage = stage;
  }

  public ProfileDataObject business(ProfileDataObjectBusiness business) {
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProfileDataObjectBusiness getBusiness() {
    return business;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusiness(ProfileDataObjectBusiness business) {
    this.business = business;
  }


  public ProfileDataObject contact(ProfileDataObjectContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProfileDataObjectContact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContact(ProfileDataObjectContact contact) {
    this.contact = contact;
  }


  public ProfileDataObject meta(PeerListDataObjectMeta meta) {
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

  public PeerListDataObjectMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(PeerListDataObjectMeta meta) {
    this.meta = meta;
  }


  public ProfileDataObject size(ProfileDataObjectSize size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProfileDataObjectSize getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(ProfileDataObjectSize size) {
    this.size = size;
  }


  public ProfileDataObject stage(ProfileDataObjectStage stage) {
    this.stage = stage;
    return this;
  }

   /**
   * Get stage
   * @return stage
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProfileDataObjectStage getStage() {
    return stage;
  }


  @JsonProperty(JSON_PROPERTY_STAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStage(ProfileDataObjectStage stage) {
    this.stage = stage;
  }


  /**
   * Return true if this ProfileDataObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileDataObject profileDataObject = (ProfileDataObject) o;
    return Objects.equals(this.business, profileDataObject.business) &&
        Objects.equals(this.contact, profileDataObject.contact) &&
        Objects.equals(this.meta, profileDataObject.meta) &&
        Objects.equals(this.size, profileDataObject.size) &&
        Objects.equals(this.stage, profileDataObject.stage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(business, contact, meta, size, stage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDataObject {\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
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

