/*
 * FactSet Global Prices API
 *
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetGlobalPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetGlobalPrices.Model
{
    /// <summary>
    /// SharesOutstandingResponseObject
    /// </summary>
    [DataContract(Name = "sharesOutstandingResponseObject")]
    public partial class SharesOutstandingResponseObject : IEquatable<SharesOutstandingResponseObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SharesOutstandingResponseObject" /> class.
        /// </summary>
        /// <param name="fsymId">Security-level FactSet Permanent Identifier associated with the identifier..</param>
        /// <param name="date">Date of the record in YYYY-MM-DD format..</param>
        /// <param name="documentId">Unique Identifier for each document or filing which contains the outstanding shares position..</param>
        /// <param name="requestId">FactSet Security Permanent Identifier that was used for the request..</param>
        /// <param name="reportDate">Reporting date of the position..</param>
        /// <param name="publicationDate">Exact date that results have been communicated to the market..</param>
        /// <param name="fiscalYear">The company&#39;s fiscal year corresponding to the report..</param>
        /// <param name="reportingPeriodDescription">Textual description of the reporting period..</param>
        /// <param name="reportingPeriod">Code representing the unique reporting period. Options are as follows: - 1 - 1st Quarter - 2 - 2nd Quarter - 3 - 3rd Quarter - 4 - 4th Quarter - 6 - Mid-Year .</param>
        /// <param name="description">Different stock types based on the rights and benefits from ownership..</param>
        /// <param name="adrDescription">Different stock types based on the rights and benefits from ownership for the ADR..</param>
        /// <param name="adrRatio">Number of common or ordinary shares that are equivalent to one American Depositary Receipt (ADR)..</param>
        /// <param name="adrFsymId">Unique FactSet generated identifier assigned to a security, representing the ADR security..</param>
        /// <param name="totalOutstanding">Number of shares outstanding as of &#x60;date&#x60;..</param>
        /// <param name="adrTotalOutstanding">Number of shares outstanding for the ADR as of &#x60;date&#x60;..</param>
        public SharesOutstandingResponseObject(string fsymId = default(string), DateTime? date = default(DateTime?), string documentId = default(string), string requestId = default(string), DateTime? reportDate = default(DateTime?), DateTime? publicationDate = default(DateTime?), int? fiscalYear = default(int?), string reportingPeriodDescription = default(string), int? reportingPeriod = default(int?), string description = default(string), string adrDescription = default(string), decimal? adrRatio = default(decimal?), string adrFsymId = default(string), decimal? totalOutstanding = default(decimal?), decimal? adrTotalOutstanding = default(decimal?))
        {
            this.FsymId = fsymId;
            this.Date = date;
            this.DocumentId = documentId;
            this.RequestId = requestId;
            this.ReportDate = reportDate;
            this.PublicationDate = publicationDate;
            this.FiscalYear = fiscalYear;
            this.ReportingPeriodDescription = reportingPeriodDescription;
            this.ReportingPeriod = reportingPeriod;
            this.Description = description;
            this.AdrDescription = adrDescription;
            this.AdrRatio = adrRatio;
            this.AdrFsymId = adrFsymId;
            this.TotalOutstanding = totalOutstanding;
            this.AdrTotalOutstanding = adrTotalOutstanding;
        }

        /// <summary>
        /// Security-level FactSet Permanent Identifier associated with the identifier.
        /// </summary>
        /// <value>Security-level FactSet Permanent Identifier associated with the identifier.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Date of the record in YYYY-MM-DD format.
        /// </summary>
        /// <value>Date of the record in YYYY-MM-DD format.</value>
        [DataMember(Name = "date", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Unique Identifier for each document or filing which contains the outstanding shares position.
        /// </summary>
        /// <value>Unique Identifier for each document or filing which contains the outstanding shares position.</value>
        [DataMember(Name = "documentId", EmitDefaultValue = true)]
        public string DocumentId { get; set; }

        /// <summary>
        /// FactSet Security Permanent Identifier that was used for the request.
        /// </summary>
        /// <value>FactSet Security Permanent Identifier that was used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = true)]
        public string RequestId { get; set; }

        /// <summary>
        /// Reporting date of the position.
        /// </summary>
        /// <value>Reporting date of the position.</value>
        [DataMember(Name = "reportDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? ReportDate { get; set; }

        /// <summary>
        /// Exact date that results have been communicated to the market.
        /// </summary>
        /// <value>Exact date that results have been communicated to the market.</value>
        [DataMember(Name = "publicationDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? PublicationDate { get; set; }

        /// <summary>
        /// The company&#39;s fiscal year corresponding to the report.
        /// </summary>
        /// <value>The company&#39;s fiscal year corresponding to the report.</value>
        [DataMember(Name = "fiscalYear", EmitDefaultValue = true)]
        public int? FiscalYear { get; set; }

        /// <summary>
        /// Textual description of the reporting period.
        /// </summary>
        /// <value>Textual description of the reporting period.</value>
        [DataMember(Name = "reportingPeriodDescription", EmitDefaultValue = true)]
        public string ReportingPeriodDescription { get; set; }

        /// <summary>
        /// Code representing the unique reporting period. Options are as follows: - 1 - 1st Quarter - 2 - 2nd Quarter - 3 - 3rd Quarter - 4 - 4th Quarter - 6 - Mid-Year 
        /// </summary>
        /// <value>Code representing the unique reporting period. Options are as follows: - 1 - 1st Quarter - 2 - 2nd Quarter - 3 - 3rd Quarter - 4 - 4th Quarter - 6 - Mid-Year </value>
        [DataMember(Name = "reportingPeriod", EmitDefaultValue = true)]
        public int? ReportingPeriod { get; set; }

        /// <summary>
        /// Different stock types based on the rights and benefits from ownership.
        /// </summary>
        /// <value>Different stock types based on the rights and benefits from ownership.</value>
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Different stock types based on the rights and benefits from ownership for the ADR.
        /// </summary>
        /// <value>Different stock types based on the rights and benefits from ownership for the ADR.</value>
        [DataMember(Name = "adrDescription", EmitDefaultValue = true)]
        public string AdrDescription { get; set; }

        /// <summary>
        /// Number of common or ordinary shares that are equivalent to one American Depositary Receipt (ADR).
        /// </summary>
        /// <value>Number of common or ordinary shares that are equivalent to one American Depositary Receipt (ADR).</value>
        [DataMember(Name = "adrRatio", EmitDefaultValue = true)]
        public decimal? AdrRatio { get; set; }

        /// <summary>
        /// Unique FactSet generated identifier assigned to a security, representing the ADR security.
        /// </summary>
        /// <value>Unique FactSet generated identifier assigned to a security, representing the ADR security.</value>
        [DataMember(Name = "adrFsymId", EmitDefaultValue = true)]
        public string AdrFsymId { get; set; }

        /// <summary>
        /// Number of shares outstanding as of &#x60;date&#x60;.
        /// </summary>
        /// <value>Number of shares outstanding as of &#x60;date&#x60;.</value>
        [DataMember(Name = "totalOutstanding", EmitDefaultValue = true)]
        public decimal? TotalOutstanding { get; set; }

        /// <summary>
        /// Number of shares outstanding for the ADR as of &#x60;date&#x60;.
        /// </summary>
        /// <value>Number of shares outstanding for the ADR as of &#x60;date&#x60;.</value>
        [DataMember(Name = "adrTotalOutstanding", EmitDefaultValue = true)]
        public decimal? AdrTotalOutstanding { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SharesOutstandingResponseObject {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  DocumentId: ").Append(DocumentId).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  ReportDate: ").Append(ReportDate).Append("\n");
            sb.Append("  PublicationDate: ").Append(PublicationDate).Append("\n");
            sb.Append("  FiscalYear: ").Append(FiscalYear).Append("\n");
            sb.Append("  ReportingPeriodDescription: ").Append(ReportingPeriodDescription).Append("\n");
            sb.Append("  ReportingPeriod: ").Append(ReportingPeriod).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  AdrDescription: ").Append(AdrDescription).Append("\n");
            sb.Append("  AdrRatio: ").Append(AdrRatio).Append("\n");
            sb.Append("  AdrFsymId: ").Append(AdrFsymId).Append("\n");
            sb.Append("  TotalOutstanding: ").Append(TotalOutstanding).Append("\n");
            sb.Append("  AdrTotalOutstanding: ").Append(AdrTotalOutstanding).Append("\n");
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
            return this.Equals(input as SharesOutstandingResponseObject);
        }

        /// <summary>
        /// Returns true if SharesOutstandingResponseObject instances are equal
        /// </summary>
        /// <param name="input">Instance of SharesOutstandingResponseObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SharesOutstandingResponseObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.DocumentId == input.DocumentId ||
                    (this.DocumentId != null &&
                    this.DocumentId.Equals(input.DocumentId))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.ReportDate == input.ReportDate ||
                    (this.ReportDate != null &&
                    this.ReportDate.Equals(input.ReportDate))
                ) && 
                (
                    this.PublicationDate == input.PublicationDate ||
                    (this.PublicationDate != null &&
                    this.PublicationDate.Equals(input.PublicationDate))
                ) && 
                (
                    this.FiscalYear == input.FiscalYear ||
                    (this.FiscalYear != null &&
                    this.FiscalYear.Equals(input.FiscalYear))
                ) && 
                (
                    this.ReportingPeriodDescription == input.ReportingPeriodDescription ||
                    (this.ReportingPeriodDescription != null &&
                    this.ReportingPeriodDescription.Equals(input.ReportingPeriodDescription))
                ) && 
                (
                    this.ReportingPeriod == input.ReportingPeriod ||
                    (this.ReportingPeriod != null &&
                    this.ReportingPeriod.Equals(input.ReportingPeriod))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.AdrDescription == input.AdrDescription ||
                    (this.AdrDescription != null &&
                    this.AdrDescription.Equals(input.AdrDescription))
                ) && 
                (
                    this.AdrRatio == input.AdrRatio ||
                    (this.AdrRatio != null &&
                    this.AdrRatio.Equals(input.AdrRatio))
                ) && 
                (
                    this.AdrFsymId == input.AdrFsymId ||
                    (this.AdrFsymId != null &&
                    this.AdrFsymId.Equals(input.AdrFsymId))
                ) && 
                (
                    this.TotalOutstanding == input.TotalOutstanding ||
                    (this.TotalOutstanding != null &&
                    this.TotalOutstanding.Equals(input.TotalOutstanding))
                ) && 
                (
                    this.AdrTotalOutstanding == input.AdrTotalOutstanding ||
                    (this.AdrTotalOutstanding != null &&
                    this.AdrTotalOutstanding.Equals(input.AdrTotalOutstanding))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.DocumentId != null)
                {
                    hashCode = (hashCode * 59) + this.DocumentId.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.ReportDate != null)
                {
                    hashCode = (hashCode * 59) + this.ReportDate.GetHashCode();
                }
                if (this.PublicationDate != null)
                {
                    hashCode = (hashCode * 59) + this.PublicationDate.GetHashCode();
                }
                if (this.FiscalYear != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalYear.GetHashCode();
                }
                if (this.ReportingPeriodDescription != null)
                {
                    hashCode = (hashCode * 59) + this.ReportingPeriodDescription.GetHashCode();
                }
                if (this.ReportingPeriod != null)
                {
                    hashCode = (hashCode * 59) + this.ReportingPeriod.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.AdrDescription != null)
                {
                    hashCode = (hashCode * 59) + this.AdrDescription.GetHashCode();
                }
                if (this.AdrRatio != null)
                {
                    hashCode = (hashCode * 59) + this.AdrRatio.GetHashCode();
                }
                if (this.AdrFsymId != null)
                {
                    hashCode = (hashCode * 59) + this.AdrFsymId.GetHashCode();
                }
                if (this.TotalOutstanding != null)
                {
                    hashCode = (hashCode * 59) + this.TotalOutstanding.GetHashCode();
                }
                if (this.AdrTotalOutstanding != null)
                {
                    hashCode = (hashCode * 59) + this.AdrTotalOutstanding.GetHashCode();
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
