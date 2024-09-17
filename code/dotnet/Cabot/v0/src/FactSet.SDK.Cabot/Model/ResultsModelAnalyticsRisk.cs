/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
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
using OpenAPIDateConverter = FactSet.SDK.Cabot.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Cabot.Model
{
    /// <summary>
    /// ResultsModelAnalyticsRisk
    /// </summary>
    [DataContract(Name = "ResultsModelAnalytics_risk")]
    public partial class ResultsModelAnalyticsRisk : IEquatable<ResultsModelAnalyticsRisk>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResultsModelAnalyticsRisk" /> class.
        /// </summary>
        /// <param name="alpha">Alpha describes portfolio results adjusted for style and market factors. It provides insight into portfolio management independent from whether its style was in favor or out of favor (i.e., benefiting from a tailwind or fighting a headwind)..</param>
        /// <param name="beta">Beta is also referred to as systematic risk, in that it expresses portfolio volatility in relationship to market or benchmark volatility. A beta of greater than 1.0 indicates that the portfolio is being managed in such a way that it exhibits more systemic risk than its benchmark and vice versa..</param>
        /// <param name="rSquared">In investing, R squared is generally interpreted as the percentage of a portfolio&#39;s movements that can be explained by movements in the benchmark. An R squared of 1.0 implies that the portfolio&#39;s return is completely explained by movements in the benchmark..</param>
        public ResultsModelAnalyticsRisk(decimal alpha = default(decimal), decimal beta = default(decimal), decimal rSquared = default(decimal))
        {
            this.Alpha = alpha;
            this.Beta = beta;
            this.RSquared = rSquared;
        }

        /// <summary>
        /// Alpha describes portfolio results adjusted for style and market factors. It provides insight into portfolio management independent from whether its style was in favor or out of favor (i.e., benefiting from a tailwind or fighting a headwind).
        /// </summary>
        /// <value>Alpha describes portfolio results adjusted for style and market factors. It provides insight into portfolio management independent from whether its style was in favor or out of favor (i.e., benefiting from a tailwind or fighting a headwind).</value>
        [DataMember(Name = "alpha", EmitDefaultValue = false)]
        public decimal Alpha { get; set; }

        /// <summary>
        /// Beta is also referred to as systematic risk, in that it expresses portfolio volatility in relationship to market or benchmark volatility. A beta of greater than 1.0 indicates that the portfolio is being managed in such a way that it exhibits more systemic risk than its benchmark and vice versa.
        /// </summary>
        /// <value>Beta is also referred to as systematic risk, in that it expresses portfolio volatility in relationship to market or benchmark volatility. A beta of greater than 1.0 indicates that the portfolio is being managed in such a way that it exhibits more systemic risk than its benchmark and vice versa.</value>
        [DataMember(Name = "beta", EmitDefaultValue = false)]
        public decimal Beta { get; set; }

        /// <summary>
        /// In investing, R squared is generally interpreted as the percentage of a portfolio&#39;s movements that can be explained by movements in the benchmark. An R squared of 1.0 implies that the portfolio&#39;s return is completely explained by movements in the benchmark.
        /// </summary>
        /// <value>In investing, R squared is generally interpreted as the percentage of a portfolio&#39;s movements that can be explained by movements in the benchmark. An R squared of 1.0 implies that the portfolio&#39;s return is completely explained by movements in the benchmark.</value>
        [DataMember(Name = "rSquared", EmitDefaultValue = false)]
        public decimal RSquared { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResultsModelAnalyticsRisk {\n");
            sb.Append("  Alpha: ").Append(Alpha).Append("\n");
            sb.Append("  Beta: ").Append(Beta).Append("\n");
            sb.Append("  RSquared: ").Append(RSquared).Append("\n");
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
            return this.Equals(input as ResultsModelAnalyticsRisk);
        }

        /// <summary>
        /// Returns true if ResultsModelAnalyticsRisk instances are equal
        /// </summary>
        /// <param name="input">Instance of ResultsModelAnalyticsRisk to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResultsModelAnalyticsRisk input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Alpha == input.Alpha ||
                    this.Alpha.Equals(input.Alpha)
                ) && 
                (
                    this.Beta == input.Beta ||
                    this.Beta.Equals(input.Beta)
                ) && 
                (
                    this.RSquared == input.RSquared ||
                    this.RSquared.Equals(input.RSquared)
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
                hashCode = (hashCode * 59) + this.Alpha.GetHashCode();
                hashCode = (hashCode * 59) + this.Beta.GetHashCode();
                hashCode = (hashCode * 59) + this.RSquared.GetHashCode();
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
