/*
 * EVENTS AND TRANSCRIPTS API
 *
 * <p>The Calendar Events API provides access to FactSet’s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
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
using OpenAPIDateConverter = FactSet.SDK.EventsandTranscripts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.EventsandTranscripts.Model
{
    /// <summary>
    /// EventsAudioIdsObject
    /// </summary>
    [DataContract(Name = "EventsAudioIdsObject")]
    public partial class EventsAudioIdsObject : IEquatable<EventsAudioIdsObject>, IValidatableObject
    {
        /// <summary>
        /// This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay
        /// </summary>
        /// <value>This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SourceCodeEnum
        {
            /// <summary>
            /// Enum Webcast for value: Webcast
            /// </summary>
            [EnumMember(Value = "Webcast")]
            Webcast = 1,

            /// <summary>
            /// Enum Vendor for value: Vendor
            /// </summary>
            [EnumMember(Value = "Vendor")]
            Vendor = 2,

            /// <summary>
            /// Enum WebcastReplay for value: WebcastReplay
            /// </summary>
            [EnumMember(Value = "WebcastReplay")]
            WebcastReplay = 3,

            /// <summary>
            /// Enum Flash for value: Flash
            /// </summary>
            [EnumMember(Value = "Flash")]
            Flash = 4,

            /// <summary>
            /// Enum Replay for value: Replay
            /// </summary>
            [EnumMember(Value = "Replay")]
            Replay = 5,

            /// <summary>
            /// Enum Phone for value: Phone
            /// </summary>
            [EnumMember(Value = "Phone")]
            Phone = 6

        }


        /// <summary>
        /// This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay
        /// </summary>
        /// <value>This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay</value>
        [DataMember(Name = "sourceCode", EmitDefaultValue = false)]
        public SourceCodeEnum? SourceCode { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EventsAudioIdsObject" /> class.
        /// </summary>
        /// <param name="reportId">The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables..</param>
        /// <param name="fileName">The filename of the audio file..</param>
        /// <param name="url">A pre-signed URL that allows downloading the audio file, expiring after 24 hours..</param>
        /// <param name="fileSize">Size of the Audio file, in bytes..</param>
        /// <param name="audioSourceId">Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null..</param>
        /// <param name="ticker">Ticker-region identifier for the company hosting the event..</param>
        /// <param name="entityId">FactSet entity level identifier for the company hosting the event..</param>
        /// <param name="sourceCode">This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay.</param>
        /// <param name="trimmed"> The trimmed attribute indicates whether the audio is the trimmed version. If &#x60;sourceCode&#x60; is set to vendor, this attribute will always be true.    .</param>
        /// <param name="durationSecs">Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds..</param>
        /// <param name="startOffsetSeconds">The delta in seconds between start of audio file to when FactSet marks the beginning of the call..</param>
        /// <param name="endOffsetSeconds">The delta in seconds between startTime to when FactSet marks the end of the call..</param>
        /// <param name="startTime">The official timestamp when FactSet begins the recording..</param>
        /// <param name="endTime">The official timestamp when FactSet ends the recording..</param>
        /// <param name="uploadTime">The official timestamp when FactSet publishes the audio file externally..</param>
        /// <param name="sampleRate">The number of samples of audio carried per second in Kbps..</param>
        /// <param name="bitrate">The total number of bits of information stored per second of sound in Kbps..</param>
        public EventsAudioIdsObject(int reportId = default(int), string fileName = default(string), string url = default(string), decimal fileSize = default(decimal), int? audioSourceId = default(int?), string ticker = default(string), string entityId = default(string), SourceCodeEnum? sourceCode = default(SourceCodeEnum?), bool trimmed = default(bool), decimal? durationSecs = default(decimal?), decimal? startOffsetSeconds = default(decimal?), decimal? endOffsetSeconds = default(decimal?), string startTime = default(string), string endTime = default(string), string uploadTime = default(string), decimal? sampleRate = default(decimal?), decimal? bitrate = default(decimal?))
        {
            this.ReportId = reportId;
            this.FileName = fileName;
            this.Url = url;
            this.FileSize = fileSize;
            this.AudioSourceId = audioSourceId;
            this.Ticker = ticker;
            this.EntityId = entityId;
            this.SourceCode = sourceCode;
            this.Trimmed = trimmed;
            this.DurationSecs = durationSecs;
            this.StartOffsetSeconds = startOffsetSeconds;
            this.EndOffsetSeconds = endOffsetSeconds;
            this.StartTime = startTime;
            this.EndTime = endTime;
            this.UploadTime = uploadTime;
            this.SampleRate = sampleRate;
            this.Bitrate = bitrate;
        }

        /// <summary>
        /// The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables.
        /// </summary>
        /// <value>The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables.</value>
        [DataMember(Name = "reportId", EmitDefaultValue = false)]
        public int ReportId { get; set; }

        /// <summary>
        /// The filename of the audio file.
        /// </summary>
        /// <value>The filename of the audio file.</value>
        [DataMember(Name = "fileName", EmitDefaultValue = false)]
        public string FileName { get; set; }

        /// <summary>
        /// A pre-signed URL that allows downloading the audio file, expiring after 24 hours.
        /// </summary>
        /// <value>A pre-signed URL that allows downloading the audio file, expiring after 24 hours.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Size of the Audio file, in bytes.
        /// </summary>
        /// <value>Size of the Audio file, in bytes.</value>
        [DataMember(Name = "fileSize", EmitDefaultValue = false)]
        public decimal FileSize { get; set; }

        /// <summary>
        /// Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null.
        /// </summary>
        /// <value>Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null.</value>
        [DataMember(Name = "audioSourceId", EmitDefaultValue = true)]
        public int? AudioSourceId { get; set; }

        /// <summary>
        /// Ticker-region identifier for the company hosting the event.
        /// </summary>
        /// <value>Ticker-region identifier for the company hosting the event.</value>
        [DataMember(Name = "ticker", EmitDefaultValue = true)]
        public string Ticker { get; set; }

        /// <summary>
        /// FactSet entity level identifier for the company hosting the event.
        /// </summary>
        /// <value>FactSet entity level identifier for the company hosting the event.</value>
        [DataMember(Name = "entityId", EmitDefaultValue = false)]
        public string EntityId { get; set; }

        /// <summary>
        ///  The trimmed attribute indicates whether the audio is the trimmed version. If &#x60;sourceCode&#x60; is set to vendor, this attribute will always be true.    
        /// </summary>
        /// <value> The trimmed attribute indicates whether the audio is the trimmed version. If &#x60;sourceCode&#x60; is set to vendor, this attribute will always be true.    </value>
        [DataMember(Name = "trimmed", EmitDefaultValue = true)]
        public bool Trimmed { get; set; }

        /// <summary>
        /// Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds.
        /// </summary>
        /// <value>Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds.</value>
        [DataMember(Name = "durationSecs", EmitDefaultValue = true)]
        public decimal? DurationSecs { get; set; }

        /// <summary>
        /// The delta in seconds between start of audio file to when FactSet marks the beginning of the call.
        /// </summary>
        /// <value>The delta in seconds between start of audio file to when FactSet marks the beginning of the call.</value>
        [DataMember(Name = "startOffsetSeconds", EmitDefaultValue = true)]
        public decimal? StartOffsetSeconds { get; set; }

        /// <summary>
        /// The delta in seconds between startTime to when FactSet marks the end of the call.
        /// </summary>
        /// <value>The delta in seconds between startTime to when FactSet marks the end of the call.</value>
        [DataMember(Name = "endOffsetSeconds", EmitDefaultValue = true)]
        public decimal? EndOffsetSeconds { get; set; }

        /// <summary>
        /// The official timestamp when FactSet begins the recording.
        /// </summary>
        /// <value>The official timestamp when FactSet begins the recording.</value>
        [DataMember(Name = "startTime", EmitDefaultValue = true)]
        public string StartTime { get; set; }

        /// <summary>
        /// The official timestamp when FactSet ends the recording.
        /// </summary>
        /// <value>The official timestamp when FactSet ends the recording.</value>
        [DataMember(Name = "endTime", EmitDefaultValue = true)]
        public string EndTime { get; set; }

        /// <summary>
        /// The official timestamp when FactSet publishes the audio file externally.
        /// </summary>
        /// <value>The official timestamp when FactSet publishes the audio file externally.</value>
        [DataMember(Name = "uploadTime", EmitDefaultValue = true)]
        public string UploadTime { get; set; }

        /// <summary>
        /// The number of samples of audio carried per second in Kbps.
        /// </summary>
        /// <value>The number of samples of audio carried per second in Kbps.</value>
        [DataMember(Name = "sampleRate", EmitDefaultValue = true)]
        public decimal? SampleRate { get; set; }

        /// <summary>
        /// The total number of bits of information stored per second of sound in Kbps.
        /// </summary>
        /// <value>The total number of bits of information stored per second of sound in Kbps.</value>
        [DataMember(Name = "bitrate", EmitDefaultValue = true)]
        public decimal? Bitrate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EventsAudioIdsObject {\n");
            sb.Append("  ReportId: ").Append(ReportId).Append("\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  FileSize: ").Append(FileSize).Append("\n");
            sb.Append("  AudioSourceId: ").Append(AudioSourceId).Append("\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
            sb.Append("  EntityId: ").Append(EntityId).Append("\n");
            sb.Append("  SourceCode: ").Append(SourceCode).Append("\n");
            sb.Append("  Trimmed: ").Append(Trimmed).Append("\n");
            sb.Append("  DurationSecs: ").Append(DurationSecs).Append("\n");
            sb.Append("  StartOffsetSeconds: ").Append(StartOffsetSeconds).Append("\n");
            sb.Append("  EndOffsetSeconds: ").Append(EndOffsetSeconds).Append("\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  EndTime: ").Append(EndTime).Append("\n");
            sb.Append("  UploadTime: ").Append(UploadTime).Append("\n");
            sb.Append("  SampleRate: ").Append(SampleRate).Append("\n");
            sb.Append("  Bitrate: ").Append(Bitrate).Append("\n");
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
            return this.Equals(input as EventsAudioIdsObject);
        }

        /// <summary>
        /// Returns true if EventsAudioIdsObject instances are equal
        /// </summary>
        /// <param name="input">Instance of EventsAudioIdsObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EventsAudioIdsObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ReportId == input.ReportId ||
                    this.ReportId.Equals(input.ReportId)
                ) && 
                (
                    this.FileName == input.FileName ||
                    (this.FileName != null &&
                    this.FileName.Equals(input.FileName))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.FileSize == input.FileSize ||
                    this.FileSize.Equals(input.FileSize)
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
                    this.SourceCode == input.SourceCode ||
                    this.SourceCode.Equals(input.SourceCode)
                ) && 
                (
                    this.Trimmed == input.Trimmed ||
                    this.Trimmed.Equals(input.Trimmed)
                ) && 
                (
                    this.DurationSecs == input.DurationSecs ||
                    (this.DurationSecs != null &&
                    this.DurationSecs.Equals(input.DurationSecs))
                ) && 
                (
                    this.StartOffsetSeconds == input.StartOffsetSeconds ||
                    (this.StartOffsetSeconds != null &&
                    this.StartOffsetSeconds.Equals(input.StartOffsetSeconds))
                ) && 
                (
                    this.EndOffsetSeconds == input.EndOffsetSeconds ||
                    (this.EndOffsetSeconds != null &&
                    this.EndOffsetSeconds.Equals(input.EndOffsetSeconds))
                ) && 
                (
                    this.StartTime == input.StartTime ||
                    (this.StartTime != null &&
                    this.StartTime.Equals(input.StartTime))
                ) && 
                (
                    this.EndTime == input.EndTime ||
                    (this.EndTime != null &&
                    this.EndTime.Equals(input.EndTime))
                ) && 
                (
                    this.UploadTime == input.UploadTime ||
                    (this.UploadTime != null &&
                    this.UploadTime.Equals(input.UploadTime))
                ) && 
                (
                    this.SampleRate == input.SampleRate ||
                    (this.SampleRate != null &&
                    this.SampleRate.Equals(input.SampleRate))
                ) && 
                (
                    this.Bitrate == input.Bitrate ||
                    (this.Bitrate != null &&
                    this.Bitrate.Equals(input.Bitrate))
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
                hashCode = (hashCode * 59) + this.ReportId.GetHashCode();
                if (this.FileName != null)
                {
                    hashCode = (hashCode * 59) + this.FileName.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.FileSize.GetHashCode();
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
                hashCode = (hashCode * 59) + this.SourceCode.GetHashCode();
                hashCode = (hashCode * 59) + this.Trimmed.GetHashCode();
                if (this.DurationSecs != null)
                {
                    hashCode = (hashCode * 59) + this.DurationSecs.GetHashCode();
                }
                if (this.StartOffsetSeconds != null)
                {
                    hashCode = (hashCode * 59) + this.StartOffsetSeconds.GetHashCode();
                }
                if (this.EndOffsetSeconds != null)
                {
                    hashCode = (hashCode * 59) + this.EndOffsetSeconds.GetHashCode();
                }
                if (this.StartTime != null)
                {
                    hashCode = (hashCode * 59) + this.StartTime.GetHashCode();
                }
                if (this.EndTime != null)
                {
                    hashCode = (hashCode * 59) + this.EndTime.GetHashCode();
                }
                if (this.UploadTime != null)
                {
                    hashCode = (hashCode * 59) + this.UploadTime.GetHashCode();
                }
                if (this.SampleRate != null)
                {
                    hashCode = (hashCode * 59) + this.SampleRate.GetHashCode();
                }
                if (this.Bitrate != null)
                {
                    hashCode = (hashCode * 59) + this.Bitrate.GetHashCode();
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
