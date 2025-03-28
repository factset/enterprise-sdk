/*
 * BookBuilder
 *
 * The BookBuilder API is a powerful tool that combines detailed reports for companies of interest. Save time by using a single source of knowledge instead of relying on multiple APIs to create a presentation ready PDF, also known as a Public Information Book(PIB). </br></br> Consistently create books with the same content/reports for different companies by defining templates with the set of reports saved for re-use. Or, use templates that are created by FactSet for quick use. </br></br> With our powerful API endpoints, you can get the information on companies of interest quickly where and when you need it. </br></br> 
 *
 * The version of the OpenAPI document: 1.13.0
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
using OpenAPIDateConverter = FactSet.SDK.BookBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BookBuilder.Model
{
    /// <summary>
    /// Invalid ticker or Unknown error
    /// </summary>
    [DataContract(Name = "Invalid_Upload_Document_Request")]
    public partial class InvalidUploadDocumentRequest : IEquatable<InvalidUploadDocumentRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InvalidUploadDocumentRequest" /> class.
        /// </summary>
        /// <param name="message">Invalid Request Message.</param>
        /// <param name="code">Invalid request code.</param>
        public InvalidUploadDocumentRequest(string message = default(string), int code = default(int))
        {
            this.Message = message;
            this.Code = code;
        }

        /// <summary>
        /// Invalid Request Message
        /// </summary>
        /// <value>Invalid Request Message</value>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// Invalid request code
        /// </summary>
        /// <value>Invalid request code</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public int Code { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InvalidUploadDocumentRequest {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
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
            return this.Equals(input as InvalidUploadDocumentRequest);
        }

        /// <summary>
        /// Returns true if InvalidUploadDocumentRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of InvalidUploadDocumentRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InvalidUploadDocumentRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.Code == input.Code ||
                    this.Code.Equals(input.Code)
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
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Code.GetHashCode();
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
