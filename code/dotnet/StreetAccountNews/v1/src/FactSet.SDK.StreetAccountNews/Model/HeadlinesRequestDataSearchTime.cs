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
    /// Elements of search time.
    /// </summary>
    [DataContract(Name = "HeadlinesRequest_data_searchTime")]
    public partial class HeadlinesRequestDataSearchTime : IEquatable<HeadlinesRequestDataSearchTime>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HeadlinesRequestDataSearchTime" /> class.
        /// </summary>
        /// <param name="start">Start time for custom search. startTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm].</param>
        /// <param name="end">End time for custom search. If end time is not present end time is automatically set to the time of the search. endTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm].</param>
        public HeadlinesRequestDataSearchTime(DateTime start = default(DateTime), DateTime end = default(DateTime))
        {
            this.Start = start;
            this.End = end;
        }

        /// <summary>
        /// Start time for custom search. startTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]
        /// </summary>
        /// <value>Start time for custom search. startTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]</value>
        [DataMember(Name = "start", EmitDefaultValue = false)]
        public DateTime Start { get; set; }

        /// <summary>
        /// End time for custom search. If end time is not present end time is automatically set to the time of the search. endTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]
        /// </summary>
        /// <value>End time for custom search. If end time is not present end time is automatically set to the time of the search. endTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]</value>
        [DataMember(Name = "end", EmitDefaultValue = false)]
        public DateTime End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class HeadlinesRequestDataSearchTime {\n");
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
            return this.Equals(input as HeadlinesRequestDataSearchTime);
        }

        /// <summary>
        /// Returns true if HeadlinesRequestDataSearchTime instances are equal
        /// </summary>
        /// <param name="input">Instance of HeadlinesRequestDataSearchTime to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HeadlinesRequestDataSearchTime input)
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
