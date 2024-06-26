/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ProcuretoPayAPISCIM.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ProcuretoPayAPISCIM.models.FirmDescriptionResourceReference;
import com.factset.sdk.ProcuretoPayAPISCIM.models.LocationResourceCompanyAgreementUrls;
import com.factset.sdk.ProcuretoPayAPISCIM.models.LocationResourceMeta;
import com.factset.sdk.ProcuretoPayAPISCIM.models.LocationResourceReference;
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
import com.factset.sdk.ProcuretoPayAPISCIM.JSON;


/**
 * LocationResource
 */
@JsonPropertyOrder({
  LocationResource.JSON_PROPERTY_SCHEMAS,
  LocationResource.JSON_PROPERTY_ID,
  LocationResource.JSON_PROPERTY_EXTERNAL_ID,
  LocationResource.JSON_PROPERTY_NAME,
  LocationResource.JSON_PROPERTY_DESCRIPTION,
  LocationResource.JSON_PROPERTY_ADDRESS1,
  LocationResource.JSON_PROPERTY_ADDRESS2,
  LocationResource.JSON_PROPERTY_ADDRESS3,
  LocationResource.JSON_PROPERTY_LOCALITY,
  LocationResource.JSON_PROPERTY_REGION,
  LocationResource.JSON_PROPERTY_POSTAL_CODE,
  LocationResource.JSON_PROPERTY_COUNTRY,
  LocationResource.JSON_PROPERTY_PHONE_NUMBER,
  LocationResource.JSON_PROPERTY_FIRM_DESCRIPTION,
  LocationResource.JSON_PROPERTY_EMAIL_DOMAINS,
  LocationResource.JSON_PROPERTY_PARTNER_ASSERTED_ENTITY_ID,
  LocationResource.JSON_PROPERTY_COMPANY_AGREEMENT_URLS,
  LocationResource.JSON_PROPERTY_MANAGED_LOCATIONS,
  LocationResource.JSON_PROPERTY_MANAGING_LOCATION,
  LocationResource.JSON_PROPERTY_MAIN_LOCATION,
  LocationResource.JSON_PROPERTY_USERNAMES,
  LocationResource.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LocationResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private java.util.List<String> schemas = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ADDRESS1 = "address1";
  private String address1;

  public static final String JSON_PROPERTY_ADDRESS2 = "address2";
  private String address2;

  public static final String JSON_PROPERTY_ADDRESS3 = "address3";
  private String address3;

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private String locality;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_FIRM_DESCRIPTION = "firmDescription";
  private JsonNullable<FirmDescriptionResourceReference> firmDescription = JsonNullable.<FirmDescriptionResourceReference>undefined();

  public static final String JSON_PROPERTY_EMAIL_DOMAINS = "emailDomains";
  private java.util.List<String> emailDomains = null;

  public static final String JSON_PROPERTY_PARTNER_ASSERTED_ENTITY_ID = "partnerAssertedEntityId";
  private String partnerAssertedEntityId;

  public static final String JSON_PROPERTY_COMPANY_AGREEMENT_URLS = "companyAgreementUrls";
  private java.util.List<LocationResourceCompanyAgreementUrls> companyAgreementUrls = null;

  public static final String JSON_PROPERTY_MANAGED_LOCATIONS = "managedLocations";
  private java.util.List<LocationResourceReference> managedLocations = null;

  public static final String JSON_PROPERTY_MANAGING_LOCATION = "managingLocation";
  private JsonNullable<LocationResourceReference> managingLocation = JsonNullable.<LocationResourceReference>undefined();

  public static final String JSON_PROPERTY_MAIN_LOCATION = "mainLocation";
  private JsonNullable<LocationResourceReference> mainLocation = JsonNullable.<LocationResourceReference>undefined();

  public static final String JSON_PROPERTY_USERNAMES = "usernames";
  private java.util.List<String> usernames = null;

  public static final String JSON_PROPERTY_META = "meta";
  private LocationResourceMeta meta;

  public LocationResource() { 
  }

  @JsonCreator
  public LocationResource(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER) String phoneNumber, 
    @JsonProperty(JSON_PROPERTY_USERNAMES) java.util.List<String> usernames
  ) {
    this();
    this.id = id;
    this.phoneNumber = phoneNumber;
    this.usernames = usernames;
  }

  public LocationResource schemas(java.util.List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public LocationResource addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new java.util.ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"urn:scim:schemas:extension:FactSet:Core:1.0:Location\"]", value = "")
  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSchemas() {
    return schemas;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemas(java.util.List<String> schemas) {
    this.schemas = schemas;
  }


   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1598276", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public LocationResource externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * An identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. Note: for clients that are not FactSet partners, this identifier must be unique within the main location associated with the client&#39;s FactSet username.
   * @return externalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1598276", value = "An identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. Note: for clients that are not FactSet partners, this identifier must be unique within the main location associated with the client's FactSet username.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public LocationResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the location.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "FIN Wealth Management", required = true, value = "Name of the location.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public LocationResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the location.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Description of the location.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public LocationResource address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of location&#39;s address.
   * @return address1
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "601 Main Avenue", value = "First line of location's address.")
  @JsonProperty(JSON_PROPERTY_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress1() {
    return address1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public LocationResource address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of location&#39;s address.
   * @return address2
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Factset - First Floor", value = "Second line of location's address.")
  @JsonProperty(JSON_PROPERTY_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress2() {
    return address2;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public LocationResource address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Third line of location&#39;s address.
   * @return address3
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Third line of location's address.")
  @JsonProperty(JSON_PROPERTY_ADDRESS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress3() {
    return address3;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress3(String address3) {
    this.address3 = address3;
  }


  public LocationResource locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of location.
   * @return locality
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Norwalk", value = "City of location.")
  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocality() {
    return locality;
  }


  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocality(String locality) {
    this.locality = locality;
  }


  public LocationResource region(String region) {
    this.region = region;
    return this;
  }

   /**
   * State or province of location.
   * @return region
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Connecticut", value = "State or province of location.")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public LocationResource postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code of location.
   * @return postalCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "06850", value = "Postal code of location.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public LocationResource country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of location.
   * @return country
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "United States", value = "Country of location.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


   /**
   * Phone number of location.
   * @return phoneNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "(555) 123-4567", value = "Phone number of location.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }




  public LocationResource firmDescription(FirmDescriptionResourceReference firmDescription) {
    this.firmDescription = JsonNullable.<FirmDescriptionResourceReference>of(firmDescription);
    return this;
  }

   /**
   * Get firmDescription
   * @return firmDescription
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public FirmDescriptionResourceReference getFirmDescription() {
        return firmDescription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRM_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<FirmDescriptionResourceReference> getFirmDescription_JsonNullable() {
    return firmDescription;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRM_DESCRIPTION)
  public void setFirmDescription_JsonNullable(JsonNullable<FirmDescriptionResourceReference> firmDescription) {
    this.firmDescription = firmDescription;
  }

  public void setFirmDescription(FirmDescriptionResourceReference firmDescription) {
    this.firmDescription = JsonNullable.<FirmDescriptionResourceReference>of(firmDescription);
  }


  public LocationResource emailDomains(java.util.List<String> emailDomains) {
    this.emailDomains = emailDomains;
    return this;
  }

  public LocationResource addEmailDomainsItem(String emailDomainsItem) {
    if (this.emailDomains == null) {
      this.emailDomains = new java.util.ArrayList<>();
    }
    this.emailDomains.add(emailDomainsItem);
    return this;
  }

   /**
   * The domain names that are valid for use with email addresses associated with users in this location.
   * @return emailDomains
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"foo.com\"]", value = "The domain names that are valid for use with email addresses associated with users in this location.")
  @JsonProperty(JSON_PROPERTY_EMAIL_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getEmailDomains() {
    return emailDomains;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailDomains(java.util.List<String> emailDomains) {
    this.emailDomains = emailDomains;
  }


  public LocationResource partnerAssertedEntityId(String partnerAssertedEntityId) {
    this.partnerAssertedEntityId = partnerAssertedEntityId;
    return this;
  }

   /**
   * Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API.
   * @return partnerAssertedEntityId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier assigned to the Corporate Entity. Value is provided as \"fsymEntityId\" from FactSet's Symbology API.")
  @JsonProperty(JSON_PROPERTY_PARTNER_ASSERTED_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPartnerAssertedEntityId() {
    return partnerAssertedEntityId;
  }


  @JsonProperty(JSON_PROPERTY_PARTNER_ASSERTED_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartnerAssertedEntityId(String partnerAssertedEntityId) {
    this.partnerAssertedEntityId = partnerAssertedEntityId;
  }


  public LocationResource companyAgreementUrls(java.util.List<LocationResourceCompanyAgreementUrls> companyAgreementUrls) {
    this.companyAgreementUrls = companyAgreementUrls;
    return this;
  }

  public LocationResource addCompanyAgreementUrlsItem(LocationResourceCompanyAgreementUrls companyAgreementUrlsItem) {
    if (this.companyAgreementUrls == null) {
      this.companyAgreementUrls = new java.util.ArrayList<>();
    }
    this.companyAgreementUrls.add(companyAgreementUrlsItem);
    return this;
  }

   /**
   * Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet.
   * @return companyAgreementUrls
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet.")
  @JsonProperty(JSON_PROPERTY_COMPANY_AGREEMENT_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<LocationResourceCompanyAgreementUrls> getCompanyAgreementUrls() {
    return companyAgreementUrls;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_AGREEMENT_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyAgreementUrls(java.util.List<LocationResourceCompanyAgreementUrls> companyAgreementUrls) {
    this.companyAgreementUrls = companyAgreementUrls;
  }


  public LocationResource managedLocations(java.util.List<LocationResourceReference> managedLocations) {
    this.managedLocations = managedLocations;
    return this;
  }

  public LocationResource addManagedLocationsItem(LocationResourceReference managedLocationsItem) {
    if (this.managedLocations == null) {
      this.managedLocations = new java.util.ArrayList<>();
    }
    this.managedLocations.add(managedLocationsItem);
    return this;
  }

   /**
   * Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements.
   * @return managedLocations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements.")
  @JsonProperty(JSON_PROPERTY_MANAGED_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<LocationResourceReference> getManagedLocations() {
    return managedLocations;
  }


  @JsonProperty(JSON_PROPERTY_MANAGED_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagedLocations(java.util.List<LocationResourceReference> managedLocations) {
    this.managedLocations = managedLocations;
  }


  public LocationResource managingLocation(LocationResourceReference managingLocation) {
    this.managingLocation = JsonNullable.<LocationResourceReference>of(managingLocation);
    return this;
  }

   /**
   * FactSet location ID managing this location for a Research Entitlements Administrator and requesting location-based entitlements for all managed locations associated.
   * @return managingLocation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FactSet location ID managing this location for a Research Entitlements Administrator and requesting location-based entitlements for all managed locations associated.")
  @JsonIgnore

  public LocationResourceReference getManagingLocation() {
        return managingLocation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANAGING_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocationResourceReference> getManagingLocation_JsonNullable() {
    return managingLocation;
  }
  
  @JsonProperty(JSON_PROPERTY_MANAGING_LOCATION)
  public void setManagingLocation_JsonNullable(JsonNullable<LocationResourceReference> managingLocation) {
    this.managingLocation = managingLocation;
  }

  public void setManagingLocation(LocationResourceReference managingLocation) {
    this.managingLocation = JsonNullable.<LocationResourceReference>of(managingLocation);
  }


  public LocationResource mainLocation(LocationResourceReference mainLocation) {
    this.mainLocation = JsonNullable.<LocationResourceReference>of(mainLocation);
    return this;
  }

   /**
   * The managing or otherwise parent location associated with this location. All locations associated with the mainLocation are viewed as related and within the same business unit in FactSet&#39;s CRM systems.
   * @return mainLocation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The managing or otherwise parent location associated with this location. All locations associated with the mainLocation are viewed as related and within the same business unit in FactSet's CRM systems.")
  @JsonIgnore

  public LocationResourceReference getMainLocation() {
        return mainLocation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAIN_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocationResourceReference> getMainLocation_JsonNullable() {
    return mainLocation;
  }
  
  @JsonProperty(JSON_PROPERTY_MAIN_LOCATION)
  public void setMainLocation_JsonNullable(JsonNullable<LocationResourceReference> mainLocation) {
    this.mainLocation = mainLocation;
  }

  public void setMainLocation(LocationResourceReference mainLocation) {
    this.mainLocation = JsonNullable.<LocationResourceReference>of(mainLocation);
  }


   /**
   * The FactSet usernames that are valid for users in this location.
   * @return usernames
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"FOO\",\"BAR\"]", value = "The FactSet usernames that are valid for users in this location.")
  @JsonProperty(JSON_PROPERTY_USERNAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getUsernames() {
    return usernames;
  }




  public LocationResource meta(LocationResourceMeta meta) {
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

  public LocationResourceMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(LocationResourceMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this LocationResource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationResource locationResource = (LocationResource) o;
    return Objects.equals(this.schemas, locationResource.schemas) &&
        Objects.equals(this.id, locationResource.id) &&
        Objects.equals(this.externalId, locationResource.externalId) &&
        Objects.equals(this.name, locationResource.name) &&
        Objects.equals(this.description, locationResource.description) &&
        Objects.equals(this.address1, locationResource.address1) &&
        Objects.equals(this.address2, locationResource.address2) &&
        Objects.equals(this.address3, locationResource.address3) &&
        Objects.equals(this.locality, locationResource.locality) &&
        Objects.equals(this.region, locationResource.region) &&
        Objects.equals(this.postalCode, locationResource.postalCode) &&
        Objects.equals(this.country, locationResource.country) &&
        Objects.equals(this.phoneNumber, locationResource.phoneNumber) &&
        equalsNullable(this.firmDescription, locationResource.firmDescription) &&
        Objects.equals(this.emailDomains, locationResource.emailDomains) &&
        Objects.equals(this.partnerAssertedEntityId, locationResource.partnerAssertedEntityId) &&
        Objects.equals(this.companyAgreementUrls, locationResource.companyAgreementUrls) &&
        Objects.equals(this.managedLocations, locationResource.managedLocations) &&
        equalsNullable(this.managingLocation, locationResource.managingLocation) &&
        equalsNullable(this.mainLocation, locationResource.mainLocation) &&
        Objects.equals(this.usernames, locationResource.usernames) &&
        Objects.equals(this.meta, locationResource.meta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, externalId, name, description, address1, address2, address3, locality, region, postalCode, country, phoneNumber, hashCodeNullable(firmDescription), emailDomains, partnerAssertedEntityId, companyAgreementUrls, managedLocations, hashCodeNullable(managingLocation), hashCodeNullable(mainLocation), usernames, meta);
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
    sb.append("class LocationResource {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    firmDescription: ").append(toIndentedString(firmDescription)).append("\n");
    sb.append("    emailDomains: ").append(toIndentedString(emailDomains)).append("\n");
    sb.append("    partnerAssertedEntityId: ").append(toIndentedString(partnerAssertedEntityId)).append("\n");
    sb.append("    companyAgreementUrls: ").append(toIndentedString(companyAgreementUrls)).append("\n");
    sb.append("    managedLocations: ").append(toIndentedString(managedLocations)).append("\n");
    sb.append("    managingLocation: ").append(toIndentedString(managingLocation)).append("\n");
    sb.append("    mainLocation: ").append(toIndentedString(mainLocation)).append("\n");
    sb.append("    usernames: ").append(toIndentedString(usernames)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

