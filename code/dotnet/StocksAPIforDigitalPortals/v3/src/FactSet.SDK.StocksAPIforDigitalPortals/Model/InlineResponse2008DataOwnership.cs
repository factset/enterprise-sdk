/*
 * Stocks API For Digital Portals
 *
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// Details of the ownership.
    /// </summary>
    [DataContract(Name = "inline_response_200_8_data_ownership")]
    public partial class InlineResponse2008DataOwnership : IEquatable<InlineResponse2008DataOwnership>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2008DataOwnership" /> class.
        /// </summary>
        /// <param name="fraction">Fraction of stocks held by the owner..</param>
        /// <param name="numberShares">Number of stocks held by the owner..</param>
        public InlineResponse2008DataOwnership(decimal? fraction = default(decimal?), decimal? numberShares = default(decimal?))
        {
            this.Fraction = fraction;
            this.NumberShares = numberShares;
        }

        /// <summary>
        /// Fraction of stocks held by the owner.
        /// </summary>
        /// <value>Fraction of stocks held by the owner.</value>
        [DataMember(Name = "fraction", EmitDefaultValue = true)]
        public decimal? Fraction { get; set; }

        /// <summary>
        /// Number of stocks held by the owner.
        /// </summary>
        /// <value>Number of stocks held by the owner.</value>
        [DataMember(Name = "numberShares", EmitDefaultValue = true)]
        public decimal? NumberShares { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2008DataOwnership {\n");
            sb.Append("  Fraction: ").Append(Fraction).Append("\n");
            sb.Append("  NumberShares: ").Append(NumberShares).Append("\n");
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
            return this.Equals(input as InlineResponse2008DataOwnership);
        }

        /// <summary>
        /// Returns true if InlineResponse2008DataOwnership instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2008DataOwnership to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2008DataOwnership input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Fraction == input.Fraction ||
                    (this.Fraction != null &&
                    this.Fraction.Equals(input.Fraction))
                ) && 
                (
                    this.NumberShares == input.NumberShares ||
                    (this.NumberShares != null &&
                    this.NumberShares.Equals(input.NumberShares))
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
                if (this.Fraction != null)
                {
                    hashCode = (hashCode * 59) + this.Fraction.GetHashCode();
                }
                if (this.NumberShares != null)
                {
                    hashCode = (hashCode * 59) + this.NumberShares.GetHashCode();
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
