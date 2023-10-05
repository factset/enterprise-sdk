/*
 * Investment Banking Office Refresh API
 *
 * Service for refreshing models with refreshable FactSet objects (e.g., =FDS codes)
 *
 * The version of the OpenAPI document: 0.1.0
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
using OpenAPIDateConverter = FactSet.SDK.InvestmentBankingOfficeRefresh.Client.OpenAPIDateConverter;

namespace FactSet.SDK.InvestmentBankingOfficeRefresh.Model
{
    /// <summary>
    /// Errors
    /// </summary>
    [DataContract(Name = "Errors")]
    public partial class Errors : IEquatable<Errors>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Errors" /> class.
        /// </summary>
        /// <param name="errors">errors.</param>
        public Errors(List<Error> errors = default(List<Error>))
        {
            this._Errors = errors;
        }

        /// <summary>
        /// Gets or Sets _Errors
        /// </summary>
        [DataMember(Name = "errors", EmitDefaultValue = false)]
        public List<Error> _Errors { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Errors {\n");
            sb.Append("  _Errors: ").Append(_Errors).Append("\n");
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
            return this.Equals(input as Errors);
        }

        /// <summary>
        /// Returns true if Errors instances are equal
        /// </summary>
        /// <param name="input">Instance of Errors to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Errors input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._Errors == input._Errors ||
                    this._Errors != null &&
                    input._Errors != null &&
                    this._Errors.SequenceEqual(input._Errors)
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
                if (this._Errors != null)
                {
                    hashCode = (hashCode * 59) + this._Errors.GetHashCode();
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