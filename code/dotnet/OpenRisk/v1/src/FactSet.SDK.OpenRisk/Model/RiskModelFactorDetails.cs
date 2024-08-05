/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
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
using OpenAPIDateConverter = FactSet.SDK.OpenRisk.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenRisk.Model
{
    /// <summary>
    /// Details about a factor in a risk model
    /// </summary>
    [DataContract(Name = "RiskModelFactorDetails")]
    public partial class RiskModelFactorDetails : IEquatable<RiskModelFactorDetails>, IValidatableObject
    {
        /// <summary>
        /// Defintion of factor returns. &#x60;PercentChg&#x60; - Factor returns defined as percent change, which should be geometrically linked to calculate cumulative factor returns. &#x60;1stDiff&#x60; - Factor returns defined as level change. Cumulative returns should be defined as the sum of returns.
        /// </summary>
        /// <value>Defintion of factor returns. &#x60;PercentChg&#x60; - Factor returns defined as percent change, which should be geometrically linked to calculate cumulative factor returns. &#x60;1stDiff&#x60; - Factor returns defined as level change. Cumulative returns should be defined as the sum of returns.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DefinedAsEnum
        {
            /// <summary>
            /// Enum PercentChg for value: PercentChg
            /// </summary>
            [EnumMember(Value = "PercentChg")]
            PercentChg = 1,

            /// <summary>
            /// Enum _1stDiff for value: 1stDiff
            /// </summary>
            [EnumMember(Value = "1stDiff")]
            _1stDiff = 2

        }


        /// <summary>
        /// Defintion of factor returns. &#x60;PercentChg&#x60; - Factor returns defined as percent change, which should be geometrically linked to calculate cumulative factor returns. &#x60;1stDiff&#x60; - Factor returns defined as level change. Cumulative returns should be defined as the sum of returns.
        /// </summary>
        /// <value>Defintion of factor returns. &#x60;PercentChg&#x60; - Factor returns defined as percent change, which should be geometrically linked to calculate cumulative factor returns. &#x60;1stDiff&#x60; - Factor returns defined as level change. Cumulative returns should be defined as the sum of returns.</value>
        [DataMember(Name = "definedAs", IsRequired = true, EmitDefaultValue = false)]
        public DefinedAsEnum DefinedAs { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskModelFactorDetails" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RiskModelFactorDetails() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskModelFactorDetails" /> class.
        /// </summary>
        /// <param name="definedAs">Defintion of factor returns. &#x60;PercentChg&#x60; - Factor returns defined as percent change, which should be geometrically linked to calculate cumulative factor returns. &#x60;1stDiff&#x60; - Factor returns defined as level change. Cumulative returns should be defined as the sum of returns. (required).</param>
        /// <param name="id">Factor id (required).</param>
        /// <param name="name">Factor name (required).</param>
        public RiskModelFactorDetails(DefinedAsEnum definedAs, string id, string name)
        {
            this.DefinedAs = definedAs;
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for RiskModelFactorDetails and cannot be null");
            }
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for RiskModelFactorDetails and cannot be null");
            }
            this.Name = name;
        }

        /// <summary>
        /// Factor id
        /// </summary>
        /// <value>Factor id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Factor name
        /// </summary>
        /// <value>Factor name</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RiskModelFactorDetails {\n");
            sb.Append("  DefinedAs: ").Append(DefinedAs).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return this.Equals(input as RiskModelFactorDetails);
        }

        /// <summary>
        /// Returns true if RiskModelFactorDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of RiskModelFactorDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RiskModelFactorDetails input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DefinedAs == input.DefinedAs ||
                    this.DefinedAs.Equals(input.DefinedAs)
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
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
                hashCode = (hashCode * 59) + this.DefinedAs.GetHashCode();
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
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
            // Id (string) minLength
            if (this.Id != null && this.Id.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Id, length must be greater than 1.", new [] { "Id" });
            }

            // Name (string) minLength
            if (this.Name != null && this.Name.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Name, length must be greater than 1.", new [] { "Name" });
            }

            yield break;
        }
    }

}
