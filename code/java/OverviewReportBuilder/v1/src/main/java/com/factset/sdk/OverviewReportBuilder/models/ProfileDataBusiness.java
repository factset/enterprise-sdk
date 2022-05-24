/*
 * FactSet Overview Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataBusinessCrunchbaseCategories;
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataBusinessCrunchbaseUrl;
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataBusinessDescription;
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataBusinessIndustry;
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
 * ProfileDataBusiness
 */
@JsonPropertyOrder({
  ProfileDataBusiness.JSON_PROPERTY_DESCRIPTION,
  ProfileDataBusiness.JSON_PROPERTY_INDUSTRY,
  ProfileDataBusiness.JSON_PROPERTY_SECTOR,
  ProfileDataBusiness.JSON_PROPERTY_NAME,
  ProfileDataBusiness.JSON_PROPERTY_DBA_NAME,
  ProfileDataBusiness.JSON_PROPERTY_CRUNCHBASE_CATEGORIES,
  ProfileDataBusiness.JSON_PROPERTY_CRUNCHBASE_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProfileDataBusiness implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private ProfileDataBusinessDescription description;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private ProfileDataBusinessIndustry industry;

  public static final String JSON_PROPERTY_SECTOR = "sector";
  private ProfileDataBusinessIndustry sector;

  public static final String JSON_PROPERTY_NAME = "name";
  private ProfileDataBusinessIndustry name;

  public static final String JSON_PROPERTY_DBA_NAME = "dbaName";
  private ProfileDataBusinessIndustry dbaName;

  public static final String JSON_PROPERTY_CRUNCHBASE_CATEGORIES = "crunchbaseCategories";
  private ProfileDataBusinessCrunchbaseCategories crunchbaseCategories;

  public static final String JSON_PROPERTY_CRUNCHBASE_URL = "crunchbaseUrl";
  private ProfileDataBusinessCrunchbaseUrl crunchbaseUrl;

  public ProfileDataBusiness() { 
  }

  @JsonCreator
  public ProfileDataBusiness(
    @JsonProperty(value=JSON_PROPERTY_DESCRIPTION, required=true) ProfileDataBusinessDescription description, 
    @JsonProperty(value=JSON_PROPERTY_INDUSTRY, required=true) ProfileDataBusinessIndustry industry, 
    @JsonProperty(value=JSON_PROPERTY_SECTOR, required=true) ProfileDataBusinessIndustry sector, 
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) ProfileDataBusinessIndustry name
  ) {
    this();
    this.description = description;
    this.industry = industry;
    this.sector = sector;
    this.name = name;
  }

  public ProfileDataBusiness description(ProfileDataBusinessDescription description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProfileDataBusinessDescription getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(ProfileDataBusinessDescription description) {
    this.description = description;
  }


  public ProfileDataBusiness industry(ProfileDataBusinessIndustry industry) {
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProfileDataBusinessIndustry getIndustry() {
    return industry;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndustry(ProfileDataBusinessIndustry industry) {
    this.industry = industry;
  }


  public ProfileDataBusiness sector(ProfileDataBusinessIndustry sector) {
    this.sector = sector;
    return this;
  }

   /**
   * Get sector
   * @return sector
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProfileDataBusinessIndustry getSector() {
    return sector;
  }


  @JsonProperty(JSON_PROPERTY_SECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSector(ProfileDataBusinessIndustry sector) {
    this.sector = sector;
  }


  public ProfileDataBusiness name(ProfileDataBusinessIndustry name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProfileDataBusinessIndustry getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(ProfileDataBusinessIndustry name) {
    this.name = name;
  }


  public ProfileDataBusiness dbaName(ProfileDataBusinessIndustry dbaName) {
    this.dbaName = dbaName;
    return this;
  }

   /**
   * Get dbaName
   * @return dbaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DBA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProfileDataBusinessIndustry getDbaName() {
    return dbaName;
  }


  @JsonProperty(JSON_PROPERTY_DBA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbaName(ProfileDataBusinessIndustry dbaName) {
    this.dbaName = dbaName;
  }


  public ProfileDataBusiness crunchbaseCategories(ProfileDataBusinessCrunchbaseCategories crunchbaseCategories) {
    this.crunchbaseCategories = crunchbaseCategories;
    return this;
  }

   /**
   * Get crunchbaseCategories
   * @return crunchbaseCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRUNCHBASE_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProfileDataBusinessCrunchbaseCategories getCrunchbaseCategories() {
    return crunchbaseCategories;
  }


  @JsonProperty(JSON_PROPERTY_CRUNCHBASE_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrunchbaseCategories(ProfileDataBusinessCrunchbaseCategories crunchbaseCategories) {
    this.crunchbaseCategories = crunchbaseCategories;
  }


  public ProfileDataBusiness crunchbaseUrl(ProfileDataBusinessCrunchbaseUrl crunchbaseUrl) {
    this.crunchbaseUrl = crunchbaseUrl;
    return this;
  }

   /**
   * Get crunchbaseUrl
   * @return crunchbaseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRUNCHBASE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProfileDataBusinessCrunchbaseUrl getCrunchbaseUrl() {
    return crunchbaseUrl;
  }


  @JsonProperty(JSON_PROPERTY_CRUNCHBASE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrunchbaseUrl(ProfileDataBusinessCrunchbaseUrl crunchbaseUrl) {
    this.crunchbaseUrl = crunchbaseUrl;
  }


  /**
   * Return true if this ProfileData_business object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileDataBusiness profileDataBusiness = (ProfileDataBusiness) o;
    return Objects.equals(this.description, profileDataBusiness.description) &&
        Objects.equals(this.industry, profileDataBusiness.industry) &&
        Objects.equals(this.sector, profileDataBusiness.sector) &&
        Objects.equals(this.name, profileDataBusiness.name) &&
        Objects.equals(this.dbaName, profileDataBusiness.dbaName) &&
        Objects.equals(this.crunchbaseCategories, profileDataBusiness.crunchbaseCategories) &&
        Objects.equals(this.crunchbaseUrl, profileDataBusiness.crunchbaseUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, industry, sector, name, dbaName, crunchbaseCategories, crunchbaseUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDataBusiness {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dbaName: ").append(toIndentedString(dbaName)).append("\n");
    sb.append("    crunchbaseCategories: ").append(toIndentedString(crunchbaseCategories)).append("\n");
    sb.append("    crunchbaseUrl: ").append(toIndentedString(crunchbaseUrl)).append("\n");
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
