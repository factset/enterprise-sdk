/*
 * FactSet Capital Structure Report Builder API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.CapitalStructureReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.CapitalStructureReportBuilder.Model
{
    /// <summary>
    /// InterimMatDateChg
    /// </summary>
    [DataContract(Name = "interimMatDateChg")]
    public partial class InterimMatDateChg : IEquatable<InterimMatDateChg>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InterimMatDateChg" /> class.
        /// </summary>
        /// <param name="interimMatDateChg">interimMatDateChg.</param>
        public InterimMatDateChg(InterimMatDateChgInterimMatDateChg interimMatDateChg = default(InterimMatDateChgInterimMatDateChg))
        {
            this._InterimMatDateChg = interimMatDateChg;
        }

        /// <summary>
        /// Gets or Sets _InterimMatDateChg
        /// </summary>
        [DataMember(Name = "interimMatDateChg", EmitDefaultValue = false)]
        public InterimMatDateChgInterimMatDateChg _InterimMatDateChg { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InterimMatDateChg {\n");
            sb.Append("  _InterimMatDateChg: ").Append(_InterimMatDateChg).Append("\n");
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
            return this.Equals(input as InterimMatDateChg);
        }

        /// <summary>
        /// Returns true if InterimMatDateChg instances are equal
        /// </summary>
        /// <param name="input">Instance of InterimMatDateChg to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InterimMatDateChg input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._InterimMatDateChg == input._InterimMatDateChg ||
                    (this._InterimMatDateChg != null &&
                    this._InterimMatDateChg.Equals(input._InterimMatDateChg))
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
                if (this._InterimMatDateChg != null)
                {
                    hashCode = (hashCode * 59) + this._InterimMatDateChg.GetHashCode();
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
