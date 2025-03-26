/*
 * FactSet Estimates
 *
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.6.1
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
    /// Request object for requesting fixed consensus estimates.
    /// </summary>
    [DataContract(Name = "fixedConsensusRequest")]
    public partial class FixedConsensusRequest : IEquatable<FixedConsensusRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FixedConsensusRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FixedConsensusRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FixedConsensusRequest" /> class.
        /// </summary>
        /// <param name="ids">The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  (required).</param>
        /// <param name="metrics">Requested metrics. Use the &#x60;/metrics&#x60; endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). (required).</param>
        /// <param name="startDate">The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. .</param>
        /// <param name="endDate">The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. .</param>
        /// <param name="frequency">frequency.</param>
        /// <param name="fiscalPeriodStart">Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) .</param>
        /// <param name="fiscalPeriodEnd">Fiscal period end expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Month-end** - MM/YYYY (e.g., 11/2019)   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) .</param>
        /// <param name="periodicity">periodicity.</param>
        /// <param name="currency">Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        public FixedConsensusRequest(List<string> ids, List<string> metrics,string startDate = default(string), string endDate = default(string), Frequency frequency = default(Frequency), string fiscalPeriodStart = default(string), string fiscalPeriodEnd = default(string), Periodicity periodicity = default(Periodicity), string currency = default(string))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for FixedConsensusRequest and cannot be null");
            }
            this.Ids = ids;
            // to ensure "metrics" is required (not null)
            if (metrics == null) {
                throw new ArgumentNullException("metrics is a required property for FixedConsensusRequest and cannot be null");
            }
            this.Metrics = metrics;
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.Frequency = frequency;
            this.FiscalPeriodStart = fiscalPeriodStart;
            this.FiscalPeriodEnd = fiscalPeriodEnd;
            this.Periodicity = periodicity;
            this.Currency = currency;
        }

        /// <summary>
        /// The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
        /// </summary>
        /// <value>The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * </value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Requested metrics. Use the &#x60;/metrics&#x60; endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
        /// </summary>
        /// <value>Requested metrics. Use the &#x60;/metrics&#x60; endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).</value>
        [DataMember(Name = "metrics", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Metrics { get; set; }

        /// <summary>
        /// The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. 
        /// </summary>
        /// <value>The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. </value>
        [DataMember(Name = "startDate", EmitDefaultValue = false)]
        public string StartDate { get; set; }

        /// <summary>
        /// The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
        /// </summary>
        /// <value>The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. </value>
        [DataMember(Name = "endDate", EmitDefaultValue = false)]
        public string EndDate { get; set; }

        /// <summary>
        /// Gets or Sets Frequency
        /// </summary>
        [DataMember(Name = "frequency", EmitDefaultValue = false)]
        public Frequency Frequency { get; set; }

        /// <summary>
        /// Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) 
        /// </summary>
        /// <value>Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) </value>
        [DataMember(Name = "fiscalPeriodStart", EmitDefaultValue = false)]
        public string FiscalPeriodStart { get; set; }

        /// <summary>
        /// Fiscal period end expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Month-end** - MM/YYYY (e.g., 11/2019)   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) 
        /// </summary>
        /// <value>Fiscal period end expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Month-end** - MM/YYYY (e.g., 11/2019)   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) </value>
        [DataMember(Name = "fiscalPeriodEnd", EmitDefaultValue = false)]
        public string FiscalPeriodEnd { get; set; }

        /// <summary>
        /// Gets or Sets Periodicity
        /// </summary>
        [DataMember(Name = "periodicity", EmitDefaultValue = false)]
        public Periodicity Periodicity { get; set; }

        /// <summary>
        /// Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FixedConsensusRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Metrics: ").Append(Metrics).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  FiscalPeriodStart: ").Append(FiscalPeriodStart).Append("\n");
            sb.Append("  FiscalPeriodEnd: ").Append(FiscalPeriodEnd).Append("\n");
            sb.Append("  Periodicity: ").Append(Periodicity).Append("\n");
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
            return this.Equals(input as FixedConsensusRequest);
        }

        /// <summary>
        /// Returns true if FixedConsensusRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of FixedConsensusRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FixedConsensusRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.Metrics == input.Metrics ||
                    this.Metrics != null &&
                    input.Metrics != null &&
                    this.Metrics.SequenceEqual(input.Metrics)
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
                ) && 
                (
                    this.FiscalPeriodStart == input.FiscalPeriodStart ||
                    (this.FiscalPeriodStart != null &&
                    this.FiscalPeriodStart.Equals(input.FiscalPeriodStart))
                ) && 
                (
                    this.FiscalPeriodEnd == input.FiscalPeriodEnd ||
                    (this.FiscalPeriodEnd != null &&
                    this.FiscalPeriodEnd.Equals(input.FiscalPeriodEnd))
                ) && 
                (
                    this.Periodicity == input.Periodicity ||
                    (this.Periodicity != null &&
                    this.Periodicity.Equals(input.Periodicity))
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
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
                }
                if (this.Metrics != null)
                {
                    hashCode = (hashCode * 59) + this.Metrics.GetHashCode();
                }
                if (this.StartDate != null)
                {
                    hashCode = (hashCode * 59) + this.StartDate.GetHashCode();
                }
                if (this.EndDate != null)
                {
                    hashCode = (hashCode * 59) + this.EndDate.GetHashCode();
                }
                if (this.Frequency != null)
                {
                    hashCode = (hashCode * 59) + this.Frequency.GetHashCode();
                }
                if (this.FiscalPeriodStart != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalPeriodStart.GetHashCode();
                }
                if (this.FiscalPeriodEnd != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalPeriodEnd.GetHashCode();
                }
                if (this.Periodicity != null)
                {
                    hashCode = (hashCode * 59) + this.Periodicity.GetHashCode();
                }
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
