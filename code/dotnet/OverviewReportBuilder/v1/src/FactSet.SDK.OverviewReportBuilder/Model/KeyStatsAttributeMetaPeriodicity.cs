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
    /// KeyStatsAttributeMetaPeriodicity
    /// </summary>
    [DataContract(Name = "KeyStatsAttributeMeta_periodicity")]
    public partial class KeyStatsAttributeMetaPeriodicity : IEquatable<KeyStatsAttributeMetaPeriodicity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KeyStatsAttributeMetaPeriodicity" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KeyStatsAttributeMetaPeriodicity() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="KeyStatsAttributeMetaPeriodicity" /> class.
        /// </summary>
        /// <param name="value">value (required).</param>
        public KeyStatsAttributeMetaPeriodicity(string value)
        {
            // to ensure "value" is required (not null)
            if (value == null) {
                throw new ArgumentNullException("value is a required property for KeyStatsAttributeMetaPeriodicity and cannot be null");
            }
            this.Value = value;
        }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = true)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class KeyStatsAttributeMetaPeriodicity {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as KeyStatsAttributeMetaPeriodicity);
        }

        /// <summary>
        /// Returns true if KeyStatsAttributeMetaPeriodicity instances are equal
        /// </summary>
        /// <param name="input">Instance of KeyStatsAttributeMetaPeriodicity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KeyStatsAttributeMetaPeriodicity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
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
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
