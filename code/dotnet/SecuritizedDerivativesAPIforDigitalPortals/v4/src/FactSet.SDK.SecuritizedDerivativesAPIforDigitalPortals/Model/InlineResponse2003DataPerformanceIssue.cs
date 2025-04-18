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
    /// Ask and bid-based performance since issue, see attribute &#x60;issue&#x60; in endpoint &#x60;/securitized-derivative/get&#x60; for the issue date. It represents the difference between the ask (bid respectively) price of the derivative&#39;s notation and the issue price. For securitized derivatives quoted in percent, the result is multiplied with the nominal (see attribute &#x60;nominal.value&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;) in order to calculate the value in absolute terms.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_data_performanceIssue")]
    public partial class InlineResponse2003DataPerformanceIssue : IEquatable<InlineResponse2003DataPerformanceIssue>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003DataPerformanceIssue" /> class.
        /// </summary>
        /// <param name="ask">ask.</param>
        /// <param name="bid">bid.</param>
        public InlineResponse2003DataPerformanceIssue(InlineResponse2003DataPerformanceIssueAsk ask = default(InlineResponse2003DataPerformanceIssueAsk), InlineResponse2003DataPerformanceIssueBid bid = default(InlineResponse2003DataPerformanceIssueBid))
        {
            this.Ask = ask;
            this.Bid = bid;
        }

        /// <summary>
        /// Gets or Sets Ask
        /// </summary>
        [DataMember(Name = "ask", EmitDefaultValue = false)]
        public InlineResponse2003DataPerformanceIssueAsk Ask { get; set; }

        /// <summary>
        /// Gets or Sets Bid
        /// </summary>
        [DataMember(Name = "bid", EmitDefaultValue = false)]
        public InlineResponse2003DataPerformanceIssueBid Bid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2003DataPerformanceIssue {\n");
            sb.Append("  Ask: ").Append(Ask).Append("\n");
            sb.Append("  Bid: ").Append(Bid).Append("\n");
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
            return this.Equals(input as InlineResponse2003DataPerformanceIssue);
        }

        /// <summary>
        /// Returns true if InlineResponse2003DataPerformanceIssue instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003DataPerformanceIssue to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003DataPerformanceIssue input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ask == input.Ask ||
                    (this.Ask != null &&
                    this.Ask.Equals(input.Ask))
                ) && 
                (
                    this.Bid == input.Bid ||
                    (this.Bid != null &&
                    this.Bid.Equals(input.Bid))
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
                if (this.Ask != null)
                {
                    hashCode = (hashCode * 59) + this.Ask.GetHashCode();
                }
                if (this.Bid != null)
                {
                    hashCode = (hashCode * 59) + this.Bid.GetHashCode();
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
