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
    /// CreateOrEditViewBodyData
    /// </summary>
    [DataContract(Name = "CreateOrEditViewBody_data")]
    public partial class CreateOrEditViewBodyData : IEquatable<CreateOrEditViewBodyData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateOrEditViewBodyData" /> class.
        /// </summary>
        /// <param name="name">The name of the view..</param>
        /// <param name="tickers">tickers.</param>
        /// <param name="isPrimary">If true, then only stories with the provided ticker as a primary symbol will be returned. When this parameter is false, the symbol is either primary OR a related symbol will be returned..</param>
        /// <param name="categories">categories.</param>
        /// <param name="countries">countries.</param>
        /// <param name="regions">regions.</param>
        /// <param name="sources">sources.</param>
        /// <param name="topics">An array of topics associated with the view..</param>
        /// <param name="quickAlert">Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not..</param>
        public CreateOrEditViewBodyData(string name = default(string), List<CreateOrEditViewTickers> tickers = default(List<CreateOrEditViewTickers>), bool isPrimary = default(bool), List<string> categories = default(List<string>), List<string> countries = default(List<string>), List<string> regions = default(List<string>), List<string> sources = default(List<string>), List<string> topics = default(List<string>), bool quickAlert = default(bool))
        {
            this.Name = name;
            this.Tickers = tickers;
            this.IsPrimary = isPrimary;
            this.Categories = categories;
            this.Countries = countries;
            this.Regions = regions;
            this.Sources = sources;
            this.Topics = topics;
            this.QuickAlert = quickAlert;
        }

        /// <summary>
        /// The name of the view.
        /// </summary>
        /// <value>The name of the view.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Tickers
        /// </summary>
        [DataMember(Name = "tickers", EmitDefaultValue = false)]
        public List<CreateOrEditViewTickers> Tickers { get; set; }

        /// <summary>
        /// If true, then only stories with the provided ticker as a primary symbol will be returned. When this parameter is false, the symbol is either primary OR a related symbol will be returned.
        /// </summary>
        /// <value>If true, then only stories with the provided ticker as a primary symbol will be returned. When this parameter is false, the symbol is either primary OR a related symbol will be returned.</value>
        [DataMember(Name = "isPrimary", EmitDefaultValue = true)]
        public bool IsPrimary { get; set; }

        /// <summary>
        /// Gets or Sets Categories
        /// </summary>
        [DataMember(Name = "categories", EmitDefaultValue = false)]
        public List<string> Categories { get; set; }

        /// <summary>
        /// Gets or Sets Countries
        /// </summary>
        [DataMember(Name = "countries", EmitDefaultValue = false)]
        public List<string> Countries { get; set; }

        /// <summary>
        /// Gets or Sets Regions
        /// </summary>
        [DataMember(Name = "regions", EmitDefaultValue = false)]
        public List<string> Regions { get; set; }

        /// <summary>
        /// Gets or Sets Sources
        /// </summary>
        [DataMember(Name = "sources", EmitDefaultValue = false)]
        public List<string> Sources { get; set; }

        /// <summary>
        /// An array of topics associated with the view.
        /// </summary>
        /// <value>An array of topics associated with the view.</value>
        [DataMember(Name = "topics", EmitDefaultValue = false)]
        public List<string> Topics { get; set; }

        /// <summary>
        /// Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not.
        /// </summary>
        /// <value>Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not.</value>
        [DataMember(Name = "quickAlert", EmitDefaultValue = true)]
        public bool QuickAlert { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateOrEditViewBodyData {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Tickers: ").Append(Tickers).Append("\n");
            sb.Append("  IsPrimary: ").Append(IsPrimary).Append("\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  Countries: ").Append(Countries).Append("\n");
            sb.Append("  Regions: ").Append(Regions).Append("\n");
            sb.Append("  Sources: ").Append(Sources).Append("\n");
            sb.Append("  Topics: ").Append(Topics).Append("\n");
            sb.Append("  QuickAlert: ").Append(QuickAlert).Append("\n");
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
            return this.Equals(input as CreateOrEditViewBodyData);
        }

        /// <summary>
        /// Returns true if CreateOrEditViewBodyData instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateOrEditViewBodyData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateOrEditViewBodyData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Tickers == input.Tickers ||
                    this.Tickers != null &&
                    input.Tickers != null &&
                    this.Tickers.SequenceEqual(input.Tickers)
                ) && 
                (
                    this.IsPrimary == input.IsPrimary ||
                    this.IsPrimary.Equals(input.IsPrimary)
                ) && 
                (
                    this.Categories == input.Categories ||
                    this.Categories != null &&
                    input.Categories != null &&
                    this.Categories.SequenceEqual(input.Categories)
                ) && 
                (
                    this.Countries == input.Countries ||
                    this.Countries != null &&
                    input.Countries != null &&
                    this.Countries.SequenceEqual(input.Countries)
                ) && 
                (
                    this.Regions == input.Regions ||
                    this.Regions != null &&
                    input.Regions != null &&
                    this.Regions.SequenceEqual(input.Regions)
                ) && 
                (
                    this.Sources == input.Sources ||
                    this.Sources != null &&
                    input.Sources != null &&
                    this.Sources.SequenceEqual(input.Sources)
                ) && 
                (
                    this.Topics == input.Topics ||
                    this.Topics != null &&
                    input.Topics != null &&
                    this.Topics.SequenceEqual(input.Topics)
                ) && 
                (
                    this.QuickAlert == input.QuickAlert ||
                    this.QuickAlert.Equals(input.QuickAlert)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Tickers != null)
                {
                    hashCode = (hashCode * 59) + this.Tickers.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsPrimary.GetHashCode();
                if (this.Categories != null)
                {
                    hashCode = (hashCode * 59) + this.Categories.GetHashCode();
                }
                if (this.Countries != null)
                {
                    hashCode = (hashCode * 59) + this.Countries.GetHashCode();
                }
                if (this.Regions != null)
                {
                    hashCode = (hashCode * 59) + this.Regions.GetHashCode();
                }
                if (this.Sources != null)
                {
                    hashCode = (hashCode * 59) + this.Sources.GetHashCode();
                }
                if (this.Topics != null)
                {
                    hashCode = (hashCode * 59) + this.Topics.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.QuickAlert.GetHashCode();
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
