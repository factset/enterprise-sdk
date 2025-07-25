/*
 * Real-Time Options API
 *
 * The Options API provides detailed information for option contracts (“options”) and option classes. This API presents a consolidated data model that gives access to options data of global options markets such as OPRA, Australia Exchange, Bovespa, CME Group, EUREX, Euronext, Hong Kong, ICE Futures Europe / US, Montreal Exchange, and others.  An option class is a product group of options from the same exchange and with the same underlying. The API includes endpoints to retrieve fundamental data for an option contract such as exercise right, exercise style, strike, maturity, open interest, underlying, etc. as well as risk measures of an option contract such as delta, omega, implied volatility, etc.  Option chains are provided by the /by-class/list endpoint. The list of option contracts for an option class can be filtered by exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The option screener allows you to search for option classes by using text search, root symbol, or ISIN plus additional criteria such as market, underlying, currency, and category. Similar to other screener endpoints in e.g. the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals), the /value-ranges/get endpoint provides the possible values and value ranges plus the number of option contracts for an option class related to the option contracts per criteria such as exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The Options API for Digital Portals seamlessly integrates with the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) that provides real-time, delayed, and end-of-day pricing data and basic security identifier cross-reference. For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api). 
 *
 * The version of the OpenAPI document: 4.1.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeOptions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeOptions.Model
{
    /// <summary>
    /// Values related to the exercise.
    /// </summary>
    [DataContract(Name = "PostOptionByClassValueRangesGetDataItems_exercise")]
    public partial class PostOptionByClassValueRangesGetDataItemsExercise : IEquatable<PostOptionByClassValueRangesGetDataItemsExercise>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostOptionByClassValueRangesGetDataItemsExercise" /> class.
        /// </summary>
        /// <param name="right">Exercise right..</param>
        /// <param name="style">Exercise style..</param>
        public PostOptionByClassValueRangesGetDataItemsExercise(List<PostOptionByClassValueRangesGetDataExerciseRightItems> right = default(List<PostOptionByClassValueRangesGetDataExerciseRightItems>), List<PostOptionByClassValueRangesGetDataExerciseStyleItems> style = default(List<PostOptionByClassValueRangesGetDataExerciseStyleItems>))
        {
            this.Right = right;
            this.Style = style;
        }

        /// <summary>
        /// Exercise right.
        /// </summary>
        /// <value>Exercise right.</value>
        [DataMember(Name = "right", EmitDefaultValue = false)]
        public List<PostOptionByClassValueRangesGetDataExerciseRightItems> Right { get; set; }

        /// <summary>
        /// Exercise style.
        /// </summary>
        /// <value>Exercise style.</value>
        [DataMember(Name = "style", EmitDefaultValue = false)]
        public List<PostOptionByClassValueRangesGetDataExerciseStyleItems> Style { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostOptionByClassValueRangesGetDataItemsExercise {\n");
            sb.Append("  Right: ").Append(Right).Append("\n");
            sb.Append("  Style: ").Append(Style).Append("\n");
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
            return this.Equals(input as PostOptionByClassValueRangesGetDataItemsExercise);
        }

        /// <summary>
        /// Returns true if PostOptionByClassValueRangesGetDataItemsExercise instances are equal
        /// </summary>
        /// <param name="input">Instance of PostOptionByClassValueRangesGetDataItemsExercise to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostOptionByClassValueRangesGetDataItemsExercise input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Right == input.Right ||
                    this.Right != null &&
                    input.Right != null &&
                    this.Right.SequenceEqual(input.Right)
                ) && 
                (
                    this.Style == input.Style ||
                    this.Style != null &&
                    input.Style != null &&
                    this.Style.SequenceEqual(input.Style)
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
                if (this.Right != null)
                {
                    hashCode = (hashCode * 59) + this.Right.GetHashCode();
                }
                if (this.Style != null)
                {
                    hashCode = (hashCode * 59) + this.Style.GetHashCode();
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
