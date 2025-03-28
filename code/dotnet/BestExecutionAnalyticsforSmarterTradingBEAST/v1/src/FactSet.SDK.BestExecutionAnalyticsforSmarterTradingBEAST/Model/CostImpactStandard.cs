/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 *
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Model
{
    /// <summary>
    /// The Cost Impact Standard object
    /// </summary>
    [DataContract(Name = "CostImpactStandard")]
    public partial class CostImpactStandard : IEquatable<CostImpactStandard>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CostImpactStandard" /> class.
        /// </summary>
        /// <param name="costPerShare">Cost Per Share.</param>
        /// <param name="liquidityCostPerShare">Liquidity Cost Per Share.</param>
        /// <param name="spreadCostPerShare">Spread Cost Per Share.</param>
        /// <param name="costPerShareBps">Cost Per Share Bps.</param>
        /// <param name="liquidityCostPerShareBps">Liquidity Cost Per Share Bps.</param>
        /// <param name="spreadCostPerShareBps">Spread Cost Per Share Bps.</param>
        /// <param name="marketImpact">Market Impact.</param>
        /// <param name="confidenceInterval">Confidence Interval.</param>
        public CostImpactStandard(double costPerShare = default(double), double liquidityCostPerShare = default(double), double spreadCostPerShare = default(double), double costPerShareBps = default(double), double liquidityCostPerShareBps = default(double), double spreadCostPerShareBps = default(double), double marketImpact = default(double), double confidenceInterval = default(double))
        {
            this.CostPerShare = costPerShare;
            this.LiquidityCostPerShare = liquidityCostPerShare;
            this.SpreadCostPerShare = spreadCostPerShare;
            this.CostPerShareBps = costPerShareBps;
            this.LiquidityCostPerShareBps = liquidityCostPerShareBps;
            this.SpreadCostPerShareBps = spreadCostPerShareBps;
            this.MarketImpact = marketImpact;
            this.ConfidenceInterval = confidenceInterval;
        }

        /// <summary>
        /// Cost Per Share
        /// </summary>
        /// <value>Cost Per Share</value>
        [DataMember(Name = "costPerShare", EmitDefaultValue = false)]
        public double CostPerShare { get; set; }

        /// <summary>
        /// Liquidity Cost Per Share
        /// </summary>
        /// <value>Liquidity Cost Per Share</value>
        [DataMember(Name = "liquidityCostPerShare", EmitDefaultValue = false)]
        public double LiquidityCostPerShare { get; set; }

        /// <summary>
        /// Spread Cost Per Share
        /// </summary>
        /// <value>Spread Cost Per Share</value>
        [DataMember(Name = "spreadCostPerShare", EmitDefaultValue = false)]
        public double SpreadCostPerShare { get; set; }

        /// <summary>
        /// Cost Per Share Bps
        /// </summary>
        /// <value>Cost Per Share Bps</value>
        [DataMember(Name = "costPerShareBps", EmitDefaultValue = false)]
        public double CostPerShareBps { get; set; }

        /// <summary>
        /// Liquidity Cost Per Share Bps
        /// </summary>
        /// <value>Liquidity Cost Per Share Bps</value>
        [DataMember(Name = "liquidityCostPerShareBps", EmitDefaultValue = false)]
        public double LiquidityCostPerShareBps { get; set; }

        /// <summary>
        /// Spread Cost Per Share Bps
        /// </summary>
        /// <value>Spread Cost Per Share Bps</value>
        [DataMember(Name = "spreadCostPerShareBps", EmitDefaultValue = false)]
        public double SpreadCostPerShareBps { get; set; }

        /// <summary>
        /// Market Impact
        /// </summary>
        /// <value>Market Impact</value>
        [DataMember(Name = "marketImpact", EmitDefaultValue = false)]
        public double MarketImpact { get; set; }

        /// <summary>
        /// Confidence Interval
        /// </summary>
        /// <value>Confidence Interval</value>
        [DataMember(Name = "confidenceInterval", EmitDefaultValue = false)]
        public double ConfidenceInterval { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CostImpactStandard {\n");
            sb.Append("  CostPerShare: ").Append(CostPerShare).Append("\n");
            sb.Append("  LiquidityCostPerShare: ").Append(LiquidityCostPerShare).Append("\n");
            sb.Append("  SpreadCostPerShare: ").Append(SpreadCostPerShare).Append("\n");
            sb.Append("  CostPerShareBps: ").Append(CostPerShareBps).Append("\n");
            sb.Append("  LiquidityCostPerShareBps: ").Append(LiquidityCostPerShareBps).Append("\n");
            sb.Append("  SpreadCostPerShareBps: ").Append(SpreadCostPerShareBps).Append("\n");
            sb.Append("  MarketImpact: ").Append(MarketImpact).Append("\n");
            sb.Append("  ConfidenceInterval: ").Append(ConfidenceInterval).Append("\n");
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
            return this.Equals(input as CostImpactStandard);
        }

        /// <summary>
        /// Returns true if CostImpactStandard instances are equal
        /// </summary>
        /// <param name="input">Instance of CostImpactStandard to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CostImpactStandard input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.CostPerShare == input.CostPerShare ||
                    this.CostPerShare.Equals(input.CostPerShare)
                ) && 
                (
                    this.LiquidityCostPerShare == input.LiquidityCostPerShare ||
                    this.LiquidityCostPerShare.Equals(input.LiquidityCostPerShare)
                ) && 
                (
                    this.SpreadCostPerShare == input.SpreadCostPerShare ||
                    this.SpreadCostPerShare.Equals(input.SpreadCostPerShare)
                ) && 
                (
                    this.CostPerShareBps == input.CostPerShareBps ||
                    this.CostPerShareBps.Equals(input.CostPerShareBps)
                ) && 
                (
                    this.LiquidityCostPerShareBps == input.LiquidityCostPerShareBps ||
                    this.LiquidityCostPerShareBps.Equals(input.LiquidityCostPerShareBps)
                ) && 
                (
                    this.SpreadCostPerShareBps == input.SpreadCostPerShareBps ||
                    this.SpreadCostPerShareBps.Equals(input.SpreadCostPerShareBps)
                ) && 
                (
                    this.MarketImpact == input.MarketImpact ||
                    this.MarketImpact.Equals(input.MarketImpact)
                ) && 
                (
                    this.ConfidenceInterval == input.ConfidenceInterval ||
                    this.ConfidenceInterval.Equals(input.ConfidenceInterval)
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
                hashCode = (hashCode * 59) + this.CostPerShare.GetHashCode();
                hashCode = (hashCode * 59) + this.LiquidityCostPerShare.GetHashCode();
                hashCode = (hashCode * 59) + this.SpreadCostPerShare.GetHashCode();
                hashCode = (hashCode * 59) + this.CostPerShareBps.GetHashCode();
                hashCode = (hashCode * 59) + this.LiquidityCostPerShareBps.GetHashCode();
                hashCode = (hashCode * 59) + this.SpreadCostPerShareBps.GetHashCode();
                hashCode = (hashCode * 59) + this.MarketImpact.GetHashCode();
                hashCode = (hashCode * 59) + this.ConfidenceInterval.GetHashCode();
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
