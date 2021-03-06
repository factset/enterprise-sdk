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
    /// Details of the portfolio.
    /// </summary>
    [DataContract(Name = "inline_response_200_1_data")]
    public partial class InlineResponse2001Data : IEquatable<InlineResponse2001Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of the portfolio..</param>
        /// <param name="name">Name of the portfolio..</param>
        /// <param name="currency">currency.</param>
        /// <param name="summary">summary.</param>
        /// <param name="profitLoss">profitLoss.</param>
        /// <param name="riskKeyFigures">riskKeyFigures.</param>
        public InlineResponse2001Data(string id = default(string), string name = default(string), InlineResponse2001DataCurrency currency = default(InlineResponse2001DataCurrency), InlineResponse2001DataSummary summary = default(InlineResponse2001DataSummary), InlineResponse2001DataProfitLoss profitLoss = default(InlineResponse2001DataProfitLoss), InlineResponse2001DataRiskKeyFigures riskKeyFigures = default(InlineResponse2001DataRiskKeyFigures))
        {
            this.Id = id;
            this.Name = name;
            this.Currency = currency;
            this.Summary = summary;
            this.ProfitLoss = profitLoss;
            this.RiskKeyFigures = riskKeyFigures;
        }

        /// <summary>
        /// Identifier of the portfolio.
        /// </summary>
        /// <value>Identifier of the portfolio.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Name of the portfolio.
        /// </summary>
        /// <value>Name of the portfolio.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public InlineResponse2001DataCurrency Currency { get; set; }

        /// <summary>
        /// Gets or Sets Summary
        /// </summary>
        [DataMember(Name = "summary", EmitDefaultValue = false)]
        public InlineResponse2001DataSummary Summary { get; set; }

        /// <summary>
        /// Gets or Sets ProfitLoss
        /// </summary>
        [DataMember(Name = "profitLoss", EmitDefaultValue = false)]
        public InlineResponse2001DataProfitLoss ProfitLoss { get; set; }

        /// <summary>
        /// Gets or Sets RiskKeyFigures
        /// </summary>
        [DataMember(Name = "riskKeyFigures", EmitDefaultValue = false)]
        public InlineResponse2001DataRiskKeyFigures RiskKeyFigures { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2001Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Summary: ").Append(Summary).Append("\n");
            sb.Append("  ProfitLoss: ").Append(ProfitLoss).Append("\n");
            sb.Append("  RiskKeyFigures: ").Append(RiskKeyFigures).Append("\n");
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
            return this.Equals(input as InlineResponse2001Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2001Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2001Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001Data input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Summary == input.Summary ||
                    (this.Summary != null &&
                    this.Summary.Equals(input.Summary))
                ) && 
                (
                    this.ProfitLoss == input.ProfitLoss ||
                    (this.ProfitLoss != null &&
                    this.ProfitLoss.Equals(input.ProfitLoss))
                ) && 
                (
                    this.RiskKeyFigures == input.RiskKeyFigures ||
                    (this.RiskKeyFigures != null &&
                    this.RiskKeyFigures.Equals(input.RiskKeyFigures))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Summary != null)
                {
                    hashCode = (hashCode * 59) + this.Summary.GetHashCode();
                }
                if (this.ProfitLoss != null)
                {
                    hashCode = (hashCode * 59) + this.ProfitLoss.GetHashCode();
                }
                if (this.RiskKeyFigures != null)
                {
                    hashCode = (hashCode * 59) + this.RiskKeyFigures.GetHashCode();
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
