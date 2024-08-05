/*
 * Signals API
 *
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.6.0
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
using OpenAPIDateConverter = FactSet.SDK.Signals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Signals.Model
{
    /// <summary>
    /// ScreenMeta
    /// </summary>
    [DataContract(Name = "screenMeta")]
    public partial class ScreenMeta : IEquatable<ScreenMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ScreenMeta" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ScreenMeta() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ScreenMeta" /> class.
        /// </summary>
        /// <param name="signalRequestId">signalRequestId (required).</param>
        /// <param name="dateRange">dateRange (required).</param>
        /// <param name="partial">partial.</param>
        public ScreenMeta(Guid signalRequestId, EventsMetaDateRange dateRange,ScreenMetaPartial partial = default(ScreenMetaPartial))
        {
            this.SignalRequestId = signalRequestId;
            // to ensure "dateRange" is required (not null)
            if (dateRange == null) {
                throw new ArgumentNullException("dateRange is a required property for ScreenMeta and cannot be null");
            }
            this.DateRange = dateRange;
            this.Partial = partial;
        }

        /// <summary>
        /// Gets or Sets SignalRequestId
        /// </summary>
        [DataMember(Name = "signalRequestId", IsRequired = true, EmitDefaultValue = false)]
        public Guid SignalRequestId { get; set; }

        /// <summary>
        /// Gets or Sets DateRange
        /// </summary>
        [DataMember(Name = "dateRange", IsRequired = true, EmitDefaultValue = false)]
        public EventsMetaDateRange DateRange { get; set; }

        /// <summary>
        /// Gets or Sets Partial
        /// </summary>
        [DataMember(Name = "partial", EmitDefaultValue = false)]
        public ScreenMetaPartial Partial { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ScreenMeta {\n");
            sb.Append("  SignalRequestId: ").Append(SignalRequestId).Append("\n");
            sb.Append("  DateRange: ").Append(DateRange).Append("\n");
            sb.Append("  Partial: ").Append(Partial).Append("\n");
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
            return this.Equals(input as ScreenMeta);
        }

        /// <summary>
        /// Returns true if ScreenMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of ScreenMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ScreenMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SignalRequestId == input.SignalRequestId ||
                    (this.SignalRequestId != null &&
                    this.SignalRequestId.Equals(input.SignalRequestId))
                ) && 
                (
                    this.DateRange == input.DateRange ||
                    (this.DateRange != null &&
                    this.DateRange.Equals(input.DateRange))
                ) && 
                (
                    this.Partial == input.Partial ||
                    (this.Partial != null &&
                    this.Partial.Equals(input.Partial))
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
                if (this.SignalRequestId != null)
                {
                    hashCode = (hashCode * 59) + this.SignalRequestId.GetHashCode();
                }
                if (this.DateRange != null)
                {
                    hashCode = (hashCode * 59) + this.DateRange.GetHashCode();
                }
                if (this.Partial != null)
                {
                    hashCode = (hashCode * 59) + this.Partial.GetHashCode();
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
