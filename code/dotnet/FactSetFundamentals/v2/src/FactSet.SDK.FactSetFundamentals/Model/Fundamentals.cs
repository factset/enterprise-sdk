/*
 * FactSet Fundamentals API
 *
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.4.1
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFundamentals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFundamentals.Model
{
    /// <summary>
    /// Factset Fundamental Response item
    /// </summary>
    [DataContract(Name = "Fundamentals")]
    public partial class Fundamentals : IEquatable<Fundamentals>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Fundamentals" /> class.
        /// </summary>
        /// <param name="requestId">Identifier that was used for the request..</param>
        /// <param name="error">error.</param>
        /// <param name="fsymId">FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet..</param>
        /// <param name="asOfDate">Date on which the specified fundamentals data or information is accurate or relevant..</param>
        /// <param name="currency">Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="periodicity">Periodicity or frequency of the fiscal periods..</param>
        /// <param name="perShare">perShare.</param>
        /// <param name="ratios">ratios.</param>
        /// <param name="dividend">dividend.</param>
        /// <param name="enterpriseValue">Enterprise Value (EV) is the measure of a company&#39;s total value for the period and date(s) requested in local currency by default.</param>
        /// <param name="fiveYearAverageYield">Average of the dividend yield with yield calculated for each of the past five years.</param>
        /// <param name="fiveYearDividendGrowthRate">The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over five years of time.</param>
        /// <param name="floatingSharesOutstanding">Represents the number of shares outstanding less closely held shares for the period and date(s) requested.</param>
        /// <param name="netIncome">This equals to net earnings (profit) calculated as sales less cost of goods sold, selling, general and administrative expenses, operating expenses, depreciation, interest, taxes and other expenses.</param>
        /// <param name="numberOfEmployees">Represents the number of employees under the company&#39;s payroll as reported by the management to the shareholders within 90 days of the fiscal year-end..</param>
        /// <param name="salesPerEmployee">Revenue per employee is a ratio that is calculated as a company&#39;s total revenue divided by its current number of employees.</param>
        /// <param name="shareHolderEquity">Shareholder equity represents the amount of financing the company experiences through common and preferred shares.</param>
        /// <param name="threeYearAverageYield">Average of the dividend yield with yield calculated for each of the past three years.</param>
        /// <param name="threeYearDividendGrowthRate">The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over three years of time.</param>
        /// <param name="totalAssets">Total amount of assets owned by entity..</param>
        /// <param name="totalRevenue">Revenue is the amount of money (in Million) that a company actually receives during a specific period, including discounts and deductions for returned merchandise..</param>
        public Fundamentals(string requestId = default(string), CompanyReportErrorObject error = default(CompanyReportErrorObject), string fsymId = default(string), DateTime? asOfDate = default(DateTime?), string currency = default(string), string periodicity = default(string), PerShare perShare = default(PerShare), Ratios ratios = default(Ratios), Dividend dividend = default(Dividend), double? enterpriseValue = default(double?), double? fiveYearAverageYield = default(double?), double? fiveYearDividendGrowthRate = default(double?), double? floatingSharesOutstanding = default(double?), double? netIncome = default(double?), int? numberOfEmployees = default(int?), double? salesPerEmployee = default(double?), double? shareHolderEquity = default(double?), double? threeYearAverageYield = default(double?), double? threeYearDividendGrowthRate = default(double?), double? totalAssets = default(double?), double? totalRevenue = default(double?))
        {
            this.RequestId = requestId;
            this.Error = error;
            this.FsymId = fsymId;
            this.AsOfDate = asOfDate;
            this.Currency = currency;
            this.Periodicity = periodicity;
            this.PerShare = perShare;
            this.Ratios = ratios;
            this.Dividend = dividend;
            this.EnterpriseValue = enterpriseValue;
            this.FiveYearAverageYield = fiveYearAverageYield;
            this.FiveYearDividendGrowthRate = fiveYearDividendGrowthRate;
            this.FloatingSharesOutstanding = floatingSharesOutstanding;
            this.NetIncome = netIncome;
            this.NumberOfEmployees = numberOfEmployees;
            this.SalesPerEmployee = salesPerEmployee;
            this.ShareHolderEquity = shareHolderEquity;
            this.ThreeYearAverageYield = threeYearAverageYield;
            this.ThreeYearDividendGrowthRate = threeYearDividendGrowthRate;
            this.TotalAssets = totalAssets;
            this.TotalRevenue = totalRevenue;
        }

        /// <summary>
        /// Identifier that was used for the request.
        /// </summary>
        /// <value>Identifier that was used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public CompanyReportErrorObject Error { get; set; }

        /// <summary>
        /// FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
        /// </summary>
        /// <value>FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Date on which the specified fundamentals data or information is accurate or relevant.
        /// </summary>
        /// <value>Date on which the specified fundamentals data or information is accurate or relevant.</value>
        [DataMember(Name = "asOfDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? AsOfDate { get; set; }

        /// <summary>
        /// Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Periodicity or frequency of the fiscal periods.
        /// </summary>
        /// <value>Periodicity or frequency of the fiscal periods.</value>
        [DataMember(Name = "periodicity", EmitDefaultValue = true)]
        public string Periodicity { get; set; }

        /// <summary>
        /// Gets or Sets PerShare
        /// </summary>
        [DataMember(Name = "perShare", EmitDefaultValue = false)]
        public PerShare PerShare { get; set; }

        /// <summary>
        /// Gets or Sets Ratios
        /// </summary>
        [DataMember(Name = "ratios", EmitDefaultValue = false)]
        public Ratios Ratios { get; set; }

        /// <summary>
        /// Gets or Sets Dividend
        /// </summary>
        [DataMember(Name = "dividend", EmitDefaultValue = false)]
        public Dividend Dividend { get; set; }

        /// <summary>
        /// Enterprise Value (EV) is the measure of a company&#39;s total value for the period and date(s) requested in local currency by default
        /// </summary>
        /// <value>Enterprise Value (EV) is the measure of a company&#39;s total value for the period and date(s) requested in local currency by default</value>
        [DataMember(Name = "enterpriseValue", EmitDefaultValue = true)]
        public double? EnterpriseValue { get; set; }

        /// <summary>
        /// Average of the dividend yield with yield calculated for each of the past five years
        /// </summary>
        /// <value>Average of the dividend yield with yield calculated for each of the past five years</value>
        [DataMember(Name = "fiveYearAverageYield", EmitDefaultValue = true)]
        public double? FiveYearAverageYield { get; set; }

        /// <summary>
        /// The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over five years of time
        /// </summary>
        /// <value>The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over five years of time</value>
        [DataMember(Name = "fiveYearDividendGrowthRate", EmitDefaultValue = true)]
        public double? FiveYearDividendGrowthRate { get; set; }

        /// <summary>
        /// Represents the number of shares outstanding less closely held shares for the period and date(s) requested
        /// </summary>
        /// <value>Represents the number of shares outstanding less closely held shares for the period and date(s) requested</value>
        [DataMember(Name = "floatingSharesOutstanding", EmitDefaultValue = true)]
        public double? FloatingSharesOutstanding { get; set; }

        /// <summary>
        /// This equals to net earnings (profit) calculated as sales less cost of goods sold, selling, general and administrative expenses, operating expenses, depreciation, interest, taxes and other expenses
        /// </summary>
        /// <value>This equals to net earnings (profit) calculated as sales less cost of goods sold, selling, general and administrative expenses, operating expenses, depreciation, interest, taxes and other expenses</value>
        [DataMember(Name = "netIncome", EmitDefaultValue = true)]
        public double? NetIncome { get; set; }

        /// <summary>
        /// Represents the number of employees under the company&#39;s payroll as reported by the management to the shareholders within 90 days of the fiscal year-end.
        /// </summary>
        /// <value>Represents the number of employees under the company&#39;s payroll as reported by the management to the shareholders within 90 days of the fiscal year-end.</value>
        [DataMember(Name = "numberOfEmployees", EmitDefaultValue = true)]
        public int? NumberOfEmployees { get; set; }

        /// <summary>
        /// Revenue per employee is a ratio that is calculated as a company&#39;s total revenue divided by its current number of employees
        /// </summary>
        /// <value>Revenue per employee is a ratio that is calculated as a company&#39;s total revenue divided by its current number of employees</value>
        [DataMember(Name = "salesPerEmployee", EmitDefaultValue = true)]
        public double? SalesPerEmployee { get; set; }

        /// <summary>
        /// Shareholder equity represents the amount of financing the company experiences through common and preferred shares
        /// </summary>
        /// <value>Shareholder equity represents the amount of financing the company experiences through common and preferred shares</value>
        [DataMember(Name = "shareHolderEquity", EmitDefaultValue = true)]
        public double? ShareHolderEquity { get; set; }

        /// <summary>
        /// Average of the dividend yield with yield calculated for each of the past three years
        /// </summary>
        /// <value>Average of the dividend yield with yield calculated for each of the past three years</value>
        [DataMember(Name = "threeYearAverageYield", EmitDefaultValue = true)]
        public double? ThreeYearAverageYield { get; set; }

        /// <summary>
        /// The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over three years of time
        /// </summary>
        /// <value>The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over three years of time</value>
        [DataMember(Name = "threeYearDividendGrowthRate", EmitDefaultValue = true)]
        public double? ThreeYearDividendGrowthRate { get; set; }

        /// <summary>
        /// Total amount of assets owned by entity.
        /// </summary>
        /// <value>Total amount of assets owned by entity.</value>
        [DataMember(Name = "totalAssets", EmitDefaultValue = true)]
        public double? TotalAssets { get; set; }

        /// <summary>
        /// Revenue is the amount of money (in Million) that a company actually receives during a specific period, including discounts and deductions for returned merchandise.
        /// </summary>
        /// <value>Revenue is the amount of money (in Million) that a company actually receives during a specific period, including discounts and deductions for returned merchandise.</value>
        [DataMember(Name = "totalRevenue", EmitDefaultValue = true)]
        public double? TotalRevenue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Fundamentals {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  AsOfDate: ").Append(AsOfDate).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Periodicity: ").Append(Periodicity).Append("\n");
            sb.Append("  PerShare: ").Append(PerShare).Append("\n");
            sb.Append("  Ratios: ").Append(Ratios).Append("\n");
            sb.Append("  Dividend: ").Append(Dividend).Append("\n");
            sb.Append("  EnterpriseValue: ").Append(EnterpriseValue).Append("\n");
            sb.Append("  FiveYearAverageYield: ").Append(FiveYearAverageYield).Append("\n");
            sb.Append("  FiveYearDividendGrowthRate: ").Append(FiveYearDividendGrowthRate).Append("\n");
            sb.Append("  FloatingSharesOutstanding: ").Append(FloatingSharesOutstanding).Append("\n");
            sb.Append("  NetIncome: ").Append(NetIncome).Append("\n");
            sb.Append("  NumberOfEmployees: ").Append(NumberOfEmployees).Append("\n");
            sb.Append("  SalesPerEmployee: ").Append(SalesPerEmployee).Append("\n");
            sb.Append("  ShareHolderEquity: ").Append(ShareHolderEquity).Append("\n");
            sb.Append("  ThreeYearAverageYield: ").Append(ThreeYearAverageYield).Append("\n");
            sb.Append("  ThreeYearDividendGrowthRate: ").Append(ThreeYearDividendGrowthRate).Append("\n");
            sb.Append("  TotalAssets: ").Append(TotalAssets).Append("\n");
            sb.Append("  TotalRevenue: ").Append(TotalRevenue).Append("\n");
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
            return this.Equals(input as Fundamentals);
        }

        /// <summary>
        /// Returns true if Fundamentals instances are equal
        /// </summary>
        /// <param name="input">Instance of Fundamentals to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Fundamentals input)
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
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
                ) && 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.AsOfDate == input.AsOfDate ||
                    (this.AsOfDate != null &&
                    this.AsOfDate.Equals(input.AsOfDate))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Periodicity == input.Periodicity ||
                    (this.Periodicity != null &&
                    this.Periodicity.Equals(input.Periodicity))
                ) && 
                (
                    this.PerShare == input.PerShare ||
                    (this.PerShare != null &&
                    this.PerShare.Equals(input.PerShare))
                ) && 
                (
                    this.Ratios == input.Ratios ||
                    (this.Ratios != null &&
                    this.Ratios.Equals(input.Ratios))
                ) && 
                (
                    this.Dividend == input.Dividend ||
                    (this.Dividend != null &&
                    this.Dividend.Equals(input.Dividend))
                ) && 
                (
                    this.EnterpriseValue == input.EnterpriseValue ||
                    (this.EnterpriseValue != null &&
                    this.EnterpriseValue.Equals(input.EnterpriseValue))
                ) && 
                (
                    this.FiveYearAverageYield == input.FiveYearAverageYield ||
                    (this.FiveYearAverageYield != null &&
                    this.FiveYearAverageYield.Equals(input.FiveYearAverageYield))
                ) && 
                (
                    this.FiveYearDividendGrowthRate == input.FiveYearDividendGrowthRate ||
                    (this.FiveYearDividendGrowthRate != null &&
                    this.FiveYearDividendGrowthRate.Equals(input.FiveYearDividendGrowthRate))
                ) && 
                (
                    this.FloatingSharesOutstanding == input.FloatingSharesOutstanding ||
                    (this.FloatingSharesOutstanding != null &&
                    this.FloatingSharesOutstanding.Equals(input.FloatingSharesOutstanding))
                ) && 
                (
                    this.NetIncome == input.NetIncome ||
                    (this.NetIncome != null &&
                    this.NetIncome.Equals(input.NetIncome))
                ) && 
                (
                    this.NumberOfEmployees == input.NumberOfEmployees ||
                    (this.NumberOfEmployees != null &&
                    this.NumberOfEmployees.Equals(input.NumberOfEmployees))
                ) && 
                (
                    this.SalesPerEmployee == input.SalesPerEmployee ||
                    (this.SalesPerEmployee != null &&
                    this.SalesPerEmployee.Equals(input.SalesPerEmployee))
                ) && 
                (
                    this.ShareHolderEquity == input.ShareHolderEquity ||
                    (this.ShareHolderEquity != null &&
                    this.ShareHolderEquity.Equals(input.ShareHolderEquity))
                ) && 
                (
                    this.ThreeYearAverageYield == input.ThreeYearAverageYield ||
                    (this.ThreeYearAverageYield != null &&
                    this.ThreeYearAverageYield.Equals(input.ThreeYearAverageYield))
                ) && 
                (
                    this.ThreeYearDividendGrowthRate == input.ThreeYearDividendGrowthRate ||
                    (this.ThreeYearDividendGrowthRate != null &&
                    this.ThreeYearDividendGrowthRate.Equals(input.ThreeYearDividendGrowthRate))
                ) && 
                (
                    this.TotalAssets == input.TotalAssets ||
                    (this.TotalAssets != null &&
                    this.TotalAssets.Equals(input.TotalAssets))
                ) && 
                (
                    this.TotalRevenue == input.TotalRevenue ||
                    (this.TotalRevenue != null &&
                    this.TotalRevenue.Equals(input.TotalRevenue))
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
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
                }
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.AsOfDate != null)
                {
                    hashCode = (hashCode * 59) + this.AsOfDate.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Periodicity != null)
                {
                    hashCode = (hashCode * 59) + this.Periodicity.GetHashCode();
                }
                if (this.PerShare != null)
                {
                    hashCode = (hashCode * 59) + this.PerShare.GetHashCode();
                }
                if (this.Ratios != null)
                {
                    hashCode = (hashCode * 59) + this.Ratios.GetHashCode();
                }
                if (this.Dividend != null)
                {
                    hashCode = (hashCode * 59) + this.Dividend.GetHashCode();
                }
                if (this.EnterpriseValue != null)
                {
                    hashCode = (hashCode * 59) + this.EnterpriseValue.GetHashCode();
                }
                if (this.FiveYearAverageYield != null)
                {
                    hashCode = (hashCode * 59) + this.FiveYearAverageYield.GetHashCode();
                }
                if (this.FiveYearDividendGrowthRate != null)
                {
                    hashCode = (hashCode * 59) + this.FiveYearDividendGrowthRate.GetHashCode();
                }
                if (this.FloatingSharesOutstanding != null)
                {
                    hashCode = (hashCode * 59) + this.FloatingSharesOutstanding.GetHashCode();
                }
                if (this.NetIncome != null)
                {
                    hashCode = (hashCode * 59) + this.NetIncome.GetHashCode();
                }
                if (this.NumberOfEmployees != null)
                {
                    hashCode = (hashCode * 59) + this.NumberOfEmployees.GetHashCode();
                }
                if (this.SalesPerEmployee != null)
                {
                    hashCode = (hashCode * 59) + this.SalesPerEmployee.GetHashCode();
                }
                if (this.ShareHolderEquity != null)
                {
                    hashCode = (hashCode * 59) + this.ShareHolderEquity.GetHashCode();
                }
                if (this.ThreeYearAverageYield != null)
                {
                    hashCode = (hashCode * 59) + this.ThreeYearAverageYield.GetHashCode();
                }
                if (this.ThreeYearDividendGrowthRate != null)
                {
                    hashCode = (hashCode * 59) + this.ThreeYearDividendGrowthRate.GetHashCode();
                }
                if (this.TotalAssets != null)
                {
                    hashCode = (hashCode * 59) + this.TotalAssets.GetHashCode();
                }
                if (this.TotalRevenue != null)
                {
                    hashCode = (hashCode * 59) + this.TotalRevenue.GetHashCode();
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
