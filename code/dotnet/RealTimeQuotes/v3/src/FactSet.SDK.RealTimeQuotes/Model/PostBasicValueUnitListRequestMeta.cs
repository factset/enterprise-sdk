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
    /// The meta member contains the meta information of the request.
    /// </summary>
    [DataContract(Name = "PostBasicValueUnitListRequest_meta")]
    public partial class PostBasicValueUnitListRequestMeta : IEquatable<PostBasicValueUnitListRequestMeta>, IValidatableObject
    {
        /// <summary>
        /// Defines Sort
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SortEnum
        {
            /// <summary>
            /// Enum Name for value: name
            /// </summary>
            [EnumMember(Value = "name")]
            Name = 1,

            /// <summary>
            /// Enum MINUS_Name for value: -name
            /// </summary>
            [EnumMember(Value = "-name")]
            MINUS_Name = 2

        }



        /// <summary>
        /// Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
        /// </summary>
        /// <value>Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.</value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public HashSet<SortEnum> Sort { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostBasicValueUnitListRequestMeta" /> class.
        /// </summary>
        /// <param name="attributes">Limit the attributes returned in the response to the specified set..</param>
        /// <param name="language">ISO 639-1 code of the language..</param>
        /// <param name="sort">Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed..</param>
        public PostBasicValueUnitListRequestMeta(HashSet<string> attributes = default(HashSet<string>), string language = default(string), HashSet<SortEnum> sort = default(HashSet<SortEnum>))
        {
            this.Attributes = attributes;
            this.Language = language;
            this.Sort = sort;
        }

        /// <summary>
        /// Limit the attributes returned in the response to the specified set.
        /// </summary>
        /// <value>Limit the attributes returned in the response to the specified set.</value>
        [DataMember(Name = "attributes", EmitDefaultValue = false)]
        public HashSet<string> Attributes { get; set; }

        /// <summary>
        /// ISO 639-1 code of the language.
        /// </summary>
        /// <value>ISO 639-1 code of the language.</value>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public string Language { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostBasicValueUnitListRequestMeta {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
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
            return this.Equals(input as PostBasicValueUnitListRequestMeta);
        }

        /// <summary>
        /// Returns true if PostBasicValueUnitListRequestMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of PostBasicValueUnitListRequestMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostBasicValueUnitListRequestMeta input)
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
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
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
                if (this.Language != null)
                {
                    hashCode = (hashCode * 59) + this.Language.GetHashCode();
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
            // Language (string) maxLength
            if (this.Language != null && this.Language.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be less than 2.", new [] { "Language" });
            }

            // Language (string) minLength
            if (this.Language != null && this.Language.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be greater than 2.", new [] { "Language" });
            }

            yield break;
        }
    }

}
