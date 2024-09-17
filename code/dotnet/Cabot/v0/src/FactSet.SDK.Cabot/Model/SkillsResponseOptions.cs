/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
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
using OpenAPIDateConverter = FactSet.SDK.Cabot.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Cabot.Model
{
    /// <summary>
    /// SkillsResponseOptions
    /// </summary>
    [DataContract(Name = "SkillsResponseOptions")]
    public partial class SkillsResponseOptions : IEquatable<SkillsResponseOptions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SkillsResponseOptions" /> class.
        /// </summary>
        /// <param name="attribute">attribute.</param>
        /// <param name="highSkillValues">highSkillValues.</param>
        /// <param name="lowSkillValues">lowSkillValues.</param>
        /// <param name="skillValues">skillValues.</param>
        public SkillsResponseOptions(string attribute = default(string), SkillsModelAnalytics highSkillValues = default(SkillsModelAnalytics), SkillsModelAnalytics lowSkillValues = default(SkillsModelAnalytics), SkillsModelAnalytics skillValues = default(SkillsModelAnalytics))
        {
            this.Attribute = attribute;
            this.HighSkillValues = highSkillValues;
            this.LowSkillValues = lowSkillValues;
            this.SkillValues = skillValues;
        }

        /// <summary>
        /// Gets or Sets Attribute
        /// </summary>
        [DataMember(Name = "attribute", EmitDefaultValue = true)]
        public string Attribute { get; set; }

        /// <summary>
        /// Gets or Sets HighSkillValues
        /// </summary>
        [DataMember(Name = "highSkillValues", EmitDefaultValue = false)]
        public SkillsModelAnalytics HighSkillValues { get; set; }

        /// <summary>
        /// Gets or Sets LowSkillValues
        /// </summary>
        [DataMember(Name = "lowSkillValues", EmitDefaultValue = false)]
        public SkillsModelAnalytics LowSkillValues { get; set; }

        /// <summary>
        /// Gets or Sets SkillValues
        /// </summary>
        [DataMember(Name = "skillValues", EmitDefaultValue = false)]
        public SkillsModelAnalytics SkillValues { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SkillsResponseOptions {\n");
            sb.Append("  Attribute: ").Append(Attribute).Append("\n");
            sb.Append("  HighSkillValues: ").Append(HighSkillValues).Append("\n");
            sb.Append("  LowSkillValues: ").Append(LowSkillValues).Append("\n");
            sb.Append("  SkillValues: ").Append(SkillValues).Append("\n");
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
            return this.Equals(input as SkillsResponseOptions);
        }

        /// <summary>
        /// Returns true if SkillsResponseOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of SkillsResponseOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SkillsResponseOptions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Attribute == input.Attribute ||
                    (this.Attribute != null &&
                    this.Attribute.Equals(input.Attribute))
                ) && 
                (
                    this.HighSkillValues == input.HighSkillValues ||
                    (this.HighSkillValues != null &&
                    this.HighSkillValues.Equals(input.HighSkillValues))
                ) && 
                (
                    this.LowSkillValues == input.LowSkillValues ||
                    (this.LowSkillValues != null &&
                    this.LowSkillValues.Equals(input.LowSkillValues))
                ) && 
                (
                    this.SkillValues == input.SkillValues ||
                    (this.SkillValues != null &&
                    this.SkillValues.Equals(input.SkillValues))
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
                if (this.Attribute != null)
                {
                    hashCode = (hashCode * 59) + this.Attribute.GetHashCode();
                }
                if (this.HighSkillValues != null)
                {
                    hashCode = (hashCode * 59) + this.HighSkillValues.GetHashCode();
                }
                if (this.LowSkillValues != null)
                {
                    hashCode = (hashCode * 59) + this.LowSkillValues.GetHashCode();
                }
                if (this.SkillValues != null)
                {
                    hashCode = (hashCode * 59) + this.SkillValues.GetHashCode();
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
