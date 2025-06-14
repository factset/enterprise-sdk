/*
 * FactSet Entity API
 *
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities.<p><b>Rate limit is set to 10 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.5.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEntity.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEntity.Model
{
    /// <summary>
    /// CreditParent
    /// </summary>
    [DataContract(Name = "creditParent")]
    public partial class CreditParent : IEquatable<CreditParent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreditParent" /> class.
        /// </summary>
        /// <param name="fsymId">Unique FactSet-generated identifier representing an entity for the current entity identifier (-E).</param>
        /// <param name="requestId">Identifier used in &#x60;ids&#x60;..</param>
        /// <param name="entityProperName">The proper name for the credit parent entity..</param>
        /// <param name="factsetCreditParentId">This id represents the credit parent entity id..</param>
        /// <param name="asOfDate">The effective date of this record in YYYY-MM-DD format. If an asOfDate is not specified in the request, this field will be null in the response..</param>
        /// <param name="effectiveStartDate">The initial effective date of this record in YYYY-MM-DD format..</param>
        /// <param name="effectiveEndDate">The last day on which this record is effective date in YYYY-MM-DD format..</param>
        public CreditParent(string fsymId = default(string), string requestId = default(string), string entityProperName = default(string), string factsetCreditParentId = default(string), DateTime? asOfDate = default(DateTime?), DateTime? effectiveStartDate = default(DateTime?), DateTime? effectiveEndDate = default(DateTime?))
        {
            this.FsymId = fsymId;
            this.RequestId = requestId;
            this.EntityProperName = entityProperName;
            this.FactsetCreditParentId = factsetCreditParentId;
            this.AsOfDate = asOfDate;
            this.EffectiveStartDate = effectiveStartDate;
            this.EffectiveEndDate = effectiveEndDate;
        }

        /// <summary>
        /// Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)
        /// </summary>
        /// <value>Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Identifier used in &#x60;ids&#x60;.
        /// </summary>
        /// <value>Identifier used in &#x60;ids&#x60;.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// The proper name for the credit parent entity.
        /// </summary>
        /// <value>The proper name for the credit parent entity.</value>
        [DataMember(Name = "entityProperName", EmitDefaultValue = true)]
        public string EntityProperName { get; set; }

        /// <summary>
        /// This id represents the credit parent entity id.
        /// </summary>
        /// <value>This id represents the credit parent entity id.</value>
        [DataMember(Name = "factsetCreditParentId", EmitDefaultValue = true)]
        public string FactsetCreditParentId { get; set; }

        /// <summary>
        /// The effective date of this record in YYYY-MM-DD format. If an asOfDate is not specified in the request, this field will be null in the response.
        /// </summary>
        /// <value>The effective date of this record in YYYY-MM-DD format. If an asOfDate is not specified in the request, this field will be null in the response.</value>
        [DataMember(Name = "asOfDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? AsOfDate { get; set; }

        /// <summary>
        /// The initial effective date of this record in YYYY-MM-DD format.
        /// </summary>
        /// <value>The initial effective date of this record in YYYY-MM-DD format.</value>
        [DataMember(Name = "effectiveStartDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? EffectiveStartDate { get; set; }

        /// <summary>
        /// The last day on which this record is effective date in YYYY-MM-DD format.
        /// </summary>
        /// <value>The last day on which this record is effective date in YYYY-MM-DD format.</value>
        [DataMember(Name = "effectiveEndDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? EffectiveEndDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreditParent {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  EntityProperName: ").Append(EntityProperName).Append("\n");
            sb.Append("  FactsetCreditParentId: ").Append(FactsetCreditParentId).Append("\n");
            sb.Append("  AsOfDate: ").Append(AsOfDate).Append("\n");
            sb.Append("  EffectiveStartDate: ").Append(EffectiveStartDate).Append("\n");
            sb.Append("  EffectiveEndDate: ").Append(EffectiveEndDate).Append("\n");
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
            return this.Equals(input as CreditParent);
        }

        /// <summary>
        /// Returns true if CreditParent instances are equal
        /// </summary>
        /// <param name="input">Instance of CreditParent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreditParent input)
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
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.EntityProperName == input.EntityProperName ||
                    (this.EntityProperName != null &&
                    this.EntityProperName.Equals(input.EntityProperName))
                ) && 
                (
                    this.FactsetCreditParentId == input.FactsetCreditParentId ||
                    (this.FactsetCreditParentId != null &&
                    this.FactsetCreditParentId.Equals(input.FactsetCreditParentId))
                ) && 
                (
                    this.AsOfDate == input.AsOfDate ||
                    (this.AsOfDate != null &&
                    this.AsOfDate.Equals(input.AsOfDate))
                ) && 
                (
                    this.EffectiveStartDate == input.EffectiveStartDate ||
                    (this.EffectiveStartDate != null &&
                    this.EffectiveStartDate.Equals(input.EffectiveStartDate))
                ) && 
                (
                    this.EffectiveEndDate == input.EffectiveEndDate ||
                    (this.EffectiveEndDate != null &&
                    this.EffectiveEndDate.Equals(input.EffectiveEndDate))
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
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.EntityProperName != null)
                {
                    hashCode = (hashCode * 59) + this.EntityProperName.GetHashCode();
                }
                if (this.FactsetCreditParentId != null)
                {
                    hashCode = (hashCode * 59) + this.FactsetCreditParentId.GetHashCode();
                }
                if (this.AsOfDate != null)
                {
                    hashCode = (hashCode * 59) + this.AsOfDate.GetHashCode();
                }
                if (this.EffectiveStartDate != null)
                {
                    hashCode = (hashCode * 59) + this.EffectiveStartDate.GetHashCode();
                }
                if (this.EffectiveEndDate != null)
                {
                    hashCode = (hashCode * 59) + this.EffectiveEndDate.GetHashCode();
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
