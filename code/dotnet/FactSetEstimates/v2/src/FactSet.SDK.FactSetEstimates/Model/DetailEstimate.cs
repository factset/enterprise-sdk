/*
 * FactSet Estimates
 *
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
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
    /// DetailEstimate
    /// </summary>
    [DataContract(Name = "detailEstimate")]
    public partial class DetailEstimate : IEquatable<DetailEstimate>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DetailEstimate" /> class.
        /// </summary>
        /// <param name="fsymId">fsymId.</param>
        /// <param name="metric">Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034)..</param>
        /// <param name="periodicity">Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods..</param>
        /// <param name="fiscalYear">Company&#39;s &#39;fiscal year&#39; for the estimate record.</param>
        /// <param name="fiscalPeriod">Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period..</param>
        /// <param name="fiscalEndDate">Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format.</param>
        /// <param name="relativePeriod">&#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).</param>
        /// <param name="currency">Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="estimateDate">Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).</param>
        /// <param name="estimateValue">The value of the estimate..</param>
        /// <param name="analystId">The FactSet Entity Identifier for the analyst making the estimate..</param>
        /// <param name="analystName">The name of the analyst making the estimate..</param>
        /// <param name="brokerId">The FactSet Entity Identifier for the broker making the estimate..</param>
        /// <param name="brokerName">The name of the broker making the estimate..</param>
        /// <param name="lastModifiedDate">The date at which a broker provided an estimate that is a revision..</param>
        /// <param name="prevEstimateDate">Date the previous estimate was made expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).</param>
        /// <param name="prevEstimateValue">The value of the previous estimate..</param>
        /// <param name="section">Section of the estimate.Returns the details of brokers inlcuded and excluded in the consensus.</param>
        /// <param name="statusCode">Status code of the estimate..</param>
        /// <param name="statusText">Status description of the estimate..</param>
        /// <param name="requestId">Identifier that was used for the request..</param>
        /// <param name="inputDateTime">Date and time when the data is available at the source..</param>
        /// <param name="securityCurrency">The currency that the company trades in..</param>
        /// <param name="brokerEstimateCurrency">The currency in which estimates are made by broker..</param>
        /// <param name="estimateCurrency">Estimate currency of the requested Security.</param>
        public DetailEstimate(string fsymId = default(string), string metric = default(string), string periodicity = default(string), int? fiscalYear = default(int?), int? fiscalPeriod = default(int?), DateTime? fiscalEndDate = default(DateTime?), int? relativePeriod = default(int?), string currency = default(string), DateTime? estimateDate = default(DateTime?), double? estimateValue = default(double?), string analystId = default(string), string analystName = default(string), string brokerId = default(string), string brokerName = default(string), DateTime? lastModifiedDate = default(DateTime?), DateTime? prevEstimateDate = default(DateTime?), double? prevEstimateValue = default(double?), string section = default(string), int? statusCode = default(int?), string statusText = default(string), string requestId = default(string), string inputDateTime = default(string), string securityCurrency = default(string), string brokerEstimateCurrency = default(string), string estimateCurrency = default(string))
        {
            this.FsymId = fsymId;
            this.Metric = metric;
            this.Periodicity = periodicity;
            this.FiscalYear = fiscalYear;
            this.FiscalPeriod = fiscalPeriod;
            this.FiscalEndDate = fiscalEndDate;
            this.RelativePeriod = relativePeriod;
            this.Currency = currency;
            this.EstimateDate = estimateDate;
            this.EstimateValue = estimateValue;
            this.AnalystId = analystId;
            this.AnalystName = analystName;
            this.BrokerId = brokerId;
            this.BrokerName = brokerName;
            this.LastModifiedDate = lastModifiedDate;
            this.PrevEstimateDate = prevEstimateDate;
            this.PrevEstimateValue = prevEstimateValue;
            this.Section = section;
            this.StatusCode = statusCode;
            this.StatusText = statusText;
            this.RequestId = requestId;
            this.InputDateTime = inputDateTime;
            this.SecurityCurrency = securityCurrency;
            this.BrokerEstimateCurrency = brokerEstimateCurrency;
            this.EstimateCurrency = estimateCurrency;
        }

        /// <summary>
        /// Gets or Sets FsymId
        /// </summary>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
        /// </summary>
        /// <value>Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).</value>
        [DataMember(Name = "metric", EmitDefaultValue = true)]
        public string Metric { get; set; }

        /// <summary>
        /// Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods.
        /// </summary>
        /// <value>Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods.</value>
        [DataMember(Name = "periodicity", EmitDefaultValue = true)]
        public string Periodicity { get; set; }

        /// <summary>
        /// Company&#39;s &#39;fiscal year&#39; for the estimate record
        /// </summary>
        /// <value>Company&#39;s &#39;fiscal year&#39; for the estimate record</value>
        [DataMember(Name = "fiscalYear", EmitDefaultValue = true)]
        public int? FiscalYear { get; set; }

        /// <summary>
        /// Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period.
        /// </summary>
        /// <value>Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period.</value>
        [DataMember(Name = "fiscalPeriod", EmitDefaultValue = true)]
        public int? FiscalPeriod { get; set; }

        /// <summary>
        /// Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format
        /// </summary>
        /// <value>Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format</value>
        [DataMember(Name = "fiscalEndDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? FiscalEndDate { get; set; }

        /// <summary>
        /// &#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
        /// </summary>
        /// <value>&#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)</value>
        [DataMember(Name = "relativePeriod", EmitDefaultValue = true)]
        public int? RelativePeriod { get; set; }

        /// <summary>
        /// Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
        /// </summary>
        /// <value>Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)</value>
        [DataMember(Name = "estimateDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? EstimateDate { get; set; }

        /// <summary>
        /// The value of the estimate.
        /// </summary>
        /// <value>The value of the estimate.</value>
        [DataMember(Name = "estimateValue", EmitDefaultValue = true)]
        public double? EstimateValue { get; set; }

        /// <summary>
        /// The FactSet Entity Identifier for the analyst making the estimate.
        /// </summary>
        /// <value>The FactSet Entity Identifier for the analyst making the estimate.</value>
        [DataMember(Name = "analystId", EmitDefaultValue = true)]
        public string AnalystId { get; set; }

        /// <summary>
        /// The name of the analyst making the estimate.
        /// </summary>
        /// <value>The name of the analyst making the estimate.</value>
        [DataMember(Name = "analystName", EmitDefaultValue = true)]
        public string AnalystName { get; set; }

        /// <summary>
        /// The FactSet Entity Identifier for the broker making the estimate.
        /// </summary>
        /// <value>The FactSet Entity Identifier for the broker making the estimate.</value>
        [DataMember(Name = "brokerId", EmitDefaultValue = true)]
        public string BrokerId { get; set; }

        /// <summary>
        /// The name of the broker making the estimate.
        /// </summary>
        /// <value>The name of the broker making the estimate.</value>
        [DataMember(Name = "brokerName", EmitDefaultValue = true)]
        public string BrokerName { get; set; }

        /// <summary>
        /// The date at which a broker provided an estimate that is a revision.
        /// </summary>
        /// <value>The date at which a broker provided an estimate that is a revision.</value>
        [DataMember(Name = "lastModifiedDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? LastModifiedDate { get; set; }

        /// <summary>
        /// Date the previous estimate was made expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
        /// </summary>
        /// <value>Date the previous estimate was made expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)</value>
        [DataMember(Name = "prevEstimateDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? PrevEstimateDate { get; set; }

        /// <summary>
        /// The value of the previous estimate.
        /// </summary>
        /// <value>The value of the previous estimate.</value>
        [DataMember(Name = "prevEstimateValue", EmitDefaultValue = true)]
        public double? PrevEstimateValue { get; set; }

        /// <summary>
        /// Section of the estimate.Returns the details of brokers inlcuded and excluded in the consensus
        /// </summary>
        /// <value>Section of the estimate.Returns the details of brokers inlcuded and excluded in the consensus</value>
        [DataMember(Name = "section", EmitDefaultValue = true)]
        public string Section { get; set; }

        /// <summary>
        /// Status code of the estimate.
        /// </summary>
        /// <value>Status code of the estimate.</value>
        [DataMember(Name = "statusCode", EmitDefaultValue = true)]
        public int? StatusCode { get; set; }

        /// <summary>
        /// Status description of the estimate.
        /// </summary>
        /// <value>Status description of the estimate.</value>
        [DataMember(Name = "statusText", EmitDefaultValue = true)]
        public string StatusText { get; set; }

        /// <summary>
        /// Identifier that was used for the request.
        /// </summary>
        /// <value>Identifier that was used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Date and time when the data is available at the source.
        /// </summary>
        /// <value>Date and time when the data is available at the source.</value>
        [DataMember(Name = "inputDateTime", EmitDefaultValue = true)]
        public string InputDateTime { get; set; }

        /// <summary>
        /// The currency that the company trades in.
        /// </summary>
        /// <value>The currency that the company trades in.</value>
        [DataMember(Name = "securityCurrency", EmitDefaultValue = true)]
        public string SecurityCurrency { get; set; }

        /// <summary>
        /// The currency in which estimates are made by broker.
        /// </summary>
        /// <value>The currency in which estimates are made by broker.</value>
        [DataMember(Name = "brokerEstimateCurrency", EmitDefaultValue = true)]
        public string BrokerEstimateCurrency { get; set; }

        /// <summary>
        /// Estimate currency of the requested Security
        /// </summary>
        /// <value>Estimate currency of the requested Security</value>
        [DataMember(Name = "estimateCurrency", EmitDefaultValue = true)]
        public string EstimateCurrency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DetailEstimate {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Metric: ").Append(Metric).Append("\n");
            sb.Append("  Periodicity: ").Append(Periodicity).Append("\n");
            sb.Append("  FiscalYear: ").Append(FiscalYear).Append("\n");
            sb.Append("  FiscalPeriod: ").Append(FiscalPeriod).Append("\n");
            sb.Append("  FiscalEndDate: ").Append(FiscalEndDate).Append("\n");
            sb.Append("  RelativePeriod: ").Append(RelativePeriod).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  EstimateDate: ").Append(EstimateDate).Append("\n");
            sb.Append("  EstimateValue: ").Append(EstimateValue).Append("\n");
            sb.Append("  AnalystId: ").Append(AnalystId).Append("\n");
            sb.Append("  AnalystName: ").Append(AnalystName).Append("\n");
            sb.Append("  BrokerId: ").Append(BrokerId).Append("\n");
            sb.Append("  BrokerName: ").Append(BrokerName).Append("\n");
            sb.Append("  LastModifiedDate: ").Append(LastModifiedDate).Append("\n");
            sb.Append("  PrevEstimateDate: ").Append(PrevEstimateDate).Append("\n");
            sb.Append("  PrevEstimateValue: ").Append(PrevEstimateValue).Append("\n");
            sb.Append("  Section: ").Append(Section).Append("\n");
            sb.Append("  StatusCode: ").Append(StatusCode).Append("\n");
            sb.Append("  StatusText: ").Append(StatusText).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  InputDateTime: ").Append(InputDateTime).Append("\n");
            sb.Append("  SecurityCurrency: ").Append(SecurityCurrency).Append("\n");
            sb.Append("  BrokerEstimateCurrency: ").Append(BrokerEstimateCurrency).Append("\n");
            sb.Append("  EstimateCurrency: ").Append(EstimateCurrency).Append("\n");
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
            return this.Equals(input as DetailEstimate);
        }

        /// <summary>
        /// Returns true if DetailEstimate instances are equal
        /// </summary>
        /// <param name="input">Instance of DetailEstimate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DetailEstimate input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Metric == input.Metric ||
                    (this.Metric != null &&
                    this.Metric.Equals(input.Metric))
                ) && 
                (
                    this.Periodicity == input.Periodicity ||
                    (this.Periodicity != null &&
                    this.Periodicity.Equals(input.Periodicity))
                ) && 
                (
                    this.FiscalYear == input.FiscalYear ||
                    (this.FiscalYear != null &&
                    this.FiscalYear.Equals(input.FiscalYear))
                ) && 
                (
                    this.FiscalPeriod == input.FiscalPeriod ||
                    (this.FiscalPeriod != null &&
                    this.FiscalPeriod.Equals(input.FiscalPeriod))
                ) && 
                (
                    this.FiscalEndDate == input.FiscalEndDate ||
                    (this.FiscalEndDate != null &&
                    this.FiscalEndDate.Equals(input.FiscalEndDate))
                ) && 
                (
                    this.RelativePeriod == input.RelativePeriod ||
                    (this.RelativePeriod != null &&
                    this.RelativePeriod.Equals(input.RelativePeriod))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.EstimateDate == input.EstimateDate ||
                    (this.EstimateDate != null &&
                    this.EstimateDate.Equals(input.EstimateDate))
                ) && 
                (
                    this.EstimateValue == input.EstimateValue ||
                    (this.EstimateValue != null &&
                    this.EstimateValue.Equals(input.EstimateValue))
                ) && 
                (
                    this.AnalystId == input.AnalystId ||
                    (this.AnalystId != null &&
                    this.AnalystId.Equals(input.AnalystId))
                ) && 
                (
                    this.AnalystName == input.AnalystName ||
                    (this.AnalystName != null &&
                    this.AnalystName.Equals(input.AnalystName))
                ) && 
                (
                    this.BrokerId == input.BrokerId ||
                    (this.BrokerId != null &&
                    this.BrokerId.Equals(input.BrokerId))
                ) && 
                (
                    this.BrokerName == input.BrokerName ||
                    (this.BrokerName != null &&
                    this.BrokerName.Equals(input.BrokerName))
                ) && 
                (
                    this.LastModifiedDate == input.LastModifiedDate ||
                    (this.LastModifiedDate != null &&
                    this.LastModifiedDate.Equals(input.LastModifiedDate))
                ) && 
                (
                    this.PrevEstimateDate == input.PrevEstimateDate ||
                    (this.PrevEstimateDate != null &&
                    this.PrevEstimateDate.Equals(input.PrevEstimateDate))
                ) && 
                (
                    this.PrevEstimateValue == input.PrevEstimateValue ||
                    (this.PrevEstimateValue != null &&
                    this.PrevEstimateValue.Equals(input.PrevEstimateValue))
                ) && 
                (
                    this.Section == input.Section ||
                    (this.Section != null &&
                    this.Section.Equals(input.Section))
                ) && 
                (
                    this.StatusCode == input.StatusCode ||
                    (this.StatusCode != null &&
                    this.StatusCode.Equals(input.StatusCode))
                ) && 
                (
                    this.StatusText == input.StatusText ||
                    (this.StatusText != null &&
                    this.StatusText.Equals(input.StatusText))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.InputDateTime == input.InputDateTime ||
                    (this.InputDateTime != null &&
                    this.InputDateTime.Equals(input.InputDateTime))
                ) && 
                (
                    this.SecurityCurrency == input.SecurityCurrency ||
                    (this.SecurityCurrency != null &&
                    this.SecurityCurrency.Equals(input.SecurityCurrency))
                ) && 
                (
                    this.BrokerEstimateCurrency == input.BrokerEstimateCurrency ||
                    (this.BrokerEstimateCurrency != null &&
                    this.BrokerEstimateCurrency.Equals(input.BrokerEstimateCurrency))
                ) && 
                (
                    this.EstimateCurrency == input.EstimateCurrency ||
                    (this.EstimateCurrency != null &&
                    this.EstimateCurrency.Equals(input.EstimateCurrency))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Metric != null)
                {
                    hashCode = (hashCode * 59) + this.Metric.GetHashCode();
                }
                if (this.Periodicity != null)
                {
                    hashCode = (hashCode * 59) + this.Periodicity.GetHashCode();
                }
                if (this.FiscalYear != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalYear.GetHashCode();
                }
                if (this.FiscalPeriod != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalPeriod.GetHashCode();
                }
                if (this.FiscalEndDate != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalEndDate.GetHashCode();
                }
                if (this.RelativePeriod != null)
                {
                    hashCode = (hashCode * 59) + this.RelativePeriod.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.EstimateDate != null)
                {
                    hashCode = (hashCode * 59) + this.EstimateDate.GetHashCode();
                }
                if (this.EstimateValue != null)
                {
                    hashCode = (hashCode * 59) + this.EstimateValue.GetHashCode();
                }
                if (this.AnalystId != null)
                {
                    hashCode = (hashCode * 59) + this.AnalystId.GetHashCode();
                }
                if (this.AnalystName != null)
                {
                    hashCode = (hashCode * 59) + this.AnalystName.GetHashCode();
                }
                if (this.BrokerId != null)
                {
                    hashCode = (hashCode * 59) + this.BrokerId.GetHashCode();
                }
                if (this.BrokerName != null)
                {
                    hashCode = (hashCode * 59) + this.BrokerName.GetHashCode();
                }
                if (this.LastModifiedDate != null)
                {
                    hashCode = (hashCode * 59) + this.LastModifiedDate.GetHashCode();
                }
                if (this.PrevEstimateDate != null)
                {
                    hashCode = (hashCode * 59) + this.PrevEstimateDate.GetHashCode();
                }
                if (this.PrevEstimateValue != null)
                {
                    hashCode = (hashCode * 59) + this.PrevEstimateValue.GetHashCode();
                }
                if (this.Section != null)
                {
                    hashCode = (hashCode * 59) + this.Section.GetHashCode();
                }
                if (this.StatusCode != null)
                {
                    hashCode = (hashCode * 59) + this.StatusCode.GetHashCode();
                }
                if (this.StatusText != null)
                {
                    hashCode = (hashCode * 59) + this.StatusText.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.InputDateTime != null)
                {
                    hashCode = (hashCode * 59) + this.InputDateTime.GetHashCode();
                }
                if (this.SecurityCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.SecurityCurrency.GetHashCode();
                }
                if (this.BrokerEstimateCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.BrokerEstimateCurrency.GetHashCode();
                }
                if (this.EstimateCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.EstimateCurrency.GetHashCode();
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
