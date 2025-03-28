/*
 * FactSet Search Answers API
 *
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
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
using OpenAPIDateConverter = FactSet.SDK.FactSetSearchAnswers.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetSearchAnswers.Model
{
    /// <summary>
    /// RankedTable
    /// </summary>
    [DataContract(Name = "RankedTable")]
    public partial class RankedTable : IEquatable<RankedTable>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RankedTable" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RankedTable() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RankedTable" /> class.
        /// </summary>
        /// <param name="headers">headers.</param>
        /// <param name="rows">rows (required).</param>
        public RankedTable(List<RankedTableRow> rows,List<string> headers = default(List<string>))
        {
            // to ensure "rows" is required (not null)
            if (rows == null) {
                throw new ArgumentNullException("rows is a required property for RankedTable and cannot be null");
            }
            this.Rows = rows;
            this.Headers = headers;
        }

        /// <summary>
        /// Gets or Sets Headers
        /// </summary>
        [DataMember(Name = "headers", EmitDefaultValue = false)]
        public List<string> Headers { get; set; }

        /// <summary>
        /// Gets or Sets Rows
        /// </summary>
        [DataMember(Name = "rows", IsRequired = true, EmitDefaultValue = false)]
        public List<RankedTableRow> Rows { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RankedTable {\n");
            sb.Append("  Headers: ").Append(Headers).Append("\n");
            sb.Append("  Rows: ").Append(Rows).Append("\n");
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
            return this.Equals(input as RankedTable);
        }

        /// <summary>
        /// Returns true if RankedTable instances are equal
        /// </summary>
        /// <param name="input">Instance of RankedTable to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RankedTable input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Headers == input.Headers ||
                    this.Headers != null &&
                    input.Headers != null &&
                    this.Headers.SequenceEqual(input.Headers)
                ) && 
                (
                    this.Rows == input.Rows ||
                    this.Rows != null &&
                    input.Rows != null &&
                    this.Rows.SequenceEqual(input.Rows)
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
                if (this.Headers != null)
                {
                    hashCode = (hashCode * 59) + this.Headers.GetHashCode();
                }
                if (this.Rows != null)
                {
                    hashCode = (hashCode * 59) + this.Rows.GetHashCode();
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
