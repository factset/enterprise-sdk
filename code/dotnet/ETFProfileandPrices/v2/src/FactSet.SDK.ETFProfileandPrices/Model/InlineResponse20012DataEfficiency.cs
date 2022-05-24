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
    /// Efficiency.
    /// </summary>
    [DataContract(Name = "inline_response_200_12_data_efficiency")]
    public partial class InlineResponse20012DataEfficiency : IEquatable<InlineResponse20012DataEfficiency>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20012DataEfficiency" /> class.
        /// </summary>
        /// <param name="value">A measure of how well a fund delivers on its core promise of delivering the returns of an underlying index, taking into account the expense ratio, tracking error, tax risk, fund closure risk and structural risk. In the range 0 (low) to 100 (high). Available for the regions: US..</param>
        /// <param name="average">The average efficiency score for all funds in the segment. Available for the regions: US..</param>
        public InlineResponse20012DataEfficiency(decimal value = default(decimal), decimal average = default(decimal))
        {
            this.Value = value;
            this.Average = average;
        }

        /// <summary>
        /// A measure of how well a fund delivers on its core promise of delivering the returns of an underlying index, taking into account the expense ratio, tracking error, tax risk, fund closure risk and structural risk. In the range 0 (low) to 100 (high). Available for the regions: US.
        /// </summary>
        /// <value>A measure of how well a fund delivers on its core promise of delivering the returns of an underlying index, taking into account the expense ratio, tracking error, tax risk, fund closure risk and structural risk. In the range 0 (low) to 100 (high). Available for the regions: US.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public decimal Value { get; set; }

        /// <summary>
        /// The average efficiency score for all funds in the segment. Available for the regions: US.
        /// </summary>
        /// <value>The average efficiency score for all funds in the segment. Available for the regions: US.</value>
        [DataMember(Name = "average", EmitDefaultValue = false)]
        public decimal Average { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20012DataEfficiency {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Average: ").Append(Average).Append("\n");
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
            return this.Equals(input as InlineResponse20012DataEfficiency);
        }

        /// <summary>
        /// Returns true if InlineResponse20012DataEfficiency instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20012DataEfficiency to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20012DataEfficiency input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    this.Value.Equals(input.Value)
                ) && 
                (
                    this.Average == input.Average ||
                    this.Average.Equals(input.Average)
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
                hashCode = (hashCode * 59) + this.Value.GetHashCode();
                hashCode = (hashCode * 59) + this.Average.GetHashCode();
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