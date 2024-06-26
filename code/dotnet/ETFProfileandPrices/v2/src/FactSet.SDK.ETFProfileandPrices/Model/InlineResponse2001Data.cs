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
    /// ETP asset allocation data.
    /// </summary>
    [DataContract(Name = "inline_response_200_1_data")]
    public partial class InlineResponse2001Data : IEquatable<InlineResponse2001Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001Data" /> class.
        /// </summary>
        /// <param name="reportDate">Reporting date for the allocations..</param>
        /// <param name="assets">List of allocations by asset class..</param>
        public InlineResponse2001Data(DateTime reportDate = default(DateTime), HashSet<InlineResponse2001DataAssets> assets = default(HashSet<InlineResponse2001DataAssets>))
        {
            this.ReportDate = reportDate;
            this.Assets = assets;
        }

        /// <summary>
        /// Reporting date for the allocations.
        /// </summary>
        /// <value>Reporting date for the allocations.</value>
        [DataMember(Name = "reportDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime ReportDate { get; set; }

        /// <summary>
        /// List of allocations by asset class.
        /// </summary>
        /// <value>List of allocations by asset class.</value>
        [DataMember(Name = "assets", EmitDefaultValue = false)]
        public HashSet<InlineResponse2001DataAssets> Assets { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2001Data {\n");
            sb.Append("  ReportDate: ").Append(ReportDate).Append("\n");
            sb.Append("  Assets: ").Append(Assets).Append("\n");
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
            return this.Equals(input as InlineResponse2001Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2001Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2001Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ReportDate == input.ReportDate ||
                    (this.ReportDate != null &&
                    this.ReportDate.Equals(input.ReportDate))
                ) && 
                (
                    this.Assets == input.Assets ||
                    this.Assets != null &&
                    input.Assets != null &&
                    this.Assets.SequenceEqual(input.Assets)
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
                if (this.ReportDate != null)
                {
                    hashCode = (hashCode * 59) + this.ReportDate.GetHashCode();
                }
                if (this.Assets != null)
                {
                    hashCode = (hashCode * 59) + this.Assets.GetHashCode();
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
