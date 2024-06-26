/*
 * OFDB API
 *
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
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
using OpenAPIDateConverter = FactSet.SDK.OFDB.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OFDB.Model
{
    /// <summary>
    /// FieldProperties
    /// </summary>
    [DataContract(Name = "FieldProperties")]
    public partial class FieldProperties : IEquatable<FieldProperties>, IValidatableObject
    {
        /// <summary>
        /// Defines Iteration
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum IterationEnum
        {
            /// <summary>
            /// Enum _2D for value: 2D
            /// </summary>
            [EnumMember(Value = "2D")]
            _2D = 1,

            /// <summary>
            /// Enum _3D for value: 3D
            /// </summary>
            [EnumMember(Value = "3D")]
            _3D = 2

        }


        /// <summary>
        /// Gets or Sets Iteration
        /// </summary>
        [DataMember(Name = "iteration", EmitDefaultValue = false)]
        public IterationEnum? Iteration { get; set; }
        /// <summary>
        /// Defines SplitDirection
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SplitDirectionEnum
        {
            /// <summary>
            /// Enum NONE for value: NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE = 1,

            /// <summary>
            /// Enum NORMAL for value: NORMAL
            /// </summary>
            [EnumMember(Value = "NORMAL")]
            NORMAL = 2,

            /// <summary>
            /// Enum REVERSE for value: REVERSE
            /// </summary>
            [EnumMember(Value = "REVERSE")]
            REVERSE = 3

        }


        /// <summary>
        /// Gets or Sets SplitDirection
        /// </summary>
        [DataMember(Name = "splitDirection", EmitDefaultValue = false)]
        public SplitDirectionEnum? SplitDirection { get; set; }
        /// <summary>
        /// Defines Type
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum INT for value: INT
            /// </summary>
            [EnumMember(Value = "INT")]
            INT = 1,

            /// <summary>
            /// Enum FLOAT for value: FLOAT
            /// </summary>
            [EnumMember(Value = "FLOAT")]
            FLOAT = 2,

            /// <summary>
            /// Enum DOUBLE for value: DOUBLE
            /// </summary>
            [EnumMember(Value = "DOUBLE")]
            DOUBLE = 3,

            /// <summary>
            /// Enum CHAR for value: CHAR
            /// </summary>
            [EnumMember(Value = "CHAR")]
            CHAR = 4,

            /// <summary>
            /// Enum LONGCHAR for value: LONG_CHAR
            /// </summary>
            [EnumMember(Value = "LONG_CHAR")]
            LONGCHAR = 5,

            /// <summary>
            /// Enum STRING for value: STRING
            /// </summary>
            [EnumMember(Value = "STRING")]
            STRING = 6,

            /// <summary>
            /// Enum DATE for value: DATE
            /// </summary>
            [EnumMember(Value = "DATE")]
            DATE = 7

        }


        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FieldProperties" /> class.
        /// </summary>
        /// <param name="description">description.</param>
        /// <param name="iteration">iteration.</param>
        /// <param name="name">name.</param>
        /// <param name="size">size.</param>
        /// <param name="splitDirection">splitDirection.</param>
        /// <param name="type">type.</param>
        /// <param name="codePageFlag">codePageFlag.</param>
        public FieldProperties(string description = default(string), IterationEnum? iteration = default(IterationEnum?), string name = default(string), int size = default(int), SplitDirectionEnum? splitDirection = default(SplitDirectionEnum?), TypeEnum? type = default(TypeEnum?), string codePageFlag = default(string))
        {
            this.Description = description;
            this.Iteration = iteration;
            this.Name = name;
            this.Size = size;
            this.SplitDirection = splitDirection;
            this.Type = type;
            this.CodePageFlag = codePageFlag;
        }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Size
        /// </summary>
        [DataMember(Name = "size", EmitDefaultValue = false)]
        public int Size { get; set; }

        /// <summary>
        /// Gets or Sets CodePageFlag
        /// </summary>
        [DataMember(Name = "codePageFlag", EmitDefaultValue = false)]
        public string CodePageFlag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FieldProperties {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Iteration: ").Append(Iteration).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  SplitDirection: ").Append(SplitDirection).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  CodePageFlag: ").Append(CodePageFlag).Append("\n");
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
            return this.Equals(input as FieldProperties);
        }

        /// <summary>
        /// Returns true if FieldProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of FieldProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FieldProperties input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Iteration == input.Iteration ||
                    this.Iteration.Equals(input.Iteration)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Size == input.Size ||
                    this.Size.Equals(input.Size)
                ) && 
                (
                    this.SplitDirection == input.SplitDirection ||
                    this.SplitDirection.Equals(input.SplitDirection)
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.CodePageFlag == input.CodePageFlag ||
                    (this.CodePageFlag != null &&
                    this.CodePageFlag.Equals(input.CodePageFlag))
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
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Iteration.GetHashCode();
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Size.GetHashCode();
                hashCode = (hashCode * 59) + this.SplitDirection.GetHashCode();
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                if (this.CodePageFlag != null)
                {
                    hashCode = (hashCode * 59) + this.CodePageFlag.GetHashCode();
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
