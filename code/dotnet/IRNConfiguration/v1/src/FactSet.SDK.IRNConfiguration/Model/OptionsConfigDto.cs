/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
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
using OpenAPIDateConverter = FactSet.SDK.IRNConfiguration.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNConfiguration.Model
{
    /// <summary>
    /// OptionsConfigDto
    /// </summary>
    [DataContract(Name = "OptionsConfigDto")]
    public partial class OptionsConfigDto : IEquatable<OptionsConfigDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptionsConfigDto" /> class.
        /// </summary>
        /// <param name="multiSelectEnabled">multiSelectEnabled.</param>
        /// <param name="onTheFlyEnabled">onTheFlyEnabled.</param>
        /// <param name="options">options.</param>
        public OptionsConfigDto(bool multiSelectEnabled = default(bool), bool onTheFlyEnabled = default(bool), List<string> options = default(List<string>))
        {
            this.MultiSelectEnabled = multiSelectEnabled;
            this.OnTheFlyEnabled = onTheFlyEnabled;
            this.Options = options;
        }

        /// <summary>
        /// Gets or Sets MultiSelectEnabled
        /// </summary>
        [DataMember(Name = "multiSelectEnabled", EmitDefaultValue = true)]
        public bool MultiSelectEnabled { get; set; }

        /// <summary>
        /// Gets or Sets OnTheFlyEnabled
        /// </summary>
        [DataMember(Name = "onTheFlyEnabled", EmitDefaultValue = true)]
        public bool OnTheFlyEnabled { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name = "options", EmitDefaultValue = true)]
        public List<string> Options { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptionsConfigDto {\n");
            sb.Append("  MultiSelectEnabled: ").Append(MultiSelectEnabled).Append("\n");
            sb.Append("  OnTheFlyEnabled: ").Append(OnTheFlyEnabled).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
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
            return this.Equals(input as OptionsConfigDto);
        }

        /// <summary>
        /// Returns true if OptionsConfigDto instances are equal
        /// </summary>
        /// <param name="input">Instance of OptionsConfigDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptionsConfigDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.MultiSelectEnabled == input.MultiSelectEnabled ||
                    this.MultiSelectEnabled.Equals(input.MultiSelectEnabled)
                ) && 
                (
                    this.OnTheFlyEnabled == input.OnTheFlyEnabled ||
                    this.OnTheFlyEnabled.Equals(input.OnTheFlyEnabled)
                ) && 
                (
                    this.Options == input.Options ||
                    this.Options != null &&
                    input.Options != null &&
                    this.Options.SequenceEqual(input.Options)
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
                hashCode = (hashCode * 59) + this.MultiSelectEnabled.GetHashCode();
                hashCode = (hashCode * 59) + this.OnTheFlyEnabled.GetHashCode();
                if (this.Options != null)
                {
                    hashCode = (hashCode * 59) + this.Options.GetHashCode();
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
