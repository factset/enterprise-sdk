/*
 * News API
 *
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
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
using OpenAPIDateConverter = FactSet.SDK.FactSetNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetNews.Model
{
    /// <summary>
    /// FilterCountriesResponseData
    /// </summary>
    [DataContract(Name = "FilterCountriesResponse_data")]
    public partial class FilterCountriesResponseData : IEquatable<FilterCountriesResponseData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FilterCountriesResponseData" /> class.
        /// </summary>
        /// <param name="structured">structured.</param>
        /// <param name="flattened">flattened.</param>
        public FilterCountriesResponseData(StructuredFiltersCountries structured = default(StructuredFiltersCountries), FlattenedFiltersCountries flattened = default(FlattenedFiltersCountries))
        {
            this.Structured = structured;
            this.Flattened = flattened;
        }

        /// <summary>
        /// Gets or Sets Structured
        /// </summary>
        [DataMember(Name = "structured", EmitDefaultValue = false)]
        public StructuredFiltersCountries Structured { get; set; }

        /// <summary>
        /// Gets or Sets Flattened
        /// </summary>
        [DataMember(Name = "flattened", EmitDefaultValue = false)]
        public FlattenedFiltersCountries Flattened { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FilterCountriesResponseData {\n");
            sb.Append("  Structured: ").Append(Structured).Append("\n");
            sb.Append("  Flattened: ").Append(Flattened).Append("\n");
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
            return this.Equals(input as FilterCountriesResponseData);
        }

        /// <summary>
        /// Returns true if FilterCountriesResponseData instances are equal
        /// </summary>
        /// <param name="input">Instance of FilterCountriesResponseData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FilterCountriesResponseData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Structured == input.Structured ||
                    (this.Structured != null &&
                    this.Structured.Equals(input.Structured))
                ) && 
                (
                    this.Flattened == input.Flattened ||
                    (this.Flattened != null &&
                    this.Flattened.Equals(input.Flattened))
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
                if (this.Structured != null)
                {
                    hashCode = (hashCode * 59) + this.Structured.GetHashCode();
                }
                if (this.Flattened != null)
                {
                    hashCode = (hashCode * 59) + this.Flattened.GetHashCode();
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
