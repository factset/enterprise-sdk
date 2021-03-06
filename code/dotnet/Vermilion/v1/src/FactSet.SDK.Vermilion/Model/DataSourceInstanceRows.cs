/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.Vermilion.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Vermilion.Model
{
    /// <summary>
    /// DataSourceInstanceRows
    /// </summary>
    [DataContract(Name = "DataSourceInstanceRows")]
    public partial class DataSourceInstanceRows : IEquatable<DataSourceInstanceRows>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DataSourceInstanceRows" /> class.
        /// </summary>
        /// <param name="rowId">rowId.</param>
        /// <param name="rowOrder">rowOrder.</param>
        /// <param name="fields">fields.</param>
        public DataSourceInstanceRows(int rowId = default(int), int rowOrder = default(int), RecordSetFieldValues fields = default(RecordSetFieldValues))
        {
            this.RowId = rowId;
            this.RowOrder = rowOrder;
            this.Fields = fields;
        }

        /// <summary>
        /// Gets or Sets RowId
        /// </summary>
        [DataMember(Name = "rowId", EmitDefaultValue = false)]
        public int RowId { get; set; }

        /// <summary>
        /// Gets or Sets RowOrder
        /// </summary>
        [DataMember(Name = "rowOrder", EmitDefaultValue = false)]
        public int RowOrder { get; set; }

        /// <summary>
        /// Gets or Sets Fields
        /// </summary>
        [DataMember(Name = "fields", EmitDefaultValue = false)]
        public RecordSetFieldValues Fields { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DataSourceInstanceRows {\n");
            sb.Append("  RowId: ").Append(RowId).Append("\n");
            sb.Append("  RowOrder: ").Append(RowOrder).Append("\n");
            sb.Append("  Fields: ").Append(Fields).Append("\n");
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
            return this.Equals(input as DataSourceInstanceRows);
        }

        /// <summary>
        /// Returns true if DataSourceInstanceRows instances are equal
        /// </summary>
        /// <param name="input">Instance of DataSourceInstanceRows to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DataSourceInstanceRows input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RowId == input.RowId ||
                    this.RowId.Equals(input.RowId)
                ) && 
                (
                    this.RowOrder == input.RowOrder ||
                    this.RowOrder.Equals(input.RowOrder)
                ) && 
                (
                    this.Fields == input.Fields ||
                    (this.Fields != null &&
                    this.Fields.Equals(input.Fields))
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
                hashCode = (hashCode * 59) + this.RowId.GetHashCode();
                hashCode = (hashCode * 59) + this.RowOrder.GetHashCode();
                if (this.Fields != null)
                {
                    hashCode = (hashCode * 59) + this.Fields.GetHashCode();
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
