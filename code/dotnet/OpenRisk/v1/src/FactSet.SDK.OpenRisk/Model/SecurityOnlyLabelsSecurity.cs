/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
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
    /// Security IDs
    /// </summary>
    [DataContract(Name = "SecurityOnlyLabels_security")]
    public partial class SecurityOnlyLabelsSecurity : IEquatable<SecurityOnlyLabelsSecurity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityOnlyLabelsSecurity" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SecurityOnlyLabelsSecurity() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityOnlyLabelsSecurity" /> class.
        /// </summary>
        /// <param name="ids">Security IDs aligned to the calculated output. Often this will merge the individual holdings arrays into a single array. (required).</param>
        /// <param name="indicesInputToResult">indicesInputToResult.</param>
        /// <param name="indicesResultToInput">indicesResultToInput.</param>
        public SecurityOnlyLabelsSecurity(List<string> ids,InputToResultSecurityIndexMapping indicesInputToResult = default(InputToResultSecurityIndexMapping), ResultToInputSecurityIndexMapping indicesResultToInput = default(ResultToInputSecurityIndexMapping))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for SecurityOnlyLabelsSecurity and cannot be null");
            }
            this.Ids = ids;
            this.IndicesInputToResult = indicesInputToResult;
            this.IndicesResultToInput = indicesResultToInput;
        }

        /// <summary>
        /// Security IDs aligned to the calculated output. Often this will merge the individual holdings arrays into a single array.
        /// </summary>
        /// <value>Security IDs aligned to the calculated output. Often this will merge the individual holdings arrays into a single array.</value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Gets or Sets IndicesInputToResult
        /// </summary>
        [DataMember(Name = "indicesInputToResult", EmitDefaultValue = false)]
        public InputToResultSecurityIndexMapping IndicesInputToResult { get; set; }

        /// <summary>
        /// Gets or Sets IndicesResultToInput
        /// </summary>
        [DataMember(Name = "indicesResultToInput", EmitDefaultValue = false)]
        public ResultToInputSecurityIndexMapping IndicesResultToInput { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SecurityOnlyLabelsSecurity {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  IndicesInputToResult: ").Append(IndicesInputToResult).Append("\n");
            sb.Append("  IndicesResultToInput: ").Append(IndicesResultToInput).Append("\n");
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
            return this.Equals(input as SecurityOnlyLabelsSecurity);
        }

        /// <summary>
        /// Returns true if SecurityOnlyLabelsSecurity instances are equal
        /// </summary>
        /// <param name="input">Instance of SecurityOnlyLabelsSecurity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecurityOnlyLabelsSecurity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.IndicesInputToResult == input.IndicesInputToResult ||
                    (this.IndicesInputToResult != null &&
                    this.IndicesInputToResult.Equals(input.IndicesInputToResult))
                ) && 
                (
                    this.IndicesResultToInput == input.IndicesResultToInput ||
                    (this.IndicesResultToInput != null &&
                    this.IndicesResultToInput.Equals(input.IndicesResultToInput))
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
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
                }
                if (this.IndicesInputToResult != null)
                {
                    hashCode = (hashCode * 59) + this.IndicesInputToResult.GetHashCode();
                }
                if (this.IndicesResultToInput != null)
                {
                    hashCode = (hashCode * 59) + this.IndicesResultToInput.GetHashCode();
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
