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
    /// Pagination attributes for the offset-based pagination strategy; a total element count is not supported.
    /// </summary>
    [DataContract(Name = "OffsetBasedPaginationOutputObjectWithoutTotal")]
    public partial class OffsetBasedPaginationOutputObjectWithoutTotal : IEquatable<OffsetBasedPaginationOutputObjectWithoutTotal>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OffsetBasedPaginationOutputObjectWithoutTotal" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OffsetBasedPaginationOutputObjectWithoutTotal() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OffsetBasedPaginationOutputObjectWithoutTotal" /> class.
        /// </summary>
        /// <param name="hasNext">Flag indicating that a subsequent request with the same parameters, except that the parameter &#x60;pagination.offset&#x60; is incremented by &#x60;pagination.limit&#x60;, would yield additional results. (required).</param>
        public OffsetBasedPaginationOutputObjectWithoutTotal(bool hasNext)
        {
            this.HasNext = hasNext;
        }

        /// <summary>
        /// Flag indicating that a subsequent request with the same parameters, except that the parameter &#x60;pagination.offset&#x60; is incremented by &#x60;pagination.limit&#x60;, would yield additional results.
        /// </summary>
        /// <value>Flag indicating that a subsequent request with the same parameters, except that the parameter &#x60;pagination.offset&#x60; is incremented by &#x60;pagination.limit&#x60;, would yield additional results.</value>
        [DataMember(Name = "hasNext", IsRequired = true, EmitDefaultValue = true)]
        public bool HasNext { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OffsetBasedPaginationOutputObjectWithoutTotal {\n");
            sb.Append("  HasNext: ").Append(HasNext).Append("\n");
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
            return this.Equals(input as OffsetBasedPaginationOutputObjectWithoutTotal);
        }

        /// <summary>
        /// Returns true if OffsetBasedPaginationOutputObjectWithoutTotal instances are equal
        /// </summary>
        /// <param name="input">Instance of OffsetBasedPaginationOutputObjectWithoutTotal to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OffsetBasedPaginationOutputObjectWithoutTotal input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.HasNext == input.HasNext ||
                    this.HasNext.Equals(input.HasNext)
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
                hashCode = (hashCode * 59) + this.HasNext.GetHashCode();
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
