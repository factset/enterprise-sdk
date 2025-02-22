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
    /// Details of the category.
    /// </summary>
    [DataContract(Name = "inline_response_200_32_data")]
    public partial class InlineResponse20032Data : IEquatable<InlineResponse20032Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20032Data" /> class.
        /// </summary>
        /// <param name="code">Code commonly used for this category..</param>
        /// <param name="name">Name of the category..</param>
        /// <param name="description">Description of the category..</param>
        /// <param name="active">Indicates whether this category is active..</param>
        /// <param name="level">level.</param>
        /// <param name="parent">parent.</param>
        /// <param name="system">system.</param>
        public InlineResponse20032Data(string code = default(string), string name = default(string), string description = default(string), bool? active = default(bool?), InlineResponse20032DataLevel level = default(InlineResponse20032DataLevel), InlineResponse20032DataParent parent = default(InlineResponse20032DataParent), InlineResponse20032DataSystem system = default(InlineResponse20032DataSystem))
        {
            this.Code = code;
            this.Name = name;
            this.Description = description;
            this.Active = active;
            this.Level = level;
            this.Parent = parent;
            this.System = system;
        }

        /// <summary>
        /// Code commonly used for this category.
        /// </summary>
        /// <value>Code commonly used for this category.</value>
        [DataMember(Name = "code", EmitDefaultValue = true)]
        public string Code { get; set; }

        /// <summary>
        /// Name of the category.
        /// </summary>
        /// <value>Name of the category.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Description of the category.
        /// </summary>
        /// <value>Description of the category.</value>
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Indicates whether this category is active.
        /// </summary>
        /// <value>Indicates whether this category is active.</value>
        [DataMember(Name = "active", EmitDefaultValue = true)]
        public bool? Active { get; set; }

        /// <summary>
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name = "level", EmitDefaultValue = false)]
        public InlineResponse20032DataLevel Level { get; set; }

        /// <summary>
        /// Gets or Sets Parent
        /// </summary>
        [DataMember(Name = "parent", EmitDefaultValue = false)]
        public InlineResponse20032DataParent Parent { get; set; }

        /// <summary>
        /// Gets or Sets System
        /// </summary>
        [DataMember(Name = "system", EmitDefaultValue = false)]
        public InlineResponse20032DataSystem System { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20032Data {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  Parent: ").Append(Parent).Append("\n");
            sb.Append("  System: ").Append(System).Append("\n");
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
            return this.Equals(input as InlineResponse20032Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20032Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20032Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20032Data input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Active == input.Active ||
                    (this.Active != null &&
                    this.Active.Equals(input.Active))
                ) && 
                (
                    this.Level == input.Level ||
                    (this.Level != null &&
                    this.Level.Equals(input.Level))
                ) && 
                (
                    this.Parent == input.Parent ||
                    (this.Parent != null &&
                    this.Parent.Equals(input.Parent))
                ) && 
                (
                    this.System == input.System ||
                    (this.System != null &&
                    this.System.Equals(input.System))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.Active != null)
                {
                    hashCode = (hashCode * 59) + this.Active.GetHashCode();
                }
                if (this.Level != null)
                {
                    hashCode = (hashCode * 59) + this.Level.GetHashCode();
                }
                if (this.Parent != null)
                {
                    hashCode = (hashCode * 59) + this.Parent.GetHashCode();
                }
                if (this.System != null)
                {
                    hashCode = (hashCode * 59) + this.System.GetHashCode();
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
