/*
 * Event Calendar API
 *
 * Retrieves events for companies
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
using OpenAPIDateConverter = FactSet.SDK.EventCalendar.Client.OpenAPIDateConverter;

namespace FactSet.SDK.EventCalendar.Model
{
    /// <summary>
    /// CompanyEventRequestDataUniverse
    /// </summary>
    [DataContract(Name = "companyEventRequest_data_universe")]
    public partial class CompanyEventRequestDataUniverse : IEquatable<CompanyEventRequestDataUniverse>, IValidatableObject
    {
        /// <summary>
        /// Defines Type
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Tickers for value: Tickers
            /// </summary>
            [EnumMember(Value = "Tickers")]
            Tickers = 1,

            /// <summary>
            /// Enum Index for value: Index
            /// </summary>
            [EnumMember(Value = "Index")]
            Index = 2,

            /// <summary>
            /// Enum Etf for value: Etf
            /// </summary>
            [EnumMember(Value = "Etf")]
            Etf = 3,

            /// <summary>
            /// Enum AllCompanies for value: AllCompanies
            /// </summary>
            [EnumMember(Value = "AllCompanies")]
            AllCompanies = 4

        }


        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyEventRequestDataUniverse" /> class.
        /// </summary>
        /// <param name="symbols">Companies to return in the response.</param>
        /// <param name="type">type.</param>
        public CompanyEventRequestDataUniverse(List<string> symbols = default(List<string>), TypeEnum? type = default(TypeEnum?))
        {
            this.Symbols = symbols;
            this.Type = type;
        }

        /// <summary>
        /// Companies to return in the response
        /// </summary>
        /// <value>Companies to return in the response</value>
        [DataMember(Name = "symbols", EmitDefaultValue = false)]
        public List<string> Symbols { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CompanyEventRequestDataUniverse {\n");
            sb.Append("  Symbols: ").Append(Symbols).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as CompanyEventRequestDataUniverse);
        }

        /// <summary>
        /// Returns true if CompanyEventRequestDataUniverse instances are equal
        /// </summary>
        /// <param name="input">Instance of CompanyEventRequestDataUniverse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CompanyEventRequestDataUniverse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Symbols == input.Symbols ||
                    this.Symbols != null &&
                    input.Symbols != null &&
                    this.Symbols.SequenceEqual(input.Symbols)
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
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
                if (this.Symbols != null)
                {
                    hashCode = (hashCode * 59) + this.Symbols.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
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
