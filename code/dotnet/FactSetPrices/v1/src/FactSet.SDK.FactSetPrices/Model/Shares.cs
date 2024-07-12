/*
 * FactSet Prices API
 *
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p><p><b>Rate limit is set to 25 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.3.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPrices.Model
{
    /// <summary>
    /// Shares
    /// </summary>
    [DataContract(Name = "shares")]
    public partial class Shares : IEquatable<Shares>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Shares" /> class.
        /// </summary>
        /// <param name="fsymId">Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet..</param>
        /// <param name="date">Date expressed in YYYY-MM-DD format..</param>
        /// <param name="adjDate">Date of last split for which return has been adjusted. Use the /factset-prices/v#/splits endpoint for details on split. If not available, date will return as 0001-01-01..</param>
        /// <param name="sharesSecurity">**Security-level** Common Shares Outstanding in base units. Shares sourced primarily from SEC filings. Securities in certain countries will include treasury shares. For details visit [Online Assistant Page #10435](https://oa.apps.factset.com/pages/10435).</param>
        /// <param name="sharesCompany">**Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *excluded*. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867).</param>
        /// <param name="sharesCompanyNontraded">**Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *included* to the calculation basis by the proportion of their nominal or par value. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867).</param>
        /// <param name="requestId">Identifier that was used for the request..</param>
        public Shares(string fsymId = default(string), DateTime? date = default(DateTime?), DateTime? adjDate = default(DateTime?), decimal? sharesSecurity = default(decimal?), decimal? sharesCompany = default(decimal?), decimal? sharesCompanyNontraded = default(decimal?), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Date = date;
            this.AdjDate = adjDate;
            this.SharesSecurity = sharesSecurity;
            this.SharesCompany = sharesCompany;
            this.SharesCompanyNontraded = sharesCompanyNontraded;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
        /// </summary>
        /// <value>Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Date expressed in YYYY-MM-DD format.
        /// </summary>
        /// <value>Date expressed in YYYY-MM-DD format.</value>
        [DataMember(Name = "date", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Date of last split for which return has been adjusted. Use the /factset-prices/v#/splits endpoint for details on split. If not available, date will return as 0001-01-01.
        /// </summary>
        /// <value>Date of last split for which return has been adjusted. Use the /factset-prices/v#/splits endpoint for details on split. If not available, date will return as 0001-01-01.</value>
        [DataMember(Name = "adjDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? AdjDate { get; set; }

        /// <summary>
        /// **Security-level** Common Shares Outstanding in base units. Shares sourced primarily from SEC filings. Securities in certain countries will include treasury shares. For details visit [Online Assistant Page #10435](https://oa.apps.factset.com/pages/10435)
        /// </summary>
        /// <value>**Security-level** Common Shares Outstanding in base units. Shares sourced primarily from SEC filings. Securities in certain countries will include treasury shares. For details visit [Online Assistant Page #10435](https://oa.apps.factset.com/pages/10435)</value>
        [DataMember(Name = "sharesSecurity", EmitDefaultValue = true)]
        public decimal? SharesSecurity { get; set; }

        /// <summary>
        /// **Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *excluded*. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867)
        /// </summary>
        /// <value>**Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *excluded*. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867)</value>
        [DataMember(Name = "sharesCompany", EmitDefaultValue = true)]
        public decimal? SharesCompany { get; set; }

        /// <summary>
        /// **Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *included* to the calculation basis by the proportion of their nominal or par value. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867)
        /// </summary>
        /// <value>**Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *included* to the calculation basis by the proportion of their nominal or par value. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867)</value>
        [DataMember(Name = "sharesCompanyNontraded", EmitDefaultValue = true)]
        public decimal? SharesCompanyNontraded { get; set; }

        /// <summary>
        /// Identifier that was used for the request.
        /// </summary>
        /// <value>Identifier that was used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Shares {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  AdjDate: ").Append(AdjDate).Append("\n");
            sb.Append("  SharesSecurity: ").Append(SharesSecurity).Append("\n");
            sb.Append("  SharesCompany: ").Append(SharesCompany).Append("\n");
            sb.Append("  SharesCompanyNontraded: ").Append(SharesCompanyNontraded).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as Shares);
        }

        /// <summary>
        /// Returns true if Shares instances are equal
        /// </summary>
        /// <param name="input">Instance of Shares to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Shares input)
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
                    this.AdjDate == input.AdjDate ||
                    (this.AdjDate != null &&
                    this.AdjDate.Equals(input.AdjDate))
                ) && 
                (
                    this.SharesSecurity == input.SharesSecurity ||
                    (this.SharesSecurity != null &&
                    this.SharesSecurity.Equals(input.SharesSecurity))
                ) && 
                (
                    this.SharesCompany == input.SharesCompany ||
                    (this.SharesCompany != null &&
                    this.SharesCompany.Equals(input.SharesCompany))
                ) && 
                (
                    this.SharesCompanyNontraded == input.SharesCompanyNontraded ||
                    (this.SharesCompanyNontraded != null &&
                    this.SharesCompanyNontraded.Equals(input.SharesCompanyNontraded))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.AdjDate != null)
                {
                    hashCode = (hashCode * 59) + this.AdjDate.GetHashCode();
                }
                if (this.SharesSecurity != null)
                {
                    hashCode = (hashCode * 59) + this.SharesSecurity.GetHashCode();
                }
                if (this.SharesCompany != null)
                {
                    hashCode = (hashCode * 59) + this.SharesCompany.GetHashCode();
                }
                if (this.SharesCompanyNontraded != null)
                {
                    hashCode = (hashCode * 59) + this.SharesCompanyNontraded.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
