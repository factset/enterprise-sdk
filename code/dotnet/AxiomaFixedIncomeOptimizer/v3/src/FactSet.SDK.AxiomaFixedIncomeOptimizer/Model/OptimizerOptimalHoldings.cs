/*
 * AFI Optimizer API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.AxiomaFixedIncomeOptimizer.Client.OpenAPIDateConverter;

namespace FactSet.SDK.AxiomaFixedIncomeOptimizer.Model
{
    /// <summary>
    /// OptimizerOptimalHoldings
    /// </summary>
    [DataContract(Name = "OptimizerOptimalHoldings")]
    public partial class OptimizerOptimalHoldings : IEquatable<OptimizerOptimalHoldings>, IValidatableObject
    {
        /// <summary>
        /// Identifier type
        /// </summary>
        /// <value>Identifier type</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum IdentifierTypeEnum
        {
            /// <summary>
            /// Enum Asset for value: Asset
            /// </summary>
            [EnumMember(Value = "Asset")]
            Asset = 1,

            /// <summary>
            /// Enum Cusip for value: Cusip
            /// </summary>
            [EnumMember(Value = "Cusip")]
            Cusip = 2,

            /// <summary>
            /// Enum Isin for value: Isin
            /// </summary>
            [EnumMember(Value = "Isin")]
            Isin = 3,

            /// <summary>
            /// Enum RiskModel for value: RiskModel
            /// </summary>
            [EnumMember(Value = "RiskModel")]
            RiskModel = 4,

            /// <summary>
            /// Enum SedolChk for value: SedolChk
            /// </summary>
            [EnumMember(Value = "SedolChk")]
            SedolChk = 5,

            /// <summary>
            /// Enum Sedol for value: Sedol
            /// </summary>
            [EnumMember(Value = "Sedol")]
            Sedol = 6,

            /// <summary>
            /// Enum SymbologyCusip for value: SymbologyCusip
            /// </summary>
            [EnumMember(Value = "SymbologyCusip")]
            SymbologyCusip = 7,

            /// <summary>
            /// Enum Ticker for value: Ticker
            /// </summary>
            [EnumMember(Value = "Ticker")]
            Ticker = 8,

            /// <summary>
            /// Enum TickerRegion for value: TickerRegion
            /// </summary>
            [EnumMember(Value = "TickerRegion")]
            TickerRegion = 9,

            /// <summary>
            /// Enum User for value: User
            /// </summary>
            [EnumMember(Value = "User")]
            User = 10

        }


        /// <summary>
        /// Identifier type
        /// </summary>
        /// <value>Identifier type</value>
        [DataMember(Name = "identifierType", EmitDefaultValue = false)]
        public IdentifierTypeEnum? IdentifierType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerOptimalHoldings" /> class.
        /// </summary>
        /// <param name="identifierType">Identifier type.</param>
        /// <param name="includeCash">Include cash.</param>
        /// <param name="excludeZero">Exclude zero.</param>
        public OptimizerOptimalHoldings(IdentifierTypeEnum? identifierType = default(IdentifierTypeEnum?), bool includeCash = default(bool), bool excludeZero = default(bool))
        {
            this.IdentifierType = identifierType;
            this.IncludeCash = includeCash;
            this.ExcludeZero = excludeZero;
        }

        /// <summary>
        /// Include cash
        /// </summary>
        /// <value>Include cash</value>
        [DataMember(Name = "includeCash", EmitDefaultValue = true)]
        public bool IncludeCash { get; set; }

        /// <summary>
        /// Exclude zero
        /// </summary>
        /// <value>Exclude zero</value>
        [DataMember(Name = "excludeZero", EmitDefaultValue = true)]
        public bool ExcludeZero { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerOptimalHoldings {\n");
            sb.Append("  IdentifierType: ").Append(IdentifierType).Append("\n");
            sb.Append("  IncludeCash: ").Append(IncludeCash).Append("\n");
            sb.Append("  ExcludeZero: ").Append(ExcludeZero).Append("\n");
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
            return this.Equals(input as OptimizerOptimalHoldings);
        }

        /// <summary>
        /// Returns true if OptimizerOptimalHoldings instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerOptimalHoldings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerOptimalHoldings input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IdentifierType == input.IdentifierType ||
                    this.IdentifierType.Equals(input.IdentifierType)
                ) && 
                (
                    this.IncludeCash == input.IncludeCash ||
                    this.IncludeCash.Equals(input.IncludeCash)
                ) && 
                (
                    this.ExcludeZero == input.ExcludeZero ||
                    this.ExcludeZero.Equals(input.ExcludeZero)
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
                hashCode = (hashCode * 59) + this.IdentifierType.GetHashCode();
                hashCode = (hashCode * 59) + this.IncludeCash.GetHashCode();
                hashCode = (hashCode * 59) + this.ExcludeZero.GetHashCode();
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
