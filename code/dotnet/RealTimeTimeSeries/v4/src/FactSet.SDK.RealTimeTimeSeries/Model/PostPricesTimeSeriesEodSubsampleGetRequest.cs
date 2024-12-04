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
    /// Request Body
    /// </summary>
    [DataContract(Name = "PostPricesTimeSeriesEodSubsampleGetRequest")]
    public partial class PostPricesTimeSeriesEodSubsampleGetRequest : IEquatable<PostPricesTimeSeriesEodSubsampleGetRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostPricesTimeSeriesEodSubsampleGetRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostPricesTimeSeriesEodSubsampleGetRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostPricesTimeSeriesEodSubsampleGetRequest" /> class.
        /// </summary>
        /// <param name="data">data (required).</param>
        /// <param name="meta">meta.</param>
        public PostPricesTimeSeriesEodSubsampleGetRequest(PostPricesTimeSeriesEodSubsampleGetRequestData data,PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta meta = default(PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta))
        {
            // to ensure "data" is required (not null)
            if (data == null) {
                throw new ArgumentNullException("data is a required property for PostPricesTimeSeriesEodSubsampleGetRequest and cannot be null");
            }
            this.Data = data;
            this.Meta = meta;
        }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = false)]
        public PostPricesTimeSeriesEodSubsampleGetRequestData Data { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", EmitDefaultValue = false)]
        public PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta Meta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostPricesTimeSeriesEodSubsampleGetRequest {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
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
            return this.Equals(input as PostPricesTimeSeriesEodSubsampleGetRequest);
        }

        /// <summary>
        /// Returns true if PostPricesTimeSeriesEodSubsampleGetRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of PostPricesTimeSeriesEodSubsampleGetRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostPricesTimeSeriesEodSubsampleGetRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Data == input.Data ||
                    (this.Data != null &&
                    this.Data.Equals(input.Data))
                ) && 
                (
                    this.Meta == input.Meta ||
                    (this.Meta != null &&
                    this.Meta.Equals(input.Meta))
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
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
                }
                if (this.Meta != null)
                {
                    hashCode = (hashCode * 59) + this.Meta.GetHashCode();
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
