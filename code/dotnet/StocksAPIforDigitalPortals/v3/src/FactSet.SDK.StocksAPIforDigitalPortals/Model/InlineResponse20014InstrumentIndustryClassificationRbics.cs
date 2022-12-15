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
    /// Classification based on FactSet Revere Business Industry Classification System (RBICS).
    /// </summary>
    [DataContract(Name = "inline_response_200_14_instrument_industryClassification_rbics")]
    public partial class InlineResponse20014InstrumentIndustryClassificationRbics : IEquatable<InlineResponse20014InstrumentIndustryClassificationRbics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20014InstrumentIndustryClassificationRbics" /> class.
        /// </summary>
        /// <param name="level1">level1.</param>
        /// <param name="level2">level2.</param>
        /// <param name="level3">level3.</param>
        /// <param name="level4">level4.</param>
        /// <param name="level5">level5.</param>
        /// <param name="level6">level6.</param>
        public InlineResponse20014InstrumentIndustryClassificationRbics(InlineResponse20014InstrumentIndustryClassificationRbicsLevel1 level1 = default(InlineResponse20014InstrumentIndustryClassificationRbicsLevel1), InlineResponse20014InstrumentIndustryClassificationRbicsLevel2 level2 = default(InlineResponse20014InstrumentIndustryClassificationRbicsLevel2), InlineResponse20014InstrumentIndustryClassificationRbicsLevel3 level3 = default(InlineResponse20014InstrumentIndustryClassificationRbicsLevel3), InlineResponse20014InstrumentIndustryClassificationRbicsLevel4 level4 = default(InlineResponse20014InstrumentIndustryClassificationRbicsLevel4), InlineResponse20014InstrumentIndustryClassificationRbicsLevel5 level5 = default(InlineResponse20014InstrumentIndustryClassificationRbicsLevel5), InlineResponse20014InstrumentIndustryClassificationRbicsLevel6 level6 = default(InlineResponse20014InstrumentIndustryClassificationRbicsLevel6))
        {
            this.Level1 = level1;
            this.Level2 = level2;
            this.Level3 = level3;
            this.Level4 = level4;
            this.Level5 = level5;
            this.Level6 = level6;
        }

        /// <summary>
        /// Gets or Sets Level1
        /// </summary>
        [DataMember(Name = "level1", EmitDefaultValue = false)]
        public InlineResponse20014InstrumentIndustryClassificationRbicsLevel1 Level1 { get; set; }

        /// <summary>
        /// Gets or Sets Level2
        /// </summary>
        [DataMember(Name = "level2", EmitDefaultValue = false)]
        public InlineResponse20014InstrumentIndustryClassificationRbicsLevel2 Level2 { get; set; }

        /// <summary>
        /// Gets or Sets Level3
        /// </summary>
        [DataMember(Name = "level3", EmitDefaultValue = false)]
        public InlineResponse20014InstrumentIndustryClassificationRbicsLevel3 Level3 { get; set; }

        /// <summary>
        /// Gets or Sets Level4
        /// </summary>
        [DataMember(Name = "level4", EmitDefaultValue = false)]
        public InlineResponse20014InstrumentIndustryClassificationRbicsLevel4 Level4 { get; set; }

        /// <summary>
        /// Gets or Sets Level5
        /// </summary>
        [DataMember(Name = "level5", EmitDefaultValue = false)]
        public InlineResponse20014InstrumentIndustryClassificationRbicsLevel5 Level5 { get; set; }

        /// <summary>
        /// Gets or Sets Level6
        /// </summary>
        [DataMember(Name = "level6", EmitDefaultValue = false)]
        public InlineResponse20014InstrumentIndustryClassificationRbicsLevel6 Level6 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20014InstrumentIndustryClassificationRbics {\n");
            sb.Append("  Level1: ").Append(Level1).Append("\n");
            sb.Append("  Level2: ").Append(Level2).Append("\n");
            sb.Append("  Level3: ").Append(Level3).Append("\n");
            sb.Append("  Level4: ").Append(Level4).Append("\n");
            sb.Append("  Level5: ").Append(Level5).Append("\n");
            sb.Append("  Level6: ").Append(Level6).Append("\n");
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
            return this.Equals(input as InlineResponse20014InstrumentIndustryClassificationRbics);
        }

        /// <summary>
        /// Returns true if InlineResponse20014InstrumentIndustryClassificationRbics instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20014InstrumentIndustryClassificationRbics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20014InstrumentIndustryClassificationRbics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Level1 == input.Level1 ||
                    (this.Level1 != null &&
                    this.Level1.Equals(input.Level1))
                ) && 
                (
                    this.Level2 == input.Level2 ||
                    (this.Level2 != null &&
                    this.Level2.Equals(input.Level2))
                ) && 
                (
                    this.Level3 == input.Level3 ||
                    (this.Level3 != null &&
                    this.Level3.Equals(input.Level3))
                ) && 
                (
                    this.Level4 == input.Level4 ||
                    (this.Level4 != null &&
                    this.Level4.Equals(input.Level4))
                ) && 
                (
                    this.Level5 == input.Level5 ||
                    (this.Level5 != null &&
                    this.Level5.Equals(input.Level5))
                ) && 
                (
                    this.Level6 == input.Level6 ||
                    (this.Level6 != null &&
                    this.Level6.Equals(input.Level6))
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
                if (this.Level1 != null)
                {
                    hashCode = (hashCode * 59) + this.Level1.GetHashCode();
                }
                if (this.Level2 != null)
                {
                    hashCode = (hashCode * 59) + this.Level2.GetHashCode();
                }
                if (this.Level3 != null)
                {
                    hashCode = (hashCode * 59) + this.Level3.GetHashCode();
                }
                if (this.Level4 != null)
                {
                    hashCode = (hashCode * 59) + this.Level4.GetHashCode();
                }
                if (this.Level5 != null)
                {
                    hashCode = (hashCode * 59) + this.Level5.GetHashCode();
                }
                if (this.Level6 != null)
                {
                    hashCode = (hashCode * 59) + this.Level6.GetHashCode();
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
