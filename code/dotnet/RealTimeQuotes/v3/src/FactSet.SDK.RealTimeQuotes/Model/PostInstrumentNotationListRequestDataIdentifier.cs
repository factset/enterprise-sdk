/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeQuotes.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeQuotes.Model
{
    /// <summary>
    /// Set of identifiers and their type.
    /// </summary>
    [DataContract(Name = "PostInstrumentNotationListRequest_data_identifier")]
    public partial class PostInstrumentNotationListRequestDataIdentifier : IEquatable<PostInstrumentNotationListRequestDataIdentifier>, IValidatableObject
    {
        /// <summary>
        /// Type of the identifier.
        /// </summary>
        /// <value>Type of the identifier.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum IdInstrument for value: idInstrument
            /// </summary>
            [EnumMember(Value = "idInstrument")]
            IdInstrument = 1,

            /// <summary>
            /// Enum IdNotation for value: idNotation
            /// </summary>
            [EnumMember(Value = "idNotation")]
            IdNotation = 2,

            /// <summary>
            /// Enum FdsPermanentIdentifierSecurity for value: fdsPermanentIdentifierSecurity
            /// </summary>
            [EnumMember(Value = "fdsPermanentIdentifierSecurity")]
            FdsPermanentIdentifierSecurity = 3,

            /// <summary>
            /// Enum FdsPermanentIdentifierListing for value: fdsPermanentIdentifierListing
            /// </summary>
            [EnumMember(Value = "fdsPermanentIdentifierListing")]
            FdsPermanentIdentifierListing = 4,

            /// <summary>
            /// Enum FdsPermanentIdentifierRegional for value: fdsPermanentIdentifierRegional
            /// </summary>
            [EnumMember(Value = "fdsPermanentIdentifierRegional")]
            FdsPermanentIdentifierRegional = 5,

            /// <summary>
            /// Enum TickerExchange for value: tickerExchange
            /// </summary>
            [EnumMember(Value = "tickerExchange")]
            TickerExchange = 6,

            /// <summary>
            /// Enum TickerRegion for value: tickerRegion
            /// </summary>
            [EnumMember(Value = "tickerRegion")]
            TickerRegion = 7,

            /// <summary>
            /// Enum Sedol for value: sedol
            /// </summary>
            [EnumMember(Value = "sedol")]
            Sedol = 8,

            /// <summary>
            /// Enum Isin for value: isin
            /// </summary>
            [EnumMember(Value = "isin")]
            Isin = 9,

            /// <summary>
            /// Enum Wkn for value: wkn
            /// </summary>
            [EnumMember(Value = "wkn")]
            Wkn = 10,

            /// <summary>
            /// Enum Valor for value: valor
            /// </summary>
            [EnumMember(Value = "valor")]
            Valor = 11,

            /// <summary>
            /// Enum Cusip for value: cusip
            /// </summary>
            [EnumMember(Value = "cusip")]
            Cusip = 12

        }


        /// <summary>
        /// Type of the identifier.
        /// </summary>
        /// <value>Type of the identifier.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostInstrumentNotationListRequestDataIdentifier" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostInstrumentNotationListRequestDataIdentifier() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostInstrumentNotationListRequestDataIdentifier" /> class.
        /// </summary>
        /// <param name="values">Set of identifiers to resolve. (required).</param>
        /// <param name="type">Type of the identifier. (required).</param>
        public PostInstrumentNotationListRequestDataIdentifier(List<string> values, TypeEnum type)
        {
            // to ensure "values" is required (not null)
            if (values == null) {
                throw new ArgumentNullException("values is a required property for PostInstrumentNotationListRequestDataIdentifier and cannot be null");
            }
            this.Values = values;
            this.Type = type;
        }

        /// <summary>
        /// Set of identifiers to resolve.
        /// </summary>
        /// <value>Set of identifiers to resolve.</value>
        [DataMember(Name = "values", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Values { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostInstrumentNotationListRequestDataIdentifier {\n");
            sb.Append("  Values: ").Append(Values).Append("\n");
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
            return this.Equals(input as PostInstrumentNotationListRequestDataIdentifier);
        }

        /// <summary>
        /// Returns true if PostInstrumentNotationListRequestDataIdentifier instances are equal
        /// </summary>
        /// <param name="input">Instance of PostInstrumentNotationListRequestDataIdentifier to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostInstrumentNotationListRequestDataIdentifier input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Values == input.Values ||
                    this.Values != null &&
                    input.Values != null &&
                    this.Values.SequenceEqual(input.Values)
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
                if (this.Values != null)
                {
                    hashCode = (hashCode * 59) + this.Values.GetHashCode();
                }
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