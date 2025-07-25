/*
 * FactSet Private Company API
 *
 * FactSet Private Company API encompasses Private Company Financials and includes some Private Company non-periodic data. Additional Private Company firmographics can be found in the FactSet Entity API. <p><b>Rate limit is set to 10 requests per second and 10 concurrent requests per user</b>.</p> 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPrivateCompany.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPrivateCompany.Model
{
    /// <summary>
    /// Private Company Non-Periodic
    /// </summary>
    [DataContract(Name = "NonPeriodic")]
    public partial class NonPeriodic : IEquatable<NonPeriodic>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NonPeriodic" /> class.
        /// </summary>
        /// <param name="requestId">Identifier used in &#x60;ids&#x60;..</param>
        /// <param name="fsymId">Unique FactSet-generated identifier representing an entity for the current entity identifier (-E).</param>
        /// <param name="metric">The requested &#x60;metric&#x60; input representing the Private Company Financial Data Item..</param>
        /// <param name="value">value.</param>
        public NonPeriodic(string requestId = default(string), string fsymId = default(string), string metric = default(string), NonPeriodicValue value = default(NonPeriodicValue))
        {
            this.RequestId = requestId;
            this.FsymId = fsymId;
            this.Metric = metric;
            this.Value = value;
        }

        /// <summary>
        /// Identifier used in &#x60;ids&#x60;.
        /// </summary>
        /// <value>Identifier used in &#x60;ids&#x60;.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)
        /// </summary>
        /// <value>Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// The requested &#x60;metric&#x60; input representing the Private Company Financial Data Item.
        /// </summary>
        /// <value>The requested &#x60;metric&#x60; input representing the Private Company Financial Data Item.</value>
        [DataMember(Name = "metric", EmitDefaultValue = true)]
        public string Metric { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public NonPeriodicValue Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NonPeriodic {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Metric: ").Append(Metric).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as NonPeriodic);
        }

        /// <summary>
        /// Returns true if NonPeriodic instances are equal
        /// </summary>
        /// <param name="input">Instance of NonPeriodic to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NonPeriodic input)
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
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Metric == input.Metric ||
                    (this.Metric != null &&
                    this.Metric.Equals(input.Metric))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Metric != null)
                {
                    hashCode = (hashCode * 59) + this.Metric.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
