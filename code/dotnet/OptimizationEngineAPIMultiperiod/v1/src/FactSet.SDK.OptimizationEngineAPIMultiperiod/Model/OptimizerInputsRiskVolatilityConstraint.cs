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
    /// 18
    /// </summary>
    [DataContract(Name = "optimizer.inputs.RiskVolatilityConstraint")]
    public partial class OptimizerInputsRiskVolatilityConstraint : IEquatable<OptimizerInputsRiskVolatilityConstraint>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsRiskVolatilityConstraint" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="maxValueOfRisk">maxValueOfRisk.</param>
        /// <param name="level">level.</param>
        /// <param name="penalty">penalty.</param>
        /// <param name="groups">groups.</param>
        /// <param name="riskType">riskType.</param>
        /// <param name="activeRisk">activeRisk.</param>
        /// <param name="benchmarkIndex">benchmarkIndex.</param>
        /// <param name="hierarchy">hierarchy.</param>
        public OptimizerInputsRiskVolatilityConstraint(string name = default(string), OptimizerInputsValue maxValueOfRisk = default(OptimizerInputsValue), OptimizerInputsEConstraintLevelEnum level = default(OptimizerInputsEConstraintLevelEnum), OptimizerInputsPenalty penalty = default(OptimizerInputsPenalty), List<OptimizerInputsConstraintGroup> groups = default(List<OptimizerInputsConstraintGroup>), OptimizerInputsEConstraintRiskTypeEnum riskType = default(OptimizerInputsEConstraintRiskTypeEnum), bool activeRisk = default(bool), int benchmarkIndex = default(int), int hierarchy = default(int))
        {
            this.Name = name;
            this.MaxValueOfRisk = maxValueOfRisk;
            this.Level = level;
            this.Penalty = penalty;
            this.Groups = groups;
            this.RiskType = riskType;
            this.ActiveRisk = activeRisk;
            this.BenchmarkIndex = benchmarkIndex;
            this.Hierarchy = hierarchy;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets MaxValueOfRisk
        /// </summary>
        [DataMember(Name = "max_value_of_risk", EmitDefaultValue = false)]
        public OptimizerInputsValue MaxValueOfRisk { get; set; }

        /// <summary>
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name = "level", EmitDefaultValue = false)]
        public OptimizerInputsEConstraintLevelEnum Level { get; set; }

        /// <summary>
        /// Gets or Sets Penalty
        /// </summary>
        [DataMember(Name = "penalty", EmitDefaultValue = false)]
        public OptimizerInputsPenalty Penalty { get; set; }

        /// <summary>
        /// Gets or Sets Groups
        /// </summary>
        [DataMember(Name = "groups", EmitDefaultValue = false)]
        public List<OptimizerInputsConstraintGroup> Groups { get; set; }

        /// <summary>
        /// Gets or Sets RiskType
        /// </summary>
        [DataMember(Name = "risk_type", EmitDefaultValue = false)]
        public OptimizerInputsEConstraintRiskTypeEnum RiskType { get; set; }

        /// <summary>
        /// Gets or Sets ActiveRisk
        /// </summary>
        [DataMember(Name = "active_risk", EmitDefaultValue = true)]
        public bool ActiveRisk { get; set; }

        /// <summary>
        /// Gets or Sets BenchmarkIndex
        /// </summary>
        [DataMember(Name = "benchmark_index", EmitDefaultValue = false)]
        public int BenchmarkIndex { get; set; }

        /// <summary>
        /// Gets or Sets Hierarchy
        /// </summary>
        [DataMember(Name = "hierarchy", EmitDefaultValue = false)]
        public int Hierarchy { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsRiskVolatilityConstraint {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  MaxValueOfRisk: ").Append(MaxValueOfRisk).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  Penalty: ").Append(Penalty).Append("\n");
            sb.Append("  Groups: ").Append(Groups).Append("\n");
            sb.Append("  RiskType: ").Append(RiskType).Append("\n");
            sb.Append("  ActiveRisk: ").Append(ActiveRisk).Append("\n");
            sb.Append("  BenchmarkIndex: ").Append(BenchmarkIndex).Append("\n");
            sb.Append("  Hierarchy: ").Append(Hierarchy).Append("\n");
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
            return this.Equals(input as OptimizerInputsRiskVolatilityConstraint);
        }

        /// <summary>
        /// Returns true if OptimizerInputsRiskVolatilityConstraint instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsRiskVolatilityConstraint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsRiskVolatilityConstraint input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.MaxValueOfRisk == input.MaxValueOfRisk ||
                    (this.MaxValueOfRisk != null &&
                    this.MaxValueOfRisk.Equals(input.MaxValueOfRisk))
                ) && 
                (
                    this.Level == input.Level ||
                    (this.Level != null &&
                    this.Level.Equals(input.Level))
                ) && 
                (
                    this.Penalty == input.Penalty ||
                    (this.Penalty != null &&
                    this.Penalty.Equals(input.Penalty))
                ) && 
                (
                    this.Groups == input.Groups ||
                    this.Groups != null &&
                    input.Groups != null &&
                    this.Groups.SequenceEqual(input.Groups)
                ) && 
                (
                    this.RiskType == input.RiskType ||
                    (this.RiskType != null &&
                    this.RiskType.Equals(input.RiskType))
                ) && 
                (
                    this.ActiveRisk == input.ActiveRisk ||
                    this.ActiveRisk.Equals(input.ActiveRisk)
                ) && 
                (
                    this.BenchmarkIndex == input.BenchmarkIndex ||
                    this.BenchmarkIndex.Equals(input.BenchmarkIndex)
                ) && 
                (
                    this.Hierarchy == input.Hierarchy ||
                    this.Hierarchy.Equals(input.Hierarchy)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.MaxValueOfRisk != null)
                {
                    hashCode = (hashCode * 59) + this.MaxValueOfRisk.GetHashCode();
                }
                if (this.Level != null)
                {
                    hashCode = (hashCode * 59) + this.Level.GetHashCode();
                }
                if (this.Penalty != null)
                {
                    hashCode = (hashCode * 59) + this.Penalty.GetHashCode();
                }
                if (this.Groups != null)
                {
                    hashCode = (hashCode * 59) + this.Groups.GetHashCode();
                }
                if (this.RiskType != null)
                {
                    hashCode = (hashCode * 59) + this.RiskType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ActiveRisk.GetHashCode();
                hashCode = (hashCode * 59) + this.BenchmarkIndex.GetHashCode();
                hashCode = (hashCode * 59) + this.Hierarchy.GetHashCode();
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
