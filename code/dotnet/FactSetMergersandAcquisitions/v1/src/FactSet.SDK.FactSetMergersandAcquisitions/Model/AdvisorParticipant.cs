/*
 * FactSet Mergers and Acquisitions API
 *
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetMergersandAcquisitions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetMergersandAcquisitions.Model
{
    /// <summary>
    /// Advisor Participant Object
    /// </summary>
    [DataContract(Name = "AdvisorParticipant")]
    public partial class AdvisorParticipant : IEquatable<AdvisorParticipant>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdvisorParticipant" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Permanent Identifier of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E). Null values indicate that no data is available..</param>
        /// <param name="name">Entity name of the advisor. Null values indicate that no data is available..</param>
        /// <param name="fees">Fees of the advisor. All values in millions of USD. Null values indicate that no data is available..</param>
        public AdvisorParticipant(string fsymId = default(string), string name = default(string), decimal? fees = default(decimal?))
        {
            this.FsymId = fsymId;
            this.Name = name;
            this.Fees = fees;
        }

        /// <summary>
        /// FactSet Permanent Identifier of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E). Null values indicate that no data is available.
        /// </summary>
        /// <value>FactSet Permanent Identifier of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E). Null values indicate that no data is available.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Entity name of the advisor. Null values indicate that no data is available.
        /// </summary>
        /// <value>Entity name of the advisor. Null values indicate that no data is available.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Fees of the advisor. All values in millions of USD. Null values indicate that no data is available.
        /// </summary>
        /// <value>Fees of the advisor. All values in millions of USD. Null values indicate that no data is available.</value>
        [DataMember(Name = "fees", EmitDefaultValue = true)]
        public decimal? Fees { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AdvisorParticipant {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Fees: ").Append(Fees).Append("\n");
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
            return this.Equals(input as AdvisorParticipant);
        }

        /// <summary>
        /// Returns true if AdvisorParticipant instances are equal
        /// </summary>
        /// <param name="input">Instance of AdvisorParticipant to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdvisorParticipant input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Fees == input.Fees ||
                    (this.Fees != null &&
                    this.Fees.Equals(input.Fees))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Fees != null)
                {
                    hashCode = (hashCode * 59) + this.Fees.GetHashCode();
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
