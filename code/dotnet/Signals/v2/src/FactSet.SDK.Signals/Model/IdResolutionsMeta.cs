/*
 * Signals API
 *
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: signals.api@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.Signals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Signals.Model
{
    /// <summary>
    /// IdResolutionsMeta
    /// </summary>
    [DataContract(Name = "idResolutionsMeta")]
    public partial class IdResolutionsMeta : IEquatable<IdResolutionsMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IdResolutionsMeta" /> class.
        /// </summary>
        /// <param name="tickerRegion">tickerRegion.</param>
        /// <param name="regionalPermId">regionalPermId.</param>
        public IdResolutionsMeta(Dictionary<string, string> tickerRegion = default(Dictionary<string, string>), Dictionary<string, string> regionalPermId = default(Dictionary<string, string>))
        {
            this.TickerRegion = tickerRegion;
            this.RegionalPermId = regionalPermId;
        }

        /// <summary>
        /// Gets or Sets TickerRegion
        /// </summary>
        [DataMember(Name = "tickerRegion", EmitDefaultValue = false)]
        public Dictionary<string, string> TickerRegion { get; set; }

        /// <summary>
        /// Gets or Sets RegionalPermId
        /// </summary>
        [DataMember(Name = "regionalPermId", EmitDefaultValue = false)]
        public Dictionary<string, string> RegionalPermId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IdResolutionsMeta {\n");
            sb.Append("  TickerRegion: ").Append(TickerRegion).Append("\n");
            sb.Append("  RegionalPermId: ").Append(RegionalPermId).Append("\n");
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
            return this.Equals(input as IdResolutionsMeta);
        }

        /// <summary>
        /// Returns true if IdResolutionsMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of IdResolutionsMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IdResolutionsMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TickerRegion == input.TickerRegion ||
                    this.TickerRegion != null &&
                    input.TickerRegion != null &&
                    this.TickerRegion.SequenceEqual(input.TickerRegion)
                ) && 
                (
                    this.RegionalPermId == input.RegionalPermId ||
                    this.RegionalPermId != null &&
                    input.RegionalPermId != null &&
                    this.RegionalPermId.SequenceEqual(input.RegionalPermId)
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
                if (this.TickerRegion != null)
                {
                    hashCode = (hashCode * 59) + this.TickerRegion.GetHashCode();
                }
                if (this.RegionalPermId != null)
                {
                    hashCode = (hashCode * 59) + this.RegionalPermId.GetHashCode();
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
