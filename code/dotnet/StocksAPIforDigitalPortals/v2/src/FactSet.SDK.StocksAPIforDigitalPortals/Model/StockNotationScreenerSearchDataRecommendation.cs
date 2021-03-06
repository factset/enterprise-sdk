/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// Aggregated recommendation.
    /// </summary>
    [DataContract(Name = "_stock_notation_screener_search_data_recommendation")]
    public partial class StockNotationScreenerSearchDataRecommendation : IEquatable<StockNotationScreenerSearchDataRecommendation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationScreenerSearchDataRecommendation" /> class.
        /// </summary>
        /// <param name="counts">counts.</param>
        /// <param name="consensus">consensus.</param>
        public StockNotationScreenerSearchDataRecommendation(StockNotationScreenerSearchDataRecommendationCounts counts = default(StockNotationScreenerSearchDataRecommendationCounts), StockNotationScreenerSearchDataRecommendationConsensus consensus = default(StockNotationScreenerSearchDataRecommendationConsensus))
        {
            this.Counts = counts;
            this.Consensus = consensus;
        }

        /// <summary>
        /// Gets or Sets Counts
        /// </summary>
        [DataMember(Name = "counts", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataRecommendationCounts Counts { get; set; }

        /// <summary>
        /// Gets or Sets Consensus
        /// </summary>
        [DataMember(Name = "consensus", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataRecommendationConsensus Consensus { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StockNotationScreenerSearchDataRecommendation {\n");
            sb.Append("  Counts: ").Append(Counts).Append("\n");
            sb.Append("  Consensus: ").Append(Consensus).Append("\n");
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
            return this.Equals(input as StockNotationScreenerSearchDataRecommendation);
        }

        /// <summary>
        /// Returns true if StockNotationScreenerSearchDataRecommendation instances are equal
        /// </summary>
        /// <param name="input">Instance of StockNotationScreenerSearchDataRecommendation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StockNotationScreenerSearchDataRecommendation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Counts == input.Counts ||
                    (this.Counts != null &&
                    this.Counts.Equals(input.Counts))
                ) && 
                (
                    this.Consensus == input.Consensus ||
                    (this.Consensus != null &&
                    this.Consensus.Equals(input.Consensus))
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
                if (this.Counts != null)
                {
                    hashCode = (hashCode * 59) + this.Counts.GetHashCode();
                }
                if (this.Consensus != null)
                {
                    hashCode = (hashCode * 59) + this.Consensus.GetHashCode();
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
