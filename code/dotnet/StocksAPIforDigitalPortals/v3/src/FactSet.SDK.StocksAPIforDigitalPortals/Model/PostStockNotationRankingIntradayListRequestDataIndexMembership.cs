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
    /// List of indices of which a stock is a constituent. The list restricts the request to return only those stocks that are a constituent of one of the specified indices.
    /// </summary>
    [DataContract(Name = "PostStockNotationRankingIntradayListRequest_data_indexMembership")]
    public partial class PostStockNotationRankingIntradayListRequestDataIndexMembership : IEquatable<PostStockNotationRankingIntradayListRequestDataIndexMembership>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostStockNotationRankingIntradayListRequestDataIndexMembership" /> class.
        /// </summary>
        /// <param name="ids">List of index instrument identifiers..</param>
        /// <param name="useAlternativeNotation">Specifies whether an alternative notation of a constituent shall be retrieved if the market of the original notation is currently closed or if the user is not entitled for the market of the original notation. The alternative notation is the one with the highest trading volume averaged over one month that satisfies all other selected filters, such as only a specific market or a specific currency. If the original notation is not entitled and a currency has not been specified, the alternative notation may be in a different currency than the original one which makes the ranking less meaningful, especially a trading value-based ranking, see attribute &#x60;accumulated.tradingValue&#x60; in the response. (default to false).</param>
        public PostStockNotationRankingIntradayListRequestDataIndexMembership(List<string> ids = default(List<string>), bool useAlternativeNotation = false)
        {
            this.Ids = ids;
            this.UseAlternativeNotation = useAlternativeNotation;
        }

        /// <summary>
        /// List of index instrument identifiers.
        /// </summary>
        /// <value>List of index instrument identifiers.</value>
        [DataMember(Name = "ids", EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Specifies whether an alternative notation of a constituent shall be retrieved if the market of the original notation is currently closed or if the user is not entitled for the market of the original notation. The alternative notation is the one with the highest trading volume averaged over one month that satisfies all other selected filters, such as only a specific market or a specific currency. If the original notation is not entitled and a currency has not been specified, the alternative notation may be in a different currency than the original one which makes the ranking less meaningful, especially a trading value-based ranking, see attribute &#x60;accumulated.tradingValue&#x60; in the response.
        /// </summary>
        /// <value>Specifies whether an alternative notation of a constituent shall be retrieved if the market of the original notation is currently closed or if the user is not entitled for the market of the original notation. The alternative notation is the one with the highest trading volume averaged over one month that satisfies all other selected filters, such as only a specific market or a specific currency. If the original notation is not entitled and a currency has not been specified, the alternative notation may be in a different currency than the original one which makes the ranking less meaningful, especially a trading value-based ranking, see attribute &#x60;accumulated.tradingValue&#x60; in the response.</value>
        [DataMember(Name = "useAlternativeNotation", EmitDefaultValue = true)]
        public bool UseAlternativeNotation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostStockNotationRankingIntradayListRequestDataIndexMembership {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  UseAlternativeNotation: ").Append(UseAlternativeNotation).Append("\n");
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
            return this.Equals(input as PostStockNotationRankingIntradayListRequestDataIndexMembership);
        }

        /// <summary>
        /// Returns true if PostStockNotationRankingIntradayListRequestDataIndexMembership instances are equal
        /// </summary>
        /// <param name="input">Instance of PostStockNotationRankingIntradayListRequestDataIndexMembership to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostStockNotationRankingIntradayListRequestDataIndexMembership input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.UseAlternativeNotation == input.UseAlternativeNotation ||
                    this.UseAlternativeNotation.Equals(input.UseAlternativeNotation)
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
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UseAlternativeNotation.GetHashCode();
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
