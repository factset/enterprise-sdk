/*
 * Stocks API For Digital Portals
 *
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// End-of-day (EOD) relative performance for different time ranges. The relative performance is the difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.
    /// </summary>
    [DataContract(Name = "PostStockNotationScreenerSearchRequest_data_performance_endOfDay")]
    public partial class PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay : IEquatable<PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay" /> class.
        /// </summary>
        /// <param name="day1">day1.</param>
        /// <param name="week1">week1.</param>
        /// <param name="month1">month1.</param>
        /// <param name="months3">months3.</param>
        /// <param name="months6">months6.</param>
        /// <param name="year1">year1.</param>
        /// <param name="years3">years3.</param>
        /// <param name="years5">years5.</param>
        /// <param name="yearToDate">yearToDate.</param>
        public PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay(PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayDay1 day1 = default(PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayDay1), PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceWeek1 week1 = default(PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceWeek1), PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonth1 month1 = default(PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonth1), PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths3 months3 = default(PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths3), PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths6 months6 = default(PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths6), PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYear1 year1 = default(PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYear1), PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3 years3 = default(PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3), PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears5 years5 = default(PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears5), PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayYearToDate yearToDate = default(PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayYearToDate))
        {
            this.Day1 = day1;
            this.Week1 = week1;
            this.Month1 = month1;
            this.Months3 = months3;
            this.Months6 = months6;
            this.Year1 = year1;
            this.Years3 = years3;
            this.Years5 = years5;
            this.YearToDate = yearToDate;
        }

        /// <summary>
        /// Gets or Sets Day1
        /// </summary>
        [DataMember(Name = "day1", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayDay1 Day1 { get; set; }

        /// <summary>
        /// Gets or Sets Week1
        /// </summary>
        [DataMember(Name = "week1", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceWeek1 Week1 { get; set; }

        /// <summary>
        /// Gets or Sets Month1
        /// </summary>
        [DataMember(Name = "month1", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonth1 Month1 { get; set; }

        /// <summary>
        /// Gets or Sets Months3
        /// </summary>
        [DataMember(Name = "months3", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths3 Months3 { get; set; }

        /// <summary>
        /// Gets or Sets Months6
        /// </summary>
        [DataMember(Name = "months6", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths6 Months6 { get; set; }

        /// <summary>
        /// Gets or Sets Year1
        /// </summary>
        [DataMember(Name = "year1", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYear1 Year1 { get; set; }

        /// <summary>
        /// Gets or Sets Years3
        /// </summary>
        [DataMember(Name = "years3", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3 Years3 { get; set; }

        /// <summary>
        /// Gets or Sets Years5
        /// </summary>
        [DataMember(Name = "years5", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears5 Years5 { get; set; }

        /// <summary>
        /// Gets or Sets YearToDate
        /// </summary>
        [DataMember(Name = "yearToDate", EmitDefaultValue = false)]
        public PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayYearToDate YearToDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay {\n");
            sb.Append("  Day1: ").Append(Day1).Append("\n");
            sb.Append("  Week1: ").Append(Week1).Append("\n");
            sb.Append("  Month1: ").Append(Month1).Append("\n");
            sb.Append("  Months3: ").Append(Months3).Append("\n");
            sb.Append("  Months6: ").Append(Months6).Append("\n");
            sb.Append("  Year1: ").Append(Year1).Append("\n");
            sb.Append("  Years3: ").Append(Years3).Append("\n");
            sb.Append("  Years5: ").Append(Years5).Append("\n");
            sb.Append("  YearToDate: ").Append(YearToDate).Append("\n");
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
            return this.Equals(input as PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay);
        }

        /// <summary>
        /// Returns true if PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay instances are equal
        /// </summary>
        /// <param name="input">Instance of PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Day1 == input.Day1 ||
                    (this.Day1 != null &&
                    this.Day1.Equals(input.Day1))
                ) && 
                (
                    this.Week1 == input.Week1 ||
                    (this.Week1 != null &&
                    this.Week1.Equals(input.Week1))
                ) && 
                (
                    this.Month1 == input.Month1 ||
                    (this.Month1 != null &&
                    this.Month1.Equals(input.Month1))
                ) && 
                (
                    this.Months3 == input.Months3 ||
                    (this.Months3 != null &&
                    this.Months3.Equals(input.Months3))
                ) && 
                (
                    this.Months6 == input.Months6 ||
                    (this.Months6 != null &&
                    this.Months6.Equals(input.Months6))
                ) && 
                (
                    this.Year1 == input.Year1 ||
                    (this.Year1 != null &&
                    this.Year1.Equals(input.Year1))
                ) && 
                (
                    this.Years3 == input.Years3 ||
                    (this.Years3 != null &&
                    this.Years3.Equals(input.Years3))
                ) && 
                (
                    this.Years5 == input.Years5 ||
                    (this.Years5 != null &&
                    this.Years5.Equals(input.Years5))
                ) && 
                (
                    this.YearToDate == input.YearToDate ||
                    (this.YearToDate != null &&
                    this.YearToDate.Equals(input.YearToDate))
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
                if (this.Day1 != null)
                {
                    hashCode = (hashCode * 59) + this.Day1.GetHashCode();
                }
                if (this.Week1 != null)
                {
                    hashCode = (hashCode * 59) + this.Week1.GetHashCode();
                }
                if (this.Month1 != null)
                {
                    hashCode = (hashCode * 59) + this.Month1.GetHashCode();
                }
                if (this.Months3 != null)
                {
                    hashCode = (hashCode * 59) + this.Months3.GetHashCode();
                }
                if (this.Months6 != null)
                {
                    hashCode = (hashCode * 59) + this.Months6.GetHashCode();
                }
                if (this.Year1 != null)
                {
                    hashCode = (hashCode * 59) + this.Year1.GetHashCode();
                }
                if (this.Years3 != null)
                {
                    hashCode = (hashCode * 59) + this.Years3.GetHashCode();
                }
                if (this.Years5 != null)
                {
                    hashCode = (hashCode * 59) + this.Years5.GetHashCode();
                }
                if (this.YearToDate != null)
                {
                    hashCode = (hashCode * 59) + this.YearToDate.GetHashCode();
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
