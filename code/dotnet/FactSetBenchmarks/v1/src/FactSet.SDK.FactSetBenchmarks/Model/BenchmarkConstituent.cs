/*
 * FactSet Benchmarks API
 *
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.9.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetBenchmarks.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetBenchmarks.Model
{
    /// <summary>
    /// BenchmarkConstituent
    /// </summary>
    [DataContract(Name = "benchmarkConstituent")]
    public partial class BenchmarkConstituent : IEquatable<BenchmarkConstituent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BenchmarkConstituent" /> class.
        /// </summary>
        /// <param name="fsymId">Benchmark Id.</param>
        /// <param name="date">Date of weight and shares..</param>
        /// <param name="fsymSecurityId">FactSet Security Identifier (-S). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD)..</param>
        /// <param name="fsymRegionalId">FactSet Regional Identifier (-R). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD)..</param>
        /// <param name="currency">Currency code for prices..</param>
        /// <param name="weightClose">Weight of Security in benchmark (percent)..</param>
        /// <param name="adjHolding">Shares held adjusted. Units in Millions..</param>
        /// <param name="unadjHolding">Shares held unadjusted. Units in Millions..</param>
        /// <param name="price">Price of shares held..</param>
        /// <param name="adjMarketValue">Market value adjusted. Market Value represented in Millions..</param>
        /// <param name="requestId">Identifier specified in the request.</param>
        public BenchmarkConstituent(string fsymId = default(string), DateTime? date = default(DateTime?), string fsymSecurityId = default(string), string fsymRegionalId = default(string), string currency = default(string), double? weightClose = default(double?), double? adjHolding = default(double?), double? unadjHolding = default(double?), double? price = default(double?), double? adjMarketValue = default(double?), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Date = date;
            this.FsymSecurityId = fsymSecurityId;
            this.FsymRegionalId = fsymRegionalId;
            this.Currency = currency;
            this.WeightClose = weightClose;
            this.AdjHolding = adjHolding;
            this.UnadjHolding = unadjHolding;
            this.Price = price;
            this.AdjMarketValue = adjMarketValue;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Benchmark Id
        /// </summary>
        /// <value>Benchmark Id</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Date of weight and shares.
        /// </summary>
        /// <value>Date of weight and shares.</value>
        [DataMember(Name = "date", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// FactSet Security Identifier (-S). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD).
        /// </summary>
        /// <value>FactSet Security Identifier (-S). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD).</value>
        [DataMember(Name = "fsymSecurityId", EmitDefaultValue = true)]
        public string FsymSecurityId { get; set; }

        /// <summary>
        /// FactSet Regional Identifier (-R). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD).
        /// </summary>
        /// <value>FactSet Regional Identifier (-R). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD).</value>
        [DataMember(Name = "fsymRegionalId", EmitDefaultValue = true)]
        public string FsymRegionalId { get; set; }

        /// <summary>
        /// Currency code for prices.
        /// </summary>
        /// <value>Currency code for prices.</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Weight of Security in benchmark (percent).
        /// </summary>
        /// <value>Weight of Security in benchmark (percent).</value>
        [DataMember(Name = "weightClose", EmitDefaultValue = true)]
        public double? WeightClose { get; set; }

        /// <summary>
        /// Shares held adjusted. Units in Millions.
        /// </summary>
        /// <value>Shares held adjusted. Units in Millions.</value>
        [DataMember(Name = "adjHolding", EmitDefaultValue = true)]
        public double? AdjHolding { get; set; }

        /// <summary>
        /// Shares held unadjusted. Units in Millions.
        /// </summary>
        /// <value>Shares held unadjusted. Units in Millions.</value>
        [DataMember(Name = "unadjHolding", EmitDefaultValue = true)]
        public double? UnadjHolding { get; set; }

        /// <summary>
        /// Price of shares held.
        /// </summary>
        /// <value>Price of shares held.</value>
        [DataMember(Name = "price", EmitDefaultValue = true)]
        public double? Price { get; set; }

        /// <summary>
        /// Market value adjusted. Market Value represented in Millions.
        /// </summary>
        /// <value>Market value adjusted. Market Value represented in Millions.</value>
        [DataMember(Name = "adjMarketValue", EmitDefaultValue = true)]
        public double? AdjMarketValue { get; set; }

        /// <summary>
        /// Identifier specified in the request
        /// </summary>
        /// <value>Identifier specified in the request</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BenchmarkConstituent {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  FsymSecurityId: ").Append(FsymSecurityId).Append("\n");
            sb.Append("  FsymRegionalId: ").Append(FsymRegionalId).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  WeightClose: ").Append(WeightClose).Append("\n");
            sb.Append("  AdjHolding: ").Append(AdjHolding).Append("\n");
            sb.Append("  UnadjHolding: ").Append(UnadjHolding).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  AdjMarketValue: ").Append(AdjMarketValue).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as BenchmarkConstituent);
        }

        /// <summary>
        /// Returns true if BenchmarkConstituent instances are equal
        /// </summary>
        /// <param name="input">Instance of BenchmarkConstituent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BenchmarkConstituent input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.FsymSecurityId == input.FsymSecurityId ||
                    (this.FsymSecurityId != null &&
                    this.FsymSecurityId.Equals(input.FsymSecurityId))
                ) && 
                (
                    this.FsymRegionalId == input.FsymRegionalId ||
                    (this.FsymRegionalId != null &&
                    this.FsymRegionalId.Equals(input.FsymRegionalId))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.WeightClose == input.WeightClose ||
                    (this.WeightClose != null &&
                    this.WeightClose.Equals(input.WeightClose))
                ) && 
                (
                    this.AdjHolding == input.AdjHolding ||
                    (this.AdjHolding != null &&
                    this.AdjHolding.Equals(input.AdjHolding))
                ) && 
                (
                    this.UnadjHolding == input.UnadjHolding ||
                    (this.UnadjHolding != null &&
                    this.UnadjHolding.Equals(input.UnadjHolding))
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.AdjMarketValue == input.AdjMarketValue ||
                    (this.AdjMarketValue != null &&
                    this.AdjMarketValue.Equals(input.AdjMarketValue))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.FsymSecurityId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymSecurityId.GetHashCode();
                }
                if (this.FsymRegionalId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymRegionalId.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.WeightClose != null)
                {
                    hashCode = (hashCode * 59) + this.WeightClose.GetHashCode();
                }
                if (this.AdjHolding != null)
                {
                    hashCode = (hashCode * 59) + this.AdjHolding.GetHashCode();
                }
                if (this.UnadjHolding != null)
                {
                    hashCode = (hashCode * 59) + this.UnadjHolding.GetHashCode();
                }
                if (this.Price != null)
                {
                    hashCode = (hashCode * 59) + this.Price.GetHashCode();
                }
                if (this.AdjMarketValue != null)
                {
                    hashCode = (hashCode * 59) + this.AdjMarketValue.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
