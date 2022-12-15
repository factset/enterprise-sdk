/*
 * Stocks API For Digital Portals
 *
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// Main currency of the currency-dependent attributes.
    /// </summary>
    [DataContract(Name = "PostCompanyKeyItemsCurrentGetByInstrumentRequest_data_currency")]
    public partial class PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency : IEquatable<PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency>, IValidatableObject
    {
        /// <summary>
        /// ISO code of the currency.
        /// </summary>
        /// <value>ISO code of the currency.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum IsoCodeEnum
        {
            /// <summary>
            /// Enum EUR for value: EUR
            /// </summary>
            [EnumMember(Value = "EUR")]
            EUR = 1,

            /// <summary>
            /// Enum USD for value: USD
            /// </summary>
            [EnumMember(Value = "USD")]
            USD = 2,

            /// <summary>
            /// Enum GBP for value: GBP
            /// </summary>
            [EnumMember(Value = "GBP")]
            GBP = 3,

            /// <summary>
            /// Enum CHF for value: CHF
            /// </summary>
            [EnumMember(Value = "CHF")]
            CHF = 4

        }


        /// <summary>
        /// ISO code of the currency.
        /// </summary>
        /// <value>ISO code of the currency.</value>
        [DataMember(Name = "isoCode", IsRequired = true, EmitDefaultValue = false)]
        public IsoCodeEnum IsoCode { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency" /> class.
        /// </summary>
        /// <param name="isoCode">ISO code of the currency. (required).</param>
        public PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency(IsoCodeEnum isoCode)
        {
            this.IsoCode = isoCode;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency {\n");
            sb.Append("  IsoCode: ").Append(IsoCode).Append("\n");
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
            return this.Equals(input as PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency);
        }

        /// <summary>
        /// Returns true if PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency instances are equal
        /// </summary>
        /// <param name="input">Instance of PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IsoCode == input.IsoCode ||
                    this.IsoCode.Equals(input.IsoCode)
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
                hashCode = (hashCode * 59) + this.IsoCode.GetHashCode();
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
