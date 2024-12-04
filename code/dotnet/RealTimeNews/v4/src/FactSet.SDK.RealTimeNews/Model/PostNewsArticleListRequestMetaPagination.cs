/*
 * Real-Time News API
 *
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeNews.Model
{
    /// <summary>
    /// Pagination attributes for the cursor-based pagination strategy.
    /// </summary>
    [DataContract(Name = "PostNewsArticleListRequest_meta_pagination")]
    public partial class PostNewsArticleListRequestMetaPagination : IEquatable<PostNewsArticleListRequestMetaPagination>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostNewsArticleListRequestMetaPagination" /> class.
        /// </summary>
        /// <param name="cursor">Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default)..</param>
        /// <param name="limit">Non-negative maximum number of entries to return. (default to 20).</param>
        public PostNewsArticleListRequestMetaPagination(string cursor = default(string), int limit = 20)
        {
            this.Cursor = cursor;
            this.Limit = limit;
        }

        /// <summary>
        /// Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default).
        /// </summary>
        /// <value>Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default).</value>
        [DataMember(Name = "cursor", EmitDefaultValue = false)]
        public string Cursor { get; set; }

        /// <summary>
        /// Non-negative maximum number of entries to return.
        /// </summary>
        /// <value>Non-negative maximum number of entries to return.</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostNewsArticleListRequestMetaPagination {\n");
            sb.Append("  Cursor: ").Append(Cursor).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
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
            return this.Equals(input as PostNewsArticleListRequestMetaPagination);
        }

        /// <summary>
        /// Returns true if PostNewsArticleListRequestMetaPagination instances are equal
        /// </summary>
        /// <param name="input">Instance of PostNewsArticleListRequestMetaPagination to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostNewsArticleListRequestMetaPagination input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Cursor == input.Cursor ||
                    (this.Cursor != null &&
                    this.Cursor.Equals(input.Cursor))
                ) && 
                (
                    this.Limit == input.Limit ||
                    this.Limit.Equals(input.Limit)
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
                if (this.Cursor != null)
                {
                    hashCode = (hashCode * 59) + this.Cursor.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Limit.GetHashCode();
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
            // Cursor (string) maxLength
            if (this.Cursor != null && this.Cursor.Length > 50)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Cursor, length must be less than 50.", new [] { "Cursor" });
            }

            // Limit (int) maximum
            if (this.Limit > (int)500)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Limit, must be a value less than or equal to 500.", new [] { "Limit" });
            }

            // Limit (int) minimum
            if (this.Limit < (int)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Limit, must be a value greater than or equal to 1.", new [] { "Limit" });
            }

            yield break;
        }
    }

}
