/*
 * FactSet Search Answers API
 *
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: FactSearch.Team@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.FactSetSearchAnswers.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetSearchAnswers.Model
{
    /// <summary>
    /// AdaptiveCardWithThumbnail
    /// </summary>
    [DataContract(Name = "AdaptiveCardWithThumbnail")]
    public partial class AdaptiveCardWithThumbnail : IEquatable<AdaptiveCardWithThumbnail>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdaptiveCardWithThumbnail" /> class.
        /// </summary>
        /// <param name="adaptiveCard">JSON that matches [Adaptive Card](https://adaptivecards.io/explorer/) format..</param>
        /// <param name="thumbnail">JSON that matches [Thumbnail Card](https://docs.microsoft.com/en-us/microsoftteams/platform/task-modules-and-cards/cards/cards-reference#thumbnail-card) format..</param>
        public AdaptiveCardWithThumbnail(Object adaptiveCard = default(Object), Object thumbnail = default(Object))
        {
            this.AdaptiveCard = adaptiveCard;
            this.Thumbnail = thumbnail;
        }

        /// <summary>
        /// JSON that matches [Adaptive Card](https://adaptivecards.io/explorer/) format.
        /// </summary>
        /// <value>JSON that matches [Adaptive Card](https://adaptivecards.io/explorer/) format.</value>
        [DataMember(Name = "adaptiveCard", EmitDefaultValue = false)]
        public Object AdaptiveCard { get; set; }

        /// <summary>
        /// JSON that matches [Thumbnail Card](https://docs.microsoft.com/en-us/microsoftteams/platform/task-modules-and-cards/cards/cards-reference#thumbnail-card) format.
        /// </summary>
        /// <value>JSON that matches [Thumbnail Card](https://docs.microsoft.com/en-us/microsoftteams/platform/task-modules-and-cards/cards/cards-reference#thumbnail-card) format.</value>
        [DataMember(Name = "thumbnail", EmitDefaultValue = true)]
        public Object Thumbnail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AdaptiveCardWithThumbnail {\n");
            sb.Append("  AdaptiveCard: ").Append(AdaptiveCard).Append("\n");
            sb.Append("  Thumbnail: ").Append(Thumbnail).Append("\n");
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
            return this.Equals(input as AdaptiveCardWithThumbnail);
        }

        /// <summary>
        /// Returns true if AdaptiveCardWithThumbnail instances are equal
        /// </summary>
        /// <param name="input">Instance of AdaptiveCardWithThumbnail to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdaptiveCardWithThumbnail input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AdaptiveCard == input.AdaptiveCard ||
                    (this.AdaptiveCard != null &&
                    this.AdaptiveCard.Equals(input.AdaptiveCard))
                ) && 
                (
                    this.Thumbnail == input.Thumbnail ||
                    (this.Thumbnail != null &&
                    this.Thumbnail.Equals(input.Thumbnail))
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
                if (this.AdaptiveCard != null)
                {
                    hashCode = (hashCode * 59) + this.AdaptiveCard.GetHashCode();
                }
                if (this.Thumbnail != null)
                {
                    hashCode = (hashCode * 59) + this.Thumbnail.GetHashCode();
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
