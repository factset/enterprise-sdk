/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 *
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
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
using OpenAPIDateConverter = FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Model
{
    /// <summary>
    /// The IndexETF Response object
    /// </summary>
    [DataContract(Name = "IndexETFResponse")]
    public partial class IndexETFResponse : IEquatable<IndexETFResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IndexETFResponse" /> class.
        /// </summary>
        /// <param name="indexETF">List of IndexETF data.</param>
        public IndexETFResponse(List<IndexETF> indexETF = default(List<IndexETF>))
        {
            this.IndexETF = indexETF;
        }

        /// <summary>
        /// List of IndexETF data
        /// </summary>
        /// <value>List of IndexETF data</value>
        [DataMember(Name = "indexETF", EmitDefaultValue = false)]
        public List<IndexETF> IndexETF { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IndexETFResponse {\n");
            sb.Append("  IndexETF: ").Append(IndexETF).Append("\n");
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
            return this.Equals(input as IndexETFResponse);
        }

        /// <summary>
        /// Returns true if IndexETFResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of IndexETFResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IndexETFResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IndexETF == input.IndexETF ||
                    this.IndexETF != null &&
                    input.IndexETF != null &&
                    this.IndexETF.SequenceEqual(input.IndexETF)
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
                if (this.IndexETF != null)
                {
                    hashCode = (hashCode * 59) + this.IndexETF.GetHashCode();
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
