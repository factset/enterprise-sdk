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
    /// InvoiceDetailsServiceDetailsExchangeFees
    /// </summary>
    [DataContract(Name = "invoiceDetails_serviceDetails_Exchange_Fees")]
    public partial class InvoiceDetailsServiceDetailsExchangeFees : IEquatable<InvoiceDetailsServiceDetailsExchangeFees>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InvoiceDetailsServiceDetailsExchangeFees" /> class.
        /// </summary>
        /// <param name="accountId">accountId.</param>
        /// <param name="invoiceId">&#x3D;accountId + 2 char year + 2 char month.</param>
        /// <param name="productId">productId.</param>
        /// <param name="quanitity">quanitity.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="unitPrice">unitPrice.</param>
        /// <param name="discount">discount.</param>
        /// <param name="lastMonthAdd">lastMonthAdd.</param>
        public InvoiceDetailsServiceDetailsExchangeFees(string accountId = default(string), string invoiceId = default(string), int productId = default(int), int quanitity = default(int), string displayName = default(string), int unitPrice = default(int), int discount = default(int), bool lastMonthAdd = default(bool))
        {
            this.AccountId = accountId;
            this.InvoiceId = invoiceId;
            this.ProductId = productId;
            this.Quanitity = quanitity;
            this.DisplayName = displayName;
            this.UnitPrice = unitPrice;
            this.Discount = discount;
            this.LastMonthAdd = lastMonthAdd;
        }

        /// <summary>
        /// Gets or Sets AccountId
        /// </summary>
        [DataMember(Name = "accountId", EmitDefaultValue = false)]
        public string AccountId { get; set; }

        /// <summary>
        /// &#x3D;accountId + 2 char year + 2 char month
        /// </summary>
        /// <value>&#x3D;accountId + 2 char year + 2 char month</value>
        [DataMember(Name = "invoiceId", EmitDefaultValue = false)]
        public string InvoiceId { get; set; }

        /// <summary>
        /// Gets or Sets ProductId
        /// </summary>
        [DataMember(Name = "productId", EmitDefaultValue = false)]
        public int ProductId { get; set; }

        /// <summary>
        /// Gets or Sets Quanitity
        /// </summary>
        [DataMember(Name = "quanitity", EmitDefaultValue = false)]
        public int Quanitity { get; set; }

        /// <summary>
        /// Gets or Sets DisplayName
        /// </summary>
        [DataMember(Name = "displayName", EmitDefaultValue = false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets UnitPrice
        /// </summary>
        [DataMember(Name = "unitPrice", EmitDefaultValue = false)]
        public int UnitPrice { get; set; }

        /// <summary>
        /// Gets or Sets Discount
        /// </summary>
        [DataMember(Name = "discount", EmitDefaultValue = false)]
        public int Discount { get; set; }

        /// <summary>
        /// Gets or Sets LastMonthAdd
        /// </summary>
        [DataMember(Name = "lastMonthAdd", EmitDefaultValue = true)]
        public bool LastMonthAdd { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InvoiceDetailsServiceDetailsExchangeFees {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  InvoiceId: ").Append(InvoiceId).Append("\n");
            sb.Append("  ProductId: ").Append(ProductId).Append("\n");
            sb.Append("  Quanitity: ").Append(Quanitity).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  UnitPrice: ").Append(UnitPrice).Append("\n");
            sb.Append("  Discount: ").Append(Discount).Append("\n");
            sb.Append("  LastMonthAdd: ").Append(LastMonthAdd).Append("\n");
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
            return this.Equals(input as InvoiceDetailsServiceDetailsExchangeFees);
        }

        /// <summary>
        /// Returns true if InvoiceDetailsServiceDetailsExchangeFees instances are equal
        /// </summary>
        /// <param name="input">Instance of InvoiceDetailsServiceDetailsExchangeFees to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InvoiceDetailsServiceDetailsExchangeFees input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AccountId == input.AccountId ||
                    (this.AccountId != null &&
                    this.AccountId.Equals(input.AccountId))
                ) && 
                (
                    this.InvoiceId == input.InvoiceId ||
                    (this.InvoiceId != null &&
                    this.InvoiceId.Equals(input.InvoiceId))
                ) && 
                (
                    this.ProductId == input.ProductId ||
                    this.ProductId.Equals(input.ProductId)
                ) && 
                (
                    this.Quanitity == input.Quanitity ||
                    this.Quanitity.Equals(input.Quanitity)
                ) && 
                (
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.UnitPrice == input.UnitPrice ||
                    this.UnitPrice.Equals(input.UnitPrice)
                ) && 
                (
                    this.Discount == input.Discount ||
                    this.Discount.Equals(input.Discount)
                ) && 
                (
                    this.LastMonthAdd == input.LastMonthAdd ||
                    this.LastMonthAdd.Equals(input.LastMonthAdd)
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
                if (this.AccountId != null)
                {
                    hashCode = (hashCode * 59) + this.AccountId.GetHashCode();
                }
                if (this.InvoiceId != null)
                {
                    hashCode = (hashCode * 59) + this.InvoiceId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ProductId.GetHashCode();
                hashCode = (hashCode * 59) + this.Quanitity.GetHashCode();
                if (this.DisplayName != null)
                {
                    hashCode = (hashCode * 59) + this.DisplayName.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UnitPrice.GetHashCode();
                hashCode = (hashCode * 59) + this.Discount.GetHashCode();
                hashCode = (hashCode * 59) + this.LastMonthAdd.GetHashCode();
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
