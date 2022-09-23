/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.21.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
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
    /// This output representation is for compressed sparse row matrix.
    /// </summary>
    [DataContract(Name = "StatResultValueSparseMatrix")]
    public partial class StatResultValueSparseMatrix : IEquatable<StatResultValueSparseMatrix>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StatResultValueSparseMatrix" /> class.
        /// </summary>
        /// <param name="rows">rows.</param>
        /// <param name="columns">columns.</param>
        /// <param name="indexPointer">indexPointer.</param>
        /// <param name="indices">indices.</param>
        /// <param name="value">value.</param>
        public StatResultValueSparseMatrix(int rows = default(int), int columns = default(int), List<int> indexPointer = default(List<int>), List<int> indices = default(List<int>), List<double?> value = default(List<double?>))
        {
            this.Rows = rows;
            this.Columns = columns;
            this.IndexPointer = indexPointer;
            this.Indices = indices;
            this.Value = value;
        }

        /// <summary>
        /// Gets or Sets Rows
        /// </summary>
        [DataMember(Name = "rows", EmitDefaultValue = false)]
        public int Rows { get; set; }

        /// <summary>
        /// Gets or Sets Columns
        /// </summary>
        [DataMember(Name = "columns", EmitDefaultValue = false)]
        public int Columns { get; set; }

        /// <summary>
        /// Gets or Sets IndexPointer
        /// </summary>
        [DataMember(Name = "indexPointer", EmitDefaultValue = false)]
        public List<int> IndexPointer { get; set; }

        /// <summary>
        /// Gets or Sets Indices
        /// </summary>
        [DataMember(Name = "indices", EmitDefaultValue = false)]
        public List<int> Indices { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public List<double?> Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StatResultValueSparseMatrix {\n");
            sb.Append("  Rows: ").Append(Rows).Append("\n");
            sb.Append("  Columns: ").Append(Columns).Append("\n");
            sb.Append("  IndexPointer: ").Append(IndexPointer).Append("\n");
            sb.Append("  Indices: ").Append(Indices).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as StatResultValueSparseMatrix);
        }

        /// <summary>
        /// Returns true if StatResultValueSparseMatrix instances are equal
        /// </summary>
        /// <param name="input">Instance of StatResultValueSparseMatrix to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatResultValueSparseMatrix input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Rows == input.Rows ||
                    this.Rows.Equals(input.Rows)
                ) && 
                (
                    this.Columns == input.Columns ||
                    this.Columns.Equals(input.Columns)
                ) && 
                (
                    this.IndexPointer == input.IndexPointer ||
                    this.IndexPointer != null &&
                    input.IndexPointer != null &&
                    this.IndexPointer.SequenceEqual(input.IndexPointer)
                ) && 
                (
                    this.Indices == input.Indices ||
                    this.Indices != null &&
                    input.Indices != null &&
                    this.Indices.SequenceEqual(input.Indices)
                ) && 
                (
                    this.Value == input.Value ||
                    this.Value != null &&
                    input.Value != null &&
                    this.Value.SequenceEqual(input.Value)
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
                hashCode = (hashCode * 59) + this.Rows.GetHashCode();
                hashCode = (hashCode * 59) + this.Columns.GetHashCode();
                if (this.IndexPointer != null)
                {
                    hashCode = (hashCode * 59) + this.IndexPointer.GetHashCode();
                }
                if (this.Indices != null)
                {
                    hashCode = (hashCode * 59) + this.Indices.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
            // Rows (int) minimum
            if (this.Rows < (int)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Rows, must be a value greater than or equal to 1.", new [] { "Rows" });
            }

            // Columns (int) minimum
            if (this.Columns < (int)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Columns, must be a value greater than or equal to 1.", new [] { "Columns" });
            }

            yield break;
        }
    }

}