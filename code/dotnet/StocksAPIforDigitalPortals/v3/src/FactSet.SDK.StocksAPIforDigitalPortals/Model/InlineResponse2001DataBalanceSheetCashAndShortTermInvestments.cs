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
    /// Cash and short-term investments, which is the total value of the most liquid assets, comprised of cash, cash equivalents, and short-term investments.
    /// </summary>
    [DataContract(Name = "inline_response_200_1_data_balanceSheet_cashAndShortTermInvestments")]
    public partial class InlineResponse2001DataBalanceSheetCashAndShortTermInvestments : IEquatable<InlineResponse2001DataBalanceSheetCashAndShortTermInvestments>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001DataBalanceSheetCashAndShortTermInvestments" /> class.
        /// </summary>
        /// <param name="value">Value of the cash and short-term investments..</param>
        /// <param name="growth">Annual growth rate of the cash and short-term investments..</param>
        /// <param name="ratioToTotalAssets">Cash-and-short-term-investments-to-total-assets ratio, which is the ratio of the cash and short-term investments, divided by the total assets..</param>
        public InlineResponse2001DataBalanceSheetCashAndShortTermInvestments(decimal? value = default(decimal?), decimal? growth = default(decimal?), decimal? ratioToTotalAssets = default(decimal?))
        {
            this.Value = value;
            this.Growth = growth;
            this.RatioToTotalAssets = ratioToTotalAssets;
        }

        /// <summary>
        /// Value of the cash and short-term investments.
        /// </summary>
        /// <value>Value of the cash and short-term investments.</value>
        [DataMember(Name = "value", EmitDefaultValue = true)]
        public decimal? Value { get; set; }

        /// <summary>
        /// Annual growth rate of the cash and short-term investments.
        /// </summary>
        /// <value>Annual growth rate of the cash and short-term investments.</value>
        [DataMember(Name = "growth", EmitDefaultValue = true)]
        public decimal? Growth { get; set; }

        /// <summary>
        /// Cash-and-short-term-investments-to-total-assets ratio, which is the ratio of the cash and short-term investments, divided by the total assets.
        /// </summary>
        /// <value>Cash-and-short-term-investments-to-total-assets ratio, which is the ratio of the cash and short-term investments, divided by the total assets.</value>
        [DataMember(Name = "ratioToTotalAssets", EmitDefaultValue = true)]
        public decimal? RatioToTotalAssets { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2001DataBalanceSheetCashAndShortTermInvestments {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Growth: ").Append(Growth).Append("\n");
            sb.Append("  RatioToTotalAssets: ").Append(RatioToTotalAssets).Append("\n");
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
            return this.Equals(input as InlineResponse2001DataBalanceSheetCashAndShortTermInvestments);
        }

        /// <summary>
        /// Returns true if InlineResponse2001DataBalanceSheetCashAndShortTermInvestments instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2001DataBalanceSheetCashAndShortTermInvestments to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001DataBalanceSheetCashAndShortTermInvestments input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Growth == input.Growth ||
                    (this.Growth != null &&
                    this.Growth.Equals(input.Growth))
                ) && 
                (
                    this.RatioToTotalAssets == input.RatioToTotalAssets ||
                    (this.RatioToTotalAssets != null &&
                    this.RatioToTotalAssets.Equals(input.RatioToTotalAssets))
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
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.Growth != null)
                {
                    hashCode = (hashCode * 59) + this.Growth.GetHashCode();
                }
                if (this.RatioToTotalAssets != null)
                {
                    hashCode = (hashCode * 59) + this.RatioToTotalAssets.GetHashCode();
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
