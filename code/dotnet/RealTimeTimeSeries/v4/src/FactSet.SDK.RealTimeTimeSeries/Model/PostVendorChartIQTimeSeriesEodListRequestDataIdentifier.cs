/*
 * Real-Time Time Series API
 *
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 4.0.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeTimeSeries.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeTimeSeries.Model
{
    /// <summary>
    /// Identifier and type.
    /// </summary>
    [DataContract(Name = "PostVendorChartIQTimeSeriesEodListRequest_data_identifier")]
    public partial class PostVendorChartIQTimeSeriesEodListRequestDataIdentifier : IEquatable<PostVendorChartIQTimeSeriesEodListRequestDataIdentifier>, IValidatableObject
    {
        /// <summary>
        /// Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
        /// </summary>
        /// <value>Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum IdInstrument for value: idInstrument
            /// </summary>
            [EnumMember(Value = "idInstrument")]
            IdInstrument = 1,

            /// <summary>
            /// Enum IdNotation for value: idNotation
            /// </summary>
            [EnumMember(Value = "idNotation")]
            IdNotation = 2,

            /// <summary>
            /// Enum FdsPermanentIdentifierSecurity for value: fdsPermanentIdentifierSecurity
            /// </summary>
            [EnumMember(Value = "fdsPermanentIdentifierSecurity")]
            FdsPermanentIdentifierSecurity = 3,

            /// <summary>
            /// Enum FdsPermanentIdentifierListing for value: fdsPermanentIdentifierListing
            /// </summary>
            [EnumMember(Value = "fdsPermanentIdentifierListing")]
            FdsPermanentIdentifierListing = 4,

            /// <summary>
            /// Enum FdsPermanentIdentifierRegional for value: fdsPermanentIdentifierRegional
            /// </summary>
            [EnumMember(Value = "fdsPermanentIdentifierRegional")]
            FdsPermanentIdentifierRegional = 5,

            /// <summary>
            /// Enum TickerExchange for value: tickerExchange
            /// </summary>
            [EnumMember(Value = "tickerExchange")]
            TickerExchange = 6,

            /// <summary>
            /// Enum TickerRegion for value: tickerRegion
            /// </summary>
            [EnumMember(Value = "tickerRegion")]
            TickerRegion = 7,

            /// <summary>
            /// Enum Sedol for value: sedol
            /// </summary>
            [EnumMember(Value = "sedol")]
            Sedol = 8,

            /// <summary>
            /// Enum Isin for value: isin
            /// </summary>
            [EnumMember(Value = "isin")]
            Isin = 9,

            /// <summary>
            /// Enum Wkn for value: wkn
            /// </summary>
            [EnumMember(Value = "wkn")]
            Wkn = 10,

            /// <summary>
            /// Enum Valor for value: valor
            /// </summary>
            [EnumMember(Value = "valor")]
            Valor = 11,

            /// <summary>
            /// Enum Cusip for value: cusip
            /// </summary>
            [EnumMember(Value = "cusip")]
            Cusip = 12

        }


        /// <summary>
        /// Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
        /// </summary>
        /// <value>Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  </value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostVendorChartIQTimeSeriesEodListRequestDataIdentifier" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostVendorChartIQTimeSeriesEodListRequestDataIdentifier() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostVendorChartIQTimeSeriesEodListRequestDataIdentifier" /> class.
        /// </summary>
        /// <param name="value">Identifier to resolve. (required).</param>
        /// <param name="type">Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required).</param>
        public PostVendorChartIQTimeSeriesEodListRequestDataIdentifier(string value, TypeEnum type)
        {
            // to ensure "value" is required (not null)
            if (value == null) {
                throw new ArgumentNullException("value is a required property for PostVendorChartIQTimeSeriesEodListRequestDataIdentifier and cannot be null");
            }
            this.Value = value;
            this.Type = type;
        }

        /// <summary>
        /// Identifier to resolve.
        /// </summary>
        /// <value>Identifier to resolve.</value>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostVendorChartIQTimeSeriesEodListRequestDataIdentifier {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as PostVendorChartIQTimeSeriesEodListRequestDataIdentifier);
        }

        /// <summary>
        /// Returns true if PostVendorChartIQTimeSeriesEodListRequestDataIdentifier instances are equal
        /// </summary>
        /// <param name="input">Instance of PostVendorChartIQTimeSeriesEodListRequestDataIdentifier to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostVendorChartIQTimeSeriesEodListRequestDataIdentifier input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
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
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
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
            // Value (string) maxLength
            if (this.Value != null && this.Value.Length > 50)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Value, length must be less than 50.", new [] { "Value" });
            }

            // Value (string) minLength
            if (this.Value != null && this.Value.Length < 3)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Value, length must be greater than 3.", new [] { "Value" });
            }

            // Value (string) pattern
            Regex regexValue = new Regex(@"^[B-DF-HJ-NP-TV-Z0-9]{6}-[SLR]$|^[A-Z0-9.#&*+]{1,47}-[A-Z0-9]{2,4}$|^[0-9]{3,20}$|^[B-DF-HJ-NP-TV-Z0-9]{6}[0-9]$|^[A-Z]{2}[A-Z0-9]{9}[0-9]$|^[A-Z1-9][A-Z0-9]{5}$|^[0-9]{1,9}$|^[A-Z0-9]{8}[0-9]$", RegexOptions.CultureInvariant);
            if (false == regexValue.Match(this.Value).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Value, must match a pattern of " + regexValue, new [] { "Value" });
            }

            yield break;
        }
    }

}
