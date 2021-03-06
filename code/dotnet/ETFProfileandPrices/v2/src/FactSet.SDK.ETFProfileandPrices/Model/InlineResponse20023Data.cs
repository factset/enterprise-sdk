/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.ETFProfileandPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ETFProfileandPrices.Model
{
    /// <summary>
    /// InlineResponse20023Data
    /// </summary>
    [DataContract(Name = "inline_response_200_23_data")]
    public partial class InlineResponse20023Data : IEquatable<InlineResponse20023Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20023Data" /> class.
        /// </summary>
        /// <param name="navDate">Growth of the 10k calculation date.</param>
        /// <param name="tenkValue">Growth of the 10k calculation value..</param>
        /// <param name="tenkPercentChange">Growth of the 10k calculation percent change..</param>
        public InlineResponse20023Data(DateTime navDate = default(DateTime), decimal tenkValue = default(decimal), decimal tenkPercentChange = default(decimal))
        {
            this.NavDate = navDate;
            this.TenkValue = tenkValue;
            this.TenkPercentChange = tenkPercentChange;
        }

        /// <summary>
        /// Growth of the 10k calculation date
        /// </summary>
        /// <value>Growth of the 10k calculation date</value>
        [DataMember(Name = "navDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime NavDate { get; set; }

        /// <summary>
        /// Growth of the 10k calculation value.
        /// </summary>
        /// <value>Growth of the 10k calculation value.</value>
        [DataMember(Name = "tenkValue", EmitDefaultValue = false)]
        public decimal TenkValue { get; set; }

        /// <summary>
        /// Growth of the 10k calculation percent change.
        /// </summary>
        /// <value>Growth of the 10k calculation percent change.</value>
        [DataMember(Name = "tenkPercentChange", EmitDefaultValue = false)]
        public decimal TenkPercentChange { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20023Data {\n");
            sb.Append("  NavDate: ").Append(NavDate).Append("\n");
            sb.Append("  TenkValue: ").Append(TenkValue).Append("\n");
            sb.Append("  TenkPercentChange: ").Append(TenkPercentChange).Append("\n");
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
            return this.Equals(input as InlineResponse20023Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20023Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20023Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20023Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NavDate == input.NavDate ||
                    (this.NavDate != null &&
                    this.NavDate.Equals(input.NavDate))
                ) && 
                (
                    this.TenkValue == input.TenkValue ||
                    this.TenkValue.Equals(input.TenkValue)
                ) && 
                (
                    this.TenkPercentChange == input.TenkPercentChange ||
                    this.TenkPercentChange.Equals(input.TenkPercentChange)
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
                if (this.NavDate != null)
                {
                    hashCode = (hashCode * 59) + this.NavDate.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TenkValue.GetHashCode();
                hashCode = (hashCode * 59) + this.TenkPercentChange.GetHashCode();
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
