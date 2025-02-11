/*
 * StreetAccount News API
 *
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.2.0
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
using OpenAPIDateConverter = FactSet.SDK.StreetAccountNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StreetAccountNews.Model
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
        /// <param name="tickers">An array of ticker objects associated with the view..</param>
        /// <param name="isPrimary">If true, then only stories with the provided ticker as a primary symbol will be returned. Otherwise, all stories with the ticker as a primary symbol or related symbol will be returned. .</param>
        /// <param name="categories">categories.</param>
        /// <param name="topics">topics.</param>
        /// <param name="regions">regions.</param>
        /// <param name="sectors">sectors.</param>
        /// <param name="quickAlert">Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not. .</param>
        public CreateOrEditViewBodyData(string name = default(string), List<CreateOrEditViewTickers> tickers = default(List<CreateOrEditViewTickers>), bool isPrimary = default(bool), List<string> categories = default(List<string>), List<string> topics = default(List<string>), List<string> regions = default(List<string>), List<string> sectors = default(List<string>), bool quickAlert = default(bool))
        {
            this.Name = name;
            this.Tickers = tickers;
            this.IsPrimary = isPrimary;
            this.Categories = categories;
            this.Topics = topics;
            this.Regions = regions;
            this.Sectors = sectors;
            this.QuickAlert = quickAlert;
        }

        /// <summary>
        /// The name of the view.
        /// </summary>
        /// <value>The name of the view.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// An array of ticker objects associated with the view.
        /// </summary>
        /// <value>An array of ticker objects associated with the view.</value>
        [DataMember(Name = "tickers", EmitDefaultValue = false)]
        public List<CreateOrEditViewTickers> Tickers { get; set; }

        /// <summary>
        /// If true, then only stories with the provided ticker as a primary symbol will be returned. Otherwise, all stories with the ticker as a primary symbol or related symbol will be returned. 
        /// </summary>
        /// <value>If true, then only stories with the provided ticker as a primary symbol will be returned. Otherwise, all stories with the ticker as a primary symbol or related symbol will be returned. </value>
        [DataMember(Name = "isPrimary", EmitDefaultValue = true)]
        public bool IsPrimary { get; set; }

        /// <summary>
        /// Gets or Sets Categories
        /// </summary>
        [DataMember(Name = "categories", EmitDefaultValue = false)]
        public List<string> Categories { get; set; }

        /// <summary>
        /// Gets or Sets Topics
        /// </summary>
        [DataMember(Name = "topics", EmitDefaultValue = false)]
        public List<string> Topics { get; set; }

        /// <summary>
        /// Gets or Sets Regions
        /// </summary>
        [DataMember(Name = "regions", EmitDefaultValue = false)]
        public List<string> Regions { get; set; }

        /// <summary>
        /// Gets or Sets Sectors
        /// </summary>
        [DataMember(Name = "sectors", EmitDefaultValue = false)]
        public List<string> Sectors { get; set; }

        /// <summary>
        /// Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not. 
        /// </summary>
        /// <value>Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not. </value>
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
            sb.Append("  Topics: ").Append(Topics).Append("\n");
            sb.Append("  Regions: ").Append(Regions).Append("\n");
            sb.Append("  Sectors: ").Append(Sectors).Append("\n");
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
                    this.Topics == input.Topics ||
                    this.Topics != null &&
                    input.Topics != null &&
                    this.Topics.SequenceEqual(input.Topics)
                ) && 
                (
                    this.Regions == input.Regions ||
                    this.Regions != null &&
                    input.Regions != null &&
                    this.Regions.SequenceEqual(input.Regions)
                ) && 
                (
                    this.Sectors == input.Sectors ||
                    this.Sectors != null &&
                    input.Sectors != null &&
                    this.Sectors.SequenceEqual(input.Sectors)
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
                if (this.Topics != null)
                {
                    hashCode = (hashCode * 59) + this.Topics.GetHashCode();
                }
                if (this.Regions != null)
                {
                    hashCode = (hashCode * 59) + this.Regions.GetHashCode();
                }
                if (this.Sectors != null)
                {
                    hashCode = (hashCode * 59) + this.Sectors.GetHashCode();
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
