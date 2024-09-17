/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
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
using OpenAPIDateConverter = FactSet.SDK.Cabot.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Cabot.Model
{
    /// <summary>
    /// ConstructionModelAnalytics
    /// </summary>
    [DataContract(Name = "ConstructionModelAnalytics")]
    public partial class ConstructionModelAnalytics : IEquatable<ConstructionModelAnalytics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConstructionModelAnalytics" /> class.
        /// </summary>
        /// <param name="activeShare">Active Share is a measure of the percentage of stock holdings in a portfolio that differs from the benchmark index. At the extremes, a portfolio with no holdings in common with the benchmark would have 100% active share, while a portfolio that is identical to the benchmark would have 0% active share..</param>
        /// <param name="activeWeights">activeWeights.</param>
        /// <param name="positionCount">positionCount.</param>
        /// <param name="turnover">This is a measure of the degree to which the bets in the portfolio change over time. It is computed by summing the weight of all sells over the analysis timeframe and dividing this quantity by the same timeframe to produce an annualized value..</param>
        public ConstructionModelAnalytics(decimal activeShare = default(decimal), ConstructionModelAnalyticsActiveWeights activeWeights = default(ConstructionModelAnalyticsActiveWeights), ConstructionModelAnalyticsPositionCount positionCount = default(ConstructionModelAnalyticsPositionCount), decimal turnover = default(decimal))
        {
            this.ActiveShare = activeShare;
            this.ActiveWeights = activeWeights;
            this.PositionCount = positionCount;
            this.Turnover = turnover;
        }

        /// <summary>
        /// Active Share is a measure of the percentage of stock holdings in a portfolio that differs from the benchmark index. At the extremes, a portfolio with no holdings in common with the benchmark would have 100% active share, while a portfolio that is identical to the benchmark would have 0% active share.
        /// </summary>
        /// <value>Active Share is a measure of the percentage of stock holdings in a portfolio that differs from the benchmark index. At the extremes, a portfolio with no holdings in common with the benchmark would have 100% active share, while a portfolio that is identical to the benchmark would have 0% active share.</value>
        [DataMember(Name = "activeShare", EmitDefaultValue = false)]
        public decimal ActiveShare { get; set; }

        /// <summary>
        /// Gets or Sets ActiveWeights
        /// </summary>
        [DataMember(Name = "activeWeights", EmitDefaultValue = false)]
        public ConstructionModelAnalyticsActiveWeights ActiveWeights { get; set; }

        /// <summary>
        /// Gets or Sets PositionCount
        /// </summary>
        [DataMember(Name = "positionCount", EmitDefaultValue = false)]
        public ConstructionModelAnalyticsPositionCount PositionCount { get; set; }

        /// <summary>
        /// This is a measure of the degree to which the bets in the portfolio change over time. It is computed by summing the weight of all sells over the analysis timeframe and dividing this quantity by the same timeframe to produce an annualized value.
        /// </summary>
        /// <value>This is a measure of the degree to which the bets in the portfolio change over time. It is computed by summing the weight of all sells over the analysis timeframe and dividing this quantity by the same timeframe to produce an annualized value.</value>
        [DataMember(Name = "turnover", EmitDefaultValue = false)]
        public decimal Turnover { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ConstructionModelAnalytics {\n");
            sb.Append("  ActiveShare: ").Append(ActiveShare).Append("\n");
            sb.Append("  ActiveWeights: ").Append(ActiveWeights).Append("\n");
            sb.Append("  PositionCount: ").Append(PositionCount).Append("\n");
            sb.Append("  Turnover: ").Append(Turnover).Append("\n");
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
            return this.Equals(input as ConstructionModelAnalytics);
        }

        /// <summary>
        /// Returns true if ConstructionModelAnalytics instances are equal
        /// </summary>
        /// <param name="input">Instance of ConstructionModelAnalytics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConstructionModelAnalytics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ActiveShare == input.ActiveShare ||
                    this.ActiveShare.Equals(input.ActiveShare)
                ) && 
                (
                    this.ActiveWeights == input.ActiveWeights ||
                    (this.ActiveWeights != null &&
                    this.ActiveWeights.Equals(input.ActiveWeights))
                ) && 
                (
                    this.PositionCount == input.PositionCount ||
                    (this.PositionCount != null &&
                    this.PositionCount.Equals(input.PositionCount))
                ) && 
                (
                    this.Turnover == input.Turnover ||
                    this.Turnover.Equals(input.Turnover)
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
                hashCode = (hashCode * 59) + this.ActiveShare.GetHashCode();
                if (this.ActiveWeights != null)
                {
                    hashCode = (hashCode * 59) + this.ActiveWeights.GetHashCode();
                }
                if (this.PositionCount != null)
                {
                    hashCode = (hashCode * 59) + this.PositionCount.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Turnover.GetHashCode();
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
