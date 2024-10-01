/*
 * PA Engine API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
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
using OpenAPIDateConverter = FactSet.SDK.PAEngine.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PAEngine.Model
{
    /// <summary>
    /// LinkedPATemplateUpdateParameters
    /// </summary>
    [DataContract(Name = "LinkedPATemplateUpdateParameters")]
    public partial class LinkedPATemplateUpdateParameters : IEquatable<LinkedPATemplateUpdateParameters>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LinkedPATemplateUpdateParameters" /> class.
        /// </summary>
        /// <param name="parentComponentId">Parent component id.</param>
        /// <param name="description">Template description.</param>
        /// <param name="content">content.</param>
        public LinkedPATemplateUpdateParameters(string parentComponentId = default(string), string description = default(string), TemplateContentTypes content = default(TemplateContentTypes))
        {
            this.ParentComponentId = parentComponentId;
            this.Description = description;
            this.Content = content;
        }

        /// <summary>
        /// Parent component id
        /// </summary>
        /// <value>Parent component id</value>
        [DataMember(Name = "parentComponentId", EmitDefaultValue = true)]
        public string ParentComponentId { get; set; }

        /// <summary>
        /// Template description
        /// </summary>
        /// <value>Template description</value>
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Content
        /// </summary>
        [DataMember(Name = "content", EmitDefaultValue = false)]
        public TemplateContentTypes Content { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LinkedPATemplateUpdateParameters {\n");
            sb.Append("  ParentComponentId: ").Append(ParentComponentId).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
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
            return this.Equals(input as LinkedPATemplateUpdateParameters);
        }

        /// <summary>
        /// Returns true if LinkedPATemplateUpdateParameters instances are equal
        /// </summary>
        /// <param name="input">Instance of LinkedPATemplateUpdateParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LinkedPATemplateUpdateParameters input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ParentComponentId == input.ParentComponentId ||
                    (this.ParentComponentId != null &&
                    this.ParentComponentId.Equals(input.ParentComponentId))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Content == input.Content ||
                    (this.Content != null &&
                    this.Content.Equals(input.Content))
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
                if (this.ParentComponentId != null)
                {
                    hashCode = (hashCode * 59) + this.ParentComponentId.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.Content != null)
                {
                    hashCode = (hashCode * 59) + this.Content.GetHashCode();
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
