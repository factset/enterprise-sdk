/*
 * Real-Time Options API
 *
 * The Options API provides detailed information for option contracts (“options”) and option classes. This API presents a consolidated data model that gives access to options data of global options markets such as OPRA, Australia Exchange, Bovespa, CME Group, EUREX, Euronext, Hong Kong, ICE Futures Europe / US, Montreal Exchange, and others.  An option class is a product group of options from the same exchange and with the same underlying. The API includes endpoints to retrieve fundamental data for an option contract such as exercise right, exercise style, strike, maturity, open interest, underlying, etc. as well as risk measures of an option contract such as delta, omega, implied volatility, etc.  Option chains are provided by the /by-class/list endpoint. The list of option contracts for an option class can be filtered by exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The option screener allows you to search for option classes by using text search, root symbol, or ISIN plus additional criteria such as market, underlying, currency, and category. Similar to other screener endpoints in e.g. the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals), the /value-ranges/get endpoint provides the possible values and value ranges plus the number of option contracts for an option class related to the option contracts per criteria such as exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The Options API for Digital Portals seamlessly integrates with the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) that provides real-time, delayed, and end-of-day pricing data and basic security identifier cross-reference. For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api). 
 *
 * The version of the OpenAPI document: 4.1.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeOptions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeOptions.Model
{
    /// <summary>
    /// Set of basic data for the option contract.
    /// </summary>
    [DataContract(Name = "inline_response_200_data")]
    public partial class InlineResponse200Data : IEquatable<InlineResponse200Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200Data" /> class.
        /// </summary>
        /// <param name="idInstrument">Identifier of the instrument..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="isin">International Securities Identification Number of the option..</param>
        /// <param name="normalizedSymbol">Symbol of the option, as normalized by FactSet..</param>
        /// <param name="name">Name of the option..</param>
        /// <param name="type">Instrument type as defined by FactSet. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18)..</param>
        /// <param name="market">market.</param>
        /// <param name="_class">_class.</param>
        /// <param name="exercise">exercise.</param>
        /// <param name="strikePrice">strikePrice.</param>
        /// <param name="lifeCycle">lifeCycle.</param>
        /// <param name="contractSize">Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying..</param>
        /// <param name="openInterest">openInterest.</param>
        /// <param name="tickSize">The minimum price movement of the option..</param>
        /// <param name="settlement">settlement.</param>
        /// <param name="underlying">underlying.</param>
        public InlineResponse200Data(string idInstrument = default(string), string sourceIdentifier = default(string), string isin = default(string), string normalizedSymbol = default(string), string name = default(string), HashSet<GetOptionGetDataTypeItems> type = default(HashSet<GetOptionGetDataTypeItems>), InlineResponse200DataMarket market = default(InlineResponse200DataMarket), InlineResponse200DataClass _class = default(InlineResponse200DataClass), InlineResponse200DataExercise exercise = default(InlineResponse200DataExercise), InlineResponse200DataStrikePrice strikePrice = default(InlineResponse200DataStrikePrice), InlineResponse200DataLifeCycle lifeCycle = default(InlineResponse200DataLifeCycle), decimal? contractSize = default(decimal?), InlineResponse200DataOpenInterest openInterest = default(InlineResponse200DataOpenInterest), decimal? tickSize = default(decimal?), InlineResponse200DataSettlement settlement = default(InlineResponse200DataSettlement), InlineResponse200DataUnderlying underlying = default(InlineResponse200DataUnderlying))
        {
            this.IdInstrument = idInstrument;
            this.SourceIdentifier = sourceIdentifier;
            this.Isin = isin;
            this.NormalizedSymbol = normalizedSymbol;
            this.Name = name;
            this.Type = type;
            this.Market = market;
            this.Class = _class;
            this.Exercise = exercise;
            this.StrikePrice = strikePrice;
            this.LifeCycle = lifeCycle;
            this.ContractSize = contractSize;
            this.OpenInterest = openInterest;
            this.TickSize = tickSize;
            this.Settlement = settlement;
            this.Underlying = underlying;
        }

        /// <summary>
        /// Identifier of the instrument.
        /// </summary>
        /// <value>Identifier of the instrument.</value>
        [DataMember(Name = "idInstrument", EmitDefaultValue = true)]
        public string IdInstrument { get; set; }

        /// <summary>
        /// Identifier used in the request.
        /// </summary>
        /// <value>Identifier used in the request.</value>
        [DataMember(Name = "sourceIdentifier", EmitDefaultValue = true)]
        public string SourceIdentifier { get; set; }

        /// <summary>
        /// International Securities Identification Number of the option.
        /// </summary>
        /// <value>International Securities Identification Number of the option.</value>
        [DataMember(Name = "isin", EmitDefaultValue = true)]
        public string Isin { get; set; }

        /// <summary>
        /// Symbol of the option, as normalized by FactSet.
        /// </summary>
        /// <value>Symbol of the option, as normalized by FactSet.</value>
        [DataMember(Name = "normalizedSymbol", EmitDefaultValue = true)]
        public string NormalizedSymbol { get; set; }

        /// <summary>
        /// Name of the option.
        /// </summary>
        /// <value>Name of the option.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Instrument type as defined by FactSet. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18).
        /// </summary>
        /// <value>Instrument type as defined by FactSet. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18).</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public HashSet<GetOptionGetDataTypeItems> Type { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public InlineResponse200DataMarket Market { get; set; }

        /// <summary>
        /// Gets or Sets Class
        /// </summary>
        [DataMember(Name = "class", EmitDefaultValue = false)]
        public InlineResponse200DataClass Class { get; set; }

        /// <summary>
        /// Gets or Sets Exercise
        /// </summary>
        [DataMember(Name = "exercise", EmitDefaultValue = false)]
        public InlineResponse200DataExercise Exercise { get; set; }

        /// <summary>
        /// Gets or Sets StrikePrice
        /// </summary>
        [DataMember(Name = "strikePrice", EmitDefaultValue = false)]
        public InlineResponse200DataStrikePrice StrikePrice { get; set; }

        /// <summary>
        /// Gets or Sets LifeCycle
        /// </summary>
        [DataMember(Name = "lifeCycle", EmitDefaultValue = false)]
        public InlineResponse200DataLifeCycle LifeCycle { get; set; }

        /// <summary>
        /// Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying.
        /// </summary>
        /// <value>Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying.</value>
        [DataMember(Name = "contractSize", EmitDefaultValue = true)]
        public decimal? ContractSize { get; set; }

        /// <summary>
        /// Gets or Sets OpenInterest
        /// </summary>
        [DataMember(Name = "openInterest", EmitDefaultValue = false)]
        public InlineResponse200DataOpenInterest OpenInterest { get; set; }

        /// <summary>
        /// The minimum price movement of the option.
        /// </summary>
        /// <value>The minimum price movement of the option.</value>
        [DataMember(Name = "tickSize", EmitDefaultValue = true)]
        public decimal? TickSize { get; set; }

        /// <summary>
        /// Gets or Sets Settlement
        /// </summary>
        [DataMember(Name = "settlement", EmitDefaultValue = false)]
        public InlineResponse200DataSettlement Settlement { get; set; }

        /// <summary>
        /// Gets or Sets Underlying
        /// </summary>
        [DataMember(Name = "underlying", EmitDefaultValue = false)]
        public InlineResponse200DataUnderlying Underlying { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200Data {\n");
            sb.Append("  IdInstrument: ").Append(IdInstrument).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  Isin: ").Append(Isin).Append("\n");
            sb.Append("  NormalizedSymbol: ").Append(NormalizedSymbol).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  Class: ").Append(Class).Append("\n");
            sb.Append("  Exercise: ").Append(Exercise).Append("\n");
            sb.Append("  StrikePrice: ").Append(StrikePrice).Append("\n");
            sb.Append("  LifeCycle: ").Append(LifeCycle).Append("\n");
            sb.Append("  ContractSize: ").Append(ContractSize).Append("\n");
            sb.Append("  OpenInterest: ").Append(OpenInterest).Append("\n");
            sb.Append("  TickSize: ").Append(TickSize).Append("\n");
            sb.Append("  Settlement: ").Append(Settlement).Append("\n");
            sb.Append("  Underlying: ").Append(Underlying).Append("\n");
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
            return this.Equals(input as InlineResponse200Data);
        }

        /// <summary>
        /// Returns true if InlineResponse200Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IdInstrument == input.IdInstrument ||
                    (this.IdInstrument != null &&
                    this.IdInstrument.Equals(input.IdInstrument))
                ) && 
                (
                    this.SourceIdentifier == input.SourceIdentifier ||
                    (this.SourceIdentifier != null &&
                    this.SourceIdentifier.Equals(input.SourceIdentifier))
                ) && 
                (
                    this.Isin == input.Isin ||
                    (this.Isin != null &&
                    this.Isin.Equals(input.Isin))
                ) && 
                (
                    this.NormalizedSymbol == input.NormalizedSymbol ||
                    (this.NormalizedSymbol != null &&
                    this.NormalizedSymbol.Equals(input.NormalizedSymbol))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type != null &&
                    input.Type != null &&
                    this.Type.SequenceEqual(input.Type)
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.Class == input.Class ||
                    (this.Class != null &&
                    this.Class.Equals(input.Class))
                ) && 
                (
                    this.Exercise == input.Exercise ||
                    (this.Exercise != null &&
                    this.Exercise.Equals(input.Exercise))
                ) && 
                (
                    this.StrikePrice == input.StrikePrice ||
                    (this.StrikePrice != null &&
                    this.StrikePrice.Equals(input.StrikePrice))
                ) && 
                (
                    this.LifeCycle == input.LifeCycle ||
                    (this.LifeCycle != null &&
                    this.LifeCycle.Equals(input.LifeCycle))
                ) && 
                (
                    this.ContractSize == input.ContractSize ||
                    (this.ContractSize != null &&
                    this.ContractSize.Equals(input.ContractSize))
                ) && 
                (
                    this.OpenInterest == input.OpenInterest ||
                    (this.OpenInterest != null &&
                    this.OpenInterest.Equals(input.OpenInterest))
                ) && 
                (
                    this.TickSize == input.TickSize ||
                    (this.TickSize != null &&
                    this.TickSize.Equals(input.TickSize))
                ) && 
                (
                    this.Settlement == input.Settlement ||
                    (this.Settlement != null &&
                    this.Settlement.Equals(input.Settlement))
                ) && 
                (
                    this.Underlying == input.Underlying ||
                    (this.Underlying != null &&
                    this.Underlying.Equals(input.Underlying))
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
                if (this.IdInstrument != null)
                {
                    hashCode = (hashCode * 59) + this.IdInstrument.GetHashCode();
                }
                if (this.SourceIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.SourceIdentifier.GetHashCode();
                }
                if (this.Isin != null)
                {
                    hashCode = (hashCode * 59) + this.Isin.GetHashCode();
                }
                if (this.NormalizedSymbol != null)
                {
                    hashCode = (hashCode * 59) + this.NormalizedSymbol.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Market != null)
                {
                    hashCode = (hashCode * 59) + this.Market.GetHashCode();
                }
                if (this.Class != null)
                {
                    hashCode = (hashCode * 59) + this.Class.GetHashCode();
                }
                if (this.Exercise != null)
                {
                    hashCode = (hashCode * 59) + this.Exercise.GetHashCode();
                }
                if (this.StrikePrice != null)
                {
                    hashCode = (hashCode * 59) + this.StrikePrice.GetHashCode();
                }
                if (this.LifeCycle != null)
                {
                    hashCode = (hashCode * 59) + this.LifeCycle.GetHashCode();
                }
                if (this.ContractSize != null)
                {
                    hashCode = (hashCode * 59) + this.ContractSize.GetHashCode();
                }
                if (this.OpenInterest != null)
                {
                    hashCode = (hashCode * 59) + this.OpenInterest.GetHashCode();
                }
                if (this.TickSize != null)
                {
                    hashCode = (hashCode * 59) + this.TickSize.GetHashCode();
                }
                if (this.Settlement != null)
                {
                    hashCode = (hashCode * 59) + this.Settlement.GetHashCode();
                }
                if (this.Underlying != null)
                {
                    hashCode = (hashCode * 59) + this.Underlying.GetHashCode();
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
