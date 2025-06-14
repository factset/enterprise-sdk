/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
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
    /// AddTrimModelAnalytics
    /// </summary>
    [DataContract(Name = "AddTrimModelAnalytics")]
    public partial class AddTrimModelAnalytics : IEquatable<AddTrimModelAnalytics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AddTrimModelAnalytics" /> class.
        /// </summary>
        /// <param name="addDown">addDown.</param>
        /// <param name="addUp">addUp.</param>
        /// <param name="trimDown">trimDown.</param>
        /// <param name="trimUp">trimUp.</param>
        public AddTrimModelAnalytics(decimal addDown = default(decimal), decimal addUp = default(decimal), decimal trimDown = default(decimal), decimal trimUp = default(decimal))
        {
            this.AddDown = addDown;
            this.AddUp = addUp;
            this.TrimDown = trimDown;
            this.TrimUp = trimUp;
        }

        /// <summary>
        /// Gets or Sets AddDown
        /// </summary>
        [DataMember(Name = "addDown", EmitDefaultValue = false)]
        public decimal AddDown { get; set; }

        /// <summary>
        /// Gets or Sets AddUp
        /// </summary>
        [DataMember(Name = "addUp", EmitDefaultValue = false)]
        public decimal AddUp { get; set; }

        /// <summary>
        /// Gets or Sets TrimDown
        /// </summary>
        [DataMember(Name = "trimDown", EmitDefaultValue = false)]
        public decimal TrimDown { get; set; }

        /// <summary>
        /// Gets or Sets TrimUp
        /// </summary>
        [DataMember(Name = "trimUp", EmitDefaultValue = false)]
        public decimal TrimUp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AddTrimModelAnalytics {\n");
            sb.Append("  AddDown: ").Append(AddDown).Append("\n");
            sb.Append("  AddUp: ").Append(AddUp).Append("\n");
            sb.Append("  TrimDown: ").Append(TrimDown).Append("\n");
            sb.Append("  TrimUp: ").Append(TrimUp).Append("\n");
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
            return this.Equals(input as AddTrimModelAnalytics);
        }

        /// <summary>
        /// Returns true if AddTrimModelAnalytics instances are equal
        /// </summary>
        /// <param name="input">Instance of AddTrimModelAnalytics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AddTrimModelAnalytics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AddDown == input.AddDown ||
                    this.AddDown.Equals(input.AddDown)
                ) && 
                (
                    this.AddUp == input.AddUp ||
                    this.AddUp.Equals(input.AddUp)
                ) && 
                (
                    this.TrimDown == input.TrimDown ||
                    this.TrimDown.Equals(input.TrimDown)
                ) && 
                (
                    this.TrimUp == input.TrimUp ||
                    this.TrimUp.Equals(input.TrimUp)
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
                hashCode = (hashCode * 59) + this.AddDown.GetHashCode();
                hashCode = (hashCode * 59) + this.AddUp.GetHashCode();
                hashCode = (hashCode * 59) + this.TrimDown.GetHashCode();
                hashCode = (hashCode * 59) + this.TrimUp.GetHashCode();
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
