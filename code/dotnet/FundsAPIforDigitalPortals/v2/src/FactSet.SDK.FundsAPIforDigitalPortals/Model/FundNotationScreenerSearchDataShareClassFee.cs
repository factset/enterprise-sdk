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
    /// Parameters related to fees.
    /// </summary>
    [DataContract(Name = "_fund_notation_screener_search_data_shareClass_fee")]
    public partial class FundNotationScreenerSearchDataShareClassFee : IEquatable<FundNotationScreenerSearchDataShareClassFee>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundNotationScreenerSearchDataShareClassFee" /> class.
        /// </summary>
        /// <param name="ongoing">ongoing.</param>
        /// <param name="allIn">allIn.</param>
        /// <param name="performance">performance.</param>
        /// <param name="management">management.</param>
        /// <param name="initial">initial.</param>
        /// <param name="distribution">distribution.</param>
        /// <param name="administration">administration.</param>
        /// <param name="handling">handling.</param>
        /// <param name="redemption">redemption.</param>
        /// <param name="custodianBank">custodianBank.</param>
        /// <param name="_12b">_12b.</param>
        /// <param name="switching">switching.</param>
        public FundNotationScreenerSearchDataShareClassFee(FundNotationScreenerSearchDataShareClassFeeOngoing ongoing = default(FundNotationScreenerSearchDataShareClassFeeOngoing), FundNotationScreenerSearchDataShareClassFeeAllIn allIn = default(FundNotationScreenerSearchDataShareClassFeeAllIn), FundNotationScreenerSearchDataShareClassFeePerformance performance = default(FundNotationScreenerSearchDataShareClassFeePerformance), FundNotationScreenerSearchDataShareClassFeeManagement management = default(FundNotationScreenerSearchDataShareClassFeeManagement), FundNotationScreenerSearchDataShareClassFeeInitial initial = default(FundNotationScreenerSearchDataShareClassFeeInitial), FundNotationScreenerSearchDataShareClassFeeDistribution distribution = default(FundNotationScreenerSearchDataShareClassFeeDistribution), FundNotationScreenerSearchDataShareClassFeeAdministration administration = default(FundNotationScreenerSearchDataShareClassFeeAdministration), FundNotationScreenerSearchDataShareClassFeeHandling handling = default(FundNotationScreenerSearchDataShareClassFeeHandling), FundNotationScreenerSearchDataShareClassFeeRedemption redemption = default(FundNotationScreenerSearchDataShareClassFeeRedemption), FundNotationScreenerSearchDataShareClassFeeCustodianBank custodianBank = default(FundNotationScreenerSearchDataShareClassFeeCustodianBank), FundNotationScreenerSearchDataShareClassFee12b _12b = default(FundNotationScreenerSearchDataShareClassFee12b), FundNotationScreenerSearchDataShareClassFeeSwitching switching = default(FundNotationScreenerSearchDataShareClassFeeSwitching))
        {
            this.Ongoing = ongoing;
            this.AllIn = allIn;
            this.Performance = performance;
            this.Management = management;
            this.Initial = initial;
            this.Distribution = distribution;
            this.Administration = administration;
            this.Handling = handling;
            this.Redemption = redemption;
            this.CustodianBank = custodianBank;
            this._12b = _12b;
            this.Switching = switching;
        }

        /// <summary>
        /// Gets or Sets Ongoing
        /// </summary>
        [DataMember(Name = "ongoing", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeOngoing Ongoing { get; set; }

        /// <summary>
        /// Gets or Sets AllIn
        /// </summary>
        [DataMember(Name = "allIn", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeAllIn AllIn { get; set; }

        /// <summary>
        /// Gets or Sets Performance
        /// </summary>
        [DataMember(Name = "performance", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeePerformance Performance { get; set; }

        /// <summary>
        /// Gets or Sets Management
        /// </summary>
        [DataMember(Name = "management", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeManagement Management { get; set; }

        /// <summary>
        /// Gets or Sets Initial
        /// </summary>
        [DataMember(Name = "initial", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeInitial Initial { get; set; }

        /// <summary>
        /// Gets or Sets Distribution
        /// </summary>
        [DataMember(Name = "distribution", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeDistribution Distribution { get; set; }

        /// <summary>
        /// Gets or Sets Administration
        /// </summary>
        [DataMember(Name = "administration", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeAdministration Administration { get; set; }

        /// <summary>
        /// Gets or Sets Handling
        /// </summary>
        [DataMember(Name = "handling", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeHandling Handling { get; set; }

        /// <summary>
        /// Gets or Sets Redemption
        /// </summary>
        [DataMember(Name = "redemption", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeRedemption Redemption { get; set; }

        /// <summary>
        /// Gets or Sets CustodianBank
        /// </summary>
        [DataMember(Name = "custodianBank", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeCustodianBank CustodianBank { get; set; }

        /// <summary>
        /// Gets or Sets _12b
        /// </summary>
        [DataMember(Name = "12b", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFee12b _12b { get; set; }

        /// <summary>
        /// Gets or Sets Switching
        /// </summary>
        [DataMember(Name = "switching", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeSwitching Switching { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FundNotationScreenerSearchDataShareClassFee {\n");
            sb.Append("  Ongoing: ").Append(Ongoing).Append("\n");
            sb.Append("  AllIn: ").Append(AllIn).Append("\n");
            sb.Append("  Performance: ").Append(Performance).Append("\n");
            sb.Append("  Management: ").Append(Management).Append("\n");
            sb.Append("  Initial: ").Append(Initial).Append("\n");
            sb.Append("  Distribution: ").Append(Distribution).Append("\n");
            sb.Append("  Administration: ").Append(Administration).Append("\n");
            sb.Append("  Handling: ").Append(Handling).Append("\n");
            sb.Append("  Redemption: ").Append(Redemption).Append("\n");
            sb.Append("  CustodianBank: ").Append(CustodianBank).Append("\n");
            sb.Append("  _12b: ").Append(_12b).Append("\n");
            sb.Append("  Switching: ").Append(Switching).Append("\n");
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
            return this.Equals(input as FundNotationScreenerSearchDataShareClassFee);
        }

        /// <summary>
        /// Returns true if FundNotationScreenerSearchDataShareClassFee instances are equal
        /// </summary>
        /// <param name="input">Instance of FundNotationScreenerSearchDataShareClassFee to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundNotationScreenerSearchDataShareClassFee input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ongoing == input.Ongoing ||
                    (this.Ongoing != null &&
                    this.Ongoing.Equals(input.Ongoing))
                ) && 
                (
                    this.AllIn == input.AllIn ||
                    (this.AllIn != null &&
                    this.AllIn.Equals(input.AllIn))
                ) && 
                (
                    this.Performance == input.Performance ||
                    (this.Performance != null &&
                    this.Performance.Equals(input.Performance))
                ) && 
                (
                    this.Management == input.Management ||
                    (this.Management != null &&
                    this.Management.Equals(input.Management))
                ) && 
                (
                    this.Initial == input.Initial ||
                    (this.Initial != null &&
                    this.Initial.Equals(input.Initial))
                ) && 
                (
                    this.Distribution == input.Distribution ||
                    (this.Distribution != null &&
                    this.Distribution.Equals(input.Distribution))
                ) && 
                (
                    this.Administration == input.Administration ||
                    (this.Administration != null &&
                    this.Administration.Equals(input.Administration))
                ) && 
                (
                    this.Handling == input.Handling ||
                    (this.Handling != null &&
                    this.Handling.Equals(input.Handling))
                ) && 
                (
                    this.Redemption == input.Redemption ||
                    (this.Redemption != null &&
                    this.Redemption.Equals(input.Redemption))
                ) && 
                (
                    this.CustodianBank == input.CustodianBank ||
                    (this.CustodianBank != null &&
                    this.CustodianBank.Equals(input.CustodianBank))
                ) && 
                (
                    this._12b == input._12b ||
                    (this._12b != null &&
                    this._12b.Equals(input._12b))
                ) && 
                (
                    this.Switching == input.Switching ||
                    (this.Switching != null &&
                    this.Switching.Equals(input.Switching))
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
                if (this.Ongoing != null)
                {
                    hashCode = (hashCode * 59) + this.Ongoing.GetHashCode();
                }
                if (this.AllIn != null)
                {
                    hashCode = (hashCode * 59) + this.AllIn.GetHashCode();
                }
                if (this.Performance != null)
                {
                    hashCode = (hashCode * 59) + this.Performance.GetHashCode();
                }
                if (this.Management != null)
                {
                    hashCode = (hashCode * 59) + this.Management.GetHashCode();
                }
                if (this.Initial != null)
                {
                    hashCode = (hashCode * 59) + this.Initial.GetHashCode();
                }
                if (this.Distribution != null)
                {
                    hashCode = (hashCode * 59) + this.Distribution.GetHashCode();
                }
                if (this.Administration != null)
                {
                    hashCode = (hashCode * 59) + this.Administration.GetHashCode();
                }
                if (this.Handling != null)
                {
                    hashCode = (hashCode * 59) + this.Handling.GetHashCode();
                }
                if (this.Redemption != null)
                {
                    hashCode = (hashCode * 59) + this.Redemption.GetHashCode();
                }
                if (this.CustodianBank != null)
                {
                    hashCode = (hashCode * 59) + this.CustodianBank.GetHashCode();
                }
                if (this._12b != null)
                {
                    hashCode = (hashCode * 59) + this._12b.GetHashCode();
                }
                if (this.Switching != null)
                {
                    hashCode = (hashCode * 59) + this.Switching.GetHashCode();
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
