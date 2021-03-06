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
    /// InterimCpnChg
    /// </summary>
    [DataContract(Name = "interimCpnChg")]
    public partial class InterimCpnChg : IEquatable<InterimCpnChg>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InterimCpnChg" /> class.
        /// </summary>
        /// <param name="interimCpnChg">interimCpnChg.</param>
        public InterimCpnChg(InterimCpnChgInterimCpnChg interimCpnChg = default(InterimCpnChgInterimCpnChg))
        {
            this._InterimCpnChg = interimCpnChg;
        }

        /// <summary>
        /// Gets or Sets _InterimCpnChg
        /// </summary>
        [DataMember(Name = "interimCpnChg", EmitDefaultValue = false)]
        public InterimCpnChgInterimCpnChg _InterimCpnChg { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InterimCpnChg {\n");
            sb.Append("  _InterimCpnChg: ").Append(_InterimCpnChg).Append("\n");
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
            return this.Equals(input as InterimCpnChg);
        }

        /// <summary>
        /// Returns true if InterimCpnChg instances are equal
        /// </summary>
        /// <param name="input">Instance of InterimCpnChg to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InterimCpnChg input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._InterimCpnChg == input._InterimCpnChg ||
                    (this._InterimCpnChg != null &&
                    this._InterimCpnChg.Equals(input._InterimCpnChg))
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
                if (this._InterimCpnChg != null)
                {
                    hashCode = (hashCode * 59) + this._InterimCpnChg.GetHashCode();
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
