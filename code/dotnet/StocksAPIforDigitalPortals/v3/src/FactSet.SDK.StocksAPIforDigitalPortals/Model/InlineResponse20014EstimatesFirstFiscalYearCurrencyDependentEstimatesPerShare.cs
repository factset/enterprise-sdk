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
    /// Per-share figures.
    /// </summary>
    [DataContract(Name = "inline_response_200_14_estimates_firstFiscalYear_currencyDependentEstimates_perShare")]
    public partial class InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare : IEquatable<InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare" /> class.
        /// </summary>
        /// <param name="sales">sales.</param>
        /// <param name="earnings">earnings.</param>
        /// <param name="dividends">dividends.</param>
        /// <param name="cashFlow">cashFlow.</param>
        public InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare(InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales sales = default(InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales), InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings earnings = default(InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings), InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends dividends = default(InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends), InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow cashFlow = default(InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow))
        {
            this.Sales = sales;
            this.Earnings = earnings;
            this.Dividends = dividends;
            this.CashFlow = cashFlow;
        }

        /// <summary>
        /// Gets or Sets Sales
        /// </summary>
        [DataMember(Name = "sales", EmitDefaultValue = false)]
        public InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales Sales { get; set; }

        /// <summary>
        /// Gets or Sets Earnings
        /// </summary>
        [DataMember(Name = "earnings", EmitDefaultValue = false)]
        public InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings Earnings { get; set; }

        /// <summary>
        /// Gets or Sets Dividends
        /// </summary>
        [DataMember(Name = "dividends", EmitDefaultValue = false)]
        public InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends Dividends { get; set; }

        /// <summary>
        /// Gets or Sets CashFlow
        /// </summary>
        [DataMember(Name = "cashFlow", EmitDefaultValue = false)]
        public InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow CashFlow { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare {\n");
            sb.Append("  Sales: ").Append(Sales).Append("\n");
            sb.Append("  Earnings: ").Append(Earnings).Append("\n");
            sb.Append("  Dividends: ").Append(Dividends).Append("\n");
            sb.Append("  CashFlow: ").Append(CashFlow).Append("\n");
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
            return this.Equals(input as InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare);
        }

        /// <summary>
        /// Returns true if InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sales == input.Sales ||
                    (this.Sales != null &&
                    this.Sales.Equals(input.Sales))
                ) && 
                (
                    this.Earnings == input.Earnings ||
                    (this.Earnings != null &&
                    this.Earnings.Equals(input.Earnings))
                ) && 
                (
                    this.Dividends == input.Dividends ||
                    (this.Dividends != null &&
                    this.Dividends.Equals(input.Dividends))
                ) && 
                (
                    this.CashFlow == input.CashFlow ||
                    (this.CashFlow != null &&
                    this.CashFlow.Equals(input.CashFlow))
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
                if (this.Sales != null)
                {
                    hashCode = (hashCode * 59) + this.Sales.GetHashCode();
                }
                if (this.Earnings != null)
                {
                    hashCode = (hashCode * 59) + this.Earnings.GetHashCode();
                }
                if (this.Dividends != null)
                {
                    hashCode = (hashCode * 59) + this.Dividends.GetHashCode();
                }
                if (this.CashFlow != null)
                {
                    hashCode = (hashCode * 59) + this.CashFlow.GetHashCode();
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
