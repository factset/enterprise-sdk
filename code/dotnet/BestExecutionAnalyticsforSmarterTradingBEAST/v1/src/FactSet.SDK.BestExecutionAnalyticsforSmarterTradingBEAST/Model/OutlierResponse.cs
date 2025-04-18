/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 *
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
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
using OpenAPIDateConverter = FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Model
{
    /// <summary>
    /// The Outlier Response object
    /// </summary>
    [DataContract(Name = "OutlierResponse")]
    public partial class OutlierResponse : IEquatable<OutlierResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OutlierResponse" /> class.
        /// </summary>
        /// <param name="rawData">rawData.</param>
        /// <param name="winsorizedData">winsorizedData.</param>
        /// <param name="outlier">Outliers.</param>
        public OutlierResponse(OutlierData rawData = default(OutlierData), OutlierData winsorizedData = default(OutlierData), List<Outlier> outlier = default(List<Outlier>))
        {
            this.RawData = rawData;
            this.WinsorizedData = winsorizedData;
            this.Outlier = outlier;
        }

        /// <summary>
        /// Gets or Sets RawData
        /// </summary>
        [DataMember(Name = "rawData", EmitDefaultValue = false)]
        public OutlierData RawData { get; set; }

        /// <summary>
        /// Gets or Sets WinsorizedData
        /// </summary>
        [DataMember(Name = "winsorizedData", EmitDefaultValue = false)]
        public OutlierData WinsorizedData { get; set; }

        /// <summary>
        /// Outliers
        /// </summary>
        /// <value>Outliers</value>
        [DataMember(Name = "outlier", EmitDefaultValue = false)]
        public List<Outlier> Outlier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OutlierResponse {\n");
            sb.Append("  RawData: ").Append(RawData).Append("\n");
            sb.Append("  WinsorizedData: ").Append(WinsorizedData).Append("\n");
            sb.Append("  Outlier: ").Append(Outlier).Append("\n");
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
            return this.Equals(input as OutlierResponse);
        }

        /// <summary>
        /// Returns true if OutlierResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of OutlierResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OutlierResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RawData == input.RawData ||
                    (this.RawData != null &&
                    this.RawData.Equals(input.RawData))
                ) && 
                (
                    this.WinsorizedData == input.WinsorizedData ||
                    (this.WinsorizedData != null &&
                    this.WinsorizedData.Equals(input.WinsorizedData))
                ) && 
                (
                    this.Outlier == input.Outlier ||
                    this.Outlier != null &&
                    input.Outlier != null &&
                    this.Outlier.SequenceEqual(input.Outlier)
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
                if (this.RawData != null)
                {
                    hashCode = (hashCode * 59) + this.RawData.GetHashCode();
                }
                if (this.WinsorizedData != null)
                {
                    hashCode = (hashCode * 59) + this.WinsorizedData.GetHashCode();
                }
                if (this.Outlier != null)
                {
                    hashCode = (hashCode * 59) + this.Outlier.GetHashCode();
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
