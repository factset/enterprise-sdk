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
    /// All-in fee. It is a measure of the total costs associated with investing in the fund and includes managing and operating costs.
    /// </summary>
    [DataContract(Name = "_fund_notation_screener_search_data_shareClass_fee_allIn")]
    public partial class FundNotationScreenerSearchDataShareClassFeeAllIn : IEquatable<FundNotationScreenerSearchDataShareClassFeeAllIn>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundNotationScreenerSearchDataShareClassFeeAllIn" /> class.
        /// </summary>
        /// <param name="current">current.</param>
        public FundNotationScreenerSearchDataShareClassFeeAllIn(FundNotationScreenerSearchDataShareClassFeeAllInCurrent current = default(FundNotationScreenerSearchDataShareClassFeeAllInCurrent))
        {
            this.Current = current;
        }

        /// <summary>
        /// Gets or Sets Current
        /// </summary>
        [DataMember(Name = "current", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeAllInCurrent Current { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FundNotationScreenerSearchDataShareClassFeeAllIn {\n");
            sb.Append("  Current: ").Append(Current).Append("\n");
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
            return this.Equals(input as FundNotationScreenerSearchDataShareClassFeeAllIn);
        }

        /// <summary>
        /// Returns true if FundNotationScreenerSearchDataShareClassFeeAllIn instances are equal
        /// </summary>
        /// <param name="input">Instance of FundNotationScreenerSearchDataShareClassFeeAllIn to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundNotationScreenerSearchDataShareClassFeeAllIn input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Current == input.Current ||
                    (this.Current != null &&
                    this.Current.Equals(input.Current))
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
                if (this.Current != null)
                {
                    hashCode = (hashCode * 59) + this.Current.GetHashCode();
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
