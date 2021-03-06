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
    /// Summary of the corresponding period.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_data_period")]
    public partial class InlineResponse2004DataPeriod : IEquatable<InlineResponse2004DataPeriod>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004DataPeriod" /> class.
        /// </summary>
        /// <param name="profitLoss">profitLoss.</param>
        /// <param name="transactions">The number of transactions in the corresponding period..</param>
        /// <param name="payouts">The number of payouts in the corresponding period..</param>
        /// <param name="purchaseValue">Value of money that has been invested in the corresponding period..</param>
        public InlineResponse2004DataPeriod(InlineResponse2004DataPeriodProfitLoss profitLoss = default(InlineResponse2004DataPeriodProfitLoss), decimal transactions = default(decimal), decimal payouts = default(decimal), decimal purchaseValue = default(decimal))
        {
            this.ProfitLoss = profitLoss;
            this.Transactions = transactions;
            this.Payouts = payouts;
            this.PurchaseValue = purchaseValue;
        }

        /// <summary>
        /// Gets or Sets ProfitLoss
        /// </summary>
        [DataMember(Name = "profitLoss", EmitDefaultValue = false)]
        public InlineResponse2004DataPeriodProfitLoss ProfitLoss { get; set; }

        /// <summary>
        /// The number of transactions in the corresponding period.
        /// </summary>
        /// <value>The number of transactions in the corresponding period.</value>
        [DataMember(Name = "transactions", EmitDefaultValue = false)]
        public decimal Transactions { get; set; }

        /// <summary>
        /// The number of payouts in the corresponding period.
        /// </summary>
        /// <value>The number of payouts in the corresponding period.</value>
        [DataMember(Name = "payouts", EmitDefaultValue = false)]
        public decimal Payouts { get; set; }

        /// <summary>
        /// Value of money that has been invested in the corresponding period.
        /// </summary>
        /// <value>Value of money that has been invested in the corresponding period.</value>
        [DataMember(Name = "purchaseValue", EmitDefaultValue = false)]
        public decimal PurchaseValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004DataPeriod {\n");
            sb.Append("  ProfitLoss: ").Append(ProfitLoss).Append("\n");
            sb.Append("  Transactions: ").Append(Transactions).Append("\n");
            sb.Append("  Payouts: ").Append(Payouts).Append("\n");
            sb.Append("  PurchaseValue: ").Append(PurchaseValue).Append("\n");
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
            return this.Equals(input as InlineResponse2004DataPeriod);
        }

        /// <summary>
        /// Returns true if InlineResponse2004DataPeriod instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004DataPeriod to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004DataPeriod input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ProfitLoss == input.ProfitLoss ||
                    (this.ProfitLoss != null &&
                    this.ProfitLoss.Equals(input.ProfitLoss))
                ) && 
                (
                    this.Transactions == input.Transactions ||
                    this.Transactions.Equals(input.Transactions)
                ) && 
                (
                    this.Payouts == input.Payouts ||
                    this.Payouts.Equals(input.Payouts)
                ) && 
                (
                    this.PurchaseValue == input.PurchaseValue ||
                    this.PurchaseValue.Equals(input.PurchaseValue)
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
                if (this.ProfitLoss != null)
                {
                    hashCode = (hashCode * 59) + this.ProfitLoss.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Transactions.GetHashCode();
                hashCode = (hashCode * 59) + this.Payouts.GetHashCode();
                hashCode = (hashCode * 59) + this.PurchaseValue.GetHashCode();
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
