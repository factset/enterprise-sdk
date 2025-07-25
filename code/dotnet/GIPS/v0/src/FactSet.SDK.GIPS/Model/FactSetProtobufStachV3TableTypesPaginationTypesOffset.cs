/*
 * GIPS API
 *
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
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
using OpenAPIDateConverter = FactSet.SDK.GIPS.Client.OpenAPIDateConverter;

namespace FactSet.SDK.GIPS.Model
{
    /// <summary>
    /// FactSetProtobufStachV3TableTypesPaginationTypesOffset
    /// </summary>
    [DataContract(Name = "FactSet.Protobuf.Stach.V3.Table.Types.Pagination.Types.Offset")]
    public partial class FactSetProtobufStachV3TableTypesPaginationTypesOffset : IEquatable<FactSetProtobufStachV3TableTypesPaginationTypesOffset>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FactSetProtobufStachV3TableTypesPaginationTypesOffset" /> class.
        /// </summary>
        /// <param name="hasNext">hasNext.</param>
        public FactSetProtobufStachV3TableTypesPaginationTypesOffset(bool hasNext = default(bool))
        {
            this.HasNext = hasNext;
        }

        /// <summary>
        /// Gets or Sets HasNext
        /// </summary>
        [DataMember(Name = "hasNext", EmitDefaultValue = true)]
        public bool HasNext { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FactSetProtobufStachV3TableTypesPaginationTypesOffset {\n");
            sb.Append("  HasNext: ").Append(HasNext).Append("\n");
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
            return this.Equals(input as FactSetProtobufStachV3TableTypesPaginationTypesOffset);
        }

        /// <summary>
        /// Returns true if FactSetProtobufStachV3TableTypesPaginationTypesOffset instances are equal
        /// </summary>
        /// <param name="input">Instance of FactSetProtobufStachV3TableTypesPaginationTypesOffset to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FactSetProtobufStachV3TableTypesPaginationTypesOffset input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.HasNext == input.HasNext ||
                    this.HasNext.Equals(input.HasNext)
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
                hashCode = (hashCode * 59) + this.HasNext.GetHashCode();
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
