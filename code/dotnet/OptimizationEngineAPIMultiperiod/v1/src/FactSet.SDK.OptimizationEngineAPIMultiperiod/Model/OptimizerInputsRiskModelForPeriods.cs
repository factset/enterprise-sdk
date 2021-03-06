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
    /// Must have *one* model for each period
    /// </summary>
    [DataContract(Name = "optimizer.inputs.RiskModelForPeriods")]
    public partial class OptimizerInputsRiskModelForPeriods : IEquatable<OptimizerInputsRiskModelForPeriods>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsRiskModelForPeriods" /> class.
        /// </summary>
        /// <param name="riskModel">riskModel.</param>
        /// <param name="periods">periods.</param>
        public OptimizerInputsRiskModelForPeriods(OptimizerInputsRiskModel riskModel = default(OptimizerInputsRiskModel), OptimizerInputsOnPeriods periods = default(OptimizerInputsOnPeriods))
        {
            this.RiskModel = riskModel;
            this.Periods = periods;
        }

        /// <summary>
        /// Gets or Sets RiskModel
        /// </summary>
        [DataMember(Name = "risk_model", EmitDefaultValue = false)]
        public OptimizerInputsRiskModel RiskModel { get; set; }

        /// <summary>
        /// Gets or Sets Periods
        /// </summary>
        [DataMember(Name = "periods", EmitDefaultValue = false)]
        public OptimizerInputsOnPeriods Periods { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsRiskModelForPeriods {\n");
            sb.Append("  RiskModel: ").Append(RiskModel).Append("\n");
            sb.Append("  Periods: ").Append(Periods).Append("\n");
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
            return this.Equals(input as OptimizerInputsRiskModelForPeriods);
        }

        /// <summary>
        /// Returns true if OptimizerInputsRiskModelForPeriods instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsRiskModelForPeriods to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsRiskModelForPeriods input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RiskModel == input.RiskModel ||
                    (this.RiskModel != null &&
                    this.RiskModel.Equals(input.RiskModel))
                ) && 
                (
                    this.Periods == input.Periods ||
                    (this.Periods != null &&
                    this.Periods.Equals(input.Periods))
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
                if (this.RiskModel != null)
                {
                    hashCode = (hashCode * 59) + this.RiskModel.GetHashCode();
                }
                if (this.Periods != null)
                {
                    hashCode = (hashCode * 59) + this.Periods.GetHashCode();
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
