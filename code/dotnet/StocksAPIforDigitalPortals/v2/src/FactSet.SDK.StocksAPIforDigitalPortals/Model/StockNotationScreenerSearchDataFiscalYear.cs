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
    /// Since a fiscal year and a calendar year do not necessarily match  with regard to their start and end dates, the year is derived as the calendar year  occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Either must be at most ten years in the past.
    /// </summary>
    [DataContract(Name = "_stock_notation_screener_search_data_fiscalYear")]
    public partial class StockNotationScreenerSearchDataFiscalYear : IEquatable<StockNotationScreenerSearchDataFiscalYear>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationScreenerSearchDataFiscalYear" /> class.
        /// </summary>
        /// <param name="yearEnd">Calendar year of the ending date of the fiscal year..</param>
        /// <param name="year">Derived fiscal year..</param>
        public StockNotationScreenerSearchDataFiscalYear(decimal yearEnd = default(decimal), decimal year = default(decimal))
        {
            this.YearEnd = yearEnd;
            this.Year = year;
        }

        /// <summary>
        /// Calendar year of the ending date of the fiscal year.
        /// </summary>
        /// <value>Calendar year of the ending date of the fiscal year.</value>
        [DataMember(Name = "yearEnd", EmitDefaultValue = false)]
        public decimal YearEnd { get; set; }

        /// <summary>
        /// Derived fiscal year.
        /// </summary>
        /// <value>Derived fiscal year.</value>
        [DataMember(Name = "year", EmitDefaultValue = false)]
        public decimal Year { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StockNotationScreenerSearchDataFiscalYear {\n");
            sb.Append("  YearEnd: ").Append(YearEnd).Append("\n");
            sb.Append("  Year: ").Append(Year).Append("\n");
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
            return this.Equals(input as StockNotationScreenerSearchDataFiscalYear);
        }

        /// <summary>
        /// Returns true if StockNotationScreenerSearchDataFiscalYear instances are equal
        /// </summary>
        /// <param name="input">Instance of StockNotationScreenerSearchDataFiscalYear to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StockNotationScreenerSearchDataFiscalYear input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.YearEnd == input.YearEnd ||
                    this.YearEnd.Equals(input.YearEnd)
                ) && 
                (
                    this.Year == input.Year ||
                    this.Year.Equals(input.Year)
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
                hashCode = (hashCode * 59) + this.YearEnd.GetHashCode();
                hashCode = (hashCode * 59) + this.Year.GetHashCode();
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
