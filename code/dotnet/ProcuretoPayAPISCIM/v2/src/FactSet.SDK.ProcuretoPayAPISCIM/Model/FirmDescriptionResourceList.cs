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
    /// FirmDescriptionResourceList
    /// </summary>
    [DataContract(Name = "FirmDescriptionResourceList")]
    public partial class FirmDescriptionResourceList : IEquatable<FirmDescriptionResourceList>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FirmDescriptionResourceList" /> class.
        /// </summary>
        /// <param name="schemas">schemas.</param>
        /// <param name="totalResults">totalResults.</param>
        /// <param name="resources">resources.</param>
        public FirmDescriptionResourceList(List<string> schemas = default(List<string>), int totalResults = default(int), List<FirmDescriptionResource> resources = default(List<FirmDescriptionResource>))
        {
            this.Schemas = schemas;
            this.TotalResults = totalResults;
            this.Resources = resources;
        }

        /// <summary>
        /// Gets or Sets Schemas
        /// </summary>
        [DataMember(Name = "schemas", EmitDefaultValue = false)]
        public List<string> Schemas { get; set; }

        /// <summary>
        /// Gets or Sets TotalResults
        /// </summary>
        [DataMember(Name = "totalResults", EmitDefaultValue = false)]
        public int TotalResults { get; set; }

        /// <summary>
        /// Gets or Sets Resources
        /// </summary>
        [DataMember(Name = "Resources", EmitDefaultValue = false)]
        public List<FirmDescriptionResource> Resources { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FirmDescriptionResourceList {\n");
            sb.Append("  Schemas: ").Append(Schemas).Append("\n");
            sb.Append("  TotalResults: ").Append(TotalResults).Append("\n");
            sb.Append("  Resources: ").Append(Resources).Append("\n");
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
            return this.Equals(input as FirmDescriptionResourceList);
        }

        /// <summary>
        /// Returns true if FirmDescriptionResourceList instances are equal
        /// </summary>
        /// <param name="input">Instance of FirmDescriptionResourceList to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FirmDescriptionResourceList input)
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
                    this.TotalResults == input.TotalResults ||
                    this.TotalResults.Equals(input.TotalResults)
                ) && 
                (
                    this.Resources == input.Resources ||
                    this.Resources != null &&
                    input.Resources != null &&
                    this.Resources.SequenceEqual(input.Resources)
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
                hashCode = (hashCode * 59) + this.TotalResults.GetHashCode();
                if (this.Resources != null)
                {
                    hashCode = (hashCode * 59) + this.Resources.GetHashCode();
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
