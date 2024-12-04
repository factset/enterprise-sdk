/*
 * FactSet Symbology API
 *
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.3
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
using OpenAPIDateConverter = FactSet.SDK.Symbology.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Symbology.Model
{
    /// <summary>
    /// Request object for Ticker endpoint.
    /// </summary>
    [DataContract(Name = "tickerTranslationRequest")]
    public partial class TickerTranslationRequest : IEquatable<TickerTranslationRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TickerTranslationRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TickerTranslationRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TickerTranslationRequest" /> class.
        /// </summary>
        /// <param name="ids">Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. (required).</param>
        /// <param name="tickerType">Controls the Ticker Type returned.   * **REGION** &#x3D; Ticker-Regional   * **EXCHANGE** &#x3D; Ticker-Exchange  (required).</param>
        public TickerTranslationRequest(List<string> ids, string tickerType)
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for TickerTranslationRequest and cannot be null");
            }
            this.Ids = ids;
            // to ensure "tickerType" is required (not null)
            if (tickerType == null) {
                throw new ArgumentNullException("tickerType is a required property for TickerTranslationRequest and cannot be null");
            }
            this.TickerType = tickerType;
        }

        /// <summary>
        /// Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;.
        /// </summary>
        /// <value>Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;.</value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Controls the Ticker Type returned.   * **REGION** &#x3D; Ticker-Regional   * **EXCHANGE** &#x3D; Ticker-Exchange 
        /// </summary>
        /// <value>Controls the Ticker Type returned.   * **REGION** &#x3D; Ticker-Regional   * **EXCHANGE** &#x3D; Ticker-Exchange </value>
        [DataMember(Name = "tickerType", IsRequired = true, EmitDefaultValue = false)]
        public string TickerType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TickerTranslationRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  TickerType: ").Append(TickerType).Append("\n");
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
            return this.Equals(input as TickerTranslationRequest);
        }

        /// <summary>
        /// Returns true if TickerTranslationRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of TickerTranslationRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TickerTranslationRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.TickerType == input.TickerType ||
                    (this.TickerType != null &&
                    this.TickerType.Equals(input.TickerType))
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
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
                }
                if (this.TickerType != null)
                {
                    hashCode = (hashCode * 59) + this.TickerType.GetHashCode();
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
