/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.4.0
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
    /// A list of federation resources returned as a response to a query.
    /// </summary>
    [DataContract(Name = "FederationResourceList")]
    public partial class FederationResourceList : IEquatable<FederationResourceList>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FederationResourceList" /> class.
        /// </summary>
        /// <param name="schemas">An array containing the standard schema URI used for SCIM query responses..</param>
        /// <param name="totalResults">The total number of federation resources returned as a response to a query..</param>
        /// <param name="resources">The federation resources returned as a response to a query..</param>
        public FederationResourceList(List<string> schemas = default(List<string>), int totalResults = default(int), List<FederationResource> resources = default(List<FederationResource>))
        {
            this.Schemas = schemas;
            this.TotalResults = totalResults;
            this.Resources = resources;
        }

        /// <summary>
        /// An array containing the standard schema URI used for SCIM query responses.
        /// </summary>
        /// <value>An array containing the standard schema URI used for SCIM query responses.</value>
        [DataMember(Name = "schemas", EmitDefaultValue = false)]
        public List<string> Schemas { get; set; }

        /// <summary>
        /// The total number of federation resources returned as a response to a query.
        /// </summary>
        /// <value>The total number of federation resources returned as a response to a query.</value>
        [DataMember(Name = "totalResults", EmitDefaultValue = false)]
        public int TotalResults { get; set; }

        /// <summary>
        /// The federation resources returned as a response to a query.
        /// </summary>
        /// <value>The federation resources returned as a response to a query.</value>
        [DataMember(Name = "Resources", EmitDefaultValue = false)]
        public List<FederationResource> Resources { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FederationResourceList {\n");
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
            return this.Equals(input as FederationResourceList);
        }

        /// <summary>
        /// Returns true if FederationResourceList instances are equal
        /// </summary>
        /// <param name="input">Instance of FederationResourceList to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FederationResourceList input)
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
