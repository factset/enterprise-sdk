/*
 * Funds API For Digital Portals
 *
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
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
using OpenAPIDateConverter = FactSet.SDK.FundsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FundsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Important dates of the instrument.
    /// </summary>
    [DataContract(Name = "inline_response_200_6_data_lifeCycle")]
    public partial class InlineResponse2006DataLifeCycle : IEquatable<InlineResponse2006DataLifeCycle>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2006DataLifeCycle" /> class.
        /// </summary>
        /// <param name="issue">Date of the issue..</param>
        /// <param name="maturity">Date of the maturity, available for life-cycle funds only..</param>
        /// <param name="fiscalYearStart">Starting day and month of the fund&#39;s fiscal year using truncated representation as specified by ISO 8601:2000. For example, the 30th of April would be represented as &#x60;- -04-30&#x60;..</param>
        public InlineResponse2006DataLifeCycle(DateTime issue = default(DateTime), DateTime maturity = default(DateTime), string fiscalYearStart = default(string))
        {
            this.Issue = issue;
            this.Maturity = maturity;
            this.FiscalYearStart = fiscalYearStart;
        }

        /// <summary>
        /// Date of the issue.
        /// </summary>
        /// <value>Date of the issue.</value>
        [DataMember(Name = "issue", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Issue { get; set; }

        /// <summary>
        /// Date of the maturity, available for life-cycle funds only.
        /// </summary>
        /// <value>Date of the maturity, available for life-cycle funds only.</value>
        [DataMember(Name = "maturity", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Maturity { get; set; }

        /// <summary>
        /// Starting day and month of the fund&#39;s fiscal year using truncated representation as specified by ISO 8601:2000. For example, the 30th of April would be represented as &#x60;- -04-30&#x60;.
        /// </summary>
        /// <value>Starting day and month of the fund&#39;s fiscal year using truncated representation as specified by ISO 8601:2000. For example, the 30th of April would be represented as &#x60;- -04-30&#x60;.</value>
        [DataMember(Name = "fiscalYearStart", EmitDefaultValue = false)]
        public string FiscalYearStart { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2006DataLifeCycle {\n");
            sb.Append("  Issue: ").Append(Issue).Append("\n");
            sb.Append("  Maturity: ").Append(Maturity).Append("\n");
            sb.Append("  FiscalYearStart: ").Append(FiscalYearStart).Append("\n");
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
            return this.Equals(input as InlineResponse2006DataLifeCycle);
        }

        /// <summary>
        /// Returns true if InlineResponse2006DataLifeCycle instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2006DataLifeCycle to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2006DataLifeCycle input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Issue == input.Issue ||
                    (this.Issue != null &&
                    this.Issue.Equals(input.Issue))
                ) && 
                (
                    this.Maturity == input.Maturity ||
                    (this.Maturity != null &&
                    this.Maturity.Equals(input.Maturity))
                ) && 
                (
                    this.FiscalYearStart == input.FiscalYearStart ||
                    (this.FiscalYearStart != null &&
                    this.FiscalYearStart.Equals(input.FiscalYearStart))
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
                if (this.Issue != null)
                {
                    hashCode = (hashCode * 59) + this.Issue.GetHashCode();
                }
                if (this.Maturity != null)
                {
                    hashCode = (hashCode * 59) + this.Maturity.GetHashCode();
                }
                if (this.FiscalYearStart != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalYearStart.GetHashCode();
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
