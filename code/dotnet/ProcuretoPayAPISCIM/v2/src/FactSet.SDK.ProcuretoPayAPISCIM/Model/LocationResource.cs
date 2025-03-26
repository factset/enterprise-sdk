/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPayAPISCIM.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPayAPISCIM.Model
{
    /// <summary>
    /// LocationResource
    /// </summary>
    [DataContract(Name = "LocationResource")]
    public partial class LocationResource : IEquatable<LocationResource>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LocationResource" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LocationResource() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LocationResource" /> class.
        /// </summary>
        /// <param name="schemas">schemas.</param>
        /// <param name="externalId">An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters..</param>
        /// <param name="name">Name of the location. (required).</param>
        /// <param name="description">Description of the location..</param>
        /// <param name="address1">First line of location&#39;s address. (required).</param>
        /// <param name="address2">Second line of location&#39;s address..</param>
        /// <param name="address3">Third line of location&#39;s address..</param>
        /// <param name="locality">City of location. (required).</param>
        /// <param name="region">State or province of location..</param>
        /// <param name="postalCode">Postal code of location. (required).</param>
        /// <param name="country">Country of location. (required).</param>
        /// <param name="firmDescription">firmDescription (required).</param>
        /// <param name="emailDomains">The domain names that are valid for use with email addresses associated with users in this location..</param>
        /// <param name="partnerAssertedEntityId">Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API..</param>
        /// <param name="companyAgreementUrls">Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet..</param>
        /// <param name="managedLocations">Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements..</param>
        /// <param name="managingLocation">managingLocation.</param>
        /// <param name="mainLocation">mainLocation.</param>
        /// <param name="meta">meta.</param>
        public LocationResource(string name, string address1, string locality, string postalCode, string country, LocationResourceFirmDescription firmDescription,List<string> schemas = default(List<string>), string id = default(string), string externalId = default(string), string description = default(string), string address2 = default(string), string address3 = default(string), string region = default(string), string phoneNumber = default(string), List<string> emailDomains = default(List<string>), string partnerAssertedEntityId = default(string), List<LocationResourceCompanyAgreementUrl> companyAgreementUrls = default(List<LocationResourceCompanyAgreementUrl>), List<LocationResourceReference> managedLocations = default(List<LocationResourceReference>), LocationResourceManagingLocation managingLocation = default(LocationResourceManagingLocation), LocationResourceMainLocation mainLocation = default(LocationResourceMainLocation), List<string> usernames = default(List<string>), LocationResourceMeta meta = default(LocationResourceMeta))
        {
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for LocationResource and cannot be null");
            }
            this.Name = name;
            // to ensure "address1" is required (not null)
            if (address1 == null) {
                throw new ArgumentNullException("address1 is a required property for LocationResource and cannot be null");
            }
            this.Address1 = address1;
            // to ensure "locality" is required (not null)
            if (locality == null) {
                throw new ArgumentNullException("locality is a required property for LocationResource and cannot be null");
            }
            this.Locality = locality;
            // to ensure "postalCode" is required (not null)
            if (postalCode == null) {
                throw new ArgumentNullException("postalCode is a required property for LocationResource and cannot be null");
            }
            this.PostalCode = postalCode;
            // to ensure "country" is required (not null)
            if (country == null) {
                throw new ArgumentNullException("country is a required property for LocationResource and cannot be null");
            }
            this.Country = country;
            // to ensure "firmDescription" is required (not null)
            if (firmDescription == null) {
                throw new ArgumentNullException("firmDescription is a required property for LocationResource and cannot be null");
            }
            this.FirmDescription = firmDescription;
            this.Schemas = schemas;
            this.ExternalId = externalId;
            this.Description = description;
            this.Address2 = address2;
            this.Address3 = address3;
            this.Region = region;
            this.EmailDomains = emailDomains;
            this.PartnerAssertedEntityId = partnerAssertedEntityId;
            this.CompanyAgreementUrls = companyAgreementUrls;
            this.ManagedLocations = managedLocations;
            this.ManagingLocation = managingLocation;
            this.MainLocation = mainLocation;
            this.Meta = meta;
        }

        /// <summary>
        /// Gets or Sets Schemas
        /// </summary>
        [DataMember(Name = "schemas", EmitDefaultValue = false)]
        public List<string> Schemas { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; private set; }

        /// <summary>
        /// Returns false as Id should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeId()
        {
            return false;
        }
        /// <summary>
        /// An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters.
        /// </summary>
        /// <value>An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters.</value>
        [DataMember(Name = "externalId", EmitDefaultValue = false)]
        public string ExternalId { get; set; }

        /// <summary>
        /// Name of the location.
        /// </summary>
        /// <value>Name of the location.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Description of the location.
        /// </summary>
        /// <value>Description of the location.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// First line of location&#39;s address.
        /// </summary>
        /// <value>First line of location&#39;s address.</value>
        [DataMember(Name = "address1", IsRequired = true, EmitDefaultValue = false)]
        public string Address1 { get; set; }

        /// <summary>
        /// Second line of location&#39;s address.
        /// </summary>
        /// <value>Second line of location&#39;s address.</value>
        [DataMember(Name = "address2", EmitDefaultValue = false)]
        public string Address2 { get; set; }

        /// <summary>
        /// Third line of location&#39;s address.
        /// </summary>
        /// <value>Third line of location&#39;s address.</value>
        [DataMember(Name = "address3", EmitDefaultValue = false)]
        public string Address3 { get; set; }

        /// <summary>
        /// City of location.
        /// </summary>
        /// <value>City of location.</value>
        [DataMember(Name = "locality", IsRequired = true, EmitDefaultValue = false)]
        public string Locality { get; set; }

        /// <summary>
        /// State or province of location.
        /// </summary>
        /// <value>State or province of location.</value>
        [DataMember(Name = "region", EmitDefaultValue = false)]
        public string Region { get; set; }

        /// <summary>
        /// Postal code of location.
        /// </summary>
        /// <value>Postal code of location.</value>
        [DataMember(Name = "postalCode", IsRequired = true, EmitDefaultValue = false)]
        public string PostalCode { get; set; }

        /// <summary>
        /// Country of location.
        /// </summary>
        /// <value>Country of location.</value>
        [DataMember(Name = "country", IsRequired = true, EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// Phone number of location.
        /// </summary>
        /// <value>Phone number of location.</value>
        [DataMember(Name = "phoneNumber", EmitDefaultValue = false)]
        public string PhoneNumber { get; private set; }

        /// <summary>
        /// Returns false as PhoneNumber should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializePhoneNumber()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets FirmDescription
        /// </summary>
        [DataMember(Name = "firmDescription", IsRequired = true, EmitDefaultValue = false)]
        public LocationResourceFirmDescription FirmDescription { get; set; }

        /// <summary>
        /// The domain names that are valid for use with email addresses associated with users in this location.
        /// </summary>
        /// <value>The domain names that are valid for use with email addresses associated with users in this location.</value>
        [DataMember(Name = "emailDomains", EmitDefaultValue = false)]
        public List<string> EmailDomains { get; set; }

        /// <summary>
        /// Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API.
        /// </summary>
        /// <value>Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API.</value>
        [DataMember(Name = "partnerAssertedEntityId", EmitDefaultValue = false)]
        public string PartnerAssertedEntityId { get; set; }

        /// <summary>
        /// Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet.
        /// </summary>
        /// <value>Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet.</value>
        [DataMember(Name = "companyAgreementUrls", EmitDefaultValue = false)]
        public List<LocationResourceCompanyAgreementUrl> CompanyAgreementUrls { get; set; }

        /// <summary>
        /// Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements.
        /// </summary>
        /// <value>Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements.</value>
        [DataMember(Name = "managedLocations", EmitDefaultValue = false)]
        public List<LocationResourceReference> ManagedLocations { get; set; }

        /// <summary>
        /// Gets or Sets ManagingLocation
        /// </summary>
        [DataMember(Name = "managingLocation", EmitDefaultValue = false)]
        public LocationResourceManagingLocation ManagingLocation { get; set; }

        /// <summary>
        /// Gets or Sets MainLocation
        /// </summary>
        [DataMember(Name = "mainLocation", EmitDefaultValue = false)]
        public LocationResourceMainLocation MainLocation { get; set; }

        /// <summary>
        /// The FactSet usernames that are valid for users in this location.
        /// </summary>
        /// <value>The FactSet usernames that are valid for users in this location.</value>
        [DataMember(Name = "usernames", EmitDefaultValue = false)]
        public List<string> Usernames { get; private set; }

        /// <summary>
        /// Returns false as Usernames should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeUsernames()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", EmitDefaultValue = false)]
        public LocationResourceMeta Meta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LocationResource {\n");
            sb.Append("  Schemas: ").Append(Schemas).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ExternalId: ").Append(ExternalId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Address1: ").Append(Address1).Append("\n");
            sb.Append("  Address2: ").Append(Address2).Append("\n");
            sb.Append("  Address3: ").Append(Address3).Append("\n");
            sb.Append("  Locality: ").Append(Locality).Append("\n");
            sb.Append("  Region: ").Append(Region).Append("\n");
            sb.Append("  PostalCode: ").Append(PostalCode).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
            sb.Append("  FirmDescription: ").Append(FirmDescription).Append("\n");
            sb.Append("  EmailDomains: ").Append(EmailDomains).Append("\n");
            sb.Append("  PartnerAssertedEntityId: ").Append(PartnerAssertedEntityId).Append("\n");
            sb.Append("  CompanyAgreementUrls: ").Append(CompanyAgreementUrls).Append("\n");
            sb.Append("  ManagedLocations: ").Append(ManagedLocations).Append("\n");
            sb.Append("  ManagingLocation: ").Append(ManagingLocation).Append("\n");
            sb.Append("  MainLocation: ").Append(MainLocation).Append("\n");
            sb.Append("  Usernames: ").Append(Usernames).Append("\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as LocationResource);
        }

        /// <summary>
        /// Returns true if LocationResource instances are equal
        /// </summary>
        /// <param name="input">Instance of LocationResource to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LocationResource input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Schemas == input.Schemas ||
                    this.Schemas != null &&
                    input.Schemas != null &&
                    this.Schemas.SequenceEqual(input.Schemas)
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ExternalId == input.ExternalId ||
                    (this.ExternalId != null &&
                    this.ExternalId.Equals(input.ExternalId))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Address1 == input.Address1 ||
                    (this.Address1 != null &&
                    this.Address1.Equals(input.Address1))
                ) && 
                (
                    this.Address2 == input.Address2 ||
                    (this.Address2 != null &&
                    this.Address2.Equals(input.Address2))
                ) && 
                (
                    this.Address3 == input.Address3 ||
                    (this.Address3 != null &&
                    this.Address3.Equals(input.Address3))
                ) && 
                (
                    this.Locality == input.Locality ||
                    (this.Locality != null &&
                    this.Locality.Equals(input.Locality))
                ) && 
                (
                    this.Region == input.Region ||
                    (this.Region != null &&
                    this.Region.Equals(input.Region))
                ) && 
                (
                    this.PostalCode == input.PostalCode ||
                    (this.PostalCode != null &&
                    this.PostalCode.Equals(input.PostalCode))
                ) && 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.PhoneNumber == input.PhoneNumber ||
                    (this.PhoneNumber != null &&
                    this.PhoneNumber.Equals(input.PhoneNumber))
                ) && 
                (
                    this.FirmDescription == input.FirmDescription ||
                    (this.FirmDescription != null &&
                    this.FirmDescription.Equals(input.FirmDescription))
                ) && 
                (
                    this.EmailDomains == input.EmailDomains ||
                    this.EmailDomains != null &&
                    input.EmailDomains != null &&
                    this.EmailDomains.SequenceEqual(input.EmailDomains)
                ) && 
                (
                    this.PartnerAssertedEntityId == input.PartnerAssertedEntityId ||
                    (this.PartnerAssertedEntityId != null &&
                    this.PartnerAssertedEntityId.Equals(input.PartnerAssertedEntityId))
                ) && 
                (
                    this.CompanyAgreementUrls == input.CompanyAgreementUrls ||
                    this.CompanyAgreementUrls != null &&
                    input.CompanyAgreementUrls != null &&
                    this.CompanyAgreementUrls.SequenceEqual(input.CompanyAgreementUrls)
                ) && 
                (
                    this.ManagedLocations == input.ManagedLocations ||
                    this.ManagedLocations != null &&
                    input.ManagedLocations != null &&
                    this.ManagedLocations.SequenceEqual(input.ManagedLocations)
                ) && 
                (
                    this.ManagingLocation == input.ManagingLocation ||
                    (this.ManagingLocation != null &&
                    this.ManagingLocation.Equals(input.ManagingLocation))
                ) && 
                (
                    this.MainLocation == input.MainLocation ||
                    (this.MainLocation != null &&
                    this.MainLocation.Equals(input.MainLocation))
                ) && 
                (
                    this.Usernames == input.Usernames ||
                    this.Usernames != null &&
                    input.Usernames != null &&
                    this.Usernames.SequenceEqual(input.Usernames)
                ) && 
                (
                    this.Meta == input.Meta ||
                    (this.Meta != null &&
                    this.Meta.Equals(input.Meta))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Schemas != null)
                {
                    hashCode = (hashCode * 59) + this.Schemas.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.ExternalId != null)
                {
                    hashCode = (hashCode * 59) + this.ExternalId.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.Address1 != null)
                {
                    hashCode = (hashCode * 59) + this.Address1.GetHashCode();
                }
                if (this.Address2 != null)
                {
                    hashCode = (hashCode * 59) + this.Address2.GetHashCode();
                }
                if (this.Address3 != null)
                {
                    hashCode = (hashCode * 59) + this.Address3.GetHashCode();
                }
                if (this.Locality != null)
                {
                    hashCode = (hashCode * 59) + this.Locality.GetHashCode();
                }
                if (this.Region != null)
                {
                    hashCode = (hashCode * 59) + this.Region.GetHashCode();
                }
                if (this.PostalCode != null)
                {
                    hashCode = (hashCode * 59) + this.PostalCode.GetHashCode();
                }
                if (this.Country != null)
                {
                    hashCode = (hashCode * 59) + this.Country.GetHashCode();
                }
                if (this.PhoneNumber != null)
                {
                    hashCode = (hashCode * 59) + this.PhoneNumber.GetHashCode();
                }
                if (this.FirmDescription != null)
                {
                    hashCode = (hashCode * 59) + this.FirmDescription.GetHashCode();
                }
                if (this.EmailDomains != null)
                {
                    hashCode = (hashCode * 59) + this.EmailDomains.GetHashCode();
                }
                if (this.PartnerAssertedEntityId != null)
                {
                    hashCode = (hashCode * 59) + this.PartnerAssertedEntityId.GetHashCode();
                }
                if (this.CompanyAgreementUrls != null)
                {
                    hashCode = (hashCode * 59) + this.CompanyAgreementUrls.GetHashCode();
                }
                if (this.ManagedLocations != null)
                {
                    hashCode = (hashCode * 59) + this.ManagedLocations.GetHashCode();
                }
                if (this.ManagingLocation != null)
                {
                    hashCode = (hashCode * 59) + this.ManagingLocation.GetHashCode();
                }
                if (this.MainLocation != null)
                {
                    hashCode = (hashCode * 59) + this.MainLocation.GetHashCode();
                }
                if (this.Usernames != null)
                {
                    hashCode = (hashCode * 59) + this.Usernames.GetHashCode();
                }
                if (this.Meta != null)
                {
                    hashCode = (hashCode * 59) + this.Meta.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
