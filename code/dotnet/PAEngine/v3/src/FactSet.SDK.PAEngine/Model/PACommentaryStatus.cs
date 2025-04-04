/*
 * PA Engine API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
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
using OpenAPIDateConverter = FactSet.SDK.PAEngine.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PAEngine.Model
{
    /// <summary>
    /// PACommentaryStatus
    /// </summary>
    [DataContract(Name = "PACommentaryStatus")]
    public partial class PACommentaryStatus : IEquatable<PACommentaryStatus>, IValidatableObject
    {
        /// <summary>
        /// The status of commentary generation.
        /// </summary>
        /// <value>The status of commentary generation.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum Executing for value: Executing
            /// </summary>
            [EnumMember(Value = "Executing")]
            Executing = 1,

            /// <summary>
            /// Enum Success for value: Success
            /// </summary>
            [EnumMember(Value = "Success")]
            Success = 2

        }


        /// <summary>
        /// The status of commentary generation.
        /// </summary>
        /// <value>The status of commentary generation.</value>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PACommentaryStatus" /> class.
        /// </summary>
        /// <param name="result">The result url of the generated commentary..</param>
        /// <param name="calculationid">Calculation id..</param>
        /// <param name="unitid">Calculation unit id..</param>
        /// <param name="status">The status of commentary generation..</param>
        public PACommentaryStatus(string result = default(string), string calculationid = default(string), string unitid = default(string), StatusEnum? status = default(StatusEnum?))
        {
            this.Result = result;
            this.Calculationid = calculationid;
            this.Unitid = unitid;
            this.Status = status;
        }

        /// <summary>
        /// The result url of the generated commentary.
        /// </summary>
        /// <value>The result url of the generated commentary.</value>
        [DataMember(Name = "result", EmitDefaultValue = true)]
        public string Result { get; set; }

        /// <summary>
        /// Calculation id.
        /// </summary>
        /// <value>Calculation id.</value>
        [DataMember(Name = "calculationid", EmitDefaultValue = true)]
        public string Calculationid { get; set; }

        /// <summary>
        /// Calculation unit id.
        /// </summary>
        /// <value>Calculation unit id.</value>
        [DataMember(Name = "unitid", EmitDefaultValue = true)]
        public string Unitid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PACommentaryStatus {\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  Calculationid: ").Append(Calculationid).Append("\n");
            sb.Append("  Unitid: ").Append(Unitid).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return this.Equals(input as PACommentaryStatus);
        }

        /// <summary>
        /// Returns true if PACommentaryStatus instances are equal
        /// </summary>
        /// <param name="input">Instance of PACommentaryStatus to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PACommentaryStatus input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Result == input.Result ||
                    (this.Result != null &&
                    this.Result.Equals(input.Result))
                ) && 
                (
                    this.Calculationid == input.Calculationid ||
                    (this.Calculationid != null &&
                    this.Calculationid.Equals(input.Calculationid))
                ) && 
                (
                    this.Unitid == input.Unitid ||
                    (this.Unitid != null &&
                    this.Unitid.Equals(input.Unitid))
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
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
                if (this.Result != null)
                {
                    hashCode = (hashCode * 59) + this.Result.GetHashCode();
                }
                if (this.Calculationid != null)
                {
                    hashCode = (hashCode * 59) + this.Calculationid.GetHashCode();
                }
                if (this.Unitid != null)
                {
                    hashCode = (hashCode * 59) + this.Unitid.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
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
