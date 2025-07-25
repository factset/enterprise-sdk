/*
 * FactSet Supply Chain API
 *
 * Access the complex networks of key customer, suppliers, competitors and partners so that you can make insightful investment decisions. Relationship information is sourced from trusted primary sources and reverse-linked to non-disclosing parties, creating a comprehensive and consistent relationship graph. <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetSupplyChain.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetSupplyChain.Model
{
    /// <summary>
    /// RelationshipsResponse
    /// </summary>
    [DataContract(Name = "relationshipsResponse")]
    public partial class RelationshipsResponse : IEquatable<RelationshipsResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RelationshipsResponse" /> class.
        /// </summary>
        /// <param name="data">Array of Supply Chain Relationships objects..</param>
        public RelationshipsResponse(List<Relationships> data = default(List<Relationships>))
        {
            this.Data = data;
        }

        /// <summary>
        /// Array of Supply Chain Relationships objects.
        /// </summary>
        /// <value>Array of Supply Chain Relationships objects.</value>
        [DataMember(Name = "data", EmitDefaultValue = false)]
        public List<Relationships> Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RelationshipsResponse {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as RelationshipsResponse);
        }

        /// <summary>
        /// Returns true if RelationshipsResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of RelationshipsResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RelationshipsResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Data == input.Data ||
                    this.Data != null &&
                    input.Data != null &&
                    this.Data.SequenceEqual(input.Data)
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
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
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
