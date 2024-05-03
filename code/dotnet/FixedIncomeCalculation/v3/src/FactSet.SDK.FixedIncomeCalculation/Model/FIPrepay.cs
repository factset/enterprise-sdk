/*
 * FI API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.0
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
using OpenAPIDateConverter = FactSet.SDK.FixedIncomeCalculation.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FixedIncomeCalculation.Model
{
    /// <summary>
    /// FIPrepay
    /// </summary>
    [DataContract(Name = "FIPrepay")]
    public partial class FIPrepay : IEquatable<FIPrepay>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FIPrepay" /> class.
        /// </summary>
        /// <param name="prepayName">Prepay Name.</param>
        public FIPrepay(string prepayName = default(string))
        {
            this.PrepayName = prepayName;
        }

        /// <summary>
        /// Prepay Name
        /// </summary>
        /// <value>Prepay Name</value>
        [DataMember(Name = "prepayName", EmitDefaultValue = true)]
        public string PrepayName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FIPrepay {\n");
            sb.Append("  PrepayName: ").Append(PrepayName).Append("\n");
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
            return this.Equals(input as FIPrepay);
        }

        /// <summary>
        /// Returns true if FIPrepay instances are equal
        /// </summary>
        /// <param name="input">Instance of FIPrepay to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FIPrepay input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PrepayName == input.PrepayName ||
                    (this.PrepayName != null &&
                    this.PrepayName.Equals(input.PrepayName))
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
                if (this.PrepayName != null)
                {
                    hashCode = (hashCode * 59) + this.PrepayName.GetHashCode();
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
