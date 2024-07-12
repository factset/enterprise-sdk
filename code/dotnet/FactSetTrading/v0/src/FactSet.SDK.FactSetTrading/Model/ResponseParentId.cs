/*
 * Trading API
 *
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.5.0
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
    /// Unique identifier to identify the parent order.
    /// </summary>
    [DataContract(Name = "ResponseParentId")]
    public partial class ResponseParentId : IEquatable<ResponseParentId>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResponseParentId" /> class.
        /// </summary>
        /// <param name="symbol">Ticker symbol.</param>
        /// <param name="basketId">Unique identifier assigned to basket order. Can be fetched from the WebSocket Order Update API..</param>
        public ResponseParentId(string symbol = default(string), string basketId = default(string))
        {
            this.Symbol = symbol;
            this.BasketId = basketId;
        }

        /// <summary>
        /// Ticker symbol
        /// </summary>
        /// <value>Ticker symbol</value>
        [DataMember(Name = "symbol", EmitDefaultValue = true)]
        public string Symbol { get; set; }

        /// <summary>
        /// Unique identifier assigned to basket order. Can be fetched from the WebSocket Order Update API.
        /// </summary>
        /// <value>Unique identifier assigned to basket order. Can be fetched from the WebSocket Order Update API.</value>
        [DataMember(Name = "basketId", EmitDefaultValue = true)]
        public string BasketId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResponseParentId {\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  BasketId: ").Append(BasketId).Append("\n");
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
            return this.Equals(input as ResponseParentId);
        }

        /// <summary>
        /// Returns true if ResponseParentId instances are equal
        /// </summary>
        /// <param name="input">Instance of ResponseParentId to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResponseParentId input)
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
                    this.BasketId == input.BasketId ||
                    (this.BasketId != null &&
                    this.BasketId.Equals(input.BasketId))
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
                if (this.BasketId != null)
                {
                    hashCode = (hashCode * 59) + this.BasketId.GetHashCode();
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
