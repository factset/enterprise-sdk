/*
 * ModelAccounts API
 *
 * Allow clients to fetch ModelAccounts Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.3.0
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
using OpenAPIDateConverter = FactSet.SDK.Portfolio.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Portfolio.Model
{
    /// <summary>
    /// ModelAccountFields
    /// </summary>
    [DataContract(Name = "ModelAccountFields")]
    public partial class ModelAccountFields : IEquatable<ModelAccountFields>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelAccountFields" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModelAccountFields() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelAccountFields" /> class.
        /// </summary>
        /// <param name="iterative">iterative (required).</param>
        /// <param name="nonIterative">nonIterative.</param>
        /// <param name="additionalFields">additionalFields.</param>
        public ModelAccountFields(Dictionary<string, Dictionary<string, Dictionary<string, string>>> iterative,Dictionary<string, Dictionary<string, string>> nonIterative = default(Dictionary<string, Dictionary<string, string>>), List<ModelAccountAdditionalField> additionalFields = default(List<ModelAccountAdditionalField>))
        {
            // to ensure "iterative" is required (not null)
            if (iterative == null) {
                throw new ArgumentNullException("iterative is a required property for ModelAccountFields and cannot be null");
            }
            this.Iterative = iterative;
            this.NonIterative = nonIterative;
            this.AdditionalFields = additionalFields;
        }

        /// <summary>
        /// Gets or Sets Iterative
        /// </summary>
        [DataMember(Name = "iterative", IsRequired = true, EmitDefaultValue = false)]
        public Dictionary<string, Dictionary<string, Dictionary<string, string>>> Iterative { get; set; }

        /// <summary>
        /// Gets or Sets NonIterative
        /// </summary>
        [DataMember(Name = "nonIterative", EmitDefaultValue = true)]
        public Dictionary<string, Dictionary<string, string>> NonIterative { get; set; }

        /// <summary>
        /// Gets or Sets AdditionalFields
        /// </summary>
        [DataMember(Name = "additionalFields", EmitDefaultValue = true)]
        public List<ModelAccountAdditionalField> AdditionalFields { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModelAccountFields {\n");
            sb.Append("  Iterative: ").Append(Iterative).Append("\n");
            sb.Append("  NonIterative: ").Append(NonIterative).Append("\n");
            sb.Append("  AdditionalFields: ").Append(AdditionalFields).Append("\n");
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
            return this.Equals(input as ModelAccountFields);
        }

        /// <summary>
        /// Returns true if ModelAccountFields instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelAccountFields to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelAccountFields input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Iterative == input.Iterative ||
                    this.Iterative != null &&
                    input.Iterative != null &&
                    this.Iterative.SequenceEqual(input.Iterative)
                ) && 
                (
                    this.NonIterative == input.NonIterative ||
                    this.NonIterative != null &&
                    input.NonIterative != null &&
                    this.NonIterative.SequenceEqual(input.NonIterative)
                ) && 
                (
                    this.AdditionalFields == input.AdditionalFields ||
                    this.AdditionalFields != null &&
                    input.AdditionalFields != null &&
                    this.AdditionalFields.SequenceEqual(input.AdditionalFields)
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
                if (this.Iterative != null)
                {
                    hashCode = (hashCode * 59) + this.Iterative.GetHashCode();
                }
                if (this.NonIterative != null)
                {
                    hashCode = (hashCode * 59) + this.NonIterative.GetHashCode();
                }
                if (this.AdditionalFields != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalFields.GetHashCode();
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
