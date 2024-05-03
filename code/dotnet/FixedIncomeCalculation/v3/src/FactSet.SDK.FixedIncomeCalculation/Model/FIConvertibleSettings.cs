/*
 * FI API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.0
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
using OpenAPIDateConverter = FactSet.SDK.FixedIncomeCalculation.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FixedIncomeCalculation.Model
{
    /// <summary>
    /// FIConvertibleSettings
    /// </summary>
    [DataContract(Name = "FIConvertibleSettings")]
    public partial class FIConvertibleSettings : IEquatable<FIConvertibleSettings>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FIConvertibleSettings" /> class.
        /// </summary>
        /// <param name="equityPrice">Equity Price.</param>
        /// <param name="equityIndexVolatility">Equity Index Volatility.</param>
        public FIConvertibleSettings(double? equityPrice = default(double?), double? equityIndexVolatility = default(double?))
        {
            this.EquityPrice = equityPrice;
            this.EquityIndexVolatility = equityIndexVolatility;
        }

        /// <summary>
        /// Equity Price
        /// </summary>
        /// <value>Equity Price</value>
        [DataMember(Name = "equityPrice", EmitDefaultValue = true)]
        public double? EquityPrice { get; set; }

        /// <summary>
        /// Equity Index Volatility
        /// </summary>
        /// <value>Equity Index Volatility</value>
        [DataMember(Name = "equityIndexVolatility", EmitDefaultValue = true)]
        public double? EquityIndexVolatility { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FIConvertibleSettings {\n");
            sb.Append("  EquityPrice: ").Append(EquityPrice).Append("\n");
            sb.Append("  EquityIndexVolatility: ").Append(EquityIndexVolatility).Append("\n");
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
            return this.Equals(input as FIConvertibleSettings);
        }

        /// <summary>
        /// Returns true if FIConvertibleSettings instances are equal
        /// </summary>
        /// <param name="input">Instance of FIConvertibleSettings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FIConvertibleSettings input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.EquityPrice == input.EquityPrice ||
                    (this.EquityPrice != null &&
                    this.EquityPrice.Equals(input.EquityPrice))
                ) && 
                (
                    this.EquityIndexVolatility == input.EquityIndexVolatility ||
                    (this.EquityIndexVolatility != null &&
                    this.EquityIndexVolatility.Equals(input.EquityIndexVolatility))
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
                if (this.EquityPrice != null)
                {
                    hashCode = (hashCode * 59) + this.EquityPrice.GetHashCode();
                }
                if (this.EquityIndexVolatility != null)
                {
                    hashCode = (hashCode * 59) + this.EquityIndexVolatility.GetHashCode();
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
