/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
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
using OpenAPIDateConverter = FactSet.SDK.Vermilion.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Vermilion.Model
{
    /// <summary>
    /// Report Generation log details.
    /// </summary>
    [DataContract(Name = "ReportInstanceLogDTO")]
    public partial class ReportInstanceLogDTO : IEquatable<ReportInstanceLogDTO>, IValidatableObject
    {
        /// <summary>
        /// Indicates the type of log entry, either a general log or an error.
        /// </summary>
        /// <value>Indicates the type of log entry, either a general log or an error.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum LOG for value: LOG
            /// </summary>
            [EnumMember(Value = "LOG")]
            LOG = 1,

            /// <summary>
            /// Enum ERROR for value: ERROR
            /// </summary>
            [EnumMember(Value = "ERROR")]
            ERROR = 2

        }


        /// <summary>
        /// Indicates the type of log entry, either a general log or an error.
        /// </summary>
        /// <value>Indicates the type of log entry, either a general log or an error.</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportInstanceLogDTO" /> class.
        /// </summary>
        /// <param name="sequenceNumber">Sequential number of the log entry..</param>
        /// <param name="message">Detailed message describing the log event or error..</param>
        /// <param name="type">Indicates the type of log entry, either a general log or an error..</param>
        /// <param name="updateDate">The date and time of the last update for this log entry..</param>
        public ReportInstanceLogDTO(int sequenceNumber = default(int), string message = default(string), TypeEnum? type = default(TypeEnum?), string updateDate = default(string))
        {
            this.SequenceNumber = sequenceNumber;
            this.Message = message;
            this.Type = type;
            this.UpdateDate = updateDate;
        }

        /// <summary>
        /// Sequential number of the log entry.
        /// </summary>
        /// <value>Sequential number of the log entry.</value>
        [DataMember(Name = "sequenceNumber", EmitDefaultValue = false)]
        public int SequenceNumber { get; set; }

        /// <summary>
        /// Detailed message describing the log event or error.
        /// </summary>
        /// <value>Detailed message describing the log event or error.</value>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// The date and time of the last update for this log entry.
        /// </summary>
        /// <value>The date and time of the last update for this log entry.</value>
        [DataMember(Name = "updateDate", EmitDefaultValue = false)]
        public string UpdateDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReportInstanceLogDTO {\n");
            sb.Append("  SequenceNumber: ").Append(SequenceNumber).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  UpdateDate: ").Append(UpdateDate).Append("\n");
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
            return this.Equals(input as ReportInstanceLogDTO);
        }

        /// <summary>
        /// Returns true if ReportInstanceLogDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of ReportInstanceLogDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReportInstanceLogDTO input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SequenceNumber == input.SequenceNumber ||
                    this.SequenceNumber.Equals(input.SequenceNumber)
                ) && 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.UpdateDate == input.UpdateDate ||
                    (this.UpdateDate != null &&
                    this.UpdateDate.Equals(input.UpdateDate))
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
                hashCode = (hashCode * 59) + this.SequenceNumber.GetHashCode();
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                if (this.UpdateDate != null)
                {
                    hashCode = (hashCode * 59) + this.UpdateDate.GetHashCode();
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
