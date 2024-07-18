/*
 * FI API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.0
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
    /// FIPrepayLockout
    /// </summary>
    [DataContract(Name = "FIPrepayLockout")]
    public partial class FIPrepayLockout : IEquatable<FIPrepayLockout>, IValidatableObject
    {
        /// <summary>
        /// Points Above
        /// </summary>
        /// <value>Points Above</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PointsAboveEnum
        {
            /// <summary>
            /// Enum ANY for value: ANY
            /// </summary>
            [EnumMember(Value = "ANY")]
            ANY = 1,

            /// <summary>
            /// Enum NOLOCKOUT for value: NO_LOCKOUT
            /// </summary>
            [EnumMember(Value = "NO_LOCKOUT")]
            NOLOCKOUT = 2,

            /// <summary>
            /// Enum NUMERIC for value: NUMERIC
            /// </summary>
            [EnumMember(Value = "NUMERIC")]
            NUMERIC = 3

        }


        /// <summary>
        /// Points Above
        /// </summary>
        /// <value>Points Above</value>
        [DataMember(Name = "pointsAbove", EmitDefaultValue = false)]
        public PointsAboveEnum? PointsAbove { get; set; }
        /// <summary>
        /// Ym Above
        /// </summary>
        /// <value>Ym Above</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum YmAboveEnum
        {
            /// <summary>
            /// Enum ANY for value: ANY
            /// </summary>
            [EnumMember(Value = "ANY")]
            ANY = 1,

            /// <summary>
            /// Enum NOLOCKOUT for value: NO_LOCKOUT
            /// </summary>
            [EnumMember(Value = "NO_LOCKOUT")]
            NOLOCKOUT = 2,

            /// <summary>
            /// Enum NUMERIC for value: NUMERIC
            /// </summary>
            [EnumMember(Value = "NUMERIC")]
            NUMERIC = 3

        }


        /// <summary>
        /// Ym Above
        /// </summary>
        /// <value>Ym Above</value>
        [DataMember(Name = "ymAbove", EmitDefaultValue = false)]
        public YmAboveEnum? YmAbove { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FIPrepayLockout" /> class.
        /// </summary>
        /// <param name="pointsAbove">Points Above.</param>
        /// <param name="ymAbove">Ym Above.</param>
        public FIPrepayLockout(PointsAboveEnum? pointsAbove = default(PointsAboveEnum?), YmAboveEnum? ymAbove = default(YmAboveEnum?))
        {
            this.PointsAbove = pointsAbove;
            this.YmAbove = ymAbove;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FIPrepayLockout {\n");
            sb.Append("  PointsAbove: ").Append(PointsAbove).Append("\n");
            sb.Append("  YmAbove: ").Append(YmAbove).Append("\n");
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
            return this.Equals(input as FIPrepayLockout);
        }

        /// <summary>
        /// Returns true if FIPrepayLockout instances are equal
        /// </summary>
        /// <param name="input">Instance of FIPrepayLockout to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FIPrepayLockout input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PointsAbove == input.PointsAbove ||
                    this.PointsAbove.Equals(input.PointsAbove)
                ) && 
                (
                    this.YmAbove == input.YmAbove ||
                    this.YmAbove.Equals(input.YmAbove)
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
                hashCode = (hashCode * 59) + this.PointsAbove.GetHashCode();
                hashCode = (hashCode * 59) + this.YmAbove.GetHashCode();
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
