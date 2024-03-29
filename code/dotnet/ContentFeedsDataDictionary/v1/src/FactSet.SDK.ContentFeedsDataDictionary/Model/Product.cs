/*
 * CTS Data Dictionary API
 *
 * An API for interacting with CTS Data Dictionary.
 *
 * The version of the OpenAPI document: 0.2
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
using OpenAPIDateConverter = FactSet.SDK.ContentFeedsDataDictionary.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ContentFeedsDataDictionary.Model
{
    /// <summary>
    /// Product
    /// </summary>
    [DataContract(Name = "Product")]
    public partial class Product : IEquatable<Product>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Product" /> class.
        /// </summary>
        /// <param name="id">Unique identifier for the product.</param>
        /// <param name="name">Name of the product.</param>
        /// <param name="ofmLink">URL to the product page on the Open:FactSet Marketplace.</param>
        /// <param name="ofmProductId">The id defining a product in the Open:FactSet Marketplace.</param>
        /// <param name="entitled">Flag indicating if the user is entitled to access the data in their subscriptions.</param>
        /// <param name="providerName">Name of the Data Provider for the product.</param>
        /// <param name="dataFeed">Flag indicating if this product is available in a data feed.</param>
        /// <param name="api">Flag indicating if this product is available in an api.</param>
        /// <param name="referenceDataFeed">Flag indicating if this product is maintained by RDF/UCF.</param>
        public Product(string id = default(string), string name = default(string), string ofmLink = default(string), string ofmProductId = default(string), bool entitled = default(bool), string providerName = default(string), bool dataFeed = default(bool), bool api = default(bool), bool referenceDataFeed = default(bool))
        {
            this.Id = id;
            this.Name = name;
            this.OfmLink = ofmLink;
            this.OfmProductId = ofmProductId;
            this.Entitled = entitled;
            this.ProviderName = providerName;
            this.DataFeed = dataFeed;
            this.Api = api;
            this.ReferenceDataFeed = referenceDataFeed;
        }

        /// <summary>
        /// Unique identifier for the product
        /// </summary>
        /// <value>Unique identifier for the product</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Name of the product
        /// </summary>
        /// <value>Name of the product</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// URL to the product page on the Open:FactSet Marketplace
        /// </summary>
        /// <value>URL to the product page on the Open:FactSet Marketplace</value>
        [DataMember(Name = "ofmLink", EmitDefaultValue = false)]
        public string OfmLink { get; set; }

        /// <summary>
        /// The id defining a product in the Open:FactSet Marketplace
        /// </summary>
        /// <value>The id defining a product in the Open:FactSet Marketplace</value>
        [DataMember(Name = "ofmProductId", EmitDefaultValue = false)]
        public string OfmProductId { get; set; }

        /// <summary>
        /// Flag indicating if the user is entitled to access the data in their subscriptions
        /// </summary>
        /// <value>Flag indicating if the user is entitled to access the data in their subscriptions</value>
        [DataMember(Name = "entitled", EmitDefaultValue = true)]
        public bool Entitled { get; set; }

        /// <summary>
        /// Name of the Data Provider for the product
        /// </summary>
        /// <value>Name of the Data Provider for the product</value>
        [DataMember(Name = "providerName", EmitDefaultValue = false)]
        public string ProviderName { get; set; }

        /// <summary>
        /// Flag indicating if this product is available in a data feed
        /// </summary>
        /// <value>Flag indicating if this product is available in a data feed</value>
        [DataMember(Name = "dataFeed", EmitDefaultValue = true)]
        public bool DataFeed { get; set; }

        /// <summary>
        /// Flag indicating if this product is available in an api
        /// </summary>
        /// <value>Flag indicating if this product is available in an api</value>
        [DataMember(Name = "api", EmitDefaultValue = true)]
        public bool Api { get; set; }

        /// <summary>
        /// Flag indicating if this product is maintained by RDF/UCF
        /// </summary>
        /// <value>Flag indicating if this product is maintained by RDF/UCF</value>
        [DataMember(Name = "referenceDataFeed", EmitDefaultValue = true)]
        public bool ReferenceDataFeed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Product {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  OfmLink: ").Append(OfmLink).Append("\n");
            sb.Append("  OfmProductId: ").Append(OfmProductId).Append("\n");
            sb.Append("  Entitled: ").Append(Entitled).Append("\n");
            sb.Append("  ProviderName: ").Append(ProviderName).Append("\n");
            sb.Append("  DataFeed: ").Append(DataFeed).Append("\n");
            sb.Append("  Api: ").Append(Api).Append("\n");
            sb.Append("  ReferenceDataFeed: ").Append(ReferenceDataFeed).Append("\n");
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
            return this.Equals(input as Product);
        }

        /// <summary>
        /// Returns true if Product instances are equal
        /// </summary>
        /// <param name="input">Instance of Product to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Product input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.OfmLink == input.OfmLink ||
                    (this.OfmLink != null &&
                    this.OfmLink.Equals(input.OfmLink))
                ) && 
                (
                    this.OfmProductId == input.OfmProductId ||
                    (this.OfmProductId != null &&
                    this.OfmProductId.Equals(input.OfmProductId))
                ) && 
                (
                    this.Entitled == input.Entitled ||
                    this.Entitled.Equals(input.Entitled)
                ) && 
                (
                    this.ProviderName == input.ProviderName ||
                    (this.ProviderName != null &&
                    this.ProviderName.Equals(input.ProviderName))
                ) && 
                (
                    this.DataFeed == input.DataFeed ||
                    this.DataFeed.Equals(input.DataFeed)
                ) && 
                (
                    this.Api == input.Api ||
                    this.Api.Equals(input.Api)
                ) && 
                (
                    this.ReferenceDataFeed == input.ReferenceDataFeed ||
                    this.ReferenceDataFeed.Equals(input.ReferenceDataFeed)
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.OfmLink != null)
                {
                    hashCode = (hashCode * 59) + this.OfmLink.GetHashCode();
                }
                if (this.OfmProductId != null)
                {
                    hashCode = (hashCode * 59) + this.OfmProductId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Entitled.GetHashCode();
                if (this.ProviderName != null)
                {
                    hashCode = (hashCode * 59) + this.ProviderName.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.DataFeed.GetHashCode();
                hashCode = (hashCode * 59) + this.Api.GetHashCode();
                hashCode = (hashCode * 59) + this.ReferenceDataFeed.GetHashCode();
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
