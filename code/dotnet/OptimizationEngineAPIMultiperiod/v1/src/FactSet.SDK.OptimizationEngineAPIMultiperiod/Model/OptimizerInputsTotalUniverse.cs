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
    /// OptimizerInputsTotalUniverse
    /// </summary>
    [DataContract(Name = "optimizer.inputs.TotalUniverse")]
    public partial class OptimizerInputsTotalUniverse : IEquatable<OptimizerInputsTotalUniverse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsTotalUniverse" /> class.
        /// </summary>
        /// <param name="assets">assets.</param>
        /// <param name="compositeAssets">compositeAssets.</param>
        /// <param name="derivatives">derivatives.</param>
        public OptimizerInputsTotalUniverse(List<OptimizerInputsAsset> assets = default(List<OptimizerInputsAsset>), OptimizerInputsCompositeAsset compositeAssets = default(OptimizerInputsCompositeAsset), OptimizerInputsDerivative derivatives = default(OptimizerInputsDerivative))
        {
            this.Assets = assets;
            this.CompositeAssets = compositeAssets;
            this.Derivatives = derivatives;
        }

        /// <summary>
        /// Gets or Sets Assets
        /// </summary>
        [DataMember(Name = "assets", EmitDefaultValue = false)]
        public List<OptimizerInputsAsset> Assets { get; set; }

        /// <summary>
        /// Gets or Sets CompositeAssets
        /// </summary>
        [DataMember(Name = "composite_assets", EmitDefaultValue = false)]
        public OptimizerInputsCompositeAsset CompositeAssets { get; set; }

        /// <summary>
        /// Gets or Sets Derivatives
        /// </summary>
        [DataMember(Name = "derivatives", EmitDefaultValue = false)]
        public OptimizerInputsDerivative Derivatives { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsTotalUniverse {\n");
            sb.Append("  Assets: ").Append(Assets).Append("\n");
            sb.Append("  CompositeAssets: ").Append(CompositeAssets).Append("\n");
            sb.Append("  Derivatives: ").Append(Derivatives).Append("\n");
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
            return this.Equals(input as OptimizerInputsTotalUniverse);
        }

        /// <summary>
        /// Returns true if OptimizerInputsTotalUniverse instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsTotalUniverse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsTotalUniverse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Assets == input.Assets ||
                    this.Assets != null &&
                    input.Assets != null &&
                    this.Assets.SequenceEqual(input.Assets)
                ) && 
                (
                    this.CompositeAssets == input.CompositeAssets ||
                    (this.CompositeAssets != null &&
                    this.CompositeAssets.Equals(input.CompositeAssets))
                ) && 
                (
                    this.Derivatives == input.Derivatives ||
                    (this.Derivatives != null &&
                    this.Derivatives.Equals(input.Derivatives))
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
                if (this.Assets != null)
                {
                    hashCode = (hashCode * 59) + this.Assets.GetHashCode();
                }
                if (this.CompositeAssets != null)
                {
                    hashCode = (hashCode * 59) + this.CompositeAssets.GetHashCode();
                }
                if (this.Derivatives != null)
                {
                    hashCode = (hashCode * 59) + this.Derivatives.GetHashCode();
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
