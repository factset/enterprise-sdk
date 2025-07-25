/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.4.0
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
    /// An individual PATCH operation that is part of a PATCH request.
    /// </summary>
    [DataContract(Name = "PatchOperation")]
    public partial class PatchOperation : IEquatable<PatchOperation>, IValidatableObject
    {
        /// <summary>
        /// Indicates the HTTP PATCH operation to perform. For details on the \&quot;add\&quot; operation, see RFC 7644 section 3.5.2.1. For details on the \&quot;remove\&quot; operation, see RFC 7644 section 3.5.2.2. For details on the \&quot;replace\&quot; operation, see RFC 7644 section 3.5.2.3.
        /// </summary>
        /// <value>Indicates the HTTP PATCH operation to perform. For details on the \&quot;add\&quot; operation, see RFC 7644 section 3.5.2.1. For details on the \&quot;remove\&quot; operation, see RFC 7644 section 3.5.2.2. For details on the \&quot;replace\&quot; operation, see RFC 7644 section 3.5.2.3.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OpEnum
        {
            /// <summary>
            /// Enum Add for value: add
            /// </summary>
            [EnumMember(Value = "add")]
            Add = 1,

            /// <summary>
            /// Enum Remove for value: remove
            /// </summary>
            [EnumMember(Value = "remove")]
            Remove = 2,

            /// <summary>
            /// Enum Replace for value: replace
            /// </summary>
            [EnumMember(Value = "replace")]
            Replace = 3

        }


        /// <summary>
        /// Indicates the HTTP PATCH operation to perform. For details on the \&quot;add\&quot; operation, see RFC 7644 section 3.5.2.1. For details on the \&quot;remove\&quot; operation, see RFC 7644 section 3.5.2.2. For details on the \&quot;replace\&quot; operation, see RFC 7644 section 3.5.2.3.
        /// </summary>
        /// <value>Indicates the HTTP PATCH operation to perform. For details on the \&quot;add\&quot; operation, see RFC 7644 section 3.5.2.1. For details on the \&quot;remove\&quot; operation, see RFC 7644 section 3.5.2.2. For details on the \&quot;replace\&quot; operation, see RFC 7644 section 3.5.2.3.</value>
        [DataMember(Name = "op", EmitDefaultValue = false)]
        public OpEnum? Op { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PatchOperation" /> class.
        /// </summary>
        /// <param name="op">Indicates the HTTP PATCH operation to perform. For details on the \&quot;add\&quot; operation, see RFC 7644 section 3.5.2.1. For details on the \&quot;remove\&quot; operation, see RFC 7644 section 3.5.2.2. For details on the \&quot;replace\&quot; operation, see RFC 7644 section 3.5.2.3..</param>
        /// <param name="path">Describes the target of the HTTP PATCH operation. This is optional for \&quot;add\&quot; and \&quot;replace\&quot; operations and is required for \&quot;remove\&quot; operations..</param>
        /// <param name="value">value.</param>
        public PatchOperation(OpEnum? op = default(OpEnum?), string path = default(string), PatchOperationValue value = default(PatchOperationValue))
        {
            this.Op = op;
            this.Path = path;
            this.Value = value;
        }

        /// <summary>
        /// Describes the target of the HTTP PATCH operation. This is optional for \&quot;add\&quot; and \&quot;replace\&quot; operations and is required for \&quot;remove\&quot; operations.
        /// </summary>
        /// <value>Describes the target of the HTTP PATCH operation. This is optional for \&quot;add\&quot; and \&quot;replace\&quot; operations and is required for \&quot;remove\&quot; operations.</value>
        [DataMember(Name = "path", EmitDefaultValue = false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public PatchOperationValue Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PatchOperation {\n");
            sb.Append("  Op: ").Append(Op).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as PatchOperation);
        }

        /// <summary>
        /// Returns true if PatchOperation instances are equal
        /// </summary>
        /// <param name="input">Instance of PatchOperation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PatchOperation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Op == input.Op ||
                    this.Op.Equals(input.Op)
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
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
                hashCode = (hashCode * 59) + this.Op.GetHashCode();
                if (this.Path != null)
                {
                    hashCode = (hashCode * 59) + this.Path.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
