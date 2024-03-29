/*
 * Watchlist API For Digital Portals
 *
 * Watchlists keeps track of users' individual investment objectives. They are meant to support the self-directed business of wealth management firms.  The Watchlist API for Digital Portals is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments in a watchlist. This also supports basic security identifier cross-reference. To complement the Watchlist API with direct access to price histories, please refer to the Time Series API for Digital Portals.
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
using OpenAPIDateConverter = FactSet.SDK.WatchlistAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.WatchlistAPIforDigitalPortals.Model
{
    /// <summary>
    /// Pagination attributes for the offset-based pagination strategy; a total element count is not supported.
    /// </summary>
    [DataContract(Name = "OffsetBasedPaginationOutputObjectWithoutTotal")]
    public partial class OffsetBasedPaginationOutputObjectWithoutTotal : IEquatable<OffsetBasedPaginationOutputObjectWithoutTotal>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OffsetBasedPaginationOutputObjectWithoutTotal" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OffsetBasedPaginationOutputObjectWithoutTotal() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OffsetBasedPaginationOutputObjectWithoutTotal" /> class.
        /// </summary>
        /// <param name="hasNext">Flag indicating that a subsequent request with the same parameters, except that the parameter &#x60;pagination.offset&#x60; is incremented by &#x60;pagination.limit&#x60;, would yield additional results. (required).</param>
        public OffsetBasedPaginationOutputObjectWithoutTotal(bool hasNext)
        {
            this.HasNext = hasNext;
        }

        /// <summary>
        /// Flag indicating that a subsequent request with the same parameters, except that the parameter &#x60;pagination.offset&#x60; is incremented by &#x60;pagination.limit&#x60;, would yield additional results.
        /// </summary>
        /// <value>Flag indicating that a subsequent request with the same parameters, except that the parameter &#x60;pagination.offset&#x60; is incremented by &#x60;pagination.limit&#x60;, would yield additional results.</value>
        [DataMember(Name = "hasNext", IsRequired = true, EmitDefaultValue = true)]
        public bool HasNext { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OffsetBasedPaginationOutputObjectWithoutTotal {\n");
            sb.Append("  HasNext: ").Append(HasNext).Append("\n");
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
            return this.Equals(input as OffsetBasedPaginationOutputObjectWithoutTotal);
        }

        /// <summary>
        /// Returns true if OffsetBasedPaginationOutputObjectWithoutTotal instances are equal
        /// </summary>
        /// <param name="input">Instance of OffsetBasedPaginationOutputObjectWithoutTotal to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OffsetBasedPaginationOutputObjectWithoutTotal input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.HasNext == input.HasNext ||
                    this.HasNext.Equals(input.HasNext)
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
                hashCode = (hashCode * 59) + this.HasNext.GetHashCode();
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
