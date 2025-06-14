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
    /// FactSetProtobufStachV3TableViewTypesFormatTypesFormatString
    /// </summary>
    [DataContract(Name = "FactSet.Protobuf.Stach.V3.TableView.Types.Format.Types.FormatString")]
    public partial class FactSetProtobufStachV3TableViewTypesFormatTypesFormatString : IEquatable<FactSetProtobufStachV3TableViewTypesFormatTypesFormatString>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FactSetProtobufStachV3TableViewTypesFormatTypesFormatString" /> class.
        /// </summary>
        /// <param name="singleValue">singleValue.</param>
        /// <param name="nameBasedComposite">nameBasedComposite.</param>
        /// <param name="typeCase">typeCase.</param>
        public FactSetProtobufStachV3TableViewTypesFormatTypesFormatString(FactSetProtobufStachV3TableViewTypesFormatTypesSingleValueFormatString singleValue = default(FactSetProtobufStachV3TableViewTypesFormatTypesSingleValueFormatString), Object nameBasedComposite = default(Object), FactSetProtobufStachV3TableViewTypesFormatTypesFormatStringTypeOneofCase typeCase = default(FactSetProtobufStachV3TableViewTypesFormatTypesFormatStringTypeOneofCase))
        {
            this.SingleValue = singleValue;
            this.NameBasedComposite = nameBasedComposite;
            this.TypeCase = typeCase;
        }

        /// <summary>
        /// Gets or Sets SingleValue
        /// </summary>
        [DataMember(Name = "singleValue", EmitDefaultValue = false)]
        public FactSetProtobufStachV3TableViewTypesFormatTypesSingleValueFormatString SingleValue { get; set; }

        /// <summary>
        /// Gets or Sets NameBasedComposite
        /// </summary>
        [DataMember(Name = "nameBasedComposite", EmitDefaultValue = false)]
        public Object NameBasedComposite { get; set; }

        /// <summary>
        /// Gets or Sets TypeCase
        /// </summary>
        [DataMember(Name = "typeCase", EmitDefaultValue = false)]
        public FactSetProtobufStachV3TableViewTypesFormatTypesFormatStringTypeOneofCase TypeCase { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FactSetProtobufStachV3TableViewTypesFormatTypesFormatString {\n");
            sb.Append("  SingleValue: ").Append(SingleValue).Append("\n");
            sb.Append("  NameBasedComposite: ").Append(NameBasedComposite).Append("\n");
            sb.Append("  TypeCase: ").Append(TypeCase).Append("\n");
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
            return this.Equals(input as FactSetProtobufStachV3TableViewTypesFormatTypesFormatString);
        }

        /// <summary>
        /// Returns true if FactSetProtobufStachV3TableViewTypesFormatTypesFormatString instances are equal
        /// </summary>
        /// <param name="input">Instance of FactSetProtobufStachV3TableViewTypesFormatTypesFormatString to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FactSetProtobufStachV3TableViewTypesFormatTypesFormatString input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SingleValue == input.SingleValue ||
                    (this.SingleValue != null &&
                    this.SingleValue.Equals(input.SingleValue))
                ) && 
                (
                    this.NameBasedComposite == input.NameBasedComposite ||
                    (this.NameBasedComposite != null &&
                    this.NameBasedComposite.Equals(input.NameBasedComposite))
                ) && 
                (
                    this.TypeCase == input.TypeCase ||
                    (this.TypeCase != null &&
                    this.TypeCase.Equals(input.TypeCase))
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
                if (this.SingleValue != null)
                {
                    hashCode = (hashCode * 59) + this.SingleValue.GetHashCode();
                }
                if (this.NameBasedComposite != null)
                {
                    hashCode = (hashCode * 59) + this.NameBasedComposite.GetHashCode();
                }
                if (this.TypeCase != null)
                {
                    hashCode = (hashCode * 59) + this.TypeCase.GetHashCode();
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
