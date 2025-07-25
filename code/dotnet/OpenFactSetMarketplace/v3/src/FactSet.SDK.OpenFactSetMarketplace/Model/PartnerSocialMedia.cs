/*
 * Open:FactSet Marketplace API
 *
 * This API provides read-only access to marketplace products and partners.
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
using OpenAPIDateConverter = FactSet.SDK.OpenFactSetMarketplace.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenFactSetMarketplace.Model
{
    /// <summary>
    /// Partner social media URLs
    /// </summary>
    [DataContract(Name = "Partner_socialMedia")]
    public partial class PartnerSocialMedia : IEquatable<PartnerSocialMedia>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PartnerSocialMedia" /> class.
        /// </summary>
        /// <param name="linkedin">Partner LinkedIn URL.</param>
        /// <param name="x">Partner X URL.</param>
        /// <param name="facebook">Partner Facebook URL.</param>
        public PartnerSocialMedia(string linkedin = default(string), string x = default(string), string facebook = default(string))
        {
            this.Linkedin = linkedin;
            this.X = x;
            this.Facebook = facebook;
        }

        /// <summary>
        /// Partner LinkedIn URL
        /// </summary>
        /// <value>Partner LinkedIn URL</value>
        [DataMember(Name = "linkedin", EmitDefaultValue = false)]
        public string Linkedin { get; set; }

        /// <summary>
        /// Partner X URL
        /// </summary>
        /// <value>Partner X URL</value>
        [DataMember(Name = "x", EmitDefaultValue = false)]
        public string X { get; set; }

        /// <summary>
        /// Partner Facebook URL
        /// </summary>
        /// <value>Partner Facebook URL</value>
        [DataMember(Name = "facebook", EmitDefaultValue = false)]
        public string Facebook { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PartnerSocialMedia {\n");
            sb.Append("  Linkedin: ").Append(Linkedin).Append("\n");
            sb.Append("  X: ").Append(X).Append("\n");
            sb.Append("  Facebook: ").Append(Facebook).Append("\n");
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
            return this.Equals(input as PartnerSocialMedia);
        }

        /// <summary>
        /// Returns true if PartnerSocialMedia instances are equal
        /// </summary>
        /// <param name="input">Instance of PartnerSocialMedia to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PartnerSocialMedia input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Linkedin == input.Linkedin ||
                    (this.Linkedin != null &&
                    this.Linkedin.Equals(input.Linkedin))
                ) && 
                (
                    this.X == input.X ||
                    (this.X != null &&
                    this.X.Equals(input.X))
                ) && 
                (
                    this.Facebook == input.Facebook ||
                    (this.Facebook != null &&
                    this.Facebook.Equals(input.Facebook))
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
                if (this.Linkedin != null)
                {
                    hashCode = (hashCode * 59) + this.Linkedin.GetHashCode();
                }
                if (this.X != null)
                {
                    hashCode = (hashCode * 59) + this.X.GetHashCode();
                }
                if (this.Facebook != null)
                {
                    hashCode = (hashCode * 59) + this.Facebook.GetHashCode();
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
