/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.IRNConfiguration.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNConfiguration.Model
{
    /// <summary>
    /// SaveCustomSymbolTypeDto
    /// </summary>
    [DataContract(Name = "SaveCustomSymbolTypeDto")]
    public partial class SaveCustomSymbolTypeDto : IEquatable<SaveCustomSymbolTypeDto>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets DueDiligenceSymbolEntityType
        /// </summary>
        [DataMember(Name = "dueDiligenceSymbolEntityType", EmitDefaultValue = false)]
        public EntityType? DueDiligenceSymbolEntityType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SaveCustomSymbolTypeDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SaveCustomSymbolTypeDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SaveCustomSymbolTypeDto" /> class.
        /// </summary>
        /// <param name="name">name (required).</param>
        /// <param name="hideAddressField">hideAddressField.</param>
        /// <param name="hideSymbolSubtype">hideSymbolSubtype.</param>
        /// <param name="isDefault">isDefault (default to false).</param>
        /// <param name="dueDiligenceSymbolEntityType">dueDiligenceSymbolEntityType.</param>
        /// <param name="subTypes">subTypes.</param>
        /// <param name="customFieldIds">customFieldIds.</param>
        public SaveCustomSymbolTypeDto(string name,bool hideAddressField = default(bool), bool hideSymbolSubtype = default(bool), bool isDefault = false, EntityType dueDiligenceSymbolEntityType = default(EntityType), List<string> subTypes = default(List<string>), List<Guid> customFieldIds = default(List<Guid>))
        {
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for SaveCustomSymbolTypeDto and cannot be null");
            }
            this.Name = name;
            this.HideAddressField = hideAddressField;
            this.HideSymbolSubtype = hideSymbolSubtype;
            this.IsDefault = isDefault;
            this.DueDiligenceSymbolEntityType = dueDiligenceSymbolEntityType;
            this.SubTypes = subTypes;
            this.CustomFieldIds = customFieldIds;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets HideAddressField
        /// </summary>
        [DataMember(Name = "hideAddressField", EmitDefaultValue = true)]
        public bool HideAddressField { get; set; }

        /// <summary>
        /// Gets or Sets HideSymbolSubtype
        /// </summary>
        [DataMember(Name = "hideSymbolSubtype", EmitDefaultValue = true)]
        public bool HideSymbolSubtype { get; set; }

        /// <summary>
        /// Gets or Sets IsDefault
        /// </summary>
        [DataMember(Name = "isDefault", EmitDefaultValue = true)]
        public bool IsDefault { get; set; }

        /// <summary>
        /// Gets or Sets SubTypes
        /// </summary>
        [DataMember(Name = "subTypes", EmitDefaultValue = true)]
        public List<string> SubTypes { get; set; }

        /// <summary>
        /// Gets or Sets CustomFieldIds
        /// </summary>
        [DataMember(Name = "customFieldIds", EmitDefaultValue = true)]
        public List<Guid> CustomFieldIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SaveCustomSymbolTypeDto {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  HideAddressField: ").Append(HideAddressField).Append("\n");
            sb.Append("  HideSymbolSubtype: ").Append(HideSymbolSubtype).Append("\n");
            sb.Append("  IsDefault: ").Append(IsDefault).Append("\n");
            sb.Append("  DueDiligenceSymbolEntityType: ").Append(DueDiligenceSymbolEntityType).Append("\n");
            sb.Append("  SubTypes: ").Append(SubTypes).Append("\n");
            sb.Append("  CustomFieldIds: ").Append(CustomFieldIds).Append("\n");
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
            return this.Equals(input as SaveCustomSymbolTypeDto);
        }

        /// <summary>
        /// Returns true if SaveCustomSymbolTypeDto instances are equal
        /// </summary>
        /// <param name="input">Instance of SaveCustomSymbolTypeDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SaveCustomSymbolTypeDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.HideAddressField == input.HideAddressField ||
                    this.HideAddressField.Equals(input.HideAddressField)
                ) && 
                (
                    this.HideSymbolSubtype == input.HideSymbolSubtype ||
                    this.HideSymbolSubtype.Equals(input.HideSymbolSubtype)
                ) && 
                (
                    this.IsDefault == input.IsDefault ||
                    this.IsDefault.Equals(input.IsDefault)
                ) && 
                (
                    this.DueDiligenceSymbolEntityType == input.DueDiligenceSymbolEntityType ||
                    this.DueDiligenceSymbolEntityType.Equals(input.DueDiligenceSymbolEntityType)
                ) && 
                (
                    this.SubTypes == input.SubTypes ||
                    this.SubTypes != null &&
                    input.SubTypes != null &&
                    this.SubTypes.SequenceEqual(input.SubTypes)
                ) && 
                (
                    this.CustomFieldIds == input.CustomFieldIds ||
                    this.CustomFieldIds != null &&
                    input.CustomFieldIds != null &&
                    this.CustomFieldIds.SequenceEqual(input.CustomFieldIds)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.HideAddressField.GetHashCode();
                hashCode = (hashCode * 59) + this.HideSymbolSubtype.GetHashCode();
                hashCode = (hashCode * 59) + this.IsDefault.GetHashCode();
                hashCode = (hashCode * 59) + this.DueDiligenceSymbolEntityType.GetHashCode();
                if (this.SubTypes != null)
                {
                    hashCode = (hashCode * 59) + this.SubTypes.GetHashCode();
                }
                if (this.CustomFieldIds != null)
                {
                    hashCode = (hashCode * 59) + this.CustomFieldIds.GetHashCode();
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
            // Name (string) maxLength
            if (this.Name != null && this.Name.Length > 100)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Name, length must be less than 100.", new [] { "Name" });
            }

            // Name (string) minLength
            if (this.Name != null && this.Name.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Name, length must be greater than 0.", new [] { "Name" });
            }

            yield break;
        }
    }

}
