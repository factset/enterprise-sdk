/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
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
    /// BuyContextModelAnalyticsItem
    /// </summary>
    [DataContract(Name = "BuyContextModelAnalyticsItem")]
    public partial class BuyContextModelAnalyticsItem : IEquatable<BuyContextModelAnalyticsItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BuyContextModelAnalyticsItem" /> class.
        /// </summary>
        /// <param name="medianLoser">Median Loser.</param>
        /// <param name="medianWinner">Median Winner.</param>
        /// <param name="name">name.</param>
        /// <param name="range">range.</param>
        public BuyContextModelAnalyticsItem(decimal medianLoser = default(decimal), decimal medianWinner = default(decimal), string name = default(string), BuyContextModelAnalyticsItemRange range = default(BuyContextModelAnalyticsItemRange))
        {
            this.MedianLoser = medianLoser;
            this.MedianWinner = medianWinner;
            this.Name = name;
            this.Range = range;
        }

        /// <summary>
        /// Median Loser
        /// </summary>
        /// <value>Median Loser</value>
        [DataMember(Name = "medianLoser", EmitDefaultValue = false)]
        public decimal MedianLoser { get; set; }

        /// <summary>
        /// Median Winner
        /// </summary>
        /// <value>Median Winner</value>
        [DataMember(Name = "medianWinner", EmitDefaultValue = false)]
        public decimal MedianWinner { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Range
        /// </summary>
        [DataMember(Name = "range", EmitDefaultValue = false)]
        public BuyContextModelAnalyticsItemRange Range { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BuyContextModelAnalyticsItem {\n");
            sb.Append("  MedianLoser: ").Append(MedianLoser).Append("\n");
            sb.Append("  MedianWinner: ").Append(MedianWinner).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return this.Equals(input as BuyContextModelAnalyticsItem);
        }

        /// <summary>
        /// Returns true if BuyContextModelAnalyticsItem instances are equal
        /// </summary>
        /// <param name="input">Instance of BuyContextModelAnalyticsItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BuyContextModelAnalyticsItem input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.MedianLoser == input.MedianLoser ||
                    this.MedianLoser.Equals(input.MedianLoser)
                ) && 
                (
                    this.MedianWinner == input.MedianWinner ||
                    this.MedianWinner.Equals(input.MedianWinner)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Range == input.Range ||
                    (this.Range != null &&
                    this.Range.Equals(input.Range))
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
                hashCode = (hashCode * 59) + this.MedianLoser.GetHashCode();
                hashCode = (hashCode * 59) + this.MedianWinner.GetHashCode();
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Range != null)
                {
                    hashCode = (hashCode * 59) + this.Range.GetHashCode();
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
