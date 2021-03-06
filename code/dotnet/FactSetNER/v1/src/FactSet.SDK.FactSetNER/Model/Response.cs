/*
 * NER API
 *
 * Extract named entities and their FactSet entity IDs from given document text.
 *
 * The version of the OpenAPI document: 1.5.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetNER.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetNER.Model
{
    /// <summary>
    /// Response
    /// </summary>
    [DataContract(Name = "Response")]
    public partial class Response : IEquatable<Response>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Response" /> class.
        /// </summary>
        /// <param name="namedEntity">namedEntity.</param>
        public Response(List<Tag> namedEntity = default(List<Tag>))
        {
            this.NamedEntity = namedEntity;
        }

        /// <summary>
        /// Gets or Sets NamedEntity
        /// </summary>
        [DataMember(Name = "namedEntity", EmitDefaultValue = false)]
        public List<Tag> NamedEntity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Response {\n");
            sb.Append("  NamedEntity: ").Append(NamedEntity).Append("\n");
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
            return this.Equals(input as Response);
        }

        /// <summary>
        /// Returns true if Response instances are equal
        /// </summary>
        /// <param name="input">Instance of Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Response input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NamedEntity == input.NamedEntity ||
                    this.NamedEntity != null &&
                    input.NamedEntity != null &&
                    this.NamedEntity.SequenceEqual(input.NamedEntity)
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
                if (this.NamedEntity != null)
                {
                    hashCode = (hashCode * 59) + this.NamedEntity.GetHashCode();
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
