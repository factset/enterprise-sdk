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
    /// InlineResponse2004Data
    /// </summary>
    [DataContract(Name = "inline_response_200_4_data")]
    public partial class InlineResponse2004Data : IEquatable<InlineResponse2004Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004Data" /> class.
        /// </summary>
        /// <param name="idNotation">Identifier of the notation..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="prices">prices.</param>
        /// <param name="currency">currency.</param>
        /// <param name="delta">Ask-based delta. It represents the first partial derivative of the function             determining the option&#39;s theoretical price with respect to the underlying level, evaluated             at the underlying level. Delta indicates the ratio of the absolute change of the             price of an option for an indefinitely small absolute change in the underlying             level, thus it represents the price sensitivity of the option relative to changes in             the underlying level.             .</param>
        /// <param name="omega">Ask-based omega. It represents delta (see attribute &#x60;delta&#x60;) multiplied with theleverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of theoption. Omega indicates the elasticity of the option&#39;s price regarding the underlyinglevel..</param>
        /// <param name="thetaOneWeek">Ask-based weekly theta. It represents the first partial derivative of the             function determining the option&#39;s theoretical price with respect to the residual term,             evaluated at the current residual term and multiplied by 7/365. Weekly theta indicates             the absolute change (decrease) of the price of an option for a reduction of the             residual term by one week (seven calendar days), thus it represents the price             sensitivity of the option relative to changes in the residual term.             .</param>
        /// <param name="vega">Ask-based vega. It represents the first partial derivative of the function             determining the option&#39;s theoretical price with respect to the implied volatility,             evaluated at the current implied volatility. Vega indicates the ratio of the absolute             change of the price of an option for an absolute change of the implied volatility,             thus it represents the price sensitivity of the option relative to changes in the             implied volatility.             .</param>
        /// <param name="gamma">Ask-based gamma. It represents the second partial derivative of the function determining the option&#39;s theoretical price with respect to the underlying level, evaluated at the current underlying level. Gamma indicates the rate of change of the option&#39;s delta (see attribute &#x60;delta&#x60;) with respect to the underlying level..</param>
        /// <param name="rho">Ask-based rho. It represents the first partial derivative of the function              determining the option&#39;s theoretical price with respect to the risk-free interest rate,              evaluated at the current risk-free interest rate. Rho indicates the ratio of the absolute              change of the price of an option for an absolute change of the risk-free interest rate,              thus it represents the price sensitivity of the option relative to changes in the risk-free              interest rate.The key figure is shown in one basis point change..</param>
        /// <param name="breakEven">Break even point based on the ask price. It represents the underlying level that has to be reached at maturity, such that no loss or profit occurs for the holder of the option. For the value unit, see attribute &#x60;currency&#x60;..</param>
        /// <param name="theoreticalValue">Estimate for the value of an option according to the option&#39;s pricing model (such as Black-Scholes). The parameters for the pricing model (e.g. interest rate, dividend yield, currency cross-rate etc.) use the current market values. For the historic volatility of the underlying, the time span refers to the remaining term to maturity of the option. The historic volatility that is closest to the remaining term is chosen. For example, for a remaining term of 14 months, the 1-year volatility is used, whereas for 19 months, the 2-year volatility. Note that the theoretical value does not depend on the option&#39;s price, but the value is in the option&#39;s value unit, see attribute &#x60;currency&#x60;..</param>
        /// <param name="impliedVolatility">Ask-based implied volatility. It represents the volatility of the underlying             that justifies the ask price of the option, when used as a parameter in the             option&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing             process, thus it represents the annual volatility of the underlying expected by the             market participants until maturity of the option.             .</param>
        /// <param name="intrinsicValue">Intrinsic value. It represents the difference between the underlying level and             the strike of the option, adjusted for the currency cross rate. If the difference             is negative, the intrinsic value is given as 0. The intrinsic value represents             the theoretical profit from an immediate exercise of the option.             .</param>
        /// <param name="leverage">Ask-based leverage. It represents the ratio of the underlying level to the ask             price of the option, adjusted for the currency cross rate.             .</param>
        /// <param name="moneyness">Ratio of the current underlying level to the strike of an option. For calls,             it is current underlying level divided by the strike. For puts, it is strike             divided by the current underlying level. It measures the degree to which an option is             in-the-money (moneyness &gt; 1) or out-of-the-money (moneyness &lt; 1). If moneyness &#x3D; 1, the             option is at-the-money.             .</param>
        /// <param name="parity">Parity. It represents the difference between the underlying level and the             strike of the option, adjusted for the currency cross rate. Negative values are             possible. It is the gain or loss that would result from the immediate exercise of an             already present option and a simultaneously executed compensation transaction on the             spot markets.             .</param>
        /// <param name="timeValue">Ask-based time value. It represents the difference between the ask price ofthe option and its intrinsic value (see attribute &#x60;intrinsicValue&#x60;)..</param>
        public InlineResponse2004Data(string idNotation = default(string), string sourceIdentifier = default(string), InlineResponse2004DataPrices prices = default(InlineResponse2004DataPrices), InlineResponse2004DataCurrency currency = default(InlineResponse2004DataCurrency), decimal? delta = default(decimal?), decimal? omega = default(decimal?), decimal? thetaOneWeek = default(decimal?), decimal? vega = default(decimal?), decimal? gamma = default(decimal?), decimal? rho = default(decimal?), decimal? breakEven = default(decimal?), decimal? theoreticalValue = default(decimal?), decimal? impliedVolatility = default(decimal?), decimal? intrinsicValue = default(decimal?), decimal? leverage = default(decimal?), decimal? moneyness = default(decimal?), decimal? parity = default(decimal?), decimal? timeValue = default(decimal?))
        {
            this.IdNotation = idNotation;
            this.SourceIdentifier = sourceIdentifier;
            this.Prices = prices;
            this.Currency = currency;
            this.Delta = delta;
            this.Omega = omega;
            this.ThetaOneWeek = thetaOneWeek;
            this.Vega = vega;
            this.Gamma = gamma;
            this.Rho = rho;
            this.BreakEven = breakEven;
            this.TheoreticalValue = theoreticalValue;
            this.ImpliedVolatility = impliedVolatility;
            this.IntrinsicValue = intrinsicValue;
            this.Leverage = leverage;
            this.Moneyness = moneyness;
            this.Parity = parity;
            this.TimeValue = timeValue;
        }

        /// <summary>
        /// Identifier of the notation.
        /// </summary>
        /// <value>Identifier of the notation.</value>
        [DataMember(Name = "idNotation", EmitDefaultValue = true)]
        public string IdNotation { get; set; }

        /// <summary>
        /// Identifier used in the request.
        /// </summary>
        /// <value>Identifier used in the request.</value>
        [DataMember(Name = "sourceIdentifier", EmitDefaultValue = true)]
        public string SourceIdentifier { get; set; }

        /// <summary>
        /// Gets or Sets Prices
        /// </summary>
        [DataMember(Name = "prices", EmitDefaultValue = false)]
        public InlineResponse2004DataPrices Prices { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public InlineResponse2004DataCurrency Currency { get; set; }

        /// <summary>
        /// Ask-based delta. It represents the first partial derivative of the function             determining the option&#39;s theoretical price with respect to the underlying level, evaluated             at the underlying level. Delta indicates the ratio of the absolute change of the             price of an option for an indefinitely small absolute change in the underlying             level, thus it represents the price sensitivity of the option relative to changes in             the underlying level.             
        /// </summary>
        /// <value>Ask-based delta. It represents the first partial derivative of the function             determining the option&#39;s theoretical price with respect to the underlying level, evaluated             at the underlying level. Delta indicates the ratio of the absolute change of the             price of an option for an indefinitely small absolute change in the underlying             level, thus it represents the price sensitivity of the option relative to changes in             the underlying level.             </value>
        [DataMember(Name = "delta", EmitDefaultValue = true)]
        public decimal? Delta { get; set; }

        /// <summary>
        /// Ask-based omega. It represents delta (see attribute &#x60;delta&#x60;) multiplied with theleverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of theoption. Omega indicates the elasticity of the option&#39;s price regarding the underlyinglevel.
        /// </summary>
        /// <value>Ask-based omega. It represents delta (see attribute &#x60;delta&#x60;) multiplied with theleverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of theoption. Omega indicates the elasticity of the option&#39;s price regarding the underlyinglevel.</value>
        [DataMember(Name = "omega", EmitDefaultValue = true)]
        public decimal? Omega { get; set; }

        /// <summary>
        /// Ask-based weekly theta. It represents the first partial derivative of the             function determining the option&#39;s theoretical price with respect to the residual term,             evaluated at the current residual term and multiplied by 7/365. Weekly theta indicates             the absolute change (decrease) of the price of an option for a reduction of the             residual term by one week (seven calendar days), thus it represents the price             sensitivity of the option relative to changes in the residual term.             
        /// </summary>
        /// <value>Ask-based weekly theta. It represents the first partial derivative of the             function determining the option&#39;s theoretical price with respect to the residual term,             evaluated at the current residual term and multiplied by 7/365. Weekly theta indicates             the absolute change (decrease) of the price of an option for a reduction of the             residual term by one week (seven calendar days), thus it represents the price             sensitivity of the option relative to changes in the residual term.             </value>
        [DataMember(Name = "thetaOneWeek", EmitDefaultValue = true)]
        public decimal? ThetaOneWeek { get; set; }

        /// <summary>
        /// Ask-based vega. It represents the first partial derivative of the function             determining the option&#39;s theoretical price with respect to the implied volatility,             evaluated at the current implied volatility. Vega indicates the ratio of the absolute             change of the price of an option for an absolute change of the implied volatility,             thus it represents the price sensitivity of the option relative to changes in the             implied volatility.             
        /// </summary>
        /// <value>Ask-based vega. It represents the first partial derivative of the function             determining the option&#39;s theoretical price with respect to the implied volatility,             evaluated at the current implied volatility. Vega indicates the ratio of the absolute             change of the price of an option for an absolute change of the implied volatility,             thus it represents the price sensitivity of the option relative to changes in the             implied volatility.             </value>
        [DataMember(Name = "vega", EmitDefaultValue = true)]
        public decimal? Vega { get; set; }

        /// <summary>
        /// Ask-based gamma. It represents the second partial derivative of the function determining the option&#39;s theoretical price with respect to the underlying level, evaluated at the current underlying level. Gamma indicates the rate of change of the option&#39;s delta (see attribute &#x60;delta&#x60;) with respect to the underlying level.
        /// </summary>
        /// <value>Ask-based gamma. It represents the second partial derivative of the function determining the option&#39;s theoretical price with respect to the underlying level, evaluated at the current underlying level. Gamma indicates the rate of change of the option&#39;s delta (see attribute &#x60;delta&#x60;) with respect to the underlying level.</value>
        [DataMember(Name = "gamma", EmitDefaultValue = true)]
        public decimal? Gamma { get; set; }

        /// <summary>
        /// Ask-based rho. It represents the first partial derivative of the function              determining the option&#39;s theoretical price with respect to the risk-free interest rate,              evaluated at the current risk-free interest rate. Rho indicates the ratio of the absolute              change of the price of an option for an absolute change of the risk-free interest rate,              thus it represents the price sensitivity of the option relative to changes in the risk-free              interest rate.The key figure is shown in one basis point change.
        /// </summary>
        /// <value>Ask-based rho. It represents the first partial derivative of the function              determining the option&#39;s theoretical price with respect to the risk-free interest rate,              evaluated at the current risk-free interest rate. Rho indicates the ratio of the absolute              change of the price of an option for an absolute change of the risk-free interest rate,              thus it represents the price sensitivity of the option relative to changes in the risk-free              interest rate.The key figure is shown in one basis point change.</value>
        [DataMember(Name = "rho", EmitDefaultValue = true)]
        public decimal? Rho { get; set; }

        /// <summary>
        /// Break even point based on the ask price. It represents the underlying level that has to be reached at maturity, such that no loss or profit occurs for the holder of the option. For the value unit, see attribute &#x60;currency&#x60;.
        /// </summary>
        /// <value>Break even point based on the ask price. It represents the underlying level that has to be reached at maturity, such that no loss or profit occurs for the holder of the option. For the value unit, see attribute &#x60;currency&#x60;.</value>
        [DataMember(Name = "breakEven", EmitDefaultValue = true)]
        public decimal? BreakEven { get; set; }

        /// <summary>
        /// Estimate for the value of an option according to the option&#39;s pricing model (such as Black-Scholes). The parameters for the pricing model (e.g. interest rate, dividend yield, currency cross-rate etc.) use the current market values. For the historic volatility of the underlying, the time span refers to the remaining term to maturity of the option. The historic volatility that is closest to the remaining term is chosen. For example, for a remaining term of 14 months, the 1-year volatility is used, whereas for 19 months, the 2-year volatility. Note that the theoretical value does not depend on the option&#39;s price, but the value is in the option&#39;s value unit, see attribute &#x60;currency&#x60;.
        /// </summary>
        /// <value>Estimate for the value of an option according to the option&#39;s pricing model (such as Black-Scholes). The parameters for the pricing model (e.g. interest rate, dividend yield, currency cross-rate etc.) use the current market values. For the historic volatility of the underlying, the time span refers to the remaining term to maturity of the option. The historic volatility that is closest to the remaining term is chosen. For example, for a remaining term of 14 months, the 1-year volatility is used, whereas for 19 months, the 2-year volatility. Note that the theoretical value does not depend on the option&#39;s price, but the value is in the option&#39;s value unit, see attribute &#x60;currency&#x60;.</value>
        [DataMember(Name = "theoreticalValue", EmitDefaultValue = true)]
        public decimal? TheoreticalValue { get; set; }

        /// <summary>
        /// Ask-based implied volatility. It represents the volatility of the underlying             that justifies the ask price of the option, when used as a parameter in the             option&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing             process, thus it represents the annual volatility of the underlying expected by the             market participants until maturity of the option.             
        /// </summary>
        /// <value>Ask-based implied volatility. It represents the volatility of the underlying             that justifies the ask price of the option, when used as a parameter in the             option&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing             process, thus it represents the annual volatility of the underlying expected by the             market participants until maturity of the option.             </value>
        [DataMember(Name = "impliedVolatility", EmitDefaultValue = true)]
        public decimal? ImpliedVolatility { get; set; }

        /// <summary>
        /// Intrinsic value. It represents the difference between the underlying level and             the strike of the option, adjusted for the currency cross rate. If the difference             is negative, the intrinsic value is given as 0. The intrinsic value represents             the theoretical profit from an immediate exercise of the option.             
        /// </summary>
        /// <value>Intrinsic value. It represents the difference between the underlying level and             the strike of the option, adjusted for the currency cross rate. If the difference             is negative, the intrinsic value is given as 0. The intrinsic value represents             the theoretical profit from an immediate exercise of the option.             </value>
        [DataMember(Name = "intrinsicValue", EmitDefaultValue = true)]
        public decimal? IntrinsicValue { get; set; }

        /// <summary>
        /// Ask-based leverage. It represents the ratio of the underlying level to the ask             price of the option, adjusted for the currency cross rate.             
        /// </summary>
        /// <value>Ask-based leverage. It represents the ratio of the underlying level to the ask             price of the option, adjusted for the currency cross rate.             </value>
        [DataMember(Name = "leverage", EmitDefaultValue = true)]
        public decimal? Leverage { get; set; }

        /// <summary>
        /// Ratio of the current underlying level to the strike of an option. For calls,             it is current underlying level divided by the strike. For puts, it is strike             divided by the current underlying level. It measures the degree to which an option is             in-the-money (moneyness &gt; 1) or out-of-the-money (moneyness &lt; 1). If moneyness &#x3D; 1, the             option is at-the-money.             
        /// </summary>
        /// <value>Ratio of the current underlying level to the strike of an option. For calls,             it is current underlying level divided by the strike. For puts, it is strike             divided by the current underlying level. It measures the degree to which an option is             in-the-money (moneyness &gt; 1) or out-of-the-money (moneyness &lt; 1). If moneyness &#x3D; 1, the             option is at-the-money.             </value>
        [DataMember(Name = "moneyness", EmitDefaultValue = true)]
        public decimal? Moneyness { get; set; }

        /// <summary>
        /// Parity. It represents the difference between the underlying level and the             strike of the option, adjusted for the currency cross rate. Negative values are             possible. It is the gain or loss that would result from the immediate exercise of an             already present option and a simultaneously executed compensation transaction on the             spot markets.             
        /// </summary>
        /// <value>Parity. It represents the difference between the underlying level and the             strike of the option, adjusted for the currency cross rate. Negative values are             possible. It is the gain or loss that would result from the immediate exercise of an             already present option and a simultaneously executed compensation transaction on the             spot markets.             </value>
        [DataMember(Name = "parity", EmitDefaultValue = true)]
        public decimal? Parity { get; set; }

        /// <summary>
        /// Ask-based time value. It represents the difference between the ask price ofthe option and its intrinsic value (see attribute &#x60;intrinsicValue&#x60;).
        /// </summary>
        /// <value>Ask-based time value. It represents the difference between the ask price ofthe option and its intrinsic value (see attribute &#x60;intrinsicValue&#x60;).</value>
        [DataMember(Name = "timeValue", EmitDefaultValue = true)]
        public decimal? TimeValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004Data {\n");
            sb.Append("  IdNotation: ").Append(IdNotation).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  Prices: ").Append(Prices).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Delta: ").Append(Delta).Append("\n");
            sb.Append("  Omega: ").Append(Omega).Append("\n");
            sb.Append("  ThetaOneWeek: ").Append(ThetaOneWeek).Append("\n");
            sb.Append("  Vega: ").Append(Vega).Append("\n");
            sb.Append("  Gamma: ").Append(Gamma).Append("\n");
            sb.Append("  Rho: ").Append(Rho).Append("\n");
            sb.Append("  BreakEven: ").Append(BreakEven).Append("\n");
            sb.Append("  TheoreticalValue: ").Append(TheoreticalValue).Append("\n");
            sb.Append("  ImpliedVolatility: ").Append(ImpliedVolatility).Append("\n");
            sb.Append("  IntrinsicValue: ").Append(IntrinsicValue).Append("\n");
            sb.Append("  Leverage: ").Append(Leverage).Append("\n");
            sb.Append("  Moneyness: ").Append(Moneyness).Append("\n");
            sb.Append("  Parity: ").Append(Parity).Append("\n");
            sb.Append("  TimeValue: ").Append(TimeValue).Append("\n");
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
            return this.Equals(input as InlineResponse2004Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2004Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IdNotation == input.IdNotation ||
                    (this.IdNotation != null &&
                    this.IdNotation.Equals(input.IdNotation))
                ) && 
                (
                    this.SourceIdentifier == input.SourceIdentifier ||
                    (this.SourceIdentifier != null &&
                    this.SourceIdentifier.Equals(input.SourceIdentifier))
                ) && 
                (
                    this.Prices == input.Prices ||
                    (this.Prices != null &&
                    this.Prices.Equals(input.Prices))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Delta == input.Delta ||
                    (this.Delta != null &&
                    this.Delta.Equals(input.Delta))
                ) && 
                (
                    this.Omega == input.Omega ||
                    (this.Omega != null &&
                    this.Omega.Equals(input.Omega))
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
                ) && 
                (
                    this.BreakEven == input.BreakEven ||
                    (this.BreakEven != null &&
                    this.BreakEven.Equals(input.BreakEven))
                ) && 
                (
                    this.TheoreticalValue == input.TheoreticalValue ||
                    (this.TheoreticalValue != null &&
                    this.TheoreticalValue.Equals(input.TheoreticalValue))
                ) && 
                (
                    this.ImpliedVolatility == input.ImpliedVolatility ||
                    (this.ImpliedVolatility != null &&
                    this.ImpliedVolatility.Equals(input.ImpliedVolatility))
                ) && 
                (
                    this.IntrinsicValue == input.IntrinsicValue ||
                    (this.IntrinsicValue != null &&
                    this.IntrinsicValue.Equals(input.IntrinsicValue))
                ) && 
                (
                    this.Leverage == input.Leverage ||
                    (this.Leverage != null &&
                    this.Leverage.Equals(input.Leverage))
                ) && 
                (
                    this.Moneyness == input.Moneyness ||
                    (this.Moneyness != null &&
                    this.Moneyness.Equals(input.Moneyness))
                ) && 
                (
                    this.Parity == input.Parity ||
                    (this.Parity != null &&
                    this.Parity.Equals(input.Parity))
                ) && 
                (
                    this.TimeValue == input.TimeValue ||
                    (this.TimeValue != null &&
                    this.TimeValue.Equals(input.TimeValue))
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
                if (this.IdNotation != null)
                {
                    hashCode = (hashCode * 59) + this.IdNotation.GetHashCode();
                }
                if (this.SourceIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.SourceIdentifier.GetHashCode();
                }
                if (this.Prices != null)
                {
                    hashCode = (hashCode * 59) + this.Prices.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Delta != null)
                {
                    hashCode = (hashCode * 59) + this.Delta.GetHashCode();
                }
                if (this.Omega != null)
                {
                    hashCode = (hashCode * 59) + this.Omega.GetHashCode();
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
                if (this.BreakEven != null)
                {
                    hashCode = (hashCode * 59) + this.BreakEven.GetHashCode();
                }
                if (this.TheoreticalValue != null)
                {
                    hashCode = (hashCode * 59) + this.TheoreticalValue.GetHashCode();
                }
                if (this.ImpliedVolatility != null)
                {
                    hashCode = (hashCode * 59) + this.ImpliedVolatility.GetHashCode();
                }
                if (this.IntrinsicValue != null)
                {
                    hashCode = (hashCode * 59) + this.IntrinsicValue.GetHashCode();
                }
                if (this.Leverage != null)
                {
                    hashCode = (hashCode * 59) + this.Leverage.GetHashCode();
                }
                if (this.Moneyness != null)
                {
                    hashCode = (hashCode * 59) + this.Moneyness.GetHashCode();
                }
                if (this.Parity != null)
                {
                    hashCode = (hashCode * 59) + this.Parity.GetHashCode();
                }
                if (this.TimeValue != null)
                {
                    hashCode = (hashCode * 59) + this.TimeValue.GetHashCode();
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
