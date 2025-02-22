/*
 * FactSet Overview Report Builder API
 *
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.OverviewReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OverviewReportBuilder.Model
{
    /// <summary>
    /// An object containing basic information about the peer of the queried company
    /// </summary>
    [DataContract(Name = "PeerListItem")]
    public partial class PeerListItem : IEquatable<PeerListItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PeerListItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PeerListItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PeerListItem" /> class.
        /// </summary>
        /// <param name="id">The FactSet Entity ID of the peer (required).</param>
        /// <param name="name">The name of the peer (required).</param>
        /// <param name="ticker">The ticker of the peer (required).</param>
        public PeerListItem(string id, string name, string ticker)
        {
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for PeerListItem and cannot be null");
            }
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for PeerListItem and cannot be null");
            }
            this.Name = name;
            // to ensure "ticker" is required (not null)
            if (ticker == null) {
                throw new ArgumentNullException("ticker is a required property for PeerListItem and cannot be null");
            }
            this.Ticker = ticker;
        }

        /// <summary>
        /// The FactSet Entity ID of the peer
        /// </summary>
        /// <value>The FactSet Entity ID of the peer</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// The name of the peer
        /// </summary>
        /// <value>The name of the peer</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The ticker of the peer
        /// </summary>
        /// <value>The ticker of the peer</value>
        [DataMember(Name = "ticker", IsRequired = true, EmitDefaultValue = false)]
        public string Ticker { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PeerListItem {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
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
            return this.Equals(input as PeerListItem);
        }

        /// <summary>
        /// Returns true if PeerListItem instances are equal
        /// </summary>
        /// <param name="input">Instance of PeerListItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PeerListItem input)
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
                    this.Ticker == input.Ticker ||
                    (this.Ticker != null &&
                    this.Ticker.Equals(input.Ticker))
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
                if (this.Ticker != null)
                {
                    hashCode = (hashCode * 59) + this.Ticker.GetHashCode();
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
