/*
 * Documents Distributor - CallStreet Events
 *
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.7.0
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
using OpenAPIDateConverter = FactSet.SDK.DocumentsDistributorCallStreetEvents.Client.OpenAPIDateConverter;

namespace FactSet.SDK.DocumentsDistributorCallStreetEvents.Model
{
    /// <summary>
    /// NRTCallsMeta
    /// </summary>
    [DataContract(Name = "NRT_Calls_meta")]
    public partial class NRTCallsMeta : IEquatable<NRTCallsMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NRTCallsMeta" /> class.
        /// </summary>
        /// <param name="sort">The value in _sort parameter if used in the request..</param>
        /// <param name="pagination">pagination.</param>
        /// <param name="partial">partial.</param>
        public NRTCallsMeta(List<string> sort = default(List<string>), NRTSnippetsMetaPagination pagination = default(NRTSnippetsMetaPagination), NRTSnippetsMetaPartial partial = default(NRTSnippetsMetaPartial))
        {
            this.Sort = sort;
            this.Pagination = pagination;
            this.Partial = partial;
        }

        /// <summary>
        /// The value in _sort parameter if used in the request.
        /// </summary>
        /// <value>The value in _sort parameter if used in the request.</value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public List<string> Sort { get; set; }

        /// <summary>
        /// Gets or Sets Pagination
        /// </summary>
        [DataMember(Name = "pagination", EmitDefaultValue = false)]
        public NRTSnippetsMetaPagination Pagination { get; set; }

        /// <summary>
        /// Gets or Sets Partial
        /// </summary>
        [DataMember(Name = "partial", EmitDefaultValue = false)]
        public NRTSnippetsMetaPartial Partial { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NRTCallsMeta {\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
            sb.Append("  Pagination: ").Append(Pagination).Append("\n");
            sb.Append("  Partial: ").Append(Partial).Append("\n");
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
            return this.Equals(input as NRTCallsMeta);
        }

        /// <summary>
        /// Returns true if NRTCallsMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of NRTCallsMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NRTCallsMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sort == input.Sort ||
                    this.Sort != null &&
                    input.Sort != null &&
                    this.Sort.SequenceEqual(input.Sort)
                ) && 
                (
                    this.Pagination == input.Pagination ||
                    (this.Pagination != null &&
                    this.Pagination.Equals(input.Pagination))
                ) && 
                (
                    this.Partial == input.Partial ||
                    (this.Partial != null &&
                    this.Partial.Equals(input.Partial))
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
                if (this.Sort != null)
                {
                    hashCode = (hashCode * 59) + this.Sort.GetHashCode();
                }
                if (this.Pagination != null)
                {
                    hashCode = (hashCode * 59) + this.Pagination.GetHashCode();
                }
                if (this.Partial != null)
                {
                    hashCode = (hashCode * 59) + this.Partial.GetHashCode();
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
