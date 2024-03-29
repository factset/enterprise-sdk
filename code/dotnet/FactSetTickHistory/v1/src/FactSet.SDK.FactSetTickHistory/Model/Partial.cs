/*
 * TickHistory
 *
 * TickHistory provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTickHistory.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTickHistory.Model
{
    /// <summary>
    /// If the value is true, it indicates additional results are available. False represents that this is the last set of results for this request.
    /// </summary>
    [DataContract(Name = "partial")]
    public partial class Partial : IEquatable<Partial>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Partial" /> class.
        /// </summary>
        /// <param name="isPartial">isPartial.</param>
        public Partial(bool isPartial = default(bool))
        {
            this.IsPartial = isPartial;
        }

        /// <summary>
        /// Gets or Sets IsPartial
        /// </summary>
        [DataMember(Name = "isPartial", EmitDefaultValue = true)]
        public bool IsPartial { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Partial {\n");
            sb.Append("  IsPartial: ").Append(IsPartial).Append("\n");
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
            return this.Equals(input as Partial);
        }

        /// <summary>
        /// Returns true if Partial instances are equal
        /// </summary>
        /// <param name="input">Instance of Partial to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Partial input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IsPartial == input.IsPartial ||
                    this.IsPartial.Equals(input.IsPartial)
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
                hashCode = (hashCode * 59) + this.IsPartial.GetHashCode();
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
