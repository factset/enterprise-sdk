/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    /// Currency-dependent estimates. Selection of a currency is required to use these parameters.
    /// </summary>
    [DataContract(Name = "_stock_notation_screener_search_data_currencyDependentEstimates")]
    public partial class StockNotationScreenerSearchDataCurrencyDependentEstimates : IEquatable<StockNotationScreenerSearchDataCurrencyDependentEstimates>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationScreenerSearchDataCurrencyDependentEstimates" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected StockNotationScreenerSearchDataCurrencyDependentEstimates() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationScreenerSearchDataCurrencyDependentEstimates" /> class.
        /// </summary>
        /// <param name="currency">currency (required).</param>
        /// <param name="ebit">ebit.</param>
        /// <param name="ebitda">ebitda.</param>
        /// <param name="perShare">perShare.</param>
        public StockNotationScreenerSearchDataCurrencyDependentEstimates(StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency currency,StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit ebit = default(StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit), StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda ebitda = default(StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda), StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare perShare = default(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare))
        {
            // to ensure "currency" is required (not null)
            if (currency == null) {
                throw new ArgumentNullException("currency is a required property for StockNotationScreenerSearchDataCurrencyDependentEstimates and cannot be null");
            }
            this.Currency = currency;
            this.Ebit = ebit;
            this.Ebitda = ebitda;
            this.PerShare = perShare;
        }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency Currency { get; set; }

        /// <summary>
        /// Gets or Sets Ebit
        /// </summary>
        [DataMember(Name = "ebit", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit Ebit { get; set; }

        /// <summary>
        /// Gets or Sets Ebitda
        /// </summary>
        [DataMember(Name = "ebitda", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda Ebitda { get; set; }

        /// <summary>
        /// Gets or Sets PerShare
        /// </summary>
        [DataMember(Name = "perShare", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare PerShare { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StockNotationScreenerSearchDataCurrencyDependentEstimates {\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Ebit: ").Append(Ebit).Append("\n");
            sb.Append("  Ebitda: ").Append(Ebitda).Append("\n");
            sb.Append("  PerShare: ").Append(PerShare).Append("\n");
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
            return this.Equals(input as StockNotationScreenerSearchDataCurrencyDependentEstimates);
        }

        /// <summary>
        /// Returns true if StockNotationScreenerSearchDataCurrencyDependentEstimates instances are equal
        /// </summary>
        /// <param name="input">Instance of StockNotationScreenerSearchDataCurrencyDependentEstimates to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StockNotationScreenerSearchDataCurrencyDependentEstimates input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Ebit == input.Ebit ||
                    (this.Ebit != null &&
                    this.Ebit.Equals(input.Ebit))
                ) && 
                (
                    this.Ebitda == input.Ebitda ||
                    (this.Ebitda != null &&
                    this.Ebitda.Equals(input.Ebitda))
                ) && 
                (
                    this.PerShare == input.PerShare ||
                    (this.PerShare != null &&
                    this.PerShare.Equals(input.PerShare))
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
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Ebit != null)
                {
                    hashCode = (hashCode * 59) + this.Ebit.GetHashCode();
                }
                if (this.Ebitda != null)
                {
                    hashCode = (hashCode * 59) + this.Ebitda.GetHashCode();
                }
                if (this.PerShare != null)
                {
                    hashCode = (hashCode * 59) + this.PerShare.GetHashCode();
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
