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
    /// TeamSettingsDto
    /// </summary>
    [DataContract(Name = "TeamSettingsDto")]
    public partial class TeamSettingsDto : IEquatable<TeamSettingsDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TeamSettingsDto" /> class.
        /// </summary>
        /// <param name="defaultId">defaultId.</param>
        public TeamSettingsDto(Guid? defaultId = default(Guid?))
        {
            this.DefaultId = defaultId;
        }

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
            sb.Append("class TeamSettingsDto {\n");
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
            return this.Equals(input as TeamSettingsDto);
        }

        /// <summary>
        /// Returns true if TeamSettingsDto instances are equal
        /// </summary>
        /// <param name="input">Instance of TeamSettingsDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TeamSettingsDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
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
