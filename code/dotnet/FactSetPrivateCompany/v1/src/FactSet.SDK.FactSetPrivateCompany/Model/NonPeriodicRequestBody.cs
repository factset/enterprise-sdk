/*
 * FactSet Private Company API
 *
 * FactSet Private Company API encompasses Private Company Financials and includes some Private Company non-periodic data. Additional Private Company firmographics can be found in the FactSet Entity API. <p><b>Rate limit is set to 10 requests per second and 10 concurrent requests per user</b>.</p> 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPrivateCompany.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPrivateCompany.Model
{
    /// <summary>
    /// Non periodic request body elements
    /// </summary>
    [DataContract(Name = "NonPeriodicRequestBody")]
    public partial class NonPeriodicRequestBody : IEquatable<NonPeriodicRequestBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NonPeriodicRequestBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NonPeriodicRequestBody() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="NonPeriodicRequestBody" /> class.
        /// </summary>
        /// <param name="ids">Security or Entity identifiers.  (required).</param>
        /// <param name="metrics">Private Company Non-Periodic Metrics.  (required).</param>
        public NonPeriodicRequestBody(List<string> ids, List<string> metrics)
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for NonPeriodicRequestBody and cannot be null");
            }
            this.Ids = ids;
            // to ensure "metrics" is required (not null)
            if (metrics == null) {
                throw new ArgumentNullException("metrics is a required property for NonPeriodicRequestBody and cannot be null");
            }
            this.Metrics = metrics;
        }

        /// <summary>
        /// Security or Entity identifiers. 
        /// </summary>
        /// <value>Security or Entity identifiers. </value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Private Company Non-Periodic Metrics. 
        /// </summary>
        /// <value>Private Company Non-Periodic Metrics. </value>
        [DataMember(Name = "metrics", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Metrics { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NonPeriodicRequestBody {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Metrics: ").Append(Metrics).Append("\n");
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
            return this.Equals(input as NonPeriodicRequestBody);
        }

        /// <summary>
        /// Returns true if NonPeriodicRequestBody instances are equal
        /// </summary>
        /// <param name="input">Instance of NonPeriodicRequestBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NonPeriodicRequestBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.Metrics == input.Metrics ||
                    this.Metrics != null &&
                    input.Metrics != null &&
                    this.Metrics.SequenceEqual(input.Metrics)
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
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
                }
                if (this.Metrics != null)
                {
                    hashCode = (hashCode * 59) + this.Metrics.GetHashCode();
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
