/*
 * Invoice and Billing Endpoints
 *
 * API endpoints for managing and downloading FactSet Invoices
 *
 * The version of the OpenAPI document: 1K
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
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPayInvoiceandBilling.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPayInvoiceandBilling.Model
{
    /// <summary>
    /// InvoiceDetailsBillingAdjustments
    /// </summary>
    [DataContract(Name = "invoiceDetails_billingAdjustments")]
    public partial class InvoiceDetailsBillingAdjustments : IEquatable<InvoiceDetailsBillingAdjustments>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InvoiceDetailsBillingAdjustments" /> class.
        /// </summary>
        /// <param name="description">description.</param>
        /// <param name="date">date.</param>
        /// <param name="services">services.</param>
        /// <param name="taxes">taxes.</param>
        /// <param name="fees">fees.</param>
        /// <param name="currencySymbol">currencySymbol.</param>
        /// <param name="conversionRatio">conversionRatio.</param>
        public InvoiceDetailsBillingAdjustments(string description = default(string), string date = default(string), int services = default(int), int taxes = default(int), int fees = default(int), string currencySymbol = default(string), int conversionRatio = default(int))
        {
            this.Description = description;
            this.Date = date;
            this.Services = services;
            this.Taxes = taxes;
            this.Fees = fees;
            this.CurrencySymbol = currencySymbol;
            this.ConversionRatio = conversionRatio;
        }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public string Date { get; set; }

        /// <summary>
        /// Gets or Sets Services
        /// </summary>
        [DataMember(Name = "services", EmitDefaultValue = false)]
        public int Services { get; set; }

        /// <summary>
        /// Gets or Sets Taxes
        /// </summary>
        [DataMember(Name = "taxes", EmitDefaultValue = false)]
        public int Taxes { get; set; }

        /// <summary>
        /// Gets or Sets Fees
        /// </summary>
        [DataMember(Name = "fees", EmitDefaultValue = false)]
        public int Fees { get; set; }

        /// <summary>
        /// Gets or Sets CurrencySymbol
        /// </summary>
        [DataMember(Name = "currencySymbol", EmitDefaultValue = false)]
        public string CurrencySymbol { get; set; }

        /// <summary>
        /// Gets or Sets ConversionRatio
        /// </summary>
        [DataMember(Name = "conversionRatio", EmitDefaultValue = false)]
        public int ConversionRatio { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InvoiceDetailsBillingAdjustments {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Services: ").Append(Services).Append("\n");
            sb.Append("  Taxes: ").Append(Taxes).Append("\n");
            sb.Append("  Fees: ").Append(Fees).Append("\n");
            sb.Append("  CurrencySymbol: ").Append(CurrencySymbol).Append("\n");
            sb.Append("  ConversionRatio: ").Append(ConversionRatio).Append("\n");
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
            return this.Equals(input as InvoiceDetailsBillingAdjustments);
        }

        /// <summary>
        /// Returns true if InvoiceDetailsBillingAdjustments instances are equal
        /// </summary>
        /// <param name="input">Instance of InvoiceDetailsBillingAdjustments to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InvoiceDetailsBillingAdjustments input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Services == input.Services ||
                    this.Services.Equals(input.Services)
                ) && 
                (
                    this.Taxes == input.Taxes ||
                    this.Taxes.Equals(input.Taxes)
                ) && 
                (
                    this.Fees == input.Fees ||
                    this.Fees.Equals(input.Fees)
                ) && 
                (
                    this.CurrencySymbol == input.CurrencySymbol ||
                    (this.CurrencySymbol != null &&
                    this.CurrencySymbol.Equals(input.CurrencySymbol))
                ) && 
                (
                    this.ConversionRatio == input.ConversionRatio ||
                    this.ConversionRatio.Equals(input.ConversionRatio)
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
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Services.GetHashCode();
                hashCode = (hashCode * 59) + this.Taxes.GetHashCode();
                hashCode = (hashCode * 59) + this.Fees.GetHashCode();
                if (this.CurrencySymbol != null)
                {
                    hashCode = (hashCode * 59) + this.CurrencySymbol.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ConversionRatio.GetHashCode();
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
