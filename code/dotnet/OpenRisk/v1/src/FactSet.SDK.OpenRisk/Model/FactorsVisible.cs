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
    /// Hide risk model factors in the response results; does not affect calculated data values
    /// </summary>
    [DataContract(Name = "FactorsVisible")]
    public partial class FactorsVisible : IEquatable<FactorsVisible>, IValidatableObject
    {
        /// <summary>
        /// Filter type
        /// </summary>
        /// <value>Filter type</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Whitelist for value: Whitelist
            /// </summary>
            [EnumMember(Value = "Whitelist")]
            Whitelist = 1,

            /// <summary>
            /// Enum Blacklist for value: Blacklist
            /// </summary>
            [EnumMember(Value = "Blacklist")]
            Blacklist = 2

        }


        /// <summary>
        /// Filter type
        /// </summary>
        /// <value>Filter type</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FactorsVisible" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FactorsVisible() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FactorsVisible" /> class.
        /// </summary>
        /// <param name="list">List of risk model factor IDs (required).</param>
        /// <param name="type">Filter type (required).</param>
        public FactorsVisible(List<string> list, TypeEnum type)
        {
            // to ensure "list" is required (not null)
            if (list == null) {
                throw new ArgumentNullException("list is a required property for FactorsVisible and cannot be null");
            }
            this.List = list;
            this.Type = type;
        }

        /// <summary>
        /// List of risk model factor IDs
        /// </summary>
        /// <value>List of risk model factor IDs</value>
        [DataMember(Name = "list", IsRequired = true, EmitDefaultValue = false)]
        public List<string> List { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FactorsVisible {\n");
            sb.Append("  List: ").Append(List).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as FactorsVisible);
        }

        /// <summary>
        /// Returns true if FactorsVisible instances are equal
        /// </summary>
        /// <param name="input">Instance of FactorsVisible to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FactorsVisible input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.List == input.List ||
                    this.List != null &&
                    input.List != null &&
                    this.List.SequenceEqual(input.List)
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
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
                if (this.List != null)
                {
                    hashCode = (hashCode * 59) + this.List.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
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
