/*
 * Securitized Derivatives API For Digital Portals
 *
 * Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for equity and fixed income instruments: See the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) and the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) for details.  
 *
 * The version of the OpenAPI document: 4.0.0
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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Summary data accumulated over all trades of the current trading day.
    /// </summary>
    [DataContract(Name = "PostSecuritizedDerivativeNotationRankingIntradayListDataItems_accumulated")]
    public partial class PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated : IEquatable<PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated" /> class.
        /// </summary>
        /// <param name="numberTrades">Number of trades..</param>
        /// <param name="tradingVolume">Number of units (e.g. shares) traded. For securitized derivatives quoted in percent (attribute &#x60;valueUnit.id&#x3D;258&#x60;), this field represents the nominal trading volume; see attribute currency for its unit..</param>
        /// <param name="tradingValue">Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its unit..</param>
        /// <param name="currency">currency.</param>
        public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated(decimal? numberTrades = default(decimal?), decimal? tradingVolume = default(decimal?), decimal? tradingValue = default(decimal?), PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency currency = default(PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency))
        {
            this.NumberTrades = numberTrades;
            this.TradingVolume = tradingVolume;
            this.TradingValue = tradingValue;
            this.Currency = currency;
        }

        /// <summary>
        /// Number of trades.
        /// </summary>
        /// <value>Number of trades.</value>
        [DataMember(Name = "numberTrades", EmitDefaultValue = true)]
        public decimal? NumberTrades { get; set; }

        /// <summary>
        /// Number of units (e.g. shares) traded. For securitized derivatives quoted in percent (attribute &#x60;valueUnit.id&#x3D;258&#x60;), this field represents the nominal trading volume; see attribute currency for its unit.
        /// </summary>
        /// <value>Number of units (e.g. shares) traded. For securitized derivatives quoted in percent (attribute &#x60;valueUnit.id&#x3D;258&#x60;), this field represents the nominal trading volume; see attribute currency for its unit.</value>
        [DataMember(Name = "tradingVolume", EmitDefaultValue = true)]
        public decimal? TradingVolume { get; set; }

        /// <summary>
        /// Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its unit.
        /// </summary>
        /// <value>Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its unit.</value>
        [DataMember(Name = "tradingValue", EmitDefaultValue = true)]
        public decimal? TradingValue { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency Currency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated {\n");
            sb.Append("  NumberTrades: ").Append(NumberTrades).Append("\n");
            sb.Append("  TradingVolume: ").Append(TradingVolume).Append("\n");
            sb.Append("  TradingValue: ").Append(TradingValue).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
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
            return this.Equals(input as PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated);
        }

        /// <summary>
        /// Returns true if PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated instances are equal
        /// </summary>
        /// <param name="input">Instance of PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NumberTrades == input.NumberTrades ||
                    (this.NumberTrades != null &&
                    this.NumberTrades.Equals(input.NumberTrades))
                ) && 
                (
                    this.TradingVolume == input.TradingVolume ||
                    (this.TradingVolume != null &&
                    this.TradingVolume.Equals(input.TradingVolume))
                ) && 
                (
                    this.TradingValue == input.TradingValue ||
                    (this.TradingValue != null &&
                    this.TradingValue.Equals(input.TradingValue))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
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
                if (this.NumberTrades != null)
                {
                    hashCode = (hashCode * 59) + this.NumberTrades.GetHashCode();
                }
                if (this.TradingVolume != null)
                {
                    hashCode = (hashCode * 59) + this.TradingVolume.GetHashCode();
                }
                if (this.TradingValue != null)
                {
                    hashCode = (hashCode * 59) + this.TradingValue.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
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
