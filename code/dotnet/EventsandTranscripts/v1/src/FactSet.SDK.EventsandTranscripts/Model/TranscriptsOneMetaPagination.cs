/*
 * EVENTS AND TRANSCRIPTS API
 *
 * <p>The Calendar Events API provides access to FactSet’s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.EventsandTranscripts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.EventsandTranscripts.Model
{
    /// <summary>
    /// Pagination Object
    /// </summary>
    [DataContract(Name = "TranscriptsOne_meta_pagination")]
    public partial class TranscriptsOneMetaPagination : IEquatable<TranscriptsOneMetaPagination>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TranscriptsOneMetaPagination" /> class.
        /// </summary>
        /// <param name="isEstimatedTotal">This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results.             .</param>
        /// <param name="total">Total number of files the API returns for a particular query..</param>
        public TranscriptsOneMetaPagination(bool isEstimatedTotal = default(bool), int total = default(int))
        {
            this.IsEstimatedTotal = isEstimatedTotal;
            this.Total = total;
        }

        /// <summary>
        /// This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results.             
        /// </summary>
        /// <value>This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results.             </value>
        [DataMember(Name = "isEstimatedTotal", EmitDefaultValue = true)]
        public bool IsEstimatedTotal { get; set; }

        /// <summary>
        /// Total number of files the API returns for a particular query.
        /// </summary>
        /// <value>Total number of files the API returns for a particular query.</value>
        [DataMember(Name = "total", EmitDefaultValue = false)]
        public int Total { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TranscriptsOneMetaPagination {\n");
            sb.Append("  IsEstimatedTotal: ").Append(IsEstimatedTotal).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
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
            return this.Equals(input as TranscriptsOneMetaPagination);
        }

        /// <summary>
        /// Returns true if TranscriptsOneMetaPagination instances are equal
        /// </summary>
        /// <param name="input">Instance of TranscriptsOneMetaPagination to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TranscriptsOneMetaPagination input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IsEstimatedTotal == input.IsEstimatedTotal ||
                    this.IsEstimatedTotal.Equals(input.IsEstimatedTotal)
                ) && 
                (
                    this.Total == input.Total ||
                    this.Total.Equals(input.Total)
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
                hashCode = (hashCode * 59) + this.IsEstimatedTotal.GetHashCode();
                hashCode = (hashCode * 59) + this.Total.GetHashCode();
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
