/*
 * FactSet Funds API
 *
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.2.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFunds.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFunds.Model
{
    /// <summary>
    /// ClassificationsResponse
    /// </summary>
    [DataContract(Name = "classificationsResponse")]
    public partial class ClassificationsResponse : IEquatable<ClassificationsResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClassificationsResponse" /> class.
        /// </summary>
        /// <param name="data">Array of Classifications Objects.</param>
        public ClassificationsResponse(List<Classifications> data = default(List<Classifications>))
        {
            this.Data = data;
        }

        /// <summary>
        /// Array of Classifications Objects
        /// </summary>
        /// <value>Array of Classifications Objects</value>
        [DataMember(Name = "data", EmitDefaultValue = false)]
        public List<Classifications> Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ClassificationsResponse {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as ClassificationsResponse);
        }

        /// <summary>
        /// Returns true if ClassificationsResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of ClassificationsResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClassificationsResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Data == input.Data ||
                    this.Data != null &&
                    input.Data != null &&
                    this.Data.SequenceEqual(input.Data)
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
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
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
