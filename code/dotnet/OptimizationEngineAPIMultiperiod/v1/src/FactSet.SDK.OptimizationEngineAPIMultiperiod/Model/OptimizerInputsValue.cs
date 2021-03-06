/*
 * fpo_mp_input
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.OptimizationEngineAPIMultiperiod.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OptimizationEngineAPIMultiperiod.Model
{
    /// <summary>
    /// OptimizerInputsValue
    /// </summary>
    [DataContract(Name = "optimizer.inputs.Value")]
    public partial class OptimizerInputsValue : IEquatable<OptimizerInputsValue>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsValue" /> class.
        /// </summary>
        /// <param name="valueType">valueType.</param>
        /// <param name="rawValue">rawValue.</param>
        /// <param name="refIndex">refIndex.</param>
        public OptimizerInputsValue(OptimizerInputsEValueTypeEnum valueType = default(OptimizerInputsEValueTypeEnum), double rawValue = default(double), int refIndex = default(int))
        {
            this.ValueType = valueType;
            this.RawValue = rawValue;
            this.RefIndex = refIndex;
        }

        /// <summary>
        /// Gets or Sets ValueType
        /// </summary>
        [DataMember(Name = "value_type", EmitDefaultValue = false)]
        public OptimizerInputsEValueTypeEnum ValueType { get; set; }

        /// <summary>
        /// Gets or Sets RawValue
        /// </summary>
        [DataMember(Name = "raw_value", EmitDefaultValue = false)]
        public double RawValue { get; set; }

        /// <summary>
        /// Gets or Sets RefIndex
        /// </summary>
        [DataMember(Name = "ref_index", EmitDefaultValue = false)]
        public int RefIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsValue {\n");
            sb.Append("  ValueType: ").Append(ValueType).Append("\n");
            sb.Append("  RawValue: ").Append(RawValue).Append("\n");
            sb.Append("  RefIndex: ").Append(RefIndex).Append("\n");
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
            return this.Equals(input as OptimizerInputsValue);
        }

        /// <summary>
        /// Returns true if OptimizerInputsValue instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsValue to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsValue input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ValueType == input.ValueType ||
                    (this.ValueType != null &&
                    this.ValueType.Equals(input.ValueType))
                ) && 
                (
                    this.RawValue == input.RawValue ||
                    this.RawValue.Equals(input.RawValue)
                ) && 
                (
                    this.RefIndex == input.RefIndex ||
                    this.RefIndex.Equals(input.RefIndex)
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
                if (this.ValueType != null)
                {
                    hashCode = (hashCode * 59) + this.ValueType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.RawValue.GetHashCode();
                hashCode = (hashCode * 59) + this.RefIndex.GetHashCode();
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
