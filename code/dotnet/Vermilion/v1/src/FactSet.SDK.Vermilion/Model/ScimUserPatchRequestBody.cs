/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
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
using OpenAPIDateConverter = FactSet.SDK.Vermilion.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Vermilion.Model
{
    /// <summary>
    /// Defines the request payload for updating a user&#39;s attributes. The patch operation modifies specific fields of a user.
    /// </summary>
    [DataContract(Name = "ScimUserPatchRequestBody")]
    public partial class ScimUserPatchRequestBody : IEquatable<ScimUserPatchRequestBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ScimUserPatchRequestBody" /> class.
        /// </summary>
        /// <param name="schemas">A list of URIs that indicate the namespaces of the schema used in this request..</param>
        /// <param name="operations">A list of operations defining the specific changes to apply to the user&#39;s attributes. Each operation specifies an action (e.g., add, remove, replace) the target attribute and value.</param>
        public ScimUserPatchRequestBody(List<string> schemas = default(List<string>), List<ScimUserPatchOperation> operations = default(List<ScimUserPatchOperation>))
        {
            this.Schemas = schemas;
            this.Operations = operations;
        }

        /// <summary>
        /// A list of URIs that indicate the namespaces of the schema used in this request.
        /// </summary>
        /// <value>A list of URIs that indicate the namespaces of the schema used in this request.</value>
        [DataMember(Name = "schemas", EmitDefaultValue = false)]
        public List<string> Schemas { get; set; }

        /// <summary>
        /// A list of operations defining the specific changes to apply to the user&#39;s attributes. Each operation specifies an action (e.g., add, remove, replace) the target attribute and value
        /// </summary>
        /// <value>A list of operations defining the specific changes to apply to the user&#39;s attributes. Each operation specifies an action (e.g., add, remove, replace) the target attribute and value</value>
        [DataMember(Name = "Operations", EmitDefaultValue = false)]
        public List<ScimUserPatchOperation> Operations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ScimUserPatchRequestBody {\n");
            sb.Append("  Schemas: ").Append(Schemas).Append("\n");
            sb.Append("  Operations: ").Append(Operations).Append("\n");
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
            return this.Equals(input as ScimUserPatchRequestBody);
        }

        /// <summary>
        /// Returns true if ScimUserPatchRequestBody instances are equal
        /// </summary>
        /// <param name="input">Instance of ScimUserPatchRequestBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ScimUserPatchRequestBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Schemas == input.Schemas ||
                    this.Schemas != null &&
                    input.Schemas != null &&
                    this.Schemas.SequenceEqual(input.Schemas)
                ) && 
                (
                    this.Operations == input.Operations ||
                    this.Operations != null &&
                    input.Operations != null &&
                    this.Operations.SequenceEqual(input.Operations)
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
                if (this.Schemas != null)
                {
                    hashCode = (hashCode * 59) + this.Schemas.GetHashCode();
                }
                if (this.Operations != null)
                {
                    hashCode = (hashCode * 59) + this.Operations.GetHashCode();
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
