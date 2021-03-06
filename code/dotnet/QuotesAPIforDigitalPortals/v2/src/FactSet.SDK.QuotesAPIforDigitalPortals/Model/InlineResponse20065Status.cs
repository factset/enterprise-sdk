/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Error status for the requested identifier
    /// </summary>
    [DataContract(Name = "inline_response_200_65_status")]
    public partial class InlineResponse20065Status : IEquatable<InlineResponse20065Status>, IValidatableObject
    {
        /// <summary>
        /// Code of the error condition.
        /// </summary>
        /// <value>Code of the error condition.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CodeEnum
        {
            /// <summary>
            /// Enum None for value: none
            /// </summary>
            [EnumMember(Value = "none")]
            None = 1,

            /// <summary>
            /// Enum Parameter for value: parameter
            /// </summary>
            [EnumMember(Value = "parameter")]
            Parameter = 2,

            /// <summary>
            /// Enum Entitlement for value: entitlement
            /// </summary>
            [EnumMember(Value = "entitlement")]
            Entitlement = 3

        }


        /// <summary>
        /// Code of the error condition.
        /// </summary>
        /// <value>Code of the error condition.</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public CodeEnum? Code { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20065Status" /> class.
        /// </summary>
        /// <param name="code">Code of the error condition..</param>
        /// <param name="identifier">Provided identifier..</param>
        /// <param name="encryptedDetails">Base64-encoded internal details about the error..</param>
        public InlineResponse20065Status(CodeEnum? code = default(CodeEnum?), string identifier = default(string), string encryptedDetails = default(string))
        {
            this.Code = code;
            this.Identifier = identifier;
            this.EncryptedDetails = encryptedDetails;
        }

        /// <summary>
        /// Provided identifier.
        /// </summary>
        /// <value>Provided identifier.</value>
        [DataMember(Name = "identifier", EmitDefaultValue = false)]
        public string Identifier { get; set; }

        /// <summary>
        /// Base64-encoded internal details about the error.
        /// </summary>
        /// <value>Base64-encoded internal details about the error.</value>
        [DataMember(Name = "encryptedDetails", EmitDefaultValue = false)]
        public string EncryptedDetails { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20065Status {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  EncryptedDetails: ").Append(EncryptedDetails).Append("\n");
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
            return this.Equals(input as InlineResponse20065Status);
        }

        /// <summary>
        /// Returns true if InlineResponse20065Status instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20065Status to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20065Status input)
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
                    this.Identifier == input.Identifier ||
                    (this.Identifier != null &&
                    this.Identifier.Equals(input.Identifier))
                ) && 
                (
                    this.EncryptedDetails == input.EncryptedDetails ||
                    (this.EncryptedDetails != null &&
                    this.EncryptedDetails.Equals(input.EncryptedDetails))
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
                if (this.Identifier != null)
                {
                    hashCode = (hashCode * 59) + this.Identifier.GetHashCode();
                }
                if (this.EncryptedDetails != null)
                {
                    hashCode = (hashCode * 59) + this.EncryptedDetails.GetHashCode();
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
