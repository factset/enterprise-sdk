/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 *
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
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
    /// Volume Time data
    /// </summary>
    [DataContract(Name = "VolumeTime")]
    public partial class VolumeTime : IEquatable<VolumeTime>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VolumeTime" /> class.
        /// </summary>
        /// <param name="binTime">The time in UTC of the start of the bin. Each bin has a duration of 5 minutes.</param>
        /// <param name="fillsVolumePct">Fills Volume Percentage.</param>
        /// <param name="tradesVolumePct">Trades Volume Percentage.</param>
        public VolumeTime(long binTime = default(long), double fillsVolumePct = default(double), double tradesVolumePct = default(double))
        {
            this.BinTime = binTime;
            this.FillsVolumePct = fillsVolumePct;
            this.TradesVolumePct = tradesVolumePct;
        }

        /// <summary>
        /// The time in UTC of the start of the bin. Each bin has a duration of 5 minutes
        /// </summary>
        /// <value>The time in UTC of the start of the bin. Each bin has a duration of 5 minutes</value>
        [DataMember(Name = "binTime", EmitDefaultValue = false)]
        public long BinTime { get; set; }

        /// <summary>
        /// Fills Volume Percentage
        /// </summary>
        /// <value>Fills Volume Percentage</value>
        [DataMember(Name = "fillsVolumePct", EmitDefaultValue = false)]
        public double FillsVolumePct { get; set; }

        /// <summary>
        /// Trades Volume Percentage
        /// </summary>
        /// <value>Trades Volume Percentage</value>
        [DataMember(Name = "tradesVolumePct", EmitDefaultValue = false)]
        public double TradesVolumePct { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VolumeTime {\n");
            sb.Append("  BinTime: ").Append(BinTime).Append("\n");
            sb.Append("  FillsVolumePct: ").Append(FillsVolumePct).Append("\n");
            sb.Append("  TradesVolumePct: ").Append(TradesVolumePct).Append("\n");
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
            return this.Equals(input as VolumeTime);
        }

        /// <summary>
        /// Returns true if VolumeTime instances are equal
        /// </summary>
        /// <param name="input">Instance of VolumeTime to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VolumeTime input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BinTime == input.BinTime ||
                    this.BinTime.Equals(input.BinTime)
                ) && 
                (
                    this.FillsVolumePct == input.FillsVolumePct ||
                    this.FillsVolumePct.Equals(input.FillsVolumePct)
                ) && 
                (
                    this.TradesVolumePct == input.TradesVolumePct ||
                    this.TradesVolumePct.Equals(input.TradesVolumePct)
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
                hashCode = (hashCode * 59) + this.BinTime.GetHashCode();
                hashCode = (hashCode * 59) + this.FillsVolumePct.GetHashCode();
                hashCode = (hashCode * 59) + this.TradesVolumePct.GetHashCode();
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
