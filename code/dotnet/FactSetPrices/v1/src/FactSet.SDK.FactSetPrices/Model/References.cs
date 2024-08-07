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
    /// References
    /// </summary>
    [DataContract(Name = "references")]
    public partial class References : IEquatable<References>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="References" /> class.
        /// </summary>
        /// <param name="fsymId">Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet..</param>
        /// <param name="name">The name of the security..</param>
        /// <param name="secType">Security Type Description. For more details, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149)..</param>
        /// <param name="secTypeCode">General Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149)..</param>
        /// <param name="secTypeCodeDet">Detailed Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149)..</param>
        /// <param name="currency">Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="country">Country Name. Returns the country where the security is *traded* from the North American Pricing database. Therefore, for securities covered by the North American Pricing database, will return either UNITED STATES. or CANADA. For securities covered by the Global Pricing database, the item returns the country where the company is *incorporated*..</param>
        /// <param name="primaryExchange">Primary Exchange Name. For more details, visit [Online Assistant Page #16610](https://oa.apps.factset.com/pages/16610)..</param>
        /// <param name="exchangeCountry">Returns the location of the exchange where the company&#39;s stock is traded..</param>
        /// <param name="localIndex">The Local Index ID for the company&#39;s home country benchmark. For more details, visit [Online Assistant Page #10698](https://oa.apps.factset.com/pages/10698)..</param>
        /// <param name="nextTradingHolidayDate">The Next Trading Holiday. For more details regarding Global Trading Holiday Schedules, visit [Online Assistant Page #10397](https://oa.apps.factset.com/pages/10397)..</param>
        /// <param name="firstDate">The Security&#39;s Date of First Trade. It will return the first date that the FactSet Pricing database began to cover the security and it may not coincide with the actual IPO date. Pricing information for this security will not be available before the date returned. For more details..</param>
        /// <param name="lastDate">Date of Last Trade.  It will return the last date that the FactSet Pricing database as a record for this security listing..</param>
        /// <param name="requestId">Identifier that was used for the request..</param>
        public References(string fsymId = default(string), string name = default(string), string secType = default(string), string secTypeCode = default(string), string secTypeCodeDet = default(string), string currency = default(string), string country = default(string), string primaryExchange = default(string), string exchangeCountry = default(string), string localIndex = default(string), DateTime? nextTradingHolidayDate = default(DateTime?), DateTime? firstDate = default(DateTime?), DateTime? lastDate = default(DateTime?), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Name = name;
            this.SecType = secType;
            this.SecTypeCode = secTypeCode;
            this.SecTypeCodeDet = secTypeCodeDet;
            this.Currency = currency;
            this.Country = country;
            this.PrimaryExchange = primaryExchange;
            this.ExchangeCountry = exchangeCountry;
            this.LocalIndex = localIndex;
            this.NextTradingHolidayDate = nextTradingHolidayDate;
            this.FirstDate = firstDate;
            this.LastDate = lastDate;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
        /// </summary>
        /// <value>Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// The name of the security.
        /// </summary>
        /// <value>The name of the security.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Security Type Description. For more details, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).
        /// </summary>
        /// <value>Security Type Description. For more details, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).</value>
        [DataMember(Name = "secType", EmitDefaultValue = true)]
        public string SecType { get; set; }

        /// <summary>
        /// General Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).
        /// </summary>
        /// <value>General Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).</value>
        [DataMember(Name = "secTypeCode", EmitDefaultValue = true)]
        public string SecTypeCode { get; set; }

        /// <summary>
        /// Detailed Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).
        /// </summary>
        /// <value>Detailed Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).</value>
        [DataMember(Name = "secTypeCodeDet", EmitDefaultValue = true)]
        public string SecTypeCodeDet { get; set; }

        /// <summary>
        /// Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Country Name. Returns the country where the security is *traded* from the North American Pricing database. Therefore, for securities covered by the North American Pricing database, will return either UNITED STATES. or CANADA. For securities covered by the Global Pricing database, the item returns the country where the company is *incorporated*.
        /// </summary>
        /// <value>Country Name. Returns the country where the security is *traded* from the North American Pricing database. Therefore, for securities covered by the North American Pricing database, will return either UNITED STATES. or CANADA. For securities covered by the Global Pricing database, the item returns the country where the company is *incorporated*.</value>
        [DataMember(Name = "country", EmitDefaultValue = true)]
        public string Country { get; set; }

        /// <summary>
        /// Primary Exchange Name. For more details, visit [Online Assistant Page #16610](https://oa.apps.factset.com/pages/16610).
        /// </summary>
        /// <value>Primary Exchange Name. For more details, visit [Online Assistant Page #16610](https://oa.apps.factset.com/pages/16610).</value>
        [DataMember(Name = "primaryExchange", EmitDefaultValue = true)]
        public string PrimaryExchange { get; set; }

        /// <summary>
        /// Returns the location of the exchange where the company&#39;s stock is traded.
        /// </summary>
        /// <value>Returns the location of the exchange where the company&#39;s stock is traded.</value>
        [DataMember(Name = "exchangeCountry", EmitDefaultValue = true)]
        public string ExchangeCountry { get; set; }

        /// <summary>
        /// The Local Index ID for the company&#39;s home country benchmark. For more details, visit [Online Assistant Page #10698](https://oa.apps.factset.com/pages/10698).
        /// </summary>
        /// <value>The Local Index ID for the company&#39;s home country benchmark. For more details, visit [Online Assistant Page #10698](https://oa.apps.factset.com/pages/10698).</value>
        [DataMember(Name = "localIndex", EmitDefaultValue = true)]
        public string LocalIndex { get; set; }

        /// <summary>
        /// The Next Trading Holiday. For more details regarding Global Trading Holiday Schedules, visit [Online Assistant Page #10397](https://oa.apps.factset.com/pages/10397).
        /// </summary>
        /// <value>The Next Trading Holiday. For more details regarding Global Trading Holiday Schedules, visit [Online Assistant Page #10397](https://oa.apps.factset.com/pages/10397).</value>
        [DataMember(Name = "nextTradingHolidayDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? NextTradingHolidayDate { get; set; }

        /// <summary>
        /// The Security&#39;s Date of First Trade. It will return the first date that the FactSet Pricing database began to cover the security and it may not coincide with the actual IPO date. Pricing information for this security will not be available before the date returned. For more details.
        /// </summary>
        /// <value>The Security&#39;s Date of First Trade. It will return the first date that the FactSet Pricing database began to cover the security and it may not coincide with the actual IPO date. Pricing information for this security will not be available before the date returned. For more details.</value>
        [DataMember(Name = "firstDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? FirstDate { get; set; }

        /// <summary>
        /// Date of Last Trade.  It will return the last date that the FactSet Pricing database as a record for this security listing.
        /// </summary>
        /// <value>Date of Last Trade.  It will return the last date that the FactSet Pricing database as a record for this security listing.</value>
        [DataMember(Name = "lastDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? LastDate { get; set; }

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
            sb.Append("class References {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  SecType: ").Append(SecType).Append("\n");
            sb.Append("  SecTypeCode: ").Append(SecTypeCode).Append("\n");
            sb.Append("  SecTypeCodeDet: ").Append(SecTypeCodeDet).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  PrimaryExchange: ").Append(PrimaryExchange).Append("\n");
            sb.Append("  ExchangeCountry: ").Append(ExchangeCountry).Append("\n");
            sb.Append("  LocalIndex: ").Append(LocalIndex).Append("\n");
            sb.Append("  NextTradingHolidayDate: ").Append(NextTradingHolidayDate).Append("\n");
            sb.Append("  FirstDate: ").Append(FirstDate).Append("\n");
            sb.Append("  LastDate: ").Append(LastDate).Append("\n");
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
            return this.Equals(input as References);
        }

        /// <summary>
        /// Returns true if References instances are equal
        /// </summary>
        /// <param name="input">Instance of References to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(References input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.SecType == input.SecType ||
                    (this.SecType != null &&
                    this.SecType.Equals(input.SecType))
                ) && 
                (
                    this.SecTypeCode == input.SecTypeCode ||
                    (this.SecTypeCode != null &&
                    this.SecTypeCode.Equals(input.SecTypeCode))
                ) && 
                (
                    this.SecTypeCodeDet == input.SecTypeCodeDet ||
                    (this.SecTypeCodeDet != null &&
                    this.SecTypeCodeDet.Equals(input.SecTypeCodeDet))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.PrimaryExchange == input.PrimaryExchange ||
                    (this.PrimaryExchange != null &&
                    this.PrimaryExchange.Equals(input.PrimaryExchange))
                ) && 
                (
                    this.ExchangeCountry == input.ExchangeCountry ||
                    (this.ExchangeCountry != null &&
                    this.ExchangeCountry.Equals(input.ExchangeCountry))
                ) && 
                (
                    this.LocalIndex == input.LocalIndex ||
                    (this.LocalIndex != null &&
                    this.LocalIndex.Equals(input.LocalIndex))
                ) && 
                (
                    this.NextTradingHolidayDate == input.NextTradingHolidayDate ||
                    (this.NextTradingHolidayDate != null &&
                    this.NextTradingHolidayDate.Equals(input.NextTradingHolidayDate))
                ) && 
                (
                    this.FirstDate == input.FirstDate ||
                    (this.FirstDate != null &&
                    this.FirstDate.Equals(input.FirstDate))
                ) && 
                (
                    this.LastDate == input.LastDate ||
                    (this.LastDate != null &&
                    this.LastDate.Equals(input.LastDate))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.SecType != null)
                {
                    hashCode = (hashCode * 59) + this.SecType.GetHashCode();
                }
                if (this.SecTypeCode != null)
                {
                    hashCode = (hashCode * 59) + this.SecTypeCode.GetHashCode();
                }
                if (this.SecTypeCodeDet != null)
                {
                    hashCode = (hashCode * 59) + this.SecTypeCodeDet.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Country != null)
                {
                    hashCode = (hashCode * 59) + this.Country.GetHashCode();
                }
                if (this.PrimaryExchange != null)
                {
                    hashCode = (hashCode * 59) + this.PrimaryExchange.GetHashCode();
                }
                if (this.ExchangeCountry != null)
                {
                    hashCode = (hashCode * 59) + this.ExchangeCountry.GetHashCode();
                }
                if (this.LocalIndex != null)
                {
                    hashCode = (hashCode * 59) + this.LocalIndex.GetHashCode();
                }
                if (this.NextTradingHolidayDate != null)
                {
                    hashCode = (hashCode * 59) + this.NextTradingHolidayDate.GetHashCode();
                }
                if (this.FirstDate != null)
                {
                    hashCode = (hashCode * 59) + this.FirstDate.GetHashCode();
                }
                if (this.LastDate != null)
                {
                    hashCode = (hashCode * 59) + this.LastDate.GetHashCode();
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
