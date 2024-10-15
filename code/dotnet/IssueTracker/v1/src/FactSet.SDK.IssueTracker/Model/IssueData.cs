/*
 * Issue Tracker API
 *
 * This API is used to file issues
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
using OpenAPIDateConverter = FactSet.SDK.IssueTracker.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IssueTracker.Model
{
    /// <summary>
    /// IssueData
    /// </summary>
    [DataContract(Name = "issue_data")]
    public partial class IssueData : IEquatable<IssueData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IssueData" /> class.
        /// </summary>
        /// <param name="id">generated issue id for Issue Tracker.</param>
        /// <param name="subject">subject of Issue Tracker issue.</param>
        /// <param name="comments">array of comments added to issue.</param>
        /// <param name="isCritical">isCritical.</param>
        /// <param name="internalId">internalId.</param>
        public IssueData(string id = default(string), string subject = default(string), List<Comment> comments = default(List<Comment>), bool isCritical = default(bool), int internalId = default(int))
        {
            this.Id = id;
            this.Subject = subject;
            this.Comments = comments;
            this.IsCritical = isCritical;
            this.InternalId = internalId;
        }

        /// <summary>
        /// generated issue id for Issue Tracker
        /// </summary>
        /// <value>generated issue id for Issue Tracker</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// subject of Issue Tracker issue
        /// </summary>
        /// <value>subject of Issue Tracker issue</value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public string Subject { get; set; }

        /// <summary>
        /// array of comments added to issue
        /// </summary>
        /// <value>array of comments added to issue</value>
        [DataMember(Name = "comments", EmitDefaultValue = false)]
        public List<Comment> Comments { get; set; }

        /// <summary>
        /// Gets or Sets IsCritical
        /// </summary>
        [DataMember(Name = "isCritical", EmitDefaultValue = true)]
        public bool IsCritical { get; set; }

        /// <summary>
        /// Gets or Sets InternalId
        /// </summary>
        [DataMember(Name = "internalId", EmitDefaultValue = false)]
        public int InternalId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IssueData {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  Comments: ").Append(Comments).Append("\n");
            sb.Append("  IsCritical: ").Append(IsCritical).Append("\n");
            sb.Append("  InternalId: ").Append(InternalId).Append("\n");
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
            return this.Equals(input as IssueData);
        }

        /// <summary>
        /// Returns true if IssueData instances are equal
        /// </summary>
        /// <param name="input">Instance of IssueData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IssueData input)
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
                    this.Subject == input.Subject ||
                    (this.Subject != null &&
                    this.Subject.Equals(input.Subject))
                ) && 
                (
                    this.Comments == input.Comments ||
                    this.Comments != null &&
                    input.Comments != null &&
                    this.Comments.SequenceEqual(input.Comments)
                ) && 
                (
                    this.IsCritical == input.IsCritical ||
                    this.IsCritical.Equals(input.IsCritical)
                ) && 
                (
                    this.InternalId == input.InternalId ||
                    this.InternalId.Equals(input.InternalId)
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
                if (this.Subject != null)
                {
                    hashCode = (hashCode * 59) + this.Subject.GetHashCode();
                }
                if (this.Comments != null)
                {
                    hashCode = (hashCode * 59) + this.Comments.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsCritical.GetHashCode();
                hashCode = (hashCode * 59) + this.InternalId.GetHashCode();
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
