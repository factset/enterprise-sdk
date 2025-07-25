/*
 * GIPS API
 *
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
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
using OpenAPIDateConverter = FactSet.SDK.GIPS.Client.OpenAPIDateConverter;

namespace FactSet.SDK.GIPS.Model
{
    /// <summary>
    /// FactSetProtobufStachV3TableViewTypesFormat
    /// </summary>
    [DataContract(Name = "FactSet.Protobuf.Stach.V3.TableView.Types.Format")]
    public partial class FactSetProtobufStachV3TableViewTypesFormat : IEquatable<FactSetProtobufStachV3TableViewTypesFormat>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FactSetProtobufStachV3TableViewTypesFormat" /> class.
        /// </summary>
        /// <param name="settings">settings.</param>
        /// <param name="cultureColumn">cultureColumn.</param>
        /// <param name="timeZoneColumn">timeZoneColumn.</param>
        public FactSetProtobufStachV3TableViewTypesFormat(FactSetProtobufFormatV1FdsFormatSettings settings = default(FactSetProtobufFormatV1FdsFormatSettings), string cultureColumn = default(string), string timeZoneColumn = default(string), Dictionary<string, FactSetProtobufStachV3TableViewTypesFormatTypesFormatString> strings = default(Dictionary<string, FactSetProtobufStachV3TableViewTypesFormatTypesFormatString>))
        {
            this.Settings = settings;
            this.CultureColumn = cultureColumn;
            this.TimeZoneColumn = timeZoneColumn;
        }

        /// <summary>
        /// Gets or Sets Settings
        /// </summary>
        [DataMember(Name = "settings", EmitDefaultValue = false)]
        public FactSetProtobufFormatV1FdsFormatSettings Settings { get; set; }

        /// <summary>
        /// Gets or Sets CultureColumn
        /// </summary>
        [DataMember(Name = "cultureColumn", EmitDefaultValue = true)]
        public string CultureColumn { get; set; }

        /// <summary>
        /// Gets or Sets TimeZoneColumn
        /// </summary>
        [DataMember(Name = "timeZoneColumn", EmitDefaultValue = true)]
        public string TimeZoneColumn { get; set; }

        /// <summary>
        /// Gets or Sets Strings
        /// </summary>
        [DataMember(Name = "strings", EmitDefaultValue = true)]
        public Dictionary<string, FactSetProtobufStachV3TableViewTypesFormatTypesFormatString> Strings { get; private set; }

        /// <summary>
        /// Returns false as Strings should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeStrings()
        {
            return false;
        }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FactSetProtobufStachV3TableViewTypesFormat {\n");
            sb.Append("  Settings: ").Append(Settings).Append("\n");
            sb.Append("  CultureColumn: ").Append(CultureColumn).Append("\n");
            sb.Append("  TimeZoneColumn: ").Append(TimeZoneColumn).Append("\n");
            sb.Append("  Strings: ").Append(Strings).Append("\n");
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
            return this.Equals(input as FactSetProtobufStachV3TableViewTypesFormat);
        }

        /// <summary>
        /// Returns true if FactSetProtobufStachV3TableViewTypesFormat instances are equal
        /// </summary>
        /// <param name="input">Instance of FactSetProtobufStachV3TableViewTypesFormat to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FactSetProtobufStachV3TableViewTypesFormat input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Settings == input.Settings ||
                    (this.Settings != null &&
                    this.Settings.Equals(input.Settings))
                ) && 
                (
                    this.CultureColumn == input.CultureColumn ||
                    (this.CultureColumn != null &&
                    this.CultureColumn.Equals(input.CultureColumn))
                ) && 
                (
                    this.TimeZoneColumn == input.TimeZoneColumn ||
                    (this.TimeZoneColumn != null &&
                    this.TimeZoneColumn.Equals(input.TimeZoneColumn))
                ) && 
                (
                    this.Strings == input.Strings ||
                    this.Strings != null &&
                    input.Strings != null &&
                    this.Strings.SequenceEqual(input.Strings)
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
                if (this.Settings != null)
                {
                    hashCode = (hashCode * 59) + this.Settings.GetHashCode();
                }
                if (this.CultureColumn != null)
                {
                    hashCode = (hashCode * 59) + this.CultureColumn.GetHashCode();
                }
                if (this.TimeZoneColumn != null)
                {
                    hashCode = (hashCode * 59) + this.TimeZoneColumn.GetHashCode();
                }
                if (this.Strings != null)
                {
                    hashCode = (hashCode * 59) + this.Strings.GetHashCode();
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
