/*
 * Funds API For Digital Portals
 *
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
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
using OpenAPIDateConverter = FactSet.SDK.FundsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FundsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Values and value ranges of the parameters related to funds.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_fund")]
    public partial class InlineResponse2005DataFund : IEquatable<InlineResponse2005DataFund>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataFund" /> class.
        /// </summary>
        /// <param name="etf">Indicates whether ETFs (&#x60;true&#x60;) and mutual funds (&#x60;false&#x60;) are among the results..</param>
        /// <param name="currency">List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values..</param>
        /// <param name="domicile">List of countries representing domiciles of funds. See endpoint &#x60;/basic/region/country/list&#x60; for possible values..</param>
        /// <param name="holdingType">Lists of categories of the holdings&#39; asset type classification. Asset type of the holdings is a category from any level of category system \&quot;Asset class classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;288&#x60; for possible values..</param>
        /// <param name="countryDevelopment">Lists of categories of the holdings&#39; country development level classification. Country development level of the holdings is a category from any level of category system \&quot;Country development level classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;289&#x60; for possible values..</param>
        /// <param name="regionalExposure">regionalExposure.</param>
        /// <param name="strategy">Lists of categories of the strategy classification. Strategy is a category from any level of category system \&quot;Three-tier strategy classification system for funds defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;292&#x60; for possible values..</param>
        /// <param name="industry">Lists of categories of the industry classification. Industry is a category from any level of category system \&quot;Funds classification defined by FactSet Digital Solutions\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;27&#x60; for possible values..</param>
        /// <param name="srri">List of values for the synthetic risk and reward indicator (SRRI)..</param>
        /// <param name="issuer">issuer.</param>
        /// <param name="assetsUnderManagement">assetsUnderManagement.</param>
        /// <param name="compliance">List of compliance properties for funds. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/legalEntity/complianceProperty/list&#x60; for the full list of compliance properties associated with legal entities (across all roles). .</param>
        public InlineResponse2005DataFund(List<InlineResponse2005DataFundEtf> etf = default(List<InlineResponse2005DataFundEtf>), List<InlineResponse2005DataFundCurrency> currency = default(List<InlineResponse2005DataFundCurrency>), List<InlineResponse2005DataFundDomicile> domicile = default(List<InlineResponse2005DataFundDomicile>), List<InlineResponse2005DataFundHoldingType> holdingType = default(List<InlineResponse2005DataFundHoldingType>), List<InlineResponse2005DataFundHoldingType> countryDevelopment = default(List<InlineResponse2005DataFundHoldingType>), InlineResponse2005DataFundRegionalExposure regionalExposure = default(InlineResponse2005DataFundRegionalExposure), List<InlineResponse2005DataFundHoldingType> strategy = default(List<InlineResponse2005DataFundHoldingType>), List<InlineResponse2005DataFundHoldingType> industry = default(List<InlineResponse2005DataFundHoldingType>), List<InlineResponse2005DataFundSrri> srri = default(List<InlineResponse2005DataFundSrri>), InlineResponse2005DataFundIssuer issuer = default(InlineResponse2005DataFundIssuer), InlineResponse2005DataFundAssetsUnderManagement assetsUnderManagement = default(InlineResponse2005DataFundAssetsUnderManagement), List<InlineResponse2005DataFundCompliance> compliance = default(List<InlineResponse2005DataFundCompliance>))
        {
            this.Etf = etf;
            this.Currency = currency;
            this.Domicile = domicile;
            this.HoldingType = holdingType;
            this.CountryDevelopment = countryDevelopment;
            this.RegionalExposure = regionalExposure;
            this.Strategy = strategy;
            this.Industry = industry;
            this.Srri = srri;
            this.Issuer = issuer;
            this.AssetsUnderManagement = assetsUnderManagement;
            this.Compliance = compliance;
        }

        /// <summary>
        /// Indicates whether ETFs (&#x60;true&#x60;) and mutual funds (&#x60;false&#x60;) are among the results.
        /// </summary>
        /// <value>Indicates whether ETFs (&#x60;true&#x60;) and mutual funds (&#x60;false&#x60;) are among the results.</value>
        [DataMember(Name = "etf", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundEtf> Etf { get; set; }

        /// <summary>
        /// List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values.
        /// </summary>
        /// <value>List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values.</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundCurrency> Currency { get; set; }

        /// <summary>
        /// List of countries representing domiciles of funds. See endpoint &#x60;/basic/region/country/list&#x60; for possible values.
        /// </summary>
        /// <value>List of countries representing domiciles of funds. See endpoint &#x60;/basic/region/country/list&#x60; for possible values.</value>
        [DataMember(Name = "domicile", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundDomicile> Domicile { get; set; }

        /// <summary>
        /// Lists of categories of the holdings&#39; asset type classification. Asset type of the holdings is a category from any level of category system \&quot;Asset class classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;288&#x60; for possible values.
        /// </summary>
        /// <value>Lists of categories of the holdings&#39; asset type classification. Asset type of the holdings is a category from any level of category system \&quot;Asset class classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;288&#x60; for possible values.</value>
        [DataMember(Name = "holdingType", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundHoldingType> HoldingType { get; set; }

        /// <summary>
        /// Lists of categories of the holdings&#39; country development level classification. Country development level of the holdings is a category from any level of category system \&quot;Country development level classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;289&#x60; for possible values.
        /// </summary>
        /// <value>Lists of categories of the holdings&#39; country development level classification. Country development level of the holdings is a category from any level of category system \&quot;Country development level classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;289&#x60; for possible values.</value>
        [DataMember(Name = "countryDevelopment", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundHoldingType> CountryDevelopment { get; set; }

        /// <summary>
        /// Gets or Sets RegionalExposure
        /// </summary>
        [DataMember(Name = "regionalExposure", EmitDefaultValue = false)]
        public InlineResponse2005DataFundRegionalExposure RegionalExposure { get; set; }

        /// <summary>
        /// Lists of categories of the strategy classification. Strategy is a category from any level of category system \&quot;Three-tier strategy classification system for funds defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;292&#x60; for possible values.
        /// </summary>
        /// <value>Lists of categories of the strategy classification. Strategy is a category from any level of category system \&quot;Three-tier strategy classification system for funds defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;292&#x60; for possible values.</value>
        [DataMember(Name = "strategy", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundHoldingType> Strategy { get; set; }

        /// <summary>
        /// Lists of categories of the industry classification. Industry is a category from any level of category system \&quot;Funds classification defined by FactSet Digital Solutions\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;27&#x60; for possible values.
        /// </summary>
        /// <value>Lists of categories of the industry classification. Industry is a category from any level of category system \&quot;Funds classification defined by FactSet Digital Solutions\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;27&#x60; for possible values.</value>
        [DataMember(Name = "industry", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundHoldingType> Industry { get; set; }

        /// <summary>
        /// List of values for the synthetic risk and reward indicator (SRRI).
        /// </summary>
        /// <value>List of values for the synthetic risk and reward indicator (SRRI).</value>
        [DataMember(Name = "srri", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundSrri> Srri { get; set; }

        /// <summary>
        /// Gets or Sets Issuer
        /// </summary>
        [DataMember(Name = "issuer", EmitDefaultValue = false)]
        public InlineResponse2005DataFundIssuer Issuer { get; set; }

        /// <summary>
        /// Gets or Sets AssetsUnderManagement
        /// </summary>
        [DataMember(Name = "assetsUnderManagement", EmitDefaultValue = false)]
        public InlineResponse2005DataFundAssetsUnderManagement AssetsUnderManagement { get; set; }

        /// <summary>
        /// List of compliance properties for funds. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/legalEntity/complianceProperty/list&#x60; for the full list of compliance properties associated with legal entities (across all roles). 
        /// </summary>
        /// <value>List of compliance properties for funds. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/legalEntity/complianceProperty/list&#x60; for the full list of compliance properties associated with legal entities (across all roles). </value>
        [DataMember(Name = "compliance", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundCompliance> Compliance { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataFund {\n");
            sb.Append("  Etf: ").Append(Etf).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Domicile: ").Append(Domicile).Append("\n");
            sb.Append("  HoldingType: ").Append(HoldingType).Append("\n");
            sb.Append("  CountryDevelopment: ").Append(CountryDevelopment).Append("\n");
            sb.Append("  RegionalExposure: ").Append(RegionalExposure).Append("\n");
            sb.Append("  Strategy: ").Append(Strategy).Append("\n");
            sb.Append("  Industry: ").Append(Industry).Append("\n");
            sb.Append("  Srri: ").Append(Srri).Append("\n");
            sb.Append("  Issuer: ").Append(Issuer).Append("\n");
            sb.Append("  AssetsUnderManagement: ").Append(AssetsUnderManagement).Append("\n");
            sb.Append("  Compliance: ").Append(Compliance).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataFund);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataFund instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataFund to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataFund input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Etf == input.Etf ||
                    this.Etf != null &&
                    input.Etf != null &&
                    this.Etf.SequenceEqual(input.Etf)
                ) && 
                (
                    this.Currency == input.Currency ||
                    this.Currency != null &&
                    input.Currency != null &&
                    this.Currency.SequenceEqual(input.Currency)
                ) && 
                (
                    this.Domicile == input.Domicile ||
                    this.Domicile != null &&
                    input.Domicile != null &&
                    this.Domicile.SequenceEqual(input.Domicile)
                ) && 
                (
                    this.HoldingType == input.HoldingType ||
                    this.HoldingType != null &&
                    input.HoldingType != null &&
                    this.HoldingType.SequenceEqual(input.HoldingType)
                ) && 
                (
                    this.CountryDevelopment == input.CountryDevelopment ||
                    this.CountryDevelopment != null &&
                    input.CountryDevelopment != null &&
                    this.CountryDevelopment.SequenceEqual(input.CountryDevelopment)
                ) && 
                (
                    this.RegionalExposure == input.RegionalExposure ||
                    (this.RegionalExposure != null &&
                    this.RegionalExposure.Equals(input.RegionalExposure))
                ) && 
                (
                    this.Strategy == input.Strategy ||
                    this.Strategy != null &&
                    input.Strategy != null &&
                    this.Strategy.SequenceEqual(input.Strategy)
                ) && 
                (
                    this.Industry == input.Industry ||
                    this.Industry != null &&
                    input.Industry != null &&
                    this.Industry.SequenceEqual(input.Industry)
                ) && 
                (
                    this.Srri == input.Srri ||
                    this.Srri != null &&
                    input.Srri != null &&
                    this.Srri.SequenceEqual(input.Srri)
                ) && 
                (
                    this.Issuer == input.Issuer ||
                    (this.Issuer != null &&
                    this.Issuer.Equals(input.Issuer))
                ) && 
                (
                    this.AssetsUnderManagement == input.AssetsUnderManagement ||
                    (this.AssetsUnderManagement != null &&
                    this.AssetsUnderManagement.Equals(input.AssetsUnderManagement))
                ) && 
                (
                    this.Compliance == input.Compliance ||
                    this.Compliance != null &&
                    input.Compliance != null &&
                    this.Compliance.SequenceEqual(input.Compliance)
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
                if (this.Etf != null)
                {
                    hashCode = (hashCode * 59) + this.Etf.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Domicile != null)
                {
                    hashCode = (hashCode * 59) + this.Domicile.GetHashCode();
                }
                if (this.HoldingType != null)
                {
                    hashCode = (hashCode * 59) + this.HoldingType.GetHashCode();
                }
                if (this.CountryDevelopment != null)
                {
                    hashCode = (hashCode * 59) + this.CountryDevelopment.GetHashCode();
                }
                if (this.RegionalExposure != null)
                {
                    hashCode = (hashCode * 59) + this.RegionalExposure.GetHashCode();
                }
                if (this.Strategy != null)
                {
                    hashCode = (hashCode * 59) + this.Strategy.GetHashCode();
                }
                if (this.Industry != null)
                {
                    hashCode = (hashCode * 59) + this.Industry.GetHashCode();
                }
                if (this.Srri != null)
                {
                    hashCode = (hashCode * 59) + this.Srri.GetHashCode();
                }
                if (this.Issuer != null)
                {
                    hashCode = (hashCode * 59) + this.Issuer.GetHashCode();
                }
                if (this.AssetsUnderManagement != null)
                {
                    hashCode = (hashCode * 59) + this.AssetsUnderManagement.GetHashCode();
                }
                if (this.Compliance != null)
                {
                    hashCode = (hashCode * 59) + this.Compliance.GetHashCode();
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
