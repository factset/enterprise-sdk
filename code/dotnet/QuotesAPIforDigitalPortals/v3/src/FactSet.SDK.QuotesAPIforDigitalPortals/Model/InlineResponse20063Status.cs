/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
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
    [DataContract(Name = "inline_response_200_63_status")]
    public partial class InlineResponse20063Status : IEquatable<InlineResponse20063Status>, IValidatableObject
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
            Parameter = 2

        }


        /// <summary>
        /// Code of the error condition.
        /// </summary>
        /// <value>Code of the error condition.</value>
        [DataMember(Name = "code", EmitDefaultValue = true)]
        public CodeEnum? Code { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20063Status" /> class.
        /// </summary>
        /// <param name="code">Code of the error condition..</param>
        /// <param name="identifier">Provided identifier..</param>
        /// <param name="encryptedDetails">Base64-encoded internal details about the error..</param>
        public InlineResponse20063Status(CodeEnum? code = default(CodeEnum?), string identifier = default(string), string encryptedDetails = default(string))
        {
            this.Code = code;
            this.Identifier = identifier;
            this.EncryptedDetails = encryptedDetails;
        }

        /// <summary>
        /// Provided identifier.
        /// </summary>
        /// <value>Provided identifier.</value>
        [DataMember(Name = "identifier", EmitDefaultValue = true)]
        public string Identifier { get; set; }

        /// <summary>
        /// Base64-encoded internal details about the error.
        /// </summary>
        /// <value>Base64-encoded internal details about the error.</value>
        [DataMember(Name = "encryptedDetails", EmitDefaultValue = true)]
        public string EncryptedDetails { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20063Status {\n");
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
            return this.Equals(input as InlineResponse20063Status);
        }

        /// <summary>
        /// Returns true if InlineResponse20063Status instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20063Status to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20063Status input)
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
