/*
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Vermilion.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Vermilion.models.ScimEmail;
import com.factset.sdk.Vermilion.models.ScimPhone;
import com.factset.sdk.Vermilion.models.ScimPhoto;
import com.factset.sdk.Vermilion.models.ScimUserName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Vermilion.JSON;


/**
 * ScimUser
 */
@JsonPropertyOrder({
  ScimUser.JSON_PROPERTY_ID,
  ScimUser.JSON_PROPERTY_USER_NAME,
  ScimUser.JSON_PROPERTY_NAME,
  ScimUser.JSON_PROPERTY_USER_TYPE,
  ScimUser.JSON_PROPERTY_ACTIVE,
  ScimUser.JSON_PROPERTY_PHONE_NUMBERS,
  ScimUser.JSON_PROPERTY_EMAILS,
  ScimUser.JSON_PROPERTY_PHOTOS,
  ScimUser.JSON_PROPERTY_DOMAIN_CODE,
  ScimUser.JSON_PROPERTY_IS_ADMINISTRATOR,
  ScimUser.JSON_PROPERTY_TENANT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScimUser implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_NAME = "name";
  private ScimUserName name;

  public static final String JSON_PROPERTY_USER_TYPE = "userType";
  private String userType;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phoneNumbers";
  private java.util.List<ScimPhone> phoneNumbers = null;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  private java.util.List<ScimEmail> emails = null;

  public static final String JSON_PROPERTY_PHOTOS = "photos";
  private java.util.List<ScimPhoto> photos = null;

  public static final String JSON_PROPERTY_DOMAIN_CODE = "domainCode";
  private String domainCode;

  public static final String JSON_PROPERTY_IS_ADMINISTRATOR = "isAdministrator";
  private Boolean isAdministrator;

  public static final String JSON_PROPERTY_TENANT = "tenant";
  private String tenant;

  public ScimUser() { 
  }

  public ScimUser id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public ScimUser userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ScimUser name(ScimUserName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScimUserName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(ScimUserName name) {
    this.name = name;
  }


  public ScimUser userType(String userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserType() {
    return userType;
  }


  @JsonProperty(JSON_PROPERTY_USER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserType(String userType) {
    this.userType = userType;
  }


  public ScimUser active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public ScimUser phoneNumbers(java.util.List<ScimPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public ScimUser addPhoneNumbersItem(ScimPhone phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new java.util.ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ScimPhone> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbers(java.util.List<ScimPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public ScimUser emails(java.util.List<ScimEmail> emails) {
    this.emails = emails;
    return this;
  }

  public ScimUser addEmailsItem(ScimEmail emailsItem) {
    if (this.emails == null) {
      this.emails = new java.util.ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ScimEmail> getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmails(java.util.List<ScimEmail> emails) {
    this.emails = emails;
  }


  public ScimUser photos(java.util.List<ScimPhoto> photos) {
    this.photos = photos;
    return this;
  }

  public ScimUser addPhotosItem(ScimPhoto photosItem) {
    if (this.photos == null) {
      this.photos = new java.util.ArrayList<>();
    }
    this.photos.add(photosItem);
    return this;
  }

   /**
   * Get photos
   * @return photos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHOTOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ScimPhoto> getPhotos() {
    return photos;
  }


  @JsonProperty(JSON_PROPERTY_PHOTOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhotos(java.util.List<ScimPhoto> photos) {
    this.photos = photos;
  }


  public ScimUser domainCode(String domainCode) {
    this.domainCode = domainCode;
    return this;
  }

   /**
   * Get domainCode
   * @return domainCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOMAIN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomainCode() {
    return domainCode;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainCode(String domainCode) {
    this.domainCode = domainCode;
  }


  public ScimUser isAdministrator(Boolean isAdministrator) {
    this.isAdministrator = isAdministrator;
    return this;
  }

   /**
   * Get isAdministrator
   * @return isAdministrator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ADMINISTRATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAdministrator() {
    return isAdministrator;
  }


  @JsonProperty(JSON_PROPERTY_IS_ADMINISTRATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAdministrator(Boolean isAdministrator) {
    this.isAdministrator = isAdministrator;
  }


  public ScimUser tenant(String tenant) {
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenant() {
    return tenant;
  }


  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenant(String tenant) {
    this.tenant = tenant;
  }


  /**
   * Return true if this ScimUser object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimUser scimUser = (ScimUser) o;
    return Objects.equals(this.id, scimUser.id) &&
        Objects.equals(this.userName, scimUser.userName) &&
        Objects.equals(this.name, scimUser.name) &&
        Objects.equals(this.userType, scimUser.userType) &&
        Objects.equals(this.active, scimUser.active) &&
        Objects.equals(this.phoneNumbers, scimUser.phoneNumbers) &&
        Objects.equals(this.emails, scimUser.emails) &&
        Objects.equals(this.photos, scimUser.photos) &&
        Objects.equals(this.domainCode, scimUser.domainCode) &&
        Objects.equals(this.isAdministrator, scimUser.isAdministrator) &&
        Objects.equals(this.tenant, scimUser.tenant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, name, userType, active, phoneNumbers, emails, photos, domainCode, isAdministrator, tenant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    domainCode: ").append(toIndentedString(domainCode)).append("\n");
    sb.append("    isAdministrator: ").append(toIndentedString(isAdministrator)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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

