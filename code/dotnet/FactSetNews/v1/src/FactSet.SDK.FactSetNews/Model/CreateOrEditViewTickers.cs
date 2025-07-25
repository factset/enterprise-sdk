/*
 * News API
 *
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
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
using OpenAPIDateConverter = FactSet.SDK.FactSetNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetNews.Model
{
    /// <summary>
    /// CreateOrEditViewTickers
    /// </summary>
    [DataContract(Name = "CreateOrEditViewTickers")]
    public partial class CreateOrEditViewTickers : IEquatable<CreateOrEditViewTickers>, IValidatableObject
    {
        /// <summary>
        /// The type of the asset associated with the ticker.
        /// </summary>
        /// <value>The type of the asset associated with the ticker.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Index for value: Index
            /// </summary>
            [EnumMember(Value = "Index")]
            Index = 1,

            /// <summary>
            /// Enum ETF for value: ETF
            /// </summary>
            [EnumMember(Value = "ETF")]
            ETF = 2,

            /// <summary>
            /// Enum MutualFund for value: Mutual_Fund
            /// </summary>
            [EnumMember(Value = "Mutual_Fund")]
            MutualFund = 3,

            /// <summary>
            /// Enum Portfolios for value: Portfolios
            /// </summary>
            [EnumMember(Value = "Portfolios")]
            Portfolios = 4,

            /// <summary>
            /// Enum Equity for value: Equity
            /// </summary>
            [EnumMember(Value = "Equity")]
            Equity = 5,

            /// <summary>
            /// Enum PrivateCompanies for value: privateCompanies
            /// </summary>
            [EnumMember(Value = "privateCompanies")]
            PrivateCompanies = 6,

            /// <summary>
            /// Enum FixedIncome for value: Fixed_Income
            /// </summary>
            [EnumMember(Value = "Fixed_Income")]
            FixedIncome = 7,

            /// <summary>
            /// Enum Holder for value: Holder
            /// </summary>
            [EnumMember(Value = "Holder")]
            Holder = 8

        }


        /// <summary>
        /// The type of the asset associated with the ticker.
        /// </summary>
        /// <value>The type of the asset associated with the ticker.</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateOrEditViewTickers" /> class.
        /// </summary>
        /// <param name="name">Name of the ticker..</param>
        /// <param name="value">The ticker symbol..</param>
        /// <param name="type">The type of the asset associated with the ticker..</param>
        public CreateOrEditViewTickers(string name = default(string), string value = default(string), TypeEnum? type = default(TypeEnum?))
        {
            this.Name = name;
            this.Value = value;
            this.Type = type;
        }

        /// <summary>
        /// Name of the ticker.
        /// </summary>
        /// <value>Name of the ticker.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The ticker symbol.
        /// </summary>
        /// <value>The ticker symbol.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateOrEditViewTickers {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as CreateOrEditViewTickers);
        }

        /// <summary>
        /// Returns true if CreateOrEditViewTickers instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateOrEditViewTickers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateOrEditViewTickers input)
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
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
