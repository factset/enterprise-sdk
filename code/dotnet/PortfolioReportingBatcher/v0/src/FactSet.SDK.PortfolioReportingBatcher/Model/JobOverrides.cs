/*
 * Portfolio Reporting Batcher
 *
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application.
 *
 * The version of the OpenAPI document: 0.5.0
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
    /// If this object is provided, the settings given here will override the default settings of the job for the job run (settings will only be used temporarily and no changes will be made to the default PRB job). Only certain objects can be used for certain job types.
    /// </summary>
    [DataContract(Name = "jobOverrides")]
    public partial class JobOverrides : IEquatable<JobOverrides>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="JobOverrides" /> class.
        /// </summary>
        /// <param name="calendar">calendar.</param>
        /// <param name="combinations">An array of date account combinations.</param>
        /// <param name="dates">dates.</param>
        /// <param name="frequency">frequency.</param>
        /// <param name="runAsOfDate">PUB.</param>
        /// <param name="runAsSerialNumber">The FactSet serial number which has the credentials wanted to run the job.</param>
        /// <param name="tasks">Used only for jobs where type is PA.</param>
        public JobOverrides(Calendar calendar = default(Calendar), List<JobOverridesCombinationsRoot> combinations = default(List<JobOverridesCombinationsRoot>), JobOverridesDates dates = default(JobOverridesDates), Frequency frequency = default(Frequency), DateTime runAsOfDate = default(DateTime), string runAsSerialNumber = default(string), List<string> tasks = default(List<string>))
        {
            this.Calendar = calendar;
            this.Combinations = combinations;
            this.Dates = dates;
            this.Frequency = frequency;
            this.RunAsOfDate = runAsOfDate;
            this.RunAsSerialNumber = runAsSerialNumber;
            this.Tasks = tasks;
        }

        /// <summary>
        /// Gets or Sets Calendar
        /// </summary>
        [DataMember(Name = "calendar", EmitDefaultValue = false)]
        public Calendar Calendar { get; set; }

        /// <summary>
        /// An array of date account combinations
        /// </summary>
        /// <value>An array of date account combinations</value>
        [DataMember(Name = "combinations", EmitDefaultValue = false)]
        public List<JobOverridesCombinationsRoot> Combinations { get; set; }

        /// <summary>
        /// Gets or Sets Dates
        /// </summary>
        [DataMember(Name = "dates", EmitDefaultValue = false)]
        public JobOverridesDates Dates { get; set; }

        /// <summary>
        /// Gets or Sets Frequency
        /// </summary>
        [DataMember(Name = "frequency", EmitDefaultValue = false)]
        public Frequency Frequency { get; set; }

        /// <summary>
        /// PUB
        /// </summary>
        /// <value>PUB</value>
        [DataMember(Name = "runAsOfDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime RunAsOfDate { get; set; }

        /// <summary>
        /// The FactSet serial number which has the credentials wanted to run the job
        /// </summary>
        /// <value>The FactSet serial number which has the credentials wanted to run the job</value>
        [DataMember(Name = "runAsSerialNumber", EmitDefaultValue = false)]
        public string RunAsSerialNumber { get; set; }

        /// <summary>
        /// Used only for jobs where type is PA
        /// </summary>
        /// <value>Used only for jobs where type is PA</value>
        [DataMember(Name = "tasks", EmitDefaultValue = false)]
        public List<string> Tasks { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class JobOverrides {\n");
            sb.Append("  Calendar: ").Append(Calendar).Append("\n");
            sb.Append("  Combinations: ").Append(Combinations).Append("\n");
            sb.Append("  Dates: ").Append(Dates).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  RunAsOfDate: ").Append(RunAsOfDate).Append("\n");
            sb.Append("  RunAsSerialNumber: ").Append(RunAsSerialNumber).Append("\n");
            sb.Append("  Tasks: ").Append(Tasks).Append("\n");
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
            return this.Equals(input as JobOverrides);
        }

        /// <summary>
        /// Returns true if JobOverrides instances are equal
        /// </summary>
        /// <param name="input">Instance of JobOverrides to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JobOverrides input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Calendar == input.Calendar ||
                    (this.Calendar != null &&
                    this.Calendar.Equals(input.Calendar))
                ) && 
                (
                    this.Combinations == input.Combinations ||
                    this.Combinations != null &&
                    input.Combinations != null &&
                    this.Combinations.SequenceEqual(input.Combinations)
                ) && 
                (
                    this.Dates == input.Dates ||
                    (this.Dates != null &&
                    this.Dates.Equals(input.Dates))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
                ) && 
                (
                    this.RunAsOfDate == input.RunAsOfDate ||
                    (this.RunAsOfDate != null &&
                    this.RunAsOfDate.Equals(input.RunAsOfDate))
                ) && 
                (
                    this.RunAsSerialNumber == input.RunAsSerialNumber ||
                    (this.RunAsSerialNumber != null &&
                    this.RunAsSerialNumber.Equals(input.RunAsSerialNumber))
                ) && 
                (
                    this.Tasks == input.Tasks ||
                    this.Tasks != null &&
                    input.Tasks != null &&
                    this.Tasks.SequenceEqual(input.Tasks)
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
                if (this.Calendar != null)
                {
                    hashCode = (hashCode * 59) + this.Calendar.GetHashCode();
                }
                if (this.Combinations != null)
                {
                    hashCode = (hashCode * 59) + this.Combinations.GetHashCode();
                }
                if (this.Dates != null)
                {
                    hashCode = (hashCode * 59) + this.Dates.GetHashCode();
                }
                if (this.Frequency != null)
                {
                    hashCode = (hashCode * 59) + this.Frequency.GetHashCode();
                }
                if (this.RunAsOfDate != null)
                {
                    hashCode = (hashCode * 59) + this.RunAsOfDate.GetHashCode();
                }
                if (this.RunAsSerialNumber != null)
                {
                    hashCode = (hashCode * 59) + this.RunAsSerialNumber.GetHashCode();
                }
                if (this.Tasks != null)
                {
                    hashCode = (hashCode * 59) + this.Tasks.GetHashCode();
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
