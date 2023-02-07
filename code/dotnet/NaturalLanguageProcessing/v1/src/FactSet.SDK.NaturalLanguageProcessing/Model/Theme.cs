/*
 * Natural Language Processing API
 *
 * APIs that leverage Natural Language Processing to help extract meaningful data from unstructured text
 *
 * The version of the OpenAPI document: 1.3.0
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
using OpenAPIDateConverter = FactSet.SDK.NaturalLanguageProcessing.Client.OpenAPIDateConverter;

namespace FactSet.SDK.NaturalLanguageProcessing.Model
{
    /// <summary>
    /// Theme
    /// </summary>
    [DataContract(Name = "Theme")]
    public partial class Theme : IEquatable<Theme>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Theme" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Theme() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Theme" /> class.
        /// </summary>
        /// <param name="themeText">Extracted theme text (required).</param>
        /// <param name="themeScore">Extracted theme score (required).</param>
        public Theme(string themeText, decimal themeScore)
        {
            // to ensure "themeText" is required (not null)
            if (themeText == null) {
                throw new ArgumentNullException("themeText is a required property for Theme and cannot be null");
            }
            this.ThemeText = themeText;
            this.ThemeScore = themeScore;
        }

        /// <summary>
        /// Extracted theme text
        /// </summary>
        /// <value>Extracted theme text</value>
        [DataMember(Name = "themeText", IsRequired = true, EmitDefaultValue = false)]
        public string ThemeText { get; set; }

        /// <summary>
        /// Extracted theme score
        /// </summary>
        /// <value>Extracted theme score</value>
        [DataMember(Name = "themeScore", IsRequired = true, EmitDefaultValue = false)]
        public decimal ThemeScore { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Theme {\n");
            sb.Append("  ThemeText: ").Append(ThemeText).Append("\n");
            sb.Append("  ThemeScore: ").Append(ThemeScore).Append("\n");
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
            return this.Equals(input as Theme);
        }

        /// <summary>
        /// Returns true if Theme instances are equal
        /// </summary>
        /// <param name="input">Instance of Theme to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Theme input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ThemeText == input.ThemeText ||
                    (this.ThemeText != null &&
                    this.ThemeText.Equals(input.ThemeText))
                ) && 
                (
                    this.ThemeScore == input.ThemeScore ||
                    this.ThemeScore.Equals(input.ThemeScore)
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
                if (this.ThemeText != null)
                {
                    hashCode = (hashCode * 59) + this.ThemeText.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ThemeScore.GetHashCode();
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
