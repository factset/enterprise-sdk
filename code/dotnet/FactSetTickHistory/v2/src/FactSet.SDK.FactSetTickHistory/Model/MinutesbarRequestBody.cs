/*
 * Tick History
 *
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.4.1
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTickHistory.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTickHistory.Model
{
    /// <summary>
    /// Level1 Minute bars request body elements
    /// </summary>
    [DataContract(Name = "MinutesbarRequestBody")]
    public partial class MinutesbarRequestBody : IEquatable<MinutesbarRequestBody>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Granularity
        /// </summary>
        [DataMember(Name = "granularity", IsRequired = true, EmitDefaultValue = false)]
        public Granularity Granularity { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public Type Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MinutesbarRequestBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MinutesbarRequestBody() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MinutesbarRequestBody" /> class.
        /// </summary>
        /// <param name="tickers">The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.    (required).</param>
        /// <param name="factsetExchangeCode">FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;.  (required).</param>
        /// <param name="dateTimeRange">dateTimeRange (required).</param>
        /// <param name="granularity">granularity (required).</param>
        /// <param name="type">type (required).</param>
        public MinutesbarRequestBody(List<string> tickers, string factsetExchangeCode, DateTimePeriodMin dateTimeRange, Granularity granularity, Type type)
        {
            // to ensure "tickers" is required (not null)
            if (tickers == null) {
                throw new ArgumentNullException("tickers is a required property for MinutesbarRequestBody and cannot be null");
            }
            this.Tickers = tickers;
            // to ensure "factsetExchangeCode" is required (not null)
            if (factsetExchangeCode == null) {
                throw new ArgumentNullException("factsetExchangeCode is a required property for MinutesbarRequestBody and cannot be null");
            }
            this.FactsetExchangeCode = factsetExchangeCode;
            // to ensure "dateTimeRange" is required (not null)
            if (dateTimeRange == null) {
                throw new ArgumentNullException("dateTimeRange is a required property for MinutesbarRequestBody and cannot be null");
            }
            this.DateTimeRange = dateTimeRange;
            this.Granularity = granularity;
            this.Type = type;
        }

        /// <summary>
        /// The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.   
        /// </summary>
        /// <value>The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.   </value>
        [DataMember(Name = "tickers", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Tickers { get; set; }

        /// <summary>
        /// FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;. 
        /// </summary>
        /// <value>FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;. </value>
        [DataMember(Name = "factsetExchangeCode", IsRequired = true, EmitDefaultValue = false)]
        public string FactsetExchangeCode { get; set; }

        /// <summary>
        /// Gets or Sets DateTimeRange
        /// </summary>
        [DataMember(Name = "dateTimeRange", IsRequired = true, EmitDefaultValue = false)]
        public DateTimePeriodMin DateTimeRange { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MinutesbarRequestBody {\n");
            sb.Append("  Tickers: ").Append(Tickers).Append("\n");
            sb.Append("  FactsetExchangeCode: ").Append(FactsetExchangeCode).Append("\n");
            sb.Append("  DateTimeRange: ").Append(DateTimeRange).Append("\n");
            sb.Append("  Granularity: ").Append(Granularity).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as MinutesbarRequestBody);
        }

        /// <summary>
        /// Returns true if MinutesbarRequestBody instances are equal
        /// </summary>
        /// <param name="input">Instance of MinutesbarRequestBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MinutesbarRequestBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Tickers == input.Tickers ||
                    this.Tickers != null &&
                    input.Tickers != null &&
                    this.Tickers.SequenceEqual(input.Tickers)
                ) && 
                (
                    this.FactsetExchangeCode == input.FactsetExchangeCode ||
                    (this.FactsetExchangeCode != null &&
                    this.FactsetExchangeCode.Equals(input.FactsetExchangeCode))
                ) && 
                (
                    this.DateTimeRange == input.DateTimeRange ||
                    (this.DateTimeRange != null &&
                    this.DateTimeRange.Equals(input.DateTimeRange))
                ) && 
                (
                    this.Granularity == input.Granularity ||
                    this.Granularity.Equals(input.Granularity)
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
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
                if (this.Tickers != null)
                {
                    hashCode = (hashCode * 59) + this.Tickers.GetHashCode();
                }
                if (this.FactsetExchangeCode != null)
                {
                    hashCode = (hashCode * 59) + this.FactsetExchangeCode.GetHashCode();
                }
                if (this.DateTimeRange != null)
                {
                    hashCode = (hashCode * 59) + this.DateTimeRange.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Granularity.GetHashCode();
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
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
