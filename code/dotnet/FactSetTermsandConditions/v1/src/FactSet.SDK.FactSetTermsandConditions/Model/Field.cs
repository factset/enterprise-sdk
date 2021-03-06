/*
 * FactSet Terms & Conditions API
 *
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTermsandConditions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTermsandConditions.Model
{
    /// <summary>
    /// Field
    /// </summary>
    [DataContract(Name = "field")]
    public partial class Field : IEquatable<Field>, IValidatableObject
    {
        /// <summary>
        /// Primary Category of field item, such as COUPON_DETAILS or SECURITY_DETAILS.
        /// </summary>
        /// <value>Primary Category of field item, such as COUPON_DETAILS or SECURITY_DETAILS.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CategoryEnum
        {
            /// <summary>
            /// Enum CONVERTIBLEFEATURES for value: CONVERTIBLE_FEATURES
            /// </summary>
            [EnumMember(Value = "CONVERTIBLE_FEATURES")]
            CONVERTIBLEFEATURES = 1,

            /// <summary>
            /// Enum COUPONDETAILS for value: COUPON_DETAILS
            /// </summary>
            [EnumMember(Value = "COUPON_DETAILS")]
            COUPONDETAILS = 2,

            /// <summary>
            /// Enum REDEMPTIONOPTIONS for value: REDEMPTION_OPTIONS
            /// </summary>
            [EnumMember(Value = "REDEMPTION_OPTIONS")]
            REDEMPTIONOPTIONS = 3,

            /// <summary>
            /// Enum SECURITYDETAILS for value: SECURITY_DETAILS
            /// </summary>
            [EnumMember(Value = "SECURITY_DETAILS")]
            SECURITYDETAILS = 4

        }


        /// <summary>
        /// Primary Category of field item, such as COUPON_DETAILS or SECURITY_DETAILS.
        /// </summary>
        /// <value>Primary Category of field item, such as COUPON_DETAILS or SECURITY_DETAILS.</value>
        [DataMember(Name = "category", EmitDefaultValue = false)]
        public CategoryEnum? Category { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Field" /> class.
        /// </summary>
        /// <param name="field">Field identifier to be used as &#x60;fields&#x60; input in _Terms-and-Conditions_ endpoints. .</param>
        /// <param name="name">Plain text name of the field..</param>
        /// <param name="category">Primary Category of field item, such as COUPON_DETAILS or SECURITY_DETAILS..</param>
        /// <param name="dataType">The Data Type of the respective field, including - * date * string * integer * double .</param>
        public Field(string field = default(string), string name = default(string), CategoryEnum? category = default(CategoryEnum?), string dataType = default(string))
        {
            this._Field = field;
            this.Name = name;
            this.Category = category;
            this.DataType = dataType;
        }

        /// <summary>
        /// Field identifier to be used as &#x60;fields&#x60; input in _Terms-and-Conditions_ endpoints. 
        /// </summary>
        /// <value>Field identifier to be used as &#x60;fields&#x60; input in _Terms-and-Conditions_ endpoints. </value>
        [DataMember(Name = "field", EmitDefaultValue = false)]
        public string _Field { get; set; }

        /// <summary>
        /// Plain text name of the field.
        /// </summary>
        /// <value>Plain text name of the field.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The Data Type of the respective field, including - * date * string * integer * double 
        /// </summary>
        /// <value>The Data Type of the respective field, including - * date * string * integer * double </value>
        [DataMember(Name = "dataType", EmitDefaultValue = false)]
        public string DataType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Field {\n");
            sb.Append("  _Field: ").Append(_Field).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  DataType: ").Append(DataType).Append("\n");
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
            return this.Equals(input as Field);
        }

        /// <summary>
        /// Returns true if Field instances are equal
        /// </summary>
        /// <param name="input">Instance of Field to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Field input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._Field == input._Field ||
                    (this._Field != null &&
                    this._Field.Equals(input._Field))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Category == input.Category ||
                    this.Category.Equals(input.Category)
                ) && 
                (
                    this.DataType == input.DataType ||
                    (this.DataType != null &&
                    this.DataType.Equals(input.DataType))
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
                if (this._Field != null)
                {
                    hashCode = (hashCode * 59) + this._Field.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Category.GetHashCode();
                if (this.DataType != null)
                {
                    hashCode = (hashCode * 59) + this.DataType.GetHashCode();
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
