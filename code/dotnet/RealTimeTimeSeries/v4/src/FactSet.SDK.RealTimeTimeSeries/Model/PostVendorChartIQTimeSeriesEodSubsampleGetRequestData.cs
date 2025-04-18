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
    [DataContract(Name = "PostVendorChartIQTimeSeriesEodSubsampleGetRequest_data")]
    public partial class PostVendorChartIQTimeSeriesEodSubsampleGetRequestData : IEquatable<PostVendorChartIQTimeSeriesEodSubsampleGetRequestData>, IValidatableObject
    {
        /// <summary>
        /// Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. | | estimate | Estimated price. |  
        /// </summary>
        /// <value>Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. | | estimate | Estimated price. |  </value>
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
            Yield = 4,

            /// <summary>
            /// Enum Estimate for value: estimate
            /// </summary>
            [EnumMember(Value = "estimate")]
            Estimate = 5

        }


        /// <summary>
        /// Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. | | estimate | Estimated price. |  
        /// </summary>
        /// <value>Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. | | estimate | Estimated price. |  </value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  
        /// </summary>
        /// <value>Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum QualityEnum
        {
            /// <summary>
            /// Enum DLY for value: DLY
            /// </summary>
            [EnumMember(Value = "DLY")]
            DLY = 1,

            /// <summary>
            /// Enum EOD for value: EOD
            /// </summary>
            [EnumMember(Value = "EOD")]
            EOD = 2,

            /// <summary>
            /// Enum BST for value: BST
            /// </summary>
            [EnumMember(Value = "BST")]
            BST = 3

        }


        /// <summary>
        /// Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  
        /// </summary>
        /// <value>Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  </value>
        [DataMember(Name = "quality", EmitDefaultValue = false)]
        public QualityEnum? Quality { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostVendorChartIQTimeSeriesEodSubsampleGetRequestData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostVendorChartIQTimeSeriesEodSubsampleGetRequestData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostVendorChartIQTimeSeriesEodSubsampleGetRequestData" /> class.
        /// </summary>
        /// <param name="identifier">identifier (required).</param>
        /// <param name="type">Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. | | estimate | Estimated price. |   (default to TypeEnum.Trade).</param>
        /// <param name="quality">Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   (default to QualityEnum.DLY).</param>
        /// <param name="interval">interval (required).</param>
        /// <param name="adjustments">adjustments.</param>
        public PostVendorChartIQTimeSeriesEodSubsampleGetRequestData(PostVendorChartIQTimeSeriesEodListRequestDataIdentifier identifier, PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval interval,TypeEnum? type = TypeEnum.Trade, QualityEnum? quality = QualityEnum.DLY, PostVendorChartIQTimeSeriesEodListRequestDataAdjustments adjustments = default(PostVendorChartIQTimeSeriesEodListRequestDataAdjustments))
        {
            // to ensure "identifier" is required (not null)
            if (identifier == null) {
                throw new ArgumentNullException("identifier is a required property for PostVendorChartIQTimeSeriesEodSubsampleGetRequestData and cannot be null");
            }
            this.Identifier = identifier;
            // to ensure "interval" is required (not null)
            if (interval == null) {
                throw new ArgumentNullException("interval is a required property for PostVendorChartIQTimeSeriesEodSubsampleGetRequestData and cannot be null");
            }
            this.Interval = interval;
            this.Type = type;
            this.Quality = quality;
            this.Adjustments = adjustments;
        }

        /// <summary>
        /// Gets or Sets Identifier
        /// </summary>
        [DataMember(Name = "identifier", IsRequired = true, EmitDefaultValue = false)]
        public PostVendorChartIQTimeSeriesEodListRequestDataIdentifier Identifier { get; set; }

        /// <summary>
        /// Gets or Sets Interval
        /// </summary>
        [DataMember(Name = "interval", IsRequired = true, EmitDefaultValue = false)]
        public PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval Interval { get; set; }

        /// <summary>
        /// Gets or Sets Adjustments
        /// </summary>
        [DataMember(Name = "adjustments", EmitDefaultValue = false)]
        public PostVendorChartIQTimeSeriesEodListRequestDataAdjustments Adjustments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostVendorChartIQTimeSeriesEodSubsampleGetRequestData {\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
            sb.Append("  Interval: ").Append(Interval).Append("\n");
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
            return this.Equals(input as PostVendorChartIQTimeSeriesEodSubsampleGetRequestData);
        }

        /// <summary>
        /// Returns true if PostVendorChartIQTimeSeriesEodSubsampleGetRequestData instances are equal
        /// </summary>
        /// <param name="input">Instance of PostVendorChartIQTimeSeriesEodSubsampleGetRequestData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostVendorChartIQTimeSeriesEodSubsampleGetRequestData input)
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
                    this.Interval == input.Interval ||
                    (this.Interval != null &&
                    this.Interval.Equals(input.Interval))
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
                if (this.Interval != null)
                {
                    hashCode = (hashCode * 59) + this.Interval.GetHashCode();
                }
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
