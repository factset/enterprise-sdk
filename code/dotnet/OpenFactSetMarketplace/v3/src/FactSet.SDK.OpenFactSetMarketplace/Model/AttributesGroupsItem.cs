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
    /// Attribute group object
    /// </summary>
    [DataContract(Name = "AttributesGroupsItem")]
    public partial class AttributesGroupsItem : IEquatable<AttributesGroupsItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AttributesGroupsItem" /> class.
        /// </summary>
        /// <param name="key">Attribute group key, corresponding to a category of attributes. For example, &#39;Region&#39; or &#39;History&#39;..</param>
        /// <param name="value">Attribute group value, corresponding to a specific attribute within the category. For example, &#39;North America&#39; or &#39;10 + years&#39;..</param>
        /// <param name="isPreviewTag">Boolean flag indicating whether the attribute&#39;s value is displayed on the product&#39;s card within the Open:FactSet Marketplace..</param>
        public AttributesGroupsItem(string key = default(string), string value = default(string), bool isPreviewTag = default(bool))
        {
            this.Key = key;
            this.Value = value;
            this.IsPreviewTag = isPreviewTag;
        }

        /// <summary>
        /// Attribute group key, corresponding to a category of attributes. For example, &#39;Region&#39; or &#39;History&#39;.
        /// </summary>
        /// <value>Attribute group key, corresponding to a category of attributes. For example, &#39;Region&#39; or &#39;History&#39;.</value>
        [DataMember(Name = "key", EmitDefaultValue = false)]
        public string Key { get; set; }

        /// <summary>
        /// Attribute group value, corresponding to a specific attribute within the category. For example, &#39;North America&#39; or &#39;10 + years&#39;.
        /// </summary>
        /// <value>Attribute group value, corresponding to a specific attribute within the category. For example, &#39;North America&#39; or &#39;10 + years&#39;.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Boolean flag indicating whether the attribute&#39;s value is displayed on the product&#39;s card within the Open:FactSet Marketplace.
        /// </summary>
        /// <value>Boolean flag indicating whether the attribute&#39;s value is displayed on the product&#39;s card within the Open:FactSet Marketplace.</value>
        [DataMember(Name = "isPreviewTag", EmitDefaultValue = true)]
        public bool IsPreviewTag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AttributesGroupsItem {\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  IsPreviewTag: ").Append(IsPreviewTag).Append("\n");
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
            return this.Equals(input as AttributesGroupsItem);
        }

        /// <summary>
        /// Returns true if AttributesGroupsItem instances are equal
        /// </summary>
        /// <param name="input">Instance of AttributesGroupsItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AttributesGroupsItem input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.IsPreviewTag == input.IsPreviewTag ||
                    this.IsPreviewTag.Equals(input.IsPreviewTag)
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
                if (this.Key != null)
                {
                    hashCode = (hashCode * 59) + this.Key.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsPreviewTag.GetHashCode();
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
