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
    /// Per-share figures.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_estimates_firstFiscalYear_currencyDependentEstimates_perShare")]
    public partial class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare : IEquatable<InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare" /> class.
        /// </summary>
        /// <param name="sales">sales.</param>
        /// <param name="earnings">earnings.</param>
        /// <param name="dividends">dividends.</param>
        /// <param name="cashFlow">cashFlow.</param>
        public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales sales = default(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales), InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings earnings = default(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings), InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends dividends = default(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends), InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow cashFlow = default(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow))
        {
            this.Sales = sales;
            this.Earnings = earnings;
            this.Dividends = dividends;
            this.CashFlow = cashFlow;
        }

        /// <summary>
        /// Gets or Sets Sales
        /// </summary>
        [DataMember(Name = "sales", EmitDefaultValue = false)]
        public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales Sales { get; set; }

        /// <summary>
        /// Gets or Sets Earnings
        /// </summary>
        [DataMember(Name = "earnings", EmitDefaultValue = false)]
        public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings Earnings { get; set; }

        /// <summary>
        /// Gets or Sets Dividends
        /// </summary>
        [DataMember(Name = "dividends", EmitDefaultValue = false)]
        public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends Dividends { get; set; }

        /// <summary>
        /// Gets or Sets CashFlow
        /// </summary>
        [DataMember(Name = "cashFlow", EmitDefaultValue = false)]
        public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow CashFlow { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare {\n");
            sb.Append("  Sales: ").Append(Sales).Append("\n");
            sb.Append("  Earnings: ").Append(Earnings).Append("\n");
            sb.Append("  Dividends: ").Append(Dividends).Append("\n");
            sb.Append("  CashFlow: ").Append(CashFlow).Append("\n");
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
            return this.Equals(input as InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare);
        }

        /// <summary>
        /// Returns true if InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sales == input.Sales ||
                    (this.Sales != null &&
                    this.Sales.Equals(input.Sales))
                ) && 
                (
                    this.Earnings == input.Earnings ||
                    (this.Earnings != null &&
                    this.Earnings.Equals(input.Earnings))
                ) && 
                (
                    this.Dividends == input.Dividends ||
                    (this.Dividends != null &&
                    this.Dividends.Equals(input.Dividends))
                ) && 
                (
                    this.CashFlow == input.CashFlow ||
                    (this.CashFlow != null &&
                    this.CashFlow.Equals(input.CashFlow))
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
                if (this.Sales != null)
                {
                    hashCode = (hashCode * 59) + this.Sales.GetHashCode();
                }
                if (this.Earnings != null)
                {
                    hashCode = (hashCode * 59) + this.Earnings.GetHashCode();
                }
                if (this.Dividends != null)
                {
                    hashCode = (hashCode * 59) + this.Dividends.GetHashCode();
                }
                if (this.CashFlow != null)
                {
                    hashCode = (hashCode * 59) + this.CashFlow.GetHashCode();
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
