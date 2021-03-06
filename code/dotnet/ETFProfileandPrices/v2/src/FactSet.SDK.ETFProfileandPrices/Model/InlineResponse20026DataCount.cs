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
    /// Count of premium, disount and neutral.
    /// </summary>
    [DataContract(Name = "inline_response_200_26_data_count")]
    public partial class InlineResponse20026DataCount : IEquatable<InlineResponse20026DataCount>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20026DataCount" /> class.
        /// </summary>
        /// <param name="premium">Number of days ETP is traded at premium..</param>
        /// <param name="discount">Number of days ETP is traded at discount..</param>
        /// <param name="neutral">Number of days ETP is neither traded at discount nor at premium..</param>
        public InlineResponse20026DataCount(decimal premium = default(decimal), decimal discount = default(decimal), decimal neutral = default(decimal))
        {
            this.Premium = premium;
            this.Discount = discount;
            this.Neutral = neutral;
        }

        /// <summary>
        /// Number of days ETP is traded at premium.
        /// </summary>
        /// <value>Number of days ETP is traded at premium.</value>
        [DataMember(Name = "premium", EmitDefaultValue = false)]
        public decimal Premium { get; set; }

        /// <summary>
        /// Number of days ETP is traded at discount.
        /// </summary>
        /// <value>Number of days ETP is traded at discount.</value>
        [DataMember(Name = "discount", EmitDefaultValue = false)]
        public decimal Discount { get; set; }

        /// <summary>
        /// Number of days ETP is neither traded at discount nor at premium.
        /// </summary>
        /// <value>Number of days ETP is neither traded at discount nor at premium.</value>
        [DataMember(Name = "neutral", EmitDefaultValue = false)]
        public decimal Neutral { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20026DataCount {\n");
            sb.Append("  Premium: ").Append(Premium).Append("\n");
            sb.Append("  Discount: ").Append(Discount).Append("\n");
            sb.Append("  Neutral: ").Append(Neutral).Append("\n");
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
            return this.Equals(input as InlineResponse20026DataCount);
        }

        /// <summary>
        /// Returns true if InlineResponse20026DataCount instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20026DataCount to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20026DataCount input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Premium == input.Premium ||
                    this.Premium.Equals(input.Premium)
                ) && 
                (
                    this.Discount == input.Discount ||
                    this.Discount.Equals(input.Discount)
                ) && 
                (
                    this.Neutral == input.Neutral ||
                    this.Neutral.Equals(input.Neutral)
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
                hashCode = (hashCode * 59) + this.Premium.GetHashCode();
                hashCode = (hashCode * 59) + this.Discount.GetHashCode();
                hashCode = (hashCode * 59) + this.Neutral.GetHashCode();
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
