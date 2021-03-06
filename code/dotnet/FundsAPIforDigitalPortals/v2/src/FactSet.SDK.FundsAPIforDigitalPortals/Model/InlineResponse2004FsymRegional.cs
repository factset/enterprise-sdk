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
    /// Regional-level identifiers.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_fsym_regional")]
    public partial class InlineResponse2004FsymRegional : IEquatable<InlineResponse2004FsymRegional>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004FsymRegional" /> class.
        /// </summary>
        /// <param name="permanentIdentifier">FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R)..</param>
        /// <param name="tickerRegion">FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: DAI-DE)..</param>
        /// <param name="isPrimary">Indicates whether the notation is in the primary region of the security (&#x60;true&#x60;) or not (&#x60;false&#x60;)..</param>
        public InlineResponse2004FsymRegional(string permanentIdentifier = default(string), string tickerRegion = default(string), bool isPrimary = default(bool))
        {
            this.PermanentIdentifier = permanentIdentifier;
            this.TickerRegion = tickerRegion;
            this.IsPrimary = isPrimary;
        }

        /// <summary>
        /// FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R).
        /// </summary>
        /// <value>FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R).</value>
        [DataMember(Name = "permanentIdentifier", EmitDefaultValue = false)]
        public string PermanentIdentifier { get; set; }

        /// <summary>
        /// FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: DAI-DE).
        /// </summary>
        /// <value>FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: DAI-DE).</value>
        [DataMember(Name = "tickerRegion", EmitDefaultValue = false)]
        public string TickerRegion { get; set; }

        /// <summary>
        /// Indicates whether the notation is in the primary region of the security (&#x60;true&#x60;) or not (&#x60;false&#x60;).
        /// </summary>
        /// <value>Indicates whether the notation is in the primary region of the security (&#x60;true&#x60;) or not (&#x60;false&#x60;).</value>
        [DataMember(Name = "isPrimary", EmitDefaultValue = true)]
        public bool IsPrimary { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004FsymRegional {\n");
            sb.Append("  PermanentIdentifier: ").Append(PermanentIdentifier).Append("\n");
            sb.Append("  TickerRegion: ").Append(TickerRegion).Append("\n");
            sb.Append("  IsPrimary: ").Append(IsPrimary).Append("\n");
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
            return this.Equals(input as InlineResponse2004FsymRegional);
        }

        /// <summary>
        /// Returns true if InlineResponse2004FsymRegional instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004FsymRegional to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004FsymRegional input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PermanentIdentifier == input.PermanentIdentifier ||
                    (this.PermanentIdentifier != null &&
                    this.PermanentIdentifier.Equals(input.PermanentIdentifier))
                ) && 
                (
                    this.TickerRegion == input.TickerRegion ||
                    (this.TickerRegion != null &&
                    this.TickerRegion.Equals(input.TickerRegion))
                ) && 
                (
                    this.IsPrimary == input.IsPrimary ||
                    this.IsPrimary.Equals(input.IsPrimary)
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
                if (this.PermanentIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.PermanentIdentifier.GetHashCode();
                }
                if (this.TickerRegion != null)
                {
                    hashCode = (hashCode * 59) + this.TickerRegion.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsPrimary.GetHashCode();
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
