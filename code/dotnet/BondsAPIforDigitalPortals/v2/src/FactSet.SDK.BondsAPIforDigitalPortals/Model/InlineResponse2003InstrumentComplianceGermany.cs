/*
 * Bonds API For Digital Portals
 *
 * Search for fixed income instruments, using a criteria-based screener. The API provides also fundamental data and key figures, basic interest rate information and derived coupon lists.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * important dates in and features of the life cycle of the fixed income instruments * filter by issuer, its country of registration and the issued volume * coupon data: occurrence and frequency of coupon payments, current interest rate range * yield and yield to maturity range, spread * Macaulay duration * sensitivity ranges: base point value, modified duration, elasticity, convexity * cash flow for all transactions over a certain time range: sum or average * country-specific attributes: for Germany: is eligible for trustees        The key figures are calculated using delayed prices with an additional delay of 10 minutes after an update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
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
using OpenAPIDateConverter = FactSet.SDK.BondsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BondsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Compliance properties in accordance with the German law.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_instrument_compliance_germany")]
    public partial class InlineResponse2003InstrumentComplianceGermany : IEquatable<InlineResponse2003InstrumentComplianceGermany>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003InstrumentComplianceGermany" /> class.
        /// </summary>
        /// <param name="trusteeEligible">If &#x60;true&#x60;, the debt instrument is eligible for investments by trustees according to §§1806ff of the BGB (German Civil Code). The German legislative has declared it to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments..</param>
        public InlineResponse2003InstrumentComplianceGermany(bool trusteeEligible = default(bool))
        {
            this.TrusteeEligible = trusteeEligible;
        }

        /// <summary>
        /// If &#x60;true&#x60;, the debt instrument is eligible for investments by trustees according to §§1806ff of the BGB (German Civil Code). The German legislative has declared it to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments.
        /// </summary>
        /// <value>If &#x60;true&#x60;, the debt instrument is eligible for investments by trustees according to §§1806ff of the BGB (German Civil Code). The German legislative has declared it to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments.</value>
        [DataMember(Name = "trusteeEligible", EmitDefaultValue = true)]
        public bool TrusteeEligible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2003InstrumentComplianceGermany {\n");
            sb.Append("  TrusteeEligible: ").Append(TrusteeEligible).Append("\n");
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
            return this.Equals(input as InlineResponse2003InstrumentComplianceGermany);
        }

        /// <summary>
        /// Returns true if InlineResponse2003InstrumentComplianceGermany instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003InstrumentComplianceGermany to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003InstrumentComplianceGermany input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TrusteeEligible == input.TrusteeEligible ||
                    this.TrusteeEligible.Equals(input.TrusteeEligible)
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
                hashCode = (hashCode * 59) + this.TrusteeEligible.GetHashCode();
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
