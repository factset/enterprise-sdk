/*
 * FI API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.0
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
using OpenAPIDateConverter = FactSet.SDK.FixedIncomeCalculation.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FixedIncomeCalculation.Model
{
    /// <summary>
    /// FIAttributionForSecurities
    /// </summary>
    [DataContract(Name = "FIAttributionForSecurities")]
    public partial class FIAttributionForSecurities : IEquatable<FIAttributionForSecurities>, IValidatableObject
    {
        /// <summary>
        /// Pricing Method
        /// </summary>
        /// <value>Pricing Method</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PricingMethodEnum
        {
            /// <summary>
            /// Enum InputtedPrice for value: Inputted Price
            /// </summary>
            [EnumMember(Value = "Inputted Price")]
            InputtedPrice = 1,

            /// <summary>
            /// Enum PricingMatrix for value: Pricing Matrix
            /// </summary>
            [EnumMember(Value = "Pricing Matrix")]
            PricingMatrix = 2,

            /// <summary>
            /// Enum ActualSpread for value: Actual Spread
            /// </summary>
            [EnumMember(Value = "Actual Spread")]
            ActualSpread = 3,

            /// <summary>
            /// Enum OAS for value: OAS
            /// </summary>
            [EnumMember(Value = "OAS")]
            OAS = 4

        }


        /// <summary>
        /// Pricing Method
        /// </summary>
        /// <value>Pricing Method</value>
        [DataMember(Name = "pricingMethod", EmitDefaultValue = true)]
        public PricingMethodEnum? PricingMethod { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FIAttributionForSecurities" /> class.
        /// </summary>
        /// <param name="startPrice">Start Price.</param>
        /// <param name="endPrice">End Price.</param>
        /// <param name="startSpread">Start Spread.</param>
        /// <param name="endSpread">End Spread.</param>
        /// <param name="pricingMethod">Pricing Method.</param>
        public FIAttributionForSecurities(double? startPrice = default(double?), double? endPrice = default(double?), double? startSpread = default(double?), double? endSpread = default(double?), PricingMethodEnum? pricingMethod = default(PricingMethodEnum?))
        {
            this.StartPrice = startPrice;
            this.EndPrice = endPrice;
            this.StartSpread = startSpread;
            this.EndSpread = endSpread;
            this.PricingMethod = pricingMethod;
        }

        /// <summary>
        /// Start Price
        /// </summary>
        /// <value>Start Price</value>
        [DataMember(Name = "startPrice", EmitDefaultValue = true)]
        public double? StartPrice { get; set; }

        /// <summary>
        /// End Price
        /// </summary>
        /// <value>End Price</value>
        [DataMember(Name = "endPrice", EmitDefaultValue = true)]
        public double? EndPrice { get; set; }

        /// <summary>
        /// Start Spread
        /// </summary>
        /// <value>Start Spread</value>
        [DataMember(Name = "startSpread", EmitDefaultValue = true)]
        public double? StartSpread { get; set; }

        /// <summary>
        /// End Spread
        /// </summary>
        /// <value>End Spread</value>
        [DataMember(Name = "endSpread", EmitDefaultValue = true)]
        public double? EndSpread { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FIAttributionForSecurities {\n");
            sb.Append("  StartPrice: ").Append(StartPrice).Append("\n");
            sb.Append("  EndPrice: ").Append(EndPrice).Append("\n");
            sb.Append("  StartSpread: ").Append(StartSpread).Append("\n");
            sb.Append("  EndSpread: ").Append(EndSpread).Append("\n");
            sb.Append("  PricingMethod: ").Append(PricingMethod).Append("\n");
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
            return this.Equals(input as FIAttributionForSecurities);
        }

        /// <summary>
        /// Returns true if FIAttributionForSecurities instances are equal
        /// </summary>
        /// <param name="input">Instance of FIAttributionForSecurities to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FIAttributionForSecurities input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.StartPrice == input.StartPrice ||
                    (this.StartPrice != null &&
                    this.StartPrice.Equals(input.StartPrice))
                ) && 
                (
                    this.EndPrice == input.EndPrice ||
                    (this.EndPrice != null &&
                    this.EndPrice.Equals(input.EndPrice))
                ) && 
                (
                    this.StartSpread == input.StartSpread ||
                    (this.StartSpread != null &&
                    this.StartSpread.Equals(input.StartSpread))
                ) && 
                (
                    this.EndSpread == input.EndSpread ||
                    (this.EndSpread != null &&
                    this.EndSpread.Equals(input.EndSpread))
                ) && 
                (
                    this.PricingMethod == input.PricingMethod ||
                    this.PricingMethod.Equals(input.PricingMethod)
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
                if (this.StartPrice != null)
                {
                    hashCode = (hashCode * 59) + this.StartPrice.GetHashCode();
                }
                if (this.EndPrice != null)
                {
                    hashCode = (hashCode * 59) + this.EndPrice.GetHashCode();
                }
                if (this.StartSpread != null)
                {
                    hashCode = (hashCode * 59) + this.StartSpread.GetHashCode();
                }
                if (this.EndSpread != null)
                {
                    hashCode = (hashCode * 59) + this.EndSpread.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PricingMethod.GetHashCode();
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
