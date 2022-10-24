/*
 * FactSet Symbology API
 *
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and LEIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs.</p> 
 *
 * The version of the OpenAPI document: 3.0.0
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
    /// Identifier Resolution data object.
    /// </summary>
    [DataContract(Name = "identifierResolution")]
    public partial class IdentifierResolution : Dictionary<String, string>, IEquatable<IdentifierResolution>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IdentifierResolution" /> class.
        /// </summary>
        /// <param name="requestId">Identifier inputted in the request..</param>
        /// <param name="inputSymbolType">The type of identifier inputted in the request.</param>
        public IdentifierResolution(string requestId = default(string), string inputSymbolType = default(string)) : base()
        {
            this.RequestId = requestId;
            this.InputSymbolType = inputSymbolType;
        }

        /// <summary>
        /// Identifier inputted in the request.
        /// </summary>
        /// <value>Identifier inputted in the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// The type of identifier inputted in the request
        /// </summary>
        /// <value>The type of identifier inputted in the request</value>
        [DataMember(Name = "inputSymbolType", EmitDefaultValue = false)]
        public string InputSymbolType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IdentifierResolution {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  InputSymbolType: ").Append(InputSymbolType).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
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
            return this.Equals(input as IdentifierResolution);
        }

        /// <summary>
        /// Returns true if IdentifierResolution instances are equal
        /// </summary>
        /// <param name="input">Instance of IdentifierResolution to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IdentifierResolution input)
        {
            if (input == null)
            {
                return false;
            }
            return base.Equals(input) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && base.Equals(input) && 
                (
                    this.InputSymbolType == input.InputSymbolType ||
                    (this.InputSymbolType != null &&
                    this.InputSymbolType.Equals(input.InputSymbolType))
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
                int hashCode = base.GetHashCode();
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.InputSymbolType != null)
                {
                    hashCode = (hashCode * 59) + this.InputSymbolType.GetHashCode();
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