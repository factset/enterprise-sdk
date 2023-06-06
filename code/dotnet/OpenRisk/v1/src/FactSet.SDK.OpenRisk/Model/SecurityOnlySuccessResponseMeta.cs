/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
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
    /// The &#39;meta&#39; object in HTTP 200 success responses
    /// </summary>
    [DataContract(Name = "SecurityOnlySuccessResponseMeta")]
    public partial class SecurityOnlySuccessResponseMeta : IEquatable<SecurityOnlySuccessResponseMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityOnlySuccessResponseMeta" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SecurityOnlySuccessResponseMeta() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityOnlySuccessResponseMeta" /> class.
        /// </summary>
        /// <param name="labels">labels (required).</param>
        /// <param name="resolvedDates">resolvedDates (required).</param>
        /// <param name="warnings">warnings.</param>
        public SecurityOnlySuccessResponseMeta(SecurityOnlyLabels labels, ResolvedDates resolvedDates,List<WarningItem> warnings = default(List<WarningItem>))
        {
            // to ensure "labels" is required (not null)
            if (labels == null) {
                throw new ArgumentNullException("labels is a required property for SecurityOnlySuccessResponseMeta and cannot be null");
            }
            this.Labels = labels;
            // to ensure "resolvedDates" is required (not null)
            if (resolvedDates == null) {
                throw new ArgumentNullException("resolvedDates is a required property for SecurityOnlySuccessResponseMeta and cannot be null");
            }
            this.ResolvedDates = resolvedDates;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Labels
        /// </summary>
        [DataMember(Name = "labels", IsRequired = true, EmitDefaultValue = false)]
        public SecurityOnlyLabels Labels { get; set; }

        /// <summary>
        /// Gets or Sets ResolvedDates
        /// </summary>
        [DataMember(Name = "resolvedDates", IsRequired = true, EmitDefaultValue = false)]
        public ResolvedDates ResolvedDates { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<WarningItem> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SecurityOnlySuccessResponseMeta {\n");
            sb.Append("  Labels: ").Append(Labels).Append("\n");
            sb.Append("  ResolvedDates: ").Append(ResolvedDates).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
            return this.Equals(input as SecurityOnlySuccessResponseMeta);
        }

        /// <summary>
        /// Returns true if SecurityOnlySuccessResponseMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of SecurityOnlySuccessResponseMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecurityOnlySuccessResponseMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Labels == input.Labels ||
                    (this.Labels != null &&
                    this.Labels.Equals(input.Labels))
                ) && 
                (
                    this.ResolvedDates == input.ResolvedDates ||
                    (this.ResolvedDates != null &&
                    this.ResolvedDates.Equals(input.ResolvedDates))
                ) && 
                (
                    this.Warnings == input.Warnings ||
                    this.Warnings != null &&
                    input.Warnings != null &&
                    this.Warnings.SequenceEqual(input.Warnings)
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
                if (this.Labels != null)
                {
                    hashCode = (hashCode * 59) + this.Labels.GetHashCode();
                }
                if (this.ResolvedDates != null)
                {
                    hashCode = (hashCode * 59) + this.ResolvedDates.GetHashCode();
                }
                if (this.Warnings != null)
                {
                    hashCode = (hashCode * 59) + this.Warnings.GetHashCode();
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
