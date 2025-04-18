/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNContacts.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNContacts.models.AlternativeEmailAddressDto;
import com.factset.sdk.IRNContacts.models.ContactCustomFieldValueDto;
import com.factset.sdk.IRNContacts.models.ContactRoleDto;
import com.factset.sdk.IRNContacts.models.ContactTypeDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IRNContacts.JSON;


/**
 * ContactSummaryDto
 */
@JsonPropertyOrder({
  ContactSummaryDto.JSON_PROPERTY_ID,
  ContactSummaryDto.JSON_PROPERTY_IRN_PERSON_ID,
  ContactSummaryDto.JSON_PROPERTY_PRIMARY_EMAIL_ADDRESS,
  ContactSummaryDto.JSON_PROPERTY_IDENTIFIER,
  ContactSummaryDto.JSON_PROPERTY_FULL_NAME,
  ContactSummaryDto.JSON_PROPERTY_EMPLOYER_NAME,
  ContactSummaryDto.JSON_PROPERTY_EMPLOYER_IDENTIFIER,
  ContactSummaryDto.JSON_PROPERTY_CITY,
  ContactSummaryDto.JSON_PROPERTY_STATE_PROVINCE,
  ContactSummaryDto.JSON_PROPERTY_POSTAL_CODE,
  ContactSummaryDto.JSON_PROPERTY_COUNTRY,
  ContactSummaryDto.JSON_PROPERTY_ROLE,
  ContactSummaryDto.JSON_PROPERTY_TYPE,
  ContactSummaryDto.JSON_PROPERTY_IS_DELETED,
  ContactSummaryDto.JSON_PROPERTY_LAST_MEETING,
  ContactSummaryDto.JSON_PROPERTY_ALTERNATIVE_EMAIL_ADDRESSES,
  ContactSummaryDto.JSON_PROPERTY_CUSTOM_FIELD_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ContactSummaryDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_IRN_PERSON_ID = "irnPersonId";
  private JsonNullable<String> irnPersonId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIMARY_EMAIL_ADDRESS = "primaryEmailAddress";
  private JsonNullable<String> primaryEmailAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private JsonNullable<String> identifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private JsonNullable<String> fullName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMPLOYER_NAME = "employerName";
  private JsonNullable<String> employerName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMPLOYER_IDENTIFIER = "employerIdentifier";
  private JsonNullable<String> employerIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CITY = "city";
  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE_PROVINCE = "stateProvince";
  private JsonNullable<String> stateProvince = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private JsonNullable<String> postalCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private JsonNullable<String> country = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROLE = "role";
  private JsonNullable<ContactRoleDto> role = JsonNullable.<ContactRoleDto>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<ContactTypeDto> type = JsonNullable.<ContactTypeDto>undefined();

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_LAST_MEETING = "lastMeeting";
  private JsonNullable<String> lastMeeting = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ALTERNATIVE_EMAIL_ADDRESSES = "alternativeEmailAddresses";
  private JsonNullable<java.util.List<AlternativeEmailAddressDto>> alternativeEmailAddresses = JsonNullable.<java.util.List<AlternativeEmailAddressDto>>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FIELD_VALUES = "customFieldValues";
  private JsonNullable<java.util.List<ContactCustomFieldValueDto>> customFieldValues = JsonNullable.<java.util.List<ContactCustomFieldValueDto>>undefined();

  public ContactSummaryDto() { 
  }

  public ContactSummaryDto id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * A guid that identifies the contact for further interactions
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A guid that identifies the contact for further interactions")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  public ContactSummaryDto irnPersonId(String irnPersonId) {
    this.irnPersonId = JsonNullable.<String>of(irnPersonId);
    return this;
  }

   /**
   * A Unique ticker with suffix -x that identifies the contact, which can be used in identifier lookup to tag the contact
   * @return irnPersonId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A Unique ticker with suffix -x that identifies the contact, which can be used in identifier lookup to tag the contact")
  @JsonIgnore

  public String getIrnPersonId() {
        return irnPersonId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IRN_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIrnPersonId_JsonNullable() {
    return irnPersonId;
  }
  
  @JsonProperty(JSON_PROPERTY_IRN_PERSON_ID)
  public void setIrnPersonId_JsonNullable(JsonNullable<String> irnPersonId) {
    this.irnPersonId = irnPersonId;
  }

  public void setIrnPersonId(String irnPersonId) {
    this.irnPersonId = JsonNullable.<String>of(irnPersonId);
  }


  public ContactSummaryDto primaryEmailAddress(String primaryEmailAddress) {
    this.primaryEmailAddress = JsonNullable.<String>of(primaryEmailAddress);
    return this;
  }

   /**
   * Get primaryEmailAddress
   * @return primaryEmailAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getPrimaryEmailAddress() {
        return primaryEmailAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrimaryEmailAddress_JsonNullable() {
    return primaryEmailAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_EMAIL_ADDRESS)
  public void setPrimaryEmailAddress_JsonNullable(JsonNullable<String> primaryEmailAddress) {
    this.primaryEmailAddress = primaryEmailAddress;
  }

  public void setPrimaryEmailAddress(String primaryEmailAddress) {
    this.primaryEmailAddress = JsonNullable.<String>of(primaryEmailAddress);
  }


  public ContactSummaryDto identifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getIdentifier() {
        return identifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdentifier_JsonNullable() {
    return identifier;
  }
  
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  public void setIdentifier_JsonNullable(JsonNullable<String> identifier) {
    this.identifier = identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
  }


  public ContactSummaryDto fullName(String fullName) {
    this.fullName = JsonNullable.<String>of(fullName);
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFullName() {
        return fullName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFullName_JsonNullable() {
    return fullName;
  }
  
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  public void setFullName_JsonNullable(JsonNullable<String> fullName) {
    this.fullName = fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = JsonNullable.<String>of(fullName);
  }


  public ContactSummaryDto employerName(String employerName) {
    this.employerName = JsonNullable.<String>of(employerName);
    return this;
  }

   /**
   * Get employerName
   * @return employerName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getEmployerName() {
        return employerName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMPLOYER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmployerName_JsonNullable() {
    return employerName;
  }
  
  @JsonProperty(JSON_PROPERTY_EMPLOYER_NAME)
  public void setEmployerName_JsonNullable(JsonNullable<String> employerName) {
    this.employerName = employerName;
  }

  public void setEmployerName(String employerName) {
    this.employerName = JsonNullable.<String>of(employerName);
  }


  public ContactSummaryDto employerIdentifier(String employerIdentifier) {
    this.employerIdentifier = JsonNullable.<String>of(employerIdentifier);
    return this;
  }

   /**
   * Get employerIdentifier
   * @return employerIdentifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getEmployerIdentifier() {
        return employerIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMPLOYER_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmployerIdentifier_JsonNullable() {
    return employerIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_EMPLOYER_IDENTIFIER)
  public void setEmployerIdentifier_JsonNullable(JsonNullable<String> employerIdentifier) {
    this.employerIdentifier = employerIdentifier;
  }

  public void setEmployerIdentifier(String employerIdentifier) {
    this.employerIdentifier = JsonNullable.<String>of(employerIdentifier);
  }


  public ContactSummaryDto city(String city) {
    this.city = JsonNullable.<String>of(city);
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCity() {
        return city.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCity_JsonNullable() {
    return city;
  }
  
  @JsonProperty(JSON_PROPERTY_CITY)
  public void setCity_JsonNullable(JsonNullable<String> city) {
    this.city = city;
  }

  public void setCity(String city) {
    this.city = JsonNullable.<String>of(city);
  }


  public ContactSummaryDto stateProvince(String stateProvince) {
    this.stateProvince = JsonNullable.<String>of(stateProvince);
    return this;
  }

   /**
   * Get stateProvince
   * @return stateProvince
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getStateProvince() {
        return stateProvince.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStateProvince_JsonNullable() {
    return stateProvince;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE_PROVINCE)
  public void setStateProvince_JsonNullable(JsonNullable<String> stateProvince) {
    this.stateProvince = stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = JsonNullable.<String>of(stateProvince);
  }


  public ContactSummaryDto postalCode(String postalCode) {
    this.postalCode = JsonNullable.<String>of(postalCode);
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getPostalCode() {
        return postalCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPostalCode_JsonNullable() {
    return postalCode;
  }
  
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  public void setPostalCode_JsonNullable(JsonNullable<String> postalCode) {
    this.postalCode = postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = JsonNullable.<String>of(postalCode);
  }


  public ContactSummaryDto country(String country) {
    this.country = JsonNullable.<String>of(country);
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCountry() {
        return country.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCountry_JsonNullable() {
    return country;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  public void setCountry_JsonNullable(JsonNullable<String> country) {
    this.country = country;
  }

  public void setCountry(String country) {
    this.country = JsonNullable.<String>of(country);
  }


  public ContactSummaryDto role(ContactRoleDto role) {
    this.role = JsonNullable.<ContactRoleDto>of(role);
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public ContactRoleDto getRole() {
        return role.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ContactRoleDto> getRole_JsonNullable() {
    return role;
  }
  
  @JsonProperty(JSON_PROPERTY_ROLE)
  public void setRole_JsonNullable(JsonNullable<ContactRoleDto> role) {
    this.role = role;
  }

  public void setRole(ContactRoleDto role) {
    this.role = JsonNullable.<ContactRoleDto>of(role);
  }


  public ContactSummaryDto type(ContactTypeDto type) {
    this.type = JsonNullable.<ContactTypeDto>of(type);
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public ContactTypeDto getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ContactTypeDto> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<ContactTypeDto> type) {
    this.type = type;
  }

  public void setType(ContactTypeDto type) {
    this.type = JsonNullable.<ContactTypeDto>of(type);
  }


  public ContactSummaryDto isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ContactSummaryDto lastMeeting(String lastMeeting) {
    this.lastMeeting = JsonNullable.<String>of(lastMeeting);
    return this;
  }

   /**
   * Get lastMeeting
   * @return lastMeeting
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getLastMeeting() {
        return lastMeeting.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_MEETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastMeeting_JsonNullable() {
    return lastMeeting;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_MEETING)
  public void setLastMeeting_JsonNullable(JsonNullable<String> lastMeeting) {
    this.lastMeeting = lastMeeting;
  }

  public void setLastMeeting(String lastMeeting) {
    this.lastMeeting = JsonNullable.<String>of(lastMeeting);
  }


  public ContactSummaryDto alternativeEmailAddresses(java.util.List<AlternativeEmailAddressDto> alternativeEmailAddresses) {
    this.alternativeEmailAddresses = JsonNullable.<java.util.List<AlternativeEmailAddressDto>>of(alternativeEmailAddresses);
    return this;
  }

  public ContactSummaryDto addAlternativeEmailAddressesItem(AlternativeEmailAddressDto alternativeEmailAddressesItem) {
    if (this.alternativeEmailAddresses == null || !this.alternativeEmailAddresses.isPresent()) {
      this.alternativeEmailAddresses = JsonNullable.<java.util.List<AlternativeEmailAddressDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.alternativeEmailAddresses.get().add(alternativeEmailAddressesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get alternativeEmailAddresses
   * @return alternativeEmailAddresses
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<AlternativeEmailAddressDto> getAlternativeEmailAddresses() {
        return alternativeEmailAddresses.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_EMAIL_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<AlternativeEmailAddressDto>> getAlternativeEmailAddresses_JsonNullable() {
    return alternativeEmailAddresses;
  }
  
  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_EMAIL_ADDRESSES)
  public void setAlternativeEmailAddresses_JsonNullable(JsonNullable<java.util.List<AlternativeEmailAddressDto>> alternativeEmailAddresses) {
    this.alternativeEmailAddresses = alternativeEmailAddresses;
  }

  public void setAlternativeEmailAddresses(java.util.List<AlternativeEmailAddressDto> alternativeEmailAddresses) {
    this.alternativeEmailAddresses = JsonNullable.<java.util.List<AlternativeEmailAddressDto>>of(alternativeEmailAddresses);
  }


  public ContactSummaryDto customFieldValues(java.util.List<ContactCustomFieldValueDto> customFieldValues) {
    this.customFieldValues = JsonNullable.<java.util.List<ContactCustomFieldValueDto>>of(customFieldValues);
    return this;
  }

  public ContactSummaryDto addCustomFieldValuesItem(ContactCustomFieldValueDto customFieldValuesItem) {
    if (this.customFieldValues == null || !this.customFieldValues.isPresent()) {
      this.customFieldValues = JsonNullable.<java.util.List<ContactCustomFieldValueDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.customFieldValues.get().add(customFieldValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customFieldValues
   * @return customFieldValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<ContactCustomFieldValueDto> getCustomFieldValues() {
        return customFieldValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<ContactCustomFieldValueDto>> getCustomFieldValues_JsonNullable() {
    return customFieldValues;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_VALUES)
  public void setCustomFieldValues_JsonNullable(JsonNullable<java.util.List<ContactCustomFieldValueDto>> customFieldValues) {
    this.customFieldValues = customFieldValues;
  }

  public void setCustomFieldValues(java.util.List<ContactCustomFieldValueDto> customFieldValues) {
    this.customFieldValues = JsonNullable.<java.util.List<ContactCustomFieldValueDto>>of(customFieldValues);
  }


  /**
   * Return true if this ContactSummaryDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactSummaryDto contactSummaryDto = (ContactSummaryDto) o;
    return Objects.equals(this.id, contactSummaryDto.id) &&
        equalsNullable(this.irnPersonId, contactSummaryDto.irnPersonId) &&
        equalsNullable(this.primaryEmailAddress, contactSummaryDto.primaryEmailAddress) &&
        equalsNullable(this.identifier, contactSummaryDto.identifier) &&
        equalsNullable(this.fullName, contactSummaryDto.fullName) &&
        equalsNullable(this.employerName, contactSummaryDto.employerName) &&
        equalsNullable(this.employerIdentifier, contactSummaryDto.employerIdentifier) &&
        equalsNullable(this.city, contactSummaryDto.city) &&
        equalsNullable(this.stateProvince, contactSummaryDto.stateProvince) &&
        equalsNullable(this.postalCode, contactSummaryDto.postalCode) &&
        equalsNullable(this.country, contactSummaryDto.country) &&
        equalsNullable(this.role, contactSummaryDto.role) &&
        equalsNullable(this.type, contactSummaryDto.type) &&
        Objects.equals(this.isDeleted, contactSummaryDto.isDeleted) &&
        equalsNullable(this.lastMeeting, contactSummaryDto.lastMeeting) &&
        equalsNullable(this.alternativeEmailAddresses, contactSummaryDto.alternativeEmailAddresses) &&
        equalsNullable(this.customFieldValues, contactSummaryDto.customFieldValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(irnPersonId), hashCodeNullable(primaryEmailAddress), hashCodeNullable(identifier), hashCodeNullable(fullName), hashCodeNullable(employerName), hashCodeNullable(employerIdentifier), hashCodeNullable(city), hashCodeNullable(stateProvince), hashCodeNullable(postalCode), hashCodeNullable(country), hashCodeNullable(role), hashCodeNullable(type), isDeleted, hashCodeNullable(lastMeeting), hashCodeNullable(alternativeEmailAddresses), hashCodeNullable(customFieldValues));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactSummaryDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    irnPersonId: ").append(toIndentedString(irnPersonId)).append("\n");
    sb.append("    primaryEmailAddress: ").append(toIndentedString(primaryEmailAddress)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
    sb.append("    employerIdentifier: ").append(toIndentedString(employerIdentifier)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    lastMeeting: ").append(toIndentedString(lastMeeting)).append("\n");
    sb.append("    alternativeEmailAddresses: ").append(toIndentedString(alternativeEmailAddresses)).append("\n");
    sb.append("    customFieldValues: ").append(toIndentedString(customFieldValues)).append("\n");
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

