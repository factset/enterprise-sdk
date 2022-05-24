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
    /// OptimizerInputsRawRiskModel
    /// </summary>
    [DataContract(Name = "optimizer.inputs.RawRiskModel")]
    public partial class OptimizerInputsRawRiskModel : IEquatable<OptimizerInputsRawRiskModel>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsRawRiskModel" /> class.
        /// </summary>
        /// <param name="simulations">simulations.</param>
        public OptimizerInputsRawRiskModel(List<OptimizerInputsRawRiskModelSimulations> simulations = default(List<OptimizerInputsRawRiskModelSimulations>))
        {
            this.Simulations = simulations;
        }

        /// <summary>
        /// Gets or Sets Simulations
        /// </summary>
        [DataMember(Name = "simulations", EmitDefaultValue = false)]
        public List<OptimizerInputsRawRiskModelSimulations> Simulations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsRawRiskModel {\n");
            sb.Append("  Simulations: ").Append(Simulations).Append("\n");
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
            return this.Equals(input as OptimizerInputsRawRiskModel);
        }

        /// <summary>
        /// Returns true if OptimizerInputsRawRiskModel instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsRawRiskModel to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsRawRiskModel input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Simulations == input.Simulations ||
                    this.Simulations != null &&
                    input.Simulations != null &&
                    this.Simulations.SequenceEqual(input.Simulations)
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
                if (this.Simulations != null)
                {
                    hashCode = (hashCode * 59) + this.Simulations.GetHashCode();
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