/*
 * AI Text Summarization
 *
 * AI Text Summarization
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.AITextSummarization.Client.OpenAPIDateConverter;

namespace FactSet.SDK.AITextSummarization.Model
{
    /// <summary>
    /// SuccessResponse
    /// </summary>
    [DataContract(Name = "SuccessResponse")]
    public partial class SuccessResponse : IEquatable<SuccessResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SuccessResponse" /> class.
        /// </summary>
        /// <param name="headline">A short headline generated for the input text..</param>
        /// <param name="summary">The generated summary for the input text..</param>
        public SuccessResponse(string headline = default(string), string summary = default(string))
        {
            this.Headline = headline;
            this.Summary = summary;
        }

        /// <summary>
        /// A short headline generated for the input text.
        /// </summary>
        /// <value>A short headline generated for the input text.</value>
        [DataMember(Name = "headline", EmitDefaultValue = false)]
        public string Headline { get; set; }

        /// <summary>
        /// The generated summary for the input text.
        /// </summary>
        /// <value>The generated summary for the input text.</value>
        [DataMember(Name = "summary", EmitDefaultValue = false)]
        public string Summary { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SuccessResponse {\n");
            sb.Append("  Headline: ").Append(Headline).Append("\n");
            sb.Append("  Summary: ").Append(Summary).Append("\n");
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
            return this.Equals(input as SuccessResponse);
        }

        /// <summary>
        /// Returns true if SuccessResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of SuccessResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SuccessResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Headline == input.Headline ||
                    (this.Headline != null &&
                    this.Headline.Equals(input.Headline))
                ) && 
                (
                    this.Summary == input.Summary ||
                    (this.Summary != null &&
                    this.Summary.Equals(input.Summary))
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
                if (this.Headline != null)
                {
                    hashCode = (hashCode * 59) + this.Headline.GetHashCode();
                }
                if (this.Summary != null)
                {
                    hashCode = (hashCode * 59) + this.Summary.GetHashCode();
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