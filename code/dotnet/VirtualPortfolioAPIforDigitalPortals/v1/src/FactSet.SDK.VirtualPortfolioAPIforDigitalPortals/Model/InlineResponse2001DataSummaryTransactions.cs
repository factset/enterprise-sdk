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
using OpenAPIDateConverter = FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model
{
    /// <summary>
    /// Summary of all non-cash transactions.
    /// </summary>
    [DataContract(Name = "inline_response_200_1_data_summary_transactions")]
    public partial class InlineResponse2001DataSummaryTransactions : IEquatable<InlineResponse2001DataSummaryTransactions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001DataSummaryTransactions" /> class.
        /// </summary>
        /// <param name="total">total.</param>
        /// <param name="buy">buy.</param>
        /// <param name="sell">sell.</param>
        public InlineResponse2001DataSummaryTransactions(InlineResponse2001DataSummaryTransactionsTotal total = default(InlineResponse2001DataSummaryTransactionsTotal), InlineResponse2001DataSummaryTransactionsBuy buy = default(InlineResponse2001DataSummaryTransactionsBuy), InlineResponse2001DataSummaryTransactionsSell sell = default(InlineResponse2001DataSummaryTransactionsSell))
        {
            this.Total = total;
            this.Buy = buy;
            this.Sell = sell;
        }

        /// <summary>
        /// Gets or Sets Total
        /// </summary>
        [DataMember(Name = "total", EmitDefaultValue = false)]
        public InlineResponse2001DataSummaryTransactionsTotal Total { get; set; }

        /// <summary>
        /// Gets or Sets Buy
        /// </summary>
        [DataMember(Name = "buy", EmitDefaultValue = false)]
        public InlineResponse2001DataSummaryTransactionsBuy Buy { get; set; }

        /// <summary>
        /// Gets or Sets Sell
        /// </summary>
        [DataMember(Name = "sell", EmitDefaultValue = false)]
        public InlineResponse2001DataSummaryTransactionsSell Sell { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2001DataSummaryTransactions {\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  Buy: ").Append(Buy).Append("\n");
            sb.Append("  Sell: ").Append(Sell).Append("\n");
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
            return this.Equals(input as InlineResponse2001DataSummaryTransactions);
        }

        /// <summary>
        /// Returns true if InlineResponse2001DataSummaryTransactions instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2001DataSummaryTransactions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001DataSummaryTransactions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Total == input.Total ||
                    (this.Total != null &&
                    this.Total.Equals(input.Total))
                ) && 
                (
                    this.Buy == input.Buy ||
                    (this.Buy != null &&
                    this.Buy.Equals(input.Buy))
                ) && 
                (
                    this.Sell == input.Sell ||
                    (this.Sell != null &&
                    this.Sell.Equals(input.Sell))
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
                if (this.Total != null)
                {
                    hashCode = (hashCode * 59) + this.Total.GetHashCode();
                }
                if (this.Buy != null)
                {
                    hashCode = (hashCode * 59) + this.Buy.GetHashCode();
                }
                if (this.Sell != null)
                {
                    hashCode = (hashCode * 59) + this.Sell.GetHashCode();
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
