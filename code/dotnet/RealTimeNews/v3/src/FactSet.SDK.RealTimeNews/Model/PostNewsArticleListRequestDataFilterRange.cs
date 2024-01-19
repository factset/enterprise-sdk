/*
 * News API For Digital Portals
 *
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeNews.Model
{
    /// <summary>
    /// Time range for matching the news article&#39;s date. At most one of the attributes &#x60;start&#x60; or &#x60;end&#x60; may be &#x60;null&#x60;.
    /// </summary>
    [DataContract(Name = "PostNewsArticleListRequest_data_filter_range")]
    public partial class PostNewsArticleListRequestDataFilterRange : IEquatable<PostNewsArticleListRequestDataFilterRange>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostNewsArticleListRequestDataFilterRange" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostNewsArticleListRequestDataFilterRange() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostNewsArticleListRequestDataFilterRange" /> class.
        /// </summary>
        /// <param name="start">The starting point of the time range (inclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the past. (required).</param>
        /// <param name="end">The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future. (required).</param>
        public PostNewsArticleListRequestDataFilterRange(string start, string end)
        {
            // to ensure "start" is required (not null)
            if (start == null) {
                throw new ArgumentNullException("start is a required property for PostNewsArticleListRequestDataFilterRange and cannot be null");
            }
            this.Start = start;
            // to ensure "end" is required (not null)
            if (end == null) {
                throw new ArgumentNullException("end is a required property for PostNewsArticleListRequestDataFilterRange and cannot be null");
            }
            this.End = end;
        }

        /// <summary>
        /// The starting point of the time range (inclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the past.
        /// </summary>
        /// <value>The starting point of the time range (inclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the past.</value>
        [DataMember(Name = "start", IsRequired = true, EmitDefaultValue = false)]
        public string Start { get; set; }

        /// <summary>
        /// The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future.
        /// </summary>
        /// <value>The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future.</value>
        [DataMember(Name = "end", IsRequired = true, EmitDefaultValue = false)]
        public string End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostNewsArticleListRequestDataFilterRange {\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
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
            return this.Equals(input as PostNewsArticleListRequestDataFilterRange);
        }

        /// <summary>
        /// Returns true if PostNewsArticleListRequestDataFilterRange instances are equal
        /// </summary>
        /// <param name="input">Instance of PostNewsArticleListRequestDataFilterRange to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostNewsArticleListRequestDataFilterRange input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
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
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
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
