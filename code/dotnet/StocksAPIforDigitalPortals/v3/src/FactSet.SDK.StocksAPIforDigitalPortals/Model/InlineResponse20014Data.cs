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
    /// InlineResponse20014Data
    /// </summary>
    [DataContract(Name = "inline_response_200_14_data")]
    public partial class InlineResponse20014Data : IEquatable<InlineResponse20014Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20014Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of the notation..</param>
        /// <param name="valueUnit">valueUnit.</param>
        /// <param name="market">market.</param>
        /// <param name="symbol">The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market..</param>
        /// <param name="nsin">nsin.</param>
        /// <param name="fsym">fsym.</param>
        /// <param name="instrument">instrument.</param>
        /// <param name="esg">esg.</param>
        /// <param name="compliance">compliance.</param>
        /// <param name="currentKeyFigures">currentKeyFigures.</param>
        /// <param name="reportedKeyFigures">reportedKeyFigures.</param>
        /// <param name="benchmark">benchmark.</param>
        /// <param name="performance">performance.</param>
        /// <param name="volatility">volatility.</param>
        /// <param name="tradingValue">tradingValue.</param>
        /// <param name="simpleMovingAverage">simpleMovingAverage.</param>
        /// <param name="rsiWilder">rsiWilder.</param>
        /// <param name="recommendation">recommendation.</param>
        /// <param name="estimates">estimates.</param>
        public InlineResponse20014Data(string id = default(string), InlineResponse20014ValueUnit valueUnit = default(InlineResponse20014ValueUnit), InlineResponse20014Market market = default(InlineResponse20014Market), string symbol = default(string), InlineResponse20014Nsin nsin = default(InlineResponse20014Nsin), InlineResponse20013Fsym fsym = default(InlineResponse20013Fsym), InlineResponse20014Instrument instrument = default(InlineResponse20014Instrument), InlineResponse20014Esg esg = default(InlineResponse20014Esg), InlineResponse20014Compliance compliance = default(InlineResponse20014Compliance), InlineResponse20014CurrentKeyFigures currentKeyFigures = default(InlineResponse20014CurrentKeyFigures), InlineResponse20014ReportedKeyFigures reportedKeyFigures = default(InlineResponse20014ReportedKeyFigures), InlineResponse20014Benchmark benchmark = default(InlineResponse20014Benchmark), InlineResponse20014Performance performance = default(InlineResponse20014Performance), InlineResponse20014Volatility volatility = default(InlineResponse20014Volatility), InlineResponse20014TradingValue tradingValue = default(InlineResponse20014TradingValue), InlineResponse20014SimpleMovingAverage simpleMovingAverage = default(InlineResponse20014SimpleMovingAverage), InlineResponse20014RsiWilder rsiWilder = default(InlineResponse20014RsiWilder), InlineResponse20014Recommendation recommendation = default(InlineResponse20014Recommendation), InlineResponse20014Estimates estimates = default(InlineResponse20014Estimates))
        {
            this.Id = id;
            this.ValueUnit = valueUnit;
            this.Market = market;
            this.Symbol = symbol;
            this.Nsin = nsin;
            this.Fsym = fsym;
            this.Instrument = instrument;
            this.Esg = esg;
            this.Compliance = compliance;
            this.CurrentKeyFigures = currentKeyFigures;
            this.ReportedKeyFigures = reportedKeyFigures;
            this.Benchmark = benchmark;
            this.Performance = performance;
            this.Volatility = volatility;
            this.TradingValue = tradingValue;
            this.SimpleMovingAverage = simpleMovingAverage;
            this.RsiWilder = rsiWilder;
            this.Recommendation = recommendation;
            this.Estimates = estimates;
        }

        /// <summary>
        /// Identifier of the notation.
        /// </summary>
        /// <value>Identifier of the notation.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ValueUnit
        /// </summary>
        [DataMember(Name = "valueUnit", EmitDefaultValue = false)]
        public InlineResponse20014ValueUnit ValueUnit { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public InlineResponse20014Market Market { get; set; }

        /// <summary>
        /// The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
        /// </summary>
        /// <value>The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.</value>
        [DataMember(Name = "symbol", EmitDefaultValue = true)]
        public string Symbol { get; set; }

        /// <summary>
        /// Gets or Sets Nsin
        /// </summary>
        [DataMember(Name = "nsin", EmitDefaultValue = false)]
        public InlineResponse20014Nsin Nsin { get; set; }

        /// <summary>
        /// Gets or Sets Fsym
        /// </summary>
        [DataMember(Name = "fsym", EmitDefaultValue = false)]
        public InlineResponse20013Fsym Fsym { get; set; }

        /// <summary>
        /// Gets or Sets Instrument
        /// </summary>
        [DataMember(Name = "instrument", EmitDefaultValue = false)]
        public InlineResponse20014Instrument Instrument { get; set; }

        /// <summary>
        /// Gets or Sets Esg
        /// </summary>
        [DataMember(Name = "esg", EmitDefaultValue = false)]
        public InlineResponse20014Esg Esg { get; set; }

        /// <summary>
        /// Gets or Sets Compliance
        /// </summary>
        [DataMember(Name = "compliance", EmitDefaultValue = false)]
        public InlineResponse20014Compliance Compliance { get; set; }

        /// <summary>
        /// Gets or Sets CurrentKeyFigures
        /// </summary>
        [DataMember(Name = "currentKeyFigures", EmitDefaultValue = false)]
        public InlineResponse20014CurrentKeyFigures CurrentKeyFigures { get; set; }

        /// <summary>
        /// Gets or Sets ReportedKeyFigures
        /// </summary>
        [DataMember(Name = "reportedKeyFigures", EmitDefaultValue = false)]
        public InlineResponse20014ReportedKeyFigures ReportedKeyFigures { get; set; }

        /// <summary>
        /// Gets or Sets Benchmark
        /// </summary>
        [DataMember(Name = "benchmark", EmitDefaultValue = false)]
        public InlineResponse20014Benchmark Benchmark { get; set; }

        /// <summary>
        /// Gets or Sets Performance
        /// </summary>
        [DataMember(Name = "performance", EmitDefaultValue = false)]
        public InlineResponse20014Performance Performance { get; set; }

        /// <summary>
        /// Gets or Sets Volatility
        /// </summary>
        [DataMember(Name = "volatility", EmitDefaultValue = false)]
        public InlineResponse20014Volatility Volatility { get; set; }

        /// <summary>
        /// Gets or Sets TradingValue
        /// </summary>
        [DataMember(Name = "tradingValue", EmitDefaultValue = false)]
        public InlineResponse20014TradingValue TradingValue { get; set; }

        /// <summary>
        /// Gets or Sets SimpleMovingAverage
        /// </summary>
        [DataMember(Name = "simpleMovingAverage", EmitDefaultValue = false)]
        public InlineResponse20014SimpleMovingAverage SimpleMovingAverage { get; set; }

        /// <summary>
        /// Gets or Sets RsiWilder
        /// </summary>
        [DataMember(Name = "rsiWilder", EmitDefaultValue = false)]
        public InlineResponse20014RsiWilder RsiWilder { get; set; }

        /// <summary>
        /// Gets or Sets Recommendation
        /// </summary>
        [DataMember(Name = "recommendation", EmitDefaultValue = false)]
        public InlineResponse20014Recommendation Recommendation { get; set; }

        /// <summary>
        /// Gets or Sets Estimates
        /// </summary>
        [DataMember(Name = "estimates", EmitDefaultValue = false)]
        public InlineResponse20014Estimates Estimates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20014Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ValueUnit: ").Append(ValueUnit).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Nsin: ").Append(Nsin).Append("\n");
            sb.Append("  Fsym: ").Append(Fsym).Append("\n");
            sb.Append("  Instrument: ").Append(Instrument).Append("\n");
            sb.Append("  Esg: ").Append(Esg).Append("\n");
            sb.Append("  Compliance: ").Append(Compliance).Append("\n");
            sb.Append("  CurrentKeyFigures: ").Append(CurrentKeyFigures).Append("\n");
            sb.Append("  ReportedKeyFigures: ").Append(ReportedKeyFigures).Append("\n");
            sb.Append("  Benchmark: ").Append(Benchmark).Append("\n");
            sb.Append("  Performance: ").Append(Performance).Append("\n");
            sb.Append("  Volatility: ").Append(Volatility).Append("\n");
            sb.Append("  TradingValue: ").Append(TradingValue).Append("\n");
            sb.Append("  SimpleMovingAverage: ").Append(SimpleMovingAverage).Append("\n");
            sb.Append("  RsiWilder: ").Append(RsiWilder).Append("\n");
            sb.Append("  Recommendation: ").Append(Recommendation).Append("\n");
            sb.Append("  Estimates: ").Append(Estimates).Append("\n");
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
            return this.Equals(input as InlineResponse20014Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20014Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20014Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20014Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ValueUnit == input.ValueUnit ||
                    (this.ValueUnit != null &&
                    this.ValueUnit.Equals(input.ValueUnit))
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.Nsin == input.Nsin ||
                    (this.Nsin != null &&
                    this.Nsin.Equals(input.Nsin))
                ) && 
                (
                    this.Fsym == input.Fsym ||
                    (this.Fsym != null &&
                    this.Fsym.Equals(input.Fsym))
                ) && 
                (
                    this.Instrument == input.Instrument ||
                    (this.Instrument != null &&
                    this.Instrument.Equals(input.Instrument))
                ) && 
                (
                    this.Esg == input.Esg ||
                    (this.Esg != null &&
                    this.Esg.Equals(input.Esg))
                ) && 
                (
                    this.Compliance == input.Compliance ||
                    (this.Compliance != null &&
                    this.Compliance.Equals(input.Compliance))
                ) && 
                (
                    this.CurrentKeyFigures == input.CurrentKeyFigures ||
                    (this.CurrentKeyFigures != null &&
                    this.CurrentKeyFigures.Equals(input.CurrentKeyFigures))
                ) && 
                (
                    this.ReportedKeyFigures == input.ReportedKeyFigures ||
                    (this.ReportedKeyFigures != null &&
                    this.ReportedKeyFigures.Equals(input.ReportedKeyFigures))
                ) && 
                (
                    this.Benchmark == input.Benchmark ||
                    (this.Benchmark != null &&
                    this.Benchmark.Equals(input.Benchmark))
                ) && 
                (
                    this.Performance == input.Performance ||
                    (this.Performance != null &&
                    this.Performance.Equals(input.Performance))
                ) && 
                (
                    this.Volatility == input.Volatility ||
                    (this.Volatility != null &&
                    this.Volatility.Equals(input.Volatility))
                ) && 
                (
                    this.TradingValue == input.TradingValue ||
                    (this.TradingValue != null &&
                    this.TradingValue.Equals(input.TradingValue))
                ) && 
                (
                    this.SimpleMovingAverage == input.SimpleMovingAverage ||
                    (this.SimpleMovingAverage != null &&
                    this.SimpleMovingAverage.Equals(input.SimpleMovingAverage))
                ) && 
                (
                    this.RsiWilder == input.RsiWilder ||
                    (this.RsiWilder != null &&
                    this.RsiWilder.Equals(input.RsiWilder))
                ) && 
                (
                    this.Recommendation == input.Recommendation ||
                    (this.Recommendation != null &&
                    this.Recommendation.Equals(input.Recommendation))
                ) && 
                (
                    this.Estimates == input.Estimates ||
                    (this.Estimates != null &&
                    this.Estimates.Equals(input.Estimates))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.ValueUnit != null)
                {
                    hashCode = (hashCode * 59) + this.ValueUnit.GetHashCode();
                }
                if (this.Market != null)
                {
                    hashCode = (hashCode * 59) + this.Market.GetHashCode();
                }
                if (this.Symbol != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol.GetHashCode();
                }
                if (this.Nsin != null)
                {
                    hashCode = (hashCode * 59) + this.Nsin.GetHashCode();
                }
                if (this.Fsym != null)
                {
                    hashCode = (hashCode * 59) + this.Fsym.GetHashCode();
                }
                if (this.Instrument != null)
                {
                    hashCode = (hashCode * 59) + this.Instrument.GetHashCode();
                }
                if (this.Esg != null)
                {
                    hashCode = (hashCode * 59) + this.Esg.GetHashCode();
                }
                if (this.Compliance != null)
                {
                    hashCode = (hashCode * 59) + this.Compliance.GetHashCode();
                }
                if (this.CurrentKeyFigures != null)
                {
                    hashCode = (hashCode * 59) + this.CurrentKeyFigures.GetHashCode();
                }
                if (this.ReportedKeyFigures != null)
                {
                    hashCode = (hashCode * 59) + this.ReportedKeyFigures.GetHashCode();
                }
                if (this.Benchmark != null)
                {
                    hashCode = (hashCode * 59) + this.Benchmark.GetHashCode();
                }
                if (this.Performance != null)
                {
                    hashCode = (hashCode * 59) + this.Performance.GetHashCode();
                }
                if (this.Volatility != null)
                {
                    hashCode = (hashCode * 59) + this.Volatility.GetHashCode();
                }
                if (this.TradingValue != null)
                {
                    hashCode = (hashCode * 59) + this.TradingValue.GetHashCode();
                }
                if (this.SimpleMovingAverage != null)
                {
                    hashCode = (hashCode * 59) + this.SimpleMovingAverage.GetHashCode();
                }
                if (this.RsiWilder != null)
                {
                    hashCode = (hashCode * 59) + this.RsiWilder.GetHashCode();
                }
                if (this.Recommendation != null)
                {
                    hashCode = (hashCode * 59) + this.Recommendation.GetHashCode();
                }
                if (this.Estimates != null)
                {
                    hashCode = (hashCode * 59) + this.Estimates.GetHashCode();
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
