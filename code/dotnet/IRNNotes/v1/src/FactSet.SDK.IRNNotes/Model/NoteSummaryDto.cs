/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.IRNNotes.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNNotes.Model
{
    /// <summary>
    /// NoteSummaryDto
    /// </summary>
    [DataContract(Name = "NoteSummaryDto")]
    public partial class NoteSummaryDto : IEquatable<NoteSummaryDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NoteSummaryDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="date">date.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="authorId">authorId.</param>
        /// <param name="contributorId">contributorId.</param>
        /// <param name="title">title.</param>
        /// <param name="identifier">identifier.</param>
        /// <param name="subjectId">subjectId.</param>
        /// <param name="isPersonal">isPersonal.</param>
        /// <param name="state">state.</param>
        /// <param name="approvalStatus">approvalStatus.</param>
        /// <param name="attachmentIds">attachmentIds.</param>
        /// <param name="relatedSymbols">relatedSymbols.</param>
        /// <param name="recommendationId">recommendationId.</param>
        /// <param name="sentimentId">sentimentId.</param>
        /// <param name="customFields">customFields.</param>
        public NoteSummaryDto(Guid id = default(Guid), string date = default(string), string createdAt = default(string), Guid authorId = default(Guid), Guid contributorId = default(Guid), string title = default(string), string identifier = default(string), Guid subjectId = default(Guid), bool isPersonal = default(bool), string state = default(string), string approvalStatus = default(string), List<Guid> attachmentIds = default(List<Guid>), List<string> relatedSymbols = default(List<string>), Guid recommendationId = default(Guid), Guid sentimentId = default(Guid), List<CustomFieldValueDto> customFields = default(List<CustomFieldValueDto>))
        {
            this.Id = id;
            this.Date = date;
            this.CreatedAt = createdAt;
            this.AuthorId = authorId;
            this.ContributorId = contributorId;
            this.Title = title;
            this.Identifier = identifier;
            this.SubjectId = subjectId;
            this.IsPersonal = isPersonal;
            this.State = state;
            this.ApprovalStatus = approvalStatus;
            this.AttachmentIds = attachmentIds;
            this.RelatedSymbols = relatedSymbols;
            this.RecommendationId = recommendationId;
            this.SentimentId = sentimentId;
            this.CustomFields = customFields;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name = "date", EmitDefaultValue = true)]
        public string Date { get; set; }

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
        /// Gets or Sets ContributorId
        /// </summary>
        [DataMember(Name = "contributorId", EmitDefaultValue = false)]
        public Guid ContributorId { get; set; }

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
        /// Gets or Sets SubjectId
        /// </summary>
        [DataMember(Name = "subjectId", EmitDefaultValue = false)]
        public Guid SubjectId { get; set; }

        /// <summary>
        /// Gets or Sets IsPersonal
        /// </summary>
        [DataMember(Name = "isPersonal", EmitDefaultValue = true)]
        public bool IsPersonal { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name = "state", EmitDefaultValue = true)]
        public string State { get; set; }

        /// <summary>
        /// Gets or Sets ApprovalStatus
        /// </summary>
        [DataMember(Name = "approvalStatus", EmitDefaultValue = true)]
        public string ApprovalStatus { get; set; }

        /// <summary>
        /// Gets or Sets AttachmentIds
        /// </summary>
        [DataMember(Name = "attachmentIds", EmitDefaultValue = true)]
        public List<Guid> AttachmentIds { get; set; }

        /// <summary>
        /// Gets or Sets RelatedSymbols
        /// </summary>
        [DataMember(Name = "relatedSymbols", EmitDefaultValue = true)]
        public List<string> RelatedSymbols { get; set; }

        /// <summary>
        /// Gets or Sets RecommendationId
        /// </summary>
        [DataMember(Name = "recommendationId", EmitDefaultValue = false)]
        public Guid RecommendationId { get; set; }

        /// <summary>
        /// Gets or Sets SentimentId
        /// </summary>
        [DataMember(Name = "sentimentId", EmitDefaultValue = false)]
        public Guid SentimentId { get; set; }

        /// <summary>
        /// Gets or Sets CustomFields
        /// </summary>
        [DataMember(Name = "customFields", EmitDefaultValue = true)]
        public List<CustomFieldValueDto> CustomFields { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NoteSummaryDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  AuthorId: ").Append(AuthorId).Append("\n");
            sb.Append("  ContributorId: ").Append(ContributorId).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  SubjectId: ").Append(SubjectId).Append("\n");
            sb.Append("  IsPersonal: ").Append(IsPersonal).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  ApprovalStatus: ").Append(ApprovalStatus).Append("\n");
            sb.Append("  AttachmentIds: ").Append(AttachmentIds).Append("\n");
            sb.Append("  RelatedSymbols: ").Append(RelatedSymbols).Append("\n");
            sb.Append("  RecommendationId: ").Append(RecommendationId).Append("\n");
            sb.Append("  SentimentId: ").Append(SentimentId).Append("\n");
            sb.Append("  CustomFields: ").Append(CustomFields).Append("\n");
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
            return this.Equals(input as NoteSummaryDto);
        }

        /// <summary>
        /// Returns true if NoteSummaryDto instances are equal
        /// </summary>
        /// <param name="input">Instance of NoteSummaryDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NoteSummaryDto input)
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
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
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
                    this.ContributorId == input.ContributorId ||
                    (this.ContributorId != null &&
                    this.ContributorId.Equals(input.ContributorId))
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
                    this.SubjectId == input.SubjectId ||
                    (this.SubjectId != null &&
                    this.SubjectId.Equals(input.SubjectId))
                ) && 
                (
                    this.IsPersonal == input.IsPersonal ||
                    this.IsPersonal.Equals(input.IsPersonal)
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.ApprovalStatus == input.ApprovalStatus ||
                    (this.ApprovalStatus != null &&
                    this.ApprovalStatus.Equals(input.ApprovalStatus))
                ) && 
                (
                    this.AttachmentIds == input.AttachmentIds ||
                    this.AttachmentIds != null &&
                    input.AttachmentIds != null &&
                    this.AttachmentIds.SequenceEqual(input.AttachmentIds)
                ) && 
                (
                    this.RelatedSymbols == input.RelatedSymbols ||
                    this.RelatedSymbols != null &&
                    input.RelatedSymbols != null &&
                    this.RelatedSymbols.SequenceEqual(input.RelatedSymbols)
                ) && 
                (
                    this.RecommendationId == input.RecommendationId ||
                    (this.RecommendationId != null &&
                    this.RecommendationId.Equals(input.RecommendationId))
                ) && 
                (
                    this.SentimentId == input.SentimentId ||
                    (this.SentimentId != null &&
                    this.SentimentId.Equals(input.SentimentId))
                ) && 
                (
                    this.CustomFields == input.CustomFields ||
                    this.CustomFields != null &&
                    input.CustomFields != null &&
                    this.CustomFields.SequenceEqual(input.CustomFields)
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
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.AuthorId != null)
                {
                    hashCode = (hashCode * 59) + this.AuthorId.GetHashCode();
                }
                if (this.ContributorId != null)
                {
                    hashCode = (hashCode * 59) + this.ContributorId.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Identifier != null)
                {
                    hashCode = (hashCode * 59) + this.Identifier.GetHashCode();
                }
                if (this.SubjectId != null)
                {
                    hashCode = (hashCode * 59) + this.SubjectId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsPersonal.GetHashCode();
                if (this.State != null)
                {
                    hashCode = (hashCode * 59) + this.State.GetHashCode();
                }
                if (this.ApprovalStatus != null)
                {
                    hashCode = (hashCode * 59) + this.ApprovalStatus.GetHashCode();
                }
                if (this.AttachmentIds != null)
                {
                    hashCode = (hashCode * 59) + this.AttachmentIds.GetHashCode();
                }
                if (this.RelatedSymbols != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedSymbols.GetHashCode();
                }
                if (this.RecommendationId != null)
                {
                    hashCode = (hashCode * 59) + this.RecommendationId.GetHashCode();
                }
                if (this.SentimentId != null)
                {
                    hashCode = (hashCode * 59) + this.SentimentId.GetHashCode();
                }
                if (this.CustomFields != null)
                {
                    hashCode = (hashCode * 59) + this.CustomFields.GetHashCode();
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
