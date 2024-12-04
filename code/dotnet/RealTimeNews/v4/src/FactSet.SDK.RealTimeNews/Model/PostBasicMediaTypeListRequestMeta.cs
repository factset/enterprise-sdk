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
    /// The meta member contains the meta information of the request.
    /// </summary>
    [DataContract(Name = "PostBasicMediaTypeListRequest_meta")]
    public partial class PostBasicMediaTypeListRequestMeta : IEquatable<PostBasicMediaTypeListRequestMeta>, IValidatableObject
    {
        /// <summary>
        /// Defines Sort
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SortEnum
        {
            /// <summary>
            /// Enum Id for value: id
            /// </summary>
            [EnumMember(Value = "id")]
            Id = 1,

            /// <summary>
            /// Enum MINUS_Id for value: -id
            /// </summary>
            [EnumMember(Value = "-id")]
            MINUS_Id = 2,

            /// <summary>
            /// Enum Name for value: name
            /// </summary>
            [EnumMember(Value = "name")]
            Name = 3,

            /// <summary>
            /// Enum MINUS_Name for value: -name
            /// </summary>
            [EnumMember(Value = "-name")]
            MINUS_Name = 4

        }



        /// <summary>
        /// Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | id | | -id | | name | | -name |  
        /// </summary>
        /// <value>Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | id | | -id | | name | | -name |  </value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public HashSet<SortEnum> Sort { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostBasicMediaTypeListRequestMeta" /> class.
        /// </summary>
        /// <param name="attributes">Limit the attributes returned in the response to the specified set..</param>
        /// <param name="sort">Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | id | | -id | | name | | -name |  .</param>
        public PostBasicMediaTypeListRequestMeta(HashSet<string> attributes = default(HashSet<string>), HashSet<SortEnum> sort = default(HashSet<SortEnum>))
        {
            this.Attributes = attributes;
            this.Sort = sort;
        }

        /// <summary>
        /// Limit the attributes returned in the response to the specified set.
        /// </summary>
        /// <value>Limit the attributes returned in the response to the specified set.</value>
        [DataMember(Name = "attributes", EmitDefaultValue = false)]
        public HashSet<string> Attributes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostBasicMediaTypeListRequestMeta {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
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
            return this.Equals(input as PostBasicMediaTypeListRequestMeta);
        }

        /// <summary>
        /// Returns true if PostBasicMediaTypeListRequestMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of PostBasicMediaTypeListRequestMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostBasicMediaTypeListRequestMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Attributes == input.Attributes ||
                    this.Attributes != null &&
                    input.Attributes != null &&
                    this.Attributes.SequenceEqual(input.Attributes)
                ) && 
                (
                    this.Sort == input.Sort ||
                    this.Sort.SequenceEqual(input.Sort)
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
                if (this.Attributes != null)
                {
                    hashCode = (hashCode * 59) + this.Attributes.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Sort.GetHashCode();
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
