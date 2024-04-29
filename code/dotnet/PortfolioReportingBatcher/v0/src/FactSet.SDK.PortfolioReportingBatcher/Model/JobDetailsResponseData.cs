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
    /// The main object in the jobDetailsResponse schema
    /// </summary>
    [DataContract(Name = "jobDetailsResponse_data")]
    public partial class JobDetailsResponseData : IEquatable<JobDetailsResponseData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="JobDetailsResponseData" /> class.
        /// </summary>
        /// <param name="accounts">Please note for PI jobs you will only see portfolioId.</param>
        /// <param name="documents">Shows the documents for each job where relevant with a collection of tasks under each document.</param>
        /// <param name="runs">An array of information for each run.</param>
        /// <param name="tasks">A list of tasks for the given job.</param>
        public JobDetailsResponseData(Dictionary<string, List<AccountsForJobAddProp>> accounts = default(Dictionary<string, List<AccountsForJobAddProp>>), Dictionary<string, List<string>> documents = default(Dictionary<string, List<string>>), List<RunsForJob> runs = default(List<RunsForJob>), List<string> tasks = default(List<string>))
        {
            this.Accounts = accounts;
            this.Documents = documents;
            this.Runs = runs;
            this.Tasks = tasks;
        }

        /// <summary>
        /// Please note for PI jobs you will only see portfolioId
        /// </summary>
        /// <value>Please note for PI jobs you will only see portfolioId</value>
        [DataMember(Name = "accounts", EmitDefaultValue = false)]
        public Dictionary<string, List<AccountsForJobAddProp>> Accounts { get; set; }

        /// <summary>
        /// Shows the documents for each job where relevant with a collection of tasks under each document
        /// </summary>
        /// <value>Shows the documents for each job where relevant with a collection of tasks under each document</value>
        [DataMember(Name = "documents", EmitDefaultValue = false)]
        public Dictionary<string, List<string>> Documents { get; set; }

        /// <summary>
        /// An array of information for each run
        /// </summary>
        /// <value>An array of information for each run</value>
        [DataMember(Name = "runs", EmitDefaultValue = false)]
        public List<RunsForJob> Runs { get; set; }

        /// <summary>
        /// A list of tasks for the given job
        /// </summary>
        /// <value>A list of tasks for the given job</value>
        [DataMember(Name = "tasks", EmitDefaultValue = false)]
        public List<string> Tasks { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class JobDetailsResponseData {\n");
            sb.Append("  Accounts: ").Append(Accounts).Append("\n");
            sb.Append("  Documents: ").Append(Documents).Append("\n");
            sb.Append("  Runs: ").Append(Runs).Append("\n");
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
            return this.Equals(input as JobDetailsResponseData);
        }

        /// <summary>
        /// Returns true if JobDetailsResponseData instances are equal
        /// </summary>
        /// <param name="input">Instance of JobDetailsResponseData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JobDetailsResponseData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Accounts == input.Accounts ||
                    this.Accounts != null &&
                    input.Accounts != null &&
                    this.Accounts.SequenceEqual(input.Accounts)
                ) && 
                (
                    this.Documents == input.Documents ||
                    this.Documents != null &&
                    input.Documents != null &&
                    this.Documents.SequenceEqual(input.Documents)
                ) && 
                (
                    this.Runs == input.Runs ||
                    this.Runs != null &&
                    input.Runs != null &&
                    this.Runs.SequenceEqual(input.Runs)
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
                if (this.Accounts != null)
                {
                    hashCode = (hashCode * 59) + this.Accounts.GetHashCode();
                }
                if (this.Documents != null)
                {
                    hashCode = (hashCode * 59) + this.Documents.GetHashCode();
                }
                if (this.Runs != null)
                {
                    hashCode = (hashCode * 59) + this.Runs.GetHashCode();
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
