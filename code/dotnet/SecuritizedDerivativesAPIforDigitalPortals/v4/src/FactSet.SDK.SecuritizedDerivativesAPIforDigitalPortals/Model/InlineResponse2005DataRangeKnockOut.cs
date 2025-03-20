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
    /// Values and value ranges related to the range knock-out.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_rangeKnockOut")]
    public partial class InlineResponse2005DataRangeKnockOut : IEquatable<InlineResponse2005DataRangeKnockOut>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataRangeKnockOut" /> class.
        /// </summary>
        /// <param name="observation">Values of the barrier observation modality..</param>
        /// <param name="upper">upper.</param>
        /// <param name="lower">lower.</param>
        /// <param name="breached">Indicates whether securitized derivatives with a breached and with a non-breached range knock-out barrier are among the results..</param>
        /// <param name="cashFlow">cashFlow.</param>
        public InlineResponse2005DataRangeKnockOut(List<PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeKnockOutObservationItems> observation = default(List<PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeKnockOutObservationItems>), InlineResponse2005DataRangeKnockOutUpper upper = default(InlineResponse2005DataRangeKnockOutUpper), InlineResponse2005DataRangeKnockOutLower lower = default(InlineResponse2005DataRangeKnockOutLower), List<PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeKnockOutBreachedItems> breached = default(List<PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeKnockOutBreachedItems>), InlineResponse2005DataKnockInCashFlow cashFlow = default(InlineResponse2005DataKnockInCashFlow))
        {
            this.Observation = observation;
            this.Upper = upper;
            this.Lower = lower;
            this.Breached = breached;
            this.CashFlow = cashFlow;
        }

        /// <summary>
        /// Values of the barrier observation modality.
        /// </summary>
        /// <value>Values of the barrier observation modality.</value>
        [DataMember(Name = "observation", EmitDefaultValue = false)]
        public List<PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeKnockOutObservationItems> Observation { get; set; }

        /// <summary>
        /// Gets or Sets Upper
        /// </summary>
        [DataMember(Name = "upper", EmitDefaultValue = false)]
        public InlineResponse2005DataRangeKnockOutUpper Upper { get; set; }

        /// <summary>
        /// Gets or Sets Lower
        /// </summary>
        [DataMember(Name = "lower", EmitDefaultValue = false)]
        public InlineResponse2005DataRangeKnockOutLower Lower { get; set; }

        /// <summary>
        /// Indicates whether securitized derivatives with a breached and with a non-breached range knock-out barrier are among the results.
        /// </summary>
        /// <value>Indicates whether securitized derivatives with a breached and with a non-breached range knock-out barrier are among the results.</value>
        [DataMember(Name = "breached", EmitDefaultValue = false)]
        public List<PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeKnockOutBreachedItems> Breached { get; set; }

        /// <summary>
        /// Gets or Sets CashFlow
        /// </summary>
        [DataMember(Name = "cashFlow", EmitDefaultValue = false)]
        public InlineResponse2005DataKnockInCashFlow CashFlow { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataRangeKnockOut {\n");
            sb.Append("  Observation: ").Append(Observation).Append("\n");
            sb.Append("  Upper: ").Append(Upper).Append("\n");
            sb.Append("  Lower: ").Append(Lower).Append("\n");
            sb.Append("  Breached: ").Append(Breached).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataRangeKnockOut);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataRangeKnockOut instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataRangeKnockOut to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataRangeKnockOut input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Observation == input.Observation ||
                    this.Observation != null &&
                    input.Observation != null &&
                    this.Observation.SequenceEqual(input.Observation)
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
                    this.Breached == input.Breached ||
                    this.Breached != null &&
                    input.Breached != null &&
                    this.Breached.SequenceEqual(input.Breached)
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
                if (this.Breached != null)
                {
                    hashCode = (hashCode * 59) + this.Breached.GetHashCode();
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
