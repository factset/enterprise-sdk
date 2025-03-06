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
    /// NrtCallsObject
    /// </summary>
    [DataContract(Name = "NrtCallsObject")]
    public partial class NrtCallsObject : IEquatable<NrtCallsObject>, IValidatableObject
    {
        /// <summary>
        /// Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast.
        /// </summary>
        /// <value>Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SourceCodeEnum
        {
            /// <summary>
            /// Enum PhoneReplay for value: PhoneReplay
            /// </summary>
            [EnumMember(Value = "PhoneReplay")]
            PhoneReplay = 1,

            /// <summary>
            /// Enum Webcast for value: Webcast
            /// </summary>
            [EnumMember(Value = "Webcast")]
            Webcast = 2

        }


        /// <summary>
        /// Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast.
        /// </summary>
        /// <value>Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast.</value>
        [DataMember(Name = "sourceCode", EmitDefaultValue = true)]
        public SourceCodeEnum? SourceCode { get; set; }
        /// <summary>
        /// Refers to the various event types covered by FactSet CallStreet.
        /// </summary>
        /// <value>Refers to the various event types covered by FactSet CallStreet.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EventTypeEnum
        {
            /// <summary>
            /// Enum AnalystsInvestorsShareholdersMeeting for value: AnalystsInvestorsShareholdersMeeting
            /// </summary>
            [EnumMember(Value = "AnalystsInvestorsShareholdersMeeting")]
            AnalystsInvestorsShareholdersMeeting = 1,

            /// <summary>
            /// Enum EarningsCall for value: EarningsCall
            /// </summary>
            [EnumMember(Value = "EarningsCall")]
            EarningsCall = 2,

            /// <summary>
            /// Enum EarningsRelease for value: EarningsRelease
            /// </summary>
            [EnumMember(Value = "EarningsRelease")]
            EarningsRelease = 3,

            /// <summary>
            /// Enum Guidance for value: Guidance
            /// </summary>
            [EnumMember(Value = "Guidance")]
            Guidance = 4,

            /// <summary>
            /// Enum SalesRevenueCall for value: SalesRevenueCall
            /// </summary>
            [EnumMember(Value = "SalesRevenueCall")]
            SalesRevenueCall = 5,

            /// <summary>
            /// Enum SalesRevenueRelease for value: SalesRevenueRelease
            /// </summary>
            [EnumMember(Value = "SalesRevenueRelease")]
            SalesRevenueRelease = 6,

            /// <summary>
            /// Enum SpecialSituation for value: SpecialSituation
            /// </summary>
            [EnumMember(Value = "SpecialSituation")]
            SpecialSituation = 7

        }


        /// <summary>
        /// Refers to the various event types covered by FactSet CallStreet.
        /// </summary>
        /// <value>Refers to the various event types covered by FactSet CallStreet.</value>
        [DataMember(Name = "eventType", EmitDefaultValue = true)]
        public EventTypeEnum? EventType { get; set; }
        /// <summary>
        /// Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source.
        /// </summary>
        /// <value>Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CallStatusEnum
        {
            /// <summary>
            /// Enum InProgress for value: InProgress
            /// </summary>
            [EnumMember(Value = "InProgress")]
            InProgress = 1,

            /// <summary>
            /// Enum Ended for value: Ended
            /// </summary>
            [EnumMember(Value = "Ended")]
            Ended = 2,

            /// <summary>
            /// Enum EndedWithoutNotification for value: EndedWithoutNotification
            /// </summary>
            [EnumMember(Value = "EndedWithoutNotification")]
            EndedWithoutNotification = 3,

            /// <summary>
            /// Enum IssueAtSource for value: IssueAtSource
            /// </summary>
            [EnumMember(Value = "IssueAtSource")]
            IssueAtSource = 4

        }


        /// <summary>
        /// Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source.
        /// </summary>
        /// <value>Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source.</value>
        [DataMember(Name = "callStatus", EmitDefaultValue = true)]
        public CallStatusEnum? CallStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="NrtCallsObject" /> class.
        /// </summary>
        /// <param name="reportId">The unique ID for an event..</param>
        /// <param name="sourceCode">Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast..</param>
        /// <param name="audioSourceId">Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs..</param>
        /// <param name="ticker">Ticker-region identifier for the company hosting the event..</param>
        /// <param name="entityId">Factset entity level identifier for the company hosting the event..</param>
        /// <param name="eventType">Refers to the various event types covered by FactSet CallStreet..</param>
        /// <param name="eventTitle">Title of the Event..</param>
        /// <param name="callStatus">Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source..</param>
        /// <param name="recordingStartTime">recordingStartTime.</param>
        /// <param name="eventDatetimeUtc">The official UTC timestamp of the start of the event..</param>
        public NrtCallsObject(int? reportId = default(int?), SourceCodeEnum? sourceCode = default(SourceCodeEnum?), int? audioSourceId = default(int?), string ticker = default(string), string entityId = default(string), EventTypeEnum? eventType = default(EventTypeEnum?), string eventTitle = default(string), CallStatusEnum? callStatus = default(CallStatusEnum?), DateTime? recordingStartTime = default(DateTime?), DateTime? eventDatetimeUtc = default(DateTime?))
        {
            this.ReportId = reportId;
            this.SourceCode = sourceCode;
            this.AudioSourceId = audioSourceId;
            this.Ticker = ticker;
            this.EntityId = entityId;
            this.EventType = eventType;
            this.EventTitle = eventTitle;
            this.CallStatus = callStatus;
            this.RecordingStartTime = recordingStartTime;
            this.EventDatetimeUtc = eventDatetimeUtc;
        }

        /// <summary>
        /// The unique ID for an event.
        /// </summary>
        /// <value>The unique ID for an event.</value>
        [DataMember(Name = "reportId", EmitDefaultValue = true)]
        public int? ReportId { get; set; }

        /// <summary>
        /// Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs.
        /// </summary>
        /// <value>Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs.</value>
        [DataMember(Name = "audioSourceId", EmitDefaultValue = true)]
        public int? AudioSourceId { get; set; }

        /// <summary>
        /// Ticker-region identifier for the company hosting the event.
        /// </summary>
        /// <value>Ticker-region identifier for the company hosting the event.</value>
        [DataMember(Name = "ticker", EmitDefaultValue = true)]
        public string Ticker { get; set; }

        /// <summary>
        /// Factset entity level identifier for the company hosting the event.
        /// </summary>
        /// <value>Factset entity level identifier for the company hosting the event.</value>
        [DataMember(Name = "entityId", EmitDefaultValue = true)]
        public string EntityId { get; set; }

        /// <summary>
        /// Title of the Event.
        /// </summary>
        /// <value>Title of the Event.</value>
        [DataMember(Name = "eventTitle", EmitDefaultValue = true)]
        public string EventTitle { get; set; }

        /// <summary>
        /// Gets or Sets RecordingStartTime
        /// </summary>
        [DataMember(Name = "recordingStartTime", EmitDefaultValue = true)]
        public DateTime? RecordingStartTime { get; set; }

        /// <summary>
        /// The official UTC timestamp of the start of the event.
        /// </summary>
        /// <value>The official UTC timestamp of the start of the event.</value>
        [DataMember(Name = "eventDatetimeUtc", EmitDefaultValue = true)]
        public DateTime? EventDatetimeUtc { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NrtCallsObject {\n");
            sb.Append("  ReportId: ").Append(ReportId).Append("\n");
            sb.Append("  SourceCode: ").Append(SourceCode).Append("\n");
            sb.Append("  AudioSourceId: ").Append(AudioSourceId).Append("\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
            sb.Append("  EntityId: ").Append(EntityId).Append("\n");
            sb.Append("  EventType: ").Append(EventType).Append("\n");
            sb.Append("  EventTitle: ").Append(EventTitle).Append("\n");
            sb.Append("  CallStatus: ").Append(CallStatus).Append("\n");
            sb.Append("  RecordingStartTime: ").Append(RecordingStartTime).Append("\n");
            sb.Append("  EventDatetimeUtc: ").Append(EventDatetimeUtc).Append("\n");
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
            return this.Equals(input as NrtCallsObject);
        }

        /// <summary>
        /// Returns true if NrtCallsObject instances are equal
        /// </summary>
        /// <param name="input">Instance of NrtCallsObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NrtCallsObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ReportId == input.ReportId ||
                    (this.ReportId != null &&
                    this.ReportId.Equals(input.ReportId))
                ) && 
                (
                    this.SourceCode == input.SourceCode ||
                    this.SourceCode.Equals(input.SourceCode)
                ) && 
                (
                    this.AudioSourceId == input.AudioSourceId ||
                    (this.AudioSourceId != null &&
                    this.AudioSourceId.Equals(input.AudioSourceId))
                ) && 
                (
                    this.Ticker == input.Ticker ||
                    (this.Ticker != null &&
                    this.Ticker.Equals(input.Ticker))
                ) && 
                (
                    this.EntityId == input.EntityId ||
                    (this.EntityId != null &&
                    this.EntityId.Equals(input.EntityId))
                ) && 
                (
                    this.EventType == input.EventType ||
                    this.EventType.Equals(input.EventType)
                ) && 
                (
                    this.EventTitle == input.EventTitle ||
                    (this.EventTitle != null &&
                    this.EventTitle.Equals(input.EventTitle))
                ) && 
                (
                    this.CallStatus == input.CallStatus ||
                    this.CallStatus.Equals(input.CallStatus)
                ) && 
                (
                    this.RecordingStartTime == input.RecordingStartTime ||
                    (this.RecordingStartTime != null &&
                    this.RecordingStartTime.Equals(input.RecordingStartTime))
                ) && 
                (
                    this.EventDatetimeUtc == input.EventDatetimeUtc ||
                    (this.EventDatetimeUtc != null &&
                    this.EventDatetimeUtc.Equals(input.EventDatetimeUtc))
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
                if (this.ReportId != null)
                {
                    hashCode = (hashCode * 59) + this.ReportId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.SourceCode.GetHashCode();
                if (this.AudioSourceId != null)
                {
                    hashCode = (hashCode * 59) + this.AudioSourceId.GetHashCode();
                }
                if (this.Ticker != null)
                {
                    hashCode = (hashCode * 59) + this.Ticker.GetHashCode();
                }
                if (this.EntityId != null)
                {
                    hashCode = (hashCode * 59) + this.EntityId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.EventType.GetHashCode();
                if (this.EventTitle != null)
                {
                    hashCode = (hashCode * 59) + this.EventTitle.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CallStatus.GetHashCode();
                if (this.RecordingStartTime != null)
                {
                    hashCode = (hashCode * 59) + this.RecordingStartTime.GetHashCode();
                }
                if (this.EventDatetimeUtc != null)
                {
                    hashCode = (hashCode * 59) + this.EventDatetimeUtc.GetHashCode();
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
