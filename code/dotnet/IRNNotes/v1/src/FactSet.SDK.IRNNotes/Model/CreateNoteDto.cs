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
    /// CreateNoteDto
    /// </summary>
    [DataContract(Name = "CreateNoteDto")]
    public partial class CreateNoteDto : IEquatable<CreateNoteDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateNoteDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateNoteDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateNoteDto" /> class.
        /// </summary>
        /// <param name="author">author (required).</param>
        /// <param name="title">title.</param>
        /// <param name="identifier">identifier.</param>
        /// <param name="date">date (required).</param>
        /// <param name="subjectId">subjectId.</param>
        /// <param name="recommendationId">recommendationId.</param>
        /// <param name="sentimentId">sentimentId.</param>
        /// <param name="body">body.</param>
        /// <param name="source">source.</param>
        /// <param name="link">link.</param>
        /// <param name="relatedSymbols">relatedSymbols.</param>
        /// <param name="relatedContacts">relatedContacts.</param>
        /// <param name="relatedRecords">relatedRecords.</param>
        /// <param name="customFieldValues">customFieldValues.</param>
        /// <param name="isPersonal">isPersonal (default to false).</param>
        public CreateNoteDto(UserSerialDto author, string date,string title = default(string), string identifier = default(string), Guid? subjectId = default(Guid?), Guid? recommendationId = default(Guid?), Guid? sentimentId = default(Guid?), CreateBodyDto body = default(CreateBodyDto), string source = default(string), string link = default(string), List<string> relatedSymbols = default(List<string>), List<Guid> relatedContacts = default(List<Guid>), RelatedRecordsDto relatedRecords = default(RelatedRecordsDto), List<CreateCustomFieldValueDto> customFieldValues = default(List<CreateCustomFieldValueDto>), bool isPersonal = false)
        {
            // to ensure "author" is required (not null)
            if (author == null) {
                throw new ArgumentNullException("author is a required property for CreateNoteDto and cannot be null");
            }
            this.Author = author;
            // to ensure "date" is required (not null)
            if (date == null) {
                throw new ArgumentNullException("date is a required property for CreateNoteDto and cannot be null");
            }
            this.Date = date;
            this.Title = title;
            this.Identifier = identifier;
            this.SubjectId = subjectId;
            this.RecommendationId = recommendationId;
            this.SentimentId = sentimentId;
            this.Body = body;
            this.Source = source;
            this.Link = link;
            this.RelatedSymbols = relatedSymbols;
            this.RelatedContacts = relatedContacts;
            this.RelatedRecords = relatedRecords;
            this.CustomFieldValues = customFieldValues;
            this.IsPersonal = isPersonal;
        }

        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [DataMember(Name = "author", IsRequired = true, EmitDefaultValue = true)]
        public UserSerialDto Author { get; set; }

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
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name = "date", IsRequired = true, EmitDefaultValue = false)]
        public string Date { get; set; }

        /// <summary>
        /// Gets or Sets SubjectId
        /// </summary>
        [DataMember(Name = "subjectId", EmitDefaultValue = true)]
        public Guid? SubjectId { get; set; }

        /// <summary>
        /// Gets or Sets RecommendationId
        /// </summary>
        [DataMember(Name = "recommendationId", EmitDefaultValue = true)]
        public Guid? RecommendationId { get; set; }

        /// <summary>
        /// Gets or Sets SentimentId
        /// </summary>
        [DataMember(Name = "sentimentId", EmitDefaultValue = true)]
        public Guid? SentimentId { get; set; }

        /// <summary>
        /// Gets or Sets Body
        /// </summary>
        [DataMember(Name = "body", EmitDefaultValue = true)]
        public CreateBodyDto Body { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [DataMember(Name = "source", EmitDefaultValue = true)]
        public string Source { get; set; }

        /// <summary>
        /// Gets or Sets Link
        /// </summary>
        [DataMember(Name = "link", EmitDefaultValue = true)]
        public string Link { get; set; }

        /// <summary>
        /// Gets or Sets RelatedSymbols
        /// </summary>
        [DataMember(Name = "relatedSymbols", EmitDefaultValue = true)]
        public List<string> RelatedSymbols { get; set; }

        /// <summary>
        /// Gets or Sets RelatedContacts
        /// </summary>
        [DataMember(Name = "relatedContacts", EmitDefaultValue = true)]
        public List<Guid> RelatedContacts { get; set; }

        /// <summary>
        /// Gets or Sets RelatedRecords
        /// </summary>
        [DataMember(Name = "relatedRecords", EmitDefaultValue = true)]
        public RelatedRecordsDto RelatedRecords { get; set; }

        /// <summary>
        /// Gets or Sets CustomFieldValues
        /// </summary>
        [DataMember(Name = "customFieldValues", EmitDefaultValue = true)]
        public List<CreateCustomFieldValueDto> CustomFieldValues { get; set; }

        /// <summary>
        /// Gets or Sets IsPersonal
        /// </summary>
        [DataMember(Name = "isPersonal", EmitDefaultValue = true)]
        public bool IsPersonal { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateNoteDto {\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  SubjectId: ").Append(SubjectId).Append("\n");
            sb.Append("  RecommendationId: ").Append(RecommendationId).Append("\n");
            sb.Append("  SentimentId: ").Append(SentimentId).Append("\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Link: ").Append(Link).Append("\n");
            sb.Append("  RelatedSymbols: ").Append(RelatedSymbols).Append("\n");
            sb.Append("  RelatedContacts: ").Append(RelatedContacts).Append("\n");
            sb.Append("  RelatedRecords: ").Append(RelatedRecords).Append("\n");
            sb.Append("  CustomFieldValues: ").Append(CustomFieldValues).Append("\n");
            sb.Append("  IsPersonal: ").Append(IsPersonal).Append("\n");
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
            return this.Equals(input as CreateNoteDto);
        }

        /// <summary>
        /// Returns true if CreateNoteDto instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateNoteDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateNoteDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Author == input.Author ||
                    (this.Author != null &&
                    this.Author.Equals(input.Author))
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
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.SubjectId == input.SubjectId ||
                    (this.SubjectId != null &&
                    this.SubjectId.Equals(input.SubjectId))
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
                    this.Body == input.Body ||
                    (this.Body != null &&
                    this.Body.Equals(input.Body))
                ) && 
                (
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
                ) && 
                (
                    this.Link == input.Link ||
                    (this.Link != null &&
                    this.Link.Equals(input.Link))
                ) && 
                (
                    this.RelatedSymbols == input.RelatedSymbols ||
                    this.RelatedSymbols != null &&
                    input.RelatedSymbols != null &&
                    this.RelatedSymbols.SequenceEqual(input.RelatedSymbols)
                ) && 
                (
                    this.RelatedContacts == input.RelatedContacts ||
                    this.RelatedContacts != null &&
                    input.RelatedContacts != null &&
                    this.RelatedContacts.SequenceEqual(input.RelatedContacts)
                ) && 
                (
                    this.RelatedRecords == input.RelatedRecords ||
                    (this.RelatedRecords != null &&
                    this.RelatedRecords.Equals(input.RelatedRecords))
                ) && 
                (
                    this.CustomFieldValues == input.CustomFieldValues ||
                    this.CustomFieldValues != null &&
                    input.CustomFieldValues != null &&
                    this.CustomFieldValues.SequenceEqual(input.CustomFieldValues)
                ) && 
                (
                    this.IsPersonal == input.IsPersonal ||
                    this.IsPersonal.Equals(input.IsPersonal)
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
                if (this.Author != null)
                {
                    hashCode = (hashCode * 59) + this.Author.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Identifier != null)
                {
                    hashCode = (hashCode * 59) + this.Identifier.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.SubjectId != null)
                {
                    hashCode = (hashCode * 59) + this.SubjectId.GetHashCode();
                }
                if (this.RecommendationId != null)
                {
                    hashCode = (hashCode * 59) + this.RecommendationId.GetHashCode();
                }
                if (this.SentimentId != null)
                {
                    hashCode = (hashCode * 59) + this.SentimentId.GetHashCode();
                }
                if (this.Body != null)
                {
                    hashCode = (hashCode * 59) + this.Body.GetHashCode();
                }
                if (this.Source != null)
                {
                    hashCode = (hashCode * 59) + this.Source.GetHashCode();
                }
                if (this.Link != null)
                {
                    hashCode = (hashCode * 59) + this.Link.GetHashCode();
                }
                if (this.RelatedSymbols != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedSymbols.GetHashCode();
                }
                if (this.RelatedContacts != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedContacts.GetHashCode();
                }
                if (this.RelatedRecords != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedRecords.GetHashCode();
                }
                if (this.CustomFieldValues != null)
                {
                    hashCode = (hashCode * 59) + this.CustomFieldValues.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsPersonal.GetHashCode();
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
            // Title (string) maxLength
            if (this.Title != null && this.Title.Length > 255)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Title, length must be less than 255.", new [] { "Title" });
            }

            // Title (string) minLength
            if (this.Title != null && this.Title.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Title, length must be greater than 0.", new [] { "Title" });
            }

            // Date (string) minLength
            if (this.Date != null && this.Date.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Date, length must be greater than 1.", new [] { "Date" });
            }

            // Link (string) maxLength
            if (this.Link != null && this.Link.Length > 255)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Link, length must be less than 255.", new [] { "Link" });
            }

            // Link (string) minLength
            if (this.Link != null && this.Link.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Link, length must be greater than 0.", new [] { "Link" });
            }

            yield break;
        }
    }

}
