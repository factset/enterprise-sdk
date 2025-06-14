/*
 * News API
 *
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
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
using OpenAPIDateConverter = FactSet.SDK.FactSetNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetNews.Model
{
    /// <summary>
    /// SearchResponseMetaPagination
    /// </summary>
    [DataContract(Name = "SearchResponse_meta_pagination")]
    public partial class SearchResponseMetaPagination : IEquatable<SearchResponseMetaPagination>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SearchResponseMetaPagination" /> class.
        /// </summary>
        /// <param name="total">The total number of items available in the search result..</param>
        /// <param name="isEstimatedTotal">Indicates whether the total count provided is an estimation..</param>
        public SearchResponseMetaPagination(int total = default(int), bool isEstimatedTotal = default(bool))
        {
            this.Total = total;
            this.IsEstimatedTotal = isEstimatedTotal;
        }

        /// <summary>
        /// The total number of items available in the search result.
        /// </summary>
        /// <value>The total number of items available in the search result.</value>
        [DataMember(Name = "total", EmitDefaultValue = false)]
        public int Total { get; set; }

        /// <summary>
        /// Indicates whether the total count provided is an estimation.
        /// </summary>
        /// <value>Indicates whether the total count provided is an estimation.</value>
        [DataMember(Name = "isEstimatedTotal", EmitDefaultValue = true)]
        public bool IsEstimatedTotal { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SearchResponseMetaPagination {\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  IsEstimatedTotal: ").Append(IsEstimatedTotal).Append("\n");
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
            return this.Equals(input as SearchResponseMetaPagination);
        }

        /// <summary>
        /// Returns true if SearchResponseMetaPagination instances are equal
        /// </summary>
        /// <param name="input">Instance of SearchResponseMetaPagination to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SearchResponseMetaPagination input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Total == input.Total ||
                    this.Total.Equals(input.Total)
                ) && 
                (
                    this.IsEstimatedTotal == input.IsEstimatedTotal ||
                    this.IsEstimatedTotal.Equals(input.IsEstimatedTotal)
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
                hashCode = (hashCode * 59) + this.Total.GetHashCode();
                hashCode = (hashCode * 59) + this.IsEstimatedTotal.GetHashCode();
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
