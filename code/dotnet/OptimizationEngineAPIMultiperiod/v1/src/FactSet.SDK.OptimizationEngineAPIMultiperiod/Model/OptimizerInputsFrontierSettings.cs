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
    /// OptimizerInputsFrontierSettings
    /// </summary>
    [DataContract(Name = "optimizer.inputs.FrontierSettings")]
    public partial class OptimizerInputsFrontierSettings : IEquatable<OptimizerInputsFrontierSettings>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsFrontierSettings" /> class.
        /// </summary>
        /// <param name="constraintName">constraintName.</param>
        /// <param name="objectiveTermName">objectiveTermName.</param>
        /// <param name="min">min.</param>
        /// <param name="max">max.</param>
        public OptimizerInputsFrontierSettings(string constraintName = default(string), string objectiveTermName = default(string), OptimizerInputsRange min = default(OptimizerInputsRange), OptimizerInputsRange max = default(OptimizerInputsRange))
        {
            this.ConstraintName = constraintName;
            this.ObjectiveTermName = objectiveTermName;
            this.Min = min;
            this.Max = max;
        }

        /// <summary>
        /// Gets or Sets ConstraintName
        /// </summary>
        [DataMember(Name = "constraint_name", EmitDefaultValue = false)]
        public string ConstraintName { get; set; }

        /// <summary>
        /// Gets or Sets ObjectiveTermName
        /// </summary>
        [DataMember(Name = "objective_term_name", EmitDefaultValue = false)]
        public string ObjectiveTermName { get; set; }

        /// <summary>
        /// Gets or Sets Min
        /// </summary>
        [DataMember(Name = "min", EmitDefaultValue = false)]
        public OptimizerInputsRange Min { get; set; }

        /// <summary>
        /// Gets or Sets Max
        /// </summary>
        [DataMember(Name = "max", EmitDefaultValue = false)]
        public OptimizerInputsRange Max { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsFrontierSettings {\n");
            sb.Append("  ConstraintName: ").Append(ConstraintName).Append("\n");
            sb.Append("  ObjectiveTermName: ").Append(ObjectiveTermName).Append("\n");
            sb.Append("  Min: ").Append(Min).Append("\n");
            sb.Append("  Max: ").Append(Max).Append("\n");
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
            return this.Equals(input as OptimizerInputsFrontierSettings);
        }

        /// <summary>
        /// Returns true if OptimizerInputsFrontierSettings instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsFrontierSettings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsFrontierSettings input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ConstraintName == input.ConstraintName ||
                    (this.ConstraintName != null &&
                    this.ConstraintName.Equals(input.ConstraintName))
                ) && 
                (
                    this.ObjectiveTermName == input.ObjectiveTermName ||
                    (this.ObjectiveTermName != null &&
                    this.ObjectiveTermName.Equals(input.ObjectiveTermName))
                ) && 
                (
                    this.Min == input.Min ||
                    (this.Min != null &&
                    this.Min.Equals(input.Min))
                ) && 
                (
                    this.Max == input.Max ||
                    (this.Max != null &&
                    this.Max.Equals(input.Max))
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
                if (this.ConstraintName != null)
                {
                    hashCode = (hashCode * 59) + this.ConstraintName.GetHashCode();
                }
                if (this.ObjectiveTermName != null)
                {
                    hashCode = (hashCode * 59) + this.ObjectiveTermName.GetHashCode();
                }
                if (this.Min != null)
                {
                    hashCode = (hashCode * 59) + this.Min.GetHashCode();
                }
                if (this.Max != null)
                {
                    hashCode = (hashCode * 59) + this.Max.GetHashCode();
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
