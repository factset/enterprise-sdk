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
    /// 16
    /// </summary>
    [DataContract(Name = "optimizer.inputs.LimitRiskETLConstraint")]
    public partial class OptimizerInputsLimitRiskETLConstraint : IEquatable<OptimizerInputsLimitRiskETLConstraint>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsLimitRiskETLConstraint" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="maxEtl">maxEtl.</param>
        /// <param name="confidenceLevel">confidenceLevel.</param>
        /// <param name="penalty">penalty.</param>
        /// <param name="groups">groups.</param>
        /// <param name="level">level.</param>
        /// <param name="activeEtl">activeEtl.</param>
        /// <param name="benchmarkIndex">benchmarkIndex.</param>
        /// <param name="hierarchy">hierarchy.</param>
        public OptimizerInputsLimitRiskETLConstraint(string name = default(string), OptimizerInputsValue maxEtl = default(OptimizerInputsValue), OptimizerInputsValue confidenceLevel = default(OptimizerInputsValue), OptimizerInputsPenalty penalty = default(OptimizerInputsPenalty), List<OptimizerInputsConstraintGroup> groups = default(List<OptimizerInputsConstraintGroup>), OptimizerInputsEConstraintLevelEnum level = default(OptimizerInputsEConstraintLevelEnum), bool activeEtl = default(bool), int benchmarkIndex = default(int), int hierarchy = default(int))
        {
            this.Name = name;
            this.MaxEtl = maxEtl;
            this.ConfidenceLevel = confidenceLevel;
            this.Penalty = penalty;
            this.Groups = groups;
            this.Level = level;
            this.ActiveEtl = activeEtl;
            this.BenchmarkIndex = benchmarkIndex;
            this.Hierarchy = hierarchy;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets MaxEtl
        /// </summary>
        [DataMember(Name = "max_etl", EmitDefaultValue = false)]
        public OptimizerInputsValue MaxEtl { get; set; }

        /// <summary>
        /// Gets or Sets ConfidenceLevel
        /// </summary>
        [DataMember(Name = "confidence_level", EmitDefaultValue = false)]
        public OptimizerInputsValue ConfidenceLevel { get; set; }

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
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name = "level", EmitDefaultValue = false)]
        public OptimizerInputsEConstraintLevelEnum Level { get; set; }

        /// <summary>
        /// Gets or Sets ActiveEtl
        /// </summary>
        [DataMember(Name = "active_etl", EmitDefaultValue = true)]
        public bool ActiveEtl { get; set; }

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
            sb.Append("class OptimizerInputsLimitRiskETLConstraint {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  MaxEtl: ").Append(MaxEtl).Append("\n");
            sb.Append("  ConfidenceLevel: ").Append(ConfidenceLevel).Append("\n");
            sb.Append("  Penalty: ").Append(Penalty).Append("\n");
            sb.Append("  Groups: ").Append(Groups).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  ActiveEtl: ").Append(ActiveEtl).Append("\n");
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
            return this.Equals(input as OptimizerInputsLimitRiskETLConstraint);
        }

        /// <summary>
        /// Returns true if OptimizerInputsLimitRiskETLConstraint instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsLimitRiskETLConstraint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsLimitRiskETLConstraint input)
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
                    this.MaxEtl == input.MaxEtl ||
                    (this.MaxEtl != null &&
                    this.MaxEtl.Equals(input.MaxEtl))
                ) && 
                (
                    this.ConfidenceLevel == input.ConfidenceLevel ||
                    (this.ConfidenceLevel != null &&
                    this.ConfidenceLevel.Equals(input.ConfidenceLevel))
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
                    this.Level == input.Level ||
                    (this.Level != null &&
                    this.Level.Equals(input.Level))
                ) && 
                (
                    this.ActiveEtl == input.ActiveEtl ||
                    this.ActiveEtl.Equals(input.ActiveEtl)
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
                if (this.MaxEtl != null)
                {
                    hashCode = (hashCode * 59) + this.MaxEtl.GetHashCode();
                }
                if (this.ConfidenceLevel != null)
                {
                    hashCode = (hashCode * 59) + this.ConfidenceLevel.GetHashCode();
                }
                if (this.Penalty != null)
                {
                    hashCode = (hashCode * 59) + this.Penalty.GetHashCode();
                }
                if (this.Groups != null)
                {
                    hashCode = (hashCode * 59) + this.Groups.GetHashCode();
                }
                if (this.Level != null)
                {
                    hashCode = (hashCode * 59) + this.Level.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ActiveEtl.GetHashCode();
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
