/*
 * FactSet Prices API
 *
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p> 
 *
 * The version of the OpenAPI document: 1.2.1
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
    /// Dividend
    /// </summary>
    [DataContract(Name = "dividend")]
    public partial class Dividend : IEquatable<Dividend>, IValidatableObject
    {
        /// <summary>
        /// Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).
        /// </summary>
        /// <value>Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DivsNGFlagEnum
        {
            /// <summary>
            /// Enum N for value: N
            /// </summary>
            [EnumMember(Value = "N")]
            N = 1,

            /// <summary>
            /// Enum G for value: G
            /// </summary>
            [EnumMember(Value = "G")]
            G = 2,

            /// <summary>
            /// Enum T for value: T
            /// </summary>
            [EnumMember(Value = "T")]
            T = 3,

            /// <summary>
            /// Enum X for value: X
            /// </summary>
            [EnumMember(Value = "X")]
            X = 4,

            /// <summary>
            /// Enum V for value: V
            /// </summary>
            [EnumMember(Value = "V")]
            V = 5,

            /// <summary>
            /// Enum _0 for value: 0
            /// </summary>
            [EnumMember(Value = "0")]
            _0 = 6

        }


        /// <summary>
        /// Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).
        /// </summary>
        /// <value>Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).</value>
        [DataMember(Name = "divsNGFlag", EmitDefaultValue = true)]
        public DivsNGFlagEnum? DivsNGFlag { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Dividend" /> class.
        /// </summary>
        /// <param name="fsymId">Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet..</param>
        /// <param name="divsExDate">Ex-Date of the dividend expressed in YYYY-MM-DD format..</param>
        /// <param name="adjDate">Date of last split for which prices and volume have been adjusted..</param>
        /// <param name="currency">Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="divsPaid">Amount of the dividend paid..</param>
        /// <param name="divsRecDate">Date the dividend was recorded expressed in YYYY-MM-DD format..</param>
        /// <param name="divsPayDate">Date the dividend will be paid expressed in YYYY-MM-DD format..</param>
        /// <param name="divsTypeC">Dividend type code. For code descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764)..</param>
        /// <param name="divsTypeD">Description of dividend type. For type descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764)..</param>
        /// <param name="divsTaxC">Tax Marker Code. For code descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265)..</param>
        /// <param name="divsTaxD">Description of Tax Marker. For type descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265)..</param>
        /// <param name="divsNGFlag">Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512)..</param>
        /// <param name="divsNGEquiv">Net/Gross equivalent (opposite of dividend paid). For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512)..</param>
        /// <param name="requestId">Identifier that was used for the request..</param>
        public Dividend(string fsymId = default(string), DateTime? divsExDate = default(DateTime?), DateTime? adjDate = default(DateTime?), string currency = default(string), double? divsPaid = default(double?), DateTime? divsRecDate = default(DateTime?), DateTime? divsPayDate = default(DateTime?), int? divsTypeC = default(int?), string divsTypeD = default(string), string divsTaxC = default(string), string divsTaxD = default(string), DivsNGFlagEnum? divsNGFlag = default(DivsNGFlagEnum?), double? divsNGEquiv = default(double?), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.DivsExDate = divsExDate;
            this.AdjDate = adjDate;
            this.Currency = currency;
            this.DivsPaid = divsPaid;
            this.DivsRecDate = divsRecDate;
            this.DivsPayDate = divsPayDate;
            this.DivsTypeC = divsTypeC;
            this.DivsTypeD = divsTypeD;
            this.DivsTaxC = divsTaxC;
            this.DivsTaxD = divsTaxD;
            this.DivsNGFlag = divsNGFlag;
            this.DivsNGEquiv = divsNGEquiv;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
        /// </summary>
        /// <value>Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Ex-Date of the dividend expressed in YYYY-MM-DD format.
        /// </summary>
        /// <value>Ex-Date of the dividend expressed in YYYY-MM-DD format.</value>
        [DataMember(Name = "divsExDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? DivsExDate { get; set; }

        /// <summary>
        /// Date of last split for which prices and volume have been adjusted.
        /// </summary>
        /// <value>Date of last split for which prices and volume have been adjusted.</value>
        [DataMember(Name = "adjDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? AdjDate { get; set; }

        /// <summary>
        /// Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Amount of the dividend paid.
        /// </summary>
        /// <value>Amount of the dividend paid.</value>
        [DataMember(Name = "divsPaid", EmitDefaultValue = true)]
        public double? DivsPaid { get; set; }

        /// <summary>
        /// Date the dividend was recorded expressed in YYYY-MM-DD format.
        /// </summary>
        /// <value>Date the dividend was recorded expressed in YYYY-MM-DD format.</value>
        [DataMember(Name = "divsRecDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? DivsRecDate { get; set; }

        /// <summary>
        /// Date the dividend will be paid expressed in YYYY-MM-DD format.
        /// </summary>
        /// <value>Date the dividend will be paid expressed in YYYY-MM-DD format.</value>
        [DataMember(Name = "divsPayDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? DivsPayDate { get; set; }

        /// <summary>
        /// Dividend type code. For code descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764).
        /// </summary>
        /// <value>Dividend type code. For code descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764).</value>
        [DataMember(Name = "divsTypeC", EmitDefaultValue = true)]
        public int? DivsTypeC { get; set; }

        /// <summary>
        /// Description of dividend type. For type descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764).
        /// </summary>
        /// <value>Description of dividend type. For type descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764).</value>
        [DataMember(Name = "divsTypeD", EmitDefaultValue = true)]
        public string DivsTypeD { get; set; }

        /// <summary>
        /// Tax Marker Code. For code descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265).
        /// </summary>
        /// <value>Tax Marker Code. For code descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265).</value>
        [DataMember(Name = "divsTaxC", EmitDefaultValue = true)]
        public string DivsTaxC { get; set; }

        /// <summary>
        /// Description of Tax Marker. For type descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265).
        /// </summary>
        /// <value>Description of Tax Marker. For type descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265).</value>
        [DataMember(Name = "divsTaxD", EmitDefaultValue = true)]
        public string DivsTaxD { get; set; }

        /// <summary>
        /// Net/Gross equivalent (opposite of dividend paid). For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).
        /// </summary>
        /// <value>Net/Gross equivalent (opposite of dividend paid). For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).</value>
        [DataMember(Name = "divsNGEquiv", EmitDefaultValue = true)]
        public double? DivsNGEquiv { get; set; }

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
            sb.Append("class Dividend {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  DivsExDate: ").Append(DivsExDate).Append("\n");
            sb.Append("  AdjDate: ").Append(AdjDate).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  DivsPaid: ").Append(DivsPaid).Append("\n");
            sb.Append("  DivsRecDate: ").Append(DivsRecDate).Append("\n");
            sb.Append("  DivsPayDate: ").Append(DivsPayDate).Append("\n");
            sb.Append("  DivsTypeC: ").Append(DivsTypeC).Append("\n");
            sb.Append("  DivsTypeD: ").Append(DivsTypeD).Append("\n");
            sb.Append("  DivsTaxC: ").Append(DivsTaxC).Append("\n");
            sb.Append("  DivsTaxD: ").Append(DivsTaxD).Append("\n");
            sb.Append("  DivsNGFlag: ").Append(DivsNGFlag).Append("\n");
            sb.Append("  DivsNGEquiv: ").Append(DivsNGEquiv).Append("\n");
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
            return this.Equals(input as Dividend);
        }

        /// <summary>
        /// Returns true if Dividend instances are equal
        /// </summary>
        /// <param name="input">Instance of Dividend to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Dividend input)
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
                    this.DivsExDate == input.DivsExDate ||
                    (this.DivsExDate != null &&
                    this.DivsExDate.Equals(input.DivsExDate))
                ) && 
                (
                    this.AdjDate == input.AdjDate ||
                    (this.AdjDate != null &&
                    this.AdjDate.Equals(input.AdjDate))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.DivsPaid == input.DivsPaid ||
                    (this.DivsPaid != null &&
                    this.DivsPaid.Equals(input.DivsPaid))
                ) && 
                (
                    this.DivsRecDate == input.DivsRecDate ||
                    (this.DivsRecDate != null &&
                    this.DivsRecDate.Equals(input.DivsRecDate))
                ) && 
                (
                    this.DivsPayDate == input.DivsPayDate ||
                    (this.DivsPayDate != null &&
                    this.DivsPayDate.Equals(input.DivsPayDate))
                ) && 
                (
                    this.DivsTypeC == input.DivsTypeC ||
                    (this.DivsTypeC != null &&
                    this.DivsTypeC.Equals(input.DivsTypeC))
                ) && 
                (
                    this.DivsTypeD == input.DivsTypeD ||
                    (this.DivsTypeD != null &&
                    this.DivsTypeD.Equals(input.DivsTypeD))
                ) && 
                (
                    this.DivsTaxC == input.DivsTaxC ||
                    (this.DivsTaxC != null &&
                    this.DivsTaxC.Equals(input.DivsTaxC))
                ) && 
                (
                    this.DivsTaxD == input.DivsTaxD ||
                    (this.DivsTaxD != null &&
                    this.DivsTaxD.Equals(input.DivsTaxD))
                ) && 
                (
                    this.DivsNGFlag == input.DivsNGFlag ||
                    this.DivsNGFlag.Equals(input.DivsNGFlag)
                ) && 
                (
                    this.DivsNGEquiv == input.DivsNGEquiv ||
                    (this.DivsNGEquiv != null &&
                    this.DivsNGEquiv.Equals(input.DivsNGEquiv))
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
                if (this.DivsExDate != null)
                {
                    hashCode = (hashCode * 59) + this.DivsExDate.GetHashCode();
                }
                if (this.AdjDate != null)
                {
                    hashCode = (hashCode * 59) + this.AdjDate.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.DivsPaid != null)
                {
                    hashCode = (hashCode * 59) + this.DivsPaid.GetHashCode();
                }
                if (this.DivsRecDate != null)
                {
                    hashCode = (hashCode * 59) + this.DivsRecDate.GetHashCode();
                }
                if (this.DivsPayDate != null)
                {
                    hashCode = (hashCode * 59) + this.DivsPayDate.GetHashCode();
                }
                if (this.DivsTypeC != null)
                {
                    hashCode = (hashCode * 59) + this.DivsTypeC.GetHashCode();
                }
                if (this.DivsTypeD != null)
                {
                    hashCode = (hashCode * 59) + this.DivsTypeD.GetHashCode();
                }
                if (this.DivsTaxC != null)
                {
                    hashCode = (hashCode * 59) + this.DivsTaxC.GetHashCode();
                }
                if (this.DivsTaxD != null)
                {
                    hashCode = (hashCode * 59) + this.DivsTaxD.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.DivsNGFlag.GetHashCode();
                if (this.DivsNGEquiv != null)
                {
                    hashCode = (hashCode * 59) + this.DivsNGEquiv.GetHashCode();
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
