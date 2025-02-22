/*
 * PA Engine API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
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
using OpenAPIDateConverter = FactSet.SDK.PAEngine.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PAEngine.Model
{
    /// <summary>
    /// TemplateContentTypes
    /// </summary>
    [DataContract(Name = "TemplateContentTypes")]
    public partial class TemplateContentTypes : IEquatable<TemplateContentTypes>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateContentTypes" /> class.
        /// </summary>
        /// <param name="mandatory">Template mandatory fields.</param>
        /// <param name="optional">Template optional fields.</param>
        /// <param name="locked">Template locked fields.</param>
        public TemplateContentTypes(List<string> mandatory = default(List<string>), List<string> optional = default(List<string>), List<string> locked = default(List<string>))
        {
            this.Mandatory = mandatory;
            this.Optional = optional;
            this.Locked = locked;
        }

        /// <summary>
        /// Template mandatory fields
        /// </summary>
        /// <value>Template mandatory fields</value>
        [DataMember(Name = "mandatory", EmitDefaultValue = true)]
        public List<string> Mandatory { get; set; }

        /// <summary>
        /// Template optional fields
        /// </summary>
        /// <value>Template optional fields</value>
        [DataMember(Name = "optional", EmitDefaultValue = true)]
        public List<string> Optional { get; set; }

        /// <summary>
        /// Template locked fields
        /// </summary>
        /// <value>Template locked fields</value>
        [DataMember(Name = "locked", EmitDefaultValue = true)]
        public List<string> Locked { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TemplateContentTypes {\n");
            sb.Append("  Mandatory: ").Append(Mandatory).Append("\n");
            sb.Append("  Optional: ").Append(Optional).Append("\n");
            sb.Append("  Locked: ").Append(Locked).Append("\n");
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
            return this.Equals(input as TemplateContentTypes);
        }

        /// <summary>
        /// Returns true if TemplateContentTypes instances are equal
        /// </summary>
        /// <param name="input">Instance of TemplateContentTypes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TemplateContentTypes input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Mandatory == input.Mandatory ||
                    this.Mandatory != null &&
                    input.Mandatory != null &&
                    this.Mandatory.SequenceEqual(input.Mandatory)
                ) && 
                (
                    this.Optional == input.Optional ||
                    this.Optional != null &&
                    input.Optional != null &&
                    this.Optional.SequenceEqual(input.Optional)
                ) && 
                (
                    this.Locked == input.Locked ||
                    this.Locked != null &&
                    input.Locked != null &&
                    this.Locked.SequenceEqual(input.Locked)
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
                if (this.Mandatory != null)
                {
                    hashCode = (hashCode * 59) + this.Mandatory.GetHashCode();
                }
                if (this.Optional != null)
                {
                    hashCode = (hashCode * 59) + this.Optional.GetHashCode();
                }
                if (this.Locked != null)
                {
                    hashCode = (hashCode * 59) + this.Locked.GetHashCode();
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
