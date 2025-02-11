/*
 * Portfolio Reporting Batcher
 *
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application.
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
using OpenAPIDateConverter = FactSet.SDK.PortfolioReportingBatcher.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PortfolioReportingBatcher.Model
{
    /// <summary>
    /// Provides full details of when the job has been run
    /// </summary>
    [DataContract(Name = "RunsForJob")]
    public partial class RunsForJob : IEquatable<RunsForJob>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets PrbStatus
        /// </summary>
        [DataMember(Name = "prbStatus", EmitDefaultValue = false)]
        public PrbStatus? PrbStatus { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public Status? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunsForJob" /> class.
        /// </summary>
        /// <param name="endTime">The date and time the job was finished processing.</param>
        /// <param name="id">The ID of the run.</param>
        /// <param name="isApiTriggered">Indicates whether the job was triggered via the PRB API.</param>
        /// <param name="prbStatus">prbStatus.</param>
        /// <param name="runDuration">Number of seconds between startTime and endTime.</param>
        /// <param name="startTime">The date and time the job started running after being submitted and potentially waiting in any queue.</param>
        /// <param name="status">status.</param>
        /// <param name="statusDescription">Further details on the job&#39;s status.</param>
        /// <param name="submitTime">The date and time the job was submitted.</param>
        public RunsForJob(DateTime endTime = default(DateTime), string id = default(string), bool isApiTriggered = default(bool), PrbStatus prbStatus = default(PrbStatus), decimal runDuration = default(decimal), DateTime startTime = default(DateTime), Status status = default(Status), string statusDescription = default(string), DateTime submitTime = default(DateTime))
        {
            this.EndTime = endTime;
            this.Id = id;
            this.IsApiTriggered = isApiTriggered;
            this.PrbStatus = prbStatus;
            this.RunDuration = runDuration;
            this.StartTime = startTime;
            this.Status = status;
            this.StatusDescription = statusDescription;
            this.SubmitTime = submitTime;
        }

        /// <summary>
        /// The date and time the job was finished processing
        /// </summary>
        /// <value>The date and time the job was finished processing</value>
        [DataMember(Name = "endTime", EmitDefaultValue = false)]
        public DateTime EndTime { get; set; }

        /// <summary>
        /// The ID of the run
        /// </summary>
        /// <value>The ID of the run</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Indicates whether the job was triggered via the PRB API
        /// </summary>
        /// <value>Indicates whether the job was triggered via the PRB API</value>
        [DataMember(Name = "isApiTriggered", EmitDefaultValue = true)]
        public bool IsApiTriggered { get; set; }

        /// <summary>
        /// Number of seconds between startTime and endTime
        /// </summary>
        /// <value>Number of seconds between startTime and endTime</value>
        [DataMember(Name = "runDuration", EmitDefaultValue = false)]
        public decimal RunDuration { get; set; }

        /// <summary>
        /// The date and time the job started running after being submitted and potentially waiting in any queue
        /// </summary>
        /// <value>The date and time the job started running after being submitted and potentially waiting in any queue</value>
        [DataMember(Name = "startTime", EmitDefaultValue = false)]
        public DateTime StartTime { get; set; }

        /// <summary>
        /// Further details on the job&#39;s status
        /// </summary>
        /// <value>Further details on the job&#39;s status</value>
        [DataMember(Name = "statusDescription", EmitDefaultValue = false)]
        public string StatusDescription { get; set; }

        /// <summary>
        /// The date and time the job was submitted
        /// </summary>
        /// <value>The date and time the job was submitted</value>
        [DataMember(Name = "submitTime", EmitDefaultValue = false)]
        public DateTime SubmitTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunsForJob {\n");
            sb.Append("  EndTime: ").Append(EndTime).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsApiTriggered: ").Append(IsApiTriggered).Append("\n");
            sb.Append("  PrbStatus: ").Append(PrbStatus).Append("\n");
            sb.Append("  RunDuration: ").Append(RunDuration).Append("\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  StatusDescription: ").Append(StatusDescription).Append("\n");
            sb.Append("  SubmitTime: ").Append(SubmitTime).Append("\n");
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
            return this.Equals(input as RunsForJob);
        }

        /// <summary>
        /// Returns true if RunsForJob instances are equal
        /// </summary>
        /// <param name="input">Instance of RunsForJob to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RunsForJob input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.EndTime == input.EndTime ||
                    (this.EndTime != null &&
                    this.EndTime.Equals(input.EndTime))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.IsApiTriggered == input.IsApiTriggered ||
                    this.IsApiTriggered.Equals(input.IsApiTriggered)
                ) && 
                (
                    this.PrbStatus == input.PrbStatus ||
                    this.PrbStatus.Equals(input.PrbStatus)
                ) && 
                (
                    this.RunDuration == input.RunDuration ||
                    this.RunDuration.Equals(input.RunDuration)
                ) && 
                (
                    this.StartTime == input.StartTime ||
                    (this.StartTime != null &&
                    this.StartTime.Equals(input.StartTime))
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.StatusDescription == input.StatusDescription ||
                    (this.StatusDescription != null &&
                    this.StatusDescription.Equals(input.StatusDescription))
                ) && 
                (
                    this.SubmitTime == input.SubmitTime ||
                    (this.SubmitTime != null &&
                    this.SubmitTime.Equals(input.SubmitTime))
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
                if (this.EndTime != null)
                {
                    hashCode = (hashCode * 59) + this.EndTime.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsApiTriggered.GetHashCode();
                hashCode = (hashCode * 59) + this.PrbStatus.GetHashCode();
                hashCode = (hashCode * 59) + this.RunDuration.GetHashCode();
                if (this.StartTime != null)
                {
                    hashCode = (hashCode * 59) + this.StartTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.StatusDescription != null)
                {
                    hashCode = (hashCode * 59) + this.StatusDescription.GetHashCode();
                }
                if (this.SubmitTime != null)
                {
                    hashCode = (hashCode * 59) + this.SubmitTime.GetHashCode();
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
            // StatusDescription (string) maxLength
            if (this.StatusDescription != null && this.StatusDescription.Length > 500)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StatusDescription, length must be less than 500.", new [] { "StatusDescription" });
            }

            yield break;
        }
    }

}
