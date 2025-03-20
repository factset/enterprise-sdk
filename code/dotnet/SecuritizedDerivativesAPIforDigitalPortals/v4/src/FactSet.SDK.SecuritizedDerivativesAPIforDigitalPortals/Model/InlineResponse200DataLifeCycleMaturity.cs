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
    /// Maturity data.
    /// </summary>
    [DataContract(Name = "inline_response_200_data_lifeCycle_maturity")]
    public partial class InlineResponse200DataLifeCycleMaturity : IEquatable<InlineResponse200DataLifeCycleMaturity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200DataLifeCycleMaturity" /> class.
        /// </summary>
        /// <param name="date">Date of the instrument&#39;s maturity. The value is empty if the instrument is perpetual..</param>
        /// <param name="isPerpetual">If true, the instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is null..</param>
        /// <param name="isCallable">If true, the issuer may redeem the instrument prior to maturity..</param>
        public InlineResponse200DataLifeCycleMaturity(DateTime? date = default(DateTime?), bool? isPerpetual = default(bool?), bool? isCallable = default(bool?))
        {
            this.Date = date;
            this.IsPerpetual = isPerpetual;
            this.IsCallable = isCallable;
        }

        /// <summary>
        /// Date of the instrument&#39;s maturity. The value is empty if the instrument is perpetual.
        /// </summary>
        /// <value>Date of the instrument&#39;s maturity. The value is empty if the instrument is perpetual.</value>
        [DataMember(Name = "date", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// If true, the instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is null.
        /// </summary>
        /// <value>If true, the instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is null.</value>
        [DataMember(Name = "isPerpetual", EmitDefaultValue = true)]
        public bool? IsPerpetual { get; set; }

        /// <summary>
        /// If true, the issuer may redeem the instrument prior to maturity.
        /// </summary>
        /// <value>If true, the issuer may redeem the instrument prior to maturity.</value>
        [DataMember(Name = "isCallable", EmitDefaultValue = true)]
        public bool? IsCallable { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200DataLifeCycleMaturity {\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  IsPerpetual: ").Append(IsPerpetual).Append("\n");
            sb.Append("  IsCallable: ").Append(IsCallable).Append("\n");
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
            return this.Equals(input as InlineResponse200DataLifeCycleMaturity);
        }

        /// <summary>
        /// Returns true if InlineResponse200DataLifeCycleMaturity instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200DataLifeCycleMaturity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200DataLifeCycleMaturity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.IsPerpetual == input.IsPerpetual ||
                    (this.IsPerpetual != null &&
                    this.IsPerpetual.Equals(input.IsPerpetual))
                ) && 
                (
                    this.IsCallable == input.IsCallable ||
                    (this.IsCallable != null &&
                    this.IsCallable.Equals(input.IsCallable))
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
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.IsPerpetual != null)
                {
                    hashCode = (hashCode * 59) + this.IsPerpetual.GetHashCode();
                }
                if (this.IsCallable != null)
                {
                    hashCode = (hashCode * 59) + this.IsCallable.GetHashCode();
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
