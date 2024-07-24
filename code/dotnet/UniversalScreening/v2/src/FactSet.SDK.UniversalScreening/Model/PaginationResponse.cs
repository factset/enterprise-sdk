/*
 * Universal Screening API
 *
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
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
using OpenAPIDateConverter = FactSet.SDK.UniversalScreening.Client.OpenAPIDateConverter;

namespace FactSet.SDK.UniversalScreening.Model
{
    /// <summary>
    /// Information about the paginated data in this response.
    /// </summary>
    [DataContract(Name = "PaginationResponse")]
    public partial class PaginationResponse : IEquatable<PaginationResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PaginationResponse" /> class.
        /// </summary>
        /// <param name="isEstimatedTotal">Denotes if the &#39;total&#39; property is an estimation.</param>
        /// <param name="next">Next cursor to be sent, will be null when there are no more results.</param>
        /// <param name="previous">Previous cursor, currently not supported.</param>
        /// <param name="total">Total number of rows in the screen.</param>
        public PaginationResponse(bool isEstimatedTotal = default(bool), string next = default(string), string previous = default(string), int total = default(int))
        {
            this.IsEstimatedTotal = isEstimatedTotal;
            this.Next = next;
            this.Previous = previous;
            this.Total = total;
        }

        /// <summary>
        /// Denotes if the &#39;total&#39; property is an estimation
        /// </summary>
        /// <value>Denotes if the &#39;total&#39; property is an estimation</value>
        [DataMember(Name = "isEstimatedTotal", EmitDefaultValue = true)]
        public bool IsEstimatedTotal { get; set; }

        /// <summary>
        /// Next cursor to be sent, will be null when there are no more results
        /// </summary>
        /// <value>Next cursor to be sent, will be null when there are no more results</value>
        [DataMember(Name = "next", EmitDefaultValue = true)]
        public string Next { get; set; }

        /// <summary>
        /// Previous cursor, currently not supported
        /// </summary>
        /// <value>Previous cursor, currently not supported</value>
        [DataMember(Name = "previous", EmitDefaultValue = true)]
        public string Previous { get; set; }

        /// <summary>
        /// Total number of rows in the screen
        /// </summary>
        /// <value>Total number of rows in the screen</value>
        [DataMember(Name = "total", EmitDefaultValue = false)]
        public int Total { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PaginationResponse {\n");
            sb.Append("  IsEstimatedTotal: ").Append(IsEstimatedTotal).Append("\n");
            sb.Append("  Next: ").Append(Next).Append("\n");
            sb.Append("  Previous: ").Append(Previous).Append("\n");
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
            return this.Equals(input as PaginationResponse);
        }

        /// <summary>
        /// Returns true if PaginationResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of PaginationResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PaginationResponse input)
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
                    this.Next == input.Next ||
                    (this.Next != null &&
                    this.Next.Equals(input.Next))
                ) && 
                (
                    this.Previous == input.Previous ||
                    (this.Previous != null &&
                    this.Previous.Equals(input.Previous))
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
                if (this.Next != null)
                {
                    hashCode = (hashCode * 59) + this.Next.GetHashCode();
                }
                if (this.Previous != null)
                {
                    hashCode = (hashCode * 59) + this.Previous.GetHashCode();
                }
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
