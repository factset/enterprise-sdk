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
    /// Elements of meta object.
    /// </summary>
    [DataContract(Name = "HeadlinesResponse_meta")]
    public partial class HeadlinesResponseMeta : IEquatable<HeadlinesResponseMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HeadlinesResponseMeta" /> class.
        /// </summary>
        /// <param name="requestGuid">Identifier to get general information about the request that produced that search response..</param>
        /// <param name="pagination">pagination.</param>
        public HeadlinesResponseMeta(string requestGuid = default(string), HeadlinesResponseMetaPagination pagination = default(HeadlinesResponseMetaPagination))
        {
            this.RequestGuid = requestGuid;
            this.Pagination = pagination;
        }

        /// <summary>
        /// Identifier to get general information about the request that produced that search response.
        /// </summary>
        /// <value>Identifier to get general information about the request that produced that search response.</value>
        [DataMember(Name = "requestGuid", EmitDefaultValue = false)]
        public string RequestGuid { get; set; }

        /// <summary>
        /// Gets or Sets Pagination
        /// </summary>
        [DataMember(Name = "pagination", EmitDefaultValue = false)]
        public HeadlinesResponseMetaPagination Pagination { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class HeadlinesResponseMeta {\n");
            sb.Append("  RequestGuid: ").Append(RequestGuid).Append("\n");
            sb.Append("  Pagination: ").Append(Pagination).Append("\n");
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
            return this.Equals(input as HeadlinesResponseMeta);
        }

        /// <summary>
        /// Returns true if HeadlinesResponseMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of HeadlinesResponseMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HeadlinesResponseMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RequestGuid == input.RequestGuid ||
                    (this.RequestGuid != null &&
                    this.RequestGuid.Equals(input.RequestGuid))
                ) && 
                (
                    this.Pagination == input.Pagination ||
                    (this.Pagination != null &&
                    this.Pagination.Equals(input.Pagination))
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
                if (this.RequestGuid != null)
                {
                    hashCode = (hashCode * 59) + this.RequestGuid.GetHashCode();
                }
                if (this.Pagination != null)
                {
                    hashCode = (hashCode * 59) + this.Pagination.GetHashCode();
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
