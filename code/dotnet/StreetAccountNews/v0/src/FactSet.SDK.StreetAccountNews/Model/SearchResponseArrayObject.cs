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
    /// SearchResponseArrayObject
    /// </summary>
    [DataContract(Name = "searchResponseArrayObject")]
    public partial class SearchResponseArrayObject : IEquatable<SearchResponseArrayObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SearchResponseArrayObject" /> class.
        /// </summary>
        /// <param name="docsStoryDateAndTime">docsStoryDateAndTime.</param>
        /// <param name="docsHeadlines">docsHeadlines.</param>
        /// <param name="docsId">docsId.</param>
        /// <param name="docsPrimarySymbols">docsPrimarySymbols.</param>
        /// <param name="docsSymbols">docsSymbols.</param>
        /// <param name="docsSubjects">docsSubjects.</param>
        /// <param name="docsStoryBody">docsStoryBody.</param>
        /// <param name="docsReferenceUris">docsReferenceUris.</param>
        public SearchResponseArrayObject(string docsStoryDateAndTime = default(string), string docsHeadlines = default(string), string docsId = default(string), List<string> docsPrimarySymbols = default(List<string>), List<string> docsSymbols = default(List<string>), List<string> docsSubjects = default(List<string>), string docsStoryBody = default(string), string docsReferenceUris = default(string))
        {
            this.DocsStoryDateAndTime = docsStoryDateAndTime;
            this.DocsHeadlines = docsHeadlines;
            this.DocsId = docsId;
            this.DocsPrimarySymbols = docsPrimarySymbols;
            this.DocsSymbols = docsSymbols;
            this.DocsSubjects = docsSubjects;
            this.DocsStoryBody = docsStoryBody;
            this.DocsReferenceUris = docsReferenceUris;
        }

        /// <summary>
        /// Gets or Sets DocsStoryDateAndTime
        /// </summary>
        [DataMember(Name = "docsStoryDateAndTime", EmitDefaultValue = false)]
        public string DocsStoryDateAndTime { get; set; }

        /// <summary>
        /// Gets or Sets DocsHeadlines
        /// </summary>
        [DataMember(Name = "docsHeadlines", EmitDefaultValue = false)]
        public string DocsHeadlines { get; set; }

        /// <summary>
        /// Gets or Sets DocsId
        /// </summary>
        [DataMember(Name = "docsId", EmitDefaultValue = false)]
        public string DocsId { get; set; }

        /// <summary>
        /// Gets or Sets DocsPrimarySymbols
        /// </summary>
        [DataMember(Name = "docsPrimarySymbols", EmitDefaultValue = false)]
        public List<string> DocsPrimarySymbols { get; set; }

        /// <summary>
        /// Gets or Sets DocsSymbols
        /// </summary>
        [DataMember(Name = "docsSymbols", EmitDefaultValue = false)]
        public List<string> DocsSymbols { get; set; }

        /// <summary>
        /// Gets or Sets DocsSubjects
        /// </summary>
        [DataMember(Name = "docsSubjects", EmitDefaultValue = false)]
        public List<string> DocsSubjects { get; set; }

        /// <summary>
        /// Gets or Sets DocsStoryBody
        /// </summary>
        [DataMember(Name = "docsStoryBody", EmitDefaultValue = false)]
        public string DocsStoryBody { get; set; }

        /// <summary>
        /// Gets or Sets DocsReferenceUris
        /// </summary>
        [DataMember(Name = "docsReferenceUris", EmitDefaultValue = false)]
        public string DocsReferenceUris { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SearchResponseArrayObject {\n");
            sb.Append("  DocsStoryDateAndTime: ").Append(DocsStoryDateAndTime).Append("\n");
            sb.Append("  DocsHeadlines: ").Append(DocsHeadlines).Append("\n");
            sb.Append("  DocsId: ").Append(DocsId).Append("\n");
            sb.Append("  DocsPrimarySymbols: ").Append(DocsPrimarySymbols).Append("\n");
            sb.Append("  DocsSymbols: ").Append(DocsSymbols).Append("\n");
            sb.Append("  DocsSubjects: ").Append(DocsSubjects).Append("\n");
            sb.Append("  DocsStoryBody: ").Append(DocsStoryBody).Append("\n");
            sb.Append("  DocsReferenceUris: ").Append(DocsReferenceUris).Append("\n");
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
            return this.Equals(input as SearchResponseArrayObject);
        }

        /// <summary>
        /// Returns true if SearchResponseArrayObject instances are equal
        /// </summary>
        /// <param name="input">Instance of SearchResponseArrayObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SearchResponseArrayObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DocsStoryDateAndTime == input.DocsStoryDateAndTime ||
                    (this.DocsStoryDateAndTime != null &&
                    this.DocsStoryDateAndTime.Equals(input.DocsStoryDateAndTime))
                ) && 
                (
                    this.DocsHeadlines == input.DocsHeadlines ||
                    (this.DocsHeadlines != null &&
                    this.DocsHeadlines.Equals(input.DocsHeadlines))
                ) && 
                (
                    this.DocsId == input.DocsId ||
                    (this.DocsId != null &&
                    this.DocsId.Equals(input.DocsId))
                ) && 
                (
                    this.DocsPrimarySymbols == input.DocsPrimarySymbols ||
                    this.DocsPrimarySymbols != null &&
                    input.DocsPrimarySymbols != null &&
                    this.DocsPrimarySymbols.SequenceEqual(input.DocsPrimarySymbols)
                ) && 
                (
                    this.DocsSymbols == input.DocsSymbols ||
                    this.DocsSymbols != null &&
                    input.DocsSymbols != null &&
                    this.DocsSymbols.SequenceEqual(input.DocsSymbols)
                ) && 
                (
                    this.DocsSubjects == input.DocsSubjects ||
                    this.DocsSubjects != null &&
                    input.DocsSubjects != null &&
                    this.DocsSubjects.SequenceEqual(input.DocsSubjects)
                ) && 
                (
                    this.DocsStoryBody == input.DocsStoryBody ||
                    (this.DocsStoryBody != null &&
                    this.DocsStoryBody.Equals(input.DocsStoryBody))
                ) && 
                (
                    this.DocsReferenceUris == input.DocsReferenceUris ||
                    (this.DocsReferenceUris != null &&
                    this.DocsReferenceUris.Equals(input.DocsReferenceUris))
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
                if (this.DocsStoryDateAndTime != null)
                {
                    hashCode = (hashCode * 59) + this.DocsStoryDateAndTime.GetHashCode();
                }
                if (this.DocsHeadlines != null)
                {
                    hashCode = (hashCode * 59) + this.DocsHeadlines.GetHashCode();
                }
                if (this.DocsId != null)
                {
                    hashCode = (hashCode * 59) + this.DocsId.GetHashCode();
                }
                if (this.DocsPrimarySymbols != null)
                {
                    hashCode = (hashCode * 59) + this.DocsPrimarySymbols.GetHashCode();
                }
                if (this.DocsSymbols != null)
                {
                    hashCode = (hashCode * 59) + this.DocsSymbols.GetHashCode();
                }
                if (this.DocsSubjects != null)
                {
                    hashCode = (hashCode * 59) + this.DocsSubjects.GetHashCode();
                }
                if (this.DocsStoryBody != null)
                {
                    hashCode = (hashCode * 59) + this.DocsStoryBody.GetHashCode();
                }
                if (this.DocsReferenceUris != null)
                {
                    hashCode = (hashCode * 59) + this.DocsReferenceUris.GetHashCode();
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
