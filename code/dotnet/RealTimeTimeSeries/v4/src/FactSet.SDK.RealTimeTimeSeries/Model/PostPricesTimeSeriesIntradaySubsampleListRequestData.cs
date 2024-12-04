/*
 * Real-Time Time Series API
 *
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 4.0.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeTimeSeries.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeTimeSeries.Model
{
    /// <summary>
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "PostPricesTimeSeriesIntradaySubsampleListRequest_data")]
    public partial class PostPricesTimeSeriesIntradaySubsampleListRequestData : IEquatable<PostPricesTimeSeriesIntradaySubsampleListRequestData>, IValidatableObject
    {
        /// <summary>
        /// Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |  
        /// </summary>
        /// <value>Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |  </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Trade for value: trade
            /// </summary>
            [EnumMember(Value = "trade")]
            Trade = 1,

            /// <summary>
            /// Enum Bid for value: bid
            /// </summary>
            [EnumMember(Value = "bid")]
            Bid = 2,

            /// <summary>
            /// Enum Ask for value: ask
            /// </summary>
            [EnumMember(Value = "ask")]
            Ask = 3,

            /// <summary>
            /// Enum Yield for value: yield
            /// </summary>
            [EnumMember(Value = "yield")]
            Yield = 4

        }


        /// <summary>
        /// Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |  
        /// </summary>
        /// <value>Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |  </value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Quality of the price. | Value | Description | | - -- | - -- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  
        /// </summary>
        /// <value>Quality of the price. | Value | Description | | - -- | - -- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum QualityEnum
        {
            /// <summary>
            /// Enum RLT for value: RLT
            /// </summary>
            [EnumMember(Value = "RLT")]
            RLT = 1,

            /// <summary>
            /// Enum DLY for value: DLY
            /// </summary>
            [EnumMember(Value = "DLY")]
            DLY = 2,

            /// <summary>
            /// Enum BST for value: BST
            /// </summary>
            [EnumMember(Value = "BST")]
            BST = 3

        }


        /// <summary>
        /// Quality of the price. | Value | Description | | - -- | - -- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  
        /// </summary>
        /// <value>Quality of the price. | Value | Description | | - -- | - -- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  </value>
        [DataMember(Name = "quality", EmitDefaultValue = false)]
        public QualityEnum? Quality { get; set; }
        /// <summary>
        /// Subsample granularities suitable for intraday data. | Value | Description | | - -- | - -- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |  
        /// </summary>
        /// <value>Subsample granularities suitable for intraday data. | Value | Description | | - -- | - -- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |  </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum GranularityEnum
        {
            /// <summary>
            /// Enum _1s for value: 1s
            /// </summary>
            [EnumMember(Value = "1s")]
            _1s = 1,

            /// <summary>
            /// Enum _5s for value: 5s
            /// </summary>
            [EnumMember(Value = "5s")]
            _5s = 2,

            /// <summary>
            /// Enum _10s for value: 10s
            /// </summary>
            [EnumMember(Value = "10s")]
            _10s = 3,

            /// <summary>
            /// Enum _30s for value: 30s
            /// </summary>
            [EnumMember(Value = "30s")]
            _30s = 4,

            /// <summary>
            /// Enum _1m for value: 1m
            /// </summary>
            [EnumMember(Value = "1m")]
            _1m = 5,

            /// <summary>
            /// Enum _5m for value: 5m
            /// </summary>
            [EnumMember(Value = "5m")]
            _5m = 6,

            /// <summary>
            /// Enum _10m for value: 10m
            /// </summary>
            [EnumMember(Value = "10m")]
            _10m = 7,

            /// <summary>
            /// Enum _15m for value: 15m
            /// </summary>
            [EnumMember(Value = "15m")]
            _15m = 8,

            /// <summary>
            /// Enum _30m for value: 30m
            /// </summary>
            [EnumMember(Value = "30m")]
            _30m = 9,

            /// <summary>
            /// Enum _1h for value: 1h
            /// </summary>
            [EnumMember(Value = "1h")]
            _1h = 10

        }


        /// <summary>
        /// Subsample granularities suitable for intraday data. | Value | Description | | - -- | - -- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |  
        /// </summary>
        /// <value>Subsample granularities suitable for intraday data. | Value | Description | | - -- | - -- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |  </value>
        [DataMember(Name = "granularity", EmitDefaultValue = false)]
        public GranularityEnum? Granularity { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostPricesTimeSeriesIntradaySubsampleListRequestData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostPricesTimeSeriesIntradaySubsampleListRequestData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostPricesTimeSeriesIntradaySubsampleListRequestData" /> class.
        /// </summary>
        /// <param name="identifier">identifier (required).</param>
        /// <param name="type">Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |   (default to TypeEnum.Trade).</param>
        /// <param name="quality">Quality of the price. | Value | Description | | - -- | - -- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   (default to QualityEnum.DLY).</param>
        /// <param name="range">range (required).</param>
        /// <param name="alignRange">If set to &#x60;true&#x60;, the start and end of the range are truncated so that they are aligned to the selected &#x60;granularity&#x60;. (default to false).</param>
        /// <param name="granularity">Subsample granularities suitable for intraday data. | Value | Description | | - -- | - -- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |   (default to GranularityEnum._1h).</param>
        /// <param name="newestFirst">Deliver the chronological last part of the requested data first. (default to false).</param>
        /// <param name="adjustments">adjustments.</param>
        public PostPricesTimeSeriesIntradaySubsampleListRequestData(PostVendorChartIQTimeSeriesEodListRequestDataIdentifier identifier, PostPricesTimeSeriesIntradaySubsampleListRequestDataRange range,TypeEnum? type = TypeEnum.Trade, QualityEnum? quality = QualityEnum.DLY, bool alignRange = false, GranularityEnum? granularity = GranularityEnum._1h, bool newestFirst = false, PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments adjustments = default(PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments))
        {
            // to ensure "identifier" is required (not null)
            if (identifier == null) {
                throw new ArgumentNullException("identifier is a required property for PostPricesTimeSeriesIntradaySubsampleListRequestData and cannot be null");
            }
            this.Identifier = identifier;
            // to ensure "range" is required (not null)
            if (range == null) {
                throw new ArgumentNullException("range is a required property for PostPricesTimeSeriesIntradaySubsampleListRequestData and cannot be null");
            }
            this.Range = range;
            this.Type = type;
            this.Quality = quality;
            this.AlignRange = alignRange;
            this.Granularity = granularity;
            this.NewestFirst = newestFirst;
            this.Adjustments = adjustments;
        }

        /// <summary>
        /// Gets or Sets Identifier
        /// </summary>
        [DataMember(Name = "identifier", IsRequired = true, EmitDefaultValue = false)]
        public PostVendorChartIQTimeSeriesEodListRequestDataIdentifier Identifier { get; set; }

        /// <summary>
        /// Gets or Sets Range
        /// </summary>
        [DataMember(Name = "range", IsRequired = true, EmitDefaultValue = false)]
        public PostPricesTimeSeriesIntradaySubsampleListRequestDataRange Range { get; set; }

        /// <summary>
        /// If set to &#x60;true&#x60;, the start and end of the range are truncated so that they are aligned to the selected &#x60;granularity&#x60;.
        /// </summary>
        /// <value>If set to &#x60;true&#x60;, the start and end of the range are truncated so that they are aligned to the selected &#x60;granularity&#x60;.</value>
        [DataMember(Name = "alignRange", EmitDefaultValue = true)]
        public bool AlignRange { get; set; }

        /// <summary>
        /// Deliver the chronological last part of the requested data first.
        /// </summary>
        /// <value>Deliver the chronological last part of the requested data first.</value>
        [DataMember(Name = "newestFirst", EmitDefaultValue = true)]
        public bool NewestFirst { get; set; }

        /// <summary>
        /// Gets or Sets Adjustments
        /// </summary>
        [DataMember(Name = "adjustments", EmitDefaultValue = false)]
        public PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments Adjustments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostPricesTimeSeriesIntradaySubsampleListRequestData {\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
            sb.Append("  Range: ").Append(Range).Append("\n");
            sb.Append("  AlignRange: ").Append(AlignRange).Append("\n");
            sb.Append("  Granularity: ").Append(Granularity).Append("\n");
            sb.Append("  NewestFirst: ").Append(NewestFirst).Append("\n");
            sb.Append("  Adjustments: ").Append(Adjustments).Append("\n");
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
            return this.Equals(input as PostPricesTimeSeriesIntradaySubsampleListRequestData);
        }

        /// <summary>
        /// Returns true if PostPricesTimeSeriesIntradaySubsampleListRequestData instances are equal
        /// </summary>
        /// <param name="input">Instance of PostPricesTimeSeriesIntradaySubsampleListRequestData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostPricesTimeSeriesIntradaySubsampleListRequestData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Identifier == input.Identifier ||
                    (this.Identifier != null &&
                    this.Identifier.Equals(input.Identifier))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.Quality == input.Quality ||
                    this.Quality.Equals(input.Quality)
                ) && 
                (
                    this.Range == input.Range ||
                    (this.Range != null &&
                    this.Range.Equals(input.Range))
                ) && 
                (
                    this.AlignRange == input.AlignRange ||
                    this.AlignRange.Equals(input.AlignRange)
                ) && 
                (
                    this.Granularity == input.Granularity ||
                    this.Granularity.Equals(input.Granularity)
                ) && 
                (
                    this.NewestFirst == input.NewestFirst ||
                    this.NewestFirst.Equals(input.NewestFirst)
                ) && 
                (
                    this.Adjustments == input.Adjustments ||
                    (this.Adjustments != null &&
                    this.Adjustments.Equals(input.Adjustments))
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
                if (this.Identifier != null)
                {
                    hashCode = (hashCode * 59) + this.Identifier.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                hashCode = (hashCode * 59) + this.Quality.GetHashCode();
                if (this.Range != null)
                {
                    hashCode = (hashCode * 59) + this.Range.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.AlignRange.GetHashCode();
                hashCode = (hashCode * 59) + this.Granularity.GetHashCode();
                hashCode = (hashCode * 59) + this.NewestFirst.GetHashCode();
                if (this.Adjustments != null)
                {
                    hashCode = (hashCode * 59) + this.Adjustments.GetHashCode();
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
