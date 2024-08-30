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
    /// RecommendationSettingsDto
    /// </summary>
    [DataContract(Name = "RecommendationSettingsDto")]
    public partial class RecommendationSettingsDto : IEquatable<RecommendationSettingsDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RecommendationSettingsDto" /> class.
        /// </summary>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="isMandatory">isMandatory.</param>
        /// <param name="usePrevious">usePrevious.</param>
        /// <param name="defaultId">defaultId.</param>
        public RecommendationSettingsDto(bool isHidden = default(bool), bool isMandatory = default(bool), bool usePrevious = default(bool), Guid? defaultId = default(Guid?))
        {
            this.IsHidden = isHidden;
            this.IsMandatory = isMandatory;
            this.UsePrevious = usePrevious;
            this.DefaultId = defaultId;
        }

        /// <summary>
        /// Gets or Sets IsHidden
        /// </summary>
        [DataMember(Name = "isHidden", EmitDefaultValue = true)]
        public bool IsHidden { get; set; }

        /// <summary>
        /// Gets or Sets IsMandatory
        /// </summary>
        [DataMember(Name = "isMandatory", EmitDefaultValue = true)]
        public bool IsMandatory { get; set; }

        /// <summary>
        /// Gets or Sets UsePrevious
        /// </summary>
        [DataMember(Name = "usePrevious", EmitDefaultValue = true)]
        public bool UsePrevious { get; set; }

        /// <summary>
        /// Gets or Sets DefaultId
        /// </summary>
        [DataMember(Name = "defaultId", EmitDefaultValue = true)]
        public Guid? DefaultId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RecommendationSettingsDto {\n");
            sb.Append("  IsHidden: ").Append(IsHidden).Append("\n");
            sb.Append("  IsMandatory: ").Append(IsMandatory).Append("\n");
            sb.Append("  UsePrevious: ").Append(UsePrevious).Append("\n");
            sb.Append("  DefaultId: ").Append(DefaultId).Append("\n");
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
            return this.Equals(input as RecommendationSettingsDto);
        }

        /// <summary>
        /// Returns true if RecommendationSettingsDto instances are equal
        /// </summary>
        /// <param name="input">Instance of RecommendationSettingsDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RecommendationSettingsDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IsHidden == input.IsHidden ||
                    this.IsHidden.Equals(input.IsHidden)
                ) && 
                (
                    this.IsMandatory == input.IsMandatory ||
                    this.IsMandatory.Equals(input.IsMandatory)
                ) && 
                (
                    this.UsePrevious == input.UsePrevious ||
                    this.UsePrevious.Equals(input.UsePrevious)
                ) && 
                (
                    this.DefaultId == input.DefaultId ||
                    (this.DefaultId != null &&
                    this.DefaultId.Equals(input.DefaultId))
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
                hashCode = (hashCode * 59) + this.IsHidden.GetHashCode();
                hashCode = (hashCode * 59) + this.IsMandatory.GetHashCode();
                hashCode = (hashCode * 59) + this.UsePrevious.GetHashCode();
                if (this.DefaultId != null)
                {
                    hashCode = (hashCode * 59) + this.DefaultId.GetHashCode();
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
