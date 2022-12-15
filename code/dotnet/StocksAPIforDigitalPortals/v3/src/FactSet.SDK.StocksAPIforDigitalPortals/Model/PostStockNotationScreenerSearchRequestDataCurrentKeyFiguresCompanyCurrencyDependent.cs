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
    /// Currency-dependent key figures.
    /// </summary>
    [DataContract(Name = "PostStockNotationScreenerSearchRequest_data_currentKeyFigures_company_currencyDependent")]
    public partial class PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent : IEquatable<PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent" /> class.
        /// </summary>
        /// <param name="currency">currency (required).</param>
        /// <param name="marketCapitalizationSharesOutstanding">marketCapitalizationSharesOutstanding.</param>
        /// <param name="perShare">perShare.</param>
        public PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent(PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentCurrency currency,PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentMarketCapitalizationSharesOutstanding marketCapitalizationSharesOutstanding = default(PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentMarketCapitalizationSharesOutstanding), PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentPerShare perShare = default(PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentPerShare))
        {
            // to ensure "currency" is required (not null)
            if (currency == null) {
                throw new ArgumentNullException("currency is a required property for PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent and cannot be null");
            }
            this.Currency = currency;
            this.MarketCapitalizationSharesOutstanding = marketCapitalizationSharesOutstanding;
            this.PerShare = perShare;
        }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentCurrency Currency { get; set; }

        /// <summary>
        /// Gets or Sets MarketCapitalizationSharesOutstanding
        /// </summary>
        [DataMember(Name = "marketCapitalizationSharesOutstanding", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentMarketCapitalizationSharesOutstanding MarketCapitalizationSharesOutstanding { get; set; }

        /// <summary>
        /// Gets or Sets PerShare
        /// </summary>
        [DataMember(Name = "perShare", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentPerShare PerShare { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent {\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  MarketCapitalizationSharesOutstanding: ").Append(MarketCapitalizationSharesOutstanding).Append("\n");
            sb.Append("  PerShare: ").Append(PerShare).Append("\n");
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
            return this.Equals(input as PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent);
        }

        /// <summary>
        /// Returns true if PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent instances are equal
        /// </summary>
        /// <param name="input">Instance of PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.MarketCapitalizationSharesOutstanding == input.MarketCapitalizationSharesOutstanding ||
                    (this.MarketCapitalizationSharesOutstanding != null &&
                    this.MarketCapitalizationSharesOutstanding.Equals(input.MarketCapitalizationSharesOutstanding))
                ) && 
                (
                    this.PerShare == input.PerShare ||
                    (this.PerShare != null &&
                    this.PerShare.Equals(input.PerShare))
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
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.MarketCapitalizationSharesOutstanding != null)
                {
                    hashCode = (hashCode * 59) + this.MarketCapitalizationSharesOutstanding.GetHashCode();
                }
                if (this.PerShare != null)
                {
                    hashCode = (hashCode * 59) + this.PerShare.GetHashCode();
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
