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
    /// InlineResponse20068Data
    /// </summary>
    [DataContract(Name = "inline_response_200_68_data")]
    public partial class InlineResponse20068Data : IEquatable<InlineResponse20068Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20068Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of the notation..</param>
        /// <param name="active">Indicates whether the notation is active..</param>
        /// <param name="market">market.</param>
        /// <param name="valueUnit">valueUnit.</param>
        /// <param name="fsym">fsym.</param>
        /// <param name="instrument">instrument.</param>
        public InlineResponse20068Data(string id = default(string), bool active = default(bool), InlineResponse20066DataMarket market = default(InlineResponse20066DataMarket), InlineResponse20066DataValueUnit valueUnit = default(InlineResponse20066DataValueUnit), InlineResponse20067Fsym fsym = default(InlineResponse20067Fsym), InlineResponse20068Instrument instrument = default(InlineResponse20068Instrument))
        {
            this.Id = id;
            this.Active = active;
            this.Market = market;
            this.ValueUnit = valueUnit;
            this.Fsym = fsym;
            this.Instrument = instrument;
        }

        /// <summary>
        /// Identifier of the notation.
        /// </summary>
        /// <value>Identifier of the notation.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Indicates whether the notation is active.
        /// </summary>
        /// <value>Indicates whether the notation is active.</value>
        [DataMember(Name = "active", EmitDefaultValue = true)]
        public bool Active { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public InlineResponse20066DataMarket Market { get; set; }

        /// <summary>
        /// Gets or Sets ValueUnit
        /// </summary>
        [DataMember(Name = "valueUnit", EmitDefaultValue = false)]
        public InlineResponse20066DataValueUnit ValueUnit { get; set; }

        /// <summary>
        /// Gets or Sets Fsym
        /// </summary>
        [DataMember(Name = "fsym", EmitDefaultValue = false)]
        public InlineResponse20067Fsym Fsym { get; set; }

        /// <summary>
        /// Gets or Sets Instrument
        /// </summary>
        [DataMember(Name = "instrument", EmitDefaultValue = false)]
        public InlineResponse20068Instrument Instrument { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20068Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  ValueUnit: ").Append(ValueUnit).Append("\n");
            sb.Append("  Fsym: ").Append(Fsym).Append("\n");
            sb.Append("  Instrument: ").Append(Instrument).Append("\n");
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
            return this.Equals(input as InlineResponse20068Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20068Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20068Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20068Data input)
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
                    this.Active == input.Active ||
                    this.Active.Equals(input.Active)
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.ValueUnit == input.ValueUnit ||
                    (this.ValueUnit != null &&
                    this.ValueUnit.Equals(input.ValueUnit))
                ) && 
                (
                    this.Fsym == input.Fsym ||
                    (this.Fsym != null &&
                    this.Fsym.Equals(input.Fsym))
                ) && 
                (
                    this.Instrument == input.Instrument ||
                    (this.Instrument != null &&
                    this.Instrument.Equals(input.Instrument))
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
                hashCode = (hashCode * 59) + this.Active.GetHashCode();
                if (this.Market != null)
                {
                    hashCode = (hashCode * 59) + this.Market.GetHashCode();
                }
                if (this.ValueUnit != null)
                {
                    hashCode = (hashCode * 59) + this.ValueUnit.GetHashCode();
                }
                if (this.Fsym != null)
                {
                    hashCode = (hashCode * 59) + this.Fsym.GetHashCode();
                }
                if (this.Instrument != null)
                {
                    hashCode = (hashCode * 59) + this.Instrument.GetHashCode();
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
