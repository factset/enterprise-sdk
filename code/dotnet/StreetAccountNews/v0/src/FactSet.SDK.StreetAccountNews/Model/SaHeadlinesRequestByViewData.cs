/*
 * StreetAccount News API
 *
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Company Filters, Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.  **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Request Files, Check Status, and Get Files.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
 *
 * The version of the OpenAPI document: 0.1.0
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
    /// SaHeadlinesRequestByViewData
    /// </summary>
    [DataContract(Name = "saHeadlinesRequestByView_data")]
    public partial class SaHeadlinesRequestByViewData : IEquatable<SaHeadlinesRequestByViewData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SaHeadlinesRequestByViewData" /> class.
        /// </summary>
        /// <param name="searchDate">searchDate.</param>
        public SaHeadlinesRequestByViewData(SaHeadlinesRequestDataSearchDate searchDate = default(SaHeadlinesRequestDataSearchDate))
        {
            this.SearchDate = searchDate;
        }

        /// <summary>
        /// Gets or Sets SearchDate
        /// </summary>
        [DataMember(Name = "searchDate", EmitDefaultValue = false)]
        public SaHeadlinesRequestDataSearchDate SearchDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SaHeadlinesRequestByViewData {\n");
            sb.Append("  SearchDate: ").Append(SearchDate).Append("\n");
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
            return this.Equals(input as SaHeadlinesRequestByViewData);
        }

        /// <summary>
        /// Returns true if SaHeadlinesRequestByViewData instances are equal
        /// </summary>
        /// <param name="input">Instance of SaHeadlinesRequestByViewData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SaHeadlinesRequestByViewData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SearchDate == input.SearchDate ||
                    (this.SearchDate != null &&
                    this.SearchDate.Equals(input.SearchDate))
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
                if (this.SearchDate != null)
                {
                    hashCode = (hashCode * 59) + this.SearchDate.GetHashCode();
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
