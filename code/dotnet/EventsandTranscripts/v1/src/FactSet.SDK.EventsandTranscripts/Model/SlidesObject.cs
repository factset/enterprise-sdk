/*
 * EVENTS AND TRANSCRIPTS API
 *
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
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
using OpenAPIDateConverter = FactSet.SDK.EventsandTranscripts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.EventsandTranscripts.Model
{
    /// <summary>
    /// SlidesObject
    /// </summary>
    [DataContract(Name = "SlidesObject")]
    public partial class SlidesObject : IEquatable<SlidesObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SlidesObject" /> class.
        /// </summary>
        /// <param name="primaryIds">Refers to the main companies a particular document pertains to..</param>
        /// <param name="allIds">Refers to all companies mentioned in the document. .</param>
        /// <param name="searchId">Returns IDs used in the ids parameter. The identifier type is based on what was used in the parameter..</param>
        /// <param name="headline">Headline of the story..</param>
        /// <param name="storyDateTime">Refers to either the date and time of the story, when it is available in workstation (in the specified timezone) or the date and time FactSet received it from the vendor..</param>
        /// <param name="categories">Categories are country, industry, and subject codes. This is a comma-separated list..</param>
        /// <param name="slidesLink">This is a link for downloading the document with an expiration duration of 24 hours..</param>
        /// <param name="eventId">Unique identifier derived from report_id with a &#39;t&#39; appended, indicating a transcript or slide..</param>
        public SlidesObject(List<string> primaryIds = default(List<string>), List<string> allIds = default(List<string>), string searchId = default(string), string headline = default(string), DateTime storyDateTime = default(DateTime), List<string> categories = default(List<string>), string slidesLink = default(string), string eventId = default(string))
        {
            this.PrimaryIds = primaryIds;
            this.AllIds = allIds;
            this.SearchId = searchId;
            this.Headline = headline;
            this.StoryDateTime = storyDateTime;
            this.Categories = categories;
            this.SlidesLink = slidesLink;
            this.EventId = eventId;
        }

        /// <summary>
        /// Refers to the main companies a particular document pertains to.
        /// </summary>
        /// <value>Refers to the main companies a particular document pertains to.</value>
        [DataMember(Name = "primaryIds", EmitDefaultValue = false)]
        public List<string> PrimaryIds { get; set; }

        /// <summary>
        /// Refers to all companies mentioned in the document. 
        /// </summary>
        /// <value>Refers to all companies mentioned in the document. </value>
        [DataMember(Name = "allIds", EmitDefaultValue = false)]
        public List<string> AllIds { get; set; }

        /// <summary>
        /// Returns IDs used in the ids parameter. The identifier type is based on what was used in the parameter.
        /// </summary>
        /// <value>Returns IDs used in the ids parameter. The identifier type is based on what was used in the parameter.</value>
        [DataMember(Name = "searchId", EmitDefaultValue = false)]
        public string SearchId { get; set; }

        /// <summary>
        /// Headline of the story.
        /// </summary>
        /// <value>Headline of the story.</value>
        [DataMember(Name = "headline", EmitDefaultValue = false)]
        public string Headline { get; set; }

        /// <summary>
        /// Refers to either the date and time of the story, when it is available in workstation (in the specified timezone) or the date and time FactSet received it from the vendor.
        /// </summary>
        /// <value>Refers to either the date and time of the story, when it is available in workstation (in the specified timezone) or the date and time FactSet received it from the vendor.</value>
        [DataMember(Name = "storyDateTime", EmitDefaultValue = false)]
        public DateTime StoryDateTime { get; set; }

        /// <summary>
        /// Categories are country, industry, and subject codes. This is a comma-separated list.
        /// </summary>
        /// <value>Categories are country, industry, and subject codes. This is a comma-separated list.</value>
        [DataMember(Name = "categories", EmitDefaultValue = false)]
        public List<string> Categories { get; set; }

        /// <summary>
        /// This is a link for downloading the document with an expiration duration of 24 hours.
        /// </summary>
        /// <value>This is a link for downloading the document with an expiration duration of 24 hours.</value>
        [DataMember(Name = "slidesLink", EmitDefaultValue = false)]
        public string SlidesLink { get; set; }

        /// <summary>
        /// Unique identifier derived from report_id with a &#39;t&#39; appended, indicating a transcript or slide.
        /// </summary>
        /// <value>Unique identifier derived from report_id with a &#39;t&#39; appended, indicating a transcript or slide.</value>
        [DataMember(Name = "eventId", EmitDefaultValue = false)]
        public string EventId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SlidesObject {\n");
            sb.Append("  PrimaryIds: ").Append(PrimaryIds).Append("\n");
            sb.Append("  AllIds: ").Append(AllIds).Append("\n");
            sb.Append("  SearchId: ").Append(SearchId).Append("\n");
            sb.Append("  Headline: ").Append(Headline).Append("\n");
            sb.Append("  StoryDateTime: ").Append(StoryDateTime).Append("\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  SlidesLink: ").Append(SlidesLink).Append("\n");
            sb.Append("  EventId: ").Append(EventId).Append("\n");
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
            return this.Equals(input as SlidesObject);
        }

        /// <summary>
        /// Returns true if SlidesObject instances are equal
        /// </summary>
        /// <param name="input">Instance of SlidesObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SlidesObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PrimaryIds == input.PrimaryIds ||
                    this.PrimaryIds != null &&
                    input.PrimaryIds != null &&
                    this.PrimaryIds.SequenceEqual(input.PrimaryIds)
                ) && 
                (
                    this.AllIds == input.AllIds ||
                    this.AllIds != null &&
                    input.AllIds != null &&
                    this.AllIds.SequenceEqual(input.AllIds)
                ) && 
                (
                    this.SearchId == input.SearchId ||
                    (this.SearchId != null &&
                    this.SearchId.Equals(input.SearchId))
                ) && 
                (
                    this.Headline == input.Headline ||
                    (this.Headline != null &&
                    this.Headline.Equals(input.Headline))
                ) && 
                (
                    this.StoryDateTime == input.StoryDateTime ||
                    (this.StoryDateTime != null &&
                    this.StoryDateTime.Equals(input.StoryDateTime))
                ) && 
                (
                    this.Categories == input.Categories ||
                    this.Categories != null &&
                    input.Categories != null &&
                    this.Categories.SequenceEqual(input.Categories)
                ) && 
                (
                    this.SlidesLink == input.SlidesLink ||
                    (this.SlidesLink != null &&
                    this.SlidesLink.Equals(input.SlidesLink))
                ) && 
                (
                    this.EventId == input.EventId ||
                    (this.EventId != null &&
                    this.EventId.Equals(input.EventId))
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
                if (this.PrimaryIds != null)
                {
                    hashCode = (hashCode * 59) + this.PrimaryIds.GetHashCode();
                }
                if (this.AllIds != null)
                {
                    hashCode = (hashCode * 59) + this.AllIds.GetHashCode();
                }
                if (this.SearchId != null)
                {
                    hashCode = (hashCode * 59) + this.SearchId.GetHashCode();
                }
                if (this.Headline != null)
                {
                    hashCode = (hashCode * 59) + this.Headline.GetHashCode();
                }
                if (this.StoryDateTime != null)
                {
                    hashCode = (hashCode * 59) + this.StoryDateTime.GetHashCode();
                }
                if (this.Categories != null)
                {
                    hashCode = (hashCode * 59) + this.Categories.GetHashCode();
                }
                if (this.SlidesLink != null)
                {
                    hashCode = (hashCode * 59) + this.SlidesLink.GetHashCode();
                }
                if (this.EventId != null)
                {
                    hashCode = (hashCode * 59) + this.EventId.GetHashCode();
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
