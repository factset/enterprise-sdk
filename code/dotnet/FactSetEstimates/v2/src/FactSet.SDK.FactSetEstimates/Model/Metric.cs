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
    /// Metric
    /// </summary>
    [DataContract(Name = "metric")]
    public partial class Metric : IEquatable<Metric>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Metric" /> class.
        /// </summary>
        /// <param name="metric">Metric identifier to be used as &#x60;metrics&#x60; input in the FactSet Estimate endpoints..</param>
        /// <param name="name">Plain text name of the metric..</param>
        /// <param name="category">Primary Category of metric item, such as, FINANCIAL_STATEMENT or INDUSTRY_METRIC.</param>
        /// <param name="subcategory">Sub-category of metric items, such as the INCOME_STATEMENT or AIRLINES..</param>
        /// <param name="oAurl">The Online Assistant Page URL, used to lookup the definition and methodology of the requested item..</param>
        public Metric(string metric = default(string), string name = default(string), string category = default(string), string subcategory = default(string), string oAurl = default(string))
        {
            this._Metric = metric;
            this.Name = name;
            this.Category = category;
            this.Subcategory = subcategory;
            this.OAurl = oAurl;
        }

        /// <summary>
        /// Metric identifier to be used as &#x60;metrics&#x60; input in the FactSet Estimate endpoints.
        /// </summary>
        /// <value>Metric identifier to be used as &#x60;metrics&#x60; input in the FactSet Estimate endpoints.</value>
        [DataMember(Name = "metric", EmitDefaultValue = true)]
        public string _Metric { get; set; }

        /// <summary>
        /// Plain text name of the metric.
        /// </summary>
        /// <value>Plain text name of the metric.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Primary Category of metric item, such as, FINANCIAL_STATEMENT or INDUSTRY_METRIC
        /// </summary>
        /// <value>Primary Category of metric item, such as, FINANCIAL_STATEMENT or INDUSTRY_METRIC</value>
        [DataMember(Name = "category", EmitDefaultValue = true)]
        public string Category { get; set; }

        /// <summary>
        /// Sub-category of metric items, such as the INCOME_STATEMENT or AIRLINES.
        /// </summary>
        /// <value>Sub-category of metric items, such as the INCOME_STATEMENT or AIRLINES.</value>
        [DataMember(Name = "subcategory", EmitDefaultValue = true)]
        public string Subcategory { get; set; }

        /// <summary>
        /// The Online Assistant Page URL, used to lookup the definition and methodology of the requested item.
        /// </summary>
        /// <value>The Online Assistant Page URL, used to lookup the definition and methodology of the requested item.</value>
        [DataMember(Name = "OAurl", EmitDefaultValue = true)]
        public string OAurl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Metric {\n");
            sb.Append("  _Metric: ").Append(_Metric).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Subcategory: ").Append(Subcategory).Append("\n");
            sb.Append("  OAurl: ").Append(OAurl).Append("\n");
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
            return this.Equals(input as Metric);
        }

        /// <summary>
        /// Returns true if Metric instances are equal
        /// </summary>
        /// <param name="input">Instance of Metric to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Metric input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._Metric == input._Metric ||
                    (this._Metric != null &&
                    this._Metric.Equals(input._Metric))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.Subcategory == input.Subcategory ||
                    (this.Subcategory != null &&
                    this.Subcategory.Equals(input.Subcategory))
                ) && 
                (
                    this.OAurl == input.OAurl ||
                    (this.OAurl != null &&
                    this.OAurl.Equals(input.OAurl))
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
                if (this._Metric != null)
                {
                    hashCode = (hashCode * 59) + this._Metric.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Category != null)
                {
                    hashCode = (hashCode * 59) + this.Category.GetHashCode();
                }
                if (this.Subcategory != null)
                {
                    hashCode = (hashCode * 59) + this.Subcategory.GetHashCode();
                }
                if (this.OAurl != null)
                {
                    hashCode = (hashCode * 59) + this.OAurl.GetHashCode();
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
