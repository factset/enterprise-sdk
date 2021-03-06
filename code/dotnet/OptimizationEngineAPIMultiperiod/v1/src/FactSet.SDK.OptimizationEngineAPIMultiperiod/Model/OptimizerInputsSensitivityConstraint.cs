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
    /// 8
    /// </summary>
    [DataContract(Name = "optimizer.inputs.SensitivityConstraint")]
    public partial class OptimizerInputsSensitivityConstraint : IEquatable<OptimizerInputsSensitivityConstraint>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsSensitivityConstraint" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="min">min.</param>
        /// <param name="max">max.</param>
        /// <param name="sensitivityAttribute">sensitivityAttribute.</param>
        /// <param name="penalty">penalty.</param>
        /// <param name="groups">groups.</param>
        /// <param name="level">level.</param>
        /// <param name="relToBenchmark">relToBenchmark.</param>
        /// <param name="benchmarkIndex">benchmarkIndex.</param>
        /// <param name="hierarchy">hierarchy.</param>
        /// <param name="unit">unit.</param>
        public OptimizerInputsSensitivityConstraint(string name = default(string), OptimizerInputsValue min = default(OptimizerInputsValue), OptimizerInputsValue max = default(OptimizerInputsValue), OptimizerInputsValue sensitivityAttribute = default(OptimizerInputsValue), OptimizerInputsPenalty penalty = default(OptimizerInputsPenalty), List<OptimizerInputsConstraintGroup> groups = default(List<OptimizerInputsConstraintGroup>), OptimizerInputsEConstraintLevelEnum level = default(OptimizerInputsEConstraintLevelEnum), bool relToBenchmark = default(bool), int benchmarkIndex = default(int), int hierarchy = default(int), OptimizerInputsEConstraintUnitTypeEnum unit = default(OptimizerInputsEConstraintUnitTypeEnum))
        {
            this.Name = name;
            this.Min = min;
            this.Max = max;
            this.SensitivityAttribute = sensitivityAttribute;
            this.Penalty = penalty;
            this.Groups = groups;
            this.Level = level;
            this.RelToBenchmark = relToBenchmark;
            this.BenchmarkIndex = benchmarkIndex;
            this.Hierarchy = hierarchy;
            this.Unit = unit;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Min
        /// </summary>
        [DataMember(Name = "min", EmitDefaultValue = false)]
        public OptimizerInputsValue Min { get; set; }

        /// <summary>
        /// Gets or Sets Max
        /// </summary>
        [DataMember(Name = "max", EmitDefaultValue = false)]
        public OptimizerInputsValue Max { get; set; }

        /// <summary>
        /// Gets or Sets SensitivityAttribute
        /// </summary>
        [DataMember(Name = "sensitivity_attribute", EmitDefaultValue = false)]
        public OptimizerInputsValue SensitivityAttribute { get; set; }

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
        /// Gets or Sets RelToBenchmark
        /// </summary>
        [DataMember(Name = "rel_to_benchmark", EmitDefaultValue = true)]
        public bool RelToBenchmark { get; set; }

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
        /// Gets or Sets Unit
        /// </summary>
        [DataMember(Name = "unit", EmitDefaultValue = false)]
        public OptimizerInputsEConstraintUnitTypeEnum Unit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsSensitivityConstraint {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Min: ").Append(Min).Append("\n");
            sb.Append("  Max: ").Append(Max).Append("\n");
            sb.Append("  SensitivityAttribute: ").Append(SensitivityAttribute).Append("\n");
            sb.Append("  Penalty: ").Append(Penalty).Append("\n");
            sb.Append("  Groups: ").Append(Groups).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  RelToBenchmark: ").Append(RelToBenchmark).Append("\n");
            sb.Append("  BenchmarkIndex: ").Append(BenchmarkIndex).Append("\n");
            sb.Append("  Hierarchy: ").Append(Hierarchy).Append("\n");
            sb.Append("  Unit: ").Append(Unit).Append("\n");
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
            return this.Equals(input as OptimizerInputsSensitivityConstraint);
        }

        /// <summary>
        /// Returns true if OptimizerInputsSensitivityConstraint instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsSensitivityConstraint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsSensitivityConstraint input)
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
                    this.Min == input.Min ||
                    (this.Min != null &&
                    this.Min.Equals(input.Min))
                ) && 
                (
                    this.Max == input.Max ||
                    (this.Max != null &&
                    this.Max.Equals(input.Max))
                ) && 
                (
                    this.SensitivityAttribute == input.SensitivityAttribute ||
                    (this.SensitivityAttribute != null &&
                    this.SensitivityAttribute.Equals(input.SensitivityAttribute))
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
                    this.RelToBenchmark == input.RelToBenchmark ||
                    this.RelToBenchmark.Equals(input.RelToBenchmark)
                ) && 
                (
                    this.BenchmarkIndex == input.BenchmarkIndex ||
                    this.BenchmarkIndex.Equals(input.BenchmarkIndex)
                ) && 
                (
                    this.Hierarchy == input.Hierarchy ||
                    this.Hierarchy.Equals(input.Hierarchy)
                ) && 
                (
                    this.Unit == input.Unit ||
                    (this.Unit != null &&
                    this.Unit.Equals(input.Unit))
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
                if (this.Min != null)
                {
                    hashCode = (hashCode * 59) + this.Min.GetHashCode();
                }
                if (this.Max != null)
                {
                    hashCode = (hashCode * 59) + this.Max.GetHashCode();
                }
                if (this.SensitivityAttribute != null)
                {
                    hashCode = (hashCode * 59) + this.SensitivityAttribute.GetHashCode();
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
                hashCode = (hashCode * 59) + this.RelToBenchmark.GetHashCode();
                hashCode = (hashCode * 59) + this.BenchmarkIndex.GetHashCode();
                hashCode = (hashCode * 59) + this.Hierarchy.GetHashCode();
                if (this.Unit != null)
                {
                    hashCode = (hashCode * 59) + this.Unit.GetHashCode();
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
