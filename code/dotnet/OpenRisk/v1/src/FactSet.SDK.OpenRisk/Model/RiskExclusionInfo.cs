/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
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
    /// Risk model uncovered security reason
    /// </summary>
    [DataContract(Name = "RiskExclusionInfo")]
    public partial class RiskExclusionInfo : IEquatable<RiskExclusionInfo>, IValidatableObject
    {
        /// <summary>
        /// **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable
        /// </summary>
        /// <value>**(since 1.19.0)** Security asset classification according to the risk model, if available and determinable</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ModelClassEnum
        {
            /// <summary>
            /// Enum Unknown for value: Unknown
            /// </summary>
            [EnumMember(Value = "Unknown")]
            Unknown = 1,

            /// <summary>
            /// Enum CompositeAsset for value: CompositeAsset
            /// </summary>
            [EnumMember(Value = "CompositeAsset")]
            CompositeAsset = 2

        }


        /// <summary>
        /// **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable
        /// </summary>
        /// <value>**(since 1.19.0)** Security asset classification according to the risk model, if available and determinable</value>
        [DataMember(Name = "modelClass", IsRequired = true, EmitDefaultValue = false)]
        public ModelClassEnum ModelClass { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskExclusionInfo" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RiskExclusionInfo() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskExclusionInfo" /> class.
        /// </summary>
        /// <param name="covered">Coverage flag. The value will always be false to indicate the security is excluded. (required).</param>
        /// <param name="exclusionInfo">exclusionInfo (required).</param>
        /// <param name="modelClass">**(since 1.19.0)** Security asset classification according to the risk model, if available and determinable (required).</param>
        public RiskExclusionInfo(bool covered, RiskExclusionInfoExclusionInfo exclusionInfo, ModelClassEnum modelClass)
        {
            this.Covered = covered;
            // to ensure "exclusionInfo" is required (not null)
            if (exclusionInfo == null) {
                throw new ArgumentNullException("exclusionInfo is a required property for RiskExclusionInfo and cannot be null");
            }
            this.ExclusionInfo = exclusionInfo;
            this.ModelClass = modelClass;
        }

        /// <summary>
        /// Coverage flag. The value will always be false to indicate the security is excluded.
        /// </summary>
        /// <value>Coverage flag. The value will always be false to indicate the security is excluded.</value>
        [DataMember(Name = "covered", IsRequired = true, EmitDefaultValue = true)]
        public bool Covered { get; set; }

        /// <summary>
        /// Gets or Sets ExclusionInfo
        /// </summary>
        [DataMember(Name = "exclusionInfo", IsRequired = true, EmitDefaultValue = false)]
        public RiskExclusionInfoExclusionInfo ExclusionInfo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RiskExclusionInfo {\n");
            sb.Append("  Covered: ").Append(Covered).Append("\n");
            sb.Append("  ExclusionInfo: ").Append(ExclusionInfo).Append("\n");
            sb.Append("  ModelClass: ").Append(ModelClass).Append("\n");
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
            return this.Equals(input as RiskExclusionInfo);
        }

        /// <summary>
        /// Returns true if RiskExclusionInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of RiskExclusionInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RiskExclusionInfo input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Covered == input.Covered ||
                    this.Covered.Equals(input.Covered)
                ) && 
                (
                    this.ExclusionInfo == input.ExclusionInfo ||
                    (this.ExclusionInfo != null &&
                    this.ExclusionInfo.Equals(input.ExclusionInfo))
                ) && 
                (
                    this.ModelClass == input.ModelClass ||
                    this.ModelClass.Equals(input.ModelClass)
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
                hashCode = (hashCode * 59) + this.Covered.GetHashCode();
                if (this.ExclusionInfo != null)
                {
                    hashCode = (hashCode * 59) + this.ExclusionInfo.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ModelClass.GetHashCode();
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
