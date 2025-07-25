/*
 * FactSet Concordance API
 *
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request. With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.10.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetConcordance.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetConcordance.Model
{
    /// <summary>
    /// Request object for a requesting multiple People Matches.
    /// </summary>
    [DataContract(Name = "PeopleMatchRequest")]
    public partial class PeopleMatchRequest : IEquatable<PeopleMatchRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PeopleMatchRequest" /> class.
        /// </summary>
        /// <param name="input">input.</param>
        /// <param name="candidatesCount">Maximum number of candidates to be returned. Parent entities, when includeParent is true, are not included in this count. .</param>
        /// <param name="universeId">The universeId to save this set of inputs to .</param>
        public PeopleMatchRequest(List<PeopleMatchRequestInput> input = default(List<PeopleMatchRequestInput>), int candidatesCount = default(int), int universeId = default(int))
        {
            this.Input = input;
            this.CandidatesCount = candidatesCount;
            this.UniverseId = universeId;
        }

        /// <summary>
        /// Gets or Sets Input
        /// </summary>
        [DataMember(Name = "input", EmitDefaultValue = false)]
        public List<PeopleMatchRequestInput> Input { get; set; }

        /// <summary>
        /// Maximum number of candidates to be returned. Parent entities, when includeParent is true, are not included in this count. 
        /// </summary>
        /// <value>Maximum number of candidates to be returned. Parent entities, when includeParent is true, are not included in this count. </value>
        [DataMember(Name = "candidatesCount", EmitDefaultValue = false)]
        public int CandidatesCount { get; set; }

        /// <summary>
        /// The universeId to save this set of inputs to 
        /// </summary>
        /// <value>The universeId to save this set of inputs to </value>
        [DataMember(Name = "universeId", EmitDefaultValue = false)]
        public int UniverseId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PeopleMatchRequest {\n");
            sb.Append("  Input: ").Append(Input).Append("\n");
            sb.Append("  CandidatesCount: ").Append(CandidatesCount).Append("\n");
            sb.Append("  UniverseId: ").Append(UniverseId).Append("\n");
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
            return this.Equals(input as PeopleMatchRequest);
        }

        /// <summary>
        /// Returns true if PeopleMatchRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of PeopleMatchRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PeopleMatchRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Input == input.Input ||
                    this.Input != null &&
                    input.Input != null &&
                    this.Input.SequenceEqual(input.Input)
                ) && 
                (
                    this.CandidatesCount == input.CandidatesCount ||
                    this.CandidatesCount.Equals(input.CandidatesCount)
                ) && 
                (
                    this.UniverseId == input.UniverseId ||
                    this.UniverseId.Equals(input.UniverseId)
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
                if (this.Input != null)
                {
                    hashCode = (hashCode * 59) + this.Input.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CandidatesCount.GetHashCode();
                hashCode = (hashCode * 59) + this.UniverseId.GetHashCode();
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
            // CandidatesCount (int) maximum
            if (this.CandidatesCount > (int)100)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CandidatesCount, must be a value less than or equal to 100.", new [] { "CandidatesCount" });
            }

            // CandidatesCount (int) minimum
            if (this.CandidatesCount < (int)20)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CandidatesCount, must be a value greater than or equal to 20.", new [] { "CandidatesCount" });
            }

            yield break;
        }
    }

}
