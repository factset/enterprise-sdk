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
    /// Price
    /// </summary>
    [DataContract(Name = "price")]
    public partial class Price : IEquatable<Price>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Price" /> class.
        /// </summary>
        /// <param name="fsymId">Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet..</param>
        /// <param name="date">Ending date for the period expressed in YYYY-MM-DD format..</param>
        /// <param name="adjDate">Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split..</param>
        /// <param name="currency">Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="price">Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET..</param>
        /// <param name="priceOpen">Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET..</param>
        /// <param name="priceHigh">High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET..</param>
        /// <param name="priceLow">Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET..</param>
        /// <param name="volume">Returns the cumulative volume over dates requested. Data is returned in thousands..</param>
        /// <param name="requestId">Identifier that was used for the request..</param>
        public Price(string fsymId = default(string), DateTime? date = default(DateTime?), DateTime? adjDate = default(DateTime?), string currency = default(string), double? price = default(double?), double? priceOpen = default(double?), double? priceHigh = default(double?), double? priceLow = default(double?), double? volume = default(double?), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Date = date;
            this.AdjDate = adjDate;
            this.Currency = currency;
            this._Price = price;
            this.PriceOpen = priceOpen;
            this.PriceHigh = priceHigh;
            this.PriceLow = priceLow;
            this.Volume = volume;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
        /// </summary>
        /// <value>Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.</value>
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
        /// Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split.
        /// </summary>
        /// <value>Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split.</value>
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
        /// Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.
        /// </summary>
        /// <value>Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.</value>
        [DataMember(Name = "price", EmitDefaultValue = true)]
        public double? _Price { get; set; }

        /// <summary>
        /// Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.
        /// </summary>
        /// <value>Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.</value>
        [DataMember(Name = "priceOpen", EmitDefaultValue = true)]
        public double? PriceOpen { get; set; }

        /// <summary>
        /// High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.
        /// </summary>
        /// <value>High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.</value>
        [DataMember(Name = "priceHigh", EmitDefaultValue = true)]
        public double? PriceHigh { get; set; }

        /// <summary>
        /// Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.
        /// </summary>
        /// <value>Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.</value>
        [DataMember(Name = "priceLow", EmitDefaultValue = true)]
        public double? PriceLow { get; set; }

        /// <summary>
        /// Returns the cumulative volume over dates requested. Data is returned in thousands.
        /// </summary>
        /// <value>Returns the cumulative volume over dates requested. Data is returned in thousands.</value>
        [DataMember(Name = "volume", EmitDefaultValue = true)]
        public double? Volume { get; set; }

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
            sb.Append("class Price {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  AdjDate: ").Append(AdjDate).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  _Price: ").Append(_Price).Append("\n");
            sb.Append("  PriceOpen: ").Append(PriceOpen).Append("\n");
            sb.Append("  PriceHigh: ").Append(PriceHigh).Append("\n");
            sb.Append("  PriceLow: ").Append(PriceLow).Append("\n");
            sb.Append("  Volume: ").Append(Volume).Append("\n");
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
            return this.Equals(input as Price);
        }

        /// <summary>
        /// Returns true if Price instances are equal
        /// </summary>
        /// <param name="input">Instance of Price to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Price input)
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
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this._Price == input._Price ||
                    (this._Price != null &&
                    this._Price.Equals(input._Price))
                ) && 
                (
                    this.PriceOpen == input.PriceOpen ||
                    (this.PriceOpen != null &&
                    this.PriceOpen.Equals(input.PriceOpen))
                ) && 
                (
                    this.PriceHigh == input.PriceHigh ||
                    (this.PriceHigh != null &&
                    this.PriceHigh.Equals(input.PriceHigh))
                ) && 
                (
                    this.PriceLow == input.PriceLow ||
                    (this.PriceLow != null &&
                    this.PriceLow.Equals(input.PriceLow))
                ) && 
                (
                    this.Volume == input.Volume ||
                    (this.Volume != null &&
                    this.Volume.Equals(input.Volume))
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
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this._Price != null)
                {
                    hashCode = (hashCode * 59) + this._Price.GetHashCode();
                }
                if (this.PriceOpen != null)
                {
                    hashCode = (hashCode * 59) + this.PriceOpen.GetHashCode();
                }
                if (this.PriceHigh != null)
                {
                    hashCode = (hashCode * 59) + this.PriceHigh.GetHashCode();
                }
                if (this.PriceLow != null)
                {
                    hashCode = (hashCode * 59) + this.PriceLow.GetHashCode();
                }
                if (this.Volume != null)
                {
                    hashCode = (hashCode * 59) + this.Volume.GetHashCode();
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
