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
    /// CustomFieldConfigDto
    /// </summary>
    [DataContract(Name = "CustomFieldConfigDto")]
    public partial class CustomFieldConfigDto : IEquatable<CustomFieldConfigDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomFieldConfigDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="code">code.</param>
        /// <param name="name">name.</param>
        /// <param name="source">source.</param>
        /// <param name="type">type.</param>
        /// <param name="usePreviousValue">usePreviousValue.</param>
        /// <param name="isMandatory">isMandatory.</param>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="isFilePath">isFilePath.</param>
        /// <param name="isCalculated">isCalculated.</param>
        /// <param name="hasPairedField">hasPairedField.</param>
        /// <param name="formulaConfig">formulaConfig.</param>
        /// <param name="numericConfig">numericConfig.</param>
        /// <param name="integerConfig">integerConfig.</param>
        /// <param name="extendedTextConfig">extendedTextConfig.</param>
        /// <param name="optionsConfig">optionsConfig.</param>
        /// <param name="userTeamConfig">userTeamConfig.</param>
        public CustomFieldConfigDto(Guid id = default(Guid), string code = default(string), string name = default(string), string source = default(string), string type = default(string), bool usePreviousValue = default(bool), bool isMandatory = default(bool), bool isHidden = default(bool), bool isFilePath = default(bool), bool isCalculated = default(bool), bool hasPairedField = default(bool), FormulaConfigDto formulaConfig = default(FormulaConfigDto), NumericConfigDto numericConfig = default(NumericConfigDto), IntegerConfigDto integerConfig = default(IntegerConfigDto), ExtendedTextConfigDto extendedTextConfig = default(ExtendedTextConfigDto), OptionsConfigDto optionsConfig = default(OptionsConfigDto), UserTeamConfigDto userTeamConfig = default(UserTeamConfigDto))
        {
            this.Id = id;
            this.Code = code;
            this.Name = name;
            this.Source = source;
            this.Type = type;
            this.UsePreviousValue = usePreviousValue;
            this.IsMandatory = isMandatory;
            this.IsHidden = isHidden;
            this.IsFilePath = isFilePath;
            this.IsCalculated = isCalculated;
            this.HasPairedField = hasPairedField;
            this.FormulaConfig = formulaConfig;
            this.NumericConfig = numericConfig;
            this.IntegerConfig = integerConfig;
            this.ExtendedTextConfig = extendedTextConfig;
            this.OptionsConfig = optionsConfig;
            this.UserTeamConfig = userTeamConfig;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", EmitDefaultValue = true)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [DataMember(Name = "source", EmitDefaultValue = true)]
        public string Source { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets UsePreviousValue
        /// </summary>
        [DataMember(Name = "usePreviousValue", EmitDefaultValue = true)]
        public bool UsePreviousValue { get; set; }

        /// <summary>
        /// Gets or Sets IsMandatory
        /// </summary>
        [DataMember(Name = "isMandatory", EmitDefaultValue = true)]
        public bool IsMandatory { get; set; }

        /// <summary>
        /// Gets or Sets IsHidden
        /// </summary>
        [DataMember(Name = "isHidden", EmitDefaultValue = true)]
        public bool IsHidden { get; set; }

        /// <summary>
        /// Gets or Sets IsFilePath
        /// </summary>
        [DataMember(Name = "isFilePath", EmitDefaultValue = true)]
        public bool IsFilePath { get; set; }

        /// <summary>
        /// Gets or Sets IsCalculated
        /// </summary>
        [DataMember(Name = "isCalculated", EmitDefaultValue = true)]
        public bool IsCalculated { get; set; }

        /// <summary>
        /// Gets or Sets HasPairedField
        /// </summary>
        [DataMember(Name = "hasPairedField", EmitDefaultValue = true)]
        public bool HasPairedField { get; set; }

        /// <summary>
        /// Gets or Sets FormulaConfig
        /// </summary>
        [DataMember(Name = "formulaConfig", EmitDefaultValue = true)]
        public FormulaConfigDto FormulaConfig { get; set; }

        /// <summary>
        /// Gets or Sets NumericConfig
        /// </summary>
        [DataMember(Name = "numericConfig", EmitDefaultValue = true)]
        public NumericConfigDto NumericConfig { get; set; }

        /// <summary>
        /// Gets or Sets IntegerConfig
        /// </summary>
        [DataMember(Name = "integerConfig", EmitDefaultValue = true)]
        public IntegerConfigDto IntegerConfig { get; set; }

        /// <summary>
        /// Gets or Sets ExtendedTextConfig
        /// </summary>
        [DataMember(Name = "extendedTextConfig", EmitDefaultValue = true)]
        public ExtendedTextConfigDto ExtendedTextConfig { get; set; }

        /// <summary>
        /// Gets or Sets OptionsConfig
        /// </summary>
        [DataMember(Name = "optionsConfig", EmitDefaultValue = true)]
        public OptionsConfigDto OptionsConfig { get; set; }

        /// <summary>
        /// Gets or Sets UserTeamConfig
        /// </summary>
        [DataMember(Name = "userTeamConfig", EmitDefaultValue = true)]
        public UserTeamConfigDto UserTeamConfig { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CustomFieldConfigDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  UsePreviousValue: ").Append(UsePreviousValue).Append("\n");
            sb.Append("  IsMandatory: ").Append(IsMandatory).Append("\n");
            sb.Append("  IsHidden: ").Append(IsHidden).Append("\n");
            sb.Append("  IsFilePath: ").Append(IsFilePath).Append("\n");
            sb.Append("  IsCalculated: ").Append(IsCalculated).Append("\n");
            sb.Append("  HasPairedField: ").Append(HasPairedField).Append("\n");
            sb.Append("  FormulaConfig: ").Append(FormulaConfig).Append("\n");
            sb.Append("  NumericConfig: ").Append(NumericConfig).Append("\n");
            sb.Append("  IntegerConfig: ").Append(IntegerConfig).Append("\n");
            sb.Append("  ExtendedTextConfig: ").Append(ExtendedTextConfig).Append("\n");
            sb.Append("  OptionsConfig: ").Append(OptionsConfig).Append("\n");
            sb.Append("  UserTeamConfig: ").Append(UserTeamConfig).Append("\n");
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
            return this.Equals(input as CustomFieldConfigDto);
        }

        /// <summary>
        /// Returns true if CustomFieldConfigDto instances are equal
        /// </summary>
        /// <param name="input">Instance of CustomFieldConfigDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomFieldConfigDto input)
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
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.UsePreviousValue == input.UsePreviousValue ||
                    this.UsePreviousValue.Equals(input.UsePreviousValue)
                ) && 
                (
                    this.IsMandatory == input.IsMandatory ||
                    this.IsMandatory.Equals(input.IsMandatory)
                ) && 
                (
                    this.IsHidden == input.IsHidden ||
                    this.IsHidden.Equals(input.IsHidden)
                ) && 
                (
                    this.IsFilePath == input.IsFilePath ||
                    this.IsFilePath.Equals(input.IsFilePath)
                ) && 
                (
                    this.IsCalculated == input.IsCalculated ||
                    this.IsCalculated.Equals(input.IsCalculated)
                ) && 
                (
                    this.HasPairedField == input.HasPairedField ||
                    this.HasPairedField.Equals(input.HasPairedField)
                ) && 
                (
                    this.FormulaConfig == input.FormulaConfig ||
                    (this.FormulaConfig != null &&
                    this.FormulaConfig.Equals(input.FormulaConfig))
                ) && 
                (
                    this.NumericConfig == input.NumericConfig ||
                    (this.NumericConfig != null &&
                    this.NumericConfig.Equals(input.NumericConfig))
                ) && 
                (
                    this.IntegerConfig == input.IntegerConfig ||
                    (this.IntegerConfig != null &&
                    this.IntegerConfig.Equals(input.IntegerConfig))
                ) && 
                (
                    this.ExtendedTextConfig == input.ExtendedTextConfig ||
                    (this.ExtendedTextConfig != null &&
                    this.ExtendedTextConfig.Equals(input.ExtendedTextConfig))
                ) && 
                (
                    this.OptionsConfig == input.OptionsConfig ||
                    (this.OptionsConfig != null &&
                    this.OptionsConfig.Equals(input.OptionsConfig))
                ) && 
                (
                    this.UserTeamConfig == input.UserTeamConfig ||
                    (this.UserTeamConfig != null &&
                    this.UserTeamConfig.Equals(input.UserTeamConfig))
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
                if (this.Source != null)
                {
                    hashCode = (hashCode * 59) + this.Source.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UsePreviousValue.GetHashCode();
                hashCode = (hashCode * 59) + this.IsMandatory.GetHashCode();
                hashCode = (hashCode * 59) + this.IsHidden.GetHashCode();
                hashCode = (hashCode * 59) + this.IsFilePath.GetHashCode();
                hashCode = (hashCode * 59) + this.IsCalculated.GetHashCode();
                hashCode = (hashCode * 59) + this.HasPairedField.GetHashCode();
                if (this.FormulaConfig != null)
                {
                    hashCode = (hashCode * 59) + this.FormulaConfig.GetHashCode();
                }
                if (this.NumericConfig != null)
                {
                    hashCode = (hashCode * 59) + this.NumericConfig.GetHashCode();
                }
                if (this.IntegerConfig != null)
                {
                    hashCode = (hashCode * 59) + this.IntegerConfig.GetHashCode();
                }
                if (this.ExtendedTextConfig != null)
                {
                    hashCode = (hashCode * 59) + this.ExtendedTextConfig.GetHashCode();
                }
                if (this.OptionsConfig != null)
                {
                    hashCode = (hashCode * 59) + this.OptionsConfig.GetHashCode();
                }
                if (this.UserTeamConfig != null)
                {
                    hashCode = (hashCode * 59) + this.UserTeamConfig.GetHashCode();
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
