/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.3.0
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
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPayAPISCIM.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPayAPISCIM.Model
{
    /// <summary>
    /// The request body used for the HTTP PATCH server function (see RFC 7644 section 3.5.2.) This can be used to alter an individual SCIM resource.
    /// </summary>
    [DataContract(Name = "Patch")]
    public partial class Patch : IEquatable<Patch>, IValidatableObject
    {
        /// <summary>
        /// Defines Schemas
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SchemasEnum
        {
            /// <summary>
            /// Enum Urnietfparamsscimapimessages20PatchOp for value: urn:ietf:params:scim:api:messages:2.0:PatchOp
            /// </summary>
            [EnumMember(Value = "urn:ietf:params:scim:api:messages:2.0:PatchOp")]
            Urnietfparamsscimapimessages20PatchOp = 1

        }



        /// <summary>
        /// An array containing the standard schema URI used for SCIM PATCH requests.
        /// </summary>
        /// <value>An array containing the standard schema URI used for SCIM PATCH requests.</value>
        [DataMember(Name = "schemas", EmitDefaultValue = false)]
        public List<SchemasEnum> Schemas { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Patch" /> class.
        /// </summary>
        /// <param name="schemas">An array containing the standard schema URI used for SCIM PATCH requests..</param>
        /// <param name="operations">The list of PATCH operations that should be applied for the PATCH request..</param>
        public Patch(List<SchemasEnum> schemas = default(List<SchemasEnum>), List<PatchOperation> operations = default(List<PatchOperation>))
        {
            this.Schemas = schemas;
            this.Operations = operations;
        }

        /// <summary>
        /// The list of PATCH operations that should be applied for the PATCH request.
        /// </summary>
        /// <value>The list of PATCH operations that should be applied for the PATCH request.</value>
        [DataMember(Name = "Operations", EmitDefaultValue = false)]
        public List<PatchOperation> Operations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Patch {\n");
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
            return this.Equals(input as Patch);
        }

        /// <summary>
        /// Returns true if Patch instances are equal
        /// </summary>
        /// <param name="input">Instance of Patch to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Patch input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Schemas == input.Schemas ||
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
                hashCode = (hashCode * 59) + this.Schemas.GetHashCode();
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
