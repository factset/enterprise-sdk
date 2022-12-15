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
    /// Stock-specific key figures as reported for a fiscal year.
    /// </summary>
    [DataContract(Name = "inline_response_200_14_reportedKeyFigures")]
    public partial class InlineResponse20014ReportedKeyFigures : IEquatable<InlineResponse20014ReportedKeyFigures>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20014ReportedKeyFigures" /> class.
        /// </summary>
        /// <param name="firstFiscalYear">firstFiscalYear.</param>
        /// <param name="secondFiscalYear">secondFiscalYear.</param>
        /// <param name="thirdFiscalYear">thirdFiscalYear.</param>
        public InlineResponse20014ReportedKeyFigures(InlineResponse20014ReportedKeyFiguresFirstFiscalYear firstFiscalYear = default(InlineResponse20014ReportedKeyFiguresFirstFiscalYear), InlineResponse20014ReportedKeyFiguresSecondFiscalYear secondFiscalYear = default(InlineResponse20014ReportedKeyFiguresSecondFiscalYear), InlineResponse20014ReportedKeyFiguresThirdFiscalYear thirdFiscalYear = default(InlineResponse20014ReportedKeyFiguresThirdFiscalYear))
        {
            this.FirstFiscalYear = firstFiscalYear;
            this.SecondFiscalYear = secondFiscalYear;
            this.ThirdFiscalYear = thirdFiscalYear;
        }

        /// <summary>
        /// Gets or Sets FirstFiscalYear
        /// </summary>
        [DataMember(Name = "firstFiscalYear", EmitDefaultValue = false)]
        public InlineResponse20014ReportedKeyFiguresFirstFiscalYear FirstFiscalYear { get; set; }

        /// <summary>
        /// Gets or Sets SecondFiscalYear
        /// </summary>
        [DataMember(Name = "secondFiscalYear", EmitDefaultValue = false)]
        public InlineResponse20014ReportedKeyFiguresSecondFiscalYear SecondFiscalYear { get; set; }

        /// <summary>
        /// Gets or Sets ThirdFiscalYear
        /// </summary>
        [DataMember(Name = "thirdFiscalYear", EmitDefaultValue = false)]
        public InlineResponse20014ReportedKeyFiguresThirdFiscalYear ThirdFiscalYear { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20014ReportedKeyFigures {\n");
            sb.Append("  FirstFiscalYear: ").Append(FirstFiscalYear).Append("\n");
            sb.Append("  SecondFiscalYear: ").Append(SecondFiscalYear).Append("\n");
            sb.Append("  ThirdFiscalYear: ").Append(ThirdFiscalYear).Append("\n");
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
            return this.Equals(input as InlineResponse20014ReportedKeyFigures);
        }

        /// <summary>
        /// Returns true if InlineResponse20014ReportedKeyFigures instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20014ReportedKeyFigures to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20014ReportedKeyFigures input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FirstFiscalYear == input.FirstFiscalYear ||
                    (this.FirstFiscalYear != null &&
                    this.FirstFiscalYear.Equals(input.FirstFiscalYear))
                ) && 
                (
                    this.SecondFiscalYear == input.SecondFiscalYear ||
                    (this.SecondFiscalYear != null &&
                    this.SecondFiscalYear.Equals(input.SecondFiscalYear))
                ) && 
                (
                    this.ThirdFiscalYear == input.ThirdFiscalYear ||
                    (this.ThirdFiscalYear != null &&
                    this.ThirdFiscalYear.Equals(input.ThirdFiscalYear))
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
                if (this.FirstFiscalYear != null)
                {
                    hashCode = (hashCode * 59) + this.FirstFiscalYear.GetHashCode();
                }
                if (this.SecondFiscalYear != null)
                {
                    hashCode = (hashCode * 59) + this.SecondFiscalYear.GetHashCode();
                }
                if (this.ThirdFiscalYear != null)
                {
                    hashCode = (hashCode * 59) + this.ThirdFiscalYear.GetHashCode();
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
