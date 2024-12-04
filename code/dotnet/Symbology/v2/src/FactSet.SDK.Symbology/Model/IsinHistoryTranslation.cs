/*
 * FactSet Symbology API
 *
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.3
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
using OpenAPIDateConverter = FactSet.SDK.Symbology.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Symbology.Model
{
    /// <summary>
    /// ISIN History Translation data object.
    /// </summary>
    [DataContract(Name = "isinHistoryTranslation")]
    public partial class IsinHistoryTranslation : IEquatable<IsinHistoryTranslation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IsinHistoryTranslation" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).</param>
        /// <param name="name">Proper Name of company or issuer..</param>
        /// <param name="isin">ISIN.</param>
        /// <param name="isinEffectiveStartDate">ISIN effective start date in YYYY-MM-DD format..</param>
        /// <param name="isinEffectiveEndDate">ISIN effective end date in YYYY-MM-DD format. Null if still active..</param>
        /// <param name="asOfDate">As of Date in YYYY-MM-DD format..</param>
        /// <param name="requestId">Identifier specified in the request.</param>
        public IsinHistoryTranslation(string fsymId = default(string), string name = default(string), string isin = default(string), DateTime isinEffectiveStartDate = default(DateTime), DateTime isinEffectiveEndDate = default(DateTime), DateTime asOfDate = default(DateTime), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Name = name;
            this.Isin = isin;
            this.IsinEffectiveStartDate = isinEffectiveStartDate;
            this.IsinEffectiveEndDate = isinEffectiveEndDate;
            this.AsOfDate = asOfDate;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
        /// </summary>
        /// <value>FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// Proper Name of company or issuer.
        /// </summary>
        /// <value>Proper Name of company or issuer.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// ISIN
        /// </summary>
        /// <value>ISIN</value>
        [DataMember(Name = "isin", EmitDefaultValue = false)]
        public string Isin { get; set; }

        /// <summary>
        /// ISIN effective start date in YYYY-MM-DD format.
        /// </summary>
        /// <value>ISIN effective start date in YYYY-MM-DD format.</value>
        [DataMember(Name = "isinEffectiveStartDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime IsinEffectiveStartDate { get; set; }

        /// <summary>
        /// ISIN effective end date in YYYY-MM-DD format. Null if still active.
        /// </summary>
        /// <value>ISIN effective end date in YYYY-MM-DD format. Null if still active.</value>
        [DataMember(Name = "isinEffectiveEndDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime IsinEffectiveEndDate { get; set; }

        /// <summary>
        /// As of Date in YYYY-MM-DD format.
        /// </summary>
        /// <value>As of Date in YYYY-MM-DD format.</value>
        [DataMember(Name = "asOfDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime AsOfDate { get; set; }

        /// <summary>
        /// Identifier specified in the request
        /// </summary>
        /// <value>Identifier specified in the request</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IsinHistoryTranslation {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Isin: ").Append(Isin).Append("\n");
            sb.Append("  IsinEffectiveStartDate: ").Append(IsinEffectiveStartDate).Append("\n");
            sb.Append("  IsinEffectiveEndDate: ").Append(IsinEffectiveEndDate).Append("\n");
            sb.Append("  AsOfDate: ").Append(AsOfDate).Append("\n");
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
            return this.Equals(input as IsinHistoryTranslation);
        }

        /// <summary>
        /// Returns true if IsinHistoryTranslation instances are equal
        /// </summary>
        /// <param name="input">Instance of IsinHistoryTranslation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IsinHistoryTranslation input)
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
                    this.Isin == input.Isin ||
                    (this.Isin != null &&
                    this.Isin.Equals(input.Isin))
                ) && 
                (
                    this.IsinEffectiveStartDate == input.IsinEffectiveStartDate ||
                    (this.IsinEffectiveStartDate != null &&
                    this.IsinEffectiveStartDate.Equals(input.IsinEffectiveStartDate))
                ) && 
                (
                    this.IsinEffectiveEndDate == input.IsinEffectiveEndDate ||
                    (this.IsinEffectiveEndDate != null &&
                    this.IsinEffectiveEndDate.Equals(input.IsinEffectiveEndDate))
                ) && 
                (
                    this.AsOfDate == input.AsOfDate ||
                    (this.AsOfDate != null &&
                    this.AsOfDate.Equals(input.AsOfDate))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Isin != null)
                {
                    hashCode = (hashCode * 59) + this.Isin.GetHashCode();
                }
                if (this.IsinEffectiveStartDate != null)
                {
                    hashCode = (hashCode * 59) + this.IsinEffectiveStartDate.GetHashCode();
                }
                if (this.IsinEffectiveEndDate != null)
                {
                    hashCode = (hashCode * 59) + this.IsinEffectiveEndDate.GetHashCode();
                }
                if (this.AsOfDate != null)
                {
                    hashCode = (hashCode * 59) + this.AsOfDate.GetHashCode();
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
