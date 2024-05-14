/*
 * Issue Tracker API
 *
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 1.1.0
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
    /// UpdateIssueRequestData
    /// </summary>
    [DataContract(Name = "updateIssueRequest_data")]
    public partial class UpdateIssueRequestData : IEquatable<UpdateIssueRequestData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UpdateIssueRequestData" /> class.
        /// </summary>
        /// <param name="subject">subject of ticket.</param>
        /// <param name="isCritical">severity of issue.</param>
        public UpdateIssueRequestData(string subject = default(string), bool isCritical = default(bool))
        {
            this.Subject = subject;
            this.IsCritical = isCritical;
        }

        /// <summary>
        /// subject of ticket
        /// </summary>
        /// <value>subject of ticket</value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public string Subject { get; set; }

        /// <summary>
        /// severity of issue
        /// </summary>
        /// <value>severity of issue</value>
        [DataMember(Name = "isCritical", EmitDefaultValue = true)]
        public bool IsCritical { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UpdateIssueRequestData {\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  IsCritical: ").Append(IsCritical).Append("\n");
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
            return this.Equals(input as UpdateIssueRequestData);
        }

        /// <summary>
        /// Returns true if UpdateIssueRequestData instances are equal
        /// </summary>
        /// <param name="input">Instance of UpdateIssueRequestData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateIssueRequestData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Subject == input.Subject ||
                    (this.Subject != null &&
                    this.Subject.Equals(input.Subject))
                ) && 
                (
                    this.IsCritical == input.IsCritical ||
                    this.IsCritical.Equals(input.IsCritical)
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
                if (this.Subject != null)
                {
                    hashCode = (hashCode * 59) + this.Subject.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsCritical.GetHashCode();
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
