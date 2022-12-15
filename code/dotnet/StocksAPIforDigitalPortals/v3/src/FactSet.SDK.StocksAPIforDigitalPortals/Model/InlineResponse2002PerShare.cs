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
    /// Estimates for selected per-share figures.
    /// </summary>
    [DataContract(Name = "inline_response_200_2_perShare")]
    public partial class InlineResponse2002PerShare : IEquatable<InlineResponse2002PerShare>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2002PerShare" /> class.
        /// </summary>
        /// <param name="dividends">dividends.</param>
        /// <param name="earnings">earnings.</param>
        /// <param name="cashFlow">cashFlow.</param>
        /// <param name="sales">sales.</param>
        /// <param name="netAssetValue">netAssetValue.</param>
        public InlineResponse2002PerShare(InlineResponse2002PerShareDividends dividends = default(InlineResponse2002PerShareDividends), InlineResponse2002PerShareEarnings earnings = default(InlineResponse2002PerShareEarnings), InlineResponse2002PerShareCashFlow cashFlow = default(InlineResponse2002PerShareCashFlow), InlineResponse2002PerShareSales sales = default(InlineResponse2002PerShareSales), InlineResponse2002PerShareNetAssetValue netAssetValue = default(InlineResponse2002PerShareNetAssetValue))
        {
            this.Dividends = dividends;
            this.Earnings = earnings;
            this.CashFlow = cashFlow;
            this.Sales = sales;
            this.NetAssetValue = netAssetValue;
        }

        /// <summary>
        /// Gets or Sets Dividends
        /// </summary>
        [DataMember(Name = "dividends", EmitDefaultValue = false)]
        public InlineResponse2002PerShareDividends Dividends { get; set; }

        /// <summary>
        /// Gets or Sets Earnings
        /// </summary>
        [DataMember(Name = "earnings", EmitDefaultValue = false)]
        public InlineResponse2002PerShareEarnings Earnings { get; set; }

        /// <summary>
        /// Gets or Sets CashFlow
        /// </summary>
        [DataMember(Name = "cashFlow", EmitDefaultValue = false)]
        public InlineResponse2002PerShareCashFlow CashFlow { get; set; }

        /// <summary>
        /// Gets or Sets Sales
        /// </summary>
        [DataMember(Name = "sales", EmitDefaultValue = false)]
        public InlineResponse2002PerShareSales Sales { get; set; }

        /// <summary>
        /// Gets or Sets NetAssetValue
        /// </summary>
        [DataMember(Name = "netAssetValue", EmitDefaultValue = false)]
        public InlineResponse2002PerShareNetAssetValue NetAssetValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2002PerShare {\n");
            sb.Append("  Dividends: ").Append(Dividends).Append("\n");
            sb.Append("  Earnings: ").Append(Earnings).Append("\n");
            sb.Append("  CashFlow: ").Append(CashFlow).Append("\n");
            sb.Append("  Sales: ").Append(Sales).Append("\n");
            sb.Append("  NetAssetValue: ").Append(NetAssetValue).Append("\n");
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
            return this.Equals(input as InlineResponse2002PerShare);
        }

        /// <summary>
        /// Returns true if InlineResponse2002PerShare instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2002PerShare to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2002PerShare input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Dividends == input.Dividends ||
                    (this.Dividends != null &&
                    this.Dividends.Equals(input.Dividends))
                ) && 
                (
                    this.Earnings == input.Earnings ||
                    (this.Earnings != null &&
                    this.Earnings.Equals(input.Earnings))
                ) && 
                (
                    this.CashFlow == input.CashFlow ||
                    (this.CashFlow != null &&
                    this.CashFlow.Equals(input.CashFlow))
                ) && 
                (
                    this.Sales == input.Sales ||
                    (this.Sales != null &&
                    this.Sales.Equals(input.Sales))
                ) && 
                (
                    this.NetAssetValue == input.NetAssetValue ||
                    (this.NetAssetValue != null &&
                    this.NetAssetValue.Equals(input.NetAssetValue))
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
                if (this.Dividends != null)
                {
                    hashCode = (hashCode * 59) + this.Dividends.GetHashCode();
                }
                if (this.Earnings != null)
                {
                    hashCode = (hashCode * 59) + this.Earnings.GetHashCode();
                }
                if (this.CashFlow != null)
                {
                    hashCode = (hashCode * 59) + this.CashFlow.GetHashCode();
                }
                if (this.Sales != null)
                {
                    hashCode = (hashCode * 59) + this.Sales.GetHashCode();
                }
                if (this.NetAssetValue != null)
                {
                    hashCode = (hashCode * 59) + this.NetAssetValue.GetHashCode();
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
