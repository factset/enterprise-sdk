/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// NSIN data of the notation.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_nsin")]
    public partial class InlineResponse2004Nsin : IEquatable<InlineResponse2004Nsin>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004Nsin" /> class.
        /// </summary>
        /// <param name="sedol">The SEDOL or IDII for the notation..</param>
        public InlineResponse2004Nsin(string sedol = default(string))
        {
            this.Sedol = sedol;
        }

        /// <summary>
        /// The SEDOL or IDII for the notation.
        /// </summary>
        /// <value>The SEDOL or IDII for the notation.</value>
        [DataMember(Name = "sedol", EmitDefaultValue = false)]
        public string Sedol { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004Nsin {\n");
            sb.Append("  Sedol: ").Append(Sedol).Append("\n");
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
            return this.Equals(input as InlineResponse2004Nsin);
        }

        /// <summary>
        /// Returns true if InlineResponse2004Nsin instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004Nsin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004Nsin input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sedol == input.Sedol ||
                    (this.Sedol != null &&
                    this.Sedol.Equals(input.Sedol))
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
                if (this.Sedol != null)
                {
                    hashCode = (hashCode * 59) + this.Sedol.GetHashCode();
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
