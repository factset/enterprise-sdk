/*
 * FactSet Benchmarks API
 *
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.10.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetBenchmarks.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetBenchmarks.Model
{
    /// <summary>
    /// FixedIncomeBenchmarkConstituentsResponse
    /// </summary>
    [DataContract(Name = "fixedIncomeBenchmarkConstituentsResponse")]
    public partial class FixedIncomeBenchmarkConstituentsResponse : IEquatable<FixedIncomeBenchmarkConstituentsResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FixedIncomeBenchmarkConstituentsResponse" /> class.
        /// </summary>
        /// <param name="data">Array of metric objects representing the metrics that can be requested from the estimates APIs. .</param>
        public FixedIncomeBenchmarkConstituentsResponse(List<FixedIncomeBenchmarkConstituent> data = default(List<FixedIncomeBenchmarkConstituent>))
        {
            this.Data = data;
        }

        /// <summary>
        /// Array of metric objects representing the metrics that can be requested from the estimates APIs. 
        /// </summary>
        /// <value>Array of metric objects representing the metrics that can be requested from the estimates APIs. </value>
        [DataMember(Name = "data", EmitDefaultValue = false)]
        public List<FixedIncomeBenchmarkConstituent> Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FixedIncomeBenchmarkConstituentsResponse {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as FixedIncomeBenchmarkConstituentsResponse);
        }

        /// <summary>
        /// Returns true if FixedIncomeBenchmarkConstituentsResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of FixedIncomeBenchmarkConstituentsResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FixedIncomeBenchmarkConstituentsResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Data == input.Data ||
                    this.Data != null &&
                    input.Data != null &&
                    this.Data.SequenceEqual(input.Data)
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
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
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
