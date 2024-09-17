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
    /// HitRateModelAnalytics
    /// </summary>
    [DataContract(Name = "HitRateModelAnalytics")]
    public partial class HitRateModelAnalytics : IEquatable<HitRateModelAnalytics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HitRateModelAnalytics" /> class.
        /// </summary>
        /// <param name="count">The total number of positions used in the denominator of the hit rate calculation..</param>
        /// <param name="losers">losers.</param>
        /// <param name="winLossRatio">The win/loss ratio computes the relative benefit of winners versus losers. A win/loss ratio of greater than 100% indicates that the average winner generated greater benefit (i.e., positive contribution) then was lost by the average loser (i.e., negative contribution), and vice versa. This ratio may be examined at the portfolio level, or by classification..</param>
        /// <param name="winners">winners.</param>
        public HitRateModelAnalytics(decimal count = default(decimal), HitRateModelAnalyticsLosers losers = default(HitRateModelAnalyticsLosers), decimal winLossRatio = default(decimal), HitRateModelAnalyticsWinners winners = default(HitRateModelAnalyticsWinners))
        {
            this.Count = count;
            this.Losers = losers;
            this.WinLossRatio = winLossRatio;
            this.Winners = winners;
        }

        /// <summary>
        /// The total number of positions used in the denominator of the hit rate calculation.
        /// </summary>
        /// <value>The total number of positions used in the denominator of the hit rate calculation.</value>
        [DataMember(Name = "count", EmitDefaultValue = false)]
        public decimal Count { get; set; }

        /// <summary>
        /// Gets or Sets Losers
        /// </summary>
        [DataMember(Name = "losers", EmitDefaultValue = false)]
        public HitRateModelAnalyticsLosers Losers { get; set; }

        /// <summary>
        /// The win/loss ratio computes the relative benefit of winners versus losers. A win/loss ratio of greater than 100% indicates that the average winner generated greater benefit (i.e., positive contribution) then was lost by the average loser (i.e., negative contribution), and vice versa. This ratio may be examined at the portfolio level, or by classification.
        /// </summary>
        /// <value>The win/loss ratio computes the relative benefit of winners versus losers. A win/loss ratio of greater than 100% indicates that the average winner generated greater benefit (i.e., positive contribution) then was lost by the average loser (i.e., negative contribution), and vice versa. This ratio may be examined at the portfolio level, or by classification.</value>
        [DataMember(Name = "winLossRatio", EmitDefaultValue = false)]
        public decimal WinLossRatio { get; set; }

        /// <summary>
        /// Gets or Sets Winners
        /// </summary>
        [DataMember(Name = "winners", EmitDefaultValue = false)]
        public HitRateModelAnalyticsWinners Winners { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class HitRateModelAnalytics {\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
            sb.Append("  Losers: ").Append(Losers).Append("\n");
            sb.Append("  WinLossRatio: ").Append(WinLossRatio).Append("\n");
            sb.Append("  Winners: ").Append(Winners).Append("\n");
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
            return this.Equals(input as HitRateModelAnalytics);
        }

        /// <summary>
        /// Returns true if HitRateModelAnalytics instances are equal
        /// </summary>
        /// <param name="input">Instance of HitRateModelAnalytics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HitRateModelAnalytics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Count == input.Count ||
                    this.Count.Equals(input.Count)
                ) && 
                (
                    this.Losers == input.Losers ||
                    (this.Losers != null &&
                    this.Losers.Equals(input.Losers))
                ) && 
                (
                    this.WinLossRatio == input.WinLossRatio ||
                    this.WinLossRatio.Equals(input.WinLossRatio)
                ) && 
                (
                    this.Winners == input.Winners ||
                    (this.Winners != null &&
                    this.Winners.Equals(input.Winners))
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
                hashCode = (hashCode * 59) + this.Count.GetHashCode();
                if (this.Losers != null)
                {
                    hashCode = (hashCode * 59) + this.Losers.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.WinLossRatio.GetHashCode();
                if (this.Winners != null)
                {
                    hashCode = (hashCode * 59) + this.Winners.GetHashCode();
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
