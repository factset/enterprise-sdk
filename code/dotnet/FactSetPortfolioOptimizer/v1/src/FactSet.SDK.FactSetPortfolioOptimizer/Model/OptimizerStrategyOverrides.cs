/*
 * Engines API
 *
 * Allow clients to fetch Engines Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPortfolioOptimizer.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPortfolioOptimizer.Model
{
    /// <summary>
    /// OptimizerStrategyOverrides
    /// </summary>
    [DataContract(Name = "OptimizerStrategyOverrides")]
    public partial class OptimizerStrategyOverrides : IEquatable<OptimizerStrategyOverrides>, IValidatableObject
    {
        /// <summary>
        /// Defines Inner
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum InnerEnum
        {
            /// <summary>
            /// Enum Disable for value: Disable
            /// </summary>
            [EnumMember(Value = "Disable")]
            Disable = 1,

            /// <summary>
            /// Enum Enable for value: Enable
            /// </summary>
            [EnumMember(Value = "Enable")]
            Enable = 2

        }



        /// <summary>
        /// List of constraints
        /// </summary>
        /// <value>List of constraints</value>
        [DataMember(Name = "constraints", EmitDefaultValue = false)]
        public Dictionary<string, InnerEnum> Constraints { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerStrategyOverrides" /> class.
        /// </summary>
        /// <param name="tax">Tax.</param>
        /// <param name="objective">Objective.</param>
        /// <param name="constraints">List of constraints.</param>
        /// <param name="alpha">Alpha.</param>
        /// <param name="transactioncost">Transaction cost.</param>
        public OptimizerStrategyOverrides(string tax = default(string), string objective = default(string), Dictionary<string, InnerEnum> constraints = default(Dictionary<string, InnerEnum>), string alpha = default(string), string transactioncost = default(string))
        {
            this.Tax = tax;
            this.Objective = objective;
            this.Constraints = constraints;
            this.Alpha = alpha;
            this.Transactioncost = transactioncost;
        }

        /// <summary>
        /// Tax
        /// </summary>
        /// <value>Tax</value>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public string Tax { get; set; }

        /// <summary>
        /// Objective
        /// </summary>
        /// <value>Objective</value>
        [DataMember(Name = "objective", EmitDefaultValue = false)]
        public string Objective { get; set; }

        /// <summary>
        /// Alpha
        /// </summary>
        /// <value>Alpha</value>
        [DataMember(Name = "alpha", EmitDefaultValue = false)]
        public string Alpha { get; set; }

        /// <summary>
        /// Transaction cost
        /// </summary>
        /// <value>Transaction cost</value>
        [DataMember(Name = "transactioncost", EmitDefaultValue = false)]
        public string Transactioncost { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerStrategyOverrides {\n");
            sb.Append("  Tax: ").Append(Tax).Append("\n");
            sb.Append("  Objective: ").Append(Objective).Append("\n");
            sb.Append("  Constraints: ").Append(Constraints).Append("\n");
            sb.Append("  Alpha: ").Append(Alpha).Append("\n");
            sb.Append("  Transactioncost: ").Append(Transactioncost).Append("\n");
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
            return this.Equals(input as OptimizerStrategyOverrides);
        }

        /// <summary>
        /// Returns true if OptimizerStrategyOverrides instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerStrategyOverrides to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerStrategyOverrides input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Tax == input.Tax ||
                    (this.Tax != null &&
                    this.Tax.Equals(input.Tax))
                ) && 
                (
                    this.Objective == input.Objective ||
                    (this.Objective != null &&
                    this.Objective.Equals(input.Objective))
                ) && 
                (
                    this.Constraints == input.Constraints ||
                    this.Constraints.SequenceEqual(input.Constraints)
                ) && 
                (
                    this.Alpha == input.Alpha ||
                    (this.Alpha != null &&
                    this.Alpha.Equals(input.Alpha))
                ) && 
                (
                    this.Transactioncost == input.Transactioncost ||
                    (this.Transactioncost != null &&
                    this.Transactioncost.Equals(input.Transactioncost))
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
                if (this.Tax != null)
                {
                    hashCode = (hashCode * 59) + this.Tax.GetHashCode();
                }
                if (this.Objective != null)
                {
                    hashCode = (hashCode * 59) + this.Objective.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Constraints.GetHashCode();
                if (this.Alpha != null)
                {
                    hashCode = (hashCode * 59) + this.Alpha.GetHashCode();
                }
                if (this.Transactioncost != null)
                {
                    hashCode = (hashCode * 59) + this.Transactioncost.GetHashCode();
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
