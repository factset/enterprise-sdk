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
    /// ContactEventUpdateDto
    /// </summary>
    [DataContract(Name = "ContactEventUpdateDto")]
    public partial class ContactEventUpdateDto : IEquatable<ContactEventUpdateDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactEventUpdateDto" /> class.
        /// </summary>
        /// <param name="fieldName">fieldName.</param>
        /// <param name="oldValue">oldValue.</param>
        /// <param name="newValue">newValue.</param>
        public ContactEventUpdateDto(string fieldName = default(string), string oldValue = default(string), string newValue = default(string))
        {
            this.FieldName = fieldName;
            this.OldValue = oldValue;
            this.NewValue = newValue;
        }

        /// <summary>
        /// Gets or Sets FieldName
        /// </summary>
        [DataMember(Name = "fieldName", EmitDefaultValue = true)]
        public string FieldName { get; set; }

        /// <summary>
        /// Gets or Sets OldValue
        /// </summary>
        [DataMember(Name = "oldValue", EmitDefaultValue = true)]
        public string OldValue { get; set; }

        /// <summary>
        /// Gets or Sets NewValue
        /// </summary>
        [DataMember(Name = "newValue", EmitDefaultValue = true)]
        public string NewValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ContactEventUpdateDto {\n");
            sb.Append("  FieldName: ").Append(FieldName).Append("\n");
            sb.Append("  OldValue: ").Append(OldValue).Append("\n");
            sb.Append("  NewValue: ").Append(NewValue).Append("\n");
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
            return this.Equals(input as ContactEventUpdateDto);
        }

        /// <summary>
        /// Returns true if ContactEventUpdateDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ContactEventUpdateDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContactEventUpdateDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FieldName == input.FieldName ||
                    (this.FieldName != null &&
                    this.FieldName.Equals(input.FieldName))
                ) && 
                (
                    this.OldValue == input.OldValue ||
                    (this.OldValue != null &&
                    this.OldValue.Equals(input.OldValue))
                ) && 
                (
                    this.NewValue == input.NewValue ||
                    (this.NewValue != null &&
                    this.NewValue.Equals(input.NewValue))
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
                if (this.FieldName != null)
                {
                    hashCode = (hashCode * 59) + this.FieldName.GetHashCode();
                }
                if (this.OldValue != null)
                {
                    hashCode = (hashCode * 59) + this.OldValue.GetHashCode();
                }
                if (this.NewValue != null)
                {
                    hashCode = (hashCode * 59) + this.NewValue.GetHashCode();
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
