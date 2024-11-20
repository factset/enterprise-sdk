/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 *
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
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
using OpenAPIDateConverter = FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Model
{
    /// <summary>
    /// The Order Fill Count Response object
    /// </summary>
    [DataContract(Name = "OrderFillCountResponse")]
    public partial class OrderFillCountResponse : IEquatable<OrderFillCountResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderFillCountResponse" /> class.
        /// </summary>
        /// <param name="fills">Number of fills.</param>
        public OrderFillCountResponse(int fills = default(int))
        {
            this.Fills = fills;
        }

        /// <summary>
        /// Number of fills
        /// </summary>
        /// <value>Number of fills</value>
        [DataMember(Name = "fills", EmitDefaultValue = false)]
        public int Fills { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OrderFillCountResponse {\n");
            sb.Append("  Fills: ").Append(Fills).Append("\n");
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
            return this.Equals(input as OrderFillCountResponse);
        }

        /// <summary>
        /// Returns true if OrderFillCountResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of OrderFillCountResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderFillCountResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Fills == input.Fills ||
                    this.Fills.Equals(input.Fills)
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
                hashCode = (hashCode * 59) + this.Fills.GetHashCode();
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
