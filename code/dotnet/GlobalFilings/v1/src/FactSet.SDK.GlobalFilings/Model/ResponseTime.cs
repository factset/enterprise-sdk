/*
 * Global Filings API
 *
 *  The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  The reference endpoints, such as sources, formTypes, timeZones, and categories, provide comprehensive lists of available sources, form types, time zones, and categories, respectively.
 *
 * The version of the OpenAPI document: 1.1.0
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
    /// Filings Response Time
    /// </summary>
    [DataContract(Name = "ResponseTime")]
    public partial class ResponseTime : IEquatable<ResponseTime>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResponseTime" /> class.
        /// </summary>
        /// <param name="data">Data Array Object.</param>
        public ResponseTime(List<ResponseTimeObject> data = default(List<ResponseTimeObject>))
        {
            this.Data = data;
        }

        /// <summary>
        /// Data Array Object
        /// </summary>
        /// <value>Data Array Object</value>
        [DataMember(Name = "data", EmitDefaultValue = false)]
        public List<ResponseTimeObject> Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResponseTime {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as ResponseTime);
        }

        /// <summary>
        /// Returns true if ResponseTime instances are equal
        /// </summary>
        /// <param name="input">Instance of ResponseTime to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResponseTime input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Data == input.Data ||
                    this.Data != null &&
                    input.Data != null &&
                    this.Data.SequenceEqual(input.Data)
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
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
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
