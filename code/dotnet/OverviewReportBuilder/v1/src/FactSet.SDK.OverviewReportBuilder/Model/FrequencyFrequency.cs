/*
 * FactSet Overview Report Builder API
 *
 * Get relevant industry-specific data for high level analysis of public and private companies
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
using OpenAPIDateConverter = FactSet.SDK.OverviewReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OverviewReportBuilder.Model
{
    /// <summary>
    /// String with frequency of a data series. Allowed values: - \&quot;D\&quot; (daily) - \&quot;W\&quot; (weekly) - \&quot;AW\&quot; (actual weekly) - \&quot;M\&quot; (monthly) - \&quot;AM\&quot; (actual monthly) - \&quot;Q\&quot; (quarterly) - \&quot;FQ\&quot; (fiscal quarterly) - \&quot;CQ\&quot; (calendar quarterly) - \&quot;AQ\&quot; (actual quarterly) - \&quot;Y\&quot; (yearly) - \&quot;FY\&quot; (fiscal yearly) - \&quot;CY\&quot; (calendar yearly) - \&quot;AY\&quot; (actual yearly) - \&quot;MTD\&quot; (month-to-date) - \&quot;QTD\&quot; (quarter-to-date) - \&quot;YTD\&quot; (year-to-date) - \&quot;FYTD\&quot; (fiscal-year-to-date) - \&quot;CYTD\&quot; (calendar-year-to-date) 
    /// </summary>
    [DataContract(Name = "frequency_frequency")]
    public partial class FrequencyFrequency : IEquatable<FrequencyFrequency>, IValidatableObject
    {
        /// <summary>
        /// Defines Value
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ValueEnum
        {
            /// <summary>
            /// Enum D for value: D
            /// </summary>
            [EnumMember(Value = "D")]
            D = 1,

            /// <summary>
            /// Enum W for value: W
            /// </summary>
            [EnumMember(Value = "W")]
            W = 2,

            /// <summary>
            /// Enum AW for value: AW
            /// </summary>
            [EnumMember(Value = "AW")]
            AW = 3,

            /// <summary>
            /// Enum M for value: M
            /// </summary>
            [EnumMember(Value = "M")]
            M = 4,

            /// <summary>
            /// Enum AM for value: AM
            /// </summary>
            [EnumMember(Value = "AM")]
            AM = 5,

            /// <summary>
            /// Enum Q for value: Q
            /// </summary>
            [EnumMember(Value = "Q")]
            Q = 6,

            /// <summary>
            /// Enum FQ for value: FQ
            /// </summary>
            [EnumMember(Value = "FQ")]
            FQ = 7,

            /// <summary>
            /// Enum CQ for value: CQ
            /// </summary>
            [EnumMember(Value = "CQ")]
            CQ = 8,

            /// <summary>
            /// Enum AQ for value: AQ
            /// </summary>
            [EnumMember(Value = "AQ")]
            AQ = 9,

            /// <summary>
            /// Enum Y for value: Y
            /// </summary>
            [EnumMember(Value = "Y")]
            Y = 10,

            /// <summary>
            /// Enum FY for value: FY
            /// </summary>
            [EnumMember(Value = "FY")]
            FY = 11,

            /// <summary>
            /// Enum CY for value: CY
            /// </summary>
            [EnumMember(Value = "CY")]
            CY = 12,

            /// <summary>
            /// Enum AY for value: AY
            /// </summary>
            [EnumMember(Value = "AY")]
            AY = 13,

            /// <summary>
            /// Enum MTD for value: MTD
            /// </summary>
            [EnumMember(Value = "MTD")]
            MTD = 14,

            /// <summary>
            /// Enum QTD for value: QTD
            /// </summary>
            [EnumMember(Value = "QTD")]
            QTD = 15,

            /// <summary>
            /// Enum YTD for value: YTD
            /// </summary>
            [EnumMember(Value = "YTD")]
            YTD = 16,

            /// <summary>
            /// Enum FYTD for value: FYTD
            /// </summary>
            [EnumMember(Value = "FYTD")]
            FYTD = 17,

            /// <summary>
            /// Enum CYTD for value: CYTD
            /// </summary>
            [EnumMember(Value = "CYTD")]
            CYTD = 18

        }


        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public ValueEnum? Value { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FrequencyFrequency" /> class.
        /// </summary>
        /// <param name="value">value.</param>
        public FrequencyFrequency(ValueEnum? value = default(ValueEnum?))
        {
            this.Value = value;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FrequencyFrequency {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as FrequencyFrequency);
        }

        /// <summary>
        /// Returns true if FrequencyFrequency instances are equal
        /// </summary>
        /// <param name="input">Instance of FrequencyFrequency to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FrequencyFrequency input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    this.Value.Equals(input.Value)
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
                hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
