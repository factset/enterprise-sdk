/*
 * Events Contribution API
 *
 * The Events Contribution API provides the ability to add specific types of corporate events to FactSet’s own events calendar, for display within FactSet’s applications, as well as for off-platform re-distribution via FactSet’s Events Calendar API.
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
using OpenAPIDateConverter = FactSet.SDK.EventsContribution.Client.OpenAPIDateConverter;

namespace FactSet.SDK.EventsContribution.Model
{
    /// <summary>
    /// DeleteResponseDataEventData
    /// </summary>
    [DataContract(Name = "deleteResponse_data_eventData")]
    public partial class DeleteResponseDataEventData : IEquatable<DeleteResponseDataEventData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DeleteResponseDataEventData" /> class.
        /// </summary>
        /// <param name="eventId">Id of the event that was successfully deleted.</param>
        public DeleteResponseDataEventData(string eventId = default(string))
        {
            this.EventId = eventId;
        }

        /// <summary>
        /// Id of the event that was successfully deleted
        /// </summary>
        /// <value>Id of the event that was successfully deleted</value>
        [DataMember(Name = "eventId", EmitDefaultValue = false)]
        public string EventId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DeleteResponseDataEventData {\n");
            sb.Append("  EventId: ").Append(EventId).Append("\n");
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
            return this.Equals(input as DeleteResponseDataEventData);
        }

        /// <summary>
        /// Returns true if DeleteResponseDataEventData instances are equal
        /// </summary>
        /// <param name="input">Instance of DeleteResponseDataEventData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeleteResponseDataEventData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.EventId == input.EventId ||
                    (this.EventId != null &&
                    this.EventId.Equals(input.EventId))
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
                if (this.EventId != null)
                {
                    hashCode = (hashCode * 59) + this.EventId.GetHashCode();
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
