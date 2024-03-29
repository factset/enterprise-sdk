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
    /// ESG data for the category impact which is a weighted average of individual category scores, where the weight utilized is the category score volume.
    /// </summary>
    [DataContract(Name = "PostStockNotationScreenerSearchRequest_data_esg_truvalueLabs_sdg_impact")]
    public partial class PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact : IEquatable<PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact" /> class.
        /// </summary>
        /// <param name="insight">insight.</param>
        /// <param name="momentum">momentum.</param>
        public PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact(PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsight insight = default(PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsight), PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpactMomentum momentum = default(PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpactMomentum))
        {
            this.Insight = insight;
            this.Momentum = momentum;
        }

        /// <summary>
        /// Gets or Sets Insight
        /// </summary>
        [DataMember(Name = "insight", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsight Insight { get; set; }

        /// <summary>
        /// Gets or Sets Momentum
        /// </summary>
        [DataMember(Name = "momentum", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpactMomentum Momentum { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact {\n");
            sb.Append("  Insight: ").Append(Insight).Append("\n");
            sb.Append("  Momentum: ").Append(Momentum).Append("\n");
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
            return this.Equals(input as PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact);
        }

        /// <summary>
        /// Returns true if PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact instances are equal
        /// </summary>
        /// <param name="input">Instance of PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Insight == input.Insight ||
                    (this.Insight != null &&
                    this.Insight.Equals(input.Insight))
                ) && 
                (
                    this.Momentum == input.Momentum ||
                    (this.Momentum != null &&
                    this.Momentum.Equals(input.Momentum))
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
                if (this.Insight != null)
                {
                    hashCode = (hashCode * 59) + this.Insight.GetHashCode();
                }
                if (this.Momentum != null)
                {
                    hashCode = (hashCode * 59) + this.Momentum.GetHashCode();
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
