/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// NSIN data of the instrument.
    /// </summary>
    [DataContract(Name = "inline_response_200_42_data_nsin")]
    public partial class InlineResponse20042DataNsin : IEquatable<InlineResponse20042DataNsin>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20042DataNsin" /> class.
        /// </summary>
        /// <param name="wkn">The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument..</param>
        /// <param name="valor">The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument..</param>
        /// <param name="cusip">The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument..</param>
        /// <param name="sedol">The SEDOL or IDII for the instrument..</param>
        public InlineResponse20042DataNsin(string wkn = default(string), string valor = default(string), string cusip = default(string), string sedol = default(string))
        {
            this.Wkn = wkn;
            this.Valor = valor;
            this.Cusip = cusip;
            this.Sedol = sedol;
        }

        /// <summary>
        /// The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.
        /// </summary>
        /// <value>The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.</value>
        [DataMember(Name = "wkn", EmitDefaultValue = true)]
        public string Wkn { get; set; }

        /// <summary>
        /// The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.
        /// </summary>
        /// <value>The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.</value>
        [DataMember(Name = "valor", EmitDefaultValue = true)]
        public string Valor { get; set; }

        /// <summary>
        /// The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.
        /// </summary>
        /// <value>The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.</value>
        [DataMember(Name = "cusip", EmitDefaultValue = true)]
        public string Cusip { get; set; }

        /// <summary>
        /// The SEDOL or IDII for the instrument.
        /// </summary>
        /// <value>The SEDOL or IDII for the instrument.</value>
        [DataMember(Name = "sedol", EmitDefaultValue = true)]
        public string Sedol { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20042DataNsin {\n");
            sb.Append("  Wkn: ").Append(Wkn).Append("\n");
            sb.Append("  Valor: ").Append(Valor).Append("\n");
            sb.Append("  Cusip: ").Append(Cusip).Append("\n");
            sb.Append("  Sedol: ").Append(Sedol).Append("\n");
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
            return this.Equals(input as InlineResponse20042DataNsin);
        }

        /// <summary>
        /// Returns true if InlineResponse20042DataNsin instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20042DataNsin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20042DataNsin input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Wkn == input.Wkn ||
                    (this.Wkn != null &&
                    this.Wkn.Equals(input.Wkn))
                ) && 
                (
                    this.Valor == input.Valor ||
                    (this.Valor != null &&
                    this.Valor.Equals(input.Valor))
                ) && 
                (
                    this.Cusip == input.Cusip ||
                    (this.Cusip != null &&
                    this.Cusip.Equals(input.Cusip))
                ) && 
                (
                    this.Sedol == input.Sedol ||
                    (this.Sedol != null &&
                    this.Sedol.Equals(input.Sedol))
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
                if (this.Wkn != null)
                {
                    hashCode = (hashCode * 59) + this.Wkn.GetHashCode();
                }
                if (this.Valor != null)
                {
                    hashCode = (hashCode * 59) + this.Valor.GetHashCode();
                }
                if (this.Cusip != null)
                {
                    hashCode = (hashCode * 59) + this.Cusip.GetHashCode();
                }
                if (this.Sedol != null)
                {
                    hashCode = (hashCode * 59) + this.Sedol.GetHashCode();
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
