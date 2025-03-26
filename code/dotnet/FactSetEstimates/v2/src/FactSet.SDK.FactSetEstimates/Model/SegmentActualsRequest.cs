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
    /// Request object for requesting segment actuals.
    /// </summary>
    [DataContract(Name = "segmentActualsRequest")]
    public partial class SegmentActualsRequest : IEquatable<SegmentActualsRequest>, IValidatableObject
    {
        /// <summary>
        /// Defines Metrics
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MetricsEnum
        {
            /// <summary>
            /// Enum ASP for value: ASP
            /// </summary>
            [EnumMember(Value = "ASP")]
            ASP = 1,

            /// <summary>
            /// Enum ARR for value: ARR
            /// </summary>
            [EnumMember(Value = "ARR")]
            ARR = 2,

            /// <summary>
            /// Enum CAPEX for value: CAPEX
            /// </summary>
            [EnumMember(Value = "CAPEX")]
            CAPEX = 3,

            /// <summary>
            /// Enum CCURGRTH for value: CCUR_GRTH
            /// </summary>
            [EnumMember(Value = "CCUR_GRTH")]
            CCURGRTH = 4,

            /// <summary>
            /// Enum COS for value: COS
            /// </summary>
            [EnumMember(Value = "COS")]
            COS = 5,

            /// <summary>
            /// Enum CFOGAAP for value: CFO_GAAP
            /// </summary>
            [EnumMember(Value = "CFO_GAAP")]
            CFOGAAP = 6,

            /// <summary>
            /// Enum DELIVERIESUNITS for value: DELIVERIES_UNITS
            /// </summary>
            [EnumMember(Value = "DELIVERIES_UNITS")]
            DELIVERIESUNITS = 7,

            /// <summary>
            /// Enum EPS for value: EPS
            /// </summary>
            [EnumMember(Value = "EPS")]
            EPS = 8,

            /// <summary>
            /// Enum EBIT for value: EBIT
            /// </summary>
            [EnumMember(Value = "EBIT")]
            EBIT = 9,

            /// <summary>
            /// Enum EBITREP for value: EBIT_REP
            /// </summary>
            [EnumMember(Value = "EBIT_REP")]
            EBITREP = 10,

            /// <summary>
            /// Enum EBITDA for value: EBITDA
            /// </summary>
            [EnumMember(Value = "EBITDA")]
            EBITDA = 11,

            /// <summary>
            /// Enum EBITDAREP for value: EBITDA_REP
            /// </summary>
            [EnumMember(Value = "EBITDA_REP")]
            EBITDAREP = 12,

            /// <summary>
            /// Enum GAEXP for value: G_A_EXP
            /// </summary>
            [EnumMember(Value = "G_A_EXP")]
            GAEXP = 13,

            /// <summary>
            /// Enum GROSSINC for value: GROSS_INC
            /// </summary>
            [EnumMember(Value = "GROSS_INC")]
            GROSSINC = 14,

            /// <summary>
            /// Enum GMV for value: GMV
            /// </summary>
            [EnumMember(Value = "GMV")]
            GMV = 15,

            /// <summary>
            /// Enum LCURGRTH for value: LCUR_GRTH
            /// </summary>
            [EnumMember(Value = "LCUR_GRTH")]
            LCURGRTH = 16,

            /// <summary>
            /// Enum NETADDS for value: NET_ADDS
            /// </summary>
            [EnumMember(Value = "NET_ADDS")]
            NETADDS = 17,

            /// <summary>
            /// Enum NETINC for value: NET_INC
            /// </summary>
            [EnumMember(Value = "NET_INC")]
            NETINC = 18,

            /// <summary>
            /// Enum NETSALES for value: NET_SALES
            /// </summary>
            [EnumMember(Value = "NET_SALES")]
            NETSALES = 19,

            /// <summary>
            /// Enum SUBSCRIBERSNB for value: SUBSCRIBERS_NB
            /// </summary>
            [EnumMember(Value = "SUBSCRIBERS_NB")]
            SUBSCRIBERSNB = 20,

            /// <summary>
            /// Enum ORGANICGROWTH for value: ORGANICGROWTH
            /// </summary>
            [EnumMember(Value = "ORGANICGROWTH")]
            ORGANICGROWTH = 21,

            /// <summary>
            /// Enum PTXINC for value: PTX_INC
            /// </summary>
            [EnumMember(Value = "PTX_INC")]
            PTXINC = 22,

            /// <summary>
            /// Enum RATEBASE for value: RATEBASE
            /// </summary>
            [EnumMember(Value = "RATEBASE")]
            RATEBASE = 23,

            /// <summary>
            /// Enum AVGRATEBASE for value: AVGRATEBASE
            /// </summary>
            [EnumMember(Value = "AVGRATEBASE")]
            AVGRATEBASE = 24,

            /// <summary>
            /// Enum SALES for value: SALES
            /// </summary>
            [EnumMember(Value = "SALES")]
            SALES = 25,

            /// <summary>
            /// Enum SAMESTORESALES for value: SAMESTORESALES
            /// </summary>
            [EnumMember(Value = "SAMESTORESALES")]
            SAMESTORESALES = 26,

            /// <summary>
            /// Enum SGA for value: SGA
            /// </summary>
            [EnumMember(Value = "SGA")]
            SGA = 27,

            /// <summary>
            /// Enum SMEXP for value: S_M_EXP
            /// </summary>
            [EnumMember(Value = "S_M_EXP")]
            SMEXP = 28,

            /// <summary>
            /// Enum REVTOT for value: REV_TOT
            /// </summary>
            [EnumMember(Value = "REV_TOT")]
            REVTOT = 29,

            /// <summary>
            /// Enum UNITS for value: UNITS
            /// </summary>
            [EnumMember(Value = "UNITS")]
            UNITS = 30,

            /// <summary>
            /// Enum NEWORDERSVALUE for value: NEW_ORDERS_VALUE
            /// </summary>
            [EnumMember(Value = "NEW_ORDERS_VALUE")]
            NEWORDERSVALUE = 31,

            /// <summary>
            /// Enum BACKLOGVALUE for value: BACKLOG_VALUE
            /// </summary>
            [EnumMember(Value = "BACKLOG_VALUE")]
            BACKLOGVALUE = 32,

            /// <summary>
            /// Enum MCR for value: MCR
            /// </summary>
            [EnumMember(Value = "MCR")]
            MCR = 33,

            /// <summary>
            /// Enum CASHCOST for value: CASH_COST
            /// </summary>
            [EnumMember(Value = "CASH_COST")]
            CASHCOST = 34,

            /// <summary>
            /// Enum REALPRICE for value: REAL_PRICE
            /// </summary>
            [EnumMember(Value = "REAL_PRICE")]
            REALPRICE = 35,

            /// <summary>
            /// Enum DAU for value: DAU
            /// </summary>
            [EnumMember(Value = "DAU")]
            DAU = 36,

            /// <summary>
            /// Enum ARPU for value: ARPU
            /// </summary>
            [EnumMember(Value = "ARPU")]
            ARPU = 37,

            /// <summary>
            /// Enum CONTRPROF for value: CONTR_PROF
            /// </summary>
            [EnumMember(Value = "CONTR_PROF")]
            CONTRPROF = 38,

            /// <summary>
            /// Enum PAIDNADDS for value: PAIDNADDS
            /// </summary>
            [EnumMember(Value = "PAIDNADDS")]
            PAIDNADDS = 39

        }



        /// <summary>
        /// Requested metrics for segment actuals. An asterisk denotes metric items included for geographic segments. Note, the number of metrics you   are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  &lt;h3&gt;Financial Metrics&lt;/h3&gt; |field|description| |- --|- --| |ASP|Average Selling Price| |ARR|Annual Recurring Revenue| |CAPEX|Capital Expenditures| |CCUR_GRTH*|Constant Currency Revenue Growth*| |COS*|Cost of Sales*| |CFO_GAAP|Chief Financial Officer (GAAP)| |DELIVERIES_UNITS|Deliveries Units| |EPS|Earnings Per Share| |EBIT*|Earnings Before Interest and Taxes*| |EBIT_REP|Earnings Before Interest and Taxes - Reported| |EBITDA*|Earnings Before Interest, Taxes, Depreciation, and Amortization*| |EBITDA_REP|Earnings Before Interest, Taxes, Depreciation, and Amortization - Reported| |G_A_EXP|General &amp; Admin Expense| |GROSS_INC*|Gross Income*| |GMV*|Gross Merchandise Volume*| |LCUR_GRTH*|Local Currency Revenue Growth*| |NET_ADDS|Net Adds| |NET_INC*|Net Profit*| |NET_SALES*|Net Sales*| |SUBSCRIBERS_NB*|Number of Subscribers*| |ORGANICGROWTH*|Organic Growth*| |PTX_INC|Pre-Tax Income| |RATEBASE*|Ratebase*| |AVGRATEBASE|Avg. Ratebase| |SALES*|Sales*| |SAMESTORESALES|Same Store Sales| |SGA|Selling, General &amp; Administrative Expenses| |S_M_EXP|Selling &amp; Marketing Expenses| |REV_TOT*|Total Revenues*|  &lt;h3&gt;Industry Metrics&lt;/h3&gt; |field|description| |- --|- --| |UNITS|Units| |NEW_ORDERS_VALUE*|Home Builders - New Orders Value*| |BACKLOG_VALUE|Home Builders - Backlog Value| |MCR|Hospitals - Medical Cost Ratio (%)| |CASH_COST|Mining - Cash Cost| |REAL_PRICE|Mining - Real Price| |DAU*|Social Media/Games - Daily Active Users*| |ARPU|Telecoms - Average Revenue Per User (ARPU)| |CONTR_PROF|Telecoms - Contribution Profit| |PAIDNADDS|Telecoms - Paid Net Adds| 
        /// </summary>
        /// <value>Requested metrics for segment actuals. An asterisk denotes metric items included for geographic segments. Note, the number of metrics you   are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  &lt;h3&gt;Financial Metrics&lt;/h3&gt; |field|description| |- --|- --| |ASP|Average Selling Price| |ARR|Annual Recurring Revenue| |CAPEX|Capital Expenditures| |CCUR_GRTH*|Constant Currency Revenue Growth*| |COS*|Cost of Sales*| |CFO_GAAP|Chief Financial Officer (GAAP)| |DELIVERIES_UNITS|Deliveries Units| |EPS|Earnings Per Share| |EBIT*|Earnings Before Interest and Taxes*| |EBIT_REP|Earnings Before Interest and Taxes - Reported| |EBITDA*|Earnings Before Interest, Taxes, Depreciation, and Amortization*| |EBITDA_REP|Earnings Before Interest, Taxes, Depreciation, and Amortization - Reported| |G_A_EXP|General &amp; Admin Expense| |GROSS_INC*|Gross Income*| |GMV*|Gross Merchandise Volume*| |LCUR_GRTH*|Local Currency Revenue Growth*| |NET_ADDS|Net Adds| |NET_INC*|Net Profit*| |NET_SALES*|Net Sales*| |SUBSCRIBERS_NB*|Number of Subscribers*| |ORGANICGROWTH*|Organic Growth*| |PTX_INC|Pre-Tax Income| |RATEBASE*|Ratebase*| |AVGRATEBASE|Avg. Ratebase| |SALES*|Sales*| |SAMESTORESALES|Same Store Sales| |SGA|Selling, General &amp; Administrative Expenses| |S_M_EXP|Selling &amp; Marketing Expenses| |REV_TOT*|Total Revenues*|  &lt;h3&gt;Industry Metrics&lt;/h3&gt; |field|description| |- --|- --| |UNITS|Units| |NEW_ORDERS_VALUE*|Home Builders - New Orders Value*| |BACKLOG_VALUE|Home Builders - Backlog Value| |MCR|Hospitals - Medical Cost Ratio (%)| |CASH_COST|Mining - Cash Cost| |REAL_PRICE|Mining - Real Price| |DAU*|Social Media/Games - Daily Active Users*| |ARPU|Telecoms - Average Revenue Per User (ARPU)| |CONTR_PROF|Telecoms - Contribution Profit| |PAIDNADDS|Telecoms - Paid Net Adds| </value>
        [DataMember(Name = "metrics", IsRequired = true, EmitDefaultValue = false)]
        public List<MetricsEnum> Metrics { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SegmentActualsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SegmentActualsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SegmentActualsRequest" /> class.
        /// </summary>
        /// <param name="ids">The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  (required).</param>
        /// <param name="metrics">Requested metrics for segment actuals. An asterisk denotes metric items included for geographic segments. Note, the number of metrics you   are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  &lt;h3&gt;Financial Metrics&lt;/h3&gt; |field|description| |- --|- --| |ASP|Average Selling Price| |ARR|Annual Recurring Revenue| |CAPEX|Capital Expenditures| |CCUR_GRTH*|Constant Currency Revenue Growth*| |COS*|Cost of Sales*| |CFO_GAAP|Chief Financial Officer (GAAP)| |DELIVERIES_UNITS|Deliveries Units| |EPS|Earnings Per Share| |EBIT*|Earnings Before Interest and Taxes*| |EBIT_REP|Earnings Before Interest and Taxes - Reported| |EBITDA*|Earnings Before Interest, Taxes, Depreciation, and Amortization*| |EBITDA_REP|Earnings Before Interest, Taxes, Depreciation, and Amortization - Reported| |G_A_EXP|General &amp; Admin Expense| |GROSS_INC*|Gross Income*| |GMV*|Gross Merchandise Volume*| |LCUR_GRTH*|Local Currency Revenue Growth*| |NET_ADDS|Net Adds| |NET_INC*|Net Profit*| |NET_SALES*|Net Sales*| |SUBSCRIBERS_NB*|Number of Subscribers*| |ORGANICGROWTH*|Organic Growth*| |PTX_INC|Pre-Tax Income| |RATEBASE*|Ratebase*| |AVGRATEBASE|Avg. Ratebase| |SALES*|Sales*| |SAMESTORESALES|Same Store Sales| |SGA|Selling, General &amp; Administrative Expenses| |S_M_EXP|Selling &amp; Marketing Expenses| |REV_TOT*|Total Revenues*|  &lt;h3&gt;Industry Metrics&lt;/h3&gt; |field|description| |- --|- --| |UNITS|Units| |NEW_ORDERS_VALUE*|Home Builders - New Orders Value*| |BACKLOG_VALUE|Home Builders - Backlog Value| |MCR|Hospitals - Medical Cost Ratio (%)| |CASH_COST|Mining - Cash Cost| |REAL_PRICE|Mining - Real Price| |DAU*|Social Media/Games - Daily Active Users*| |ARPU|Telecoms - Average Revenue Per User (ARPU)| |CONTR_PROF|Telecoms - Contribution Profit| |PAIDNADDS|Telecoms - Paid Net Adds|  (required).</param>
        /// <param name="segmentType">segmentType.</param>
        /// <param name="relativeFiscalStart">Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for &#x60;relativeFiscalStart&#x60; must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0)..</param>
        /// <param name="relativeFiscalEnd">Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for &#x60;relativeFiscalEnd&#x60; must be an integer that is zero or less. For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2)..</param>
        /// <param name="periodicity">periodicity.</param>
        /// <param name="currency">Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        public SegmentActualsRequest(List<string> ids, List<MetricsEnum> metrics,SegmentType segmentType = default(SegmentType), int relativeFiscalStart = default(int), int relativeFiscalEnd = default(int), Periodicity periodicity = default(Periodicity), string currency = default(string))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for SegmentActualsRequest and cannot be null");
            }
            this.Ids = ids;
            // to ensure "metrics" is required (not null)
            if (metrics == null) {
                throw new ArgumentNullException("metrics is a required property for SegmentActualsRequest and cannot be null");
            }
            this.Metrics = metrics;
            this.SegmentType = segmentType;
            this.RelativeFiscalStart = relativeFiscalStart;
            this.RelativeFiscalEnd = relativeFiscalEnd;
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
        /// Gets or Sets SegmentType
        /// </summary>
        [DataMember(Name = "segmentType", EmitDefaultValue = false)]
        public SegmentType SegmentType { get; set; }

        /// <summary>
        /// Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for &#x60;relativeFiscalStart&#x60; must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0).
        /// </summary>
        /// <value>Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for &#x60;relativeFiscalStart&#x60; must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0).</value>
        [DataMember(Name = "relativeFiscalStart", EmitDefaultValue = false)]
        public int RelativeFiscalStart { get; set; }

        /// <summary>
        /// Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for &#x60;relativeFiscalEnd&#x60; must be an integer that is zero or less. For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2).
        /// </summary>
        /// <value>Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for &#x60;relativeFiscalEnd&#x60; must be an integer that is zero or less. For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2).</value>
        [DataMember(Name = "relativeFiscalEnd", EmitDefaultValue = false)]
        public int RelativeFiscalEnd { get; set; }

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
            sb.Append("class SegmentActualsRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Metrics: ").Append(Metrics).Append("\n");
            sb.Append("  SegmentType: ").Append(SegmentType).Append("\n");
            sb.Append("  RelativeFiscalStart: ").Append(RelativeFiscalStart).Append("\n");
            sb.Append("  RelativeFiscalEnd: ").Append(RelativeFiscalEnd).Append("\n");
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
            return this.Equals(input as SegmentActualsRequest);
        }

        /// <summary>
        /// Returns true if SegmentActualsRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of SegmentActualsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SegmentActualsRequest input)
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
                    this.Metrics.SequenceEqual(input.Metrics)
                ) && 
                (
                    this.SegmentType == input.SegmentType ||
                    (this.SegmentType != null &&
                    this.SegmentType.Equals(input.SegmentType))
                ) && 
                (
                    this.RelativeFiscalStart == input.RelativeFiscalStart ||
                    this.RelativeFiscalStart.Equals(input.RelativeFiscalStart)
                ) && 
                (
                    this.RelativeFiscalEnd == input.RelativeFiscalEnd ||
                    this.RelativeFiscalEnd.Equals(input.RelativeFiscalEnd)
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
                hashCode = (hashCode * 59) + this.Metrics.GetHashCode();
                if (this.SegmentType != null)
                {
                    hashCode = (hashCode * 59) + this.SegmentType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.RelativeFiscalStart.GetHashCode();
                hashCode = (hashCode * 59) + this.RelativeFiscalEnd.GetHashCode();
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
            // RelativeFiscalStart (int) maximum
            if (this.RelativeFiscalStart > (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RelativeFiscalStart, must be a value less than or equal to 0.", new [] { "RelativeFiscalStart" });
            }

            // RelativeFiscalEnd (int) maximum
            if (this.RelativeFiscalEnd > (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RelativeFiscalEnd, must be a value less than or equal to 0.", new [] { "RelativeFiscalEnd" });
            }

            yield break;
        }
    }

}
