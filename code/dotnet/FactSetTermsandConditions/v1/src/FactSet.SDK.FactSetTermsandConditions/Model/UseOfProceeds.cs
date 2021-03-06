/*
 * FactSet Terms & Conditions API
 *
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTermsandConditions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTermsandConditions.Model
{
    /// <summary>
    /// Use of Proceeds for a Fixed Income security.
    /// </summary>
    [DataContract(Name = "useOfProceeds")]
    public partial class UseOfProceeds : IEquatable<UseOfProceeds>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UseOfProceeds" /> class.
        /// </summary>
        /// <param name="requestId">Security identifier used in the request..</param>
        /// <param name="fsymId">FactSet Permanent Security Identifier..</param>
        /// <param name="useOfProceeds">Use of proceeds..</param>
        public UseOfProceeds(string requestId = default(string), string fsymId = default(string), string useOfProceeds = default(string))
        {
            this.RequestId = requestId;
            this.FsymId = fsymId;
            this._UseOfProceeds = useOfProceeds;
        }

        /// <summary>
        /// Security identifier used in the request.
        /// </summary>
        /// <value>Security identifier used in the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// FactSet Permanent Security Identifier.
        /// </summary>
        /// <value>FactSet Permanent Security Identifier.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// Use of proceeds.
        /// </summary>
        /// <value>Use of proceeds.</value>
        [DataMember(Name = "useOfProceeds", EmitDefaultValue = false)]
        public string _UseOfProceeds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UseOfProceeds {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  _UseOfProceeds: ").Append(_UseOfProceeds).Append("\n");
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
            return this.Equals(input as UseOfProceeds);
        }

        /// <summary>
        /// Returns true if UseOfProceeds instances are equal
        /// </summary>
        /// <param name="input">Instance of UseOfProceeds to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UseOfProceeds input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this._UseOfProceeds == input._UseOfProceeds ||
                    (this._UseOfProceeds != null &&
                    this._UseOfProceeds.Equals(input._UseOfProceeds))
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
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this._UseOfProceeds != null)
                {
                    hashCode = (hashCode * 59) + this._UseOfProceeds.GetHashCode();
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
