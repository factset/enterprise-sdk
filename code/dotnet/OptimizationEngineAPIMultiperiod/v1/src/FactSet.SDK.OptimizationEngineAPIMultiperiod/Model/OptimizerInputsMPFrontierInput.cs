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
    /// OptimizerInputsMPFrontierInput
    /// </summary>
    [DataContract(Name = "optimizer.inputs.MPFrontierInput")]
    public partial class OptimizerInputsMPFrontierInput : IEquatable<OptimizerInputsMPFrontierInput>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsMPFrontierInput" /> class.
        /// </summary>
        /// <param name="input">input.</param>
        /// <param name="frontier">frontier.</param>
        public OptimizerInputsMPFrontierInput(OptimizerInputsMultiPeriodInput input = default(OptimizerInputsMultiPeriodInput), OptimizerInputsFrontierSettings frontier = default(OptimizerInputsFrontierSettings))
        {
            this.Input = input;
            this.Frontier = frontier;
        }

        /// <summary>
        /// Gets or Sets Input
        /// </summary>
        [DataMember(Name = "input", EmitDefaultValue = false)]
        public OptimizerInputsMultiPeriodInput Input { get; set; }

        /// <summary>
        /// Gets or Sets Frontier
        /// </summary>
        [DataMember(Name = "frontier", EmitDefaultValue = false)]
        public OptimizerInputsFrontierSettings Frontier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsMPFrontierInput {\n");
            sb.Append("  Input: ").Append(Input).Append("\n");
            sb.Append("  Frontier: ").Append(Frontier).Append("\n");
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
            return this.Equals(input as OptimizerInputsMPFrontierInput);
        }

        /// <summary>
        /// Returns true if OptimizerInputsMPFrontierInput instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsMPFrontierInput to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsMPFrontierInput input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Input == input.Input ||
                    (this.Input != null &&
                    this.Input.Equals(input.Input))
                ) && 
                (
                    this.Frontier == input.Frontier ||
                    (this.Frontier != null &&
                    this.Frontier.Equals(input.Frontier))
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
                if (this.Input != null)
                {
                    hashCode = (hashCode * 59) + this.Input.GetHashCode();
                }
                if (this.Frontier != null)
                {
                    hashCode = (hashCode * 59) + this.Frontier.GetHashCode();
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
