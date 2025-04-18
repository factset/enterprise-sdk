/*
 * FactSet Search Answers API
 *
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetSearchAnswers.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetSearchAnswers.Model
{
    /// <summary>
    /// CountryID
    /// </summary>
    [DataContract(Name = "CountryID")]
    public partial class CountryID : IEquatable<CountryID>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CountryID" /> class.
        /// </summary>
        /// <param name="iSOALPHA2">iSOALPHA2.</param>
        public CountryID(string iSOALPHA2 = default(string))
        {
            this.ISOALPHA2 = iSOALPHA2;
        }

        /// <summary>
        /// Gets or Sets ISOALPHA2
        /// </summary>
        [DataMember(Name = "ISOALPHA2", EmitDefaultValue = false)]
        public string ISOALPHA2 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CountryID {\n");
            sb.Append("  ISOALPHA2: ").Append(ISOALPHA2).Append("\n");
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
            return this.Equals(input as CountryID);
        }

        /// <summary>
        /// Returns true if CountryID instances are equal
        /// </summary>
        /// <param name="input">Instance of CountryID to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CountryID input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ISOALPHA2 == input.ISOALPHA2 ||
                    (this.ISOALPHA2 != null &&
                    this.ISOALPHA2.Equals(input.ISOALPHA2))
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
                if (this.ISOALPHA2 != null)
                {
                    hashCode = (hashCode * 59) + this.ISOALPHA2.GetHashCode();
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
