/*
 * Global Filings API
 *
 *  The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  The meta endpoints, such as sources, formTypes, timeZones, and categories, provide comprehensive lists of available sources, form types, time zones, and categories, respectively.
 *
 * The version of the OpenAPI document: 2.0.0
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
using OpenAPIDateConverter = FactSet.SDK.GlobalFilings.Client.OpenAPIDateConverter;

namespace FactSet.SDK.GlobalFilings.Model
{
    /// <summary>
    /// Count
    /// </summary>
    [DataContract(Name = "Count")]
    public partial class Count : IEquatable<Count>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Count" /> class.
        /// </summary>
        /// <param name="requestId">id.</param>
        /// <param name="source">source.</param>
        /// <param name="count">source value.</param>
        /// <param name="error">error.</param>
        public Count(string requestId = default(string), string source = default(string), string count = default(string), InvalidIdErrorObject error = default(InvalidIdErrorObject))
        {
            this.RequestId = requestId;
            this.Source = source;
            this._Count = count;
            this.Error = error;
        }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// source
        /// </summary>
        /// <value>source</value>
        [DataMember(Name = "source", EmitDefaultValue = false)]
        public string Source { get; set; }

        /// <summary>
        /// source value
        /// </summary>
        /// <value>source value</value>
        [DataMember(Name = "count", EmitDefaultValue = false)]
        public string _Count { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", EmitDefaultValue = true)]
        public InvalidIdErrorObject Error { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Count {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  _Count: ").Append(_Count).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
            return this.Equals(input as Count);
        }

        /// <summary>
        /// Returns true if Count instances are equal
        /// </summary>
        /// <param name="input">Instance of Count to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Count input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
                ) && 
                (
                    this._Count == input._Count ||
                    (this._Count != null &&
                    this._Count.Equals(input._Count))
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
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
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.Source != null)
                {
                    hashCode = (hashCode * 59) + this.Source.GetHashCode();
                }
                if (this._Count != null)
                {
                    hashCode = (hashCode * 59) + this._Count.GetHashCode();
                }
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
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
