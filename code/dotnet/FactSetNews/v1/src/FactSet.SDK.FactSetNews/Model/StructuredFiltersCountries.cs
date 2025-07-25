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
    /// Structured Filters Countries Object
    /// </summary>
    [DataContract(Name = "StructuredFiltersCountries")]
    public partial class StructuredFiltersCountries : IEquatable<StructuredFiltersCountries>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StructuredFiltersCountries" /> class.
        /// </summary>
        /// <param name="countries">countries.</param>
        public StructuredFiltersCountries(List<StructuredFiltersCountriesObject> countries = default(List<StructuredFiltersCountriesObject>))
        {
            this.Countries = countries;
        }

        /// <summary>
        /// Gets or Sets Countries
        /// </summary>
        [DataMember(Name = "countries", EmitDefaultValue = false)]
        public List<StructuredFiltersCountriesObject> Countries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StructuredFiltersCountries {\n");
            sb.Append("  Countries: ").Append(Countries).Append("\n");
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
            return this.Equals(input as StructuredFiltersCountries);
        }

        /// <summary>
        /// Returns true if StructuredFiltersCountries instances are equal
        /// </summary>
        /// <param name="input">Instance of StructuredFiltersCountries to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StructuredFiltersCountries input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Countries == input.Countries ||
                    this.Countries != null &&
                    input.Countries != null &&
                    this.Countries.SequenceEqual(input.Countries)
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
                if (this.Countries != null)
                {
                    hashCode = (hashCode * 59) + this.Countries.GetHashCode();
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
