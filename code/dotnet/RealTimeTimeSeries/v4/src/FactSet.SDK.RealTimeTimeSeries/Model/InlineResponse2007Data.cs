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
    /// Subsampled time series data for the notation.
    /// </summary>
    [DataContract(Name = "inline_response_200_7_data")]
    public partial class InlineResponse2007Data : IEquatable<InlineResponse2007Data>, IValidatableObject
    {
        /// <summary>
        /// Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |  
        /// </summary>
        /// <value>Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |  </value>
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
            EOD = 2

        }


        /// <summary>
        /// Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |  
        /// </summary>
        /// <value>Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |  </value>
        [DataMember(Name = "quality", EmitDefaultValue = true)]
        public QualityEnum? Quality { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2007Data" /> class.
        /// </summary>
        /// <param name="idNotation">MDG identifier of the listing..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="range">range.</param>
        /// <param name="quality">Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |  .</param>
        /// <param name="subsamples">List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258)..</param>
        public InlineResponse2007Data(string idNotation = default(string), string sourceIdentifier = default(string), InlineResponse200DataRange range = default(InlineResponse200DataRange), QualityEnum? quality = default(QualityEnum?), List<PostPricesTimeSeriesEodSubsampleListDataSubsamplesItems> subsamples = default(List<PostPricesTimeSeriesEodSubsampleListDataSubsamplesItems>))
        {
            this.IdNotation = idNotation;
            this.SourceIdentifier = sourceIdentifier;
            this.Range = range;
            this.Quality = quality;
            this.Subsamples = subsamples;
        }

        /// <summary>
        /// MDG identifier of the listing.
        /// </summary>
        /// <value>MDG identifier of the listing.</value>
        [DataMember(Name = "idNotation", EmitDefaultValue = true)]
        public string IdNotation { get; set; }

        /// <summary>
        /// Identifier used in the request.
        /// </summary>
        /// <value>Identifier used in the request.</value>
        [DataMember(Name = "sourceIdentifier", EmitDefaultValue = true)]
        public string SourceIdentifier { get; set; }

        /// <summary>
        /// Gets or Sets Range
        /// </summary>
        [DataMember(Name = "range", EmitDefaultValue = true)]
        public InlineResponse200DataRange Range { get; set; }

        /// <summary>
        /// List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258).
        /// </summary>
        /// <value>List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258).</value>
        [DataMember(Name = "subsamples", EmitDefaultValue = false)]
        public List<PostPricesTimeSeriesEodSubsampleListDataSubsamplesItems> Subsamples { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2007Data {\n");
            sb.Append("  IdNotation: ").Append(IdNotation).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  Range: ").Append(Range).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
            sb.Append("  Subsamples: ").Append(Subsamples).Append("\n");
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
            return this.Equals(input as InlineResponse2007Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2007Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2007Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2007Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IdNotation == input.IdNotation ||
                    (this.IdNotation != null &&
                    this.IdNotation.Equals(input.IdNotation))
                ) && 
                (
                    this.SourceIdentifier == input.SourceIdentifier ||
                    (this.SourceIdentifier != null &&
                    this.SourceIdentifier.Equals(input.SourceIdentifier))
                ) && 
                (
                    this.Range == input.Range ||
                    (this.Range != null &&
                    this.Range.Equals(input.Range))
                ) && 
                (
                    this.Quality == input.Quality ||
                    this.Quality.Equals(input.Quality)
                ) && 
                (
                    this.Subsamples == input.Subsamples ||
                    this.Subsamples != null &&
                    input.Subsamples != null &&
                    this.Subsamples.SequenceEqual(input.Subsamples)
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
                if (this.IdNotation != null)
                {
                    hashCode = (hashCode * 59) + this.IdNotation.GetHashCode();
                }
                if (this.SourceIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.SourceIdentifier.GetHashCode();
                }
                if (this.Range != null)
                {
                    hashCode = (hashCode * 59) + this.Range.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Quality.GetHashCode();
                if (this.Subsamples != null)
                {
                    hashCode = (hashCode * 59) + this.Subsamples.GetHashCode();
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
