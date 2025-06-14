/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
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
using OpenAPIDateConverter = FactSet.SDK.Cabot.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Cabot.Model
{
    /// <summary>
    /// ConstructionResponseOptions
    /// </summary>
    [DataContract(Name = "ConstructionResponseOptions")]
    public partial class ConstructionResponseOptions : IEquatable<ConstructionResponseOptions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConstructionResponseOptions" /> class.
        /// </summary>
        /// <param name="constructionValues">constructionValues.</param>
        public ConstructionResponseOptions(ConstructionModelAnalytics constructionValues = default(ConstructionModelAnalytics))
        {
            this.ConstructionValues = constructionValues;
        }

        /// <summary>
        /// Gets or Sets ConstructionValues
        /// </summary>
        [DataMember(Name = "constructionValues", EmitDefaultValue = false)]
        public ConstructionModelAnalytics ConstructionValues { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ConstructionResponseOptions {\n");
            sb.Append("  ConstructionValues: ").Append(ConstructionValues).Append("\n");
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
            return this.Equals(input as ConstructionResponseOptions);
        }

        /// <summary>
        /// Returns true if ConstructionResponseOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of ConstructionResponseOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConstructionResponseOptions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ConstructionValues == input.ConstructionValues ||
                    (this.ConstructionValues != null &&
                    this.ConstructionValues.Equals(input.ConstructionValues))
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
                if (this.ConstructionValues != null)
                {
                    hashCode = (hashCode * 59) + this.ConstructionValues.GetHashCode();
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
