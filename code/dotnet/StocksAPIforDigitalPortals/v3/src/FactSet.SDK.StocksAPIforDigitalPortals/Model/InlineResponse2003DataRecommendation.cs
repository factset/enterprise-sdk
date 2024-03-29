/*
 * Stocks API For Digital Portals
 *
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
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
    /// Details of the recommendations.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_data_recommendation")]
    public partial class InlineResponse2003DataRecommendation : IEquatable<InlineResponse2003DataRecommendation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003DataRecommendation" /> class.
        /// </summary>
        /// <param name="latestUpdate">Date of the latest update..</param>
        /// <param name="counts">counts.</param>
        /// <param name="consensus">Recommendation consensus, that is the average value of all provided recommendations. Values are in the range from 1.0 to 5.0, whereby 1 represents the strongest buy recommendation, 3 a hold (neutral) recommendation and 5 the strongest sell recommendation..</param>
        public InlineResponse2003DataRecommendation(DateTime? latestUpdate = default(DateTime?), InlineResponse2003DataRecommendationCounts counts = default(InlineResponse2003DataRecommendationCounts), decimal? consensus = default(decimal?))
        {
            this.LatestUpdate = latestUpdate;
            this.Counts = counts;
            this.Consensus = consensus;
        }

        /// <summary>
        /// Date of the latest update.
        /// </summary>
        /// <value>Date of the latest update.</value>
        [DataMember(Name = "latestUpdate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? LatestUpdate { get; set; }

        /// <summary>
        /// Gets or Sets Counts
        /// </summary>
        [DataMember(Name = "counts", EmitDefaultValue = false)]
        public InlineResponse2003DataRecommendationCounts Counts { get; set; }

        /// <summary>
        /// Recommendation consensus, that is the average value of all provided recommendations. Values are in the range from 1.0 to 5.0, whereby 1 represents the strongest buy recommendation, 3 a hold (neutral) recommendation and 5 the strongest sell recommendation.
        /// </summary>
        /// <value>Recommendation consensus, that is the average value of all provided recommendations. Values are in the range from 1.0 to 5.0, whereby 1 represents the strongest buy recommendation, 3 a hold (neutral) recommendation and 5 the strongest sell recommendation.</value>
        [DataMember(Name = "consensus", EmitDefaultValue = true)]
        public decimal? Consensus { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2003DataRecommendation {\n");
            sb.Append("  LatestUpdate: ").Append(LatestUpdate).Append("\n");
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
            return this.Equals(input as InlineResponse2003DataRecommendation);
        }

        /// <summary>
        /// Returns true if InlineResponse2003DataRecommendation instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003DataRecommendation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003DataRecommendation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.LatestUpdate == input.LatestUpdate ||
                    (this.LatestUpdate != null &&
                    this.LatestUpdate.Equals(input.LatestUpdate))
                ) && 
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
                if (this.LatestUpdate != null)
                {
                    hashCode = (hashCode * 59) + this.LatestUpdate.GetHashCode();
                }
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
