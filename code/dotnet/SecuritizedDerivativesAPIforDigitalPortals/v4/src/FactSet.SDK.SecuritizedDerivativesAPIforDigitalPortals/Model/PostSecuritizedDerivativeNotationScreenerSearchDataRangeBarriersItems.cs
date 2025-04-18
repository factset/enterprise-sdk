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
    /// A list of objects. For semantical context see the description of the parent array.
    /// </summary>
    [DataContract(Name = "PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems")]
    public partial class PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems : IEquatable<PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems>, IValidatableObject
    {
        /// <summary>
        /// The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | - -- | - -- | | rangeKnockOut | Represents the upper and lower bound of the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for range knock-out certificates such as inline certificates. |  
        /// </summary>
        /// <value>The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | - -- | - -- | | rangeKnockOut | Represents the upper and lower bound of the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for range knock-out certificates such as inline certificates. |  </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum RangeKnockOut for value: rangeKnockOut
            /// </summary>
            [EnumMember(Value = "rangeKnockOut")]
            RangeKnockOut = 1

        }


        /// <summary>
        /// The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | - -- | - -- | | rangeKnockOut | Represents the upper and lower bound of the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for range knock-out certificates such as inline certificates. |  
        /// </summary>
        /// <value>The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | - -- | - -- | | rangeKnockOut | Represents the upper and lower bound of the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for range knock-out certificates such as inline certificates. |  </value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems" /> class.
        /// </summary>
        /// <param name="type">The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | - -- | - -- | | rangeKnockOut | Represents the upper and lower bound of the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for range knock-out certificates such as inline certificates. |  .</param>
        /// <param name="observation">observation.</param>
        /// <param name="upper">upper.</param>
        /// <param name="lower">lower.</param>
        /// <param name="breach">breach.</param>
        /// <param name="cashFlow">cashFlow.</param>
        public PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems(TypeEnum? type = default(TypeEnum?), PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsObservation observation = default(PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsObservation), PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpper upper = default(PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpper), PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLower lower = default(PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLower), PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach breach = default(PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach), PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsCashFlow cashFlow = default(PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsCashFlow))
        {
            this.Type = type;
            this.Observation = observation;
            this.Upper = upper;
            this.Lower = lower;
            this.Breach = breach;
            this.CashFlow = cashFlow;
        }

        /// <summary>
        /// Gets or Sets Observation
        /// </summary>
        [DataMember(Name = "observation", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsObservation Observation { get; set; }

        /// <summary>
        /// Gets or Sets Upper
        /// </summary>
        [DataMember(Name = "upper", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpper Upper { get; set; }

        /// <summary>
        /// Gets or Sets Lower
        /// </summary>
        [DataMember(Name = "lower", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLower Lower { get; set; }

        /// <summary>
        /// Gets or Sets Breach
        /// </summary>
        [DataMember(Name = "breach", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach Breach { get; set; }

        /// <summary>
        /// Gets or Sets CashFlow
        /// </summary>
        [DataMember(Name = "cashFlow", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsCashFlow CashFlow { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Observation: ").Append(Observation).Append("\n");
            sb.Append("  Upper: ").Append(Upper).Append("\n");
            sb.Append("  Lower: ").Append(Lower).Append("\n");
            sb.Append("  Breach: ").Append(Breach).Append("\n");
            sb.Append("  CashFlow: ").Append(CashFlow).Append("\n");
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
            return this.Equals(input as PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems);
        }

        /// <summary>
        /// Returns true if PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems instances are equal
        /// </summary>
        /// <param name="input">Instance of PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.Observation == input.Observation ||
                    (this.Observation != null &&
                    this.Observation.Equals(input.Observation))
                ) && 
                (
                    this.Upper == input.Upper ||
                    (this.Upper != null &&
                    this.Upper.Equals(input.Upper))
                ) && 
                (
                    this.Lower == input.Lower ||
                    (this.Lower != null &&
                    this.Lower.Equals(input.Lower))
                ) && 
                (
                    this.Breach == input.Breach ||
                    (this.Breach != null &&
                    this.Breach.Equals(input.Breach))
                ) && 
                (
                    this.CashFlow == input.CashFlow ||
                    (this.CashFlow != null &&
                    this.CashFlow.Equals(input.CashFlow))
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
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                if (this.Observation != null)
                {
                    hashCode = (hashCode * 59) + this.Observation.GetHashCode();
                }
                if (this.Upper != null)
                {
                    hashCode = (hashCode * 59) + this.Upper.GetHashCode();
                }
                if (this.Lower != null)
                {
                    hashCode = (hashCode * 59) + this.Lower.GetHashCode();
                }
                if (this.Breach != null)
                {
                    hashCode = (hashCode * 59) + this.Breach.GetHashCode();
                }
                if (this.CashFlow != null)
                {
                    hashCode = (hashCode * 59) + this.CashFlow.GetHashCode();
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
