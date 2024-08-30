/*
 * Chart Generation Service
 *
 * This is a service for generating charts in a node environment that were created using web charting and get back images in form of `PNGs` and `JPEGs` as response.
 *
 * The version of the OpenAPI document: 1.5.0
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
using OpenAPIDateConverter = FactSet.SDK.ChartGenerationService.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ChartGenerationService.Model
{
    /// <summary>
    /// CategoryChartListErrorObject
    /// </summary>
    [DataContract(Name = "CategoryChartListErrorObject")]
    public partial class CategoryChartListErrorObject : IEquatable<CategoryChartListErrorObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CategoryChartListErrorObject" /> class.
        /// </summary>
        /// <param name="category">Name of the category. This is required when building the request for the chart image..</param>
        /// <param name="chartList">chartList.</param>
        public CategoryChartListErrorObject(string category = default(string), List<ChartList> chartList = default(List<ChartList>))
        {
            this.Category = category;
            this.ChartList = chartList;
        }

        /// <summary>
        /// Name of the category. This is required when building the request for the chart image.
        /// </summary>
        /// <value>Name of the category. This is required when building the request for the chart image.</value>
        [DataMember(Name = "category", EmitDefaultValue = false)]
        public string Category { get; set; }

        /// <summary>
        /// Gets or Sets ChartList
        /// </summary>
        [DataMember(Name = "chartList", EmitDefaultValue = false)]
        public List<ChartList> ChartList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CategoryChartListErrorObject {\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  ChartList: ").Append(ChartList).Append("\n");
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
            return this.Equals(input as CategoryChartListErrorObject);
        }

        /// <summary>
        /// Returns true if CategoryChartListErrorObject instances are equal
        /// </summary>
        /// <param name="input">Instance of CategoryChartListErrorObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CategoryChartListErrorObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.ChartList == input.ChartList ||
                    this.ChartList != null &&
                    input.ChartList != null &&
                    this.ChartList.SequenceEqual(input.ChartList)
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
                if (this.Category != null)
                {
                    hashCode = (hashCode * 59) + this.Category.GetHashCode();
                }
                if (this.ChartList != null)
                {
                    hashCode = (hashCode * 59) + this.ChartList.GetHashCode();
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
