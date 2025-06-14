/*
 * News API
 *
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetNews.Model
{
    /// <summary>
    /// SearchResponseArrayObject
    /// </summary>
    [DataContract(Name = "SearchResponseArrayObject")]
    public partial class SearchResponseArrayObject : IEquatable<SearchResponseArrayObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SearchResponseArrayObject" /> class.
        /// </summary>
        /// <param name="storyDateAndTime">The timestamp when the headline was published..</param>
        /// <param name="headlines">The Headline..</param>
        /// <param name="id">The ID associated with the headline..</param>
        /// <param name="url">The URI associated with the headline..</param>
        /// <param name="source">The source associated with the headline..</param>
        /// <param name="product">The source associated with the headline..</param>
        /// <param name="primarySymbols">The primary symbols associated with the headline..</param>
        /// <param name="symbols">All symbols associated with the headline..</param>
        /// <param name="subjects">All subjects associated with the headline..</param>
        /// <param name="fdsSubject">The filters associated with the headline..</param>
        public SearchResponseArrayObject(DateTime storyDateAndTime = default(DateTime), string headlines = default(string), string id = default(string), string url = default(string), string source = default(string), string product = default(string), List<string> primarySymbols = default(List<string>), List<string> symbols = default(List<string>), List<string> subjects = default(List<string>), string fdsSubject = default(string))
        {
            this.StoryDateAndTime = storyDateAndTime;
            this.Headlines = headlines;
            this.Id = id;
            this.Url = url;
            this.Source = source;
            this.Product = product;
            this.PrimarySymbols = primarySymbols;
            this.Symbols = symbols;
            this.Subjects = subjects;
            this.FdsSubject = fdsSubject;
        }

        /// <summary>
        /// The timestamp when the headline was published.
        /// </summary>
        /// <value>The timestamp when the headline was published.</value>
        [DataMember(Name = "storyDateAndTime", EmitDefaultValue = false)]
        public DateTime StoryDateAndTime { get; set; }

        /// <summary>
        /// The Headline.
        /// </summary>
        /// <value>The Headline.</value>
        [DataMember(Name = "headlines", EmitDefaultValue = false)]
        public string Headlines { get; set; }

        /// <summary>
        /// The ID associated with the headline.
        /// </summary>
        /// <value>The ID associated with the headline.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// The URI associated with the headline.
        /// </summary>
        /// <value>The URI associated with the headline.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// The source associated with the headline.
        /// </summary>
        /// <value>The source associated with the headline.</value>
        [DataMember(Name = "source", EmitDefaultValue = false)]
        public string Source { get; set; }

        /// <summary>
        /// The source associated with the headline.
        /// </summary>
        /// <value>The source associated with the headline.</value>
        [DataMember(Name = "product", EmitDefaultValue = false)]
        public string Product { get; set; }

        /// <summary>
        /// The primary symbols associated with the headline.
        /// </summary>
        /// <value>The primary symbols associated with the headline.</value>
        [DataMember(Name = "primarySymbols", EmitDefaultValue = false)]
        public List<string> PrimarySymbols { get; set; }

        /// <summary>
        /// All symbols associated with the headline.
        /// </summary>
        /// <value>All symbols associated with the headline.</value>
        [DataMember(Name = "symbols", EmitDefaultValue = false)]
        public List<string> Symbols { get; set; }

        /// <summary>
        /// All subjects associated with the headline.
        /// </summary>
        /// <value>All subjects associated with the headline.</value>
        [DataMember(Name = "subjects", EmitDefaultValue = false)]
        public List<string> Subjects { get; set; }

        /// <summary>
        /// The filters associated with the headline.
        /// </summary>
        /// <value>The filters associated with the headline.</value>
        [DataMember(Name = "fdsSubject", EmitDefaultValue = false)]
        public string FdsSubject { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SearchResponseArrayObject {\n");
            sb.Append("  StoryDateAndTime: ").Append(StoryDateAndTime).Append("\n");
            sb.Append("  Headlines: ").Append(Headlines).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Product: ").Append(Product).Append("\n");
            sb.Append("  PrimarySymbols: ").Append(PrimarySymbols).Append("\n");
            sb.Append("  Symbols: ").Append(Symbols).Append("\n");
            sb.Append("  Subjects: ").Append(Subjects).Append("\n");
            sb.Append("  FdsSubject: ").Append(FdsSubject).Append("\n");
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
            return this.Equals(input as SearchResponseArrayObject);
        }

        /// <summary>
        /// Returns true if SearchResponseArrayObject instances are equal
        /// </summary>
        /// <param name="input">Instance of SearchResponseArrayObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SearchResponseArrayObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.StoryDateAndTime == input.StoryDateAndTime ||
                    (this.StoryDateAndTime != null &&
                    this.StoryDateAndTime.Equals(input.StoryDateAndTime))
                ) && 
                (
                    this.Headlines == input.Headlines ||
                    (this.Headlines != null &&
                    this.Headlines.Equals(input.Headlines))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
                ) && 
                (
                    this.Product == input.Product ||
                    (this.Product != null &&
                    this.Product.Equals(input.Product))
                ) && 
                (
                    this.PrimarySymbols == input.PrimarySymbols ||
                    this.PrimarySymbols != null &&
                    input.PrimarySymbols != null &&
                    this.PrimarySymbols.SequenceEqual(input.PrimarySymbols)
                ) && 
                (
                    this.Symbols == input.Symbols ||
                    this.Symbols != null &&
                    input.Symbols != null &&
                    this.Symbols.SequenceEqual(input.Symbols)
                ) && 
                (
                    this.Subjects == input.Subjects ||
                    this.Subjects != null &&
                    input.Subjects != null &&
                    this.Subjects.SequenceEqual(input.Subjects)
                ) && 
                (
                    this.FdsSubject == input.FdsSubject ||
                    (this.FdsSubject != null &&
                    this.FdsSubject.Equals(input.FdsSubject))
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
                if (this.StoryDateAndTime != null)
                {
                    hashCode = (hashCode * 59) + this.StoryDateAndTime.GetHashCode();
                }
                if (this.Headlines != null)
                {
                    hashCode = (hashCode * 59) + this.Headlines.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.Source != null)
                {
                    hashCode = (hashCode * 59) + this.Source.GetHashCode();
                }
                if (this.Product != null)
                {
                    hashCode = (hashCode * 59) + this.Product.GetHashCode();
                }
                if (this.PrimarySymbols != null)
                {
                    hashCode = (hashCode * 59) + this.PrimarySymbols.GetHashCode();
                }
                if (this.Symbols != null)
                {
                    hashCode = (hashCode * 59) + this.Symbols.GetHashCode();
                }
                if (this.Subjects != null)
                {
                    hashCode = (hashCode * 59) + this.Subjects.GetHashCode();
                }
                if (this.FdsSubject != null)
                {
                    hashCode = (hashCode * 59) + this.FdsSubject.GetHashCode();
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
