/*
 * Global Filings API
 *
 * The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet’s document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  Helper endpoint will provide dynamic information on the parameters of a document request. .
 *
 * The version of the OpenAPI document: 0.0.0
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
    /// Meta Object
    /// </summary>
    [DataContract(Name = "InvestmentResearch_meta")]
    public partial class InvestmentResearchMeta : IEquatable<InvestmentResearchMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InvestmentResearchMeta" /> class.
        /// </summary>
        /// <param name="pagination">pagination.</param>
        public InvestmentResearchMeta(InvestmentResearchMetaPagination pagination = default(InvestmentResearchMetaPagination))
        {
            this.Pagination = pagination;
        }

        /// <summary>
        /// Gets or Sets Pagination
        /// </summary>
        [DataMember(Name = "pagination", EmitDefaultValue = false)]
        public InvestmentResearchMetaPagination Pagination { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InvestmentResearchMeta {\n");
            sb.Append("  Pagination: ").Append(Pagination).Append("\n");
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
            return this.Equals(input as InvestmentResearchMeta);
        }

        /// <summary>
        /// Returns true if InvestmentResearchMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of InvestmentResearchMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InvestmentResearchMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Pagination == input.Pagination ||
                    (this.Pagination != null &&
                    this.Pagination.Equals(input.Pagination))
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
                if (this.Pagination != null)
                {
                    hashCode = (hashCode * 59) + this.Pagination.GetHashCode();
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
