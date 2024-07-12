/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.IRNNotes.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNNotes.Model
{
    /// <summary>
    /// CustomFieldValueDto
    /// </summary>
    [DataContract(Name = "CustomFieldValueDto")]
    public partial class CustomFieldValueDto : IEquatable<CustomFieldValueDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomFieldValueDto" /> class.
        /// </summary>
        /// <param name="code">code.</param>
        /// <param name="value">value.</param>
        /// <param name="options">options.</param>
        /// <param name="contactValues">contactValues.</param>
        /// <param name="userTeamValues">userTeamValues.</param>
        public CustomFieldValueDto(string code = default(string), string value = default(string), List<string> options = default(List<string>), List<Guid> contactValues = default(List<Guid>), UserTeamLookupDto userTeamValues = default(UserTeamLookupDto))
        {
            this.Code = code;
            this.Value = value;
            this.Options = options;
            this.ContactValues = contactValues;
            this.UserTeamValues = userTeamValues;
        }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", EmitDefaultValue = true)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = true)]
        public string Value { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name = "options", EmitDefaultValue = true)]
        public List<string> Options { get; set; }

        /// <summary>
        /// Gets or Sets ContactValues
        /// </summary>
        [DataMember(Name = "contactValues", EmitDefaultValue = true)]
        public List<Guid> ContactValues { get; set; }

        /// <summary>
        /// Gets or Sets UserTeamValues
        /// </summary>
        [DataMember(Name = "userTeamValues", EmitDefaultValue = false)]
        public UserTeamLookupDto UserTeamValues { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CustomFieldValueDto {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
            sb.Append("  ContactValues: ").Append(ContactValues).Append("\n");
            sb.Append("  UserTeamValues: ").Append(UserTeamValues).Append("\n");
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
            return this.Equals(input as CustomFieldValueDto);
        }

        /// <summary>
        /// Returns true if CustomFieldValueDto instances are equal
        /// </summary>
        /// <param name="input">Instance of CustomFieldValueDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomFieldValueDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Options == input.Options ||
                    this.Options != null &&
                    input.Options != null &&
                    this.Options.SequenceEqual(input.Options)
                ) && 
                (
                    this.ContactValues == input.ContactValues ||
                    this.ContactValues != null &&
                    input.ContactValues != null &&
                    this.ContactValues.SequenceEqual(input.ContactValues)
                ) && 
                (
                    this.UserTeamValues == input.UserTeamValues ||
                    (this.UserTeamValues != null &&
                    this.UserTeamValues.Equals(input.UserTeamValues))
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.Options != null)
                {
                    hashCode = (hashCode * 59) + this.Options.GetHashCode();
                }
                if (this.ContactValues != null)
                {
                    hashCode = (hashCode * 59) + this.ContactValues.GetHashCode();
                }
                if (this.UserTeamValues != null)
                {
                    hashCode = (hashCode * 59) + this.UserTeamValues.GetHashCode();
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
