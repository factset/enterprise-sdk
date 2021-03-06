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
using OpenAPIDateConverter = FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model
{
    /// <summary>
    /// Number of shares in the position.
    /// </summary>
    [DataContract(Name = "inline_response_200_6_data_shares")]
    public partial class InlineResponse2006DataShares : IEquatable<InlineResponse2006DataShares>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2006DataShares" /> class.
        /// </summary>
        /// <param name="bought">Number of shares bought..</param>
        /// <param name="sold">Number of shares sold..</param>
        /// <param name="open">Open number of shares..</param>
        public InlineResponse2006DataShares(decimal bought = default(decimal), decimal sold = default(decimal), decimal open = default(decimal))
        {
            this.Bought = bought;
            this.Sold = sold;
            this.Open = open;
        }

        /// <summary>
        /// Number of shares bought.
        /// </summary>
        /// <value>Number of shares bought.</value>
        [DataMember(Name = "bought", EmitDefaultValue = false)]
        public decimal Bought { get; set; }

        /// <summary>
        /// Number of shares sold.
        /// </summary>
        /// <value>Number of shares sold.</value>
        [DataMember(Name = "sold", EmitDefaultValue = false)]
        public decimal Sold { get; set; }

        /// <summary>
        /// Open number of shares.
        /// </summary>
        /// <value>Open number of shares.</value>
        [DataMember(Name = "open", EmitDefaultValue = false)]
        public decimal Open { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2006DataShares {\n");
            sb.Append("  Bought: ").Append(Bought).Append("\n");
            sb.Append("  Sold: ").Append(Sold).Append("\n");
            sb.Append("  Open: ").Append(Open).Append("\n");
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
            return this.Equals(input as InlineResponse2006DataShares);
        }

        /// <summary>
        /// Returns true if InlineResponse2006DataShares instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2006DataShares to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2006DataShares input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Bought == input.Bought ||
                    this.Bought.Equals(input.Bought)
                ) && 
                (
                    this.Sold == input.Sold ||
                    this.Sold.Equals(input.Sold)
                ) && 
                (
                    this.Open == input.Open ||
                    this.Open.Equals(input.Open)
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
                hashCode = (hashCode * 59) + this.Bought.GetHashCode();
                hashCode = (hashCode * 59) + this.Sold.GetHashCode();
                hashCode = (hashCode * 59) + this.Open.GetHashCode();
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
