/*
 * Company Logo API
 *
 * Consume FactSet collected Company Logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Digital APIs.  The logo API provides access to logos for a global universe of listed companies. The logos could be accessed by using national and international identifiers like ISIN, CUSIP, WKN, Valor, etc. and are a nice feature for comprehensive visualizations of equities on overview pages (factsheets).  Logo collection and maintenance takes into account IPOs, M&A notifications, and further consistency check mechanisms.  The Company Logo API seamlessly integrates with the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) for equities and estimates data and the [Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api), allowing access to detailed price and performance information of listings. The [Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) also supports basic security identifier cross-reference (see for example /notation/crossReference/getByFactSetMarketSymbol to retrieve an instrument id). For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api).   
 *
 * The version of the OpenAPI document: 4.0.0
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
using OpenAPIDateConverter = FactSet.SDK.CompanyLogo.Client.OpenAPIDateConverter;

namespace FactSet.SDK.CompanyLogo.Model
{
    /// <summary>
    /// URLs of company logos. All URLs are publicly available via HTTPS and hosted by FactSet with a top-level domain &#x60;mdgms.com&#x60;. For possible values of the attribute &#x60;mimeType&#x60;, see endpoint &#x60;/basic/media/type/list&#x60; with parameter &#x60;filter.ids&#x3D;1 (image)&#x60;.
    /// </summary>
    [DataContract(Name = "inline_response_200_data")]
    public partial class InlineResponse200Data : IEquatable<InlineResponse200Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200Data" /> class.
        /// </summary>
        /// <param name="idInstrument">MDG identifier of the instrument..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="small">small.</param>
        /// <param name="medium">medium.</param>
        /// <param name="large">large.</param>
        /// <param name="vector">vector.</param>
        public InlineResponse200Data(string idInstrument = default(string), string sourceIdentifier = default(string), InlineResponse200DataSmall small = default(InlineResponse200DataSmall), InlineResponse200DataMedium medium = default(InlineResponse200DataMedium), InlineResponse200DataLarge large = default(InlineResponse200DataLarge), InlineResponse200DataVector vector = default(InlineResponse200DataVector))
        {
            this.IdInstrument = idInstrument;
            this.SourceIdentifier = sourceIdentifier;
            this.Small = small;
            this.Medium = medium;
            this.Large = large;
            this.Vector = vector;
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
        /// Gets or Sets Small
        /// </summary>
        [DataMember(Name = "small", EmitDefaultValue = false)]
        public InlineResponse200DataSmall Small { get; set; }

        /// <summary>
        /// Gets or Sets Medium
        /// </summary>
        [DataMember(Name = "medium", EmitDefaultValue = false)]
        public InlineResponse200DataMedium Medium { get; set; }

        /// <summary>
        /// Gets or Sets Large
        /// </summary>
        [DataMember(Name = "large", EmitDefaultValue = false)]
        public InlineResponse200DataLarge Large { get; set; }

        /// <summary>
        /// Gets or Sets Vector
        /// </summary>
        [DataMember(Name = "vector", EmitDefaultValue = false)]
        public InlineResponse200DataVector Vector { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200Data {\n");
            sb.Append("  IdInstrument: ").Append(IdInstrument).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  Small: ").Append(Small).Append("\n");
            sb.Append("  Medium: ").Append(Medium).Append("\n");
            sb.Append("  Large: ").Append(Large).Append("\n");
            sb.Append("  Vector: ").Append(Vector).Append("\n");
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
            return this.Equals(input as InlineResponse200Data);
        }

        /// <summary>
        /// Returns true if InlineResponse200Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200Data input)
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
                    this.Small == input.Small ||
                    (this.Small != null &&
                    this.Small.Equals(input.Small))
                ) && 
                (
                    this.Medium == input.Medium ||
                    (this.Medium != null &&
                    this.Medium.Equals(input.Medium))
                ) && 
                (
                    this.Large == input.Large ||
                    (this.Large != null &&
                    this.Large.Equals(input.Large))
                ) && 
                (
                    this.Vector == input.Vector ||
                    (this.Vector != null &&
                    this.Vector.Equals(input.Vector))
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
                if (this.Small != null)
                {
                    hashCode = (hashCode * 59) + this.Small.GetHashCode();
                }
                if (this.Medium != null)
                {
                    hashCode = (hashCode * 59) + this.Medium.GetHashCode();
                }
                if (this.Large != null)
                {
                    hashCode = (hashCode * 59) + this.Large.GetHashCode();
                }
                if (this.Vector != null)
                {
                    hashCode = (hashCode * 59) + this.Vector.GetHashCode();
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
