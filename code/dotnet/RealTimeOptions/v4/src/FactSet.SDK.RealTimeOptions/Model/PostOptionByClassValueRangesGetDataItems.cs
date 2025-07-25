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
    /// A list of objects. For semantical context see the description of the parent array.
    /// </summary>
    [DataContract(Name = "PostOptionByClassValueRangesGetDataItems")]
    public partial class PostOptionByClassValueRangesGetDataItems : IEquatable<PostOptionByClassValueRangesGetDataItems>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostOptionByClassValueRangesGetDataItems" /> class.
        /// </summary>
        /// <param name="totalCount">Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges..</param>
        /// <param name="exercise">exercise.</param>
        /// <param name="strikePrice">strikePrice.</param>
        /// <param name="lifeCycle">lifeCycle.</param>
        /// <param name="contractSize">Values related to the contract size..</param>
        /// <param name="openInterest">openInterest.</param>
        /// <param name="keyFigures">keyFigures.</param>
        /// <param name="impliedVolatility">impliedVolatility.</param>
        /// <param name="omega">omega.</param>
        /// <param name="leverage">leverage.</param>
        /// <param name="delta">delta.</param>
        /// <param name="thetaOneWeek">thetaOneWeek.</param>
        /// <param name="vega">vega.</param>
        /// <param name="gamma">gamma.</param>
        /// <param name="rho">rho.</param>
        public PostOptionByClassValueRangesGetDataItems(decimal? totalCount = default(decimal?), PostOptionByClassValueRangesGetDataItemsExercise exercise = default(PostOptionByClassValueRangesGetDataItemsExercise), PostOptionByClassValueRangesGetDataItemsStrikePrice strikePrice = default(PostOptionByClassValueRangesGetDataItemsStrikePrice), PostOptionByClassValueRangesGetDataItemsLifeCycle lifeCycle = default(PostOptionByClassValueRangesGetDataItemsLifeCycle), List<PostOptionByClassValueRangesGetDataContractSizeItems> contractSize = default(List<PostOptionByClassValueRangesGetDataContractSizeItems>), PostOptionByClassValueRangesGetDataItemsOpenInterest openInterest = default(PostOptionByClassValueRangesGetDataItemsOpenInterest), PostOptionByClassValueRangesGetDataItemsKeyFigures keyFigures = default(PostOptionByClassValueRangesGetDataItemsKeyFigures), PostOptionByClassValueRangesGetDataItemsImpliedVolatility impliedVolatility = default(PostOptionByClassValueRangesGetDataItemsImpliedVolatility), PostOptionByClassValueRangesGetDataItemsOmega omega = default(PostOptionByClassValueRangesGetDataItemsOmega), PostOptionByClassValueRangesGetDataItemsLeverage leverage = default(PostOptionByClassValueRangesGetDataItemsLeverage), PostOptionByClassValueRangesGetDataItemsDelta delta = default(PostOptionByClassValueRangesGetDataItemsDelta), PostOptionByClassValueRangesGetDataItemsThetaOneWeek thetaOneWeek = default(PostOptionByClassValueRangesGetDataItemsThetaOneWeek), PostOptionByClassValueRangesGetDataItemsVega vega = default(PostOptionByClassValueRangesGetDataItemsVega), PostOptionByClassValueRangesGetDataItemsGamma gamma = default(PostOptionByClassValueRangesGetDataItemsGamma), PostOptionByClassValueRangesGetDataItemsRho rho = default(PostOptionByClassValueRangesGetDataItemsRho))
        {
            this.TotalCount = totalCount;
            this.Exercise = exercise;
            this.StrikePrice = strikePrice;
            this.LifeCycle = lifeCycle;
            this.ContractSize = contractSize;
            this.OpenInterest = openInterest;
            this.KeyFigures = keyFigures;
            this.ImpliedVolatility = impliedVolatility;
            this.Omega = omega;
            this.Leverage = leverage;
            this.Delta = delta;
            this.ThetaOneWeek = thetaOneWeek;
            this.Vega = vega;
            this.Gamma = gamma;
            this.Rho = rho;
        }

        /// <summary>
        /// Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges.
        /// </summary>
        /// <value>Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges.</value>
        [DataMember(Name = "totalCount", EmitDefaultValue = true)]
        public decimal? TotalCount { get; set; }

        /// <summary>
        /// Gets or Sets Exercise
        /// </summary>
        [DataMember(Name = "exercise", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsExercise Exercise { get; set; }

        /// <summary>
        /// Gets or Sets StrikePrice
        /// </summary>
        [DataMember(Name = "strikePrice", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsStrikePrice StrikePrice { get; set; }

        /// <summary>
        /// Gets or Sets LifeCycle
        /// </summary>
        [DataMember(Name = "lifeCycle", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsLifeCycle LifeCycle { get; set; }

        /// <summary>
        /// Values related to the contract size.
        /// </summary>
        /// <value>Values related to the contract size.</value>
        [DataMember(Name = "contractSize", EmitDefaultValue = false)]
        public List<PostOptionByClassValueRangesGetDataContractSizeItems> ContractSize { get; set; }

        /// <summary>
        /// Gets or Sets OpenInterest
        /// </summary>
        [DataMember(Name = "openInterest", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsOpenInterest OpenInterest { get; set; }

        /// <summary>
        /// Gets or Sets KeyFigures
        /// </summary>
        [DataMember(Name = "keyFigures", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsKeyFigures KeyFigures { get; set; }

        /// <summary>
        /// Gets or Sets ImpliedVolatility
        /// </summary>
        [DataMember(Name = "impliedVolatility", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsImpliedVolatility ImpliedVolatility { get; set; }

        /// <summary>
        /// Gets or Sets Omega
        /// </summary>
        [DataMember(Name = "omega", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsOmega Omega { get; set; }

        /// <summary>
        /// Gets or Sets Leverage
        /// </summary>
        [DataMember(Name = "leverage", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsLeverage Leverage { get; set; }

        /// <summary>
        /// Gets or Sets Delta
        /// </summary>
        [DataMember(Name = "delta", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsDelta Delta { get; set; }

        /// <summary>
        /// Gets or Sets ThetaOneWeek
        /// </summary>
        [DataMember(Name = "thetaOneWeek", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsThetaOneWeek ThetaOneWeek { get; set; }

        /// <summary>
        /// Gets or Sets Vega
        /// </summary>
        [DataMember(Name = "vega", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsVega Vega { get; set; }

        /// <summary>
        /// Gets or Sets Gamma
        /// </summary>
        [DataMember(Name = "gamma", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsGamma Gamma { get; set; }

        /// <summary>
        /// Gets or Sets Rho
        /// </summary>
        [DataMember(Name = "rho", EmitDefaultValue = false)]
        public PostOptionByClassValueRangesGetDataItemsRho Rho { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostOptionByClassValueRangesGetDataItems {\n");
            sb.Append("  TotalCount: ").Append(TotalCount).Append("\n");
            sb.Append("  Exercise: ").Append(Exercise).Append("\n");
            sb.Append("  StrikePrice: ").Append(StrikePrice).Append("\n");
            sb.Append("  LifeCycle: ").Append(LifeCycle).Append("\n");
            sb.Append("  ContractSize: ").Append(ContractSize).Append("\n");
            sb.Append("  OpenInterest: ").Append(OpenInterest).Append("\n");
            sb.Append("  KeyFigures: ").Append(KeyFigures).Append("\n");
            sb.Append("  ImpliedVolatility: ").Append(ImpliedVolatility).Append("\n");
            sb.Append("  Omega: ").Append(Omega).Append("\n");
            sb.Append("  Leverage: ").Append(Leverage).Append("\n");
            sb.Append("  Delta: ").Append(Delta).Append("\n");
            sb.Append("  ThetaOneWeek: ").Append(ThetaOneWeek).Append("\n");
            sb.Append("  Vega: ").Append(Vega).Append("\n");
            sb.Append("  Gamma: ").Append(Gamma).Append("\n");
            sb.Append("  Rho: ").Append(Rho).Append("\n");
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
            return this.Equals(input as PostOptionByClassValueRangesGetDataItems);
        }

        /// <summary>
        /// Returns true if PostOptionByClassValueRangesGetDataItems instances are equal
        /// </summary>
        /// <param name="input">Instance of PostOptionByClassValueRangesGetDataItems to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostOptionByClassValueRangesGetDataItems input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TotalCount == input.TotalCount ||
                    (this.TotalCount != null &&
                    this.TotalCount.Equals(input.TotalCount))
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
                    this.ContractSize != null &&
                    input.ContractSize != null &&
                    this.ContractSize.SequenceEqual(input.ContractSize)
                ) && 
                (
                    this.OpenInterest == input.OpenInterest ||
                    (this.OpenInterest != null &&
                    this.OpenInterest.Equals(input.OpenInterest))
                ) && 
                (
                    this.KeyFigures == input.KeyFigures ||
                    (this.KeyFigures != null &&
                    this.KeyFigures.Equals(input.KeyFigures))
                ) && 
                (
                    this.ImpliedVolatility == input.ImpliedVolatility ||
                    (this.ImpliedVolatility != null &&
                    this.ImpliedVolatility.Equals(input.ImpliedVolatility))
                ) && 
                (
                    this.Omega == input.Omega ||
                    (this.Omega != null &&
                    this.Omega.Equals(input.Omega))
                ) && 
                (
                    this.Leverage == input.Leverage ||
                    (this.Leverage != null &&
                    this.Leverage.Equals(input.Leverage))
                ) && 
                (
                    this.Delta == input.Delta ||
                    (this.Delta != null &&
                    this.Delta.Equals(input.Delta))
                ) && 
                (
                    this.ThetaOneWeek == input.ThetaOneWeek ||
                    (this.ThetaOneWeek != null &&
                    this.ThetaOneWeek.Equals(input.ThetaOneWeek))
                ) && 
                (
                    this.Vega == input.Vega ||
                    (this.Vega != null &&
                    this.Vega.Equals(input.Vega))
                ) && 
                (
                    this.Gamma == input.Gamma ||
                    (this.Gamma != null &&
                    this.Gamma.Equals(input.Gamma))
                ) && 
                (
                    this.Rho == input.Rho ||
                    (this.Rho != null &&
                    this.Rho.Equals(input.Rho))
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
                if (this.TotalCount != null)
                {
                    hashCode = (hashCode * 59) + this.TotalCount.GetHashCode();
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
                if (this.KeyFigures != null)
                {
                    hashCode = (hashCode * 59) + this.KeyFigures.GetHashCode();
                }
                if (this.ImpliedVolatility != null)
                {
                    hashCode = (hashCode * 59) + this.ImpliedVolatility.GetHashCode();
                }
                if (this.Omega != null)
                {
                    hashCode = (hashCode * 59) + this.Omega.GetHashCode();
                }
                if (this.Leverage != null)
                {
                    hashCode = (hashCode * 59) + this.Leverage.GetHashCode();
                }
                if (this.Delta != null)
                {
                    hashCode = (hashCode * 59) + this.Delta.GetHashCode();
                }
                if (this.ThetaOneWeek != null)
                {
                    hashCode = (hashCode * 59) + this.ThetaOneWeek.GetHashCode();
                }
                if (this.Vega != null)
                {
                    hashCode = (hashCode * 59) + this.Vega.GetHashCode();
                }
                if (this.Gamma != null)
                {
                    hashCode = (hashCode * 59) + this.Gamma.GetHashCode();
                }
                if (this.Rho != null)
                {
                    hashCode = (hashCode * 59) + this.Rho.GetHashCode();
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
