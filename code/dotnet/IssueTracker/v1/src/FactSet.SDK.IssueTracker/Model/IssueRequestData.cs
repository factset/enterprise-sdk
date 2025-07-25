/*
 * Issue Tracker API
 *
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 1.4.0
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
    /// create issue request
    /// </summary>
    [DataContract(Name = "IssueRequest_data")]
    public partial class IssueRequestData : IEquatable<IssueRequestData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IssueRequestData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected IssueRequestData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="IssueRequestData" /> class.
        /// </summary>
        /// <param name="subject">subject for new Issue Tracker issue (required).</param>
        /// <param name="description">Comprehensive description of the issue, including any problems you&#39;ve observed or any specific changes you&#39;d like to request. (required).</param>
        /// <param name="productId">Issue Tracker product  (required).</param>
        /// <param name="categoryId">category of Factset Product. .</param>
        /// <param name="severity">severity of issue tracker ticket. Mainly it accepting three severities.  Critical, High and Medium..</param>
        /// <param name="attachments">attachments.</param>
        public IssueRequestData(string subject, string description, string productId,string categoryId = default(string), string severity = default(string), List<Attachment> attachments = default(List<Attachment>))
        {
            // to ensure "subject" is required (not null)
            if (subject == null) {
                throw new ArgumentNullException("subject is a required property for IssueRequestData and cannot be null");
            }
            this.Subject = subject;
            // to ensure "description" is required (not null)
            if (description == null) {
                throw new ArgumentNullException("description is a required property for IssueRequestData and cannot be null");
            }
            this.Description = description;
            // to ensure "productId" is required (not null)
            if (productId == null) {
                throw new ArgumentNullException("productId is a required property for IssueRequestData and cannot be null");
            }
            this.ProductId = productId;
            this.CategoryId = categoryId;
            this.Severity = severity;
            this.Attachments = attachments;
        }

        /// <summary>
        /// subject for new Issue Tracker issue
        /// </summary>
        /// <value>subject for new Issue Tracker issue</value>
        [DataMember(Name = "subject", IsRequired = true, EmitDefaultValue = false)]
        public string Subject { get; set; }

        /// <summary>
        /// Comprehensive description of the issue, including any problems you&#39;ve observed or any specific changes you&#39;d like to request.
        /// </summary>
        /// <value>Comprehensive description of the issue, including any problems you&#39;ve observed or any specific changes you&#39;d like to request.</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Issue Tracker product 
        /// </summary>
        /// <value>Issue Tracker product </value>
        [DataMember(Name = "productId", IsRequired = true, EmitDefaultValue = false)]
        public string ProductId { get; set; }

        /// <summary>
        /// category of Factset Product. 
        /// </summary>
        /// <value>category of Factset Product. </value>
        [DataMember(Name = "categoryId", EmitDefaultValue = false)]
        public string CategoryId { get; set; }

        /// <summary>
        /// severity of issue tracker ticket. Mainly it accepting three severities.  Critical, High and Medium.
        /// </summary>
        /// <value>severity of issue tracker ticket. Mainly it accepting three severities.  Critical, High and Medium.</value>
        [DataMember(Name = "severity", EmitDefaultValue = false)]
        public string Severity { get; set; }

        /// <summary>
        /// Gets or Sets Attachments
        /// </summary>
        [DataMember(Name = "attachments", EmitDefaultValue = false)]
        public List<Attachment> Attachments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IssueRequestData {\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  ProductId: ").Append(ProductId).Append("\n");
            sb.Append("  CategoryId: ").Append(CategoryId).Append("\n");
            sb.Append("  Severity: ").Append(Severity).Append("\n");
            sb.Append("  Attachments: ").Append(Attachments).Append("\n");
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
            return this.Equals(input as IssueRequestData);
        }

        /// <summary>
        /// Returns true if IssueRequestData instances are equal
        /// </summary>
        /// <param name="input">Instance of IssueRequestData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IssueRequestData input)
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
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.ProductId == input.ProductId ||
                    (this.ProductId != null &&
                    this.ProductId.Equals(input.ProductId))
                ) && 
                (
                    this.CategoryId == input.CategoryId ||
                    (this.CategoryId != null &&
                    this.CategoryId.Equals(input.CategoryId))
                ) && 
                (
                    this.Severity == input.Severity ||
                    (this.Severity != null &&
                    this.Severity.Equals(input.Severity))
                ) && 
                (
                    this.Attachments == input.Attachments ||
                    this.Attachments != null &&
                    input.Attachments != null &&
                    this.Attachments.SequenceEqual(input.Attachments)
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
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.ProductId != null)
                {
                    hashCode = (hashCode * 59) + this.ProductId.GetHashCode();
                }
                if (this.CategoryId != null)
                {
                    hashCode = (hashCode * 59) + this.CategoryId.GetHashCode();
                }
                if (this.Severity != null)
                {
                    hashCode = (hashCode * 59) + this.Severity.GetHashCode();
                }
                if (this.Attachments != null)
                {
                    hashCode = (hashCode * 59) + this.Attachments.GetHashCode();
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
