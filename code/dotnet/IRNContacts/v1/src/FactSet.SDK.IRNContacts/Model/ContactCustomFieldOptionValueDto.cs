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
using OpenAPIDateConverter = FactSet.SDK.IRNContacts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNContacts.Model
{
    /// <summary>
    /// ContactCustomFieldOptionValueDto
    /// </summary>
    [DataContract(Name = "ContactCustomFieldOptionValueDto")]
    public partial class ContactCustomFieldOptionValueDto : IEquatable<ContactCustomFieldOptionValueDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactCustomFieldOptionValueDto" /> class.
        /// </summary>
        /// <param name="optionId">optionId.</param>
        /// <param name="optionName">optionName.</param>
        public ContactCustomFieldOptionValueDto(Guid optionId = default(Guid), string optionName = default(string))
        {
            this.OptionId = optionId;
            this.OptionName = optionName;
        }

        /// <summary>
        /// Gets or Sets OptionId
        /// </summary>
        [DataMember(Name = "optionId", EmitDefaultValue = false)]
        public Guid OptionId { get; set; }

        /// <summary>
        /// Gets or Sets OptionName
        /// </summary>
        [DataMember(Name = "optionName", EmitDefaultValue = true)]
        public string OptionName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ContactCustomFieldOptionValueDto {\n");
            sb.Append("  OptionId: ").Append(OptionId).Append("\n");
            sb.Append("  OptionName: ").Append(OptionName).Append("\n");
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
            return this.Equals(input as ContactCustomFieldOptionValueDto);
        }

        /// <summary>
        /// Returns true if ContactCustomFieldOptionValueDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ContactCustomFieldOptionValueDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContactCustomFieldOptionValueDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.OptionId == input.OptionId ||
                    (this.OptionId != null &&
                    this.OptionId.Equals(input.OptionId))
                ) && 
                (
                    this.OptionName == input.OptionName ||
                    (this.OptionName != null &&
                    this.OptionName.Equals(input.OptionName))
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
                if (this.OptionId != null)
                {
                    hashCode = (hashCode * 59) + this.OptionId.GetHashCode();
                }
                if (this.OptionName != null)
                {
                    hashCode = (hashCode * 59) + this.OptionName.GetHashCode();
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
