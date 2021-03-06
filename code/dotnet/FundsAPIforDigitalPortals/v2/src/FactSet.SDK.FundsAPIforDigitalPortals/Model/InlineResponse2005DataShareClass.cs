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
    /// Values and value ranges of the parameters related to share classes.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_shareClass")]
    public partial class InlineResponse2005DataShareClass : IEquatable<InlineResponse2005DataShareClass>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataShareClass" /> class.
        /// </summary>
        /// <param name="currency">List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values..</param>
        /// <param name="distributing">Indicates whether distributing (&#x60;true&#x60;) and non-distributing share classes (&#x60;false&#x60;) are among the results..</param>
        /// <param name="registrationCountry">List of countries where the share classes have a trading registration. See endpoint &#x60;/basic/region/country/list&#x60; for possible values..</param>
        /// <param name="lifeCycle">lifeCycle.</param>
        /// <param name="minimumInvestment">minimumInvestment.</param>
        /// <param name="assetsUnderManagement">assetsUnderManagement.</param>
        /// <param name="compliance">List of compliance properties for share classes. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes)..</param>
        /// <param name="fee">fee.</param>
        public InlineResponse2005DataShareClass(List<InlineResponse2005DataFundCurrency> currency = default(List<InlineResponse2005DataFundCurrency>), List<InlineResponse2005DataShareClassDistributing> distributing = default(List<InlineResponse2005DataShareClassDistributing>), List<InlineResponse2005DataFundDomicile> registrationCountry = default(List<InlineResponse2005DataFundDomicile>), InlineResponse2005DataShareClassLifeCycle lifeCycle = default(InlineResponse2005DataShareClassLifeCycle), InlineResponse2005DataShareClassMinimumInvestment minimumInvestment = default(InlineResponse2005DataShareClassMinimumInvestment), InlineResponse2005DataShareClassAssetsUnderManagement assetsUnderManagement = default(InlineResponse2005DataShareClassAssetsUnderManagement), List<InlineResponse2005DataFundCompliance> compliance = default(List<InlineResponse2005DataFundCompliance>), InlineResponse2005DataShareClassFee fee = default(InlineResponse2005DataShareClassFee))
        {
            this.Currency = currency;
            this.Distributing = distributing;
            this.RegistrationCountry = registrationCountry;
            this.LifeCycle = lifeCycle;
            this.MinimumInvestment = minimumInvestment;
            this.AssetsUnderManagement = assetsUnderManagement;
            this.Compliance = compliance;
            this.Fee = fee;
        }

        /// <summary>
        /// List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values.
        /// </summary>
        /// <value>List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values.</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundCurrency> Currency { get; set; }

        /// <summary>
        /// Indicates whether distributing (&#x60;true&#x60;) and non-distributing share classes (&#x60;false&#x60;) are among the results.
        /// </summary>
        /// <value>Indicates whether distributing (&#x60;true&#x60;) and non-distributing share classes (&#x60;false&#x60;) are among the results.</value>
        [DataMember(Name = "distributing", EmitDefaultValue = false)]
        public List<InlineResponse2005DataShareClassDistributing> Distributing { get; set; }

        /// <summary>
        /// List of countries where the share classes have a trading registration. See endpoint &#x60;/basic/region/country/list&#x60; for possible values.
        /// </summary>
        /// <value>List of countries where the share classes have a trading registration. See endpoint &#x60;/basic/region/country/list&#x60; for possible values.</value>
        [DataMember(Name = "registrationCountry", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundDomicile> RegistrationCountry { get; set; }

        /// <summary>
        /// Gets or Sets LifeCycle
        /// </summary>
        [DataMember(Name = "lifeCycle", EmitDefaultValue = false)]
        public InlineResponse2005DataShareClassLifeCycle LifeCycle { get; set; }

        /// <summary>
        /// Gets or Sets MinimumInvestment
        /// </summary>
        [DataMember(Name = "minimumInvestment", EmitDefaultValue = false)]
        public InlineResponse2005DataShareClassMinimumInvestment MinimumInvestment { get; set; }

        /// <summary>
        /// Gets or Sets AssetsUnderManagement
        /// </summary>
        [DataMember(Name = "assetsUnderManagement", EmitDefaultValue = false)]
        public InlineResponse2005DataShareClassAssetsUnderManagement AssetsUnderManagement { get; set; }

        /// <summary>
        /// List of compliance properties for share classes. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes).
        /// </summary>
        /// <value>List of compliance properties for share classes. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes).</value>
        [DataMember(Name = "compliance", EmitDefaultValue = false)]
        public List<InlineResponse2005DataFundCompliance> Compliance { get; set; }

        /// <summary>
        /// Gets or Sets Fee
        /// </summary>
        [DataMember(Name = "fee", EmitDefaultValue = false)]
        public InlineResponse2005DataShareClassFee Fee { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataShareClass {\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Distributing: ").Append(Distributing).Append("\n");
            sb.Append("  RegistrationCountry: ").Append(RegistrationCountry).Append("\n");
            sb.Append("  LifeCycle: ").Append(LifeCycle).Append("\n");
            sb.Append("  MinimumInvestment: ").Append(MinimumInvestment).Append("\n");
            sb.Append("  AssetsUnderManagement: ").Append(AssetsUnderManagement).Append("\n");
            sb.Append("  Compliance: ").Append(Compliance).Append("\n");
            sb.Append("  Fee: ").Append(Fee).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataShareClass);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataShareClass instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataShareClass to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataShareClass input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Currency == input.Currency ||
                    this.Currency != null &&
                    input.Currency != null &&
                    this.Currency.SequenceEqual(input.Currency)
                ) && 
                (
                    this.Distributing == input.Distributing ||
                    this.Distributing != null &&
                    input.Distributing != null &&
                    this.Distributing.SequenceEqual(input.Distributing)
                ) && 
                (
                    this.RegistrationCountry == input.RegistrationCountry ||
                    this.RegistrationCountry != null &&
                    input.RegistrationCountry != null &&
                    this.RegistrationCountry.SequenceEqual(input.RegistrationCountry)
                ) && 
                (
                    this.LifeCycle == input.LifeCycle ||
                    (this.LifeCycle != null &&
                    this.LifeCycle.Equals(input.LifeCycle))
                ) && 
                (
                    this.MinimumInvestment == input.MinimumInvestment ||
                    (this.MinimumInvestment != null &&
                    this.MinimumInvestment.Equals(input.MinimumInvestment))
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
                ) && 
                (
                    this.Fee == input.Fee ||
                    (this.Fee != null &&
                    this.Fee.Equals(input.Fee))
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
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Distributing != null)
                {
                    hashCode = (hashCode * 59) + this.Distributing.GetHashCode();
                }
                if (this.RegistrationCountry != null)
                {
                    hashCode = (hashCode * 59) + this.RegistrationCountry.GetHashCode();
                }
                if (this.LifeCycle != null)
                {
                    hashCode = (hashCode * 59) + this.LifeCycle.GetHashCode();
                }
                if (this.MinimumInvestment != null)
                {
                    hashCode = (hashCode * 59) + this.MinimumInvestment.GetHashCode();
                }
                if (this.AssetsUnderManagement != null)
                {
                    hashCode = (hashCode * 59) + this.AssetsUnderManagement.GetHashCode();
                }
                if (this.Compliance != null)
                {
                    hashCode = (hashCode * 59) + this.Compliance.GetHashCode();
                }
                if (this.Fee != null)
                {
                    hashCode = (hashCode * 59) + this.Fee.GetHashCode();
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
