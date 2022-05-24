/*
 * Signals API
 *
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: signals.api@factset.com
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
    /// EventDetailDataItemAllOf
    /// </summary>
    [DataContract(Name = "eventDetailDataItem_allOf")]
    public partial class EventDetailDataItemAllOf : IEquatable<EventDetailDataItemAllOf>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EventDetailDataItemAllOf" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EventDetailDataItemAllOf() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EventDetailDataItemAllOf" /> class.
        /// </summary>
        /// <param name="created">Date/Time in UTC the event was first recorded in our data store. (required).</param>
        /// <param name="updated">Date/Time in UTC the event was last updated. (required).</param>
        /// <param name="details">Signal specific event properties. (required).</param>
        public EventDetailDataItemAllOf(DateTime created = default(DateTime), DateTime updated = default(DateTime), Dictionary<string, Object> details = default(Dictionary<string, Object>))
        {
            this.Created = created;
            this.Updated = updated;
            // to ensure "details" is required (not null)
            if (details == null) {
                throw new ArgumentNullException("details is a required property for EventDetailDataItemAllOf and cannot be null");
            }
            this.Details = details;
        }

        /// <summary>
        /// Date/Time in UTC the event was first recorded in our data store.
        /// </summary>
        /// <value>Date/Time in UTC the event was first recorded in our data store.</value>
        [DataMember(Name = "created", IsRequired = true, EmitDefaultValue = false)]
        public DateTime Created { get; set; }

        /// <summary>
        /// Date/Time in UTC the event was last updated.
        /// </summary>
        /// <value>Date/Time in UTC the event was last updated.</value>
        [DataMember(Name = "updated", IsRequired = true, EmitDefaultValue = false)]
        public DateTime Updated { get; set; }

        /// <summary>
        /// Signal specific event properties.
        /// </summary>
        /// <value>Signal specific event properties.</value>
        [DataMember(Name = "details", IsRequired = true, EmitDefaultValue = false)]
        public Dictionary<string, Object> Details { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EventDetailDataItemAllOf {\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Updated: ").Append(Updated).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
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
            return this.Equals(input as EventDetailDataItemAllOf);
        }

        /// <summary>
        /// Returns true if EventDetailDataItemAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of EventDetailDataItemAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EventDetailDataItemAllOf input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Created == input.Created ||
                    (this.Created != null &&
                    this.Created.Equals(input.Created))
                ) && 
                (
                    this.Updated == input.Updated ||
                    (this.Updated != null &&
                    this.Updated.Equals(input.Updated))
                ) && 
                (
                    this.Details == input.Details ||
                    this.Details != null &&
                    input.Details != null &&
                    this.Details.SequenceEqual(input.Details)
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
                if (this.Created != null)
                {
                    hashCode = (hashCode * 59) + this.Created.GetHashCode();
                }
                if (this.Updated != null)
                {
                    hashCode = (hashCode * 59) + this.Updated.GetHashCode();
                }
                if (this.Details != null)
                {
                    hashCode = (hashCode * 59) + this.Details.GetHashCode();
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