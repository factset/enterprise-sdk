/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
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
using OpenAPIDateConverter = FactSet.SDK.OpenRisk.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenRisk.Model
{
    /// <summary>
    /// Details on support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), derived stats, available levels, security group calculation methodology, and multi-lot security allocation. When &#39;securityGroupMethod&#39; is &#39;statSpecific&#39;, please refer to the risk statistics documentation service or inquire for more information.
    /// </summary>
    [DataContract(Name = "SupportedStatDetails")]
    public partial class SupportedStatDetails : IEquatable<SupportedStatDetails>, IValidatableObject
    {
        /// <summary>
        /// Indicates the weights according to which securities with multiple lots have their risk statistic values allocated. &#39;FillAll&#39; indicates the computed statistic value of a particular security is allocated to each of its lots equally. This is common for risk statistics such as marginal statistics or beta. If security group calculations are available, these weights will be used along with &#39;weighting&#39; method specified in &#39;securityGroupMethod&#39;. For example, if this is &#39;ActiveWeights&#39; and &#39;weighting&#39; is &#39;AbsoluteValue&#39;, a net position value is allocated to multiple lots based off of absolute active weights distribution.
        /// </summary>
        /// <value>Indicates the weights according to which securities with multiple lots have their risk statistic values allocated. &#39;FillAll&#39; indicates the computed statistic value of a particular security is allocated to each of its lots equally. This is common for risk statistics such as marginal statistics or beta. If security group calculations are available, these weights will be used along with &#39;weighting&#39; method specified in &#39;securityGroupMethod&#39;. For example, if this is &#39;ActiveWeights&#39; and &#39;weighting&#39; is &#39;AbsoluteValue&#39;, a net position value is allocated to multiple lots based off of absolute active weights distribution.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SecurityLotAllocationEnum
        {
            /// <summary>
            /// Enum PortfolioWeights for value: PortfolioWeights
            /// </summary>
            [EnumMember(Value = "PortfolioWeights")]
            PortfolioWeights = 1,

            /// <summary>
            /// Enum BenchmarkWeights for value: BenchmarkWeights
            /// </summary>
            [EnumMember(Value = "BenchmarkWeights")]
            BenchmarkWeights = 2,

            /// <summary>
            /// Enum ActiveWeights for value: ActiveWeights
            /// </summary>
            [EnumMember(Value = "ActiveWeights")]
            ActiveWeights = 3,

            /// <summary>
            /// Enum MarketWeights for value: MarketWeights
            /// </summary>
            [EnumMember(Value = "MarketWeights")]
            MarketWeights = 4,

            /// <summary>
            /// Enum FillAll for value: FillAll
            /// </summary>
            [EnumMember(Value = "FillAll")]
            FillAll = 5

        }


        /// <summary>
        /// Indicates the weights according to which securities with multiple lots have their risk statistic values allocated. &#39;FillAll&#39; indicates the computed statistic value of a particular security is allocated to each of its lots equally. This is common for risk statistics such as marginal statistics or beta. If security group calculations are available, these weights will be used along with &#39;weighting&#39; method specified in &#39;securityGroupMethod&#39;. For example, if this is &#39;ActiveWeights&#39; and &#39;weighting&#39; is &#39;AbsoluteValue&#39;, a net position value is allocated to multiple lots based off of absolute active weights distribution.
        /// </summary>
        /// <value>Indicates the weights according to which securities with multiple lots have their risk statistic values allocated. &#39;FillAll&#39; indicates the computed statistic value of a particular security is allocated to each of its lots equally. This is common for risk statistics such as marginal statistics or beta. If security group calculations are available, these weights will be used along with &#39;weighting&#39; method specified in &#39;securityGroupMethod&#39;. For example, if this is &#39;ActiveWeights&#39; and &#39;weighting&#39; is &#39;AbsoluteValue&#39;, a net position value is allocated to multiple lots based off of absolute active weights distribution.</value>
        [DataMember(Name = "securityLotAllocation", EmitDefaultValue = false)]
        public SecurityLotAllocationEnum? SecurityLotAllocation { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SupportedStatDetails" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SupportedStatDetails() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SupportedStatDetails" /> class.
        /// </summary>
        /// <param name="correlatedSpecificRisk">Indicates support for correlated specific risk (CSR) calculation setting if true, and false if the setting is prohibited. (required).</param>
        /// <param name="covarianceTimesTwo">Indicates support for covariance times two (Cov*2) calculation setting if true, and false if the setting is prohibited. (required).</param>
        /// <param name="requiresCorrelatedSpecificRisk">Indicates correlated specific risk (CSR) calculation setting is mandatory for the stat, if true. (required).</param>
        /// <param name="requiresCovarianceTimesTwo">Indicates covariance times two (Cov*2) calculation setting is mandatory for the stat, if true. (required).</param>
        /// <param name="derived">A list of the base stat and all possible derived stats which are currently supported by the service. (required).</param>
        /// <param name="supportedLevels">Indicates the calculation levels that are supported by the base stat and all derived stats. Unless it is present, a given calculation level is not supported. (required).</param>
        /// <param name="securityGroupMethod">securityGroupMethod.</param>
        /// <param name="securityLotAllocation">Indicates the weights according to which securities with multiple lots have their risk statistic values allocated. &#39;FillAll&#39; indicates the computed statistic value of a particular security is allocated to each of its lots equally. This is common for risk statistics such as marginal statistics or beta. If security group calculations are available, these weights will be used along with &#39;weighting&#39; method specified in &#39;securityGroupMethod&#39;. For example, if this is &#39;ActiveWeights&#39; and &#39;weighting&#39; is &#39;AbsoluteValue&#39;, a net position value is allocated to multiple lots based off of absolute active weights distribution..</param>
        public SupportedStatDetails(bool correlatedSpecificRisk, bool covarianceTimesTwo, bool requiresCorrelatedSpecificRisk, bool requiresCovarianceTimesTwo, List<string> derived, List<StatCalculationLevel> supportedLevels,SupportedStatDetailsSecurityGroupMethod securityGroupMethod = default(SupportedStatDetailsSecurityGroupMethod), SecurityLotAllocationEnum? securityLotAllocation = default(SecurityLotAllocationEnum?))
        {
            this.CorrelatedSpecificRisk = correlatedSpecificRisk;
            this.CovarianceTimesTwo = covarianceTimesTwo;
            this.RequiresCorrelatedSpecificRisk = requiresCorrelatedSpecificRisk;
            this.RequiresCovarianceTimesTwo = requiresCovarianceTimesTwo;
            // to ensure "derived" is required (not null)
            if (derived == null) {
                throw new ArgumentNullException("derived is a required property for SupportedStatDetails and cannot be null");
            }
            this.Derived = derived;
            // to ensure "supportedLevels" is required (not null)
            if (supportedLevels == null) {
                throw new ArgumentNullException("supportedLevels is a required property for SupportedStatDetails and cannot be null");
            }
            this.SupportedLevels = supportedLevels;
            this.SecurityGroupMethod = securityGroupMethod;
            this.SecurityLotAllocation = securityLotAllocation;
        }

        /// <summary>
        /// Indicates support for correlated specific risk (CSR) calculation setting if true, and false if the setting is prohibited.
        /// </summary>
        /// <value>Indicates support for correlated specific risk (CSR) calculation setting if true, and false if the setting is prohibited.</value>
        [DataMember(Name = "correlatedSpecificRisk", IsRequired = true, EmitDefaultValue = true)]
        public bool CorrelatedSpecificRisk { get; set; }

        /// <summary>
        /// Indicates support for covariance times two (Cov*2) calculation setting if true, and false if the setting is prohibited.
        /// </summary>
        /// <value>Indicates support for covariance times two (Cov*2) calculation setting if true, and false if the setting is prohibited.</value>
        [DataMember(Name = "covarianceTimesTwo", IsRequired = true, EmitDefaultValue = true)]
        public bool CovarianceTimesTwo { get; set; }

        /// <summary>
        /// Indicates correlated specific risk (CSR) calculation setting is mandatory for the stat, if true.
        /// </summary>
        /// <value>Indicates correlated specific risk (CSR) calculation setting is mandatory for the stat, if true.</value>
        [DataMember(Name = "requiresCorrelatedSpecificRisk", IsRequired = true, EmitDefaultValue = true)]
        public bool RequiresCorrelatedSpecificRisk { get; set; }

        /// <summary>
        /// Indicates covariance times two (Cov*2) calculation setting is mandatory for the stat, if true.
        /// </summary>
        /// <value>Indicates covariance times two (Cov*2) calculation setting is mandatory for the stat, if true.</value>
        [DataMember(Name = "requiresCovarianceTimesTwo", IsRequired = true, EmitDefaultValue = true)]
        public bool RequiresCovarianceTimesTwo { get; set; }

        /// <summary>
        /// A list of the base stat and all possible derived stats which are currently supported by the service.
        /// </summary>
        /// <value>A list of the base stat and all possible derived stats which are currently supported by the service.</value>
        [DataMember(Name = "derived", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Derived { get; set; }

        /// <summary>
        /// Indicates the calculation levels that are supported by the base stat and all derived stats. Unless it is present, a given calculation level is not supported.
        /// </summary>
        /// <value>Indicates the calculation levels that are supported by the base stat and all derived stats. Unless it is present, a given calculation level is not supported.</value>
        [DataMember(Name = "supportedLevels", IsRequired = true, EmitDefaultValue = false)]
        public List<StatCalculationLevel> SupportedLevels { get; set; }

        /// <summary>
        /// Gets or Sets SecurityGroupMethod
        /// </summary>
        [DataMember(Name = "securityGroupMethod", EmitDefaultValue = false)]
        public SupportedStatDetailsSecurityGroupMethod SecurityGroupMethod { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SupportedStatDetails {\n");
            sb.Append("  CorrelatedSpecificRisk: ").Append(CorrelatedSpecificRisk).Append("\n");
            sb.Append("  CovarianceTimesTwo: ").Append(CovarianceTimesTwo).Append("\n");
            sb.Append("  RequiresCorrelatedSpecificRisk: ").Append(RequiresCorrelatedSpecificRisk).Append("\n");
            sb.Append("  RequiresCovarianceTimesTwo: ").Append(RequiresCovarianceTimesTwo).Append("\n");
            sb.Append("  Derived: ").Append(Derived).Append("\n");
            sb.Append("  SupportedLevels: ").Append(SupportedLevels).Append("\n");
            sb.Append("  SecurityGroupMethod: ").Append(SecurityGroupMethod).Append("\n");
            sb.Append("  SecurityLotAllocation: ").Append(SecurityLotAllocation).Append("\n");
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
            return this.Equals(input as SupportedStatDetails);
        }

        /// <summary>
        /// Returns true if SupportedStatDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of SupportedStatDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SupportedStatDetails input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.CorrelatedSpecificRisk == input.CorrelatedSpecificRisk ||
                    this.CorrelatedSpecificRisk.Equals(input.CorrelatedSpecificRisk)
                ) && 
                (
                    this.CovarianceTimesTwo == input.CovarianceTimesTwo ||
                    this.CovarianceTimesTwo.Equals(input.CovarianceTimesTwo)
                ) && 
                (
                    this.RequiresCorrelatedSpecificRisk == input.RequiresCorrelatedSpecificRisk ||
                    this.RequiresCorrelatedSpecificRisk.Equals(input.RequiresCorrelatedSpecificRisk)
                ) && 
                (
                    this.RequiresCovarianceTimesTwo == input.RequiresCovarianceTimesTwo ||
                    this.RequiresCovarianceTimesTwo.Equals(input.RequiresCovarianceTimesTwo)
                ) && 
                (
                    this.Derived == input.Derived ||
                    this.Derived != null &&
                    input.Derived != null &&
                    this.Derived.SequenceEqual(input.Derived)
                ) && 
                (
                    this.SupportedLevels == input.SupportedLevels ||
                    this.SupportedLevels != null &&
                    input.SupportedLevels != null &&
                    this.SupportedLevels.SequenceEqual(input.SupportedLevels)
                ) && 
                (
                    this.SecurityGroupMethod == input.SecurityGroupMethod ||
                    (this.SecurityGroupMethod != null &&
                    this.SecurityGroupMethod.Equals(input.SecurityGroupMethod))
                ) && 
                (
                    this.SecurityLotAllocation == input.SecurityLotAllocation ||
                    this.SecurityLotAllocation.Equals(input.SecurityLotAllocation)
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
                hashCode = (hashCode * 59) + this.CorrelatedSpecificRisk.GetHashCode();
                hashCode = (hashCode * 59) + this.CovarianceTimesTwo.GetHashCode();
                hashCode = (hashCode * 59) + this.RequiresCorrelatedSpecificRisk.GetHashCode();
                hashCode = (hashCode * 59) + this.RequiresCovarianceTimesTwo.GetHashCode();
                if (this.Derived != null)
                {
                    hashCode = (hashCode * 59) + this.Derived.GetHashCode();
                }
                if (this.SupportedLevels != null)
                {
                    hashCode = (hashCode * 59) + this.SupportedLevels.GetHashCode();
                }
                if (this.SecurityGroupMethod != null)
                {
                    hashCode = (hashCode * 59) + this.SecurityGroupMethod.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.SecurityLotAllocation.GetHashCode();
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
