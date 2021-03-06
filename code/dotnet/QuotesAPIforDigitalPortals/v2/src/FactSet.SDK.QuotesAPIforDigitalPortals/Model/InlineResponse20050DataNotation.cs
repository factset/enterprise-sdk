/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Notation of the component. If there is no notation for the component, the object is null.
    /// </summary>
    [DataContract(Name = "inline_response_200_50_data_notation")]
    public partial class InlineResponse20050DataNotation : IEquatable<InlineResponse20050DataNotation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20050DataNotation" /> class.
        /// </summary>
        /// <param name="id">Identifier of the notation..</param>
        /// <param name="instrument">instrument.</param>
        /// <param name="operatingMIC">operatingMIC.</param>
        public InlineResponse20050DataNotation(string id = default(string), InlineResponse20050DataNotationInstrument instrument = default(InlineResponse20050DataNotationInstrument), InlineResponse20050DataNotationOperatingMIC operatingMIC = default(InlineResponse20050DataNotationOperatingMIC))
        {
            this.Id = id;
            this.Instrument = instrument;
            this.OperatingMIC = operatingMIC;
        }

        /// <summary>
        /// Identifier of the notation.
        /// </summary>
        /// <value>Identifier of the notation.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Instrument
        /// </summary>
        [DataMember(Name = "instrument", EmitDefaultValue = false)]
        public InlineResponse20050DataNotationInstrument Instrument { get; set; }

        /// <summary>
        /// Gets or Sets OperatingMIC
        /// </summary>
        [DataMember(Name = "operatingMIC", EmitDefaultValue = false)]
        public InlineResponse20050DataNotationOperatingMIC OperatingMIC { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20050DataNotation {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Instrument: ").Append(Instrument).Append("\n");
            sb.Append("  OperatingMIC: ").Append(OperatingMIC).Append("\n");
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
            return this.Equals(input as InlineResponse20050DataNotation);
        }

        /// <summary>
        /// Returns true if InlineResponse20050DataNotation instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20050DataNotation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20050DataNotation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Instrument == input.Instrument ||
                    (this.Instrument != null &&
                    this.Instrument.Equals(input.Instrument))
                ) && 
                (
                    this.OperatingMIC == input.OperatingMIC ||
                    (this.OperatingMIC != null &&
                    this.OperatingMIC.Equals(input.OperatingMIC))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Instrument != null)
                {
                    hashCode = (hashCode * 59) + this.Instrument.GetHashCode();
                }
                if (this.OperatingMIC != null)
                {
                    hashCode = (hashCode * 59) + this.OperatingMIC.GetHashCode();
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
