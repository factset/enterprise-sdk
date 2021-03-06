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
    /// Max capital gains rate.
    /// </summary>
    [DataContract(Name = "inline_response_200_32_data_maxCapitalGainsRate")]
    public partial class InlineResponse20032DataMaxCapitalGainsRate : IEquatable<InlineResponse20032DataMaxCapitalGainsRate>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20032DataMaxCapitalGainsRate" /> class.
        /// </summary>
        /// <param name="longTerm">The maximum US federal personal income tax rate that applies to long-term capital gains associated with the ETP. This data is available for the US regions..</param>
        /// <param name="shortTerm">The maximum US federal personal income tax rate that applies to short-term capital gains associated with the ETP. This data is available for the US regions..</param>
        public InlineResponse20032DataMaxCapitalGainsRate(decimal longTerm = default(decimal), decimal shortTerm = default(decimal))
        {
            this.LongTerm = longTerm;
            this.ShortTerm = shortTerm;
        }

        /// <summary>
        /// The maximum US federal personal income tax rate that applies to long-term capital gains associated with the ETP. This data is available for the US regions.
        /// </summary>
        /// <value>The maximum US federal personal income tax rate that applies to long-term capital gains associated with the ETP. This data is available for the US regions.</value>
        [DataMember(Name = "longTerm", EmitDefaultValue = false)]
        public decimal LongTerm { get; set; }

        /// <summary>
        /// The maximum US federal personal income tax rate that applies to short-term capital gains associated with the ETP. This data is available for the US regions.
        /// </summary>
        /// <value>The maximum US federal personal income tax rate that applies to short-term capital gains associated with the ETP. This data is available for the US regions.</value>
        [DataMember(Name = "shortTerm", EmitDefaultValue = false)]
        public decimal ShortTerm { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20032DataMaxCapitalGainsRate {\n");
            sb.Append("  LongTerm: ").Append(LongTerm).Append("\n");
            sb.Append("  ShortTerm: ").Append(ShortTerm).Append("\n");
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
            return this.Equals(input as InlineResponse20032DataMaxCapitalGainsRate);
        }

        /// <summary>
        /// Returns true if InlineResponse20032DataMaxCapitalGainsRate instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20032DataMaxCapitalGainsRate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20032DataMaxCapitalGainsRate input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.LongTerm == input.LongTerm ||
                    this.LongTerm.Equals(input.LongTerm)
                ) && 
                (
                    this.ShortTerm == input.ShortTerm ||
                    this.ShortTerm.Equals(input.ShortTerm)
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
                hashCode = (hashCode * 59) + this.LongTerm.GetHashCode();
                hashCode = (hashCode * 59) + this.ShortTerm.GetHashCode();
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
