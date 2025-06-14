/*
 * FIAB API
 *
 * Allow clients to fetch FIAB Analytics through APIs.
 *
 * The version of the OpenAPI document: 1.3.7
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
using OpenAPIDateConverter = FactSet.SDK.FixedIncomeAnalyticsBatcher.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FixedIncomeAnalyticsBatcher.Model
{
    /// <summary>
    /// FIABCalculationStatus
    /// </summary>
    [DataContract(Name = "FIABCalculationStatus")]
    public partial class FIABCalculationStatus : IEquatable<FIABCalculationStatus>, IValidatableObject
    {
        /// <summary>
        /// FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt.
        /// </summary>
        /// <value>FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum Pending for value: Pending
            /// </summary>
            [EnumMember(Value = "Pending")]
            Pending = 1,

            /// <summary>
            /// Enum InProgress for value: InProgress
            /// </summary>
            [EnumMember(Value = "InProgress")]
            InProgress = 2,

            /// <summary>
            /// Enum Done for value: Done
            /// </summary>
            [EnumMember(Value = "Done")]
            Done = 3,

            /// <summary>
            /// Enum Paused for value: Paused
            /// </summary>
            [EnumMember(Value = "Paused")]
            Paused = 4,

            /// <summary>
            /// Enum Cancelled for value: Cancelled
            /// </summary>
            [EnumMember(Value = "Cancelled")]
            Cancelled = 5,

            /// <summary>
            /// Enum Error for value: Error
            /// </summary>
            [EnumMember(Value = "Error")]
            Error = 6

        }


        /// <summary>
        /// FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt.
        /// </summary>
        /// <value>FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt.</value>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FIABCalculationStatus" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="status">FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt..</param>
        /// <param name="startdatetime">startdatetime.</param>
        /// <param name="completiondatetime">completiondatetime.</param>
        /// <param name="progress">progress.</param>
        /// <param name="batchevents">batchevents.</param>
        public FIABCalculationStatus(string id = default(string), StatusEnum? status = default(StatusEnum?), DateTime startdatetime = default(DateTime), DateTime completiondatetime = default(DateTime), int progress = default(int), List<EventSummary> batchevents = default(List<EventSummary>))
        {
            this.Id = id;
            this.Status = status;
            this.Startdatetime = startdatetime;
            this.Completiondatetime = completiondatetime;
            this.Progress = progress;
            this.Batchevents = batchevents;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Startdatetime
        /// </summary>
        [DataMember(Name = "startdatetime", EmitDefaultValue = false)]
        public DateTime Startdatetime { get; set; }

        /// <summary>
        /// Gets or Sets Completiondatetime
        /// </summary>
        [DataMember(Name = "completiondatetime", EmitDefaultValue = false)]
        public DateTime Completiondatetime { get; set; }

        /// <summary>
        /// Gets or Sets Progress
        /// </summary>
        [DataMember(Name = "progress", EmitDefaultValue = false)]
        public int Progress { get; set; }

        /// <summary>
        /// Gets or Sets Batchevents
        /// </summary>
        [DataMember(Name = "batchevents", EmitDefaultValue = false)]
        public List<EventSummary> Batchevents { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FIABCalculationStatus {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Startdatetime: ").Append(Startdatetime).Append("\n");
            sb.Append("  Completiondatetime: ").Append(Completiondatetime).Append("\n");
            sb.Append("  Progress: ").Append(Progress).Append("\n");
            sb.Append("  Batchevents: ").Append(Batchevents).Append("\n");
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
            return this.Equals(input as FIABCalculationStatus);
        }

        /// <summary>
        /// Returns true if FIABCalculationStatus instances are equal
        /// </summary>
        /// <param name="input">Instance of FIABCalculationStatus to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FIABCalculationStatus input)
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
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.Startdatetime == input.Startdatetime ||
                    (this.Startdatetime != null &&
                    this.Startdatetime.Equals(input.Startdatetime))
                ) && 
                (
                    this.Completiondatetime == input.Completiondatetime ||
                    (this.Completiondatetime != null &&
                    this.Completiondatetime.Equals(input.Completiondatetime))
                ) && 
                (
                    this.Progress == input.Progress ||
                    this.Progress.Equals(input.Progress)
                ) && 
                (
                    this.Batchevents == input.Batchevents ||
                    this.Batchevents != null &&
                    input.Batchevents != null &&
                    this.Batchevents.SequenceEqual(input.Batchevents)
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
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.Startdatetime != null)
                {
                    hashCode = (hashCode * 59) + this.Startdatetime.GetHashCode();
                }
                if (this.Completiondatetime != null)
                {
                    hashCode = (hashCode * 59) + this.Completiondatetime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Progress.GetHashCode();
                if (this.Batchevents != null)
                {
                    hashCode = (hashCode * 59) + this.Batchevents.GetHashCode();
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
