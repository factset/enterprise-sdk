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
    /// Risk statistic calculation result
    /// </summary>
    [DataContract(Name = "StatResult")]
    public partial class StatResult : IEquatable<StatResult>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name = "level", IsRequired = true, EmitDefaultValue = false)]
        public StatCalculationLevel Level { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="StatResult" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected StatResult() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="StatResult" /> class.
        /// </summary>
        /// <param name="stat">Name of the stat (required).</param>
        /// <param name="level">level (required).</param>
        /// <param name="settings">settings.</param>
        /// <param name="value">value.</param>
        /// <param name="error">error.</param>
        public StatResult(string stat, StatCalculationLevel level,StatCalculationSettings settings = default(StatCalculationSettings), StatResultValue value = default(StatResultValue), ErrorItem error = default(ErrorItem))
        {
            // to ensure "stat" is required (not null)
            if (stat == null) {
                throw new ArgumentNullException("stat is a required property for StatResult and cannot be null");
            }
            this.Stat = stat;
            this.Level = level;
            this.Settings = settings;
            this.Value = value;
            this.Error = error;
        }

        /// <summary>
        /// Name of the stat
        /// </summary>
        /// <value>Name of the stat</value>
        [DataMember(Name = "stat", IsRequired = true, EmitDefaultValue = false)]
        public string Stat { get; set; }

        /// <summary>
        /// Gets or Sets Settings
        /// </summary>
        [DataMember(Name = "settings", EmitDefaultValue = false)]
        public StatCalculationSettings Settings { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public StatResultValue Value { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public ErrorItem Error { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StatResult {\n");
            sb.Append("  Stat: ").Append(Stat).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  Settings: ").Append(Settings).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
            return this.Equals(input as StatResult);
        }

        /// <summary>
        /// Returns true if StatResult instances are equal
        /// </summary>
        /// <param name="input">Instance of StatResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatResult input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Stat == input.Stat ||
                    (this.Stat != null &&
                    this.Stat.Equals(input.Stat))
                ) && 
                (
                    this.Level == input.Level ||
                    this.Level.Equals(input.Level)
                ) && 
                (
                    this.Settings == input.Settings ||
                    (this.Settings != null &&
                    this.Settings.Equals(input.Settings))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
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
                if (this.Stat != null)
                {
                    hashCode = (hashCode * 59) + this.Stat.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Level.GetHashCode();
                if (this.Settings != null)
                {
                    hashCode = (hashCode * 59) + this.Settings.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
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
            // Stat (string) minLength
            if (this.Stat != null && this.Stat.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Stat, length must be greater than 1.", new [] { "Stat" });
            }

            yield break;
        }
    }

}
