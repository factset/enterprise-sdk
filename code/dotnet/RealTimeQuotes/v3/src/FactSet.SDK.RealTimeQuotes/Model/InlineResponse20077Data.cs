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
    /// Instrument data with a list of regional-level data and assigned listing-level data.
    /// </summary>
    [DataContract(Name = "inline_response_200_77_data")]
    public partial class InlineResponse20077Data : IEquatable<InlineResponse20077Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20077Data" /> class.
        /// </summary>
        /// <param name="idInstrument">MDG identifier of the instrument..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="permanentIdentifier">FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S)..</param>
        /// <param name="regional">Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array..</param>
        public InlineResponse20077Data(string idInstrument = default(string), string sourceIdentifier = default(string), string permanentIdentifier = default(string), List<InlineResponse20076DataRegional> regional = default(List<InlineResponse20076DataRegional>))
        {
            this.IdInstrument = idInstrument;
            this.SourceIdentifier = sourceIdentifier;
            this.PermanentIdentifier = permanentIdentifier;
            this.Regional = regional;
        }

        /// <summary>
        /// MDG identifier of the instrument.
        /// </summary>
        /// <value>MDG identifier of the instrument.</value>
        [DataMember(Name = "idInstrument", EmitDefaultValue = true)]
        public string IdInstrument { get; set; }

        /// <summary>
        /// Identifier used in the request.
        /// </summary>
        /// <value>Identifier used in the request.</value>
        [DataMember(Name = "sourceIdentifier", EmitDefaultValue = true)]
        public string SourceIdentifier { get; set; }

        /// <summary>
        /// FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).
        /// </summary>
        /// <value>FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).</value>
        [DataMember(Name = "permanentIdentifier", EmitDefaultValue = true)]
        public string PermanentIdentifier { get; set; }

        /// <summary>
        /// Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array.
        /// </summary>
        /// <value>Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array.</value>
        [DataMember(Name = "regional", EmitDefaultValue = false)]
        public List<InlineResponse20076DataRegional> Regional { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20077Data {\n");
            sb.Append("  IdInstrument: ").Append(IdInstrument).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  PermanentIdentifier: ").Append(PermanentIdentifier).Append("\n");
            sb.Append("  Regional: ").Append(Regional).Append("\n");
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
            return this.Equals(input as InlineResponse20077Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20077Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20077Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20077Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IdInstrument == input.IdInstrument ||
                    (this.IdInstrument != null &&
                    this.IdInstrument.Equals(input.IdInstrument))
                ) && 
                (
                    this.SourceIdentifier == input.SourceIdentifier ||
                    (this.SourceIdentifier != null &&
                    this.SourceIdentifier.Equals(input.SourceIdentifier))
                ) && 
                (
                    this.PermanentIdentifier == input.PermanentIdentifier ||
                    (this.PermanentIdentifier != null &&
                    this.PermanentIdentifier.Equals(input.PermanentIdentifier))
                ) && 
                (
                    this.Regional == input.Regional ||
                    this.Regional != null &&
                    input.Regional != null &&
                    this.Regional.SequenceEqual(input.Regional)
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
                if (this.IdInstrument != null)
                {
                    hashCode = (hashCode * 59) + this.IdInstrument.GetHashCode();
                }
                if (this.SourceIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.SourceIdentifier.GetHashCode();
                }
                if (this.PermanentIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.PermanentIdentifier.GetHashCode();
                }
                if (this.Regional != null)
                {
                    hashCode = (hashCode * 59) + this.Regional.GetHashCode();
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