/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
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
    /// BuyContextModelAnalytics
    /// </summary>
    [DataContract(Name = "BuyContextModelAnalytics")]
    public partial class BuyContextModelAnalytics : IEquatable<BuyContextModelAnalytics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BuyContextModelAnalytics" /> class.
        /// </summary>
        /// <param name="affect">affect.</param>
        /// <param name="context">context.</param>
        /// <param name="range">The relevance of an attribute with regard to the manager’s buy process is quantified and listed from largest to smallest. A large range indicates that the attribute is not pertinent, or targeted, in the manager’s buy process. A small range indicates that a particular level of the attribute (high, lower average) is targeted in the manager’s buy process..</param>
        public BuyContextModelAnalytics(decimal affect = default(decimal), BuyContextModelAnalyticsContext context = default(BuyContextModelAnalyticsContext), decimal range = default(decimal))
        {
            this.Affect = affect;
            this.Context = context;
            this.Range = range;
        }

        /// <summary>
        /// Gets or Sets Affect
        /// </summary>
        [DataMember(Name = "affect", EmitDefaultValue = false)]
        public decimal Affect { get; set; }

        /// <summary>
        /// Gets or Sets Context
        /// </summary>
        [DataMember(Name = "context", EmitDefaultValue = false)]
        public BuyContextModelAnalyticsContext Context { get; set; }

        /// <summary>
        /// The relevance of an attribute with regard to the manager’s buy process is quantified and listed from largest to smallest. A large range indicates that the attribute is not pertinent, or targeted, in the manager’s buy process. A small range indicates that a particular level of the attribute (high, lower average) is targeted in the manager’s buy process.
        /// </summary>
        /// <value>The relevance of an attribute with regard to the manager’s buy process is quantified and listed from largest to smallest. A large range indicates that the attribute is not pertinent, or targeted, in the manager’s buy process. A small range indicates that a particular level of the attribute (high, lower average) is targeted in the manager’s buy process.</value>
        [DataMember(Name = "range", EmitDefaultValue = false)]
        public decimal Range { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BuyContextModelAnalytics {\n");
            sb.Append("  Affect: ").Append(Affect).Append("\n");
            sb.Append("  Context: ").Append(Context).Append("\n");
            sb.Append("  Range: ").Append(Range).Append("\n");
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
            return this.Equals(input as BuyContextModelAnalytics);
        }

        /// <summary>
        /// Returns true if BuyContextModelAnalytics instances are equal
        /// </summary>
        /// <param name="input">Instance of BuyContextModelAnalytics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BuyContextModelAnalytics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Affect == input.Affect ||
                    this.Affect.Equals(input.Affect)
                ) && 
                (
                    this.Context == input.Context ||
                    (this.Context != null &&
                    this.Context.Equals(input.Context))
                ) && 
                (
                    this.Range == input.Range ||
                    this.Range.Equals(input.Range)
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
                hashCode = (hashCode * 59) + this.Affect.GetHashCode();
                if (this.Context != null)
                {
                    hashCode = (hashCode * 59) + this.Context.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Range.GetHashCode();
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
