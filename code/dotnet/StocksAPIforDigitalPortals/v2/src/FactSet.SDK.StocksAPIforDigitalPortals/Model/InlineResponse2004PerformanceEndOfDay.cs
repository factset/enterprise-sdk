/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    [DataContract(Name = "inline_response_200_4_performance_endOfDay")]
    public partial class InlineResponse2004PerformanceEndOfDay : IEquatable<InlineResponse2004PerformanceEndOfDay>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004PerformanceEndOfDay" /> class.
        /// </summary>
        /// <param name="day1">One day..</param>
        /// <param name="week1">One week..</param>
        /// <param name="month1">One month..</param>
        /// <param name="months3">Three months..</param>
        /// <param name="months6">Six months..</param>
        /// <param name="year1">One year..</param>
        /// <param name="years3">Three years..</param>
        /// <param name="years5">Five years..</param>
        /// <param name="yearToDate">Year-to-date..</param>
        public InlineResponse2004PerformanceEndOfDay(decimal day1 = default(decimal), decimal week1 = default(decimal), decimal month1 = default(decimal), decimal months3 = default(decimal), decimal months6 = default(decimal), decimal year1 = default(decimal), decimal years3 = default(decimal), decimal years5 = default(decimal), decimal yearToDate = default(decimal))
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
        /// One day.
        /// </summary>
        /// <value>One day.</value>
        [DataMember(Name = "day1", EmitDefaultValue = false)]
        public decimal Day1 { get; set; }

        /// <summary>
        /// One week.
        /// </summary>
        /// <value>One week.</value>
        [DataMember(Name = "week1", EmitDefaultValue = false)]
        public decimal Week1 { get; set; }

        /// <summary>
        /// One month.
        /// </summary>
        /// <value>One month.</value>
        [DataMember(Name = "month1", EmitDefaultValue = false)]
        public decimal Month1 { get; set; }

        /// <summary>
        /// Three months.
        /// </summary>
        /// <value>Three months.</value>
        [DataMember(Name = "months3", EmitDefaultValue = false)]
        public decimal Months3 { get; set; }

        /// <summary>
        /// Six months.
        /// </summary>
        /// <value>Six months.</value>
        [DataMember(Name = "months6", EmitDefaultValue = false)]
        public decimal Months6 { get; set; }

        /// <summary>
        /// One year.
        /// </summary>
        /// <value>One year.</value>
        [DataMember(Name = "year1", EmitDefaultValue = false)]
        public decimal Year1 { get; set; }

        /// <summary>
        /// Three years.
        /// </summary>
        /// <value>Three years.</value>
        [DataMember(Name = "years3", EmitDefaultValue = false)]
        public decimal Years3 { get; set; }

        /// <summary>
        /// Five years.
        /// </summary>
        /// <value>Five years.</value>
        [DataMember(Name = "years5", EmitDefaultValue = false)]
        public decimal Years5 { get; set; }

        /// <summary>
        /// Year-to-date.
        /// </summary>
        /// <value>Year-to-date.</value>
        [DataMember(Name = "yearToDate", EmitDefaultValue = false)]
        public decimal YearToDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004PerformanceEndOfDay {\n");
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
            return this.Equals(input as InlineResponse2004PerformanceEndOfDay);
        }

        /// <summary>
        /// Returns true if InlineResponse2004PerformanceEndOfDay instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004PerformanceEndOfDay to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004PerformanceEndOfDay input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Day1 == input.Day1 ||
                    this.Day1.Equals(input.Day1)
                ) && 
                (
                    this.Week1 == input.Week1 ||
                    this.Week1.Equals(input.Week1)
                ) && 
                (
                    this.Month1 == input.Month1 ||
                    this.Month1.Equals(input.Month1)
                ) && 
                (
                    this.Months3 == input.Months3 ||
                    this.Months3.Equals(input.Months3)
                ) && 
                (
                    this.Months6 == input.Months6 ||
                    this.Months6.Equals(input.Months6)
                ) && 
                (
                    this.Year1 == input.Year1 ||
                    this.Year1.Equals(input.Year1)
                ) && 
                (
                    this.Years3 == input.Years3 ||
                    this.Years3.Equals(input.Years3)
                ) && 
                (
                    this.Years5 == input.Years5 ||
                    this.Years5.Equals(input.Years5)
                ) && 
                (
                    this.YearToDate == input.YearToDate ||
                    this.YearToDate.Equals(input.YearToDate)
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
                hashCode = (hashCode * 59) + this.Day1.GetHashCode();
                hashCode = (hashCode * 59) + this.Week1.GetHashCode();
                hashCode = (hashCode * 59) + this.Month1.GetHashCode();
                hashCode = (hashCode * 59) + this.Months3.GetHashCode();
                hashCode = (hashCode * 59) + this.Months6.GetHashCode();
                hashCode = (hashCode * 59) + this.Year1.GetHashCode();
                hashCode = (hashCode * 59) + this.Years3.GetHashCode();
                hashCode = (hashCode * 59) + this.Years5.GetHashCode();
                hashCode = (hashCode * 59) + this.YearToDate.GetHashCode();
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
