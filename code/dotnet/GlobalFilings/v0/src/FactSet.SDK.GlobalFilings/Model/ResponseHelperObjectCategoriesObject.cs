/*
 * Global Filings API
 *
 * The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet’s document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  Helper endpoint will provide dynamic information on the parameters of a document request. .
 *
 * The version of the OpenAPI document: 0.0.0
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
using OpenAPIDateConverter = FactSet.SDK.GlobalFilings.Client.OpenAPIDateConverter;

namespace FactSet.SDK.GlobalFilings.Model
{
    /// <summary>
    /// ResponseHelperObjectCategoriesObject
    /// </summary>
    [DataContract(Name = "responseHelperObject_categoriesObject")]
    public partial class ResponseHelperObjectCategoriesObject : IEquatable<ResponseHelperObjectCategoriesObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResponseHelperObjectCategoriesObject" /> class.
        /// </summary>
        /// <param name="subject">subject code.</param>
        /// <param name="category">category.</param>
        /// <param name="description">description.</param>
        public ResponseHelperObjectCategoriesObject(string subject = default(string), string category = default(string), string description = default(string))
        {
            this.Subject = subject;
            this.Category = category;
            this.Description = description;
        }

        /// <summary>
        /// subject code
        /// </summary>
        /// <value>subject code</value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public string Subject { get; set; }

        /// <summary>
        /// category
        /// </summary>
        /// <value>category</value>
        [DataMember(Name = "category", EmitDefaultValue = false)]
        public string Category { get; set; }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResponseHelperObjectCategoriesObject {\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
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
            return this.Equals(input as ResponseHelperObjectCategoriesObject);
        }

        /// <summary>
        /// Returns true if ResponseHelperObjectCategoriesObject instances are equal
        /// </summary>
        /// <param name="input">Instance of ResponseHelperObjectCategoriesObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResponseHelperObjectCategoriesObject input)
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
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
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
                if (this.Category != null)
                {
                    hashCode = (hashCode * 59) + this.Category.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
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
