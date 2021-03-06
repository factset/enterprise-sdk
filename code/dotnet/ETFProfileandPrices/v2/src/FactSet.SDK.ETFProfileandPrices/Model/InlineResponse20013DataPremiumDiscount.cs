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
using OpenAPIDateConverter = FactSet.SDK.ETFProfileandPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ETFProfileandPrices.Model
{
    /// <summary>
    /// The difference between the last share price of the ETF and its end-of-day net asset value (NAV). A positive difference is called premium and a negative difference is called discount.
    /// </summary>
    [DataContract(Name = "inline_response_200_13_data_premiumDiscount")]
    public partial class InlineResponse20013DataPremiumDiscount : IEquatable<InlineResponse20013DataPremiumDiscount>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20013DataPremiumDiscount" /> class.
        /// </summary>
        /// <param name="median">The median premium or discount over the last 12 months. Available for the regions: US..</param>
        /// <param name="max">The greatest absolute amount that the market price exceeded (premium) and lagged (discount) its net asset value (NAV) over a 12-month period. Available for the regions: US..</param>
        public InlineResponse20013DataPremiumDiscount(decimal median = default(decimal), decimal max = default(decimal))
        {
            this.Median = median;
            this.Max = max;
        }

        /// <summary>
        /// The median premium or discount over the last 12 months. Available for the regions: US.
        /// </summary>
        /// <value>The median premium or discount over the last 12 months. Available for the regions: US.</value>
        [DataMember(Name = "median", EmitDefaultValue = false)]
        public decimal Median { get; set; }

        /// <summary>
        /// The greatest absolute amount that the market price exceeded (premium) and lagged (discount) its net asset value (NAV) over a 12-month period. Available for the regions: US.
        /// </summary>
        /// <value>The greatest absolute amount that the market price exceeded (premium) and lagged (discount) its net asset value (NAV) over a 12-month period. Available for the regions: US.</value>
        [DataMember(Name = "max", EmitDefaultValue = false)]
        public decimal Max { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20013DataPremiumDiscount {\n");
            sb.Append("  Median: ").Append(Median).Append("\n");
            sb.Append("  Max: ").Append(Max).Append("\n");
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
            return this.Equals(input as InlineResponse20013DataPremiumDiscount);
        }

        /// <summary>
        /// Returns true if InlineResponse20013DataPremiumDiscount instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20013DataPremiumDiscount to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20013DataPremiumDiscount input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Median == input.Median ||
                    this.Median.Equals(input.Median)
                ) && 
                (
                    this.Max == input.Max ||
                    this.Max.Equals(input.Max)
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
                hashCode = (hashCode * 59) + this.Median.GetHashCode();
                hashCode = (hashCode * 59) + this.Max.GetHashCode();
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
