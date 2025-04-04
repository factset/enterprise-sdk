/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.4.0
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
using OpenAPIDateConverter = FactSet.SDK.IRNMeetings.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNMeetings.Model
{
    /// <summary>
    /// RelatedRecordsDto
    /// </summary>
    [DataContract(Name = "RelatedRecordsDto")]
    public partial class RelatedRecordsDto : IEquatable<RelatedRecordsDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RelatedRecordsDto" /> class.
        /// </summary>
        /// <param name="noteIds">noteIds.</param>
        /// <param name="meetingIds">meetingIds.</param>
        public RelatedRecordsDto(List<Guid> noteIds = default(List<Guid>), List<Guid> meetingIds = default(List<Guid>))
        {
            this.NoteIds = noteIds;
            this.MeetingIds = meetingIds;
        }

        /// <summary>
        /// Gets or Sets NoteIds
        /// </summary>
        [DataMember(Name = "noteIds", EmitDefaultValue = true)]
        public List<Guid> NoteIds { get; set; }

        /// <summary>
        /// Gets or Sets MeetingIds
        /// </summary>
        [DataMember(Name = "meetingIds", EmitDefaultValue = true)]
        public List<Guid> MeetingIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RelatedRecordsDto {\n");
            sb.Append("  NoteIds: ").Append(NoteIds).Append("\n");
            sb.Append("  MeetingIds: ").Append(MeetingIds).Append("\n");
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
            return this.Equals(input as RelatedRecordsDto);
        }

        /// <summary>
        /// Returns true if RelatedRecordsDto instances are equal
        /// </summary>
        /// <param name="input">Instance of RelatedRecordsDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RelatedRecordsDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NoteIds == input.NoteIds ||
                    this.NoteIds != null &&
                    input.NoteIds != null &&
                    this.NoteIds.SequenceEqual(input.NoteIds)
                ) && 
                (
                    this.MeetingIds == input.MeetingIds ||
                    this.MeetingIds != null &&
                    input.MeetingIds != null &&
                    this.MeetingIds.SequenceEqual(input.MeetingIds)
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
                if (this.NoteIds != null)
                {
                    hashCode = (hashCode * 59) + this.NoteIds.GetHashCode();
                }
                if (this.MeetingIds != null)
                {
                    hashCode = (hashCode * 59) + this.MeetingIds.GetHashCode();
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
