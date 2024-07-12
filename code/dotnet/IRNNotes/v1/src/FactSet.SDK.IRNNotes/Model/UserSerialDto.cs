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
    /// UserSerialDto
    /// </summary>
    [DataContract(Name = "UserSerialDto")]
    public partial class UserSerialDto : IEquatable<UserSerialDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserSerialDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected UserSerialDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="UserSerialDto" /> class.
        /// </summary>
        /// <param name="username">username (required).</param>
        /// <param name="serialNumber">serialNumber (required).</param>
        public UserSerialDto(string username, string serialNumber)
        {
            // to ensure "username" is required (not null)
            if (username == null) {
                throw new ArgumentNullException("username is a required property for UserSerialDto and cannot be null");
            }
            this.Username = username;
            // to ensure "serialNumber" is required (not null)
            if (serialNumber == null) {
                throw new ArgumentNullException("serialNumber is a required property for UserSerialDto and cannot be null");
            }
            this.SerialNumber = serialNumber;
        }

        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name = "username", IsRequired = true, EmitDefaultValue = false)]
        public string Username { get; set; }

        /// <summary>
        /// Gets or Sets SerialNumber
        /// </summary>
        [DataMember(Name = "serialNumber", IsRequired = true, EmitDefaultValue = false)]
        public string SerialNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UserSerialDto {\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  SerialNumber: ").Append(SerialNumber).Append("\n");
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
            return this.Equals(input as UserSerialDto);
        }

        /// <summary>
        /// Returns true if UserSerialDto instances are equal
        /// </summary>
        /// <param name="input">Instance of UserSerialDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserSerialDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Username == input.Username ||
                    (this.Username != null &&
                    this.Username.Equals(input.Username))
                ) && 
                (
                    this.SerialNumber == input.SerialNumber ||
                    (this.SerialNumber != null &&
                    this.SerialNumber.Equals(input.SerialNumber))
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
                if (this.Username != null)
                {
                    hashCode = (hashCode * 59) + this.Username.GetHashCode();
                }
                if (this.SerialNumber != null)
                {
                    hashCode = (hashCode * 59) + this.SerialNumber.GetHashCode();
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
            // Username (string) maxLength
            if (this.Username != null && this.Username.Length > 30)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Username, length must be less than 30.", new [] { "Username" });
            }

            // Username (string) minLength
            if (this.Username != null && this.Username.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Username, length must be greater than 0.", new [] { "Username" });
            }

            // SerialNumber (string) maxLength
            if (this.SerialNumber != null && this.SerialNumber.Length > 8)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SerialNumber, length must be less than 8.", new [] { "SerialNumber" });
            }

            // SerialNumber (string) minLength
            if (this.SerialNumber != null && this.SerialNumber.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SerialNumber, length must be greater than 0.", new [] { "SerialNumber" });
            }

            yield break;
        }
    }

}
