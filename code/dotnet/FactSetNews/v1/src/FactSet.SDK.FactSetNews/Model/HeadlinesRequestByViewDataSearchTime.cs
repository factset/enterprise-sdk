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
    /// HeadlinesRequestByViewDataSearchTime
    /// </summary>
    [DataContract(Name = "HeadlinesRequestByView_data_searchTime")]
    public partial class HeadlinesRequestByViewDataSearchTime : IEquatable<HeadlinesRequestByViewDataSearchTime>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HeadlinesRequestByViewDataSearchTime" /> class.
        /// </summary>
        /// <param name="start">Start time for custom search. startTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]..</param>
        /// <param name="end">End time for custom search. If end time is not present end time is automatically set to the time of the search. endTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]..</param>
        public HeadlinesRequestByViewDataSearchTime(DateTime start = default(DateTime), DateTime end = default(DateTime))
        {
            this.Start = start;
            this.End = end;
        }

        /// <summary>
        /// Start time for custom search. startTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm].
        /// </summary>
        /// <value>Start time for custom search. startTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm].</value>
        [DataMember(Name = "start", EmitDefaultValue = false)]
        public DateTime Start { get; set; }

        /// <summary>
        /// End time for custom search. If end time is not present end time is automatically set to the time of the search. endTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm].
        /// </summary>
        /// <value>End time for custom search. If end time is not present end time is automatically set to the time of the search. endTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm].</value>
        [DataMember(Name = "end", EmitDefaultValue = false)]
        public DateTime End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class HeadlinesRequestByViewDataSearchTime {\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
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
            return this.Equals(input as HeadlinesRequestByViewDataSearchTime);
        }

        /// <summary>
        /// Returns true if HeadlinesRequestByViewDataSearchTime instances are equal
        /// </summary>
        /// <param name="input">Instance of HeadlinesRequestByViewDataSearchTime to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HeadlinesRequestByViewDataSearchTime input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
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
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
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
