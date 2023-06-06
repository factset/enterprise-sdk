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
    /// RiskExclusionInfoExclusionInfo
    /// </summary>
    [DataContract(Name = "RiskExclusionInfo_exclusionInfo")]
    public partial class RiskExclusionInfoExclusionInfo : IEquatable<RiskExclusionInfoExclusionInfo>, IValidatableObject
    {
        /// <summary>
        /// Exclusion reason
        /// </summary>
        /// <value>Exclusion reason</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CodeEnum
        {
            /// <summary>
            /// Enum NoRiskModelCoverage for value: NoRiskModelCoverage
            /// </summary>
            [EnumMember(Value = "NoRiskModelCoverage")]
            NoRiskModelCoverage = 1,

            /// <summary>
            /// Enum NoRiskModelAccess for value: NoRiskModelAccess
            /// </summary>
            [EnumMember(Value = "NoRiskModelAccess")]
            NoRiskModelAccess = 2,

            /// <summary>
            /// Enum CyclicIdentifierResolution for value: CyclicIdentifierResolution
            /// </summary>
            [EnumMember(Value = "CyclicIdentifierResolution")]
            CyclicIdentifierResolution = 3,

            /// <summary>
            /// Enum NoValidCompositeAssetConstituents for value: NoValidCompositeAssetConstituents
            /// </summary>
            [EnumMember(Value = "NoValidCompositeAssetConstituents")]
            NoValidCompositeAssetConstituents = 4,

            /// <summary>
            /// Enum InvalidCompositeAssetDefinition for value: InvalidCompositeAssetDefinition
            /// </summary>
            [EnumMember(Value = "InvalidCompositeAssetDefinition")]
            InvalidCompositeAssetDefinition = 5,

            /// <summary>
            /// Enum InternalError for value: InternalError
            /// </summary>
            [EnumMember(Value = "InternalError")]
            InternalError = 6,

            /// <summary>
            /// Enum Unknown for value: Unknown
            /// </summary>
            [EnumMember(Value = "Unknown")]
            Unknown = 7

        }


        /// <summary>
        /// Exclusion reason
        /// </summary>
        /// <value>Exclusion reason</value>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = false)]
        public CodeEnum Code { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskExclusionInfoExclusionInfo" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RiskExclusionInfoExclusionInfo() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskExclusionInfoExclusionInfo" /> class.
        /// </summary>
        /// <param name="code">Exclusion reason (required).</param>
        /// <param name="details">Exclusion reason details if available (required).</param>
        public RiskExclusionInfoExclusionInfo(CodeEnum code, string details)
        {
            this.Code = code;
            // to ensure "details" is required (not null)
            if (details == null) {
                throw new ArgumentNullException("details is a required property for RiskExclusionInfoExclusionInfo and cannot be null");
            }
            this.Details = details;
        }

        /// <summary>
        /// Exclusion reason details if available
        /// </summary>
        /// <value>Exclusion reason details if available</value>
        [DataMember(Name = "details", IsRequired = true, EmitDefaultValue = false)]
        public string Details { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RiskExclusionInfoExclusionInfo {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
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
            return this.Equals(input as RiskExclusionInfoExclusionInfo);
        }

        /// <summary>
        /// Returns true if RiskExclusionInfoExclusionInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of RiskExclusionInfoExclusionInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RiskExclusionInfoExclusionInfo input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    this.Code.Equals(input.Code)
                ) && 
                (
                    this.Details == input.Details ||
                    (this.Details != null &&
                    this.Details.Equals(input.Details))
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
                hashCode = (hashCode * 59) + this.Code.GetHashCode();
                if (this.Details != null)
                {
                    hashCode = (hashCode * 59) + this.Details.GetHashCode();
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
            // Details (string) minLength
            if (this.Details != null && this.Details.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Details, length must be greater than 0.", new [] { "Details" });
            }

            yield break;
        }
    }

}
