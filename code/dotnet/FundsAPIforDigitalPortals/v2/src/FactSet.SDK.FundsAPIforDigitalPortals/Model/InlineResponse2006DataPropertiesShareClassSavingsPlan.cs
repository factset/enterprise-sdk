/*
 * Funds API For Digital Portals
 *
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.FundsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FundsAPIforDigitalPortals.Model
{
    /// <summary>
    /// InlineResponse2006DataPropertiesShareClassSavingsPlan
    /// </summary>
    [DataContract(Name = "inline_response_200_6_data_properties_shareClass_savingsPlan")]
    public partial class InlineResponse2006DataPropertiesShareClassSavingsPlan : IEquatable<InlineResponse2006DataPropertiesShareClassSavingsPlan>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2006DataPropertiesShareClassSavingsPlan" /> class.
        /// </summary>
        /// <param name="country">country.</param>
        /// <param name="hasSavingsPlan">If true, a savings plan is available..</param>
        /// <param name="frequency">frequency.</param>
        public InlineResponse2006DataPropertiesShareClassSavingsPlan(InlineResponse2006DataPropertiesShareClassCountry country = default(InlineResponse2006DataPropertiesShareClassCountry), bool hasSavingsPlan = default(bool), InlineResponse2006DataPropertiesShareClassFrequency frequency = default(InlineResponse2006DataPropertiesShareClassFrequency))
        {
            this.Country = country;
            this.HasSavingsPlan = hasSavingsPlan;
            this.Frequency = frequency;
        }

        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public InlineResponse2006DataPropertiesShareClassCountry Country { get; set; }

        /// <summary>
        /// If true, a savings plan is available.
        /// </summary>
        /// <value>If true, a savings plan is available.</value>
        [DataMember(Name = "hasSavingsPlan", EmitDefaultValue = true)]
        public bool HasSavingsPlan { get; set; }

        /// <summary>
        /// Gets or Sets Frequency
        /// </summary>
        [DataMember(Name = "frequency", EmitDefaultValue = false)]
        public InlineResponse2006DataPropertiesShareClassFrequency Frequency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2006DataPropertiesShareClassSavingsPlan {\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  HasSavingsPlan: ").Append(HasSavingsPlan).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
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
            return this.Equals(input as InlineResponse2006DataPropertiesShareClassSavingsPlan);
        }

        /// <summary>
        /// Returns true if InlineResponse2006DataPropertiesShareClassSavingsPlan instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2006DataPropertiesShareClassSavingsPlan to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2006DataPropertiesShareClassSavingsPlan input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.HasSavingsPlan == input.HasSavingsPlan ||
                    this.HasSavingsPlan.Equals(input.HasSavingsPlan)
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
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
                if (this.Country != null)
                {
                    hashCode = (hashCode * 59) + this.Country.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.HasSavingsPlan.GetHashCode();
                if (this.Frequency != null)
                {
                    hashCode = (hashCode * 59) + this.Frequency.GetHashCode();
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
