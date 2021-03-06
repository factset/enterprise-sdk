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
    /// The index the ETP is replicating, if applicable.
    /// </summary>
    [DataContract(Name = "inline_response_200_data_index")]
    public partial class InlineResponse200DataIndex : IEquatable<InlineResponse200DataIndex>, IValidatableObject
    {
        /// <summary>
        /// Period of time between reweighting underlying index constituents.
        /// </summary>
        /// <value>Period of time between reweighting underlying index constituents.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RebalancingFrequencyEnum
        {
            /// <summary>
            /// Enum Monthly for value: Monthly
            /// </summary>
            [EnumMember(Value = "Monthly")]
            Monthly = 1,

            /// <summary>
            /// Enum Annually for value: Annually
            /// </summary>
            [EnumMember(Value = "Annually")]
            Annually = 2,

            /// <summary>
            /// Enum Quarterly for value: Quarterly
            /// </summary>
            [EnumMember(Value = "Quarterly")]
            Quarterly = 3,

            /// <summary>
            /// Enum SemiAnnual for value: Semi-annual
            /// </summary>
            [EnumMember(Value = "Semi-annual")]
            SemiAnnual = 4,

            /// <summary>
            /// Enum Daily for value: Daily
            /// </summary>
            [EnumMember(Value = "Daily")]
            Daily = 5,

            /// <summary>
            /// Enum AsNeeded for value: As Needed
            /// </summary>
            [EnumMember(Value = "As Needed")]
            AsNeeded = 6,

            /// <summary>
            /// Enum BiMonthly for value: Bi-Monthly
            /// </summary>
            [EnumMember(Value = "Bi-Monthly")]
            BiMonthly = 7,

            /// <summary>
            /// Enum Weekly for value: Weekly
            /// </summary>
            [EnumMember(Value = "Weekly")]
            Weekly = 8

        }


        /// <summary>
        /// Period of time between reweighting underlying index constituents.
        /// </summary>
        /// <value>Period of time between reweighting underlying index constituents.</value>
        [DataMember(Name = "rebalancingFrequency", EmitDefaultValue = false)]
        public RebalancingFrequencyEnum? RebalancingFrequency { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200DataIndex" /> class.
        /// </summary>
        /// <param name="name">The name of the underlying index of the ETP. This data is available for all the regions..</param>
        /// <param name="family">The name of the index provider for the underlying index of the ETP. This data is available for all the regions..</param>
        /// <param name="website">The link to the underlying index&#39;s homepage. This data is available for all the regions..</param>
        /// <param name="distributionTreatment">Describes the treatment of constituent cash flows by the index, whether capitalized (reinvested) or ignored, as well as tax withholding by foreign countries. Text and standardized value available for this data item. This data is available for Europe only..</param>
        /// <param name="rebalancingFrequency">Period of time between reweighting underlying index constituents..</param>
        /// <param name="currency">Base calculation currency of underlying index. This data is available for all the regions and currency code is in the format ISO 4217..</param>
        public InlineResponse200DataIndex(string name = default(string), string family = default(string), string website = default(string), string distributionTreatment = default(string), RebalancingFrequencyEnum? rebalancingFrequency = default(RebalancingFrequencyEnum?), string currency = default(string))
        {
            this.Name = name;
            this.Family = family;
            this.Website = website;
            this.DistributionTreatment = distributionTreatment;
            this.RebalancingFrequency = rebalancingFrequency;
            this.Currency = currency;
        }

        /// <summary>
        /// The name of the underlying index of the ETP. This data is available for all the regions.
        /// </summary>
        /// <value>The name of the underlying index of the ETP. This data is available for all the regions.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The name of the index provider for the underlying index of the ETP. This data is available for all the regions.
        /// </summary>
        /// <value>The name of the index provider for the underlying index of the ETP. This data is available for all the regions.</value>
        [DataMember(Name = "family", EmitDefaultValue = false)]
        public string Family { get; set; }

        /// <summary>
        /// The link to the underlying index&#39;s homepage. This data is available for all the regions.
        /// </summary>
        /// <value>The link to the underlying index&#39;s homepage. This data is available for all the regions.</value>
        [DataMember(Name = "website", EmitDefaultValue = false)]
        public string Website { get; set; }

        /// <summary>
        /// Describes the treatment of constituent cash flows by the index, whether capitalized (reinvested) or ignored, as well as tax withholding by foreign countries. Text and standardized value available for this data item. This data is available for Europe only.
        /// </summary>
        /// <value>Describes the treatment of constituent cash flows by the index, whether capitalized (reinvested) or ignored, as well as tax withholding by foreign countries. Text and standardized value available for this data item. This data is available for Europe only.</value>
        [DataMember(Name = "distributionTreatment", EmitDefaultValue = false)]
        public string DistributionTreatment { get; set; }

        /// <summary>
        /// Base calculation currency of underlying index. This data is available for all the regions and currency code is in the format ISO 4217.
        /// </summary>
        /// <value>Base calculation currency of underlying index. This data is available for all the regions and currency code is in the format ISO 4217.</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200DataIndex {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Family: ").Append(Family).Append("\n");
            sb.Append("  Website: ").Append(Website).Append("\n");
            sb.Append("  DistributionTreatment: ").Append(DistributionTreatment).Append("\n");
            sb.Append("  RebalancingFrequency: ").Append(RebalancingFrequency).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
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
            return this.Equals(input as InlineResponse200DataIndex);
        }

        /// <summary>
        /// Returns true if InlineResponse200DataIndex instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200DataIndex to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200DataIndex input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Family == input.Family ||
                    (this.Family != null &&
                    this.Family.Equals(input.Family))
                ) && 
                (
                    this.Website == input.Website ||
                    (this.Website != null &&
                    this.Website.Equals(input.Website))
                ) && 
                (
                    this.DistributionTreatment == input.DistributionTreatment ||
                    (this.DistributionTreatment != null &&
                    this.DistributionTreatment.Equals(input.DistributionTreatment))
                ) && 
                (
                    this.RebalancingFrequency == input.RebalancingFrequency ||
                    this.RebalancingFrequency.Equals(input.RebalancingFrequency)
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Family != null)
                {
                    hashCode = (hashCode * 59) + this.Family.GetHashCode();
                }
                if (this.Website != null)
                {
                    hashCode = (hashCode * 59) + this.Website.GetHashCode();
                }
                if (this.DistributionTreatment != null)
                {
                    hashCode = (hashCode * 59) + this.DistributionTreatment.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.RebalancingFrequency.GetHashCode();
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
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
