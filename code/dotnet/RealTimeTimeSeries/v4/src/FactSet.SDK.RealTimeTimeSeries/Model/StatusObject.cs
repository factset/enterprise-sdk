/*
 * Real-Time Time Series API
 *
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 4.0.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeTimeSeries.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeTimeSeries.Model
{
    /// <summary>
    /// The status member contains the status code of the response.
    /// </summary>
    [DataContract(Name = "StatusObject")]
    public partial class StatusObject : IEquatable<StatusObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StatusObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected StatusObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="StatusObject" /> class.
        /// </summary>
        /// <param name="code">The HTTP status code of the response, mirroring the code from the Status-Line of the HTTP response message (see [RFC2616] section 6.1). (required).</param>
        public StatusObject(decimal code)
        {
            this.Code = code;
        }

        /// <summary>
        /// The HTTP status code of the response, mirroring the code from the Status-Line of the HTTP response message (see [RFC2616] section 6.1).
        /// </summary>
        /// <value>The HTTP status code of the response, mirroring the code from the Status-Line of the HTTP response message (see [RFC2616] section 6.1).</value>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = false)]
        public decimal Code { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StatusObject {\n");
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
            return this.Equals(input as StatusObject);
        }

        /// <summary>
        /// Returns true if StatusObject instances are equal
        /// </summary>
        /// <param name="input">Instance of StatusObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatusObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
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
