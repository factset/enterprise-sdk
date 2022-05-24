/*
 * Company Logo API For Digital Portals
 *
 * Consume FactSet-collected company logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Functional APIs.
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
using OpenAPIDateConverter = FactSet.SDK.CompanyLogoAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.CompanyLogoAPIforDigitalPortals.Model
{
    /// <summary>
    /// Large logo.
    /// </summary>
    [DataContract(Name = "inline_response_200_data_large")]
    public partial class InlineResponse200DataLarge : IEquatable<InlineResponse200DataLarge>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200DataLarge" /> class.
        /// </summary>
        /// <param name="url">URL of the logo..</param>
        /// <param name="mimeType">MIME type of the logo..</param>
        public InlineResponse200DataLarge(string url = default(string), string mimeType = default(string))
        {
            this.Url = url;
            this.MimeType = mimeType;
        }

        /// <summary>
        /// URL of the logo.
        /// </summary>
        /// <value>URL of the logo.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// MIME type of the logo.
        /// </summary>
        /// <value>MIME type of the logo.</value>
        [DataMember(Name = "mimeType", EmitDefaultValue = false)]
        public string MimeType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200DataLarge {\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  MimeType: ").Append(MimeType).Append("\n");
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
            return this.Equals(input as InlineResponse200DataLarge);
        }

        /// <summary>
        /// Returns true if InlineResponse200DataLarge instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200DataLarge to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200DataLarge input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.MimeType == input.MimeType ||
                    (this.MimeType != null &&
                    this.MimeType.Equals(input.MimeType))
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
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.MimeType != null)
                {
                    hashCode = (hashCode * 59) + this.MimeType.GetHashCode();
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