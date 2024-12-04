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
    /// A list of objects. For semantical context see the description of the parent array.
    /// </summary>
    [DataContract(Name = "GetNewsArticleGetDataMediaItems")]
    public partial class GetNewsArticleGetDataMediaItems : IEquatable<GetNewsArticleGetDataMediaItems>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetNewsArticleGetDataMediaItems" /> class.
        /// </summary>
        /// <param name="url">URL of the media element. The URL is publicly available and hosted by either the publisher, the distributor, or FactSet..</param>
        /// <param name="mimeType">MIME type of the data of the media element..</param>
        /// <param name="caption">Caption text that can be displayed with the media element. Empty if no caption is available for this media element..</param>
        /// <param name="alternativeText">A short description of the media element that can be shown instead of the media element itself..</param>
        /// <param name="width">Width of the media element in pixels if applicable..</param>
        /// <param name="height">Height of the media element in pixels if applicable..</param>
        public GetNewsArticleGetDataMediaItems(string url = default(string), string mimeType = default(string), string caption = default(string), string alternativeText = default(string), decimal? width = default(decimal?), decimal? height = default(decimal?))
        {
            this.Url = url;
            this.MimeType = mimeType;
            this.Caption = caption;
            this.AlternativeText = alternativeText;
            this.Width = width;
            this.Height = height;
        }

        /// <summary>
        /// URL of the media element. The URL is publicly available and hosted by either the publisher, the distributor, or FactSet.
        /// </summary>
        /// <value>URL of the media element. The URL is publicly available and hosted by either the publisher, the distributor, or FactSet.</value>
        [DataMember(Name = "url", EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// MIME type of the data of the media element.
        /// </summary>
        /// <value>MIME type of the data of the media element.</value>
        [DataMember(Name = "mimeType", EmitDefaultValue = true)]
        public string MimeType { get; set; }

        /// <summary>
        /// Caption text that can be displayed with the media element. Empty if no caption is available for this media element.
        /// </summary>
        /// <value>Caption text that can be displayed with the media element. Empty if no caption is available for this media element.</value>
        [DataMember(Name = "caption", EmitDefaultValue = true)]
        public string Caption { get; set; }

        /// <summary>
        /// A short description of the media element that can be shown instead of the media element itself.
        /// </summary>
        /// <value>A short description of the media element that can be shown instead of the media element itself.</value>
        [DataMember(Name = "alternativeText", EmitDefaultValue = true)]
        public string AlternativeText { get; set; }

        /// <summary>
        /// Width of the media element in pixels if applicable.
        /// </summary>
        /// <value>Width of the media element in pixels if applicable.</value>
        [DataMember(Name = "width", EmitDefaultValue = true)]
        public decimal? Width { get; set; }

        /// <summary>
        /// Height of the media element in pixels if applicable.
        /// </summary>
        /// <value>Height of the media element in pixels if applicable.</value>
        [DataMember(Name = "height", EmitDefaultValue = true)]
        public decimal? Height { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetNewsArticleGetDataMediaItems {\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  MimeType: ").Append(MimeType).Append("\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  AlternativeText: ").Append(AlternativeText).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
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
            return this.Equals(input as GetNewsArticleGetDataMediaItems);
        }

        /// <summary>
        /// Returns true if GetNewsArticleGetDataMediaItems instances are equal
        /// </summary>
        /// <param name="input">Instance of GetNewsArticleGetDataMediaItems to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetNewsArticleGetDataMediaItems input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.MimeType == input.MimeType ||
                    (this.MimeType != null &&
                    this.MimeType.Equals(input.MimeType))
                ) && 
                (
                    this.Caption == input.Caption ||
                    (this.Caption != null &&
                    this.Caption.Equals(input.Caption))
                ) && 
                (
                    this.AlternativeText == input.AlternativeText ||
                    (this.AlternativeText != null &&
                    this.AlternativeText.Equals(input.AlternativeText))
                ) && 
                (
                    this.Width == input.Width ||
                    (this.Width != null &&
                    this.Width.Equals(input.Width))
                ) && 
                (
                    this.Height == input.Height ||
                    (this.Height != null &&
                    this.Height.Equals(input.Height))
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
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.MimeType != null)
                {
                    hashCode = (hashCode * 59) + this.MimeType.GetHashCode();
                }
                if (this.Caption != null)
                {
                    hashCode = (hashCode * 59) + this.Caption.GetHashCode();
                }
                if (this.AlternativeText != null)
                {
                    hashCode = (hashCode * 59) + this.AlternativeText.GetHashCode();
                }
                if (this.Width != null)
                {
                    hashCode = (hashCode * 59) + this.Width.GetHashCode();
                }
                if (this.Height != null)
                {
                    hashCode = (hashCode * 59) + this.Height.GetHashCode();
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
