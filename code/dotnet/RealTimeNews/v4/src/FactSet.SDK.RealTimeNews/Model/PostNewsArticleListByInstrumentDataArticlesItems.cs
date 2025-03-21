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
    [DataContract(Name = "PostNewsArticleListByInstrumentDataArticlesItems")]
    public partial class PostNewsArticleListByInstrumentDataArticlesItems : IEquatable<PostNewsArticleListByInstrumentDataArticlesItems>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostNewsArticleListByInstrumentDataArticlesItems" /> class.
        /// </summary>
        /// <param name="code">Identifier of the news article..</param>
        /// <param name="time">Date and time of the news article..</param>
        /// <param name="headline">Headline of the news article represented as text with HTML entity encoding but without HTML tags..</param>
        /// <param name="summary">Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor..</param>
        /// <param name="types">Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values..</param>
        /// <param name="language">language.</param>
        /// <param name="distributor">distributor.</param>
        /// <param name="publisher">publisher.</param>
        /// <param name="categories">Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values..</param>
        /// <param name="chain">chain.</param>
        /// <param name="instruments">Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off..</param>
        public PostNewsArticleListByInstrumentDataArticlesItems(string code = default(string), DateTime? time = default(DateTime?), string headline = default(string), string summary = default(string), List<PostNewsArticleListByInstrumentDataArticlesTypesItems> types = default(List<PostNewsArticleListByInstrumentDataArticlesTypesItems>), PostNewsArticleListByInstrumentDataArticlesItemsLanguage language = default(PostNewsArticleListByInstrumentDataArticlesItemsLanguage), PostNewsArticleListByInstrumentDataArticlesItemsDistributor distributor = default(PostNewsArticleListByInstrumentDataArticlesItemsDistributor), PostNewsArticleListByInstrumentDataArticlesItemsPublisher publisher = default(PostNewsArticleListByInstrumentDataArticlesItemsPublisher), List<PostNewsArticleListByInstrumentDataArticlesCategoriesItems> categories = default(List<PostNewsArticleListByInstrumentDataArticlesCategoriesItems>), PostNewsArticleListByInstrumentDataArticlesItemsChain chain = default(PostNewsArticleListByInstrumentDataArticlesItemsChain), List<PostNewsArticleListByInstrumentDataArticlesInstrumentsItems> instruments = default(List<PostNewsArticleListByInstrumentDataArticlesInstrumentsItems>))
        {
            this.Code = code;
            this.Time = time;
            this.Headline = headline;
            this.Summary = summary;
            this.Types = types;
            this.Language = language;
            this.Distributor = distributor;
            this.Publisher = publisher;
            this.Categories = categories;
            this.Chain = chain;
            this.Instruments = instruments;
        }

        /// <summary>
        /// Identifier of the news article.
        /// </summary>
        /// <value>Identifier of the news article.</value>
        [DataMember(Name = "code", EmitDefaultValue = true)]
        public string Code { get; set; }

        /// <summary>
        /// Date and time of the news article.
        /// </summary>
        /// <value>Date and time of the news article.</value>
        [DataMember(Name = "time", EmitDefaultValue = true)]
        public DateTime? Time { get; set; }

        /// <summary>
        /// Headline of the news article represented as text with HTML entity encoding but without HTML tags.
        /// </summary>
        /// <value>Headline of the news article represented as text with HTML entity encoding but without HTML tags.</value>
        [DataMember(Name = "headline", EmitDefaultValue = true)]
        public string Headline { get; set; }

        /// <summary>
        /// Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor.
        /// </summary>
        /// <value>Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor.</value>
        [DataMember(Name = "summary", EmitDefaultValue = true)]
        public string Summary { get; set; }

        /// <summary>
        /// Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values.
        /// </summary>
        /// <value>Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values.</value>
        [DataMember(Name = "types", EmitDefaultValue = false)]
        public List<PostNewsArticleListByInstrumentDataArticlesTypesItems> Types { get; set; }

        /// <summary>
        /// Gets or Sets Language
        /// </summary>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public PostNewsArticleListByInstrumentDataArticlesItemsLanguage Language { get; set; }

        /// <summary>
        /// Gets or Sets Distributor
        /// </summary>
        [DataMember(Name = "distributor", EmitDefaultValue = false)]
        public PostNewsArticleListByInstrumentDataArticlesItemsDistributor Distributor { get; set; }

        /// <summary>
        /// Gets or Sets Publisher
        /// </summary>
        [DataMember(Name = "publisher", EmitDefaultValue = false)]
        public PostNewsArticleListByInstrumentDataArticlesItemsPublisher Publisher { get; set; }

        /// <summary>
        /// Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values.
        /// </summary>
        /// <value>Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values.</value>
        [DataMember(Name = "categories", EmitDefaultValue = false)]
        public List<PostNewsArticleListByInstrumentDataArticlesCategoriesItems> Categories { get; set; }

        /// <summary>
        /// Gets or Sets Chain
        /// </summary>
        [DataMember(Name = "chain", EmitDefaultValue = false)]
        public PostNewsArticleListByInstrumentDataArticlesItemsChain Chain { get; set; }

        /// <summary>
        /// Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off.
        /// </summary>
        /// <value>Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off.</value>
        [DataMember(Name = "instruments", EmitDefaultValue = false)]
        public List<PostNewsArticleListByInstrumentDataArticlesInstrumentsItems> Instruments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostNewsArticleListByInstrumentDataArticlesItems {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  Headline: ").Append(Headline).Append("\n");
            sb.Append("  Summary: ").Append(Summary).Append("\n");
            sb.Append("  Types: ").Append(Types).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  Distributor: ").Append(Distributor).Append("\n");
            sb.Append("  Publisher: ").Append(Publisher).Append("\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  Chain: ").Append(Chain).Append("\n");
            sb.Append("  Instruments: ").Append(Instruments).Append("\n");
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
            return this.Equals(input as PostNewsArticleListByInstrumentDataArticlesItems);
        }

        /// <summary>
        /// Returns true if PostNewsArticleListByInstrumentDataArticlesItems instances are equal
        /// </summary>
        /// <param name="input">Instance of PostNewsArticleListByInstrumentDataArticlesItems to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostNewsArticleListByInstrumentDataArticlesItems input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Time == input.Time ||
                    (this.Time != null &&
                    this.Time.Equals(input.Time))
                ) && 
                (
                    this.Headline == input.Headline ||
                    (this.Headline != null &&
                    this.Headline.Equals(input.Headline))
                ) && 
                (
                    this.Summary == input.Summary ||
                    (this.Summary != null &&
                    this.Summary.Equals(input.Summary))
                ) && 
                (
                    this.Types == input.Types ||
                    this.Types != null &&
                    input.Types != null &&
                    this.Types.SequenceEqual(input.Types)
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
                ) && 
                (
                    this.Distributor == input.Distributor ||
                    (this.Distributor != null &&
                    this.Distributor.Equals(input.Distributor))
                ) && 
                (
                    this.Publisher == input.Publisher ||
                    (this.Publisher != null &&
                    this.Publisher.Equals(input.Publisher))
                ) && 
                (
                    this.Categories == input.Categories ||
                    this.Categories != null &&
                    input.Categories != null &&
                    this.Categories.SequenceEqual(input.Categories)
                ) && 
                (
                    this.Chain == input.Chain ||
                    (this.Chain != null &&
                    this.Chain.Equals(input.Chain))
                ) && 
                (
                    this.Instruments == input.Instruments ||
                    this.Instruments != null &&
                    input.Instruments != null &&
                    this.Instruments.SequenceEqual(input.Instruments)
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Time != null)
                {
                    hashCode = (hashCode * 59) + this.Time.GetHashCode();
                }
                if (this.Headline != null)
                {
                    hashCode = (hashCode * 59) + this.Headline.GetHashCode();
                }
                if (this.Summary != null)
                {
                    hashCode = (hashCode * 59) + this.Summary.GetHashCode();
                }
                if (this.Types != null)
                {
                    hashCode = (hashCode * 59) + this.Types.GetHashCode();
                }
                if (this.Language != null)
                {
                    hashCode = (hashCode * 59) + this.Language.GetHashCode();
                }
                if (this.Distributor != null)
                {
                    hashCode = (hashCode * 59) + this.Distributor.GetHashCode();
                }
                if (this.Publisher != null)
                {
                    hashCode = (hashCode * 59) + this.Publisher.GetHashCode();
                }
                if (this.Categories != null)
                {
                    hashCode = (hashCode * 59) + this.Categories.GetHashCode();
                }
                if (this.Chain != null)
                {
                    hashCode = (hashCode * 59) + this.Chain.GetHashCode();
                }
                if (this.Instruments != null)
                {
                    hashCode = (hashCode * 59) + this.Instruments.GetHashCode();
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
