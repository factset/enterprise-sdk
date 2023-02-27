/*
 * Documents Distributor - CallStreet Events
 *
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.8.2
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
using OpenAPIDateConverter = FactSet.SDK.DocumentsDistributorCallStreetEvents.Client.OpenAPIDateConverter;

namespace FactSet.SDK.DocumentsDistributorCallStreetEvents.Model
{
    /// <summary>
    /// EventsAudio400ResponseDetailsValidParameters
    /// </summary>
    [DataContract(Name = "Events_Audio_400_Response_details_validParameters")]
    public partial class EventsAudio400ResponseDetailsValidParameters : IEquatable<EventsAudio400ResponseDetailsValidParameters>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EventsAudio400ResponseDetailsValidParameters" /> class.
        /// </summary>
        /// <param name="sort">sort.</param>
        /// <param name="paginationLimit">paginationLimit.</param>
        /// <param name="paginationOffset">paginationOffset.</param>
        /// <param name="reportId">reportId.</param>
        /// <param name="startDate">startDate.</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="ids">ids.</param>
        /// <param name="sourceCode">sourceCode.</param>
        /// <param name="fileName">fileName.</param>
        /// <param name="trimmed">trimmed.</param>
        /// <param name="uploadTime">uploadTime.</param>
        /// <param name="audioSourceId">audioSourceId.</param>
        public EventsAudio400ResponseDetailsValidParameters(List<string> sort = default(List<string>), List<string> paginationLimit = default(List<string>), List<string> paginationOffset = default(List<string>), List<string> reportId = default(List<string>), List<string> startDate = default(List<string>), List<string> endDate = default(List<string>), List<string> ids = default(List<string>), List<string> sourceCode = default(List<string>), List<string> fileName = default(List<string>), List<string> trimmed = default(List<string>), List<string> uploadTime = default(List<string>), List<string> audioSourceId = default(List<string>))
        {
            this.Sort = sort;
            this.PaginationLimit = paginationLimit;
            this.PaginationOffset = paginationOffset;
            this.ReportId = reportId;
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.Ids = ids;
            this.SourceCode = sourceCode;
            this.FileName = fileName;
            this.Trimmed = trimmed;
            this.UploadTime = uploadTime;
            this.AudioSourceId = audioSourceId;
        }

        /// <summary>
        /// Gets or Sets Sort
        /// </summary>
        [DataMember(Name = "_sort", EmitDefaultValue = false)]
        public List<string> Sort { get; set; }

        /// <summary>
        /// Gets or Sets PaginationLimit
        /// </summary>
        [DataMember(Name = "_paginationLimit", EmitDefaultValue = false)]
        public List<string> PaginationLimit { get; set; }

        /// <summary>
        /// Gets or Sets PaginationOffset
        /// </summary>
        [DataMember(Name = "_paginationOffset", EmitDefaultValue = false)]
        public List<string> PaginationOffset { get; set; }

        /// <summary>
        /// Gets or Sets ReportId
        /// </summary>
        [DataMember(Name = "reportId", EmitDefaultValue = false)]
        public List<string> ReportId { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name = "startDate", EmitDefaultValue = false)]
        public List<string> StartDate { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name = "endDate", EmitDefaultValue = false)]
        public List<string> EndDate { get; set; }

        /// <summary>
        /// Gets or Sets Ids
        /// </summary>
        [DataMember(Name = "ids", EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Gets or Sets SourceCode
        /// </summary>
        [DataMember(Name = "sourceCode", EmitDefaultValue = false)]
        public List<string> SourceCode { get; set; }

        /// <summary>
        /// Gets or Sets FileName
        /// </summary>
        [DataMember(Name = "fileName", EmitDefaultValue = false)]
        public List<string> FileName { get; set; }

        /// <summary>
        /// Gets or Sets Trimmed
        /// </summary>
        [DataMember(Name = "trimmed", EmitDefaultValue = false)]
        public List<string> Trimmed { get; set; }

        /// <summary>
        /// Gets or Sets UploadTime
        /// </summary>
        [DataMember(Name = "uploadTime", EmitDefaultValue = false)]
        public List<string> UploadTime { get; set; }

        /// <summary>
        /// Gets or Sets AudioSourceId
        /// </summary>
        [DataMember(Name = "audioSourceId", EmitDefaultValue = false)]
        public List<string> AudioSourceId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EventsAudio400ResponseDetailsValidParameters {\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
            sb.Append("  PaginationLimit: ").Append(PaginationLimit).Append("\n");
            sb.Append("  PaginationOffset: ").Append(PaginationOffset).Append("\n");
            sb.Append("  ReportId: ").Append(ReportId).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  SourceCode: ").Append(SourceCode).Append("\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  Trimmed: ").Append(Trimmed).Append("\n");
            sb.Append("  UploadTime: ").Append(UploadTime).Append("\n");
            sb.Append("  AudioSourceId: ").Append(AudioSourceId).Append("\n");
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
            return this.Equals(input as EventsAudio400ResponseDetailsValidParameters);
        }

        /// <summary>
        /// Returns true if EventsAudio400ResponseDetailsValidParameters instances are equal
        /// </summary>
        /// <param name="input">Instance of EventsAudio400ResponseDetailsValidParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EventsAudio400ResponseDetailsValidParameters input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sort == input.Sort ||
                    this.Sort != null &&
                    input.Sort != null &&
                    this.Sort.SequenceEqual(input.Sort)
                ) && 
                (
                    this.PaginationLimit == input.PaginationLimit ||
                    this.PaginationLimit != null &&
                    input.PaginationLimit != null &&
                    this.PaginationLimit.SequenceEqual(input.PaginationLimit)
                ) && 
                (
                    this.PaginationOffset == input.PaginationOffset ||
                    this.PaginationOffset != null &&
                    input.PaginationOffset != null &&
                    this.PaginationOffset.SequenceEqual(input.PaginationOffset)
                ) && 
                (
                    this.ReportId == input.ReportId ||
                    this.ReportId != null &&
                    input.ReportId != null &&
                    this.ReportId.SequenceEqual(input.ReportId)
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    this.StartDate != null &&
                    input.StartDate != null &&
                    this.StartDate.SequenceEqual(input.StartDate)
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    this.EndDate != null &&
                    input.EndDate != null &&
                    this.EndDate.SequenceEqual(input.EndDate)
                ) && 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.SourceCode == input.SourceCode ||
                    this.SourceCode != null &&
                    input.SourceCode != null &&
                    this.SourceCode.SequenceEqual(input.SourceCode)
                ) && 
                (
                    this.FileName == input.FileName ||
                    this.FileName != null &&
                    input.FileName != null &&
                    this.FileName.SequenceEqual(input.FileName)
                ) && 
                (
                    this.Trimmed == input.Trimmed ||
                    this.Trimmed != null &&
                    input.Trimmed != null &&
                    this.Trimmed.SequenceEqual(input.Trimmed)
                ) && 
                (
                    this.UploadTime == input.UploadTime ||
                    this.UploadTime != null &&
                    input.UploadTime != null &&
                    this.UploadTime.SequenceEqual(input.UploadTime)
                ) && 
                (
                    this.AudioSourceId == input.AudioSourceId ||
                    this.AudioSourceId != null &&
                    input.AudioSourceId != null &&
                    this.AudioSourceId.SequenceEqual(input.AudioSourceId)
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
                if (this.Sort != null)
                {
                    hashCode = (hashCode * 59) + this.Sort.GetHashCode();
                }
                if (this.PaginationLimit != null)
                {
                    hashCode = (hashCode * 59) + this.PaginationLimit.GetHashCode();
                }
                if (this.PaginationOffset != null)
                {
                    hashCode = (hashCode * 59) + this.PaginationOffset.GetHashCode();
                }
                if (this.ReportId != null)
                {
                    hashCode = (hashCode * 59) + this.ReportId.GetHashCode();
                }
                if (this.StartDate != null)
                {
                    hashCode = (hashCode * 59) + this.StartDate.GetHashCode();
                }
                if (this.EndDate != null)
                {
                    hashCode = (hashCode * 59) + this.EndDate.GetHashCode();
                }
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
                }
                if (this.SourceCode != null)
                {
                    hashCode = (hashCode * 59) + this.SourceCode.GetHashCode();
                }
                if (this.FileName != null)
                {
                    hashCode = (hashCode * 59) + this.FileName.GetHashCode();
                }
                if (this.Trimmed != null)
                {
                    hashCode = (hashCode * 59) + this.Trimmed.GetHashCode();
                }
                if (this.UploadTime != null)
                {
                    hashCode = (hashCode * 59) + this.UploadTime.GetHashCode();
                }
                if (this.AudioSourceId != null)
                {
                    hashCode = (hashCode * 59) + this.AudioSourceId.GetHashCode();
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
