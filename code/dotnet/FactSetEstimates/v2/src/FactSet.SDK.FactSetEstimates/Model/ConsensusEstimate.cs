/*
 * FactSet Estimates
 *
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.5.0
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
    /// ConsensusEstimate
    /// </summary>
    [DataContract(Name = "consensusEstimate")]
    public partial class ConsensusEstimate : IEquatable<ConsensusEstimate>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConsensusEstimate" /> class.
        /// </summary>
        /// <param name="requestId">Identifier that was used for the request..</param>
        /// <param name="fsymId">Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet..</param>
        /// <param name="metric">Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).</param>
        /// <param name="periodicity">The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List &#x3D; ANN, QTR, SEMI, LTMA, or NMTA..</param>
        /// <param name="fiscalPeriod">Company&#39;s &#39;fiscal period&#39; for the estimate record. Periods for periodicity of ANN &#x3D; 1, and SEMI &#x3D; 2. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)..</param>
        /// <param name="fiscalYear">Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).</param>
        /// <param name="fiscalEndDate">Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).</param>
        /// <param name="relativePeriod">&#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).</param>
        /// <param name="estimateDate">Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).</param>
        /// <param name="currency">Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="estimateCurrency">Estimate currency of the requested Security.</param>
        /// <param name="mean">Mean of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).</param>
        /// <param name="median">Median of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).</param>
        /// <param name="standardDeviation">Standard deviation of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).</param>
        /// <param name="high">Highest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)..</param>
        /// <param name="low">Lowest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).</param>
        /// <param name="estimateCount">Count or NEST of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).</param>
        /// <param name="up">Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)..</param>
        /// <param name="down">Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)..</param>
        public ConsensusEstimate(string requestId = default(string), string fsymId = default(string), string metric = default(string), string periodicity = default(string), int? fiscalPeriod = default(int?), int? fiscalYear = default(int?), DateTime? fiscalEndDate = default(DateTime?), int? relativePeriod = default(int?), DateTime? estimateDate = default(DateTime?), string currency = default(string), string estimateCurrency = default(string), double? mean = default(double?), double? median = default(double?), double? standardDeviation = default(double?), double? high = default(double?), double? low = default(double?), int? estimateCount = default(int?), int? up = default(int?), int? down = default(int?))
        {
            this.RequestId = requestId;
            this.FsymId = fsymId;
            this.Metric = metric;
            this.Periodicity = periodicity;
            this.FiscalPeriod = fiscalPeriod;
            this.FiscalYear = fiscalYear;
            this.FiscalEndDate = fiscalEndDate;
            this.RelativePeriod = relativePeriod;
            this.EstimateDate = estimateDate;
            this.Currency = currency;
            this.EstimateCurrency = estimateCurrency;
            this.Mean = mean;
            this.Median = median;
            this.StandardDeviation = standardDeviation;
            this.High = high;
            this.Low = low;
            this.EstimateCount = estimateCount;
            this.Up = up;
            this.Down = down;
        }

        /// <summary>
        /// Identifier that was used for the request.
        /// </summary>
        /// <value>Identifier that was used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
        /// </summary>
        /// <value>Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034)
        /// </summary>
        /// <value>Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034)</value>
        [DataMember(Name = "metric", EmitDefaultValue = true)]
        public string Metric { get; set; }

        /// <summary>
        /// The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List &#x3D; ANN, QTR, SEMI, LTMA, or NMTA.
        /// </summary>
        /// <value>The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List &#x3D; ANN, QTR, SEMI, LTMA, or NMTA.</value>
        [DataMember(Name = "periodicity", EmitDefaultValue = true)]
        public string Periodicity { get; set; }

        /// <summary>
        /// Company&#39;s &#39;fiscal period&#39; for the estimate record. Periods for periodicity of ANN &#x3D; 1, and SEMI &#x3D; 2. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).
        /// </summary>
        /// <value>Company&#39;s &#39;fiscal period&#39; for the estimate record. Periods for periodicity of ANN &#x3D; 1, and SEMI &#x3D; 2. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).</value>
        [DataMember(Name = "fiscalPeriod", EmitDefaultValue = true)]
        public int? FiscalPeriod { get; set; }

        /// <summary>
        /// Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
        /// </summary>
        /// <value>Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)</value>
        [DataMember(Name = "fiscalYear", EmitDefaultValue = true)]
        public int? FiscalYear { get; set; }

        /// <summary>
        /// Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
        /// </summary>
        /// <value>Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)</value>
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
        /// Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
        /// </summary>
        /// <value>Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)</value>
        [DataMember(Name = "estimateDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? EstimateDate { get; set; }

        /// <summary>
        /// Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Estimate currency of the requested Security
        /// </summary>
        /// <value>Estimate currency of the requested Security</value>
        [DataMember(Name = "estimateCurrency", EmitDefaultValue = true)]
        public string EstimateCurrency { get; set; }

        /// <summary>
        /// Mean of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
        /// </summary>
        /// <value>Mean of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)</value>
        [DataMember(Name = "mean", EmitDefaultValue = true)]
        public double? Mean { get; set; }

        /// <summary>
        /// Median of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
        /// </summary>
        /// <value>Median of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)</value>
        [DataMember(Name = "median", EmitDefaultValue = true)]
        public double? Median { get; set; }

        /// <summary>
        /// Standard deviation of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
        /// </summary>
        /// <value>Standard deviation of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)</value>
        [DataMember(Name = "standardDeviation", EmitDefaultValue = true)]
        public double? StandardDeviation { get; set; }

        /// <summary>
        /// Highest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).
        /// </summary>
        /// <value>Highest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).</value>
        [DataMember(Name = "high", EmitDefaultValue = true)]
        public double? High { get; set; }

        /// <summary>
        /// Lowest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
        /// </summary>
        /// <value>Lowest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)</value>
        [DataMember(Name = "low", EmitDefaultValue = true)]
        public double? Low { get; set; }

        /// <summary>
        /// Count or NEST of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
        /// </summary>
        /// <value>Count or NEST of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)</value>
        [DataMember(Name = "estimateCount", EmitDefaultValue = true)]
        public int? EstimateCount { get; set; }

        /// <summary>
        /// Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).
        /// </summary>
        /// <value>Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).</value>
        [DataMember(Name = "up", EmitDefaultValue = true)]
        public int? Up { get; set; }

        /// <summary>
        /// Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).
        /// </summary>
        /// <value>Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).</value>
        [DataMember(Name = "down", EmitDefaultValue = true)]
        public int? Down { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ConsensusEstimate {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Metric: ").Append(Metric).Append("\n");
            sb.Append("  Periodicity: ").Append(Periodicity).Append("\n");
            sb.Append("  FiscalPeriod: ").Append(FiscalPeriod).Append("\n");
            sb.Append("  FiscalYear: ").Append(FiscalYear).Append("\n");
            sb.Append("  FiscalEndDate: ").Append(FiscalEndDate).Append("\n");
            sb.Append("  RelativePeriod: ").Append(RelativePeriod).Append("\n");
            sb.Append("  EstimateDate: ").Append(EstimateDate).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  EstimateCurrency: ").Append(EstimateCurrency).Append("\n");
            sb.Append("  Mean: ").Append(Mean).Append("\n");
            sb.Append("  Median: ").Append(Median).Append("\n");
            sb.Append("  StandardDeviation: ").Append(StandardDeviation).Append("\n");
            sb.Append("  High: ").Append(High).Append("\n");
            sb.Append("  Low: ").Append(Low).Append("\n");
            sb.Append("  EstimateCount: ").Append(EstimateCount).Append("\n");
            sb.Append("  Up: ").Append(Up).Append("\n");
            sb.Append("  Down: ").Append(Down).Append("\n");
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
            return this.Equals(input as ConsensusEstimate);
        }

        /// <summary>
        /// Returns true if ConsensusEstimate instances are equal
        /// </summary>
        /// <param name="input">Instance of ConsensusEstimate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConsensusEstimate input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
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
                    this.FiscalPeriod == input.FiscalPeriod ||
                    (this.FiscalPeriod != null &&
                    this.FiscalPeriod.Equals(input.FiscalPeriod))
                ) && 
                (
                    this.FiscalYear == input.FiscalYear ||
                    (this.FiscalYear != null &&
                    this.FiscalYear.Equals(input.FiscalYear))
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
                    this.EstimateDate == input.EstimateDate ||
                    (this.EstimateDate != null &&
                    this.EstimateDate.Equals(input.EstimateDate))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.EstimateCurrency == input.EstimateCurrency ||
                    (this.EstimateCurrency != null &&
                    this.EstimateCurrency.Equals(input.EstimateCurrency))
                ) && 
                (
                    this.Mean == input.Mean ||
                    (this.Mean != null &&
                    this.Mean.Equals(input.Mean))
                ) && 
                (
                    this.Median == input.Median ||
                    (this.Median != null &&
                    this.Median.Equals(input.Median))
                ) && 
                (
                    this.StandardDeviation == input.StandardDeviation ||
                    (this.StandardDeviation != null &&
                    this.StandardDeviation.Equals(input.StandardDeviation))
                ) && 
                (
                    this.High == input.High ||
                    (this.High != null &&
                    this.High.Equals(input.High))
                ) && 
                (
                    this.Low == input.Low ||
                    (this.Low != null &&
                    this.Low.Equals(input.Low))
                ) && 
                (
                    this.EstimateCount == input.EstimateCount ||
                    (this.EstimateCount != null &&
                    this.EstimateCount.Equals(input.EstimateCount))
                ) && 
                (
                    this.Up == input.Up ||
                    (this.Up != null &&
                    this.Up.Equals(input.Up))
                ) && 
                (
                    this.Down == input.Down ||
                    (this.Down != null &&
                    this.Down.Equals(input.Down))
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
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
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
                if (this.FiscalPeriod != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalPeriod.GetHashCode();
                }
                if (this.FiscalYear != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalYear.GetHashCode();
                }
                if (this.FiscalEndDate != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalEndDate.GetHashCode();
                }
                if (this.RelativePeriod != null)
                {
                    hashCode = (hashCode * 59) + this.RelativePeriod.GetHashCode();
                }
                if (this.EstimateDate != null)
                {
                    hashCode = (hashCode * 59) + this.EstimateDate.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.EstimateCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.EstimateCurrency.GetHashCode();
                }
                if (this.Mean != null)
                {
                    hashCode = (hashCode * 59) + this.Mean.GetHashCode();
                }
                if (this.Median != null)
                {
                    hashCode = (hashCode * 59) + this.Median.GetHashCode();
                }
                if (this.StandardDeviation != null)
                {
                    hashCode = (hashCode * 59) + this.StandardDeviation.GetHashCode();
                }
                if (this.High != null)
                {
                    hashCode = (hashCode * 59) + this.High.GetHashCode();
                }
                if (this.Low != null)
                {
                    hashCode = (hashCode * 59) + this.Low.GetHashCode();
                }
                if (this.EstimateCount != null)
                {
                    hashCode = (hashCode * 59) + this.EstimateCount.GetHashCode();
                }
                if (this.Up != null)
                {
                    hashCode = (hashCode * 59) + this.Up.GetHashCode();
                }
                if (this.Down != null)
                {
                    hashCode = (hashCode * 59) + this.Down.GetHashCode();
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
