/*
 * FactSet Search Answers API
 *
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: FactSearch.Team@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.FactSetSearchAnswers.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetSearchAnswers.Model
{
    /// <summary>
    /// ValueChange
    /// </summary>
    [DataContract(Name = "ValueChange")]
    public partial class ValueChange : IEquatable<ValueChange>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Color
        /// </summary>
        [DataMember(Name = "color", EmitDefaultValue = false)]
        public ChangeColor? Color { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ValueChange" /> class.
        /// </summary>
        /// <param name="absoluteChange">absoluteChange.</param>
        /// <param name="percentageChange">percentageChange.</param>
        /// <param name="color">color.</param>
        public ValueChange(string absoluteChange = default(string), string percentageChange = default(string), ChangeColor color = default(ChangeColor))
        {
            this.AbsoluteChange = absoluteChange;
            this.PercentageChange = percentageChange;
            this.Color = color;
        }

        /// <summary>
        /// Gets or Sets AbsoluteChange
        /// </summary>
        [DataMember(Name = "absoluteChange", EmitDefaultValue = false)]
        public string AbsoluteChange { get; set; }

        /// <summary>
        /// Gets or Sets PercentageChange
        /// </summary>
        [DataMember(Name = "percentageChange", EmitDefaultValue = false)]
        public string PercentageChange { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ValueChange {\n");
            sb.Append("  AbsoluteChange: ").Append(AbsoluteChange).Append("\n");
            sb.Append("  PercentageChange: ").Append(PercentageChange).Append("\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
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
            return this.Equals(input as ValueChange);
        }

        /// <summary>
        /// Returns true if ValueChange instances are equal
        /// </summary>
        /// <param name="input">Instance of ValueChange to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ValueChange input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AbsoluteChange == input.AbsoluteChange ||
                    (this.AbsoluteChange != null &&
                    this.AbsoluteChange.Equals(input.AbsoluteChange))
                ) && 
                (
                    this.PercentageChange == input.PercentageChange ||
                    (this.PercentageChange != null &&
                    this.PercentageChange.Equals(input.PercentageChange))
                ) && 
                (
                    this.Color == input.Color ||
                    this.Color.Equals(input.Color)
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
                if (this.AbsoluteChange != null)
                {
                    hashCode = (hashCode * 59) + this.AbsoluteChange.GetHashCode();
                }
                if (this.PercentageChange != null)
                {
                    hashCode = (hashCode * 59) + this.PercentageChange.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Color.GetHashCode();
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
