/*
 * Securitized Derivatives API For Digital Portals
 *
 * Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for equity and fixed income instruments: See the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) and the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) for details.  
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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Maximum yield. It represents a hypothetical maximum payout at maturity minus the ask price of the derivative. This key figure represents a theoretically possible best-case scenario, disregarding the probability of occurrence. It is calculated only for securitized derivatives with a limited payout (e.g. capped products).
    /// </summary>
    [DataContract(Name = "PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest_data_keyFigures_maximumYield")]
    public partial class PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield : IEquatable<PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield" /> class.
        /// </summary>
        /// <param name="absolute">absolute.</param>
        /// <param name="relative">relative.</param>
        /// <param name="annualized">annualized.</param>
        public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsolute absolute = default(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsolute), PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldRelative relative = default(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldRelative), PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualized annualized = default(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualized))
        {
            this.Absolute = absolute;
            this.Relative = relative;
            this.Annualized = annualized;
        }

        /// <summary>
        /// Gets or Sets Absolute
        /// </summary>
        [DataMember(Name = "absolute", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsolute Absolute { get; set; }

        /// <summary>
        /// Gets or Sets Relative
        /// </summary>
        [DataMember(Name = "relative", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldRelative Relative { get; set; }

        /// <summary>
        /// Gets or Sets Annualized
        /// </summary>
        [DataMember(Name = "annualized", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualized Annualized { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield {\n");
            sb.Append("  Absolute: ").Append(Absolute).Append("\n");
            sb.Append("  Relative: ").Append(Relative).Append("\n");
            sb.Append("  Annualized: ").Append(Annualized).Append("\n");
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
            return this.Equals(input as PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield);
        }

        /// <summary>
        /// Returns true if PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield instances are equal
        /// </summary>
        /// <param name="input">Instance of PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Absolute == input.Absolute ||
                    (this.Absolute != null &&
                    this.Absolute.Equals(input.Absolute))
                ) && 
                (
                    this.Relative == input.Relative ||
                    (this.Relative != null &&
                    this.Relative.Equals(input.Relative))
                ) && 
                (
                    this.Annualized == input.Annualized ||
                    (this.Annualized != null &&
                    this.Annualized.Equals(input.Annualized))
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
                if (this.Absolute != null)
                {
                    hashCode = (hashCode * 59) + this.Absolute.GetHashCode();
                }
                if (this.Relative != null)
                {
                    hashCode = (hashCode * 59) + this.Relative.GetHashCode();
                }
                if (this.Annualized != null)
                {
                    hashCode = (hashCode * 59) + this.Annualized.GetHashCode();
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
