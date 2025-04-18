/*
 * FactSet Global Prices API
 *
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetGlobalPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetGlobalPrices.Model
{
    /// <summary>
    /// AnnualizedDividendsObject
    /// </summary>
    [DataContract(Name = "annualizedDividendsObject")]
    public partial class AnnualizedDividendsObject : IEquatable<AnnualizedDividendsObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AnnualizedDividendsObject" /> class.
        /// </summary>
        /// <param name="fsymId">Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet..</param>
        /// <param name="eventId">FactSet identifier that uniquely identifies the Event..</param>
        /// <param name="effectiveDate">Effective Date or Ex-Date of Annualized Dividend in YYYY-MM-DD format..</param>
        /// <param name="iadDefTradingAdj">Annualized Dividend value in the trading currency. The value is adjusted for splits.</param>
        /// <param name="currency">Currency ISO code associated with the annualized dividends.For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="requestId">Identifier that was used for the request..</param>
        public AnnualizedDividendsObject(string fsymId = default(string), string eventId = default(string), string effectiveDate = default(string), float? iadDefTradingAdj = default(float?), string currency = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.EventId = eventId;
            this.EffectiveDate = effectiveDate;
            this.IadDefTradingAdj = iadDefTradingAdj;
            this.Currency = currency;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
        /// </summary>
        /// <value>Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// FactSet identifier that uniquely identifies the Event.
        /// </summary>
        /// <value>FactSet identifier that uniquely identifies the Event.</value>
        [DataMember(Name = "eventId", EmitDefaultValue = true)]
        public string EventId { get; set; }

        /// <summary>
        /// Effective Date or Ex-Date of Annualized Dividend in YYYY-MM-DD format.
        /// </summary>
        /// <value>Effective Date or Ex-Date of Annualized Dividend in YYYY-MM-DD format.</value>
        [DataMember(Name = "effectiveDate", EmitDefaultValue = true)]
        public string EffectiveDate { get; set; }

        /// <summary>
        /// Annualized Dividend value in the trading currency. The value is adjusted for splits
        /// </summary>
        /// <value>Annualized Dividend value in the trading currency. The value is adjusted for splits</value>
        [DataMember(Name = "iadDefTradingAdj", EmitDefaultValue = true)]
        public float? IadDefTradingAdj { get; set; }

        /// <summary>
        /// Currency ISO code associated with the annualized dividends.For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency ISO code associated with the annualized dividends.For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Identifier that was used for the request.
        /// </summary>
        /// <value>Identifier that was used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AnnualizedDividendsObject {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  EventId: ").Append(EventId).Append("\n");
            sb.Append("  EffectiveDate: ").Append(EffectiveDate).Append("\n");
            sb.Append("  IadDefTradingAdj: ").Append(IadDefTradingAdj).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as AnnualizedDividendsObject);
        }

        /// <summary>
        /// Returns true if AnnualizedDividendsObject instances are equal
        /// </summary>
        /// <param name="input">Instance of AnnualizedDividendsObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AnnualizedDividendsObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.EventId == input.EventId ||
                    (this.EventId != null &&
                    this.EventId.Equals(input.EventId))
                ) && 
                (
                    this.EffectiveDate == input.EffectiveDate ||
                    (this.EffectiveDate != null &&
                    this.EffectiveDate.Equals(input.EffectiveDate))
                ) && 
                (
                    this.IadDefTradingAdj == input.IadDefTradingAdj ||
                    (this.IadDefTradingAdj != null &&
                    this.IadDefTradingAdj.Equals(input.IadDefTradingAdj))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.EventId != null)
                {
                    hashCode = (hashCode * 59) + this.EventId.GetHashCode();
                }
                if (this.EffectiveDate != null)
                {
                    hashCode = (hashCode * 59) + this.EffectiveDate.GetHashCode();
                }
                if (this.IadDefTradingAdj != null)
                {
                    hashCode = (hashCode * 59) + this.IadDefTradingAdj.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
