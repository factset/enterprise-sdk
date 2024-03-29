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
    /// Fundamentals of a share instrument and of the company it belongs to.
    /// </summary>
    [DataContract(Name = "inline_response_200_data")]
    public partial class InlineResponse200Data : IEquatable<InlineResponse200Data>, IValidatableObject
    {
        /// <summary>
        /// Type of stock.
        /// </summary>
        /// <value>Type of stock.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StockTypeEnum
        {
            /// <summary>
            /// Enum Common for value: common
            /// </summary>
            [EnumMember(Value = "common")]
            Common = 1,

            /// <summary>
            /// Enum Preferred for value: preferred
            /// </summary>
            [EnumMember(Value = "preferred")]
            Preferred = 2,

            /// <summary>
            /// Enum DepositoryReceipt for value: depositoryReceipt
            /// </summary>
            [EnumMember(Value = "depositoryReceipt")]
            DepositoryReceipt = 3,

            /// <summary>
            /// Enum Other for value: other
            /// </summary>
            [EnumMember(Value = "other")]
            Other = 4

        }


        /// <summary>
        /// Type of stock.
        /// </summary>
        /// <value>Type of stock.</value>
        [DataMember(Name = "stockType", EmitDefaultValue = true)]
        public StockTypeEnum? StockType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200Data" /> class.
        /// </summary>
        /// <param name="name">Name of the instrument..</param>
        /// <param name="shortName">Short name of the instrument..</param>
        /// <param name="isin">The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument..</param>
        /// <param name="nsin">nsin.</param>
        /// <param name="fsym">fsym.</param>
        /// <param name="stockType">Type of stock..</param>
        /// <param name="company">company.</param>
        /// <param name="companyKeyFigures">companyKeyFigures.</param>
        /// <param name="shareInstrumentKeyFigures">shareInstrumentKeyFigures.</param>
        public InlineResponse200Data(string name = default(string), string shortName = default(string), string isin = default(string), InlineResponse200DataNsin nsin = default(InlineResponse200DataNsin), InlineResponse200DataFsym fsym = default(InlineResponse200DataFsym), StockTypeEnum? stockType = default(StockTypeEnum?), InlineResponse200DataCompany company = default(InlineResponse200DataCompany), InlineResponse200DataCompanyKeyFigures companyKeyFigures = default(InlineResponse200DataCompanyKeyFigures), InlineResponse200DataShareInstrumentKeyFigures shareInstrumentKeyFigures = default(InlineResponse200DataShareInstrumentKeyFigures))
        {
            this.Name = name;
            this.ShortName = shortName;
            this.Isin = isin;
            this.Nsin = nsin;
            this.Fsym = fsym;
            this.StockType = stockType;
            this.Company = company;
            this.CompanyKeyFigures = companyKeyFigures;
            this.ShareInstrumentKeyFigures = shareInstrumentKeyFigures;
        }

        /// <summary>
        /// Name of the instrument.
        /// </summary>
        /// <value>Name of the instrument.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Short name of the instrument.
        /// </summary>
        /// <value>Short name of the instrument.</value>
        [DataMember(Name = "shortName", EmitDefaultValue = true)]
        public string ShortName { get; set; }

        /// <summary>
        /// The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
        /// </summary>
        /// <value>The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.</value>
        [DataMember(Name = "isin", EmitDefaultValue = true)]
        public string Isin { get; set; }

        /// <summary>
        /// Gets or Sets Nsin
        /// </summary>
        [DataMember(Name = "nsin", EmitDefaultValue = false)]
        public InlineResponse200DataNsin Nsin { get; set; }

        /// <summary>
        /// Gets or Sets Fsym
        /// </summary>
        [DataMember(Name = "fsym", EmitDefaultValue = false)]
        public InlineResponse200DataFsym Fsym { get; set; }

        /// <summary>
        /// Gets or Sets Company
        /// </summary>
        [DataMember(Name = "company", EmitDefaultValue = false)]
        public InlineResponse200DataCompany Company { get; set; }

        /// <summary>
        /// Gets or Sets CompanyKeyFigures
        /// </summary>
        [DataMember(Name = "companyKeyFigures", EmitDefaultValue = false)]
        public InlineResponse200DataCompanyKeyFigures CompanyKeyFigures { get; set; }

        /// <summary>
        /// Gets or Sets ShareInstrumentKeyFigures
        /// </summary>
        [DataMember(Name = "shareInstrumentKeyFigures", EmitDefaultValue = false)]
        public InlineResponse200DataShareInstrumentKeyFigures ShareInstrumentKeyFigures { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200Data {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ShortName: ").Append(ShortName).Append("\n");
            sb.Append("  Isin: ").Append(Isin).Append("\n");
            sb.Append("  Nsin: ").Append(Nsin).Append("\n");
            sb.Append("  Fsym: ").Append(Fsym).Append("\n");
            sb.Append("  StockType: ").Append(StockType).Append("\n");
            sb.Append("  Company: ").Append(Company).Append("\n");
            sb.Append("  CompanyKeyFigures: ").Append(CompanyKeyFigures).Append("\n");
            sb.Append("  ShareInstrumentKeyFigures: ").Append(ShareInstrumentKeyFigures).Append("\n");
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
            return this.Equals(input as InlineResponse200Data);
        }

        /// <summary>
        /// Returns true if InlineResponse200Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ShortName == input.ShortName ||
                    (this.ShortName != null &&
                    this.ShortName.Equals(input.ShortName))
                ) && 
                (
                    this.Isin == input.Isin ||
                    (this.Isin != null &&
                    this.Isin.Equals(input.Isin))
                ) && 
                (
                    this.Nsin == input.Nsin ||
                    (this.Nsin != null &&
                    this.Nsin.Equals(input.Nsin))
                ) && 
                (
                    this.Fsym == input.Fsym ||
                    (this.Fsym != null &&
                    this.Fsym.Equals(input.Fsym))
                ) && 
                (
                    this.StockType == input.StockType ||
                    this.StockType.Equals(input.StockType)
                ) && 
                (
                    this.Company == input.Company ||
                    (this.Company != null &&
                    this.Company.Equals(input.Company))
                ) && 
                (
                    this.CompanyKeyFigures == input.CompanyKeyFigures ||
                    (this.CompanyKeyFigures != null &&
                    this.CompanyKeyFigures.Equals(input.CompanyKeyFigures))
                ) && 
                (
                    this.ShareInstrumentKeyFigures == input.ShareInstrumentKeyFigures ||
                    (this.ShareInstrumentKeyFigures != null &&
                    this.ShareInstrumentKeyFigures.Equals(input.ShareInstrumentKeyFigures))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.ShortName != null)
                {
                    hashCode = (hashCode * 59) + this.ShortName.GetHashCode();
                }
                if (this.Isin != null)
                {
                    hashCode = (hashCode * 59) + this.Isin.GetHashCode();
                }
                if (this.Nsin != null)
                {
                    hashCode = (hashCode * 59) + this.Nsin.GetHashCode();
                }
                if (this.Fsym != null)
                {
                    hashCode = (hashCode * 59) + this.Fsym.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.StockType.GetHashCode();
                if (this.Company != null)
                {
                    hashCode = (hashCode * 59) + this.Company.GetHashCode();
                }
                if (this.CompanyKeyFigures != null)
                {
                    hashCode = (hashCode * 59) + this.CompanyKeyFigures.GetHashCode();
                }
                if (this.ShareInstrumentKeyFigures != null)
                {
                    hashCode = (hashCode * 59) + this.ShareInstrumentKeyFigures.GetHashCode();
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
