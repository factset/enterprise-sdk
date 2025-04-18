/*
 * Global Filings API
 *
 *  The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  The reference endpoints, such as sources, formTypes, timeZones, and categories, provide comprehensive lists of available sources, form types, time zones, and categories, respectively.
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.GlobalFilings.Client.OpenAPIDateConverter;

namespace FactSet.SDK.GlobalFilings.Model
{
    /// <summary>
    /// Pagination Object
    /// </summary>
    [DataContract(Name = "InvestmentResearch_meta_pagination")]
    public partial class InvestmentResearchMetaPagination : IEquatable<InvestmentResearchMetaPagination>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InvestmentResearchMetaPagination" /> class.
        /// </summary>
        /// <param name="isEstimatedTotal">This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results..</param>
        /// <param name="total">Total number of files the API returns for a particular query..</param>
        public InvestmentResearchMetaPagination(bool isEstimatedTotal = default(bool), int total = default(int))
        {
            this.IsEstimatedTotal = isEstimatedTotal;
            this.Total = total;
        }

        /// <summary>
        /// This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results.
        /// </summary>
        /// <value>This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results.</value>
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
            sb.Append("class InvestmentResearchMetaPagination {\n");
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
            return this.Equals(input as InvestmentResearchMetaPagination);
        }

        /// <summary>
        /// Returns true if InvestmentResearchMetaPagination instances are equal
        /// </summary>
        /// <param name="input">Instance of InvestmentResearchMetaPagination to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InvestmentResearchMetaPagination input)
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
