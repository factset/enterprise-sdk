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
    /// OptimizerInputsPortfolioItem
    /// </summary>
    [DataContract(Name = "optimizer.inputs.PortfolioItem")]
    public partial class OptimizerInputsPortfolioItem : IEquatable<OptimizerInputsPortfolioItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsPortfolioItem" /> class.
        /// </summary>
        /// <param name="univIndex">univIndex.</param>
        /// <param name="price">price.</param>
        /// <param name="shares">shares.</param>
        public OptimizerInputsPortfolioItem(int univIndex = default(int), OptimizerInputsAssetPrice price = default(OptimizerInputsAssetPrice), double shares = default(double))
        {
            this.UnivIndex = univIndex;
            this.Price = price;
            this.Shares = shares;
        }

        /// <summary>
        /// Gets or Sets UnivIndex
        /// </summary>
        [DataMember(Name = "univ_index", EmitDefaultValue = false)]
        public int UnivIndex { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public OptimizerInputsAssetPrice Price { get; set; }

        /// <summary>
        /// Gets or Sets Shares
        /// </summary>
        [DataMember(Name = "shares", EmitDefaultValue = false)]
        public double Shares { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsPortfolioItem {\n");
            sb.Append("  UnivIndex: ").Append(UnivIndex).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Shares: ").Append(Shares).Append("\n");
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
            return this.Equals(input as OptimizerInputsPortfolioItem);
        }

        /// <summary>
        /// Returns true if OptimizerInputsPortfolioItem instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsPortfolioItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsPortfolioItem input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.UnivIndex == input.UnivIndex ||
                    this.UnivIndex.Equals(input.UnivIndex)
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.Shares == input.Shares ||
                    this.Shares.Equals(input.Shares)
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
                hashCode = (hashCode * 59) + this.UnivIndex.GetHashCode();
                if (this.Price != null)
                {
                    hashCode = (hashCode * 59) + this.Price.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Shares.GetHashCode();
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
