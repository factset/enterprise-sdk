/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
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
    /// ContactCustomFieldDto
    /// </summary>
    [DataContract(Name = "ContactCustomFieldDto")]
    public partial class ContactCustomFieldDto : IEquatable<ContactCustomFieldDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactCustomFieldDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="code">code.</param>
        /// <param name="name">name.</param>
        /// <param name="type">type.</param>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="isMandatory">isMandatory.</param>
        /// <param name="formulaConfig">formulaConfig.</param>
        /// <param name="contactCustomFieldOptions">contactCustomFieldOptions.</param>
        public ContactCustomFieldDto(Guid id = default(Guid), string code = default(string), string name = default(string), string type = default(string), bool isHidden = default(bool), bool isMandatory = default(bool), FormulaConfigDto formulaConfig = default(FormulaConfigDto), List<ContactCustomFieldOptionDto> contactCustomFieldOptions = default(List<ContactCustomFieldOptionDto>))
        {
            this.Id = id;
            this.Code = code;
            this.Name = name;
            this.Type = type;
            this.IsHidden = isHidden;
            this.IsMandatory = isMandatory;
            this.FormulaConfig = formulaConfig;
            this.ContactCustomFieldOptions = contactCustomFieldOptions;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "Id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "Code", EmitDefaultValue = true)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "Name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "Type", EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets IsHidden
        /// </summary>
        [DataMember(Name = "IsHidden", EmitDefaultValue = true)]
        public bool IsHidden { get; set; }

        /// <summary>
        /// Gets or Sets IsMandatory
        /// </summary>
        [DataMember(Name = "IsMandatory", EmitDefaultValue = true)]
        public bool IsMandatory { get; set; }

        /// <summary>
        /// Gets or Sets FormulaConfig
        /// </summary>
        [DataMember(Name = "FormulaConfig", EmitDefaultValue = false)]
        public FormulaConfigDto FormulaConfig { get; set; }

        /// <summary>
        /// Gets or Sets ContactCustomFieldOptions
        /// </summary>
        [DataMember(Name = "ContactCustomFieldOptions", EmitDefaultValue = true)]
        public List<ContactCustomFieldOptionDto> ContactCustomFieldOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ContactCustomFieldDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  IsHidden: ").Append(IsHidden).Append("\n");
            sb.Append("  IsMandatory: ").Append(IsMandatory).Append("\n");
            sb.Append("  FormulaConfig: ").Append(FormulaConfig).Append("\n");
            sb.Append("  ContactCustomFieldOptions: ").Append(ContactCustomFieldOptions).Append("\n");
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
            return this.Equals(input as ContactCustomFieldDto);
        }

        /// <summary>
        /// Returns true if ContactCustomFieldDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ContactCustomFieldDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContactCustomFieldDto input)
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
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
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
                    this.IsMandatory == input.IsMandatory ||
                    this.IsMandatory.Equals(input.IsMandatory)
                ) && 
                (
                    this.FormulaConfig == input.FormulaConfig ||
                    (this.FormulaConfig != null &&
                    this.FormulaConfig.Equals(input.FormulaConfig))
                ) && 
                (
                    this.ContactCustomFieldOptions == input.ContactCustomFieldOptions ||
                    this.ContactCustomFieldOptions != null &&
                    input.ContactCustomFieldOptions != null &&
                    this.ContactCustomFieldOptions.SequenceEqual(input.ContactCustomFieldOptions)
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsHidden.GetHashCode();
                hashCode = (hashCode * 59) + this.IsMandatory.GetHashCode();
                if (this.FormulaConfig != null)
                {
                    hashCode = (hashCode * 59) + this.FormulaConfig.GetHashCode();
                }
                if (this.ContactCustomFieldOptions != null)
                {
                    hashCode = (hashCode * 59) + this.ContactCustomFieldOptions.GetHashCode();
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