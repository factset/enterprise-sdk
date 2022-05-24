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
    /// OptimizerInputsExpectedReturn
    /// </summary>
    [DataContract(Name = "optimizer.inputs.ExpectedReturn")]
    public partial class OptimizerInputsExpectedReturn : IEquatable<OptimizerInputsExpectedReturn>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsExpectedReturn" /> class.
        /// </summary>
        /// <param name="alpha">alpha.</param>
        /// <param name="alphaUnit">alphaUnit.</param>
        public OptimizerInputsExpectedReturn(OptimizerInputsValue alpha = default(OptimizerInputsValue), OptimizerInputsEAlphaUnitTypeEnum alphaUnit = default(OptimizerInputsEAlphaUnitTypeEnum))
        {
            this.Alpha = alpha;
            this.AlphaUnit = alphaUnit;
        }

        /// <summary>
        /// Gets or Sets Alpha
        /// </summary>
        [DataMember(Name = "alpha", EmitDefaultValue = false)]
        public OptimizerInputsValue Alpha { get; set; }

        /// <summary>
        /// Gets or Sets AlphaUnit
        /// </summary>
        [DataMember(Name = "alpha_unit", EmitDefaultValue = false)]
        public OptimizerInputsEAlphaUnitTypeEnum AlphaUnit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsExpectedReturn {\n");
            sb.Append("  Alpha: ").Append(Alpha).Append("\n");
            sb.Append("  AlphaUnit: ").Append(AlphaUnit).Append("\n");
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
            return this.Equals(input as OptimizerInputsExpectedReturn);
        }

        /// <summary>
        /// Returns true if OptimizerInputsExpectedReturn instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsExpectedReturn to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsExpectedReturn input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Alpha == input.Alpha ||
                    (this.Alpha != null &&
                    this.Alpha.Equals(input.Alpha))
                ) && 
                (
                    this.AlphaUnit == input.AlphaUnit ||
                    (this.AlphaUnit != null &&
                    this.AlphaUnit.Equals(input.AlphaUnit))
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
                if (this.Alpha != null)
                {
                    hashCode = (hashCode * 59) + this.Alpha.GetHashCode();
                }
                if (this.AlphaUnit != null)
                {
                    hashCode = (hashCode * 59) + this.AlphaUnit.GetHashCode();
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