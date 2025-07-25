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
    /// generated guid of issue or comment
    /// </summary>
    [DataContract(Name = "IdResponse_data")]
    public partial class IdResponseData : IEquatable<IdResponseData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IdResponseData" /> class.
        /// </summary>
        /// <param name="id">The generated ID for either an issue or a comment varies depending on the endpoint. Specifically, for the Issues endpoint, it will return &#39;issueid,&#39; and for the comments endpoint, it will return &#39;commentid.&#39;.</param>
        public IdResponseData(string id = default(string))
        {
            this.Id = id;
        }

        /// <summary>
        /// The generated ID for either an issue or a comment varies depending on the endpoint. Specifically, for the Issues endpoint, it will return &#39;issueid,&#39; and for the comments endpoint, it will return &#39;commentid.&#39;
        /// </summary>
        /// <value>The generated ID for either an issue or a comment varies depending on the endpoint. Specifically, for the Issues endpoint, it will return &#39;issueid,&#39; and for the comments endpoint, it will return &#39;commentid.&#39;</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IdResponseData {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return this.Equals(input as IdResponseData);
        }

        /// <summary>
        /// Returns true if IdResponseData instances are equal
        /// </summary>
        /// <param name="input">Instance of IdResponseData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IdResponseData input)
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
