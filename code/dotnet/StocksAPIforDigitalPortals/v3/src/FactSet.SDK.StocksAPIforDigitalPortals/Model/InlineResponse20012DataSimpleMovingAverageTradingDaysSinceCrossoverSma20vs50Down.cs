/*
 * Stocks API For Digital Portals
 *
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
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
    /// Value range of the down direction, i.e. the SMA 20 crossed the SMA 50 from above, hence the SMA 20 has currently a lower value.
    /// </summary>
    [DataContract(Name = "inline_response_200_12_data_simpleMovingAverage_tradingDaysSinceCrossover_sma20vs50_down")]
    public partial class InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down : IEquatable<InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down" /> class.
        /// </summary>
        /// <param name="numberDays">numberDays.</param>
        /// <param name="count">Number of notations..</param>
        public InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down(InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays numberDays = default(InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays), decimal count = default(decimal))
        {
            this.NumberDays = numberDays;
            this.Count = count;
        }

        /// <summary>
        /// Gets or Sets NumberDays
        /// </summary>
        [DataMember(Name = "numberDays", EmitDefaultValue = false)]
        public InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays NumberDays { get; set; }

        /// <summary>
        /// Number of notations.
        /// </summary>
        /// <value>Number of notations.</value>
        [DataMember(Name = "count", EmitDefaultValue = false)]
        public decimal Count { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down {\n");
            sb.Append("  NumberDays: ").Append(NumberDays).Append("\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
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
            return this.Equals(input as InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down);
        }

        /// <summary>
        /// Returns true if InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NumberDays == input.NumberDays ||
                    (this.NumberDays != null &&
                    this.NumberDays.Equals(input.NumberDays))
                ) && 
                (
                    this.Count == input.Count ||
                    this.Count.Equals(input.Count)
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
                if (this.NumberDays != null)
                {
                    hashCode = (hashCode * 59) + this.NumberDays.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Count.GetHashCode();
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