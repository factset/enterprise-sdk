/*
 * Open:FactSet - Partners
 *
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
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
using OpenAPIDateConverter = FactSet.SDK.OpenFactSetPartnersDocuments.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenFactSetPartnersDocuments.Model
{
    /// <summary>
    /// List of pagination objects
    /// </summary>
    [DataContract(Name = "pagination")]
    public partial class Pagination : IEquatable<Pagination>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Pagination" /> class.
        /// </summary>
        /// <param name="total">Total number of files the API returns for a particular query..</param>
        /// <param name="isEstimatedTotal">Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to “False” as the API should always return the exact count..</param>
        public Pagination(int total = default(int), bool isEstimatedTotal = default(bool))
        {
            this.Total = total;
            this.IsEstimatedTotal = isEstimatedTotal;
        }

        /// <summary>
        /// Total number of files the API returns for a particular query.
        /// </summary>
        /// <value>Total number of files the API returns for a particular query.</value>
        [DataMember(Name = "total", EmitDefaultValue = false)]
        public int Total { get; set; }

        /// <summary>
        /// Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to “False” as the API should always return the exact count.
        /// </summary>
        /// <value>Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to “False” as the API should always return the exact count.</value>
        [DataMember(Name = "isEstimatedTotal", EmitDefaultValue = true)]
        public bool IsEstimatedTotal { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Pagination {\n");
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
            return this.Equals(input as Pagination);
        }

        /// <summary>
        /// Returns true if Pagination instances are equal
        /// </summary>
        /// <param name="input">Instance of Pagination to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Pagination input)
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