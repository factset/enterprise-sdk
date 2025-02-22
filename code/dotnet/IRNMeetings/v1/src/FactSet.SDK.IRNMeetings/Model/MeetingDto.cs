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
    /// MeetingDto
    /// </summary>
    [DataContract(Name = "MeetingDto")]
    public partial class MeetingDto : IEquatable<MeetingDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MeetingDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="start">start.</param>
        /// <param name="end">end.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="authorId">authorId.</param>
        /// <param name="title">title.</param>
        /// <param name="identifier">identifier.</param>
        /// <param name="organizer">organizer.</param>
        /// <param name="organizerId">organizerId.</param>
        /// <param name="body">body.</param>
        /// <param name="averageRating">averageRating.</param>
        /// <param name="alertAttendees">alertAttendees.</param>
        /// <param name="alertAuthor">alertAuthor.</param>
        /// <param name="locations">locations.</param>
        /// <param name="attendees">attendees.</param>
        /// <param name="customFields">customFields.</param>
        /// <param name="relatedSymbols">relatedSymbols.</param>
        /// <param name="relatedRecords">relatedRecords.</param>
        /// <param name="relatedContacts">relatedContacts.</param>
        public MeetingDto(Guid id = default(Guid), string start = default(string), string end = default(string), string createdAt = default(string), Guid authorId = default(Guid), string title = default(string), string identifier = default(string), string organizer = default(string), Guid organizerId = default(Guid), string body = default(string), int? averageRating = default(int?), bool alertAttendees = default(bool), bool alertAuthor = default(bool), List<LocationDto> locations = default(List<LocationDto>), List<AttendeeDto> attendees = default(List<AttendeeDto>), List<CustomFieldValueDto> customFields = default(List<CustomFieldValueDto>), List<string> relatedSymbols = default(List<string>), RelatedRecordsDto relatedRecords = default(RelatedRecordsDto), List<Guid> relatedContacts = default(List<Guid>))
        {
            this.Id = id;
            this.Start = start;
            this.End = end;
            this.CreatedAt = createdAt;
            this.AuthorId = authorId;
            this.Title = title;
            this.Identifier = identifier;
            this.Organizer = organizer;
            this.OrganizerId = organizerId;
            this.Body = body;
            this.AverageRating = averageRating;
            this.AlertAttendees = alertAttendees;
            this.AlertAuthor = alertAuthor;
            this.Locations = locations;
            this.Attendees = attendees;
            this.CustomFields = customFields;
            this.RelatedSymbols = relatedSymbols;
            this.RelatedRecords = relatedRecords;
            this.RelatedContacts = relatedContacts;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name = "start", EmitDefaultValue = true)]
        public string Start { get; set; }

        /// <summary>
        /// Gets or Sets End
        /// </summary>
        [DataMember(Name = "end", EmitDefaultValue = true)]
        public string End { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name = "createdAt", EmitDefaultValue = true)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets AuthorId
        /// </summary>
        [DataMember(Name = "authorId", EmitDefaultValue = false)]
        public Guid AuthorId { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name = "title", EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Identifier
        /// </summary>
        [DataMember(Name = "identifier", EmitDefaultValue = true)]
        public string Identifier { get; set; }

        /// <summary>
        /// Gets or Sets Organizer
        /// </summary>
        [DataMember(Name = "organizer", EmitDefaultValue = true)]
        [Obsolete]
        public string Organizer { get; set; }

        /// <summary>
        /// Gets or Sets OrganizerId
        /// </summary>
        [DataMember(Name = "organizerId", EmitDefaultValue = false)]
        public Guid OrganizerId { get; set; }

        /// <summary>
        /// Gets or Sets Body
        /// </summary>
        [DataMember(Name = "body", EmitDefaultValue = true)]
        public string Body { get; set; }

        /// <summary>
        /// Gets or Sets AverageRating
        /// </summary>
        [DataMember(Name = "averageRating", EmitDefaultValue = true)]
        public int? AverageRating { get; set; }

        /// <summary>
        /// Gets or Sets AlertAttendees
        /// </summary>
        [DataMember(Name = "alertAttendees", EmitDefaultValue = true)]
        public bool AlertAttendees { get; set; }

        /// <summary>
        /// Gets or Sets AlertAuthor
        /// </summary>
        [DataMember(Name = "alertAuthor", EmitDefaultValue = true)]
        public bool AlertAuthor { get; set; }

        /// <summary>
        /// Gets or Sets Locations
        /// </summary>
        [DataMember(Name = "locations", EmitDefaultValue = true)]
        public List<LocationDto> Locations { get; set; }

        /// <summary>
        /// Gets or Sets Attendees
        /// </summary>
        [DataMember(Name = "attendees", EmitDefaultValue = true)]
        public List<AttendeeDto> Attendees { get; set; }

        /// <summary>
        /// Gets or Sets CustomFields
        /// </summary>
        [DataMember(Name = "customFields", EmitDefaultValue = true)]
        public List<CustomFieldValueDto> CustomFields { get; set; }

        /// <summary>
        /// Gets or Sets RelatedSymbols
        /// </summary>
        [DataMember(Name = "relatedSymbols", EmitDefaultValue = true)]
        public List<string> RelatedSymbols { get; set; }

        /// <summary>
        /// Gets or Sets RelatedRecords
        /// </summary>
        [DataMember(Name = "relatedRecords", EmitDefaultValue = true)]
        public RelatedRecordsDto RelatedRecords { get; set; }

        /// <summary>
        /// Gets or Sets RelatedContacts
        /// </summary>
        [DataMember(Name = "relatedContacts", EmitDefaultValue = true)]
        public List<Guid> RelatedContacts { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MeetingDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  AuthorId: ").Append(AuthorId).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  Organizer: ").Append(Organizer).Append("\n");
            sb.Append("  OrganizerId: ").Append(OrganizerId).Append("\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
            sb.Append("  AverageRating: ").Append(AverageRating).Append("\n");
            sb.Append("  AlertAttendees: ").Append(AlertAttendees).Append("\n");
            sb.Append("  AlertAuthor: ").Append(AlertAuthor).Append("\n");
            sb.Append("  Locations: ").Append(Locations).Append("\n");
            sb.Append("  Attendees: ").Append(Attendees).Append("\n");
            sb.Append("  CustomFields: ").Append(CustomFields).Append("\n");
            sb.Append("  RelatedSymbols: ").Append(RelatedSymbols).Append("\n");
            sb.Append("  RelatedRecords: ").Append(RelatedRecords).Append("\n");
            sb.Append("  RelatedContacts: ").Append(RelatedContacts).Append("\n");
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
            return this.Equals(input as MeetingDto);
        }

        /// <summary>
        /// Returns true if MeetingDto instances are equal
        /// </summary>
        /// <param name="input">Instance of MeetingDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MeetingDto input)
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
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.AuthorId == input.AuthorId ||
                    (this.AuthorId != null &&
                    this.AuthorId.Equals(input.AuthorId))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Identifier == input.Identifier ||
                    (this.Identifier != null &&
                    this.Identifier.Equals(input.Identifier))
                ) && 
                (
                    this.Organizer == input.Organizer ||
                    (this.Organizer != null &&
                    this.Organizer.Equals(input.Organizer))
                ) && 
                (
                    this.OrganizerId == input.OrganizerId ||
                    (this.OrganizerId != null &&
                    this.OrganizerId.Equals(input.OrganizerId))
                ) && 
                (
                    this.Body == input.Body ||
                    (this.Body != null &&
                    this.Body.Equals(input.Body))
                ) && 
                (
                    this.AverageRating == input.AverageRating ||
                    (this.AverageRating != null &&
                    this.AverageRating.Equals(input.AverageRating))
                ) && 
                (
                    this.AlertAttendees == input.AlertAttendees ||
                    this.AlertAttendees.Equals(input.AlertAttendees)
                ) && 
                (
                    this.AlertAuthor == input.AlertAuthor ||
                    this.AlertAuthor.Equals(input.AlertAuthor)
                ) && 
                (
                    this.Locations == input.Locations ||
                    this.Locations != null &&
                    input.Locations != null &&
                    this.Locations.SequenceEqual(input.Locations)
                ) && 
                (
                    this.Attendees == input.Attendees ||
                    this.Attendees != null &&
                    input.Attendees != null &&
                    this.Attendees.SequenceEqual(input.Attendees)
                ) && 
                (
                    this.CustomFields == input.CustomFields ||
                    this.CustomFields != null &&
                    input.CustomFields != null &&
                    this.CustomFields.SequenceEqual(input.CustomFields)
                ) && 
                (
                    this.RelatedSymbols == input.RelatedSymbols ||
                    this.RelatedSymbols != null &&
                    input.RelatedSymbols != null &&
                    this.RelatedSymbols.SequenceEqual(input.RelatedSymbols)
                ) && 
                (
                    this.RelatedRecords == input.RelatedRecords ||
                    (this.RelatedRecords != null &&
                    this.RelatedRecords.Equals(input.RelatedRecords))
                ) && 
                (
                    this.RelatedContacts == input.RelatedContacts ||
                    this.RelatedContacts != null &&
                    input.RelatedContacts != null &&
                    this.RelatedContacts.SequenceEqual(input.RelatedContacts)
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
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.AuthorId != null)
                {
                    hashCode = (hashCode * 59) + this.AuthorId.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Identifier != null)
                {
                    hashCode = (hashCode * 59) + this.Identifier.GetHashCode();
                }
                if (this.Organizer != null)
                {
                    hashCode = (hashCode * 59) + this.Organizer.GetHashCode();
                }
                if (this.OrganizerId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganizerId.GetHashCode();
                }
                if (this.Body != null)
                {
                    hashCode = (hashCode * 59) + this.Body.GetHashCode();
                }
                if (this.AverageRating != null)
                {
                    hashCode = (hashCode * 59) + this.AverageRating.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.AlertAttendees.GetHashCode();
                hashCode = (hashCode * 59) + this.AlertAuthor.GetHashCode();
                if (this.Locations != null)
                {
                    hashCode = (hashCode * 59) + this.Locations.GetHashCode();
                }
                if (this.Attendees != null)
                {
                    hashCode = (hashCode * 59) + this.Attendees.GetHashCode();
                }
                if (this.CustomFields != null)
                {
                    hashCode = (hashCode * 59) + this.CustomFields.GetHashCode();
                }
                if (this.RelatedSymbols != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedSymbols.GetHashCode();
                }
                if (this.RelatedRecords != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedRecords.GetHashCode();
                }
                if (this.RelatedContacts != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedContacts.GetHashCode();
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
