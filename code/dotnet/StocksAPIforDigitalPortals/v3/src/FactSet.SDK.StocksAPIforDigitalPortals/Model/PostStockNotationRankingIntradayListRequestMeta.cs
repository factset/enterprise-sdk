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
    /// The meta member contains the meta information of the request.
    /// </summary>
    [DataContract(Name = "PostStockNotationRankingIntradayListRequest_meta")]
    public partial class PostStockNotationRankingIntradayListRequestMeta : IEquatable<PostStockNotationRankingIntradayListRequestMeta>, IValidatableObject
    {
        /// <summary>
        /// Defines Sort
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SortEnum
        {
            /// <summary>
            /// Enum TradePerformanceAbsolute for value: trade.performance.absolute
            /// </summary>
            [EnumMember(Value = "trade.performance.absolute")]
            TradePerformanceAbsolute = 1,

            /// <summary>
            /// Enum MINUS_TradePerformanceAbsolute for value: -trade.performance.absolute
            /// </summary>
            [EnumMember(Value = "-trade.performance.absolute")]
            MINUS_TradePerformanceAbsolute = 2,

            /// <summary>
            /// Enum TradePerformanceRelative for value: trade.performance.relative
            /// </summary>
            [EnumMember(Value = "trade.performance.relative")]
            TradePerformanceRelative = 3,

            /// <summary>
            /// Enum MINUS_TradePerformanceRelative for value: -trade.performance.relative
            /// </summary>
            [EnumMember(Value = "-trade.performance.relative")]
            MINUS_TradePerformanceRelative = 4,

            /// <summary>
            /// Enum AccumulatedNumberTrades for value: accumulated.numberTrades
            /// </summary>
            [EnumMember(Value = "accumulated.numberTrades")]
            AccumulatedNumberTrades = 5,

            /// <summary>
            /// Enum MINUS_AccumulatedNumberTrades for value: -accumulated.numberTrades
            /// </summary>
            [EnumMember(Value = "-accumulated.numberTrades")]
            MINUS_AccumulatedNumberTrades = 6,

            /// <summary>
            /// Enum AccumulatedTradingVolume for value: accumulated.tradingVolume
            /// </summary>
            [EnumMember(Value = "accumulated.tradingVolume")]
            AccumulatedTradingVolume = 7,

            /// <summary>
            /// Enum MINUS_AccumulatedTradingVolume for value: -accumulated.tradingVolume
            /// </summary>
            [EnumMember(Value = "-accumulated.tradingVolume")]
            MINUS_AccumulatedTradingVolume = 8,

            /// <summary>
            /// Enum AccumulatedTradingValue for value: accumulated.tradingValue
            /// </summary>
            [EnumMember(Value = "accumulated.tradingValue")]
            AccumulatedTradingValue = 9,

            /// <summary>
            /// Enum MINUS_AccumulatedTradingValue for value: -accumulated.tradingValue
            /// </summary>
            [EnumMember(Value = "-accumulated.tradingValue")]
            MINUS_AccumulatedTradingValue = 10

        }



        /// <summary>
        /// Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed.
        /// </summary>
        /// <value>Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed.</value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public HashSet<SortEnum> Sort { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostStockNotationRankingIntradayListRequestMeta" /> class.
        /// </summary>
        /// <param name="attributes">Limit the attributes returned in the response to the specified set..</param>
        /// <param name="language">ISO 639-1 code of the language..</param>
        /// <param name="sort">Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed..</param>
        /// <param name="pagination">pagination.</param>
        public PostStockNotationRankingIntradayListRequestMeta(HashSet<string> attributes = default(HashSet<string>), string language = default(string), HashSet<SortEnum> sort = default(HashSet<SortEnum>), PostStockNotationRankingIntradayListRequestMetaPagination pagination = default(PostStockNotationRankingIntradayListRequestMetaPagination))
        {
            this.Attributes = attributes;
            this.Language = language;
            this.Sort = sort;
            this.Pagination = pagination;
        }

        /// <summary>
        /// Limit the attributes returned in the response to the specified set.
        /// </summary>
        /// <value>Limit the attributes returned in the response to the specified set.</value>
        [DataMember(Name = "attributes", EmitDefaultValue = false)]
        public HashSet<string> Attributes { get; set; }

        /// <summary>
        /// ISO 639-1 code of the language.
        /// </summary>
        /// <value>ISO 639-1 code of the language.</value>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public string Language { get; set; }

        /// <summary>
        /// Gets or Sets Pagination
        /// </summary>
        [DataMember(Name = "pagination", EmitDefaultValue = false)]
        public PostStockNotationRankingIntradayListRequestMetaPagination Pagination { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostStockNotationRankingIntradayListRequestMeta {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
            sb.Append("  Pagination: ").Append(Pagination).Append("\n");
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
            return this.Equals(input as PostStockNotationRankingIntradayListRequestMeta);
        }

        /// <summary>
        /// Returns true if PostStockNotationRankingIntradayListRequestMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of PostStockNotationRankingIntradayListRequestMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostStockNotationRankingIntradayListRequestMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Attributes == input.Attributes ||
                    this.Attributes != null &&
                    input.Attributes != null &&
                    this.Attributes.SequenceEqual(input.Attributes)
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
                ) && 
                (
                    this.Sort == input.Sort ||
                    this.Sort.SequenceEqual(input.Sort)
                ) && 
                (
                    this.Pagination == input.Pagination ||
                    (this.Pagination != null &&
                    this.Pagination.Equals(input.Pagination))
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
                if (this.Attributes != null)
                {
                    hashCode = (hashCode * 59) + this.Attributes.GetHashCode();
                }
                if (this.Language != null)
                {
                    hashCode = (hashCode * 59) + this.Language.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Sort.GetHashCode();
                if (this.Pagination != null)
                {
                    hashCode = (hashCode * 59) + this.Pagination.GetHashCode();
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
            // Language (string) maxLength
            if (this.Language != null && this.Language.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be less than 2.", new [] { "Language" });
            }

            // Language (string) minLength
            if (this.Language != null && this.Language.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be greater than 2.", new [] { "Language" });
            }

            yield break;
        }
    }

}
