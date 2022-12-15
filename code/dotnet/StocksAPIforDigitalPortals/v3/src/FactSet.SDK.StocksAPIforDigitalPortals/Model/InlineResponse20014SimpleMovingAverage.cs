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
    /// Simple moving average (SMA), that is the arithmetic mean of a notation’s EOD closing price, for different time ranges.
    /// </summary>
    [DataContract(Name = "inline_response_200_14_simpleMovingAverage")]
    public partial class InlineResponse20014SimpleMovingAverage : IEquatable<InlineResponse20014SimpleMovingAverage>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20014SimpleMovingAverage" /> class.
        /// </summary>
        /// <param name="days20">20 trading days..</param>
        /// <param name="days50">50 trading days..</param>
        /// <param name="days200">200 trading days..</param>
        /// <param name="tradingDaysSinceCrossover">tradingDaysSinceCrossover.</param>
        public InlineResponse20014SimpleMovingAverage(decimal? days20 = default(decimal?), decimal? days50 = default(decimal?), decimal? days200 = default(decimal?), InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover = default(InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover))
        {
            this.Days20 = days20;
            this.Days50 = days50;
            this.Days200 = days200;
            this.TradingDaysSinceCrossover = tradingDaysSinceCrossover;
        }

        /// <summary>
        /// 20 trading days.
        /// </summary>
        /// <value>20 trading days.</value>
        [DataMember(Name = "days20", EmitDefaultValue = true)]
        public decimal? Days20 { get; set; }

        /// <summary>
        /// 50 trading days.
        /// </summary>
        /// <value>50 trading days.</value>
        [DataMember(Name = "days50", EmitDefaultValue = true)]
        public decimal? Days50 { get; set; }

        /// <summary>
        /// 200 trading days.
        /// </summary>
        /// <value>200 trading days.</value>
        [DataMember(Name = "days200", EmitDefaultValue = true)]
        public decimal? Days200 { get; set; }

        /// <summary>
        /// Gets or Sets TradingDaysSinceCrossover
        /// </summary>
        [DataMember(Name = "tradingDaysSinceCrossover", EmitDefaultValue = false)]
        public InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover TradingDaysSinceCrossover { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20014SimpleMovingAverage {\n");
            sb.Append("  Days20: ").Append(Days20).Append("\n");
            sb.Append("  Days50: ").Append(Days50).Append("\n");
            sb.Append("  Days200: ").Append(Days200).Append("\n");
            sb.Append("  TradingDaysSinceCrossover: ").Append(TradingDaysSinceCrossover).Append("\n");
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
            return this.Equals(input as InlineResponse20014SimpleMovingAverage);
        }

        /// <summary>
        /// Returns true if InlineResponse20014SimpleMovingAverage instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20014SimpleMovingAverage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20014SimpleMovingAverage input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Days20 == input.Days20 ||
                    (this.Days20 != null &&
                    this.Days20.Equals(input.Days20))
                ) && 
                (
                    this.Days50 == input.Days50 ||
                    (this.Days50 != null &&
                    this.Days50.Equals(input.Days50))
                ) && 
                (
                    this.Days200 == input.Days200 ||
                    (this.Days200 != null &&
                    this.Days200.Equals(input.Days200))
                ) && 
                (
                    this.TradingDaysSinceCrossover == input.TradingDaysSinceCrossover ||
                    (this.TradingDaysSinceCrossover != null &&
                    this.TradingDaysSinceCrossover.Equals(input.TradingDaysSinceCrossover))
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
                if (this.Days20 != null)
                {
                    hashCode = (hashCode * 59) + this.Days20.GetHashCode();
                }
                if (this.Days50 != null)
                {
                    hashCode = (hashCode * 59) + this.Days50.GetHashCode();
                }
                if (this.Days200 != null)
                {
                    hashCode = (hashCode * 59) + this.Days200.GetHashCode();
                }
                if (this.TradingDaysSinceCrossover != null)
                {
                    hashCode = (hashCode * 59) + this.TradingDaysSinceCrossover.GetHashCode();
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
