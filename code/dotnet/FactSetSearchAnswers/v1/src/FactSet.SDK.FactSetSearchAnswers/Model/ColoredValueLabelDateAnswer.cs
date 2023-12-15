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
    /// ColoredValueLabelDateAnswer
    /// </summary>
    [DataContract(Name = "ColoredValueLabelDateAnswer")]
    public partial class ColoredValueLabelDateAnswer : IEquatable<ColoredValueLabelDateAnswer>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ColoredValueLabelDateAnswer" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ColoredValueLabelDateAnswer() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ColoredValueLabelDateAnswer" /> class.
        /// </summary>
        /// <param name="template">template (required).</param>
        /// <param name="title">title (required).</param>
        /// <param name="templateData">templateData (required).</param>
        public ColoredValueLabelDateAnswer(string template, string title, ColoredValueLabelDateTemplateData templateData)
        {
            // to ensure "template" is required (not null)
            if (template == null) {
                throw new ArgumentNullException("template is a required property for ColoredValueLabelDateAnswer and cannot be null");
            }
            this.Template = template;
            // to ensure "title" is required (not null)
            if (title == null) {
                throw new ArgumentNullException("title is a required property for ColoredValueLabelDateAnswer and cannot be null");
            }
            this.Title = title;
            // to ensure "templateData" is required (not null)
            if (templateData == null) {
                throw new ArgumentNullException("templateData is a required property for ColoredValueLabelDateAnswer and cannot be null");
            }
            this.TemplateData = templateData;
        }

        /// <summary>
        /// Gets or Sets Template
        /// </summary>
        [DataMember(Name = "template", IsRequired = true, EmitDefaultValue = false)]
        public string Template { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets TemplateData
        /// </summary>
        [DataMember(Name = "templateData", IsRequired = true, EmitDefaultValue = false)]
        public ColoredValueLabelDateTemplateData TemplateData { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ColoredValueLabelDateAnswer {\n");
            sb.Append("  Template: ").Append(Template).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  TemplateData: ").Append(TemplateData).Append("\n");
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
            return this.Equals(input as ColoredValueLabelDateAnswer);
        }

        /// <summary>
        /// Returns true if ColoredValueLabelDateAnswer instances are equal
        /// </summary>
        /// <param name="input">Instance of ColoredValueLabelDateAnswer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ColoredValueLabelDateAnswer input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Template == input.Template ||
                    (this.Template != null &&
                    this.Template.Equals(input.Template))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.TemplateData == input.TemplateData ||
                    (this.TemplateData != null &&
                    this.TemplateData.Equals(input.TemplateData))
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
                if (this.Template != null)
                {
                    hashCode = (hashCode * 59) + this.Template.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.TemplateData != null)
                {
                    hashCode = (hashCode * 59) + this.TemplateData.GetHashCode();
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
