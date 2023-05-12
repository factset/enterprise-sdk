/*
 * FactSet Overview Report Builder API
 *
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
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
using OpenAPIDateConverter = FactSet.SDK.OverviewReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OverviewReportBuilder.Model
{
    /// <summary>
    /// The estimated total value of a company after its most recent funding round, taking into account the new capital that was raised
    /// </summary>
    [DataContract(Name = "KeyStatsEntityObject_latestPostMoneyValuation")]
    public partial class KeyStatsEntityObjectLatestPostMoneyValuation : IEquatable<KeyStatsEntityObjectLatestPostMoneyValuation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KeyStatsEntityObjectLatestPostMoneyValuation" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KeyStatsEntityObjectLatestPostMoneyValuation() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="KeyStatsEntityObjectLatestPostMoneyValuation" /> class.
        /// </summary>
        /// <param name="value">value (required).</param>
        /// <param name="label">label (required).</param>
        /// <param name="asOfDate">asOfDate.</param>
        public KeyStatsEntityObjectLatestPostMoneyValuation(KeyStatsEntityObjectRange52WeekValue value, KeyStatsEntityObjectRange52WeekValue label,KeyStatsEntityObjectRevenueAsOfDate asOfDate = default(KeyStatsEntityObjectRevenueAsOfDate))
        {
            // to ensure "value" is required (not null)
            if (value == null) {
                throw new ArgumentNullException("value is a required property for KeyStatsEntityObjectLatestPostMoneyValuation and cannot be null");
            }
            this.Value = value;
            // to ensure "label" is required (not null)
            if (label == null) {
                throw new ArgumentNullException("label is a required property for KeyStatsEntityObjectLatestPostMoneyValuation and cannot be null");
            }
            this.Label = label;
            this.AsOfDate = asOfDate;
        }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = false)]
        public KeyStatsEntityObjectRange52WeekValue Value { get; set; }

        /// <summary>
        /// Gets or Sets Label
        /// </summary>
        [DataMember(Name = "label", IsRequired = true, EmitDefaultValue = false)]
        public KeyStatsEntityObjectRange52WeekValue Label { get; set; }

        /// <summary>
        /// Gets or Sets AsOfDate
        /// </summary>
        [DataMember(Name = "asOfDate", EmitDefaultValue = false)]
        public KeyStatsEntityObjectRevenueAsOfDate AsOfDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class KeyStatsEntityObjectLatestPostMoneyValuation {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  AsOfDate: ").Append(AsOfDate).Append("\n");
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
            return this.Equals(input as KeyStatsEntityObjectLatestPostMoneyValuation);
        }

        /// <summary>
        /// Returns true if KeyStatsEntityObjectLatestPostMoneyValuation instances are equal
        /// </summary>
        /// <param name="input">Instance of KeyStatsEntityObjectLatestPostMoneyValuation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KeyStatsEntityObjectLatestPostMoneyValuation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Label == input.Label ||
                    (this.Label != null &&
                    this.Label.Equals(input.Label))
                ) && 
                (
                    this.AsOfDate == input.AsOfDate ||
                    (this.AsOfDate != null &&
                    this.AsOfDate.Equals(input.AsOfDate))
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
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.Label != null)
                {
                    hashCode = (hashCode * 59) + this.Label.GetHashCode();
                }
                if (this.AsOfDate != null)
                {
                    hashCode = (hashCode * 59) + this.AsOfDate.GetHashCode();
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