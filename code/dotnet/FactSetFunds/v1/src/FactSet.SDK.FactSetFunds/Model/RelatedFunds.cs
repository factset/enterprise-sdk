/*
 * FactSet Funds API
 *
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.4.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFunds.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFunds.Model
{
    /// <summary>
    /// RelatedFunds
    /// </summary>
    [DataContract(Name = "relatedFunds")]
    public partial class RelatedFunds : IEquatable<RelatedFunds>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RelatedFunds" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested..</param>
        /// <param name="relatedFundIdOne">The first related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S)..</param>
        /// <param name="relatedFundIdTwo">The second related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S)..</param>
        /// <param name="relatedFundIdThree">The third related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S)..</param>
        /// <param name="relatedFundIdFour">The fourth related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S)..</param>
        /// <param name="relatedFundIdFive">The fifth related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S)..</param>
        /// <param name="requestId">The requested Id sent as input..</param>
        public RelatedFunds(string fsymId = default(string), string relatedFundIdOne = default(string), string relatedFundIdTwo = default(string), string relatedFundIdThree = default(string), string relatedFundIdFour = default(string), string relatedFundIdFive = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.RelatedFundIdOne = relatedFundIdOne;
            this.RelatedFundIdTwo = relatedFundIdTwo;
            this.RelatedFundIdThree = relatedFundIdThree;
            this.RelatedFundIdFour = relatedFundIdFour;
            this.RelatedFundIdFive = relatedFundIdFive;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
        /// </summary>
        /// <value>FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// The first related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).
        /// </summary>
        /// <value>The first related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).</value>
        [DataMember(Name = "relatedFundIdOne", EmitDefaultValue = true)]
        public string RelatedFundIdOne { get; set; }

        /// <summary>
        /// The second related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).
        /// </summary>
        /// <value>The second related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).</value>
        [DataMember(Name = "relatedFundIdTwo", EmitDefaultValue = true)]
        public string RelatedFundIdTwo { get; set; }

        /// <summary>
        /// The third related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).
        /// </summary>
        /// <value>The third related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).</value>
        [DataMember(Name = "relatedFundIdThree", EmitDefaultValue = true)]
        public string RelatedFundIdThree { get; set; }

        /// <summary>
        /// The fourth related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).
        /// </summary>
        /// <value>The fourth related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).</value>
        [DataMember(Name = "relatedFundIdFour", EmitDefaultValue = true)]
        public string RelatedFundIdFour { get; set; }

        /// <summary>
        /// The fifth related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).
        /// </summary>
        /// <value>The fifth related fund to the requestedId returned as a FactSet Permanent Security Identifier (XXXXXX-S).</value>
        [DataMember(Name = "relatedFundIdFive", EmitDefaultValue = true)]
        public string RelatedFundIdFive { get; set; }

        /// <summary>
        /// The requested Id sent as input.
        /// </summary>
        /// <value>The requested Id sent as input.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RelatedFunds {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  RelatedFundIdOne: ").Append(RelatedFundIdOne).Append("\n");
            sb.Append("  RelatedFundIdTwo: ").Append(RelatedFundIdTwo).Append("\n");
            sb.Append("  RelatedFundIdThree: ").Append(RelatedFundIdThree).Append("\n");
            sb.Append("  RelatedFundIdFour: ").Append(RelatedFundIdFour).Append("\n");
            sb.Append("  RelatedFundIdFive: ").Append(RelatedFundIdFive).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as RelatedFunds);
        }

        /// <summary>
        /// Returns true if RelatedFunds instances are equal
        /// </summary>
        /// <param name="input">Instance of RelatedFunds to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RelatedFunds input)
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
                    this.RelatedFundIdOne == input.RelatedFundIdOne ||
                    (this.RelatedFundIdOne != null &&
                    this.RelatedFundIdOne.Equals(input.RelatedFundIdOne))
                ) && 
                (
                    this.RelatedFundIdTwo == input.RelatedFundIdTwo ||
                    (this.RelatedFundIdTwo != null &&
                    this.RelatedFundIdTwo.Equals(input.RelatedFundIdTwo))
                ) && 
                (
                    this.RelatedFundIdThree == input.RelatedFundIdThree ||
                    (this.RelatedFundIdThree != null &&
                    this.RelatedFundIdThree.Equals(input.RelatedFundIdThree))
                ) && 
                (
                    this.RelatedFundIdFour == input.RelatedFundIdFour ||
                    (this.RelatedFundIdFour != null &&
                    this.RelatedFundIdFour.Equals(input.RelatedFundIdFour))
                ) && 
                (
                    this.RelatedFundIdFive == input.RelatedFundIdFive ||
                    (this.RelatedFundIdFive != null &&
                    this.RelatedFundIdFive.Equals(input.RelatedFundIdFive))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.RelatedFundIdOne != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedFundIdOne.GetHashCode();
                }
                if (this.RelatedFundIdTwo != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedFundIdTwo.GetHashCode();
                }
                if (this.RelatedFundIdThree != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedFundIdThree.GetHashCode();
                }
                if (this.RelatedFundIdFour != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedFundIdFour.GetHashCode();
                }
                if (this.RelatedFundIdFive != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedFundIdFive.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
