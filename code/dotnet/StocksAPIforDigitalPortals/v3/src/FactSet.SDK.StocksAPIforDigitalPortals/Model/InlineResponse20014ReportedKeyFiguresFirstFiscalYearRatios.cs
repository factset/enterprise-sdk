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
    /// Ratios.
    /// </summary>
    [DataContract(Name = "inline_response_200_14_reportedKeyFigures_firstFiscalYear_ratios")]
    public partial class InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios : IEquatable<InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios" /> class.
        /// </summary>
        /// <param name="priceSales">Ratio of the price, divided by the total sales revenue per share..</param>
        /// <param name="priceEarnings">Ratio of the price, divided by the reported earnings per share (basic or diluted) by the company..</param>
        /// <param name="priceBookValue">Ratio of the price, divided by the book value per share..</param>
        /// <param name="priceCashFlow">Ratio of the price, divided by the cash flow per share..</param>
        /// <param name="priceFreeCashFlow">Ratio of the price, divided by the free (i.e. without subtraction of dividends) cash flow per share..</param>
        /// <param name="dividendYield">Ratio of the dividend per share, divided by the price..</param>
        /// <param name="enterpriseValueEbit">Ratio of the enterprise value, divided by the EBIT..</param>
        /// <param name="enterpriseValueEbitda">Ratio of the enterprise value, divided by the EBITDA..</param>
        /// <param name="enterpriseValueSales">Ratio of the enterprise value, divided by the total amount of sales revenue..</param>
        /// <param name="debtEquity">Total-debt-to-total-equity ratio, which is the ratio of the total debt, divided by the total shareholders&#39; equity..</param>
        public InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios(decimal? priceSales = default(decimal?), decimal? priceEarnings = default(decimal?), decimal? priceBookValue = default(decimal?), decimal? priceCashFlow = default(decimal?), decimal? priceFreeCashFlow = default(decimal?), decimal? dividendYield = default(decimal?), decimal? enterpriseValueEbit = default(decimal?), decimal? enterpriseValueEbitda = default(decimal?), decimal? enterpriseValueSales = default(decimal?), decimal? debtEquity = default(decimal?))
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
        /// Ratio of the price, divided by the total sales revenue per share.
        /// </summary>
        /// <value>Ratio of the price, divided by the total sales revenue per share.</value>
        [DataMember(Name = "priceSales", EmitDefaultValue = true)]
        public decimal? PriceSales { get; set; }

        /// <summary>
        /// Ratio of the price, divided by the reported earnings per share (basic or diluted) by the company.
        /// </summary>
        /// <value>Ratio of the price, divided by the reported earnings per share (basic or diluted) by the company.</value>
        [DataMember(Name = "priceEarnings", EmitDefaultValue = true)]
        public decimal? PriceEarnings { get; set; }

        /// <summary>
        /// Ratio of the price, divided by the book value per share.
        /// </summary>
        /// <value>Ratio of the price, divided by the book value per share.</value>
        [DataMember(Name = "priceBookValue", EmitDefaultValue = true)]
        public decimal? PriceBookValue { get; set; }

        /// <summary>
        /// Ratio of the price, divided by the cash flow per share.
        /// </summary>
        /// <value>Ratio of the price, divided by the cash flow per share.</value>
        [DataMember(Name = "priceCashFlow", EmitDefaultValue = true)]
        public decimal? PriceCashFlow { get; set; }

        /// <summary>
        /// Ratio of the price, divided by the free (i.e. without subtraction of dividends) cash flow per share.
        /// </summary>
        /// <value>Ratio of the price, divided by the free (i.e. without subtraction of dividends) cash flow per share.</value>
        [DataMember(Name = "priceFreeCashFlow", EmitDefaultValue = true)]
        public decimal? PriceFreeCashFlow { get; set; }

        /// <summary>
        /// Ratio of the dividend per share, divided by the price.
        /// </summary>
        /// <value>Ratio of the dividend per share, divided by the price.</value>
        [DataMember(Name = "dividendYield", EmitDefaultValue = true)]
        public decimal? DividendYield { get; set; }

        /// <summary>
        /// Ratio of the enterprise value, divided by the EBIT.
        /// </summary>
        /// <value>Ratio of the enterprise value, divided by the EBIT.</value>
        [DataMember(Name = "enterpriseValueEbit", EmitDefaultValue = true)]
        public decimal? EnterpriseValueEbit { get; set; }

        /// <summary>
        /// Ratio of the enterprise value, divided by the EBITDA.
        /// </summary>
        /// <value>Ratio of the enterprise value, divided by the EBITDA.</value>
        [DataMember(Name = "enterpriseValueEbitda", EmitDefaultValue = true)]
        public decimal? EnterpriseValueEbitda { get; set; }

        /// <summary>
        /// Ratio of the enterprise value, divided by the total amount of sales revenue.
        /// </summary>
        /// <value>Ratio of the enterprise value, divided by the total amount of sales revenue.</value>
        [DataMember(Name = "enterpriseValueSales", EmitDefaultValue = true)]
        public decimal? EnterpriseValueSales { get; set; }

        /// <summary>
        /// Total-debt-to-total-equity ratio, which is the ratio of the total debt, divided by the total shareholders&#39; equity.
        /// </summary>
        /// <value>Total-debt-to-total-equity ratio, which is the ratio of the total debt, divided by the total shareholders&#39; equity.</value>
        [DataMember(Name = "debtEquity", EmitDefaultValue = true)]
        public decimal? DebtEquity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios {\n");
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
            return this.Equals(input as InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios);
        }

        /// <summary>
        /// Returns true if InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios input)
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
