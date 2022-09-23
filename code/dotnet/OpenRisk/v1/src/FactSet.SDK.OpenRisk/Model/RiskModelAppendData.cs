/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.21.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.OpenRisk.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenRisk.Model
{
    /// <summary>
    /// **(since 1.17.0)** Inline append data. This field can be used mainly for two purpose: 1) to supplement the risk model coverage when assets are not natively covered by a model, and 2) to intentionally override asset exposures and/or specific risk whenever there is misaligned view of an asset&#39;s risk profile between a model and a user.
    /// </summary>
    [DataContract(Name = "RiskModelAppendData")]
    public partial class RiskModelAppendData : IEquatable<RiskModelAppendData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskModelAppendData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RiskModelAppendData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskModelAppendData" /> class.
        /// </summary>
        /// <param name="data">List of all rows of the append data. (required).</param>
        /// <param name="fields">List of fields in append data. Must contain &#39;SYMBOL&#39;. Index location will be used in &#39;data&#39; elements as keys. The entire set of factor IDs and specific risk are not required. If any inputs of exposures or specific risk are missing, 0 will be inserted for those field. (required).</param>
        public RiskModelAppendData(List<Dictionary<string, RiskModelAppendDataValue>> data, List<string> fields)
        {
            // to ensure "data" is required (not null)
            if (data == null) {
                throw new ArgumentNullException("data is a required property for RiskModelAppendData and cannot be null");
            }
            this.Data = data;
            // to ensure "fields" is required (not null)
            if (fields == null) {
                throw new ArgumentNullException("fields is a required property for RiskModelAppendData and cannot be null");
            }
            this.Fields = fields;
        }

        /// <summary>
        /// List of all rows of the append data.
        /// </summary>
        /// <value>List of all rows of the append data.</value>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = false)]
        public List<Dictionary<string, RiskModelAppendDataValue>> Data { get; set; }

        /// <summary>
        /// List of fields in append data. Must contain &#39;SYMBOL&#39;. Index location will be used in &#39;data&#39; elements as keys. The entire set of factor IDs and specific risk are not required. If any inputs of exposures or specific risk are missing, 0 will be inserted for those field.
        /// </summary>
        /// <value>List of fields in append data. Must contain &#39;SYMBOL&#39;. Index location will be used in &#39;data&#39; elements as keys. The entire set of factor IDs and specific risk are not required. If any inputs of exposures or specific risk are missing, 0 will be inserted for those field.</value>
        [DataMember(Name = "fields", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Fields { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RiskModelAppendData {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Fields: ").Append(Fields).Append("\n");
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
            return this.Equals(input as RiskModelAppendData);
        }

        /// <summary>
        /// Returns true if RiskModelAppendData instances are equal
        /// </summary>
        /// <param name="input">Instance of RiskModelAppendData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RiskModelAppendData input)
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
                ) && 
                (
                    this.Fields == input.Fields ||
                    this.Fields != null &&
                    input.Fields != null &&
                    this.Fields.SequenceEqual(input.Fields)
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
                if (this.Fields != null)
                {
                    hashCode = (hashCode * 59) + this.Fields.GetHashCode();
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