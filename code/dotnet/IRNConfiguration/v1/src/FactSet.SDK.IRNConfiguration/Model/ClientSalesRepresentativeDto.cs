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
    /// ClientSalesRepresentativeDto
    /// </summary>
    [DataContract(Name = "ClientSalesRepresentativeDto")]
    public partial class ClientSalesRepresentativeDto : IEquatable<ClientSalesRepresentativeDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSalesRepresentativeDto" /> class.
        /// </summary>
        /// <param name="fullname">fullname.</param>
        /// <param name="emailAddress">emailAddress.</param>
        public ClientSalesRepresentativeDto(string fullname = default(string), string emailAddress = default(string))
        {
            this.Fullname = fullname;
            this.EmailAddress = emailAddress;
        }

        /// <summary>
        /// Gets or Sets Fullname
        /// </summary>
        [DataMember(Name = "fullname", EmitDefaultValue = true)]
        public string Fullname { get; set; }

        /// <summary>
        /// Gets or Sets EmailAddress
        /// </summary>
        [DataMember(Name = "emailAddress", EmitDefaultValue = true)]
        public string EmailAddress { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ClientSalesRepresentativeDto {\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  EmailAddress: ").Append(EmailAddress).Append("\n");
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
            return this.Equals(input as ClientSalesRepresentativeDto);
        }

        /// <summary>
        /// Returns true if ClientSalesRepresentativeDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientSalesRepresentativeDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientSalesRepresentativeDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Fullname == input.Fullname ||
                    (this.Fullname != null &&
                    this.Fullname.Equals(input.Fullname))
                ) && 
                (
                    this.EmailAddress == input.EmailAddress ||
                    (this.EmailAddress != null &&
                    this.EmailAddress.Equals(input.EmailAddress))
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
                if (this.Fullname != null)
                {
                    hashCode = (hashCode * 59) + this.Fullname.GetHashCode();
                }
                if (this.EmailAddress != null)
                {
                    hashCode = (hashCode * 59) + this.EmailAddress.GetHashCode();
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
