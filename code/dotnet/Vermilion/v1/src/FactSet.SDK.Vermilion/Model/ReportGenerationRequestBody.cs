/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
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
using OpenAPIDateConverter = FactSet.SDK.Vermilion.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Vermilion.Model
{
    /// <summary>
    /// Defines the request body for generating a report, encapsulating various generation parameters.
    /// </summary>
    [DataContract(Name = "ReportGenerationRequestBody")]
    public partial class ReportGenerationRequestBody : IEquatable<ReportGenerationRequestBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportGenerationRequestBody" /> class.
        /// </summary>
        /// <param name="vrs">Contains report generation requests..</param>
        public ReportGenerationRequestBody(Dictionary<string, ReportGenerationRequest> vrs = default(Dictionary<string, ReportGenerationRequest>))
        {
            this.Vrs = vrs;
        }

        /// <summary>
        /// Contains report generation requests.
        /// </summary>
        /// <value>Contains report generation requests.</value>
        [DataMember(Name = "vrs", EmitDefaultValue = false)]
        public Dictionary<string, ReportGenerationRequest> Vrs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReportGenerationRequestBody {\n");
            sb.Append("  Vrs: ").Append(Vrs).Append("\n");
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
            return this.Equals(input as ReportGenerationRequestBody);
        }

        /// <summary>
        /// Returns true if ReportGenerationRequestBody instances are equal
        /// </summary>
        /// <param name="input">Instance of ReportGenerationRequestBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReportGenerationRequestBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Vrs == input.Vrs ||
                    this.Vrs != null &&
                    input.Vrs != null &&
                    this.Vrs.SequenceEqual(input.Vrs)
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
                if (this.Vrs != null)
                {
                    hashCode = (hashCode * 59) + this.Vrs.GetHashCode();
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
