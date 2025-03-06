/*
 * EVENTS AND TRANSCRIPTS API
 *
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.2.0
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
using OpenAPIDateConverter = FactSet.SDK.EventsandTranscripts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.EventsandTranscripts.Model
{
    /// <summary>
    /// TranscriptObjectTimes
    /// </summary>
    [DataContract(Name = "TranscriptObjectTimes")]
    public partial class TranscriptObjectTimes : IEquatable<TranscriptObjectTimes>, IValidatableObject
    {
        /// <summary>
        /// Specifies the type of transcript.  
        /// </summary>
        /// <value>Specifies the type of transcript.  </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TranscriptTypeEnum
        {
            /// <summary>
            /// Enum NearRealTime for value: NearRealTime
            /// </summary>
            [EnumMember(Value = "NearRealTime")]
            NearRealTime = 1,

            /// <summary>
            /// Enum Raw for value: Raw
            /// </summary>
            [EnumMember(Value = "Raw")]
            Raw = 2,

            /// <summary>
            /// Enum Corrected for value: Corrected
            /// </summary>
            [EnumMember(Value = "Corrected")]
            Corrected = 3

        }


        /// <summary>
        /// Specifies the type of transcript.  
        /// </summary>
        /// <value>Specifies the type of transcript.  </value>
        [DataMember(Name = "transcriptType", EmitDefaultValue = false)]
        public TranscriptTypeEnum? TranscriptType { get; set; }
        /// <summary>
        /// Specifies the type of event. Choose from the available options. 
        /// </summary>
        /// <value>Specifies the type of event. Choose from the available options. </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EventTypeEnum
        {
            /// <summary>
            /// Enum Earnings for value: Earnings
            /// </summary>
            [EnumMember(Value = "Earnings")]
            Earnings = 1,

            /// <summary>
            /// Enum Guidance for value: Guidance
            /// </summary>
            [EnumMember(Value = "Guidance")]
            Guidance = 2,

            /// <summary>
            /// Enum AnalystsShareholdersMeeting for value: AnalystsShareholdersMeeting
            /// </summary>
            [EnumMember(Value = "AnalystsShareholdersMeeting")]
            AnalystsShareholdersMeeting = 3,

            /// <summary>
            /// Enum ConferencePresentation for value: ConferencePresentation
            /// </summary>
            [EnumMember(Value = "ConferencePresentation")]
            ConferencePresentation = 4,

            /// <summary>
            /// Enum SalesRevenue for value: SalesRevenue
            /// </summary>
            [EnumMember(Value = "SalesRevenue")]
            SalesRevenue = 5,

            /// <summary>
            /// Enum SpecialSituation for value: SpecialSituation
            /// </summary>
            [EnumMember(Value = "SpecialSituation")]
            SpecialSituation = 6,

            /// <summary>
            /// Enum SalesRevenueRelease for value: SalesRevenueRelease
            /// </summary>
            [EnumMember(Value = "SalesRevenueRelease")]
            SalesRevenueRelease = 7

        }


        /// <summary>
        /// Specifies the type of event. Choose from the available options. 
        /// </summary>
        /// <value>Specifies the type of event. Choose from the available options. </value>
        [DataMember(Name = "eventType", EmitDefaultValue = false)]
        public EventTypeEnum? EventType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="TranscriptObjectTimes" /> class.
        /// </summary>
        /// <param name="versionId">Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;..</param>
        /// <param name="primaryIds">Refers to the main companies a particular document pertains to..</param>
        /// <param name="allIds">Refers to all companies mentioned in the document. .</param>
        /// <param name="reportId">This is a unique identifier for a specific transcript (audio or video) returned..</param>
        /// <param name="eventId">ID of the conference call..</param>
        /// <param name="eventDate">The date when the event took place. Formatted as &#39;YYYY-MM-DD&#39;..</param>
        /// <param name="transcriptType">Specifies the type of transcript.  .</param>
        /// <param name="headline">Headline of the story..</param>
        /// <param name="storyDateTime">Refers to either the date and time of the story, which is in UTC.</param>
        /// <param name="uploadDateTime">It is the time when transcript is created, which is in UTC..</param>
        /// <param name="eventType">Specifies the type of event. Choose from the available options. .</param>
        /// <param name="categories">Categories are country, industry, and subject codes. This is a comma-separated list..</param>
        /// <param name="transcriptsLink">This is a link for downloading the document with an expiration duration of 24 hours..</param>
        public TranscriptObjectTimes(string versionId = default(string), List<string> primaryIds = default(List<string>), List<string> allIds = default(List<string>), string reportId = default(string), string eventId = default(string), DateTime eventDate = default(DateTime), TranscriptTypeEnum? transcriptType = default(TranscriptTypeEnum?), string headline = default(string), DateTime storyDateTime = default(DateTime), DateTime uploadDateTime = default(DateTime), EventTypeEnum? eventType = default(EventTypeEnum?), List<string> categories = default(List<string>), string transcriptsLink = default(string))
        {
            this.VersionId = versionId;
            this.PrimaryIds = primaryIds;
            this.AllIds = allIds;
            this.ReportId = reportId;
            this.EventId = eventId;
            this.EventDate = eventDate;
            this.TranscriptType = transcriptType;
            this.Headline = headline;
            this.StoryDateTime = storyDateTime;
            this.UploadDateTime = uploadDateTime;
            this.EventType = eventType;
            this.Categories = categories;
            this.TranscriptsLink = transcriptsLink;
        }

        /// <summary>
        /// Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;.
        /// </summary>
        /// <value>Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;.</value>
        [DataMember(Name = "versionId", EmitDefaultValue = false)]
        public string VersionId { get; set; }

        /// <summary>
        /// Refers to the main companies a particular document pertains to.
        /// </summary>
        /// <value>Refers to the main companies a particular document pertains to.</value>
        [DataMember(Name = "primaryIds", EmitDefaultValue = false)]
        public List<string> PrimaryIds { get; set; }

        /// <summary>
        /// Refers to all companies mentioned in the document. 
        /// </summary>
        /// <value>Refers to all companies mentioned in the document. </value>
        [DataMember(Name = "allIds", EmitDefaultValue = false)]
        public List<string> AllIds { get; set; }

        /// <summary>
        /// This is a unique identifier for a specific transcript (audio or video) returned.
        /// </summary>
        /// <value>This is a unique identifier for a specific transcript (audio or video) returned.</value>
        [DataMember(Name = "reportId", EmitDefaultValue = false)]
        public string ReportId { get; set; }

        /// <summary>
        /// ID of the conference call.
        /// </summary>
        /// <value>ID of the conference call.</value>
        [DataMember(Name = "eventId", EmitDefaultValue = false)]
        public string EventId { get; set; }

        /// <summary>
        /// The date when the event took place. Formatted as &#39;YYYY-MM-DD&#39;.
        /// </summary>
        /// <value>The date when the event took place. Formatted as &#39;YYYY-MM-DD&#39;.</value>
        [DataMember(Name = "eventDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime EventDate { get; set; }

        /// <summary>
        /// Headline of the story.
        /// </summary>
        /// <value>Headline of the story.</value>
        [DataMember(Name = "headline", EmitDefaultValue = false)]
        public string Headline { get; set; }

        /// <summary>
        /// Refers to either the date and time of the story, which is in UTC
        /// </summary>
        /// <value>Refers to either the date and time of the story, which is in UTC</value>
        [DataMember(Name = "storyDateTime", EmitDefaultValue = false)]
        public DateTime StoryDateTime { get; set; }

        /// <summary>
        /// It is the time when transcript is created, which is in UTC.
        /// </summary>
        /// <value>It is the time when transcript is created, which is in UTC.</value>
        [DataMember(Name = "uploadDateTime", EmitDefaultValue = false)]
        public DateTime UploadDateTime { get; set; }

        /// <summary>
        /// Categories are country, industry, and subject codes. This is a comma-separated list.
        /// </summary>
        /// <value>Categories are country, industry, and subject codes. This is a comma-separated list.</value>
        [DataMember(Name = "categories", EmitDefaultValue = false)]
        public List<string> Categories { get; set; }

        /// <summary>
        /// This is a link for downloading the document with an expiration duration of 24 hours.
        /// </summary>
        /// <value>This is a link for downloading the document with an expiration duration of 24 hours.</value>
        [DataMember(Name = "transcriptsLink", EmitDefaultValue = false)]
        public string TranscriptsLink { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TranscriptObjectTimes {\n");
            sb.Append("  VersionId: ").Append(VersionId).Append("\n");
            sb.Append("  PrimaryIds: ").Append(PrimaryIds).Append("\n");
            sb.Append("  AllIds: ").Append(AllIds).Append("\n");
            sb.Append("  ReportId: ").Append(ReportId).Append("\n");
            sb.Append("  EventId: ").Append(EventId).Append("\n");
            sb.Append("  EventDate: ").Append(EventDate).Append("\n");
            sb.Append("  TranscriptType: ").Append(TranscriptType).Append("\n");
            sb.Append("  Headline: ").Append(Headline).Append("\n");
            sb.Append("  StoryDateTime: ").Append(StoryDateTime).Append("\n");
            sb.Append("  UploadDateTime: ").Append(UploadDateTime).Append("\n");
            sb.Append("  EventType: ").Append(EventType).Append("\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  TranscriptsLink: ").Append(TranscriptsLink).Append("\n");
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
            return this.Equals(input as TranscriptObjectTimes);
        }

        /// <summary>
        /// Returns true if TranscriptObjectTimes instances are equal
        /// </summary>
        /// <param name="input">Instance of TranscriptObjectTimes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TranscriptObjectTimes input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.VersionId == input.VersionId ||
                    (this.VersionId != null &&
                    this.VersionId.Equals(input.VersionId))
                ) && 
                (
                    this.PrimaryIds == input.PrimaryIds ||
                    this.PrimaryIds != null &&
                    input.PrimaryIds != null &&
                    this.PrimaryIds.SequenceEqual(input.PrimaryIds)
                ) && 
                (
                    this.AllIds == input.AllIds ||
                    this.AllIds != null &&
                    input.AllIds != null &&
                    this.AllIds.SequenceEqual(input.AllIds)
                ) && 
                (
                    this.ReportId == input.ReportId ||
                    (this.ReportId != null &&
                    this.ReportId.Equals(input.ReportId))
                ) && 
                (
                    this.EventId == input.EventId ||
                    (this.EventId != null &&
                    this.EventId.Equals(input.EventId))
                ) && 
                (
                    this.EventDate == input.EventDate ||
                    (this.EventDate != null &&
                    this.EventDate.Equals(input.EventDate))
                ) && 
                (
                    this.TranscriptType == input.TranscriptType ||
                    this.TranscriptType.Equals(input.TranscriptType)
                ) && 
                (
                    this.Headline == input.Headline ||
                    (this.Headline != null &&
                    this.Headline.Equals(input.Headline))
                ) && 
                (
                    this.StoryDateTime == input.StoryDateTime ||
                    (this.StoryDateTime != null &&
                    this.StoryDateTime.Equals(input.StoryDateTime))
                ) && 
                (
                    this.UploadDateTime == input.UploadDateTime ||
                    (this.UploadDateTime != null &&
                    this.UploadDateTime.Equals(input.UploadDateTime))
                ) && 
                (
                    this.EventType == input.EventType ||
                    this.EventType.Equals(input.EventType)
                ) && 
                (
                    this.Categories == input.Categories ||
                    this.Categories != null &&
                    input.Categories != null &&
                    this.Categories.SequenceEqual(input.Categories)
                ) && 
                (
                    this.TranscriptsLink == input.TranscriptsLink ||
                    (this.TranscriptsLink != null &&
                    this.TranscriptsLink.Equals(input.TranscriptsLink))
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
                if (this.VersionId != null)
                {
                    hashCode = (hashCode * 59) + this.VersionId.GetHashCode();
                }
                if (this.PrimaryIds != null)
                {
                    hashCode = (hashCode * 59) + this.PrimaryIds.GetHashCode();
                }
                if (this.AllIds != null)
                {
                    hashCode = (hashCode * 59) + this.AllIds.GetHashCode();
                }
                if (this.ReportId != null)
                {
                    hashCode = (hashCode * 59) + this.ReportId.GetHashCode();
                }
                if (this.EventId != null)
                {
                    hashCode = (hashCode * 59) + this.EventId.GetHashCode();
                }
                if (this.EventDate != null)
                {
                    hashCode = (hashCode * 59) + this.EventDate.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TranscriptType.GetHashCode();
                if (this.Headline != null)
                {
                    hashCode = (hashCode * 59) + this.Headline.GetHashCode();
                }
                if (this.StoryDateTime != null)
                {
                    hashCode = (hashCode * 59) + this.StoryDateTime.GetHashCode();
                }
                if (this.UploadDateTime != null)
                {
                    hashCode = (hashCode * 59) + this.UploadDateTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.EventType.GetHashCode();
                if (this.Categories != null)
                {
                    hashCode = (hashCode * 59) + this.Categories.GetHashCode();
                }
                if (this.TranscriptsLink != null)
                {
                    hashCode = (hashCode * 59) + this.TranscriptsLink.GetHashCode();
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
