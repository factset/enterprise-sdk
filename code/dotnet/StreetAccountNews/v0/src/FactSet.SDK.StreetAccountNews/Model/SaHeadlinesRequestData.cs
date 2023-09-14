/*
 * StreetAccount API
 *
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
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
using OpenAPIDateConverter = FactSet.SDK.StreetAccountNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StreetAccountNews.Model
{
    /// <summary>
    /// SaHeadlinesRequestData
    /// </summary>
    [DataContract(Name = "saHeadlinesRequest_data")]
    public partial class SaHeadlinesRequestData : IEquatable<SaHeadlinesRequestData>, IValidatableObject
    {
        /// <summary>
        /// see list of valid date ranges. Date range is mutually exlusive to start/end time
        /// </summary>
        /// <value>see list of valid date ranges. Date range is mutually exlusive to start/end time</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DateRangeEnum
        {
            /// <summary>
            /// Enum Today for value: Today
            /// </summary>
            [EnumMember(Value = "Today")]
            Today = 1,

            /// <summary>
            /// Enum _2Days for value: 2 Days
            /// </summary>
            [EnumMember(Value = "2 Days")]
            _2Days = 2,

            /// <summary>
            /// Enum _1Week for value: 1 Week
            /// </summary>
            [EnumMember(Value = "1 Week")]
            _1Week = 3,

            /// <summary>
            /// Enum _1Month for value: 1 Month
            /// </summary>
            [EnumMember(Value = "1 Month")]
            _1Month = 4,

            /// <summary>
            /// Enum _3Months for value: 3 Months
            /// </summary>
            [EnumMember(Value = "3 Months")]
            _3Months = 5,

            /// <summary>
            /// Enum _6Months for value: 6 Months
            /// </summary>
            [EnumMember(Value = "6 Months")]
            _6Months = 6,

            /// <summary>
            /// Enum _1Year for value: 1 Year
            /// </summary>
            [EnumMember(Value = "1 Year")]
            _1Year = 7,

            /// <summary>
            /// Enum _3Years for value: 3 Years
            /// </summary>
            [EnumMember(Value = "3 Years")]
            _3Years = 8,

            /// <summary>
            /// Enum _5Years for value: 5 Years
            /// </summary>
            [EnumMember(Value = "5 Years")]
            _5Years = 9,

            /// <summary>
            /// Enum _10Years for value: 10 Years
            /// </summary>
            [EnumMember(Value = "10 Years")]
            _10Years = 10,

            /// <summary>
            /// Enum AllAvailable for value: All Available
            /// </summary>
            [EnumMember(Value = "All Available")]
            AllAvailable = 11

        }


        /// <summary>
        /// see list of valid date ranges. Date range is mutually exlusive to start/end time
        /// </summary>
        /// <value>see list of valid date ranges. Date range is mutually exlusive to start/end time</value>
        [DataMember(Name = "dateRange", EmitDefaultValue = false)]
        public DateRangeEnum? DateRange { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SaHeadlinesRequestData" /> class.
        /// </summary>
        /// <param name="tickers">tickers.</param>
        /// <param name="categories">categories.</param>
        /// <param name="regions">regions.</param>
        /// <param name="topics">topics.</param>
        /// <param name="sectors">sectors.</param>
        /// <param name="isPrimary">isPrimary.</param>
        /// <param name="dateRange">see list of valid date ranges. Date range is mutually exlusive to start/end time.</param>
        /// <param name="searchDate">searchDate.</param>
        public SaHeadlinesRequestData(List<SaHeadlinesRequestTickersObject> tickers = default(List<SaHeadlinesRequestTickersObject>), List<string> categories = default(List<string>), List<string> regions = default(List<string>), List<string> topics = default(List<string>), List<string> sectors = default(List<string>), bool isPrimary = default(bool), DateRangeEnum? dateRange = default(DateRangeEnum?), SaHeadlinesRequestDataSearchDate searchDate = default(SaHeadlinesRequestDataSearchDate))
        {
            this.Tickers = tickers;
            this.Categories = categories;
            this.Regions = regions;
            this.Topics = topics;
            this.Sectors = sectors;
            this.IsPrimary = isPrimary;
            this.DateRange = dateRange;
            this.SearchDate = searchDate;
        }

        /// <summary>
        /// Gets or Sets Tickers
        /// </summary>
        [DataMember(Name = "tickers", EmitDefaultValue = false)]
        public List<SaHeadlinesRequestTickersObject> Tickers { get; set; }

        /// <summary>
        /// Gets or Sets Categories
        /// </summary>
        [DataMember(Name = "categories", EmitDefaultValue = false)]
        public List<string> Categories { get; set; }

        /// <summary>
        /// Gets or Sets Regions
        /// </summary>
        [DataMember(Name = "regions", EmitDefaultValue = false)]
        public List<string> Regions { get; set; }

        /// <summary>
        /// Gets or Sets Topics
        /// </summary>
        [DataMember(Name = "topics", EmitDefaultValue = false)]
        public List<string> Topics { get; set; }

        /// <summary>
        /// Gets or Sets Sectors
        /// </summary>
        [DataMember(Name = "sectors", EmitDefaultValue = false)]
        public List<string> Sectors { get; set; }

        /// <summary>
        /// Gets or Sets IsPrimary
        /// </summary>
        [DataMember(Name = "isPrimary", EmitDefaultValue = true)]
        public bool IsPrimary { get; set; }

        /// <summary>
        /// Gets or Sets SearchDate
        /// </summary>
        [DataMember(Name = "searchDate", EmitDefaultValue = false)]
        public SaHeadlinesRequestDataSearchDate SearchDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SaHeadlinesRequestData {\n");
            sb.Append("  Tickers: ").Append(Tickers).Append("\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  Regions: ").Append(Regions).Append("\n");
            sb.Append("  Topics: ").Append(Topics).Append("\n");
            sb.Append("  Sectors: ").Append(Sectors).Append("\n");
            sb.Append("  IsPrimary: ").Append(IsPrimary).Append("\n");
            sb.Append("  DateRange: ").Append(DateRange).Append("\n");
            sb.Append("  SearchDate: ").Append(SearchDate).Append("\n");
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
            return this.Equals(input as SaHeadlinesRequestData);
        }

        /// <summary>
        /// Returns true if SaHeadlinesRequestData instances are equal
        /// </summary>
        /// <param name="input">Instance of SaHeadlinesRequestData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SaHeadlinesRequestData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Tickers == input.Tickers ||
                    this.Tickers != null &&
                    input.Tickers != null &&
                    this.Tickers.SequenceEqual(input.Tickers)
                ) && 
                (
                    this.Categories == input.Categories ||
                    this.Categories != null &&
                    input.Categories != null &&
                    this.Categories.SequenceEqual(input.Categories)
                ) && 
                (
                    this.Regions == input.Regions ||
                    this.Regions != null &&
                    input.Regions != null &&
                    this.Regions.SequenceEqual(input.Regions)
                ) && 
                (
                    this.Topics == input.Topics ||
                    this.Topics != null &&
                    input.Topics != null &&
                    this.Topics.SequenceEqual(input.Topics)
                ) && 
                (
                    this.Sectors == input.Sectors ||
                    this.Sectors != null &&
                    input.Sectors != null &&
                    this.Sectors.SequenceEqual(input.Sectors)
                ) && 
                (
                    this.IsPrimary == input.IsPrimary ||
                    this.IsPrimary.Equals(input.IsPrimary)
                ) && 
                (
                    this.DateRange == input.DateRange ||
                    this.DateRange.Equals(input.DateRange)
                ) && 
                (
                    this.SearchDate == input.SearchDate ||
                    (this.SearchDate != null &&
                    this.SearchDate.Equals(input.SearchDate))
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
                if (this.Tickers != null)
                {
                    hashCode = (hashCode * 59) + this.Tickers.GetHashCode();
                }
                if (this.Categories != null)
                {
                    hashCode = (hashCode * 59) + this.Categories.GetHashCode();
                }
                if (this.Regions != null)
                {
                    hashCode = (hashCode * 59) + this.Regions.GetHashCode();
                }
                if (this.Topics != null)
                {
                    hashCode = (hashCode * 59) + this.Topics.GetHashCode();
                }
                if (this.Sectors != null)
                {
                    hashCode = (hashCode * 59) + this.Sectors.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsPrimary.GetHashCode();
                hashCode = (hashCode * 59) + this.DateRange.GetHashCode();
                if (this.SearchDate != null)
                {
                    hashCode = (hashCode * 59) + this.SearchDate.GetHashCode();
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