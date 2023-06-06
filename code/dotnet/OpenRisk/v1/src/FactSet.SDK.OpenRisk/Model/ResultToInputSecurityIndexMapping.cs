/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
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
using OpenAPIDateConverter = FactSet.SDK.OpenRisk.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenRisk.Model
{
    /// <summary>
    /// For each input holding from the request, a list of indices aligned to the security dimension of the results arrays and the &#x60;labels.security.ids&#x60; array. These 0-based index values key into the input holding&#39;s IDs. Values less than 0 indicate result index not originating from corresponding holding.
    /// </summary>
    [DataContract(Name = "ResultToInputSecurityIndexMapping")]
    public partial class ResultToInputSecurityIndexMapping : IEquatable<ResultToInputSecurityIndexMapping>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResultToInputSecurityIndexMapping" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ResultToInputSecurityIndexMapping() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ResultToInputSecurityIndexMapping" /> class.
        /// </summary>
        /// <param name="portfolio">portfolio (required).</param>
        /// <param name="benchmark">benchmark.</param>
        /// <param name="market">market.</param>
        public ResultToInputSecurityIndexMapping(List<int> portfolio,List<int> benchmark = default(List<int>), List<int> market = default(List<int>))
        {
            // to ensure "portfolio" is required (not null)
            if (portfolio == null) {
                throw new ArgumentNullException("portfolio is a required property for ResultToInputSecurityIndexMapping and cannot be null");
            }
            this.Portfolio = portfolio;
            this.Benchmark = benchmark;
            this.Market = market;
        }

        /// <summary>
        /// Gets or Sets Portfolio
        /// </summary>
        [DataMember(Name = "portfolio", IsRequired = true, EmitDefaultValue = false)]
        public List<int> Portfolio { get; set; }

        /// <summary>
        /// Gets or Sets Benchmark
        /// </summary>
        [DataMember(Name = "benchmark", EmitDefaultValue = false)]
        public List<int> Benchmark { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public List<int> Market { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResultToInputSecurityIndexMapping {\n");
            sb.Append("  Portfolio: ").Append(Portfolio).Append("\n");
            sb.Append("  Benchmark: ").Append(Benchmark).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
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
            return this.Equals(input as ResultToInputSecurityIndexMapping);
        }

        /// <summary>
        /// Returns true if ResultToInputSecurityIndexMapping instances are equal
        /// </summary>
        /// <param name="input">Instance of ResultToInputSecurityIndexMapping to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResultToInputSecurityIndexMapping input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Portfolio == input.Portfolio ||
                    this.Portfolio != null &&
                    input.Portfolio != null &&
                    this.Portfolio.SequenceEqual(input.Portfolio)
                ) && 
                (
                    this.Benchmark == input.Benchmark ||
                    this.Benchmark != null &&
                    input.Benchmark != null &&
                    this.Benchmark.SequenceEqual(input.Benchmark)
                ) && 
                (
                    this.Market == input.Market ||
                    this.Market != null &&
                    input.Market != null &&
                    this.Market.SequenceEqual(input.Market)
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
                if (this.Portfolio != null)
                {
                    hashCode = (hashCode * 59) + this.Portfolio.GetHashCode();
                }
                if (this.Benchmark != null)
                {
                    hashCode = (hashCode * 59) + this.Benchmark.GetHashCode();
                }
                if (this.Market != null)
                {
                    hashCode = (hashCode * 59) + this.Market.GetHashCode();
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
