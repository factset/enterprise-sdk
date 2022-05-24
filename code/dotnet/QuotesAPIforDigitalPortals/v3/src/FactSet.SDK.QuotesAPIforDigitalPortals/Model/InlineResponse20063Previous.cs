/*
 * Quotes API For Digital Portals
 *
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Previous rating.
    /// </summary>
    [DataContract(Name = "inline_response_200_63_previous")]
    public partial class InlineResponse20063Previous : IEquatable<InlineResponse20063Previous>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20063Previous" /> class.
        /// </summary>
        /// <param name="id">Identifier of the rating grade..</param>
        /// <param name="grade">Rating grade..</param>
        /// <param name="rank">Rank of the rating grade according to the sort order of the rating system..</param>
        /// <param name="date">Date on which the instrument was rated..</param>
        public InlineResponse20063Previous(decimal id = default(decimal), string grade = default(string), decimal rank = default(decimal), DateTime date = default(DateTime))
        {
            this.Id = id;
            this.Grade = grade;
            this.Rank = rank;
            this.Date = date;
        }

        /// <summary>
        /// Identifier of the rating grade.
        /// </summary>
        /// <value>Identifier of the rating grade.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Rating grade.
        /// </summary>
        /// <value>Rating grade.</value>
        [DataMember(Name = "grade", EmitDefaultValue = false)]
        public string Grade { get; set; }

        /// <summary>
        /// Rank of the rating grade according to the sort order of the rating system.
        /// </summary>
        /// <value>Rank of the rating grade according to the sort order of the rating system.</value>
        [DataMember(Name = "rank", EmitDefaultValue = false)]
        public decimal Rank { get; set; }

        /// <summary>
        /// Date on which the instrument was rated.
        /// </summary>
        /// <value>Date on which the instrument was rated.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20063Previous {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Rank: ").Append(Rank).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
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
            return this.Equals(input as InlineResponse20063Previous);
        }

        /// <summary>
        /// Returns true if InlineResponse20063Previous instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20063Previous to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20063Previous input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.Grade == input.Grade ||
                    (this.Grade != null &&
                    this.Grade.Equals(input.Grade))
                ) && 
                (
                    this.Rank == input.Rank ||
                    this.Rank.Equals(input.Rank)
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
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
                hashCode = (hashCode * 59) + this.Id.GetHashCode();
                if (this.Grade != null)
                {
                    hashCode = (hashCode * 59) + this.Grade.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Rank.GetHashCode();
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
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