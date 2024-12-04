/*
 * StreetAccount News API
 *
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.   **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Create, Status, and Get.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
 *
 * The version of the OpenAPI document: 1.1.0
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
    /// Flattened Filters Object.
    /// </summary>
    [DataContract(Name = "FlattenedFilters")]
    public partial class FlattenedFilters : IEquatable<FlattenedFilters>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FlattenedFilters" /> class.
        /// </summary>
        /// <param name="categories">categories.</param>
        /// <param name="topics">topics.</param>
        /// <param name="regions">regions.</param>
        /// <param name="sectors">sectors.</param>
        /// <param name="watchlists">watchlists.</param>
        public FlattenedFilters(List<FlattenedFiltersCategoriesObject> categories = default(List<FlattenedFiltersCategoriesObject>), List<FlattenedFiltersTopicsObject> topics = default(List<FlattenedFiltersTopicsObject>), List<FlattenedFiltersRegionsObject> regions = default(List<FlattenedFiltersRegionsObject>), List<FlattenedFiltersSectorsObject> sectors = default(List<FlattenedFiltersSectorsObject>), List<FlattenedFiltersWatchlistsObject> watchlists = default(List<FlattenedFiltersWatchlistsObject>))
        {
            this.Categories = categories;
            this.Topics = topics;
            this.Regions = regions;
            this.Sectors = sectors;
            this.Watchlists = watchlists;
        }

        /// <summary>
        /// Gets or Sets Categories
        /// </summary>
        [DataMember(Name = "categories", EmitDefaultValue = false)]
        public List<FlattenedFiltersCategoriesObject> Categories { get; set; }

        /// <summary>
        /// Gets or Sets Topics
        /// </summary>
        [DataMember(Name = "topics", EmitDefaultValue = false)]
        public List<FlattenedFiltersTopicsObject> Topics { get; set; }

        /// <summary>
        /// Gets or Sets Regions
        /// </summary>
        [DataMember(Name = "regions", EmitDefaultValue = false)]
        public List<FlattenedFiltersRegionsObject> Regions { get; set; }

        /// <summary>
        /// Gets or Sets Sectors
        /// </summary>
        [DataMember(Name = "sectors", EmitDefaultValue = false)]
        public List<FlattenedFiltersSectorsObject> Sectors { get; set; }

        /// <summary>
        /// Gets or Sets Watchlists
        /// </summary>
        [DataMember(Name = "watchlists", EmitDefaultValue = false)]
        public List<FlattenedFiltersWatchlistsObject> Watchlists { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FlattenedFilters {\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  Topics: ").Append(Topics).Append("\n");
            sb.Append("  Regions: ").Append(Regions).Append("\n");
            sb.Append("  Sectors: ").Append(Sectors).Append("\n");
            sb.Append("  Watchlists: ").Append(Watchlists).Append("\n");
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
            return this.Equals(input as FlattenedFilters);
        }

        /// <summary>
        /// Returns true if FlattenedFilters instances are equal
        /// </summary>
        /// <param name="input">Instance of FlattenedFilters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FlattenedFilters input)
        {
            if (input == null)
            {
                return false;
            }
            return 
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
                    this.Watchlists == input.Watchlists ||
                    this.Watchlists != null &&
                    input.Watchlists != null &&
                    this.Watchlists.SequenceEqual(input.Watchlists)
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
                if (this.Watchlists != null)
                {
                    hashCode = (hashCode * 59) + this.Watchlists.GetHashCode();
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
