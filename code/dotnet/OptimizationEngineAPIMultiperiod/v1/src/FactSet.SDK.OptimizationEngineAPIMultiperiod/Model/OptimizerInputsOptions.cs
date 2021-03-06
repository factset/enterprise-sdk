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
    /// OptimizerInputsOptions
    /// </summary>
    [DataContract(Name = "optimizer.inputs.Options")]
    public partial class OptimizerInputsOptions : IEquatable<OptimizerInputsOptions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsOptions" /> class.
        /// </summary>
        /// <param name="maxRunTime">maxRunTime.</param>
        /// <param name="convergenceTolerance">convergenceTolerance.</param>
        /// <param name="cashFlowFormula">cashFlowFormula.</param>
        /// <param name="convertWeightsToCashForIp">convertWeightsToCashForIp.</param>
        /// <param name="convertWeightsToCashForBmk">convertWeightsToCashForBmk.</param>
        /// <param name="compositeAssetLookthroughLevel">compositeAssetLookthroughLevel.</param>
        public OptimizerInputsOptions(int maxRunTime = default(int), double convergenceTolerance = default(double), OptimizerInputsValue cashFlowFormula = default(OptimizerInputsValue), bool convertWeightsToCashForIp = default(bool), bool convertWeightsToCashForBmk = default(bool), int compositeAssetLookthroughLevel = default(int))
        {
            this.MaxRunTime = maxRunTime;
            this.ConvergenceTolerance = convergenceTolerance;
            this.CashFlowFormula = cashFlowFormula;
            this.ConvertWeightsToCashForIp = convertWeightsToCashForIp;
            this.ConvertWeightsToCashForBmk = convertWeightsToCashForBmk;
            this.CompositeAssetLookthroughLevel = compositeAssetLookthroughLevel;
        }

        /// <summary>
        /// Gets or Sets MaxRunTime
        /// </summary>
        [DataMember(Name = "maxRunTime", EmitDefaultValue = false)]
        public int MaxRunTime { get; set; }

        /// <summary>
        /// Gets or Sets ConvergenceTolerance
        /// </summary>
        [DataMember(Name = "ConvergenceTolerance", EmitDefaultValue = false)]
        public double ConvergenceTolerance { get; set; }

        /// <summary>
        /// Gets or Sets CashFlowFormula
        /// </summary>
        [DataMember(Name = "cash_flow_formula", EmitDefaultValue = false)]
        public OptimizerInputsValue CashFlowFormula { get; set; }

        /// <summary>
        /// Gets or Sets ConvertWeightsToCashForIp
        /// </summary>
        [DataMember(Name = "convert_weights_to_cash_for_ip", EmitDefaultValue = true)]
        public bool ConvertWeightsToCashForIp { get; set; }

        /// <summary>
        /// Gets or Sets ConvertWeightsToCashForBmk
        /// </summary>
        [DataMember(Name = "convert_weights_to_cash_for_bmk", EmitDefaultValue = true)]
        public bool ConvertWeightsToCashForBmk { get; set; }

        /// <summary>
        /// Gets or Sets CompositeAssetLookthroughLevel
        /// </summary>
        [DataMember(Name = "composite_asset_lookthrough_level", EmitDefaultValue = false)]
        public int CompositeAssetLookthroughLevel { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsOptions {\n");
            sb.Append("  MaxRunTime: ").Append(MaxRunTime).Append("\n");
            sb.Append("  ConvergenceTolerance: ").Append(ConvergenceTolerance).Append("\n");
            sb.Append("  CashFlowFormula: ").Append(CashFlowFormula).Append("\n");
            sb.Append("  ConvertWeightsToCashForIp: ").Append(ConvertWeightsToCashForIp).Append("\n");
            sb.Append("  ConvertWeightsToCashForBmk: ").Append(ConvertWeightsToCashForBmk).Append("\n");
            sb.Append("  CompositeAssetLookthroughLevel: ").Append(CompositeAssetLookthroughLevel).Append("\n");
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
            return this.Equals(input as OptimizerInputsOptions);
        }

        /// <summary>
        /// Returns true if OptimizerInputsOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsOptions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.MaxRunTime == input.MaxRunTime ||
                    this.MaxRunTime.Equals(input.MaxRunTime)
                ) && 
                (
                    this.ConvergenceTolerance == input.ConvergenceTolerance ||
                    this.ConvergenceTolerance.Equals(input.ConvergenceTolerance)
                ) && 
                (
                    this.CashFlowFormula == input.CashFlowFormula ||
                    (this.CashFlowFormula != null &&
                    this.CashFlowFormula.Equals(input.CashFlowFormula))
                ) && 
                (
                    this.ConvertWeightsToCashForIp == input.ConvertWeightsToCashForIp ||
                    this.ConvertWeightsToCashForIp.Equals(input.ConvertWeightsToCashForIp)
                ) && 
                (
                    this.ConvertWeightsToCashForBmk == input.ConvertWeightsToCashForBmk ||
                    this.ConvertWeightsToCashForBmk.Equals(input.ConvertWeightsToCashForBmk)
                ) && 
                (
                    this.CompositeAssetLookthroughLevel == input.CompositeAssetLookthroughLevel ||
                    this.CompositeAssetLookthroughLevel.Equals(input.CompositeAssetLookthroughLevel)
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
                hashCode = (hashCode * 59) + this.MaxRunTime.GetHashCode();
                hashCode = (hashCode * 59) + this.ConvergenceTolerance.GetHashCode();
                if (this.CashFlowFormula != null)
                {
                    hashCode = (hashCode * 59) + this.CashFlowFormula.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ConvertWeightsToCashForIp.GetHashCode();
                hashCode = (hashCode * 59) + this.ConvertWeightsToCashForBmk.GetHashCode();
                hashCode = (hashCode * 59) + this.CompositeAssetLookthroughLevel.GetHashCode();
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
