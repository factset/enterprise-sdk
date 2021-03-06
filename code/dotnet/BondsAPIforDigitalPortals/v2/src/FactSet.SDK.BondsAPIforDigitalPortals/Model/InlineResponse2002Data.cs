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
    /// Key figures and related data.
    /// </summary>
    [DataContract(Name = "inline_response_200_2_data")]
    public partial class InlineResponse2002Data : IEquatable<InlineResponse2002Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2002Data" /> class.
        /// </summary>
        /// <param name="calculation">calculation.</param>
        /// <param name="yield">yield.</param>
        /// <param name="macaulayDuration">Macaulay duration, which is the average period (in years) of capital commitment..</param>
        /// <param name="sensitivities">sensitivities.</param>
        public InlineResponse2002Data(InlineResponse2002DataCalculation calculation = default(InlineResponse2002DataCalculation), InlineResponse2002DataYield yield = default(InlineResponse2002DataYield), decimal macaulayDuration = default(decimal), InlineResponse2002DataSensitivities sensitivities = default(InlineResponse2002DataSensitivities))
        {
            this.Calculation = calculation;
            this.Yield = yield;
            this.MacaulayDuration = macaulayDuration;
            this.Sensitivities = sensitivities;
        }

        /// <summary>
        /// Gets or Sets Calculation
        /// </summary>
        [DataMember(Name = "calculation", EmitDefaultValue = false)]
        public InlineResponse2002DataCalculation Calculation { get; set; }

        /// <summary>
        /// Gets or Sets Yield
        /// </summary>
        [DataMember(Name = "yield", EmitDefaultValue = false)]
        public InlineResponse2002DataYield Yield { get; set; }

        /// <summary>
        /// Macaulay duration, which is the average period (in years) of capital commitment.
        /// </summary>
        /// <value>Macaulay duration, which is the average period (in years) of capital commitment.</value>
        [DataMember(Name = "macaulayDuration", EmitDefaultValue = false)]
        public decimal MacaulayDuration { get; set; }

        /// <summary>
        /// Gets or Sets Sensitivities
        /// </summary>
        [DataMember(Name = "sensitivities", EmitDefaultValue = false)]
        public InlineResponse2002DataSensitivities Sensitivities { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2002Data {\n");
            sb.Append("  Calculation: ").Append(Calculation).Append("\n");
            sb.Append("  Yield: ").Append(Yield).Append("\n");
            sb.Append("  MacaulayDuration: ").Append(MacaulayDuration).Append("\n");
            sb.Append("  Sensitivities: ").Append(Sensitivities).Append("\n");
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
            return this.Equals(input as InlineResponse2002Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2002Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2002Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2002Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Calculation == input.Calculation ||
                    (this.Calculation != null &&
                    this.Calculation.Equals(input.Calculation))
                ) && 
                (
                    this.Yield == input.Yield ||
                    (this.Yield != null &&
                    this.Yield.Equals(input.Yield))
                ) && 
                (
                    this.MacaulayDuration == input.MacaulayDuration ||
                    this.MacaulayDuration.Equals(input.MacaulayDuration)
                ) && 
                (
                    this.Sensitivities == input.Sensitivities ||
                    (this.Sensitivities != null &&
                    this.Sensitivities.Equals(input.Sensitivities))
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
                if (this.Calculation != null)
                {
                    hashCode = (hashCode * 59) + this.Calculation.GetHashCode();
                }
                if (this.Yield != null)
                {
                    hashCode = (hashCode * 59) + this.Yield.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MacaulayDuration.GetHashCode();
                if (this.Sensitivities != null)
                {
                    hashCode = (hashCode * 59) + this.Sensitivities.GetHashCode();
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
