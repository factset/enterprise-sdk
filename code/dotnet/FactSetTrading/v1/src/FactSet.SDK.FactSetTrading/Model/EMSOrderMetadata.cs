/*
 * EMS API
 *
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
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
    /// EMSOrderMetadata
    /// </summary>
    [DataContract(Name = "EMSOrderMetadata")]
    public partial class EMSOrderMetadata : IEquatable<EMSOrderMetadata>, IValidatableObject
    {
        /// <summary>
        /// Side
        /// </summary>
        /// <value>Side</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SideEnum
        {
            /// <summary>
            /// Enum Buy for value: buy
            /// </summary>
            [EnumMember(Value = "buy")]
            Buy = 1,

            /// <summary>
            /// Enum Sell for value: sell
            /// </summary>
            [EnumMember(Value = "sell")]
            Sell = 2,

            /// <summary>
            /// Enum SellShort for value: sell_short
            /// </summary>
            [EnumMember(Value = "sell_short")]
            SellShort = 3,

            /// <summary>
            /// Enum SellShortExempt for value: sell_short_exempt
            /// </summary>
            [EnumMember(Value = "sell_short_exempt")]
            SellShortExempt = 4

        }


        /// <summary>
        /// Side
        /// </summary>
        /// <value>Side</value>
        [DataMember(Name = "side", EmitDefaultValue = false)]
        public SideEnum? Side { get; set; }
        /// <summary>
        /// Order Type
        /// </summary>
        /// <value>Order Type</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OrderTypeEnum
        {
            /// <summary>
            /// Enum Market for value: market
            /// </summary>
            [EnumMember(Value = "market")]
            Market = 1,

            /// <summary>
            /// Enum Limit for value: limit
            /// </summary>
            [EnumMember(Value = "limit")]
            Limit = 2,

            /// <summary>
            /// Enum Stop for value: stop
            /// </summary>
            [EnumMember(Value = "stop")]
            Stop = 3,

            /// <summary>
            /// Enum StopLimit for value: stop_limit
            /// </summary>
            [EnumMember(Value = "stop_limit")]
            StopLimit = 4,

            /// <summary>
            /// Enum MarketOnClose for value: market_on_close
            /// </summary>
            [EnumMember(Value = "market_on_close")]
            MarketOnClose = 5,

            /// <summary>
            /// Enum LimitOrBetter for value: limit_or_better
            /// </summary>
            [EnumMember(Value = "limit_or_better")]
            LimitOrBetter = 6

        }


        /// <summary>
        /// Order Type
        /// </summary>
        /// <value>Order Type</value>
        [DataMember(Name = "orderType", EmitDefaultValue = false)]
        public OrderTypeEnum? OrderType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EMSOrderMetadata" /> class.
        /// </summary>
        /// <param name="symbol">Symbol.</param>
        /// <param name="side">Side.</param>
        /// <param name="orderType">Order Type.</param>
        /// <param name="orderQuantity">Order Quantity.</param>
        /// <param name="error">Error message.</param>
        /// <param name="info">information.</param>
        /// <param name="orderId">Order Id.</param>
        /// <param name="warning">Warning.</param>
        public EMSOrderMetadata(string symbol = default(string), SideEnum? side = default(SideEnum?), OrderTypeEnum? orderType = default(OrderTypeEnum?), double orderQuantity = default(double), string error = default(string), string info = default(string), string orderId = default(string), string warning = default(string))
        {
            this.Symbol = symbol;
            this.Side = side;
            this.OrderType = orderType;
            this.OrderQuantity = orderQuantity;
            this.Error = error;
            this.Info = info;
            this.OrderId = orderId;
            this.Warning = warning;
        }

        /// <summary>
        /// Symbol
        /// </summary>
        /// <value>Symbol</value>
        [DataMember(Name = "symbol", EmitDefaultValue = false)]
        public string Symbol { get; set; }

        /// <summary>
        /// Order Quantity
        /// </summary>
        /// <value>Order Quantity</value>
        [DataMember(Name = "orderQuantity", EmitDefaultValue = false)]
        public double OrderQuantity { get; set; }

        /// <summary>
        /// Error message
        /// </summary>
        /// <value>Error message</value>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public string Error { get; set; }

        /// <summary>
        /// information
        /// </summary>
        /// <value>information</value>
        [DataMember(Name = "info", EmitDefaultValue = false)]
        public string Info { get; set; }

        /// <summary>
        /// Order Id
        /// </summary>
        /// <value>Order Id</value>
        [DataMember(Name = "orderId", EmitDefaultValue = false)]
        public string OrderId { get; set; }

        /// <summary>
        /// Warning
        /// </summary>
        /// <value>Warning</value>
        [DataMember(Name = "warning", EmitDefaultValue = false)]
        public string Warning { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EMSOrderMetadata {\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Side: ").Append(Side).Append("\n");
            sb.Append("  OrderType: ").Append(OrderType).Append("\n");
            sb.Append("  OrderQuantity: ").Append(OrderQuantity).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  Info: ").Append(Info).Append("\n");
            sb.Append("  OrderId: ").Append(OrderId).Append("\n");
            sb.Append("  Warning: ").Append(Warning).Append("\n");
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
            return this.Equals(input as EMSOrderMetadata);
        }

        /// <summary>
        /// Returns true if EMSOrderMetadata instances are equal
        /// </summary>
        /// <param name="input">Instance of EMSOrderMetadata to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EMSOrderMetadata input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.Side == input.Side ||
                    this.Side.Equals(input.Side)
                ) && 
                (
                    this.OrderType == input.OrderType ||
                    this.OrderType.Equals(input.OrderType)
                ) && 
                (
                    this.OrderQuantity == input.OrderQuantity ||
                    this.OrderQuantity.Equals(input.OrderQuantity)
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
                ) && 
                (
                    this.Info == input.Info ||
                    (this.Info != null &&
                    this.Info.Equals(input.Info))
                ) && 
                (
                    this.OrderId == input.OrderId ||
                    (this.OrderId != null &&
                    this.OrderId.Equals(input.OrderId))
                ) && 
                (
                    this.Warning == input.Warning ||
                    (this.Warning != null &&
                    this.Warning.Equals(input.Warning))
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
                if (this.Symbol != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Side.GetHashCode();
                hashCode = (hashCode * 59) + this.OrderType.GetHashCode();
                hashCode = (hashCode * 59) + this.OrderQuantity.GetHashCode();
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
                }
                if (this.Info != null)
                {
                    hashCode = (hashCode * 59) + this.Info.GetHashCode();
                }
                if (this.OrderId != null)
                {
                    hashCode = (hashCode * 59) + this.OrderId.GetHashCode();
                }
                if (this.Warning != null)
                {
                    hashCode = (hashCode * 59) + this.Warning.GetHashCode();
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
