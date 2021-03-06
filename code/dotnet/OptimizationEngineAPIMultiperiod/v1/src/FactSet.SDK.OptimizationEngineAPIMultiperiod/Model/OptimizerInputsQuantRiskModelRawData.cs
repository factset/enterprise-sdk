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
    /// OptimizerInputsQuantRiskModelRawData
    /// </summary>
    [DataContract(Name = "optimizer.inputs.QuantRiskModelRawData")]
    public partial class OptimizerInputsQuantRiskModelRawData : IEquatable<OptimizerInputsQuantRiskModelRawData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsQuantRiskModelRawData" /> class.
        /// </summary>
        /// <param name="labels">labels.</param>
        /// <param name="rawAssetCovarianceMatrix">rawAssetCovarianceMatrix.</param>
        /// <param name="rawFactorExposure">rawFactorExposure.</param>
        /// <param name="rawFactorCovarianceMatrix">rawFactorCovarianceMatrix.</param>
        /// <param name="riskModelCoverageFlag">riskModelCoverageFlag.</param>
        public OptimizerInputsQuantRiskModelRawData(OptimizerInputsLabels labels = default(OptimizerInputsLabels), OptimizerInputsSparseMatrix rawAssetCovarianceMatrix = default(OptimizerInputsSparseMatrix), OptimizerInputsSparseMatrix rawFactorExposure = default(OptimizerInputsSparseMatrix), OptimizerInputsDenseMatrix rawFactorCovarianceMatrix = default(OptimizerInputsDenseMatrix), List<int> riskModelCoverageFlag = default(List<int>))
        {
            this.Labels = labels;
            this.RawAssetCovarianceMatrix = rawAssetCovarianceMatrix;
            this.RawFactorExposure = rawFactorExposure;
            this.RawFactorCovarianceMatrix = rawFactorCovarianceMatrix;
            this.RiskModelCoverageFlag = riskModelCoverageFlag;
        }

        /// <summary>
        /// Gets or Sets Labels
        /// </summary>
        [DataMember(Name = "labels", EmitDefaultValue = false)]
        public OptimizerInputsLabels Labels { get; set; }

        /// <summary>
        /// Gets or Sets RawAssetCovarianceMatrix
        /// </summary>
        [DataMember(Name = "RawAssetCovarianceMatrix", EmitDefaultValue = false)]
        public OptimizerInputsSparseMatrix RawAssetCovarianceMatrix { get; set; }

        /// <summary>
        /// Gets or Sets RawFactorExposure
        /// </summary>
        [DataMember(Name = "RawFactorExposure", EmitDefaultValue = false)]
        public OptimizerInputsSparseMatrix RawFactorExposure { get; set; }

        /// <summary>
        /// Gets or Sets RawFactorCovarianceMatrix
        /// </summary>
        [DataMember(Name = "RawFactorCovarianceMatrix", EmitDefaultValue = false)]
        public OptimizerInputsDenseMatrix RawFactorCovarianceMatrix { get; set; }

        /// <summary>
        /// Gets or Sets RiskModelCoverageFlag
        /// </summary>
        [DataMember(Name = "RiskModelCoverageFlag", EmitDefaultValue = false)]
        public List<int> RiskModelCoverageFlag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsQuantRiskModelRawData {\n");
            sb.Append("  Labels: ").Append(Labels).Append("\n");
            sb.Append("  RawAssetCovarianceMatrix: ").Append(RawAssetCovarianceMatrix).Append("\n");
            sb.Append("  RawFactorExposure: ").Append(RawFactorExposure).Append("\n");
            sb.Append("  RawFactorCovarianceMatrix: ").Append(RawFactorCovarianceMatrix).Append("\n");
            sb.Append("  RiskModelCoverageFlag: ").Append(RiskModelCoverageFlag).Append("\n");
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
            return this.Equals(input as OptimizerInputsQuantRiskModelRawData);
        }

        /// <summary>
        /// Returns true if OptimizerInputsQuantRiskModelRawData instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsQuantRiskModelRawData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsQuantRiskModelRawData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Labels == input.Labels ||
                    (this.Labels != null &&
                    this.Labels.Equals(input.Labels))
                ) && 
                (
                    this.RawAssetCovarianceMatrix == input.RawAssetCovarianceMatrix ||
                    (this.RawAssetCovarianceMatrix != null &&
                    this.RawAssetCovarianceMatrix.Equals(input.RawAssetCovarianceMatrix))
                ) && 
                (
                    this.RawFactorExposure == input.RawFactorExposure ||
                    (this.RawFactorExposure != null &&
                    this.RawFactorExposure.Equals(input.RawFactorExposure))
                ) && 
                (
                    this.RawFactorCovarianceMatrix == input.RawFactorCovarianceMatrix ||
                    (this.RawFactorCovarianceMatrix != null &&
                    this.RawFactorCovarianceMatrix.Equals(input.RawFactorCovarianceMatrix))
                ) && 
                (
                    this.RiskModelCoverageFlag == input.RiskModelCoverageFlag ||
                    this.RiskModelCoverageFlag != null &&
                    input.RiskModelCoverageFlag != null &&
                    this.RiskModelCoverageFlag.SequenceEqual(input.RiskModelCoverageFlag)
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
                if (this.Labels != null)
                {
                    hashCode = (hashCode * 59) + this.Labels.GetHashCode();
                }
                if (this.RawAssetCovarianceMatrix != null)
                {
                    hashCode = (hashCode * 59) + this.RawAssetCovarianceMatrix.GetHashCode();
                }
                if (this.RawFactorExposure != null)
                {
                    hashCode = (hashCode * 59) + this.RawFactorExposure.GetHashCode();
                }
                if (this.RawFactorCovarianceMatrix != null)
                {
                    hashCode = (hashCode * 59) + this.RawFactorCovarianceMatrix.GetHashCode();
                }
                if (this.RiskModelCoverageFlag != null)
                {
                    hashCode = (hashCode * 59) + this.RiskModelCoverageFlag.GetHashCode();
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
