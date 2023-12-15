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
    /// Fdc3Instrument
    /// </summary>
    [DataContract(Name = "Fdc3Instrument")]
    public partial class Fdc3Instrument : IEquatable<Fdc3Instrument>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Fdc3Instrument" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Fdc3Instrument() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Fdc3Instrument" /> class.
        /// </summary>
        /// <param name="type">type (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="exchangeMic">exchangeMic.</param>
        /// <param name="exchangeMicFds">exchangeMicFds.</param>
        /// <param name="id">id.</param>
        public Fdc3Instrument(string type, string name,string exchangeMic = default(string), string exchangeMicFds = default(string), InstrumentID id = default(InstrumentID))
        {
            // to ensure "type" is required (not null)
            if (type == null) {
                throw new ArgumentNullException("type is a required property for Fdc3Instrument and cannot be null");
            }
            this.Type = type;
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for Fdc3Instrument and cannot be null");
            }
            this.Name = name;
            this.ExchangeMic = exchangeMic;
            this.ExchangeMicFds = exchangeMicFds;
            this.Id = id;
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets ExchangeMic
        /// </summary>
        [DataMember(Name = "exchangeMic", EmitDefaultValue = false)]
        public string ExchangeMic { get; set; }

        /// <summary>
        /// Gets or Sets ExchangeMicFds
        /// </summary>
        [DataMember(Name = "exchangeMicFds", EmitDefaultValue = false)]
        public string ExchangeMicFds { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public InstrumentID Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Fdc3Instrument {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ExchangeMic: ").Append(ExchangeMic).Append("\n");
            sb.Append("  ExchangeMicFds: ").Append(ExchangeMicFds).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return this.Equals(input as Fdc3Instrument);
        }

        /// <summary>
        /// Returns true if Fdc3Instrument instances are equal
        /// </summary>
        /// <param name="input">Instance of Fdc3Instrument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Fdc3Instrument input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ExchangeMic == input.ExchangeMic ||
                    (this.ExchangeMic != null &&
                    this.ExchangeMic.Equals(input.ExchangeMic))
                ) && 
                (
                    this.ExchangeMicFds == input.ExchangeMicFds ||
                    (this.ExchangeMicFds != null &&
                    this.ExchangeMicFds.Equals(input.ExchangeMicFds))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
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
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.ExchangeMic != null)
                {
                    hashCode = (hashCode * 59) + this.ExchangeMic.GetHashCode();
                }
                if (this.ExchangeMicFds != null)
                {
                    hashCode = (hashCode * 59) + this.ExchangeMicFds.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
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
