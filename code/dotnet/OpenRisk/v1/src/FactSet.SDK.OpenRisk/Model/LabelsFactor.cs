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
    /// Labels relevant to calculation-levels with &#39;Factor&#39; in the name
    /// </summary>
    [DataContract(Name = "Labels_factor")]
    public partial class LabelsFactor : IEquatable<LabelsFactor>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LabelsFactor" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LabelsFactor() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LabelsFactor" /> class.
        /// </summary>
        /// <param name="ids">ids (required).</param>
        /// <param name="names">names (required).</param>
        public LabelsFactor(List<string> ids, List<string> names)
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for LabelsFactor and cannot be null");
            }
            this.Ids = ids;
            // to ensure "names" is required (not null)
            if (names == null) {
                throw new ArgumentNullException("names is a required property for LabelsFactor and cannot be null");
            }
            this.Names = names;
        }

        /// <summary>
        /// Gets or Sets Ids
        /// </summary>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Gets or Sets Names
        /// </summary>
        [DataMember(Name = "names", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Names { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LabelsFactor {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Names: ").Append(Names).Append("\n");
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
            return this.Equals(input as LabelsFactor);
        }

        /// <summary>
        /// Returns true if LabelsFactor instances are equal
        /// </summary>
        /// <param name="input">Instance of LabelsFactor to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LabelsFactor input)
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
                    this.Names == input.Names ||
                    this.Names != null &&
                    input.Names != null &&
                    this.Names.SequenceEqual(input.Names)
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
                if (this.Names != null)
                {
                    hashCode = (hashCode * 59) + this.Names.GetHashCode();
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