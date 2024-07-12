/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.1.0
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
using OpenAPIDateConverter = FactSet.SDK.Cabot.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Cabot.Model
{
    /// <summary>
    /// SellTimingModelAnalytics
    /// </summary>
    [DataContract(Name = "SellTimingModelAnalytics")]
    public partial class SellTimingModelAnalytics : IEquatable<SellTimingModelAnalytics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SellTimingModelAnalytics" /> class.
        /// </summary>
        /// <param name="youngerWinner">Benefit of harvesting younger, winning positions..</param>
        /// <param name="youngerLoser">Benefit of harvesting younger, losing positions..</param>
        /// <param name="olderWinner">Benefit of harvesting older, winning positions.</param>
        /// <param name="olderLoser">Benefit of harvesting older, losing positions..</param>
        public SellTimingModelAnalytics(decimal youngerWinner = default(decimal), decimal youngerLoser = default(decimal), decimal olderWinner = default(decimal), decimal olderLoser = default(decimal))
        {
            this.YoungerWinner = youngerWinner;
            this.YoungerLoser = youngerLoser;
            this.OlderWinner = olderWinner;
            this.OlderLoser = olderLoser;
        }

        /// <summary>
        /// Benefit of harvesting younger, winning positions.
        /// </summary>
        /// <value>Benefit of harvesting younger, winning positions.</value>
        [DataMember(Name = "youngerWinner", EmitDefaultValue = false)]
        public decimal YoungerWinner { get; set; }

        /// <summary>
        /// Benefit of harvesting younger, losing positions.
        /// </summary>
        /// <value>Benefit of harvesting younger, losing positions.</value>
        [DataMember(Name = "youngerLoser", EmitDefaultValue = false)]
        public decimal YoungerLoser { get; set; }

        /// <summary>
        /// Benefit of harvesting older, winning positions
        /// </summary>
        /// <value>Benefit of harvesting older, winning positions</value>
        [DataMember(Name = "olderWinner", EmitDefaultValue = false)]
        public decimal OlderWinner { get; set; }

        /// <summary>
        /// Benefit of harvesting older, losing positions.
        /// </summary>
        /// <value>Benefit of harvesting older, losing positions.</value>
        [DataMember(Name = "olderLoser", EmitDefaultValue = false)]
        public decimal OlderLoser { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SellTimingModelAnalytics {\n");
            sb.Append("  YoungerWinner: ").Append(YoungerWinner).Append("\n");
            sb.Append("  YoungerLoser: ").Append(YoungerLoser).Append("\n");
            sb.Append("  OlderWinner: ").Append(OlderWinner).Append("\n");
            sb.Append("  OlderLoser: ").Append(OlderLoser).Append("\n");
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
            return this.Equals(input as SellTimingModelAnalytics);
        }

        /// <summary>
        /// Returns true if SellTimingModelAnalytics instances are equal
        /// </summary>
        /// <param name="input">Instance of SellTimingModelAnalytics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SellTimingModelAnalytics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.YoungerWinner == input.YoungerWinner ||
                    this.YoungerWinner.Equals(input.YoungerWinner)
                ) && 
                (
                    this.YoungerLoser == input.YoungerLoser ||
                    this.YoungerLoser.Equals(input.YoungerLoser)
                ) && 
                (
                    this.OlderWinner == input.OlderWinner ||
                    this.OlderWinner.Equals(input.OlderWinner)
                ) && 
                (
                    this.OlderLoser == input.OlderLoser ||
                    this.OlderLoser.Equals(input.OlderLoser)
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
                hashCode = (hashCode * 59) + this.YoungerWinner.GetHashCode();
                hashCode = (hashCode * 59) + this.YoungerLoser.GetHashCode();
                hashCode = (hashCode * 59) + this.OlderWinner.GetHashCode();
                hashCode = (hashCode * 59) + this.OlderLoser.GetHashCode();
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
