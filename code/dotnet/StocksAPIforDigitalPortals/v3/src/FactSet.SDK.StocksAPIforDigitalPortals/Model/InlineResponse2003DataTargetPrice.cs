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
    /// Details of the target price.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_data_targetPrice")]
    public partial class InlineResponse2003DataTargetPrice : IEquatable<InlineResponse2003DataTargetPrice>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003DataTargetPrice" /> class.
        /// </summary>
        /// <param name="latestUpdate">Date of the latest update..</param>
        /// <param name="mean">Mean value..</param>
        /// <param name="currency">currency.</param>
        public InlineResponse2003DataTargetPrice(DateTime? latestUpdate = default(DateTime?), decimal? mean = default(decimal?), InlineResponse2003DataTargetPriceCurrency currency = default(InlineResponse2003DataTargetPriceCurrency))
        {
            this.LatestUpdate = latestUpdate;
            this.Mean = mean;
            this.Currency = currency;
        }

        /// <summary>
        /// Date of the latest update.
        /// </summary>
        /// <value>Date of the latest update.</value>
        [DataMember(Name = "latestUpdate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? LatestUpdate { get; set; }

        /// <summary>
        /// Mean value.
        /// </summary>
        /// <value>Mean value.</value>
        [DataMember(Name = "mean", EmitDefaultValue = true)]
        public decimal? Mean { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public InlineResponse2003DataTargetPriceCurrency Currency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2003DataTargetPrice {\n");
            sb.Append("  LatestUpdate: ").Append(LatestUpdate).Append("\n");
            sb.Append("  Mean: ").Append(Mean).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
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
            return this.Equals(input as InlineResponse2003DataTargetPrice);
        }

        /// <summary>
        /// Returns true if InlineResponse2003DataTargetPrice instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003DataTargetPrice to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003DataTargetPrice input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.LatestUpdate == input.LatestUpdate ||
                    (this.LatestUpdate != null &&
                    this.LatestUpdate.Equals(input.LatestUpdate))
                ) && 
                (
                    this.Mean == input.Mean ||
                    (this.Mean != null &&
                    this.Mean.Equals(input.Mean))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
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
                if (this.LatestUpdate != null)
                {
                    hashCode = (hashCode * 59) + this.LatestUpdate.GetHashCode();
                }
                if (this.Mean != null)
                {
                    hashCode = (hashCode * 59) + this.Mean.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
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
