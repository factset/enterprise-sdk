/*
 * FactSet Estimates
 *
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.6.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEstimates.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEstimates.Model
{
    /// <summary>
    /// TargetPrice
    /// </summary>
    [DataContract(Name = "TargetPrice")]
    public partial class TargetPrice : IEquatable<TargetPrice>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TargetPrice" /> class.
        /// </summary>
        /// <param name="high">Specifies the highest target price estimated for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        /// <param name="low">Specifies the lowest target price estimated for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        /// <param name="analystsCount">The number of analysts providing target price estimates for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        /// <param name="mean">Specifies the mean target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        /// <param name="median">Specifies the median target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        public TargetPrice(double high = default(double), double low = default(double), int analystsCount = default(int), double mean = default(double), double median = default(double))
        {
            this.High = high;
            this.Low = low;
            this.AnalystsCount = analystsCount;
            this.Mean = mean;
            this.Median = median;
        }

        /// <summary>
        /// Specifies the highest target price estimated for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the highest target price estimated for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "high", EmitDefaultValue = false)]
        public double High { get; set; }

        /// <summary>
        /// Specifies the lowest target price estimated for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the lowest target price estimated for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "low", EmitDefaultValue = false)]
        public double Low { get; set; }

        /// <summary>
        /// The number of analysts providing target price estimates for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>The number of analysts providing target price estimates for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "analystsCount", EmitDefaultValue = false)]
        public int AnalystsCount { get; set; }

        /// <summary>
        /// Specifies the mean target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the mean target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "mean", EmitDefaultValue = false)]
        public double Mean { get; set; }

        /// <summary>
        /// Specifies the median target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the median target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "median", EmitDefaultValue = false)]
        public double Median { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TargetPrice {\n");
            sb.Append("  High: ").Append(High).Append("\n");
            sb.Append("  Low: ").Append(Low).Append("\n");
            sb.Append("  AnalystsCount: ").Append(AnalystsCount).Append("\n");
            sb.Append("  Mean: ").Append(Mean).Append("\n");
            sb.Append("  Median: ").Append(Median).Append("\n");
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
            return this.Equals(input as TargetPrice);
        }

        /// <summary>
        /// Returns true if TargetPrice instances are equal
        /// </summary>
        /// <param name="input">Instance of TargetPrice to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TargetPrice input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.High == input.High ||
                    this.High.Equals(input.High)
                ) && 
                (
                    this.Low == input.Low ||
                    this.Low.Equals(input.Low)
                ) && 
                (
                    this.AnalystsCount == input.AnalystsCount ||
                    this.AnalystsCount.Equals(input.AnalystsCount)
                ) && 
                (
                    this.Mean == input.Mean ||
                    this.Mean.Equals(input.Mean)
                ) && 
                (
                    this.Median == input.Median ||
                    this.Median.Equals(input.Median)
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
                hashCode = (hashCode * 59) + this.High.GetHashCode();
                hashCode = (hashCode * 59) + this.Low.GetHashCode();
                hashCode = (hashCode * 59) + this.AnalystsCount.GetHashCode();
                hashCode = (hashCode * 59) + this.Mean.GetHashCode();
                hashCode = (hashCode * 59) + this.Median.GetHashCode();
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
