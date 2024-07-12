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
    /// FixedIncomePrice
    /// </summary>
    [DataContract(Name = "fixedIncomePrice")]
    public partial class FixedIncomePrice : IEquatable<FixedIncomePrice>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FixedIncomePrice" /> class.
        /// </summary>
        /// <param name="fsymId">Factset Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S)..</param>
        /// <param name="date">Ending date for the period expressed in YYYY-MM-DD format..</param>
        /// <param name="securityType">Returns the security type code of fixed income instruments.   * AGCY - Agency   * BDNT - Bond/Note   * BDWT  - Bond with Warrants   * BKAC  - Bankers Acceptance   * BLDN - Bill/Discount Note   * BOND  - Bond   * CAP  - Embedded ceiling or short interest rates   * CAPS - Capital Security   * CAPT - Capital Trust Security   * CD - Certificate of Deposit (Munis)   * CDO - Collateralized Debt Obligation   * CMO  - Collateralized mortgage obligation   * COMP - Commercial Paper   * CONV - Convertible/Exchangeable   * CONVP - Convertible Preferred   * CORP - Corporate   * COVR - Covered Bond   * CP  - Commercial Paper   * CRL - Credit Linked Security   * DEB - Debenture   * DERI  - Derivative (generic type)   * EBON - Eurobond   * EQL - Equity Linked Security   * FORW  - Forward deliveries   * GRTR  - Grantor trust   * HY - Hypotheken Pfandbriefe   * IIDX - Inflation Indexed Security   * INVF  - Inverse floaters   * LAUTH - Local Authority/Political Division   * LINK  - Linked securities   * LKS - Linked Securities   * MAPL - Mixed Asset Portfolio Linked Security   * MM - Money Market   * NOTE  - Note   * OF - Obligations FonciÃres   * OPTN  - Options   * OTHL - Other Linked Security   * PAYS  - Payment streams   * PFD - Preferred   * PFND - Pfandbriefe   * POOL  - Pooled derivatives   * PSEC - Preferred Security   * PSTK - Preferred Stock   * REPO  - REPOS   * RMIC  - REMIC   * SHFL  - Short floats (auction)   * STRIPS - STRIPS   * SWAP  - Embedded swaps   * TR  - Trust   * TRUPS - Trust Preferred Security .</param>
        /// <param name="issuerEntityId">Fixed Income Issuer Entity ID (-E)..</param>
        /// <param name="issuerType">Returns the issuer type code of fixed income instruments.   * AGCY - Agency   * CORP - Corporate   * LAUTH - Local Authority/Political Division   * MUNI - Municipals   * SOV - Sovereign   * SUPR - Supranational   * SCOL - Securitized/Collateralized .</param>
        /// <param name="priceBid">BID PRICE. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America..</param>
        /// <param name="priceMid">MID Price. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America..</param>
        /// <param name="priceAsk">ASK Price. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America..</param>
        /// <param name="requestId">Identifier that was used for the request..</param>
        public FixedIncomePrice(string fsymId = default(string), DateTime? date = default(DateTime?), string securityType = default(string), string issuerEntityId = default(string), string issuerType = default(string), double? priceBid = default(double?), double? priceMid = default(double?), double? priceAsk = default(double?), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Date = date;
            this.SecurityType = securityType;
            this.IssuerEntityId = issuerEntityId;
            this.IssuerType = issuerType;
            this.PriceBid = priceBid;
            this.PriceMid = priceMid;
            this.PriceAsk = priceAsk;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Factset Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S).
        /// </summary>
        /// <value>Factset Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S).</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Ending date for the period expressed in YYYY-MM-DD format.
        /// </summary>
        /// <value>Ending date for the period expressed in YYYY-MM-DD format.</value>
        [DataMember(Name = "date", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Returns the security type code of fixed income instruments.   * AGCY - Agency   * BDNT - Bond/Note   * BDWT  - Bond with Warrants   * BKAC  - Bankers Acceptance   * BLDN - Bill/Discount Note   * BOND  - Bond   * CAP  - Embedded ceiling or short interest rates   * CAPS - Capital Security   * CAPT - Capital Trust Security   * CD - Certificate of Deposit (Munis)   * CDO - Collateralized Debt Obligation   * CMO  - Collateralized mortgage obligation   * COMP - Commercial Paper   * CONV - Convertible/Exchangeable   * CONVP - Convertible Preferred   * CORP - Corporate   * COVR - Covered Bond   * CP  - Commercial Paper   * CRL - Credit Linked Security   * DEB - Debenture   * DERI  - Derivative (generic type)   * EBON - Eurobond   * EQL - Equity Linked Security   * FORW  - Forward deliveries   * GRTR  - Grantor trust   * HY - Hypotheken Pfandbriefe   * IIDX - Inflation Indexed Security   * INVF  - Inverse floaters   * LAUTH - Local Authority/Political Division   * LINK  - Linked securities   * LKS - Linked Securities   * MAPL - Mixed Asset Portfolio Linked Security   * MM - Money Market   * NOTE  - Note   * OF - Obligations FonciÃres   * OPTN  - Options   * OTHL - Other Linked Security   * PAYS  - Payment streams   * PFD - Preferred   * PFND - Pfandbriefe   * POOL  - Pooled derivatives   * PSEC - Preferred Security   * PSTK - Preferred Stock   * REPO  - REPOS   * RMIC  - REMIC   * SHFL  - Short floats (auction)   * STRIPS - STRIPS   * SWAP  - Embedded swaps   * TR  - Trust   * TRUPS - Trust Preferred Security 
        /// </summary>
        /// <value>Returns the security type code of fixed income instruments.   * AGCY - Agency   * BDNT - Bond/Note   * BDWT  - Bond with Warrants   * BKAC  - Bankers Acceptance   * BLDN - Bill/Discount Note   * BOND  - Bond   * CAP  - Embedded ceiling or short interest rates   * CAPS - Capital Security   * CAPT - Capital Trust Security   * CD - Certificate of Deposit (Munis)   * CDO - Collateralized Debt Obligation   * CMO  - Collateralized mortgage obligation   * COMP - Commercial Paper   * CONV - Convertible/Exchangeable   * CONVP - Convertible Preferred   * CORP - Corporate   * COVR - Covered Bond   * CP  - Commercial Paper   * CRL - Credit Linked Security   * DEB - Debenture   * DERI  - Derivative (generic type)   * EBON - Eurobond   * EQL - Equity Linked Security   * FORW  - Forward deliveries   * GRTR  - Grantor trust   * HY - Hypotheken Pfandbriefe   * IIDX - Inflation Indexed Security   * INVF  - Inverse floaters   * LAUTH - Local Authority/Political Division   * LINK  - Linked securities   * LKS - Linked Securities   * MAPL - Mixed Asset Portfolio Linked Security   * MM - Money Market   * NOTE  - Note   * OF - Obligations FonciÃres   * OPTN  - Options   * OTHL - Other Linked Security   * PAYS  - Payment streams   * PFD - Preferred   * PFND - Pfandbriefe   * POOL  - Pooled derivatives   * PSEC - Preferred Security   * PSTK - Preferred Stock   * REPO  - REPOS   * RMIC  - REMIC   * SHFL  - Short floats (auction)   * STRIPS - STRIPS   * SWAP  - Embedded swaps   * TR  - Trust   * TRUPS - Trust Preferred Security </value>
        [DataMember(Name = "securityType", EmitDefaultValue = true)]
        public string SecurityType { get; set; }

        /// <summary>
        /// Fixed Income Issuer Entity ID (-E).
        /// </summary>
        /// <value>Fixed Income Issuer Entity ID (-E).</value>
        [DataMember(Name = "issuerEntityId", EmitDefaultValue = true)]
        public string IssuerEntityId { get; set; }

        /// <summary>
        /// Returns the issuer type code of fixed income instruments.   * AGCY - Agency   * CORP - Corporate   * LAUTH - Local Authority/Political Division   * MUNI - Municipals   * SOV - Sovereign   * SUPR - Supranational   * SCOL - Securitized/Collateralized 
        /// </summary>
        /// <value>Returns the issuer type code of fixed income instruments.   * AGCY - Agency   * CORP - Corporate   * LAUTH - Local Authority/Political Division   * MUNI - Municipals   * SOV - Sovereign   * SUPR - Supranational   * SCOL - Securitized/Collateralized </value>
        [DataMember(Name = "issuerType", EmitDefaultValue = true)]
        public string IssuerType { get; set; }

        /// <summary>
        /// BID PRICE. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America.
        /// </summary>
        /// <value>BID PRICE. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America.</value>
        [DataMember(Name = "priceBid", EmitDefaultValue = true)]
        public double? PriceBid { get; set; }

        /// <summary>
        /// MID Price. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America.
        /// </summary>
        /// <value>MID Price. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America.</value>
        [DataMember(Name = "priceMid", EmitDefaultValue = true)]
        public double? PriceMid { get; set; }

        /// <summary>
        /// ASK Price. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America.
        /// </summary>
        /// <value>ASK Price. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America.</value>
        [DataMember(Name = "priceAsk", EmitDefaultValue = true)]
        public double? PriceAsk { get; set; }

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
            sb.Append("class FixedIncomePrice {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  SecurityType: ").Append(SecurityType).Append("\n");
            sb.Append("  IssuerEntityId: ").Append(IssuerEntityId).Append("\n");
            sb.Append("  IssuerType: ").Append(IssuerType).Append("\n");
            sb.Append("  PriceBid: ").Append(PriceBid).Append("\n");
            sb.Append("  PriceMid: ").Append(PriceMid).Append("\n");
            sb.Append("  PriceAsk: ").Append(PriceAsk).Append("\n");
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
            return this.Equals(input as FixedIncomePrice);
        }

        /// <summary>
        /// Returns true if FixedIncomePrice instances are equal
        /// </summary>
        /// <param name="input">Instance of FixedIncomePrice to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FixedIncomePrice input)
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
                    this.SecurityType == input.SecurityType ||
                    (this.SecurityType != null &&
                    this.SecurityType.Equals(input.SecurityType))
                ) && 
                (
                    this.IssuerEntityId == input.IssuerEntityId ||
                    (this.IssuerEntityId != null &&
                    this.IssuerEntityId.Equals(input.IssuerEntityId))
                ) && 
                (
                    this.IssuerType == input.IssuerType ||
                    (this.IssuerType != null &&
                    this.IssuerType.Equals(input.IssuerType))
                ) && 
                (
                    this.PriceBid == input.PriceBid ||
                    (this.PriceBid != null &&
                    this.PriceBid.Equals(input.PriceBid))
                ) && 
                (
                    this.PriceMid == input.PriceMid ||
                    (this.PriceMid != null &&
                    this.PriceMid.Equals(input.PriceMid))
                ) && 
                (
                    this.PriceAsk == input.PriceAsk ||
                    (this.PriceAsk != null &&
                    this.PriceAsk.Equals(input.PriceAsk))
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
                if (this.SecurityType != null)
                {
                    hashCode = (hashCode * 59) + this.SecurityType.GetHashCode();
                }
                if (this.IssuerEntityId != null)
                {
                    hashCode = (hashCode * 59) + this.IssuerEntityId.GetHashCode();
                }
                if (this.IssuerType != null)
                {
                    hashCode = (hashCode * 59) + this.IssuerType.GetHashCode();
                }
                if (this.PriceBid != null)
                {
                    hashCode = (hashCode * 59) + this.PriceBid.GetHashCode();
                }
                if (this.PriceMid != null)
                {
                    hashCode = (hashCode * 59) + this.PriceMid.GetHashCode();
                }
                if (this.PriceAsk != null)
                {
                    hashCode = (hashCode * 59) + this.PriceAsk.GetHashCode();
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
