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
    /// ApplicationLink
    /// </summary>
    [DataContract(Name = "ApplicationLink")]
    public partial class ApplicationLink : IEquatable<ApplicationLink>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApplicationLink" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ApplicationLink() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ApplicationLink" /> class.
        /// </summary>
        /// <param name="name">name (required).</param>
        /// <param name="workstationLink">workstationLink.</param>
        /// <param name="webLink">webLink (required).</param>
        public ApplicationLink(string name, string webLink,string workstationLink = default(string))
        {
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for ApplicationLink and cannot be null");
            }
            this.Name = name;
            // to ensure "webLink" is required (not null)
            if (webLink == null) {
                throw new ArgumentNullException("webLink is a required property for ApplicationLink and cannot be null");
            }
            this.WebLink = webLink;
            this.WorkstationLink = workstationLink;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets WorkstationLink
        /// </summary>
        [DataMember(Name = "workstationLink", EmitDefaultValue = false)]
        public string WorkstationLink { get; set; }

        /// <summary>
        /// Gets or Sets WebLink
        /// </summary>
        [DataMember(Name = "webLink", IsRequired = true, EmitDefaultValue = false)]
        public string WebLink { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ApplicationLink {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  WorkstationLink: ").Append(WorkstationLink).Append("\n");
            sb.Append("  WebLink: ").Append(WebLink).Append("\n");
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
            return this.Equals(input as ApplicationLink);
        }

        /// <summary>
        /// Returns true if ApplicationLink instances are equal
        /// </summary>
        /// <param name="input">Instance of ApplicationLink to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApplicationLink input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.WorkstationLink == input.WorkstationLink ||
                    (this.WorkstationLink != null &&
                    this.WorkstationLink.Equals(input.WorkstationLink))
                ) && 
                (
                    this.WebLink == input.WebLink ||
                    (this.WebLink != null &&
                    this.WebLink.Equals(input.WebLink))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.WorkstationLink != null)
                {
                    hashCode = (hashCode * 59) + this.WorkstationLink.GetHashCode();
                }
                if (this.WebLink != null)
                {
                    hashCode = (hashCode * 59) + this.WebLink.GetHashCode();
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
