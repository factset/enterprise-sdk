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
    /// Ratio parameters.
    /// </summary>
    [DataContract(Name = "PostStockNotationScreenerSearchRequest_data_ratios")]
    public partial class PostStockNotationScreenerSearchRequestDataRatios : IEquatable<PostStockNotationScreenerSearchRequestDataRatios>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostStockNotationScreenerSearchRequestDataRatios" /> class.
        /// </summary>
        /// <param name="priceSales">priceSales.</param>
        /// <param name="priceEarnings">priceEarnings.</param>
        /// <param name="priceBookValue">priceBookValue.</param>
        /// <param name="priceCashFlow">priceCashFlow.</param>
        /// <param name="priceFreeCashFlow">priceFreeCashFlow.</param>
        /// <param name="dividendYield">dividendYield.</param>
        /// <param name="enterpriseValueEbit">enterpriseValueEbit.</param>
        /// <param name="enterpriseValueEbitda">enterpriseValueEbitda.</param>
        /// <param name="enterpriseValueSales">enterpriseValueSales.</param>
        /// <param name="debtEquity">debtEquity.</param>
        public PostStockNotationScreenerSearchRequestDataRatios(PostStockNotationScreenerSearchRequestDataRatiosPriceSales priceSales = default(PostStockNotationScreenerSearchRequestDataRatiosPriceSales), PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings priceEarnings = default(PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings), PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue priceBookValue = default(PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue), PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow priceCashFlow = default(PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow), PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow priceFreeCashFlow = default(PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow), PostStockNotationScreenerSearchRequestDataRatiosDividendYield dividendYield = default(PostStockNotationScreenerSearchRequestDataRatiosDividendYield), PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit enterpriseValueEbit = default(PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit), PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda enterpriseValueEbitda = default(PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda), PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales enterpriseValueSales = default(PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales), PostStockNotationScreenerSearchRequestDataRatiosDebtEquity debtEquity = default(PostStockNotationScreenerSearchRequestDataRatiosDebtEquity))
        {
            this.PriceSales = priceSales;
            this.PriceEarnings = priceEarnings;
            this.PriceBookValue = priceBookValue;
            this.PriceCashFlow = priceCashFlow;
            this.PriceFreeCashFlow = priceFreeCashFlow;
            this.DividendYield = dividendYield;
            this.EnterpriseValueEbit = enterpriseValueEbit;
            this.EnterpriseValueEbitda = enterpriseValueEbitda;
            this.EnterpriseValueSales = enterpriseValueSales;
            this.DebtEquity = debtEquity;
        }

        /// <summary>
        /// Gets or Sets PriceSales
        /// </summary>
        [DataMember(Name = "priceSales", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosPriceSales PriceSales { get; set; }

        /// <summary>
        /// Gets or Sets PriceEarnings
        /// </summary>
        [DataMember(Name = "priceEarnings", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings PriceEarnings { get; set; }

        /// <summary>
        /// Gets or Sets PriceBookValue
        /// </summary>
        [DataMember(Name = "priceBookValue", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue PriceBookValue { get; set; }

        /// <summary>
        /// Gets or Sets PriceCashFlow
        /// </summary>
        [DataMember(Name = "priceCashFlow", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow PriceCashFlow { get; set; }

        /// <summary>
        /// Gets or Sets PriceFreeCashFlow
        /// </summary>
        [DataMember(Name = "priceFreeCashFlow", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow PriceFreeCashFlow { get; set; }

        /// <summary>
        /// Gets or Sets DividendYield
        /// </summary>
        [DataMember(Name = "dividendYield", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosDividendYield DividendYield { get; set; }

        /// <summary>
        /// Gets or Sets EnterpriseValueEbit
        /// </summary>
        [DataMember(Name = "enterpriseValueEbit", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit EnterpriseValueEbit { get; set; }

        /// <summary>
        /// Gets or Sets EnterpriseValueEbitda
        /// </summary>
        [DataMember(Name = "enterpriseValueEbitda", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda EnterpriseValueEbitda { get; set; }

        /// <summary>
        /// Gets or Sets EnterpriseValueSales
        /// </summary>
        [DataMember(Name = "enterpriseValueSales", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales EnterpriseValueSales { get; set; }

        /// <summary>
        /// Gets or Sets DebtEquity
        /// </summary>
        [DataMember(Name = "debtEquity", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataRatiosDebtEquity DebtEquity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostStockNotationScreenerSearchRequestDataRatios {\n");
            sb.Append("  PriceSales: ").Append(PriceSales).Append("\n");
            sb.Append("  PriceEarnings: ").Append(PriceEarnings).Append("\n");
            sb.Append("  PriceBookValue: ").Append(PriceBookValue).Append("\n");
            sb.Append("  PriceCashFlow: ").Append(PriceCashFlow).Append("\n");
            sb.Append("  PriceFreeCashFlow: ").Append(PriceFreeCashFlow).Append("\n");
            sb.Append("  DividendYield: ").Append(DividendYield).Append("\n");
            sb.Append("  EnterpriseValueEbit: ").Append(EnterpriseValueEbit).Append("\n");
            sb.Append("  EnterpriseValueEbitda: ").Append(EnterpriseValueEbitda).Append("\n");
            sb.Append("  EnterpriseValueSales: ").Append(EnterpriseValueSales).Append("\n");
            sb.Append("  DebtEquity: ").Append(DebtEquity).Append("\n");
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
            return this.Equals(input as PostStockNotationScreenerSearchRequestDataRatios);
        }

        /// <summary>
        /// Returns true if PostStockNotationScreenerSearchRequestDataRatios instances are equal
        /// </summary>
        /// <param name="input">Instance of PostStockNotationScreenerSearchRequestDataRatios to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostStockNotationScreenerSearchRequestDataRatios input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PriceSales == input.PriceSales ||
                    (this.PriceSales != null &&
                    this.PriceSales.Equals(input.PriceSales))
                ) && 
                (
                    this.PriceEarnings == input.PriceEarnings ||
                    (this.PriceEarnings != null &&
                    this.PriceEarnings.Equals(input.PriceEarnings))
                ) && 
                (
                    this.PriceBookValue == input.PriceBookValue ||
                    (this.PriceBookValue != null &&
                    this.PriceBookValue.Equals(input.PriceBookValue))
                ) && 
                (
                    this.PriceCashFlow == input.PriceCashFlow ||
                    (this.PriceCashFlow != null &&
                    this.PriceCashFlow.Equals(input.PriceCashFlow))
                ) && 
                (
                    this.PriceFreeCashFlow == input.PriceFreeCashFlow ||
                    (this.PriceFreeCashFlow != null &&
                    this.PriceFreeCashFlow.Equals(input.PriceFreeCashFlow))
                ) && 
                (
                    this.DividendYield == input.DividendYield ||
                    (this.DividendYield != null &&
                    this.DividendYield.Equals(input.DividendYield))
                ) && 
                (
                    this.EnterpriseValueEbit == input.EnterpriseValueEbit ||
                    (this.EnterpriseValueEbit != null &&
                    this.EnterpriseValueEbit.Equals(input.EnterpriseValueEbit))
                ) && 
                (
                    this.EnterpriseValueEbitda == input.EnterpriseValueEbitda ||
                    (this.EnterpriseValueEbitda != null &&
                    this.EnterpriseValueEbitda.Equals(input.EnterpriseValueEbitda))
                ) && 
                (
                    this.EnterpriseValueSales == input.EnterpriseValueSales ||
                    (this.EnterpriseValueSales != null &&
                    this.EnterpriseValueSales.Equals(input.EnterpriseValueSales))
                ) && 
                (
                    this.DebtEquity == input.DebtEquity ||
                    (this.DebtEquity != null &&
                    this.DebtEquity.Equals(input.DebtEquity))
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
                if (this.PriceSales != null)
                {
                    hashCode = (hashCode * 59) + this.PriceSales.GetHashCode();
                }
                if (this.PriceEarnings != null)
                {
                    hashCode = (hashCode * 59) + this.PriceEarnings.GetHashCode();
                }
                if (this.PriceBookValue != null)
                {
                    hashCode = (hashCode * 59) + this.PriceBookValue.GetHashCode();
                }
                if (this.PriceCashFlow != null)
                {
                    hashCode = (hashCode * 59) + this.PriceCashFlow.GetHashCode();
                }
                if (this.PriceFreeCashFlow != null)
                {
                    hashCode = (hashCode * 59) + this.PriceFreeCashFlow.GetHashCode();
                }
                if (this.DividendYield != null)
                {
                    hashCode = (hashCode * 59) + this.DividendYield.GetHashCode();
                }
                if (this.EnterpriseValueEbit != null)
                {
                    hashCode = (hashCode * 59) + this.EnterpriseValueEbit.GetHashCode();
                }
                if (this.EnterpriseValueEbitda != null)
                {
                    hashCode = (hashCode * 59) + this.EnterpriseValueEbitda.GetHashCode();
                }
                if (this.EnterpriseValueSales != null)
                {
                    hashCode = (hashCode * 59) + this.EnterpriseValueSales.GetHashCode();
                }
                if (this.DebtEquity != null)
                {
                    hashCode = (hashCode * 59) + this.DebtEquity.GetHashCode();
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
