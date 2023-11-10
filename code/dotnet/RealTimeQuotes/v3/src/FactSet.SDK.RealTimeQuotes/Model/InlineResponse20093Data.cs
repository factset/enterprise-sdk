/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeQuotes.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeQuotes.Model
{
    /// <summary>
    /// Orderbook.
    /// </summary>
    [DataContract(Name = "inline_response_200_93_data")]
    public partial class InlineResponse20093Data : IEquatable<InlineResponse20093Data>, IValidatableObject
    {
        /// <summary>
        /// Quality of the price.
        /// </summary>
        /// <value>Quality of the price.</value>
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
            DLY = 2

        }


        /// <summary>
        /// Quality of the price.
        /// </summary>
        /// <value>Quality of the price.</value>
        [DataMember(Name = "quality", EmitDefaultValue = true)]
        public QualityEnum? Quality { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20093Data" /> class.
        /// </summary>
        /// <param name="idNotation">MDG identifier of the listing..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="quality">Quality of the price..</param>
        /// <param name="asks">List of sell orders aggregated by price..</param>
        /// <param name="bids">List of buy orders aggregated by price..</param>
        public InlineResponse20093Data(string idNotation = default(string), string sourceIdentifier = default(string), QualityEnum? quality = default(QualityEnum?), List<InlineResponse20093DataAsks> asks = default(List<InlineResponse20093DataAsks>), List<InlineResponse20093DataAsks> bids = default(List<InlineResponse20093DataAsks>))
        {
            this.IdNotation = idNotation;
            this.SourceIdentifier = sourceIdentifier;
            this.Quality = quality;
            this.Asks = asks;
            this.Bids = bids;
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
        /// List of sell orders aggregated by price.
        /// </summary>
        /// <value>List of sell orders aggregated by price.</value>
        [DataMember(Name = "asks", EmitDefaultValue = false)]
        public List<InlineResponse20093DataAsks> Asks { get; set; }

        /// <summary>
        /// List of buy orders aggregated by price.
        /// </summary>
        /// <value>List of buy orders aggregated by price.</value>
        [DataMember(Name = "bids", EmitDefaultValue = false)]
        public List<InlineResponse20093DataAsks> Bids { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20093Data {\n");
            sb.Append("  IdNotation: ").Append(IdNotation).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
            sb.Append("  Asks: ").Append(Asks).Append("\n");
            sb.Append("  Bids: ").Append(Bids).Append("\n");
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
            return this.Equals(input as InlineResponse20093Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20093Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20093Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20093Data input)
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
                    this.Quality == input.Quality ||
                    this.Quality.Equals(input.Quality)
                ) && 
                (
                    this.Asks == input.Asks ||
                    this.Asks != null &&
                    input.Asks != null &&
                    this.Asks.SequenceEqual(input.Asks)
                ) && 
                (
                    this.Bids == input.Bids ||
                    this.Bids != null &&
                    input.Bids != null &&
                    this.Bids.SequenceEqual(input.Bids)
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
                hashCode = (hashCode * 59) + this.Quality.GetHashCode();
                if (this.Asks != null)
                {
                    hashCode = (hashCode * 59) + this.Asks.GetHashCode();
                }
                if (this.Bids != null)
                {
                    hashCode = (hashCode * 59) + this.Bids.GetHashCode();
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