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
    /// SubjectSummaryDto
    /// </summary>
    [DataContract(Name = "SubjectSummaryDto")]
    public partial class SubjectSummaryDto : IEquatable<SubjectSummaryDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SubjectSummaryDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="code">code.</param>
        /// <param name="identifierType">identifierType.</param>
        /// <param name="identifierTypes">identifierTypes.</param>
        /// <param name="type">type.</param>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="customFieldIds">customFieldIds.</param>
        /// <param name="noteLengthLimit">noteLengthLimit.</param>
        /// <param name="layoutId">layoutId.</param>
        public SubjectSummaryDto(Guid id = default(Guid), string name = default(string), string code = default(string), string identifierType = default(string), List<string> identifierTypes = default(List<string>), string type = default(string), bool isHidden = default(bool), List<Guid> customFieldIds = default(List<Guid>), int? noteLengthLimit = default(int?), Guid? layoutId = default(Guid?))
        {
            this.Id = id;
            this.Name = name;
            this.Code = code;
            this.IdentifierType = identifierType;
            this.IdentifierTypes = identifierTypes;
            this.Type = type;
            this.IsHidden = isHidden;
            this.CustomFieldIds = customFieldIds;
            this.NoteLengthLimit = noteLengthLimit;
            this.LayoutId = layoutId;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", EmitDefaultValue = true)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets IdentifierType
        /// </summary>
        [DataMember(Name = "identifierType", EmitDefaultValue = true)]
        public string IdentifierType { get; set; }

        /// <summary>
        /// Gets or Sets IdentifierTypes
        /// </summary>
        [DataMember(Name = "identifierTypes", EmitDefaultValue = true)]
        public List<string> IdentifierTypes { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets IsHidden
        /// </summary>
        [DataMember(Name = "isHidden", EmitDefaultValue = true)]
        public bool IsHidden { get; set; }

        /// <summary>
        /// Gets or Sets CustomFieldIds
        /// </summary>
        [DataMember(Name = "customFieldIds", EmitDefaultValue = true)]
        public List<Guid> CustomFieldIds { get; set; }

        /// <summary>
        /// Gets or Sets NoteLengthLimit
        /// </summary>
        [DataMember(Name = "noteLengthLimit", EmitDefaultValue = true)]
        public int? NoteLengthLimit { get; set; }

        /// <summary>
        /// Gets or Sets LayoutId
        /// </summary>
        [DataMember(Name = "layoutId", EmitDefaultValue = true)]
        public Guid? LayoutId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SubjectSummaryDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  IdentifierType: ").Append(IdentifierType).Append("\n");
            sb.Append("  IdentifierTypes: ").Append(IdentifierTypes).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  IsHidden: ").Append(IsHidden).Append("\n");
            sb.Append("  CustomFieldIds: ").Append(CustomFieldIds).Append("\n");
            sb.Append("  NoteLengthLimit: ").Append(NoteLengthLimit).Append("\n");
            sb.Append("  LayoutId: ").Append(LayoutId).Append("\n");
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
            return this.Equals(input as SubjectSummaryDto);
        }

        /// <summary>
        /// Returns true if SubjectSummaryDto instances are equal
        /// </summary>
        /// <param name="input">Instance of SubjectSummaryDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SubjectSummaryDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.IdentifierType == input.IdentifierType ||
                    (this.IdentifierType != null &&
                    this.IdentifierType.Equals(input.IdentifierType))
                ) && 
                (
                    this.IdentifierTypes == input.IdentifierTypes ||
                    this.IdentifierTypes != null &&
                    input.IdentifierTypes != null &&
                    this.IdentifierTypes.SequenceEqual(input.IdentifierTypes)
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.IsHidden == input.IsHidden ||
                    this.IsHidden.Equals(input.IsHidden)
                ) && 
                (
                    this.CustomFieldIds == input.CustomFieldIds ||
                    this.CustomFieldIds != null &&
                    input.CustomFieldIds != null &&
                    this.CustomFieldIds.SequenceEqual(input.CustomFieldIds)
                ) && 
                (
                    this.NoteLengthLimit == input.NoteLengthLimit ||
                    (this.NoteLengthLimit != null &&
                    this.NoteLengthLimit.Equals(input.NoteLengthLimit))
                ) && 
                (
                    this.LayoutId == input.LayoutId ||
                    (this.LayoutId != null &&
                    this.LayoutId.Equals(input.LayoutId))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.IdentifierType != null)
                {
                    hashCode = (hashCode * 59) + this.IdentifierType.GetHashCode();
                }
                if (this.IdentifierTypes != null)
                {
                    hashCode = (hashCode * 59) + this.IdentifierTypes.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsHidden.GetHashCode();
                if (this.CustomFieldIds != null)
                {
                    hashCode = (hashCode * 59) + this.CustomFieldIds.GetHashCode();
                }
                if (this.NoteLengthLimit != null)
                {
                    hashCode = (hashCode * 59) + this.NoteLengthLimit.GetHashCode();
                }
                if (this.LayoutId != null)
                {
                    hashCode = (hashCode * 59) + this.LayoutId.GetHashCode();
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
