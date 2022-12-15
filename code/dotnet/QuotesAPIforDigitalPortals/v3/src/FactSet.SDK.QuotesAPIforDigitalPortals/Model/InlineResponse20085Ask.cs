/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Most recent ask price of the trading day.
    /// </summary>
    [DataContract(Name = "inline_response_200_85_ask")]
    public partial class InlineResponse20085Ask : IEquatable<InlineResponse20085Ask>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20085Ask" /> class.
        /// </summary>
        /// <param name="time">Date and time..</param>
        /// <param name="price">Price value. See attribute &#x60;valueUnit&#x60; for its unit..</param>
        /// <param name="quoteCondition">Quote condition. Possible values depend on the values delivered by the supplier of the price information..</param>
        /// <param name="tradingVolume">Number of units (e.g. shares) offered..</param>
        /// <param name="tradingValue">Monetary equivalent (cash value) of the offer. See attribute &#x60;currency&#x60; for its unit..</param>
        public InlineResponse20085Ask(string time = default(string), decimal? price = default(decimal?), string quoteCondition = default(string), decimal? tradingVolume = default(decimal?), decimal? tradingValue = default(decimal?))
        {
            this.Time = time;
            this.Price = price;
            this.QuoteCondition = quoteCondition;
            this.TradingVolume = tradingVolume;
            this.TradingValue = tradingValue;
        }

        /// <summary>
        /// Date and time.
        /// </summary>
        /// <value>Date and time.</value>
        [DataMember(Name = "time", EmitDefaultValue = true)]
        public string Time { get; set; }

        /// <summary>
        /// Price value. See attribute &#x60;valueUnit&#x60; for its unit.
        /// </summary>
        /// <value>Price value. See attribute &#x60;valueUnit&#x60; for its unit.</value>
        [DataMember(Name = "price", EmitDefaultValue = true)]
        public decimal? Price { get; set; }

        /// <summary>
        /// Quote condition. Possible values depend on the values delivered by the supplier of the price information.
        /// </summary>
        /// <value>Quote condition. Possible values depend on the values delivered by the supplier of the price information.</value>
        [DataMember(Name = "quoteCondition", EmitDefaultValue = true)]
        public string QuoteCondition { get; set; }

        /// <summary>
        /// Number of units (e.g. shares) offered.
        /// </summary>
        /// <value>Number of units (e.g. shares) offered.</value>
        [DataMember(Name = "tradingVolume", EmitDefaultValue = true)]
        public decimal? TradingVolume { get; set; }

        /// <summary>
        /// Monetary equivalent (cash value) of the offer. See attribute &#x60;currency&#x60; for its unit.
        /// </summary>
        /// <value>Monetary equivalent (cash value) of the offer. See attribute &#x60;currency&#x60; for its unit.</value>
        [DataMember(Name = "tradingValue", EmitDefaultValue = true)]
        public decimal? TradingValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20085Ask {\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  QuoteCondition: ").Append(QuoteCondition).Append("\n");
            sb.Append("  TradingVolume: ").Append(TradingVolume).Append("\n");
            sb.Append("  TradingValue: ").Append(TradingValue).Append("\n");
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
            return this.Equals(input as InlineResponse20085Ask);
        }

        /// <summary>
        /// Returns true if InlineResponse20085Ask instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20085Ask to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20085Ask input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Time == input.Time ||
                    (this.Time != null &&
                    this.Time.Equals(input.Time))
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.QuoteCondition == input.QuoteCondition ||
                    (this.QuoteCondition != null &&
                    this.QuoteCondition.Equals(input.QuoteCondition))
                ) && 
                (
                    this.TradingVolume == input.TradingVolume ||
                    (this.TradingVolume != null &&
                    this.TradingVolume.Equals(input.TradingVolume))
                ) && 
                (
                    this.TradingValue == input.TradingValue ||
                    (this.TradingValue != null &&
                    this.TradingValue.Equals(input.TradingValue))
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
                if (this.Time != null)
                {
                    hashCode = (hashCode * 59) + this.Time.GetHashCode();
                }
                if (this.Price != null)
                {
                    hashCode = (hashCode * 59) + this.Price.GetHashCode();
                }
                if (this.QuoteCondition != null)
                {
                    hashCode = (hashCode * 59) + this.QuoteCondition.GetHashCode();
                }
                if (this.TradingVolume != null)
                {
                    hashCode = (hashCode * 59) + this.TradingVolume.GetHashCode();
                }
                if (this.TradingValue != null)
                {
                    hashCode = (hashCode * 59) + this.TradingValue.GetHashCode();
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
