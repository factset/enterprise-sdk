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
    /// AnswerWithoutDataAllOfTemplateData
    /// </summary>
    [DataContract(Name = "AnswerWithoutData_allOf_templateData")]
    public partial class AnswerWithoutDataAllOfTemplateData : IEquatable<AnswerWithoutDataAllOfTemplateData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AnswerWithoutDataAllOfTemplateData" /> class.
        /// </summary>
        /// <param name="fdc3Context">fdc3Context.</param>
        public AnswerWithoutDataAllOfTemplateData(Fdc3Context fdc3Context = default(Fdc3Context))
        {
            this.Fdc3Context = fdc3Context;
        }

        /// <summary>
        /// Gets or Sets Fdc3Context
        /// </summary>
        [DataMember(Name = "fdc3Context", EmitDefaultValue = false)]
        public Fdc3Context Fdc3Context { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AnswerWithoutDataAllOfTemplateData {\n");
            sb.Append("  Fdc3Context: ").Append(Fdc3Context).Append("\n");
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
            return this.Equals(input as AnswerWithoutDataAllOfTemplateData);
        }

        /// <summary>
        /// Returns true if AnswerWithoutDataAllOfTemplateData instances are equal
        /// </summary>
        /// <param name="input">Instance of AnswerWithoutDataAllOfTemplateData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AnswerWithoutDataAllOfTemplateData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Fdc3Context == input.Fdc3Context ||
                    (this.Fdc3Context != null &&
                    this.Fdc3Context.Equals(input.Fdc3Context))
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
                if (this.Fdc3Context != null)
                {
                    hashCode = (hashCode * 59) + this.Fdc3Context.GetHashCode();
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
