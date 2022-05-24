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
    /// OptimizerInputsMPTargetProbabilityTerm
    /// </summary>
    [DataContract(Name = "optimizer.inputs.MPTargetProbabilityTerm")]
    public partial class OptimizerInputsMPTargetProbabilityTerm : IEquatable<OptimizerInputsMPTargetProbabilityTerm>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsMPTargetProbabilityTerm" /> class.
        /// </summary>
        /// <param name="term">term.</param>
        /// <param name="constrainOn">constrainOn.</param>
        /// <param name="onPeriods">onPeriods.</param>
        /// <param name="acrossPeriods">acrossPeriods.</param>
        public OptimizerInputsMPTargetProbabilityTerm(OptimizerInputsTargetProbabilityTerm term = default(OptimizerInputsTargetProbabilityTerm), OptimizerInputsBoundSourceEnum constrainOn = default(OptimizerInputsBoundSourceEnum), OptimizerInputsOnPeriods onPeriods = default(OptimizerInputsOnPeriods), OptimizerInputsAcrossPeriods acrossPeriods = default(OptimizerInputsAcrossPeriods))
        {
            this.Term = term;
            this.ConstrainOn = constrainOn;
            this.OnPeriods = onPeriods;
            this.AcrossPeriods = acrossPeriods;
        }

        /// <summary>
        /// Gets or Sets Term
        /// </summary>
        [DataMember(Name = "term", EmitDefaultValue = false)]
        public OptimizerInputsTargetProbabilityTerm Term { get; set; }

        /// <summary>
        /// Gets or Sets ConstrainOn
        /// </summary>
        [DataMember(Name = "constrain_on", EmitDefaultValue = false)]
        public OptimizerInputsBoundSourceEnum ConstrainOn { get; set; }

        /// <summary>
        /// Gets or Sets OnPeriods
        /// </summary>
        [DataMember(Name = "on_periods", EmitDefaultValue = false)]
        public OptimizerInputsOnPeriods OnPeriods { get; set; }

        /// <summary>
        /// Gets or Sets AcrossPeriods
        /// </summary>
        [DataMember(Name = "across_periods", EmitDefaultValue = false)]
        public OptimizerInputsAcrossPeriods AcrossPeriods { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsMPTargetProbabilityTerm {\n");
            sb.Append("  Term: ").Append(Term).Append("\n");
            sb.Append("  ConstrainOn: ").Append(ConstrainOn).Append("\n");
            sb.Append("  OnPeriods: ").Append(OnPeriods).Append("\n");
            sb.Append("  AcrossPeriods: ").Append(AcrossPeriods).Append("\n");
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
            return this.Equals(input as OptimizerInputsMPTargetProbabilityTerm);
        }

        /// <summary>
        /// Returns true if OptimizerInputsMPTargetProbabilityTerm instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsMPTargetProbabilityTerm to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsMPTargetProbabilityTerm input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Term == input.Term ||
                    (this.Term != null &&
                    this.Term.Equals(input.Term))
                ) && 
                (
                    this.ConstrainOn == input.ConstrainOn ||
                    (this.ConstrainOn != null &&
                    this.ConstrainOn.Equals(input.ConstrainOn))
                ) && 
                (
                    this.OnPeriods == input.OnPeriods ||
                    (this.OnPeriods != null &&
                    this.OnPeriods.Equals(input.OnPeriods))
                ) && 
                (
                    this.AcrossPeriods == input.AcrossPeriods ||
                    (this.AcrossPeriods != null &&
                    this.AcrossPeriods.Equals(input.AcrossPeriods))
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
                if (this.Term != null)
                {
                    hashCode = (hashCode * 59) + this.Term.GetHashCode();
                }
                if (this.ConstrainOn != null)
                {
                    hashCode = (hashCode * 59) + this.ConstrainOn.GetHashCode();
                }
                if (this.OnPeriods != null)
                {
                    hashCode = (hashCode * 59) + this.OnPeriods.GetHashCode();
                }
                if (this.AcrossPeriods != null)
                {
                    hashCode = (hashCode * 59) + this.AcrossPeriods.GetHashCode();
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