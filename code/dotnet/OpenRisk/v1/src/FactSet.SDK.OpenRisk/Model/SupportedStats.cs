/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
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
    /// Contains all available base risk statistics. In the event &#39;data&#39; property is empty, no stats are available at all.
    /// </summary>
    [DataContract(Name = "SupportedStats")]
    public partial class SupportedStats : IEquatable<SupportedStats>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SupportedStats" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SupportedStats() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SupportedStats" /> class.
        /// </summary>
        /// <param name="data">All available base risk statistics (required).</param>
        public SupportedStats(Dictionary<string, SupportedStatDetails> data)
        {
            // to ensure "data" is required (not null)
            if (data == null) {
                throw new ArgumentNullException("data is a required property for SupportedStats and cannot be null");
            }
            this.Data = data;
        }

        /// <summary>
        /// All available base risk statistics
        /// </summary>
        /// <value>All available base risk statistics</value>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = false)]
        public Dictionary<string, SupportedStatDetails> Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SupportedStats {\n");
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
            return this.Equals(input as SupportedStats);
        }

        /// <summary>
        /// Returns true if SupportedStats instances are equal
        /// </summary>
        /// <param name="input">Instance of SupportedStats to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SupportedStats input)
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
