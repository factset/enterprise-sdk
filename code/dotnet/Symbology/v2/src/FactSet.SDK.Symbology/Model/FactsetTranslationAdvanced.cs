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
    /// FactSet Translation data object.
    /// </summary>
    [DataContract(Name = "factsetTranslationAdvanced")]
    public partial class FactsetTranslationAdvanced : IEquatable<FactsetTranslationAdvanced>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FactsetTranslationAdvanced" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).</param>
        /// <param name="fsymSecurityId">FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).</param>
        /// <param name="fsymRegionalId">FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).</param>
        /// <param name="fsymListingId">FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading. Does not populate for composite ids (i.e. &#39;-USA&#39;) since these are not specified listing exchanges. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).</param>
        /// <param name="fsymEntityId">FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).</param>
        /// <param name="fsymTickerExchange">FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544)..</param>
        /// <param name="fsymTickerRegion">FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258).</param>
        /// <param name="requestId">Identifier specified in the &#x60;ids&#x60; parameter of the request..</param>
        public FactsetTranslationAdvanced(string fsymId = default(string), string fsymSecurityId = default(string), string fsymRegionalId = default(string), string fsymListingId = default(string), string fsymEntityId = default(string), string fsymTickerExchange = default(string), string fsymTickerRegion = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.FsymSecurityId = fsymSecurityId;
            this.FsymRegionalId = fsymRegionalId;
            this.FsymListingId = fsymListingId;
            this.FsymEntityId = fsymEntityId;
            this.FsymTickerExchange = fsymTickerExchange;
            this.FsymTickerRegion = fsymTickerRegion;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
        /// </summary>
        /// <value>FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
        /// </summary>
        /// <value>FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)</value>
        [DataMember(Name = "fsymSecurityId", EmitDefaultValue = false)]
        public string FsymSecurityId { get; set; }

        /// <summary>
        /// FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
        /// </summary>
        /// <value>FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)</value>
        [DataMember(Name = "fsymRegionalId", EmitDefaultValue = false)]
        public string FsymRegionalId { get; set; }

        /// <summary>
        /// FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading. Does not populate for composite ids (i.e. &#39;-USA&#39;) since these are not specified listing exchanges. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
        /// </summary>
        /// <value>FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading. Does not populate for composite ids (i.e. &#39;-USA&#39;) since these are not specified listing exchanges. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)</value>
        [DataMember(Name = "fsymListingId", EmitDefaultValue = false)]
        public string FsymListingId { get; set; }

        /// <summary>
        /// FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
        /// </summary>
        /// <value>FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)</value>
        [DataMember(Name = "fsymEntityId", EmitDefaultValue = false)]
        public string FsymEntityId { get; set; }

        /// <summary>
        /// FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544).
        /// </summary>
        /// <value>FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544).</value>
        [DataMember(Name = "fsymTickerExchange", EmitDefaultValue = false)]
        public string FsymTickerExchange { get; set; }

        /// <summary>
        /// FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258)
        /// </summary>
        /// <value>FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258)</value>
        [DataMember(Name = "fsymTickerRegion", EmitDefaultValue = false)]
        public string FsymTickerRegion { get; set; }

        /// <summary>
        /// Identifier specified in the &#x60;ids&#x60; parameter of the request.
        /// </summary>
        /// <value>Identifier specified in the &#x60;ids&#x60; parameter of the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FactsetTranslationAdvanced {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  FsymSecurityId: ").Append(FsymSecurityId).Append("\n");
            sb.Append("  FsymRegionalId: ").Append(FsymRegionalId).Append("\n");
            sb.Append("  FsymListingId: ").Append(FsymListingId).Append("\n");
            sb.Append("  FsymEntityId: ").Append(FsymEntityId).Append("\n");
            sb.Append("  FsymTickerExchange: ").Append(FsymTickerExchange).Append("\n");
            sb.Append("  FsymTickerRegion: ").Append(FsymTickerRegion).Append("\n");
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
            return this.Equals(input as FactsetTranslationAdvanced);
        }

        /// <summary>
        /// Returns true if FactsetTranslationAdvanced instances are equal
        /// </summary>
        /// <param name="input">Instance of FactsetTranslationAdvanced to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FactsetTranslationAdvanced input)
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
                    this.FsymSecurityId == input.FsymSecurityId ||
                    (this.FsymSecurityId != null &&
                    this.FsymSecurityId.Equals(input.FsymSecurityId))
                ) && 
                (
                    this.FsymRegionalId == input.FsymRegionalId ||
                    (this.FsymRegionalId != null &&
                    this.FsymRegionalId.Equals(input.FsymRegionalId))
                ) && 
                (
                    this.FsymListingId == input.FsymListingId ||
                    (this.FsymListingId != null &&
                    this.FsymListingId.Equals(input.FsymListingId))
                ) && 
                (
                    this.FsymEntityId == input.FsymEntityId ||
                    (this.FsymEntityId != null &&
                    this.FsymEntityId.Equals(input.FsymEntityId))
                ) && 
                (
                    this.FsymTickerExchange == input.FsymTickerExchange ||
                    (this.FsymTickerExchange != null &&
                    this.FsymTickerExchange.Equals(input.FsymTickerExchange))
                ) && 
                (
                    this.FsymTickerRegion == input.FsymTickerRegion ||
                    (this.FsymTickerRegion != null &&
                    this.FsymTickerRegion.Equals(input.FsymTickerRegion))
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
                if (this.FsymSecurityId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymSecurityId.GetHashCode();
                }
                if (this.FsymRegionalId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymRegionalId.GetHashCode();
                }
                if (this.FsymListingId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymListingId.GetHashCode();
                }
                if (this.FsymEntityId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymEntityId.GetHashCode();
                }
                if (this.FsymTickerExchange != null)
                {
                    hashCode = (hashCode * 59) + this.FsymTickerExchange.GetHashCode();
                }
                if (this.FsymTickerRegion != null)
                {
                    hashCode = (hashCode * 59) + this.FsymTickerRegion.GetHashCode();
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
