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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Accrued interest, i.e. interest earned but not yet received (realized). The interest starts accruing at the beginning of a coupon period and reaches the declared value (see attribute &#x60;interestRate.current.value&#x60;) for that period at its end. For the start and end date of a coupon period see endpoint &#x60;/instrument/coupon/list&#x60;, attribute &#x60;coupons.period&#x60;.
    /// </summary>
    [DataContract(Name = "inline_response_200_54_data_interestRate_current_accruedInterest")]
    public partial class InlineResponse20054DataInterestRateCurrentAccruedInterest : IEquatable<InlineResponse20054DataInterestRateCurrentAccruedInterest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20054DataInterestRateCurrentAccruedInterest" /> class.
        /// </summary>
        /// <param name="absolute">Monetary value of the accrued interest. The attribute is available only for instruments with a declared nominal value, e.g. securitized derivatives..</param>
        /// <param name="relative">Accrued interest..</param>
        public InlineResponse20054DataInterestRateCurrentAccruedInterest(decimal absolute = default(decimal), decimal relative = default(decimal))
        {
            this.Absolute = absolute;
            this.Relative = relative;
        }

        /// <summary>
        /// Monetary value of the accrued interest. The attribute is available only for instruments with a declared nominal value, e.g. securitized derivatives.
        /// </summary>
        /// <value>Monetary value of the accrued interest. The attribute is available only for instruments with a declared nominal value, e.g. securitized derivatives.</value>
        [DataMember(Name = "absolute", EmitDefaultValue = false)]
        public decimal Absolute { get; set; }

        /// <summary>
        /// Accrued interest.
        /// </summary>
        /// <value>Accrued interest.</value>
        [DataMember(Name = "relative", EmitDefaultValue = false)]
        public decimal Relative { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20054DataInterestRateCurrentAccruedInterest {\n");
            sb.Append("  Absolute: ").Append(Absolute).Append("\n");
            sb.Append("  Relative: ").Append(Relative).Append("\n");
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
            return this.Equals(input as InlineResponse20054DataInterestRateCurrentAccruedInterest);
        }

        /// <summary>
        /// Returns true if InlineResponse20054DataInterestRateCurrentAccruedInterest instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20054DataInterestRateCurrentAccruedInterest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20054DataInterestRateCurrentAccruedInterest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Absolute == input.Absolute ||
                    this.Absolute.Equals(input.Absolute)
                ) && 
                (
                    this.Relative == input.Relative ||
                    this.Relative.Equals(input.Relative)
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
                hashCode = (hashCode * 59) + this.Absolute.GetHashCode();
                hashCode = (hashCode * 59) + this.Relative.GetHashCode();
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
