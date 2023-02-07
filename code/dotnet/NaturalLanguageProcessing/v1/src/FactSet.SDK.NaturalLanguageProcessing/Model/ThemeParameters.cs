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
    /// ThemeParameters
    /// </summary>
    [DataContract(Name = "ThemeParameters")]
    public partial class ThemeParameters : IEquatable<ThemeParameters>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ThemeParameters" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ThemeParameters() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ThemeParameters" /> class.
        /// </summary>
        /// <param name="text">Text from which themes will be extracted (required).</param>
        public ThemeParameters(string text)
        {
            // to ensure "text" is required (not null)
            if (text == null) {
                throw new ArgumentNullException("text is a required property for ThemeParameters and cannot be null");
            }
            this.Text = text;
        }

        /// <summary>
        /// Text from which themes will be extracted
        /// </summary>
        /// <value>Text from which themes will be extracted</value>
        [DataMember(Name = "text", IsRequired = true, EmitDefaultValue = false)]
        public string Text { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ThemeParameters {\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
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
            return this.Equals(input as ThemeParameters);
        }

        /// <summary>
        /// Returns true if ThemeParameters instances are equal
        /// </summary>
        /// <param name="input">Instance of ThemeParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ThemeParameters input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Text == input.Text ||
                    (this.Text != null &&
                    this.Text.Equals(input.Text))
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
                if (this.Text != null)
                {
                    hashCode = (hashCode * 59) + this.Text.GetHashCode();
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
