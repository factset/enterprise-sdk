/*
 * Trading API
 *
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTrading.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTrading.Model
{
    /// <summary>
    /// Child Order Rejected Info
    /// </summary>
    [DataContract(Name = "ChildOrderRejectInfo")]
    public partial class ChildOrderRejectInfo : IEquatable<ChildOrderRejectInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ChildOrderRejectInfo" /> class.
        /// </summary>
        /// <param name="message">Reason for rejection.</param>
        /// <param name="ticketId">Ticket Id for the child order.</param>
        /// <param name="symbol">Ticker symbol.</param>
        public ChildOrderRejectInfo(string message = default(string), string ticketId = default(string), string symbol = default(string))
        {
            this.Message = message;
            this.TicketId = ticketId;
            this.Symbol = symbol;
        }

        /// <summary>
        /// Reason for rejection
        /// </summary>
        /// <value>Reason for rejection</value>
        [DataMember(Name = "message", EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// Ticket Id for the child order
        /// </summary>
        /// <value>Ticket Id for the child order</value>
        [DataMember(Name = "ticketId", EmitDefaultValue = true)]
        public string TicketId { get; set; }

        /// <summary>
        /// Ticker symbol
        /// </summary>
        /// <value>Ticker symbol</value>
        [DataMember(Name = "symbol", EmitDefaultValue = true)]
        public string Symbol { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChildOrderRejectInfo {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  TicketId: ").Append(TicketId).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
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
            return this.Equals(input as ChildOrderRejectInfo);
        }

        /// <summary>
        /// Returns true if ChildOrderRejectInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of ChildOrderRejectInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ChildOrderRejectInfo input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.TicketId == input.TicketId ||
                    (this.TicketId != null &&
                    this.TicketId.Equals(input.TicketId))
                ) && 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
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
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
                }
                if (this.TicketId != null)
                {
                    hashCode = (hashCode * 59) + this.TicketId.GetHashCode();
                }
                if (this.Symbol != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol.GetHashCode();
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
