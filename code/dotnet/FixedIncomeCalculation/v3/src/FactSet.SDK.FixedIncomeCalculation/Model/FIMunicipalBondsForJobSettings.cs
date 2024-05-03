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
    /// FIMunicipalBondsForJobSettings
    /// </summary>
    [DataContract(Name = "FIMunicipalBondsForJobSettings")]
    public partial class FIMunicipalBondsForJobSettings : IEquatable<FIMunicipalBondsForJobSettings>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FIMunicipalBondsForJobSettings" /> class.
        /// </summary>
        /// <param name="allowSinkForInstallmentPayment">Allow Sink For Installment Payment.</param>
        /// <param name="ignoreSinkingFund">Ignore Sinking Fund Schedule.</param>
        /// <param name="useAnticipatedSinkSchedule">Anticipate Sink Schedule.</param>
        public FIMunicipalBondsForJobSettings(bool? allowSinkForInstallmentPayment = default(bool?), bool? ignoreSinkingFund = default(bool?), bool? useAnticipatedSinkSchedule = default(bool?))
        {
            this.AllowSinkForInstallmentPayment = allowSinkForInstallmentPayment;
            this.IgnoreSinkingFund = ignoreSinkingFund;
            this.UseAnticipatedSinkSchedule = useAnticipatedSinkSchedule;
        }

        /// <summary>
        /// Allow Sink For Installment Payment
        /// </summary>
        /// <value>Allow Sink For Installment Payment</value>
        [DataMember(Name = "allowSinkForInstallmentPayment", EmitDefaultValue = true)]
        public bool? AllowSinkForInstallmentPayment { get; set; }

        /// <summary>
        /// Ignore Sinking Fund Schedule
        /// </summary>
        /// <value>Ignore Sinking Fund Schedule</value>
        [DataMember(Name = "ignoreSinkingFund", EmitDefaultValue = true)]
        public bool? IgnoreSinkingFund { get; set; }

        /// <summary>
        /// Anticipate Sink Schedule
        /// </summary>
        /// <value>Anticipate Sink Schedule</value>
        [DataMember(Name = "useAnticipatedSinkSchedule", EmitDefaultValue = true)]
        public bool? UseAnticipatedSinkSchedule { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FIMunicipalBondsForJobSettings {\n");
            sb.Append("  AllowSinkForInstallmentPayment: ").Append(AllowSinkForInstallmentPayment).Append("\n");
            sb.Append("  IgnoreSinkingFund: ").Append(IgnoreSinkingFund).Append("\n");
            sb.Append("  UseAnticipatedSinkSchedule: ").Append(UseAnticipatedSinkSchedule).Append("\n");
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
            return this.Equals(input as FIMunicipalBondsForJobSettings);
        }

        /// <summary>
        /// Returns true if FIMunicipalBondsForJobSettings instances are equal
        /// </summary>
        /// <param name="input">Instance of FIMunicipalBondsForJobSettings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FIMunicipalBondsForJobSettings input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AllowSinkForInstallmentPayment == input.AllowSinkForInstallmentPayment ||
                    (this.AllowSinkForInstallmentPayment != null &&
                    this.AllowSinkForInstallmentPayment.Equals(input.AllowSinkForInstallmentPayment))
                ) && 
                (
                    this.IgnoreSinkingFund == input.IgnoreSinkingFund ||
                    (this.IgnoreSinkingFund != null &&
                    this.IgnoreSinkingFund.Equals(input.IgnoreSinkingFund))
                ) && 
                (
                    this.UseAnticipatedSinkSchedule == input.UseAnticipatedSinkSchedule ||
                    (this.UseAnticipatedSinkSchedule != null &&
                    this.UseAnticipatedSinkSchedule.Equals(input.UseAnticipatedSinkSchedule))
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
                if (this.AllowSinkForInstallmentPayment != null)
                {
                    hashCode = (hashCode * 59) + this.AllowSinkForInstallmentPayment.GetHashCode();
                }
                if (this.IgnoreSinkingFund != null)
                {
                    hashCode = (hashCode * 59) + this.IgnoreSinkingFund.GetHashCode();
                }
                if (this.UseAnticipatedSinkSchedule != null)
                {
                    hashCode = (hashCode * 59) + this.UseAnticipatedSinkSchedule.GetHashCode();
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
