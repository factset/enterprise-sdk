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
    /// instrument
    /// </summary>
    [DataContract(Name = "PostOptionByClassListDataItems_instrument")]
    public partial class PostOptionByClassListDataItemsInstrument : IEquatable<PostOptionByClassListDataItemsInstrument>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostOptionByClassListDataItemsInstrument" /> class.
        /// </summary>
        /// <param name="id">Identifier of the instrument..</param>
        /// <param name="normalizedSymbol">Symbol of the option, as normalized by FactSet..</param>
        /// <param name="name">Name of the option..</param>
        /// <param name="exercise">exercise.</param>
        /// <param name="strikePrice">strikePrice.</param>
        /// <param name="lifeCycle">lifeCycle.</param>
        /// <param name="contractSize">Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying..</param>
        public PostOptionByClassListDataItemsInstrument(string id = default(string), string normalizedSymbol = default(string), string name = default(string), PostOptionByClassListDataItemsInstrumentExercise exercise = default(PostOptionByClassListDataItemsInstrumentExercise), PostOptionByClassListDataItemsInstrumentStrikePrice strikePrice = default(PostOptionByClassListDataItemsInstrumentStrikePrice), PostOptionByClassListDataItemsInstrumentLifeCycle lifeCycle = default(PostOptionByClassListDataItemsInstrumentLifeCycle), decimal? contractSize = default(decimal?))
        {
            this.Id = id;
            this.NormalizedSymbol = normalizedSymbol;
            this.Name = name;
            this.Exercise = exercise;
            this.StrikePrice = strikePrice;
            this.LifeCycle = lifeCycle;
            this.ContractSize = contractSize;
        }

        /// <summary>
        /// Identifier of the instrument.
        /// </summary>
        /// <value>Identifier of the instrument.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

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
        /// Gets or Sets Exercise
        /// </summary>
        [DataMember(Name = "exercise", EmitDefaultValue = false)]
        public PostOptionByClassListDataItemsInstrumentExercise Exercise { get; set; }

        /// <summary>
        /// Gets or Sets StrikePrice
        /// </summary>
        [DataMember(Name = "strikePrice", EmitDefaultValue = false)]
        public PostOptionByClassListDataItemsInstrumentStrikePrice StrikePrice { get; set; }

        /// <summary>
        /// Gets or Sets LifeCycle
        /// </summary>
        [DataMember(Name = "lifeCycle", EmitDefaultValue = false)]
        public PostOptionByClassListDataItemsInstrumentLifeCycle LifeCycle { get; set; }

        /// <summary>
        /// Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying.
        /// </summary>
        /// <value>Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying.</value>
        [DataMember(Name = "contractSize", EmitDefaultValue = true)]
        public decimal? ContractSize { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostOptionByClassListDataItemsInstrument {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  NormalizedSymbol: ").Append(NormalizedSymbol).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Exercise: ").Append(Exercise).Append("\n");
            sb.Append("  StrikePrice: ").Append(StrikePrice).Append("\n");
            sb.Append("  LifeCycle: ").Append(LifeCycle).Append("\n");
            sb.Append("  ContractSize: ").Append(ContractSize).Append("\n");
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
            return this.Equals(input as PostOptionByClassListDataItemsInstrument);
        }

        /// <summary>
        /// Returns true if PostOptionByClassListDataItemsInstrument instances are equal
        /// </summary>
        /// <param name="input">Instance of PostOptionByClassListDataItemsInstrument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostOptionByClassListDataItemsInstrument input)
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
                if (this.NormalizedSymbol != null)
                {
                    hashCode = (hashCode * 59) + this.NormalizedSymbol.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
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
