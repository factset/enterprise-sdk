/*
 * GIPS API
 *
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
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
using OpenAPIDateConverter = FactSet.SDK.GIPS.Client.OpenAPIDateConverter;

namespace FactSet.SDK.GIPS.Model
{
    /// <summary>
    /// Full details of any error
    /// </summary>
    [DataContract(Name = "APIError")]
    public partial class APIError : IEquatable<APIError>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="APIError" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected APIError() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="APIError" /> class.
        /// </summary>
        /// <param name="id">Identifier for the error (the Chain ID) (required).</param>
        /// <param name="code">The error code (required).</param>
        /// <param name="title">The title of the error (required).</param>
        /// <param name="detail">Explanation specific to the occurrence of the error.</param>
        /// <param name="source">source.</param>
        public APIError(string id, string code, string title,string detail = default(string), ErrorSource source = default(ErrorSource))
        {
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for APIError and cannot be null");
            }
            this.Id = id;
            // to ensure "code" is required (not null)
            if (code == null) {
                throw new ArgumentNullException("code is a required property for APIError and cannot be null");
            }
            this.Code = code;
            // to ensure "title" is required (not null)
            if (title == null) {
                throw new ArgumentNullException("title is a required property for APIError and cannot be null");
            }
            this.Title = title;
            this.Detail = detail;
            this.Source = source;
        }

        /// <summary>
        /// Identifier for the error (the Chain ID)
        /// </summary>
        /// <value>Identifier for the error (the Chain ID)</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// The error code
        /// </summary>
        /// <value>The error code</value>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// The title of the error
        /// </summary>
        /// <value>The title of the error</value>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Explanation specific to the occurrence of the error
        /// </summary>
        /// <value>Explanation specific to the occurrence of the error</value>
        [DataMember(Name = "detail", EmitDefaultValue = true)]
        public string Detail { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [DataMember(Name = "source", EmitDefaultValue = false)]
        public ErrorSource Source { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class APIError {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Detail: ").Append(Detail).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
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
            return this.Equals(input as APIError);
        }

        /// <summary>
        /// Returns true if APIError instances are equal
        /// </summary>
        /// <param name="input">Instance of APIError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(APIError input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Detail == input.Detail ||
                    (this.Detail != null &&
                    this.Detail.Equals(input.Detail))
                ) && 
                (
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Detail != null)
                {
                    hashCode = (hashCode * 59) + this.Detail.GetHashCode();
                }
                if (this.Source != null)
                {
                    hashCode = (hashCode * 59) + this.Source.GetHashCode();
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
