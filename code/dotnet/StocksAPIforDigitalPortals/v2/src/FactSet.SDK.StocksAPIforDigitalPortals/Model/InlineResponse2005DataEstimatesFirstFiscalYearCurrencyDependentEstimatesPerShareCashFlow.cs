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
    /// Cash flow per share, which is the ratio of the net operating cash flow, divided by the shares outstanding.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_estimates_firstFiscalYear_currencyDependentEstimates_perShare_cashFlow")]
    public partial class InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow : IEquatable<InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow" /> class.
        /// </summary>
        /// <param name="mean">mean.</param>
        public InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow(InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean mean = default(InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean))
        {
            this.Mean = mean;
        }

        /// <summary>
        /// Gets or Sets Mean
        /// </summary>
        [DataMember(Name = "mean", EmitDefaultValue = false)]
        public InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean Mean { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow {\n");
            sb.Append("  Mean: ").Append(Mean).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Mean == input.Mean ||
                    (this.Mean != null &&
                    this.Mean.Equals(input.Mean))
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
                if (this.Mean != null)
                {
                    hashCode = (hashCode * 59) + this.Mean.GetHashCode();
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
